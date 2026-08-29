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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
public final class j3 {
    public final l3 f23551a;
    public int f23552b;
    public int f23553c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f23554e;
    public final Paint f23555f = new Paint(1);
    public final Paint f23556g = new Paint(1);
    public final Paint h;
    public final Paint f23557i;
    public int f23558j;
    public final org.telegram.ui.Cells.z f23559k;
    public int f23560l;
    public final int f23561m;
    public boolean f23562n;
    public final boolean f23563o;
    public final float f23564p;
    public final Bitmap f23565q;
    public final Drawable f23566r;
    public int f23567s;
    public final zz0 f23568t;
    public zz0 f23569u;
    public float v;
    public final float[] f23570w;
    public final Path f23571x;
    public final Path f23572y;
    public final Path f23573z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f23557i = new Paint(3);
        org.telegram.ui.Cells.z f02 = g6.f0(822083583, 1, -1);
        this.f23559k = f02;
        this.f23567s = -1;
        this.f23570w = new float[8];
        this.f23571x = new Path();
        Path path = new Path();
        this.f23572y = path;
        Path path2 = new Path();
        this.f23573z = path2;
        this.f23551a = l3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        jr jrVar = jr.h;
        this.d = new org.telegram.ui.Components.d6(view, 320L, jrVar);
        this.f23554e = new org.telegram.ui.Components.d6(view, 320L, jrVar);
        this.f23565q = l3Var.D;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.f23568t = new zz0(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.f23653o;
        this.f23561m = i10;
        this.f23563o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.m4 m4Var = l3Var.H;
        if (m4Var != null) {
            ArrayList arrayList = m4Var.Z;
            if (!arrayList.isEmpty()) {
                Object i11 = j7.l1.i(1, arrayList);
                if ((i11 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i11).cached_page) == null || page.local == null)) {
                    this.f23566r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f23564p = l3Var.G;
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

    public final void a(Canvas canvas, RectF rectF, float f9, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        Canvas canvas2 = canvas;
        int d = i0.a.d(this.v, this.f23560l, this.f23561m);
        Paint paint = this.f23555f;
        paint.setColor(d);
        float f16 = f10 * 255.0f;
        paint.setAlpha((int) f16);
        float f17 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), g6.l1(f10, 268435456));
        float[] fArr = this.f23570w;
        fArr[3] = f9;
        fArr[2] = f9;
        fArr[1] = f9;
        int i11 = 0;
        fArr[0] = f9;
        float lerp = AndroidUtilities.lerp(f9, 0.0f, this.v);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f23571x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f18 = this.f23564p;
        if (f18 > 0.0f && this.v > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l1 = g6.l1(0.07f * f10 * this.v, i10);
            Paint paint2 = this.f23556g;
            paint2.setColor(l1);
            float f19 = rectF.left;
            canvas.drawRect(f19, rectF.top, (rectF.width() * f18) + f19, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f23562n) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f23563o) {
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
        org.telegram.ui.Cells.z zVar = this.f23559k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f23558j != d11) {
            this.f23558j = d11;
            g6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f20 = f16 * f11;
        int i12 = (int) f20;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f23572y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f20));
        canvas2.drawPath(this.f23573z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f23565q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f21 = dp3;
            float f22 = f21 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f22), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f21), (int) (rectF.centerY() + f22));
            Paint paint4 = this.f23557i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f23566r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f23 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f23));
                if (d10 != this.f23567s) {
                    this.f23567s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        zz0 zz0Var = this.f23569u;
        if (zz0Var != null) {
            zz0Var.f35473p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f15);
            zz0Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.x3.y(1.0f, this.v, f10, f11), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        zz0 zz0Var2 = this.f23568t;
        zz0Var2.f35473p = (int) (width - f13);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f23569u == null) {
            f14 = 1.0f;
        } else {
            f14 = this.v;
        }
        zz0Var2.c(dp5, centerY, f14 * f10 * f11, d10, canvas);
    }

    public final float b() {
        float min;
        boolean z10;
        float c3 = c();
        if (c3 < 0.0f) {
            min = c3 + 1.0f;
        } else if (c3 >= 0.0f && c3 < 1.0f) {
            min = AndroidUtilities.lerp(1.0f, 0.87f, c3);
        } else {
            min = (1.0f - Math.min(1.0f, c3 - 1.0f)) * 0.87f;
        }
        if (this.f23553c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f23554e.e(z10) * min;
    }

    public final float c() {
        if (this.f23553c < 0) {
            return this.f23552b;
        }
        return this.d.d(this.f23552b, false);
    }
}
