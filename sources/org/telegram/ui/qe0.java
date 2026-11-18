package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements RequestDelegate {
    public final int f51213a;
    public final gf0 f51214b;
    public final TLRPC.TL_chatInviteExported f51215c;

    public qe0(gf0 gf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.f51213a = i7;
        this.f51214b = gf0Var;
        this.f51215c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51213a) {
            case 0:
                final gf0 gf0Var = this.f51214b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f51215c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var2 = gf0Var;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    gf0Var2.f48005e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = gf0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (gf0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        ye0 l02 = gf0Var2.l0();
                                        gf0Var2.f48013k0.add(0, tL_chatInviteExported2);
                                        gf0Var2.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = gf0Var2.f48012j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!gf0Var2.f48018p0) {
                                            gf0Var2.f48005e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        ye0 l03 = gf0Var2.l0();
                                        if (gf0Var2.f48018p0 && gf0Var2.f48007f == org.telegram.messenger.j10.i(gf0Var2.getAccountInstance().f23218a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (gf0Var2.f48005e != null) {
                                            gf0Var2.f48005e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        gf0Var2.f48013k0.add(0, tL_chatInviteExported2);
                                        gf0Var2.n0(l03);
                                    } else {
                                        gf0Var2.f48024t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = gf0Var2.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            gf0Var2.getMessagesStorage().w1(gf0Var2.d.invitesCount, gf0Var2.f48015n);
                                        }
                                    }
                                    if (gf0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                gf0 gf0Var2 = this.f51214b;
                gf0Var2.getClass();
                org.telegram.messenger.g0.g3(new mc0(gf0Var2, tL_error, this.f51215c, 7));
                return;
            default:
                final gf0 gf0Var3 = this.f51214b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f51215c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gf0 gf0Var22 = gf0Var3;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    gf0Var22.f48005e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = gf0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (gf0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        ye0 l02 = gf0Var22.l0();
                                        gf0Var22.f48013k0.add(0, tL_chatInviteExported22);
                                        gf0Var22.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = gf0Var22.f48012j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!gf0Var22.f48018p0) {
                                            gf0Var22.f48005e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        ye0 l03 = gf0Var22.l0();
                                        if (gf0Var22.f48018p0 && gf0Var22.f48007f == org.telegram.messenger.j10.i(gf0Var22.getAccountInstance().f23218a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (gf0Var22.f48005e != null) {
                                            gf0Var22.f48005e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        gf0Var22.f48013k0.add(0, tL_chatInviteExported22);
                                        gf0Var22.n0(l03);
                                    } else {
                                        gf0Var22.f48024t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = gf0Var22.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            gf0Var22.getMessagesStorage().w1(gf0Var22.d.invitesCount, gf0Var22.f48015n);
                                        }
                                    }
                                    if (gf0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748925, org.telegram.ui.Components.lc.b0(gf0Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
