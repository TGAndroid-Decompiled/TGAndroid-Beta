package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nl0 implements s4.r0 {
    public RecyclerView f26488a;
    public boolean f26490c;
    public int d;
    public int e;
    public int f26491f;
    public boolean f26492g;
    public boolean h;
    public int f26493i;
    public final ml0 f26495k;
    public int f26489b = -1;
    public final int f26494j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f26496l = new org.telegram.ui.Cells.l7(this, 21);

    public nl0(ml0 ml0Var) {
        this.f26495k = ml0Var;
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
        ml0 ml0Var = this.f26495k;
        org.telegram.ui.Cells.l7 l7Var = this.f26496l;
        if (action != 1) {
            if (action == 2) {
                if (this.f26494j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f26492g) {
                            this.f26492g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f26493i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f26491f) {
                        this.f26492g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f26493i = ((int) ((y3 + this.f26491f) - (this.e + i11))) / 2;
                    } else if (this.f26492g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f26492g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f26489b != i10) {
                    this.f26489b = i10;
                    ml0Var.c(E, !ml0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f26490c = false;
        this.f26492g = false;
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
        if (this.f26490c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f26488a = recyclerView;
            int i10 = this.f26494j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f26491f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f26490c = false;
            this.f26492g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f26496l);
            this.f26495k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f26490c) {
            return;
        }
        this.f26489b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f26496l);
        this.f26492g = false;
        this.h = false;
        ml0 ml0Var = this.f26495k;
        if (!ml0Var.b(i10)) {
            this.f26490c = false;
            return;
        }
        ml0Var.a(true);
        ml0Var.c(view, z10);
        this.f26490c = true;
        this.f26489b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
