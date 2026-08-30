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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
public final class k3 {
    public final m3 f20360a;
    public int f20361b;
    public int f20362c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Components.z5 e;
    public final Paint f20363f = new Paint(1);
    public final Paint f20364g = new Paint(1);
    public final Paint h;
    public final Paint f20365i;
    public int f20366j;
    public final org.telegram.ui.Cells.z f20367k;
    public int f20368l;
    public final int f20369m;
    public boolean f20370n;
    public final boolean f20371o;
    public final float f20372p;
    public final Bitmap f20373q;
    public final Drawable f20374r;
    public int f20375s;
    public final k01 f20376t;
    public k01 f20377u;
    public float v;
    public final float[] f20378w;
    public final Path f20379x;
    public final Path f20380y;
    public final Path f20381z;

    public k3(View view, m3 m3Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f20365i = new Paint(3);
        org.telegram.ui.Cells.z f02 = j6.f0(822083583, 1, -1);
        this.f20367k = f02;
        this.f20375s = -1;
        this.f20378w = new float[8];
        this.f20379x = new Path();
        Path path = new Path();
        this.f20380y = path;
        Path path2 = new Path();
        this.f20381z = path2;
        this.f20360a = m3Var;
        f02.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        nr nrVar = nr.h;
        this.d = new org.telegram.ui.Components.z5(view, 320L, nrVar);
        this.e = new org.telegram.ui.Components.z5(view, 320L, nrVar);
        this.f20373q = m3Var.D;
        String b10 = m3Var.b();
        textPaint = n3.getTextPaint();
        this.f20376t = new k01(Emoji.replaceEmoji(b10, textPaint.getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = m3Var.f20459o;
        this.f20369m = i10;
        this.f20371o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.l4 l4Var = m3Var.H;
        if (l4Var != null) {
            ArrayList arrayList = l4Var.f35929a0;
            if (!arrayList.isEmpty()) {
                Object i11 = kh.a2.i(1, arrayList);
                if ((i11 instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) i11).cached_page) == null || page.local == null)) {
                    this.f20374r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f20372p = m3Var.G;
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
        int i10;
        Canvas canvas2 = canvas;
        int d = i0.a.d(this.v, this.f20368l, this.f20369m);
        Paint paint = this.f20363f;
        paint.setColor(d);
        float f17 = f11 * 255.0f;
        paint.setAlpha((int) f17);
        float f18 = 0.0f;
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), j6.l1(f11, 268435456));
        float[] fArr = this.f20378w;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int i11 = 0;
        fArr[0] = f10;
        float lerp = AndroidUtilities.lerp(f10, 0.0f, this.v);
        fArr[7] = lerp;
        fArr[6] = lerp;
        fArr[5] = lerp;
        fArr[4] = lerp;
        Path path = this.f20379x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f19 = this.f20372p;
        if (f19 > 0.0f && this.v > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            if (AndroidUtilities.computePerceivedBrightness(d) > 0.721f) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int l1 = j6.l1(0.07f * f11 * this.v, i10);
            Paint paint2 = this.f20364g;
            paint2.setColor(l1);
            float f20 = rectF.left;
            canvas.drawRect(f20, rectF.top, (rectF.width() * f19) + f20, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f20370n) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        if (this.f20371o) {
            f18 = 1.0f;
        }
        float lerp2 = AndroidUtilities.lerp(f13, f18, this.v);
        int d10 = i0.a.d(lerp2, -16777216, -1);
        Paint paint3 = this.h;
        paint3.setColor(d10);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int d11 = i0.a.d(lerp2, 553648127, 553648127);
        int dp = AndroidUtilities.dp(25.0f);
        int dp2 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f20367k;
        zVar.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + dp, dp2);
        if (this.f20366j != d11) {
            this.f20366j = d11;
            j6.B1(zVar, d11, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f21 = f17 * f12;
        int i12 = (int) f21;
        paint3.setAlpha(i12);
        canvas2.drawPath(this.f20380y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f21));
        canvas2.drawPath(this.f20381z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f20373q;
        if (bitmap != null) {
            int dp3 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f22 = dp3;
            float f23 = f22 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f23), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f22), (int) (rectF.centerY() + f23));
            Paint paint4 = this.f20365i;
            paint4.setAlpha(i12);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            i11 = AndroidUtilities.dp(4.0f) + dp3;
        } else {
            Drawable drawable = this.f20374r;
            if (drawable != null) {
                float dp4 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp4 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f24 = (dp4 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f24), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f24));
                if (d10 != this.f20375s) {
                    this.f20375s = d10;
                    drawable.setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i12);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                i11 = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        k01 k01Var = this.f20377u;
        if (k01Var != null) {
            k01Var.f26094p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f16);
            k01Var.c(rectF.left + AndroidUtilities.dp(60.0f) + i11, rectF.centerY(), org.telegram.messenger.y3.y(1.0f, this.v, f11, f12), d10, canvas2);
        }
        float width = rectF.width() - AndroidUtilities.dp(100.0f);
        k01 k01Var2 = this.f20376t;
        k01Var2.f26094p = (int) (width - f14);
        float dp5 = i11 + rectF.left + AndroidUtilities.dp(60.0f);
        float centerY = rectF.centerY();
        if (this.f20377u == null) {
            f15 = 1.0f;
        } else {
            f15 = this.v;
        }
        k01Var2.c(dp5, centerY, f15 * f11 * f12, d10, canvas);
    }

    public final float b() {
        float min;
        boolean z4;
        float c3 = c();
        if (c3 < 0.0f) {
            min = c3 + 1.0f;
        } else if (c3 >= 0.0f && c3 < 1.0f) {
            min = AndroidUtilities.lerp(1.0f, 0.87f, c3);
        } else {
            min = (1.0f - Math.min(1.0f, c3 - 1.0f)) * 0.87f;
        }
        if (this.f20362c >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return this.e.e(z4) * min;
    }

    public final float c() {
        if (this.f20362c < 0) {
            return this.f20361b;
        }
        return this.d.d(this.f20361b, false);
    }
}
