package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cx implements b60 {
    public final org.telegram.ui.ActionBar.x1 f36563a;
    public final ay f36564b;

    public cx(ay ayVar, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f36564b = ayVar;
        this.f36563a = x1Var;
    }

    @Override
    public final void f(c60 c60Var, final long j10) {
        final org.telegram.ui.ActionBar.k2[] k2VarArr = {c60Var, null};
        org.telegram.messenger.q20 q20Var = new org.telegram.messenger.q20(this) {
            public final cx f35767b;

            {
                this.f35767b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ay ayVar = this.f35767b.f36564b;
                        Boolean bool = ayVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", ayVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.f38769u0 = new z4(runnable, 12);
                            ayVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cx cxVar = this.f35767b;
                        ay ayVar2 = cxVar.f36564b;
                        ayVar2.b5(ayVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new xs(9, cxVar, k2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.q20 q20Var2 = new org.telegram.messenger.q20(this) {
            public final cx f35767b;

            {
                this.f35767b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ay ayVar = this.f35767b.f36564b;
                        Boolean bool = ayVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", ayVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.f38769u0 = new z4(runnable, 12);
                            ayVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        cx cxVar = this.f35767b;
                        ay ayVar2 = cxVar.f36564b;
                        ayVar2.b5(ayVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new xs(9, cxVar, k2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.x1 x1Var = this.f36563a;
        Utilities.u(0, q20Var, q20Var2, new au(this, x1Var, j10, 1), new org.telegram.messenger.q20(this) {
            public final cx f36318b;

            {
                this.f36318b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ay ayVar = this.f36318b.f36564b;
                        if (ayVar.G.bot_admin_rights != null) {
                            TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H));
                            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ayVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, ayVar, z11, true, null, runnable, new jf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ay ayVar2 = this.f36318b.f36564b;
                        if (ayVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.vp messagesController2 = ayVar2.getMessagesController();
                            long j11 = j10;
                            ayVar2.getMessagesController().M4(j11, org.telegram.messenger.d20.i(ayVar2.getAccountInstance().f14863a).f(), iq.w0(messagesController2.L0(Long.valueOf(j11)).admin_rights, ayVar2.G.user_admin_rights), null, false, ayVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.q20(this) {
            public final cx f36318b;

            {
                this.f36318b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ay ayVar = this.f36318b.f36564b;
                        if (ayVar.G.bot_admin_rights != null) {
                            TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H));
                            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ayVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, ayVar, z11, true, null, runnable, new jf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ay ayVar2 = this.f36318b.f36564b;
                        if (ayVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.vp messagesController2 = ayVar2.getMessagesController();
                            long j11 = j10;
                            ayVar2.getMessagesController().M4(j11, org.telegram.messenger.d20.i(ayVar2.getAccountInstance().f14863a).f(), iq.w0(messagesController2.L0(Long.valueOf(j11)).admin_rights, ayVar2.G.user_admin_rights), null, false, ayVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ko(this, x1Var, j10, k2VarArr, 1));
    }
}
