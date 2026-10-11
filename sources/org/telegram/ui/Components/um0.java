package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class um0 implements s4.s0 {
    public RecyclerView f31489a;
    public boolean f31491c;
    public int d;
    public int f31492e;
    public int f31493f;
    public boolean f31494g;
    public boolean h;
    public int f31495i;
    public final tm0 f31497k;
    public int f31490b = -1;
    public final int f31496j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f31498l = new org.telegram.ui.Cells.t6(this, 21);

    public um0(tm0 tm0Var) {
        this.f31497k = tm0Var;
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
        tm0 tm0Var = this.f31497k;
        org.telegram.ui.Cells.t6 t6Var = this.f31498l;
        if (action != 1) {
            if (action == 2) {
                if (this.f31496j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f31494g) {
                            this.f31494g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31495i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f31492e && y3 <= this.f31493f) {
                        this.f31494g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f31495i = ((int) ((y3 + this.f31493f) - (this.f31492e + i11))) / 2;
                    } else if (this.f31494g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f31494g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f31490b != i10) {
                    this.f31490b = i10;
                    tm0Var.c(E, !tm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f31491c = false;
        this.f31494g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        tm0Var.a(false);
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
        if (this.f31491c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f31489a = recyclerView;
            int i10 = this.f31496j;
            if (i10 > -1) {
                this.d = i10;
                this.f31492e = recyclerView.getMeasuredHeight() - i10;
                this.f31493f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f31491c = false;
            this.f31494g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f31498l);
            this.f31497k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f31491c) {
            return;
        }
        this.f31490b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f31498l);
        this.f31494g = false;
        this.h = false;
        tm0 tm0Var = this.f31497k;
        if (!tm0Var.b(i10)) {
            this.f31491c = false;
            return;
        }
        tm0Var.a(true);
        tm0Var.c(view, z10);
        this.f31491c = true;
        this.f31490b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
