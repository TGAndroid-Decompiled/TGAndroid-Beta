package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.rb1;
public final class mn extends org.telegram.ui.Cells.b6 {
    public final nn C;

    public mn(nn nnVar, Context context, int i10, hn hnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, hnVar, f6Var);
        this.C = nnVar;
    }

    @Override
    public final boolean e() {
        f2.l1 T;
        pn pnVar = this.C.d;
        rb1 rb1Var = pnVar.f27960s;
        View F = rb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = rb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = pnVar.J;
            if (i10 == pnVar.G && b10 == (pnVar.f27957q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.b6 b6Var) {
        f2.l1 T;
        int b10;
        pn pnVar = this.C.d;
        rb1 rb1Var = pnVar.f27960s;
        View F = rb1Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = rb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return pnVar.I[b10 - pnVar.f27957q0];
        }
        return false;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        pn pnVar = this.C.d;
        if (pnVar.f27953n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) pnVar.f24282b.f26685c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.b6 b6Var, boolean z4) {
        f2.l1 T;
        int b10;
        pn pnVar = this.C.d;
        if (z4 && pnVar.W && !pnVar.V) {
            Arrays.fill(pnVar.I, false);
            pnVar.f27960s.getChildCount();
            for (int i10 = pnVar.f27957q0; i10 < pnVar.f27957q0 + pnVar.J; i10++) {
                f2.l1 K = pnVar.f27960s.K(i10);
                if (K != null) {
                    View view = K.f5774a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).f20849r.a(false, true);
                    }
                }
            }
        }
        super.h(b6Var, z4);
        rb1 rb1Var = pnVar.f27960s;
        View F = rb1Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = rb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            pnVar.I[b10 - pnVar.f27957q0] = z4;
        }
        pnVar.T();
    }

    @Override
    public final void i(boolean z4) {
        pn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        pn.N(this.C.d, b6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.C.d.f24282b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        pn pnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            pnVar.f27960s.getClass();
            int R = RecyclerView.R(this) - pnVar.f27957q0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < pnVar.G) {
                    for (int length = pnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = pnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    pnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    pnVar.J++;
                    i10++;
                }
                pnVar.h0();
                pnVar.f27946h0 = (pnVar.f27957q0 + i10) - 1;
                pnVar.f27960s.setItemAnimator(pnVar.v);
                pnVar.f27958r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.C.d.W;
    }
}
