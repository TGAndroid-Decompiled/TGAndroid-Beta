package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class ql0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int f50636a;
    public final org.telegram.ui.ActionBar.e6 f50637b;
    public float f50638c;
    public boolean d;
    public int f50639e;
    public int f50640f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 f50641n;
    public int f50642r;
    public int f50643s;
    public int f50644w;
    public int f50645x;
    public RadialGradient f50646y;

    public ql0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50638c = 0.0f;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.h = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.f50641n = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.E = new Paint(1);
        this.f50637b = e6Var;
        this.f50636a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp cpVar = null;
        if (i10 >= 0 && i7 >= 0 && (dpVar = org.telegram.messenger.np.s1(i7).f25393s4) != null) {
            cpVar = dpVar.d(i10);
        }
        c(cpVar, z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50637b;
        if (cpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e6Var);
            this.f50640f = w02;
            this.f50639e = w02;
        } else {
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.f50639e = cpVar.c(q10);
            this.f50640f = cpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f50639e, true);
            this.f50641n.a(this.f50640f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.x4 x4Var = this.f50641n;
        org.telegram.ui.Components.x4 x4Var2 = this.h;
        if (z10 && (this.f50639e != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.f50637b)) || this.f50640f != w02)) {
            this.f50640f = w02;
            this.f50639e = w02;
            x4Var2.a(w02, true);
            x4Var.a(w02, true);
        }
        int a10 = x4Var2.a(this.f50639e, false);
        int a11 = x4Var.a(this.f50640f, false);
        RadialGradient radialGradient = this.f50646y;
        Paint paint = this.E;
        if (radialGradient == null || this.f50642r != a10 || this.f50643s != a11 || this.f50644w != getWidth() || this.f50645x != getHeight()) {
            this.f50644w = getWidth();
            this.f50645x = getHeight();
            float f10 = this.f50644w;
            float f11 = f10 / 2.0f;
            float f12 = this.f50645x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f23583a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f50643s = a11;
            this.f50642r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f50646y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f50638c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f50636a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f50638c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.j6.f29186v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50637b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f50638c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f50638c, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.f50637b), i0.a.f(0.75f, this.h.f41560c, this.f50641n.f41560c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.j6.f29129s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50637b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        }
        org.telegram.ui.Components.x4 x4Var = this.h;
        int i10 = x4Var.f41560c;
        org.telegram.ui.Components.x4 x4Var2 = this.f50641n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, x4Var2.f41560c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.f(0.75f, x4Var.f41560c, x4Var2.f41560c));
        }
        return i0.a.f(this.f50638c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.i20.B(230.0f, org.telegram.messenger.g0.f23605m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f50638c - f10) > 0.001f) {
            this.f50638c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
