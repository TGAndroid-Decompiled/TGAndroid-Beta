package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class ChooseQualityLayout$QualityIcon extends Drawable {
    public final AnimatedFloat animatedCast;
    private final Drawable base;
    private final Paint bgLinePaint;
    private final Paint bgPaint = new Paint(1);
    public final AnimatedTextView.AnimatedTextDrawable bottomText;
    private final Drawable.Callback callback;
    public boolean cast;
    private final Paint castCutPaint;
    private final Path castCutPath;
    private final Drawable castFill;
    private int castFillColor;
    private final RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private float rotation;
    public final AnimatedTextView.AnimatedTextDrawable topText;

    public void setCasting(boolean z, boolean z2) {
        if (this.cast == z) {
            return;
        }
        this.cast = z;
        if (!z2) {
            this.animatedCast.force(z);
        }
        invalidateSelf();
    }

    public ChooseQualityLayout$QualityIcon(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint(1);
        this.bgLinePaint = paint;
        this.rect = new RectF();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.topText = animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
        this.bottomText = animatedTextDrawable2;
        Paint paint2 = new Paint(1);
        this.castCutPaint = paint2;
        Path path = new Path();
        this.castCutPath = path;
        this.animatedCast = new AnimatedFloat(new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidateSelf();
            }
        }, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        Drawable.Callback callback = new Drawable.Callback() {
            @Override
            public void invalidateDrawable(Drawable drawable) {
                ChooseQualityLayout$QualityIcon.this.invalidateSelf();
            }

            @Override
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                ChooseQualityLayout$QualityIcon.this.scheduleSelf(runnable, j);
            }

            @Override
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                ChooseQualityLayout$QualityIcon.this.unscheduleSelf(runnable);
            }
        };
        this.callback = callback;
        this.resourcesProvider = resourcesProvider;
        this.base = context.getResources().getDrawable(i).mutate();
        this.castFill = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable.setTextColor(-16777216);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(7.0f));
        animatedTextDrawable.setCallback(callback);
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        animatedTextDrawable2.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        animatedTextDrawable2.setTextColor(-16777216);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(7.0f));
        animatedTextDrawable2.setCallback(callback);
        animatedTextDrawable2.setGravity(17);
        animatedTextDrawable2.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.animatedCast.set(this.cast);
        float fDp = (AndroidUtilities.dp(5.0f) * this.topText.isNotEmpty()) + this.topText.getCurrentWidth();
        float fDp2 = (AndroidUtilities.dp(5.0f) * this.bottomText.isNotEmpty()) + this.bottomText.getCurrentWidth();
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        if (fDp > 0.0f || fDp2 > 0.0f || f5 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        } else {
            canvas2 = canvas;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (AndroidUtilities.dp(6.0f) + bounds.width()) - AndroidUtilities.dp(12.0f), (AndroidUtilities.dp(6.0f) + bounds.height()) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        this.base.setBounds(rect);
        canvas2.save();
        canvas2.rotate(this.rotation * (-180.0f), bounds.centerX(), bounds.centerY());
        this.base.draw(canvas2);
        canvas2.restore();
        this.bgPaint.setColor(-1);
        float fWidth = bounds.left + (bounds.width() * 0.98f);
        float fHeight = bounds.top + (bounds.height() * 0.18f);
        float fHeight2 = bounds.top + (bounds.height() * 0.78f);
        float fDp3 = AndroidUtilities.dp(10.0f);
        if (fDp > 0.0f) {
            float f6 = fDp3 / 2.0f;
            f = 2.0f;
            f2 = 3.0f;
            this.rect.set(fWidth - fDp, fHeight - f6, fWidth, fHeight + f6);
            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.bgLinePaint);
        } else {
            f = 2.0f;
            f2 = 3.0f;
        }
        if (fDp2 > 0.0f) {
            float f7 = fDp3 / f;
            f3 = 0.0f;
            this.rect.set(fWidth - fDp2, fHeight2 - f7, fWidth, f7 + fHeight2);
            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgLinePaint);
        } else {
            f3 = 0.0f;
        }
        float f8 = 1.0f - f5;
        if (fDp * f8 > f3) {
            f4 = 255.0f;
            this.bgPaint.setAlpha((int) (this.topText.isNotEmpty() * 255.0f * f8));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.topText;
            animatedTextDrawable.setAlpha((int) (animatedTextDrawable.isNotEmpty() * 255.0f * f8));
            float f9 = fDp3 / f;
            this.rect.set(fWidth - fDp, fHeight - f9, fWidth, fHeight + f9);
            this.rect.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgPaint);
            this.rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.topText.setBounds(this.rect);
            this.topText.draw(canvas2);
        } else {
            f4 = 255.0f;
        }
        if (f5 > f3) {
            canvas2.save();
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
            if (this.castFillColor != color) {
                Drawable drawable = this.castFill;
                this.castFillColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable2 = this.castFill;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(f2), bounds.top + AndroidUtilities.dp(0.66f), bounds.right - AndroidUtilities.dp(f2), bounds.top + AndroidUtilities.dp(0.66f) + this.castFill.getIntrinsicHeight());
            this.castFill.setAlpha((int) (f5 * f4));
            float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f5);
            canvas2.scale(fLerp, fLerp, this.castFill.getBounds().centerX(), this.castFill.getBounds().centerY());
            if (f5 > 0.5f) {
                canvas2.save();
                canvas2.translate(this.castFill.getBounds().left, this.castFill.getBounds().top);
                canvas2.drawPath(this.castCutPath, this.castCutPaint);
                canvas2.restore();
            }
            this.castFill.draw(canvas2);
            canvas2.restore();
        }
        if (fDp2 > 0.0f) {
            this.bgPaint.setAlpha((int) (this.bottomText.isNotEmpty() * f4));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.bottomText;
            animatedTextDrawable2.setAlpha((int) (animatedTextDrawable2.isNotEmpty() * f4));
            float f10 = fDp3 / f;
            this.rect.set(fWidth - fDp2, fHeight2 - f10, fWidth, fHeight2 + f10);
            this.rect.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(this.rect, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), this.bgPaint);
            this.rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.bottomText.setBounds(this.rect);
            this.bottomText.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public void setAlpha(int i) {
        this.base.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.base.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return this.base.getOpacity();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.base.getIntrinsicWidth() + AndroidUtilities.dp(12.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return this.base.getIntrinsicHeight() + AndroidUtilities.dp(12.0f);
    }
}
