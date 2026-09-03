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
public final class j10 {
    public int f27956a;
    public final Object f27957b;
    public final Object f27958c;
    public final Object d;
    public final Object f27959e;
    public final Object f27960f;
    public Object f27961g;
    public Object h;

    public j10(org.telegram.ui.Cells.t1 t1Var) {
        this.f27958c = new Path();
        this.d = new Rect();
        this.f27960f = new RectF();
        this.f27957b = t1Var;
        this.f27959e = new rc(t1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z4) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f27958c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f27961g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f27961g).draw(canvas);
        }
        if (z4) {
            k90 k90Var = (k90) this.h;
            if (k90Var == null) {
                k90 k90Var2 = new k90();
                this.h = k90Var2;
                k90Var2.C = true;
            } else if (k90Var.b() || ((k90) this.h).c()) {
                k90 k90Var3 = (k90) this.h;
                k90Var3.f28351b = -1L;
                k90Var3.f28352c = -1L;
            }
        } else {
            k90 k90Var4 = (k90) this.h;
            if (k90Var4 != null && !k90Var4.c() && !((k90) this.h).b()) {
                ((k90) this.h).a();
            }
        }
        canvas.restore();
        k90 k90Var5 = (k90) this.h;
        if (k90Var5 != null && !k90Var5.b()) {
            k90 k90Var6 = (k90) this.h;
            k90Var6.f28370x = path;
            k90Var6.f(org.telegram.ui.ActionBar.k6.l1(0.7f, this.f27956a), org.telegram.ui.ActionBar.k6.l1(1.3f, this.f27956a), org.telegram.ui.ActionBar.k6.l1(1.5f, this.f27956a), org.telegram.ui.ActionBar.k6.l1(2.0f, this.f27956a));
            ((k90) this.h).setBounds(rect);
            canvas.save();
            ((k90) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.t1) this.f27957b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z4) {
        float c3;
        float f10;
        float dp;
        RectF rectF = (RectF) this.f27960f;
        int textSize = (((int) org.telegram.ui.ActionBar.k6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f11 = -AndroidUtilities.dp(w.c.c(min, 9.0f, 2.66f, 4.0f));
        float f12 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(c3);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(c3);
        Path path = (Path) this.f27958c;
        path.rewind();
        if (!z4) {
            max = SharedConfig.bubbleRadius / 2.0f;
        }
        float dp3 = AndroidUtilities.dp(max) * 2;
        rectF.set(f11, f12, f11 + dp3, dp3 + f12);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f13 = lineWidth - lineWidth2;
        float f14 = min2 + min;
        if (Math.abs(f13) < AndroidUtilities.dp(f14)) {
            f10 = Math.max(lineWidth, lineWidth2);
        } else {
            f10 = lineWidth;
        }
        if (Math.abs(f13) > AndroidUtilities.dp(f14)) {
            float dp4 = AndroidUtilities.dp(min2) * 2;
            if (lineWidth < lineWidth2) {
                float w10 = e2.c.w(dp2, f12, 0.45f, f12);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f10 - dp, f12, f10, f12 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, w10 - dp4, dp4 + lineWidth, w10);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f15 = lineWidth2 - (dp2 - w10);
                rectF.set(f15, w10, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f15, w10, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float w11 = e2.c.w(dp2, f12, 0.55f, f12);
                float f16 = w11 - f12;
                rectF.set(f10 - f16, f12, f10, w11);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f16, f12, lineWidth, w11);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, w11, lineWidth2 + dp4, dp4 + w11);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - dp, dp2 - dp, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            dp = AndroidUtilities.dp(min) * 2;
            float f17 = f10 - dp;
            rectF.set(f17, f12, f10, f12 + dp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f17, dp2 - dp, f10, dp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f11, dp2 - dp, dp + f11, dp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f11, (int) f12, (int) Math.max(lineWidth, lineWidth2), (int) dp2);
    }

    public void c(int i10) {
        if (this.f27956a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f27961g;
            if (zVar == null) {
                this.f27961g = org.telegram.ui.ActionBar.k6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.k6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f27961g).setCallback((org.telegram.ui.Cells.t1) this.f27957b);
            this.f27956a = i10;
        }
    }

    public void d(boolean z4) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((rc) this.f27959e).c(z4);
        if (z4 && (zVar = (org.telegram.ui.Cells.z) this.f27961g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f27961g;
        if (zVar2 != null) {
            zVar2.setState(z4 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.t1) this.f27957b).invalidate();
    }

    public j10() {
        Paint paint = new Paint();
        this.f27957b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f27958c = new jc0(tileMode);
        this.d = new jc0(tileMode);
        this.f27959e = new jc0(Shader.TileMode.REPEAT);
        this.f27960f = new Object();
        this.f27961g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
