package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class ev0 extends org.telegram.ui.Cells.d6 {
    public final fv0 F;

    public ev0(fv0 fv0Var, Context context, int i10, w50 w50Var) {
        super(context, i10, w50Var, null);
        this.F = fv0Var;
    }

    @Override
    public final boolean e() {
        s4.b1 T;
        hv0 hv0Var = this.F.d;
        wa1 wa1Var = hv0Var.f38034c;
        View F = wa1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = hv0Var.f38062y;
            if (i10 == hv0Var.f38046n && b10 == (hv0Var.f38047n0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        s4.b1 T;
        int b10;
        hv0 hv0Var = this.F.d;
        wa1 wa1Var = hv0Var.f38034c;
        View F = wa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return hv0Var.f38058w[b10 - hv0Var.f38047n0];
        }
        return false;
    }

    @Override
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                sn.n8(menu, this.F.d.f38038f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        s4.b1 T;
        int b10;
        hv0 hv0Var = this.F.d;
        hv0Var.f38034c.getChildCount();
        if (z10 && hv0Var.L) {
            Arrays.fill(hv0Var.f38058w, false);
            for (int i10 = hv0Var.f38047n0; i10 < hv0Var.f38047n0 + hv0Var.f38062y; i10++) {
                s4.b1 K = hv0Var.f38034c.K(i10);
                if (K != null) {
                    View view = K.f46342a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).f22283r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wa1 wa1Var = hv0Var.f38034c;
        View F = wa1Var.F(d6Var);
        if (F == null) {
            T = null;
        } else {
            T = wa1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            hv0Var.f38058w[b10 - hv0Var.f38047n0] = z10;
        }
        hv0Var.i0();
    }

    @Override
    public final void i(boolean z10) {
        hv0.d0(this.F.d, this, z10);
    }

    @Override
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        hv0.e0(this.F.d, d6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.F.d;
        if (!arrayList.isEmpty()) {
            hv0Var.f38034c.getClass();
            int R = RecyclerView.R(this) - hv0Var.f38047n0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < hv0Var.f38046n) {
                    for (int length = hv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = hv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    hv0Var.f38062y++;
                    i10++;
                }
                hv0Var.r0();
                hv0Var.f38040g0 = (hv0Var.f38047n0 + i10) - 1;
                hv0Var.f38032b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.F.d.L;
    }
}
