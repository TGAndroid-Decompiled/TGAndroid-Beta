package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final dv0 C;

    public cv0(dv0 dv0Var, Context context, int i10, e60 e60Var) {
        super(context, i10, e60Var, null);
        this.C = dv0Var;
    }

    @Override
    public final boolean e() {
        f2.l1 T;
        fv0 fv0Var = this.C.d;
        jb1 jb1Var = fv0Var.f34376c;
        View F = jb1Var.F(this);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null) {
            int b10 = T.b();
            int i10 = fv0Var.f34404y;
            if (i10 == fv0Var.f34388n && b10 == (fv0Var.f34386k0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        f2.l1 T;
        int b10;
        fv0 fv0Var = this.C.d;
        jb1 jb1Var = fv0Var.f34376c;
        View F = jb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            return fv0Var.f34400w[b10 - fv0Var.f34386k0];
        }
        return false;
    }

    @Override
    public final void g(dh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                xn.k8(menu, this.C.d.f34380f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        f2.l1 T;
        int b10;
        fv0 fv0Var = this.C.d;
        if (z4 && fv0Var.I) {
            Arrays.fill(fv0Var.f34400w, false);
            fv0Var.f34376c.getChildCount();
            for (int i10 = fv0Var.f34386k0; i10 < fv0Var.f34386k0 + fv0Var.f34404y; i10++) {
                f2.l1 K = fv0Var.f34376c.K(i10);
                if (K != null) {
                    View view = K.f5785a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).f20920r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        jb1 jb1Var = fv0Var.f34376c;
        View F = jb1Var.F(c6Var);
        if (F == null) {
            T = null;
        } else {
            T = jb1Var.T(F);
        }
        if (T != null && (b10 = T.b()) != -1) {
            fv0Var.f34400w[b10 - fv0Var.f34386k0] = z4;
        }
        fv0Var.i0();
    }

    @Override
    public final void i(boolean z4) {
        fv0.d0(this.C.d, this, z4);
    }

    @Override
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.C.d, c6Var);
    }

    @Override
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.C.d;
        if (!arrayList.isEmpty()) {
            fv0Var.f34376c.getClass();
            int R = RecyclerView.R(this) - fv0Var.f34386k0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < fv0Var.f34388n) {
                    for (int length = fv0Var.v.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = fv0Var.v;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
                    fv0Var.f34404y++;
                    i10++;
                }
                fv0Var.r0();
                fv0Var.f34378d0 = (fv0Var.f34386k0 + i10) - 1;
                fv0Var.f34374b.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean o() {
        return this.C.d.I;
    }
}
