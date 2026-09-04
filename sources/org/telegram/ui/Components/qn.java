package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ec1;
public final class qn extends org.telegram.ui.Cells.c6 {
    public final rn F;

    public qn(rn rnVar, Context context, int i10, kn knVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, knVar, f6Var);
        this.F = rnVar;
    }

    @Override
    public final boolean d() {
        s4.c1 T;
        tn tnVar = this.F.d;
        ec1 ec1Var = tnVar.f30654s;
        View F = ec1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = tnVar.M;
            if (i10 == tnVar.J && b10 == (tnVar.f30656t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        s4.c1 T;
        int b10;
        tn tnVar = this.F.d;
        ec1 ec1Var = tnVar.f30654s;
        View F = ec1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return tnVar.L[b10 - tnVar.f30656t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        tn tnVar = this.F.d;
        if (tnVar.f30647n && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) tnVar.f28753b.f31279f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        s4.c1 T;
        int b10;
        tn tnVar = this.F.d;
        if (z10 && tnVar.f30628c0 && !tnVar.f30626b0) {
            Arrays.fill(tnVar.L, false);
            tnVar.f30654s.getChildCount();
            for (int i10 = tnVar.f30656t0; i10 < tnVar.f30656t0 + tnVar.M; i10++) {
                s4.c1 K = tnVar.f30654s.K(i10);
                if (K != null) {
                    View view = K.f45738a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f21688r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ec1 ec1Var = tnVar.f30654s;
        View F = ec1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = ec1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            tnVar.L[b10 - tnVar.f30656t0] = z10;
        }
        tnVar.T();
    }

    @Override
    public final void i(boolean z10) {
        tn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        tn.N(this.F.d, c6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.f28753b.t1(b6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        tn tnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            tnVar.f30654s.getClass();
            int R = RecyclerView.R(this) - tnVar.f30656t0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < tnVar.J) {
                    for (int length = tnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = tnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    tnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    tnVar.M++;
                    i10++;
                }
                tnVar.h0();
                tnVar.f30644k0 = (tnVar.f30656t0 + i10) - 1;
                tnVar.f30654s.setItemAnimator(tnVar.v);
                tnVar.f30652r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f30628c0;
    }
}
