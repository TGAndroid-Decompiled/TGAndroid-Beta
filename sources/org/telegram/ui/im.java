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
public final class im implements org.telegram.ui.Components.hg {
    public int f39291a;
    public boolean f39292b;
    public final tn f39293c;

    public im(tn tnVar) {
        this.f39293c = tnVar;
    }

    @Override
    public final void B() {
        this.f39293c.Vb(true, false);
    }

    @Override
    public final boolean C0() {
        int i10;
        tn tnVar = this.f39293c;
        if ((!tnVar.getMessagesController().isForum(tnVar.a()) || tnVar.f42779d4) && (i10 = tnVar.N3) != 9 && tnVar.O3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        org.telegram.ui.Components.vw vwVar;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        tn tnVar = this.f39293c;
        ArrayList arrayList = tnVar.q6;
        if (tnVar.f42986u0 != null) {
            tnVar.X = tnVar.U.getBackgroundTop();
        }
        wj wjVar = tnVar.E1;
        if (wjVar != null && wjVar.getAdapter() != null) {
            tnVar.E1.getAdapter().f47389w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (tnVar.O3 == -1) {
                tnVar.O3 = 0;
            }
            if (charSequence != null) {
                tnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = tnVar.f42755b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                tnVar.O3 += tnVar.f42755b5.forwardMessages.messages.size();
            }
            tnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = tnVar.f42755b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && tnVar.f42755b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            tnVar.f42755b5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = tnVar.getMessagesController().getPeer(tnVar.P5);
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
                org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(tnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Components.jc) M.f30648e).f29637a;
                aj0Var.setScaleX(1.8f);
                aj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(tnVar.f42787e) && !tnVar.f42779d4 && (messageObject = tnVar.f42856j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, tnVar.f42856j5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f22444id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                tnVar.getMediaDataController().cleanDraft(tnVar.P5, j11, false);
            }
        }
        tnVar.zb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        dk dkVar = tnVar.U;
        if (dkVar != null && dkVar.getEmojiView() != null && (vwVar = tnVar.U.getEmojiView().P0) != null) {
            if (vwVar.f34191e) {
                MessagesController.getInstance(vwVar.f34188a).sendTyping(vwVar.f34189b, vwVar.f34190c, 2, 0);
            }
            vwVar.f34192f = -1L;
        }
        if (!tnVar.getMessagesController().premiumFeaturesBlocked() && tnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !tnVar.getMessagesController().didPressTranscribeButtonEnough() && !tnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.t21.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f39293c;
        if (tnVar.f42788e0 != null) {
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            final org.telegram.ui.ActionBar.a0 n10 = lVar.n();
            org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
            if (fy0Var != null) {
                fy0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.z zVar = tnVar.f42788e0;
                if (zVar.f24006o == null) {
                    zVar.f24006o = 1;
                    if (tnVar.f42788e0.f24003l != 0) {
                        if ((tnVar.N3 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId()) || (tnVar.N3 == 0 && ((tnVar.Z3 == 0 || tnVar.f42779d4) && !UserObject.isReplyUser(tnVar.f42801f) && !tnVar.A9()))) {
                            tnVar.f42788e0.f(0);
                            tn.J3(tnVar);
                            org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar2 = tnVar.f42737a0;
                            if (zVar2 != null) {
                                zVar2.f(8);
                            }
                            vr vrVar = tnVar.Z;
                            if (vrVar != null) {
                                vrVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                            ofFloat.addListener(new hm(this, n10, 0));
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
                tnVar.f43017w4 = i10;
                tnVar.x4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.z zVar3 = tnVar.f42788e0;
            if (zVar3.f24006o != null) {
                zVar3.f24006o = null;
                if (zVar3.f24003l != 8) {
                    if ((tnVar.N3 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId()) || (tnVar.N3 == 0 && ((tnVar.Z3 == 0 || tnVar.f42779d4) && !UserObject.isReplyUser(tnVar.f42801f) && !tnVar.A9()))) {
                        tnVar.f42788e0.f(8);
                        if (tnVar.U.k0() && TextUtils.isEmpty(tnVar.U.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = tnVar.f42775d0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.z zVar4 = tnVar.f42737a0;
                            if (zVar4 != null) {
                                zVar4.f(0);
                            }
                            vr vrVar2 = tnVar.Z;
                            if (vrVar2 != null) {
                                vrVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = tnVar.f42775d0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.z zVar5 = tnVar.f42737a0;
                        if (zVar5 != null) {
                            zVar5.f(8);
                        }
                        vr vrVar3 = tnVar.Z;
                        if (vrVar3 != null) {
                            vrVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    ofFloat2.addListener(new hm(this, n10, 1));
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
    public final TLRPC.TL_channels_sendAsPeers G() {
        return this.f39293c.da;
    }

    @Override
    public final void G0() {
        tn tnVar = this.f39293c;
        tnVar.k9 = true;
        em emVar = tnVar.f43013w0;
        if (emVar != null) {
            emVar.K(true);
        }
    }

    @Override
    public final void G1() {
        int i10;
        int i11;
        tn tnVar = this.f39293c;
        if (!tnVar.z9() && (i10 = tnVar.N3) != 6 && i10 != 8) {
            MessagesController messagesController = tnVar.getMessagesController();
            long j10 = tnVar.P5;
            long j11 = tnVar.Z3;
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final void I(float f9, int i10) {
        xk xkVar = this.f39293c.X2;
        if (xkVar != null) {
            xkVar.e(f9, i10);
        }
    }

    @Override
    public final void K0() {
        this.f39293c.ja(0, false);
    }

    @Override
    public final void M() {
        boolean z10;
        tn tnVar = this.f39293c;
        dk dkVar = tnVar.U;
        boolean z11 = dkVar.f26201u3;
        org.telegram.ui.Components.xf xfVar = dkVar.Q0;
        boolean z12 = false;
        if (xfVar != null && xfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vd.a aVar = tnVar.f42985tc;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void T0() {
        tn tnVar = this.f39293c;
        int sendingMessageId = tnVar.getSendMessagesHelper().getSendingMessageId(tnVar.P5);
        if (sendingMessageId != 0) {
            this.f39293c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void U(boolean z10) {
        this.f39293c.Vb(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        tn tnVar = this.f39293c;
        if (tnVar.Y2.getVisibility() != i11) {
            tnVar.Y2.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f39293c.T0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.fy0 fy0Var = this.f39293c.Z0;
        if (fy0Var != null) {
            fy0Var.e();
        }
    }

    @Override
    public final void e() {
        this.f39293c.vc();
    }

    @Override
    public final boolean f1(long j10) {
        return false;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        tn tnVar = this.f39293c;
        if (i10 < currentActionBarHeight) {
            tnVar.V4 = false;
            if (tnVar.Z0.getVisibility() == 0) {
                tnVar.Z0.setVisibility(4);
            }
        } else {
            tnVar.V4 = true;
            if (tnVar.Z0.getVisibility() == 4 && !tnVar.isInPreviewMode()) {
                tnVar.Z0.setVisibility(0);
            }
        }
        tnVar.W4 = true ^ tnVar.U.t0();
        if (tnVar.U.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f39291a != i12) {
            tnVar.X = 0;
        }
        this.f39291a = i12;
    }

    @Override
    public final void i() {
        org.telegram.ui.Components.fy0 fy0Var = this.f39293c.Z0;
        if (fy0Var != null) {
            fy0Var.f();
        }
    }

    @Override
    public final boolean i1() {
        xk xkVar = this.f39293c.X2;
        if (xkVar != null && !xkVar.f32494a0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        km kmVar;
        int indexOfChild;
        int i10;
        tn tnVar = this.f39293c;
        if (tnVar.getParentActivity() != null) {
            if ((tnVar.f42787e != null || tnVar.W7 != null) && tnVar.fragmentView != null) {
                org.telegram.ui.Components.g40 g40Var = tnVar.f42752b2;
                if ((g40Var == null || g40Var.getVisibility() != 0) && (indexOfChild = (kmVar = tnVar.T0).indexOfChild(tnVar.O)) != -1) {
                    try {
                        tnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (tnVar.f42752b2 == null) {
                        org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(9, tnVar.getParentActivity(), tnVar.f42746aa, false);
                        tnVar.f42752b2 = g40Var2;
                        g40Var2.setVisibility(8);
                        kmVar.addView(tnVar.f42752b2, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = tnVar.W7;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.g40 g40Var3 = tnVar.f42752b2;
                        if (tnVar.U.Y0) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        g40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, tnVar.f42801f.first_name)));
                    } else if (!ChatObject.canSendVoice(tnVar.f42787e) && !ChatObject.canSendRoundVideo(tnVar.f42787e)) {
                        if (!tnVar.K6()) {
                            if (tnVar.U.Y0) {
                                tnVar.f42752b2.setText(ChatObject.getRestrictedErrorText(tnVar.f42787e, 21));
                            } else {
                                tnVar.f42752b2.setText(ChatObject.getRestrictedErrorText(tnVar.f42787e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(tnVar.f42787e, 20)) {
                        tnVar.f42752b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(tnVar.f42787e, 21)) {
                        tnVar.f42752b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(tnVar.f42787e, 7)) {
                        tnVar.f42752b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = tnVar.f42787e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                tnVar.f42752b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                tnVar.f42752b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(tnVar.f42787e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = tnVar.U.getSendButton();
                    View audioVideoButtonContainer = tnVar.U.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    tnVar.f42752b2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void k0() {
        org.telegram.ui.Components.fy0 fy0Var = this.f39293c.Z0;
        if (fy0Var != null) {
            fy0Var.f();
        }
    }

    @Override
    public final void k2(boolean z10) {
        tn tnVar = this.f39293c;
        View view = tnVar.f42962s2;
        if (view != null) {
            view.setVisibility(8);
        }
        tnVar.X4 = !z10;
    }

    @Override
    public final boolean l() {
        return this.f39293c.K6();
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.g40 g40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        tn tnVar = this.f39293c;
        if (isEmpty && !tnVar.U.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        wj wjVar = tnVar.E1;
        if (wjVar != null && wjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            tnVar.E1.getAdapter().U(charSequence2, tnVar.U.getCursorPosition(), tnVar.q6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        od.i iVar = tnVar.F5;
        if (iVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            tnVar.F5 = null;
        }
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            dk dkVar = tnVar.U;
            if (dkVar.T2 && (!dkVar.r0() || !tnVar.U.V1)) {
                if (z10) {
                    tnVar.Ya(charSequence2, true);
                } else {
                    tnVar.M6(charSequence2);
                    od.i iVar2 = new od.i(1, this, charSequence2);
                    tnVar.F5 = iVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(iVar2, j10);
                }
            }
        }
        ok okVar = tnVar.f42983ta;
        if (okVar != null) {
            ArrayList arrayList = okVar.B;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((qy) arrayList.get(i10)).f41808n = true;
            }
        }
        kg.m0 m0Var = kg.m0.B;
        if (m0Var != null) {
            m0Var.f13773l = true;
        }
        kg.m0 m0Var2 = kg.m0.C;
        if (m0Var2 != null) {
            m0Var2.f13773l = true;
        }
        if (!z11) {
            zi ziVar = tnVar.f42766c2;
            if ((ziVar != null && ziVar.getVisibility() == 0) || ((g40Var = tnVar.f42790e2) != null && g40Var.getVisibility() == 0)) {
                zi ziVar2 = tnVar.f42766c2;
                if (ziVar2 != null) {
                    ziVar2.b(true);
                }
                org.telegram.ui.Components.g40 g40Var2 = tnVar.f42790e2;
                if (g40Var2 != null) {
                    g40Var2.b(true);
                    return;
                }
                return;
            }
            df dfVar = tnVar.Ja;
            if (UserObject.isUserSelf(tnVar.f42801f) || ((chatFull = tnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && tnVar.N3 == 0)) {
                z13 = true;
            }
            if (!tnVar.f42804f2 && !tnVar.f42777d2 && !z13 && SharedConfig.scheduledHintShows < 3 && !tnVar.U.r0()) {
                AndroidUtilities.cancelRunOnUIThread(dfVar);
                AndroidUtilities.runOnUIThread(dfVar, 4000L);
            }
        }
    }

    @Override
    public final void l2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        tn tnVar = this.f39293c;
        boolean z11 = true;
        if (tnVar.X2 == null && CameraView.isCameraAllowed() && tnVar.getParentActivity() != null) {
            xk xkVar = new xk(tnVar, tnVar.getParentActivity(), tnVar, tnVar.f42746aa);
            tnVar.X2 = xkVar;
            xkVar.setClipToPadding(false);
            xk xkVar2 = tnVar.X2;
            lg.a aVar = tnVar.F;
            aj ajVar = tnVar.f43012w;
            View view = xkVar2.N0;
            ng.d c3 = aVar.c(view, ajVar, false);
            c3.o(AndroidUtilities.dp(6.0f));
            c3.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c3);
            int indexOfChild = tnVar.T0.indexOfChild(tnVar.O);
            if (indexOfChild < 0) {
                indexOfChild = tnVar.T0.getChildCount();
            }
            tnVar.T0.addView(tnVar.X2, Math.min(indexOfChild + 1, tnVar.T0.getChildCount()), i7.f6.e(-1, -1, 51));
        }
        xk xkVar3 = tnVar.X2;
        if (xkVar3 != null) {
            if (i10 == 0) {
                xkVar3.l(false);
                tnVar.f42973t0.B0();
                tnVar.f43013w0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 != 2) {
                        z11 = false;
                    }
                    xkVar3.d(z11);
                }
            } else {
                xkVar3.k(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final int m() {
        return this.f39293c.T0.R();
    }

    @Override
    public final void n1() {
        xk xkVar = this.f39293c.X2;
        if (xkVar != null) {
            xkVar.q();
        }
    }

    @Override
    public final jn o0() {
        return this.f39293c.f42831h5;
    }

    @Override
    public final boolean o1() {
        tn tnVar = this.f39293c;
        TLRPC.User user = tnVar.f42801f;
        if (user != null && !UserObject.isUserSelf(user) && !tnVar.f42801f.bot && tnVar.h == null && tnVar.N3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        tn tnVar = this.f39293c;
        zi ziVar = tnVar.f42766c2;
        if (ziVar != null) {
            ziVar.b(true);
        }
        org.telegram.ui.Components.g40 g40Var = tnVar.f42790e2;
        if (g40Var != null) {
            g40Var.b(true);
        }
    }

    @Override
    public final TLRPC.Peer q() {
        return null;
    }

    @Override
    public final void q1() {
        int i10;
        tn tnVar = this.f39293c;
        Activity parentActivity = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        long j10 = tnVar.P5;
        MessageSuggestionParams messageSuggestionParams = tnVar.f42768c5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new jh.s0(parentActivity, i10, j10, messageSuggestionParams, tnVar, tnVar.getResourceProvider(), 0, new qe(tnVar, 3)).show();
    }

    @Override
    public final void r() {
        boolean z10;
        tn tnVar = this.f39293c;
        if (tnVar.f42986u0 != null) {
            tnVar.X = tnVar.U.getBackgroundTop();
        }
        wj wjVar = tnVar.E1;
        if (wjVar != null) {
            wjVar.getAdapter().f47363b0 = true;
        }
        if (tnVar.f42880l5 != null) {
            AndroidUtilities.runOnUIThread(new ui(this, 6), 30L);
        }
        if (tnVar.U.t0()) {
            tnVar.U.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        tnVar.U.V0(true, true, z10);
        if (tnVar.f42869k5 != 0) {
            tnVar.getConnectionsManager().cancelRequest(tnVar.f42869k5, true);
            tnVar.f42869k5 = 0;
        }
        tnVar.yc(0, true);
        tnVar.hc(false);
        tnVar.Wc(false);
    }

    @Override
    public final void r1() {
        this.f39293c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f39293c;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.f23612j0) {
            org.telegram.ui.ActionBar.z zVar = tnVar.f42788e0;
            if (zVar != null && !this.f39292b) {
                zVar.f(8);
            }
            if (TextUtils.isEmpty(tnVar.U.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.z zVar2 = tnVar.f42737a0;
                if (zVar2 != null) {
                    zVar2.f(0);
                }
                vr vrVar = tnVar.Z;
                if (vrVar != null) {
                    vrVar.b(true);
                }
            }
        }
    }

    @Override
    public final void s1() {
        boolean z10;
        boolean z11;
        int i10;
        float f9;
        int i11;
        tn tnVar = this.f39293c;
        tnVar.W6();
        dk dkVar = tnVar.U;
        boolean z12 = dkVar.f26201u3;
        org.telegram.ui.Components.xf xfVar = dkVar.Q0;
        if (xfVar != null && xfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vd.a aVar = tnVar.f42985tc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = tnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
            if (mcVar != null && mcVar.f30654l) {
                mcVar.b();
            }
        } else {
            Activity parentActivity2 = tnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        wj wjVar = tnVar.E1;
        float f10 = 0.0f;
        if (wjVar != null) {
            ViewPropertyAnimator animate = wjVar.animate();
            if (!z12 && !tnVar.isInPreviewMode()) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animate.alpha(f9).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
        }
        org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
        if (fy0Var != null) {
            fy0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = tnVar.Z0.animate();
            if (!z12 && !tnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.jr.f29800f).withEndAction(new hh.f(23, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        tn tnVar = this.f39293c;
        tnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            tnVar.f42775d0.setVisibility(0);
            org.telegram.ui.ActionBar.z zVar = tnVar.f42737a0;
            if (zVar != null) {
                zVar.f(8);
            }
            vr vrVar = tnVar.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
        }
    }

    @Override
    public final void v(float f9) {
        tn tnVar = this.f39293c;
        if (f9 != 0.0f) {
            tnVar.f43054z4 = true;
        }
        tnVar.o9();
        tnVar.r9();
        tnVar.Mc(false, false);
        tnVar.T0.invalidate();
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
        if (mcVar != null && tnVar.Vb != null) {
            mcVar.l();
        }
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f39293c.Ya(charSequence, true);
    }

    @Override
    public final void v2() {
        org.telegram.ui.ActionBar.l lVar;
        tn tnVar = this.f39293c;
        lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
        if (!lVar.f23612j0) {
            org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.z zVar = tnVar.f42788e0;
            if (zVar != null && !this.f39292b) {
                zVar.f(8);
            }
            org.telegram.ui.ActionBar.z zVar2 = tnVar.f42737a0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            vr vrVar = tnVar.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
        }
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f39293c.f42755b5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void x(boolean z10) {
        int i10;
        int i11;
        tn tnVar = this.f39293c;
        if (z10) {
            Activity parentActivity = tnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            tnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void z1() {
        int i10;
        tn tnVar = this.f39293c;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(tnVar.P5, (int) tnVar.b());
        tnVar.c7(true);
    }

    @Override
    public final void z2() {
        tn tnVar = this.f39293c;
        lh.s2 s2Var = tnVar.F1;
        if (s2Var != null) {
            s2Var.I1(null, 0);
        }
        tnVar.X9();
    }
}
