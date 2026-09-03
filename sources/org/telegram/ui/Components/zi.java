package org.telegram.ui.Components;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
public final class zi extends f2.w {
    public final int Q;
    public final KeyEvent.Callback R;

    public zi(ei eiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = eiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 2:
                if (((xx0) this.R).T != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        switch (this.Q) {
            case 3:
                if (((ph.l) this.R).f44423b) {
                    i10 = 0;
                }
                return super.o0(i10, fVar, j1Var);
            default:
                return super.o0(i10, fVar, j1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.Q) {
            case 0:
                yi yiVar = new yi(this, recyclerView.getContext());
                yiVar.f5805a = i10;
                w0(yiVar);
                return;
            case 1:
                xl xlVar = new xl(this, recyclerView.getContext());
                xlVar.f5805a = i10;
                w0(xlVar);
                return;
            default:
                super.v0(recyclerView, j1Var, i10);
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

    public zi(xx0 xx0Var) {
        super(5);
        this.Q = 2;
        this.R = xx0Var;
    }

    public zi(ph.l lVar) {
        super(3);
        this.Q = 3;
        this.R = lVar;
    }
}
