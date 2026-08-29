package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fx implements s60 {
    public final org.telegram.ui.ActionBar.c2 f38247a;
    public final fy f38248b;

    public fx(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38248b = fyVar;
        this.f38247a = c2Var;
    }

    @Override
    public final void a(t60 t60Var, final long j10) {
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {t60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final fx f37645b;

            {
                this.f37645b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        fy fyVar = this.f37645b.f38248b;
                        Boolean bool = fyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", fyVar.C.has_username.booleanValue());
                            hd hdVar = new hd(bundle);
                            hdVar.f38869p0 = new b5(runnable, 12);
                            fyVar.presentFragment(hdVar);
                            o2VarArr[1] = hdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        fx fxVar = this.f37645b;
                        fy fyVar2 = fxVar.f38248b;
                        fyVar2.Q4(fyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.o(14, fxVar, o2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final fx f37645b;

            {
                this.f37645b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        fy fyVar = this.f37645b.f38248b;
                        Boolean bool = fyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", fyVar.C.has_username.booleanValue());
                            hd hdVar = new hd(bundle);
                            hdVar.f38869p0 = new b5(runnable, 12);
                            fyVar.presentFragment(hdVar);
                            o2VarArr[1] = hdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        fx fxVar = this.f37645b;
                        fy fyVar2 = fxVar.f38248b;
                        fyVar2.Q4(fyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.o(14, fxVar, o2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.f38247a;
        Utilities.doCallbacks(callback, callback2, new au(this, c2Var, j10, 1), new Utilities.Callback(this) {
            public final fx f37917b;

            {
                this.f37917b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        fy fyVar = this.f37917b.f38248b;
                        if (fyVar.C.bot_admin_rights != null) {
                            TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D));
                            MessagesController messagesController = fyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = fyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, fyVar, z10, true, null, runnable, new ze(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        fy fyVar2 = this.f37917b.f38248b;
                        if (fyVar2.C.user_admin_rights != null) {
                            MessagesController messagesController2 = fyVar2.getMessagesController();
                            long j11 = j10;
                            fyVar2.getMessagesController().setUserAdminRole(j11, fyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, fyVar2.C.user_admin_rights), null, false, fyVar2, false, true, null, runnable2, new ze(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final fx f37917b;

            {
                this.f37917b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        fy fyVar = this.f37917b.f38248b;
                        if (fyVar.C.bot_admin_rights != null) {
                            TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D));
                            MessagesController messagesController = fyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = fyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, fyVar, z10, true, null, runnable, new ze(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        fy fyVar2 = this.f37917b.f38248b;
                        if (fyVar2.C.user_admin_rights != null) {
                            MessagesController messagesController2 = fyVar2.getMessagesController();
                            long j11 = j10;
                            fyVar2.getMessagesController().setUserAdminRole(j11, fyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, fyVar2.C.user_admin_rights), null, false, fyVar2, false, true, null, runnable2, new ze(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ih.z0(this, c2Var, j10, o2VarArr, 4));
    }
}
