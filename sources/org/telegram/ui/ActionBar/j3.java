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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
public final class j3 {
    public final l3 f23527a;
    public int f23528b;
    public int f23529c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 f23530e;
    public final Paint f23531f = new Paint(1);
    public final Paint f23532g = new Paint(1);
    public final Paint h;
    public final Paint f23533i;
    public int f23534j;
    public final org.telegram.ui.Cells.z f23535k;
    public int f23536l;
    public final int f23537m;
    public boolean f23538n;
    public final boolean f23539o;
    public final float f23540p;
    public final Bitmap f23541q;
    public final Drawable f23542r;
    public int f23543s;
    public final nz0 f23544t;
    public nz0 f23545u;
    public float v;
    public final float[] f23546w;
    public final Path f23547x;
    public final Path f23548y;
    public final Path f23549z;

    public j3(View view, l3 l3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f23533i = new Paint(3);
        org.telegram.ui.Cells.z f02 = f6.f0(822083583, 1, -1);
        this.f23535k = f02;
        this.f23543s = -1;
        this.f23546w = new float[8];
        this.f23547x = new Path();
        Path path = new Path();
        this.f23548y = path;
        Path path2 = new Path();
        this.f23549z = path2;
        this.f23527a = l3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        gr grVar = gr.h;
        this.d = new org.telegram.ui.Components.y5(view, 320L, grVar);
        this.f23530e = new org.telegram.ui.Components.y5(view, 320L, grVar);
        this.f23541q = l3Var.D;
        String b10 = l3Var.b();
        textPaint = m3.getTextPaint();
        this.f23544t = new nz0(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i9 = l3Var.f23631o;
        this.f23537m = i9;
        this.f23539o = AndroidUtilities.computePerceivedBrightness(i9) < 0.721f;
        org.telegram.ui.l4 l4Var = l3Var.H;
        if (l4Var != null) {
            ArrayList arrayList = l4Var.Z;
            if (!arrayList.isEmpty()) {
                Object j10 = j3.r0.j(1, arrayList);
                if ((j10 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) j10).cached_page) == null || page.local == null)) {
                    this.f23542r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f23540p = l3Var.G;
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

    public final void a(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        int i9;
        Canvas canvas2 = canvas;
        int d = i0.a.d(this.v, this.f23536l, this.f23537m);
        Paint paint = this.f23531f;
        paint.setColor(d);
        float f17 = f11 * 255.0f;
        paint.setAlpha((int) f17);
        float f18 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), f6.l1(f11, 268435456));
        float[] fArr = this.f23546w;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i10 = 0;
        fArr[0] = f10;
        float lerp = AndroidUtilities.lerp(f10, 0.0f, this.v);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f23547x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f19 = this.f23540p;
        if (f19 > 0.0f && this.v > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i9 = -16777216;
            } else {
                i9 = -1;
            }
            int l1 = f6.l1(0.07f * f11 * this.v, i9);
            Paint paint2 = this.f23532g;
            paint2.setColor(l1);
            float f20 = rectF.left;
            canvas.drawRect(f20, rectF.top, (rectF.width() * f19) + f20, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f23538n) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (this.f23539o) {
            f18 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f13, f18, this.v);
        int d9 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.h;
        paint3.setColor(d9);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d10 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f23535k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f23534j != d10) {
            this.f23534j = d10;
            f6.B1(zVar, d10, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f21 = f17 * f12;
        int i11 = (int) f21;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.f23548y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f21));
        canvas2.drawPath(this.f23549z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f23541q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f22 = dp3;
            float f23 = f22 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f22), (int) (rectF.centerY() + f23));
            Paint paint4 = this.f23533i;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i10 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f23542r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f24 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f24), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f24));
                if (d9 != this.f23543s) {
                    this.f23543s = d9;
                    drawable.setColorFilter(new PorterDuffColorFilter(d9, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i11);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i10 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        nz0 nz0Var = this.f23545u;
        if (nz0Var != null) {
            nz0Var.f31234p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            nz0Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i10, rectF.centerY(), org.telegram.messenger.l0.y(1.0f, this.v, f11, f12), d9, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        nz0 nz0Var2 = this.f23544t;
        nz0Var2.f31234p = (int) (width - f14);
        float dp5 = i10 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f23545u == null) {
            f15 = 1.0f;
        } else {
            f15 = this.v;
        }
        nz0Var2.c(dp5, centerY, f15 * f11 * f12, d9, canvas);
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
        if (this.f23529c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return this.f23530e.e(z10) * min;
    }

    public final float c() {
        if (this.f23529c < 0) {
            return this.f23528b;
        }
        return this.d.d(this.f23528b, false);
    }
}
