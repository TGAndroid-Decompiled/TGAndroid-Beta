package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class ChatActivityBotWebViewButton extends FrameLayout {
    public static final SimpleFloatPropertyCompat<ChatActivityBotWebViewButton> PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("progress", ChatActivityBotWebViewButton$$ExternalSyntheticLambda0.INSTANCE, ChatActivityBotWebViewButton$$ExternalSyntheticLambda1.INSTANCE).setMultiplier(100.0f);
    private int backgroundColor;
    private BotCommandsMenuView menuButton;
    private int menuButtonWidth;
    private float progress;
    private RadialProgressView progressView;
    private boolean progressWasVisible;
    private View rippleView;
    private TextView textView;
    private Path path = new Path();
    private int buttonColor = Theme.getColor("featuredStickers_addButton");

    public ChatActivityBotWebViewButton(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 14.0f);
        this.textView.setSingleLine();
        this.textView.setAlpha(0.0f);
        this.textView.setGravity(17);
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        this.progressView.setAlpha(0.0f);
        this.progressView.setScaleX(0.0f);
        this.progressView.setScaleY(0.0f);
        addView(this.progressView, LayoutHelper.createFrame(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.getColor("featuredStickers_addButtonPressed"), 2));
        addView(this.rippleView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        setWillNotDraw(false);
    }

    public void setBotMenuButton(BotCommandsMenuView botCommandsMenuView) {
        this.menuButton = botCommandsMenuView;
        invalidate();
    }

    public void setupButtonParams(boolean z, String str, int i, int i2, final boolean z2) {
        setClickable(z);
        this.rippleView.setVisibility(z ? 0 : 8);
        this.textView.setText(str);
        this.textView.setTextColor(i2);
        this.buttonColor = i;
        this.rippleView.setBackground(Theme.createSelectorDrawable(BotWebViewContainer.getMainButtonRippleColor(i), 2));
        this.progressView.setProgressColor(i2);
        if (this.progressWasVisible != z2) {
            this.progressWasVisible = z2;
            this.progressView.animate().cancel();
            float f = 0.0f;
            if (z2) {
                this.progressView.setAlpha(0.0f);
                this.progressView.setVisibility(0);
            }
            ViewPropertyAnimator animate = this.progressView.animate();
            float f2 = 1.0f;
            if (z2) {
                f = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.alpha(f).scaleX(z2 ? 1.0f : 0.1f);
            if (!z2) {
                f2 = 0.1f;
            }
            scaleX.scaleY(f2).setDuration(250L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (!z2) {
                        ChatActivityBotWebViewButton.this.progressView.setVisibility(8);
                    }
                }
            }).start();
        }
        invalidate();
    }

    public void setProgress(float f) {
        this.progress = f;
        this.backgroundColor = ColorUtils.blendARGB(Theme.getColor("chat_messagePanelVoiceBackground"), this.buttonColor, f);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(f);
        }
        invalidate();
    }

    public void setMeasuredButtonWidth(int i) {
        this.menuButtonWidth = i;
        invalidate();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.menuButtonWidth) - AndroidUtilities.dp(4.0f), getHeight()) * this.progress;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.menuButtonWidth + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        this.path.rewind();
        this.path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(this.path);
        canvas.drawColor(this.backgroundColor);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.progress) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        BotCommandsMenuView botCommandsMenuView = this.menuButton;
        if (botCommandsMenuView != null) {
            botCommandsMenuView.setDrawBackgroundDrawable(false);
            this.menuButton.draw(canvas);
            this.menuButton.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((-AndroidUtilities.dp(8.0f)) * (1.0f - this.progress), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }
}
