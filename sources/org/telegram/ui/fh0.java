package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fh0 implements RequestDelegate {
    public final int f33562a;
    public final vh0 f33563b;
    public final TLRPC.TL_chatInviteExported f33564c;

    public fh0(vh0 vh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        this.f33562a = i10;
        this.f33563b = vh0Var;
        this.f33564c = tL_chatInviteExported;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f33562a) {
            case 0:
                final vh0 vh0Var = this.f33563b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f33564c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tLObject;
                                    vh0 vh0Var2 = vh0Var;
                                    vh0Var2.e = tL_chatInviteExported2;
                                    TLRPC.ChatFull chatFull = vh0Var2.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported2;
                                    }
                                    if (vh0Var2.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported;
                                        tL_chatInviteExported3.revoked = true;
                                        mh0 f02 = vh0Var2.f0();
                                        vh0Var2.f38595j0.add(0, tL_chatInviteExported3);
                                        vh0Var2.h0(f02);
                                        org.telegram.messenger.l0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(vh0Var2), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                vh0 vh0Var3 = vh0Var;
                                ArrayList arrayList = vh0Var3.f38594i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!vh0Var3.f38600o0) {
                                            vh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        mh0 f03 = vh0Var3.f0();
                                        if (vh0Var3.f38600o0 && vh0Var3.f38590f == vh0Var3.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (vh0Var3.e != null) {
                                            vh0Var3.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        vh0Var3.f38595j0.add(0, tL_chatInviteExported4);
                                        vh0Var3.h0(f03);
                                    } else {
                                        vh0Var3.f38606s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = vh0Var3.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            vh0Var3.getMessagesStorage().saveChatLinksCount(vh0Var3.f38598n, vh0Var3.d.invitesCount);
                                        }
                                    }
                                    if (vh0Var3.getParentActivity() != null) {
                                        org.telegram.messenger.l0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(vh0Var3), R.raw.linkbroken, 36);
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
                vh0 vh0Var2 = this.f33563b;
                vh0Var2.getClass();
                AndroidUtilities.runOnUIThread(new mf0(vh0Var2, tL_error, this.f33564c, 5));
                return;
            default:
                final vh0 vh0Var3 = this.f33563b;
                final TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.f33564c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                if (tL_error == null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = (TLRPC.TL_chatInviteExported) tLObject;
                                    vh0 vh0Var22 = vh0Var3;
                                    vh0Var22.e = tL_chatInviteExported22;
                                    TLRPC.ChatFull chatFull = vh0Var22.d;
                                    if (chatFull != null) {
                                        chatFull.exported_invite = tL_chatInviteExported22;
                                    }
                                    if (vh0Var22.getParentActivity() != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported3 = tL_chatInviteExported2;
                                        tL_chatInviteExported3.revoked = true;
                                        mh0 f02 = vh0Var22.f0();
                                        vh0Var22.f38595j0.add(0, tL_chatInviteExported3);
                                        vh0Var22.h0(f02);
                                        org.telegram.messenger.l0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(vh0Var22), R.raw.linkbroken, 36);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                vh0 vh0Var32 = vh0Var3;
                                ArrayList arrayList = vh0Var32.f38594i0;
                                if (tL_error == null) {
                                    TLObject tLObject2 = tLObject;
                                    boolean z10 = tLObject2 instanceof TLRPC.TL_messages_exportedChatInviteReplaced;
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = tL_chatInviteExported2;
                                    if (z10) {
                                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject2;
                                        if (!vh0Var32.f38600o0) {
                                            vh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        tL_chatInviteExported4.revoked = true;
                                        mh0 f03 = vh0Var32.f0();
                                        if (vh0Var32.f38600o0 && vh0Var32.f38590f == vh0Var32.getAccountInstance().getUserConfig().getClientUserId()) {
                                            arrayList.remove(tL_chatInviteExported4);
                                            arrayList.add(0, (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite);
                                        } else if (vh0Var32.e != null) {
                                            vh0Var32.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                                        }
                                        vh0Var32.f38595j0.add(0, tL_chatInviteExported4);
                                        vh0Var32.h0(f03);
                                    } else {
                                        vh0Var32.f38606s0.b(tL_chatInviteExported4, tLObject2);
                                        TLRPC.ChatFull chatFull2 = vh0Var32.d;
                                        if (chatFull2 != null) {
                                            int i10 = chatFull2.invitesCount - 1;
                                            chatFull2.invitesCount = i10;
                                            if (i10 < 0) {
                                                chatFull2.invitesCount = 0;
                                            }
                                            vh0Var32.getMessagesStorage().saveChatLinksCount(vh0Var32.f38598n, vh0Var32.d.invitesCount);
                                        }
                                    }
                                    if (vh0Var32.getParentActivity() != null) {
                                        org.telegram.messenger.l0.o(R.string.InviteRevokedHint, org.telegram.ui.Components.xc.a0(vh0Var32), R.raw.linkbroken, 36);
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
