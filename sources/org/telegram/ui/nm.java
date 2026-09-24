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
public final class nm implements org.telegram.ui.Components.og {
    public int f35899a;
    public boolean f35900b;
    public final wn f35901c;

    public nm(wn wnVar) {
        this.f35901c = wnVar;
    }

    @Override
    public final void A2() {
        wn wnVar = this.f35901c;
        ai.g4 g4Var = wnVar.J1;
        if (g4Var != null) {
            g4Var.I1(null, 0);
        }
        wnVar.X9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        wn wnVar = this.f35901c;
        if (z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            wnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean C0() {
        int i10;
        wn wnVar = this.f35901c;
        if ((!wnVar.getMessagesController().isForum(wnVar.a()) || wnVar.f39484h4) && (i10 = wnVar.R3) != 9 && wnVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId()) {
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
        this.f35901c.Vb(true, false);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f35901c;
        if (wnVar.f39492i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            final org.telegram.ui.ActionBar.y n10 = kVar.n();
            org.telegram.ui.Components.xy0 xy0Var = wnVar.f39433d1;
            if (xy0Var != null) {
                xy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.x xVar = wnVar.f39492i0;
                if (xVar.f19900o == null) {
                    xVar.f19900o = 1;
                    if (wnVar.f39492i0.f19897l != 0) {
                        if ((wnVar.R3 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId()) || (wnVar.R3 == 0 && ((wnVar.f39436d4 == 0 || wnVar.f39484h4) && !UserObject.isReplyUser(wnVar.f39456f) && !wnVar.A9()))) {
                            wnVar.f39492i0.f(0);
                            wn.J3(wnVar);
                            org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39480h0;
                            if (u0Var != null) {
                                u0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar2 = wnVar.f39445e0;
                            if (xVar2 != null) {
                                xVar2.f(8);
                            }
                            bs bsVar = wnVar.f39432d0;
                            if (bsVar != null) {
                                bsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.rr.f28022f);
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
                wnVar.A4 = i10;
                wnVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.x xVar3 = wnVar.f39492i0;
            if (xVar3.f19900o != null) {
                xVar3.f19900o = null;
                if (xVar3.f19897l != 8) {
                    if ((wnVar.R3 == 3 && wnVar.I8() == wnVar.getUserConfig().getClientUserId()) || (wnVar.R3 == 0 && ((wnVar.f39436d4 == 0 || wnVar.f39484h4) && !UserObject.isReplyUser(wnVar.f39456f) && !wnVar.A9()))) {
                        wnVar.f39492i0.f(8);
                        if (wnVar.Y.k0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.f39480h0;
                            if (u0Var2 != null) {
                                u0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar4 = wnVar.f39445e0;
                            if (xVar4 != null) {
                                xVar4.f(0);
                            }
                            bs bsVar2 = wnVar.f39432d0;
                            if (bsVar2 != null) {
                                bsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = wnVar.f39480h0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.x xVar5 = wnVar.f39445e0;
                        if (xVar5 != null) {
                            xVar5.f(8);
                        }
                        bs bsVar3 = wnVar.f39432d0;
                        if (bsVar3 != null) {
                            bsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.rr.f28022f);
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
    public final void E1() {
        int i10;
        int i11;
        wn wnVar = this.f35901c;
        if (!wnVar.z9() && (i10 = wnVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = wnVar.getMessagesController();
            long j3 = wnVar.T5;
            long j10 = wnVar.f39436d4;
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void G0() {
        wn wnVar = this.f35901c;
        wnVar.o9 = true;
        jm jmVar = wnVar.A0;
        if (jmVar != null) {
            jmVar.K(true);
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
        wn wnVar = this.f35901c;
        ArrayList arrayList = wnVar.f39647u6;
        if (wnVar.f39693y0 != null) {
            wnVar.f39406b0 = wnVar.Y.getBackgroundTop();
        }
        ck ckVar = wnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            wnVar.I1.getAdapter().f9822w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (wnVar.S3 == -1) {
                wnVar.S3 = 0;
            }
            if (charSequence != null) {
                wnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = wnVar.f39462f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                wnVar.S3 += wnVar.f39462f5.forwardMessages.messages.size();
            }
            wnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = wnVar.f39462f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && wnVar.f39462f5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            wnVar.f39462f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = wnVar.getMessagesController().getPeer(wnVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(wnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Components.nc) M.e).f26710a;
                lj0Var.setScaleX(1.8f);
                lj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(wnVar.e) && !wnVar.f39484h4 && (messageObject = wnVar.f39559n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, wnVar.f39559n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f18373id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                wnVar.getMediaDataController().cleanDraft(wnVar.T5, j10, false);
            }
        }
        wnVar.zb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = wnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = wnVar.Y.getEmojiView().T0) != null) {
            if (g1Var.e) {
                MessagesController.getInstance(g1Var.f9721a).sendTyping(g1Var.f9722b, g1Var.f9723c, 2, 0);
            }
            g1Var.f9724f = -1L;
        }
        if (!wnVar.getMessagesController().premiumFeaturesBlocked() && wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !wnVar.getMessagesController().didPressTranscribeButtonEnough() && !wnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.r31.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f35901c.ha;
    }

    @Override
    public final void J0() {
        this.f35901c.ja(0, false);
    }

    @Override
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.h60 h60Var = this.f35901c.f39409b3;
        if (h60Var != null) {
            h60Var.b(f7, i10);
        }
    }

    @Override
    public final void T0() {
        wn wnVar = this.f35901c;
        int sendingMessageId = wnVar.getSendMessagesHelper().getSendingMessageId(wnVar.T5);
        if (sendingMessageId != 0) {
            this.f35901c.F(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void W() {
        boolean z10;
        wn wnVar = this.f35901c;
        jk jkVar = wnVar.Y;
        boolean z11 = jkVar.f22084z3;
        org.telegram.ui.Components.eg egVar = jkVar.U0;
        boolean z12 = false;
        if (egVar != null && egVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.c cVar = wnVar.wc;
        if (z11 && !z10) {
            z12 = true;
        }
        cVar.a(z12, true);
    }

    @Override
    public final void X(boolean z10) {
        this.f35901c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        wn wnVar = this.f35901c;
        if (wnVar.f39423c3.getVisibility() != i11) {
            wnVar.f39423c3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f35901c.X0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.xy0 xy0Var = this.f35901c.f39433d1;
        if (xy0Var != null) {
            xy0Var.e();
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
        wn wnVar = this.f35901c;
        if (i10 < currentActionBarHeight) {
            wnVar.Z4 = false;
            if (wnVar.f39433d1.getVisibility() == 0) {
                wnVar.f39433d1.setVisibility(4);
            }
        } else {
            wnVar.Z4 = true;
            if (wnVar.f39433d1.getVisibility() == 4 && !wnVar.isInPreviewMode()) {
                wnVar.f39433d1.setVisibility(0);
            }
        }
        wnVar.f39397a5 = true ^ wnVar.Y.t0();
        if (wnVar.Y.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f35899a != i12) {
            wnVar.f39406b0 = 0;
        }
        this.f35899a = i12;
    }

    @Override
    public final void g() {
        this.f35901c.vc();
    }

    @Override
    public final boolean i1() {
        org.telegram.ui.Components.h60 h60Var = this.f35901c.f39409b3;
        if (h60Var != null && h60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        pm pmVar;
        int indexOfChild;
        int i10;
        wn wnVar = this.f35901c;
        if (wnVar.getParentActivity() != null) {
            if ((wnVar.e != null || wnVar.f39400a8 != null) && wnVar.fragmentView != null) {
                org.telegram.ui.Components.j40 j40Var = wnVar.f39459f2;
                if ((j40Var == null || j40Var.getVisibility() != 0) && (indexOfChild = (pmVar = wnVar.X0).indexOfChild(wnVar.S)) != -1) {
                    try {
                        wnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (wnVar.f39459f2 == null) {
                        org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(9, wnVar.getParentActivity(), wnVar.f39454ea, false);
                        wnVar.f39459f2 = j40Var2;
                        j40Var2.setVisibility(8);
                        pmVar.addView(wnVar.f39459f2, indexOfChild + 1, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = wnVar.f39400a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.j40 j40Var3 = wnVar.f39459f2;
                        if (wnVar.Y.f21954c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        j40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, wnVar.f39456f.first_name)));
                    } else if (!ChatObject.canSendVoice(wnVar.e) && !ChatObject.canSendRoundVideo(wnVar.e)) {
                        if (!wnVar.K6()) {
                            if (wnVar.Y.f21954c1) {
                                wnVar.f39459f2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 21));
                            } else {
                                wnVar.f39459f2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 20)) {
                        wnVar.f39459f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 21)) {
                        wnVar.f39459f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 7)) {
                        wnVar.f39459f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                wnVar.f39459f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                wnVar.f39459f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(wnVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = wnVar.Y.getSendButton();
                    View audioVideoButtonContainer = wnVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    wnVar.f39459f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void j2(boolean z10) {
        wn wnVar = this.f35901c;
        View view = wnVar.f39669w2;
        if (view != null) {
            view.setVisibility(8);
        }
        wnVar.f39411b5 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.h60 c60Var;
        wn wnVar = this.f35901c;
        boolean z11 = false;
        if (wnVar.f39409b3 == null && CameraView.isCameraAllowed() && wnVar.getParentActivity() != null) {
            Activity parentActivity = wnVar.getParentActivity();
            un unVar = wnVar.f39454ea;
            int i13 = org.telegram.ui.Components.h60.e;
            if (pi.e.f41345b.a()) {
                c60Var = new org.telegram.ui.Components.b60(parentActivity, wnVar, unVar);
            } else {
                c60Var = new org.telegram.ui.Components.c60(parentActivity, wnVar, unVar, true);
            }
            wnVar.f39409b3 = c60Var;
            c60Var.setAnimationCallback(new pe(wnVar, 0));
            wnVar.f39409b3.setTrimCallback(new pe(wnVar, 1));
            wnVar.f39409b3.setRecordingUiFrameCallback(new nj(wnVar));
            wnVar.f39409b3.setClipToPadding(false);
            wnVar.f39409b3.g(wnVar.J, wnVar.f39666w);
            int indexOfChild = wnVar.X0.indexOfChild(wnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = wnVar.X0.getChildCount();
            }
            wnVar.X0.addView(wnVar.f39409b3, Math.min(indexOfChild + 1, wnVar.X0.getChildCount()), w7.y5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h60 h60Var = wnVar.f39409b3;
        if (h60Var != null) {
            if (i10 == 0) {
                h60Var.h(false);
                wnVar.f39680x0.B0();
                wnVar.A0.T();
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
        org.telegram.ui.Components.xy0 xy0Var = this.f35901c.f39433d1;
        if (xy0Var != null) {
            xy0Var.f();
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
        wn wnVar = this.f35901c;
        if (isEmpty && !wnVar.Y.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        ck ckVar = wnVar.I1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            charSequence2 = charSequence;
            wnVar.I1.getAdapter().U(charSequence2, wnVar.Y.getCursorPosition(), wnVar.f39647u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = wnVar.J5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            wnVar.J5 = null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = wnVar.Y;
            if (jkVar.Y2 && (!jkVar.r0() || !wnVar.Y.a2)) {
                if (z10) {
                    wnVar.Ya(charSequence2, true);
                } else {
                    wnVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    wnVar.J5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        uk ukVar = wnVar.f39690xa;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((bz) arrayList.get(i10)).f32508n = true;
            }
        }
        zg.k0 k0Var = zg.k0.B;
        if (k0Var != null) {
            k0Var.f49333l = true;
        }
        zg.k0 k0Var2 = zg.k0.C;
        if (k0Var2 != null) {
            k0Var2.f49333l = true;
        }
        if (!z11) {
            fj fjVar = wnVar.f39471g2;
            if ((fjVar != null && fjVar.getVisibility() == 0) || ((j40Var = wnVar.f39494i2) != null && j40Var.getVisibility() == 0)) {
                fj fjVar2 = wnVar.f39471g2;
                if (fjVar2 != null) {
                    fjVar2.b(true);
                }
                org.telegram.ui.Components.j40 j40Var2 = wnVar.f39494i2;
                if (j40Var2 != null) {
                    j40Var2.b(true);
                    return;
                }
                return;
            }
            rg rgVar = wnVar.Na;
            if (UserObject.isUserSelf(wnVar.f39456f) || ((chatFull = wnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && wnVar.R3 == 0)) {
                z13 = true;
            }
            if (!wnVar.f39507j2 && !wnVar.f39482h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !wnVar.Y.r0()) {
                AndroidUtilities.cancelRunOnUIThread(rgVar);
                AndroidUtilities.runOnUIThread(rgVar, 4000L);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f35901c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.xy0 xy0Var = this.f35901c.f39433d1;
        if (xy0Var != null) {
            xy0Var.f();
        }
    }

    @Override
    public final void n1() {
        org.telegram.ui.Components.h60 h60Var = this.f35901c.f39409b3;
        if (h60Var != null) {
            h60Var.i();
        }
    }

    @Override
    public final boolean o1() {
        wn wnVar = this.f35901c;
        TLRPC.User user = wnVar.f39456f;
        if (user != null && !UserObject.isUserSelf(user) && !wnVar.f39456f.bot && wnVar.h == null && wnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        wn wnVar = this.f35901c;
        fj fjVar = wnVar.f39471g2;
        if (fjVar != null) {
            fjVar.b(true);
        }
        org.telegram.ui.Components.j40 j40Var = wnVar.f39494i2;
        if (j40Var != null) {
            j40Var.b(true);
        }
    }

    @Override
    public final mn p0() {
        return this.f35901c.f39533l5;
    }

    @Override
    public final int q() {
        return this.f35901c.X0.R();
    }

    @Override
    public final void q1() {
        int i10;
        wn wnVar = this.f35901c;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        long j3 = wnVar.T5;
        MessageSuggestionParams messageSuggestionParams = wnVar.f39474g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, wnVar, wnVar.getResourceProvider(), 0, new af(wnVar, 4)).show();
    }

    @Override
    public final void r1() {
        this.f35901c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f35901c;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (!kVar.f19541n0) {
            org.telegram.ui.ActionBar.x xVar = wnVar.f39492i0;
            if (xVar != null && !this.f35900b) {
                xVar.f(8);
            }
            if (TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39480h0;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.x xVar2 = wnVar.f39445e0;
                if (xVar2 != null) {
                    xVar2.f(0);
                }
                bs bsVar = wnVar.f39432d0;
                if (bsVar != null) {
                    bsVar.b(true);
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
        wn wnVar = this.f35901c;
        wnVar.W6();
        jk jkVar = wnVar.Y;
        boolean z12 = jkVar.f22084z3;
        org.telegram.ui.Components.eg egVar = jkVar.U0;
        if (egVar != null && egVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.c cVar = wnVar.wc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        cVar.a(z11, true);
        if (z12) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27564w;
            if (qcVar != null && qcVar.f27573l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = wnVar.I1;
        float f10 = 0.0f;
        if (ckVar != null) {
            ViewPropertyAnimator animate = ckVar.animate();
            if (!z12 && !wnVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.rr.f28022f).start();
        }
        org.telegram.ui.Components.xy0 xy0Var = wnVar.f39433d1;
        if (xy0Var != null) {
            xy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = wnVar.f39433d1.animate();
            if (!z12 && !wnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.rr.f28022f).withEndAction(new bi.f(20, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        wn wnVar = this.f35901c;
        wnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39480h0;
        if (u0Var != null && u0Var.getVisibility() != 0) {
            wnVar.f39480h0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = wnVar.f39445e0;
            if (xVar != null) {
                xVar.f(8);
            }
            bs bsVar = wnVar.f39432d0;
            if (bsVar != null) {
                bsVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f35901c.Ya(charSequence, true);
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f35901c.f39462f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f35901c;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (!kVar.f19541n0) {
            org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39480h0;
            if (u0Var != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = wnVar.f39492i0;
            if (xVar != null && !this.f35900b) {
                xVar.f(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = wnVar.f39445e0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            bs bsVar = wnVar.f39432d0;
            if (bsVar != null) {
                bsVar.b(false);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        wn wnVar = this.f35901c;
        if (wnVar.f39693y0 != null) {
            wnVar.f39406b0 = wnVar.Y.getBackgroundTop();
        }
        ck ckVar = wnVar.I1;
        if (ckVar != null) {
            ckVar.getAdapter().f9803f0 = true;
        }
        if (wnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new aj(this, 6), 30L);
        }
        if (wnVar.Y.t0()) {
            wnVar.Y.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.Y.V0(true, true, z10);
        if (wnVar.f39570o5 != 0) {
            wnVar.getConnectionsManager().cancelRequest(wnVar.f39570o5, true);
            wnVar.f39570o5 = 0;
        }
        wnVar.yc(0, true);
        wnVar.hc(false);
        wnVar.Wc(false);
    }

    @Override
    public final void y(float f7) {
        wn wnVar = this.f35901c;
        if (f7 != 0.0f) {
            wnVar.D4 = true;
        }
        wnVar.o9();
        wnVar.r9();
        wnVar.Mc(false, false);
        wnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27564w;
        if (qcVar != null && wnVar.Yb != null) {
            qcVar.l();
        }
    }

    @Override
    public final void z1() {
        int i10;
        wn wnVar = this.f35901c;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(wnVar.T5, (int) wnVar.d());
        wnVar.c7(true);
    }
}
