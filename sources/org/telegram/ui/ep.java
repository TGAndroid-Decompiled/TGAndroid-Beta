package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ep extends org.telegram.ui.Components.m90 {
    public final Context f37447w;
    public final ip f37448x;

    public ep(ip ipVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37448x = ipVar;
        this.f37447w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.k90 k90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        ip ipVar = this.f37448x;
        if (ipVar.V && (chatFull = ipVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (ipVar.f38770a0) {
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
            Context context = this.f37447w;
            d6Var = ((org.telegram.ui.ActionBar.m2) ipVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20404a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) {
                public final ep f37094b;

                {
                    this.f37094b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37094b;
                            epVar.setJoinRequest(z11);
                            epVar.f37448x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37094b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37448x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) {
                public final ep f37094b;

                {
                    this.f37094b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ep epVar = this.f37094b;
                            epVar.setJoinRequest(z11);
                            epVar.f37448x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ep epVar2 = this.f37094b;
                            epVar2.setJoinRequest(z12);
                            epVar2.f37448x.W = false;
                            return;
                    }
                }
            });
            ipVar.showDialog(alertDialog$Builder.f20404a);
            return false;
        }
        return true;
    }
}
