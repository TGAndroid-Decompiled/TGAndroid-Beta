package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ij implements org.telegram.ui.Components.gm0 {
    public final zn f38718a;

    public ij(zn znVar) {
        this.f38718a = znVar;
    }

    @Override
    public final boolean Y0(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        zn znVar = this.f38718a;
        if (!znVar.E9() && ((tL_availableReaction = znVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = znVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (znVar.T5 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (chatFull = znVar.Z7) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z10 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z10) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (!kVar.t() && !znVar.v() && !znVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void c(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        zn znVar = this.f38718a;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (!z10) {
            znVar.D4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.w0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > znVar.getConnectionsManager().getCurrentTime() && !messageObject2.isOut() && messageObject2.getDialogId() == 777000) {
                        Activity parentActivity = znVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        long j3 = tL_messageActionWalletTonConnectRequest.session_id;
                        int id2 = messageObject2.getId();
                        e6Var = ((org.telegram.ui.ActionBar.n2) znVar).resourceProvider;
                        org.telegram.ui.Wallet.e2.o(parentActivity, i11, j3, id2, e6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                if (w0Var.getMessageObject().isDateObject) {
                    if (!znVar.Pa) {
                        Bundle bundle = new Bundle();
                        int i12 = w0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", znVar.T5);
                        bundle.putLong("topic_id", znVar.d());
                        bundle.putInt("type", 0);
                        g8 g8Var = new g8(0, i12, bundle);
                        g8Var.N = znVar;
                        znVar.presentFragment(g8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
                if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(znVar.T5));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, w0Var3.getMessageObject().getReplyMsgId(), 21), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            if (!kVar.t() && !znVar.F9()) {
                if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    u1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        znVar.A0.m(i10);
                        return;
                    }
                    return;
                }
                znVar.L7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (znVar.f44781c9.z(u1Var2.getMessageObject())) {
                    return;
                }
                z12 = !u1Var2.i3(f7);
            }
            zn.c2(znVar, view, z12, f7, f10);
        }
    }

    @Override
    public final void n0(View view, float f7, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        zn znVar = this.f38718a;
        if (znVar.getParentActivity() != null && !znVar.v() && !znVar.c() && !znVar.isInPreviewMode() && !znVar.E9()) {
            if (view instanceof org.telegram.ui.Cells.u1) {
                messageObject = ((org.telegram.ui.Cells.u1) view).getPrimaryMessageObject();
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
                TLRPC.Chat chat = znVar.f44797e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(znVar.f44797e, 26)) {
                    boolean z10 = false;
                    zg.j0.b(false);
                    String doubleTapReaction = znVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (znVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = znVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            znVar.eb(view, messageObject2, null, null, f7, f10, zg.n0.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = znVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (znVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = znVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            znVar.eb(view, messageObject2, null, null, f7, f10, zg.n0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
