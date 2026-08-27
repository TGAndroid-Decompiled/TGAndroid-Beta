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
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public final class j3 {

    public final l3 f23528a;

    public int f23529b;

    public int f23530c;
    public final org.telegram.ui.Components.y5 d;

    public final org.telegram.ui.Components.y5 f23531e;

    public final Paint f23532f = new Paint(1);

    public final Paint f23533g = new Paint(1);
    public final Paint h;

    public final Paint f23534i;

    public int f23535j;

    public final org.telegram.ui.Cells.z f23536k;

    public int f23537l;

    public final int f23538m;

    public boolean f23539n;

    public final boolean f23540o;

    public final float f23541p;

    public final Bitmap f23542q;

    public final Drawable f23543r;

    public int f23544s;

    public final pz0 f23545t;

    public pz0 f23546u;
    public float v;

    public final float[] f23547w;

    public final Path f23548x;

    public final Path f23549y;

    public final Path f23550z;

    public j3(View view, l3 l3Var) {
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.h = paint;
        this.f23534i = new Paint(3);
        org.telegram.ui.Cells.z zVarF0 = g6.f0(822083583, 1, -1);
        this.f23536k = zVarF0;
        this.f23544s = -1;
        this.f23547w = new float[8];
        this.f23548x = new Path();
        Path path = new Path();
        this.f23549y = path;
        Path path2 = new Path();
        this.f23550z = path2;
        this.f23528a = l3Var;
        zVarF0.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        er erVar = er.h;
        this.d = new org.telegram.ui.Components.y5(view, 320L, erVar);
        this.f23531e = new org.telegram.ui.Components.y5(view, 320L, erVar);
        this.f23542q = l3Var.D;
        this.f23545t = new pz0(Emoji.replaceEmoji(l3Var.b(), m3.getTextPaint().getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
        int i10 = l3Var.f23635o;
        this.f23538m = i10;
        this.f23540o = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f;
        org.telegram.ui.m4 m4Var = l3Var.H;
        if (m4Var != null) {
            ArrayList arrayList = m4Var.Z;
            if (!arrayList.isEmpty()) {
                Object objI = i0.a.i(1, arrayList);
                if ((objI instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) objI).cached_page) == null || page.local == null)) {
                    this.f23543r = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.f23541p = l3Var.G;
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
        Canvas canvas2 = canvas;
        int iD = i0.b.d(this.v, this.f23537l, this.f23538m);
        Paint paint = this.f23532f;
        paint.setColor(iD);
        float f13 = f11 * 255.0f;
        paint.setAlpha((int) f13);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), g6.l1(f11, 268435456));
        float[] fArr = this.f23547w;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[1] = f10;
        int iDp = 0;
        fArr[0] = f10;
        float fLerp = AndroidUtilities.lerp(f10, 0.0f, this.v);
        fArr[7] = fLerp;
        fArr[6] = fLerp;
        fArr[5] = fLerp;
        fArr[4] = fLerp;
        Path path = this.f23548x;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas2.drawPath(path, paint);
        float f14 = this.f23541p;
        if (f14 > 0.0f && this.v > 0.0f && f11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            int iL1 = g6.l1(0.07f * f11 * this.v, AndroidUtilities.computePerceivedBrightness(iD) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.f23533g;
            paint2.setColor(iL1);
            float f15 = rectF.left;
            canvas.drawRect(f15, rectF.top, (rectF.width() * f14) + f15, rectF.bottom, paint2);
            canvas2 = canvas;
            canvas2.restore();
        }
        float fLerp2 = AndroidUtilities.lerp(this.f23539n ? 1.0f : 0.0f, this.f23540o ? 1.0f : 0.0f, this.v);
        int iD2 = i0.b.d(fLerp2, -16777216, -1);
        Paint paint3 = this.h;
        paint3.setColor(iD2);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas2.save();
        canvas2.translate(rectF.left, rectF.centerY());
        int iD3 = i0.b.d(fLerp2, 553648127, 553648127);
        int iDp2 = AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f));
        int i10 = -AndroidUtilities.dp(25.0f);
        int iDp3 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f);
        int iDp4 = AndroidUtilities.dp(25.0f);
        org.telegram.ui.Cells.z zVar = this.f23536k;
        zVar.setBounds(iDp2, i10, iDp3, iDp4);
        if (this.f23535j != iD3) {
            this.f23535j = iD3;
            g6.B1(zVar, iD3, false);
        }
        zVar.draw(canvas2);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
        float f16 = f13 * f12;
        int i11 = (int) f16;
        paint3.setAlpha(i11);
        canvas2.drawPath(this.f23549y, paint3);
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.v) * f16));
        canvas2.drawPath(this.f23550z, paint3);
        canvas2.restore();
        Bitmap bitmap = this.f23542q;
        if (bitmap != null) {
            int iDp5 = AndroidUtilities.dp(24.0f);
            canvas2.save();
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = iDp5;
            float f18 = f17 / 2.0f;
            rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f18), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f17), (int) (rectF.centerY() + f18));
            Paint paint4 = this.f23534i;
            paint4.setAlpha(i11);
            canvas2.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas2.restore();
            iDp = AndroidUtilities.dp(4.0f) + iDp5;
        } else {
            Drawable drawable = this.f23543r;
            if (drawable != null) {
                float fDp = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((fDp / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f19 = (fDp / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f19), (int) ((intrinsicHeight * 0.7f) + rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() + f19));
                if (iD2 != this.f23544s) {
                    this.f23544s = iD2;
                    drawable.setColorFilter(new PorterDuffColorFilter(iD2, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i11);
                drawable.setBounds(rect2);
                drawable.draw(canvas2);
                iDp = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
        }
        pz0 pz0Var = this.f23546u;
        if (pz0Var != null) {
            float f20 = iDp;
            pz0Var.f31708p = (int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f20);
            pz0Var.c(rectF.left + AndroidUtilities.dp(60.0f) + f20, rectF.centerY(), org.telegram.messenger.y1.z(1.0f, this.v, f11, f12), iD2, canvas2);
        }
        float fWidth = rectF.width() - AndroidUtilities.dp(100.0f);
        float f21 = iDp;
        pz0 pz0Var2 = this.f23545t;
        pz0Var2.f31708p = (int) (fWidth - f21);
        pz0Var2.c(f21 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), (this.f23546u == null ? 1.0f : this.v) * f11 * f12, iD2, canvas);
    }

    public final float b() {
        float fMin;
        float fC = c();
        if (fC < 0.0f) {
            fMin = fC + 1.0f;
        } else {
            fMin = (fC < 0.0f || fC >= 1.0f) ? (1.0f - Math.min(1.0f, fC - 1.0f)) * 0.87f : AndroidUtilities.lerp(1.0f, 0.87f, fC);
        }
        return this.f23531e.e(this.f23530c >= 0) * fMin;
    }

    public final float c() {
        if (this.f23530c < 0) {
            return this.f23529b;
        }
        return this.d.d(this.f23529b, false);
    }
}
