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
public final class pm implements org.telegram.ui.Components.eg {
    public int f37184a;
    public boolean f37185b;
    public final zn f37186c;

    public pm(zn znVar) {
        this.f37186c = znVar;
    }

    @Override
    public final void A1(CharSequence charSequence) {
        this.f37186c.Ya(charSequence, true);
    }

    @Override
    public final void A2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f37186c;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (!kVar.f20305k0) {
            org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = znVar.f40576f0;
            if (yVar != null && !this.f37185b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f40524b0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            es esVar = znVar.f40511a0;
            if (esVar != null) {
                esVar.b(false);
            }
        }
    }

    @Override
    public final void B(boolean z4) {
        int i10;
        int i11;
        zn znVar = this.f37186c;
        if (z4) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            znVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean B1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f37186c.f40542c5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        this.f37186c.Vb(true, false);
    }

    @Override
    public final void E1() {
        int i10;
        zn znVar = this.f37186c;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.Q5, (int) znVar.d());
        znVar.c7(true);
    }

    @Override
    public final void E2() {
        zn znVar = this.f37186c;
        nh.t2 t2Var = znVar.G1;
        if (t2Var != null) {
            t2Var.I1(null, 0);
        }
        znVar.X9();
    }

    @Override
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        org.telegram.ui.Components.zw zwVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z10;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        zn znVar = this.f37186c;
        ArrayList arrayList = znVar.f40730r6;
        if (znVar.f40772v0 != null) {
            znVar.Y = znVar.V.getBackgroundTop();
        }
        dk dkVar = znVar.F1;
        if (dkVar != null && dkVar.getAdapter() != null) {
            znVar.F1.getAdapter().f44925w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (znVar.P3 == -1) {
                znVar.P3 = 0;
            }
            if (charSequence != null) {
                znVar.P3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f40542c5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.P3 += znVar.f40542c5.forwardMessages.messages.size();
            }
            znVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.f40542c5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.f40542c5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.f40542c5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            TLRPC.Peer peer = znVar.getMessagesController().getPeer(znVar.Q5);
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
                org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Components.fc) M.e).f24858a;
                jj0Var.setScaleX(1.8f);
                jj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.e) && !znVar.f40567e4 && (messageObject = znVar.f40642k5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.f40642k5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f19211id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.Q5, j11, false);
            }
        }
        znVar.zb(false, null, null, null, null, z4, i10, null, false, j10, null, true);
        lk lkVar = znVar.V;
        if (lkVar != null && lkVar.getEmojiView() != null && (zwVar = znVar.V.getEmojiView().Q0) != null) {
            if (zwVar.e) {
                MessagesController.getInstance(zwVar.f31477a).sendTyping(zwVar.f31478b, zwVar.f31479c, 2, 0);
            }
            zwVar.f31480f = -1L;
        }
        if (!znVar.getMessagesController().premiumFeaturesBlocked() && znVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !znVar.getMessagesController().didPressTranscribeButtonEnough() && !znVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.d31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers H() {
        return this.f37186c.f40572ea;
    }

    @Override
    public final boolean H0() {
        int i10;
        zn znVar = this.f37186c;
        if ((!znVar.getMessagesController().isForum(znVar.a()) || znVar.f40567e4) && (i10 = znVar.O3) != 9 && znVar.P3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void J0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f37186c;
        if (znVar.f40576f0 != null) {
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.qy0 qy0Var = znVar.f40512a1;
            if (qy0Var != null) {
                qy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = znVar.f40576f0;
                if (yVar.f20719o == null) {
                    yVar.f20719o = 1;
                    if (znVar.f40576f0.f20716l != 0) {
                        if ((znVar.O3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) || (znVar.O3 == 0 && ((znVar.f40514a4 == 0 || znVar.f40567e4) && !UserObject.isReplyUser(znVar.f40575f) && !znVar.A9()))) {
                            znVar.f40576f0.f(0);
                            zn.J3(znVar);
                            org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = znVar.f40524b0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            es esVar = znVar.f40511a0;
                            if (esVar != null) {
                                esVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                            ofFloat.addListener(new om(this, n10, 0));
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
                znVar.f40804x4 = i10;
                znVar.f40818y4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.f40576f0;
            if (yVar3.f20719o != null) {
                yVar3.f20719o = null;
                if (yVar3.f20716l != 8) {
                    if ((znVar.O3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) || (znVar.O3 == 0 && ((znVar.f40514a4 == 0 || znVar.f40567e4) && !UserObject.isReplyUser(znVar.f40575f) && !znVar.A9()))) {
                        znVar.f40576f0.f(8);
                        if (znVar.V.k0() && TextUtils.isEmpty(znVar.V.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = znVar.f40563e0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = znVar.f40524b0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            es esVar2 = znVar.f40511a0;
                            if (esVar2 != null) {
                                esVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = znVar.f40563e0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = znVar.f40524b0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        es esVar3 = znVar.f40511a0;
                        if (esVar3 != null) {
                            esVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    ofFloat2.addListener(new om(this, n10, 1));
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
    public final void J1() {
        int i10;
        int i11;
        zn znVar = this.f37186c;
        if (!znVar.z9() && (i10 = znVar.O3) != 6 && i10 != 8) {
            MessagesController messagesController = znVar.getMessagesController();
            long j10 = znVar.Q5;
            long j11 = znVar.f40514a4;
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final void K(float f10, int i10) {
        fl flVar = this.f37186c.Y2;
        if (flVar != null) {
            flVar.e(f10, i10);
        }
    }

    @Override
    public final void L0() {
        zn znVar = this.f37186c;
        znVar.f40658l9 = true;
        lm lmVar = znVar.f40800x0;
        if (lmVar != null) {
            lmVar.K(true);
        }
    }

    @Override
    public final void O0() {
        this.f37186c.ja(0, false);
    }

    @Override
    public final void X() {
        boolean z4;
        zn znVar = this.f37186c;
        lk lkVar = znVar.V;
        boolean z10 = lkVar.f22823v3;
        org.telegram.ui.Components.uf ufVar = lkVar.R0;
        boolean z11 = false;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xd.a aVar = znVar.f40771uc;
        if (z10 && !z4) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final void Y(boolean z4) {
        this.f37186c.Vb(false, z4);
    }

    @Override
    public final void Y0() {
        zn znVar = this.f37186c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.Q5);
        if (sendingMessageId != 0) {
            this.f37186c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void c() {
        this.f37186c.vc();
    }

    @Override
    public final void f1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        zn znVar = this.f37186c;
        if (znVar.Z2.getVisibility() != i11) {
            znVar.Z2.setVisibility(i11);
        }
    }

    @Override
    public final int g1() {
        return this.f37186c.U0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem i1() {
        return null;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.qy0 qy0Var = this.f37186c.f40512a1;
        if (qy0Var != null) {
            qy0Var.e();
        }
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.qy0 qy0Var = this.f37186c.f40512a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override
    public final boolean k1(long j10) {
        return false;
    }

    @Override
    public final void k2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.f37186c;
        if (i10 < currentActionBarHeight) {
            znVar.W4 = false;
            if (znVar.f40512a1.getVisibility() == 0) {
                znVar.f40512a1.setVisibility(4);
            }
        } else {
            znVar.W4 = true;
            if (znVar.f40512a1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.f40512a1.setVisibility(0);
            }
        }
        znVar.X4 = true ^ znVar.V.t0();
        if (znVar.V.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f37184a != i12) {
            znVar.Y = 0;
        }
        this.f37184a = i12;
    }

    @Override
    public final boolean l() {
        return this.f37186c.K6();
    }

    @Override
    public final boolean n1() {
        fl flVar = this.f37186c.Y2;
        if (flVar != null && !flVar.f30874b0) {
            return true;
        }
        return false;
    }

    @Override
    public final void n2() {
        rm rmVar;
        int indexOfChild;
        int i10;
        zn znVar = this.f37186c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.e != null || znVar.X7 != null) && znVar.fragmentView != null) {
                org.telegram.ui.Components.l40 l40Var = znVar.f40540c2;
                if ((l40Var == null || l40Var.getVisibility() != 0) && (indexOfChild = (rmVar = znVar.U0).indexOfChild(znVar.P)) != -1) {
                    try {
                        znVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (znVar.f40540c2 == null) {
                        org.telegram.ui.Components.l40 l40Var2 = new org.telegram.ui.Components.l40(9, znVar.getParentActivity(), znVar.f40534ba, false);
                        znVar.f40540c2 = l40Var2;
                        l40Var2.setVisibility(8);
                        rmVar.addView(znVar.f40540c2, indexOfChild + 1, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = znVar.X7;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.l40 l40Var3 = znVar.f40540c2;
                        if (znVar.V.Z0) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        l40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, znVar.f40575f.first_name)));
                    } else if (!ChatObject.canSendVoice(znVar.e) && !ChatObject.canSendRoundVideo(znVar.e)) {
                        if (!znVar.K6()) {
                            if (znVar.V.Z0) {
                                znVar.f40540c2.setText(ChatObject.getRestrictedErrorText(znVar.e, 21));
                            } else {
                                znVar.f40540c2.setText(ChatObject.getRestrictedErrorText(znVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 20)) {
                        znVar.f40540c2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 21)) {
                        znVar.f40540c2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 7)) {
                        znVar.f40540c2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                znVar.f40540c2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                znVar.f40540c2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = znVar.V.getSendButton();
                    View audioVideoButtonContainer = znVar.V.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    znVar.f40540c2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void o2(boolean z4) {
        zn znVar = this.f37186c;
        View view = znVar.f40750t2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.Y4 = !z4;
    }

    @Override
    public final int p() {
        return this.f37186c.U0.R();
    }

    @Override
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        zn znVar = this.f37186c;
        boolean z10 = true;
        if (znVar.Y2 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            fl flVar = new fl(znVar, znVar.getParentActivity(), znVar, znVar.f40534ba);
            znVar.Y2 = flVar;
            flVar.setClipToPadding(false);
            fl flVar2 = znVar.Y2;
            ng.a aVar = znVar.G;
            hj hjVar = znVar.f40785w;
            View view = flVar2.O0;
            pg.b c3 = aVar.c(view, hjVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c3);
            int indexOfChild = znVar.U0.indexOfChild(znVar.P);
            if (indexOfChild < 0) {
                indexOfChild = znVar.U0.getChildCount();
            }
            znVar.U0.addView(znVar.Y2, Math.min(indexOfChild + 1, znVar.U0.getChildCount()), k7.b6.e(-1, -1, 51));
        }
        fl flVar3 = znVar.Y2;
        if (flVar3 != null) {
            if (i10 == 0) {
                flVar3.l(false);
                znVar.f40759u0.B0();
                znVar.f40800x0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z10 = false;
                    }
                    flVar3.d(z10);
                }
            } else {
                flVar3.k(i10, i11, i12, j10, j11, z4);
            }
        }
    }

    @Override
    public final void q0() {
        org.telegram.ui.Components.qy0 qy0Var = this.f37186c.f40512a1;
        if (qy0Var != null) {
            qy0Var.f();
        }
    }

    @Override
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.l40 l40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        zn znVar = this.f37186c;
        if (isEmpty && !znVar.V.r0()) {
            z11 = false;
        } else {
            z11 = true;
        }
        mediaController.setInputFieldHasText(z11);
        dk dkVar = znVar.F1;
        if (dkVar != null && dkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            znVar.F1.getAdapter().U(charSequence2, znVar.V.getCursorPosition(), znVar.f40730r6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        androidx.biometric.j jVar = znVar.G5;
        if (jVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jVar);
            znVar.G5 = null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            lk lkVar = znVar.V;
            if (lkVar.U2 && (!lkVar.r0() || !znVar.V.W1)) {
                if (z4) {
                    znVar.Ya(charSequence2, true);
                } else {
                    znVar.M6(charSequence2);
                    androidx.biometric.j jVar2 = new androidx.biometric.j(28, this, charSequence2);
                    znVar.G5 = jVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(jVar2, j10);
                }
            }
        }
        wk wkVar = znVar.f40769ua;
        if (wkVar != null) {
            ArrayList arrayList = wkVar.C;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((cz) arrayList.get(i10)).f33269n = true;
            }
        }
        mg.m0 m0Var = mg.m0.B;
        if (m0Var != null) {
            m0Var.f14044l = true;
        }
        mg.m0 m0Var2 = mg.m0.C;
        if (m0Var2 != null) {
            m0Var2.f14044l = true;
        }
        if (!z10) {
            gj gjVar = znVar.f40552d2;
            if ((gjVar != null && gjVar.getVisibility() == 0) || ((l40Var = znVar.f40578f2) != null && l40Var.getVisibility() == 0)) {
                gj gjVar2 = znVar.f40552d2;
                if (gjVar2 != null) {
                    gjVar2.b(true);
                }
                org.telegram.ui.Components.l40 l40Var2 = znVar.f40578f2;
                if (l40Var2 != null) {
                    l40Var2.b(true);
                    return;
                }
                return;
            }
            nf nfVar = znVar.Ka;
            if (UserObject.isUserSelf(znVar.f40575f) || ((chatFull = znVar.W7) != null && chatFull.slowmode_next_send_date > 0 && znVar.O3 == 0)) {
                z12 = true;
            }
            if (!znVar.f40590g2 && !znVar.f40565e2 && !z12 && SharedConfig.scheduledHintShows < 3 && !znVar.V.r0()) {
                AndroidUtilities.cancelRunOnUIThread(nfVar);
                AndroidUtilities.runOnUIThread(nfVar, 4000L);
            }
        }
    }

    @Override
    public final TLRPC.Peer r() {
        return null;
    }

    @Override
    public final void s1() {
        fl flVar = this.f37186c.Y2;
        if (flVar != null) {
            flVar.q();
        }
    }

    @Override
    public final boolean t1() {
        zn znVar = this.f37186c;
        TLRPC.User user = znVar.f40575f;
        if (user != null && !UserObject.isUserSelf(user) && !znVar.f40575f.bot && znVar.h == null && znVar.O3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void t2() {
        zn znVar = this.f37186c;
        gj gjVar = znVar.f40552d2;
        if (gjVar != null) {
            gjVar.b(true);
        }
        org.telegram.ui.Components.l40 l40Var = znVar.f40578f2;
        if (l40Var != null) {
            l40Var.b(true);
        }
    }

    @Override
    public final pn u0() {
        return this.f37186c.f40618i5;
    }

    @Override
    public final void v() {
        boolean z4;
        zn znVar = this.f37186c;
        if (znVar.f40772v0 != null) {
            znVar.Y = znVar.V.getBackgroundTop();
        }
        dk dkVar = znVar.F1;
        if (dkVar != null) {
            dkVar.getAdapter().f44902c0 = true;
        }
        if (znVar.f40666m5 != null) {
            AndroidUtilities.runOnUIThread(new bj(this, 6), 30L);
        }
        if (znVar.V.t0()) {
            znVar.V.e1();
            z4 = true;
        } else {
            z4 = false;
        }
        znVar.V.V0(true, true, z4);
        if (znVar.f40654l5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.f40654l5, true);
            znVar.f40654l5 = 0;
        }
        znVar.yc(0, true);
        znVar.hc(false);
        znVar.Wc(false);
    }

    @Override
    public final void v1() {
        int i10;
        zn znVar = this.f37186c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        long j10 = znVar.Q5;
        MessageSuggestionParams messageSuggestionParams = znVar.f40555d5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new lh.s0(parentActivity, i10, j10, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new ze(znVar, 3)).show();
    }

    @Override
    public final void w1() {
        this.f37186c.H6();
    }

    @Override
    public final void x(float f10) {
        zn znVar = this.f37186c;
        if (f10 != 0.0f) {
            znVar.A4 = true;
        }
        znVar.o9();
        znVar.r9();
        znVar.Mc(false, false);
        znVar.U0.invalidate();
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
        if (icVar != null && znVar.Wb != null) {
            icVar.l();
        }
    }

    @Override
    public final void x0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f37186c;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (!kVar.f20305k0) {
            org.telegram.ui.ActionBar.y yVar = znVar.f40576f0;
            if (yVar != null && !this.f37185b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(znVar.V.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = znVar.f40524b0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                es esVar = znVar.f40511a0;
                if (esVar != null) {
                    esVar.b(true);
                }
            }
        }
    }

    @Override
    public final void x1() {
        boolean z4;
        boolean z10;
        int i10;
        float f10;
        int i11;
        zn znVar = this.f37186c;
        znVar.W6();
        lk lkVar = znVar.V;
        boolean z11 = lkVar.f22823v3;
        org.telegram.ui.Components.uf ufVar = lkVar.R0;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        xd.a aVar = znVar.f40771uc;
        if (z11 && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        if (z11) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f25664w;
            if (icVar != null && icVar.f25673l) {
                icVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        dk dkVar = znVar.F1;
        float f11 = 0.0f;
        if (dkVar != null) {
            ViewPropertyAnimator animate = dkVar.animate();
            if (!z11 && !znVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
        }
        org.telegram.ui.Components.qy0 qy0Var = znVar.f40512a1;
        if (qy0Var != null) {
            qy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = znVar.f40512a1.animate();
            if (!z11 && !znVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.mr.f27122f).withEndAction(new jh.f(18, this, z11)).start();
        }
    }

    @Override
    public final void y1(View view, CharSequence charSequence, boolean z4) {
        zn znVar = this.f37186c;
        znVar.Sb(view, charSequence, z4);
        org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            znVar.f40563e0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = znVar.f40524b0;
            if (yVar != null) {
                yVar.f(8);
            }
            es esVar = znVar.f40511a0;
            if (esVar != null) {
                esVar.b(false);
            }
        }
    }
}
