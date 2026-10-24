package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.zr;
public final class n3 {
    public final Path A;
    public final p3 f21651a;
    public final View f21652b;
    public int f21653c;
    public int d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f21654f;
    public final Paint f21655g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f21656i;
    public final Paint f21657j;
    public int f21658k;
    public final org.telegram.ui.Cells.y f21659l;
    public int f21660m;
    public final int f21661n;
    public boolean f21662o;
    public final boolean f21663p;
    public final float f21664q;
    public final Bitmap f21665r;
    public final Drawable f21666s;
    public int f21667t;
    public final h11 f21668u;
    public h11 v;
    public float f21669w;
    public final float[] f21670x;
    public final Path f21671y;
    public final Path f21672z;

    public n3(View view, p3 p3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f21656i = paint;
        this.f21657j = new Paint(3);
        org.telegram.ui.Cells.y g02 = k6.g0(822083583, 1, -1);
        this.f21659l = g02;
        this.f21667t = -1;
        this.f21670x = new float[8];
        this.f21671y = new Path();
        Path path = new Path();
        this.f21672z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f21652b = view;
        this.f21651a = p3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        zr zrVar = zr.h;
        this.e = new org.telegram.ui.Components.d6(view, 320L, zrVar);
        this.f21654f = new org.telegram.ui.Components.d6(view, 320L, zrVar);
        this.f21665r = p3Var.F;
        String b10 = p3Var.b();
        textPaint = q3.getTextPaint();
        this.f21668u = new h11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = p3Var.f21768q;
        this.f21661n = i10;
        this.f21663p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.k4 k4Var = p3Var.J;
        if (k4Var != null) {
            ArrayList arrayList = k4Var.f38758d0;
            if (!arrayList.isEmpty()) {
                Object i11 = i2.o1.i(1, arrayList);
                if ((i11 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i11).cached_page) == null || page.local == null)) {
                    this.f21666s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f21664q = p3Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        path.moveTo(AndroidUtilities.dp(12.0f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, AndroidUtilities.dp(6.33f) / 2.0f);
        path2.lineTo(AndroidUtilities.dp(12.66f) / 2.0f, (-AndroidUtilities.dp(6.33f)) / 2.0f);
        path2.lineTo(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f7, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        Canvas canvas2 = canvas;
        int f17 = i0.a.f(this.f21669w, this.f21660m, this.f21661n);
        Paint paint = this.f21655g;
        paint.setColor(f17);
        float f18 = f10 * 255.0f;
        paint.setAlpha((int) f18);
        float f19 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), k6.o1(f10, 268435456));
        float[] fArr = this.f21670x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f21669w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f21671y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f20 = this.f21664q;
        if (f20 > 0.0f && this.f21669w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(f17) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int o12 = k6.o1(0.07f * f10 * this.f21669w, i10);
            Paint paint2 = this.h;
            paint2.setColor(o12);
            float f21 = rectF.left;
            canvas.drawRect(f21, rectF.top, (rectF.width() * f20) + f21, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f21662o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f21663p) {
            f19 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f19, this.f21669w);
        int f22 = i0.a.f(lerp2, -16777216, -1);
        Paint paint3 = this.f21656i;
        paint3.setColor(f22);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f23 = i0.a.f(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.y yVar = this.f21659l;
        yVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f21658k != f23) {
            this.f21658k = f23;
            k6.E1(yVar, f23, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f24 = f18 * f11;
        int i12 = (int) f24;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f21672z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f21669w) * f24));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f21665r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f25 = dp3;
            float f26 = f25 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f26), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f25), (int) (rectF.centerY() + f26));
            Paint paint4 = this.f21657j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f21666s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f27 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f27), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f27));
                if (f22 != this.f21667t) {
                    this.f21667t = f22;
                    drawable.setColorFilter(new PorterDuffColorFilter(f22, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        h11 h11Var = this.v;
        if (h11Var != null) {
            h11Var.f26853p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            h11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.v0.A(1.0f, this.f21669w, f10, f11), f22, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        h11 h11Var2 = this.f21668u;
        h11Var2.f26853p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f21669w;
        }
        h11Var2.c(dp5, centerY, f15 * f10 * f11, f22, canvas);
    }

    public final float b() {
        float min;
        boolean z10;
        float c10 = c();
        if (c10 < 0.0f) {
            min = c10 + 1.0f;
        } else if (c10 >= 0.0f && c10 < 1.0f) {
            min = AndroidUtilities.lerp(1.0f, 0.87f, c10);
        } else {
            min = (1.0f - Math.min(1.0f, c10 - 1.0f)) * 0.87f;
        }
        if (this.d >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f21654f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f21653c;
        }
        return this.e.d(this.f21653c, false);
    }
}
