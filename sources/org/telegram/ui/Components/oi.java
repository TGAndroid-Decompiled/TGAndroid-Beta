package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class oi extends s4.r {
    public final int Q;
    public final KeyEvent.Callback R;

    public oi(int i10, FrameLayout frameLayout) {
        super(3);
        this.Q = i10;
        this.R = frameLayout;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 2:
                if (((dx0) this.R).N1 != null && org.telegram.messenger.dd.X) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public void b0(hf.e eVar, s4.z0 z0Var) {
        switch (this.Q) {
            case 4:
                super.b0(eVar, z0Var);
                vh.k2 k2Var = (vh.k2) this.R;
                if (k2Var.U) {
                    k2Var.U = false;
                    k2Var.a();
                    return;
                }
                return;
            default:
                super.b0(eVar, z0Var);
                return;
        }
    }

    @Override
    public int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        switch (this.Q) {
            case 3:
                if (((uh.i) this.R).f50260b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                ni niVar = new ni(this, recyclerView.getContext());
                niVar.f48056a = i10;
                w0(niVar);
                return;
            case 1:
                vl vlVar = new vl(this, recyclerView.getContext());
                vlVar.f48056a = i10;
                w0(vlVar);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
            default:
                return super.y0();
            case 3:
                return false;
        }
    }

    public oi(uh uhVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = uhVar;
    }

    public oi(dx0 dx0Var) {
        super(5);
        this.Q = 2;
        this.R = dx0Var;
    }
}
