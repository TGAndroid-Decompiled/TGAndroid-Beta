package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ni implements org.telegram.ui.Components.cj0 {
    public final an f48047a;

    public ni(an anVar) {
        this.f48047a = anVar;
    }

    @Override
    public final void f(float f10, float f11, int i7, View view) {
        boolean z9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.messenger.ij messageObject2;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        an anVar = this.f48047a;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (!z9) {
            anVar.P4 = true;
            boolean z10 = view instanceof org.telegram.ui.Cells.t0;
            if (z10 && (messageObject2 = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.f23237k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > anVar.getConnectionsManager().getCurrentTime() && !messageObject2.O3() && org.telegram.messenger.ij.B0(messageObject2.f23237k) == 777000) {
                        Activity parentActivity = anVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                        int f12 = messageObject2.f1();
                        f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                        org.telegram.ui.Wallet.f2.q(parentActivity, i10, j3, f12, f6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z11 = false;
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                if (t0Var.getMessageObject().f23234j0) {
                    if (!anVar.f43836ib) {
                        Bundle bundle = new Bundle();
                        int i11 = t0Var.getMessageObject().f23237k.date;
                        bundle.putLong("dialog_id", anVar.f43843j6);
                        bundle.putLong("topic_id", anVar.b());
                        bundle.putInt("type", 0);
                        h8 h8Var = new h8(0, i11, bundle);
                        h8Var.N = anVar;
                        anVar.presentFragment(h8Var);
                        return;
                    }
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) view;
                if (t0Var2.getMessageObject() != null && (t0Var2.getMessageObject().f23237k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    anVar.getNotificationCenter().k(org.telegram.messenger.qs.f25026n3, Long.valueOf(anVar.f43843j6));
                    return;
                }
            }
            if (z10) {
                org.telegram.ui.Cells.t0 t0Var3 = (org.telegram.ui.Cells.t0) view;
                if (t0Var3.getMessageObject() != null && (t0Var3.getMessageObject().f23237k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, t0Var3.getMessageObject().O1(), 23), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (!kVar.v() && !anVar.W9()) {
                if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.Z5();
                    messageObject.K1 = true;
                    q1Var.G1();
                    view.requestLayout();
                    if (i7 >= 0) {
                        anVar.C0.g(i7);
                        return;
                    }
                    return;
                }
                anVar.X7(view, true, false, f10, f11, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (anVar.f43931q9.z(q1Var2.getMessageObject())) {
                    return;
                }
                z11 = !q1Var2.B2(f10);
            }
            an.j2(anVar, view, z11, f10, f11);
        }
    }

    @Override
    public final boolean f1(View view) {
        boolean z9;
        boolean z10;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        an anVar = this.f48047a;
        if (!anVar.V9() && (!((z9 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).P2())) {
            String Q = anVar.getMediaDataController().Q();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().f25825r.get(Q);
            if (tL_availableReaction != null || (Q != null && Q.startsWith("animated_"))) {
                if (anVar.f43843j6 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && (chatFull = anVar.f43917p8) != null) {
                    if (tL_availableReaction != null) {
                        Q = tL_availableReaction.reaction;
                    }
                    z10 = org.telegram.messenger.t3.v0(chatFull, Q);
                }
                if (z10) {
                    if (z9) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.t0) {
                        messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.f23234j0 && !messageObject.p4() && messageObject.z() && !messageObject.Z2()) {
                        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                        if (!kVar.v() && !anVar.z() && !anVar.c() && !messageObject.s4()) {
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
        an anVar = this.f48047a;
        if (anVar.getParentActivity() != null && !anVar.z() && !anVar.c() && !anVar.isInPreviewMode() && !anVar.V9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.t0) {
                messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject();
                if (messageObject.f23234j0) {
                    return;
                }
            } else {
                return;
            }
            org.telegram.messenger.ij ijVar = messageObject;
            if (!(ijVar.f23237k instanceof TLRPC.TL_message_secret) && ijVar.z() && !ijVar.h3() && ijVar.D != 27) {
                TLRPC.Chat chat = anVar.f43772e;
                if (chat == null || org.telegram.messenger.t3.V(chat) || org.telegram.messenger.t3.w(26, anVar.f43772e)) {
                    boolean z9 = false;
                    ch.k0.b(false);
                    String Q = anVar.getMediaDataController().Q();
                    if (Q.startsWith("animated_")) {
                        if (anVar.f43843j6 >= 0) {
                            z9 = true;
                        }
                        if (!z9 && (chatFull2 = anVar.f43917p8) != null) {
                            z9 = org.telegram.messenger.t3.v0(chatFull2, Q);
                        }
                        if (z9) {
                            anVar.Ab(view, ijVar, null, null, f10, f11, ch.o0.b(Q), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) anVar.getMediaDataController().f25825r.get(Q);
                    if (tL_availableReaction != null && !ijVar.s4()) {
                        if (anVar.f43843j6 >= 0) {
                            z9 = true;
                        }
                        if (!z9 && (chatFull = anVar.f43917p8) != null) {
                            z9 = org.telegram.messenger.t3.v0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z9) {
                            anVar.Ab(view, ijVar, null, null, f10, f11, ch.o0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
