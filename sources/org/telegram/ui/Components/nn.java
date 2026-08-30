package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.jb1;
public final class nn extends org.telegram.ui.Cells.c6 {
    public final on C;

    public nn(on onVar, Context context, int i10, in inVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, inVar, f6Var);
        this.C = onVar;
    }

    @Override
    public final boolean e() {
        f2.l1 T;
        qn qnVar = this.C.d;
        jb1 jb1Var = qnVar.f28188s;
        View F = jb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = qnVar.J;
            if (i10 == qnVar.G && b10 == (qnVar.f28185q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.l1 T;
        int b10;
        qn qnVar = this.C.d;
        jb1 jb1Var = qnVar.f28188s;
        View F = jb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return qnVar.I[b10 - qnVar.f28185q0];
        }
        return false;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        qn qnVar = this.C.d;
        if (qnVar.f28181n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) qnVar.f24278b.f26689c0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.l1 T;
        int b10;
        qn qnVar = this.C.d;
        if (z4 && qnVar.W && !qnVar.V) {
            Arrays.fill(qnVar.I, false);
            qnVar.f28188s.getChildCount();
            for (int i10 = qnVar.f28185q0; i10 < qnVar.f28185q0 + qnVar.J; i10++) {
                f2.l1 K = qnVar.f28188s.K(i10);
                if (K != null) {
                    View view = K.f5785a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f20920r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        jb1 jb1Var = qnVar.f28188s;
        View F = jb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            qnVar.I[b10 - qnVar.f28185q0] = z4;
        }
        qnVar.T();
    }

    @Override
    public final void i(boolean z4) {
        qn.M(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.C.d, c6Var);
    }

    @Override
    public final void k(dh.b bVar) {
        this.C.d.f24278b.t1(bVar, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        qn qnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            qnVar.f28188s.getClass();
            int R = RecyclerView.R(this) - qnVar.f28185q0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < qnVar.G) {
                    for (int length = qnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = qnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    qnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    qnVar.J++;
                    i10++;
                }
                qnVar.h0();
                qnVar.f28174h0 = (qnVar.f28185q0 + i10) - 1;
                qnVar.f28188s.setItemAnimator(qnVar.v);
                qnVar.f28186r.l();
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
