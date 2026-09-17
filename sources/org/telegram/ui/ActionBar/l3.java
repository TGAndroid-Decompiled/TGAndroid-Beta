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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;
public final class l3 {
    public final n3 f21147a;
    public int f21148b;
    public int f21149c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f21150e;
    public final Paint f21151f = new Paint(1);
    public final Paint f21152g = new Paint(1);
    public final Paint h;
    public final Paint f21153i;
    public int f21154j;
    public final org.telegram.ui.Cells.z f21155k;
    public int f21156l;
    public final int f21157m;
    public boolean f21158n;
    public final boolean f21159o;
    public final float f21160p;
    public final Bitmap f21161q;
    public final Drawable f21162r;
    public int f21163s;
    public final f01 f21164t;
    public f01 f21165u;
    public float v;
    public final float[] f21166w;
    public final Path f21167x;
    public final Path f21168y;
    public final Path f21169z;

    public l3(View view, n3 n3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f21153i = new Paint(3);
        org.telegram.ui.Cells.z f02 = j6.f0(822083583, 1, -1);
        this.f21155k = f02;
        this.f21163s = -1;
        this.f21166w = new float[8];
        this.f21167x = new Path();
        Path path = new Path();
        this.f21168y = path;
        Path path2 = new Path();
        this.f21169z = path2;
        this.f21147a = n3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        pr prVar = pr.h;
        this.d = new org.telegram.ui.Components.e6(view, 320L, prVar);
        this.f21150e = new org.telegram.ui.Components.e6(view, 320L, prVar);
        this.f21161q = n3Var.F;
        String b10 = n3Var.b();
        textPaint = o3.getTextPaint();
        this.f21164t = new f01(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = n3Var.f21231q;
        this.f21157m = i10;
        this.f21159o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.i4 i4Var = n3Var.J;
        if (i4Var != null) {
            ArrayList arrayList = i4Var.f37217d0;
            if (!arrayList.isEmpty()) {
                Object h = i2.g.h(1, arrayList);
                if ((h instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) h).cached_page) == null || page.local == null)) {
                    this.f21162r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f21160p = n3Var.I;
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
        int d = i0.a.d(this.v, this.f21156l, this.f21157m);
        Paint paint = this.f21151f;
        paint.setColor(d);
        float f16 = f10 * 255.0f;
        paint.setAlpha((int) f16);
        float f17 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), j6.l1(f10, 268435456));
        float[] fArr = this.f21166w;
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
        Path path = this.f21167x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f18 = this.f21160p;
        if (f18 > 0.0f && this.v > 0.0f && f10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l1 = j6.l1(0.07f * f10 * this.v, i10);
            Paint paint2 = this.f21152g;
            paint2.setColor(l1);
            float f19 = rectF.left;
            canvas.drawRect(f19, rectF.top, (rectF.width() * f18) + f19, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f21158n) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (this.f21159o) {
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
        org.telegram.ui.Cells.z zVar = this.f21155k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f21154j != d11) {
            this.f21154j = d11;
            j6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f20 = f16 * f11;
        int i12 = (int) f20;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f21168y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f20));
        canvas2.drawPath(this.f21169z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f21161q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f21 = dp3;
            float f22 = f21 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f22), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f21), (int) (rectF.centerY() + f22));
            Paint paint4 = this.f21153i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f21162r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f23 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f23));
                if (d10 != this.f21163s) {
                    this.f21163s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        f01 f01Var = this.f21165u;
        if (f01Var != null) {
            f01Var.f25859p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f15);
            f01Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.w1.A(1.0f, this.v, f10, f11), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        f01 f01Var2 = this.f21164t;
        f01Var2.f25859p = (int) (width - f13);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f21165u == null) {
            f14 = 1.0f;
        } else {
            f14 = this.v;
        }
        f01Var2.c(dp5, centerY, f14 * f10 * f11, d10, canvas);
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
        if (this.f21149c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f21150e.e(z10) * min;
    }

    public final float c() {
        if (this.f21149c < 0) {
            return this.f21148b;
        }
        return this.d.d(this.f21148b, false);
    }
}
