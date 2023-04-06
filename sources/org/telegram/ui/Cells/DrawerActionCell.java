package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
public class DrawerActionCell extends FrameLayout {
    private int currentId;
    private int currentLottieId;
    private ImageView imageView;
    private RLottieImageView lottieImageView;
    private RectF rect;
    private AnimatedTextView textView;

    public DrawerActionCell(Context context) {
        super(context);
        this.rect = new RectF();
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_menuItemIcon"), PorterDuff.Mode.SRC_IN));
        addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 51, 19.0f, 12.0f, 0.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.lottieImageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(false);
        this.lottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chats_menuItemIcon"), PorterDuff.Mode.SRC_IN));
        addView(this.lottieImageView, LayoutHelper.createFrame(28, 28.0f, 51, 17.0f, 10.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.textView = animatedTextView;
        animatedTextView.setAnimationProperties(0.6f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.textView.setTextColor(Theme.getColor("chats_menuItemText"));
        this.textView.setTextSize(AndroidUtilities.dp(15.0f));
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setIgnoreRTL(true);
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 51, 72.0f, 0.0f, 16.0f, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int dp;
        int measuredWidth;
        super.onDraw(canvas);
        if (this.currentId == 8) {
            Set<String> set = MessagesController.getInstance(UserConfig.selectedAccount).pendingSuggestions;
            if (set.contains("VALIDATE_PHONE_NUMBER") || set.contains("VALIDATE_PASSWORD")) {
                int dp2 = AndroidUtilities.dp(12.5f);
                this.rect.set(((getMeasuredWidth() - AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(25.0f)) - AndroidUtilities.dp(5.5f), dp2, measuredWidth + dp + AndroidUtilities.dp(14.0f), dp2 + AndroidUtilities.dp(23.0f));
                Theme.chat_docBackPaint.setColor(Theme.getColor("chats_archiveBackground"));
                RectF rectF = this.rect;
                float f = AndroidUtilities.density;
                canvas.drawRoundRect(rectF, f * 11.5f, f * 11.5f, Theme.chat_docBackPaint);
                float intrinsicWidth = Theme.dialogs_errorDrawable.getIntrinsicWidth() / 2;
                float intrinsicHeight = Theme.dialogs_errorDrawable.getIntrinsicHeight() / 2;
                Theme.dialogs_errorDrawable.setBounds((int) (this.rect.centerX() - intrinsicWidth), (int) (this.rect.centerY() - intrinsicHeight), (int) (this.rect.centerX() + intrinsicWidth), (int) (this.rect.centerY() + intrinsicHeight));
                Theme.dialogs_errorDrawable.draw(canvas);
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.textView.setTextColor(Theme.getColor("chats_menuItemText"));
    }

    public void setTextAndIcon(int i, String str, int i2, int i3) {
        this.currentId = i;
        try {
            this.textView.setText(str, false);
            if (i3 != 0) {
                this.imageView.setImageDrawable(null);
                RLottieImageView rLottieImageView = this.lottieImageView;
                this.currentLottieId = i3;
                rLottieImageView.setAnimation(i3, 28, 28);
            } else {
                this.imageView.setImageResource(i2);
                this.lottieImageView.clearAnimationDrawable();
                this.currentLottieId = 0;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void updateText(String str) {
        this.textView.setText(str);
    }

    public void updateIcon(final int i) {
        try {
            if (i != this.currentLottieId) {
                this.lottieImageView.setOnAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        DrawerActionCell.this.lambda$updateIcon$0(i);
                    }
                });
                this.lottieImageView.playAnimation();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public void lambda$updateIcon$0(int i) {
        RLottieImageView rLottieImageView = this.lottieImageView;
        this.currentLottieId = i;
        rLottieImageView.setAnimation(i, 28, 28);
        this.lottieImageView.setOnAnimationEndListener(null);
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
}
