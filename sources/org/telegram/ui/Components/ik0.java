package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ik0 implements v4.t0 {
    public RecyclerView f36267a;
    public boolean f36269c;
    public int d;
    public int f36270e;
    public int f36271f;
    public boolean f36272g;
    public boolean h;
    public int f36273i;
    public final hk0 f36275k;
    public int f36268b = -1;
    public final int f36274j = org.telegram.messenger.g0.L(80.0f);
    public final ik f36276l = new ik(this, 15);

    public ik0(hk0 hk0Var) {
        this.f36275k = hk0Var;
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
        hk0 hk0Var = this.f36275k;
        ik ikVar = this.f36276l;
        if (action != 1) {
            if (action == 2) {
                if (this.f36274j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f36272g) {
                            this.f36272g = true;
                            org.telegram.messenger.g0.r(ikVar);
                            org.telegram.messenger.g0.g3(ikVar);
                        }
                        this.f36273i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f36270e && y10 <= this.f36271f) {
                        this.f36272g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(ikVar);
                            org.telegram.messenger.g0.g3(ikVar);
                        }
                        this.f36273i = ((int) ((y10 + this.f36271f) - (this.f36270e + i10))) / 2;
                    } else if (this.f36272g || this.h) {
                        org.telegram.messenger.g0.r(ikVar);
                        this.f36272g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f36268b != i7) {
                    this.f36268b = i7;
                    hk0Var.l(E, !hk0Var.m(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f36269c = false;
        this.f36272g = false;
        this.h = false;
        org.telegram.messenger.g0.r(ikVar);
        hk0Var.e(false);
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
        if (this.f36269c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f36267a = recyclerView;
            int i7 = this.f36274j;
            if (i7 > -1) {
                this.d = i7;
                this.f36270e = recyclerView.getMeasuredHeight() - i7;
                this.f36271f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f36269c = false;
            this.f36272g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f36276l);
            this.f36275k.e(false);
        }
        return z11;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.f36269c) {
            return;
        }
        this.f36268b = -1;
        org.telegram.messenger.g0.r(this.f36276l);
        this.f36272g = false;
        this.h = false;
        hk0 hk0Var = this.f36275k;
        if (!hk0Var.f(i7)) {
            this.f36269c = false;
            return;
        }
        hk0Var.e(true);
        hk0Var.l(view, z10);
        this.f36269c = true;
        this.f36268b = i7;
    }

    @Override
    public final void c(boolean z10) {
    }
}
