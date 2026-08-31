package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class px implements e70 {
    public final org.telegram.ui.ActionBar.d2 f40170a;
    public final py f40171b;

    public px(py pyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f40171b = pyVar;
        this.f40170a = d2Var;
    }

    @Override
    public final void a(f70 f70Var, final long j10) {
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {f70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final px f39539b;

            {
                this.f39539b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        py pyVar = this.f39539b.f40171b;
                        Boolean bool = pyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", pyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f39404q0 = new d5(runnable, 12);
                            pyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f39539b;
                        py pyVar2 = pxVar.f40171b;
                        pyVar2.Q4(pyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.l41(22, pxVar, p2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final px f39539b;

            {
                this.f39539b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        py pyVar = this.f39539b.f40171b;
                        Boolean bool = pyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", pyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f39404q0 = new d5(runnable, 12);
                            pyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f39539b;
                        py pyVar2 = pxVar.f40171b;
                        pyVar2.Q4(pyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.l41(22, pxVar, p2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.f40170a;
        Utilities.doCallbacks(callback, callback2, new ju(this, d2Var, j10, 1), new Utilities.Callback(this) {
            public final px f39853b;

            {
                this.f39853b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        py pyVar = this.f39853b.f40171b;
                        if (pyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(pyVar.E));
                            MessagesController messagesController = pyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = pyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, pyVar, z4, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        py pyVar2 = this.f39853b.f40171b;
                        if (pyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = pyVar2.getMessagesController();
                            long j11 = j10;
                            pyVar2.getMessagesController().setUserAdminRole(j11, pyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, pyVar2.D.user_admin_rights), null, false, pyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final px f39853b;

            {
                this.f39853b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        py pyVar = this.f39853b.f40171b;
                        if (pyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(pyVar.E));
                            MessagesController messagesController = pyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = pyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, pyVar, z4, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        py pyVar2 = this.f39853b.f40171b;
                        if (pyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = pyVar2.getMessagesController();
                            long j11 = j10;
                            pyVar2.getMessagesController().setUserAdminRole(j11, pyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, pyVar2.D.user_admin_rights), null, false, pyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new lh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}
