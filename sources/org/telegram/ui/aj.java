package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class aj implements org.telegram.ui.Components.am0 {
    public final un f37813a;

    public aj(un unVar) {
        this.f37813a = unVar;
    }

    @Override
    public final boolean c1(View view) {
        boolean z10;
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z11;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        un unVar = this.f37813a;
        if (!unVar.I9() && ((!((z10 = view instanceof org.telegram.ui.Cells.s1)) || !((org.telegram.ui.Cells.s1) view).u3()) && ((tL_availableReaction = unVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = unVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_"))))) {
            if (unVar.f44249f6 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && (chatFull = unVar.f44322l8) != null) {
                if (tL_availableReaction != null) {
                    doubleTapReaction = tL_availableReaction.reaction;
                }
                z11 = ChatObject.reactionIsAvailable(chatFull, doubleTapReaction);
            }
            if (z11) {
                if (z10) {
                    messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
                } else if (view instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                }
                if (messageObject != null && !messageObject.isDateObject && !messageObject.isSending() && messageObject.canSetReaction() && !messageObject.isEditing()) {
                    kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    if (!kVar.q() && !unVar.w() && !unVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        un unVar = this.f37813a;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
        if (!z10) {
            unVar.P4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.v0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > unVar.getConnectionsManager().getCurrentTime() && !messageObject2.isOut() && messageObject2.getDialogId() == 777000) {
                        Activity parentActivity = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                        long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                        int id2 = messageObject2.getId();
                        u6Var = ((org.telegram.ui.ActionBar.r2) unVar).resourceProvider;
                        org.telegram.ui.Wallet.e2.o(parentActivity, i11, j10, id2, u6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                if (v0Var.getMessageObject().isDateObject) {
                    if (!unVar.f44201bb) {
                        Bundle bundle = new Bundle();
                        int i12 = v0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", unVar.f44249f6);
                        bundle.putLong("topic_id", unVar.b());
                        bundle.putInt("type", 0);
                        n8 n8Var = new n8(0, i12, bundle);
                        n8Var.N = unVar;
                        unVar.presentFragment(n8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
                if (v0Var2.getMessageObject() != null && (v0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(unVar.f44249f6));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
                if (v0Var3.getMessageObject() != null && (v0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, v0Var3.getMessageObject().getReplyMsgId(), 24), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar.q() && !unVar.J9()) {
                if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    s1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        unVar.A0.m(i10);
                        return;
                    }
                    return;
                }
                unVar.P7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                if (unVar.f44362o9.z(s1Var2.getMessageObject())) {
                    return;
                }
                z12 = !s1Var2.i3(f7);
            }
            un.e2(unVar, view, z12, f7, f10);
        }
    }

    @Override
    public final void l0(View view, float f7, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        un unVar = this.f37813a;
        if (unVar.getParentActivity() != null && !unVar.w() && !unVar.c() && !unVar.isInPreviewMode() && !unVar.I9()) {
            if (view instanceof org.telegram.ui.Cells.s1) {
                messageObject = ((org.telegram.ui.Cells.s1) view).getPrimaryMessageObject();
            } else if (view instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
                if (messageObject.isDateObject) {
                    return;
                }
            } else {
                return;
            }
            MessageObject messageObject2 = messageObject;
            if (!messageObject2.isSecret() && messageObject2.canSetReaction() && !messageObject2.isExpiredStory() && messageObject2.type != 27) {
                TLRPC.Chat chat = unVar.e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(unVar.e, 26)) {
                    boolean z10 = false;
                    bh.s0.b(false);
                    String doubleTapReaction = unVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (unVar.f44249f6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = unVar.f44322l8) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            unVar.jb(view, messageObject2, null, null, f7, f10, bh.x0.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = unVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (unVar.f44249f6 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = unVar.f44322l8) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            unVar.jb(view, messageObject2, null, null, f7, f10, bh.x0.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
