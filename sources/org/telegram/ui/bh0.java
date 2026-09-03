package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bh0 implements RequestDelegate {
    public final int f32886a;
    public final rh0 f32887b;
    public final TLRPC.TL_chatInviteExported f32888c;

    public bh0(rh0 rh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f32886a = i10;
        this.f32887b = rh0Var;
        this.f32888c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f32886a) {
            case 0:
                final rh0 rh0Var = this.f32887b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f32888c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    rh0 rh0Var2 = rh0Var;
                                    rh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = rh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (rh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        ih0 f02 = rh0Var2.f0();
                                        rh0Var2.f37852g0.add(0, tL_chatInviteExported3);
                                        rh0Var2.h0(f02);
                                        kf.k0.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(rh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                rh0 rh0Var3 = rh0Var;
                                ArrayList arrayList = rh0Var3.f37851f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!rh0Var3.f37857l0) {
                                            rh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ih0 f03 = rh0Var3.f0();
                                        if (rh0Var3.f37857l0 && rh0Var3.f37850f == rh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (rh0Var3.e != null) {
                                            rh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        rh0Var3.f37852g0.add(0, tL_chatInviteExported4);
                                        rh0Var3.h0(f03);
                                    } else {
                                        rh0Var3.f37861p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = rh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            rh0Var3.getMessagesStorage().saveChatLinksCount(rh0Var3.f37858n, rh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (rh0Var3.getParentActivity() != null) {
                                        kf.k0.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(rh0Var3), R.raw.linkbroken, 36);
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
                rh0 rh0Var2 = this.f32887b;
                rh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new jf0(rh0Var2, tL_error, this.f32888c, 5));
                return;
            default:
                final rh0 rh0Var3 = this.f32887b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f32888c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    rh0 rh0Var22 = rh0Var3;
                                    rh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = rh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (rh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        ih0 f02 = rh0Var22.f0();
                                        rh0Var22.f37852g0.add(0, tL_chatInviteExported3);
                                        rh0Var22.h0(f02);
                                        kf.k0.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(rh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                rh0 rh0Var32 = rh0Var3;
                                ArrayList arrayList = rh0Var32.f37851f0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z4 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z4) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!rh0Var32.f37857l0) {
                                            rh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        ih0 f03 = rh0Var32.f0();
                                        if (rh0Var32.f37857l0 && rh0Var32.f37850f == rh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (rh0Var32.e != null) {
                                            rh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        rh0Var32.f37852g0.add(0, tL_chatInviteExported4);
                                        rh0Var32.h0(f03);
                                    } else {
                                        rh0Var32.f37861p0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = rh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            rh0Var32.getMessagesStorage().saveChatLinksCount(rh0Var32.f37858n, rh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (rh0Var32.getParentActivity() != null) {
                                        kf.k0.v(R.string.InviteRevokedHint, org.telegram.ui.Components.qc.a0(rh0Var32), R.raw.linkbroken, 36);
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
