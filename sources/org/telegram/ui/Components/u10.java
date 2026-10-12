package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.StaticLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class u10 {
    public int f29562a;
    public final Object f29563b;
    public final Object f29564c;
    public final Object d;
    public final Object e;
    public final Object f29565f;
    public Object f29566g;
    public Object h;

    public u10(org.telegram.ui.Cells.u1 u1Var) {
        this.f29564c = new Path();
        this.d = new Rect();
        this.f29565f = new RectF();
        this.f29563b = u1Var;
        this.e = new ad(u1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f29564c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29566g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f29566g).draw(canvas);
        }
        if (z10) {
            ha0 ha0Var = (ha0) this.h;
            if (ha0Var == null) {
                ha0 ha0Var2 = new ha0();
                this.h = ha0Var2;
                ha0Var2.D = true;
            } else if (ha0Var.c() || ((ha0) this.h).d()) {
                ha0 ha0Var3 = (ha0) this.h;
                ha0Var3.f25606b = -1L;
                ha0Var3.f25607c = -1L;
            }
        } else {
            ha0 ha0Var4 = (ha0) this.h;
            if (ha0Var4 != null && !ha0Var4.d() && !((ha0) this.h).c()) {
                ((ha0) this.h).a();
            }
        }
        canvas.restore();
        ha0 ha0Var5 = (ha0) this.h;
        if (ha0Var5 != null && !ha0Var5.c()) {
            ha0 ha0Var6 = (ha0) this.h;
            ha0Var6.f25625y = path;
            ha0Var6.g(org.telegram.ui.ActionBar.g6.m1(0.7f, this.f29562a), org.telegram.ui.ActionBar.g6.m1(1.3f, this.f29562a), org.telegram.ui.ActionBar.g6.m1(1.5f, this.f29562a), org.telegram.ui.ActionBar.g6.m1(2.0f, this.f29562a));
            ((ha0) this.h).setBounds(rect);
            canvas.save();
            ((ha0) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.u1) this.f29563b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float d;
        float f7;
        float dp;
        RectF rectF = (RectF) this.f29565f;
        int textSize = (((int) org.telegram.ui.ActionBar.g6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(a1.g.d(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(d);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(d);
        Path path = (Path) this.f29564c;
        path.rewind();
        if (!z10) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f10, f11, f10 + dp3, dp3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float f13 = min2 + min;
        if (Math.abs(f12) < AndroidUtilities.dp(f13)) {
            f7 = Math.max(lineWidth, lineWidth2);
        } else {
            f7 = lineWidth;
        }
        if (Math.abs(f12) > AndroidUtilities.dp(f13)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float y3 = com.google.android.gms.internal.play_billing.k3.y(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f7 - dp, f11, f7, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, y3 - dp4, dp4 + lineWidth, y3);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (dp2 - y3);
                rectF.set(f14, y3, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, y3, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float y10 = com.google.android.gms.internal.play_billing.k3.y(dp2, f11, 0.55f, f11);
                float f15 = y10 - f11;
                rectF.set(f7 - f15, f11, f7, y10);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f15, f11, lineWidth, y10);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, y10, lineWidth2 + dp4, dp4 + y10);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f16 = f7 - dp;
            rectF.set(f16, f11, f7, f11 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f16, dp2 - dp, f7, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, dp2 - dp, dp + f10, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.f29562a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f29566g;
            if (zVar == null) {
                this.f29566g = org.telegram.ui.ActionBar.g6.g0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.g6.C1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f29566g).setCallback((org.telegram.ui.Cells.u1) this.f29563b);
            this.f29562a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((ad) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f29566g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f29566g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.u1) this.f29563b).invalidate();
    }

    public u10() {
        Paint paint = new Paint();
        this.f29563b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f29564c = new gd0(tileMode);
        this.d = new gd0(tileMode);
        this.e = new gd0(Shader.TileMode.REPEAT);
        this.f29565f = new Object();
        this.f29566g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
