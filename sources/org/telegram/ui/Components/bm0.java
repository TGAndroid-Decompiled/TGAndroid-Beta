package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class bm0 implements s4.r0 {
    public RecyclerView f22972a;
    public boolean f22974c;
    public int d;
    public int e;
    public int f22975f;
    public boolean f22976g;
    public boolean h;
    public int f22977i;
    public final am0 f22979k;
    public int f22973b = -1;
    public final int f22978j = AndroidUtilities.dp(80.0f);
    public final org.telegram.ui.Cells.t6 f22980l = new org.telegram.ui.Cells.t6(this, 22);

    public bm0(am0 am0Var) {
        this.f22979k = am0Var;
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
        am0 am0Var = this.f22979k;
        org.telegram.ui.Cells.t6 t6Var = this.f22980l;
        if (action != 1) {
            if (action == 2) {
                if (this.f22978j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f22976g) {
                            this.f22976g = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22977i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f22975f) {
                        this.f22976g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(t6Var);
                            AndroidUtilities.runOnUIThread(t6Var);
                        }
                        this.f22977i = ((int) ((y3 + this.f22975f) - (this.e + i11))) / 2;
                    } else if (this.f22976g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(t6Var);
                        this.f22976g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f22973b != i10) {
                    this.f22973b = i10;
                    am0Var.c(E, !am0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f22974c = false;
        this.f22976g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        am0Var.a(false);
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
        if (this.f22974c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f22972a = recyclerView;
            int i10 = this.f22978j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f22975f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f22974c = false;
            this.f22976g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f22980l);
            this.f22979k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f22974c) {
            return;
        }
        this.f22973b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f22980l);
        this.f22976g = false;
        this.h = false;
        am0 am0Var = this.f22979k;
        if (!am0Var.b(i10)) {
            this.f22974c = false;
            return;
        }
        am0Var.a(true);
        am0Var.c(view, z10);
        this.f22974c = true;
        this.f22973b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
