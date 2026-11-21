package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class rn extends org.telegram.ui.Cells.b6 {
    public final org.telegram.ui.l4 G;

    public rn(org.telegram.ui.l4 l4Var, Context context, int i7, mn mnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, mnVar, h6Var);
        this.G = l4Var;
        ((tn) l4Var.f49470e).f39991s.getChildCount();
    }

    @Override
    public final boolean f() {
        v4.f1 T;
        tn tnVar = (tn) this.G.f49470e;
        org.telegram.ui.f61 f61Var = tnVar.f39991s;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = tnVar.N;
            if (i7 == tnVar.K && b10 == (tnVar.f39994u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.b6 b6Var) {
        v4.f1 T;
        int b10;
        tn tnVar = (tn) this.G.f49470e;
        org.telegram.ui.f61 f61Var = tnVar.f39991s;
        View F = f61Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return tnVar.M[b10 - tnVar.f39994u0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        tn tnVar = (tn) this.G.f49470e;
        if (tnVar.f39980n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) tnVar.f37521b.f40375a2).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        v4.f1 T;
        int b10;
        tn tnVar = (tn) this.G.f49470e;
        if (z10 && tnVar.f39962d0 && !tnVar.f39960c0) {
            Arrays.fill(tnVar.M, false);
            for (int i7 = tnVar.f39994u0; i7 < tnVar.f39994u0 + tnVar.N; i7++) {
                v4.f1 K = tnVar.f39991s.K(i7);
                if (K != null) {
                    View view = K.f59161a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).f30476r.a(false, true);
                    }
                }
            }
        }
        super.i(b6Var, z10);
        org.telegram.ui.f61 f61Var = tnVar.f39991s;
        View F = f61Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            tnVar.M[b10 - tnVar.f39994u0] = z10;
        }
        tnVar.Y();
    }

    @Override
    public final void j(boolean z10) {
        tn.R((tn) this.G.f49470e, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.G.f49470e, b6Var);
    }

    @Override
    public final void l(bi.u uVar) {
        ((tn) this.G.f49470e).f37521b.i1(uVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        tn tnVar = (tn) this.G.f49470e;
        if (!arrayList.isEmpty()) {
            tnVar.f39991s.getClass();
            int R = RecyclerView.R(this) - tnVar.f39994u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < tnVar.K) {
                    for (int length = tnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = tnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    tnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    tnVar.N++;
                    i7++;
                }
                tnVar.n0();
                tnVar.f39978l0 = (tnVar.f39994u0 + i7) - 1;
                tnVar.f39991s.setItemAnimator(tnVar.f39996w);
                tnVar.f39988r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((tn) this.G.f49470e).f39962d0;
    }
}
