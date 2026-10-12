package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ym0 implements s4.s0 {
    public RecyclerView f33133a;
    public boolean f33135c;
    public int d;
    public int f33136e;
    public int f33137f;
    public boolean f33138g;
    public boolean h;
    public int f33139i;
    public final xm0 f33141k;
    public int f33134b = -1;
    public final int f33140j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l7 f33142l = new org.telegram.ui.Cells.l7(this, 20);

    public ym0(xm0 xm0Var) {
        this.f33141k = xm0Var;
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
        xm0 xm0Var = this.f33141k;
        org.telegram.ui.Cells.l7 l7Var = this.f33142l;
        if (action != 1) {
            if (action == 2) {
                if (this.f33140j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f33138g) {
                            this.f33138g = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f33139i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.f33136e && y3 <= this.f33137f) {
                        this.f33138g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l7Var);
                            AndroidUtilities.runOnUIThread(l7Var);
                        }
                        this.f33139i = ((int) ((y3 + this.f33137f) - (this.f33136e + i11))) / 2;
                    } else if (this.f33138g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                        this.f33138g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f33134b != i10) {
                    this.f33134b = i10;
                    xm0Var.c(E, !xm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f33135c = false;
        this.f33138g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        xm0Var.a(false);
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
        if (this.f33135c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f33133a = recyclerView;
            int i10 = this.f33140j;
            if (i10 > -1) {
                this.d = i10;
                this.f33136e = recyclerView.getMeasuredHeight() - i10;
                this.f33137f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f33135c = false;
            this.f33138g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f33142l);
            this.f33141k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f33135c) {
            return;
        }
        this.f33134b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f33142l);
        this.f33138g = false;
        this.h = false;
        xm0 xm0Var = this.f33141k;
        if (!xm0Var.b(i10)) {
            this.f33135c = false;
            return;
        }
        xm0Var.a(true);
        xm0Var.c(view, z10);
        this.f33135c = true;
        this.f33134b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
