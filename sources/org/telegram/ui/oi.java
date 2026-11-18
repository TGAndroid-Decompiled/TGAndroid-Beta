package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class oi implements org.telegram.ui.Components.pj0 {
    public final bn f50618a;

    public oi(bn bnVar) {
        this.f50618a = bnVar;
    }

    @Override
    public final boolean b1(View view) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        bn bnVar = this.f50618a;
        if (!bnVar.X9() && (!((z10 = view instanceof org.telegram.ui.Cells.q1)) || !((org.telegram.ui.Cells.q1) view).S2())) {
            String S = bnVar.getMediaDataController().S();
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) bnVar.getMediaDataController().f26635r.get(S);
            if (tL_availableReaction != null || (S != null && S.startsWith("animated_"))) {
                if (bnVar.f46085l6 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && (chatFull = bnVar.f46163r8) != null) {
                    if (tL_availableReaction != null) {
                        S = tL_availableReaction.reaction;
                    }
                    z11 = org.telegram.messenger.v3.w0(chatFull, S);
                }
                if (z11) {
                    if (z10) {
                        messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
                    } else if (view instanceof org.telegram.ui.Cells.u0) {
                        messageObject = ((org.telegram.ui.Cells.u0) view).getMessageObject();
                    }
                    if (messageObject != null && !messageObject.f23974l0 && !messageObject.o4() && messageObject.z() && !messageObject.Y2()) {
                        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                        if (!kVar.y() && !bnVar.z() && !bnVar.c() && !messageObject.r4()) {
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
        org.telegram.messenger.fj messageObject;
        org.telegram.messenger.fj messageObject2;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        bn bnVar = this.f50618a;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
        if (!z10) {
            bnVar.R4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.u0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.u0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.f23968k.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > bnVar.getConnectionsManager().getCurrentTime() && !messageObject2.N3() && org.telegram.messenger.fj.B0(messageObject2.f23968k) == 777000) {
                        Activity parentActivity = bnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                        int e12 = messageObject2.e1();
                        i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                        org.telegram.ui.Wallet.l2.q(parentActivity, i10, j3, e12, i6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) view;
                if (u0Var.getMessageObject().f23974l0) {
                    if (!bnVar.mb) {
                        Bundle bundle = new Bundle();
                        int i11 = u0Var.getMessageObject().f23968k.date;
                        bundle.putLong("dialog_id", bnVar.f46085l6);
                        bundle.putLong("topic_id", bnVar.d());
                        bundle.putInt("type", 0);
                        i8 i8Var = new i8(0, i11, bundle);
                        i8Var.O = bnVar;
                        bnVar.presentFragment(i8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.u0 u0Var2 = (org.telegram.ui.Cells.u0) view;
                if (u0Var2.getMessageObject() != null && (u0Var2.getMessageObject().f23968k.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    bnVar.getNotificationCenter().k(org.telegram.messenger.ks.f25170p3, Long.valueOf(bnVar.f46085l6));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.u0 u0Var3 = (org.telegram.ui.Cells.u0) view;
                if (u0Var3.getMessageObject() != null && (u0Var3.getMessageObject().f23968k.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, u0Var3.getMessageObject().N1(), 27), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (!kVar.y() && !bnVar.Y9()) {
                if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) view).getMessageObject()) != null && messageObject.D == 27) {
                    messageObject.Y5();
                    messageObject.M1 = true;
                    q1Var.H1();
                    view.requestLayout();
                    if (i7 >= 0) {
                        bnVar.D0.g(i7);
                        return;
                    }
                    return;
                }
                bnVar.Y7(view, true, false, f10, f11, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
                if (bnVar.f46201u9.z(q1Var2.getMessageObject())) {
                    return;
                }
                z12 = !q1Var2.E2(f10);
            }
            bn.k2(bnVar, view, z12, f10, f11);
        }
    }

    @Override
    public final void s0(View view, float f10, float f11) {
        org.telegram.messenger.fj messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        bn bnVar = this.f50618a;
        if (bnVar.getParentActivity() != null && !bnVar.z() && !bnVar.c() && !bnVar.isInPreviewMode() && !bnVar.X9()) {
            if (view instanceof org.telegram.ui.Cells.q1) {
                messageObject = ((org.telegram.ui.Cells.q1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.u0) {
                messageObject = ((org.telegram.ui.Cells.u0) view).getMessageObject();
                if (messageObject.f23974l0) {
                    return;
                }
            } else {
                return;
            }
            org.telegram.messenger.fj fjVar = messageObject;
            if (!(fjVar.f23968k instanceof TLRPC.TL_message_secret) && fjVar.z() && !fjVar.g3() && fjVar.D != 27) {
                TLRPC.Chat chat = bnVar.f45987e;
                if (chat == null || org.telegram.messenger.v3.V(chat) || org.telegram.messenger.v3.w(26, bnVar.f45987e)) {
                    boolean z10 = false;
                    ch.l0.b(false);
                    String S = bnVar.getMediaDataController().S();
                    if (S.startsWith("animated_")) {
                        if (bnVar.f46085l6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = bnVar.f46163r8) != null) {
                            z10 = org.telegram.messenger.v3.w0(chatFull2, S);
                        }
                        if (z10) {
                            bnVar.Eb(view, fjVar, null, null, f10, f11, ch.p0.b(S), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) bnVar.getMediaDataController().f26635r.get(S);
                    if (tL_availableReaction != null && !fjVar.r4()) {
                        if (bnVar.f46085l6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = bnVar.f46163r8) != null) {
                            z10 = org.telegram.messenger.v3.w0(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            bnVar.Eb(view, fjVar, null, null, f10, f11, ch.p0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
