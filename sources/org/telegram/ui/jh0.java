package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jh0 implements RequestDelegate {
    public final int f34102a;
    public final zh0 f34103b;
    public final TLRPC.TL_chatInviteExported f34104c;

    public jh0(zh0 zh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f34102a = i10;
        this.f34103b = zh0Var;
        this.f34104c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34102a) {
            case 0:
                final zh0 zh0Var = this.f34103b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f34104c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    zh0 zh0Var2 = zh0Var;
                                    zh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = zh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (zh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        qh0 f02 = zh0Var2.f0();
                                        zh0Var2.f39335j0.add(0, tL_chatInviteExported3);
                                        zh0Var2.h0(f02);
                                        org.telegram.messenger.a2.o(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.a0(zh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zh0 zh0Var3 = zh0Var;
                                ArrayList arrayList = zh0Var3.f39334i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!zh0Var3.f39340o0) {
                                            zh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        qh0 f03 = zh0Var3.f0();
                                        if (zh0Var3.f39340o0 && zh0Var3.f39330f == zh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (zh0Var3.e != null) {
                                            zh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        zh0Var3.f39335j0.add(0, tL_chatInviteExported4);
                                        zh0Var3.h0(f03);
                                    } else {
                                        zh0Var3.f39346s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = zh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            zh0Var3.getMessagesStorage().saveChatLinksCount(zh0Var3.f39338n, zh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (zh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.a2.o(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.a0(zh0Var3), R.raw.linkbroken, 36);
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
                zh0 zh0Var2 = this.f34103b;
                zh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new pf0(zh0Var2, tL_error, this.f34104c, 5));
                return;
            default:
                final zh0 zh0Var3 = this.f34103b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f34104c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    zh0 zh0Var22 = zh0Var3;
                                    zh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = zh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (zh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        qh0 f02 = zh0Var22.f0();
                                        zh0Var22.f39335j0.add(0, tL_chatInviteExported3);
                                        zh0Var22.h0(f02);
                                        org.telegram.messenger.a2.o(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.a0(zh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zh0 zh0Var32 = zh0Var3;
                                ArrayList arrayList = zh0Var32.f39334i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!zh0Var32.f39340o0) {
                                            zh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        qh0 f03 = zh0Var32.f0();
                                        if (zh0Var32.f39340o0 && zh0Var32.f39330f == zh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (zh0Var32.e != null) {
                                            zh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        zh0Var32.f39335j0.add(0, tL_chatInviteExported4);
                                        zh0Var32.h0(f03);
                                    } else {
                                        zh0Var32.f39346s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = zh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            zh0Var32.getMessagesStorage().saveChatLinksCount(zh0Var32.f39338n, zh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (zh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.a2.o(R.string.InviteRevokedHint, org.telegram.ui.Components.wc.a0(zh0Var32), R.raw.linkbroken, 36);
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
