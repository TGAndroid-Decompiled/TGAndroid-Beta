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
public final class e10 {
    public int f27904a;
    public final Object f27905b;
    public final Object f27906c;
    public final Object d;
    public final Object f27907e;
    public final Object f27908f;
    public Object f27909g;
    public Object h;

    public e10(org.telegram.ui.Cells.s1 s1Var) {
        this.f27906c = new Path();
        this.d = new Rect();
        this.f27908f = new RectF();
        this.f27905b = s1Var;
        this.f27907e = new uc(s1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f27906c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f27909g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f27909g).draw(canvas);
        }
        if (z10) {
            c90 c90Var = (c90) this.h;
            if (c90Var == null) {
                c90 c90Var2 = new c90();
                this.h = c90Var2;
                c90Var2.C = true;
            } else if (c90Var.b() || ((c90) this.h).c()) {
                c90 c90Var3 = (c90) this.h;
                c90Var3.f27381b = -1L;
                c90Var3.f27382c = -1L;
            }
        } else {
            c90 c90Var4 = (c90) this.h;
            if (c90Var4 != null && !c90Var4.c() && !((c90) this.h).b()) {
                ((c90) this.h).a();
            }
        }
        canvas.restore();
        c90 c90Var5 = (c90) this.h;
        if (c90Var5 != null && !c90Var5.b()) {
            c90 c90Var6 = (c90) this.h;
            c90Var6.f27400x = path;
            c90Var6.f(org.telegram.ui.ActionBar.g6.l1(0.7f, this.f27904a), org.telegram.ui.ActionBar.g6.l1(1.3f, this.f27904a), org.telegram.ui.ActionBar.g6.l1(1.5f, this.f27904a), org.telegram.ui.ActionBar.g6.l1(2.0f, this.f27904a));
            ((c90) this.h).setBounds(rect);
            canvas.save();
            ((c90) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.s1) this.f27905b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float c3;
        float f9;
        float dp;
        RectF rectF = (RectF) this.f27908f;
        int textSize = (((int) org.telegram.ui.ActionBar.g6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(u3.c.c(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(c3);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(c3);
        Path path = (Path) this.f27906c;
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
            f9 = Math.max(lineWidth, lineWidth2);
        } else {
            f9 = lineWidth;
        }
        if (Math.abs(f12) > AndroidUtilities.dp(f13)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float z11 = com.google.android.recaptcha.internal.a.z(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f9 - dp, f11, f9, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (dp2 - z11);
                rectF.set(f14, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = com.google.android.recaptcha.internal.a.z(dp2, f11, 0.55f, f11);
                float f15 = z12 - f11;
                rectF.set(f9 - f15, f11, f9, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f15, f11, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + dp4, dp4 + z12);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f16 = f9 - dp;
            rectF.set(f16, f11, f9, f11 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f16, dp2 - dp, f9, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, dp2 - dp, dp + f10, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.f27904a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f27909g;
            if (zVar == null) {
                this.f27909g = org.telegram.ui.ActionBar.g6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.g6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f27909g).setCallback((org.telegram.ui.Cells.s1) this.f27905b);
            this.f27904a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((uc) this.f27907e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f27909g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f27909g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.s1) this.f27905b).invalidate();
    }

    public e10() {
        Paint paint = new Paint();
        this.f27905b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27906c = new cc0(tileMode);
        this.d = new cc0(tileMode);
        this.f27907e = new cc0(Shader.TileMode.REPEAT);
        this.f27908f = new Object();
        this.f27909g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
