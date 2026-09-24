package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class px implements f70 {
    public final org.telegram.ui.ActionBar.a2 f36675a;
    public final qy f36676b;

    public px(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f36676b = qyVar;
        this.f36675a = a2Var;
    }

    @Override
    public final void a(g70 g70Var, final long j3) {
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {g70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final px f35983b;

            {
                this.f35983b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        qy qyVar = this.f35983b.f36676b;
                        Boolean bool = qyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", qyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f35292t0 = new b5(runnable, 12);
                            qyVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f35983b;
                        qy qyVar2 = pxVar.f36676b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tt(11, pxVar, m2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final px f35983b;

            {
                this.f35983b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        qy qyVar = this.f35983b.f36676b;
                        Boolean bool = qyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", qyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.f35292t0 = new b5(runnable, 12);
                            qyVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f35983b;
                        qy qyVar2 = pxVar.f36676b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tt(11, pxVar, m2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.f36675a;
        Utilities.doCallbacks(callback, callback2, new gu(this, a2Var, j3, 1), new Utilities.Callback(this) {
            public final px f36347b;

            {
                this.f36347b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.f36347b.f36676b;
                        if (qyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, qyVar, z10, true, null, runnable, new kf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.f36347b.f36676b;
                        if (qyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j10 = j3;
                            qyVar2.getMessagesController().setUserAdminRole(j10, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, qyVar2.G.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new kf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final px f36347b;

            {
                this.f36347b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.f36347b.f36676b;
                        if (qyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, qyVar, z10, true, null, runnable, new kf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.f36347b.f36676b;
                        if (qyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j10 = j3;
                            qyVar2.getMessagesController().setUserAdminRole(j10, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, qyVar2.G.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new kf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, a2Var, j3, m2VarArr, 7));
    }
}
