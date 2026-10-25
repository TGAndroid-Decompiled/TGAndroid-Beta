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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.q11;
public final class p3 {
    public final Path A;
    public final r3 f22929a;
    public final View f22930b;
    public int f22931c;
    public int d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.h6 f22932f;
    public final Paint f22933g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint f22934i;
    public final Paint f22935j;
    public int f22936k;
    public final org.telegram.ui.Cells.y f22937l;
    public int f22938m;
    public final int f22939n;
    public boolean f22940o;
    public final boolean f22941p;
    public final float f22942q;
    public final Bitmap f22943r;
    public final Drawable f22944s;
    public int f22945t;
    public final q11 f22946u;
    public q11 v;
    public float f22947w;
    public final float[] f22948x;
    public final Path f22949y;
    public final Path f22950z;

    public p3(View view, r3 r3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.f22934i = paint;
        this.f22935j = new Paint(3);
        org.telegram.ui.Cells.y g02 = y6.g0(822083583, 1, -1);
        this.f22937l = g02;
        this.f22945t = -1;
        this.f22948x = new float[8];
        this.f22949y = new Path();
        Path path = new Path();
        this.f22950z = path;
        Path path2 = new Path();
        this.A = path2;
        this.f22930b = view;
        this.f22929a = r3Var;
        g02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ds dsVar = ds.h;
        this.e = new org.telegram.ui.Components.h6(view, 320L, dsVar);
        this.f22932f = new org.telegram.ui.Components.h6(view, 320L, dsVar);
        this.f22943r = r3Var.F;
        String b10 = r3Var.b();
        textPaint = s3.getTextPaint();
        this.f22946u = new q11(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = r3Var.f23015q;
        this.f22939n = i10;
        this.f22941p = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.j4 j4Var = r3Var.J;
        if (j4Var != null) {
            ArrayList arrayList = j4Var.f40430d0;
            if (!arrayList.isEmpty()) {
                Object g7 = ic.a.g(1, arrayList);
                if ((g7 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g7).cached_page) == null || page.local == null)) {
                    this.f22944s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f22942q = r3Var.I;
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
        int f17 = i0.a.f(this.f22947w, this.f22938m, this.f22939n);
        Paint paint = this.f22933g;
        paint.setColor(f17);
        float f18 = f10 * 255.0f;
        paint.setAlpha((int) f18);
        float f19 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), y6.o1(f10, 268435456));
        float[] fArr = this.f22948x;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[1] = f7;
        int i11 = 0;
        fArr[0] = f7;
        float lerp = AndroidUtilities.lerp(f7, 0.0f, this.f22947w);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f22949y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f20 = this.f22942q;
        if (f20 > 0.0f && this.f22947w > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(f17) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int o12 = y6.o1(0.07f * f10 * this.f22947w, i10);
            Paint paint2 = this.h;
            paint2.setColor(o12);
            float f21 = rectF.left;
            canvas.drawRect(f21, rectF.top, (rectF.width() * f20) + f21, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f22940o) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f22941p) {
            f19 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f12, f19, this.f22947w);
        int f22 = i0.a.f(lerp2, -16777216, -1);
        Paint paint3 = this.f22934i;
        paint3.setColor(f22);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int f23 = i0.a.f(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.y yVar = this.f22937l;
        yVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f22936k != f23) {
            this.f22936k = f23;
            y6.E1(yVar, f23, false);
        }
        yVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f24 = f18 * f11;
        int i12 = (int) f24;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f22950z, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.f22947w) * f24));
        canvas2.drawPath(this.A, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f22943r;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f25 = dp3;
            float f26 = f25 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f26), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f25), (int) (rectF.centerY() + f26));
            Paint paint4 = this.f22935j;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f22944s;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f27 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f27), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f27));
                if (f22 != this.f22945t) {
                    this.f22945t = f22;
                    drawable.setColorFilter(new PorterDuffColorFilter(f22, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        q11 q11Var = this.v;
        if (q11Var != null) {
            q11Var.f31798p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            f13 = 1.0f;
            q11Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.t.A(1.0f, this.f22947w, f10, f11), f22, canvas2);
        } else {
            f13 = 1.0f;
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        q11 q11Var2 = this.f22946u;
        q11Var2.f31798p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.v == null) {
            f15 = f13;
        } else {
            f15 = this.f22947w;
        }
        q11Var2.c(dp5, centerY, f15 * f10 * f11, f22, canvas);
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
        return this.f22932f.e(z10) * min;
    }

    public final float c() {
        if (this.d < 0) {
            return this.f22931c;
        }
        return this.e.d(this.f22931c, false);
    }
}
