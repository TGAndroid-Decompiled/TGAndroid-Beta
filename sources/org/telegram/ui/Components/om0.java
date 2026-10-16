package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class om0 implements s4.q0 {
    public RecyclerView f27679a;
    public boolean f27681c;
    public int d;
    public int e;
    public int f27682f;
    public boolean f27683g;
    public boolean h;
    public int f27684i;
    public final nm0 f27686k;
    public int f27680b = -1;
    public final int f27685j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f27687l = new org.telegram.ui.Cells.l7(this, 20);

    public om0(nm0 nm0Var) {
        this.f27686k = nm0Var;
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
        nm0 nm0Var = this.f27686k;
        org.telegram.ui.Cells.l7 l7Var = this.f27687l;
        if (action != 1) {
            if (action == 2) {
                if (this.f27685j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f27683g) {
                            this.f27683g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f27684i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f27682f) {
                        this.f27683g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f27684i = ((int) ((y3 + this.f27682f) - (this.e + i11))) / 2;
                    } else if (this.f27683g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f27683g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f27680b != i10) {
                    this.f27680b = i10;
                    nm0Var.c(E, !nm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f27681c = false;
        this.f27683g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
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
        if (this.f27681c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f27679a = recyclerView;
            int i10 = this.f27685j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f27682f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f27681c = false;
            this.f27683g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f27687l);
            this.f27686k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f27681c) {
            return;
        }
        this.f27680b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f27687l);
        this.f27683g = false;
        this.h = false;
        nm0 nm0Var = this.f27686k;
        if (!nm0Var.b(i10)) {
            this.f27681c = false;
            return;
        }
        nm0Var.a(true);
        nm0Var.c(view, z10);
        this.f27681c = true;
        this.f27680b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
