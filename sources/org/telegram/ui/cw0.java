package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class cw0 extends org.telegram.ui.Cells.d6 {
    public final dw0 F;

    public cw0(dw0 dw0Var, Context context, int i10, t60 t60Var) {
        super(context, i10, t60Var, null);
        this.F = dw0Var;
    }

    @Override
    public final boolean d() {
        s4.b1 T;
        fw0 fw0Var = this.F.d;
        kc1 kc1Var = fw0Var.f35983c;
        View F = kc1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = fw0Var.f36011y;
            if (i10 == fw0Var.f35995n && b10 == (fw0Var.f35996n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        fw0 fw0Var = this.F.d;
        kc1 kc1Var = fw0Var.f35983c;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return fw0Var.f36007w[b10 - fw0Var.f35996n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                fo.n8(menu, this.F.d.f35987f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        fw0 fw0Var = this.F.d;
        if (z10 && fw0Var.L) {
            Arrays.fill(fw0Var.f36007w, false);
            fw0Var.f35983c.getChildCount();
            for (int i10 = fw0Var.f35996n0; i10 < fw0Var.f35996n0 + fw0Var.f36011y; i10++) {
                s4.b1 K = fw0Var.f35983c.K(i10);
                if (K != null) {
                    View view = K.f44838a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f20769r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = fw0Var.f35983c;
        View F = kc1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = kc1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            fw0Var.f36007w[b10 - fw0Var.f35996n0] = z10;
        }
        fw0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        fw0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fw0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fw0 fw0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            fw0Var.f35983c.getClass();
            int R = RecyclerView.R(this) - fw0Var.f35996n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < fw0Var.f35995n) {
                    for (int length = fw0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = fw0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fw0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    fw0Var.f36011y++;
                    i10++;
                }
                fw0Var.r0();
                fw0Var.f35989g0 = (fw0Var.f35996n0 + i10) - 1;
                fw0Var.f35981b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.F.d.L;
    }
}
