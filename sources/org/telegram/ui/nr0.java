package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class nr0 extends org.telegram.ui.Cells.b6 {
    public final or0 G;

    public nr0(or0 or0Var, Context context, int i7, j40 j40Var) {
        super(context, i7, j40Var, null);
        this.G = or0Var;
    }

    @Override
    public final boolean f() {
        v4.e1 T;
        qr0 qr0Var = this.G.d;
        f61 f61Var = qr0Var.f51285c;
        View F = f61Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i7 = qr0Var.E;
            if (i7 == qr0Var.f51298n && b10 == (qr0Var.f51300o0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(org.telegram.ui.Cells.b6 b6Var) {
        v4.e1 T;
        int b10;
        qr0 qr0Var = this.G.d;
        f61 f61Var = qr0Var.f51285c;
        View F = f61Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return qr0Var.f51312x[b10 - qr0Var.f51300o0];
        }
        return false;
    }

    @Override
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                bn.C8(menu, this.G.d.f51290f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        v4.e1 T;
        int b10;
        qr0 qr0Var = this.G.d;
        qr0Var.f51285c.getChildCount();
        if (z10 && qr0Var.M) {
            Arrays.fill(qr0Var.f51312x, false);
            for (int i7 = qr0Var.f51300o0; i7 < qr0Var.f51300o0 + qr0Var.E; i7++) {
                v4.e1 K = qr0Var.f51285c.K(i7);
                if (K != null) {
                    View view = K.f59111a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).f30445r.a(false, true);
                    }
                }
            }
        }
        super.i(b6Var, z10);
        f61 f61Var = qr0Var.f51285c;
        View F = f61Var.F(b6Var);
        if (F == null) {
            T = null;
        } else {
            T = f61Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            qr0Var.f51312x[b10 - qr0Var.f51300o0] = z10;
        }
        qr0Var.n0();
    }

    @Override
    public final void j(boolean z10) {
        qr0.i0(this.G.d, this, z10);
    }

    @Override
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        qr0.j0(this.G.d, b6Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        qr0 qr0Var = this.G.d;
        if (!arrayList.isEmpty()) {
            qr0Var.f51285c.getClass();
            int R = RecyclerView.R(this) - qr0Var.f51300o0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < qr0Var.f51298n) {
                    for (int length = qr0Var.f51310w.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = qr0Var.f51310w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    qr0Var.f51310w[i7] = (CharSequence) arrayList.remove(0);
                    qr0Var.E++;
                    i7++;
                }
                qr0Var.w0();
                qr0Var.f51293h0 = (qr0Var.f51300o0 + i7) - 1;
                qr0Var.f51283b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.G.d.M;
    }
}
