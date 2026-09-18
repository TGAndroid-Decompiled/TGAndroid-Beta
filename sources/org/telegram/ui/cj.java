package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cj implements org.telegram.ui.Components.bl0 {
    public final bo f32823a;

    public cj(bo boVar) {
        this.f32823a = boVar;
    }

    @Override
    public final void c(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        bo boVar = this.f32823a;
        z10 = ((org.telegram.ui.ActionBar.o2) boVar).inPreviewMode;
        if (!z10) {
            boVar.D4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.w0;
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                if (w0Var.getMessageObject().isDateObject) {
                    if (!boVar.Oa) {
                        Bundle bundle = new Bundle();
                        int i11 = w0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", boVar.T5);
                        bundle.putLong("topic_id", boVar.d());
                        bundle.putInt("type", 0);
                        j8 j8Var = new j8(0, i11, bundle);
                        j8Var.N = boVar;
                        boVar.presentFragment(j8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
                if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(boVar.T5));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, w0Var3.getMessageObject().getReplyMsgId(), 19), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
            if (!kVar.s() && !boVar.A9()) {
                if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    t1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        boVar.A0.m(i10);
                        return;
                    }
                    return;
                }
                boVar.I7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                if (boVar.f32254c9.A(t1Var2.getMessageObject())) {
                    return;
                }
                z12 = !t1Var2.i3(f7);
            }
            bo.b2(boVar, view, z12, f7, f10);
        }
    }

    @Override
    public final boolean d1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        bo boVar = this.f32823a;
        if (!boVar.z9() && ((tL_availableReaction = boVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = boVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (boVar.T5 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (chatFull = boVar.Z7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                    if (!kVar.s() && !boVar.v() && !boVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void r0(View view, float f7, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        bo boVar = this.f32823a;
        if (boVar.getParentActivity() != null && !boVar.v() && !boVar.c() && !boVar.isInPreviewMode() && !boVar.z9()) {
            if (view instanceof org.telegram.ui.Cells.t1) {
                messageObject = ((org.telegram.ui.Cells.t1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
                if (messageObject.isDateObject) {
                    return;
                }
            } else {
                return;
            }
            MessageObject messageObject2 = messageObject;
            if (!messageObject2.isSecret() && messageObject2.canSetReaction() && !messageObject2.isExpiredStory() && messageObject2.type != 27) {
                TLRPC.Chat chat = boVar.e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(boVar.e, 26)) {
                    boolean z10 = false;
                    zg.l0.b(false);
                    String doubleTapReaction = boVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (boVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = boVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            boVar.ab(view, messageObject2, null, null, f7, f10, zg.p0.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = boVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (boVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = boVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            boVar.ab(view, messageObject2, null, null, f7, f10, zg.p0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
