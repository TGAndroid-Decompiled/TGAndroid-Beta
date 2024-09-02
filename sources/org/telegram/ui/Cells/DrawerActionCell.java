package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.FilterCreateActivity;

public class DrawerActionCell extends FrameLayout {
    private boolean currentError;
    private int currentId;
    private BackupImageView imageView;
    private RectF rect;
    private TextView textView;

    public DrawerActionCell(Context context) {
        super(context);
        this.rect = new RectF();
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_menuItemIcon), PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_chats_menuItemText));
        this.textView.setTextSize(1, 15.0f);
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setGravity(19);
        addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 51, 19.0f, 12.0f, 0.0f, 0.0f));
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 51, 72.0f, 0.0f, 16.0f, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        boolean z2 = this.currentError;
        if (z2 || this.currentId != 8) {
            z = z2;
        } else {
            Set<String> set = MessagesController.getInstance(UserConfig.selectedAccount).pendingSuggestions;
            z = set.contains("VALIDATE_PHONE_NUMBER") || set.contains("VALIDATE_PASSWORD");
        }
        if (z) {
            int dp = AndroidUtilities.dp(12.5f);
            this.rect.set(((getMeasuredWidth() - AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(5.5f), dp, r3 + r2 + AndroidUtilities.dp(14.0f), dp + AndroidUtilities.dp(23.0f));
            Theme.chat_docBackPaint.setColor(Theme.getColor(z2 ? Theme.key_text_RedBold : Theme.key_chats_archiveBackground));
            RectF rectF = this.rect;
            float f = AndroidUtilities.density;
            canvas.drawRoundRect(rectF, f * 11.5f, f * 11.5f, Theme.chat_docBackPaint);
            float intrinsicWidth = Theme.dialogs_errorDrawable.getIntrinsicWidth() / 2;
            float intrinsicHeight = Theme.dialogs_errorDrawable.getIntrinsicHeight() / 2;
            Theme.dialogs_errorDrawable.setBounds((int) (this.rect.centerX() - intrinsicWidth), (int) (this.rect.centerY() - intrinsicHeight), (int) (this.rect.centerX() + intrinsicWidth), (int) (this.rect.centerY() + intrinsicHeight));
            Theme.dialogs_errorDrawable.draw(canvas);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.textView.setTextColor(Theme.getColor(Theme.key_chats_menuItemText));
    }

    public void setError(boolean z) {
        this.currentError = z;
        invalidate();
    }

    public void setTextAndIcon(int i, CharSequence charSequence, int i2) {
        this.currentId = i;
        try {
            this.textView.setText(charSequence);
            this.imageView.setImageResource(i2);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void updateTextAndIcon(String str, int i) {
        try {
            this.textView.setText(str);
            this.imageView.setImageResource(i);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(32);
        accessibilityNodeInfo.setText(this.textView.getText());
        accessibilityNodeInfo.setClassName(TextView.class.getName());
    }

    public void setBot(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        this.currentId = (int) tLRPC$TL_attachMenuBot.bot_id;
        try {
            if (tLRPC$TL_attachMenuBot.side_menu_disclaimer_needed) {
                this.textView.setText(applyNewSpan(tLRPC$TL_attachMenuBot.short_name));
            } else {
                this.textView.setText(tLRPC$TL_attachMenuBot.short_name);
            }
            TLRPC$TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            if (sideAttachMenuBotIcon != null) {
                this.imageView.setImage(ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", (Drawable) null, tLRPC$TL_attachMenuBot);
            } else {
                this.imageView.setImageResource(R.drawable.msg_bot);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static CharSequence applyNewSpan(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10.0f);
        newSpan.setColor(Theme.getColor(Theme.key_premiumGradient1));
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }
}
