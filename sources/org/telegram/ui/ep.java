package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ep extends org.telegram.ui.Components.ll0 {
    public final fp f32994c;

    public ep(fp fpVar) {
        this.f32994c = fpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32994c.f33354a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f32994c.f33354a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        fp fpVar = this.f32994c;
        gp gpVar = fpVar.f33354a3;
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    f9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(fpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) gpVar.N.get(i10 - 1);
            na naVar = (na) view;
            if (naVar.H) {
                gpVar.O = null;
            }
            if (i10 < gpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            naVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                gpVar.O = naVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, fpVar.f26222p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        fp fpVar = this.f32994c;
        org.telegram.ui.ActionBar.d6 d6Var = fpVar.f26222p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.f9(fpVar.getContext(), 12, d6Var));
            }
            return new s4.c1(new ga(this, fpVar.getContext(), d6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(fpVar.getContext(), d6Var));
    }
}
