package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kp extends org.telegram.ui.Components.ul0 {
    public final lp f34434c;

    public kp(lp lpVar) {
        this.f34434c = lpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34434c.f34749a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f34434c.f34749a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        lp lpVar = this.f34434c;
        mp mpVar = lpVar.f34749a3;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    f9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(lpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) mpVar.N.get(i10 - 1);
            oa oaVar = (oa) view;
            if (oaVar.H) {
                mpVar.O = null;
            }
            if (i10 < mpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            oaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                mpVar.O = oaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, lpVar.f27987p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lp lpVar = this.f34434c;
        org.telegram.ui.ActionBar.f6 f6Var = lpVar.f27987p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.f9(lpVar.getContext(), 12, f6Var));
            }
            return new s4.c1(new ha(this, lpVar.getContext(), f6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(lpVar.getContext(), f6Var));
    }
}
