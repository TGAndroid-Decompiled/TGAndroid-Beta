package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.iv.RichDetailsCell;

public final class ChooseQualityLayout$QualityIcon extends Drawable {
    public final AnimatedFloat animatedCast;
    public final Drawable base;
    public final Paint bgLinePaint;
    public final Paint bgPaint = new Paint(1);
    public final AnimatedTextView.AnimatedTextDrawable bottomText;
    public boolean cast;
    public final Paint castCutPaint;
    public final Path castCutPath;
    public final Drawable castFill;
    public int castFillColor;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final AnimatedTextView.AnimatedTextDrawable topText;

    public ChooseQualityLayout$QualityIcon(ContextThemeWrapper contextThemeWrapper, int i, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint(1);
        this.bgLinePaint = paint;
        this.rect = new RectF();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.topText = animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.bottomText = animatedTextDrawable2;
        Paint paint2 = new Paint(1);
        this.castCutPaint = paint2;
        Path path = new Path();
        this.castCutPath = path;
        this.animatedCast = new AnimatedFloat(new ChatActivity$$ExternalSyntheticLambda174(this, 24), 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
        RichDetailsCell.AnonymousClass1 anonymousClass1 = new RichDetailsCell.AnonymousClass1(this, 3);
        this.resourcesProvider = resourcesProvider;
        this.base = contextThemeWrapper.getResources().getDrawable(i).mutate();
        this.castFill = contextThemeWrapper.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Typeface typeface = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-16777216);
        animatedTextDrawable.alpha = Color.alpha(-16777216);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(7.0f));
        animatedTextDrawable.setCallback(anonymousClass1);
        animatedTextDrawable.gravity = 17;
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        Typeface typeface2 = AndroidUtilities.getTypeface("fonts/num.otf");
        TextPaint textPaint2 = animatedTextDrawable2.textPaint;
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(-16777216);
        animatedTextDrawable2.alpha = Color.alpha(-16777216);
        animatedTextDrawable2.setTextSize(AndroidUtilities.dp(7.0f));
        animatedTextDrawable2.setCallback(anonymousClass1);
        animatedTextDrawable2.gravity = 17;
        animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4 = this.animatedCast.set(this.cast);
        float fDp = AndroidUtilities.dp(5.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.topText;
        float currentWidth = animatedTextDrawable.getCurrentWidth() + (animatedTextDrawable.isNotEmpty() * fDp);
        float fDp2 = AndroidUtilities.dp(5.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.bottomText;
        float currentWidth2 = animatedTextDrawable2.getCurrentWidth() + (animatedTextDrawable2.isNotEmpty() * fDp2);
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        if (currentWidth > 0.0f || currentWidth2 > 0.0f || f4 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        } else {
            canvas2 = canvas;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.base;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.bgPaint;
        paint.setColor(-1);
        float fWidth = (bounds.width() * 0.98f) + bounds.left;
        float fHeight = (bounds.height() * 0.18f) + bounds.top;
        float fHeight2 = (bounds.height() * 0.78f) + bounds.top;
        float fDp3 = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.bgLinePaint;
        RectF rectF = this.rect;
        if (currentWidth > 0.0f) {
            f = fDp3;
            float f5 = f / 2.0f;
            f2 = fHeight;
            rectF.set(fWidth - currentWidth, f2 - f5, fWidth, f2 + f5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f = fDp3;
            f2 = fHeight;
        }
        if (currentWidth2 > 0.0f) {
            float f6 = f / 2.0f;
            rectF.set(fWidth - currentWidth2, fHeight2 - f6, fWidth, fHeight2 + f6);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        }
        float f7 = 1.0f - f4;
        if (currentWidth * f7 > 0.0f) {
            paint.setAlpha((int) (animatedTextDrawable.isNotEmpty() * 255.0f * f7));
            animatedTextDrawable.alpha = (int) (animatedTextDrawable.isNotEmpty() * 255.0f * f7);
            float f8 = f / 2.0f;
            rectF.set(fWidth - currentWidth, f2 - f8, fWidth, f2 + f8);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            animatedTextDrawable.setBounds(rectF);
            animatedTextDrawable.draw(canvas2);
        }
        if (f4 > 0.0f) {
            canvas2.save();
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
            int i = this.castFillColor;
            Drawable drawable2 = this.castFill;
            if (i != color) {
                this.castFillColor = color;
                drawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            f3 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (f4 * 255.0f));
            float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, f4);
            canvas2.scale(fLerp, fLerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (f4 > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.castCutPath, this.castCutPaint);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f3 = 255.0f;
        }
        if (currentWidth2 > 0.0f) {
            paint.setAlpha((int) (animatedTextDrawable2.isNotEmpty() * f3));
            animatedTextDrawable2.alpha = (int) (animatedTextDrawable2.isNotEmpty() * f3);
            float f9 = f / 2.0f;
            rectF.set(fWidth - currentWidth2, fHeight2 - f9, fWidth, fHeight2 + f9);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            animatedTextDrawable2.setBounds(rectF);
            animatedTextDrawable2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.base.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.base.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.base.getOpacity();
    }

    @Override
    public final void setAlpha(int i) {
        this.base.setAlpha(i);
    }

    public final void setCasting(boolean z) {
        if (this.cast == z) {
            return;
        }
        this.cast = z;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.base.setColorFilter(colorFilter);
    }
}
