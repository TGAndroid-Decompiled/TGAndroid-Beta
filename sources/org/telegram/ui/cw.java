package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cw implements e50 {
    public final org.telegram.ui.ActionBar.u1 f46630a;
    public final cx f46631b;

    public cw(cx cxVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f46631b = cxVar;
        this.f46630a = u1Var;
    }

    @Override
    public final void c(f50 f50Var, final long j3) {
        final org.telegram.ui.ActionBar.h2[] h2VarArr = {f50Var, null};
        org.telegram.messenger.x10 x10Var = new org.telegram.messenger.x10(this) {
            public final cw f45673b;

            {
                this.f45673b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cx cxVar = this.f45673b.f46631b;
                        Boolean bool = cxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", cxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45560v0 = new a5(runnable, 12);
                            cxVar.presentFragment(adVar);
                            h2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cw cwVar = this.f45673b;
                        cx cxVar2 = cwVar.f46631b;
                        cxVar2.k5(cxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new vs(7, cwVar, h2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.x10 x10Var2 = new org.telegram.messenger.x10(this) {
            public final cw f45673b;

            {
                this.f45673b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cx cxVar = this.f45673b.f46631b;
                        Boolean bool = cxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", cxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45560v0 = new a5(runnable, 12);
                            cxVar.presentFragment(adVar);
                            h2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cw cwVar = this.f45673b;
                        cx cxVar2 = cwVar.f46631b;
                        cxVar2.k5(cxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new vs(7, cwVar, h2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.f46630a;
        Utilities.u(0, x10Var, x10Var2, new bi.x3(this, u1Var, j3, 4), new org.telegram.messenger.x10(this) {
            public final cw f46296b;

            {
                this.f46296b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cx cxVar = this.f46296b.f46631b;
                        if (cxVar.H.bot_admin_rights != null) {
                            TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(cxVar.I));
                            org.telegram.messenger.mp messagesController = cxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, cxVar, z11, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cx cxVar2 = this.f46296b.f46631b;
                        if (cxVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.mp messagesController2 = cxVar2.getMessagesController();
                            long j10 = j3;
                            cxVar2.getMessagesController().b5(j10, org.telegram.messenger.j10.i(cxVar2.getAccountInstance().f23218a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, cxVar2.H.user_admin_rights), null, false, cxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.x10(this) {
            public final cw f46296b;

            {
                this.f46296b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cx cxVar = this.f46296b.f46631b;
                        if (cxVar.H.bot_admin_rights != null) {
                            TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(cxVar.I));
                            org.telegram.messenger.mp messagesController = cxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, cxVar, z11, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cx cxVar2 = this.f46296b.f46631b;
                        if (cxVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.mp messagesController2 = cxVar2.getMessagesController();
                            long j10 = j3;
                            cxVar2.getMessagesController().b5(j10, org.telegram.messenger.j10.i(cxVar2.getAccountInstance().f23218a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, cxVar2.H.user_admin_rights), null, false, cxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.e2(this, u1Var, j3, h2VarArr, 6));
    }
}
