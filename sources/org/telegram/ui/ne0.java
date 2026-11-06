package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ne0 implements RequestDelegate {
    public final int f48035a;
    public final cf0 f48036b;
    public final TLRPC.TL_chatInviteExported f48037c;

    public ne0(cf0 cf0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.f48035a = i7;
        this.f48036b = cf0Var;
        this.f48037c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48035a) {
            case 0:
                final cf0 cf0Var = this.f48036b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f48037c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cf0 cf0Var2 = cf0Var;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    cf0Var2.f44800e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = cf0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (cf0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        ue0 l02 = cf0Var2.l0();
                                        cf0Var2.f44807j0.add(0, tL_chatInviteExported2);
                                        cf0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var2), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = cf0Var2.f44806i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!cf0Var2.f44812o0) {
                                            cf0Var2.f44800e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        ue0 l03 = cf0Var2.l0();
                                        if (cf0Var2.f44812o0 && cf0Var2.f44802f == org.telegram.messenger.p10.i(cf0Var2.getAccountInstance().f21723a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (cf0Var2.f44800e != null) {
                                            cf0Var2.f44800e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        cf0Var2.f44807j0.add(0, tL_chatInviteExported2);
                                        cf0Var2.n0(l03);
                                    } else {
                                        cf0Var2.f44818s0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = cf0Var2.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            cf0Var2.getMessagesStorage().w1(cf0Var2.d.invitesCount, cf0Var2.f44810n);
                                        }
                                    }
                                    if (cf0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var2), 2131624079, 36);
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
                cf0 cf0Var2 = this.f48036b;
                cf0Var2.getClass();
                org.telegram.messenger.g0.h3(new mc0(cf0Var2, tL_error, this.f48037c, 7));
                return;
            default:
                final cf0 cf0Var3 = this.f48036b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f48037c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cf0 cf0Var22 = cf0Var3;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    cf0Var22.f44800e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = cf0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (cf0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        ue0 l02 = cf0Var22.l0();
                                        cf0Var22.f44807j0.add(0, tL_chatInviteExported22);
                                        cf0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var22), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = cf0Var22.f44806i0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!cf0Var22.f44812o0) {
                                            cf0Var22.f44800e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        ue0 l03 = cf0Var22.l0();
                                        if (cf0Var22.f44812o0 && cf0Var22.f44802f == org.telegram.messenger.p10.i(cf0Var22.getAccountInstance().f21723a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (cf0Var22.f44800e != null) {
                                            cf0Var22.f44800e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        cf0Var22.f44807j0.add(0, tL_chatInviteExported22);
                                        cf0Var22.n0(l03);
                                    } else {
                                        cf0Var22.f44818s0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = cf0Var22.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            cf0Var22.getMessagesStorage().w1(cf0Var22.d.invitesCount, cf0Var22.f44810n);
                                        }
                                    }
                                    if (cf0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749116, org.telegram.ui.Components.hc.a0(cf0Var22), 2131624079, 36);
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
