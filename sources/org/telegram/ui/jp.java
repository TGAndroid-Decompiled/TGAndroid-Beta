package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jp extends org.telegram.ui.Components.l90 {
    public final Context f37107w;
    public final np f37108x;

    public jp(np npVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f37108x = npVar;
        this.f37107w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.i90 i90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.c6 c6Var;
        np npVar = this.f37108x;
        if (npVar.V && (chatFull = npVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (npVar.f38433a0) {
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
            Context context = this.f37107w;
            c6Var = ((org.telegram.ui.ActionBar.m2) npVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) {
                public final jp f36849b;

                {
                    this.f36849b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            jp jpVar = this.f36849b;
                            jpVar.setJoinRequest(z11);
                            jpVar.f37108x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            jp jpVar2 = this.f36849b;
                            jpVar2.setJoinRequest(z12);
                            jpVar2.f37108x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) {
                public final jp f36849b;

                {
                    this.f36849b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            jp jpVar = this.f36849b;
                            jpVar.setJoinRequest(z11);
                            jpVar.f37108x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            jp jpVar2 = this.f36849b;
                            jpVar2.setJoinRequest(z12);
                            jpVar2.f37108x.W = false;
                            return;
                    }
                }
            });
            npVar.showDialog(alertDialog$Builder.f19248a);
            return false;
        }
        return true;
    }
}
