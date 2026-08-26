package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.StoriesUtilities;

public final class ManageChatUserCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final AnonymousClass1 avatarImageView;
    public final int currentAccount;
    public CharSequence currentName;
    public TLObject currentObject;
    public CharSequence currentStatus;
    public ImageView customImageView;
    public ManageChatUserCellDelegate delegate;
    public int dividerColor;
    public boolean isAdmin;
    public TLRPC.FileLocation lastAvatar;
    public String lastName;
    public int lastStatus;
    public final int namePadding;
    public final SimpleTextView nameTextView;
    public boolean needDivider;
    public final ImageView optionsButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public int statusColor;
    public int statusOnlineColor;
    public final SimpleTextView statusTextView;
    public final StoriesUtilities.AvatarStoryParams storyAvatarParams;
    public TL_stories.StoryItem storyItem;
    public boolean subtitleUsername;

    public interface ManageChatUserCellDelegate {
        boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z);
    }

    public ManageChatUserCell(Context context, int i, int i2, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dividerColor = -1;
        this.currentAccount = UserConfig.selectedAccount;
        this.storyAvatarParams = new StoriesUtilities.AvatarStoryParams(null, false);
        this.resourcesProvider = resourcesProvider;
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        this.namePadding = i2;
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        ?? r5 = new BackupImageView(context) {
            @Override
            public final void onDraw(Canvas canvas) {
                ManageChatUserCell manageChatUserCell = ManageChatUserCell.this;
                if (manageChatUserCell.storyItem == null) {
                    super.onDraw(canvas);
                    return;
                }
                int iDp = AndroidUtilities.dp(1.0f);
                float f = iDp;
                manageChatUserCell.storyAvatarParams.originalAvatarRect.set(f, f, getMeasuredWidth() - iDp, getMeasuredHeight() - iDp);
                StoriesUtilities.AvatarStoryParams avatarStoryParams = manageChatUserCell.storyAvatarParams;
                avatarStoryParams.drawSegments = false;
                avatarStoryParams.animate = false;
                avatarStoryParams.drawInside = true;
                avatarStoryParams.isArchive = false;
                avatarStoryParams.resourcesProvider = resourcesProvider;
                TL_stories.StoryItem storyItem = manageChatUserCell.storyItem;
                avatarStoryParams.storyItem = storyItem;
                StoriesUtilities.drawAvatarWithStory(storyItem.dialogId, canvas, this.imageReceiver, avatarStoryParams);
            }
        };
        this.avatarImageView = r5;
        r5.setRoundRadius(AndroidUtilities.dp(23.0f));
        boolean z2 = LocaleController.isRTL;
        addView((View) r5, LayoutHelper.createFrame(46, 46.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : i + 7, 8.0f, z2 ? i + 7 : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTextSize(17);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 46.0f : i2 + 68, 11.5f, z3 ? i2 + 68 : 46.0f, 0.0f));
        NotificationCenter.listenEmojiLoading(simpleTextView);
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(14);
        simpleTextView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z4 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, z4 ? 28.0f : i2 + 68, 34.5f, z4 ? i2 + 68 : 28.0f, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setFocusable(false);
            imageView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider), 1, -1));
            imageView.setImageResource(R.drawable.ic_ab_other);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_stickers_menu, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(60, 64, (LocaleController.isRTL ? 3 : 5) | 48));
            imageView.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 25));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrUserOptions));
        }
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public Object getCurrentObject() {
        return this.currentObject;
    }

    public StoriesUtilities.AvatarStoryParams getStoryAvatarParams() {
        return this.storyAvatarParams;
    }

    public TL_stories.StoryItem getStoryItem() {
        return this.storyItem;
    }

    public long getUserId() {
        TLObject tLObject = this.currentObject;
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        return 0L;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            int i = this.dividerColor;
            if (i >= 0) {
                Theme.dividerExtraPaint.setColor(Theme.getColor(i, this.resourcesProvider));
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, this.dividerColor >= 0 ? Theme.dividerExtraPaint : Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setCustomImageVisible(boolean z) {
        ImageView imageView = this.customImageView;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public void setCustomRightImage(int i) {
        ImageView imageView = new ImageView(getContext());
        this.customImageView = imageView;
        imageView.setImageResource(i);
        this.customImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.customImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_voipgroup_mutedIconUnscrolled, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        addView(this.customImageView, LayoutHelper.createFrame(52, 64, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public final void setData(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        float f2;
        SimpleTextView simpleTextView = this.statusTextView;
        SimpleTextView simpleTextView2 = this.nameTextView;
        if (tLObject == null) {
            this.currentStatus = null;
            this.currentName = null;
            this.currentObject = null;
            simpleTextView2.setText("", false);
            simpleTextView.setText("", false);
            setImageDrawable(null);
            return;
        }
        this.currentStatus = charSequence2;
        this.currentName = charSequence;
        this.currentObject = tLObject;
        ImageView imageView = this.optionsButton;
        int i7 = this.namePadding;
        if (imageView != null) {
            boolean zOnOptionsButtonCheck = this.delegate.onOptionsButtonCheck(this, false);
            imageView.setVisibility(zOnOptionsButtonCheck ? 0 : 4);
            boolean z2 = LocaleController.isRTL;
            int i8 = (z2 ? 5 : 3) | 48;
            if (z2) {
                i4 = zOnOptionsButtonCheck ? 46 : 28;
            } else {
                i4 = i7 + 68;
            }
            float f3 = i4;
            float f4 = (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f;
            if (LocaleController.isRTL) {
                i5 = i7 + 68;
            } else {
                i5 = zOnOptionsButtonCheck ? 46 : 28;
            }
            simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i8, f3, f4, i5, 0.0f));
            boolean z3 = LocaleController.isRTL;
            int i9 = (z3 ? 5 : 3) | 48;
            if (z3) {
                i6 = zOnOptionsButtonCheck ? 46 : 28;
            } else {
                i6 = i7 + 68;
            }
            float f5 = i6;
            if (z3) {
                f2 = i7 + 68;
            } else {
                f2 = zOnOptionsButtonCheck ? 46 : 28;
            }
            simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i9, f5, 34.5f, f2, 0.0f));
        } else {
            ImageView imageView2 = this.customImageView;
            if (imageView2 != null) {
                boolean z4 = imageView2.getVisibility() == 0;
                boolean z5 = LocaleController.isRTL;
                int i10 = (z5 ? 5 : 3) | 48;
                if (z5) {
                    i = z4 ? 54 : 28;
                } else {
                    i = i7 + 68;
                }
                float f6 = i;
                float f7 = (charSequence2 == null || charSequence2.length() > 0) ? 11.5f : 20.5f;
                if (LocaleController.isRTL) {
                    i2 = i7 + 68;
                } else {
                    i2 = z4 ? 54 : 28;
                }
                simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i10, f6, f7, i2, 0.0f));
                boolean z6 = LocaleController.isRTL;
                int i11 = (z6 ? 5 : 3) | 48;
                if (z6) {
                    i3 = z4 ? 54 : 28;
                } else {
                    i3 = i7 + 68;
                }
                float f8 = i3;
                if (z6) {
                    f = i7 + 68;
                } else {
                    f = z4 ? 54 : 28;
                }
                simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, 20.0f, i11, f8, 34.5f, f, 0.0f));
            }
        }
        this.needDivider = z;
        setWillNotDraw(!z);
        update(0);
    }

    public void setDelegate(ManageChatUserCellDelegate manageChatUserCellDelegate) {
        this.delegate = manageChatUserCellDelegate;
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
    }

    public void setIsAdmin(boolean z) {
        this.isAdmin = z;
    }

    public void setNameColor(int i) {
        this.nameTextView.setTextColor(i);
    }

    public final void update(int i) {
        String str;
        String str2;
        TLRPC.FileLocation fileLocation;
        String userName;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        TLObject tLObject = this.currentObject;
        if (tLObject == null) {
            return;
        }
        boolean z = tLObject instanceof TLRPC.User;
        SimpleTextView simpleTextView = this.nameTextView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        SimpleTextView simpleTextView2 = this.statusTextView;
        AnonymousClass1 anonymousClass1 = this.avatarImageView;
        boolean z2 = true;
        int i2 = this.currentAccount;
        if (!z) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                TLRPC.FileLocation fileLocation3 = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    boolean z3 = (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation = this.lastAvatar) != null && fileLocation3 == null) || ((fileLocation == null && fileLocation3 != null) || !(fileLocation == null || (fileLocation.volume_id == fileLocation3.volume_id && fileLocation.local_id == fileLocation3.local_id))));
                    if (z3 || this.currentName != null || (str2 = this.lastName) == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat.title;
                        if (str.equals(str2)) {
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    z2 = z3;
                    if (!z2) {
                        return;
                    }
                } else {
                    str = null;
                }
                avatarDrawable.setInfo(i2, chat);
                CharSequence charSequence = this.currentName;
                if (charSequence != null) {
                    this.lastName = null;
                    simpleTextView.setText(charSequence, false);
                } else {
                    if (str == null) {
                        str = chat.title;
                    }
                    this.lastName = str;
                    simpleTextView.setText(str, false);
                }
                if (this.currentStatus != null) {
                    simpleTextView2.setTextColor(this.statusColor);
                    simpleTextView2.setText(this.currentStatus, false);
                } else {
                    simpleTextView2.setTextColor(this.statusColor);
                    if (chat.participants_count != 0) {
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            simpleTextView2.setText(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), false);
                        } else {
                            simpleTextView2.setText(LocaleController.formatPluralString("Subscribers", chat.participants_count, new Object[0]), false);
                        }
                    } else if (chat.has_geo) {
                        simpleTextView2.setText(LocaleController.getString(R.string.MegaLocation), false);
                    } else if (ChatObject.isPublic(chat)) {
                        simpleTextView2.setText(LocaleController.getString(R.string.MegaPublic), false);
                    } else {
                        simpleTextView2.setText(LocaleController.getString(R.string.MegaPrivate), false);
                    }
                }
                this.lastAvatar = fileLocation3;
                anonymousClass1.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                anonymousClass1.onNewImageSet();
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        TLRPC.FileLocation fileLocation4 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
        if (i != 0) {
            boolean z4 = (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((fileLocation2 = this.lastAvatar) != null && fileLocation4 == null) || ((fileLocation2 == null && fileLocation4 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation4.volume_id && fileLocation2.local_id == fileLocation4.local_id))));
            if (!z4 && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.lastStatus) {
                    z4 = true;
                }
            }
            if (z4 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                userName = null;
            } else {
                userName = UserObject.getUserName(user);
                if (userName.equals(this.lastName)) {
                }
                if (!z2) {
                    return;
                }
            }
            z2 = z4;
            if (!z2) {
                return;
            }
        } else {
            userName = null;
        }
        avatarDrawable.setInfo(i2, user);
        TLRPC.UserStatus userStatus3 = user.status;
        if (userStatus3 != null) {
            this.lastStatus = userStatus3.expires;
        } else {
            this.lastStatus = 0;
        }
        CharSequence charSequence2 = this.currentName;
        if (charSequence2 != null) {
            this.lastName = null;
            simpleTextView.setText(charSequence2, false);
        } else {
            if (userName == null) {
                userName = UserObject.getUserName(user);
            }
            this.lastName = userName;
            simpleTextView.setText(Emoji.replaceEmoji(userName, simpleTextView.getPaint().getFontMetricsInt(), false), false);
        }
        if (this.currentStatus != null) {
            simpleTextView2.setTextColor(this.statusColor);
            simpleTextView2.setText(this.currentStatus, false);
        } else {
            String publicUsername = DialogObject.getPublicUsername(user);
            if (user.bot) {
                simpleTextView2.setTextColor(this.statusColor);
                if (this.subtitleUsername && !TextUtils.isEmpty(publicUsername)) {
                    simpleTextView2.setText(publicUsername, false);
                } else if (user.bot_chat_history || this.isAdmin) {
                    simpleTextView2.setText(LocaleController.getString(R.string.BotStatusRead), false);
                } else {
                    simpleTextView2.setText(LocaleController.getString(R.string.BotStatusCantRead), false);
                }
            } else if (this.subtitleUsername && !TextUtils.isEmpty(publicUsername)) {
                simpleTextView2.setText(publicUsername, false);
                simpleTextView2.setTextColor(this.statusColor);
            } else if (user.id == UserConfig.getInstance(i2).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i2).getCurrentTime()) || MessagesController.getInstance(i2).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                simpleTextView2.setTextColor(this.statusOnlineColor);
                simpleTextView2.setText(LocaleController.getString(R.string.Online), false);
            } else {
                simpleTextView2.setTextColor(this.statusColor);
                simpleTextView2.setText(LocaleController.formatUserStatus(i2, user), false);
            }
        }
        this.lastAvatar = fileLocation4;
        anonymousClass1.imageReceiver.setForUserOrChat(user, avatarDrawable);
        anonymousClass1.onNewImageSet();
    }
}
