package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gp extends org.telegram.ui.Components.k80 {
    public final Context f33970w;
    public final kp f33971x;

    public gp(kp kpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f33971x = kpVar;
        this.f33970w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.i80 i80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        kp kpVar = this.f33971x;
        if (kpVar.V && (chatFull = kpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (kpVar.f35211a0) {
                if (z10) {
                    str = "ApproveNewMembersEnableForLinksChannel";
                } else {
                    str = "ApproveNewMembersDisableForLinksChannel";
                }
            } else if (z10) {
                str = "ApproveNewMembersEnableForLinks";
            } else {
                str = "ApproveNewMembersDisableForLinks";
            }
            Context context = this.f33970w;
            e6Var = ((org.telegram.ui.ActionBar.n2) kpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f18437a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final gp f33631b;

                {
                    this.f33631b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            gp gpVar = this.f33631b;
                            gpVar.setJoinRequest(z11);
                            gpVar.f33971x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            gp gpVar2 = this.f33631b;
                            gpVar2.setJoinRequest(z12);
                            gpVar2.f33971x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final gp f33631b;

                {
                    this.f33631b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            gp gpVar = this.f33631b;
                            gpVar.setJoinRequest(z11);
                            gpVar.f33971x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            gp gpVar2 = this.f33631b;
                            gpVar2.setJoinRequest(z12);
                            gpVar2.f33971x.W = false;
                            return;
                    }
                }
            });
            kpVar.showDialog(alertDialog$Builder.f18437a);
            return false;
        }
        return true;
    }
}
