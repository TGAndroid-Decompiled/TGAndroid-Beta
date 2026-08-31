package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ah0 implements RequestDelegate {
    public final int f35178a;
    public final qh0 f35179b;
    public final TLRPC.TL_chatInviteExported f35180c;

    public ah0(qh0 qh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f35178a = i10;
        this.f35179b = qh0Var;
        this.f35180c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35178a) {
            case 0:
                final qh0 qh0Var = this.f35179b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35180c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    qh0 qh0Var2 = qh0Var;
                                    qh0Var2.f40507e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = qh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (qh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        hh0 f02 = qh0Var2.f0();
                                        qh0Var2.f40511g0.add(0, tL_chatInviteExported3);
                                        qh0Var2.h0(f02);
                                        l.d.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(qh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qh0 qh0Var3 = qh0Var;
                                ArrayList arrayList = qh0Var3.f40510f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!qh0Var3.f40516l0) {
                                            qh0Var3.f40507e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        hh0 f03 = qh0Var3.f0();
                                        if (qh0Var3.f40516l0 && qh0Var3.f40509f == qh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (qh0Var3.f40507e != null) {
                                            qh0Var3.f40507e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        qh0Var3.f40511g0.add(0, tL_chatInviteExported4);
                                        qh0Var3.h0(f03);
                                    } else {
                                        qh0Var3.f40520p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = qh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            qh0Var3.getMessagesStorage().saveChatLinksCount(qh0Var3.f40517n, qh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (qh0Var3.getParentActivity() != null) {
                                        l.d.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(qh0Var3), R.raw.linkbroken, 36);
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
                qh0 qh0Var2 = this.f35179b;
                qh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new if0(qh0Var2, tL_error, this.f35180c, 5));
                return;
            default:
                final qh0 qh0Var3 = this.f35179b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f35180c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    qh0 qh0Var22 = qh0Var3;
                                    qh0Var22.f40507e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = qh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (qh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        hh0 f02 = qh0Var22.f0();
                                        qh0Var22.f40511g0.add(0, tL_chatInviteExported3);
                                        qh0Var22.h0(f02);
                                        l.d.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(qh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                qh0 qh0Var32 = qh0Var3;
                                ArrayList arrayList = qh0Var32.f40510f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!qh0Var32.f40516l0) {
                                            qh0Var32.f40507e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        hh0 f03 = qh0Var32.f0();
                                        if (qh0Var32.f40516l0 && qh0Var32.f40509f == qh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (qh0Var32.f40507e != null) {
                                            qh0Var32.f40507e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        qh0Var32.f40511g0.add(0, tL_chatInviteExported4);
                                        qh0Var32.h0(f03);
                                    } else {
                                        qh0Var32.f40520p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = qh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            qh0Var32.getMessagesStorage().saveChatLinksCount(qh0Var32.f40517n, qh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (qh0Var32.getParentActivity() != null) {
                                        l.d.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(qh0Var32), R.raw.linkbroken, 36);
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
