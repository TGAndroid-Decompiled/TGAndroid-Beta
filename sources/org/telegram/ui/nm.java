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
public final class nm implements org.telegram.ui.Components.eg {
    public int f36686a;
    public boolean f36687b;
    public final xn f36688c;

    public nm(xn xnVar) {
        this.f36688c = xnVar;
    }

    @Override
    public final void C() {
        this.f36688c.Vb(true, false);
    }

    @Override
    public final void C1() {
        int i10;
        xn xnVar = this.f36688c;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(xnVar.Q5, (int) xnVar.b());
        xnVar.c7(true);
    }

    @Override
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        org.telegram.ui.Components.zw zwVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z10;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        xn xnVar = this.f36688c;
        ArrayList arrayList = xnVar.f40164r6;
        if (xnVar.f40206v0 != null) {
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
        bk bkVar = xnVar.F1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            xnVar.F1.getAdapter().f44863w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (xnVar.P3 == -1) {
                xnVar.P3 = 0;
            }
            if (charSequence != null) {
                xnVar.P3++;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.f39976c5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                xnVar.P3 += xnVar.f39976c5.forwardMessages.messages.size();
            }
            xnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = xnVar.f39976c5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && xnVar.f39976c5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            xnVar.f39976c5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.Peer peer = xnVar.getMessagesController().getPeer(xnVar.Q5);
            int i13 = 0;
            while (true) {
                if (i13 < arrayList2.size()) {
                    MessageObject messageObject2 = arrayList2.get(i13);
                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                        break;
                    }
                    i13++;
                } else {
                    z11 = z10;
                    break;
                }
            }
            if (z11) {
                org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(xnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Components.fc) M.e).f24845a;
                jj0Var.setScaleX(1.8f);
                jj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(xnVar.e) && !xnVar.f40001e4 && (messageObject = xnVar.f40076k5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, xnVar.f40076k5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f19236id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                xnVar.getMediaDataController().cleanDraft(xnVar.Q5, j11, false);
            }
        }
        xnVar.zb(false, null, null, null, null, z4, i10, null, false, j10, null, true);
        jk jkVar = xnVar.V;
        if (jkVar != null && jkVar.getEmojiView() != null && (zwVar = xnVar.V.getEmojiView().Q0) != null) {
            if (zwVar.e) {
                MessagesController.getInstance(zwVar.f31449a).sendTyping(zwVar.f31450b, zwVar.f31451c, 2, 0);
            }
            zwVar.f31452f = -1L;
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
    public final void E2() {
        xn xnVar = this.f36688c;
        nh.t2 t2Var = xnVar.G1;
        if (t2Var != null) {
            t2Var.I1(null, 0);
        }
        xnVar.X9();
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers G() {
        return this.f36688c.f40006ea;
    }

    @Override
    public final boolean G0() {
        int i10;
        xn xnVar = this.f36688c;
        if ((!xnVar.getMessagesController().isForum(xnVar.a()) || xnVar.f40001e4) && (i10 = xnVar.O3) != 9 && xnVar.P3 > 0) {
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
    public final void H(float f10, int i10) {
        dl dlVar = this.f36688c.Y2;
        if (dlVar != null) {
            dlVar.e(f10, i10);
        }
    }

    @Override
    public final void H1() {
        int i10;
        int i11;
        xn xnVar = this.f36688c;
        if (!xnVar.z9() && (i10 = xnVar.O3) != 6 && i10 != 8) {
            MessagesController messagesController = xnVar.getMessagesController();
            long j10 = xnVar.Q5;
            long j11 = xnVar.f39948a4;
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final void I0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f36688c;
        if (xnVar.f40010f0 != null) {
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.qy0 qy0Var = xnVar.f39946a1;
            if (qy0Var != null) {
                qy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = xnVar.f40010f0;
                if (yVar.f20744o == null) {
                    yVar.f20744o = 1;
                    if (xnVar.f40010f0.f20741l != 0) {
                        if ((xnVar.O3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.O3 == 0 && ((xnVar.f39948a4 == 0 || xnVar.f40001e4) && !UserObject.isReplyUser(xnVar.f40009f) && !xnVar.A9()))) {
                            xnVar.f40010f0.f(0);
                            xn.J3(xnVar);
                            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39997e0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = xnVar.f39958b0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            cs csVar = xnVar.f39945a0;
                            if (csVar != null) {
                                csVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                            ofFloat.addListener(new mm(this, n10, 0));
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
                xnVar.f40238x4 = i10;
                xnVar.f40252y4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = xnVar.f40010f0;
            if (yVar3.f20744o != null) {
                yVar3.f20744o = null;
                if (yVar3.f20741l != 8) {
                    if ((xnVar.O3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.O3 == 0 && ((xnVar.f39948a4 == 0 || xnVar.f40001e4) && !UserObject.isReplyUser(xnVar.f40009f) && !xnVar.A9()))) {
                        xnVar.f40010f0.f(8);
                        if (xnVar.V.k0() && TextUtils.isEmpty(xnVar.V.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39997e0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = xnVar.f39958b0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            cs csVar2 = xnVar.f39945a0;
                            if (csVar2 != null) {
                                csVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.f39997e0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = xnVar.f39958b0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        cs csVar3 = xnVar.f39945a0;
                        if (csVar3 != null) {
                            csVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.nr.f27346f);
                    ofFloat2.addListener(new mm(this, n10, 1));
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
    public final void K0() {
        xn xnVar = this.f36688c;
        xnVar.f40092l9 = true;
        jm jmVar = xnVar.f40234x0;
        if (jmVar != null) {
            jmVar.K(true);
        }
    }

    @Override
    public final void N0() {
        this.f36688c.ja(0, false);
    }

    @Override
    public final void V0() {
        xn xnVar = this.f36688c;
        int sendingMessageId = xnVar.getSendMessagesHelper().getSendingMessageId(xnVar.Q5);
        if (sendingMessageId != 0) {
            this.f36688c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void Y() {
        boolean z4;
        xn xnVar = this.f36688c;
        jk jkVar = xnVar.V;
        boolean z10 = jkVar.f22850v3;
        org.telegram.ui.Components.uf ufVar = jkVar.R0;
        boolean z11 = false;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xd.a aVar = xnVar.f40205uc;
        if (z10 && !z4) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final void b0(boolean z4) {
        this.f36688c.Vb(false, z4);
    }

    @Override
    public final void b1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        xn xnVar = this.f36688c;
        if (xnVar.Z2.getVisibility() != i11) {
            xnVar.Z2.setVisibility(i11);
        }
    }

    @Override
    public final int c1() {
        return this.f36688c.U0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final void f() {
        this.f36688c.vc();
    }

    @Override
    public final boolean g1(long j10) {
        return false;
    }

    @Override
    public final void h() {
        org.telegram.ui.Components.qy0 qy0Var = this.f36688c.f39946a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override
    public final void h2() {
        org.telegram.ui.Components.qy0 qy0Var = this.f36688c.f39946a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
    }

    @Override
    public final void j2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        xn xnVar = this.f36688c;
        if (i10 < currentActionBarHeight) {
            xnVar.W4 = false;
            if (xnVar.f39946a1.getVisibility() == 0) {
                xnVar.f39946a1.setVisibility(4);
            }
        } else {
            xnVar.W4 = true;
            if (xnVar.f39946a1.getVisibility() == 4 && !xnVar.isInPreviewMode()) {
                xnVar.f39946a1.setVisibility(0);
            }
        }
        xnVar.X4 = true ^ xnVar.V.t0();
        if (xnVar.V.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f36686a != i12) {
            xnVar.Y = 0;
        }
        this.f36686a = i12;
    }

    @Override
    public final boolean k() {
        return this.f36688c.K6();
    }

    @Override
    public final boolean k1() {
        dl dlVar = this.f36688c.Y2;
        if (dlVar != null && !dlVar.f30549b0) {
            return true;
        }
        return false;
    }

    @Override
    public final int l() {
        return this.f36688c.U0.R();
    }

    @Override
    public final void m2() {
        pm pmVar;
        int indexOfChild;
        int i10;
        xn xnVar = this.f36688c;
        if (xnVar.getParentActivity() != null) {
            if ((xnVar.e != null || xnVar.X7 != null) && xnVar.fragmentView != null) {
                org.telegram.ui.Components.k40 k40Var = xnVar.f39974c2;
                if ((k40Var == null || k40Var.getVisibility() != 0) && (indexOfChild = (pmVar = xnVar.U0).indexOfChild(xnVar.P)) != -1) {
                    try {
                        xnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (xnVar.f39974c2 == null) {
                        org.telegram.ui.Components.k40 k40Var2 = new org.telegram.ui.Components.k40(9, xnVar.getParentActivity(), xnVar.f39968ba, false);
                        xnVar.f39974c2 = k40Var2;
                        k40Var2.setVisibility(8);
                        pmVar.addView(xnVar.f39974c2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = xnVar.X7;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.k40 k40Var3 = xnVar.f39974c2;
                        if (xnVar.V.Z0) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        k40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, xnVar.f40009f.first_name)));
                    } else if (!ChatObject.canSendVoice(xnVar.e) && !ChatObject.canSendRoundVideo(xnVar.e)) {
                        if (!xnVar.K6()) {
                            if (xnVar.V.Z0) {
                                xnVar.f39974c2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 21));
                            } else {
                                xnVar.f39974c2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 20)) {
                        xnVar.f39974c2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 21)) {
                        xnVar.f39974c2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 7)) {
                        xnVar.f39974c2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = xnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                xnVar.f39974c2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                xnVar.f39974c2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(xnVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = xnVar.V.getSendButton();
                    View audioVideoButtonContainer = xnVar.V.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    xnVar.f39974c2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.k40 k40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        xn xnVar = this.f36688c;
        if (isEmpty && !xnVar.V.r0()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaController.setInputFieldHasText(z11);
        bk bkVar = xnVar.F1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            xnVar.F1.getAdapter().U(charSequence2, xnVar.V.getCursorPosition(), xnVar.f40164r6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        androidx.biometric.k kVar = xnVar.G5;
        if (kVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kVar);
            xnVar.G5 = null;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = xnVar.V;
            if (jkVar.U2 && (!jkVar.r0() || !xnVar.V.W1)) {
                if (z4) {
                    xnVar.Ya(charSequence2, true);
                } else {
                    xnVar.M6(charSequence2);
                    androidx.biometric.k kVar2 = new androidx.biometric.k(28, this, charSequence2);
                    xnVar.G5 = kVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(kVar2, j10);
                }
            }
        }
        uk ukVar = xnVar.f40203ua;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.C;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((az) arrayList.get(i10)).f32737n = true;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.f14056l = true;
        }
        mg.m0 m0Var2 = mg.m0.C;
        if (m0Var2 != null) {
            m0Var2.f14056l = true;
        }
        if (!z10) {
            ej ejVar = xnVar.f39986d2;
            if ((ejVar != null && ejVar.getVisibility() == 0) || ((k40Var = xnVar.f40012f2) != null && k40Var.getVisibility() == 0)) {
                ej ejVar2 = xnVar.f39986d2;
                if (ejVar2 != null) {
                    ejVar2.b(true);
                }
                org.telegram.ui.Components.k40 k40Var2 = xnVar.f40012f2;
                if (k40Var2 != null) {
                    k40Var2.b(true);
                    return;
                }
                return;
            }
            lf lfVar = xnVar.Ka;
            if (UserObject.isUserSelf(xnVar.f40009f) || ((chatFull = xnVar.W7) != null && chatFull.slowmode_next_send_date > 0 && xnVar.O3 == 0)) {
                z12 = true;
            }
            if (!xnVar.f40024g2 && !xnVar.f39999e2 && !z12 && SharedConfig.scheduledHintShows < 3 && !xnVar.V.r0()) {
                AndroidUtilities.cancelRunOnUIThread(lfVar);
                AndroidUtilities.runOnUIThread(lfVar, 4000L);
            }
        }
    }

    @Override
    public final void n2(boolean z4) {
        xn xnVar = this.f36688c;
        View view = xnVar.f40184t2;
        if (view != null) {
            view.setVisibility(8);
        }
        xnVar.Y4 = !z4;
    }

    @Override
    public final void o0() {
        org.telegram.ui.Components.qy0 qy0Var = this.f36688c.f39946a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        xn xnVar = this.f36688c;
        boolean z10 = true;
        if (xnVar.Y2 == null && CameraView.isCameraAllowed() && xnVar.getParentActivity() != null) {
            dl dlVar = new dl(xnVar, xnVar.getParentActivity(), xnVar, xnVar.f39968ba);
            xnVar.Y2 = dlVar;
            dlVar.setClipToPadding(false);
            dl dlVar2 = xnVar.Y2;
            ng.a aVar = xnVar.G;
            fj fjVar = xnVar.f40219w;
            View view = dlVar2.O0;
            pg.b c3 = aVar.c(view, fjVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c3);
            int indexOfChild = xnVar.U0.indexOfChild(xnVar.P);
            if (indexOfChild < 0) {
                indexOfChild = xnVar.U0.getChildCount();
            }
            xnVar.U0.addView(xnVar.Y2, Math.min(indexOfChild + 1, xnVar.U0.getChildCount()), k7.b6.e(-1, -1, 51));
        }
        dl dlVar3 = xnVar.Y2;
        if (dlVar3 != null) {
            if (i10 == 0) {
                dlVar3.l(false);
                xnVar.f40193u0.B0();
                xnVar.f40234x0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z10 = false;
                    }
                    dlVar3.d(z10);
                }
            } else {
                dlVar3.k(i10, i11, i12, j10, j11, z4);
            }
        }
    }

    @Override
    public final TLRPC.Peer p() {
        return null;
    }

    @Override
    public final void p1() {
        dl dlVar = this.f36688c.Y2;
        if (dlVar != null) {
            dlVar.q();
        }
    }

    @Override
    public final boolean q1() {
        xn xnVar = this.f36688c;
        TLRPC.User user = xnVar.f40009f;
        if (user != null && !UserObject.isUserSelf(user) && !xnVar.f40009f.bot && xnVar.h == null && xnVar.O3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        boolean z4;
        xn xnVar = this.f36688c;
        if (xnVar.f40206v0 != null) {
            xnVar.Y = xnVar.V.getBackgroundTop();
        }
        bk bkVar = xnVar.F1;
        if (bkVar != null) {
            bkVar.getAdapter().f44840c0 = true;
        }
        if (xnVar.f40100m5 != null) {
            AndroidUtilities.runOnUIThread(new zi(this, 6), 30L);
        }
        if (xnVar.V.t0()) {
            xnVar.V.e1();
            z4 = true;
        } else {
            z4 = false;
        }
        xnVar.V.V0(true, true, z4);
        if (xnVar.f40088l5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.f40088l5, true);
            xnVar.f40088l5 = 0;
        }
        xnVar.yc(0, true);
        xnVar.hc(false);
        xnVar.Wc(false);
    }

    @Override
    public final nn r0() {
        return this.f36688c.f40052i5;
    }

    @Override
    public final void r2() {
        xn xnVar = this.f36688c;
        ej ejVar = xnVar.f39986d2;
        if (ejVar != null) {
            ejVar.b(true);
        }
        org.telegram.ui.Components.k40 k40Var = xnVar.f40012f2;
        if (k40Var != null) {
            k40Var.b(true);
        }
    }

    @Override
    public final void s1() {
        int i10;
        xn xnVar = this.f36688c;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        long j10 = xnVar.Q5;
        MessageSuggestionParams messageSuggestionParams = xnVar.f39989d5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new lh.s0(parentActivity, i10, j10, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new xe(xnVar, 3)).show();
    }

    @Override
    public final void t1() {
        this.f36688c.H6();
    }

    @Override
    public final void u1() {
        boolean z4;
        boolean z10;
        int i10;
        float f10;
        int i11;
        xn xnVar = this.f36688c;
        xnVar.W6();
        jk jkVar = xnVar.V;
        boolean z11 = jkVar.f22850v3;
        org.telegram.ui.Components.uf ufVar = jkVar.R0;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xd.a aVar = xnVar.f40205uc;
        if (z11 && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        if (z11) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
            if (icVar != null && icVar.f25674l) {
                icVar.b();
            }
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        bk bkVar = xnVar.F1;
        float f11 = 0.0f;
        if (bkVar != null) {
            ViewPropertyAnimator animate = bkVar.animate();
            if (!z11 && !xnVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f27346f).start();
        }
        org.telegram.ui.Components.qy0 qy0Var = xnVar.f39946a1;
        if (qy0Var != null) {
            qy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = xnVar.f39946a1.animate();
            if (!z11 && !xnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.nr.f27346f).withEndAction(new jh.f(18, this, z11)).start();
        }
    }

    @Override
    public final void v1(View view, CharSequence charSequence, boolean z4) {
        xn xnVar = this.f36688c;
        xnVar.Sb(view, charSequence, z4);
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39997e0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            xnVar.f39997e0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = xnVar.f39958b0;
            if (yVar != null) {
                yVar.f(8);
            }
            cs csVar = xnVar.f39945a0;
            if (csVar != null) {
                csVar.b(false);
            }
        }
    }

    @Override
    public final void w0() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f36688c;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar.f20330k0) {
            org.telegram.ui.ActionBar.y yVar = xnVar.f40010f0;
            if (yVar != null && !this.f36687b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(xnVar.V.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39997e0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = xnVar.f39958b0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                cs csVar = xnVar.f39945a0;
                if (csVar != null) {
                    csVar.b(true);
                }
            }
        }
    }

    @Override
    public final void x(float f10) {
        xn xnVar = this.f36688c;
        if (f10 != 0.0f) {
            xnVar.A4 = true;
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        xnVar.U0.invalidate();
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25665w;
        if (icVar != null && xnVar.Wb != null) {
            icVar.l();
        }
    }

    @Override
    public final void y1(CharSequence charSequence) {
        this.f36688c.Ya(charSequence, true);
    }

    @Override
    public final void z(boolean z4) {
        int i10;
        int i11;
        xn xnVar = this.f36688c;
        if (z4) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            xnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean z1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f36688c.f39976c5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void z2() {
        org.telegram.ui.ActionBar.k kVar;
        xn xnVar = this.f36688c;
        kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
        if (!kVar.f20330k0) {
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39997e0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = xnVar.f40010f0;
            if (yVar != null && !this.f36687b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = xnVar.f39958b0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            cs csVar = xnVar.f39945a0;
            if (csVar != null) {
                csVar.b(false);
            }
        }
    }
}
