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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
public final class k3 {
    public final Path A;
    public final m3 f21317a;
    public final View f21318b;
    public int f21319c;
    public int d;
    public final org.telegram.ui.Components.g6 f21320e;
    public final org.telegram.ui.Components.g6 f21321f;
    public final Paint f21322g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f21323i;
    public final Paint f21324j;
    public int f21325k;
    public final org.telegram.ui.Cells.z f21326l;
    public int f21327m;
    public final int f21328n;
    public boolean f21329o;
    public final boolean f21330p;
    public final float f21331q;
    public final Bitmap f21332r;
    public final Drawable f21333s;
    public int f21334t;
    public final m11 f21335u;
    public m11 v;
    public float f21336w;
    public final float[] f21337x;
    public final Path f21338y;
    public final Path f21339z;

    public k3(View view, m3 m3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f21323i = paint;
        this.f21324j = new Paint(3);
        org.telegram.ui.Cells.z g02 = i6.g0(822083583, 1, -1);
        this.f21326l = g02;
        this.f21334t = -1;
        this.f21337x = new float[8];
        this.f21338y = new Path();
        Path path = new Path();
        this.f21339z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f21318b = view;
        this.f21317a = m3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        is isVar = is.h;
        this.f21320e = new org.telegram.ui.Components.g6(view, 320L, isVar);
        this.f21321f = new org.telegram.ui.Components.g6(view, 320L, isVar);
        this.f21332r = m3Var.F;
        String b10 = m3Var.b();
        textPaint = n3.getTextPaint();
        this.f21335u = new m11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = m3Var.f21393q;
        this.f21328n = i10;
        this.f21330p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.i4 i4Var = m3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.f38543d0;
            if (!arrayList.isEmpty()) {
                Object g10 = hg.c.g(1, arrayList);
                if ((g10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g10).cached_page) == null || page.local == null)) {
                    this.f21333s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f21331q = m3Var.I;
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
        int d = i0.a.d(this.f21336w, this.f21327m, this.f21328n);
        Paint paint = this.f21322g;
        paint.setColor(d);
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        float f18 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), i6.m1(f10, 268435456));
        float[] fArr = this.f21337x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f21336w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f21338y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f19 = this.f21331q;
        if (f19 > 0.0f && this.f21336w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int m12 = i6.m1(0.07f * f10 * this.f21336w, i10);
            Paint paint2 = this.h;
            paint2.setColor(m12);
            float f20 = rectF.left;
            canvas.drawRect(f20, rectF.top, (rectF.width() * f19) + f20, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f21329o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f21330p) {
            f18 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f18, this.f21336w);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.f21323i;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f21326l;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f21325k != d11) {
            this.f21325k = d11;
            i6.C1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f21 = f17 * f11;
        int i12 = (int) f21;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f21339z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f21336w) * f21));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f21332r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f22 = dp3;
            float f23 = f22 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f22), (int) (rectF.centerY() + f23));
            Paint paint4 = this.f21324j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f21333s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f24 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f24), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f24));
                if (d10 != this.f21334t) {
                    this.f21334t = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        m11 m11Var = this.v;
        if (m11Var != null) {
            m11Var.f28613p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            m11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.q.z(1.0f, this.f21336w, f10, f11), d10, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        m11 m11Var2 = this.f21335u;
        m11Var2.f28613p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f21336w;
        }
        m11Var2.c(dp5, centerY, f15 * f10 * f11, d10, canvas);
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
        return this.f21321f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f21319c;
        }
        return this.f21320e.d(this.f21319c, false);
    }
}
