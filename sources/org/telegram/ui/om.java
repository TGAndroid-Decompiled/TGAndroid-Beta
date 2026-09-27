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
public final class om implements org.telegram.ui.Components.og {
    public int f36224a;
    public boolean f36225b;
    public final xn f36226c;

    public om(xn xnVar) {
        this.f36226c = xnVar;
    }

    @Override
    public final void A2() {
        xn xnVar = this.f36226c;
        ai.g4 g4Var = xnVar.J1;
        if (g4Var != null) {
            g4Var.F1(null, 0);
        }
        xnVar.X9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        xn xnVar = this.f36226c;
        if (z10) {
            Activity parentActivity = xnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            xnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean C0() {
        int i10;
        xn xnVar = this.f36226c;
        if ((!xnVar.getMessagesController().isForum(xnVar.a()) || xnVar.f39781h4) && (i10 = xnVar.R3) != 9 && xnVar.S3 > 0) {
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
        this.f36226c.Vb(true, false);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        xn xnVar = this.f36226c;
        if (xnVar.f39789i0 != null) {
            lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
            final org.telegram.ui.ActionBar.a0 o9 = lVar.o();
            org.telegram.ui.Components.zy0 zy0Var = xnVar.f39729d1;
            if (zy0Var != null) {
                zy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.z zVar = xnVar.f39789i0;
                if (zVar.f19964o == null) {
                    zVar.f19964o = 1;
                    if (xnVar.f39789i0.f19961l != 0) {
                        if ((xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.R3 == 0 && ((xnVar.f39732d4 == 0 || xnVar.f39781h4) && !UserObject.isReplyUser(xnVar.f39752f) && !xnVar.A9()))) {
                            xnVar.f39789i0.f(0);
                            xn.J3(xnVar);
                            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39777h0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar2 = xnVar.f39741e0;
                            if (zVar2 != null) {
                                zVar2.f(8);
                            }
                            es esVar = xnVar.f39728d0;
                            if (esVar != null) {
                                esVar.b(false, true);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                            ofFloat.addListener(new nm(this, o9, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
            org.telegram.ui.ActionBar.z zVar3 = xnVar.f39789i0;
            if (zVar3.f19964o != null) {
                zVar3.f19964o = null;
                if (zVar3.f19961l != 8) {
                    if ((xnVar.R3 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId()) || (xnVar.R3 == 0 && ((xnVar.f39732d4 == 0 || xnVar.f39781h4) && !UserObject.isReplyUser(xnVar.f39752f) && !xnVar.A9()))) {
                        xnVar.f39789i0.f(8);
                        if (xnVar.Y.k0() && TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39777h0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar4 = xnVar.f39741e0;
                            if (zVar4 != null) {
                                zVar4.f(0);
                            }
                            es esVar2 = xnVar.f39728d0;
                            if (esVar2 != null) {
                                esVar2.b(true, true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = xnVar.f39777h0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.z zVar5 = xnVar.f39741e0;
                        if (zVar5 != null) {
                            zVar5.f(8);
                        }
                        es esVar3 = xnVar.f39728d0;
                        if (esVar3 != null) {
                            esVar3.b(false, true);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                    ofFloat2.addListener(new nm(this, o9, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    o9.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
        xn xnVar = this.f36226c;
        if (!xnVar.z9() && (i10 = xnVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = xnVar.getMessagesController();
            long j3 = xnVar.T5;
            long j10 = xnVar.f39732d4;
            i11 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void G0() {
        xn xnVar = this.f36226c;
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
        xn xnVar = this.f36226c;
        ArrayList arrayList = xnVar.f39944u6;
        if (xnVar.f39990y0 != null) {
            xnVar.f39702b0 = xnVar.Y.getBackgroundTop();
        }
        ek ekVar = xnVar.I1;
        if (ekVar != null && ekVar.getAdapter() != null) {
            xnVar.I1.getAdapter().f9828w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (xnVar.S3 == -1) {
                xnVar.S3 = 0;
            }
            if (charSequence != null) {
                xnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.f39758f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                xnVar.S3 += xnVar.f39758f5.forwardMessages.messages.size();
            }
            xnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = xnVar.f39758f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && xnVar.f39758f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            xnVar.f39758f5.forwardMessages.getSelectedMessages(arrayList2);
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
                org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Components.nc) M.e).f26777a;
                nj0Var.setScaleX(1.8f);
                nj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(xnVar.e) && !xnVar.f39781h4 && (messageObject = xnVar.f39856n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, xnVar.f39856n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18381id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                xnVar.getMediaDataController().cleanDraft(xnVar.T5, j10, false);
            }
        }
        xnVar.yb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        lk lkVar = xnVar.Y;
        if (lkVar != null && lkVar.getEmojiView() != null && (g1Var = xnVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.f9727a).sendTyping(g1Var.f9728b, g1Var.f9729c, 2, 0);
            }
            g1Var.f9730f = -1L;
        }
        if (!xnVar.getMessagesController().premiumFeaturesBlocked() && xnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !xnVar.getMessagesController().didPressTranscribeButtonEnough() && !xnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.t31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f36226c.ha;
    }

    @Override
    public final void J0() {
        this.f36226c.ja(0, false);
    }

    @Override
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.j60 j60Var = this.f36226c.f39705b3;
        if (j60Var != null) {
            j60Var.b(f7, i10);
        }
    }

    @Override
    public final void T0() {
        xn xnVar = this.f36226c;
        int sendingMessageId = xnVar.getSendMessagesHelper().getSendingMessageId(xnVar.T5);
        if (sendingMessageId != 0) {
            this.f36226c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        xn xnVar = this.f36226c;
        lk lkVar = xnVar.Y;
        boolean z11 = lkVar.f22101z3;
        org.telegram.ui.Components.eg egVar = lkVar.U0;
        boolean z12 = false;
        if (egVar != null && egVar.getCurrentPage() == 0) {
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
        this.f36226c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        xn xnVar = this.f36226c;
        if (xnVar.f39719c3.getVisibility() != i11) {
            xnVar.f39719c3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f36226c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36226c.f39729d1;
        if (zy0Var != null) {
            zy0Var.e();
        }
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        xn xnVar = this.f36226c;
        if (i10 < currentActionBarHeight) {
            xnVar.Z4 = false;
            if (xnVar.f39729d1.getVisibility() == 0) {
                xnVar.f39729d1.setVisibility(4);
            }
        } else {
            xnVar.Z4 = true;
            if (xnVar.f39729d1.getVisibility() == 4 && !xnVar.isInPreviewMode()) {
                xnVar.f39729d1.setVisibility(0);
            }
        }
        xnVar.f39693a5 = true ^ xnVar.Y.t0();
        if (xnVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f36224a != i12) {
            xnVar.f39702b0 = 0;
        }
        this.f36224a = i12;
    }

    @Override
    public final void g() {
        this.f36226c.vc();
    }

    @Override
    public final boolean i1() {
        org.telegram.ui.Components.j60 j60Var = this.f36226c.f39705b3;
        if (j60Var != null && j60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        qm qmVar;
        int indexOfChild;
        int i10;
        xn xnVar = this.f36226c;
        if (xnVar.getParentActivity() != null) {
            if ((xnVar.e != null || xnVar.f39696a8 != null) && xnVar.fragmentView != null) {
                org.telegram.ui.Components.l40 l40Var = xnVar.f39755f2;
                if ((l40Var == null || l40Var.getVisibility() != 0) && (indexOfChild = (qmVar = xnVar.X0).indexOfChild(xnVar.S)) != -1) {
                    try {
                        xnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (xnVar.f39755f2 == null) {
                        org.telegram.ui.Components.l40 l40Var2 = new org.telegram.ui.Components.l40(9, xnVar.getParentActivity(), xnVar.f39750ea, false);
                        xnVar.f39755f2 = l40Var2;
                        l40Var2.setVisibility(8);
                        qmVar.addView(xnVar.f39755f2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = xnVar.f39696a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.l40 l40Var3 = xnVar.f39755f2;
                        if (xnVar.Y.f21971c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        l40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, xnVar.f39752f.first_name)));
                    } else if (!ChatObject.canSendVoice(xnVar.e) && !ChatObject.canSendRoundVideo(xnVar.e)) {
                        if (!xnVar.K6()) {
                            if (xnVar.Y.f21971c1) {
                                xnVar.f39755f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 21));
                            } else {
                                xnVar.f39755f2.setText(ChatObject.getRestrictedErrorText(xnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 20)) {
                        xnVar.f39755f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 21)) {
                        xnVar.f39755f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(xnVar.e, 7)) {
                        xnVar.f39755f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = xnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                xnVar.f39755f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                xnVar.f39755f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(xnVar.e.banned_rights.until_date)));
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
                    xnVar.f39755f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void j2(boolean z10) {
        xn xnVar = this.f36226c;
        View view = xnVar.f39966w2;
        if (view != null) {
            view.setVisibility(8);
        }
        xnVar.f39707b5 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.j60 e60Var;
        xn xnVar = this.f36226c;
        boolean z11 = false;
        if (xnVar.f39705b3 == null && CameraView.isCameraAllowed() && xnVar.getParentActivity() != null) {
            Activity parentActivity = xnVar.getParentActivity();
            vn vnVar = xnVar.f39750ea;
            int i13 = org.telegram.ui.Components.j60.e;
            if (qi.e.f42134b.a()) {
                e60Var = new org.telegram.ui.Components.d60(parentActivity, xnVar, vnVar);
            } else {
                e60Var = new org.telegram.ui.Components.e60(parentActivity, xnVar, vnVar, true);
            }
            xnVar.f39705b3 = e60Var;
            e60Var.setAnimationCallback(new se(xnVar, 0));
            xnVar.f39705b3.setTrimCallback(new se(xnVar, 1));
            xnVar.f39705b3.setRecordingUiFrameCallback(new pj(xnVar));
            xnVar.f39705b3.setClipToPadding(false);
            xnVar.f39705b3.g(xnVar.J, xnVar.f39963w);
            int indexOfChild = xnVar.X0.indexOfChild(xnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = xnVar.X0.getChildCount();
            }
            xnVar.X0.addView(xnVar.f39705b3, Math.min(indexOfChild + 1, xnVar.X0.getChildCount()), w7.y5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.j60 j60Var = xnVar.f39705b3;
        if (j60Var != null) {
            if (i10 == 0) {
                j60Var.h(false);
                xnVar.f39977x0.C0();
                xnVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    j60Var.a(z11);
                }
            } else {
                j60Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36226c.f39729d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.l40 l40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        xn xnVar = this.f36226c;
        if (isEmpty && !xnVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        ek ekVar = xnVar.I1;
        if (ekVar != null && ekVar.getAdapter() != null) {
            charSequence2 = charSequence;
            xnVar.I1.getAdapter().U(charSequence2, xnVar.Y.getCursorPosition(), xnVar.f39944u6, false, false);
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
            lk lkVar = xnVar.Y;
            if (lkVar.Y2 && (!lkVar.r0() || !xnVar.Y.a2)) {
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
        wk wkVar = xnVar.f39987xa;
        if (wkVar != null) {
            ArrayList arrayList = wkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ez) arrayList.get(i10)).f33362n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49392l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.f49392l = true;
        }
        if (!z11) {
            hj hjVar = xnVar.f39767g2;
            if ((hjVar != null && hjVar.getVisibility() == 0) || ((l40Var = xnVar.f39791i2) != null && l40Var.getVisibility() == 0)) {
                hj hjVar2 = xnVar.f39767g2;
                if (hjVar2 != null) {
                    hjVar2.b(true);
                }
                org.telegram.ui.Components.l40 l40Var2 = xnVar.f39791i2;
                if (l40Var2 != null) {
                    l40Var2.b(true);
                    return;
                }
                return;
            }
            ug ugVar = xnVar.Na;
            if (UserObject.isUserSelf(xnVar.f39752f) || ((chatFull = xnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && xnVar.R3 == 0)) {
                z13 = true;
            }
            if (!xnVar.f39804j2 && !xnVar.f39779h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !xnVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(ugVar);
                AndroidUtilities.runOnUIThread(ugVar, 4000L);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f36226c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.zy0 zy0Var = this.f36226c.f39729d1;
        if (zy0Var != null) {
            zy0Var.f();
        }
    }

    @Override
    public final void n1() {
        org.telegram.ui.Components.j60 j60Var = this.f36226c.f39705b3;
        if (j60Var != null) {
            j60Var.i();
        }
    }

    @Override
    public final boolean o1() {
        xn xnVar = this.f36226c;
        TLRPC.User user = xnVar.f39752f;
        if (user != null && !UserObject.isUserSelf(user) && !xnVar.f39752f.bot && xnVar.h == null && xnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        xn xnVar = this.f36226c;
        hj hjVar = xnVar.f39767g2;
        if (hjVar != null) {
            hjVar.b(true);
        }
        org.telegram.ui.Components.l40 l40Var = xnVar.f39791i2;
        if (l40Var != null) {
            l40Var.b(true);
        }
    }

    @Override
    public final nn p0() {
        return this.f36226c.f39830l5;
    }

    @Override
    public final int q() {
        return this.f36226c.X0.R();
    }

    @Override
    public final void q1() {
        int i10;
        xn xnVar = this.f36226c;
        Activity parentActivity = xnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
        long j3 = xnVar.T5;
        MessageSuggestionParams messageSuggestionParams = xnVar.f39770g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new df(xnVar, 4)).show();
    }

    @Override
    public final void r1() {
        this.f36226c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.l lVar;
        xn xnVar = this.f36226c;
        lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
        if (!lVar.f19570n0) {
            org.telegram.ui.ActionBar.z zVar = xnVar.f39789i0;
            if (zVar != null && !this.f36225b) {
                zVar.f(8);
            }
            if (TextUtils.isEmpty(xnVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39777h0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.z zVar2 = xnVar.f39741e0;
                if (zVar2 != null) {
                    zVar2.f(0);
                }
                es esVar = xnVar.f39728d0;
                if (esVar != null) {
                    esVar.b(true, true);
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
        xn xnVar = this.f36226c;
        xnVar.W6();
        lk lkVar = xnVar.Y;
        boolean z12 = lkVar.f22101z3;
        org.telegram.ui.Components.eg egVar = lkVar.U0;
        if (egVar != null && egVar.getCurrentPage() == 0) {
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
            i11 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
            if (qcVar != null && qcVar.f27693l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = xnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ek ekVar = xnVar.I1;
        float f10 = 0.0f;
        if (ekVar != null) {
            ViewPropertyAnimator animate = ekVar.animate();
            if (!z12 && !xnVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.sr.f28359f).start();
        }
        org.telegram.ui.Components.zy0 zy0Var = xnVar.f39729d1;
        if (zy0Var != null) {
            zy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = xnVar.f39729d1.animate();
            if (!z12 && !xnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.sr.f28359f).withEndAction(new bi.f(20, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        xn xnVar = this.f36226c;
        xnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39777h0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            xnVar.f39777h0.setVisibility(0);
            org.telegram.ui.ActionBar.z zVar = xnVar.f39741e0;
            if (zVar != null) {
                zVar.f(8);
            }
            es esVar = xnVar.f39728d0;
            if (esVar != null) {
                esVar.b(false, true);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f36226c.Ya(charSequence, true);
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f36226c.f39758f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.l lVar;
        xn xnVar = this.f36226c;
        lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
        if (!lVar.f19570n0) {
            org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39777h0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar = xnVar.f39789i0;
            if (zVar != null && !this.f36225b) {
                zVar.f(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = xnVar.f39741e0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            es esVar = xnVar.f39728d0;
            if (esVar != null) {
                esVar.b(false, true);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        xn xnVar = this.f36226c;
        if (xnVar.f39990y0 != null) {
            xnVar.f39702b0 = xnVar.Y.getBackgroundTop();
        }
        ek ekVar = xnVar.I1;
        if (ekVar != null) {
            ekVar.getAdapter().f9809f0 = true;
        }
        if (xnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new cj(this, 6), 30L);
        }
        if (xnVar.Y.t0()) {
            xnVar.Y.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        xnVar.Y.U0(true, true, z10);
        if (xnVar.f39867o5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.f39867o5, true);
            xnVar.f39867o5 = 0;
        }
        xnVar.yc(0, true);
        xnVar.hc(false);
        xnVar.Wc(false);
    }

    @Override
    public final void y(float f7) {
        xn xnVar = this.f36226c;
        if (f7 != 0.0f) {
            xnVar.D4 = true;
        }
        xnVar.o9();
        xnVar.r9();
        xnVar.Mc(false, false);
        xnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
        if (qcVar != null && xnVar.Yb != null) {
            qcVar.l();
        }
    }

    @Override
    public final void z1() {
        int i10;
        xn xnVar = this.f36226c;
        i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(xnVar.T5, (int) xnVar.d());
        xnVar.c7(true);
    }
}
