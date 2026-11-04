package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xj0 implements u4.s0 {
    public RecyclerView f40375a;
    public boolean f40377c;
    public int d;
    public int f40378e;
    public int f40379f;
    public boolean f40380g;
    public boolean h;
    public int f40381i;
    public final wj0 f40383k;
    public int f40376b = -1;
    public final int f40382j = org.telegram.messenger.g0.L(80.0f);
    public final lt f40384l = new lt(this, 11);

    public xj0(wj0 wj0Var) {
        this.f40383k = wj0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i3;
        int i10;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i3 = RecyclerView.R(E);
        } else {
            i3 = -1;
        }
        float y9 = motionEvent.getY();
        int action = motionEvent.getAction();
        wj0 wj0Var = this.f40383k;
        lt ltVar = this.f40384l;
        if (action != 1) {
            if (action == 2) {
                if (this.f40382j > -1) {
                    float f10 = 0;
                    if (y9 >= f10 && y9 <= this.d) {
                        this.h = false;
                        if (!this.f40380g) {
                            this.f40380g = true;
                            org.telegram.messenger.g0.r(ltVar);
                            org.telegram.messenger.g0.h3(ltVar);
                        }
                        this.f40381i = ((int) (this.d - (y9 - f10))) / 2;
                    } else if (y9 >= this.f40378e && y9 <= this.f40379f) {
                        this.f40380g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(ltVar);
                            org.telegram.messenger.g0.h3(ltVar);
                        }
                        this.f40381i = ((int) ((y9 + this.f40379f) - (this.f40378e + i10))) / 2;
                    } else if (this.f40380g || this.h) {
                        org.telegram.messenger.g0.r(ltVar);
                        this.f40380g = false;
                        this.h = false;
                    }
                }
                if (i3 != -1 && this.f40376b != i3) {
                    this.f40376b = i3;
                    wj0Var.f(E, !wj0Var.m(i3));
                    return;
                }
                return;
            }
            return;
        }
        this.f40377c = false;
        this.f40380g = false;
        this.h = false;
        org.telegram.messenger.g0.r(ltVar);
        wj0Var.b(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().b() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f40377c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f40375a = recyclerView;
            int i3 = this.f40382j;
            if (i3 > -1) {
                this.d = i3;
                this.f40378e = recyclerView.getMeasuredHeight() - i3;
                this.f40379f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f40377c = false;
            this.f40380g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f40384l);
            this.f40383k.b(false);
        }
        return z11;
    }

    public final void d(int i3, View view, boolean z10) {
        if (this.f40377c) {
            return;
        }
        this.f40376b = -1;
        org.telegram.messenger.g0.r(this.f40384l);
        this.f40380g = false;
        this.h = false;
        wj0 wj0Var = this.f40383k;
        if (!wj0Var.c(i3)) {
            this.f40377c = false;
            return;
        }
        wj0Var.b(true);
        wj0Var.f(view, z10);
        this.f40377c = true;
        this.f40376b = i3;
    }

    @Override
    public final void c(boolean z10) {
    }
}
