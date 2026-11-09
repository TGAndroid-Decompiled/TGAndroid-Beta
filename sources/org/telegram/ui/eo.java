package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class eo extends org.telegram.ui.Components.g70 {
    public final Context f45477x;
    public final io f45478y;

    public eo(io ioVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f45478y = ioVar;
        this.f45477x = context2;
    }

    @Override
    public final boolean a(final boolean z9, org.telegram.ui.Components.e70 e70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.g6 g6Var;
        io ioVar = this.f45478y;
        if (!ioVar.V || (chatFull = ioVar.Y) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (ioVar.f46709a0) {
            if (z9) {
                str = "ApproveNewMembersEnableForLinksChannel";
            } else {
                str = "ApproveNewMembersDisableForLinksChannel";
            }
        } else if (z9) {
            str = "ApproveNewMembersEnableForLinks";
        } else {
            str = "ApproveNewMembersDisableForLinks";
        }
        Context context = this.f45477x;
        g6Var = ((org.telegram.ui.ActionBar.f2) ioVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String M0 = org.telegram.messenger.id.M0(2131754204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754206, null), new org.telegram.ui.ActionBar.r1(this) {
            public final eo f44724b;

            {
                this.f44724b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z10 = z9;
                        eo eoVar = this.f44724b;
                        eoVar.setJoinRequest(z10);
                        eoVar.f45478y.W = true;
                        return;
                    default:
                        boolean z11 = z9;
                        eo eoVar2 = this.f44724b;
                        eoVar2.setJoinRequest(z11);
                        eoVar2.f45478y.W = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131754205, null), new org.telegram.ui.ActionBar.r1(this) {
            public final eo f44724b;

            {
                this.f44724b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z10 = z9;
                        eo eoVar = this.f44724b;
                        eoVar.setJoinRequest(z10);
                        eoVar.f45478y.W = true;
                        return;
                    default:
                        boolean z11 = z9;
                        eo eoVar2 = this.f44724b;
                        eoVar2.setJoinRequest(z11);
                        eoVar2.f45478y.W = false;
                        return;
                }
            }
        });
        ioVar.showDialog(u1Var);
        return false;
    }
}
