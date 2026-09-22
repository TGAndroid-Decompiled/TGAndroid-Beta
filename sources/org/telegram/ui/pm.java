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
import org.telegram.messenger.SharedSettings;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pm implements org.telegram.ui.Components.ng {
    public int f36609a;
    public boolean f36610b;
    public final zn f36611c;

    public pm(zn znVar) {
        this.f36611c = znVar;
    }

    @Override
    public final void A1() {
        int i10;
        zn znVar = this.f36611c;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.T5, (int) znVar.d());
        znVar.c7(true);
    }

    @Override
    public final void A2() {
        zn znVar = this.f36611c;
        ai.g4 g4Var = znVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        znVar.X9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        zn znVar = this.f36611c;
        if (z10) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            znVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void D() {
        this.f36611c.Vb(true, false);
    }

    @Override
    public final boolean D0() {
        int i10;
        zn znVar = this.f36611c;
        if ((!znVar.getMessagesController().isForum(znVar.a()) || znVar.f40355h4) && (i10 = znVar.R3) != 9 && znVar.S3 > 0) {
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
    public final void F0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f36611c;
        if (znVar.f40363i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.az0 az0Var = znVar.f40303d1;
            if (az0Var != null) {
                az0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = znVar.f40363i0;
                if (yVar.f19960o == null) {
                    yVar.f19960o = 1;
                    if (znVar.f40363i0.f19957l != 0) {
                        if ((znVar.R3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) || (znVar.R3 == 0 && ((znVar.f40306d4 == 0 || znVar.f40355h4) && !UserObject.isReplyUser(znVar.f40326f) && !znVar.A9()))) {
                            znVar.f40363i0.f(0);
                            zn.J3(znVar);
                            org.telegram.ui.ActionBar.v0 v0Var = znVar.f40351h0;
                            if (v0Var != null) {
                                v0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = znVar.f40315e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            hs hsVar = znVar.f40302d0;
                            if (hsVar != null) {
                                hsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f27653f);
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
                znVar.A4 = i10;
                znVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.f40363i0;
            if (yVar3.f19960o != null) {
                yVar3.f19960o = null;
                if (yVar3.f19957l != 8) {
                    if ((znVar.R3 == 3 && znVar.I8() == znVar.getUserConfig().getClientUserId()) || (znVar.R3 == 0 && ((znVar.f40306d4 == 0 || znVar.f40355h4) && !UserObject.isReplyUser(znVar.f40326f) && !znVar.A9()))) {
                        znVar.f40363i0.f(8);
                        if (znVar.Y.k0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.v0 v0Var2 = znVar.f40351h0;
                            if (v0Var2 != null) {
                                v0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = znVar.f40315e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            hs hsVar2 = znVar.f40302d0;
                            if (hsVar2 != null) {
                                hsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = znVar.f40351h0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = znVar.f40315e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        hs hsVar3 = znVar.f40302d0;
                        if (hsVar3 != null) {
                            hsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.qr.f27653f);
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
    public final void F1() {
        int i10;
        int i11;
        zn znVar = this.f36611c;
        if (!znVar.z9() && (i10 = znVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = znVar.getMessagesController();
            long j3 = znVar.T5;
            long j10 = znVar.f40306d4;
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
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
        zn znVar = this.f36611c;
        ArrayList arrayList = znVar.f40518u6;
        if (znVar.f40564y0 != null) {
            znVar.f40276b0 = znVar.Y.getBackgroundTop();
        }
        fk fkVar = znVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            znVar.I1.getAdapter().f9841w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (znVar.S3 == -1) {
                znVar.S3 = 0;
            }
            if (charSequence != null) {
                znVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f40332f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.S3 += znVar.f40332f5.forwardMessages.messages.size();
            }
            znVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.f40332f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.f40332f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.f40332f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = znVar.getMessagesController().getPeer(znVar.T5);
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
                org.telegram.ui.Components.pc M = org.telegram.ui.Components.xc.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Components.mc) M.e).f26421a;
                nj0Var.setScaleX(1.8f);
                nj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.e) && !znVar.f40355h4 && (messageObject = znVar.f40430n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.f40430n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18395id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.T5, j10, false);
            }
        }
        znVar.yb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        mk mkVar = znVar.Y;
        if (mkVar != null && mkVar.getEmojiView() != null && (g1Var = znVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.f9740a).sendTyping(g1Var.f9741b, g1Var.f9742c, 2, 0);
            }
            g1Var.f9743f = -1L;
        }
        if (!znVar.getMessagesController().premiumFeaturesBlocked() && znVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !znVar.getMessagesController().didPressTranscribeButtonEnough() && !znVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.u31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final void H0() {
        zn znVar = this.f36611c;
        znVar.o9 = true;
        lm lmVar = znVar.A0;
        if (lmVar != null) {
            lmVar.K(true);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f36611c.ha;
    }

    @Override
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.h60 h60Var = this.f36611c.f40279b3;
        if (h60Var != null) {
            h60Var.b(f7, i10);
        }
    }

    @Override
    public final void K0() {
        this.f36611c.ja(0, false);
    }

    @Override
    public final void U0() {
        zn znVar = this.f36611c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.T5);
        if (sendingMessageId != 0) {
            this.f36611c.E(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        zn znVar = this.f36611c;
        mk mkVar = znVar.Y;
        boolean z11 = mkVar.f22113z3;
        org.telegram.ui.Components.dg dgVar = mkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = znVar.wc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void X(boolean z10) {
        this.f36611c.Vb(false, z10);
    }

    @Override
    public final void b1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        zn znVar = this.f36611c;
        if (znVar.f40293c3.getVisibility() != i11) {
            znVar.f40293c3.setVisibility(i11);
        }
    }

    @Override
    public final int c1() {
        return this.f36611c.X0.getHeight();
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.az0 az0Var = this.f36611c.f40303d1;
        if (az0Var != null) {
            az0Var.e();
        }
    }

    @Override
    public final TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.f36611c;
        if (i10 < currentActionBarHeight) {
            znVar.Z4 = false;
            if (znVar.f40303d1.getVisibility() == 0) {
                znVar.f40303d1.setVisibility(4);
            }
        } else {
            znVar.Z4 = true;
            if (znVar.f40303d1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.f40303d1.setVisibility(0);
            }
        }
        znVar.f40267a5 = true ^ znVar.Y.t0();
        if (znVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f36609a != i12) {
            znVar.f40276b0 = 0;
        }
        this.f36609a = i12;
    }

    @Override
    public final void g() {
        this.f36611c.vc();
    }

    @Override
    public final boolean g1(long j3) {
        return false;
    }

    @Override
    public final void i2() {
        rm rmVar;
        int indexOfChild;
        int i10;
        zn znVar = this.f36611c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.e != null || znVar.f40270a8 != null) && znVar.fragmentView != null) {
                org.telegram.ui.Components.i40 i40Var = znVar.f40329f2;
                if ((i40Var == null || i40Var.getVisibility() != 0) && (indexOfChild = (rmVar = znVar.X0).indexOfChild(znVar.S)) != -1) {
                    try {
                        znVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (znVar.f40329f2 == null) {
                        org.telegram.ui.Components.i40 i40Var2 = new org.telegram.ui.Components.i40(9, znVar.getParentActivity(), znVar.f40324ea, false);
                        znVar.f40329f2 = i40Var2;
                        i40Var2.setVisibility(8);
                        rmVar.addView(znVar.f40329f2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = znVar.f40270a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.i40 i40Var3 = znVar.f40329f2;
                        if (znVar.Y.f21983c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        i40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, znVar.f40326f.first_name)));
                    } else if (!ChatObject.canSendVoice(znVar.e) && !ChatObject.canSendRoundVideo(znVar.e)) {
                        if (!znVar.K6()) {
                            if (znVar.Y.f21983c1) {
                                znVar.f40329f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 21));
                            } else {
                                znVar.f40329f2.setText(ChatObject.getRestrictedErrorText(znVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 20)) {
                        znVar.f40329f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 21)) {
                        znVar.f40329f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.e, 7)) {
                        znVar.f40329f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                znVar.f40329f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                znVar.f40329f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = znVar.Y.getSendButton();
                    View audioVideoButtonContainer = znVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    znVar.f40329f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final boolean j1() {
        org.telegram.ui.Components.h60 h60Var = this.f36611c.f40279b3;
        if (h60Var != null && h60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void j2(boolean z10) {
        zn znVar = this.f36611c;
        View view = znVar.f40540w2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.f40281b5 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.h60 c60Var;
        zn znVar = this.f36611c;
        boolean z11 = false;
        if (znVar.f40279b3 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            Activity parentActivity = znVar.getParentActivity();
            xn xnVar = znVar.f40324ea;
            int i13 = org.telegram.ui.Components.h60.e;
            if (SharedSettings.roundVideoCamera2Enabled.get()) {
                c60Var = new org.telegram.ui.Components.b60(parentActivity, znVar, xnVar);
            } else {
                c60Var = new org.telegram.ui.Components.c60(parentActivity, znVar, xnVar, true);
            }
            znVar.f40279b3 = c60Var;
            c60Var.setAnimationCallback(new qe(znVar, 0));
            znVar.f40279b3.setTrimCallback(new qe(znVar, 1));
            znVar.f40279b3.setRecordingUiFrameCallback(new qj(znVar));
            znVar.f40279b3.setClipToPadding(false);
            znVar.f40279b3.g(znVar.J, znVar.f40537w);
            int indexOfChild = znVar.X0.indexOfChild(znVar.S);
            if (indexOfChild < 0) {
                indexOfChild = znVar.X0.getChildCount();
            }
            znVar.X0.addView(znVar.f40279b3, Math.min(indexOfChild + 1, znVar.X0.getChildCount()), w7.y5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h60 h60Var = znVar.f40279b3;
        if (h60Var != null) {
            if (i10 == 0) {
                h60Var.h(false);
                znVar.f40551x0.C0();
                znVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    h60Var.a(z11);
                }
            } else {
                h60Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.az0 az0Var = this.f36611c.f40303d1;
        if (az0Var != null) {
            az0Var.f();
        }
    }

    @Override
    public final boolean m() {
        return this.f36611c.K6();
    }

    @Override
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.i40 i40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        zn znVar = this.f36611c;
        if (isEmpty && !znVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        fk fkVar = znVar.I1;
        if (fkVar != null && fkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            znVar.I1.getAdapter().U(charSequence2, znVar.Y.getCursorPosition(), znVar.f40518u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = znVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            znVar.J5 = null;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            mk mkVar = znVar.Y;
            if (mkVar.Y2 && (!mkVar.r0() || !znVar.Y.a2)) {
                if (z10) {
                    znVar.Ya(charSequence2, true);
                } else {
                    znVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    znVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        xk xkVar = znVar.f40561xa;
        if (xkVar != null) {
            ArrayList arrayList = xkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).f33792n = true;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.f49395l = true;
        }
        zg.l0 l0Var2 = zg.l0.C;
        if (l0Var2 != null) {
            l0Var2.f49395l = true;
        }
        if (!z11) {
            ij ijVar = znVar.f40341g2;
            if ((ijVar != null && ijVar.getVisibility() == 0) || ((i40Var = znVar.f40365i2) != null && i40Var.getVisibility() == 0)) {
                ij ijVar2 = znVar.f40341g2;
                if (ijVar2 != null) {
                    ijVar2.b(true);
                }
                org.telegram.ui.Components.i40 i40Var2 = znVar.f40365i2;
                if (i40Var2 != null) {
                    i40Var2.b(true);
                    return;
                }
                return;
            }
            ug ugVar = znVar.Na;
            if (UserObject.isUserSelf(znVar.f40326f) || ((chatFull = znVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && znVar.R3 == 0)) {
                z13 = true;
            }
            if (!znVar.f40378j2 && !znVar.f40353h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !znVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(ugVar);
                AndroidUtilities.runOnUIThread(ugVar, 4000L);
            }
        }
    }

    @Override
    public final void n0() {
        org.telegram.ui.Components.az0 az0Var = this.f36611c.f40303d1;
        if (az0Var != null) {
            az0Var.f();
        }
    }

    @Override
    public final void o1() {
        org.telegram.ui.Components.h60 h60Var = this.f36611c.f40279b3;
        if (h60Var != null) {
            h60Var.i();
        }
    }

    @Override
    public final void o2() {
        zn znVar = this.f36611c;
        ij ijVar = znVar.f40341g2;
        if (ijVar != null) {
            ijVar.b(true);
        }
        org.telegram.ui.Components.i40 i40Var = znVar.f40365i2;
        if (i40Var != null) {
            i40Var.b(true);
        }
    }

    @Override
    public final boolean p1() {
        zn znVar = this.f36611c;
        TLRPC.User user = znVar.f40326f;
        if (user != null && !UserObject.isUserSelf(user) && !znVar.f40326f.bot && znVar.h == null && znVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int q() {
        return this.f36611c.X0.R();
    }

    @Override
    public final pn q0() {
        return this.f36611c.f40404l5;
    }

    @Override
    public final void r1() {
        int i10;
        zn znVar = this.f36611c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        long j3 = znVar.T5;
        MessageSuggestionParams messageSuggestionParams = znVar.f40344g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new bf(znVar, 3)).show();
    }

    @Override
    public final void s1() {
        this.f36611c.H6();
    }

    @Override
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f36611c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.f19552n0) {
            org.telegram.ui.ActionBar.y yVar = znVar.f40363i0;
            if (yVar != null && !this.f36610b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f40351h0;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = znVar.f40315e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                hs hsVar = znVar.f40302d0;
                if (hsVar != null) {
                    hsVar.b(true);
                }
            }
        }
    }

    @Override
    public final void t1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        zn znVar = this.f36611c;
        znVar.W6();
        mk mkVar = znVar.Y;
        boolean z12 = mkVar.f22113z3;
        org.telegram.ui.Components.dg dgVar = mkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = znVar.wc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = znVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27304w;
            if (pcVar != null && pcVar.f27313l) {
                pcVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        fk fkVar = znVar.I1;
        float f10 = 0.0f;
        if (fkVar != null) {
            ViewPropertyAnimator animate = fkVar.animate();
            if (!z12 && !znVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.qr.f27653f).start();
        }
        org.telegram.ui.Components.az0 az0Var = znVar.f40303d1;
        if (az0Var != null) {
            az0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = znVar.f40303d1.animate();
            if (!z12 && !znVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.qr.f27653f).withEndAction(new bi.f(20, this, z12)).start();
        }
    }

    @Override
    public final void u1(View view, CharSequence charSequence, boolean z10) {
        zn znVar = this.f36611c;
        znVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f40351h0;
        if (v0Var != null && v0Var.getVisibility() != 0) {
            znVar.f40351h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = znVar.f40315e0;
            if (yVar != null) {
                yVar.f(8);
            }
            hs hsVar = znVar.f40302d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void w1(CharSequence charSequence) {
        this.f36611c.Ya(charSequence, true);
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f36611c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.f19552n0) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.f40351h0;
            if (v0Var != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = znVar.f40363i0;
            if (yVar != null && !this.f36610b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f40315e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            hs hsVar = znVar.f40302d0;
            if (hsVar != null) {
                hsVar.b(false);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        zn znVar = this.f36611c;
        if (znVar.f40564y0 != null) {
            znVar.f40276b0 = znVar.Y.getBackgroundTop();
        }
        fk fkVar = znVar.I1;
        if (fkVar != null) {
            fkVar.getAdapter().f9822f0 = true;
        }
        if (znVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new dj(this, 6), 30L);
        }
        if (znVar.Y.t0()) {
            znVar.Y.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.Y.U0(true, true, z10);
        if (znVar.f40441o5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.f40441o5, true);
            znVar.f40441o5 = 0;
        }
        znVar.yc(0, true);
        znVar.hc(false);
        znVar.Wc(false);
    }

    @Override
    public final boolean x1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f36611c.f40332f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void y(float f7) {
        zn znVar = this.f36611c;
        if (f7 != 0.0f) {
            znVar.D4 = true;
        }
        znVar.o9();
        znVar.r9();
        znVar.Mc(false, false);
        znVar.X0.invalidate();
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27304w;
        if (pcVar != null && znVar.Yb != null) {
            pcVar.l();
        }
    }
}
