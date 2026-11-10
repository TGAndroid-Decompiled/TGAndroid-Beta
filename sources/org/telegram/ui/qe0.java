package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qe0 implements RequestDelegate {
    public final int f49024a;
    public final ff0 f49025b;
    public final TLRPC.TL_chatInviteExported f49026c;

    public qe0(ff0 ff0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.f49024a = i7;
        this.f49025b = ff0Var;
        this.f49026c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49024a) {
            case 0:
                final ff0 ff0Var = this.f49025b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f49026c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ff0 ff0Var2 = ff0Var;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ff0Var2.f45736e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ff0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ff0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        xe0 l02 = ff0Var2.l0();
                                        ff0Var2.f45743j0.add(0, tL_chatInviteExported2);
                                        ff0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.gc.a0(ff0Var2), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ff0Var2.f45742i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ff0Var2.f45748o0) {
                                            ff0Var2.f45736e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        xe0 l03 = ff0Var2.l0();
                                        if (ff0Var2.f45748o0 && ff0Var2.f45738f == org.telegram.messenger.p10.i(ff0Var2.getAccountInstance().f21770a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ff0Var2.f45736e != null) {
                                            ff0Var2.f45736e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ff0Var2.f45743j0.add(0, tL_chatInviteExported2);
                                        ff0Var2.n0(l03);
                                    } else {
                                        ff0Var2.f45754s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ff0Var2.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ff0Var2.getMessagesStorage().w1(ff0Var2.d.invitesCount, ff0Var2.f45746n);
                                        }
                                    }
                                    if (ff0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.gc.a0(ff0Var2), 2131624079, 36);
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
                ff0 ff0Var2 = this.f49025b;
                ff0Var2.getClass();
                org.telegram.messenger.g0.h3(new pc0(ff0Var2, tL_error, this.f49026c, 7));
                return;
            default:
                final ff0 ff0Var3 = this.f49025b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f49026c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ff0 ff0Var22 = ff0Var3;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ff0Var22.f45736e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ff0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ff0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        xe0 l02 = ff0Var22.l0();
                                        ff0Var22.f45743j0.add(0, tL_chatInviteExported22);
                                        ff0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.gc.a0(ff0Var22), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ff0Var22.f45742i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ff0Var22.f45748o0) {
                                            ff0Var22.f45736e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        xe0 l03 = ff0Var22.l0();
                                        if (ff0Var22.f45748o0 && ff0Var22.f45738f == org.telegram.messenger.p10.i(ff0Var22.getAccountInstance().f21770a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ff0Var22.f45736e != null) {
                                            ff0Var22.f45736e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ff0Var22.f45743j0.add(0, tL_chatInviteExported22);
                                        ff0Var22.n0(l03);
                                    } else {
                                        ff0Var22.f45754s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ff0Var22.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ff0Var22.getMessagesStorage().w1(ff0Var22.d.invitesCount, ff0Var22.f45746n);
                                        }
                                    }
                                    if (ff0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749117, org.telegram.ui.Components.gc.a0(ff0Var22), 2131624079, 36);
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
