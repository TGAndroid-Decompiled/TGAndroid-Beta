package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class eo extends org.telegram.ui.Components.s70 {
    public final Context f47596x;
    public final io f47597y;

    public eo(io ioVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f47597y = ioVar;
        this.f47596x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.q70 q70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.i6 i6Var;
        io ioVar = this.f47597y;
        if (!ioVar.W || (chatFull = ioVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (ioVar.f48864b0) {
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
        Context context = this.f47596x;
        i6Var = ((org.telegram.ui.ActionBar.g2) ioVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String N0 = org.telegram.messenger.gd.N0(2131754201, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754203, null), new org.telegram.ui.ActionBar.q1(this) {
            public final eo f46839b;

            {
                this.f46839b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.f46839b;
                        eoVar.setJoinRequest(z11);
                        eoVar.f47597y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.f46839b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.f47597y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131754202, null), new org.telegram.ui.ActionBar.q1(this) {
            public final eo f46839b;

            {
                this.f46839b = this;
            }

            @Override
            public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.f46839b;
                        eoVar.setJoinRequest(z11);
                        eoVar.f47597y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.f46839b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.f47597y.X = false;
                        return;
                }
            }
        });
        ioVar.showDialog(t1Var);
        return false;
    }
}
