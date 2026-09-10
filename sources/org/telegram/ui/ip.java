package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ip extends org.telegram.ui.Components.u80 {
    public final Context f33773w;
    public final mp f33774x;

    public ip(mp mpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f33774x = mpVar;
        this.f33773w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.s80 s80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        mp mpVar = this.f33774x;
        if (mpVar.V && (chatFull = mpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (mpVar.f35016a0) {
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
            Context context = this.f33773w;
            f6Var = ((org.telegram.ui.ActionBar.p2) mpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.c2(this) {
                public final ip f33432b;

                {
                    this.f33432b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ip ipVar = this.f33432b;
                            ipVar.setJoinRequest(z11);
                            ipVar.f33774x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ip ipVar2 = this.f33432b;
                            ipVar2.setJoinRequest(z12);
                            ipVar2.f33774x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.c2(this) {
                public final ip f33432b;

                {
                    this.f33432b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            ip ipVar = this.f33432b;
                            ipVar.setJoinRequest(z11);
                            ipVar.f33774x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            ip ipVar2 = this.f33432b;
                            ipVar2.setJoinRequest(z12);
                            ipVar2.f33774x.W = false;
                            return;
                    }
                }
            });
            mpVar.showDialog(alertDialog$Builder.f17528a);
            return false;
        }
        return true;
    }
}
