package org.telegram.ui.Cells;

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
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class DrawerUserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private int accountNumber;
    private AvatarDrawable avatarDrawable;
    private GroupCreateCheckBox checkBox;
    private BackupImageView imageView;
    private RectF rect = new RectF();
    private SimpleTextView textView;

    public DrawerUserCell(Context context) {
        super(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setTextSize(AndroidUtilities.dp(12.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(this.imageView, LayoutHelper.createFrame(36, 36.0f, 51, 14.0f, 6.0f, 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor("chats_menuItemText"));
        this.textView.setTextSize(15);
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setMaxLines(1);
        this.textView.setGravity(19);
        addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 19, 72.0f, 0.0f, 60.0f, 0.0f));
        GroupCreateCheckBox groupCreateCheckBox = new GroupCreateCheckBox(context);
        this.checkBox = groupCreateCheckBox;
        groupCreateCheckBox.setChecked(true, false);
        this.checkBox.setCheckScale(0.9f);
        this.checkBox.setInnerRadDiff(AndroidUtilities.dp(1.5f));
        this.checkBox.setColorKeysOverrides("chats_unreadCounterText", "chats_unreadCounter", "chats_menuBackground");
        addView(this.checkBox, LayoutHelper.createFrame(18, 18.0f, 51, 37.0f, 27.0f, 0.0f, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.textView.setTextColor(Theme.getColor("chats_menuItemText"));
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
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
        }
    }

    public void setAccount(int i) {
        this.accountNumber = i;
        TLRPC$User currentUser = UserConfig.getInstance(i).getCurrentUser();
        if (currentUser != null) {
            this.avatarDrawable.setInfo(currentUser);
            CharSequence formatName = ContactsController.formatName(currentUser.first_name, currentUser.last_name);
            int i2 = 0;
            try {
                formatName = Emoji.replaceEmoji(formatName, this.textView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
            } catch (Exception unused) {
            }
            this.textView.setText(formatName);
            if (MessagesController.getInstance(i).isPremiumUser(currentUser)) {
                this.textView.setDrawablePadding(AndroidUtilities.dp(6.0f));
                this.textView.setRightDrawable(PremiumGradient.getInstance().premiumStarDrawableMini);
            } else {
                this.textView.setRightDrawable((Drawable) null);
            }
            this.imageView.getImageReceiver().setCurrentAccount(i);
            this.imageView.setForUserOrChat(currentUser, this.avatarDrawable);
            GroupCreateCheckBox groupCreateCheckBox = this.checkBox;
            if (i != UserConfig.selectedAccount) {
                i2 = 4;
            }
            groupCreateCheckBox.setVisibility(i2);
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int mainUnreadCount;
        if (UserConfig.getActivatedAccountsCount() > 1 && NotificationsController.getInstance(this.accountNumber).showBadgeNumber && (mainUnreadCount = MessagesStorage.getInstance(this.accountNumber).getMainUnreadCount()) > 0) {
            String format = String.format("%d", Integer.valueOf(mainUnreadCount));
            int dp = AndroidUtilities.dp(12.5f);
            int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format));
            int max = Math.max(AndroidUtilities.dp(10.0f), ceil);
            int measuredWidth = ((getMeasuredWidth() - max) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(5.5f);
            this.rect.set(measuredWidth, dp, measuredWidth + max + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(23.0f) + dp);
            RectF rectF = this.rect;
            float f = AndroidUtilities.density;
            canvas.drawRoundRect(rectF, f * 11.5f, f * 11.5f, Theme.dialogs_countPaint);
            RectF rectF2 = this.rect;
            canvas.drawText(format, rectF2.left + ((rectF2.width() - ceil) / 2.0f), dp + AndroidUtilities.dp(16.0f), Theme.dialogs_countTextPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }
}
