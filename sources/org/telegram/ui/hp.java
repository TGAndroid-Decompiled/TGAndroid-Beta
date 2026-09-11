package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hp extends org.telegram.ui.Components.k80 {
    public final Context f37077w;
    public final lp f37078x;

    public hp(lp lpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37078x = lpVar;
        this.f37077w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.i80 i80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        lp lpVar = this.f37078x;
        if (lpVar.V && (chatFull = lpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (lpVar.f38424a0) {
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
            Context context = this.f37077w;
            f6Var = ((org.telegram.ui.ActionBar.n2) lpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20198a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final hp f36733b;

                {
                    this.f36733b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            hp hpVar = this.f36733b;
                            hpVar.setJoinRequest(z11);
                            hpVar.f37078x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            hp hpVar2 = this.f36733b;
                            hpVar2.setJoinRequest(z12);
                            hpVar2.f37078x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final hp f36733b;

                {
                    this.f36733b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            hp hpVar = this.f36733b;
                            hpVar.setJoinRequest(z11);
                            hpVar.f37078x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            hp hpVar2 = this.f36733b;
                            hpVar2.setJoinRequest(z12);
                            hpVar2.f37078x.W = false;
                            return;
                    }
                }
            });
            lpVar.showDialog(alertDialog$Builder.f20198a);
            return false;
        }
        return true;
    }
}
