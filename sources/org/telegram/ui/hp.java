package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hp extends org.telegram.ui.Components.q90 {
    public final Context f38483w;
    public final lp f38484x;

    public hp(lp lpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f38484x = lpVar;
        this.f38483w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.o90 o90Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.c6 c6Var;
        lp lpVar = this.f38484x;
        if (lpVar.V && (chatFull = lpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (lpVar.f39798a0) {
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
            Context context = this.f38483w;
            c6Var = ((org.telegram.ui.ActionBar.m2) lpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f20141a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) {
                public final hp f38110b;

                {
                    this.f38110b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            hp hpVar = this.f38110b;
                            hpVar.setJoinRequest(z11);
                            hpVar.f38484x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            hp hpVar2 = this.f38110b;
                            hpVar2.setJoinRequest(z12);
                            hpVar2.f38484x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) {
                public final hp f38110b;

                {
                    this.f38110b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            hp hpVar = this.f38110b;
                            hpVar.setJoinRequest(z11);
                            hpVar.f38484x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            hp hpVar2 = this.f38110b;
                            hpVar2.setJoinRequest(z12);
                            hpVar2.f38484x.W = false;
                            return;
                    }
                }
            });
            lpVar.showDialog(alertDialog$Builder.f20141a);
            return false;
        }
        return true;
    }
}
