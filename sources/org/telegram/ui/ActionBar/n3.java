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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
public final class n3 {
    public final p3 f18488a;
    public int f18489b;
    public int f18490c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final Paint f18491f = new Paint(1);
    public final Paint f18492g = new Paint(1);
    public final Paint h;
    public final Paint f18493i;
    public int f18494j;
    public final org.telegram.ui.Cells.z f18495k;
    public int f18496l;
    public final int f18497m;
    public boolean f18498n;
    public final boolean f18499o;
    public final float f18500p;
    public final Bitmap f18501q;
    public final Drawable f18502r;
    public int f18503s;
    public final t01 f18504t;
    public t01 f18505u;
    public float v;
    public final float[] f18506w;
    public final Path f18507x;
    public final Path f18508y;
    public final Path f18509z;

    public n3(View view, p3 p3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f18493i = new Paint(3);
        org.telegram.ui.Cells.z f02 = j6.f0(822083583, 1, -1);
        this.f18495k = f02;
        this.f18503s = -1;
        this.f18506w = new float[8];
        this.f18507x = new Path();
        Path path = new Path();
        this.f18508y = path;
        Path path2 = new Path();
        this.f18509z = path2;
        this.f18488a = p3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        wr wrVar = wr.h;
        this.d = new org.telegram.ui.Components.d6(view, 320L, wrVar);
        this.e = new org.telegram.ui.Components.d6(view, 320L, wrVar);
        this.f18501q = p3Var.F;
        String b10 = p3Var.b();
        textPaint = q3.getTextPaint();
        this.f18504t = new t01(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = p3Var.f18553q;
        this.f18497m = i10;
        this.f18499o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.j4 j4Var = p3Var.J;
        if (j4Var != null) {
            ArrayList arrayList = j4Var.f33904d0;
            if (!arrayList.isEmpty()) {
                Object i11 = hc.b.i(1, arrayList);
                if ((i11 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i11).cached_page) == null || page.local == null)) {
                    this.f18502r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f18500p = p3Var.I;
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
        int d = i0.a.d(this.v, this.f18496l, this.f18497m);
        Paint paint = this.f18491f;
        paint.setColor(d);
        float f16 = f10 * 255.0f;
        paint.setAlpha((int) f16);
        float f17 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), j6.l1(f10, 268435456));
        float[] fArr = this.f18506w;
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
        Path path = this.f18507x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f18 = this.f18500p;
        if (f18 > 0.0f && this.v > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l1 = j6.l1(0.07f * f10 * this.v, i10);
            Paint paint2 = this.f18492g;
            paint2.setColor(l1);
            float f19 = rectF.left;
            canvas.drawRect(f19, rectF.top, (rectF.width() * f18) + f19, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f18498n) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f18499o) {
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
        org.telegram.ui.Cells.z zVar = this.f18495k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f18494j != d11) {
            this.f18494j = d11;
            j6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f20 = f16 * f11;
        int i12 = (int) f20;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f18508y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f20));
        canvas2.drawPath(this.f18509z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f18501q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f21 = dp3;
            float f22 = f21 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f22), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f21), (int) (rectF.centerY() + f22));
            Paint paint4 = this.f18493i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f18502r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f23 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f23));
                if (d10 != this.f18503s) {
                    this.f18503s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        t01 t01Var = this.f18505u;
        if (t01Var != null) {
            t01Var.f27257p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f15);
            t01Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.a2.A(1.0f, this.v, f10, f11), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        t01 t01Var2 = this.f18504t;
        t01Var2.f27257p = (int) (width - f13);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f18505u == null) {
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
        if (this.f18490c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.e.e(z10) * min;
    }

    public final float c() {
        if (this.f18490c < 0) {
            return this.f18489b;
        }
        return this.d.d(this.f18489b, false);
    }
}
