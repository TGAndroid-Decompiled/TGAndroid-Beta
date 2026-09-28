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
public final class k10 {
    public int f25563a;
    public final Object f25564b;
    public final Object f25565c;
    public final Object d;
    public final Object e;
    public final Object f25566f;
    public Object f25567g;
    public Object h;

    public k10(org.telegram.ui.Cells.u1 u1Var) {
        this.f25565c = new Path();
        this.d = new Rect();
        this.f25566f = new RectF();
        this.f25564b = u1Var;
        this.e = new yc(u1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f25565c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f25567g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f25567g).draw(canvas);
        }
        if (z10) {
            t90 t90Var = (t90) this.h;
            if (t90Var == null) {
                t90 t90Var2 = new t90();
                this.h = t90Var2;
                t90Var2.C = true;
            } else if (t90Var.b() || ((t90) this.h).c()) {
                t90 t90Var3 = (t90) this.h;
                t90Var3.f28502b = -1L;
                t90Var3.f28503c = -1L;
            }
        } else {
            t90 t90Var4 = (t90) this.h;
            if (t90Var4 != null && !t90Var4.c() && !((t90) this.h).b()) {
                ((t90) this.h).a();
            }
        }
        canvas.restore();
        t90 t90Var5 = (t90) this.h;
        if (t90Var5 != null && !t90Var5.b()) {
            t90 t90Var6 = (t90) this.h;
            t90Var6.f28520x = path;
            t90Var6.f(org.telegram.ui.ActionBar.h6.l1(0.7f, this.f25563a), org.telegram.ui.ActionBar.h6.l1(1.3f, this.f25563a), org.telegram.ui.ActionBar.h6.l1(1.5f, this.f25563a), org.telegram.ui.ActionBar.h6.l1(2.0f, this.f25563a));
            ((t90) this.h).setBounds(rect);
            canvas.save();
            ((t90) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.u1) this.f25564b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float e;
        float f7;
        float dp;
        RectF rectF = (RectF) this.f25566f;
        int textSize = (((int) org.telegram.ui.ActionBar.h6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(a4.a.e(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(e);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(e);
        Path path = (Path) this.f25565c;
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
                float z11 = com.google.android.gms.internal.vision.e2.z(dp2, f11, 0.45f, f11);
                dp = AndroidUtilities.dp(min) * 2;
                rectF.set(f7 - dp, f11, f7, f11 + dp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, z11 - dp4, dp4 + lineWidth, z11);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (dp2 - z11);
                rectF.set(f14, z11, lineWidth2, dp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, z11, lineWidth2, dp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float z12 = com.google.android.gms.internal.vision.e2.z(dp2, f11, 0.55f, f11);
                float f15 = z12 - f11;
                rectF.set(f7 - f15, f11, f7, z12);
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
        if (this.f25563a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f25567g;
            if (zVar == null) {
                this.f25567g = org.telegram.ui.ActionBar.h6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.h6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f25567g).setCallback((org.telegram.ui.Cells.u1) this.f25564b);
            this.f25563a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((yc) this.e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f25567g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f25567g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.u1) this.f25564b).invalidate();
    }

    public k10() {
        Paint paint = new Paint();
        this.f25564b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25565c = new sc0(tileMode);
        this.d = new sc0(tileMode);
        this.e = new sc0(Shader.TileMode.REPEAT);
        this.f25566f = new Object();
        this.f25567g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
