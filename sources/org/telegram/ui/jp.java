package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jp extends org.telegram.ui.Components.vm0 {
    public final kp f39262c;

    public jp(kp kpVar) {
        this.f39262c = kpVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47893f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39262c.Y2.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f39262c.Y2.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        kp kpVar = this.f39262c;
        lp lpVar = kpVar.Y2;
        int i11 = d1Var.f47893f;
        View view = d1Var.f47889a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(kpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) lpVar.N.get(i10 - 1);
            ra raVar = (ra) view;
            if (raVar.H) {
                lpVar.O = null;
            }
            if (i10 >= lpVar.N.size()) {
                z10 = false;
            }
            raVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                lpVar.O = raVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, kpVar.f32467n2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        kp kpVar = this.f39262c;
        org.telegram.ui.ActionBar.c6 c6Var = kpVar.f32467n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.d1(new org.telegram.ui.Cells.e9(kpVar.getContext(), 12, c6Var));
            }
            return new s4.d1(new ka(this, kpVar.getContext(), c6Var));
        }
        return new s4.d1(new org.telegram.ui.Cells.m4(kpVar.getContext(), c6Var));
    }
}
