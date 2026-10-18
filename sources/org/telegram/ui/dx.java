package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dx implements t60 {
    public final org.telegram.ui.ActionBar.b2 f36296a;
    public final ey f36297b;

    public dx(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f36297b = eyVar;
        this.f36296a = b2Var;
    }

    @Override
    public final void a(u60 u60Var, final long j10) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {u60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final dx f35726b;

            {
                this.f35726b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f35726b.f36297b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            od odVar = new od(bundle);
                            odVar.f39748t0 = new g5(runnable, 12);
                            eyVar.presentFragment(odVar);
                            n2VarArr[1] = odVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f35726b;
                        ey eyVar2 = dxVar.f36297b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new nt(10, dxVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final dx f35726b;

            {
                this.f35726b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f35726b.f36297b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            od odVar = new od(bundle);
                            odVar.f39748t0 = new g5(runnable, 12);
                            eyVar.presentFragment(odVar);
                            n2VarArr[1] = odVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f35726b;
                        ey eyVar2 = dxVar.f36297b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new nt(10, dxVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f36296a;
        Utilities.doCallbacks(callback, callback2, new ai.e2(this, b2Var, j10, 2), new Utilities.Callback(this) {
            public final dx f35993b;

            {
                this.f35993b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f35993b.f36297b;
                        if (eyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H));
                            MessagesController messagesController = eyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = eyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new jf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f35993b.f36297b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final dx f35993b;

            {
                this.f35993b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f35993b.f36297b;
                        if (eyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H));
                            MessagesController messagesController = eyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = eyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new jf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f35993b.f36297b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.u2(this, b2Var, j10, n2VarArr, 5));
    }
}
