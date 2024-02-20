package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.Components.AnimatedTextView;
public class VideoCompressButton extends View {
    private final Paint clearPaint;
    private boolean disabled;
    private final AnimatedFloat disabledT;
    private final Paint fillPaint;
    private final AnimatedTextView.AnimatedTextDrawable sizeTextDrawable;
    private final int[] sizes;
    private final Paint strokePaint;
    private final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public VideoCompressButton(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Paint paint2 = new Paint(1);
        this.fillPaint = paint2;
        Paint paint3 = new Paint(1);
        this.clearPaint = paint3;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.disabledT = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        this.sizes = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.4f, 0L, 360L, cubicBezierInterpolator);
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dpf2(10.6f));
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setGravity(17);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, false, false);
        this.sizeTextDrawable = animatedTextDrawable2;
        animatedTextDrawable2.setAnimationProperties(0.2f, 0L, 360L, cubicBezierInterpolator);
        animatedTextDrawable2.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable2.setTextColor(-1);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dpf2(8.6f));
        animatedTextDrawable2.setCallback(this);
        animatedTextDrawable2.setGravity(5);
        animatedTextDrawable2.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void setState(boolean z, boolean z2, int i) {
        this.disabled = !z || z2;
        if (z2) {
            this.textDrawable.setText("GIF");
            this.sizeTextDrawable.setText(BuildConfig.APP_CENTER_HASH, true);
        } else {
            this.textDrawable.setText(i >= 720 ? "HD" : "SD");
            int length = this.sizes.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                } else if (i >= this.sizes[length]) {
                    break;
                } else {
                    length--;
                }
            }
            if (length < 0) {
                this.sizeTextDrawable.setText(BuildConfig.APP_CENTER_HASH, true);
            } else if (length == 6) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.sizeTextDrawable;
                animatedTextDrawable.setText("2K", TextUtils.isEmpty(animatedTextDrawable.getText()));
            } else if (length == 7) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.sizeTextDrawable;
                animatedTextDrawable2.setText("4K", TextUtils.isEmpty(animatedTextDrawable2.getText()));
            } else {
                this.sizeTextDrawable.setText(BuildConfig.APP_CENTER_HASH + this.sizes[length], TextUtils.isEmpty(this.sizeTextDrawable.getText()));
            }
        }
        setClickable(!this.disabled);
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float f = (1.0f - (this.disabledT.set(this.disabled) * 0.35f)) * 255.0f;
        int i = (int) f;
        this.strokePaint.setAlpha(i);
        this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float max = Math.max(AndroidUtilities.dpf2(21.33f), AndroidUtilities.dpf2(6.0f) + this.textDrawable.getCurrentWidth());
        float dpf2 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf2) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf2) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), this.strokePaint);
        android.graphics.Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf2) / 2.0f), getWidth(), (int) ((getHeight() + dpf2) / 2.0f));
        this.textDrawable.setBounds(rect);
        this.textDrawable.setAlpha(i);
        this.textDrawable.draw(canvas);
        rect.set((int) (((getWidth() / 2.0f) + AndroidUtilities.dpf2(16.0f)) - ((this.sizeTextDrawable.isNotEmpty() * AndroidUtilities.dpf2(2.0f)) + this.sizeTextDrawable.getCurrentWidth())), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) ((getWidth() / 2.0f) + AndroidUtilities.dpf2(16.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + AndroidUtilities.dpf2(8.33f)));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.clearPaint);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        this.fillPaint.setAlpha((int) (f * this.sizeTextDrawable.isNotEmpty()));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.fillPaint);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        this.sizeTextDrawable.setBounds(rect);
        this.sizeTextDrawable.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.textDrawable == drawable || this.sizeTextDrawable == drawable || super.verifyDrawable(drawable);
    }
}
