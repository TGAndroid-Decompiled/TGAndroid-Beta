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
import org.telegram.ui.Components.LayoutHelper;

public final class UserCell2 extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public final int currentAccount;
    public int currentId;
    public TLObject currentObject;
    public String currentStatus;
    public final ImageView imageView;
    public String lastName;
    public final AnonymousClass1 nameTextView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int statusColor;
    public final int statusOnlineColor;
    public final SimpleTextView statusTextView;

    public UserCell2(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.resourcesProvider = resourcesProvider;
        this.statusColor = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider);
        this.statusOnlineColor = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider);
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11, 11.0f, z ? 11 : 0.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, 0);
        this.nameTextView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass1.setTextSize(17);
        anonymousClass1.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z2 = LocaleController.isRTL;
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28 : 72, 14.5f, z2 ? 72 : 28, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.statusTextView = simpleTextView;
        simpleTextView.setTextSize(14);
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72, 37.5f, z3 ? 72 : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        boolean z4 = LocaleController.isRTL;
        addView(imageView, LayoutHelper.createFrame(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 16.0f, 0.0f, z4 ? 16.0f : 0.0f, 0.0f));
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(70.0f), 1073741824));
    }

    public void setCheckDisabled(boolean z) {
    }

    public void setCurrentId(int i) {
        this.currentId = i;
    }

    public final void setData(TLObject tLObject, String str) {
        if (tLObject != null || str != null) {
            this.currentStatus = str;
            this.currentObject = tLObject;
            update();
        } else {
            this.currentStatus = null;
            this.currentObject = null;
            this.nameTextView.setText("");
            this.statusTextView.setText("");
            this.avatarImageView.setImageDrawable(null);
        }
    }

    public void setNameTypeface(Typeface typeface) {
        this.nameTextView.setTypeface(typeface);
    }

    public final void update() {
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.UserStatus userStatus;
        TLObject tLObject = this.currentObject;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
            TLRPC.ChatPhoto chatPhoto = chat2.photo;
            chat = chat2;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int i = this.currentAccount;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        if (user != null) {
            avatarDrawable.setInfo(i, user);
        } else if (chat != null) {
            avatarDrawable.setInfo(i, chat);
        } else {
            avatarDrawable.setInfo(this.currentId, "#", null);
        }
        if (user != null) {
            this.lastName = UserObject.getUserName(user);
        } else {
            this.lastName = chat.title;
        }
        this.nameTextView.setText(this.lastName);
        String str = this.currentStatus;
        int i2 = this.statusColor;
        BackupImageView backupImageView = this.avatarImageView;
        SimpleTextView simpleTextView = this.statusTextView;
        if (str != null) {
            simpleTextView.setTextColor(i2);
            simpleTextView.setText(this.currentStatus);
            if (backupImageView != null) {
                backupImageView.setForUserOrChat(user, avatarDrawable);
            }
        } else if (user != null) {
            if (user.bot) {
                simpleTextView.setTextColor(i2);
                if (user.bot_chat_history) {
                    simpleTextView.setText(LocaleController.getString(R.string.BotStatusRead));
                } else {
                    simpleTextView.setText(LocaleController.getString(R.string.BotStatusCantRead));
                }
            } else if (user.id == UserConfig.getInstance(i).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || MessagesController.getInstance(i).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                simpleTextView.setTextColor(this.statusOnlineColor);
                simpleTextView.setText(LocaleController.getString(R.string.Online));
            } else {
                simpleTextView.setTextColor(i2);
                simpleTextView.setText(LocaleController.formatUserStatus(i, user));
            }
            backupImageView.setForUserOrChat(user, avatarDrawable);
        } else if (chat != null) {
            simpleTextView.setTextColor(i2);
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    simpleTextView.setText(LocaleController.formatPluralString("Members", i3, new Object[0]));
                } else if (chat.has_geo) {
                    simpleTextView.setText(LocaleController.getString(R.string.MegaLocation));
                } else if (ChatObject.isPublic(chat)) {
                    simpleTextView.setText(LocaleController.getString(R.string.MegaPublic));
                } else {
                    simpleTextView.setText(LocaleController.getString(R.string.MegaPrivate));
                }
            } else {
                int i4 = chat.participants_count;
                if (i4 != 0) {
                    simpleTextView.setText(LocaleController.formatPluralString("Subscribers", i4, new Object[0]));
                } else if (ChatObject.isPublic(chat)) {
                    simpleTextView.setText(LocaleController.getString(R.string.ChannelPublic));
                } else {
                    simpleTextView.setText(LocaleController.getString(R.string.ChannelPrivate));
                }
            }
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        } else {
            backupImageView.setImageDrawable(avatarDrawable);
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.imageView;
        if (imageView.getVisibility() != 0) {
            imageView.getVisibility();
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
    }

    public final class AnonymousClass1 extends SimpleTextView {
        public final int $r8$classId;

        public AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 4:
                    super.onMeasure(i, i2);
                    setPivotY(getMeasuredHeight() / 2.0f);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean setText(CharSequence charSequence) {
            switch (this.$r8$classId) {
                case 0:
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false));
                case 1:
                default:
                    return super.setText(charSequence);
                case 2:
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false));
                case 3:
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false));
            }
        }

        @Override
        public boolean setText(CharSequence charSequence, boolean z) {
            switch (this.$r8$classId) {
                case 1:
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z);
                default:
                    return super.setText(charSequence, z);
            }
        }
    }
}
