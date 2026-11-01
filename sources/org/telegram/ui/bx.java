package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bx implements a60 {
    public final org.telegram.ui.ActionBar.x1 f36127a;
    public final zx f36128b;

    public bx(zx zxVar, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f36128b = zxVar;
        this.f36127a = x1Var;
    }

    @Override
    public final void f(b60 b60Var, final long j10) {
        final org.telegram.ui.ActionBar.k2[] k2VarArr = {b60Var, null};
        org.telegram.messenger.r20 r20Var = new org.telegram.messenger.r20(this) {
            public final bx f44110b;

            {
                this.f44110b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        zx zxVar = this.f44110b.f36128b;
                        Boolean bool = zxVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", zxVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.f38832u0 = new z4(runnable, 12);
                            zxVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bx bxVar = this.f44110b;
                        zx zxVar2 = bxVar.f36128b;
                        zxVar2.c5(zxVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.u(10, bxVar, k2VarArr));
                        return;
                }
            }
        };
        org.telegram.messenger.r20 r20Var2 = new org.telegram.messenger.r20(this) {
            public final bx f44110b;

            {
                this.f44110b = this;
            }

            @Override
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        zx zxVar = this.f44110b.f36128b;
                        Boolean bool = zxVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", zxVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.f38832u0 = new z4(runnable, 12);
                            zxVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bx bxVar = this.f44110b;
                        zx zxVar2 = bxVar.f36128b;
                        zxVar2.c5(zxVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.u(10, bxVar, k2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.x1 x1Var = this.f36127a;
        Utilities.u(0, r20Var, r20Var2, new zt(this, x1Var, j10, 1), new org.telegram.messenger.r20(this) {
            public final bx f35851b;

            {
                this.f35851b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zx zxVar = this.f35851b.f36128b;
                        if (zxVar.G.bot_admin_rights != null) {
                            TLRPC.User Z1 = zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H));
                            org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zxVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, zxVar, z11, true, null, runnable, new hf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zx zxVar2 = this.f35851b.f36128b;
                        if (zxVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.wp messagesController2 = zxVar2.getMessagesController();
                            long j11 = j10;
                            zxVar2.getMessagesController().M4(j11, org.telegram.messenger.e20.i(zxVar2.getAccountInstance().f15043a).f(), iq.x0(messagesController2.L0(Long.valueOf(j11)).admin_rights, zxVar2.G.user_admin_rights), null, false, zxVar2, false, true, null, runnable2, new hf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new org.telegram.messenger.r20(this) {
            public final bx f35851b;

            {
                this.f35851b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zx zxVar = this.f35851b.f36128b;
                        if (zxVar.G.bot_admin_rights != null) {
                            TLRPC.User Z1 = zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H));
                            org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zxVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, zxVar, z11, true, null, runnable, new hf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zx zxVar2 = this.f35851b.f36128b;
                        if (zxVar2.G.user_admin_rights != null) {
                            org.telegram.messenger.wp messagesController2 = zxVar2.getMessagesController();
                            long j11 = j10;
                            zxVar2.getMessagesController().M4(j11, org.telegram.messenger.e20.i(zxVar2.getAccountInstance().f15043a).f(), iq.x0(messagesController2.L0(Long.valueOf(j11)).admin_rights, zxVar2.G.user_admin_rights), null, false, zxVar2, false, true, null, runnable2, new hf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ko(this, x1Var, j10, k2VarArr, 1));
    }
}
