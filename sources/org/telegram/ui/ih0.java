package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ih0 implements RequestDelegate {
    public final int f37400a;
    public final yh0 f37401b;
    public final TLRPC.TL_chatInviteExported f37402c;

    public ih0(yh0 yh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f37400a = i10;
        this.f37401b = yh0Var;
        this.f37402c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37400a) {
            case 0:
                final yh0 yh0Var = this.f37401b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f37402c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    yh0 yh0Var2 = yh0Var;
                                    yh0Var2.f43153e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = yh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (yh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ph0 f02 = yh0Var2.f0();
                                        yh0Var2.f43160j0.add(0, tL_chatInviteExported3);
                                        yh0Var2.h0(f02);
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yh0 yh0Var3 = yh0Var;
                                ArrayList arrayList = yh0Var3.f43159i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh0Var3.f43165o0) {
                                            yh0Var3.f43153e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ph0 f03 = yh0Var3.f0();
                                        if (yh0Var3.f43165o0 && yh0Var3.f43155f == yh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh0Var3.f43153e != null) {
                                            yh0Var3.f43153e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh0Var3.f43160j0.add(0, tL_chatInviteExported4);
                                        yh0Var3.h0(f03);
                                    } else {
                                        yh0Var3.f43171s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh0Var3.getMessagesStorage().saveChatLinksCount(yh0Var3.f43163n, yh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (yh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var3), R.raw.linkbroken, 36);
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
                yh0 yh0Var2 = this.f37401b;
                yh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new pf0(yh0Var2, tL_error, this.f37402c, 5));
                return;
            default:
                final yh0 yh0Var3 = this.f37401b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f37402c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    yh0 yh0Var22 = yh0Var3;
                                    yh0Var22.f43153e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = yh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (yh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        ph0 f02 = yh0Var22.f0();
                                        yh0Var22.f43160j0.add(0, tL_chatInviteExported3);
                                        yh0Var22.h0(f02);
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                yh0 yh0Var32 = yh0Var3;
                                ArrayList arrayList = yh0Var32.f43159i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!yh0Var32.f43165o0) {
                                            yh0Var32.f43153e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ph0 f03 = yh0Var32.f0();
                                        if (yh0Var32.f43165o0 && yh0Var32.f43155f == yh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (yh0Var32.f43153e != null) {
                                            yh0Var32.f43153e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        yh0Var32.f43160j0.add(0, tL_chatInviteExported4);
                                        yh0Var32.h0(f03);
                                    } else {
                                        yh0Var32.f43171s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = yh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            yh0Var32.getMessagesStorage().saveChatLinksCount(yh0Var32.f43163n, yh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (yh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.w1.o(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(yh0Var32), R.raw.linkbroken, 36);
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
