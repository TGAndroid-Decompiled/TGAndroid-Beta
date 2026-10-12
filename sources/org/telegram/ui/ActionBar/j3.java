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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r11;
public final class j3 {
    public final Path A;
    public final l3 f20991a;
    public final View f20992b;
    public int f20993c;
    public int d;
    public final org.telegram.ui.Components.g6 f20994e;
    public final org.telegram.ui.Components.g6 f20995f;
    public final Paint f20996g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f20997i;
    public final Paint f20998j;
    public int f20999k;
    public final org.telegram.ui.Cells.z f21000l;
    public int f21001m;
    public final int f21002n;
    public boolean f21003o;
    public final boolean f21004p;
    public final float f21005q;
    public final Bitmap f21006r;
    public final Drawable f21007s;
    public int f21008t;
    public final r11 f21009u;
    public r11 v;
    public float f21010w;
    public final float[] f21011x;
    public final Path f21012y;
    public final Path f21013z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f20997i = paint;
        this.f20998j = new Paint(3);
        org.telegram.ui.Cells.z g02 = h6.g0(822083583, 1, -1);
        this.f21000l = g02;
        this.f21008t = -1;
        this.f21011x = new float[8];
        this.f21012y = new Path();
        Path path = new Path();
        this.f21013z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f20992b = view;
        this.f20991a = l3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        js jsVar = js.h;
        this.f20994e = new org.telegram.ui.Components.g6(view, 320L, jsVar);
        this.f20995f = new org.telegram.ui.Components.g6(view, 320L, jsVar);
        this.f21006r = l3Var.F;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.f21009u = new r11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.f21119q;
        this.f21002n = i10;
        this.f21004p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.i4 i4Var = l3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.f38648d0;
            if (!arrayList.isEmpty()) {
                Object h = hg.c.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f21007s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f21005q = l3Var.I;
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
        int d = i0.a.d(this.f21010w, this.f21001m, this.f21002n);
        Paint paint = this.f20996g;
        paint.setColor(d);
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        float f18 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), h6.m1(f10, 268435456));
        float[] fArr = this.f21011x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f21010w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f21012y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f19 = this.f21005q;
        if (f19 > 0.0f && this.f21010w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int m12 = h6.m1(0.07f * f10 * this.f21010w, i10);
            Paint paint2 = this.h;
            paint2.setColor(m12);
            float f20 = rectF.left;
            canvas.drawRect(f20, rectF.top, (rectF.width() * f19) + f20, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f21003o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f21004p) {
            f18 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f18, this.f21010w);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.f20997i;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f21000l;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f20999k != d11) {
            this.f20999k = d11;
            h6.C1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f21 = f17 * f11;
        int i12 = (int) f21;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f21013z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f21010w) * f21));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f21006r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f22 = dp3;
            float f23 = f22 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f22), (int) (rectF.centerY() + f23));
            Paint paint4 = this.f20998j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f21007s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f24 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f24), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f24));
                if (d10 != this.f21008t) {
                    this.f21008t = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        r11 r11Var = this.v;
        if (r11Var != null) {
            r11Var.f30000p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            r11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.v0.A(1.0f, this.f21010w, f10, f11), d10, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        r11 r11Var2 = this.f21009u;
        r11Var2.f30000p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f21010w;
        }
        r11Var2.c(dp5, centerY, f15 * f10 * f11, d10, canvas);
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
        return this.f20995f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f20993c;
        }
        return this.f20994e.d(this.f20993c, false);
    }
}
