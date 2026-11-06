package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class eo extends org.telegram.ui.Components.oj0 {
    public final fo f45391c;

    public eo(fo foVar) {
        this.f45391c = foVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45391c.f45683h3.N.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 <= this.f45391c.f45683h3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        fo foVar = this.f45391c;
        go goVar = foVar.f45683h3;
        int i10 = d1Var.f56956f;
        View view = d1Var.f56952a;
        if (i10 != 0) {
            boolean z9 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.hd.M0(2131743644, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) goVar.N.get(i7 - 1);
            ia iaVar = (ia) view;
            if (iaVar.H) {
                goVar.O = null;
            }
            if (i7 >= goVar.N.size()) {
                z9 = false;
            }
            iaVar.a(tL_username, z9, false, 0L);
            if (tL_username != null && tL_username.editable) {
                goVar.O = iaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, n4Var, foVar.f36939n2);
        n4Var.setText(org.telegram.messenger.hd.M0(2131743645, null));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        fo foVar = this.f45391c;
        org.telegram.ui.ActionBar.f6 f6Var = foVar.f36939n2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return new v4.d1(new org.telegram.ui.Cells.z8(12, foVar.getContext(), f6Var));
            }
            return new v4.d1(new da(this, foVar.getContext(), f6Var));
        }
        return new v4.d1(new org.telegram.ui.Cells.n4(foVar.getContext(), f6Var));
    }
}
