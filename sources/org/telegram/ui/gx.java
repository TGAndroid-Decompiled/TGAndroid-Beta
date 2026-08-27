package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class gx implements t60 {

    public final org.telegram.ui.ActionBar.b2 f38490a;

    public final gy f38491b;

    public gx(gy gyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f38491b = gyVar;
        this.f38490a = b2Var;
    }

    @Override
    public final void a(u60 u60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {u60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) {

            public final gx f37870b;

            {
                this.f37870b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        gy gyVar = this.f37870b.f38491b;
                        Boolean bool = gyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", gyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.f39049p0 = new b5(runnable, 12);
                            gyVar.presentFragment(idVar);
                            n2VarArr[1] = idVar;
                        } else {
                            runnable.run();
                        }
                        break;
                    default:
                        gx gxVar = this.f37870b;
                        gy gyVar2 = gxVar.f38491b;
                        gyVar2.Q4(gyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.r61(17, gxVar, n2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) {

            public final gx f37870b;

            {
                this.f37870b = this;
            }

            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        gy gyVar = this.f37870b.f38491b;
                        Boolean bool = gyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", gyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.f39049p0 = new b5(runnable, 12);
                            gyVar.presentFragment(idVar);
                            n2VarArr[1] = idVar;
                        } else {
                            runnable.run();
                        }
                        break;
                    default:
                        gx gxVar = this.f37870b;
                        gy gyVar2 = gxVar.f38491b;
                        gyVar2.Q4(gyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.r61(17, gxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.f38490a;
        Utilities.doCallbacks(callback, callback2, new cu(this, b2Var, j10, i13), new Utilities.Callback(this) {

            public final gx f38221b;

            {
                this.f38221b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        gy gyVar = this.f38221b.f38491b;
                        if (gyVar.C.bot_admin_rights == null) {
                            runnable.run();
                        } else {
                            TLRPC.User user = gyVar.getMessagesController().getUser(Long.valueOf(gyVar.D));
                            MessagesController messagesController = gyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = gyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, gyVar, bool == null || !bool.booleanValue(), true, null, runnable, new bf(6, runnable));
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        gy gyVar2 = this.f38221b.f38491b;
                        if (gyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                        } else {
                            MessagesController messagesController2 = gyVar2.getMessagesController();
                            long j11 = j10;
                            gyVar2.getMessagesController().setUserAdminRole(j11, gyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, gyVar2.C.user_admin_rights), null, false, gyVar2, false, true, null, runnable2, new bf(7, runnable2));
                        }
                        break;
                }
            }
        }, new Utilities.Callback(this) {

            public final gx f38221b;

            {
                this.f38221b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        gy gyVar = this.f38221b.f38491b;
                        if (gyVar.C.bot_admin_rights == null) {
                            runnable.run();
                        } else {
                            TLRPC.User user = gyVar.getMessagesController().getUser(Long.valueOf(gyVar.D));
                            MessagesController messagesController = gyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = gyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, gyVar, bool == null || !bool.booleanValue(), true, null, runnable, new bf(6, runnable));
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        gy gyVar2 = this.f38221b.f38491b;
                        if (gyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                        } else {
                            MessagesController messagesController2 = gyVar2.getMessagesController();
                            long j11 = j10;
                            gyVar2.getMessagesController().setUserAdminRole(j11, gyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, gyVar2.C.user_admin_rights), null, false, gyVar2, false, true, null, runnable2, new bf(7, runnable2));
                        }
                        break;
                }
            }
        }, new gh.b1(this, b2Var, j10, n2VarArr, 4));
    }
}
