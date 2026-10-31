package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class an0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int f35676a;
    public final org.telegram.ui.ActionBar.p6 f35677b;
    public float f35678c;
    public boolean d;
    public int e;
    public int f35679f;
    public final org.telegram.ui.Components.w4 h;
    public final org.telegram.ui.Components.w4 f35680n;
    public int f35681r;
    public int f35682s;
    public int f35683w;
    public int f35684x;
    public RadialGradient f35685y;

    public an0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f35678c = 0.0f;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.f35680n = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.D = new Paint(1);
        this.f35677b = p6Var;
        this.f35676a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, p6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        org.telegram.messenger.lp lpVar;
        org.telegram.messenger.kp kpVar = null;
        if (i11 >= 0 && i10 >= 0 && (lpVar = org.telegram.messenger.vp.r1(i10).f18898s4) != null) {
            kpVar = lpVar.d(i11);
        }
        c(kpVar, z10);
    }

    public final void c(org.telegram.messenger.kp kpVar, boolean z10) {
        boolean q6;
        this.d = false;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35677b;
        if (kpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, p6Var);
            this.f35679f = w02;
            this.e = w02;
        } else {
            if (p6Var != null) {
                q6 = p6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.t6.I.q();
            }
            this.e = kpVar.c(q6);
            this.f35679f = kpVar.d(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f35680n.a(this.f35679f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.w4 w4Var = this.f35680n;
        org.telegram.ui.Components.w4 w4Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f35677b)) || this.f35679f != w02)) {
            this.f35679f = w02;
            this.e = w02;
            w4Var2.a(w02, true);
            w4Var.a(w02, true);
        }
        int a2 = w4Var2.a(this.e, false);
        int a10 = w4Var.a(this.f35679f, false);
        RadialGradient radialGradient = this.f35685y;
        Paint paint = this.D;
        if (radialGradient == null || this.f35681r != a2 || this.f35682s != a10 || this.f35683w != getWidth() || this.f35684x != getHeight()) {
            this.f35683w = getWidth();
            this.f35684x = getHeight();
            float f7 = this.f35683w;
            float f10 = f7 / 2.0f;
            float f11 = this.f35684x;
            float f12 = f11 * 0.4f;
            Typeface typeface = org.telegram.messenger.i0.f15999a;
            float f13 = f7 - 0.0f;
            float f14 = f11 - 0.0f;
            this.f35682s = a10;
            this.f35681r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f10, f12, ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f35685y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f35678c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f35676a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f35678c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.t6.f21261v8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35677b;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        } else {
            i10 = -1;
        }
        return i0.b.f(this.f35678c, w02, i10);
    }

    public int getColor() {
        return i0.b.f(this.f35678c, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.f35677b), i0.b.f(0.75f, this.h.f31988c, this.f35680n.f31988c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.t6.f21206s8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35677b;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, p6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        }
        org.telegram.ui.Components.w4 w4Var = this.h;
        int i11 = w4Var.f31988c;
        org.telegram.ui.Components.w4 w4Var2 = this.f35680n;
        if (org.telegram.messenger.i0.B(i0.b.f(0.75f, i11, w4Var2.f31988c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21259v6, p6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, i0.b.f(0.75f, w4Var.f31988c, w4Var2.f31988c));
        }
        return i0.b.f(this.f35678c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.z20.B(230.0f, org.telegram.messenger.i0.f16020m, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f35678c - f7) > 0.001f) {
            this.f35678c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
