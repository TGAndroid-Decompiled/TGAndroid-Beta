package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ch0 implements RequestDelegate {
    public final int f32725a;
    public final sh0 f32726b;
    public final TLRPC.TL_chatInviteExported f32727c;

    public ch0(sh0 sh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f32725a = i10;
        this.f32726b = sh0Var;
        this.f32727c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32725a) {
            case 0:
                final sh0 sh0Var = this.f32726b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f32727c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    sh0 sh0Var2 = sh0Var;
                                    sh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = sh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (sh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        jh0 f02 = sh0Var2.f0();
                                        sh0Var2.f37781j0.add(0, tL_chatInviteExported3);
                                        sh0Var2.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(sh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sh0 sh0Var3 = sh0Var;
                                ArrayList arrayList = sh0Var3.f37780i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!sh0Var3.f37786o0) {
                                            sh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        jh0 f03 = sh0Var3.f0();
                                        if (sh0Var3.f37786o0 && sh0Var3.f37776f == sh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (sh0Var3.e != null) {
                                            sh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        sh0Var3.f37781j0.add(0, tL_chatInviteExported4);
                                        sh0Var3.h0(f03);
                                    } else {
                                        sh0Var3.f37792s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = sh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            sh0Var3.getMessagesStorage().saveChatLinksCount(sh0Var3.f37784n, sh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (sh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(sh0Var3), R.raw.linkbroken, 36);
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
                sh0 sh0Var2 = this.f32726b;
                sh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new jf0(sh0Var2, tL_error, this.f32727c, 5));
                return;
            default:
                final sh0 sh0Var3 = this.f32726b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f32727c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    sh0 sh0Var22 = sh0Var3;
                                    sh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = sh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (sh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        jh0 f02 = sh0Var22.f0();
                                        sh0Var22.f37781j0.add(0, tL_chatInviteExported3);
                                        sh0Var22.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(sh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                sh0 sh0Var32 = sh0Var3;
                                ArrayList arrayList = sh0Var32.f37780i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!sh0Var32.f37786o0) {
                                            sh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        jh0 f03 = sh0Var32.f0();
                                        if (sh0Var32.f37786o0 && sh0Var32.f37776f == sh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (sh0Var32.e != null) {
                                            sh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        sh0Var32.f37781j0.add(0, tL_chatInviteExported4);
                                        sh0Var32.h0(f03);
                                    } else {
                                        sh0Var32.f37792s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = sh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            sh0Var32.getMessagesStorage().saveChatLinksCount(sh0Var32.f37784n, sh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (sh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(sh0Var32), R.raw.linkbroken, 36);
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
