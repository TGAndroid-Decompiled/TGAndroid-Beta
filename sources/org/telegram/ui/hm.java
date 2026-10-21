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
public final class hm implements org.telegram.ui.Components.og {
    public int f37686a;
    public boolean f37687b;
    public final qn f37688c;

    public hm(qn qnVar) {
        this.f37688c = qnVar;
    }

    @Override
    public final boolean B0() {
        int i10;
        qn qnVar = this.f37688c;
        if ((!qnVar.getMessagesController().isForum(qnVar.a()) || qnVar.f40705h4) && (i10 = qnVar.R3) != 9 && qnVar.S3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void C(boolean z10) {
        int i10;
        int i11;
        qn qnVar = this.f37688c;
        if (z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            qnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f37688c;
        if (qnVar.f40712i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
            final org.telegram.ui.ActionBar.y n10 = kVar.n();
            org.telegram.ui.Components.iz0 iz0Var = qnVar.f40653d1;
            if (iz0Var != null) {
                iz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.x xVar = qnVar.f40712i0;
                if (xVar.f21867o == null) {
                    xVar.f21867o = 1;
                    if (qnVar.f40712i0.f21864l != 0) {
                        if ((qnVar.R3 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId()) || (qnVar.R3 == 0 && ((qnVar.f40656d4 == 0 || qnVar.f40705h4) && !UserObject.isReplyUser(qnVar.f40676f) && !qnVar.F9()))) {
                            qnVar.f40712i0.f(0);
                            qn.S3(qnVar);
                            org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40701h0;
                            if (u0Var != null) {
                                u0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar2 = qnVar.f40664e0;
                            if (xVar2 != null) {
                                xVar2.f(8);
                            }
                            ur urVar = qnVar.f40652d0;
                            if (urVar != null) {
                                urVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                            ofFloat.addListener(new gm(this, n10, 0));
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
                qnVar.A4 = i10;
                qnVar.B4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.x xVar3 = qnVar.f40712i0;
            if (xVar3.f21867o != null) {
                xVar3.f21867o = null;
                if (xVar3.f21864l != 8) {
                    if ((qnVar.R3 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId()) || (qnVar.R3 == 0 && ((qnVar.f40656d4 == 0 || qnVar.f40705h4) && !UserObject.isReplyUser(qnVar.f40676f) && !qnVar.F9()))) {
                        qnVar.f40712i0.f(8);
                        if (qnVar.Y.i0() && TextUtils.isEmpty(qnVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.f40701h0;
                            if (u0Var2 != null) {
                                u0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar4 = qnVar.f40664e0;
                            if (xVar4 != null) {
                                xVar4.f(0);
                            }
                            ur urVar2 = qnVar.f40652d0;
                            if (urVar2 != null) {
                                urVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = qnVar.f40701h0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.x xVar5 = qnVar.f40664e0;
                        if (xVar5 != null) {
                            xVar5.f(8);
                        }
                        ur urVar3 = qnVar.f40652d0;
                        if (urVar3 != null) {
                            urVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                    ofFloat2.addListener(new gm(this, n10, 1));
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
    public final void F0() {
        qn qnVar = this.f37688c;
        qnVar.f40796o9 = true;
        dm dmVar = qnVar.A0;
        if (dmVar != null) {
            dmVar.K(true);
        }
    }

    @Override
    public final void H() {
        this.f37688c.ac(true, false);
    }

    @Override
    public final void H0() {
        this.f37688c.oa(0, false);
    }

    @Override
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        hg.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        qn qnVar = this.f37688c;
        ArrayList arrayList = qnVar.f40868u6;
        if (qnVar.f40915y0 != null) {
            qnVar.f40625b0 = qnVar.Y.getBackgroundTop();
        }
        xj xjVar = qnVar.I1;
        if (xjVar != null && xjVar.getAdapter() != null) {
            qnVar.I1.getAdapter().f11945w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (qnVar.S3 == -1) {
                qnVar.S3 = 0;
            }
            if (charSequence != null) {
                qnVar.S3++;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.f40682f5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                qnVar.S3 += qnVar.f40682f5.forwardMessages.messages.size();
            }
            qnVar.Jc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = qnVar.f40682f5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && qnVar.f40682f5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            qnVar.f40682f5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(qnVar.T5);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.yj0 yj0Var = ((org.telegram.ui.Components.nc) M.e).f28774a;
                yj0Var.setScaleX(1.8f);
                yj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(qnVar.e) && !qnVar.f40705h4 && (messageObject = qnVar.f40779n5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, qnVar.f40779n5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f20328id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                qnVar.getMediaDataController().cleanDraft(qnVar.T5, j11, false);
            }
        }
        qnVar.Db(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        fk fkVar = qnVar.Y;
        if (fkVar != null && fkVar.getEmojiView() != null && (f1Var = qnVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.f11859a).sendTyping(f1Var.f11860b, f1Var.f11861c, 2, 0);
            }
            f1Var.f11862f = -1L;
        }
        if (!qnVar.getMessagesController().premiumFeaturesBlocked() && qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !qnVar.getMessagesController().didPressTranscribeButtonEnough() && !qnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.a41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.f37688c.ha;
    }

    @Override
    public final void Q0() {
        qn qnVar = this.f37688c;
        int sendingMessageId = qnVar.getSendMessagesHelper().getSendingMessageId(qnVar.T5);
        if (sendingMessageId != 0) {
            this.f37688c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.iz0 iz0Var = this.f37688c.f40653d1;
        if (iz0Var != null) {
            iz0Var.e();
        }
    }

    @Override
    public final void U(float f7, int i10) {
        org.telegram.ui.Components.r60 r60Var = this.f37688c.f40628b3;
        if (r60Var != null) {
            r60Var.b(f7, i10);
        }
    }

    @Override
    public final void V1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        qn qnVar = this.f37688c;
        if (i10 < currentActionBarHeight) {
            qnVar.Z4 = false;
            if (qnVar.f40653d1.getVisibility() == 0) {
                qnVar.f40653d1.setVisibility(4);
            }
        } else {
            qnVar.Z4 = true;
            if (qnVar.f40653d1.getVisibility() == 4 && !qnVar.isInPreviewMode()) {
                qnVar.f40653d1.setVisibility(0);
            }
        }
        qnVar.f40616a5 = true ^ qnVar.Y.r0();
        if (qnVar.Y.r0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f37686a != i12) {
            qnVar.f40625b0 = 0;
        }
        this.f37686a = i12;
    }

    @Override
    public final void X0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        qn qnVar = this.f37688c;
        if (qnVar.f40642c3.getVisibility() != i11) {
            qnVar.f40642c3.setVisibility(i11);
        }
    }

    @Override
    public final void Y() {
        boolean z10;
        qn qnVar = this.f37688c;
        fk fkVar = qnVar.Y;
        boolean z11 = fkVar.f24055z3;
        org.telegram.ui.Components.dg dgVar = fkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = qnVar.yc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final int Y0() {
        return this.f37688c.X0.getHeight();
    }

    @Override
    public final void Y1() {
        jm jmVar;
        int indexOfChild;
        int i10;
        qn qnVar = this.f37688c;
        if (qnVar.getParentActivity() != null) {
            if ((qnVar.e != null || qnVar.f40619a8 != null) && qnVar.fragmentView != null) {
                org.telegram.ui.Components.r40 r40Var = qnVar.f40679f2;
                if ((r40Var == null || r40Var.getVisibility() != 0) && (indexOfChild = (jmVar = qnVar.X0).indexOfChild(qnVar.S)) != -1) {
                    try {
                        qnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (qnVar.f40679f2 == null) {
                        org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(9, qnVar.getParentActivity(), qnVar.f40673ea, false);
                        qnVar.f40679f2 = r40Var2;
                        r40Var2.setVisibility(8);
                        jmVar.addView(qnVar.f40679f2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = qnVar.f40619a8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.r40 r40Var3 = qnVar.f40679f2;
                        if (qnVar.Y.f23924c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        r40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, qnVar.f40676f.first_name)));
                    } else if (!ChatObject.canSendVoice(qnVar.e) && !ChatObject.canSendRoundVideo(qnVar.e)) {
                        if (!qnVar.N6()) {
                            if (qnVar.Y.f23924c1) {
                                qnVar.f40679f2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 21));
                            } else {
                                qnVar.f40679f2.setText(ChatObject.getRestrictedErrorText(qnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 20)) {
                        qnVar.f40679f2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 21)) {
                        qnVar.f40679f2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.e, 7)) {
                        qnVar.f40679f2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = qnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                qnVar.f40679f2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                qnVar.f40679f2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(qnVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = qnVar.Y.getSendButton();
                    View audioVideoButtonContainer = qnVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    qnVar.f40679f2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Z1(boolean z10) {
        qn qnVar = this.f37688c;
        View view = qnVar.f40890w2;
        if (view != null) {
            view.setVisibility(8);
        }
        qnVar.f40630b5 = !z10;
    }

    @Override
    public final void a0(boolean z10) {
        this.f37688c.ac(false, z10);
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.r60 m60Var;
        qn qnVar = this.f37688c;
        boolean z12 = false;
        if (qnVar.f40628b3 == null && CameraView.isCameraAllowed() && qnVar.getParentActivity() != null) {
            Activity parentActivity = qnVar.getParentActivity();
            on onVar = qnVar.f40673ea;
            int i13 = org.telegram.ui.Components.r60.e;
            ti.a aVar = ti.e.d;
            aVar.a();
            if (aVar.f47212c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                m60Var = new org.telegram.ui.Components.l60(parentActivity, qnVar, onVar);
            } else {
                m60Var = new org.telegram.ui.Components.m60(parentActivity, qnVar, onVar, true);
            }
            qnVar.f40628b3 = m60Var;
            m60Var.setAnimationCallback(new pe(qnVar, 0));
            qnVar.f40628b3.setTrimCallback(new pe(qnVar, 1));
            qnVar.f40628b3.setRecordingUiFrameCallback(new jj(qnVar));
            qnVar.f40628b3.setClipToPadding(false);
            qnVar.f40628b3.g(qnVar.J, qnVar.f40887w);
            int indexOfChild = qnVar.X0.indexOfChild(qnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = qnVar.X0.getChildCount();
            }
            qnVar.X0.addView(qnVar.f40628b3, Math.min(indexOfChild + 1, qnVar.X0.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.r60 r60Var = this.f37688c.f40628b3;
        if (r60Var != null) {
            if (i10 == 0) {
                r60Var.h(false);
                this.f37688c.f40901x0.B0();
                this.f37688c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    r60Var.a(z12);
                }
            } else {
                r60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean b1(long j10) {
        return false;
    }

    @Override
    public final boolean e1() {
        org.telegram.ui.Components.r60 r60Var = this.f37688c.f40628b3;
        if (r60Var != null && r60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2() {
        qn qnVar = this.f37688c;
        aj ajVar = qnVar.f40690g2;
        if (ajVar != null) {
            ajVar.b(true);
        }
        org.telegram.ui.Components.r40 r40Var = qnVar.f40714i2;
        if (r40Var != null) {
            r40Var.b(true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.r40 r40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        qn qnVar = this.f37688c;
        if (isEmpty && !qnVar.Y.p0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        xj xjVar = qnVar.I1;
        if (xjVar != null && xjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            qnVar.I1.getAdapter().U(charSequence2, qnVar.Y.getCursorPosition(), qnVar.f40868u6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        j9.u uVar = qnVar.J5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            qnVar.J5 = null;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            fk fkVar = qnVar.Y;
            if (fkVar.Y2 && (!fkVar.p0() || !qnVar.Y.a2)) {
                if (z10) {
                    qnVar.cb(charSequence2, true);
                } else {
                    qnVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    qnVar.J5 = uVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(uVar2, j10);
                }
            }
        }
        pk pkVar = qnVar.f40911xa;
        if (pkVar != null) {
            ArrayList arrayList = pkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ny) arrayList.get(i10)).f39714n = true;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.f696l = true;
        }
        ah.d1 d1Var2 = ah.d1.C;
        if (d1Var2 != null) {
            d1Var2.f696l = true;
        }
        if (!z11) {
            aj ajVar = qnVar.f40690g2;
            if ((ajVar != null && ajVar.getVisibility() == 0) || ((r40Var = qnVar.f40714i2) != null && r40Var.getVisibility() == 0)) {
                aj ajVar2 = qnVar.f40690g2;
                if (ajVar2 != null) {
                    ajVar2.b(true);
                }
                org.telegram.ui.Components.r40 r40Var2 = qnVar.f40714i2;
                if (r40Var2 != null) {
                    r40Var2.b(true);
                    return;
                }
                return;
            }
            kf kfVar = qnVar.Oa;
            if (UserObject.isUserSelf(qnVar.f40676f) || ((chatFull = qnVar.Z7) != null && chatFull.slowmode_next_send_date > 0 && qnVar.R3 == 0)) {
                z13 = true;
            }
            if (!qnVar.f40726j2 && !qnVar.f40703h2 && !z13 && SharedConfig.scheduledHintShows < 3 && !qnVar.Y.p0()) {
                AndroidUtilities.cancelRunOnUIThread(kfVar);
                AndroidUtilities.runOnUIThread(kfVar, 4000L);
            }
        }
    }

    @Override
    public final void h() {
        this.f37688c.Ac();
    }

    @Override
    public final void i1() {
        org.telegram.ui.Components.r60 r60Var = this.f37688c.f40628b3;
        if (r60Var != null) {
            r60Var.i();
        }
    }

    @Override
    public final boolean j1() {
        qn qnVar = this.f37688c;
        TLRPC.User user = qnVar.f40676f;
        if (user != null && !UserObject.isUserSelf(user) && !qnVar.f40676f.bot && qnVar.h == null && qnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.iz0 iz0Var = this.f37688c.f40653d1;
        if (iz0Var != null) {
            iz0Var.f();
        }
    }

    @Override
    public final void l1() {
        int i10;
        qn qnVar = this.f37688c;
        Activity parentActivity = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        long j10 = qnVar.T5;
        MessageSuggestionParams messageSuggestionParams = qnVar.f40693g5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new ai.h1(parentActivity, i10, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new xe(qnVar, 4)).show();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.iz0 iz0Var = this.f37688c.f40653d1;
        if (iz0Var != null) {
            iz0Var.f();
        }
    }

    @Override
    public final void m1() {
        this.f37688c.K6();
    }

    @Override
    public final void m2() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f37688c;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (!kVar.f21497n0) {
            org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40701h0;
            if (u0Var != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = qnVar.f40712i0;
            if (xVar != null && !this.f37687b) {
                xVar.f(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = qnVar.f40664e0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            ur urVar = qnVar.f40652d0;
            if (urVar != null) {
                urVar.b(false);
            }
        }
    }

    @Override
    public final void n1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        qn qnVar = this.f37688c;
        qnVar.Z6();
        fk fkVar = qnVar.Y;
        boolean z12 = fkVar.f24055z3;
        org.telegram.ui.Components.dg dgVar = fkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = qnVar.yc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = qnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29524w;
            if (qcVar != null && qcVar.f29533l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        xj xjVar = qnVar.I1;
        float f10 = 0.0f;
        if (xjVar != null) {
            ViewPropertyAnimator animate = xjVar.animate();
            if (!z12 && !qnVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f25021f).start();
        }
        org.telegram.ui.Components.iz0 iz0Var = qnVar.f40653d1;
        if (iz0Var != null) {
            iz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = qnVar.f40653d1.animate();
            if (!z12 && !qnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.bs.f25021f).withEndAction(new ah.t(24, this, z12)).start();
        }
    }

    @Override
    public final boolean o() {
        return this.f37688c.N6();
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
        qn qnVar = this.f37688c;
        qnVar.Xb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40701h0;
        if (u0Var != null && u0Var.getVisibility() != 0) {
            qnVar.f40701h0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = qnVar.f40664e0;
            if (xVar != null) {
                xVar.f(8);
            }
            ur urVar = qnVar.f40652d0;
            if (urVar != null) {
                urVar.b(false);
            }
        }
    }

    @Override
    public final gn p0() {
        return this.f37688c.f40753l5;
    }

    @Override
    public final void q1(CharSequence charSequence) {
        this.f37688c.cb(charSequence, true);
    }

    @Override
    public final void q2() {
        qn qnVar = this.f37688c;
        ci.b3 b3Var = qnVar.J1;
        if (b3Var != null) {
            b3Var.L1(null, 0);
        }
        qnVar.ca();
    }

    @Override
    public final boolean r1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f37688c.f40682f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f37688c;
        kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
        if (!kVar.f21497n0) {
            org.telegram.ui.ActionBar.x xVar = qnVar.f40712i0;
            if (xVar != null && !this.f37687b) {
                xVar.f(8);
            }
            if (TextUtils.isEmpty(qnVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40701h0;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.x xVar2 = qnVar.f40664e0;
                if (xVar2 != null) {
                    xVar2.f(0);
                }
                ur urVar = qnVar.f40652d0;
                if (urVar != null) {
                    urVar.b(true);
                }
            }
        }
    }

    @Override
    public final int u() {
        return this.f37688c.X0.R();
    }

    @Override
    public final void u1() {
        int i10;
        qn qnVar = this.f37688c;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(qnVar.T5, (int) qnVar.d());
        qnVar.f7(true);
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void y() {
        boolean z10;
        qn qnVar = this.f37688c;
        if (qnVar.f40915y0 != null) {
            qnVar.f40625b0 = qnVar.Y.getBackgroundTop();
        }
        xj xjVar = qnVar.I1;
        if (xjVar != null) {
            xjVar.getAdapter().f11926f0 = true;
        }
        if (qnVar.p5 != null) {
            AndroidUtilities.runOnUIThread(new ti(this, 7), 30L);
        }
        if (qnVar.Y.r0()) {
            qnVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.Y.S0(true, true, z10);
        if (qnVar.f40792o5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.f40792o5, true);
            qnVar.f40792o5 = 0;
        }
        qnVar.Dc(0, true);
        qnVar.mc(false);
        qnVar.bd(false);
    }

    @Override
    public final void y1() {
        int i10;
        int i11;
        qn qnVar = this.f37688c;
        if (!qnVar.E9() && (i10 = qnVar.R3) != 6 && i10 != 8) {
            MessagesController messagesController = qnVar.getMessagesController();
            long j10 = qnVar.T5;
            long j11 = qnVar.f40656d4;
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final void z(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        qn qnVar = this.f37688c;
        if (i10 != 0) {
            qnVar.D4 = true;
        }
        qnVar.t9();
        qnVar.w9();
        qnVar.Rc(false, false);
        qnVar.X0.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29524w;
        if (qcVar != null && qnVar.Zb != null) {
            qcVar.l();
        }
    }
}
