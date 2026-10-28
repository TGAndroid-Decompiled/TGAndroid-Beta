package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ax implements y60 {
    public final org.telegram.ui.ActionBar.e2 f37837a;
    public final ey f37838b;

    public ax(ey eyVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f37838b = eyVar;
        this.f37837a = e2Var;
    }

    @Override
    public final void a(z60 z60Var, final long j10) {
        final org.telegram.ui.ActionBar.r2[] r2VarArr = {z60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final ax f46092b;

            {
                this.f46092b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f46092b.f37838b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f41769u0 = new e5(runnable, 12);
                            eyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ax axVar = this.f46092b;
                        ey eyVar2 = axVar.f37838b;
                        eyVar2.Y4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.d71(26, axVar, r2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final ax f46092b;

            {
                this.f46092b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ey eyVar = this.f46092b.f37838b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f41769u0 = new e5(runnable, 12);
                            eyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        ax axVar = this.f46092b;
                        ey eyVar2 = axVar.f37838b;
                        eyVar2.Y4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.d71(26, axVar, r2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.e2 e2Var = this.f37837a;
        Utilities.doCallbacks(callback, callback2, new bi.c2(this, e2Var, j10, 2), new Utilities.Callback(this) {
            public final ax f46393b;

            {
                this.f46393b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f46393b.f37838b;
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new ef(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f46393b.f37838b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), iq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new ef(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final ax f46393b;

            {
                this.f46393b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.f46393b.f37838b;
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, z11, true, null, runnable, new ef(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.f46393b.f37838b;
                        if (eyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), iq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new ef(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new bi.t2(this, e2Var, j10, r2VarArr, 5));
    }
}
