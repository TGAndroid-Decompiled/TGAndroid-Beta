package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fo extends org.telegram.ui.Components.t70 {
    public final Context f47770x;
    public final jo f47771y;

    public fo(jo joVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f47771y = joVar;
        this.f47770x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.r70 r70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.i6 i6Var;
        jo joVar = this.f47771y;
        if (!joVar.W || (chatFull = joVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (joVar.f49021b0) {
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
        Context context = this.f47770x;
        i6Var = ((org.telegram.ui.ActionBar.h2) joVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = org.telegram.messenger.gd.M0(2131754202, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754204, null), new org.telegram.ui.ActionBar.r1(this) {
            public final fo f47319b;

            {
                this.f47319b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.f47319b;
                        foVar.setJoinRequest(z11);
                        foVar.f47771y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.f47319b;
                        foVar2.setJoinRequest(z12);
                        foVar2.f47771y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131754203, null), new org.telegram.ui.ActionBar.r1(this) {
            public final fo f47319b;

            {
                this.f47319b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.f47319b;
                        foVar.setJoinRequest(z11);
                        foVar.f47771y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.f47319b;
                        foVar2.setJoinRequest(z12);
                        foVar2.f47771y.X = false;
                        return;
                }
            }
        });
        joVar.showDialog(u1Var);
        return false;
    }
}
