package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bw implements d50 {
    public final org.telegram.ui.ActionBar.t1 f46516a;
    public final bx f46517b;

    public bw(bx bxVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f46517b = bxVar;
        this.f46516a = t1Var;
    }

    @Override
    public final void d(e50 e50Var, final long j3) {
        final org.telegram.ui.ActionBar.g2[] g2VarArr = {e50Var, null};
        org.telegram.messenger.w10 w10Var = new org.telegram.messenger.w10(this) {
            public final bw f54730b;

            {
                this.f54730b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        bx bxVar = this.f54730b.f46517b;
                        Boolean bool = bxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", bxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45686v0 = new a5(runnable, 12);
                            bxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bw bwVar = this.f54730b;
                        bx bxVar2 = bwVar.f46517b;
                        bxVar2.k5(bxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.o(13, bwVar, g2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.w10 w10Var2 = new org.telegram.messenger.w10(this) {
            public final bw f54730b;

            {
                this.f54730b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        bx bxVar = this.f54730b.f46517b;
                        Boolean bool = bxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", bxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.f45686v0 = new a5(runnable, 12);
                            bxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bw bwVar = this.f54730b;
                        bx bxVar2 = bwVar.f46517b;
                        bxVar2.k5(bxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.o(13, bwVar, g2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var = this.f46516a;
        Utilities.u(0, w10Var, w10Var2, new bi.d4(this, t1Var, j3, 4), new org.telegram.messenger.w10(this) {
            public final bw f45820b;

            {
                this.f45820b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        bx bxVar = this.f45820b.f46517b;
                        if (bxVar.H.bot_admin_rights != null) {
                            TLRPC.User c22 = bxVar.getMessagesController().c2(Long.valueOf(bxVar.I));
                            org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = bxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, bxVar, z11, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        bx bxVar2 = this.f45820b.f46517b;
                        if (bxVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.mp messagesController2 = bxVar2.getMessagesController();
                            long j10 = j3;
                            bxVar2.getMessagesController().b5(j10, org.telegram.messenger.i10.i(bxVar2.getAccountInstance().f23343a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, bxVar2.H.user_admin_rights), null, false, bxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.w10(this) {
            public final bw f45820b;

            {
                this.f45820b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        bx bxVar = this.f45820b.f46517b;
                        if (bxVar.H.bot_admin_rights != null) {
                            TLRPC.User c22 = bxVar.getMessagesController().c2(Long.valueOf(bxVar.I));
                            org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = bxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, bxVar, z11, true, null, runnable, new ve(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        bx bxVar2 = this.f45820b.f46517b;
                        if (bxVar2.H.user_admin_rights != null) {
                            org.telegram.messenger.mp messagesController2 = bxVar2.getMessagesController();
                            long j10 = j3;
                            bxVar2.getMessagesController().b5(j10, org.telegram.messenger.i10.i(bxVar2.getAccountInstance().f23343a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, bxVar2.H.user_admin_rights), null, false, bxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.k2(this, t1Var, j3, g2VarArr, 6));
    }
}
