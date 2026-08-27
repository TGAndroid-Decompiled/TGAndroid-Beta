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

public final class w00 {

    public int f34081a;

    public final Object f34082b;

    public final Object f34083c;
    public final Object d;

    public final Object f34084e;

    public final Object f34085f;

    public Object f34086g;
    public Object h;

    public w00(org.telegram.ui.Cells.s1 s1Var) {
        this.f34083c = new Path();
        this.d = new Rect();
        this.f34085f = new RectF();
        this.f34082b = s1Var;
        this.f34084e = new nc(s1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f34083c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f34086g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f34086g).draw(canvas);
        }
        if (z10) {
            t80 t80Var = (t80) this.h;
            if (t80Var == null) {
                t80 t80Var2 = new t80();
                this.h = t80Var2;
                t80Var2.C = true;
            } else if (t80Var.b() || ((t80) this.h).c()) {
                t80 t80Var3 = (t80) this.h;
                t80Var3.f32692b = -1L;
                t80Var3.f32693c = -1L;
            }
        } else {
            t80 t80Var4 = (t80) this.h;
            if (t80Var4 != null && !t80Var4.c() && !((t80) this.h).b()) {
                ((t80) this.h).a();
            }
        }
        canvas.restore();
        t80 t80Var5 = (t80) this.h;
        if (t80Var5 == null || t80Var5.b()) {
            return;
        }
        t80 t80Var6 = (t80) this.h;
        t80Var6.f32711x = path;
        t80Var6.f(org.telegram.ui.ActionBar.g6.l1(0.7f, this.f34081a), org.telegram.ui.ActionBar.g6.l1(1.3f, this.f34081a), org.telegram.ui.ActionBar.g6.l1(1.5f, this.f34081a), org.telegram.ui.ActionBar.g6.l1(2.0f, this.f34081a));
        ((t80) this.h).setBounds(rect);
        canvas.save();
        ((t80) this.h).draw(canvas);
        canvas.restore();
        ((org.telegram.ui.Cells.s1) this.f34082b).invalidate();
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float fDp;
        RectF rectF = (RectF) this.f34085f;
        int textSize = (((int) org.telegram.ui.ActionBar.g6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float fMax = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float fMin = Math.min(9, SharedConfig.bubbleRadius);
        float fMin2 = Math.min(3, SharedConfig.bubbleRadius);
        float fC = s3.c.c(fMin, 9.0f, 2.66f, 4.0f);
        float f10 = -AndroidUtilities.dp(fC);
        float f11 = -AndroidUtilities.dp(3.0f);
        float fDp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(fC);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(fC);
        Path path = (Path) this.f34083c;
        path.rewind();
        if (!z10) {
            fMax = SharedConfig.bubbleRadius / 2.0f;
        }
        float fDp3 = AndroidUtilities.dp(fMax) * 2;
        rectF.set(f10, f11, f10 + fDp3, fDp3 + f11);
        path.arcTo(rectF, 180.0f, 90.0f);
        float f12 = lineWidth - lineWidth2;
        float f13 = fMin2 + fMin;
        float fMax2 = Math.abs(f12) < ((float) AndroidUtilities.dp(f13)) ? Math.max(lineWidth, lineWidth2) : lineWidth;
        if (Math.abs(f12) > AndroidUtilities.dp(f13)) {
            float fDp4 = AndroidUtilities.dp(fMin2) * 2;
            if (lineWidth < lineWidth2) {
                float fZ = com.google.android.recaptcha.internal.a.z(fDp2, f11, 0.45f, f11);
                fDp = AndroidUtilities.dp(fMin) * 2;
                rectF.set(fMax2 - fDp, f11, fMax2, f11 + fDp);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(lineWidth, fZ - fDp4, fDp4 + lineWidth, fZ);
                path.arcTo(rectF, 180.0f, -90.0f);
                float f14 = lineWidth2 - (fDp2 - fZ);
                rectF.set(f14, fZ, lineWidth2, fDp2);
                path.arcTo(rectF, 270.0f, 90.0f);
                rectF.set(f14, fZ, lineWidth2, fDp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            } else {
                float fZ2 = com.google.android.recaptcha.internal.a.z(fDp2, f11, 0.55f, f11);
                float f15 = fZ2 - f11;
                rectF.set(fMax2 - f15, f11, fMax2, fZ2);
                path.arcTo(rectF, 270.0f, 90.0f);
                fDp = AndroidUtilities.dp(fMin) * 2;
                rectF.set(lineWidth - f15, f11, lineWidth, fZ2);
                path.arcTo(rectF, 0.0f, 90.0f);
                rectF.set(lineWidth2, fZ2, lineWidth2 + fDp4, fDp4 + fZ2);
                path.arcTo(rectF, 270.0f, -90.0f);
                rectF.set(lineWidth2 - fDp, fDp2 - fDp, lineWidth2, fDp2);
                path.arcTo(rectF, 0.0f, 90.0f);
            }
        } else {
            fDp = AndroidUtilities.dp(fMin) * 2;
            float f16 = fMax2 - fDp;
            rectF.set(f16, f11, fMax2, f11 + fDp);
            path.arcTo(rectF, 270.0f, 90.0f);
            rectF.set(f16, fDp2 - fDp, fMax2, fDp2);
            path.arcTo(rectF, 0.0f, 90.0f);
        }
        rectF.set(f10, fDp2 - fDp, fDp + f10, fDp2);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.close();
        ((Rect) this.d).set((int) f10, (int) f11, (int) Math.max(lineWidth, lineWidth2), (int) fDp2);
    }

    public void c(int i10) {
        if (this.f34081a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f34086g;
            if (zVar == null) {
                this.f34086g = org.telegram.ui.ActionBar.g6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.g6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f34086g).setCallback((org.telegram.ui.Cells.s1) this.f34082b);
            this.f34081a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        ((nc) this.f34084e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f34086g) != null) {
            zVar.setHotspot(fCenterX, fCenterY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f34086g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.s1) this.f34082b).invalidate();
    }

    public w00() {
        Paint paint = new Paint();
        this.f34082b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f34083c = new rb0(tileMode);
        this.d = new rb0(tileMode);
        this.f34084e = new rb0(Shader.TileMode.REPEAT);
        this.f34085f = new ts();
        this.f34086g = new ts();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
