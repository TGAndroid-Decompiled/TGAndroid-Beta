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
    public int f25808a;
    public final Object f25809b;
    public final Object f25810c;
    public final Object d;
    public final Object e;
    public final Object f25811f;
    public Object f25812g;
    public Object h;

    public j10(org.telegram.ui.Cells.s1 s1Var) {
        this.f25810c = new Path();
        this.d = new Rect();
        this.f25811f = new RectF();
        this.f25809b = s1Var;
        this.e = new rc(s1Var, 0.8f, 1.4f);
    }

    public void a(Canvas canvas, boolean z4) {
        Rect rect = (Rect) this.d;
        canvas.save();
        Path path = (Path) this.f25810c;
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f25812g;
        if (zVar != null) {
            zVar.setBounds(rect);
            ((org.telegram.ui.Cells.z) this.f25812g).draw(canvas);
        }
        if (z4) {
            j90 j90Var = (j90) this.h;
            if (j90Var == null) {
                j90 j90Var2 = new j90();
                this.h = j90Var2;
                j90Var2.C = true;
            } else if (j90Var.b() || ((j90) this.h).c()) {
                j90 j90Var3 = (j90) this.h;
                j90Var3.f25905b = -1L;
                j90Var3.f25906c = -1L;
            }
        } else {
            j90 j90Var4 = (j90) this.h;
            if (j90Var4 != null && !j90Var4.c() && !((j90) this.h).b()) {
                ((j90) this.h).a();
            }
        }
        canvas.restore();
        j90 j90Var5 = (j90) this.h;
        if (j90Var5 != null && !j90Var5.b()) {
            j90 j90Var6 = (j90) this.h;
            j90Var6.f25923x = path;
            j90Var6.f(org.telegram.ui.ActionBar.j6.l1(0.7f, this.f25808a), org.telegram.ui.ActionBar.j6.l1(1.3f, this.f25808a), org.telegram.ui.ActionBar.j6.l1(1.5f, this.f25808a), org.telegram.ui.ActionBar.j6.l1(2.0f, this.f25808a));
            ((j90) this.h).setBounds(rect);
            canvas.save();
            ((j90) this.h).draw(canvas);
            canvas.restore();
            ((org.telegram.ui.Cells.s1) this.f25809b).invalidate();
        }
    }

    public void b(StaticLayout[] staticLayoutArr, boolean z4) {
        float c3;
        float f10;
        float dp;
        RectF rectF = (RectF) this.f25811f;
        int textSize = (((int) org.telegram.ui.ActionBar.j6.X2.getTextSize()) * 2) + AndroidUtilities.dp(4.0f);
        float max = Math.max(0, Math.min(6, SharedConfig.bubbleRadius) - 1);
        float min = Math.min(9, SharedConfig.bubbleRadius);
        float min2 = Math.min(3, SharedConfig.bubbleRadius);
        float f11 = -AndroidUtilities.dp(vh.w2.c(min, 9.0f, 2.66f, 4.0f));
        float f12 = -AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(5.0f) + textSize;
        float lineWidth = staticLayoutArr[0].getLineWidth(0) + AndroidUtilities.dp(c3);
        float lineWidth2 = staticLayoutArr[1].getLineWidth(0) + AndroidUtilities.dp(c3);
        Path path = (Path) this.f25810c;
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
        if (this.f25808a != i10) {
            org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.f25812g;
            if (zVar == null) {
                this.f25812g = org.telegram.ui.ActionBar.j6.f0(i10, 2, -1);
            } else {
                org.telegram.ui.ActionBar.j6.B1(zVar, i10, true);
            }
            ((org.telegram.ui.Cells.z) this.f25812g).setCallback((org.telegram.ui.Cells.s1) this.f25809b);
            this.f25808a = i10;
        }
    }

    public void d(boolean z4) {
        org.telegram.ui.Cells.z zVar;
        Rect rect = (Rect) this.d;
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        ((rc) this.e).c(z4);
        if (z4 && (zVar = (org.telegram.ui.Cells.z) this.f25812g) != null) {
            zVar.setHotspot(centerX, centerY);
        }
        org.telegram.ui.Cells.z zVar2 = (org.telegram.ui.Cells.z) this.f25812g;
        if (zVar2 != null) {
            zVar2.setState(z4 ? new int[]{16842910, 16842919} : new int[0]);
        }
        ((org.telegram.ui.Cells.s1) this.f25809b).invalidate();
    }

    public j10() {
        Paint paint = new Paint();
        this.f25809b = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f25810c = new ic0(tileMode);
        this.d = new ic0(tileMode);
        this.e = new ic0(Shader.TileMode.REPEAT);
        this.f25811f = new Object();
        this.f25812g = new Object();
        this.h = new float[4];
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
