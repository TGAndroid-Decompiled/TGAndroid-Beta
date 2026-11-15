package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class co extends org.telegram.ui.Components.i70 {
    public final Context f46194x;
    public final ho f46195y;

    public co(ho hoVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f46195y = hoVar;
        this.f46194x = context2;
    }

    @Override
    public final boolean a(final boolean z10, org.telegram.ui.Components.g70 g70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        ho hoVar = this.f46195y;
        if (!hoVar.W || (chatFull = hoVar.Z) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (hoVar.f47751b0) {
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
        Context context = this.f46194x;
        e6Var = ((org.telegram.ui.ActionBar.e2) hoVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754204, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754206, null), new org.telegram.ui.ActionBar.q1(this) {
            public final co f45791b;

            {
                this.f45791b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        co coVar = this.f45791b;
                        coVar.setJoinRequest(z11);
                        coVar.f46195y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        co coVar2 = this.f45791b;
                        coVar2.setJoinRequest(z12);
                        coVar2.f46195y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131754205, null), new org.telegram.ui.ActionBar.q1(this) {
            public final co f45791b;

            {
                this.f45791b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        co coVar = this.f45791b;
                        coVar.setJoinRequest(z11);
                        coVar.f46195y.X = true;
                        return;
                    default:
                        boolean z12 = z10;
                        co coVar2 = this.f45791b;
                        coVar2.setJoinRequest(z12);
                        coVar2.f46195y.X = false;
                        return;
                }
            }
        });
        hoVar.showDialog(t1Var);
        return false;
    }
}
