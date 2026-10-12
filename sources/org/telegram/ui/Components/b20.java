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
public final class b20 {
    public int f24539a;
    public final Object f24540b;
    public final Object f24541c;
    public final Object d;
    public final Object f24542e;
    public final Object f24543f;
    public Object f24544g;
    public Object h;

    public b20(org.telegram.ui.Cells.u1 u1Var) {
        this.f24541c = new Path();
        this.d = new Rect();
        this.f24543f = new RectF();
        this.f24540b = u1Var;
        this.f24542e = new ad(u1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f24541c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f24544g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f24544g).draw(canvas);
        }
        if (z10) {
            ma0 ma0Var = (ma0) this.h;
            if (ma0Var == null) {
                ma0 ma0Var2 = new ma0();
                this.h = ma0Var2;
                ma0Var2.D = true;
            } else if (ma0Var.c() || ((ma0) this.h).d()) {
                ma0 ma0Var3 = (ma0) this.h;
                ma0Var3.f28462b = -1L;
                ma0Var3.f28463c = -1L;
            }
        } else {
            ma0 ma0Var4 = (ma0) this.h;
            if (ma0Var4 != null && !ma0Var4.d() && !((ma0) this.h).c()) {
                ((ma0) this.h).a();
            }
        }
        canvas.restore();
        ma0 ma0Var5 = (ma0) this.h;
        if (ma0Var5 != null && !ma0Var5.c()) {
            ma0 ma0Var6 = (ma0) this.h;
            ma0Var6.f28482y = path;
            ma0Var6.g(org.telegram.ui.ActionBar.h6.m1(0.7f, this.f24539a), org.telegram.ui.ActionBar.h6.m1(1.3f, this.f24539a), org.telegram.ui.ActionBar.h6.m1(1.5f, this.f24539a), org.telegram.ui.ActionBar.h6.m1(2.0f, this.f24539a));
            ((ma0) this.h).setBounds(rect);
            canvas.save();
            ((ma0) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.u1) this.f24540b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float e7;
        float f7;
        float dp;
        RectF rectF = (RectF) this.f24543f;
        int textSize = (((int) org.telegram.ui.ActionBar.h6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(a1.g.e(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(e7);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(e7);
        Path path = (Path) this.f24541c;
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
                float y3 = com.google.android.gms.internal.vision.e2.y(dp2, f11, 0.45f, f11);
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
                float y10 = com.google.android.gms.internal.vision.e2.y(dp2, f11, 0.55f, f11);
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
        if (this.f24539a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f24544g;
            if (zVar == null) {
                this.f24544g = org.telegram.ui.ActionBar.h6.g0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.h6.C1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f24544g).setCallback((org.telegram.ui.Cells.u1) this.f24540b);
            this.f24539a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((ad) this.f24542e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f24544g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f24544g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.u1) this.f24540b).invalidate();
    }

    public b20() {
        Paint paint = new Paint();
        this.f24540b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f24541c = new kd0(tileMode);
        this.d = new kd0(tileMode);
        this.f24542e = new kd0(Shader.TileMode.REPEAT);
        this.f24543f = new Object();
        this.f24544g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
