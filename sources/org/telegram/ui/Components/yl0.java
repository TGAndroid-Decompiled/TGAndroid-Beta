package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yl0 implements s4.r0 {
    public RecyclerView f30610a;
    public boolean f30612c;
    public int d;
    public int e;
    public int f30613f;
    public boolean f30614g;
    public boolean h;
    public int f30615i;
    public final xl0 f30617k;
    public int f30611b = -1;
    public final int f30616j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30618l = new org.telegram.ui.Cells.t6(this, 23);

    public yl0(xl0 xl0Var) {
        this.f30617k = xl0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10;
        int i11;
        View F = recyclerView.F(motionEvent.getX(), motionEvent.getY());
        if (F != null) {
            i10 = RecyclerView.S(F);
        } else {
            i10 = -1;
        }
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        xl0 xl0Var = this.f30617k;
        org.telegram.ui.Cells.t6 t6Var = this.f30618l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30616j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30614g) {
                            this.f30614g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30615i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30613f) {
                        this.f30614g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30615i = ((int) ((y3 + this.f30613f) - (this.e + i11))) / 2;
                    } else if (this.f30614g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30614g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30611b != i10) {
                    this.f30611b = i10;
                    xl0Var.c(F, !xl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30612c = false;
        this.f30614g = false;
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
        if (this.f30612c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30610a = recyclerView;
            int i10 = this.f30616j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30613f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30612c = false;
            this.f30614g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30618l);
            this.f30617k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30612c) {
            return;
        }
        this.f30611b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30618l);
        this.f30614g = false;
        this.h = false;
        xl0 xl0Var = this.f30617k;
        if (!xl0Var.b(i10)) {
            this.f30612c = false;
            return;
        }
        xl0Var.a(true);
        xl0Var.c(view, z10);
        this.f30612c = true;
        this.f30611b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
