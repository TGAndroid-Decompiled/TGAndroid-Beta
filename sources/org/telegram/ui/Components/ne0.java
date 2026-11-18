package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ne0 implements org.telegram.ui.ActionBar.u4 {
    public int F;
    public int G;
    public Runnable H;
    public Runnable I;
    public y2 J;
    public final View f37767a;
    public final me0 f37768b;
    public final org.telegram.ui.ActionBar.k5 f37769c;
    public final dh.c d;
    public final ui.d f37770e;
    public final gh.a f37771f;
    public final gh.a h;
    public final org.telegram.ui.ActionBar.i6 f37772n;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37773r;
    public boolean f37774s;
    public boolean f37776x;
    public int f37777y;
    public boolean f37775w = true;
    public int E = -1;

    public ne0(Activity activity, View view, me0 me0Var, org.telegram.ui.ActionBar.k5 k5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f37767a = view;
        this.f37768b = me0Var;
        this.f37769c = k5Var;
        this.d = cVar;
        this.f37770e = dVar;
        this.f37771f = aVar;
        this.h = piVar;
        this.f37772n = i6Var;
        this.f37773r = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, i6Var);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b(org.telegram.ui.ActionBar.r0 r0Var, RectF rectF) {
        this.f37768b.W(rectF);
        if (this.f37775w) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f37772n)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new y7(22, this, runnable));
        this.f37773r.a(frameLayout, c8.ma.o(-1, i7));
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
        return this.f37775w;
    }

    @Override
    public final fh.g g(org.telegram.ui.ActionBar.k5 k5Var) {
        fh.g c10 = this.d.c(k5Var, null, false);
        c10.p(this.f37771f);
        org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
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
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override
    public final int getMenuExtraBelow() {
        return this.f37777y;
    }

    @Override
    public final gh.a getMenuGlassColorProvider() {
        return this.f37771f;
    }

    @Override
    public final View getMenuHostView() {
        return this.f37768b.k0();
    }

    @Override
    public final int getMenuMaxHeight() {
        return this.G;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getMenuResourcesProvider() {
        return this.f37772n;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return this.f37767a;
    }

    @Override
    public final org.telegram.ui.ActionBar.k5 getOpenMenuOverlay() {
        if (this.f37774s) {
            return this.f37769c;
        }
        return null;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.k5 k5Var, org.telegram.ui.ActionBar.r0 r0Var) {
        boolean z10;
        if (k5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37774s = z10;
        this.f37768b.T(z10);
    }

    public final void i() {
        int i7;
        org.telegram.ui.ActionBar.k5 k5Var = this.f37769c;
        if (k5Var.d == this && k5Var.f29154e == null && (k5Var.I || k5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        me0 me0Var = this.f37768b;
        me0Var.W(rectF);
        ji.p k02 = me0Var.k0();
        int[] iArr = new int[2];
        k02.getLocationInWindow(iArr);
        Rect rect = new Rect();
        k02.getWindowVisibleDisplayFrame(rect);
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
        this.f37775w = z10;
        if (z10 && f12 < L) {
            i12 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.f37777y = i12;
        this.H = null;
        k5Var.setOnClosed(new le0(this, 1));
        k5Var.d(this, null, this.f37773r);
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f37770e;
        if (dVar != null) {
            dVar.j(f10);
        }
        y2 y2Var = this.J;
        if (y2Var != null) {
            y2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.f37776x = true;
        }
        if (this.f37776x && f10 < 0.06f) {
            org.telegram.ui.ActionBar.k5 k5Var = this.f37769c;
            if (!k5Var.I && this.f37774s) {
                this.f37776x = false;
                k5Var.post(new le0(this, 0));
            }
        }
    }
}
