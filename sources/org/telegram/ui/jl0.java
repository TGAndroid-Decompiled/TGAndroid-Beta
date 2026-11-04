package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
public class jl0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int f46639a;
    public final org.telegram.ui.ActionBar.e6 f46640b;
    public float f46641c;
    public boolean d;
    public int f46642e;
    public int f46643f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 f46644n;
    public int f46645r;
    public int f46646s;
    public int f46647w;
    public int f46648x;
    public RadialGradient f46649y;

    public jl0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f46641c = 0.0f;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.f46644n = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.E = new Paint(1);
        this.f46640b = e6Var;
        this.f46639a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, e6Var);
        b(-1, -1, false);
    }

    public final void b(int i3, int i10, boolean z10) {
        org.telegram.messenger.xo xoVar;
        org.telegram.messenger.wo woVar = null;
        if (i10 >= 0 && i3 >= 0 && (xoVar = org.telegram.messenger.hp.s1(i3).f23109r4) != null) {
            woVar = xoVar.d(i10);
        }
        c(woVar, z10);
    }

    public final void c(org.telegram.messenger.wo woVar, boolean z10) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.e6 e6Var = this.f46640b;
        if (woVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, e6Var);
            this.f46643f = w02;
            this.f46642e = w02;
        } else {
            if (e6Var != null) {
                q10 = e6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.f46642e = woVar.c(q10);
            this.f46643f = woVar.d(q10);
        }
        if (!z10) {
            this.h.a(this.f46642e, true);
            this.f46644n.a(this.f46643f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.x4 x4Var = this.f46644n;
        org.telegram.ui.Components.x4 x4Var2 = this.h;
        if (z10 && (this.f46642e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.f46640b)) || this.f46643f != w02)) {
            this.f46643f = w02;
            this.f46642e = w02;
            x4Var2.a(w02, true);
            x4Var.a(w02, true);
        }
        int a10 = x4Var2.a(this.f46642e, false);
        int a11 = x4Var.a(this.f46643f, false);
        RadialGradient radialGradient = this.f46649y;
        Paint paint = this.E;
        if (radialGradient == null || this.f46645r != a10 || this.f46646s != a11 || this.f46647w != getWidth() || this.f46648x != getHeight()) {
            this.f46647w = getWidth();
            this.f46648x = getHeight();
            float f10 = this.f46647w;
            float f11 = f10 / 2.0f;
            float f12 = this.f46648x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f22580a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f46646s = a11;
            this.f46645r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f46649y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f46641c < 1.0f && !this.F) {
            canvas2 = canvas;
            canvas2.drawColor(this.f46639a);
        } else {
            canvas2 = canvas;
        }
        if (this.F) {
            i3 = 255;
        } else {
            i3 = (int) (this.f46641c * 255.0f);
        }
        paint.setAlpha(i3);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i3;
        int i10 = org.telegram.ui.ActionBar.k6.f28216v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f46640b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        if (this.d) {
            i3 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        } else {
            i3 = -1;
        }
        return i0.a.f(this.f46641c, w02, i3);
    }

    public int getColor() {
        return i0.a.f(this.f46641c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.f46640b), i0.a.f(0.75f, this.h.f40217c, this.f46644n.f40217c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i3 = org.telegram.ui.ActionBar.k6.f28160s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f46640b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28216v8, e6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        }
        org.telegram.ui.Components.x4 x4Var = this.h;
        int i10 = x4Var.f40217c;
        org.telegram.ui.Components.x4 x4Var2 = this.f46644n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, x4Var2.f40217c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28214v6, e6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, x4Var.f40217c, x4Var2.f40217c));
        }
        return i0.a.f(this.f46641c, b10, b11);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.f22602m, 1073741824);
        }
        super.onMeasure(i3, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f46641c - f10) > 0.001f) {
            this.f46641c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
