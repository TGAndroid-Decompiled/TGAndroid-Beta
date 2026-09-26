package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yl0 implements s4.r0 {
    public RecyclerView f30639a;
    public boolean f30641c;
    public int d;
    public int e;
    public int f30642f;
    public boolean f30643g;
    public boolean h;
    public int f30644i;
    public final xl0 f30646k;
    public int f30640b = -1;
    public final int f30645j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30647l = new org.telegram.ui.Cells.t6(this, 22);

    public yl0(xl0 xl0Var) {
        this.f30646k = xl0Var;
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
        xl0 xl0Var = this.f30646k;
        org.telegram.ui.Cells.t6 t6Var = this.f30647l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30645j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30643g) {
                            this.f30643g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30644i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30642f) {
                        this.f30643g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30644i = ((int) ((y3 + this.f30642f) - (this.e + i11))) / 2;
                    } else if (this.f30643g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30643g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30640b != i10) {
                    this.f30640b = i10;
                    xl0Var.c(E, !xl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30641c = false;
        this.f30643g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        xl0Var.a(false);
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
        if (this.f30641c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30639a = recyclerView;
            int i10 = this.f30645j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30642f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30641c = false;
            this.f30643g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30647l);
            this.f30646k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30641c) {
            return;
        }
        this.f30640b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30647l);
        this.f30643g = false;
        this.h = false;
        xl0 xl0Var = this.f30646k;
        if (!xl0Var.b(i10)) {
            this.f30641c = false;
            return;
        }
        xl0Var.a(true);
        xl0Var.c(view, z10);
        this.f30641c = true;
        this.f30640b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
