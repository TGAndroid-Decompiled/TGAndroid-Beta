package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tj0 implements v4.r0 {
    public RecyclerView f38349a;
    public boolean f38351c;
    public int d;
    public int f38352e;
    public int f38353f;
    public boolean f38354g;
    public boolean h;
    public int f38355i;
    public final sj0 f38357k;
    public int f38350b = -1;
    public final int f38356j = org.telegram.messenger.g0.L(80.0f);
    public final dt f38358l = new dt(this, 12);

    public tj0(sj0 sj0Var) {
        this.f38357k = sj0Var;
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
        sj0 sj0Var = this.f38357k;
        dt dtVar = this.f38358l;
        if (action != 1) {
            if (action == 2) {
                if (this.f38356j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f38354g) {
                            this.f38354g = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38355i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f38352e && y10 <= this.f38353f) {
                        this.f38354g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38355i = ((int) ((y10 + this.f38353f) - (this.f38352e + i10))) / 2;
                    } else if (this.f38354g || this.h) {
                        org.telegram.messenger.g0.r(dtVar);
                        this.f38354g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f38350b != i7) {
                    this.f38350b = i7;
                    sj0Var.j(E, !sj0Var.k(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f38351c = false;
        this.f38354g = false;
        this.h = false;
        org.telegram.messenger.g0.r(dtVar);
        sj0Var.d(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().b() != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f38351c && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f38349a = recyclerView;
            int i7 = this.f38356j;
            if (i7 > -1) {
                this.d = i7;
                this.f38352e = recyclerView.getMeasuredHeight() - i7;
                this.f38353f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f38351c = false;
            this.f38354g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f38358l);
            this.f38357k.d(false);
        }
        return z10;
    }

    public final void d(int i7, View view, boolean z9) {
        if (this.f38351c) {
            return;
        }
        this.f38350b = -1;
        org.telegram.messenger.g0.r(this.f38358l);
        this.f38354g = false;
        this.h = false;
        sj0 sj0Var = this.f38357k;
        if (!sj0Var.e(i7)) {
            this.f38351c = false;
            return;
        }
        sj0Var.d(true);
        sj0Var.j(view, z9);
        this.f38351c = true;
        this.f38350b = i7;
    }

    @Override
    public final void c(boolean z9) {
    }
}
