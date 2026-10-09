package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep extends org.telegram.ui.Components.m90 {
    public final Context f37303w;
    public final ip f37304x;

    public ep(ip ipVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37304x = ipVar;
        this.f37303w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.k90 k90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        ip ipVar = this.f37304x;
        if (ipVar.V && (chatFull = ipVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (ipVar.f38709a0) {
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
            Context context = this.f37303w;
            e6Var = ((org.telegram.ui.ActionBar.n2) ipVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37057b;

                {
                    this.f37057b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37057b;
                            epVar.setJoinRequest(z11);
                            epVar.f37304x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37057b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37304x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37057b;

                {
                    this.f37057b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37057b;
                            epVar.setJoinRequest(z11);
                            epVar.f37304x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37057b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37304x.W = false;
                            return;
                    }
                }
            });
            ipVar.showDialog(alertDialog$Builder.f20374a);
            return false;
        }
        return true;
    }
}
