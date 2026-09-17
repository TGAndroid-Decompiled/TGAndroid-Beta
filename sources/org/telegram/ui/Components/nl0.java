package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nl0 implements s4.r0 {
    public RecyclerView f28809a;
    public boolean f28811c;
    public int d;
    public int f28812e;
    public int f28813f;
    public boolean f28814g;
    public boolean h;
    public int f28815i;
    public final ml0 f28817k;
    public int f28810b = -1;
    public final int f28816j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f28818l = new org.telegram.ui.Cells.l7(this, 21);

    public nl0(ml0 ml0Var) {
        this.f28817k = ml0Var;
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
        ml0 ml0Var = this.f28817k;
        org.telegram.ui.Cells.l7 l7Var = this.f28818l;
        if (action != 1) {
            if (action == 2) {
                if (this.f28816j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f28814g) {
                            this.f28814g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f28815i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f28812e && y3 <= this.f28813f) {
                        this.f28814g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f28815i = ((int) ((y3 + this.f28813f) - (this.f28812e + i11))) / 2;
                    } else if (this.f28814g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f28814g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f28810b != i10) {
                    this.f28810b = i10;
                    ml0Var.c(E, !ml0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f28811c = false;
        this.f28814g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        ml0Var.a(false);
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
        if (this.f28811c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f28809a = recyclerView;
            int i10 = this.f28816j;
            if (i10 > -1) {
                this.d = i10;
                this.f28812e = recyclerView.getMeasuredHeight() - i10;
                this.f28813f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f28811c = false;
            this.f28814g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f28818l);
            this.f28817k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f28811c) {
            return;
        }
        this.f28810b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f28818l);
        this.f28814g = false;
        this.h = false;
        ml0 ml0Var = this.f28817k;
        if (!ml0Var.b(i10)) {
            this.f28811c = false;
            return;
        }
        ml0Var.a(true);
        ml0Var.c(view, z10);
        this.f28811c = true;
        this.f28810b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
