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
public final class t00 {
    public int f32584a;
    public final Object f32585b;
    public final Object f32586c;
    public final Object d;
    public final Object f32587e;
    public final Object f32588f;
    public Object f32589g;
    public Object h;

    public t00(org.telegram.ui.Cells.t1 t1Var) {
        this.f32586c = new Path();
        this.d = new Rect();
        this.f32588f = new RectF();
        this.f32585b = t1Var;
        this.f32587e = new pc(t1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f32586c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32589g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f32589g).draw(canvas);
        }
        if (z10) {
            p80 p80Var = (p80) this.h;
            if (p80Var == null) {
                p80 p80Var2 = new p80();
                this.h = p80Var2;
                p80Var2.C = true;
            } else if (p80Var.b() || ((p80) this.h).c()) {
                p80 p80Var3 = (p80) this.h;
                p80Var3.f31572b = -1L;
                p80Var3.f31573c = -1L;
            }
        } else {
            p80 p80Var4 = (p80) this.h;
            if (p80Var4 != null && !p80Var4.c() && !((p80) this.h).b()) {
                ((p80) this.h).a();
            }
        }
        canvas.restore();
        p80 p80Var5 = (p80) this.h;
        if (p80Var5 != null && !p80Var5.b()) {
            p80 p80Var6 = (p80) this.h;
            p80Var6.f31591x = path;
            p80Var6.f(org.telegram.ui.ActionBar.f6.l1(0.7f, this.f32584a), org.telegram.ui.ActionBar.f6.l1(1.3f, this.f32584a), org.telegram.ui.ActionBar.f6.l1(1.5f, this.f32584a), org.telegram.ui.ActionBar.f6.l1(2.0f, this.f32584a));
            ((p80) this.h).setBounds(rect);
            canvas.save();
            ((p80) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.t1) this.f32585b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float b10;
        float f10;
        float dp;
        RectF rectF = (RectF) this.f32588f;
        int textSize = (((int) org.telegram.ui.ActionBar.f6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f11 = -AndroidUtilities.dp(org.telegram.ui.Cells.j2.b(min, 9.0f, 2.66f, 4.0f));
        float f12 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(b10);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(b10);
        Path path = (Path) this.f32586c;
        path.rewind();
        if (!z10) {
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
                float z11 = e2.c.z(dp2, f12, 0.45f, f12);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f10 - dp, f12, f10, f12 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f15 = lineWidth2 - (dp2 - z11);
                rectF.set(f15, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f15, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = e2.c.z(dp2, f12, 0.55f, f12);
                float f16 = z12 - f12;
                rectF.set(f10 - f16, f12, f10, z12);
                path.arcTo(rectF, 270.0f, 90.0f);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(lineWidth - f16, f12, lineWidth, z12);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, z12, lineWidth2 + dp4, dp4 + z12);
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

    public void c(int i9) {
        if (this.f32584a != i9) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f32589g;
            if (zVar == null) {
                this.f32589g = org.telegram.ui.ActionBar.f6.f0(i9, 2, -1);
            } else {
                org.telegram.ui.ActionBar.f6.B1(zVar, i9, true);
            }
            ((org.telegram.ui.Cells.z) this.f32589g).setCallback((org.telegram.ui.Cells.t1) this.f32585b);
            this.f32584a = i9;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((pc) this.f32587e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f32589g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f32589g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.t1) this.f32585b).invalidate();
    }

    public t00() {
        Paint paint = new Paint();
        this.f32585b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f32586c = new nb0(tileMode);
        this.d = new nb0(tileMode);
        this.f32587e = new nb0(Shader.TileMode.REPEAT);
        this.f32588f = new Object();
        this.f32589g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
