package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xl0 implements s4.r0 {
    public RecyclerView f29070a;
    public boolean f29072c;
    public int d;
    public int e;
    public int f29073f;
    public boolean f29074g;
    public boolean h;
    public int f29075i;
    public final wl0 f29077k;
    public int f29071b = -1;
    public final int f29076j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.l9 f29078l = new org.telegram.ui.Cells.l9(this, 19);

    public xl0(wl0 wl0Var) {
        this.f29077k = wl0Var;
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
        wl0 wl0Var = this.f29077k;
        org.telegram.ui.Cells.l9 l9Var = this.f29078l;
        if (action != 1) {
            if (action == 2) {
                if (this.f29076j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f29074g) {
                            this.f29074g = true;
                            AndroidUtilities.cancelRunOnUIThread(l9Var);
                            AndroidUtilities.runOnUIThread(l9Var);
                        }
                        this.f29075i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f29073f) {
                        this.f29074g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(l9Var);
                            AndroidUtilities.runOnUIThread(l9Var);
                        }
                        this.f29075i = ((int) ((y3 + this.f29073f) - (this.e + i11))) / 2;
                    } else if (this.f29074g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                        this.f29074g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f29071b != i10) {
                    this.f29071b = i10;
                    wl0Var.c(E, !wl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f29072c = false;
        this.f29074g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(l9Var);
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
        if (this.f29072c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f29070a = recyclerView;
            int i10 = this.f29076j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f29073f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f29072c = false;
            this.f29074g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f29078l);
            this.f29077k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f29072c) {
            return;
        }
        this.f29071b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f29078l);
        this.f29074g = false;
        this.h = false;
        wl0 wl0Var = this.f29077k;
        if (!wl0Var.b(i10)) {
            this.f29072c = false;
            return;
        }
        wl0Var.a(true);
        wl0Var.c(view, z10);
        this.f29072c = true;
        this.f29071b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
