package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class eo extends org.telegram.ui.Components.v70 {
    public final Context f47316x;
    public final io f47317y;

    public eo(io ioVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f47317y = ioVar;
        this.f47316x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.t70 t70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.h6 h6Var;
        io ioVar = this.f47317y;
        if (!ioVar.W || (chatFull = ioVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (ioVar.f48780b0) {
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
        Context context = this.f47316x;
        h6Var = ((org.telegram.ui.ActionBar.g2) ioVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = org.telegram.messenger.hd.N0(2131754201, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754203, null), new org.telegram.ui.ActionBar.q1(this) {
            public final eo f46615b;

            {
                this.f46615b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.f46615b;
                        eoVar.setJoinRequest(z11);
                        eoVar.f47317y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.f46615b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.f47317y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131754202, null), new org.telegram.ui.ActionBar.q1(this) {
            public final eo f46615b;

            {
                this.f46615b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        eo eoVar = this.f46615b;
                        eoVar.setJoinRequest(z11);
                        eoVar.f47317y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        eo eoVar2 = this.f46615b;
                        eoVar2.setJoinRequest(z12);
                        eoVar2.f47317y.X = false;
                        return;
                }
            }
        });
        ioVar.showDialog(t1Var);
        return false;
    }
}
