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
    public int f48436a;
    public final org.telegram.ui.ActionBar.f6 f48437b;
    public float f48438c;
    public boolean d;
    public int f48439e;
    public int f48440f;
    public final org.telegram.ui.Components.z4 h;
    public final org.telegram.ui.Components.z4 f48441n;
    public int f48442r;
    public int f48443s;
    public int f48444w;
    public int f48445x;
    public RadialGradient f48446y;

    public ol0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48438c = 0.0f;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.f48441n = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.D = new Paint(1);
        this.f48437b = f6Var;
        this.f48436a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, f6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 >= 0 && i7 >= 0 && (gpVar = org.telegram.messenger.qp.s1(i7).f24884r4) != null) {
            fpVar = gpVar.d(i10);
        }
        c(fpVar, z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48437b;
        if (fpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, f6Var);
            this.f48440f = w02;
            this.f48439e = w02;
        } else {
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.f48439e = fpVar.c(q10);
            this.f48440f = fpVar.d(q10);
        }
        if (!z9) {
            this.h.a(this.f48439e, true);
            this.f48441n.a(this.f48440f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int w02;
        boolean z9 = this.d;
        org.telegram.ui.Components.z4 z4Var = this.f48441n;
        org.telegram.ui.Components.z4 z4Var2 = this.h;
        if (z9 && (this.f48439e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, this.f48437b)) || this.f48440f != w02)) {
            this.f48440f = w02;
            this.f48439e = w02;
            z4Var2.a(w02, true);
            z4Var.a(w02, true);
        }
        int a10 = z4Var2.a(this.f48439e, false);
        int a11 = z4Var.a(this.f48440f, false);
        RadialGradient radialGradient = this.f48446y;
        Paint paint = this.D;
        if (radialGradient == null || this.f48442r != a10 || this.f48443s != a11 || this.f48444w != getWidth() || this.f48445x != getHeight()) {
            this.f48444w = getWidth();
            this.f48445x = getHeight();
            float f10 = this.f48444w;
            float f11 = f10 / 2.0f;
            float f12 = this.f48445x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.f22535a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            this.f48443s = a11;
            this.f48442r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f48446y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f48438c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f48436a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i7 = 255;
        } else {
            i7 = (int) (this.f48438c * 255.0f);
        }
        paint.setAlpha(i7);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.k6.f28189v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48437b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        if (this.d) {
            i7 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        } else {
            i7 = -1;
        }
        return i0.a.f(this.f48438c, w02, i7);
    }

    public int getColor() {
        return i0.a.f(this.f48438c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28132s8, this.f48437b), i0.a.f(0.75f, this.h.f40882c, this.f48441n.f40882c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i7 = org.telegram.ui.ActionBar.k6.f28132s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f48437b;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28189v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        }
        org.telegram.ui.Components.z4 z4Var = this.h;
        int i10 = z4Var.f40882c;
        org.telegram.ui.Components.z4 z4Var2 = this.f48441n;
        if (org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, z4Var2.f40882c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28187v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, z4Var.f40882c, z4Var2.f40882c));
        }
        return i0.a.f(this.f48438c, b10, b11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.F) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.f22557m, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f48438c - f10) > 0.001f) {
            this.f48438c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
