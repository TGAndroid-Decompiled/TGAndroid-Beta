package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dh0 implements RequestDelegate {
    public final int f32660a;
    public final th0 f32661b;
    public final TLRPC.TL_chatInviteExported f32662c;

    public dh0(th0 th0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f32660a = i10;
        this.f32661b = th0Var;
        this.f32662c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32660a) {
            case 0:
                final th0 th0Var = this.f32661b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f32662c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    th0 th0Var2 = th0Var;
                                    th0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = th0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (th0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        kh0 f02 = th0Var2.f0();
                                        th0Var2.f37668j0.add(0, tL_chatInviteExported3);
                                        th0Var2.h0(f02);
                                        org.telegram.messenger.z0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(th0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                th0 th0Var3 = th0Var;
                                ArrayList arrayList = th0Var3.f37667i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!th0Var3.f37673o0) {
                                            th0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        kh0 f03 = th0Var3.f0();
                                        if (th0Var3.f37673o0 && th0Var3.f37663f == th0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (th0Var3.e != null) {
                                            th0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        th0Var3.f37668j0.add(0, tL_chatInviteExported4);
                                        th0Var3.h0(f03);
                                    } else {
                                        th0Var3.f37679s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = th0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            th0Var3.getMessagesStorage().saveChatLinksCount(th0Var3.f37671n, th0Var3.d.invitesCount);
                                        }
                                    }
                                    if (th0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.z0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(th0Var3), R.raw.linkbroken, 36);
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
                th0 th0Var2 = this.f32661b;
                th0Var2.getClass();
                AndroidUtilities.runOnUIThread(new kf0(th0Var2, tL_error, this.f32662c, 5));
                return;
            default:
                final th0 th0Var3 = this.f32661b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f32662c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    th0 th0Var22 = th0Var3;
                                    th0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = th0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (th0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        kh0 f02 = th0Var22.f0();
                                        th0Var22.f37668j0.add(0, tL_chatInviteExported3);
                                        th0Var22.h0(f02);
                                        org.telegram.messenger.z0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(th0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                th0 th0Var32 = th0Var3;
                                ArrayList arrayList = th0Var32.f37667i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!th0Var32.f37673o0) {
                                            th0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        kh0 f03 = th0Var32.f0();
                                        if (th0Var32.f37673o0 && th0Var32.f37663f == th0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (th0Var32.e != null) {
                                            th0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        th0Var32.f37668j0.add(0, tL_chatInviteExported4);
                                        th0Var32.h0(f03);
                                    } else {
                                        th0Var32.f37679s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = th0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            th0Var32.getMessagesStorage().saveChatLinksCount(th0Var32.f37671n, th0Var32.d.invitesCount);
                                        }
                                    }
                                    if (th0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.z0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(th0Var32), R.raw.linkbroken, 36);
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
