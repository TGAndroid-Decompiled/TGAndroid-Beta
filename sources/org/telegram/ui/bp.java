package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.Components.rl0 {
    public final cp f32996c;

    public bp(cp cpVar) {
        this.f32996c = cpVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32996c.X2.K.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f32996c.X2.K.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        cp cpVar = this.f32996c;
        dp dpVar = cpVar.X2;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(cpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) dpVar.K.get(i10 - 1);
            ma maVar = (ma) view;
            if (maVar.E) {
                dpVar.L = null;
            }
            if (i10 < dpVar.K.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            maVar.a(tL_username, z4, false, 0L);
            if (tL_username != null && tL_username.editable) {
                dpVar.L = maVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, cpVar.f28750m2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        cp cpVar = this.f32996c;
        org.telegram.ui.ActionBar.f6 f6Var = cpVar.f28750m2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new f2.l1(new org.telegram.ui.Cells.a9(cpVar.getContext(), 12, f6Var));
            }
            return new f2.l1(new fa(this, cpVar.getContext(), f6Var));
        }
        return new f2.l1(new org.telegram.ui.Cells.m4(cpVar.getContext(), f6Var));
    }
}
