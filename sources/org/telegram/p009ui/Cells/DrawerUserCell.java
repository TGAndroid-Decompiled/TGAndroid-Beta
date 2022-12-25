package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.GroupCreateCheckBox;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumGradient;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$User;

public class DrawerUserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private int accountNumber;
    private AvatarDrawable avatarDrawable;
    private GroupCreateCheckBox checkBox;
    private BackupImageView imageView;
    private RectF rect;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable status;
    private SimpleTextView textView;

    public DrawerUserCell(Context context) {
        super(context);
        this.rect = new RectF();
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.m35dp(20.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m35dp(18.0f));
        addView(this.imageView, LayoutHelper.createFrame(36, 36.0f, 51, 14.0f, 6.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setPadding(0, AndroidUtilities.m35dp(4.0f), 0, AndroidUtilities.m35dp(4.0f));
        this.textView.setTextColor(Theme.getColor("chats_menuItemText"));
        this.textView.setTextSize(15);
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setMaxLines(1);
        this.textView.setGravity(19);
        this.textView.setEllipsizeByGradient(24);
        addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 19, 72.0f, 0.0f, 14.0f, 0.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.textView, AndroidUtilities.m35dp(20.0f));
        this.status = swapAnimatedEmojiDrawable;
        this.textView.setRightDrawable(swapAnimatedEmojiDrawable);
        GroupCreateCheckBox groupCreateCheckBox = new GroupCreateCheckBox(context);
        this.checkBox = groupCreateCheckBox;
        groupCreateCheckBox.setChecked(true, false);
        this.checkBox.setCheckScale(0.9f);
        this.checkBox.setInnerRadDiff(AndroidUtilities.m35dp(1.5f));
        this.checkBox.setColorKeysOverrides("chats_unreadCounterText", "chats_unreadCounter", "chats_menuBackground");
        addView(this.checkBox, LayoutHelper.createFrame(18, 18.0f, 51, 37.0f, 27.0f, 0.0f, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(48.0f), 1073741824));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.textView.setTextColor(Theme.getColor("chats_menuItemText"));
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.updateInterfaces);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.updateInterfaces);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.textView.getRightDrawable() instanceof AnimatedEmojiDrawable.WrapSizeDrawable) {
            Drawable drawable = ((AnimatedEmojiDrawable.WrapSizeDrawable) this.textView.getRightDrawable()).getDrawable();
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(this.textView);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            int i3 = this.accountNumber;
            if (i2 == i3) {
                setAccount(i3);
            }
        } else if (i == NotificationCenter.emojiLoaded) {
            this.textView.invalidate();
        } else if (i != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_EMOJI_STATUS) <= 0) {
        } else {
            setAccount(this.accountNumber);
        }
    }

    public void setAccount(int i) {
        this.accountNumber = i;
        TLRPC$User currentUser = UserConfig.getInstance(i).getCurrentUser();
        if (currentUser == null) {
            return;
        }
        this.avatarDrawable.setInfo(currentUser);
        CharSequence formatName = ContactsController.formatName(currentUser.first_name, currentUser.last_name);
        try {
            formatName = Emoji.replaceEmoji(formatName, this.textView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(20.0f), false);
        } catch (Exception unused) {
        }
        this.textView.setText(formatName);
        TLRPC$EmojiStatus tLRPC$EmojiStatus = currentUser.emoji_status;
        if ((tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) && ((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus).until > ((int) (System.currentTimeMillis() / 1000))) {
            this.textView.setDrawablePadding(AndroidUtilities.m35dp(4.0f));
            this.status.set(((TLRPC$TL_emojiStatusUntil) currentUser.emoji_status).document_id, true);
            this.textView.setRightDrawableOutside(true);
        } else if (currentUser.emoji_status instanceof TLRPC$TL_emojiStatus) {
            this.textView.setDrawablePadding(AndroidUtilities.m35dp(4.0f));
            this.status.set(((TLRPC$TL_emojiStatus) currentUser.emoji_status).document_id, true);
            this.textView.setRightDrawableOutside(true);
        } else if (MessagesController.getInstance(i).isPremiumUser(currentUser)) {
            this.textView.setDrawablePadding(AndroidUtilities.m35dp(6.0f));
            this.status.set(PremiumGradient.getInstance().premiumStarDrawableMini, true);
            this.textView.setRightDrawableOutside(true);
        } else {
            this.status.set((Drawable) null, true);
            this.textView.setRightDrawableOutside(false);
        }
        this.status.setColor(Integer.valueOf(Theme.getColor("chats_verifiedBackground")));
        this.imageView.getImageReceiver().setCurrentAccount(i);
        this.imageView.setForUserOrChat(currentUser, this.avatarDrawable);
        this.checkBox.setVisibility(i != UserConfig.selectedAccount ? 4 : 0);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (UserConfig.getActivatedAccountsCount() <= 1 || !NotificationsController.getInstance(this.accountNumber).showBadgeNumber) {
            this.textView.setRightPadding(0);
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.accountNumber).getMainUnreadCount();
        if (mainUnreadCount <= 0) {
            this.textView.setRightPadding(0);
            return;
        }
        String format = String.format("%d", Integer.valueOf(mainUnreadCount));
        int m35dp = AndroidUtilities.m35dp(12.5f);
        int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format));
        int max = Math.max(AndroidUtilities.m35dp(10.0f), ceil);
        int measuredWidth = ((getMeasuredWidth() - max) - AndroidUtilities.m35dp(25.0f)) - AndroidUtilities.m35dp(5.5f);
        this.rect.set(measuredWidth, m35dp, measuredWidth + max + AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(23.0f) + m35dp);
        RectF rectF = this.rect;
        float f = AndroidUtilities.density;
        canvas.drawRoundRect(rectF, f * 11.5f, f * 11.5f, Theme.dialogs_countPaint);
        RectF rectF2 = this.rect;
        canvas.drawText(format, rectF2.left + ((rectF2.width() - ceil) / 2.0f), m35dp + AndroidUtilities.m35dp(16.0f), Theme.dialogs_countTextPaint);
        this.textView.setRightPadding(max + AndroidUtilities.m35dp(26.0f));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }
}
