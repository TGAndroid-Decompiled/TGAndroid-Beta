package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fj implements org.telegram.ui.Components.hk0 {
    public final un f37281a;

    public fj(un unVar) {
        this.f37281a = unVar;
    }

    @Override
    public final void b(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj messageObject;
        org.telegram.messenger.jj messageObject2;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.f37281a;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (!z10) {
            unVar.P4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.s0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.f16337k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > unVar.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && org.telegram.messenger.jj.B0(messageObject2.f16337k) == 777000) {
                        Activity parentActivity = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                        int f12 = messageObject2.f1();
                        p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                        org.telegram.ui.Wallet.e2.q(parentActivity, i11, j10, f12, p6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                if (s0Var.getMessageObject().f16334j0) {
                    if (!unVar.f42289ib) {
                        Bundle bundle = new Bundle();
                        int i12 = s0Var.getMessageObject().f16337k.date;
                        bundle.putLong("dialog_id", unVar.f42297j6);
                        bundle.putLong("topic_id", unVar.b());
                        bundle.putInt("type", 0);
                        h8 h8Var = new h8(0, i12, bundle);
                        h8Var.N = unVar;
                        unVar.presentFragment(h8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) view;
                if (s0Var2.getMessageObject() != null && (s0Var2.getMessageObject().f16337k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    unVar.getNotificationCenter().k(org.telegram.messenger.zs.f19656n3, Long.valueOf(unVar.f42297j6));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.s0 s0Var3 = (org.telegram.ui.Cells.s0) view;
                if (s0Var3.getMessageObject() != null && (s0Var3.getMessageObject().f16337k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    org.telegram.messenger.i0.h3(new ag.d3(this, s0Var3.getMessageObject().O1(), 16), 16L);
                    return;
                }
            }
            lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
            if (!lVar.u() && !unVar.M9()) {
                if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.W5();
                    messageObject.K1 = true;
                    q1Var.E1();
                    view.requestLayout();
                    if (i10 >= 0) {
                        unVar.C0.g(i10);
                        return;
                    }
                    return;
                }
                unVar.Q7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (unVar.f42386q9.z(q1Var2.getMessageObject())) {
                    return;
                }
                z12 = !q1Var2.y2(f7);
            }
            un.i2(unVar, view, z12, f7, f10);
        }
    }

    @Override
    public final boolean h1(View view) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.jj messageObject;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.ChatFull chatFull;
        un unVar = this.f37281a;
        if (!unVar.L9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).M2())) {
            String Q = unVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) unVar.getMediaDataController().f18341r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                if (unVar.f42297j6 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (chatFull = unVar.f42374p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.w3.w0(chatFull, Q);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.s0) {
                        messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.f16334j0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                        if (!lVar.u() && !unVar.z() && !unVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void q0(View view, float f7, float f10) {
        org.telegram.messenger.jj messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        un unVar = this.f37281a;
        if (unVar.getParentActivity() != null && !unVar.z() && !unVar.c() && !unVar.isInPreviewMode() && !unVar.L9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.s0) {
                messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject();
                if (messageObject.f16334j0) {
                    return;
                }
            } else {
                return;
            }
            org.telegram.messenger.jj jjVar = messageObject;
            if (!(jjVar.f16337k instanceof TLRPC.TL_message_secret) && jjVar.z() && !jjVar.g3() && jjVar.D != 27) {
                TLRPC.Chat chat = unVar.e;
                if (chat == null || org.telegram.messenger.w3.V(chat) || org.telegram.messenger.w3.w(26, unVar.e)) {
                    boolean z10 = false;
                    sg.k0.b(false);
                    String Q = unVar.getMediaDataController().Q();
                    if (Q.startsWith("animated_")) {
                        if (unVar.f42297j6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = unVar.f42374p8) != null) {
                            z10 = org.telegram.messenger.w3.w0(chatFull2, Q);
                        }
                        if (z10) {
                            unVar.qb(view, jjVar, null, null, f7, f10, sg.o0.b(Q), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) unVar.getMediaDataController().f18341r.get(Q);
                    if (tL_availableReaction != null && !jjVar.r4()) {
                        if (unVar.f42297j6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = unVar.f42374p8) != null) {
                            z10 = org.telegram.messenger.w3.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            unVar.qb(view, jjVar, null, null, f7, f10, sg.o0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
