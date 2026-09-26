package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bp extends org.telegram.ui.Components.w80 {
    public final Context f32457w;
    public final fp f32458x;

    public bp(fp fpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f32458x = fpVar;
        this.f32457w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.u80 u80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.d6 d6Var;
        fp fpVar = this.f32458x;
        if (fpVar.V && (chatFull = fpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (fpVar.f33709a0) {
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
            Context context = this.f32457w;
            d6Var = ((org.telegram.ui.ActionBar.m2) fpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.z1(this) {
                public final bp f32207b;

                {
                    this.f32207b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            bp bpVar = this.f32207b;
                            bpVar.setJoinRequest(z11);
                            bpVar.f32458x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            bp bpVar2 = this.f32207b;
                            bpVar2.setJoinRequest(z12);
                            bpVar2.f32458x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.z1(this) {
                public final bp f32207b;

                {
                    this.f32207b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            bp bpVar = this.f32207b;
                            bpVar.setJoinRequest(z11);
                            bpVar.f32458x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            bp bpVar2 = this.f32207b;
                            bpVar2.setJoinRequest(z12);
                            bpVar2.f32458x.W = false;
                            return;
                    }
                }
            });
            fpVar.showDialog(alertDialog$Builder.f18661a);
            return false;
        }
        return true;
    }
}
