package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class pe0 implements org.telegram.ui.ActionBar.t4 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public z2 K;
    public final Context f38574a;
    public final View f38575b;
    public final oe0 f38576c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final dh.c f38577e;
    public final ui.d f38578f;
    public final gh.a h;
    public final gh.a f38579n;
    public final org.telegram.ui.ActionBar.h6 f38580r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38581s;
    public boolean f38582w;
    public boolean f38584y;
    public boolean f38583x = true;
    public int F = -1;

    public pe0(Activity activity, View view, oe0 oe0Var, org.telegram.ui.ActionBar.j5 j5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f38574a = activity;
        this.f38575b = view;
        this.f38576c = oe0Var;
        this.d = j5Var;
        this.f38577e = cVar;
        this.f38578f = dVar;
        this.h = aVar;
        this.f38579n = piVar;
        this.f38580r = h6Var;
        this.f38581s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 1, activity, h6Var);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        this.f38576c.W(rectF);
        if (this.f38583x) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.f38580r)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new ne0(this, runnable, 0));
        this.f38581s.a(frameLayout, c8.ma.o(-1, i7));
        this.G = org.telegram.messenger.g0.L(i7) + this.G;
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
        return this.f38583x;
    }

    @Override
    public final fh.g g(org.telegram.ui.ActionBar.j5 j5Var) {
        fh.g c10 = this.f38577e.c(j5Var, null, false);
        c10.p(this.h);
        org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return this.f38579n.A2();
    }

    @Override
    public final gh.a getButtonsGlassColorProvider() {
        return this.f38579n;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override
    public final int getMenuExtraBelow() {
        return this.E;
    }

    @Override
    public final gh.a getMenuGlassColorProvider() {
        return this.h;
    }

    @Override
    public final View getMenuHostView() {
        return this.f38576c.k0();
    }

    @Override
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getMenuResourcesProvider() {
        return this.f38580r;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return this.f38575b;
    }

    @Override
    public final org.telegram.ui.ActionBar.j5 getOpenMenuOverlay() {
        if (this.f38582w) {
            return this.d;
        }
        return null;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.j5 j5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10;
        if (j5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38582w = z10;
        this.f38576c.T(z10);
    }

    public final void i() {
        int i7;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (j5Var.d == this && j5Var.f29080e == null && (j5Var.I || j5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        oe0 oe0Var = this.f38576c;
        oe0Var.W(rectF);
        ji.r k02 = oe0Var.k0();
        int[] iArr = new int[2];
        k02.getLocationInWindow(iArr);
        Rect rect = new Rect();
        k02.getWindowVisibleDisplayFrame(rect);
        float L = org.telegram.messenger.g0.L(24.0f) + this.G;
        int i10 = this.H;
        if (i10 > 0) {
            L = Math.min(L, i10);
        }
        int i11 = this.F;
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
        this.f38583x = z10;
        if (z10 && f12 < L) {
            i12 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.E = i12;
        this.I = null;
        j5Var.setOnClosed(new me0(this, 1));
        j5Var.d(this, null, this.f38581s);
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f38578f;
        if (dVar != null) {
            dVar.j(f10);
        }
        z2 z2Var = this.K;
        if (z2Var != null) {
            z2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.f38584y = true;
        }
        if (this.f38584y && f10 < 0.06f) {
            org.telegram.ui.ActionBar.j5 j5Var = this.d;
            if (!j5Var.I && this.f38582w) {
                this.f38584y = false;
                j5Var.post(new me0(this, 0));
            }
        }
    }
}
