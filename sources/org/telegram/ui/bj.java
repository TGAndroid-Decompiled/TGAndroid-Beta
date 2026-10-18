package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bj implements org.telegram.ui.Components.xl0 {
    public final sn f35677a;

    public bj(sn snVar) {
        this.f35677a = snVar;
    }

    @Override
    public final boolean P0(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        sn snVar = this.f35677a;
        if (!snVar.E9() && ((tL_availableReaction = snVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = snVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (snVar.T5 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (chatFull = snVar.Z7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    if (!kVar.s() && !snVar.x() && !snVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void a0(View view, float f7, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        sn snVar = this.f35677a;
        if (snVar.getParentActivity() != null && !snVar.x() && !snVar.c() && !snVar.isInPreviewMode() && !snVar.E9()) {
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
                TLRPC.Chat chat = snVar.e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(snVar.e, 26)) {
                    boolean z10 = false;
                    ah.d1.b(false);
                    String doubleTapReaction = snVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (snVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = snVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            snVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = snVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (snVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = snVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            snVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void d(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        sn snVar = this.f35677a;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
        if (!z10) {
            snVar.D4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.w0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > snVar.getConnectionsManager().getCurrentTime() && !messageObject2.isOut() && messageObject2.getDialogId() == 777000) {
                        Activity parentActivity = snVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                        int id2 = messageObject2.getId();
                        d6Var = ((org.telegram.ui.ActionBar.n2) snVar).resourceProvider;
                        org.telegram.ui.Wallet.f2.o(parentActivity, i11, j10, id2, d6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                if (w0Var.getMessageObject().isDateObject) {
                    if (!snVar.Pa) {
                        Bundle bundle = new Bundle();
                        int i12 = w0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", snVar.T5);
                        bundle.putLong("topic_id", snVar.d());
                        bundle.putInt("type", 0);
                        k8 k8Var = new k8(0, i12, bundle);
                        k8Var.N = snVar;
                        snVar.presentFragment(k8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
                if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(snVar.T5));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, w0Var3.getMessageObject().getReplyMsgId(), 24), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
                if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    u1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        snVar.A0.m(i10);
                        return;
                    }
                    return;
                }
                snVar.L7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (snVar.f41166c9.z(u1Var2.getMessageObject())) {
                    return;
                }
                z12 = !u1Var2.i3(f7);
            }
            sn.c2(snVar, view, z12, f7, f10);
        }
    }
}
