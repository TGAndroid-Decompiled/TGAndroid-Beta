package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class px implements i70 {
    public final org.telegram.ui.ActionBar.c2 f36559a;
    public final ty f36560b;

    public px(ty tyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f36560b = tyVar;
        this.f36559a = c2Var;
    }

    @Override
    public final void a(j70 j70Var, final long j3) {
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {j70Var, null};
        Utilities.Callback callback = new Utilities.Callback(this) {
            public final px f36105b;

            {
                this.f36105b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ty tyVar = this.f36105b.f36560b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f35959t0 = new d5(runnable, 12);
                            tyVar.presentFragment(ndVar);
                            o2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f36105b;
                        ty tyVar2 = pxVar.f36560b;
                        tyVar2.Z4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tv(4, pxVar, o2VarArr));
                        return;
                }
            }
        };
        Utilities.Callback callback2 = new Utilities.Callback(this) {
            public final px f36105b;

            {
                this.f36105b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (r5) {
                    case 0:
                        ty tyVar = this.f36105b.f36560b;
                        Boolean bool = tyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", tyVar.G.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.f35959t0 = new d5(runnable, 12);
                            tyVar.presentFragment(ndVar);
                            o2VarArr[1] = ndVar;
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        px pxVar = this.f36105b;
                        ty tyVar2 = pxVar.f36560b;
                        tyVar2.Z4(tyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tv(4, pxVar, o2VarArr));
                        return;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.f36559a;
        Utilities.doCallbacks(callback, callback2, new iu(this, c2Var, j3, 1), new Utilities.Callback(this) {
            public final px f36270b;

            {
                this.f36270b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.f36270b.f36560b;
                        if (tyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, z10, true, null, runnable, new nf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.f36270b.f36560b;
                        if (tyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final px f36270b;

            {
                this.f36270b = this;
            }

            @Override
            public final void run(Object obj) {
                boolean z10;
                switch (r4) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ty tyVar = this.f36270b.f36560b;
                        if (tyVar.G.bot_admin_rights != null) {
                            TLRPC.User user = tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H));
                            MessagesController messagesController = tyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = tyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            if (bool != null && bool.booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, tyVar, z10, true, null, runnable, new nf(8, runnable));
                            return;
                        }
                        runnable.run();
                        return;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ty tyVar2 = this.f36270b.f36560b;
                        if (tyVar2.G.user_admin_rights != null) {
                            MessagesController messagesController2 = tyVar2.getMessagesController();
                            long j10 = j3;
                            tyVar2.getMessagesController().setUserAdminRole(j10, tyVar2.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, tyVar2.G.user_admin_rights), null, false, tyVar2, false, true, null, runnable2, new nf(7, runnable2));
                            return;
                        }
                        runnable2.run();
                        return;
                }
            }
        }, new ai.l(this, c2Var, j3, o2VarArr, 7));
    }
}
