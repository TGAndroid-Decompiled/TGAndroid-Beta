package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dp extends org.telegram.ui.Components.ql0 {
    public final ep f33509c;

    public dp(ep epVar) {
        this.f33509c = epVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33509c.X2.K.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f33509c.X2.K.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        ep epVar = this.f33509c;
        fp fpVar = epVar.X2;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                    z8Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(epVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) fpVar.K.get(i10 - 1);
            oa oaVar = (oa) view;
            if (oaVar.E) {
                fpVar.L = null;
            }
            if (i10 < fpVar.K.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            oaVar.a(tL_username, z4, false, 0L);
            if (tL_username != null && tL_username.editable) {
                fpVar.L = oaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, epVar.f28511m2));
        l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ep epVar = this.f33509c;
        org.telegram.ui.ActionBar.f6 f6Var = epVar.f28511m2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new f2.l1(new org.telegram.ui.Cells.z8(epVar.getContext(), 12, f6Var));
            }
            return new f2.l1(new ha(this, epVar.getContext(), f6Var));
        }
        return new f2.l1(new org.telegram.ui.Cells.l4(epVar.getContext(), f6Var));
    }
}
