package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bx implements r60 {
    public final org.telegram.ui.ActionBar.b2 f35754a;
    public final cy f35755b;

    public bx(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f35755b = cyVar;
        this.f35754a = b2Var;
    }

    @Override
    public final void a(s60 s60Var, final long j10) {
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {s60Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final bx f43818b;

            {
                this.f43818b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cy cyVar = this.f43818b.f35755b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39206t0 = new g5(runnable, 12);
                            cyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bx bxVar = this.f43818b;
                        cy cyVar2 = bxVar.f35755b;
                        cyVar2.O4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new lt(10, bxVar, n2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final bx f43818b;

            {
                this.f43818b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        cy cyVar = this.f43818b.f35755b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.f39206t0 = new g5(runnable, 12);
                            cyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        bx bxVar = this.f43818b;
                        cy cyVar2 = bxVar.f35755b;
                        cyVar2.O4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new lt(10, bxVar, n2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f35754a;
        Utilities.doCallbacks(callback, callback2, new ai.f2(this, b2Var, j10, 2), new Utilities.Callback(this) {
            public final bx f35442b;

            {
                this.f35442b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.f35442b.f35755b;
                        if (cyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, z11, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.f35442b.f35755b;
                        if (cyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final bx f35442b;

            {
                this.f35442b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.f35442b.f35755b;
                        if (cyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            boolean z11 = z10;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, z11, true, null, runnable, new gf(6, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.f35442b.f35755b;
                        if (cyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.x2(this, b2Var, j10, n2VarArr, 5));
    }
}
