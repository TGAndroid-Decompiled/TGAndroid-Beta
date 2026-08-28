package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class dx implements q60 {
    public final org.telegram.ui.ActionBar.c2 f37620a;
    public final dy f37621b;

    public dx(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f37621b = dyVar;
        this.f37620a = c2Var;
    }

    @Override
    public final void a(r60 r60Var, final long j10) {
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {r60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final dx f37010b;

            {
                this.f37010b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        dy dyVar = this.f37010b.f37621b;
                        Boolean bool = dyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", dyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.f39121p0 = new a5(runnable, 12);
                            dyVar.presentFragment(idVar);
                            o2VarArr[1] = idVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f37010b;
                        dy dyVar2 = dxVar.f37621b;
                        dyVar2.Q4(dyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p61(17, dxVar, o2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final dx f37010b;

            {
                this.f37010b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        dy dyVar = this.f37010b.f37621b;
                        Boolean bool = dyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", dyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.f39121p0 = new a5(runnable, 12);
                            dyVar.presentFragment(idVar);
                            o2VarArr[1] = idVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        dx dxVar = this.f37010b;
                        dy dyVar2 = dxVar.f37621b;
                        dyVar2.Q4(dyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p61(17, dxVar, o2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.f37620a;
        Utilities.doCallbacks(callback, callback2, new zt(this, c2Var, j10, 1), new Utilities.Callback(this) {
            public final dx f37337b;

            {
                this.f37337b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        dy dyVar = this.f37337b.f37621b;
                        if (dyVar.C.bot_admin_rights != null) {
                            TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D));
                            MessagesController messagesController = dyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = dyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, dyVar, z10, true, null, runnable, new bf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        dy dyVar2 = this.f37337b.f37621b;
                        if (dyVar2.C.user_admin_rights != null) {
                            MessagesController messagesController2 = dyVar2.getMessagesController();
                            long j11 = j10;
                            dyVar2.getMessagesController().setUserAdminRole(j11, dyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, dyVar2.C.user_admin_rights), null, false, dyVar2, false, true, null, runnable2, new bf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final dx f37337b;

            {
                this.f37337b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        dy dyVar = this.f37337b.f37621b;
                        if (dyVar.C.bot_admin_rights != null) {
                            TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D));
                            MessagesController messagesController = dyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = dyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, dyVar, z10, true, null, runnable, new bf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        dy dyVar2 = this.f37337b.f37621b;
                        if (dyVar2.C.user_admin_rights != null) {
                            MessagesController messagesController2 = dyVar2.getMessagesController();
                            long j11 = j10;
                            dyVar2.getMessagesController().setUserAdminRole(j11, dyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, dyVar2.C.user_admin_rights), null, false, dyVar2, false, true, null, runnable2, new bf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new fh.d1(this, c2Var, j10, o2VarArr, 4));
    }
}
