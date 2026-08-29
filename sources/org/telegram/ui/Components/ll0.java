package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ll0 implements f2.z0 {
    public RecyclerView f30361a;
    public boolean f30363c;
    public int d;
    public int f30364e;
    public int f30365f;
    public boolean f30366g;
    public boolean h;
    public int f30367i;
    public final kl0 f30369k;
    public int f30362b = -1;
    public final int f30368j = AndroidUtilities.dp(80.0f);
    public final rk0 f30370l = new rk0(this, 1);

    public ll0(kl0 kl0Var) {
        this.f30369k = kl0Var;
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
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        kl0 kl0Var = this.f30369k;
        rk0 rk0Var = this.f30370l;
        if (action != 1) {
            if (action == 2) {
                if (this.f30368j > -1) {
                    float f9 = 0;
                    if (y8 >= f9 && y8 <= this.d) {
                        this.h = false;
                        if (!this.f30366g) {
                            this.f30366g = true;
                            AndroidUtilities.cancelRunOnUIThread(rk0Var);
                            AndroidUtilities.runOnUIThread(rk0Var);
                        }
                        this.f30367i = ((int) (this.d - (y8 - f9))) / 2;
                    } else if (y8 >= this.f30364e && y8 <= this.f30365f) {
                        this.f30366g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(rk0Var);
                            AndroidUtilities.runOnUIThread(rk0Var);
                        }
                        this.f30367i = ((int) ((y8 + this.f30365f) - (this.f30364e + i11))) / 2;
                    } else if (this.f30366g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(rk0Var);
                        this.f30366g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f30362b != i10) {
                    this.f30362b = i10;
                    kl0Var.c(E, !kl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f30363c = false;
        this.f30366g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(rk0Var);
        kl0Var.a(false);
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
        if (this.f30363c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f30361a = recyclerView;
            int i10 = this.f30368j;
            if (i10 > -1) {
                this.d = i10;
                this.f30364e = recyclerView.getMeasuredHeight() - i10;
                this.f30365f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f30363c = false;
            this.f30366g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f30370l);
            this.f30369k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f30363c) {
            return;
        }
        this.f30362b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f30370l);
        this.f30366g = false;
        this.h = false;
        kl0 kl0Var = this.f30369k;
        if (!kl0Var.b(i10)) {
            this.f30363c = false;
            return;
        }
        kl0Var.a(true);
        kl0Var.c(view, z10);
        this.f30363c = true;
        this.f30362b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
