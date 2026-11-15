package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class pl0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int f50310a;
    public final org.telegram.ui.ActionBar.e6 f50311b;
    public float f50312c;
    public boolean d;
    public int f50313e;
    public int f50314f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 f50315n;
    public int f50316r;
    public int f50317s;
    public int f50318w;
    public int f50319x;
    public RadialGradient f50320y;

    public pl0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50312c = 0.0f;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.h = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.f50315n = new org.telegram.ui.Components.x4(this, 350L, erVar);
        this.E = new Paint(1);
        this.f50311b = e6Var;
        this.f50310a = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.cp cpVar = null;
        if (i10 >= 0 && i7 >= 0 && (dpVar = org.telegram.messenger.np.s1(i7).f25390s4) != null) {
            cpVar = dpVar.d(i10);
        }
        c(cpVar, z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50311b;
        if (cpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, e6Var);
            this.f50314f = w02;
            this.f50313e = w02;
        } else {
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.f50313e = cpVar.c(q10);
            this.f50314f = cpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f50313e, true);
            this.f50315n.a(this.f50314f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.x4 x4Var = this.f50315n;
        org.telegram.ui.Components.x4 x4Var2 = this.h;
        if (z10 && (this.f50313e != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.f50311b)) || this.f50314f != w02)) {
            this.f50314f = w02;
            this.f50313e = w02;
            x4Var2.a(w02, true);
            x4Var.a(w02, true);
        }
        int a10 = x4Var2.a(this.f50313e, false);
        int a11 = x4Var.a(this.f50314f, false);
        RadialGradient radialGradient = this.f50320y;
        Paint paint = this.E;
        if (radialGradient == null || this.f50316r != a10 || this.f50317s != a11 || this.f50318w != getWidth() || this.f50319x != getHeight()) {
            this.f50318w = getWidth();
            this.f50319x = getHeight();
            float f10 = this.f50318w;
            float f11 = f10 / 2.0f;
            float f12 = this.f50319x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f23581a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f50317s = a11;
            this.f50316r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f50320y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f50312c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f50310a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f50312c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.j6.f29186v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50311b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f50312c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f50312c, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.f50311b), i0.a.f(0.75f, this.h.f41557c, this.f50315n.f41557c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.j6.f29129s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f50311b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        }
        org.telegram.ui.Components.x4 x4Var = this.h;
        int i10 = x4Var.f41557c;
        org.telegram.ui.Components.x4 x4Var2 = this.f50315n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, x4Var2.f41557c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29184v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.f(0.75f, x4Var.f41557c, x4Var2.f41557c));
        }
        return i0.a.f(this.f50312c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.i20.B(230.0f, org.telegram.messenger.g0.f23603m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f50312c - f10) > 0.001f) {
            this.f50312c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
