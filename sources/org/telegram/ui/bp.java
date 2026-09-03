package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bp extends org.telegram.ui.Components.m80 {
    public final Context f32929w;
    public final fp f32930x;

    public bp(fp fpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f32930x = fpVar;
        this.f32929w = context2;
    }

    @Override
    public final boolean a(final boolean z4, org.telegram.ui.Components.k80 k80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        fp fpVar = this.f32930x;
        if (fpVar.S && (chatFull = fpVar.V) != null && (i10 = chatFull.invitesCount) != 0) {
            if (fpVar.X) {
                if (z4) {
                    str = "ApproveNewMembersEnableForLinksChannel";
                } else {
                    str = "ApproveNewMembersDisableForLinksChannel";
                }
            } else if (z4) {
                str = "ApproveNewMembersEnableForLinks";
            } else {
                str = "ApproveNewMembersDisableForLinks";
            }
            Context context = this.f32929w;
            f6Var = ((org.telegram.ui.ActionBar.p2) fpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) {
                public final bp f32620b;

                {
                    this.f32620b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            bp bpVar = this.f32620b;
                            bpVar.setJoinRequest(z10);
                            bpVar.f32930x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            bp bpVar2 = this.f32620b;
                            bpVar2.setJoinRequest(z11);
                            bpVar2.f32930x.T = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) {
                public final bp f32620b;

                {
                    this.f32620b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z10 = z4;
                            bp bpVar = this.f32620b;
                            bpVar.setJoinRequest(z10);
                            bpVar.f32930x.T = true;
                            return;
                        default:
                            boolean z11 = z4;
                            bp bpVar2 = this.f32620b;
                            bpVar2.setJoinRequest(z11);
                            bpVar2.f32930x.T = false;
                            return;
                    }
                }
            });
            fpVar.showDialog(alertDialog$Builder.f19478a);
            return false;
        }
        return true;
    }
}
