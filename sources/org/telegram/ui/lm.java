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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lm implements org.telegram.ui.Components.og {
    public int f41201a;
    public boolean f41202b;
    public final wn f41203c;

    public lm(wn wnVar) {
        this.f41203c = wnVar;
    }

    @Override
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ig.f1 f1Var;
        MessageObject messageObject;
        int i12;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        wn wnVar = this.f41203c;
        ArrayList arrayList = wnVar.K6;
        if (wnVar.f45352y0 != null) {
            wnVar.f45058b0 = wnVar.Y.getBackgroundTop();
        }
        bk bkVar = wnVar.U1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            wnVar.U1.getAdapter().f14135w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (wnVar.f45105e4 == -1) {
                wnVar.f45105e4 = 0;
            }
            if (charSequence != null) {
                wnVar.f45105e4++;
            }
            MessagePreviewParams messagePreviewParams2 = wnVar.f45317v5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                wnVar.f45105e4 += wnVar.f45317v5.forwardMessages.messages.size();
            }
            wnVar.Vc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = wnVar.f45317v5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && wnVar.f45317v5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            wnVar.f45317v5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = wnVar.getMessagesController().getPeer(wnVar.f45168j6);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Components.nc) M.e).f30858a;
                bk0Var.setScaleX(1.8f);
                bk0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(wnVar.e) && !wnVar.f45290t4 && (messageObject = wnVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, wnVar.D5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f22080id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                wnVar.getMediaDataController().cleanDraft(wnVar.f45168j6, j11, false);
            }
        }
        wnVar.Ob(false, null, null, null, z10, i10, null, false, j10, true);
        jk jkVar = wnVar.Y;
        if (jkVar != null && jkVar.getEmojiView() != null && (f1Var = wnVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.f14053a).sendTyping(f1Var.f14054b, f1Var.f14055c, 2, 0);
            }
            f1Var.f14056f = -1L;
        }
        if (!wnVar.getMessagesController().premiumFeaturesBlocked() && wnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !wnVar.getMessagesController().didPressTranscribeButtonEnough() && !wnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.m41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
        return this.f41203c.f45348xa;
    }

    @Override
    public final void G(float f7, int i10) {
        org.telegram.ui.Components.u60 u60Var = this.f41203c.f45214n3;
        if (u60Var != null) {
            u60Var.b(f7, i10);
        }
    }

    @Override
    public final void H() {
        boolean z10;
        wn wnVar = this.f41203c;
        jk jkVar = wnVar.Y;
        boolean z11 = jkVar.f25995z3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oe.b bVar = wnVar.Yc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void H0() {
        wn wnVar = this.f41203c;
        int sendingMessageId = wnVar.getSendMessagesHelper().getSendingMessageId(wnVar.f45168j6);
        if (sendingMessageId != 0) {
            this.f41203c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void J1() {
        org.telegram.ui.Components.uz0 uz0Var = this.f41203c.f45238p1;
        if (uz0Var != null) {
            uz0Var.e();
        }
    }

    @Override
    public final void L1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        wn wnVar = this.f41203c;
        if (i10 < currentActionBarHeight) {
            wnVar.f45242p5 = false;
            if (wnVar.f45238p1.getVisibility() == 0) {
                wnVar.f45238p1.setVisibility(4);
            }
        } else {
            wnVar.f45242p5 = true;
            if (wnVar.f45238p1.getVisibility() == 4 && !wnVar.isInPreviewMode()) {
                wnVar.f45238p1.setVisibility(0);
            }
        }
        wnVar.q5 = true ^ wnVar.Y.p0();
        if (wnVar.Y.p0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f41201a != i12) {
            wnVar.f45058b0 = 0;
        }
        this.f41201a = i12;
    }

    @Override
    public final void M0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        wn wnVar = this.f41203c;
        if (wnVar.f45227o3.getVisibility() != i11) {
            wnVar.f45227o3.setVisibility(i11);
        }
    }

    @Override
    public final int N0() {
        return this.f41203c.f45163j1.getHeight();
    }

    @Override
    public final void N1() {
        om omVar;
        int indexOfChild;
        int i10;
        wn wnVar = this.f41203c;
        if (wnVar.getParentActivity() != null) {
            if ((wnVar.e != null || wnVar.f45255q8 != null) && wnVar.fragmentView != null) {
                org.telegram.ui.Components.t40 t40Var = wnVar.f45262r2;
                if ((t40Var == null || t40Var.getVisibility() != 0) && (indexOfChild = (omVar = wnVar.f45163j1).indexOfChild(wnVar.S)) != -1) {
                    try {
                        wnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (wnVar.f45262r2 == null) {
                        org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(9, wnVar.getParentActivity(), wnVar.f45309ua, false);
                        wnVar.f45262r2 = t40Var2;
                        t40Var2.setVisibility(8);
                        omVar.addView(wnVar.f45262r2, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = wnVar.f45255q8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.t40 t40Var3 = wnVar.f45262r2;
                        if (wnVar.Y.f25861c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        t40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, wnVar.f45113f.first_name)));
                    } else if (!ChatObject.canSendVoice(wnVar.e) && !ChatObject.canSendRoundVideo(wnVar.e)) {
                        if (!wnVar.T6()) {
                            if (wnVar.Y.f25861c1) {
                                wnVar.f45262r2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 21));
                            } else {
                                wnVar.f45262r2.setText(ChatObject.getRestrictedErrorText(wnVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 20)) {
                        wnVar.f45262r2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 21)) {
                        wnVar.f45262r2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(wnVar.e, 7)) {
                        wnVar.f45262r2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wnVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                wnVar.f45262r2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                wnVar.f45262r2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(wnVar.e.banned_rights.until_date)));
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
                    wnVar.f45262r2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void O1(boolean z10) {
        wn wnVar = this.f41203c;
        View view = wnVar.I2;
        if (view != null) {
            view.setVisibility(8);
        }
        wnVar.f45265r5 = !z10;
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        org.telegram.ui.Components.u60 p60Var;
        wn wnVar = this.f41203c;
        boolean z11 = false;
        if (wnVar.f45214n3 == null && CameraView.isCameraAllowed() && wnVar.getParentActivity() != null) {
            Activity parentActivity = wnVar.getParentActivity();
            un unVar = wnVar.f45309ua;
            if (org.telegram.ui.Components.u60.d(UserConfig.selectedAccount)) {
                p60Var = new org.telegram.ui.Components.o60(parentActivity, wnVar, unVar);
            } else {
                p60Var = new org.telegram.ui.Components.p60(parentActivity, wnVar, unVar, true);
            }
            wnVar.f45214n3 = p60Var;
            p60Var.setAnimationCallback(new qe(wnVar, 0));
            wnVar.f45214n3.setTrimCallback(new qe(wnVar, 1));
            wnVar.f45214n3.setRecordingUiFrameCallback(new nj(wnVar));
            wnVar.f45214n3.setClipToPadding(false);
            wnVar.f45214n3.h(wnVar.J, wnVar.f45324w);
            int indexOfChild = wnVar.f45163j1.indexOfChild(wnVar.S);
            if (indexOfChild < 0) {
                indexOfChild = wnVar.f45163j1.getChildCount();
            }
            wnVar.f45163j1.addView(wnVar.f45214n3, Math.min(indexOfChild + 1, wnVar.f45163j1.getChildCount()), org.telegram.ui.Components.kb1.i(-1, -1, 51));
        }
        org.telegram.ui.Components.u60 u60Var = wnVar.f45214n3;
        if (u60Var != null) {
            if (i10 == 0) {
                u60Var.i(false);
                wnVar.f45339x0.C0();
                wnVar.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    u60Var.a(z11);
                }
            } else {
                u60Var.g(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final void R(boolean z10) {
        this.f41203c.lc(false, z10);
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final boolean T0() {
        org.telegram.ui.Components.u60 u60Var = this.f41203c.f45214n3;
        if (u60Var != null && u60Var.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void T1() {
        wn wnVar = this.f41203c;
        ej ejVar = wnVar.f45275s2;
        if (ejVar != null) {
            ejVar.b(true);
        }
        org.telegram.ui.Components.t40 t40Var = wnVar.f45301u2;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override
    public final void U() {
        org.telegram.ui.Components.uz0 uz0Var = this.f41203c.f45238p1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.t40 t40Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        wn wnVar = this.f41203c;
        if (isEmpty && !wnVar.Y.n0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        bk bkVar = wnVar.U1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            charSequence2 = charSequence;
            wnVar.U1.getAdapter().U(charSequence2, wnVar.Y.getCursorPosition(), wnVar.K6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        k9.u uVar = wnVar.Z5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            wnVar.Z5 = null;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            jk jkVar = wnVar.Y;
            if (jkVar.Y2 && (!jkVar.n0() || !wnVar.Y.a2)) {
                if (z10) {
                    wnVar.lb(charSequence2, true);
                } else {
                    wnVar.V6(charSequence2);
                    k9.u uVar2 = new k9.u(this, charSequence2, false, 22);
                    wnVar.Z5 = uVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(uVar2, j10);
                }
            }
        }
        tk tkVar = wnVar.Na;
        if (tkVar != null) {
            ArrayList arrayList = tkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((py) arrayList.get(i10)).f42537n = true;
            }
        }
        bh.s0 s0Var = bh.s0.B;
        if (s0Var != null) {
            s0Var.f4133l = true;
        }
        bh.s0 s0Var2 = bh.s0.C;
        if (s0Var2 != null) {
            s0Var2.f4133l = true;
        }
        if (!z11) {
            ej ejVar = wnVar.f45275s2;
            if ((ejVar != null && ejVar.getVisibility() == 0) || ((t40Var = wnVar.f45301u2) != null && t40Var.getVisibility() == 0)) {
                ej ejVar2 = wnVar.f45275s2;
                if (ejVar2 != null) {
                    ejVar2.b(true);
                }
                org.telegram.ui.Components.t40 t40Var2 = wnVar.f45301u2;
                if (t40Var2 != null) {
                    t40Var2.b(true);
                    return;
                }
                return;
            }
            ig igVar = wnVar.eb;
            if (UserObject.isUserSelf(wnVar.f45113f) || ((chatFull = wnVar.f45245p8) != null && chatFull.slowmode_next_send_date > 0 && wnVar.f45091d4 == 0)) {
                z13 = true;
            }
            if (!wnVar.f45314v2 && !wnVar.f45288t2 && !z13 && SharedConfig.scheduledHintShows < 3 && !wnVar.Y.n0()) {
                AndroidUtilities.cancelRunOnUIThread(igVar);
                AndroidUtilities.runOnUIThread(igVar, 4000L);
            }
        }
    }

    @Override
    public final void X0() {
        org.telegram.ui.Components.u60 u60Var = this.f41203c.f45214n3;
        if (u60Var != null) {
            u60Var.j();
        }
    }

    @Override
    public final boolean Y0() {
        wn wnVar = this.f41203c;
        TLRPC.User user = wnVar.f45113f;
        if (user != null && !UserObject.isUserSelf(user) && !wnVar.f45113f.bot && wnVar.h == null && wnVar.f45091d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void Y1() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f41203c;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.f22775n0) {
            org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = wnVar.f45150i0;
            if (yVar != null && !this.f41202b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = wnVar.f45101e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            as asVar = wnVar.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
        }
    }

    @Override
    public final void a1() {
        int i10;
        wn wnVar = this.f41203c;
        Activity parentActivity = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        long j10 = wnVar.f45168j6;
        MessageSuggestionParams messageSuggestionParams = wnVar.f45330w5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new bi.g1(parentActivity, i10, j10, messageSuggestionParams, wnVar, wnVar.getResourceProvider(), 0, new ye(wnVar, 1)).show();
    }

    @Override
    public final void b() {
        this.f41203c.Mc();
    }

    @Override
    public final void b1() {
        this.f41203c.Q6();
    }

    @Override
    public final void c1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        wn wnVar = this.f41203c;
        wnVar.f7();
        jk jkVar = wnVar.Y;
        boolean z12 = jkVar.f25995z3;
        org.telegram.ui.Components.dg dgVar = jkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oe.b bVar = wnVar.Yc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
            if (qcVar != null && qcVar.f31864m) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = wnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        bk bkVar = wnVar.U1;
        float f10 = 0.0f;
        if (bkVar != null) {
            ViewPropertyAnimator animate = bkVar.animate();
            if (!z12 && !wnVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
        }
        org.telegram.ui.Components.uz0 uz0Var = wnVar.f45238p1;
        if (uz0Var != null) {
            uz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = wnVar.f45238p1.animate();
            if (!z12 && !wnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.ds.f27530f).withEndAction(new bh.n(24, this, z12)).start();
        }
    }

    @Override
    public final void c2() {
        wn wnVar = this.f41203c;
        di.a3 a3Var = wnVar.V1;
        if (a3Var != null) {
            a3Var.P1(null, 0);
        }
        wnVar.ka();
    }

    @Override
    public final void e() {
        org.telegram.ui.Components.uz0 uz0Var = this.f41203c.f45238p1;
        if (uz0Var != null) {
            uz0Var.f();
        }
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
        wn wnVar = this.f41203c;
        wnVar.ic(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            wnVar.f45137h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = wnVar.f45101e0;
            if (yVar != null) {
                yVar.f(8);
            }
            as asVar = wnVar.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f41203c.T6();
    }

    @Override
    public final int g() {
        return this.f41203c.f45163j1.Q();
    }

    @Override
    public final void g1(CharSequence charSequence) {
        this.f41203c.lb(charSequence, true);
    }

    @Override
    public final boolean h1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f41203c.f45317v5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final mn i0() {
        return this.f41203c.B5;
    }

    @Override
    public final void j1() {
        int i10;
        wn wnVar = this.f41203c;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(wnVar.f45168j6, (int) wnVar.b());
        wnVar.l7(true);
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void l0() {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f41203c;
        kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
        if (!kVar.f22775n0) {
            org.telegram.ui.ActionBar.y yVar = wnVar.f45150i0;
            if (yVar != null && !this.f41202b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = wnVar.f45101e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                as asVar = wnVar.f45087d0;
                if (asVar != null) {
                    asVar.b(true);
                }
            }
        }
    }

    @Override
    public final void o() {
        boolean z10;
        wn wnVar = this.f41203c;
        if (wnVar.f45352y0 != null) {
            wnVar.f45058b0 = wnVar.Y.getBackgroundTop();
        }
        bk bkVar = wnVar.U1;
        if (bkVar != null) {
            bkVar.getAdapter().f14116f0 = true;
        }
        if (wnVar.F5 != null) {
            AndroidUtilities.runOnUIThread(new xi(this, 7), 30L);
        }
        if (wnVar.Y.p0()) {
            wnVar.Y.a1();
            z10 = true;
        } else {
            z10 = false;
        }
        wnVar.Y.R0(true, true, z10);
        if (wnVar.E5 != 0) {
            wnVar.getConnectionsManager().cancelRequest(wnVar.E5, true);
            wnVar.E5 = 0;
        }
        wnVar.Pc(0, true);
        wnVar.yc(false);
        wnVar.nd(false);
    }

    @Override
    public final void o1() {
        int i10;
        int i11;
        wn wnVar = this.f41203c;
        if (!wnVar.L9() && (i10 = wnVar.f45091d4) != 6 && i10 != 8) {
            MessagesController messagesController = wnVar.getMessagesController();
            long j10 = wnVar.f45168j6;
            long j11 = wnVar.f45241p4;
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final boolean p0() {
        int i10;
        wn wnVar = this.f41203c;
        if ((!wnVar.getMessagesController().isForum(wnVar.a()) || wnVar.f45290t4) && (i10 = wnVar.f45091d4) != 9 && wnVar.f45105e4 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void t(float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        wn wnVar = this.f41203c;
        if (i10 != 0) {
            wnVar.P4 = true;
        }
        wnVar.A9();
        wnVar.C9();
        wnVar.dd(false, false);
        wnVar.f45163j1.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
        if (qcVar != null && wnVar.zc != null) {
            qcVar.l();
        }
    }

    @Override
    public final void v0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        wn wnVar = this.f41203c;
        if (wnVar.f45150i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            final org.telegram.ui.ActionBar.z l4 = kVar.l();
            org.telegram.ui.Components.uz0 uz0Var = wnVar.f45238p1;
            if (uz0Var != null) {
                uz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = wnVar.f45150i0;
                if (yVar.f23283o == null) {
                    yVar.f23283o = 1;
                    if (wnVar.f45150i0.f23280l != 0) {
                        if ((wnVar.f45091d4 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId()) || (wnVar.f45091d4 == 0 && ((wnVar.f45241p4 == 0 || wnVar.f45290t4) && !UserObject.isReplyUser(wnVar.f45113f) && !wnVar.M9()))) {
                            wnVar.f45150i0.f(0);
                            wn.U3(wnVar);
                            org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = wnVar.f45101e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            as asVar = wnVar.f45087d0;
                            if (asVar != null) {
                                asVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                            ofFloat.addListener(new km(this, l4, 0));
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (r2) {
                                        case 0:
                                            l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                        default:
                                            l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                            return;
                                    }
                                }
                            });
                            ofFloat.start();
                        }
                    }
                }
                wnVar.M4 = i10;
                wnVar.N4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = wnVar.f45150i0;
            if (yVar3.f23283o != null) {
                yVar3.f23283o = null;
                if (yVar3.f23280l != 8) {
                    if ((wnVar.f45091d4 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId()) || (wnVar.f45091d4 == 0 && ((wnVar.f45241p4 == 0 || wnVar.f45290t4) && !UserObject.isReplyUser(wnVar.f45113f) && !wnVar.M9()))) {
                        wnVar.f45150i0.f(8);
                        if (wnVar.Y.g0() && TextUtils.isEmpty(wnVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = wnVar.f45137h0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = wnVar.f45101e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            as asVar2 = wnVar.f45087d0;
                            if (asVar2 != null) {
                                asVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = wnVar.f45137h0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = wnVar.f45101e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        as asVar3 = wnVar.f45087d0;
                        if (asVar3 != null) {
                            asVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                    ofFloat2.addListener(new km(this, l4, 1));
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    return;
                                default:
                                    l4.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
    public final void w(boolean z10) {
        int i10;
        int i11;
        wn wnVar = this.f41203c;
        if (z10) {
            Activity parentActivity = wnVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            wnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = wnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void x0() {
        wn wnVar = this.f41203c;
        wnVar.E9 = true;
        hm hmVar = wnVar.A0;
        if (hmVar != null) {
            hmVar.K(true);
        }
    }

    @Override
    public final void z() {
        this.f41203c.lc(true, false);
    }

    @Override
    public final void z0() {
        this.f41203c.wa(0, false);
    }
}
