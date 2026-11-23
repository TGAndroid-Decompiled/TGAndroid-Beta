package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fo extends org.telegram.ui.Components.v70 {
    public final Context f47805x;
    public final jo f47806y;

    public fo(jo joVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f47806y = joVar;
        this.f47805x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.t70 t70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.h6 h6Var;
        jo joVar = this.f47806y;
        if (!joVar.W || (chatFull = joVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (joVar.f49035b0) {
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
        Context context = this.f47805x;
        h6Var = ((org.telegram.ui.ActionBar.g2) joVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = org.telegram.messenger.hd.N0(2131754201, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754203, null), new org.telegram.ui.ActionBar.q1(this) {
            public final fo f47348b;

            {
                this.f47348b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.f47348b;
                        foVar.setJoinRequest(z11);
                        foVar.f47806y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.f47348b;
                        foVar2.setJoinRequest(z12);
                        foVar2.f47806y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131754202, null), new org.telegram.ui.ActionBar.q1(this) {
            public final fo f47348b;

            {
                this.f47348b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        fo foVar = this.f47348b;
                        foVar.setJoinRequest(z11);
                        foVar.f47806y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        fo foVar2 = this.f47348b;
                        foVar2.setJoinRequest(z12);
                        foVar2.f47806y.X = false;
                        return;
                }
            }
        });
        joVar.showDialog(t1Var);
        return false;
    }
}
