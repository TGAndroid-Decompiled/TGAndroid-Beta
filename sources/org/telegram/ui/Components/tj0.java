package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tj0 implements v4.r0 {
    public RecyclerView f38358a;
    public boolean f38360c;
    public int d;
    public int f38361e;
    public int f38362f;
    public boolean f38363g;
    public boolean h;
    public int f38364i;
    public final sj0 f38366k;
    public int f38359b = -1;
    public final int f38365j = org.telegram.messenger.g0.L(80.0f);
    public final dt f38367l = new dt(this, 12);

    public tj0(sj0 sj0Var) {
        this.f38366k = sj0Var;
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
        sj0 sj0Var = this.f38366k;
        dt dtVar = this.f38367l;
        if (action != 1) {
            if (action == 2) {
                if (this.f38365j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f38363g) {
                            this.f38363g = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38364i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f38361e && y10 <= this.f38362f) {
                        this.f38363g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38364i = ((int) ((y10 + this.f38362f) - (this.f38361e + i10))) / 2;
                    } else if (this.f38363g || this.h) {
                        org.telegram.messenger.g0.r(dtVar);
                        this.f38363g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f38359b != i7) {
                    this.f38359b = i7;
                    sj0Var.j(E, !sj0Var.k(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f38360c = false;
        this.f38363g = false;
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
        if (this.f38360c && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f38358a = recyclerView;
            int i7 = this.f38365j;
            if (i7 > -1) {
                this.d = i7;
                this.f38361e = recyclerView.getMeasuredHeight() - i7;
                this.f38362f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f38360c = false;
            this.f38363g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f38367l);
            this.f38366k.d(false);
        }
        return z10;
    }

    public final void d(int i7, View view, boolean z9) {
        if (this.f38360c) {
            return;
        }
        this.f38359b = -1;
        org.telegram.messenger.g0.r(this.f38367l);
        this.f38363g = false;
        this.h = false;
        sj0 sj0Var = this.f38366k;
        if (!sj0Var.e(i7)) {
            this.f38360c = false;
            return;
        }
        sj0Var.d(true);
        sj0Var.j(view, z9);
        this.f38360c = true;
        this.f38359b = i7;
    }

    @Override
    public final void c(boolean z9) {
    }
}
