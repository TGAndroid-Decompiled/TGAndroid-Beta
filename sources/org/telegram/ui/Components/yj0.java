package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yj0 implements v4.s0 {
    public RecyclerView f42018a;
    public boolean f42020c;
    public int d;
    public int f42021e;
    public int f42022f;
    public boolean f42023g;
    public boolean h;
    public int f42024i;
    public final xj0 f42026k;
    public int f42019b = -1;
    public final int f42025j = org.telegram.messenger.g0.L(80.0f);
    public final zj f42027l = new zj(this, 15);

    public yj0(xj0 xj0Var) {
        this.f42026k = xj0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7;
        int i10;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i7 = RecyclerView.R(E);
        } else {
            i7 = -1;
        }
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        xj0 xj0Var = this.f42026k;
        zj zjVar = this.f42027l;
        if (action != 1) {
            if (action == 2) {
                if (this.f42025j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f42023g) {
                            this.f42023g = true;
                            org.telegram.messenger.g0.r(zjVar);
                            org.telegram.messenger.g0.h3(zjVar);
                        }
                        this.f42024i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f42021e && y10 <= this.f42022f) {
                        this.f42023g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(zjVar);
                            org.telegram.messenger.g0.h3(zjVar);
                        }
                        this.f42024i = ((int) ((y10 + this.f42022f) - (this.f42021e + i10))) / 2;
                    } else if (this.f42023g || this.h) {
                        org.telegram.messenger.g0.r(zjVar);
                        this.f42023g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f42019b != i7) {
                    this.f42019b = i7;
                    xj0Var.d(E, !xj0Var.g(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f42020c = false;
        this.f42023g = false;
        this.h = false;
        org.telegram.messenger.g0.r(zjVar);
        xj0Var.a(false);
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
        if (this.f42020c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f42018a = recyclerView;
            int i7 = this.f42025j;
            if (i7 > -1) {
                this.d = i7;
                this.f42021e = recyclerView.getMeasuredHeight() - i7;
                this.f42022f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f42020c = false;
            this.f42023g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f42027l);
            this.f42026k.a(false);
        }
        return z11;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.f42020c) {
            return;
        }
        this.f42019b = -1;
        org.telegram.messenger.g0.r(this.f42027l);
        this.f42023g = false;
        this.h = false;
        xj0 xj0Var = this.f42026k;
        if (!xj0Var.b(i7)) {
            this.f42020c = false;
            return;
        }
        xj0Var.a(true);
        xj0Var.d(view, z10);
        this.f42020c = true;
        this.f42019b = i7;
    }

    @Override
    public final void c(boolean z10) {
    }
}
