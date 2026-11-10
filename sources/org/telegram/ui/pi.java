package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pi implements org.telegram.ui.Components.cj0 {
    public final cn f48774a;

    public pi(cn cnVar) {
        this.f48774a = cnVar;
    }

    @Override
    public final void f(float f10, float f11, int i7, View view) {
        boolean z9;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.ij messageObject2;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        cn cnVar = this.f48774a;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).inPreviewMode;
        if (!z9) {
            cnVar.P4 = true;
            boolean z10 = view instanceof org.telegram.ui.Cells.t0;
            if (z10 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.f23266k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > cnVar.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && org.telegram.messenger.ij.B0(messageObject2.f23266k) == 777000) {
                        Activity parentActivity = cnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                        int e12 = messageObject2.e1();
                        h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                        org.telegram.ui.Wallet.d2.q(parentActivity, i10, j3, e12, h6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z11 = false;
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                if (t0Var.getMessageObject().f23263j0) {
                    if (!cnVar.kb) {
                        Bundle bundle = new Bundle();
                        int i11 = t0Var.getMessageObject().f23266k.date;
                        bundle.putLong("dialog_id", cnVar.f44545j6);
                        bundle.putLong("topic_id", cnVar.b());
                        bundle.putInt("type", 0);
                        h8 h8Var = new h8(0, i11, bundle);
                        h8Var.N = cnVar;
                        cnVar.presentFragment(h8Var);
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
                if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().f23266k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    cnVar.getNotificationCenter().k(org.telegram.messenger.qs.f25047n3, Long.valueOf(cnVar.f44545j6));
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().f23266k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, t0Var3.getMessageObject().N1(), 23), 16L);
                    return;
                }
            }
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (!lVar.x() && !cnVar.X9()) {
                if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.Y5();
                    messageObject.K1 = true;
                    q1Var.G1();
                    view.requestLayout();
                    if (i7 >= 0) {
                        cnVar.C0.g(i7);
                        return;
                    }
                    return;
                }
                cnVar.Y7(view, true, false, f10, f11, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (cnVar.s9.z(q1Var2.getMessageObject())) {
                    return;
                }
                z11 = !q1Var2.B2(f10);
            }
            cn.k2(cnVar, view, z11, f10, f11);
        }
    }

    @Override
    public final boolean f1(View view) {
        boolean z9;
        boolean z10;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.ChatFull chatFull;
        cn cnVar = this.f48774a;
        if (!cnVar.W9() && (!((z9 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).P2())) {
            String Q = cnVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cnVar.getMediaDataController().f25840r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                if (cnVar.f44545j6 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && (chatFull = cnVar.f44620p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z10 = org.telegram.messenger.t3.w0(chatFull, Q);
                }
                if (z10) {
                    if (z9) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.f23263j0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                        if (!lVar.x() && !cnVar.z() && !cnVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.ij messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        cn cnVar = this.f48774a;
        if (cnVar.getParentActivity() != null && !cnVar.z() && !cnVar.c() && !cnVar.isInPreviewMode() && !cnVar.W9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.t0) {
                messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                if (messageObject.f23263j0) {
                    return;
                }
            } else {
                return;
            }
            org.telegram.messenger.ij ijVar = messageObject;
            if (!(ijVar.f23266k instanceof TLRPC.TL_message_secret) && ijVar.z() && !ijVar.g3() && ijVar.D != 27) {
                TLRPC.Chat chat = cnVar.f44473e;
                if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, cnVar.f44473e)) {
                    boolean z9 = false;
                    ch.k0.b(false);
                    String Q = cnVar.getMediaDataController().Q();
                    if (Q.startsWith("animated_")) {
                        if (cnVar.f44545j6 >= 0) {
                            z9 = true;
                        }
                        if (!z9 && (chatFull2 = cnVar.f44620p8) != null) {
                            z9 = org.telegram.messenger.t3.w0(chatFull2, Q);
                        }
                        if (z9) {
                            cnVar.Db(view, ijVar, null, null, f10, f11, ch.o0.b(Q), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cnVar.getMediaDataController().f25840r.get(Q);
                    if (tL_availableReaction != null && !ijVar.r4()) {
                        if (cnVar.f44545j6 >= 0) {
                            z9 = true;
                        }
                        if (!z9 && (chatFull = cnVar.f44620p8) != null) {
                            z9 = org.telegram.messenger.t3.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z9) {
                            cnVar.Db(view, ijVar, null, null, f10, f11, ch.o0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
