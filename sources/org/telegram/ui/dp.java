package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dp extends org.telegram.ui.Components.y80 {
    public final Context f35820w;
    public final hp f35821x;

    public dp(hp hpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f35821x = hpVar;
        this.f35820w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.w80 w80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        hp hpVar = this.f35821x;
        if (hpVar.V && (chatFull = hpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (hpVar.f37126a0) {
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
            Context context = this.f35820w;
            d6Var = ((org.telegram.ui.ActionBar.n2) hpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20368a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final dp f35517b;

                {
                    this.f35517b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            dp dpVar = this.f35517b;
                            dpVar.setJoinRequest(z11);
                            dpVar.f35821x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            dp dpVar2 = this.f35517b;
                            dpVar2.setJoinRequest(z12);
                            dpVar2.f35821x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final dp f35517b;

                {
                    this.f35517b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            dp dpVar = this.f35517b;
                            dpVar.setJoinRequest(z11);
                            dpVar.f35821x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            dp dpVar2 = this.f35517b;
                            dpVar2.setJoinRequest(z12);
                            dpVar2.f35821x.W = false;
                            return;
                    }
                }
            });
            hpVar.showDialog(alertDialog$Builder.f20368a);
            return false;
        }
        return true;
    }
}
