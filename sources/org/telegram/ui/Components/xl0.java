package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xl0 implements s4.r0 {
    public RecyclerView f30298a;
    public boolean f30300c;
    public int d;
    public int e;
    public int f30301f;
    public boolean f30302g;
    public boolean h;
    public int f30303i;
    public final wl0 f30305k;
    public int f30299b = -1;
    public final int f30304j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.u6 f30306l = new org.telegram.ui.Cells.u6(this, 23);

    public xl0(wl0 wl0Var) {
        this.f30305k = wl0Var;
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
        wl0 wl0Var = this.f30305k;
        org.telegram.ui.Cells.u6 u6Var = this.f30306l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30304j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30302g) {
                            this.f30302g = true;
                            AndroidUtilities.cancelRunOnUIThread(u6Var);
                            AndroidUtilities.runOnUIThread(u6Var);
                        }
                        this.f30303i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30301f) {
                        this.f30302g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(u6Var);
                            AndroidUtilities.runOnUIThread(u6Var);
                        }
                        this.f30303i = ((int) ((y3 + this.f30301f) - (this.e + i11))) / 2;
                    } else if (this.f30302g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(u6Var);
                        this.f30302g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30299b != i10) {
                    this.f30299b = i10;
                    wl0Var.c(F, !wl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30300c = false;
        this.f30302g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        wl0Var.a(false);
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
        if (this.f30300c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30298a = recyclerView;
            int i10 = this.f30304j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30301f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30300c = false;
            this.f30302g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30306l);
            this.f30305k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30300c) {
            return;
        }
        this.f30299b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30306l);
        this.f30302g = false;
        this.h = false;
        wl0 wl0Var = this.f30305k;
        if (!wl0Var.b(i10)) {
            this.f30300c = false;
            return;
        }
        wl0Var.a(true);
        wl0Var.c(view, z10);
        this.f30300c = true;
        this.f30299b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
