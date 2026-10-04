package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gh0 implements RequestDelegate {
    public final int f36644a;
    public final wh0 f36645b;
    public final TLRPC.TL_chatInviteExported f36646c;

    public gh0(wh0 wh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f36644a = i10;
        this.f36645b = wh0Var;
        this.f36646c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36644a) {
            case 0:
                final wh0 wh0Var = this.f36645b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f36646c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    wh0 wh0Var2 = wh0Var;
                                    wh0Var2.f42473e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = wh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (wh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        nh0 f02 = wh0Var2.f0();
                                        wh0Var2.f42480j0.add(0, tL_chatInviteExported3);
                                        wh0Var2.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wh0 wh0Var3 = wh0Var;
                                ArrayList arrayList = wh0Var3.f42479i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!wh0Var3.f42485o0) {
                                            wh0Var3.f42473e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        nh0 f03 = wh0Var3.f0();
                                        if (wh0Var3.f42485o0 && wh0Var3.f42475f == wh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (wh0Var3.f42473e != null) {
                                            wh0Var3.f42473e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        wh0Var3.f42480j0.add(0, tL_chatInviteExported4);
                                        wh0Var3.h0(f03);
                                    } else {
                                        wh0Var3.f42491s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = wh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            wh0Var3.getMessagesStorage().saveChatLinksCount(wh0Var3.f42483n, wh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (wh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var3), R.raw.linkbroken, 36);
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
                wh0 wh0Var2 = this.f36645b;
                wh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new nf0(wh0Var2, tL_error, this.f36646c, 5));
                return;
            default:
                final wh0 wh0Var3 = this.f36645b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f36646c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    wh0 wh0Var22 = wh0Var3;
                                    wh0Var22.f42473e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = wh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (wh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        nh0 f02 = wh0Var22.f0();
                                        wh0Var22.f42480j0.add(0, tL_chatInviteExported3);
                                        wh0Var22.h0(f02);
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                wh0 wh0Var32 = wh0Var3;
                                ArrayList arrayList = wh0Var32.f42479i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!wh0Var32.f42485o0) {
                                            wh0Var32.f42473e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        nh0 f03 = wh0Var32.f0();
                                        if (wh0Var32.f42485o0 && wh0Var32.f42475f == wh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (wh0Var32.f42473e != null) {
                                            wh0Var32.f42473e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        wh0Var32.f42480j0.add(0, tL_chatInviteExported4);
                                        wh0Var32.h0(f03);
                                    } else {
                                        wh0Var32.f42491s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = wh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            wh0Var32.getMessagesStorage().saveChatLinksCount(wh0Var32.f42483n, wh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (wh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.f0.p(R.string.InviteRevokedHint, org.telegram.ui.Components.yc.a0(wh0Var32), R.raw.linkbroken, 36);
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
