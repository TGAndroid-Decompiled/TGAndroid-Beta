package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mj implements org.telegram.ui.Components.bm0 {
    public final fo f38022a;

    public mj(fo foVar) {
        this.f38022a = foVar;
    }

    @Override
    public final boolean c1(View view) {
        String doubleTapReaction;
        TLRPC.TL_availableReaction tL_availableReaction;
        boolean z10;
        MessageObject messageObject;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.ChatFull chatFull;
        fo foVar = this.f38022a;
        if (!foVar.E9() && ((tL_availableReaction = foVar.getMediaDataController().getReactionsMap().get((doubleTapReaction = foVar.getMediaDataController().getDoubleTapReaction()))) != null || (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")))) {
            if (foVar.T5 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (chatFull = foVar.Z7) != null) {
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
                    kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    if (!kVar.t() && !foVar.x() && !foVar.c() && !messageObject.isSponsored()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void d(float f7, float f10, int i10, View view) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        fo foVar = this.f38022a;
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (!z10) {
            foVar.D4 = true;
            boolean z11 = view instanceof org.telegram.ui.Cells.w0;
            if (z11 && (messageObject2 = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
                TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.expires > foVar.getConnectionsManager().getCurrentTime() && !messageObject2.isOut() && messageObject2.getDialogId() == 777000) {
                        Activity parentActivity = foVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        long j10 = tL_messageActionWalletTonConnectRequest.session_id;
                        int id2 = messageObject2.getId();
                        c6Var = ((org.telegram.ui.ActionBar.m2) foVar).resourceProvider;
                        org.telegram.ui.Wallet.e2.o(parentActivity, i11, j10, id2, c6Var, null);
                        return;
                    }
                    return;
                }
            }
            boolean z12 = false;
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                if (w0Var.getMessageObject().isDateObject) {
                    if (!foVar.Pa) {
                        Bundle bundle = new Bundle();
                        int i12 = w0Var.getMessageObject().messageOwner.date;
                        bundle.putLong("dialog_id", foVar.T5);
                        bundle.putLong("topic_id", foVar.d());
                        bundle.putInt("type", 0);
                        l8 l8Var = new l8(0, i12, bundle);
                        l8Var.N = foVar;
                        foVar.presentFragment(l8Var);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var2 = (org.telegram.ui.Cells.w0) view;
                if (w0Var2.getMessageObject() != null && (w0Var2.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionBoostApply)) {
                    foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(foVar.T5));
                    return;
                }
            }
            if (z11) {
                org.telegram.ui.Cells.w0 w0Var3 = (org.telegram.ui.Cells.w0) view;
                if (w0Var3.getMessageObject() != null && (w0Var3.getMessageObject().messageOwner.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper)) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, w0Var3.getMessageObject().getReplyMsgId(), 22), 16L);
                    return;
                }
            }
            kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
            if (!kVar.t() && !foVar.F9()) {
                if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) view).getMessageObject()) != null && messageObject.type == 27) {
                    messageObject.toggleChannelRecommendations();
                    messageObject.forceUpdate = true;
                    u1Var.t2();
                    view.requestLayout();
                    if (i10 >= 0) {
                        foVar.A0.m(i10);
                        return;
                    }
                    return;
                }
                foVar.L7(view, true, false, f7, f10, true, false, false);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                if (foVar.f35608c9.z(u1Var2.getMessageObject())) {
                    return;
                }
                z12 = !u1Var2.i3(f7);
            }
            fo.c2(foVar, view, z12, f7, f10);
        }
    }

    @Override
    public final void p0(View view, float f7, float f10) {
        MessageObject messageObject;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        fo foVar = this.f38022a;
        if (foVar.getParentActivity() != null && !foVar.x() && !foVar.c() && !foVar.isInPreviewMode() && !foVar.E9()) {
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
                TLRPC.Chat chat = foVar.e;
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.canUserDoAction(foVar.e, 26)) {
                    boolean z10 = false;
                    ah.d1.b(false);
                    String doubleTapReaction = foVar.getMediaDataController().getDoubleTapReaction();
                    if (doubleTapReaction.startsWith("animated_")) {
                        if (foVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull2 = foVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull2, doubleTapReaction);
                        }
                        if (z10) {
                            foVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.b(doubleTapReaction), true, false, false, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = foVar.getMediaDataController().getReactionsMap().get(doubleTapReaction);
                    if (tL_availableReaction != null && !messageObject2.isSponsored()) {
                        if (foVar.T5 >= 0) {
                            z10 = true;
                        }
                        if (!z10 && (chatFull = foVar.Z7) != null) {
                            z10 = ChatObject.reactionIsAvailable(chatFull, tL_availableReaction.reaction);
                        }
                        if (z10) {
                            foVar.eb(view, messageObject2, null, null, f7, f10, ah.i1.c(tL_availableReaction), true, false, false, false);
                        }
                    }
                }
            }
        }
    }
}
