package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zl0 implements s4.r0 {
    public RecyclerView f30916a;
    public boolean f30918c;
    public int d;
    public int e;
    public int f30919f;
    public boolean f30920g;
    public boolean h;
    public int f30921i;
    public final yl0 f30923k;
    public int f30917b = -1;
    public final int f30922j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30924l = new org.telegram.ui.Cells.t6(this, 22);

    public zl0(yl0 yl0Var) {
        this.f30923k = yl0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10;
        int i11;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i10 = RecyclerView.R(E);
        } else {
            i10 = -1;
        }
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        yl0 yl0Var = this.f30923k;
        org.telegram.ui.Cells.t6 t6Var = this.f30924l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30922j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30920g) {
                            this.f30920g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30921i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30919f) {
                        this.f30920g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30921i = ((int) ((y3 + this.f30919f) - (this.e + i11))) / 2;
                    } else if (this.f30920g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30920g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30917b != i10) {
                    this.f30917b = i10;
                    yl0Var.c(E, !yl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30918c = false;
        this.f30920g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        yl0Var.a(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().h() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f30918c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30916a = recyclerView;
            int i10 = this.f30922j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30919f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30918c = false;
            this.f30920g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30924l);
            this.f30923k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30918c) {
            return;
        }
        this.f30917b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30924l);
        this.f30920g = false;
        this.h = false;
        yl0 yl0Var = this.f30923k;
        if (!yl0Var.b(i10)) {
            this.f30918c = false;
            return;
        }
        yl0Var.a(true);
        yl0Var.c(view, z10);
        this.f30918c = true;
        this.f30917b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
