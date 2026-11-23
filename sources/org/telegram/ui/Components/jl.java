package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jl extends v4.t0 {
    public final int f36511a;
    public final ml f36512b;

    public jl(ml mlVar, int i7) {
        this.f36511a = i7;
        this.f36512b = mlVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        mj0 mj0Var;
        switch (this.f36511a) {
            case 0:
                ml mlVar = this.f36512b;
                di.b1 b1Var = mlVar.M;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mlVar.I = z10;
                if (!z10 && mlVar.G != null) {
                    mlVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ui uiVar = mlVar.f37477b;
                    int i10 = uiVar.f30176t0;
                    if (((uiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.f59111a;
                        if (view.getTop() > 0) {
                            b1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    ml mlVar2 = this.f36512b;
                    if (mlVar2.f37507d0 && mlVar2.f37508e0) {
                        org.telegram.messenger.g0.v1(mlVar2.f37477b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f36511a) {
            case 0:
                ml mlVar = this.f36512b;
                mlVar.i0();
                if (mlVar.G != null) {
                    mlVar.H += i10;
                }
                mlVar.f37477b.N1(mlVar, i10);
                return;
            default:
                return;
        }
    }
}
