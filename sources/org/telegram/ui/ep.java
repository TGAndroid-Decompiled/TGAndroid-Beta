package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep extends org.telegram.ui.Components.m90 {
    public final Context f37301w;
    public final ip f37302x;

    public ep(ip ipVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37302x = ipVar;
        this.f37301w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.k90 k90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        ip ipVar = this.f37302x;
        if (ipVar.V && (chatFull = ipVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (ipVar.f38707a0) {
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
            Context context = this.f37301w;
            e6Var = ((org.telegram.ui.ActionBar.n2) ipVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37055b;

                {
                    this.f37055b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37055b;
                            epVar.setJoinRequest(z11);
                            epVar.f37302x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37055b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37302x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.a2(this) {
                public final ep f37055b;

                {
                    this.f37055b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37055b;
                            epVar.setJoinRequest(z11);
                            epVar.f37302x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37055b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37302x.W = false;
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
