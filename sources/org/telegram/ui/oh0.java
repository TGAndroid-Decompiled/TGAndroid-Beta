package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oh0 implements RequestDelegate {
    public final int f38957a;
    public final ei0 f38958b;
    public final TLRPC.TL_chatInviteExported f38959c;

    public oh0(ei0 ei0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f38957a = i10;
        this.f38958b = ei0Var;
        this.f38959c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38957a) {
            case 0:
                final ei0 ei0Var = this.f38958b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38959c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ei0 ei0Var2 = ei0Var;
                                    ei0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = ei0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (ei0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        vh0 f02 = ei0Var2.f0();
                                        ei0Var2.f35597j0.add(0, tL_chatInviteExported3);
                                        ei0Var2.h0(f02);
                                        org.telegram.messenger.q.r(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ei0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ei0 ei0Var3 = ei0Var;
                                ArrayList arrayList = ei0Var3.f35596i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ei0Var3.f35602o0) {
                                            ei0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        vh0 f03 = ei0Var3.f0();
                                        if (ei0Var3.f35602o0 && ei0Var3.f35592f == ei0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ei0Var3.e != null) {
                                            ei0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ei0Var3.f35597j0.add(0, tL_chatInviteExported4);
                                        ei0Var3.h0(f03);
                                    } else {
                                        ei0Var3.f35608s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ei0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ei0Var3.getMessagesStorage().saveChatLinksCount(ei0Var3.f35600n, ei0Var3.d.invitesCount);
                                        }
                                    }
                                    if (ei0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.q.r(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ei0Var3), R.raw.linkbroken, 36);
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
                ei0 ei0Var2 = this.f38958b;
                ei0Var2.getClass();
                AndroidUtilities.runOnUIThread(new uf0(ei0Var2, tL_error, this.f38959c, 5));
                return;
            default:
                final ei0 ei0Var3 = this.f38958b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f38959c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ei0 ei0Var22 = ei0Var3;
                                    ei0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = ei0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (ei0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        vh0 f02 = ei0Var22.f0();
                                        ei0Var22.f35597j0.add(0, tL_chatInviteExported3);
                                        ei0Var22.h0(f02);
                                        org.telegram.messenger.q.r(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ei0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ei0 ei0Var32 = ei0Var3;
                                ArrayList arrayList = ei0Var32.f35596i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ei0Var32.f35602o0) {
                                            ei0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        vh0 f03 = ei0Var32.f0();
                                        if (ei0Var32.f35602o0 && ei0Var32.f35592f == ei0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ei0Var32.e != null) {
                                            ei0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ei0Var32.f35597j0.add(0, tL_chatInviteExported4);
                                        ei0Var32.h0(f03);
                                    } else {
                                        ei0Var32.f35608s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ei0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ei0Var32.getMessagesStorage().saveChatLinksCount(ei0Var32.f35600n, ei0Var32.d.invitesCount);
                                        }
                                    }
                                    if (ei0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.q.r(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ei0Var32), R.raw.linkbroken, 36);
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
