package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kh0 implements RequestDelegate {
    public final int f39488a;
    public final ai0 f39489b;
    public final TLRPC.TL_chatInviteExported f39490c;

    public kh0(ai0 ai0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f39488a = i10;
        this.f39489b = ai0Var;
        this.f39490c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39488a) {
            case 0:
                final ai0 ai0Var = this.f39489b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39490c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ai0 ai0Var2 = ai0Var;
                                    ai0Var2.f35822e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = ai0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (ai0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        rh0 f02 = ai0Var2.f0();
                                        ai0Var2.f35829j0.add(0, tL_chatInviteExported3);
                                        ai0Var2.h0(f02);
                                        org.telegram.messenger.v0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ai0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ai0 ai0Var3 = ai0Var;
                                ArrayList arrayList = ai0Var3.f35828i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ai0Var3.f35834o0) {
                                            ai0Var3.f35822e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        rh0 f03 = ai0Var3.f0();
                                        if (ai0Var3.f35834o0 && ai0Var3.f35824f == ai0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ai0Var3.f35822e != null) {
                                            ai0Var3.f35822e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ai0Var3.f35829j0.add(0, tL_chatInviteExported4);
                                        ai0Var3.h0(f03);
                                    } else {
                                        ai0Var3.f35840s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ai0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ai0Var3.getMessagesStorage().saveChatLinksCount(ai0Var3.f35832n, ai0Var3.d.invitesCount);
                                        }
                                    }
                                    if (ai0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.v0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ai0Var3), R.raw.linkbroken, 36);
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
                ai0 ai0Var2 = this.f39489b;
                ai0Var2.getClass();
                AndroidUtilities.runOnUIThread(new pf0(ai0Var2, tL_error, this.f39490c, 5));
                return;
            default:
                final ai0 ai0Var3 = this.f39489b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f39490c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    ai0 ai0Var22 = ai0Var3;
                                    ai0Var22.f35822e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = ai0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (ai0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        rh0 f02 = ai0Var22.f0();
                                        ai0Var22.f35829j0.add(0, tL_chatInviteExported3);
                                        ai0Var22.h0(f02);
                                        org.telegram.messenger.v0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ai0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ai0 ai0Var32 = ai0Var3;
                                ArrayList arrayList = ai0Var32.f35828i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!ai0Var32.f35834o0) {
                                            ai0Var32.f35822e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        rh0 f03 = ai0Var32.f0();
                                        if (ai0Var32.f35834o0 && ai0Var32.f35824f == ai0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (ai0Var32.f35822e != null) {
                                            ai0Var32.f35822e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        ai0Var32.f35829j0.add(0, tL_chatInviteExported4);
                                        ai0Var32.h0(f03);
                                    } else {
                                        ai0Var32.f35840s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = ai0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            ai0Var32.getMessagesStorage().saveChatLinksCount(ai0Var32.f35832n, ai0Var32.d.invitesCount);
                                        }
                                    }
                                    if (ai0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.v0.q(R.string.InviteRevokedHint, org.telegram.ui.Components.zc.a0(ai0Var32), R.raw.linkbroken, 36);
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
