package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oe0 implements org.telegram.ui.ActionBar.t4 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public y2 K;
    public final Context f38134a;
    public final View f38135b;
    public final ne0 f38136c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final dh.c f38137e;
    public final ui.d f38138f;
    public final gh.a h;
    public final gh.a f38139n;
    public final org.telegram.ui.ActionBar.i6 f38140r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38141s;
    public boolean f38142w;
    public boolean f38144y;
    public boolean f38143x = true;
    public int F = -1;

    public oe0(Activity activity, View view, ne0 ne0Var, org.telegram.ui.ActionBar.k5 k5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f38134a = activity;
        this.f38135b = view;
        this.f38136c = ne0Var;
        this.d = k5Var;
        this.f38137e = cVar;
        this.f38138f = dVar;
        this.h = aVar;
        this.f38139n = piVar;
        this.f38140r = i6Var;
        this.f38141s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 1, activity, i6Var);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        this.f38136c.E1(rectF);
        if (this.f38143x) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f38140r)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new me0(this, runnable, 0));
        this.f38141s.a(frameLayout, c8.na.o(-1, i7));
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
        return this.f38143x;
    }

    @Override
    public final fh.g g(org.telegram.ui.ActionBar.k5 k5Var) {
        fh.g c10 = this.f38137e.c(k5Var, null, false);
        c10.p(this.h);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return this.f38139n.x2();
    }

    @Override
    public final gh.a getButtonsGlassColorProvider() {
        return this.f38139n;
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
        return this.f38136c.v2();
    }

    @Override
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getMenuResourcesProvider() {
        return this.f38140r;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return this.f38135b;
    }

    @Override
    public final org.telegram.ui.ActionBar.k5 getOpenMenuOverlay() {
        if (this.f38142w) {
            return this.d;
        }
        return null;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.k5 k5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10;
        if (k5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38142w = z10;
        this.f38136c.s1(z10);
    }

    public final void i() {
        int i7;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (k5Var.d == this && k5Var.f29208e == null && (k5Var.I || k5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        ne0 ne0Var = this.f38136c;
        ne0Var.E1(rectF);
        ji.q v22 = ne0Var.v2();
        int[] iArr = new int[2];
        v22.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v22.getWindowVisibleDisplayFrame(rect);
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
        this.f38143x = z10;
        if (z10 && f12 < L) {
            i12 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.E = i12;
        this.I = null;
        k5Var.setOnClosed(new le0(this, 1));
        k5Var.d(this, null, this.f38141s);
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f38138f;
        if (dVar != null) {
            dVar.j(f10);
        }
        y2 y2Var = this.K;
        if (y2Var != null) {
            y2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.f38144y = true;
        }
        if (this.f38144y && f10 < 0.06f) {
            org.telegram.ui.ActionBar.k5 k5Var = this.d;
            if (!k5Var.I && this.f38142w) {
                this.f38144y = false;
                k5Var.post(new le0(this, 0));
            }
        }
    }
}
