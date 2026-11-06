package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class ol0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int f48443a;
    public final org.telegram.ui.ActionBar.f6 f48444b;
    public float f48445c;
    public boolean d;
    public int f48446e;
    public int f48447f;
    public final org.telegram.ui.Components.z4 h;
    public final org.telegram.ui.Components.z4 f48448n;
    public int f48449r;
    public int f48450s;
    public int f48451w;
    public int f48452x;
    public RadialGradient f48453y;

    public ol0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48445c = 0.0f;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.f48448n = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.D = new Paint(1);
        this.f48444b = f6Var;
        this.f48443a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, f6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 >= 0 && i7 >= 0 && (gpVar = org.telegram.messenger.qp.s1(i7).f24869r4) != null) {
            fpVar = gpVar.d(i10);
        }
        c(fpVar, z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48444b;
        if (fpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, f6Var);
            this.f48447f = w02;
            this.f48446e = w02;
        } else {
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.f48446e = fpVar.c(q10);
            this.f48447f = fpVar.d(q10);
        }
        if (!z9) {
            this.h.a(this.f48446e, true);
            this.f48448n.a(this.f48447f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z9 = this.d;
        org.telegram.ui.Components.z4 z4Var = this.f48448n;
        org.telegram.ui.Components.z4 z4Var2 = this.h;
        if (z9 && (this.f48446e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f48444b)) || this.f48447f != w02)) {
            this.f48447f = w02;
            this.f48446e = w02;
            z4Var2.a(w02, true);
            z4Var.a(w02, true);
        }
        int a10 = z4Var2.a(this.f48446e, false);
        int a11 = z4Var.a(this.f48447f, false);
        RadialGradient radialGradient = this.f48453y;
        Paint paint = this.D;
        if (radialGradient == null || this.f48449r != a10 || this.f48450s != a11 || this.f48451w != getWidth() || this.f48452x != getHeight()) {
            this.f48451w = getWidth();
            this.f48452x = getHeight();
            float f10 = this.f48451w;
            float f11 = f10 / 2.0f;
            float f12 = this.f48452x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f22509a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f48450s = a11;
            this.f48449r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f48453y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f48445c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f48443a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i7 = 255;
        } else {
            i7 = (int) (this.f48445c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.k6.f28185v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48444b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f48445c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f48445c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, this.f48444b), i0.a.f(0.75f, this.h.f40863c, this.f48448n.f40863c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.k6.f28128s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48444b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28185v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        }
        org.telegram.ui.Components.z4 z4Var = this.h;
        int i10 = z4Var.f40863c;
        org.telegram.ui.Components.z4 z4Var2 = this.f48448n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, z4Var2.f40863c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28183v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, z4Var.f40863c, z4Var2.f40863c));
        }
        return i0.a.f(this.f48445c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.F) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.f22531m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f48445c - f10) > 0.001f) {
            this.f48445c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
