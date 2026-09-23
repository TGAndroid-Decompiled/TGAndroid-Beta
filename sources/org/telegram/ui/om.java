package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class om implements org.telegram.ui.Components.ng {
    public int f35907a;
    public boolean f35908b;
    public final xn f35909c;

    public om(xn xnVar) {
        this.f35909c = xnVar;
    }

    @Override
    public final void A2() {
        xn xnVar = this.f35909c;
        ai.g4 g4Var = xnVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        xnVar.X9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        xn xnVar = this.f35909c;
        if (z10) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            xnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean C0() {
        int i10;
        xn xnVar = this.f35909c;
        if ((!xnVar.getMessagesController().isForum(xnVar.a()) || xnVar.f39400h4) && (i10 = xnVar.R3) != 9 && xnVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        this.f35909c.Vb(true, false);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f35909c;
        if (xnVar.f39408i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.my0 my0Var = xnVar.f39349d1;
            if (my0Var != null) {
                my0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = xnVar.f39408i0;
                if (yVar.f19687o == null) {
                    yVar.f19687o = 1;
                    if (xnVar.f39408i0.f19684l != 0) {
                        if ((xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.R3 == 0 && ((xnVar.f39352d4 == 0 || xnVar.f39400h4) && !UserObject.isReplyUser(xnVar.f39372f) && !xnVar.A9()))) {
                            xnVar.f39408i0.f(0);
                            xn.J3(xnVar);
                            org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
                            if (v0Var != null) {
                                v0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = xnVar.f39361e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            cs csVar = xnVar.f39348d0;
                            if (csVar != null) {
                                csVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                            ofFloat.addListener(new nm(this, n10, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                    }
                                }
                            });
                            ofFloat.start();
                        }
                    }
                }
                xnVar.A4 = i10;
                xnVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.f39408i0;
            if (yVar3.f19687o != null) {
                yVar3.f19687o = null;
                if (yVar3.f19684l != 8) {
                    if ((xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.R3 == 0 && ((xnVar.f39352d4 == 0 || xnVar.f39400h4) && !UserObject.isReplyUser(xnVar.f39372f) && !xnVar.A9()))) {
                        xnVar.f39408i0.f(8);
                        if (xnVar.Y.l0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.f39396h0;
                            if (v0Var2 != null) {
                                v0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = xnVar.f39361e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            cs csVar2 = xnVar.f39348d0;
                            if (csVar2 != null) {
                                csVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = xnVar.f39396h0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = xnVar.f39361e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        cs csVar3 = xnVar.f39348d0;
                        if (csVar3 != null) {
                            csVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    ofFloat2.addListener(new nm(this, n10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    n10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                            }
                        }
                    });
                    ofFloat2.start();
                }
            }
        }
    }

    @Override
    public final void E1() {
        int i10;
        int i11;
        xn xnVar = this.f35909c;
        if (!xnVar.z9() && (i10 = xnVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = xnVar.getMessagesController();
            long j3 = xnVar.T5;
            long j10 = xnVar.f39352d4;
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void G0() {
        xn xnVar = this.f35909c;
        xnVar.o9 = true;
        km kmVar = xnVar.A0;
        if (kmVar != null) {
            kmVar.K(true);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.g1 g1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        xn xnVar = this.f35909c;
        ArrayList arrayList = xnVar.f39563u6;
        if (xnVar.f39609y0 != null) {
            xnVar.f39322b0 = xnVar.Y.getBackgroundTop();
        }
        ck ckVar = xnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            xnVar.I1.getAdapter().f9823w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (xnVar.S3 == -1) {
                xnVar.S3 = 0;
            }
            if (charSequence != null) {
                xnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.f39378f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                xnVar.S3 += xnVar.f39378f5.forwardMessages.messages.size();
            }
            xnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = xnVar.f39378f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && xnVar.f39378f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            xnVar.f39378f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = xnVar.getMessagesController().getPeer(xnVar.T5);
            int i13 = 0;
            while (true) {
                if (i13 < arrayList2.size()) {
                    MessageObject messageObject2 = arrayList2.get(i13);
                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                        break;
                    }
                    i13++;
                } else {
                    z12 = z11;
                    break;
                }
            }
            if (z12) {
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(xnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Components.nc) M.e).f26407a;
                bj0Var.setScaleX(1.8f);
                bj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(xnVar.e) && !xnVar.f39400h4 && (messageObject = xnVar.f39475n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, xnVar.f39475n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18135id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                xnVar.getMediaDataController().cleanDraft(xnVar.T5, j10, false);
            }
        }
        xnVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = xnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = xnVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.f9722a).sendTyping(g1Var.f9723b, g1Var.f9724c, 2, 0);
            }
            g1Var.f9725f = -1L;
        }
        if (!xnVar.getMessagesController().premiumFeaturesBlocked() && xnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !xnVar.getMessagesController().didPressTranscribeButtonEnough() && !xnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.d31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f35909c.ha;
    }

    @Override
    public final void J0() {
        this.f35909c.ja(0, false);
    }

    @Override
    public final void K(float f7, int i10) {
        dl dlVar = this.f35909c.f39325b3;
        if (dlVar != null) {
            dlVar.e(f7, i10);
        }
    }

    @Override
    public final void T0() {
        xn xnVar = this.f35909c;
        int sendingMessageId = xnVar.getSendMessagesHelper().getSendingMessageId(xnVar.T5);
        if (sendingMessageId != 0) {
            this.f35909c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        xn xnVar = this.f35909c;
        jk jkVar = xnVar.Y;
        boolean z11 = jkVar.y3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.c cVar = xnVar.wc;
        if (z11 && !z10) {
            z12 = true;
        }
        cVar.a(z12, true);
    }

    @Override
    public final void X(boolean z10) {
        this.f35909c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        xn xnVar = this.f35909c;
        if (xnVar.f39339c3.getVisibility() != i11) {
            xnVar.f39339c3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f35909c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.my0 my0Var = this.f35909c.f39349d1;
        if (my0Var != null) {
            my0Var.e();
        }
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        xn xnVar = this.f35909c;
        if (i10 < currentActionBarHeight) {
            xnVar.Z4 = false;
            if (xnVar.f39349d1.getVisibility() == 0) {
                xnVar.f39349d1.setVisibility(4);
            }
        } else {
            xnVar.Z4 = true;
            if (xnVar.f39349d1.getVisibility() == 4 && !xnVar.isInPreviewMode()) {
                xnVar.f39349d1.setVisibility(0);
            }
        }
        xnVar.f39313a5 = true ^ xnVar.Y.u0();
        if (xnVar.Y.u0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f35907a != i12) {
            xnVar.f39322b0 = 0;
        }
        this.f35907a = i12;
    }

    @Override
    public final void g() {
        this.f35909c.vc();
    }

    @Override
    public final boolean i1() {
        dl dlVar = this.f35909c.f39325b3;
        if (dlVar != null && !dlVar.f29897e0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        qm qmVar;
        int indexOfChild;
        int i10;
        xn xnVar = this.f35909c;
        if (xnVar.getParentActivity() != null) {
            if ((xnVar.e != null || xnVar.f39316a8 != null) && xnVar.fragmentView != null) {
                org.telegram.ui.Components.j40 j40Var = xnVar.f39375f2;
                if ((j40Var == null || j40Var.getVisibility() != 0) && (indexOfChild = (qmVar = xnVar.X0).indexOfChild(xnVar.S)) != -1) {
                    try {
                        xnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (xnVar.f39375f2 == null) {
                        org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(9, xnVar.getParentActivity(), xnVar.f39370ea, false);
                        xnVar.f39375f2 = j40Var2;
                        j40Var2.setVisibility(8);
                        qmVar.addView(xnVar.f39375f2, indexOfChild + 1, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = xnVar.f39316a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.j40 j40Var3 = xnVar.f39375f2;
                        if (xnVar.Y.f21717c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        j40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, xnVar.f39372f.first_name)));
                    } else if (!ChatObject.canSendVoice(xnVar.e) && !ChatObject.canSendRoundVideo(xnVar.e)) {
                        if (!xnVar.K6()) {
                            if (xnVar.Y.f21717c1) {
                                xnVar.f39375f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 21));
                            } else {
                                xnVar.f39375f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 20)) {
                        xnVar.f39375f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 21)) {
                        xnVar.f39375f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 7)) {
                        xnVar.f39375f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = xnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                xnVar.f39375f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                xnVar.f39375f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(xnVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = xnVar.Y.getSendButton();
                    View audioVideoButtonContainer = xnVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    xnVar.f39375f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void j2(boolean z10) {
        xn xnVar = this.f35909c;
        View view = xnVar.f39585w2;
        if (view != null) {
            view.setVisibility(8);
        }
        xnVar.f39327b5 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        xn xnVar = this.f35909c;
        boolean z11 = true;
        if (xnVar.f39325b3 == null && CameraView.isCameraAllowed() && xnVar.getParentActivity() != null) {
            dl dlVar = new dl(xnVar, xnVar.getParentActivity(), xnVar, xnVar.f39370ea);
            xnVar.f39325b3 = dlVar;
            dlVar.setClipToPadding(false);
            dl dlVar2 = xnVar.f39325b3;
            ah.c cVar = xnVar.J;
            gj gjVar = xnVar.f39582w;
            View view = dlVar2.R0;
            ch.d c10 = cVar.c(view, gjVar, false);
            c10.p(AndroidUtilities.dp(6.0f));
            c10.q(AndroidUtilities.dp(21.0f));
            view.setBackground(c10);
            int indexOfChild = xnVar.X0.indexOfChild(xnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = xnVar.X0.getChildCount();
            }
            xnVar.X0.addView(xnVar.f39325b3, Math.min(indexOfChild + 1, xnVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        dl dlVar3 = xnVar.f39325b3;
        if (dlVar3 != null) {
            if (i10 == 0) {
                dlVar3.l(false);
                xnVar.f39596x0.B0();
                xnVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z11 = false;
                    }
                    dlVar3.d(z11);
                }
            } else {
                dlVar3.k(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.my0 my0Var = this.f35909c.f39349d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.j40 j40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        xn xnVar = this.f35909c;
        if (isEmpty && !xnVar.Y.s0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        ck ckVar = xnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            charSequence2 = charSequence;
            xnVar.I1.getAdapter().U(charSequence2, xnVar.Y.getCursorPosition(), xnVar.f39563u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = xnVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            xnVar.J5 = null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = xnVar.Y;
            if (jkVar.X2 && (!jkVar.s0() || !xnVar.Y.Z1)) {
                if (z10) {
                    xnVar.Ya(charSequence2, true);
                } else {
                    xnVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    xnVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        uk ukVar = xnVar.f39606xa;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((cz) arrayList.get(i10)).f32450n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49019l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.f49019l = true;
        }
        if (!z11) {
            fj fjVar = xnVar.f39387g2;
            if ((fjVar != null && fjVar.getVisibility() == 0) || ((j40Var = xnVar.f39410i2) != null && j40Var.getVisibility() == 0)) {
                fj fjVar2 = xnVar.f39387g2;
                if (fjVar2 != null) {
                    fjVar2.b(true);
                }
                org.telegram.ui.Components.j40 j40Var2 = xnVar.f39410i2;
                if (j40Var2 != null) {
                    j40Var2.b(true);
                    return;
                }
                return;
            }
            pf pfVar = xnVar.Na;
            if (UserObject.isUserSelf(xnVar.f39372f) || ((chatFull = xnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && xnVar.R3 == 0)) {
                z13 = true;
            }
            if (!xnVar.f39423j2 && !xnVar.f39398h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !xnVar.Y.s0()) {
                AndroidUtilities.cancelRunOnUIThread(pfVar);
                AndroidUtilities.runOnUIThread(pfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f35909c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.my0 my0Var = this.f35909c.f39349d1;
        if (my0Var != null) {
            my0Var.f();
        }
    }

    @Override
    public final void n1() {
        dl dlVar = this.f35909c.f39325b3;
        if (dlVar != null) {
            dlVar.q();
        }
    }

    @Override
    public final boolean o1() {
        xn xnVar = this.f35909c;
        TLRPC.User user = xnVar.f39372f;
        if (user != null && !UserObject.isUserSelf(user) && !xnVar.f39372f.bot && xnVar.h == null && xnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        xn xnVar = this.f35909c;
        fj fjVar = xnVar.f39387g2;
        if (fjVar != null) {
            fjVar.b(true);
        }
        org.telegram.ui.Components.j40 j40Var = xnVar.f39410i2;
        if (j40Var != null) {
            j40Var.b(true);
        }
    }

    @Override
    public final nn p0() {
        return this.f35909c.f39449l5;
    }

    @Override
    public final int q() {
        return this.f35909c.X0.R();
    }

    @Override
    public final void q1() {
        int i10;
        xn xnVar = this.f35909c;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        long j3 = xnVar.T5;
        MessageSuggestionParams messageSuggestionParams = xnVar.f39390g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new af(xnVar, 3)).show();
    }

    @Override
    public final void r1() {
        this.f35909c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f35909c;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (!kVar.f19296n0) {
            org.telegram.ui.ActionBar.y yVar = xnVar.f39408i0;
            if (yVar != null && !this.f35908b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = xnVar.f39361e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                cs csVar = xnVar.f39348d0;
                if (csVar != null) {
                    csVar.b(true);
                }
            }
        }
    }

    @Override
    public final void s1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        xn xnVar = this.f35909c;
        xnVar.W6();
        jk jkVar = xnVar.Y;
        boolean z12 = jkVar.y3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.c cVar = xnVar.wc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.a(z11, true);
        if (z12) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
            if (qcVar != null && qcVar.f27308l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = xnVar.I1;
        float f10 = 0.0f;
        if (ckVar != null) {
            ViewPropertyAnimator animate = ckVar.animate();
            if (!z12 && !xnVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f27701f).start();
        }
        org.telegram.ui.Components.my0 my0Var = xnVar.f39349d1;
        if (my0Var != null) {
            my0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = xnVar.f39349d1.animate();
            if (!z12 && !xnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.rr.f27701f).withEndAction(new bi.f(19, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        xn xnVar = this.f35909c;
        xnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
        if (v0Var != null && v0Var.getVisibility() != 0) {
            xnVar.f39396h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = xnVar.f39361e0;
            if (yVar != null) {
                yVar.f(8);
            }
            cs csVar = xnVar.f39348d0;
            if (csVar != null) {
                csVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f35909c.Ya(charSequence, true);
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f35909c.f39378f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f35909c;
        kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
        if (!kVar.f19296n0) {
            org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
            if (v0Var != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = xnVar.f39408i0;
            if (yVar != null && !this.f35908b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.f39361e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            cs csVar = xnVar.f39348d0;
            if (csVar != null) {
                csVar.b(false);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        xn xnVar = this.f35909c;
        if (xnVar.f39609y0 != null) {
            xnVar.f39322b0 = xnVar.Y.getBackgroundTop();
        }
        ck ckVar = xnVar.I1;
        if (ckVar != null) {
            ckVar.getAdapter().f9804f0 = true;
        }
        if (xnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new aj(this, 6), 30L);
        }
        if (xnVar.Y.u0()) {
            xnVar.Y.f1();
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.Y.W0(true, true, z10);
        if (xnVar.f39486o5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.f39486o5, true);
            xnVar.f39486o5 = 0;
        }
        xnVar.yc(0, true);
        xnVar.hc(false);
        xnVar.Wc(false);
    }

    @Override
    public final void y(float f7) {
        xn xnVar = this.f35909c;
        if (f7 != 0.0f) {
            xnVar.D4 = true;
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        xnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27299w;
        if (qcVar != null && xnVar.Yb != null) {
            qcVar.l();
        }
    }

    @Override
    public final void z1() {
        int i10;
        xn xnVar = this.f35909c;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(xnVar.T5, (int) xnVar.d());
        xnVar.c7(true);
    }
}
