package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wb1;
public final class sn extends org.telegram.ui.Cells.d6 {
    public final tn F;

    public sn(tn tnVar, Context context, int i10, mn mnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, mnVar, d6Var);
        this.F = tnVar;
    }

    @Override
    public final boolean e() {
        s4.c1 T;
        vn vnVar = this.F.d;
        wb1 wb1Var = vnVar.f28805s;
        View F = wb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = vnVar.M;
            if (i10 == vnVar.J && b10 == (vnVar.f28807t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.c1 T;
        int b10;
        vn vnVar = this.F.d;
        wb1 wb1Var = vnVar.f28805s;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return vnVar.L[b10 - vnVar.f28807t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        vn vnVar = this.F.d;
        if (vnVar.f28798n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) vnVar.f26744b.f29665f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.c1 T;
        int b10;
        vn vnVar = this.F.d;
        if (z10 && vnVar.f28779c0 && !vnVar.f28777b0) {
            Arrays.fill(vnVar.L, false);
            vnVar.f28805s.getChildCount();
            for (int i10 = vnVar.f28807t0; i10 < vnVar.f28807t0 + vnVar.M; i10++) {
                s4.c1 K = vnVar.f28805s.K(i10);
                if (K != null) {
                    View view = K.f42627a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f19866r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = vnVar.f28805s;
        View F = wb1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            vnVar.L[b10 - vnVar.f28807t0] = z10;
        }
        vnVar.T();
    }

    @Override
    public final void i(boolean z10) {
        vn.M(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        vn.N(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f26744b.t1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        vn vnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            vnVar.f28805s.getClass();
            int R = RecyclerView.R(this) - vnVar.f28807t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < vnVar.J) {
                    for (int length = vnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = vnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    vnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    vnVar.M++;
                    i10++;
                }
                vnVar.h0();
                vnVar.f28795k0 = (vnVar.f28807t0 + i10) - 1;
                vnVar.f28805s.setItemAnimator(vnVar.v);
                vnVar.f28803r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f28779c0;
    }
}
