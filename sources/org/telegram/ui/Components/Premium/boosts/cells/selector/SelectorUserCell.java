package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StatusBadgeComponent;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class SelectorUserCell extends BaseCell {
    public final ImageView audioView;
    public TL_stories.TL_myBoost boost;
    public TLRPC.Chat chat;
    public final CheckBox2 checkBox;
    public boolean hasAudioView;
    public boolean hasVideoView;
    public final boolean[] isOnline;
    public final ImageView optionsView;
    public boolean showCallButtons;
    public final StatusBadgeComponent statusBadgeComponent;
    public TLRPC.User user;
    public final ImageView videoView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            selectorUserCell.setUser((TLRPC.User) uItem.object);
            selectorUserCell.setChecked(uItem.checked, false);
            selectorUserCell.setDivider(z);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new SelectorUserCell(context, true, false, resourcesProvider, false);
        }
    }

    public SelectorUserCell(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean z3) {
        super(context, resourcesProvider);
        this.isOnline = new boolean[1];
        this.showCallButtons = true;
        this.statusBadgeComponent = new StatusBadgeComponent(this);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.radioButton.setVisibility(8);
        if (z2) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_dialogBackground, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z4 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 40.0f, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
            updateLayouts();
        } else if (z) {
            CheckBox2 checkBox3 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox3;
            if (z3) {
                checkBox3.setColor(Theme.key_checkbox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
            } else {
                checkBox3.setColor(Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
            }
            checkBox3.setDrawUnchecked(true);
            checkBox3.setDrawBackgroundAsArc(10);
            addView(checkBox3);
            checkBox3.setChecked(false, false);
            checkBox3.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            updateLayouts();
        } else {
            this.checkBox = null;
        }
        ImageView imageView = new ImageView(context);
        this.optionsView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int color = Theme.getColor(Theme.key_chat_inMenu, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        addView(imageView, LayoutHelper.createFrame(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.audioView = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i = Theme.key_featuredStickers_addButton;
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), mode));
        boolean z5 = LocaleController.isRTL;
        addView(imageView2, LayoutHelper.createFrame(32, 32.0f, (z5 ? 3 : 5) | 16, z5 ? 52.0f : 12.0f, 0.0f, z5 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.videoView = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), mode));
        addView(imageView3, LayoutHelper.createFrame(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String buildCountDownTime(long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j2)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j4)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j5)));
        return sb.toString();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.boost;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public TLRPC.User getUser() {
        return this.user;
    }

    @Override
    public final boolean needCheck() {
        CheckBox2 checkBox2 = this.checkBox;
        return checkBox2 != null && checkBox2.getDrawUnchecked();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.statusBadgeComponent.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.statusBadgeComponent.onDetachedFromWindow();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.optionsView.setVisibility(8);
        this.boost = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.chat = chat;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(chat);
        BackupImageView backupImageView = this.imageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        backupImageView.setForUserOrChat(this.chat, avatarDrawable);
        String str = this.chat.title;
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleTextView;
        anonymousClass1.setText(str);
        SimpleTextView simpleTextView = this.subtitleTextView;
        simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) tL_myBoost.expires) * 1000))));
        int i = tL_myBoost.cooldown_until_date;
        if (i <= 0) {
            anonymousClass1.setAlpha(1.0f);
            simpleTextView.setAlpha(1.0f);
            setCheckboxAlpha(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, buildCountDownTime((((long) i) * 1000) - System.currentTimeMillis())));
            anonymousClass1.setAlpha(0.65f);
            simpleTextView.setAlpha(0.65f);
            setCheckboxAlpha(0.3f, false);
        }
    }

    public final void setCallButtonsVisible(boolean z, boolean z2) {
        Runnable runnable;
        if (this.showCallButtons == z) {
            return;
        }
        this.showCallButtons = z;
        ImageView imageView = this.videoView;
        ImageView imageView2 = this.audioView;
        float f = 0.0f;
        if (!z2) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z && this.hasAudioView) ? 1.0f : 0.0f);
            imageView2.setVisibility((z && this.hasAudioView) ? 0 : 8);
            imageView.animate().cancel();
            if (z && this.hasVideoView) {
                f = 1.0f;
            }
            imageView.setAlpha(f);
            imageView.setVisibility((z && this.hasVideoView) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = imageView2.animate().alpha((z && this.hasAudioView) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z && this.hasAudioView) {
            runnable = null;
        } else {
            final int i = 0;
            runnable = new Runnable(this) {
                public final SelectorUserCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f$0.audioView.setVisibility(8);
                            break;
                        default:
                            this.f$0.videoView.setVisibility(8);
                            break;
                    }
                }
            };
        }
        viewPropertyAnimatorAlpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = imageView.animate();
        if (z && this.hasVideoView) {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate.alpha(f);
        if (!z || !this.hasVideoView) {
            final int i2 = 1;
            runnable2 = new Runnable(this) {
                public final SelectorUserCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.audioView.setVisibility(8);
                            break;
                        default:
                            this.f$0.videoView.setVisibility(8);
                            break;
                    }
                }
            };
        }
        viewPropertyAnimatorAlpha2.withEndAction(runnable2).start();
    }

    public final void setChat(int i, TLRPC.Chat chat) {
        String string;
        this.optionsView.setVisibility(8);
        this.chat = chat;
        this.user = null;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(chat);
        BackupImageView backupImageView = this.imageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f));
        backupImageView.setForUserOrChat(chat, avatarDrawable);
        String str = chat.title;
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleTextView;
        anonymousClass1.setText(str);
        anonymousClass1.setRightDrawable((Drawable) null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i >= 1) {
            string = LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", i, new Object[0]);
        } else {
            string = LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
    }

    public final void setCheckboxAlpha(float f, boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        if (!z) {
            checkBox2.animate().cancel();
            checkBox2.setAlpha(f);
        } else if (Math.abs(checkBox2.getAlpha() - f) > 0.1d) {
            checkBox2.animate().cancel();
            checkBox2.animate().alpha(f).start();
        }
    }

    @Override
    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null && checkBox2.getVisibility() == 0) {
            checkBox2.setChecked(z, z2);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.optionsView;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.optionsView.setVisibility(8);
        this.user = user;
        this.chat = null;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(user);
        BackupImageView backupImageView = this.imageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        backupImageView.setForUserOrChat(user, avatarDrawable);
        String userName = UserObject.getUserName(user);
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleTextView;
        anonymousClass1.setText(userName);
        boolean[] zArr = this.isOnline;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i = user.bot_active_users;
            if (i > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        this.subtitleTextView.setTextColor(Theme.getColor(zArr[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setAlpha(1.0f);
        }
        anonymousClass1.setRightDrawable(this.statusBadgeComponent.updateDrawable(user, Theme.getColor(null, Theme.key_chats_verifiedBackground, false), false));
    }
}
