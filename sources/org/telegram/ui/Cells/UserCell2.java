package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
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
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;

public class UserCell2 extends FrameLayout {
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private CheckBox checkBox;
    private CheckBoxSquare checkBoxBig;
    private int currentAccount;
    private int currentDrawable;
    private int currentId;
    private CharSequence currentName;
    private TLObject currentObject;
    private CharSequence currentStatus;
    private ImageView imageView;
    private TLRPC.FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private SimpleTextView nameTextView;
    private Theme.ResourcesProvider resourcesProvider;
    private int statusColor;
    private int statusOnlineColor;
    private SimpleTextView statusTextView;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public UserCell2(Context context, int i, int i2) {
        this(context, i, i2, null);
    }

    public UserCell2(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        int i3;
        float f;
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        View view = this.avatarImageView;
        boolean z = LocaleController.isRTL;
        addView(view, LayoutHelper.createFrame(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : i + 7, 11.0f, z ? i + 7 : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context) {
            @Override
            public boolean setText(CharSequence charSequence) {
                return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false));
            }
        };
        this.nameTextView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        this.nameTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.nameTextView.setTextSize(17);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        View view2 = this.nameTextView;
        boolean z2 = LocaleController.isRTL;
        int i4 = (z2 ? 5 : 3) | 48;
        if (z2) {
            i3 = (i2 == 2 ? 18 : 0) + 28;
        } else {
            i3 = i + 68;
        }
        float f2 = i3;
        if (z2) {
            f = i + 68;
        } else {
            f = (i2 != 2 ? 0 : 18) + 28;
        }
        addView(view2, LayoutHelper.createFrame(-1, 20.0f, i4, f2, 14.5f, f, 0.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.statusTextView = simpleTextView2;
        simpleTextView2.setTextSize(14);
        this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        View view3 = this.statusTextView;
        boolean z3 = LocaleController.isRTL;
        addView(view3, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : i + 68, 37.5f, z3 ? i + 68 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.imageView.setVisibility(8);
        View view4 = this.imageView;
        boolean z4 = LocaleController.isRTL;
        addView(view4, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 16.0f, 0.0f, z4 ? 16.0f : 0.0f, 0.0f));
        if (i2 == 2) {
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, false, resourcesProvider);
            this.checkBoxBig = checkBoxSquare;
            boolean z5 = LocaleController.isRTL;
            addView(checkBoxSquare, LayoutHelper.createFrame(18, 18.0f, (z5 ? 3 : 5) | 16, z5 ? 19.0f : 0.0f, 0.0f, z5 ? 0.0f : 19.0f, 0.0f));
            return;
        }
        if (i2 == 1) {
            CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
            this.checkBox = checkBox;
            checkBox.setVisibility(4);
            this.checkBox.setColor(Theme.getColor(Theme.key_checkbox, resourcesProvider), Theme.getColor(Theme.key_checkboxCheck, resourcesProvider));
            View view5 = this.checkBox;
            boolean z6 = LocaleController.isRTL;
            addView(view5, LayoutHelper.createFrame(22, 22.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : i + 37, 41.0f, z6 ? i + 37 : 0.0f, 0.0f));
        }
    }

    public void setData(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, int i) {
        if (tLObject == null && charSequence == null && charSequence2 == null) {
            this.currentStatus = null;
            this.currentName = null;
            this.currentObject = null;
            this.nameTextView.setText("");
            this.statusTextView.setText("");
            this.avatarImageView.setImageDrawable(null);
            return;
        }
        this.currentStatus = charSequence2;
        this.currentName = charSequence;
        this.currentObject = tLObject;
        this.currentDrawable = i;
        update(0);
    }

