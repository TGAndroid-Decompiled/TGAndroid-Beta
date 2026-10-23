package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dx implements v60 {
    public final org.telegram.ui.ActionBar.c2 f36746a;
    public final ey f36747b;

    public dx(ey eyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f36747b = eyVar;
        this.f36746a = c2Var;
    }

    @Override
    public final void a(w60 w60Var, final long j10) {
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {w60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final dx f36191b;

            {
                this.f36191b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f36191b.f36747b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39500u0 = new f5(runnable, 12);
                            eyVar.presentFragment(mdVar);
                            o2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f36191b;
                        ey eyVar2 = dxVar.f36747b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new ot(10, dxVar, o2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final dx f36191b;

            {
                this.f36191b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f36191b.f36747b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39500u0 = new f5(runnable, 12);
                            eyVar.presentFragment(mdVar);
                            o2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f36191b;
                        ey eyVar2 = dxVar.f36747b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new ot(10, dxVar, o2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.f36746a;
        Utilities.doCallbacks(callback, callback2, new ai.f2(this, c2Var, j10, 2), new Utilities.Callback(this) {
            public final dx f36444b;

            {
                this.f36444b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f36444b.f36747b;
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f36444b.f36747b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final dx f36444b;

            {
                this.f36444b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f36444b.f36747b;
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f36444b.f36747b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.x2(this, c2Var, j10, o2VarArr, 5));
    }
}
