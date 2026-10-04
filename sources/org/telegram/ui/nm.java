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
public final class nm implements org.telegram.ui.Components.pg {
    public int f39013a;
    public boolean f39014b;
    public final yn f39015c;

    public nm(yn ynVar) {
        this.f39015c = ynVar;
    }

    @Override
    public final void A2() {
        yn ynVar = this.f39015c;
        ai.g4 g4Var = ynVar.H1;
        if (g4Var != null) {
            g4Var.H1(null, 0);
        }
        ynVar.W9();
    }

    @Override
    public final void B(boolean z10) {
        int i10;
        int i11;
        yn ynVar = this.f39015c;
        if (z10) {
            Activity parentActivity = ynVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            ynVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final boolean C0() {
        int i10;
        yn ynVar = this.f39015c;
        if ((!ynVar.getMessagesController().isForum(ynVar.a()) || ynVar.f43339f4) && (i10 = ynVar.P3) != 9 && ynVar.Q3 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId()) {
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
        this.f39015c.Ub(true, false);
    }

    @Override
    public final void E0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.f39015c;
        if (ynVar.f43347g0 != null) {
            kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.iz0 iz0Var = ynVar.f43284b1;
            if (iz0Var != null) {
                iz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = ynVar.f43347g0;
                if (yVar.f21708o == null) {
                    yVar.f21708o = 1;
                    if (ynVar.f43347g0.f21705l != 0) {
                        if ((ynVar.P3 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId()) || (ynVar.P3 == 0 && ((ynVar.f43287b4 == 0 || ynVar.f43339f4) && !UserObject.isReplyUser(ynVar.f43334f) && !ynVar.z9()))) {
                            ynVar.f43347g0.f(0);
                            yn.J3(ynVar);
                            org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43335f0;
                            if (v0Var != null) {
                                v0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = ynVar.f43297c0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            fs fsVar = ynVar.f43283b0;
                            if (fsVar != null) {
                                fsVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.tr.f31147f);
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
                ynVar.f43575y4 = i10;
                ynVar.f43588z4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = ynVar.f43347g0;
            if (yVar3.f21708o != null) {
                yVar3.f21708o = null;
                if (yVar3.f21705l != 8) {
                    if ((ynVar.P3 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId()) || (ynVar.P3 == 0 && ((ynVar.f43287b4 == 0 || ynVar.f43339f4) && !UserObject.isReplyUser(ynVar.f43334f) && !ynVar.z9()))) {
                        ynVar.f43347g0.f(8);
                        if (ynVar.W.k0() && TextUtils.isEmpty(ynVar.W.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.f43335f0;
                            if (v0Var2 != null) {
                                v0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = ynVar.f43297c0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            fs fsVar2 = ynVar.f43283b0;
                            if (fsVar2 != null) {
                                fsVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.v0 v0Var3 = ynVar.f43335f0;
                        if (v0Var3 != null) {
                            v0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = ynVar.f43297c0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        fs fsVar3 = ynVar.f43283b0;
                        if (fsVar3 != null) {
                            fsVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.tr.f31147f);
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
        yn ynVar = this.f39015c;
        if (!ynVar.y9() && (i10 = ynVar.P3) != 6 && i10 != 8) {
            MessagesController messagesController = ynVar.getMessagesController();
            long j3 = ynVar.R5;
            long j10 = ynVar.f43287b4;
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            messagesController.sendTyping(j3, j10, 0, i11);
        }
    }

    @Override
    public final void G0() {
        yn ynVar = this.f39015c;
        ynVar.f43428m9 = true;
        jm jmVar = ynVar.f43572y0;
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
        yn ynVar = this.f39015c;
        ArrayList arrayList = ynVar.f43501s6;
        if (ynVar.f43546w0 != null) {
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
        ck ckVar = ynVar.G1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            ynVar.G1.getAdapter().f10695w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (ynVar.Q3 == -1) {
                ynVar.Q3 = 0;
            }
            if (charSequence != null) {
                ynVar.Q3++;
            }
            MessagePreviewParams messagePreviewParams2 = ynVar.f43314d5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                ynVar.Q3 += ynVar.f43314d5.forwardMessages.messages.size();
            }
            ynVar.Dc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = ynVar.f43314d5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && ynVar.f43314d5.quote == null && j3 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            ynVar.f43314d5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = ynVar.getMessagesController().getPeer(ynVar.R5);
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
                org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(ynVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Components.oc) M.f30341e).f29333a;
                nj0Var.setScaleX(1.8f);
                nj0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(ynVar.f43322e) && !ynVar.f43339f4 && (messageObject = ynVar.f43412l5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, ynVar.f43412l5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f20094id;
            }
            long j10 = topicId;
            if (j10 != 0) {
                ynVar.getMediaDataController().cleanDraft(ynVar.R5, j10, false);
            }
        }
        ynVar.xb(false, null, null, null, null, z10, i10, null, false, j3, null, true);
        jk jkVar = ynVar.W;
        if (jkVar != null && jkVar.getEmojiView() != null && (g1Var = ynVar.W.getEmojiView().T0) != null) {
            if (g1Var.f10589e) {
                MessagesController.getInstance(g1Var.f10586a).sendTyping(g1Var.f10587b, g1Var.f10588c, 2, 0);
            }
            g1Var.f10590f = -1L;
        }
        if (!ynVar.getMessagesController().premiumFeaturesBlocked() && ynVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !ynVar.getMessagesController().didPressTranscribeButtonEnough() && !ynVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.c41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.f39015c.f43344fa;
    }

    @Override
    public final void J0() {
        this.f39015c.ia(0, false);
    }

    @Override
    public final void K(float f7, int i10) {
        org.telegram.ui.Components.k60 k60Var = this.f39015c.Z2;
        if (k60Var != null) {
            k60Var.b(f7, i10);
        }
    }

    @Override
    public final void T0() {
        yn ynVar = this.f39015c;
        int sendingMessageId = ynVar.getSendMessagesHelper().getSendingMessageId(ynVar.R5);
        if (sendingMessageId != 0) {
            this.f39015c.D(sendingMessageId, 0, 0, 0, true, true);
        }
    }

    @Override
    public final void V() {
        boolean z10;
        yn ynVar = this.f39015c;
        jk jkVar = ynVar.W;
        boolean z11 = jkVar.f23998z3;
        org.telegram.ui.Components.fg fgVar = jkVar.U0;
        boolean z12 = false;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = ynVar.f43532uc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void X(boolean z10) {
        this.f39015c.Ub(false, z10);
    }

    @Override
    public final void a1(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        yn ynVar = this.f39015c;
        if (ynVar.f43272a3.getVisibility() != i11) {
            ynVar.f43272a3.setVisibility(i11);
        }
    }

    @Override
    public final int b1() {
        return this.f39015c.V0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem d1() {
        return null;
    }

    @Override
    public final void d2() {
        org.telegram.ui.Components.iz0 iz0Var = this.f39015c.f43284b1;
        if (iz0Var != null) {
            iz0Var.e();
        }
    }

    @Override
    public final void f() {
        this.f39015c.uc();
    }

    @Override
    public final boolean f1(long j3) {
        return false;
    }

    @Override
    public final void f2(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        yn ynVar = this.f39015c;
        if (i10 < currentActionBarHeight) {
            ynVar.X4 = false;
            if (ynVar.f43284b1.getVisibility() == 0) {
                ynVar.f43284b1.setVisibility(4);
            }
        } else {
            ynVar.X4 = true;
            if (ynVar.f43284b1.getVisibility() == 4 && !ynVar.isInPreviewMode()) {
                ynVar.f43284b1.setVisibility(0);
            }
        }
        ynVar.Y4 = true ^ ynVar.W.t0();
        if (ynVar.W.t0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f39013a != i12) {
            ynVar.Z = 0;
        }
        this.f39013a = i12;
    }

    @Override
    public final void i() {
        org.telegram.ui.Components.iz0 iz0Var = this.f39015c.f43284b1;
        if (iz0Var != null) {
            iz0Var.f();
        }
    }

    @Override
    public final boolean i1() {
        org.telegram.ui.Components.k60 k60Var = this.f39015c.Z2;
        if (k60Var != null && k60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        qm qmVar;
        int indexOfChild;
        int i10;
        yn ynVar = this.f39015c;
        if (ynVar.getParentActivity() != null) {
            if ((ynVar.f43322e != null || ynVar.Y7 != null) && ynVar.fragmentView != null) {
                org.telegram.ui.Components.m40 m40Var = ynVar.f43311d2;
                if ((m40Var == null || m40Var.getVisibility() != 0) && (indexOfChild = (qmVar = ynVar.V0).indexOfChild(ynVar.Q)) != -1) {
                    try {
                        ynVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (ynVar.f43311d2 == null) {
                        org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(9, ynVar.getParentActivity(), ynVar.f43307ca, false);
                        ynVar.f43311d2 = m40Var2;
                        m40Var2.setVisibility(8);
                        qmVar.addView(ynVar.f43311d2, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = ynVar.Y7;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.m40 m40Var3 = ynVar.f43311d2;
                        if (ynVar.W.f23867c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        m40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, ynVar.f43334f.first_name)));
                    } else if (!ChatObject.canSendVoice(ynVar.f43322e) && !ChatObject.canSendRoundVideo(ynVar.f43322e)) {
                        if (!ynVar.K6()) {
                            if (ynVar.W.f23867c1) {
                                ynVar.f43311d2.setText(ChatObject.getRestrictedErrorText(ynVar.f43322e, 21));
                            } else {
                                ynVar.f43311d2.setText(ChatObject.getRestrictedErrorText(ynVar.f43322e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(ynVar.f43322e, 20)) {
                        ynVar.f43311d2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(ynVar.f43322e, 21)) {
                        ynVar.f43311d2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(ynVar.f43322e, 7)) {
                        ynVar.f43311d2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = ynVar.f43322e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                ynVar.f43311d2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                ynVar.f43311d2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(ynVar.f43322e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = ynVar.W.getSendButton();
                    View audioVideoButtonContainer = ynVar.W.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    ynVar.f43311d2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void j2(boolean z10) {
        yn ynVar = this.f39015c;
        View view = ynVar.f43522u2;
        if (view != null) {
            view.setVisibility(8);
        }
        ynVar.Z4 = !z10;
    }

    @Override
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.k60 f60Var;
        yn ynVar = this.f39015c;
        boolean z12 = false;
        if (ynVar.Z2 == null && CameraView.isCameraAllowed() && ynVar.getParentActivity() != null) {
            Activity parentActivity = ynVar.getParentActivity();
            wn wnVar = ynVar.f43307ca;
            int i13 = org.telegram.ui.Components.k60.f27971e;
            ri.a aVar = ri.e.f46451b;
            aVar.a();
            if (aVar.f46443c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                f60Var = new org.telegram.ui.Components.e60(parentActivity, ynVar, wnVar);
            } else {
                f60Var = new org.telegram.ui.Components.f60(parentActivity, ynVar, wnVar, true);
            }
            ynVar.Z2 = f60Var;
            f60Var.setAnimationCallback(new re(ynVar, 0));
            ynVar.Z2.setTrimCallback(new re(ynVar, 1));
            ynVar.Z2.setRecordingUiFrameCallback(new oj(ynVar));
            ynVar.Z2.setClipToPadding(false);
            ynVar.Z2.g(ynVar.H, ynVar.f43545w);
            int indexOfChild = ynVar.V0.indexOfChild(ynVar.Q);
            if (indexOfChild < 0) {
                indexOfChild = ynVar.V0.getChildCount();
            }
            ynVar.V0.addView(ynVar.Z2, Math.min(indexOfChild + 1, ynVar.V0.getChildCount()), w7.z5.e(-1, -1, 51));
        }
        org.telegram.ui.Components.k60 k60Var = this.f39015c.Z2;
        if (k60Var != null) {
            if (i10 == 0) {
                k60Var.h(false);
                this.f39015c.f43533v0.C0();
                this.f39015c.f43572y0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    k60Var.a(z12);
                }
            } else {
                k60Var.f(i10, i11, i12, j3, j10, z10);
            }
        }
    }

    @Override
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        org.telegram.ui.Components.m40 m40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        yn ynVar = this.f39015c;
        if (isEmpty && !ynVar.W.r0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        ck ckVar = ynVar.G1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            charSequence2 = charSequence;
            ynVar.G1.getAdapter().U(charSequence2, ynVar.W.getCursorPosition(), ynVar.f43501s6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        i9.s sVar = ynVar.H5;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            ynVar.H5 = null;
        }
        TLRPC.Chat chat = ynVar.f43322e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = ynVar.W;
            if (jkVar.Y2 && (!jkVar.r0() || !ynVar.W.a2)) {
                if (z10) {
                    ynVar.Xa(charSequence2, true);
                } else {
                    ynVar.M6(charSequence2);
                    i9.s sVar2 = new i9.s(this, charSequence2, false, 21);
                    ynVar.H5 = sVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(sVar2, j3);
                }
            }
        }
        uk ukVar = ynVar.f43542va;
        if (ukVar != null) {
            ArrayList arrayList = ukVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((fz) arrayList.get(i10)).f36447n = true;
            }
        }
        zg.k0 k0Var = zg.k0.B;
        if (k0Var != null) {
            k0Var.f53431l = true;
        }
        zg.k0 k0Var2 = zg.k0.C;
        if (k0Var2 != null) {
            k0Var2.f53431l = true;
        }
        if (!z11) {
            gj gjVar = ynVar.f43325e2;
            if ((gjVar != null && gjVar.getVisibility() == 0) || ((m40Var = ynVar.f43349g2) != null && m40Var.getVisibility() == 0)) {
                gj gjVar2 = ynVar.f43325e2;
                if (gjVar2 != null) {
                    gjVar2.b(true);
                }
                org.telegram.ui.Components.m40 m40Var2 = ynVar.f43349g2;
                if (m40Var2 != null) {
                    m40Var2.b(true);
                    return;
                }
                return;
            }
            yf yfVar = ynVar.La;
            if (UserObject.isUserSelf(ynVar.f43334f) || ((chatFull = ynVar.X7) != null && chatFull.slowmode_next_send_date > 0 && ynVar.P3 == 0)) {
                z13 = true;
            }
            if (!ynVar.f43361h2 && !ynVar.f43337f2 && !z13 && SharedConfig.scheduledHintShows < 3 && !ynVar.W.r0()) {
                AndroidUtilities.cancelRunOnUIThread(yfVar);
                AndroidUtilities.runOnUIThread(yfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f39015c.K6();
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.iz0 iz0Var = this.f39015c.f43284b1;
        if (iz0Var != null) {
            iz0Var.f();
        }
    }

    @Override
    public final void n1() {
        org.telegram.ui.Components.k60 k60Var = this.f39015c.Z2;
        if (k60Var != null) {
            k60Var.i();
        }
    }

    @Override
    public final boolean o1() {
        yn ynVar = this.f39015c;
        TLRPC.User user = ynVar.f43334f;
        if (user != null && !UserObject.isUserSelf(user) && !ynVar.f43334f.bot && ynVar.h == null && ynVar.P3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o2() {
        yn ynVar = this.f39015c;
        gj gjVar = ynVar.f43325e2;
        if (gjVar != null) {
            gjVar.b(true);
        }
        org.telegram.ui.Components.m40 m40Var = ynVar.f43349g2;
        if (m40Var != null) {
            m40Var.b(true);
        }
    }

    @Override
    public final on p0() {
        return this.f39015c.f43388j5;
    }

    @Override
    public final int q() {
        return this.f39015c.V0.R();
    }

    @Override
    public final void q1() {
        int i10;
        yn ynVar = this.f39015c;
        Activity parentActivity = ynVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        long j3 = ynVar.R5;
        MessageSuggestionParams messageSuggestionParams = ynVar.f43328e5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new yh.e0(parentActivity, i10, j3, messageSuggestionParams, ynVar, ynVar.getResourceProvider(), 0, new xe(ynVar, 3)).show();
    }

    @Override
    public final void r1() {
        this.f39015c.H6();
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.f39015c;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (!kVar.f21281n0) {
            org.telegram.ui.ActionBar.y yVar = ynVar.f43347g0;
            if (yVar != null && !this.f39014b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(ynVar.W.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43335f0;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = ynVar.f43297c0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                fs fsVar = ynVar.f43283b0;
                if (fsVar != null) {
                    fsVar.b(true);
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
        yn ynVar = this.f39015c;
        ynVar.W6();
        jk jkVar = ynVar.W;
        boolean z12 = jkVar.f23998z3;
        org.telegram.ui.Components.fg fgVar = jkVar.U0;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        le.b bVar = ynVar.f43532uc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = ynVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30337w;
            if (rcVar != null && rcVar.f30347l) {
                rcVar.b();
            }
        } else {
            Activity parentActivity2 = ynVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        ck ckVar = ynVar.G1;
        float f10 = 0.0f;
        if (ckVar != null) {
            ViewPropertyAnimator animate = ckVar.animate();
            if (!z12 && !ynVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.tr.f31147f).start();
        }
        org.telegram.ui.Components.iz0 iz0Var = ynVar.f43284b1;
        if (iz0Var != null) {
            iz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = ynVar.f43284b1.animate();
            if (!z12 && !ynVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.tr.f31147f).withEndAction(new bi.f(20, this, z12)).start();
        }
    }

    @Override
    public final void t1(View view, CharSequence charSequence, boolean z10) {
        yn ynVar = this.f39015c;
        ynVar.Rb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43335f0;
        if (v0Var != null && v0Var.getVisibility() != 0) {
            ynVar.f43335f0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = ynVar.f43297c0;
            if (yVar != null) {
                yVar.f(8);
            }
            fs fsVar = ynVar.f43283b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer v() {
        return null;
    }

    @Override
    public final void v1(CharSequence charSequence) {
        this.f39015c.Xa(charSequence, true);
    }

    @Override
    public final boolean w1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f39015c.f43314d5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        yn ynVar = this.f39015c;
        kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
        if (!kVar.f21281n0) {
            org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43335f0;
            if (v0Var != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = ynVar.f43347g0;
            if (yVar != null && !this.f39014b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = ynVar.f43297c0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            fs fsVar = ynVar.f43283b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        yn ynVar = this.f39015c;
        if (ynVar.f43546w0 != null) {
            ynVar.Z = ynVar.W.getBackgroundTop();
        }
        ck ckVar = ynVar.G1;
        if (ckVar != null) {
            ckVar.getAdapter().f10676f0 = true;
        }
        if (ynVar.f43438n5 != null) {
            AndroidUtilities.runOnUIThread(new bj(this, 6), 30L);
        }
        if (ynVar.W.t0()) {
            ynVar.W.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        ynVar.W.U0(true, true, z10);
        if (ynVar.f43424m5 != 0) {
            ynVar.getConnectionsManager().cancelRequest(ynVar.f43424m5, true);
            ynVar.f43424m5 = 0;
        }
        ynVar.xc(0, true);
        ynVar.gc(false);
        ynVar.Vc(false);
    }

    @Override
    public final void y(float f7) {
        yn ynVar = this.f39015c;
        if (f7 != 0.0f) {
            ynVar.B4 = true;
        }
        ynVar.o9();
        ynVar.q9();
        ynVar.Lc(false, false);
        ynVar.V0.invalidate();
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30337w;
        if (rcVar != null && ynVar.Wb != null) {
            rcVar.l();
        }
    }

    @Override
    public final void z1() {
        int i10;
        yn ynVar = this.f39015c;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(ynVar.R5, (int) ynVar.d());
        ynVar.c7(true);
    }
}
