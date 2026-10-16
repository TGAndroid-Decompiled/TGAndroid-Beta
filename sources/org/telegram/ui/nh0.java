package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nh0 implements RequestDelegate {
    public final int f38397a;
    public final di0 f38398b;
    public final TLRPC.TL_chatInviteExported f38399c;

    public nh0(di0 di0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f38397a = i10;
        this.f38398b = di0Var;
        this.f38399c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38397a) {
            case 0:
                final di0 di0Var = this.f38398b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38399c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    di0 di0Var2 = di0Var;
                                    di0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = di0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (di0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        uh0 f02 = di0Var2.f0();
                                        di0Var2.f35043j0.add(0, tL_chatInviteExported3);
                                        di0Var2.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(di0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                di0 di0Var3 = di0Var;
                                ArrayList arrayList = di0Var3.f35042i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!di0Var3.f35048o0) {
                                            di0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        uh0 f03 = di0Var3.f0();
                                        if (di0Var3.f35048o0 && di0Var3.f35038f == di0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (di0Var3.e != null) {
                                            di0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        di0Var3.f35043j0.add(0, tL_chatInviteExported4);
                                        di0Var3.h0(f03);
                                    } else {
                                        di0Var3.f35054s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = di0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            di0Var3.getMessagesStorage().saveChatLinksCount(di0Var3.f35046n, di0Var3.d.invitesCount);
                                        }
                                    }
                                    if (di0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(di0Var3), R.raw.linkbroken, 36);
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
                di0 di0Var2 = this.f38398b;
                di0Var2.getClass();
                AndroidUtilities.runOnUIThread(new tf0(di0Var2, tL_error, this.f38399c, 5));
                return;
            default:
                final di0 di0Var3 = this.f38398b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f38399c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    di0 di0Var22 = di0Var3;
                                    di0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = di0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (di0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        uh0 f02 = di0Var22.f0();
                                        di0Var22.f35043j0.add(0, tL_chatInviteExported3);
                                        di0Var22.h0(f02);
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(di0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                di0 di0Var32 = di0Var3;
                                ArrayList arrayList = di0Var32.f35042i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!di0Var32.f35048o0) {
                                            di0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        uh0 f03 = di0Var32.f0();
                                        if (di0Var32.f35048o0 && di0Var32.f35038f == di0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (di0Var32.e != null) {
                                            di0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        di0Var32.f35043j0.add(0, tL_chatInviteExported4);
                                        di0Var32.h0(f03);
                                    } else {
                                        di0Var32.f35054s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = di0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            di0Var32.getMessagesStorage().saveChatLinksCount(di0Var32.f35046n, di0Var32.d.invitesCount);
                                        }
                                    }
                                    if (di0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.g0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(di0Var32), R.raw.linkbroken, 36);
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
