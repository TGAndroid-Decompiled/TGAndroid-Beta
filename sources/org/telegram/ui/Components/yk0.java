package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yk0 implements f2.c1 {
    public RecyclerView f34988a;
    public boolean f34990c;
    public int d;
    public int f34991e;
    public int f34992f;
    public boolean f34993g;
    public boolean h;
    public int f34994i;
    public final xk0 f34996k;
    public int f34989b = -1;
    public final int f34995j = AndroidUtilities.dp(80.0f);
    public final m.i3 f34997l = new m.i3(this, 28);

    public yk0(xk0 xk0Var) {
        this.f34996k = xk0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i9;
        int i10;
        View E = recyclerView.E(motionEvent.getX(), motionEvent.getY());
        if (E != null) {
            i9 = RecyclerView.R(E);
        } else {
            i9 = -1;
        }
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        xk0 xk0Var = this.f34996k;
        m.i3 i3Var = this.f34997l;
        if (action != 1) {
            if (action == 2) {
                if (this.f34995j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f34993g) {
                            this.f34993g = true;
                            AndroidUtilities.cancelRunOnUIThread(i3Var);
                            AndroidUtilities.runOnUIThread(i3Var);
                        }
                        this.f34994i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f34991e && y10 <= this.f34992f) {
                        this.f34993g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(i3Var);
                            AndroidUtilities.runOnUIThread(i3Var);
                        }
                        this.f34994i = ((int) ((y10 + this.f34992f) - (this.f34991e + i10))) / 2;
                    } else if (this.f34993g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                        this.f34993g = false;
                        this.h = false;
                    }
                }
                if (i9 != -1 && this.f34989b != i9) {
                    this.f34989b = i9;
                    xk0Var.c(E, !xk0Var.d(i9));
                    return;
                }
                return;
            }
            return;
        }
        this.f34990c = false;
        this.f34993g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        xk0Var.a(false);
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
        if (this.f34990c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f34988a = recyclerView;
            int i9 = this.f34995j;
            if (i9 > -1) {
                this.d = i9;
                this.f34991e = recyclerView.getMeasuredHeight() - i9;
                this.f34992f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f34990c = false;
            this.f34993g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f34997l);
            this.f34996k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i9, boolean z10) {
        if (this.f34990c) {
            return;
        }
        this.f34989b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f34997l);
        this.f34993g = false;
        this.h = false;
        xk0 xk0Var = this.f34996k;
        if (!xk0Var.b(i9)) {
            this.f34990c = false;
            return;
        }
        xk0Var.a(true);
        xk0Var.c(view, z10);
        this.f34990c = true;
        this.f34989b = i9;
    }

    @Override
    public final void c(boolean z10) {
    }
}
