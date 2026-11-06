package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bo extends org.telegram.ui.Components.f70 {
    public final Context f44455x;
    public final go f44456y;

    public bo(go goVar, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.f44456y = goVar;
        this.f44455x = context2;
    }

    @Override
    public final boolean a(final boolean z9, org.telegram.ui.Components.d70 d70Var) {
        TLRPC.ChatFull chatFull;
        int i7;
        String str;
        org.telegram.ui.ActionBar.f6 f6Var;
        go goVar = this.f44456y;
        if (!goVar.V || (chatFull = goVar.Y) == null || (i7 = chatFull.invitesCount) == 0) {
            return true;
        }
        if (goVar.f46046a0) {
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
        Context context = this.f44455x;
        f6Var = ((org.telegram.ui.ActionBar.f2) goVar).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        String M0 = org.telegram.messenger.hd.M0(2131754204, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, str, new Object[0]));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754206, null), new org.telegram.ui.ActionBar.r1(this) {
            public final bo f44061b;

            {
                this.f44061b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z10 = z9;
                        bo boVar = this.f44061b;
                        boVar.setJoinRequest(z10);
                        boVar.f44456y.W = true;
                        return;
                    default:
                        boolean z11 = z9;
                        bo boVar2 = this.f44061b;
                        boVar2.setJoinRequest(z11);
                        boVar2.f44456y.W = false;
                        return;
                }
            }
        });
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131754205, null), new org.telegram.ui.ActionBar.r1(this) {
            public final bo f44061b;

            {
                this.f44061b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                switch (r3) {
                    case 0:
                        boolean z10 = z9;
                        bo boVar = this.f44061b;
                        boVar.setJoinRequest(z10);
                        boVar.f44456y.W = true;
                        return;
                    default:
                        boolean z11 = z9;
                        bo boVar2 = this.f44061b;
                        boVar2.setJoinRequest(z11);
                        boVar2.f44456y.W = false;
                        return;
                }
            }
        });
        goVar.showDialog(u1Var);
        return false;
    }
}
