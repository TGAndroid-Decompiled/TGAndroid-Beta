package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ni implements org.telegram.ui.Components.hj0 {
    public final an f49567a;

    public ni(an anVar) {
        this.f49567a = anVar;
    }

    @Override
    public final boolean c1(View view) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        an anVar = this.f49567a;
        if (!anVar.X9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).Q2())) {
            String Q = anVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().f26505r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                if (anVar.f45258k6 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (chatFull = anVar.f45333q8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.t3.w0(chatFull, Q);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.f23825l0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                        if (!kVar.x() && !anVar.z() && !anVar.c() && !messageObject.r4()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void f(float f10, float f11, int i7, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.messenger.gj messageObject2;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.f49567a;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (!z10) {
            anVar.Q4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.t0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.f23819k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > anVar.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && org.telegram.messenger.gj.B0(messageObject2.f23819k) == 777000) {
                        Activity parentActivity = anVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                        int e12 = messageObject2.e1();
                        e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                        org.telegram.ui.Wallet.d2.q(parentActivity, i10, j3, e12, e6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                if (t0Var.getMessageObject().f23825l0) {
                    if (!anVar.f45275lb) {
                        Bundle bundle = new Bundle();
                        int i11 = t0Var.getMessageObject().f23819k.date;
                        bundle.putLong("dialog_id", anVar.f45258k6);
                        bundle.putLong("topic_id", anVar.b());
                        bundle.putInt("type", 0);
                        i8 i8Var = new i8(0, i11, bundle);
                        i8Var.O = anVar;
                        anVar.presentFragment(i8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
                if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().f23819k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    anVar.getNotificationCenter().k(org.telegram.messenger.ns.f25540n3, Long.valueOf(anVar.f45258k6));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().f23819k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    org.telegram.messenger.g0.i3(new ai.w0(this, t0Var3.getMessageObject().N1(), 24), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar.x() && !anVar.Y9()) {
                if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.Y5();
                    messageObject.M1 = true;
                    q1Var.H1();
                    view.requestLayout();
                    if (i7 >= 0) {
                        anVar.D0.g(i7);
                        return;
                    }
                    return;
                }
                anVar.Y7(view, true, false, f10, f11, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (anVar.f45372t9.z(q1Var2.getMessageObject())) {
                    return;
                }
                z12 = !q1Var2.C2(f10);
            }
            an.k2(anVar, view, z12, f10, f11);
        }
    }

    @Override
    public final void r0(View view, float f10, float f11) {
        org.telegram.messenger.gj messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        an anVar = this.f49567a;
        if (anVar.getParentActivity() != null && !anVar.z() && !anVar.c() && !anVar.isInPreviewMode() && !anVar.X9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.t0) {
                messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                if (messageObject.f23825l0) {
                    return;
                }
            } else {
                return;
            }
            org.telegram.messenger.gj gjVar = messageObject;
            if (!(gjVar.f23819k instanceof TLRPC.TL_message_secret) && gjVar.z() && !gjVar.g3() && gjVar.D != 27) {
                TLRPC.Chat chat = anVar.f45172e;
                if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, anVar.f45172e)) {
                    boolean z10 = false;
                    ch.l0.b(false);
                    String Q = anVar.getMediaDataController().Q();
                    if (Q.startsWith("animated_")) {
                        if (anVar.f45258k6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = anVar.f45333q8) != null) {
                            z10 = org.telegram.messenger.t3.w0(chatFull2, Q);
                        }
                        if (z10) {
                            anVar.Eb(view, gjVar, null, null, f10, f11, ch.p0.b(Q), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().f26505r.get(Q);
                    if (tL_availableReaction != null && !gjVar.r4()) {
                        if (anVar.f45258k6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = anVar.f45333q8) != null) {
                            z10 = org.telegram.messenger.t3.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            anVar.Eb(view, gjVar, null, null, f10, f11, ch.p0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
