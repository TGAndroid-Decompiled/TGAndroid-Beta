package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ox implements d70 {
    public final org.telegram.ui.ActionBar.d2 f36995a;
    public final oy f36996b;

    public ox(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f36996b = oyVar;
        this.f36995a = d2Var;
    }

    @Override
    public final void a(e70 e70Var, final long j10) {
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {e70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final ox f36398b;

            {
                this.f36398b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        oy oyVar = this.f36398b.f36996b;
                        Boolean bool = oyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", oyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f36596q0 = new d5(runnable, 12);
                            oyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ox oxVar = this.f36398b;
                        oy oyVar2 = oxVar.f36996b;
                        oyVar2.Q4(oyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(23, oxVar, p2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final ox f36398b;

            {
                this.f36398b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        oy oyVar = this.f36398b.f36996b;
                        Boolean bool = oyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", oyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f36596q0 = new d5(runnable, 12);
                            oyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ox oxVar = this.f36398b;
                        oy oyVar2 = oxVar.f36996b;
                        oyVar2.Q4(oyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(23, oxVar, p2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.f36995a;
        Utilities.doCallbacks(callback, callback2, new iu(this, d2Var, j10, 1), new Utilities.Callback(this) {
            public final ox f36736b;

            {
                this.f36736b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        oy oyVar = this.f36736b.f36996b;
                        if (oyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E));
                            MessagesController messagesController = oyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = oyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, oyVar, z4, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        oy oyVar2 = this.f36736b.f36996b;
                        if (oyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = oyVar2.getMessagesController();
                            long j11 = j10;
                            oyVar2.getMessagesController().setUserAdminRole(j11, oyVar2.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, oyVar2.D.user_admin_rights), null, false, oyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final ox f36736b;

            {
                this.f36736b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z4;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        oy oyVar = this.f36736b.f36996b;
                        if (oyVar.D.bot_admin_rights != null) {
                            TLRPC.User user = oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E));
                            MessagesController messagesController = oyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = oyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, oyVar, z4, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        oy oyVar2 = this.f36736b.f36996b;
                        if (oyVar2.D.user_admin_rights != null) {
                            MessagesController messagesController2 = oyVar2.getMessagesController();
                            long j11 = j10;
                            oyVar2.getMessagesController().setUserAdminRole(j11, oyVar2.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, oyVar2.D.user_admin_rights), null, false, oyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new kh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}
