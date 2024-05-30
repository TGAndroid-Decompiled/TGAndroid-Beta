package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
public class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private TextView addButton;
    private TextView adminTextView;
    protected AvatarDrawable avatarDrawable;
    public BackupImageView avatarImageView;
    private CheckBox2 checkBox;
    private ImageView checkBox3;
    private CheckBoxSquare checkBoxBig;
    private ImageView closeView;
    private int currentAccount;
    private int currentDrawable;
    private int currentId;
    private CharSequence currentName;
    private Object currentObject;
    private CharSequence currentStatus;
    protected long dialogId;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
    private ImageView imageView;
    private TLRPC$FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    protected SimpleTextView nameTextView;
    public boolean needDivider;
    private Drawable premiumDrawable;
    protected Theme.ResourcesProvider resourcesProvider;
    private boolean selfAsSavedMessages;
    private int statusColor;
    private int statusOnlineColor;
    protected SimpleTextView statusTextView;
    private boolean storiable;
    public StoriesUtilities.AvatarStoryParams storyParams;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void openStory(long j, Runnable runnable) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            lastFragment.getOrCreateStoryViewer().open(getContext(), j, StoriesListPlaceProvider.of((RecyclerListView) getParent()));
        }
    }

    public UserCell(Context context, int i, int i2, boolean z) {
        this(context, i, i2, z, false, null);
    }

    public UserCell(Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, i2, z, false, resourcesProvider);
    }

    public UserCell(Context context, int i, int i2, boolean z, boolean z2) {
        this(context, i, i2, z, z2, null);
    }

    public UserCell(Context context, int i, int i2, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i3;
        int i4;
        int i5;
        this.currentAccount = UserConfig.selectedAccount;
        this.storyParams = new StoriesUtilities.AvatarStoryParams(false) {
            @Override
            public void openStory(long j, Runnable runnable) {
                UserCell.this.openStory(j, runnable);
            }
        };
        this.resourcesProvider = resourcesProvider;
        if (z2) {
            TextView textView = new TextView(context);
            this.addButton = textView;
            textView.setGravity(17);
            this.addButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            this.addButton.setTextSize(1, 14.0f);
            this.addButton.setTypeface(AndroidUtilities.bold());
            this.addButton.setBackgroundDrawable(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 4.0f));
            this.addButton.setText(LocaleController.getString("Add", R.string.Add));
            this.addButton.setPadding(AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f), 0);
            View view = this.addButton;
            boolean z3 = LocaleController.isRTL;
            addView(view, LayoutHelper.createFrame(-2, 28.0f, (z3 ? 3 : 5) | 48, z3 ? 14.0f : 0.0f, 15.0f, z3 ? 0.0f : 14.0f, 0.0f));
            i3 = (int) Math.ceil((this.addButton.getPaint().measureText(this.addButton.getText().toString()) + AndroidUtilities.dp(48.0f)) / AndroidUtilities.density);
        } else {
            i3 = 0;
        }
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context) {
            @Override
            public void onDraw(Canvas canvas) {
                if (UserCell.this.storiable) {
                    UserCell.this.storyParams.originalAvatarRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    UserCell userCell = UserCell.this;
                    StoriesUtilities.drawAvatarWithStory(userCell.dialogId, canvas, this.imageReceiver, userCell.storyParams);
                    return;
                }
                super.onDraw(canvas);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (UserCell.this.storyParams.checkOnTouchEvent(motionEvent, this)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        View view2 = this.avatarImageView;
        boolean z4 = LocaleController.isRTL;
        addView(view2, LayoutHelper.createFrame(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : i + 7, 6.0f, z4 ? i + 7 : 0.0f, 0.0f));
        setClipChildren(false);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.nameTextView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        this.nameTextView.setTextSize(16);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        View view3 = this.nameTextView;
        boolean z5 = LocaleController.isRTL;
        int i6 = (z5 ? 5 : 3) | 48;
        if (z5) {
            i4 = (i2 == 2 ? 18 : 0) + 28 + i3;
        } else {
            i4 = i + 64;
        }
        float f = i4;
        if (z5) {
            i5 = i + 64;
        } else {
            i5 = (i2 != 2 ? 0 : 18) + 28 + i3;
        }
        addView(view3, LayoutHelper.createFrame(-1, 20.0f, i6, f, 10.0f, i5, 0.0f));
        this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView, AndroidUtilities.dp(20.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(15);
        this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        View view4 = this.statusTextView;
        boolean z6 = LocaleController.isRTL;
        addView(view4, LayoutHelper.createFrame(-1, 20.0f, (z6 ? 5 : 3) | 48, z6 ? i3 + 28 : i + 64, 32.0f, z6 ? i + 64 : i3 + 28, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.imageView.setVisibility(8);
        View view5 = this.imageView;
        boolean z7 = LocaleController.isRTL;
        addView(view5, LayoutHelper.createFrame(-2, -2.0f, (z7 ? 5 : 3) | 16, z7 ? 0.0f : 16.0f, 0.0f, z7 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, false);
            this.checkBoxBig = checkBoxSquare;
            boolean z8 = LocaleController.isRTL;
            addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (z8 ? 3 : 5) | 16, z8 ? 19.0f : 0.0f, 0.0f, z8 ? 0.0f : 19.0f, 0.0f));
        } else if (i2 == 1) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            this.checkBox.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            View view6 = this.checkBox;
            boolean z9 = LocaleController.isRTL;
            addView(view6, LayoutHelper.createFrame(24, 24.0f, (z9 ? 5 : 3) | 48, z9 ? 0.0f : i + 37, 36.0f, z9 ? i + 37 : 0.0f, 0.0f));
        } else if (i2 == 3) {
            ImageView imageView2 = new ImageView(context);
            this.checkBox3 = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            this.checkBox3.setImageResource(R.drawable.account_check);
            this.checkBox3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.checkBox3.setVisibility(8);
            View view7 = this.checkBox3;
            boolean z10 = LocaleController.isRTL;
            addView(view7, LayoutHelper.createFrame(24, 24.0f, (z10 ? 3 : 5) | 16, z10 ? i + 10 : 0.0f, 0.0f, z10 ? 0.0f : i + 10, 0.0f));
        }
        if (z) {
            TextView textView2 = new TextView(context);
            this.adminTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.adminTextView.setTextColor(Theme.getColor(Theme.key_profile_creatorIcon, resourcesProvider));
            View view8 = this.adminTextView;
            boolean z11 = LocaleController.isRTL;
            addView(view8, LayoutHelper.createFrame(-2, -2.0f, (z11 ? 3 : 5) | 48, z11 ? 23.0f : 0.0f, 10.0f, z11 ? 0.0f : 23.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setAvatarPadding(int i) {
        int i2;
        float f;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.avatarImageView.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i + 7);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 7 : 0.0f);
        this.avatarImageView.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.nameTextView.getLayoutParams();
        if (LocaleController.isRTL) {
            i2 = (this.checkBoxBig != null ? 18 : 0) + 28;
        } else {
            i2 = i + 64;
        }
        layoutParams2.leftMargin = AndroidUtilities.dp(i2);
        if (LocaleController.isRTL) {
            f = i + 64;
        } else {
            f = (this.checkBoxBig == null ? 0 : 18) + 28;
        }
        layoutParams2.rightMargin = AndroidUtilities.dp(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.statusTextView.getLayoutParams();
        layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 28.0f : i + 64);
        layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 64 : 28.0f);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) checkBox2.getLayoutParams();
            layoutParams4.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : i + 37);
            layoutParams4.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? i + 37 : 0.0f);
        }
    }

    public void setAddButtonVisible(boolean z) {
        TextView textView = this.addButton;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    public void setAdminRole(String str) {
        TextView textView = this.adminTextView;
        if (textView == null) {
            return;
        }
        textView.setVisibility(str != null ? 0 : 8);
        this.adminTextView.setText(str);
        if (str != null) {
            CharSequence text = this.adminTextView.getText();
            int ceil = (int) Math.ceil(this.adminTextView.getPaint().measureText(text, 0, text.length()));
            this.nameTextView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(6.0f) + ceil : 0, 0, !LocaleController.isRTL ? ceil + AndroidUtilities.dp(6.0f) : 0, 0);
            return;
        }
        this.nameTextView.setPadding(0, 0, 0, 0);
    }

    public CharSequence getName() {
        return this.nameTextView.getText();
    }

    public void setData(Object obj, CharSequence charSequence, CharSequence charSequence2, int i) {
        setData(obj, null, charSequence, charSequence2, i, false);
    }

    public void setData(Object obj, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        setData(obj, null, charSequence, charSequence2, i, z);
    }

    public void setData(Object obj, TLRPC$EncryptedChat tLRPC$EncryptedChat, CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        if (obj == null && charSequence == null && charSequence2 == null) {
            this.currentStatus = null;
            this.currentName = null;
            this.storiable = false;
            this.currentObject = null;
            this.nameTextView.setText("");
            this.statusTextView.setText("");
            this.avatarImageView.setImageDrawable(null);
            return;
        }
        this.currentStatus = charSequence2;
        if (charSequence != null) {
            try {
                SimpleTextView simpleTextView = this.nameTextView;
                if (simpleTextView != null) {
                    charSequence = Emoji.replaceEmoji(charSequence, simpleTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                }
            } catch (Exception unused) {
            }
        }
        this.currentName = charSequence;
        this.storiable = !(obj instanceof String);
        this.currentObject = obj;
        this.currentDrawable = i;
        this.needDivider = z;
        setWillNotDraw(!z);
        update(0);
    }

    public Object getCurrentObject() {
        return this.currentObject;
    }

    public void setException(NotificationsSettingsActivity.NotificationException notificationException, CharSequence charSequence, boolean z) {
        String string;
        TLRPC$User user;
        if (notificationException.story) {
            int i = notificationException.notify;
            if (i <= 0 && notificationException.auto) {
                string = LocaleController.getString("NotificationEnabledAutomatically");
            } else if (i <= 0) {
                string = LocaleController.getString("NotificationEnabled");
            } else {
                string = LocaleController.getString("NotificationDisabled");
            }
        } else {
            boolean z2 = notificationException.hasCustom;
            int i2 = notificationException.notify;
            int i3 = notificationException.muteUntil;
            boolean z3 = true;
            if (i2 != 3 || i3 == Integer.MAX_VALUE) {
                if (i2 != 0 && i2 != 1) {
                    z3 = false;
                }
                if (z3 && z2) {
                    string = LocaleController.getString("NotificationsCustom", R.string.NotificationsCustom);
                } else {
                    string = z3 ? LocaleController.getString("NotificationsUnmuted", R.string.NotificationsUnmuted) : LocaleController.getString("NotificationsMuted", R.string.NotificationsMuted);
                }
            } else {
                int currentTime = i3 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                if (currentTime <= 0) {
                    if (z2) {
                        string = LocaleController.getString("NotificationsCustom", R.string.NotificationsCustom);
                    } else {
                        string = LocaleController.getString("NotificationsUnmuted", R.string.NotificationsUnmuted);
                    }
                } else if (currentTime < 3600) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                } else if (currentTime < 86400) {
                    string = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                } else {
                    string = currentTime < 31536000 ? LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0])) : null;
                }
            }
            if (string == null) {
                string = LocaleController.getString("NotificationsOff", R.string.NotificationsOff);
            }
            if (notificationException.auto) {
                string = string + ", Auto";
            }
        }
        String str = string;
        if (DialogObject.isEncryptedDialog(notificationException.did)) {
            TLRPC$EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(notificationException.did)));
            if (encryptedChat == null || (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id))) == null) {
                return;
            }
            setData(user, encryptedChat, charSequence, str, 0, false);
        } else if (DialogObject.isUserDialog(notificationException.did)) {
            TLRPC$User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(notificationException.did));
            if (user2 != null) {
                setData(user2, null, charSequence, str, 0, z);
            }
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-notificationException.did));
            if (chat != null) {
                setData(chat, null, charSequence, str, 0, z);
            }
        }
    }

    public void setNameTypeface(Typeface typeface) {
        this.nameTextView.setTypeface(typeface);
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            if (checkBox2.getVisibility() != 0) {
                this.checkBox.setVisibility(0);
            }
            this.checkBox.setChecked(z, z2);
            return;
        }
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            if (checkBoxSquare.getVisibility() != 0) {
                this.checkBoxBig.setVisibility(0);
            }
            this.checkBoxBig.setChecked(z, z2);
            return;
        }
        ImageView imageView = this.checkBox3;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setCheckDisabled(boolean z) {
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    @Override
    public void invalidate() {
        super.invalidate();
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            checkBoxSquare.invalidate();
        }
    }

    public void update(int i) {
        TLRPC$User tLRPC$User;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$FileLocation tLRPC$FileLocation;
        String str;
        int i2;
        TLRPC$UserStatus tLRPC$UserStatus;
        TextView textView;
        char c;
        TLRPC$FileLocation tLRPC$FileLocation2;
        this.dialogId = 0L;
        Object obj = this.currentObject;
        if (obj instanceof TLRPC$User) {
            tLRPC$User = (TLRPC$User) obj;
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User.photo;
            TLRPC$FileLocation tLRPC$FileLocation3 = tLRPC$UserProfilePhoto != null ? tLRPC$UserProfilePhoto.photo_small : null;
            this.dialogId = tLRPC$User.id;
            tLRPC$FileLocation = tLRPC$FileLocation3;
            tLRPC$Chat = null;
        } else if (obj instanceof TLRPC$Chat) {
            TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) obj;
            TLRPC$ChatPhoto tLRPC$ChatPhoto = tLRPC$Chat2.photo;
            TLRPC$FileLocation tLRPC$FileLocation4 = tLRPC$ChatPhoto != null ? tLRPC$ChatPhoto.photo_small : null;
            this.dialogId = tLRPC$Chat2.id;
            tLRPC$FileLocation = tLRPC$FileLocation4;
            tLRPC$Chat = tLRPC$Chat2;
            tLRPC$User = null;
        } else {
            tLRPC$User = null;
            tLRPC$Chat = null;
            tLRPC$FileLocation = null;
        }
        if (i != 0) {
            boolean z = (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && (((tLRPC$FileLocation2 = this.lastAvatar) != null && tLRPC$FileLocation == null) || ((tLRPC$FileLocation2 == null && tLRPC$FileLocation != null) || !(tLRPC$FileLocation2 == null || (tLRPC$FileLocation2.volume_id == tLRPC$FileLocation.volume_id && tLRPC$FileLocation2.local_id == tLRPC$FileLocation.local_id))));
            if (tLRPC$User != null && !z && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                TLRPC$UserStatus tLRPC$UserStatus2 = tLRPC$User.status;
                if ((tLRPC$UserStatus2 != null ? tLRPC$UserStatus2.expires : 0) != this.lastStatus) {
                    z = true;
                }
            }
            if (z || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                str = null;
            } else {
                if (tLRPC$User != null) {
                    str = UserObject.getUserName(tLRPC$User);
                } else {
                    str = tLRPC$Chat.title;
                }
                if (!str.equals(this.lastName)) {
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        } else {
            str = null;
        }
        if (this.currentObject instanceof String) {
            ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            String str2 = (String) this.currentObject;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -1716307998:
                    if (str2.equals("archived")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1237460524:
                    if (str2.equals("groups")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1197490811:
                    if (str2.equals("non_contacts")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -567451565:
                    if (str2.equals("contacts")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -268161860:
                    if (str2.equals("new_chats")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029900:
                    if (str2.equals("bots")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3496342:
                    if (str2.equals("read")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 104264043:
                    if (str2.equals("muted")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 151051367:
                    if (str2.equals("existing_chats")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1432626128:
                    if (str2.equals("channels")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.avatarDrawable.setAvatarType(11);
                    break;
                case 1:
                    this.avatarDrawable.setAvatarType(6);
                    break;
                case 2:
                    this.avatarDrawable.setAvatarType(5);
                    break;
                case 3:
                    this.avatarDrawable.setAvatarType(4);
                    break;
                case 4:
                    this.avatarDrawable.setAvatarType(24);
                    break;
                case 5:
                    this.avatarDrawable.setAvatarType(8);
                    break;
                case 6:
                    this.avatarDrawable.setAvatarType(10);
                    break;
                case 7:
                    this.avatarDrawable.setAvatarType(9);
                    break;
                case '\b':
                    this.avatarDrawable.setAvatarType(23);
                    break;
                case '\t':
                    this.avatarDrawable.setAvatarType(7);
                    break;
            }
            this.avatarImageView.setImage(null, "50_50", this.avatarDrawable);
            this.currentStatus = "";
        } else {
            ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            if (tLRPC$User != null) {
                if (this.selfAsSavedMessages && UserObject.isUserSelf(tLRPC$User)) {
                    this.nameTextView.setText(LocaleController.getString("SavedMessages", R.string.SavedMessages), true);
                    this.statusTextView.setText(null);
                    this.avatarDrawable.setAvatarType(1);
                    this.avatarImageView.setImage((ImageLocation) null, "50_50", this.avatarDrawable, tLRPC$User);
                    ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$User);
                TLRPC$UserStatus tLRPC$UserStatus3 = tLRPC$User.status;
                if (tLRPC$UserStatus3 != null) {
                    this.lastStatus = tLRPC$UserStatus3.expires;
                } else {
                    this.lastStatus = 0;
                }
            } else if (tLRPC$Chat != null) {
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat);
            } else {
                CharSequence charSequence = this.currentName;
                if (charSequence != null) {
                    this.avatarDrawable.setInfo(this.currentId, charSequence.toString(), null);
                } else {
                    this.avatarDrawable.setInfo(this.currentId, "#", null);
                }
            }
        }
        CharSequence charSequence2 = this.currentName;
        if (charSequence2 != null) {
            this.lastName = null;
            this.nameTextView.setText(charSequence2);
        } else {
            if (tLRPC$User != null) {
                if (str == null) {
                    str = UserObject.getUserName(tLRPC$User);
                }
                this.lastName = str;
            } else if (tLRPC$Chat != null) {
                if (str == null) {
                    str = tLRPC$Chat.title;
                }
                this.lastName = str;
            } else {
                this.lastName = "";
            }
            CharSequence charSequence3 = this.lastName;
            if (charSequence3 != null) {
                try {
                    charSequence3 = Emoji.replaceEmoji(charSequence3, this.nameTextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(18.0f), false);
                } catch (Exception unused) {
                }
            }
            this.nameTextView.setText(charSequence3);
        }
        if (tLRPC$User != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(tLRPC$User)) {
            TLRPC$EmojiStatus tLRPC$EmojiStatus = tLRPC$User.emoji_status;
            if ((tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) && ((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus).until > ((int) (System.currentTimeMillis() / 1000))) {
                this.emojiStatus.set(((TLRPC$TL_emojiStatusUntil) tLRPC$User.emoji_status).document_id, false);
                this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                this.nameTextView.setRightDrawable(this.emojiStatus);
            } else {
                TLRPC$EmojiStatus tLRPC$EmojiStatus2 = tLRPC$User.emoji_status;
                if (tLRPC$EmojiStatus2 instanceof TLRPC$TL_emojiStatus) {
                    this.emojiStatus.set(((TLRPC$TL_emojiStatus) tLRPC$EmojiStatus2).document_id, false);
                    this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    this.nameTextView.setRightDrawable(this.emojiStatus);
                } else {
                    if (this.premiumDrawable == null) {
                        this.premiumDrawable = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        AnimatedEmojiDrawable.WrapSizeDrawable wrapSizeDrawable = new AnimatedEmojiDrawable.WrapSizeDrawable(this, this.premiumDrawable, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f)) {
                            @Override
                            public void draw(Canvas canvas) {
                                canvas.save();
                                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                                super.draw(canvas);
                                canvas.restore();
                            }
                        };
                        this.premiumDrawable = wrapSizeDrawable;
                        wrapSizeDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    }
                    this.nameTextView.setRightDrawable(this.premiumDrawable);
                }
            }
            this.nameTextView.setRightDrawableTopPadding(-AndroidUtilities.dp(0.5f));
            i2 = 0;
        } else {
            this.nameTextView.setRightDrawable((Drawable) null);
            i2 = 0;
            this.nameTextView.setRightDrawableTopPadding(0);
        }
        if (this.currentStatus != null) {
            this.statusTextView.setTextColor(this.statusColor);
            this.statusTextView.setText(this.currentStatus);
        } else if (tLRPC$User != null) {
            if (tLRPC$User.bot) {
                this.statusTextView.setTextColor(this.statusColor);
                if (tLRPC$User.bot_chat_history || ((textView = this.adminTextView) != null && textView.getVisibility() == 0)) {
                    this.statusTextView.setText(LocaleController.getString("BotStatusRead", R.string.BotStatusRead));
                } else {
                    this.statusTextView.setText(LocaleController.getString("BotStatusCantRead", R.string.BotStatusCantRead));
                }
            } else if (tLRPC$User.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || (((tLRPC$UserStatus = tLRPC$User.status) != null && tLRPC$UserStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(tLRPC$User.id)))) {
                this.statusTextView.setTextColor(this.statusOnlineColor);
                this.statusTextView.setText(LocaleController.getString("Online", R.string.Online));
            } else {
                this.statusTextView.setTextColor(this.statusColor);
                this.statusTextView.setText(LocaleController.formatUserStatus(this.currentAccount, tLRPC$User));
            }
        }
        if ((this.imageView.getVisibility() == 0 && this.currentDrawable == 0) || (this.imageView.getVisibility() == 8 && this.currentDrawable != 0)) {
            ImageView imageView = this.imageView;
            if (this.currentDrawable == 0) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            this.imageView.setImageResource(this.currentDrawable);
        }
        this.lastAvatar = tLRPC$FileLocation;
        if (tLRPC$User != null) {
            this.avatarImageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
        } else if (tLRPC$Chat != null) {
            this.avatarImageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        } else {
            this.avatarImageView.setImageDrawable(this.avatarDrawable);
        }
        this.avatarImageView.setRoundRadius((tLRPC$Chat == null || !tLRPC$Chat.forum) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(14.0f));
        this.nameTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        TextView textView2 = this.adminTextView;
        if (textView2 != null) {
            textView2.setTextColor(Theme.getColor(Theme.key_profile_creatorIcon, this.resourcesProvider));
        }
    }

    public void setSelfAsSavedMessages(boolean z) {
        this.selfAsSavedMessages = z;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(68.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(68.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null && checkBoxSquare.getVisibility() == 0) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checkBoxBig.isChecked());
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            return;
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || checkBox2.getVisibility() != 0) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            this.nameTextView.invalidate();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.emojiStatus.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.emojiStatus.detach();
        this.storyParams.onDetachFromWindow();
    }

    public long getDialogId() {
        return this.dialogId;
    }

    public void setFromUItem(int i, UItem uItem, boolean z) {
        CharSequence string;
        CharSequence string2;
        Object obj = uItem.chatType;
        if (obj != null) {
            setData(obj, uItem.text, null, 0, z);
            return;
        }
        long j = uItem.dialogId;
        if (j > 0) {
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            if (user != null) {
                if (user.bot) {
                    string2 = LocaleController.getString("Bot", R.string.Bot);
                } else if (user.contact) {
                    string2 = LocaleController.getString("FilterContact", R.string.FilterContact);
                } else {
                    string2 = LocaleController.getString("FilterNonContact", R.string.FilterNonContact);
                }
                setData(user, null, string2, 0, z);
                return;
            }
            return;
        }
        TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat != null) {
            if (chat.participants_count != 0) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                } else {
                    string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                }
            } else if (!ChatObject.isPublic(chat)) {
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    string = LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate);
                } else {
                    string = LocaleController.getString("MegaPrivate", R.string.MegaPrivate);
                }
            } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                string = LocaleController.getString("ChannelPublic", R.string.ChannelPublic);
            } else {
                string = LocaleController.getString("MegaPublic", R.string.MegaPublic);
            }
            setData(chat, null, string, 0, z);
        }
    }

    public void setCloseIcon(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            ImageView imageView = this.closeView;
            if (imageView != null) {
                removeView(imageView);
                this.closeView = null;
                return;
            }
            return;
        }
        if (this.closeView == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.closeView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(this.closeView);
            this.closeView.setImageResource(R.drawable.ic_close_white);
            this.closeView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.closeView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 5));
            ImageView imageView3 = this.closeView;
            boolean z = LocaleController.isRTL;
            addView(imageView3, LayoutHelper.createFrame(30, 30.0f, (z ? 3 : 5) | 16, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 0.0f));
        }
        this.closeView.setOnClickListener(onClickListener);
    }
}
