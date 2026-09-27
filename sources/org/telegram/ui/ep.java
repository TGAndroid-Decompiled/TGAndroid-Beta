package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ep extends org.telegram.ui.Components.xl0 {
    public final fp f33298c;

    public ep(fp fpVar) {
        this.f33298c = fpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33298c.f33603a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f33298c.f33603a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        fp fpVar = this.f33298c;
        gp gpVar = fpVar.f33603a3;
        int i11 = c1Var.f43008f;
        View view = c1Var.f43005a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(fpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f19021b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) gpVar.N.get(i10 - 1);
            qa qaVar = (qa) view;
            if (qaVar.H) {
                gpVar.O = null;
            }
            if (i10 < gpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                gpVar.O = qaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, fpVar.f30709p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fp fpVar = this.f33298c;
        org.telegram.ui.ActionBar.e6 e6Var = fpVar.f30709p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(fpVar.getContext(), 12, e6Var));
            }
            return new s4.c1(new ja(this, fpVar.getContext(), e6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(fpVar.getContext(), e6Var));
    }
}
