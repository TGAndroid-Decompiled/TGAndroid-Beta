package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yl0 implements s4.r0 {
    public RecyclerView f30640a;
    public boolean f30642c;
    public int d;
    public int e;
    public int f30643f;
    public boolean f30644g;
    public boolean h;
    public int f30645i;
    public final xl0 f30647k;
    public int f30641b = -1;
    public final int f30646j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30648l = new org.telegram.ui.Cells.t6(this, 22);

    public yl0(xl0 xl0Var) {
        this.f30647k = xl0Var;
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
        xl0 xl0Var = this.f30647k;
        org.telegram.ui.Cells.t6 t6Var = this.f30648l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30646j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30644g) {
                            this.f30644g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30645i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30643f) {
                        this.f30644g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30645i = ((int) ((y3 + this.f30643f) - (this.e + i11))) / 2;
                    } else if (this.f30644g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30644g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30641b != i10) {
                    this.f30641b = i10;
                    xl0Var.c(E, !xl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30642c = false;
        this.f30644g = false;
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
        if (this.f30642c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30640a = recyclerView;
            int i10 = this.f30646j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30643f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30642c = false;
            this.f30644g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30648l);
            this.f30647k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30642c) {
            return;
        }
        this.f30641b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30648l);
        this.f30644g = false;
        this.h = false;
        xl0 xl0Var = this.f30647k;
        if (!xl0Var.b(i10)) {
            this.f30642c = false;
            return;
        }
        xl0Var.a(true);
        xl0Var.c(view, z10);
        this.f30642c = true;
        this.f30641b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
