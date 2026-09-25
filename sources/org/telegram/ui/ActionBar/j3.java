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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
public final class j3 {
    public final l3 f19489a;
    public int f19490b;
    public int f19491c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public final Paint f19492f = new Paint(1);
    public final Paint f19493g = new Paint(1);
    public final Paint h;
    public final Paint f19494i;
    public int f19495j;
    public final org.telegram.ui.Cells.z f19496k;
    public int f19497l;
    public final int f19498m;
    public boolean f19499n;
    public final boolean f19500o;
    public final float f19501p;
    public final Bitmap f19502q;
    public final Drawable f19503r;
    public int f19504s;
    public final t01 f19505t;
    public t01 f19506u;
    public float v;
    public final float[] f19507w;
    public final Path f19508x;
    public final Path f19509y;
    public final Path f19510z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f19494i = new Paint(3);
        org.telegram.ui.Cells.z f02 = h6.f0(822083583, 1, -1);
        this.f19496k = f02;
        this.f19504s = -1;
        this.f19507w = new float[8];
        this.f19508x = new Path();
        Path path = new Path();
        this.f19509y = path;
        Path path2 = new Path();
        this.f19510z = path2;
        this.f19489a = l3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        rr rrVar = rr.h;
        this.d = new org.telegram.ui.Components.e6(view, 320L, rrVar);
        this.e = new org.telegram.ui.Components.e6(view, 320L, rrVar);
        this.f19502q = l3Var.F;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.f19505t = new t01(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.f19611q;
        this.f19498m = i10;
        this.f19500o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.i4 i4Var = l3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.f34392d0;
            if (!arrayList.isEmpty()) {
                Object g10 = hg.c.g(1, arrayList);
                if ((g10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g10).cached_page) == null || page.local == null)) {
                    this.f19503r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f19501p = l3Var.I;
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
        int i10;
        Canvas canvas2 = canvas;
        int d = i0.a.d(this.v, this.f19497l, this.f19498m);
        Paint paint = this.f19492f;
        paint.setColor(d);
        float f16 = f10 * 255.0f;
        paint.setAlpha((int) f16);
        float f17 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), h6.l1(f10, 268435456));
        float[] fArr = this.f19507w;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.v);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f19508x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f18 = this.f19501p;
        if (f18 > 0.0f && this.v > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l1 = h6.l1(0.07f * f10 * this.v, i10);
            Paint paint2 = this.f19493g;
            paint2.setColor(l1);
            float f19 = rectF.left;
            canvas.drawRect(f19, rectF.top, (rectF.width() * f18) + f19, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f19499n) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f19500o) {
            f17 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f17, this.v);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.h;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f19496k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f19495j != d11) {
            this.f19495j = d11;
            h6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f20 = f16 * f11;
        int i12 = (int) f20;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f19509y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f20));
        canvas2.drawPath(this.f19510z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f19502q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f21 = dp3;
            float f22 = f21 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f22), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f21), (int) (rectF.centerY() + f22));
            Paint paint4 = this.f19494i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f19503r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f23 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f23));
                if (d10 != this.f19504s) {
                    this.f19504s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        t01 t01Var = this.f19506u;
        if (t01Var != null) {
            t01Var.f28374p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f15);
            t01Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.f0.z(1.0f, this.v, f10, f11), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        t01 t01Var2 = this.f19505t;
        t01Var2.f28374p = (int) (width - f13);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f19506u == null) {
            f14 = 1.0f;
        } else {
            f14 = this.v;
        }
        t01Var2.c(dp5, centerY, f14 * f10 * f11, d10, canvas);
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
        if (this.f19491c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.e.e(z10) * min;
    }

    public final float c() {
        if (this.f19491c < 0) {
            return this.f19490b;
        }
        return this.d.d(this.f19490b, false);
    }
}
