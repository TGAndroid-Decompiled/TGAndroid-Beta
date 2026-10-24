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
public final class im implements org.telegram.ui.Components.og {
    public int f38266a;
    public boolean f38267b;
    public final sn f38268c;

    public im(sn snVar) {
        this.f38268c = snVar;
    }

    @Override
    public final boolean B0() {
        int i10;
        sn snVar = this.f38268c;
        if ((!snVar.getMessagesController().isForum(snVar.a()) || snVar.f41689t4) && (i10 = snVar.f41492d4) != 9 && snVar.f41504e4 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId()) {
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
        sn snVar = this.f38268c;
        if (z10) {
            Activity parentActivity = snVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            snVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void D0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f38268c;
        if (snVar.f41548i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
            final org.telegram.ui.ActionBar.y m10 = kVar.m();
            org.telegram.ui.Components.lz0 lz0Var = snVar.f41635p1;
            if (lz0Var != null) {
                lz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.x xVar = snVar.f41548i0;
                if (xVar.f21951o == null) {
                    xVar.f21951o = 1;
                    if (snVar.f41548i0.f21948l != 0) {
                        if ((snVar.f41492d4 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId()) || (snVar.f41492d4 == 0 && ((snVar.f41638p4 == 0 || snVar.f41689t4) && !UserObject.isReplyUser(snVar.f41512f) && !snVar.F9()))) {
                            snVar.f41548i0.f(0);
                            sn.R3(snVar);
                            org.telegram.ui.ActionBar.u0 u0Var = snVar.f41537h0;
                            if (u0Var != null) {
                                u0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar2 = snVar.f41500e0;
                            if (xVar2 != null) {
                                xVar2.f(8);
                            }
                            wr wrVar = snVar.f41488d0;
                            if (wrVar != null) {
                                wrVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                            ofFloat.addListener(new hm(this, m10, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            m10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            m10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                    }
                                }
                            });
                            ofFloat.start();
                        }
                    }
                }
                snVar.M4 = i10;
                snVar.N4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.x xVar3 = snVar.f41548i0;
            if (xVar3.f21951o != null) {
                xVar3.f21951o = null;
                if (xVar3.f21948l != 8) {
                    if ((snVar.f41492d4 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId()) || (snVar.f41492d4 == 0 && ((snVar.f41638p4 == 0 || snVar.f41689t4) && !UserObject.isReplyUser(snVar.f41512f) && !snVar.F9()))) {
                        snVar.f41548i0.f(8);
                        if (snVar.Y.h0() && TextUtils.isEmpty(snVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.u0 u0Var2 = snVar.f41537h0;
                            if (u0Var2 != null) {
                                u0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.x xVar4 = snVar.f41500e0;
                            if (xVar4 != null) {
                                xVar4.f(0);
                            }
                            wr wrVar2 = snVar.f41488d0;
                            if (wrVar2 != null) {
                                wrVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.u0 u0Var3 = snVar.f41537h0;
                        if (u0Var3 != null) {
                            u0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.x xVar5 = snVar.f41500e0;
                        if (xVar5 != null) {
                            xVar5.f(8);
                        }
                        wr wrVar3 = snVar.f41488d0;
                        if (wrVar3 != null) {
                            wrVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.bs.f25133f);
                    ofFloat2.addListener(new hm(this, m10, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    m10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    m10.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
        sn snVar = this.f38268c;
        snVar.A9 = true;
        em emVar = snVar.A0;
        if (emVar != null) {
            emVar.K(true);
        }
    }

    @Override
    public final void H() {
        this.f38268c.bc(true, false);
    }

    @Override
    public final void H0() {
        this.f38268c.oa(0, false);
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
        sn snVar = this.f38268c;
        ArrayList arrayList = snVar.G6;
        if (snVar.f41751y0 != null) {
            snVar.f41461b0 = snVar.Y.getBackgroundTop();
        }
        yj yjVar = snVar.U1;
        if (yjVar != null && yjVar.getAdapter() != null) {
            snVar.U1.getAdapter().f11973w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (snVar.f41504e4 == -1) {
                snVar.f41504e4 = 0;
            }
            if (charSequence != null) {
                snVar.f41504e4++;
            }
            MessagePreviewParams messagePreviewParams2 = snVar.f41663r5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                snVar.f41504e4 += snVar.f41663r5.forwardMessages.messages.size();
            }
            snVar.Lc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = snVar.f41663r5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && snVar.f41663r5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            snVar.f41663r5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = snVar.getMessagesController().getPeer(snVar.f41519f6);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Components.nc) M.e).f28932a;
                bk0Var.setScaleX(1.8f);
                bk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(snVar.e) && !snVar.f41689t4 && (messageObject = snVar.f41767z5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, snVar.f41767z5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f20395id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                snVar.getMediaDataController().cleanDraft(snVar.f41519f6, j11, false);
            }
        }
        snVar.Fb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        gk gkVar = snVar.Y;
        if (gkVar != null && gkVar.getEmojiView() != null && (f1Var = snVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.f11886a).sendTyping(f1Var.f11887b, f1Var.f11888c, 2, 0);
            }
            f1Var.f11889f = -1L;
        }
        if (!snVar.getMessagesController().premiumFeaturesBlocked() && snVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !snVar.getMessagesController().didPressTranscribeButtonEnough() && !snVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.e41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.f38268c.f41695ta;
    }

    @Override
    public final void Q0() {
        sn snVar = this.f38268c;
        int sendingMessageId = snVar.getSendMessagesHelper().getSendingMessageId(snVar.f41519f6);
        if (sendingMessageId != 0) {
            this.f38268c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.lz0 lz0Var = this.f38268c.f41635p1;
        if (lz0Var != null) {
            lz0Var.e();
        }
    }

    @Override
    public final void U(float f7, int i10) {
        org.telegram.ui.Components.s60 s60Var = this.f38268c.f41613n3;
        if (s60Var != null) {
            s60Var.b(f7, i10);
        }
    }

    @Override
    public final void V1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        sn snVar = this.f38268c;
        if (i10 < currentActionBarHeight) {
            snVar.f41589l5 = false;
            if (snVar.f41635p1.getVisibility() == 0) {
                snVar.f41635p1.setVisibility(4);
            }
        } else {
            snVar.f41589l5 = true;
            if (snVar.f41635p1.getVisibility() == 4 && !snVar.isInPreviewMode()) {
                snVar.f41635p1.setVisibility(0);
            }
        }
        snVar.f41601m5 = true ^ snVar.Y.q0();
        if (snVar.Y.q0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f38266a != i12) {
            snVar.f41461b0 = 0;
        }
        this.f38266a = i12;
    }

    @Override
    public final void X0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        sn snVar = this.f38268c;
        if (snVar.f41626o3.getVisibility() != i11) {
            snVar.f41626o3.setVisibility(i11);
        }
    }

    @Override
    public final void Y() {
        boolean z10;
        sn snVar = this.f38268c;
        gk gkVar = snVar.Y;
        boolean z11 = gkVar.f24200z3;
        org.telegram.ui.Components.dg dgVar = gkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = snVar.Lc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final int Y0() {
        return this.f38268c.f41561j1.getHeight();
    }

    @Override
    public final void Y1() {
        km kmVar;
        int indexOfChild;
        int i10;
        sn snVar = this.f38268c;
        if (snVar.getParentActivity() != null) {
            if ((snVar.e != null || snVar.f41604m8 != null) && snVar.fragmentView != null) {
                org.telegram.ui.Components.r40 r40Var = snVar.f41660r2;
                if ((r40Var == null || r40Var.getVisibility() != 0) && (indexOfChild = (kmVar = snVar.f41561j1).indexOfChild(snVar.S)) != -1) {
                    try {
                        snVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (snVar.f41660r2 == null) {
                        org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(9, snVar.getParentActivity(), snVar.f41654qa, false);
                        snVar.f41660r2 = r40Var2;
                        r40Var2.setVisibility(8);
                        kmVar.addView(snVar.f41660r2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = snVar.f41604m8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.r40 r40Var3 = snVar.f41660r2;
                        if (snVar.Y.f24066c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        r40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, snVar.f41512f.first_name)));
                    } else if (!ChatObject.canSendVoice(snVar.e) && !ChatObject.canSendRoundVideo(snVar.e)) {
                        if (!snVar.N6()) {
                            if (snVar.Y.f24066c1) {
                                snVar.f41660r2.setText(ChatObject.getRestrictedErrorText(snVar.e, 21));
                            } else {
                                snVar.f41660r2.setText(ChatObject.getRestrictedErrorText(snVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(snVar.e, 20)) {
                        snVar.f41660r2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(snVar.e, 21)) {
                        snVar.f41660r2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(snVar.e, 7)) {
                        snVar.f41660r2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = snVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                snVar.f41660r2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                snVar.f41660r2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(snVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = snVar.Y.getSendButton();
                    View audioVideoButtonContainer = snVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    snVar.f41660r2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Z1(boolean z10) {
        sn snVar = this.f38268c;
        View view = snVar.I2;
        if (view != null) {
            view.setVisibility(8);
        }
        snVar.f41615n5 = !z10;
    }

    @Override
    public final void a0(boolean z10) {
        this.f38268c.bc(false, z10);
    }

    @Override
    public final TL_stories.StoryItem a1() {
        return null;
    }

    @Override
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.s60 n60Var;
        sn snVar = this.f38268c;
        boolean z12 = false;
        if (snVar.f41613n3 == null && CameraView.isCameraAllowed() && snVar.getParentActivity() != null) {
            Activity parentActivity = snVar.getParentActivity();
            qn qnVar = snVar.f41654qa;
            int i13 = org.telegram.ui.Components.s60.e;
            ti.a aVar = ti.e.d;
            aVar.a();
            if (aVar.f47651c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                n60Var = new org.telegram.ui.Components.m60(parentActivity, snVar, qnVar);
            } else {
                n60Var = new org.telegram.ui.Components.n60(parentActivity, snVar, qnVar, true);
            }
            snVar.f41613n3 = n60Var;
            n60Var.setAnimationCallback(new pe(snVar, 0));
            snVar.f41613n3.setTrimCallback(new pe(snVar, 1));
            snVar.f41613n3.setRecordingUiFrameCallback(new jj(snVar));
            snVar.f41613n3.setClipToPadding(false);
            snVar.f41613n3.g(snVar.J, snVar.f41723w);
            int indexOfChild = snVar.f41561j1.indexOfChild(snVar.S);
            if (indexOfChild < 0) {
                indexOfChild = snVar.f41561j1.getChildCount();
            }
            snVar.f41561j1.addView(snVar.f41613n3, Math.min(indexOfChild + 1, snVar.f41561j1.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.s60 s60Var = this.f38268c.f41613n3;
        if (s60Var != null) {
            if (i10 == 0) {
                s60Var.h(false);
                this.f38268c.f41737x0.B0();
                this.f38268c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    s60Var.a(z12);
                }
            } else {
                s60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean b1(long j10) {
        return false;
    }

    @Override
    public final boolean e1() {
        org.telegram.ui.Components.s60 s60Var = this.f38268c.f41613n3;
        if (s60Var != null && s60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void e2() {
        sn snVar = this.f38268c;
        aj ajVar = snVar.f41674s2;
        if (ajVar != null) {
            ajVar.b(true);
        }
        org.telegram.ui.Components.r40 r40Var = snVar.f41700u2;
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
        sn snVar = this.f38268c;
        if (isEmpty && !snVar.Y.o0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        yj yjVar = snVar.U1;
        if (yjVar != null && yjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            snVar.U1.getAdapter().U(charSequence2, snVar.Y.getCursorPosition(), snVar.G6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        j9.u uVar = snVar.V5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            snVar.V5 = null;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            gk gkVar = snVar.Y;
            if (gkVar.Y2 && (!gkVar.o0() || !snVar.Y.a2)) {
                if (z10) {
                    snVar.cb(charSequence2, true);
                } else {
                    snVar.P6(charSequence2);
                    j9.u uVar2 = new j9.u(this, charSequence2, false, 22);
                    snVar.V5 = uVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(uVar2, j10);
                }
            }
        }
        qk qkVar = snVar.Ja;
        if (qkVar != null) {
            ArrayList arrayList = qkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((py) arrayList.get(i10)).f40568n = true;
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
            aj ajVar = snVar.f41674s2;
            if ((ajVar != null && ajVar.getVisibility() == 0) || ((r40Var = snVar.f41700u2) != null && r40Var.getVisibility() == 0)) {
                aj ajVar2 = snVar.f41674s2;
                if (ajVar2 != null) {
                    ajVar2.b(true);
                }
                org.telegram.ui.Components.r40 r40Var2 = snVar.f41700u2;
                if (r40Var2 != null) {
                    r40Var2.b(true);
                    return;
                }
                return;
            }
            kf kfVar = snVar.f41458ab;
            if (UserObject.isUserSelf(snVar.f41512f) || ((chatFull = snVar.f41592l8) != null && chatFull.slowmode_next_send_date > 0 && snVar.f41492d4 == 0)) {
                z13 = true;
            }
            if (!snVar.f41712v2 && !snVar.f41687t2 && !z13 && SharedConfig.scheduledHintShows < 3 && !snVar.Y.o0()) {
                AndroidUtilities.cancelRunOnUIThread(kfVar);
                AndroidUtilities.runOnUIThread(kfVar, 4000L);
            }
        }
    }

    @Override
    public final void h() {
        this.f38268c.Cc();
    }

    @Override
    public final void i1() {
        org.telegram.ui.Components.s60 s60Var = this.f38268c.f41613n3;
        if (s60Var != null) {
            s60Var.i();
        }
    }

    @Override
    public final boolean j1() {
        sn snVar = this.f38268c;
        TLRPC.User user = snVar.f41512f;
        if (user != null && !UserObject.isUserSelf(user) && !snVar.f41512f.bot && snVar.h == null && snVar.f41492d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void k() {
        org.telegram.ui.Components.lz0 lz0Var = this.f38268c.f41635p1;
        if (lz0Var != null) {
            lz0Var.f();
        }
    }

    @Override
    public final void l1() {
        int i10;
        sn snVar = this.f38268c;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        long j10 = snVar.f41519f6;
        MessageSuggestionParams messageSuggestionParams = snVar.f41677s5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new ai.h1(parentActivity, i10, j10, messageSuggestionParams, snVar, snVar.getResourceProvider(), 0, new xe(snVar, 4)).show();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.lz0 lz0Var = this.f38268c.f41635p1;
        if (lz0Var != null) {
            lz0Var.f();
        }
    }

    @Override
    public final void m1() {
        this.f38268c.K6();
    }

    @Override
    public final void m2() {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f38268c;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (!kVar.f21068n0) {
            org.telegram.ui.ActionBar.u0 u0Var = snVar.f41537h0;
            if (u0Var != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = snVar.f41548i0;
            if (xVar != null && !this.f38267b) {
                xVar.f(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = snVar.f41500e0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            wr wrVar = snVar.f41488d0;
            if (wrVar != null) {
                wrVar.b(false);
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
        sn snVar = this.f38268c;
        snVar.Z6();
        gk gkVar = snVar.Y;
        boolean z12 = gkVar.f24200z3;
        org.telegram.ui.Components.dg dgVar = gkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne.b bVar = snVar.Lc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = snVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
            if (qcVar != null && qcVar.f29834l) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = snVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        yj yjVar = snVar.U1;
        float f10 = 0.0f;
        if (yjVar != null) {
            ViewPropertyAnimator animate = yjVar.animate();
            if (!z12 && !snVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.bs.f25133f).start();
        }
        org.telegram.ui.Components.lz0 lz0Var = snVar.f41635p1;
        if (lz0Var != null) {
            lz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = snVar.f41635p1.animate();
            if (!z12 && !snVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.bs.f25133f).withEndAction(new ah.t(24, this, z12)).start();
        }
    }

    @Override
    public final boolean o() {
        return this.f38268c.N6();
    }

    @Override
    public final void o1(View view, CharSequence charSequence, boolean z10) {
        sn snVar = this.f38268c;
        snVar.Yb(view, charSequence, z10);
        org.telegram.ui.ActionBar.u0 u0Var = snVar.f41537h0;
        if (u0Var != null && u0Var.getVisibility() != 0) {
            snVar.f41537h0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = snVar.f41500e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = snVar.f41488d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
        }
    }

    @Override
    public final in p0() {
        return this.f38268c.f41742x5;
    }

    @Override
    public final void q1(CharSequence charSequence) {
        this.f38268c.cb(charSequence, true);
    }

    @Override
    public final void q2() {
        sn snVar = this.f38268c;
        ci.a3 a3Var = snVar.V1;
        if (a3Var != null) {
            a3Var.P1(null, 0);
        }
        snVar.ca();
    }

    @Override
    public final boolean r1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f38268c.f41663r5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        sn snVar = this.f38268c;
        kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
        if (!kVar.f21068n0) {
            org.telegram.ui.ActionBar.x xVar = snVar.f41548i0;
            if (xVar != null && !this.f38267b) {
                xVar.f(8);
            }
            if (TextUtils.isEmpty(snVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41537h0;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.x xVar2 = snVar.f41500e0;
                if (xVar2 != null) {
                    xVar2.f(0);
                }
                wr wrVar = snVar.f41488d0;
                if (wrVar != null) {
                    wrVar.b(true);
                }
            }
        }
    }

    @Override
    public final int u() {
        return this.f38268c.f41561j1.Q();
    }

    @Override
    public final void u1() {
        int i10;
        sn snVar = this.f38268c;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(snVar.f41519f6, (int) snVar.d());
        snVar.f7(true);
    }

    @Override
    public final TLRPC.Peer x() {
        return null;
    }

    @Override
    public final void y() {
        boolean z10;
        sn snVar = this.f38268c;
        if (snVar.f41751y0 != null) {
            snVar.f41461b0 = snVar.Y.getBackgroundTop();
        }
        yj yjVar = snVar.U1;
        if (yjVar != null) {
            yjVar.getAdapter().f11954f0 = true;
        }
        if (snVar.B5 != null) {
            AndroidUtilities.runOnUIThread(new ti(this, 7), 30L);
        }
        if (snVar.Y.q0()) {
            snVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        snVar.Y.S0(true, true, z10);
        if (snVar.A5 != 0) {
            snVar.getConnectionsManager().cancelRequest(snVar.A5, true);
            snVar.A5 = 0;
        }
        snVar.Fc(0, true);
        snVar.oc(false);
        snVar.dd(false);
    }

    @Override
    public final void y1() {
        int i10;
        int i11;
        sn snVar = this.f38268c;
        if (!snVar.E9() && (i10 = snVar.f41492d4) != 6 && i10 != 8) {
            MessagesController messagesController = snVar.getMessagesController();
            long j10 = snVar.f41519f6;
            long j11 = snVar.f41638p4;
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final void z(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        sn snVar = this.f38268c;
        if (i10 != 0) {
            snVar.P4 = true;
        }
        snVar.t9();
        snVar.w9();
        snVar.Tc(false, false);
        snVar.f41561j1.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
        if (qcVar != null && snVar.f41608mc != null) {
            qcVar.l();
        }
    }
}
