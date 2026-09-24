package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yl0 implements s4.r0 {
    public RecyclerView f30629a;
    public boolean f30631c;
    public int d;
    public int e;
    public int f30632f;
    public boolean f30633g;
    public boolean h;
    public int f30634i;
    public final xl0 f30636k;
    public int f30630b = -1;
    public final int f30635j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f30637l = new org.telegram.ui.Cells.t6(this, 22);

    public yl0(xl0 xl0Var) {
        this.f30636k = xl0Var;
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
        xl0 xl0Var = this.f30636k;
        org.telegram.ui.Cells.t6 t6Var = this.f30637l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30635j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f30633g) {
                            this.f30633g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30634i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f30632f) {
                        this.f30633g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f30634i = ((int) ((y3 + this.f30632f) - (this.e + i11))) / 2;
                    } else if (this.f30633g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f30633g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30630b != i10) {
                    this.f30630b = i10;
                    xl0Var.c(E, !xl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30631c = false;
        this.f30633g = false;
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
        if (this.f30631c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30629a = recyclerView;
            int i10 = this.f30635j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f30632f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30631c = false;
            this.f30633g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30637l);
            this.f30636k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30631c) {
            return;
        }
        this.f30630b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30637l);
        this.f30633g = false;
        this.h = false;
        xl0 xl0Var = this.f30636k;
        if (!xl0Var.b(i10)) {
            this.f30631c = false;
            return;
        }
        xl0Var.a(true);
        xl0Var.c(view, z10);
        this.f30631c = true;
        this.f30630b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
