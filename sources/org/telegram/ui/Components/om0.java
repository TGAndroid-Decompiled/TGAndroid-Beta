package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class om0 implements s4.q0 {
    public RecyclerView f29232a;
    public boolean f29234c;
    public int d;
    public int e;
    public int f29235f;
    public boolean f29236g;
    public boolean h;
    public int f29237i;
    public final nm0 f29239k;
    public int f29233b = -1;
    public final int f29238j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.u5 f29240l = new org.telegram.ui.Cells.u5(this, 22);

    public om0(nm0 nm0Var) {
        this.f29239k = nm0Var;
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
        nm0 nm0Var = this.f29239k;
        org.telegram.ui.Cells.u5 u5Var = this.f29240l;
        if (action != 1) {
            if (action == 2) {
                if (this.f29238j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f29236g) {
                            this.f29236g = true;
                            AndroidUtilities.cancelRunOnUIThread(u5Var);
                            AndroidUtilities.runOnUIThread(u5Var);
                        }
                        this.f29237i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f29235f) {
                        this.f29236g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(u5Var);
                            AndroidUtilities.runOnUIThread(u5Var);
                        }
                        this.f29237i = ((int) ((y3 + this.f29235f) - (this.e + i11))) / 2;
                    } else if (this.f29236g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        this.f29236g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f29233b != i10) {
                    this.f29233b = i10;
                    nm0Var.c(E, !nm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f29234c = false;
        this.f29236g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(u5Var);
        nm0Var.a(false);
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
        if (this.f29234c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f29232a = recyclerView;
            int i10 = this.f29238j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f29235f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f29234c = false;
            this.f29236g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f29240l);
            this.f29239k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f29234c) {
            return;
        }
        this.f29233b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f29240l);
        this.f29236g = false;
        this.h = false;
        nm0 nm0Var = this.f29239k;
        if (!nm0Var.b(i10)) {
            this.f29234c = false;
            return;
        }
        nm0Var.a(true);
        nm0Var.c(view, z10);
        this.f29234c = true;
        this.f29233b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
