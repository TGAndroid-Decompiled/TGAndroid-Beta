package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe0 implements RequestDelegate {
    public final int f51007a;
    public final ef0 f51008b;
    public final TLRPC.TL_chatInviteExported f51009c;

    public pe0(ef0 ef0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        this.f51007a = i7;
        this.f51008b = ef0Var;
        this.f51009c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51007a) {
            case 0:
                final ef0 ef0Var = this.f51008b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f51009c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ef0 ef0Var2 = ef0Var;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ef0Var2.f47523e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ef0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ef0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        we0 l02 = ef0Var2.l0();
                                        ef0Var2.f47531k0.add(0, tL_chatInviteExported2);
                                        ef0Var2.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748924, org.telegram.ui.Components.kc.b0(ef0Var2), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ef0Var2.f47530j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ef0Var2.f47536p0) {
                                            ef0Var2.f47523e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        we0 l03 = ef0Var2.l0();
                                        if (ef0Var2.f47536p0 && ef0Var2.f47525f == org.telegram.messenger.i10.i(ef0Var2.getAccountInstance().f23343a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ef0Var2.f47523e != null) {
                                            ef0Var2.f47523e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ef0Var2.f47531k0.add(0, tL_chatInviteExported2);
                                        ef0Var2.n0(l03);
                                    } else {
                                        ef0Var2.f47542t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ef0Var2.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ef0Var2.getMessagesStorage().w1(ef0Var2.d.invitesCount, ef0Var2.f47533n);
                                        }
                                    }
                                    if (ef0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748924, org.telegram.ui.Components.kc.b0(ef0Var2), 2131624080, 36);
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
                ef0 ef0Var2 = this.f51008b;
                ef0Var2.getClass();
                org.telegram.messenger.g0.g3(new lc0(ef0Var2, tL_error, this.f51009c, 7));
                return;
            default:
                final ef0 ef0Var3 = this.f51008b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f51009c;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ef0 ef0Var22 = ef0Var3;
                        switch (i7) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    ef0Var22.f47523e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = ef0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (ef0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        we0 l02 = ef0Var22.l0();
                                        ef0Var22.f47531k0.add(0, tL_chatInviteExported22);
                                        ef0Var22.n0(l02);
                                        org.telegram.messenger.f3.n(null, 2131748924, org.telegram.ui.Components.kc.b0(ef0Var22), 2131624080, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = ef0Var22.f47530j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ef0Var22.f47536p0) {
                                            ef0Var22.f47523e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        we0 l03 = ef0Var22.l0();
                                        if (ef0Var22.f47536p0 && ef0Var22.f47525f == org.telegram.messenger.i10.i(ef0Var22.getAccountInstance().f23343a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ef0Var22.f47523e != null) {
                                            ef0Var22.f47523e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ef0Var22.f47531k0.add(0, tL_chatInviteExported22);
                                        ef0Var22.n0(l03);
                                    } else {
                                        ef0Var22.f47542t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ef0Var22.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ef0Var22.getMessagesStorage().w1(ef0Var22.d.invitesCount, ef0Var22.f47533n);
                                        }
                                    }
                                    if (ef0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.f3.n(null, 2131748924, org.telegram.ui.Components.kc.b0(ef0Var22), 2131624080, 36);
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
