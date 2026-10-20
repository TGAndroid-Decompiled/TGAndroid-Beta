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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
public final class k3 {
    public final Path A;
    public final m3 f21524a;
    public final View f21525b;
    public int f21526c;
    public int d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.f6 f21527f;
    public final Paint f21528g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f21529i;
    public final Paint f21530j;
    public int f21531k;
    public final org.telegram.ui.Cells.z f21532l;
    public int f21533m;
    public final int f21534n;
    public boolean f21535o;
    public final boolean f21536p;
    public final float f21537q;
    public final Bitmap f21538r;
    public final Drawable f21539s;
    public int f21540t;
    public final f11 f21541u;
    public f11 v;
    public float f21542w;
    public final float[] f21543x;
    public final Path f21544y;
    public final Path f21545z;

    public k3(View view, m3 m3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f21529i = paint;
        this.f21530j = new Paint(3);
        org.telegram.ui.Cells.z g02 = h6.g0(822083583, 1, -1);
        this.f21532l = g02;
        this.f21540t = -1;
        this.f21543x = new float[8];
        this.f21544y = new Path();
        Path path = new Path();
        this.f21545z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f21525b = view;
        this.f21524a = m3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        bs bsVar = bs.h;
        this.e = new org.telegram.ui.Components.f6(view, 320L, bsVar);
        this.f21527f = new org.telegram.ui.Components.f6(view, 320L, bsVar);
        this.f21538r = m3Var.F;
        String b10 = m3Var.b();
        textPaint = n3.getTextPaint();
        this.f21541u = new f11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = m3Var.f21595q;
        this.f21534n = i10;
        this.f21536p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.l4 l4Var = m3Var.J;
        if (l4Var != null) {
            ArrayList arrayList = l4Var.f38762d0;
            if (!arrayList.isEmpty()) {
                Object h = i2.e.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f21539s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f21537q = m3Var.I;
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
        int f17 = i0.a.f(this.f21542w, this.f21533m, this.f21534n);
        Paint paint = this.f21528g;
        paint.setColor(f17);
        float f18 = f10 * 255.0f;
        paint.setAlpha((int) f18);
        float f19 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), h6.m1(f10, 268435456));
        float[] fArr = this.f21543x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f21542w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f21544y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f20 = this.f21537q;
        if (f20 > 0.0f && this.f21542w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(f17) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int m12 = h6.m1(0.07f * f10 * this.f21542w, i10);
            Paint paint2 = this.h;
            paint2.setColor(m12);
            float f21 = rectF.left;
            canvas.drawRect(f21, rectF.top, (rectF.width() * f20) + f21, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f21535o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f21536p) {
            f19 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f19, this.f21542w);
        int f22 = i0.a.f(lerp2, -16777216, -1);
        Paint paint3 = this.f21529i;
        paint3.setColor(f22);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f23 = i0.a.f(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f21532l;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f21531k != f23) {
            this.f21531k = f23;
            h6.C1(zVar, f23, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f24 = f18 * f11;
        int i12 = (int) f24;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f21545z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f21542w) * f24));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f21538r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f25 = dp3;
            float f26 = f25 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f26), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f25), (int) (rectF.centerY() + f26));
            Paint paint4 = this.f21530j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f21539s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f27 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f27), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f27));
                if (f22 != this.f21540t) {
                    this.f21540t = f22;
                    drawable.setColorFilter(new PorterDuffColorFilter(f22, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        f11 f11Var = this.v;
        if (f11Var != null) {
            f11Var.f26031p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            f11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.g0.z(1.0f, this.f21542w, f10, f11), f22, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        f11 f11Var2 = this.f21541u;
        f11Var2.f26031p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f21542w;
        }
        f11Var2.c(dp5, centerY, f15 * f10 * f11, f22, canvas);
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
        return this.f21527f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f21526c;
        }
        return this.e.d(this.f21526c, false);
    }
}
