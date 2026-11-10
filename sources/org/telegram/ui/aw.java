package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class aw implements f50 {
    public final org.telegram.ui.ActionBar.u1 f43826a;
    public final zw f43827b;

    public aw(zw zwVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f43827b = zwVar;
        this.f43826a = u1Var;
    }

    @Override
    public final void e(g50 g50Var, final long j3) {
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {g50Var, null};
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) {
            public final aw f52121b;

            {
                this.f52121b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        zw zwVar = this.f52121b.f43827b;
                        Boolean bool = zwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", zwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44035u0 = new a5(runnable, 12);
                            zwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        aw awVar = this.f52121b;
                        zw zwVar2 = awVar.f43827b;
                        zwVar2.c5(zwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.h41(17, awVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) {
            public final aw f52121b;

            {
                this.f52121b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        zw zwVar = this.f52121b.f43827b;
                        Boolean bool = zwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", zwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.f44035u0 = new a5(runnable, 12);
                            zwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        aw awVar = this.f52121b;
                        zw zwVar2 = awVar.f43827b;
                        zwVar2.c5(zwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.h41(17, awVar, f2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.f43826a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) {
            public final aw f52543b;

            {
                this.f52543b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zw zwVar = this.f52543b.f43827b;
                        if (zwVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = zwVar.getMessagesController().a2(Long.valueOf(zwVar.H));
                            org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, zwVar, z10, true, null, runnable, new we(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zw zwVar2 = this.f52543b.f43827b;
                        if (zwVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = zwVar2.getMessagesController();
                            long j10 = j3;
                            zwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(zwVar2.getAccountInstance().f21770a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, zwVar2.G.user_admin_rights), null, false, zwVar2, false, true, null, runnable2, new we(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.c20(this) {
            public final aw f52543b;

            {
                this.f52543b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z9;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zw zwVar = this.f52543b.f43827b;
                        if (zwVar.G.bot_admin_rights != null) {
                            TLRPC.User a22 = zwVar.getMessagesController().a2(Long.valueOf(zwVar.H));
                            org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            boolean z10 = z9;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, zwVar, z10, true, null, runnable, new we(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zw zwVar2 = this.f52543b.f43827b;
                        if (zwVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.qp messagesController2 = zwVar2.getMessagesController();
                            long j10 = j3;
                            zwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(zwVar2.getAccountInstance().f21770a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, zwVar2.G.user_admin_rights), null, false, zwVar2, false, true, null, runnable2, new we(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}
