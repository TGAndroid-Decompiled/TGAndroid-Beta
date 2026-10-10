package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep extends org.telegram.ui.Components.n90 {
    public final Context f37347w;
    public final ip f37348x;

    public ep(ip ipVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37348x = ipVar;
        this.f37347w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.l90 l90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        ip ipVar = this.f37348x;
        if (ipVar.V && (chatFull = ipVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (ipVar.f38753a0) {
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
            Context context = this.f37347w;
            e6Var = ((org.telegram.ui.ActionBar.n2) ipVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37101b;

                {
                    this.f37101b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37101b;
                            epVar.setJoinRequest(z11);
                            epVar.f37348x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37101b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37348x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37101b;

                {
                    this.f37101b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37101b;
                            epVar.setJoinRequest(z11);
                            epVar.f37348x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37101b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37348x.W = false;
                            return;
                    }
                }
            });
            ipVar.showDialog(alertDialog$Builder.f20378a);
            return false;
        }
        return true;
    }
}