    public void setNameTypeface(Typeface typeface) {
        this.nameTextView.setTypeface(typeface);
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public void setCheckDisabled(boolean z) {
        CheckBoxSquare checkBoxSquare = this.checkBoxBig;
        if (checkBoxSquare != null) {
            checkBoxSquare.setDisabled(z);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), 1073741824));
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
        TLRPC.User user;
        TLRPC.Chat chat;
        ?? r3;
        String userName;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation;
        TLObject tLObject = this.currentObject;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                r3 = userProfilePhoto.photo_small;
                chat = null;
            } else {
                chat = null;
                r3 = chat;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            if (chatPhoto != null) {
                r3 = chatPhoto.photo_small;
                chat = chat2;
                user = null;
            } else {
                chat = chat2;
                user = null;
                r3 = 0;
            }
        } else {
            user = null;
            chat = null;
            r3 = chat;
        }
        if (i != 0) {
            boolean z = true;
            boolean z2 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation = this.lastAvatar) != null && r3 == 0) || ((fileLocation == null && r3 != 0) || !(fileLocation == null || r3 == 0 || (fileLocation.volume_id == r3.volume_id && fileLocation.local_id == r3.local_id))));
            if (user != null && !z2 && (MessagesController.UPDATE_MASK_STATUS & i) != 0) {
                TLRPC.UserStatus userStatus2 = user.status;
                if ((userStatus2 != null ? userStatus2.expires : 0) != this.lastStatus) {
                    z2 = true;
                }
            }
            if (z2 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                userName = null;
            } else {
                if (user != null) {
                    userName = UserObject.getUserName(user);
                } else {
                    userName = chat.title;
                }
                if (userName.equals(this.lastName)) {
                }
                if (!z) {
                    return;
                }
            }
            z = z2;
            if (!z) {
                return;
            }
        } else {
            userName = null;
        }
        this.lastAvatar = r3;
        if (user != null) {
            this.avatarDrawable.setInfo(this.currentAccount, user);
            TLRPC.UserStatus userStatus3 = user.status;
            if (userStatus3 != null) {
                this.lastStatus = userStatus3.expires;
            } else {
                this.lastStatus = 0;
            }
        } else if (chat != null) {
            this.avatarDrawable.setInfo(this.currentAccount, chat);
        } else {
            CharSequence charSequence = this.currentName;
            if (charSequence != null) {
                this.avatarDrawable.setInfo(this.currentId, charSequence.toString(), null);
            } else {
                this.avatarDrawable.setInfo(this.currentId, "#", null);
            }
        }
        CharSequence charSequence2 = this.currentName;
        if (charSequence2 != null) {
            this.lastName = null;
            this.nameTextView.setText(charSequence2);
        } else {
            if (user != null) {
                if (userName == null) {
                    userName = UserObject.getUserName(user);
                }
                this.lastName = userName;
            } else {
                if (userName == null) {
                    userName = chat.title;
                }
                this.lastName = userName;
            }
            this.nameTextView.setText(this.lastName);
        }
        if (this.currentStatus != null) {
            this.statusTextView.setTextColor(this.statusColor);
            this.statusTextView.setText(this.currentStatus);
            BackupImageView backupImageView = this.avatarImageView;
            if (backupImageView != null) {
                backupImageView.setForUserOrChat(user, this.avatarDrawable);
            }
        } else if (user != null) {
            if (user.bot) {
                this.statusTextView.setTextColor(this.statusColor);
                if (user.bot_chat_history) {
                    this.statusTextView.setText(LocaleController.getString(R.string.BotStatusRead));
                } else {
                    this.statusTextView.setText(LocaleController.getString(R.string.BotStatusCantRead));
                }
            } else if (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                this.statusTextView.setTextColor(this.statusOnlineColor);
                this.statusTextView.setText(LocaleController.getString(R.string.Online));
            } else {
                this.statusTextView.setTextColor(this.statusColor);
                this.statusTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            }
            this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
        } else if (chat != null) {
            this.statusTextView.setTextColor(this.statusColor);
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    this.statusTextView.setText(LocaleController.formatPluralString("Subscribers", i2, new Object[0]));
                } else if (!ChatObject.isPublic(chat)) {
                    this.statusTextView.setText(LocaleController.getString(R.string.ChannelPrivate));
                } else {
                    this.statusTextView.setText(LocaleController.getString(R.string.ChannelPublic));
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    this.statusTextView.setText(LocaleController.formatPluralString("Members", i3, new Object[0]));
                } else if (chat.has_geo) {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaLocation));
                } else if (!ChatObject.isPublic(chat)) {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaPrivate));
                } else {
                    this.statusTextView.setText(LocaleController.getString(R.string.MegaPublic));
                }
            }
            this.avatarImageView.setForUserOrChat(chat, this.avatarDrawable);
        } else {
            this.avatarImageView.setImageDrawable(this.avatarDrawable);
        }
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        if (!(this.imageView.getVisibility() == 0 && this.currentDrawable == 0) && (this.imageView.getVisibility() != 8 || this.currentDrawable == 0)) {
            return;
        }
        this.imageView.setVisibility(this.currentDrawable == 0 ? 8 : 0);
        this.imageView.setImageResource(this.currentDrawable);
    }
}
