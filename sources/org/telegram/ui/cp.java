package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cp extends org.telegram.ui.Components.x80 {
    public final Context f32767w;
    public final gp f32768x;

    public cp(gp gpVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f32768x = gpVar;
        this.f32767w = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.v80 v80Var) {
        TLRPC.ChatFull chatFull;
        int i10;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        gp gpVar = this.f32768x;
        if (gpVar.V && (chatFull = gpVar.Y) != null && (i10 = chatFull.invitesCount) != 0) {
            if (gpVar.f33986a0) {
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
            Context context = this.f32767w;
            e6Var = ((org.telegram.ui.ActionBar.o2) gpVar).resourceProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            alertDialog$Builder.f18655a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i10, new Object[0]));
            alertDialog$Builder.k(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new org.telegram.ui.ActionBar.b2(this) {
                public final cp f32401b;

                {
                    this.f32401b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            cp cpVar = this.f32401b;
                            cpVar.setJoinRequest(z11);
                            cpVar.f32768x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            cp cpVar2 = this.f32401b;
                            cpVar2.setJoinRequest(z12);
                            cpVar2.f32768x.W = false;
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new org.telegram.ui.ActionBar.b2(this) {
                public final cp f32401b;

                {
                    this.f32401b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            cp cpVar = this.f32401b;
                            cpVar.setJoinRequest(z11);
                            cpVar.f32768x.W = true;
                            return;
                        default:
                            boolean z12 = z10;
                            cp cpVar2 = this.f32401b;
                            cpVar2.setJoinRequest(z12);
                            cpVar2.f32768x.W = false;
                            return;
                    }
                }
            });
            gpVar.showDialog(alertDialog$Builder.f18655a);
            return false;
        }
        return true;
    }
}
