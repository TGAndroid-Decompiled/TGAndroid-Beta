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
public final class i10 {
    public int f26925a;
    public final Object f26926b;
    public final Object f26927c;
    public final Object d;
    public final Object f26928e;
    public final Object f26929f;
    public Object f26930g;
    public Object h;

    public i10(org.telegram.ui.Cells.t1 t1Var) {
        this.f26927c = new Path();
        this.d = new Rect();
        this.f26929f = new RectF();
        this.f26926b = t1Var;
        this.f26928e = new zc(t1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z10) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f26927c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f26930g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f26930g).draw(canvas);
        }
        if (z10) {
            h90 h90Var = (h90) this.h;
            if (h90Var == null) {
                h90 h90Var2 = new h90();
                this.h = h90Var2;
                h90Var2.C = true;
            } else if (h90Var.b() || ((h90) this.h).c()) {
                h90 h90Var3 = (h90) this.h;
                h90Var3.f26673b = -1L;
                h90Var3.f26674c = -1L;
            }
        } else {
            h90 h90Var4 = (h90) this.h;
            if (h90Var4 != null && !h90Var4.c() && !((h90) this.h).b()) {
                ((h90) this.h).a();
            }
        }
        canvas.restore();
        h90 h90Var5 = (h90) this.h;
        if (h90Var5 != null && !h90Var5.b()) {
            h90 h90Var6 = (h90) this.h;
            h90Var6.f26692x = path;
            h90Var6.f(org.telegram.ui.ActionBar.j6.l1(0.7f, this.f26925a), org.telegram.ui.ActionBar.j6.l1(1.3f, this.f26925a), org.telegram.ui.ActionBar.j6.l1(1.5f, this.f26925a), org.telegram.ui.ActionBar.j6.l1(2.0f, this.f26925a));
            ((h90) this.h).setBounds(rect);
            canvas.save();
            ((h90) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.t1) this.f26926b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z10) {
        float e7;
        float f7;
        float dp;
        RectF rectF = (RectF) this.f26929f;
        int textSize = (((int) org.telegram.ui.ActionBar.j6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f10 = -AndroidUtilities.dp(a4.a.e(min, 9.0f, 2.66f, 4.0f));
        float f11 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(e7);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(e7);
        Path path = (Path) this.f26927c;
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
        if (this.f26925a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f26930g;
            if (zVar == null) {
                this.f26930g = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.j6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f26930g).setCallback((org.telegram.ui.Cells.t1) this.f26926b);
            this.f26925a = i10;
        }
    }

    public void d(boolean z10) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((zc) this.f26928e).c(z10);
        if (z10 && (zVar = (org.telegram.ui.Cells.z) this.f26930g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f26930g;
        if (zVar2 != null) {
            zVar2.setState(z10 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.t1) this.f26926b).invalidate();
    }

    public i10() {
        Paint paint = new Paint();
        this.f26926b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f26927c = new hc0(tileMode);
        this.d = new hc0(tileMode);
        this.f26928e = new hc0(Shader.TileMode.REPEAT);
        this.f26929f = new Object();
        this.f26930g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
