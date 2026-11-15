package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class de0 implements org.telegram.ui.ActionBar.q4 {
    public int F;
    public int G;
    public Runnable H;
    public Runnable I;
    public q2 J;
    public final View f33928a;
    public final ce0 f33929b;
    public final org.telegram.ui.ActionBar.g5 f33930c;
    public final dh.c d;
    public final ui.d f33931e;
    public final gh.a f33932f;
    public final gh.a h;
    public final org.telegram.ui.ActionBar.e6 f33933n;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33934r;
    public boolean f33935s;
    public boolean f33937x;
    public int f33938y;
    public boolean f33936w = true;
    public int E = -1;

    public de0(Activity activity, View view, ce0 ce0Var, org.telegram.ui.ActionBar.g5 g5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.oi oiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33928a = view;
        this.f33929b = ce0Var;
        this.f33930c = g5Var;
        this.d = cVar;
        this.f33931e = dVar;
        this.f33932f = aVar;
        this.h = oiVar;
        this.f33933n = e6Var;
        this.f33934r = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, e6Var);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        this.f33929b.d0(rectF);
        if (this.f33936w) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.f33933n)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new n2(26, this, runnable));
        this.f33934r.a(frameLayout, c8.ja.o(-1, i7));
        this.F = org.telegram.messenger.g0.L(i7) + this.F;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return this.f33936w;
    }

    @Override
    public final fh.g g(org.telegram.ui.ActionBar.g5 g5Var) {
        fh.g c10 = this.d.c(g5Var, null, false);
        c10.p(this.f33932f);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return this.h.A2();
    }

    @Override
    public final gh.a getButtonsGlassColorProvider() {
        return this.h;
    }

    @Override
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override
    public final int getMenuExtraBelow() {
        return this.f33938y;
    }

    @Override
    public final gh.a getMenuGlassColorProvider() {
        return this.f33932f;
    }

    @Override
    public final View getMenuHostView() {
        return this.f33929b.x0();
    }

    @Override
    public final int getMenuMaxHeight() {
        return this.G;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getMenuResourcesProvider() {
        return this.f33933n;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return this.f33928a;
    }

    @Override
    public final org.telegram.ui.ActionBar.g5 getOpenMenuOverlay() {
        if (this.f33935s) {
            return this.f33930c;
        }
        return null;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.g5 g5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10;
        if (g5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33935s = z10;
        this.f33929b.W(z10);
    }

    public final void i() {
        int i7;
        org.telegram.ui.ActionBar.g5 g5Var = this.f33930c;
        if (g5Var.d == this && g5Var.f28592e == null && (g5Var.E || g5Var.O)) {
            return;
        }
        RectF rectF = new RectF();
        ce0 ce0Var = this.f33929b;
        ce0Var.d0(rectF);
        ji.p x02 = ce0Var.x0();
        int[] iArr = new int[2];
        x02.getLocationInWindow(iArr);
        Rect rect = new Rect();
        x02.getWindowVisibleDisplayFrame(rect);
        float L = org.telegram.messenger.g0.L(24.0f) + this.F;
        int i10 = this.G;
        if (i10 > 0) {
            L = Math.min(L, i10);
        }
        int i11 = this.E;
        if (i11 > 0) {
            i7 = Math.min(rect.bottom, i11);
        } else {
            i7 = rect.bottom;
        }
        boolean z10 = true;
        float f10 = iArr[1];
        float f11 = i7 - (rectF.bottom + f10);
        float f12 = (f10 + rectF.top) - rect.top;
        int i12 = 0;
        if (f11 >= L || f11 > f12) {
            z10 = false;
        }
        this.f33936w = z10;
        if (z10 && f12 < L) {
            i12 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.f33938y = i12;
        this.H = null;
        g5Var.setOnClosed(new be0(this, 1));
        g5Var.d(this, null, this.f33934r);
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f33931e;
        if (dVar != null) {
            dVar.j(f10);
        }
        q2 q2Var = this.J;
        if (q2Var != null) {
            q2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.f33937x = true;
        }
        if (this.f33937x && f10 < 0.06f) {
            org.telegram.ui.ActionBar.g5 g5Var = this.f33930c;
            if (!g5Var.E && this.f33935s) {
                this.f33937x = false;
                g5Var.post(new be0(this, 0));
            }
        }
    }
}
