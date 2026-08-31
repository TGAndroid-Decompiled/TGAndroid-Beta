package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wl0 implements f2.z0 {
    public RecyclerView f32787a;
    public boolean f32789c;
    public int d;
    public int f32790e;
    public int f32791f;
    public boolean f32792g;
    public boolean h;
    public int f32793i;
    public final vl0 f32795k;
    public int f32788b = -1;
    public final int f32794j = AndroidUtilities.dp(80.0f);
    public final ul0 f32796l = new ul0(this, 0);

    public wl0(vl0 vl0Var) {
        this.f32795k = vl0Var;
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
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        vl0 vl0Var = this.f32795k;
        ul0 ul0Var = this.f32796l;
        if (action != 1) {
            if (action == 2) {
                if (this.f32794j > -1) {
                    float f10 = 0;
                    if (y10 >= f10 && y10 <= this.d) {
                        this.h = false;
                        if (!this.f32792g) {
                            this.f32792g = true;
                            AndroidUtilities.cancelRunOnUIThread(ul0Var);
                            AndroidUtilities.runOnUIThread(ul0Var);
                        }
                        this.f32793i = ((int) (this.d - (y10 - f10))) / 2;
                    } else if (y10 >= this.f32790e && y10 <= this.f32791f) {
                        this.f32792g = false;
                        if (!this.h) {
                            this.h = true;
                            AndroidUtilities.cancelRunOnUIThread(ul0Var);
                            AndroidUtilities.runOnUIThread(ul0Var);
                        }
                        this.f32793i = ((int) ((y10 + this.f32791f) - (this.f32790e + i11))) / 2;
                    } else if (this.f32792g || this.h) {
                        AndroidUtilities.cancelRunOnUIThread(ul0Var);
                        this.f32792g = false;
                        this.h = false;
                    }
                }
                if (i10 != -1 && this.f32788b != i10) {
                    this.f32788b = i10;
                    vl0Var.c(E, !vl0Var.d(i10));
                    return;
                }
                return;
            }
            return;
        }
        this.f32789c = false;
        this.f32792g = false;
        this.h = false;
        AndroidUtilities.cancelRunOnUIThread(ul0Var);
        vl0Var.a(false);
    }

    @Override
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().h() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.f32789c && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f32787a = recyclerView;
            int i10 = this.f32794j;
            if (i10 > -1) {
                this.d = i10;
                this.f32790e = recyclerView.getMeasuredHeight() - i10;
                this.f32791f = recyclerView.getMeasuredHeight();
            }
        }
        if (z10 && motionEvent.getAction() == 1) {
            this.f32789c = false;
            this.f32792g = false;
            this.h = false;
            AndroidUtilities.cancelRunOnUIThread(this.f32796l);
            this.f32795k.a(false);
        }
        return z10;
    }

    public final void d(View view, int i10, boolean z4) {
        if (this.f32789c) {
            return;
        }
        this.f32788b = -1;
        AndroidUtilities.cancelRunOnUIThread(this.f32796l);
        this.f32792g = false;
        this.h = false;
        vl0 vl0Var = this.f32795k;
        if (!vl0Var.b(i10)) {
            this.f32789c = false;
            return;
        }
        vl0Var.a(true);
        vl0Var.c(view, z4);
        this.f32789c = true;
        this.f32788b = i10;
    }

    @Override
    public final void c(boolean z4) {
    }
}
