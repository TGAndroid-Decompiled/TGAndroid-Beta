package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ik0 implements v4.s0 {
    public RecyclerView f36223a;
    public boolean f36225c;
    public int d;
    public int f36226e;
    public int f36227f;
    public boolean f36228g;
    public boolean h;
    public int f36229i;
    public final hk0 f36231k;
    public int f36224b = -1;
    public final int f36230j = org.telegram.messenger.g0.L(80.0f);
    public final ik f36232l = new ik(this, 15);

    public ik0(hk0 hk0Var) {
        this.f36231k = hk0Var;
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
        hk0 hk0Var = this.f36231k;
        ik ikVar = this.f36232l;
        if (action != 1) {
            if (action == 2) {
                if (this.f36230j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f36228g) {
                            this.f36228g = true;
                            org.telegram.messenger.g0.r(ikVar);
                            org.telegram.messenger.g0.g3(ikVar);
                        }
                        this.f36229i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f36226e && y10 <= this.f36227f) {
                        this.f36228g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(ikVar);
                            org.telegram.messenger.g0.g3(ikVar);
                        }
                        this.f36229i = ((int) ((y10 + this.f36227f) - (this.f36226e + i10))) / 2;
                    } else if (this.f36228g || this.h) {
                        org.telegram.messenger.g0.r(ikVar);
                        this.f36228g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f36224b != i7) {
                    this.f36224b = i7;
                    hk0Var.l(E, !hk0Var.m(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f36225c = false;
        this.f36228g = false;
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
        if (this.f36225c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f36223a = recyclerView;
            int i7 = this.f36230j;
            if (i7 > -1) {
                this.d = i7;
                this.f36226e = recyclerView.getMeasuredHeight() - i7;
                this.f36227f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f36225c = false;
            this.f36228g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f36232l);
            this.f36231k.e(false);
        }
        return z11;
    }

    public final void d(int i7, View view, boolean z10) {
        if (this.f36225c) {
            return;
        }
        this.f36224b = -1;
        org.telegram.messenger.g0.r(this.f36232l);
        this.f36228g = false;
        this.h = false;
        hk0 hk0Var = this.f36231k;
        if (!hk0Var.f(i7)) {
            this.f36225c = false;
            return;
        }
        hk0Var.e(true);
        hk0Var.l(view, z10);
        this.f36225c = true;
        this.f36224b = i7;
    }

    @Override
    public final void c(boolean z10) {
    }
}
