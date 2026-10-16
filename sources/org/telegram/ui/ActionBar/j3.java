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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i11;
public final class j3 {
    public final Path A;
    public final l3 f20087a;
    public final View f20088b;
    public int f20089c;
    public int d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.g6 f20090f;
    public final Paint f20091g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f20092i;
    public final Paint f20093j;
    public int f20094k;
    public final org.telegram.ui.Cells.z f20095l;
    public int f20096m;
    public final int f20097n;
    public boolean f20098o;
    public final boolean f20099p;
    public final float f20100q;
    public final Bitmap f20101r;
    public final Drawable f20102s;
    public int f20103t;
    public final i11 f20104u;
    public i11 v;
    public float f20105w;
    public final float[] f20106x;
    public final Path f20107y;
    public final Path f20108z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f20092i = paint;
        this.f20093j = new Paint(3);
        org.telegram.ui.Cells.z g02 = g6.g0(822083583, 1, -1);
        this.f20095l = g02;
        this.f20103t = -1;
        this.f20106x = new float[8];
        this.f20107y = new Path();
        Path path = new Path();
        this.f20108z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f20088b = view;
        this.f20087a = l3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        es esVar = es.h;
        this.e = new org.telegram.ui.Components.g6(view, 320L, esVar);
        this.f20090f = new org.telegram.ui.Components.g6(view, 320L, esVar);
        this.f20101r = l3Var.F;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.f20104u = new i11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.f20198q;
        this.f20097n = i10;
        this.f20099p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.k4 k4Var = l3Var.J;
        if (k4Var != null) {
            ArrayList arrayList = k4Var.f37262d0;
            if (!arrayList.isEmpty()) {
                Object h = i2.d.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f20102s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f20100q = l3Var.I;
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
        int d = i0.a.d(this.f20105w, this.f20096m, this.f20097n);
        Paint paint = this.f20091g;
        paint.setColor(d);
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        float f18 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), g6.m1(f10, 268435456));
        float[] fArr = this.f20106x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f20105w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f20107y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f19 = this.f20100q;
        if (f19 > 0.0f && this.f20105w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int m12 = g6.m1(0.07f * f10 * this.f20105w, i10);
            Paint paint2 = this.h;
            paint2.setColor(m12);
            float f20 = rectF.left;
            canvas.drawRect(f20, rectF.top, (rectF.width() * f19) + f20, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f20098o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f20099p) {
            f18 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f18, this.f20105w);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.f20092i;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f20095l;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f20094k != d11) {
            this.f20094k = d11;
            g6.C1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f21 = f17 * f11;
        int i12 = (int) f21;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f20108z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f20105w) * f21));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f20101r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f22 = dp3;
            float f23 = f22 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f22), (int) (rectF.centerY() + f23));
            Paint paint4 = this.f20093j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f20102s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f24 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f24), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f24));
                if (d10 != this.f20103t) {
                    this.f20103t = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        i11 i11Var = this.v;
        if (i11Var != null) {
            i11Var.f25465p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            i11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.g0.z(1.0f, this.f20105w, f10, f11), d10, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        i11 i11Var2 = this.f20104u;
        i11Var2.f25465p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f20105w;
        }
        i11Var2.c(dp5, centerY, f15 * f10 * f11, d10, canvas);
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
        return this.f20090f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f20089c;
        }
        return this.e.d(this.f20089c, false);
    }
}
