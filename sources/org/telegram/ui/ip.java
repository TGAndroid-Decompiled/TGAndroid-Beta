package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ip extends org.telegram.ui.Components.ll0 {
    public final jp f34640c;

    public ip(jp jpVar) {
        this.f34640c = jpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42700f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34640c.f34916a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f34640c.f34916a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        jp jpVar = this.f34640c;
        kp kpVar = jpVar.f34916a3;
        int i11 = c1Var.f42700f;
        View view = c1Var.f42697a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(jpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f18826b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) kpVar.N.get(i10 - 1);
            pa paVar = (pa) view;
            if (paVar.H) {
                kpVar.O = null;
            }
            if (i10 < kpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            paVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                kpVar.O = paVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, jpVar.f26191p2));
        l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jp jpVar = this.f34640c;
        org.telegram.ui.ActionBar.f6 f6Var = jpVar.f26191p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(jpVar.getContext(), 12, f6Var));
            }
            return new s4.c1(new ia(this, jpVar.getContext(), f6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.l4(jpVar.getContext(), f6Var));
    }
}
