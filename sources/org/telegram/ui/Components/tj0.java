package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tj0 implements v4.r0 {
    public RecyclerView f38338a;
    public boolean f38340c;
    public int d;
    public int f38341e;
    public int f38342f;
    public boolean f38343g;
    public boolean h;
    public int f38344i;
    public final sj0 f38346k;
    public int f38339b = -1;
    public final int f38345j = org.telegram.messenger.g0.L(80.0f);
    public final dt f38347l = new dt(this, 12);

    public tj0(sj0 sj0Var) {
        this.f38346k = sj0Var;
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
        sj0 sj0Var = this.f38346k;
        dt dtVar = this.f38347l;
        if (action != 1) {
            if (action == 2) {
                if (this.f38345j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f38343g) {
                            this.f38343g = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38344i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f38341e && y10 <= this.f38342f) {
                        this.f38343g = false;
                        if (!this.h) {
                            this.h = true;
                            org.telegram.messenger.g0.r(dtVar);
                            org.telegram.messenger.g0.h3(dtVar);
                        }
                        this.f38344i = ((int) ((y10 + this.f38342f) - (this.f38341e + i10))) / 2;
                    } else if (this.f38343g || this.h) {
                        org.telegram.messenger.g0.r(dtVar);
                        this.f38343g = false;
                        this.h = false;
                    }
                }
                if (i7 != -1 && this.f38339b != i7) {
                    this.f38339b = i7;
                    sj0Var.j(E, !sj0Var.k(i7));
                    return;
                }
                return;
            }
            return;
        }
        this.f38340c = false;
        this.f38343g = false;
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
        if (this.f38340c && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f38338a = recyclerView;
            int i7 = this.f38345j;
            if (i7 > -1) {
                this.d = i7;
                this.f38341e = recyclerView.getMeasuredHeight() - i7;
                this.f38342f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f38340c = false;
            this.f38343g = false;
            this.h = false;
            org.telegram.messenger.g0.r(this.f38347l);
            this.f38346k.d(false);
        }
        return z10;
    }

    public final void d(int i7, View view, boolean z9) {
        if (this.f38340c) {
            return;
        }
        this.f38339b = -1;
        org.telegram.messenger.g0.r(this.f38347l);
        this.f38343g = false;
        this.h = false;
        sj0 sj0Var = this.f38346k;
        if (!sj0Var.e(i7)) {
            this.f38340c = false;
            return;
        }
        sj0Var.d(true);
        sj0Var.j(view, z9);
        this.f38340c = true;
        this.f38339b = i7;
    }

    @Override
    public final void c(boolean z9) {
    }
}
