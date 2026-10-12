package org.telegram.ui.Components;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.kc1;
public final class fo extends org.telegram.ui.Cells.d6 {
    public final go F;

    public fo(go goVar, Context context, int i10, yn ynVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, ynVar, c6Var);
        this.F = goVar;
    }

    @Override
    public final boolean d() {
        s4.b1 T;
        io ioVar = this.F.d;
        kc1 kc1Var = ioVar.f26031s;
        View F = kc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = ioVar.M;
            if (i10 == ioVar.J && b10 == (ioVar.f26033t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        io ioVar = this.F.d;
        kc1 kc1Var = ioVar.f26031s;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return ioVar.L[b10 - ioVar.f26033t0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        io ioVar = this.F.d;
        if (ioVar.f26024n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) ioVar.f27671b.f30001f0).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        io ioVar = this.F.d;
        if (z10 && ioVar.f26005c0 && !ioVar.f26003b0) {
            Arrays.fill(ioVar.L, false);
            ioVar.f26031s.getChildCount();
            for (int i10 = ioVar.f26033t0; i10 < ioVar.f26033t0 + ioVar.M; i10++) {
                s4.b1 K = ioVar.f26031s.K(i10);
                if (K != null) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f21074r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = ioVar.f26031s;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            ioVar.L[b10 - ioVar.f26033t0] = z10;
        }
        ioVar.W();
    }

    @Override
    public final void i(boolean z10) {
        io.P(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        io.Q(this.F.d, d6Var);
    }

    @Override
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.f27671b.w1(c6Var, true);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        io ioVar = this.F.d;
        if (!arrayList.isEmpty()) {
            ioVar.f26031s.getClass();
            int R = RecyclerView.R(this) - ioVar.f26033t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < ioVar.J) {
                    for (int length = ioVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = ioVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    ioVar.K[i10] = (CharSequence) arrayList.remove(0);
                    ioVar.M++;
                    i10++;
                }
                ioVar.k0();
                ioVar.f26021k0 = (ioVar.f26033t0 + i10) - 1;
                ioVar.f26031s.setItemAnimator(ioVar.v);
                ioVar.f26029r.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.f26005c0;
    }
}
