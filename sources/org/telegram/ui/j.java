package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class j extends f2.k0 {
    public final int I;

    public j(int i10) {
        this.I = i10;
    }

    @Override
    public int W0(f2.l1 l1Var) {
        switch (this.I) {
            case 3:
                return 5000;
            case 7:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(l1Var);
        }
    }

    @Override
    public boolean e() {
        switch (this.I) {
            case 20:
                return false;
            default:
                return super.e();
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.I) {
            case 2:
                sh.n nVar = new sh.n(recyclerView.getContext(), 0);
                nVar.f5731a = i10;
                w0(nVar);
                break;
            case 13:
                bs0 bs0Var = new bs0(recyclerView.getContext());
                bs0Var.f5731a = i10;
                w0(bs0Var);
                break;
            default:
                super.v0(recyclerView, l1Var, i10);
                break;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
            case 4:
            case 7:
            case 13:
            default:
                return super.y0();
            case 5:
                return false;
            case 6:
                return false;
            case 8:
                return true;
            case 9:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 14:
                return false;
            case 15:
                return false;
            case 16:
                return true;
            case 17:
                return false;
            case 18:
                return false;
            case 19:
                return false;
        }
    }

    public j(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public j(qb qbVar) {
        this.I = 2;
    }

    public j() {
        super(0, true);
        this.I = 13;
    }
}
