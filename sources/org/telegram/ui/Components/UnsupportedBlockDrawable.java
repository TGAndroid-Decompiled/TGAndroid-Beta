package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

public class UnsupportedBlockDrawable extends Drawable {
    private final Drawable bubbleDrawable;
    private final Paint buttonBackgroundPaint;
    private final ButtonBounce buttonBounce;
    private final int buttonGap;
    private final int buttonHeight;
    private StaticLayout buttonLayout;
    private final int buttonPaddingH;
    private final int buttonRadius;
    private final RectF buttonRect;
    private CharSequence buttonText;
    private final TextPaint buttonTextPaint;
    private final ClickHelper clickHelper;
    private int measuredHeight;
    private int measuredWidth;
    private Runnable onClickListener;
    private final int paddingV;
    private final Drawable planeDrawable;
    private Theme.ResourcesProvider resourcesProvider;
    private CharSequence subtitle;
    private StaticLayout subtitleLayout;
    private final TextPaint subtitlePaint;
    private final int textLeft;
    private CharSequence title;
    private StaticLayout titleLayout;
    private final TextPaint titlePaint;
    private final int titleSubtitleGap;

    public UnsupportedBlockDrawable(Theme.ResourcesProvider resourcesProvider) {
        TextPaint textPaint = new TextPaint(1);
        this.titlePaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.subtitlePaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.buttonTextPaint = textPaint3;
        this.buttonBackgroundPaint = new Paint(1);
        this.buttonRect = new RectF();
        ButtonBounce buttonBounce = new ButtonBounce(null);
        this.buttonBounce = buttonBounce;
        this.clickHelper = new ClickHelper(new ClickHelper.Delegate() {
            @Override
            public boolean forceEnableVibration() {
                return false;
            }

            @Override
            public long getLongPressDuration() {
                return ViewConfiguration.getLongPressTimeout();
            }

            @Override
            public boolean ignoreHapticFeedbackSettings(float f, float f2) {
                return false;
            }

            @Override
            public boolean needCancelTouchBySlopMove() {
                return true;
            }

            @Override
            public boolean needClickAt(View view, float f, float f2) {
                int iDp = AndroidUtilities.dp(9.0f);
                float f3 = -iDp;
                UnsupportedBlockDrawable.this.buttonRect.inset(f3, f3);
                boolean zContains = UnsupportedBlockDrawable.this.buttonRect.contains(f, f2);
                float f4 = iDp;
                UnsupportedBlockDrawable.this.buttonRect.inset(f4, f4);
                return zContains;
            }

            @Override
            public boolean needLongPress(float f, float f2) {
                return false;
            }

            @Override
            public void onClickAt(View view, float f, float f2) {
                if (UnsupportedBlockDrawable.this.onClickListener != null) {
                    UnsupportedBlockDrawable.this.onClickListener.run();
                }
            }

            @Override
            public void onClickTouchDown(View view, float f, float f2) {
                UnsupportedBlockDrawable.this.buttonBounce.setPressed(true);
            }

            @Override
            public void onClickTouchMove(View view, float f, float f2) {
            }

            @Override
            public void onClickTouchUp(View view, float f, float f2) {
                UnsupportedBlockDrawable.this.buttonBounce.setPressed(false);
            }

            @Override
            public void onLongPressCancelled(View view, float f, float f2) {
            }

            @Override
            public void onLongPressFinish(View view, float f, float f2) {
            }

            @Override
            public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            }

            @Override
            public boolean onLongPressRequestedAt(View view, float f, float f2) {
                return false;
            }
        });
        this.textLeft = AndroidUtilities.dp(62.33f);
        this.buttonPaddingH = AndroidUtilities.dp(12.0f);
        this.buttonHeight = AndroidUtilities.dp(30.0f);
        this.buttonRadius = AndroidUtilities.dp(15.0f);
        this.paddingV = AndroidUtilities.dp(7.0f);
        this.buttonGap = AndroidUtilities.dp(12.0f);
        this.titleSubtitleGap = AndroidUtilities.dp(2.0f);
        this.resourcesProvider = resourcesProvider;
        this.planeDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.bubbleDrawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        buttonBounce.setAdditionalInvalidate(new VideoPlayer$$ExternalSyntheticLambda1(this, 1));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.titleLayout == null || this.subtitleLayout == null || this.buttonLayout == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().right;
        int iCenterY = getBounds().centerY();
        int height = iCenterY - ((this.subtitleLayout.getHeight() + (this.titleLayout.getHeight() + this.titleSubtitleGap)) / 2);
        canvas.save();
        canvas.translate(this.textLeft + i, height);
        this.titleLayout.draw(canvas);
        canvas.translate(0.0f, this.titleLayout.getHeight() + this.titleSubtitleGap);
        this.subtitleLayout.draw(canvas);
        canvas.restore();
        int width = (int) (this.buttonLayout.getWidth() + (this.buttonPaddingH * 2));
        int iDp = i2 - AndroidUtilities.dp(11.0f);
        int i3 = iDp - width;
        int i4 = this.buttonHeight;
        int i5 = iCenterY - (i4 / 2);
        float f = i5;
        this.buttonRect.set(i3, f, iDp, i5 + i4);
        float scale = this.buttonBounce.getScale(0.05f);
        canvas.save();
        canvas.scale(scale, scale, this.buttonRect.centerX(), this.buttonRect.centerY());
        Theme.multAlpha(0.18f, -1);
        RectF rectF = this.buttonRect;
        float f2 = this.buttonRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.buttonBackgroundPaint);
        canvas.save();
        canvas.translate(i3 + this.buttonPaddingH, ((this.buttonHeight - this.buttonLayout.getHeight()) / 2.0f) + f);
        this.buttonLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
        float f3 = iCenterY + 1;
        DrawableUtils.setBounds(this.bubbleDrawable, AndroidUtilities.dp(29.66f) + i, f3, 17);
        this.bubbleDrawable.draw(canvas);
        DrawableUtils.setBounds(this.planeDrawable, AndroidUtilities.dp(29.66f) + i, f3, 17);
        this.planeDrawable.draw(canvas);
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    public int measure(int i) {
        this.measuredWidth = i;
        TextPaint textPaint = this.buttonTextPaint;
        CharSequence charSequence = this.buttonText;
        float fMeasureText = textPaint.measureText(charSequence, 0, charSequence.length());
        int i2 = (int) ((this.buttonPaddingH * 2) + fMeasureText);
        CharSequence charSequence2 = this.buttonText;
        TextPaint textPaint2 = this.buttonTextPaint;
        int iCeil = (int) Math.ceil(fMeasureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.buttonLayout = new StaticLayout(charSequence2, textPaint2, iCeil, alignment, 1.0f, 0.0f, false);
        int iDp = (((i - this.textLeft) - i2) - this.buttonGap) - AndroidUtilities.dp(11.0f);
        this.titleLayout = new StaticLayout(TextUtils.ellipsize(this.title, this.titlePaint, iDp, TextUtils.TruncateAt.END), this.titlePaint, iDp, alignment, 1.0f, 0.0f, false);
        this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, iDp, alignment, 1.0f, 0.0f, false);
        int iMax = (this.paddingV * 2) + Math.max(this.subtitleLayout.getHeight() + this.titleLayout.getHeight() + this.titleSubtitleGap, this.buttonHeight);
        this.measuredHeight = iMax;
        setBounds(0, 0, this.measuredWidth, iMax);
        return this.measuredHeight;
    }

    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        return this.clickHelper.onTouchEvent(view, motionEvent);
    }

    @Override
    public void setAlpha(int i) {
    }

    public void setButtonText(CharSequence charSequence) {
        this.buttonText = charSequence;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setOnClickListener(Runnable runnable) {
        this.onClickListener = runnable;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
    }

    public void updateColors() {
        int color = Theme.getColor(null, Theme.key_chat_serviceText, false);
        Drawable drawable = this.planeDrawable;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.bubbleDrawable.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.11f, -16777216), mode));
        this.titlePaint.setColor(color);
        this.subtitlePaint.setColor(ColorUtils.setAlphaComponent(color, 179));
        this.buttonTextPaint.setColor(color);
        this.buttonBackgroundPaint.setColor(Theme.multAlpha(0.11f, -16777216));
    }
}
