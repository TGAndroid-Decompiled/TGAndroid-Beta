package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gk0 implements v4.t0 {
    public RecyclerView f35514a;
    public boolean f35516c;
    public int d;
    public int f35517e;
    public int f35518f;
    public boolean f35519g;
    public boolean h;
    public int f35520i;
    public final fk0 f35522k;
    public int f35515b = -1;
    public final int f35521j = org.telegram.messenger.g0.L(80.0f);
    public final gk f35523l = new gk(this, 15);

    public gk0(fk0 fk0Var) {
        this.f35522k = fk0Var;
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
        fk0 fk0Var = this.f35522k;
        gk gkVar = this.f35523l;
        if (action != 1) {
            if (action == 2) {
                if (this.f35521j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f35519g) {
                            this.f35519g = true;
                            org.telegram.messenger.g0.r(gkVar);
                            org.telegram.messenger.g0.g3(gkVar);
                        }
                        this.f35520i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f35517e && y10 <= this.f35518f) {
                        this.f35519g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(gkVar);
                            org.telegram.messenger.g0.g3(gkVar);
                        }
                        this.f35520i = ((int) ((y10 + this.f35518f) - (this.f35517e + i10))) / 2;
                    } else if (this.f35519g || this.h) {
                        org.telegram.messenger.g0.r(gkVar);
                        this.f35519g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f35515b != i7) {
                    this.f35515b = i7;
                    fk0Var.l(E, !fk0Var.m(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f35516c = false;
        this.f35519g = false;
        this.h = false;
        org.telegram.messenger.g0.r(gkVar);
        fk0Var.e(false);
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
        if (this.f35516c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f35514a = recyclerView;
            int i7 = this.f35521j;
            if (i7 > -1) {
                this.d = i7;
                this.f35517e = recyclerView.getMeasuredHeight() - i7;
                this.f35518f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f35516c = false;
            this.f35519g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f35523l);
            this.f35522k.e(false);
        }
        return z11;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.f35516c) {
            return;
        }
        this.f35515b = -1;
        org.telegram.messenger.g0.r(this.f35523l);
        this.f35519g = false;
        this.h = false;
        fk0 fk0Var = this.f35522k;
        if (!fk0Var.f(i7)) {
            this.f35516c = false;
            return;
        }
        fk0Var.e(true);
        fk0Var.l(view, z10);
        this.f35516c = true;
        this.f35515b = i7;
    }

    @Override
    public final void c(boolean z10) {
    }
}
