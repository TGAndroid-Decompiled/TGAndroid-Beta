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
    public int f51482a;
    public final org.telegram.ui.ActionBar.i6 f51483b;
    public float f51484c;
    public boolean d;
    public int f51485e;
    public int f51486f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f51487n;
    public int f51488r;
    public int f51489s;
    public int f51490w;
    public int f51491x;
    public RadialGradient f51492y;

    public ql0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f51484c = 0.0f;
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        this.h = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.f51487n = new org.telegram.ui.Components.f5(this, 350L, krVar);
        this.E = new Paint(1);
        this.f51483b = i6Var;
        this.f51482a = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, i6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z10) {
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp bpVar = null;
        if (i10 >= 0 && i7 >= 0 && (cpVar = org.telegram.messenger.mp.u1(i7).f25870u4) != null) {
            bpVar = cpVar.d(i10);
        }
        c(bpVar, z10);
    }

    public final void c(org.telegram.messenger.bp bpVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.i6 i6Var = this.f51483b;
        if (bpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, i6Var);
            this.f51486f = w02;
            this.f51485e = w02;
        } else {
            if (i6Var != null) {
                q10 = i6Var.b();
            } else {
                q10 = org.telegram.ui.ActionBar.n6.I.q();
            }
            this.f51485e = bpVar.c(q10);
            this.f51486f = bpVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f51485e, true);
            this.f51487n.a(this.f51486f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.f5 f5Var = this.f51487n;
        org.telegram.ui.Components.f5 f5Var2 = this.h;
        if (z10 && (this.f51485e != (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, this.f51483b)) || this.f51486f != w02)) {
            this.f51486f = w02;
            this.f51485e = w02;
            f5Var2.a(w02, true);
            f5Var.a(w02, true);
        }
        int a10 = f5Var2.a(this.f51485e, false);
        int a11 = f5Var.a(this.f51486f, false);
        RadialGradient radialGradient = this.f51492y;
        Paint paint = this.E;
        if (radialGradient == null || this.f51488r != a10 || this.f51489s != a11 || this.f51490w != getWidth() || this.f51491x != getHeight()) {
            this.f51490w = getWidth();
            this.f51491x = getHeight();
            float f10 = this.f51490w;
            float f11 = f10 / 2.0f;
            float f12 = this.f51491x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f24198a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f51489s = a11;
            this.f51488r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f51492y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f51484c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f51482a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i7 = 255;
        } else {
            i7 = (int) (this.f51484c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.f29788v8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f51483b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f51484c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f51484c, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, this.f51483b), i0.a.f(0.75f, this.h.f35004c, this.f51487n.f35004c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.n6.f29731s8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f51483b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788v8, i6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        }
        org.telegram.ui.Components.f5 f5Var = this.h;
        int i10 = f5Var.f35004c;
        org.telegram.ui.Components.f5 f5Var2 = this.f51487n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, f5Var2.f35004c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29786v6, i6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.n6.b(0.08f, -0.08f, i0.a.f(0.75f, f5Var.f35004c, f5Var2.f35004c));
        }
        return i0.a.f(this.f51484c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.m10.C(230.0f, org.telegram.messenger.g0.f24220m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f51484c - f10) > 0.001f) {
            this.f51484c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
