package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class qm implements org.telegram.ui.Components.qg {
    public int f41144a;
    public boolean f41145b;
    public final zn f41146c;

    public qm(zn znVar) {
        this.f41146c = znVar;
    }

    @Override
    public final void B1(CharSequence charSequence) {
        this.f41146c.cb(charSequence, true);
    }

    @Override
    public final void B2() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f41146c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.f21285n0) {
            org.telegram.ui.ActionBar.v0 v0Var = znVar.f44787h0;
            if (v0Var != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = znVar.f44799i0;
            if (yVar != null && !this.f41145b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = znVar.f44752e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            fs fsVar = znVar.f44738d0;
            if (fsVar != null) {
                fsVar.b(false);
            }
        }
    }

    @Override
    public final void C(boolean z10) {
        int i10;
        int i11;
        zn znVar = this.f41146c;
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
    public final boolean C1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f41146c.f44769f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void F2() {
        zn znVar = this.f41146c;
        ai.h4 h4Var = znVar.J1;
        if (h4Var != null) {
            h4Var.L1(null, 0);
        }
        znVar.ca();
    }

    @Override
    public final void G1() {
        int i10;
        zn znVar = this.f41146c;
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(znVar.T5, (int) znVar.d());
        znVar.f7(true);
    }

    @Override
    public final boolean I0() {
        int i10;
        zn znVar = this.f41146c;
        if ((!znVar.getMessagesController().isForum(znVar.a()) || znVar.f44791h4) && (i10 = znVar.R3) != 9 && znVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void J() {
        this.f41146c.Zb(true, false);
    }

    @Override
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        gg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        zn znVar = this.f41146c;
        ArrayList arrayList = znVar.f44954u6;
        if (znVar.f45001y0 != null) {
            znVar.f44712b0 = znVar.Y.getBackgroundTop();
        }
        gk gkVar = znVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            znVar.I1.getAdapter().f10693w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (znVar.S3 == -1) {
                znVar.S3 = 0;
            }
            if (charSequence != null) {
                znVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f44769f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                znVar.S3 += znVar.f44769f5.forwardMessages.messages.size();
            }
            znVar.Ic(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = znVar.f44769f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && znVar.f44769f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            znVar.f44769f5.forwardMessages.getSelectedMessages(arrayList2);
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
                org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(znVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.fk0 fk0Var = ((org.telegram.ui.Components.qc) M.f31126e).f30140a;
                fk0Var.setScaleX(1.8f);
                fk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(znVar.f44751e) && !znVar.f44791h4 && (messageObject = znVar.f44866n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, znVar.f44866n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f20090id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                znVar.getMediaDataController().cleanDraft(znVar.T5, j10, false);
            }
        }
        znVar.Cb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        ok okVar = znVar.Y;
        if (okVar != null && okVar.getEmojiView() != null && (f1Var = znVar.Y.getEmojiView().T0) != null) {
            if (f1Var.f10595e) {
                MessagesController.getInstance(f1Var.f10592a).sendTyping(f1Var.f10593b, f1Var.f10594c, 2, 0);
            }
            f1Var.f10596f = -1L;
        }
        if (!znVar.getMessagesController().premiumFeaturesBlocked() && znVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !znVar.getMessagesController().didPressTranscribeButtonEnough() && !znVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.j41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final void K0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f41146c;
        if (znVar.f44799i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
            final org.telegram.ui.ActionBar.z o9 = kVar.o();
            org.telegram.ui.Components.oz0 oz0Var = znVar.f44739d1;
            if (oz0Var != null) {
                oz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = znVar.f44799i0;
                if (yVar.f21714o == null) {
                    yVar.f21714o = 1;
                    if (znVar.f44799i0.f21711l != 0) {
                        if ((znVar.R3 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId()) || (znVar.R3 == 0 && ((znVar.f44742d4 == 0 || znVar.f44791h4) && !UserObject.isReplyUser(znVar.f44763f) && !znVar.F9()))) {
                            znVar.f44799i0.f(0);
                            zn.S3(znVar);
                            org.telegram.ui.ActionBar.v0 v0Var = znVar.f44787h0;
                            if (v0Var != null) {
                                v0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = znVar.f44752e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            fs fsVar = znVar.f44738d0;
                            if (fsVar != null) {
                                fsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.hs.f27118f);
                            ofFloat.addListener(new pm(this, o9, 0));
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
                znVar.A4 = i10;
                znVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = znVar.f44799i0;
            if (yVar3.f21714o != null) {
                yVar3.f21714o = null;
                if (yVar3.f21711l != 8) {
                    if ((znVar.R3 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId()) || (znVar.R3 == 0 && ((znVar.f44742d4 == 0 || znVar.f44791h4) && !UserObject.isReplyUser(znVar.f44763f) && !znVar.F9()))) {
                        znVar.f44799i0.f(8);
                        if (znVar.Y.i0() && TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.v0 v0Var2 = znVar.f44787h0;
                            if (v0Var2 != null) {
                                v0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = znVar.f44752e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            fs fsVar2 = znVar.f44738d0;
                            if (fsVar2 != null) {
                                fsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = znVar.f44787h0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = znVar.f44752e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        fs fsVar3 = znVar.f44738d0;
                        if (fsVar3 != null) {
                            fsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.hs.f27118f);
                    ofFloat2.addListener(new pm(this, o9, 1));
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
    public final void L1() {
        int i10;
        int i11;
        zn znVar = this.f41146c;
        if (!znVar.E9() && (i10 = znVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = znVar.getMessagesController();
            long j3 = znVar.T5;
            long j10 = znVar.f44742d4;
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void M0() {
        zn znVar = this.f41146c;
        znVar.o9 = true;
        mm mmVar = znVar.A0;
        if (mmVar != null) {
            mmVar.K(true);
        }
    }

    @Override
    public final void O0() {
        this.f41146c.oa(0, false);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers P() {
        return this.f41146c.ha;
    }

    @Override
    public final void V(float f7, int i10) {
        org.telegram.ui.Components.y60 y60Var = this.f41146c.f44715b3;
        if (y60Var != null) {
            y60Var.b(f7, i10);
        }
    }

    @Override
    public final void Z0() {
        zn znVar = this.f41146c;
        int sendingMessageId = znVar.getSendMessagesHelper().getSendingMessageId(znVar.T5);
        if (sendingMessageId != 0) {
            this.f41146c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void a0() {
        boolean z10;
        zn znVar = this.f41146c;
        ok okVar = znVar.Y;
        boolean z11 = okVar.f23997z3;
        org.telegram.ui.Components.gg ggVar = okVar.U0;
        boolean z12 = false;
        if (ggVar != null && ggVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        me.b bVar = znVar.xc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void c0(boolean z10) {
        this.f41146c.Zb(false, z10);
    }

    @Override
    public final void g1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        zn znVar = this.f41146c;
        if (znVar.f44729c3.getVisibility() != i11) {
            znVar.f44729c3.setVisibility(i11);
        }
    }

    @Override
    public final void h() {
        this.f41146c.zc();
    }

    @Override
    public final int h1() {
        return this.f41146c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem j1() {
        return null;
    }

    @Override
    public final void j2() {
        org.telegram.ui.Components.oz0 oz0Var = this.f41146c.f44739d1;
        if (oz0Var != null) {
            oz0Var.e();
        }
    }

    @Override
    public final void l() {
        org.telegram.ui.Components.oz0 oz0Var = this.f41146c.f44739d1;
        if (oz0Var != null) {
            oz0Var.f();
        }
    }

    @Override
    public final boolean l1(long j3) {
        return false;
    }

    @Override
    public final void l2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        zn znVar = this.f41146c;
        if (i10 < currentActionBarHeight) {
            znVar.Z4 = false;
            if (znVar.f44739d1.getVisibility() == 0) {
                znVar.f44739d1.setVisibility(4);
            }
        } else {
            znVar.Z4 = true;
            if (znVar.f44739d1.getVisibility() == 4 && !znVar.isInPreviewMode()) {
                znVar.f44739d1.setVisibility(0);
            }
        }
        znVar.f44703a5 = true ^ znVar.Y.r0();
        if (znVar.Y.r0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f41144a != i12) {
            znVar.f44712b0 = 0;
        }
        this.f41144a = i12;
    }

    @Override
    public final boolean m() {
        return this.f41146c.N6();
    }

    @Override
    public final boolean o1() {
        org.telegram.ui.Components.y60 y60Var = this.f41146c.f44715b3;
        if (y60Var != null && y60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        sm smVar;
        int indexOfChild;
        int i10;
        zn znVar = this.f41146c;
        if (znVar.getParentActivity() != null) {
            if ((znVar.f44751e != null || znVar.f44706a8 != null) && znVar.fragmentView != null) {
                org.telegram.ui.Components.z40 z40Var = znVar.f44766f2;
                if ((z40Var == null || z40Var.getVisibility() != 0) && (indexOfChild = (smVar = znVar.X0).indexOfChild(znVar.S)) != -1) {
                    try {
                        znVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (znVar.f44766f2 == null) {
                        org.telegram.ui.Components.z40 z40Var2 = new org.telegram.ui.Components.z40(9, znVar.getParentActivity(), znVar.f44761ea, false);
                        znVar.f44766f2 = z40Var2;
                        z40Var2.setVisibility(8);
                        smVar.addView(znVar.f44766f2, indexOfChild + 1, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    }
                    TLRPC.UserFull userFull = znVar.f44706a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.z40 z40Var3 = znVar.f44766f2;
                        if (znVar.Y.f23866c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        z40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, znVar.f44763f.first_name)));
                    } else if (!ChatObject.canSendVoice(znVar.f44751e) && !ChatObject.canSendRoundVideo(znVar.f44751e)) {
                        if (!znVar.N6()) {
                            if (znVar.Y.f23866c1) {
                                znVar.f44766f2.setText(ChatObject.getRestrictedErrorText(znVar.f44751e, 21));
                            } else {
                                znVar.f44766f2.setText(ChatObject.getRestrictedErrorText(znVar.f44751e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(znVar.f44751e, 20)) {
                        znVar.f44766f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.f44751e, 21)) {
                        znVar.f44766f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(znVar.f44751e, 7)) {
                        znVar.f44766f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = znVar.f44751e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                znVar.f44766f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                znVar.f44766f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(znVar.f44751e.banned_rights.until_date)));
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
                    znVar.f44766f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void p2(boolean z10) {
        zn znVar = this.f41146c;
        View view = znVar.f44976w2;
        if (view != null) {
            view.setVisibility(8);
        }
        znVar.f44717b5 = !z10;
    }

    @Override
    public final void q0() {
        org.telegram.ui.Components.oz0 oz0Var = this.f41146c.f44739d1;
        if (oz0Var != null) {
            oz0Var.f();
        }
    }

    @Override
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.y60 t60Var;
        zn znVar = this.f41146c;
        boolean z12 = false;
        if (znVar.f44715b3 == null && CameraView.isCameraAllowed() && znVar.getParentActivity() != null) {
            Activity parentActivity = znVar.getParentActivity();
            xn xnVar = znVar.f44761ea;
            int i13 = org.telegram.ui.Components.y60.f33126e;
            pi.a aVar = pi.e.f45891b;
            aVar.a();
            if (aVar.f45883c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                t60Var = new org.telegram.ui.Components.s60(parentActivity, znVar, xnVar);
            } else {
                t60Var = new org.telegram.ui.Components.t60(parentActivity, znVar, xnVar, true);
            }
            znVar.f44715b3 = t60Var;
            t60Var.setAnimationCallback(new re(znVar, 0));
            znVar.f44715b3.setTrimCallback(new re(znVar, 1));
            znVar.f44715b3.setRecordingUiFrameCallback(new sj(znVar));
            znVar.f44715b3.setClipToPadding(false);
            znVar.f44715b3.g(znVar.J, znVar.f44973w);
            int indexOfChild = znVar.X0.indexOfChild(znVar.S);
            if (indexOfChild < 0) {
                indexOfChild = znVar.X0.getChildCount();
            }
            znVar.X0.addView(znVar.f44715b3, Math.min(indexOfChild + 1, znVar.X0.getChildCount()), w7.x5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.y60 y60Var = this.f41146c.f44715b3;
        if (y60Var != null) {
            if (i10 == 0) {
                y60Var.h(false);
                this.f41146c.f44988x0.B0();
                this.f41146c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    y60Var.a(z12);
                }
            } else {
                y60Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.z40 z40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        zn znVar = this.f41146c;
        if (isEmpty && !znVar.Y.p0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        gk gkVar = znVar.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            znVar.I1.getAdapter().U(charSequence2, znVar.Y.getCursorPosition(), znVar.f44954u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = znVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            znVar.J5 = null;
        }
        TLRPC.Chat chat = znVar.f44751e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ok okVar = znVar.Y;
            if (okVar.Y2 && (!okVar.p0() || !znVar.Y.a2)) {
                if (z10) {
                    znVar.cb(charSequence2, true);
                } else {
                    znVar.P6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 22);
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
        yk ykVar = znVar.f44998xa;
        if (ykVar != null) {
            ArrayList arrayList = ykVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ez) arrayList.get(i10)).f37396n = true;
            }
        }
        zg.j0 j0Var = zg.j0.B;
        if (j0Var != null) {
            j0Var.f54559l = true;
        }
        zg.j0 j0Var2 = zg.j0.C;
        if (j0Var2 != null) {
            j0Var2.f54559l = true;
        }
        if (!z11) {
            jj jjVar = znVar.f44778g2;
            if ((jjVar != null && jjVar.getVisibility() == 0) || ((z40Var = znVar.f44801i2) != null && z40Var.getVisibility() == 0)) {
                jj jjVar2 = znVar.f44778g2;
                if (jjVar2 != null) {
                    jjVar2.b(true);
                }
                org.telegram.ui.Components.z40 z40Var2 = znVar.f44801i2;
                if (z40Var2 != null) {
                    z40Var2.b(true);
                    return;
                }
                return;
            }
            rf rfVar = znVar.Oa;
            if (UserObject.isUserSelf(znVar.f44763f) || ((chatFull = znVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && znVar.R3 == 0)) {
                z13 = true;
            }
            if (!znVar.f44814j2 && !znVar.f44789h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !znVar.Y.p0()) {
                AndroidUtilities.cancelRunOnUIThread(rfVar);
                AndroidUtilities.runOnUIThread(rfVar, 4000L);
            }
        }
    }

    @Override
    public final void t1() {
        org.telegram.ui.Components.y60 y60Var = this.f41146c.f44715b3;
        if (y60Var != null) {
            y60Var.i();
        }
    }

    @Override
    public final pn u0() {
        return this.f41146c.f44840l5;
    }

    @Override
    public final boolean u1() {
        zn znVar = this.f41146c;
        TLRPC.User user = znVar.f44763f;
        if (user != null && !UserObject.isUserSelf(user) && !znVar.f44763f.bot && znVar.h == null && znVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void u2() {
        zn znVar = this.f41146c;
        jj jjVar = znVar.f44778g2;
        if (jjVar != null) {
            jjVar.b(true);
        }
        org.telegram.ui.Components.z40 z40Var = znVar.f44801i2;
        if (z40Var != null) {
            z40Var.b(true);
        }
    }

    @Override
    public final int v() {
        return this.f41146c.X0.R();
    }

    @Override
    public final void w1() {
        int i10;
        zn znVar = this.f41146c;
        Activity parentActivity = znVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        long j3 = znVar.T5;
        MessageSuggestionParams messageSuggestionParams = znVar.f44781g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.c0(parentActivity, i10, j3, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new cf(znVar, 4)).show();
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void x1() {
        this.f41146c.K6();
    }

    @Override
    public final void y() {
        boolean z10;
        zn znVar = this.f41146c;
        if (znVar.f45001y0 != null) {
            znVar.f44712b0 = znVar.Y.getBackgroundTop();
        }
        gk gkVar = znVar.I1;
        if (gkVar != null) {
            gkVar.getAdapter().f10674f0 = true;
        }
        if (znVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new cj(this, 7), 30L);
        }
        if (znVar.Y.r0()) {
            znVar.Y.c1();
            z10 = true;
        } else {
            z10 = false;
        }
        znVar.Y.T0(true, true, z10);
        if (znVar.f44877o5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.f44877o5, true);
            znVar.f44877o5 = 0;
        }
        znVar.Cc(0, true);
        znVar.lc(false);
        znVar.ad(false);
    }

    @Override
    public final void y1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        zn znVar = this.f41146c;
        znVar.Z6();
        ok okVar = znVar.Y;
        boolean z12 = okVar.f23997z3;
        org.telegram.ui.Components.gg ggVar = okVar.U0;
        if (ggVar != null && ggVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        me.b bVar = znVar.xc;
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
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31122w;
            if (tcVar != null && tcVar.f31132l) {
                tcVar.b();
            }
        } else {
            Activity parentActivity2 = znVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        gk gkVar = znVar.I1;
        float f10 = 0.0f;
        if (gkVar != null) {
            ViewPropertyAnimator animate = gkVar.animate();
            if (!z12 && !znVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.hs.f27118f).start();
        }
        org.telegram.ui.Components.oz0 oz0Var = znVar.f44739d1;
        if (oz0Var != null) {
            oz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = znVar.f44739d1.animate();
            if (!z12 && !znVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.hs.f27118f).withEndAction(new bi.f(21, this, z12)).start();
        }
    }

    @Override
    public final void z(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        zn znVar = this.f41146c;
        if (i10 != 0) {
            znVar.D4 = true;
        }
        znVar.t9();
        znVar.w9();
        znVar.Qc(false, false);
        znVar.X0.invalidate();
        org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31122w;
        if (tcVar != null && znVar.Zb != null) {
            tcVar.l();
        }
    }

    @Override
    public final void z0() {
        org.telegram.ui.ActionBar.k kVar;
        zn znVar = this.f41146c;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (!kVar.f21285n0) {
            org.telegram.ui.ActionBar.y yVar = znVar.f44799i0;
            if (yVar != null && !this.f41145b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(znVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f44787h0;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = znVar.f44752e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                fs fsVar = znVar.f44738d0;
                if (fsVar != null) {
                    fsVar.b(true);
                }
            }
        }
    }

    @Override
    public final void z1(View view, CharSequence charSequence, boolean z10) {
        zn znVar = this.f41146c;
        znVar.Wb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = znVar.f44787h0;
        if (v0Var != null && v0Var.getVisibility() != 0) {
            znVar.f44787h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = znVar.f44752e0;
            if (yVar != null) {
                yVar.f(8);
            }
            fs fsVar = znVar.f44738d0;
            if (fsVar != null) {
                fsVar.b(false);
            }
        }
    }
}
