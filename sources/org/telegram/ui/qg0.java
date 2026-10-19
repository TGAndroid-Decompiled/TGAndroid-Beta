package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements RequestDelegate {
    public final int f40576a;
    public final hh0 f40577b;
    public final TLRPC.TL_chatInviteExported f40578c;

    public qg0(hh0 hh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f40576a = i10;
        this.f40577b = hh0Var;
        this.f40578c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40576a) {
            case 0:
                final hh0 hh0Var = this.f40577b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f40578c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var2 = hh0Var;
                                    hh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = hh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (hh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var2.f0();
                                        hh0Var2.f37635j0.add(0, tL_chatInviteExported3);
                                        hh0Var2.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(hh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var3 = hh0Var;
                                ArrayList arrayList = hh0Var3.f37634i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var3.f37640o0) {
                                            hh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var3.f0();
                                        if (hh0Var3.f37640o0 && hh0Var3.f37630f == hh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var3.e != null) {
                                            hh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var3.f37635j0.add(0, tL_chatInviteExported4);
                                        hh0Var3.h0(f03);
                                    } else {
                                        hh0Var3.f37646s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var3.getMessagesStorage().saveChatLinksCount(hh0Var3.f37638n, hh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(hh0Var3), R.raw.linkbroken, 36);
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
                hh0 hh0Var2 = this.f40577b;
                hh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new ve0(hh0Var2, tL_error, this.f40578c, 6));
                return;
            default:
                final hh0 hh0Var3 = this.f40577b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f40578c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    hh0 hh0Var22 = hh0Var3;
                                    hh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = hh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (hh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        yg0 f02 = hh0Var22.f0();
                                        hh0Var22.f37635j0.add(0, tL_chatInviteExported3);
                                        hh0Var22.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(hh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                hh0 hh0Var32 = hh0Var3;
                                ArrayList arrayList = hh0Var32.f37634i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!hh0Var32.f37640o0) {
                                            hh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        yg0 f03 = hh0Var32.f0();
                                        if (hh0Var32.f37640o0 && hh0Var32.f37630f == hh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (hh0Var32.e != null) {
                                            hh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        hh0Var32.f37635j0.add(0, tL_chatInviteExported4);
                                        hh0Var32.h0(f03);
                                    } else {
                                        hh0Var32.f37646s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = hh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            hh0Var32.getMessagesStorage().saveChatLinksCount(hh0Var32.f37638n, hh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (hh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(hh0Var32), R.raw.linkbroken, 36);
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
