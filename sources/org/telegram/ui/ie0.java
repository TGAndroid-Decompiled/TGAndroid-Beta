package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ie0 implements RequestDelegate {
    public final int f46256a;
    public final xe0 f46257b;
    public final TLRPC.TL_chatInviteExported f46258c;

    public ie0(xe0 xe0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i3) {
        this.f46256a = i3;
        this.f46257b = xe0Var;
        this.f46258c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46256a) {
            case 0:
                final xe0 xe0Var = this.f46257b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f46258c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xe0 xe0Var2 = xe0Var;
                        switch (i3) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    xe0Var2.f51990e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = xe0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (xe0Var2.getParentActivity() != null) {
                                        tL_chatInviteExported2.revoked = true;
                                        pe0 l02 = xe0Var2.l0();
                                        xe0Var2.f51998k0.add(0, tL_chatInviteExported2);
                                        xe0Var2.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var2), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = xe0Var2.f51997j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!xe0Var2.f52003p0) {
                                            xe0Var2.f51990e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported2.revoked = true;
                                        pe0 l03 = xe0Var2.l0();
                                        if (xe0Var2.f52003p0 && xe0Var2.f51992f == org.telegram.messenger.h10.i(xe0Var2.getAccountInstance().f21919a).e()) {
                                            arrayList.remove(tL_chatInviteExported2);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (xe0Var2.f51990e != null) {
                                            xe0Var2.f51990e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        xe0Var2.f51998k0.add(0, tL_chatInviteExported2);
                                        xe0Var2.n0(l03);
                                    } else {
                                        xe0Var2.f52009t0.b(tL_chatInviteExported2, tLObject2);
                                        TLRPC.ChatFull chatFull2 = xe0Var2.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            xe0Var2.getMessagesStorage().w1(xe0Var2.d.invitesCount, xe0Var2.f52000n);
                                        }
                                    }
                                    if (xe0Var2.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var2), 2131624079, 36);
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
                xe0 xe0Var2 = this.f46257b;
                xe0Var2.getClass();
                org.telegram.messenger.g0.h3(new hc0(xe0Var2, tL_error, this.f46258c, false, 8));
                return;
            default:
                final xe0 xe0Var3 = this.f46257b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f46258c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r5;
                        TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xe0 xe0Var22 = xe0Var3;
                        switch (i3) {
                            case 0:
                                if (tL_error2 == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject2;
                                    xe0Var22.f51990e = tL_chatInviteExported3;
                                    TLRPC.ChatFull chatFull = xe0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported3;
                                    }
                                    if (xe0Var22.getParentActivity() != null) {
                                        tL_chatInviteExported22.revoked = true;
                                        pe0 l02 = xe0Var22.l0();
                                        xe0Var22.f51998k0.add(0, tL_chatInviteExported22);
                                        xe0Var22.n0(l02);
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var22), 2131624079, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = xe0Var22.f51997j0;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!xe0Var22.f52003p0) {
                                            xe0Var22.f51990e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported22.revoked = true;
                                        pe0 l03 = xe0Var22.l0();
                                        if (xe0Var22.f52003p0 && xe0Var22.f51992f == org.telegram.messenger.h10.i(xe0Var22.getAccountInstance().f21919a).e()) {
                                            arrayList.remove(tL_chatInviteExported22);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (xe0Var22.f51990e != null) {
                                            xe0Var22.f51990e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        xe0Var22.f51998k0.add(0, tL_chatInviteExported22);
                                        xe0Var22.n0(l03);
                                    } else {
                                        xe0Var22.f52009t0.b(tL_chatInviteExported22, tLObject2);
                                        TLRPC.ChatFull chatFull2 = xe0Var22.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            xe0Var22.getMessagesStorage().w1(xe0Var22.d.invitesCount, xe0Var22.f52000n);
                                        }
                                    }
                                    if (xe0Var22.getParentActivity() != null) {
                                        org.telegram.messenger.k5.o(null, 2131749125, org.telegram.ui.Components.fc.a0(xe0Var22), 2131624079, 36);
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
