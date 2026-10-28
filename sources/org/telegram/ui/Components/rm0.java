package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rm0 implements s4.t0 {
    public RecyclerView f32280a;
    public boolean f32282c;
    public int d;
    public int e;
    public int f32283f;
    public boolean f32284g;
    public boolean h;
    public int f32285i;
    public final qm0 f32287k;
    public int f32281b = -1;
    public final int f32286j = AndroidUtilities.dp(80.0f);
    public final m.g3 f32288l = new m.g3(this, 26);

    public rm0(qm0 qm0Var) {
        this.f32287k = qm0Var;
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
        qm0 qm0Var = this.f32287k;
        m.g3 g3Var = this.f32288l;
        if (action != 1) {
            if (action == 2) {
                if (this.f32286j > -1) {
                    float f7 = 0;
                    if (y3 >= f7 && y3 <= this.d) {
                        this.h = false;
                        if (!this.f32284g) {
                            this.f32284g = true;
                            AndroidUtilities.cancelRunOnUIThread(g3Var);
                            AndroidUtilities.runOnUIThread(g3Var);
                        }
                        this.f32285i = ((int) (this.d - (y3 - f7))) / 2;
                    } else if (y3 >= this.e && y3 <= this.f32283f) {
                        this.f32284g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(g3Var);
                            AndroidUtilities.runOnUIThread(g3Var);
                        }
                        this.f32285i = ((int) ((y3 + this.f32283f) - (this.e + i11))) / 2;
                    } else if (this.f32284g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(g3Var);
                        this.f32284g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f32281b != i10) {
                    this.f32281b = i10;
                    qm0Var.c(E, !qm0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f32282c = false;
        this.f32284g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(g3Var);
        qm0Var.a(false);
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
        if (this.f32282c && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f32280a = recyclerView;
            int i10 = this.f32286j;
            if (i10 > -1) {
                this.d = i10;
                this.e = recyclerView.getMeasuredHeight() - i10;
                this.f32283f = recyclerView.getMeasuredHeight();
            }
        }
        if (z11 && motionEvent.getAction() == 1) {
            this.f32282c = false;
            this.f32284g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f32288l);
            this.f32287k.a(false);
        }
        return z11;
    }

    public final void d(View view, int i10, boolean z10) {
        if (this.f32282c) {
            return;
        }
        this.f32281b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f32288l);
        this.f32284g = false;
        this.h = false;
        qm0 qm0Var = this.f32287k;
        if (!qm0Var.b(i10)) {
            this.f32282c = false;
            return;
        }
        qm0Var.a(true);
        qm0Var.c(view, z10);
        this.f32282c = true;
        this.f32281b = i10;
    }

    @Override
    public final void c(boolean z10) {
    }
}
