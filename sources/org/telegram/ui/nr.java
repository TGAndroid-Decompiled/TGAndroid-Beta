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
public final class nr extends Drawable {
    public final org.telegram.ui.ActionBar.b6 f40791a;
    public final Paint f40792b = new Paint(1);
    public final Paint f40793c;
    public final Drawable d;
    public final RectF f40794e;
    public final org.telegram.ui.Components.i6 f40795f;
    public final org.telegram.ui.Components.i6 f40796g;
    public final Paint h;
    public final Path f40797i;
    public final Drawable f40798j;
    public int f40799k;
    public boolean f40800l;
    public final org.telegram.ui.Components.y5 f40801m;

    public nr(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.f40793c = paint;
        this.f40794e = new RectF();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f40795f = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f40796g = i6Var2;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Path path = new Path();
        this.f40797i = path;
        this.f40801m = new org.telegram.ui.Components.y5(new ri(this, 12), 320L, org.telegram.ui.Components.gr.h, 0);
        mr mrVar = new mr(0, this);
        this.f40791a = b6Var;
        this.d = context.getResources().getDrawable(i9).mutate();
        this.f40798j = context.getResources().getDrawable(R.drawable.mini_casting_fill).mutate();
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.r(-16777216);
        i6Var.t(AndroidUtilities.dp(7.0f));
        i6Var.setCallback(mrVar);
        i6Var.f29333b = 17;
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var2.r(-16777216);
        i6Var2.t(AndroidUtilities.dp(7.0f));
        i6Var2.setCallback(mrVar);
        i6Var2.f29333b = 17;
        i6Var2.G = AndroidUtilities.displaySize.x;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.33f));
        path.addRoundRect(rectF, AndroidUtilities.dp(2.66f), AndroidUtilities.dp(2.66f), Path.Direction.CW);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10) {
        if (this.f40800l == z10) {
            return;
        }
        this.f40800l = z10;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i9;
        float f13;
        float e10 = this.f40801m.e(this.f40800l);
        org.telegram.ui.Components.i6 i6Var = this.f40795f;
        float d = i6Var.d() + (i6Var.g() * AndroidUtilities.dp(5.0f));
        org.telegram.ui.Components.i6 i6Var2 = this.f40796g;
        float d9 = i6Var2.d() + (i6Var2.g() * AndroidUtilities.dp(5.0f));
        int saveCount = canvas.getSaveCount();
        Rect bounds = getBounds();
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 <= 0 && d9 <= 0.0f && e10 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        }
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), (bounds.width() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f), (bounds.height() + AndroidUtilities.dp(6.0f)) - AndroidUtilities.dp(12.0f));
        rect.offset(bounds.left, bounds.top);
        Drawable drawable = this.d;
        drawable.setBounds(rect);
        canvas2.save();
        canvas2.rotate(-0.0f, bounds.centerX(), bounds.centerY());
        drawable.draw(canvas2);
        canvas2.restore();
        Paint paint = this.f40792b;
        paint.setColor(-1);
        float width = (bounds.width() * 0.98f) + bounds.left;
        float height = (bounds.height() * 0.18f) + bounds.top;
        float height2 = (bounds.height() * 0.78f) + bounds.top;
        float dp = AndroidUtilities.dp(10.0f);
        Paint paint2 = this.f40793c;
        RectF rectF = this.f40794e;
        if (i10 > 0) {
            f10 = dp;
            float f14 = f10 / 2.0f;
            f11 = height;
            f12 = height2;
            rectF.set(width - d, f11 - f14, width, f11 + f14);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            f10 = dp;
            f11 = height;
            f12 = height2;
        }
        int i11 = (d9 > 0.0f ? 1 : (d9 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            float f15 = f10 / 2.0f;
            i9 = i11;
            rectF.set(width - d9, f12 - f15, width, f12 + f15);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
        } else {
            i9 = i11;
        }
        float f16 = 1.0f - e10;
        if (d * f16 > 0.0f) {
            paint.setAlpha((int) (i6Var.g() * 255.0f * f16));
            i6Var.f29351w = (int) (i6Var.g() * 255.0f * f16);
            float f17 = f10 / 2.0f;
            rectF.set(width - d, f11 - f17, width, f11 + f17);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var.m(rectF);
            i6Var.draw(canvas2);
        }
        if (e10 > 0.0f) {
            canvas2.save();
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f40791a);
            int i12 = this.f40799k;
            Drawable drawable2 = this.f40798j;
            if (i12 != v02) {
                this.f40799k = v02;
                drawable2.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            f13 = 255.0f;
            drawable2.setBounds((bounds.right - drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(0.66f) + bounds.top, bounds.right - AndroidUtilities.dp(3.0f), drawable2.getIntrinsicHeight() + AndroidUtilities.dp(0.66f) + bounds.top);
            drawable2.setAlpha((int) (e10 * 255.0f));
            float lerp = AndroidUtilities.lerp(0.8f, 1.0f, e10);
            canvas2.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            if (e10 > 0.5f) {
                canvas2.save();
                canvas2.translate(drawable2.getBounds().left, drawable2.getBounds().top);
                canvas2.drawPath(this.f40797i, this.h);
                canvas2.restore();
            }
            drawable2.draw(canvas2);
            canvas2.restore();
        } else {
            f13 = 255.0f;
        }
        if (i9 > 0) {
            paint.setAlpha((int) (i6Var2.g() * f13));
            i6Var2.f29351w = (int) (i6Var2.g() * f13);
            float f18 = f10 / 2.0f;
            rectF.set(width - d9, f12 - f18, width, f12 + f18);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint);
            rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            i6Var2.m(rectF);
            i6Var2.draw(canvas2);
        }
        canvas2.restoreToCount(saveCount);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f) + this.d.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return this.d.getOpacity();
    }

    @Override
    public final void setAlpha(int i9) {
        this.d.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
