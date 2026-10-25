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
public final class jm implements org.telegram.ui.Components.og {
    public int f40683a;
    public boolean f40684b;
    public final un f40685c;

    public jm(un unVar) {
        this.f40685c = unVar;
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
        un unVar = this.f40685c;
        ArrayList arrayList = unVar.G6;
        if (unVar.f44481y0 != null) {
            unVar.f44190b0 = unVar.Y.getBackgroundTop();
        }
        zj zjVar = unVar.U1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            unVar.U1.getAdapter().f14136w.a(charSequence);
        }
        boolean z12 = false;
        if (i10 != 0) {
            if (unVar.f44234e4 == -1) {
                unVar.f44234e4 = 0;
            }
            if (charSequence != null) {
                unVar.f44234e4++;
            }
            MessagePreviewParams messagePreviewParams2 = unVar.f44394r5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                unVar.f44234e4 += unVar.f44394r5.forwardMessages.messages.size();
            }
            unVar.Rc(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = unVar.f44394r5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && unVar.f44394r5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            unVar.f44394r5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = unVar.getMessagesController().getPeer(unVar.f44249f6);
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
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.ak0 ak0Var = ((org.telegram.ui.Components.nc) M.e).f30951a;
                ak0Var.setScaleX(1.8f);
                ak0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(unVar.e) && !unVar.f44419t4 && (messageObject = unVar.f44498z5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                topicId = MessageObject.getTopicId(i12, unVar.f44498z5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f22079id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                unVar.getMediaDataController().cleanDraft(unVar.f44249f6, j11, false);
            }
        }
        unVar.Kb(false, null, null, null, z10, i10, null, false, j10, true);
        hk hkVar = unVar.Y;
        if (hkVar != null && hkVar.getEmojiView() != null && (f1Var = unVar.Y.getEmojiView().T0) != null) {
            if (f1Var.e) {
                MessagesController.getInstance(f1Var.f14054a).sendTyping(f1Var.f14055b, f1Var.f14056c, 2, 0);
            }
            f1Var.f14057f = -1L;
        }
        if (!unVar.getMessagesController().premiumFeaturesBlocked() && unVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !unVar.getMessagesController().didPressTranscribeButtonEnough() && !unVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i14 = 1; i14 < Math.min(5, arrayList.size()); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.l41.u(messageObject3, true);
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers B() {
        return this.f40685c.f44425ta;
    }

    @Override
    public final void G(float f7, int i10) {
        org.telegram.ui.Components.t60 t60Var = this.f40685c.f44343n3;
        if (t60Var != null) {
            t60Var.b(f7, i10);
        }
    }

    @Override
    public final void H() {
        boolean z10;
        un unVar = this.f40685c;
        hk hkVar = unVar.Y;
        boolean z11 = hkVar.f25991z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        boolean z12 = false;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oe.b bVar = unVar.Uc;
        if (z11 && !z10) {
            z12 = true;
        }
        bVar.a(z12, true);
    }

    @Override
    public final void H0() {
        un unVar = this.f40685c;
        int sendingMessageId = unVar.getSendMessagesHelper().getSendingMessageId(unVar.f44249f6);
        if (sendingMessageId != 0) {
            this.f40685c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void J1() {
        org.telegram.ui.Components.tz0 tz0Var = this.f40685c.f44367p1;
        if (tz0Var != null) {
            tz0Var.e();
        }
    }

    @Override
    public final void L1(int i10) {
        int i11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        un unVar = this.f40685c;
        if (i10 < currentActionBarHeight) {
            unVar.f44319l5 = false;
            if (unVar.f44367p1.getVisibility() == 0) {
                unVar.f44367p1.setVisibility(4);
            }
        } else {
            unVar.f44319l5 = true;
            if (unVar.f44367p1.getVisibility() == 4 && !unVar.isInPreviewMode()) {
                unVar.f44367p1.setVisibility(0);
            }
        }
        unVar.f44331m5 = true ^ unVar.Y.q0();
        if (unVar.Y.q0()) {
            i11 = 65536;
        } else {
            i11 = 0;
        }
        int i12 = i10 + i11;
        if (this.f40683a != i12) {
            unVar.f44190b0 = 0;
        }
        this.f40683a = i12;
    }

    @Override
    public final void M0(int i10) {
        int i11;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        un unVar = this.f40685c;
        if (unVar.f44356o3.getVisibility() != i11) {
            unVar.f44356o3.setVisibility(i11);
        }
    }

    @Override
    public final int N0() {
        return this.f40685c.f44292j1.getHeight();
    }

    @Override
    public final void N1() {
        mm mmVar;
        int indexOfChild;
        int i10;
        un unVar = this.f40685c;
        if (unVar.getParentActivity() != null) {
            if ((unVar.e != null || unVar.f44334m8 != null) && unVar.fragmentView != null) {
                org.telegram.ui.Components.t40 t40Var = unVar.f44391r2;
                if ((t40Var == null || t40Var.getVisibility() != 0) && (indexOfChild = (mmVar = unVar.f44292j1).indexOfChild(unVar.S)) != -1) {
                    try {
                        unVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (unVar.f44391r2 == null) {
                        org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(9, unVar.getParentActivity(), unVar.f44385qa, false);
                        unVar.f44391r2 = t40Var2;
                        t40Var2.setVisibility(8);
                        mmVar.addView(unVar.f44391r2, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = unVar.f44334m8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.t40 t40Var3 = unVar.f44391r2;
                        if (unVar.Y.f25857c1) {
                            i10 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i10 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        t40Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i10, unVar.f44242f.first_name)));
                    } else if (!ChatObject.canSendVoice(unVar.e) && !ChatObject.canSendRoundVideo(unVar.e)) {
                        if (!unVar.R6()) {
                            if (unVar.Y.f25857c1) {
                                unVar.f44391r2.setText(ChatObject.getRestrictedErrorText(unVar.e, 21));
                            } else {
                                unVar.f44391r2.setText(ChatObject.getRestrictedErrorText(unVar.e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(unVar.e, 20)) {
                        unVar.f44391r2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(unVar.e, 21)) {
                        unVar.f44391r2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(unVar.e, 7)) {
                        unVar.f44391r2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = unVar.e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                unVar.f44391r2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                unVar.f44391r2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(unVar.e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = unVar.Y.getSendButton();
                    View audioVideoButtonContainer = unVar.Y.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    unVar.f44391r2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void O1(boolean z10) {
        un unVar = this.f40685c;
        View view = unVar.I2;
        if (view != null) {
            view.setVisibility(8);
        }
        unVar.f44345n5 = !z10;
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.t60 o60Var;
        un unVar = this.f40685c;
        boolean z12 = false;
        if (unVar.f44343n3 == null && CameraView.isCameraAllowed() && unVar.getParentActivity() != null) {
            Activity parentActivity = unVar.getParentActivity();
            sn snVar = unVar.f44385qa;
            int i13 = org.telegram.ui.Components.t60.e;
            wi.a aVar = wi.e.d;
            aVar.a();
            if (aVar.f51266c) {
                aVar.a();
                z11 = aVar.d;
            } else {
                z11 = AppGlobalConfig.getInstance(UserConfig.selectedAccount).roundVideoRecorder2Allowed.get();
            }
            if (z11) {
                o60Var = new org.telegram.ui.Components.n60(parentActivity, unVar, snVar);
            } else {
                o60Var = new org.telegram.ui.Components.o60(parentActivity, unVar, snVar, true);
            }
            unVar.f44343n3 = o60Var;
            o60Var.setAnimationCallback(new pe(unVar, 0));
            unVar.f44343n3.setTrimCallback(new pe(unVar, 1));
            unVar.f44343n3.setRecordingUiFrameCallback(new kj(unVar));
            unVar.f44343n3.setClipToPadding(false);
            unVar.f44343n3.g(unVar.J, unVar.f44453w);
            int indexOfChild = unVar.f44292j1.indexOfChild(unVar.S);
            if (indexOfChild < 0) {
                indexOfChild = unVar.f44292j1.getChildCount();
            }
            unVar.f44292j1.addView(unVar.f44343n3, Math.min(indexOfChild + 1, unVar.f44292j1.getChildCount()), org.telegram.ui.Components.gb1.i(-1, -1, 51));
        }
        org.telegram.ui.Components.t60 t60Var = this.f40685c.f44343n3;
        if (t60Var != null) {
            if (i10 == 0) {
                t60Var.h(false);
                this.f40685c.f44468x0.C0();
                this.f40685c.A0.T();
            } else if (i10 != 1 && i10 != 3 && i10 != 4) {
                if (i10 == 2 || i10 == 5) {
                    if (i10 == 2) {
                        z12 = true;
                    }
                    t60Var.a(z12);
                }
            } else {
                t60Var.f(i10, i11, i12, j10, j11, z10);
            }
        }
    }

    @Override
    public final void R(boolean z10) {
        this.f40685c.hc(false, z10);
    }

    @Override
    public final boolean R0(long j10) {
        return false;
    }

    @Override
    public final boolean T0() {
        org.telegram.ui.Components.t60 t60Var = this.f40685c.f44343n3;
        if (t60Var != null && t60Var.d()) {
            return true;
        }
        return false;
    }

    @Override
    public final void T1() {
        un unVar = this.f40685c;
        bj bjVar = unVar.f44404s2;
        if (bjVar != null) {
            bjVar.b(true);
        }
        org.telegram.ui.Components.t40 t40Var = unVar.f44430u2;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override
    public final void U() {
        org.telegram.ui.Components.tz0 tz0Var = this.f40685c.f44367p1;
        if (tz0Var != null) {
            tz0Var.f();
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
        un unVar = this.f40685c;
        if (isEmpty && !unVar.Y.o0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        zj zjVar = unVar.U1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            unVar.U1.getAdapter().U(charSequence2, unVar.Y.getCursorPosition(), unVar.G6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        k9.u uVar = unVar.V5;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            unVar.V5 = null;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            hk hkVar = unVar.Y;
            if (hkVar.Y2 && (!hkVar.o0() || !unVar.Y.a2)) {
                if (z10) {
                    unVar.hb(charSequence2, true);
                } else {
                    unVar.T6(charSequence2);
                    k9.u uVar2 = new k9.u(this, charSequence2, false, 22);
                    unVar.V5 = uVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(uVar2, j10);
                }
            }
        }
        rk rkVar = unVar.Ja;
        if (rkVar != null) {
            ArrayList arrayList = rkVar.F;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ny) arrayList.get(i10)).f42026n = true;
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
            bj bjVar = unVar.f44404s2;
            if ((bjVar != null && bjVar.getVisibility() == 0) || ((t40Var = unVar.f44430u2) != null && t40Var.getVisibility() == 0)) {
                bj bjVar2 = unVar.f44404s2;
                if (bjVar2 != null) {
                    bjVar2.b(true);
                }
                org.telegram.ui.Components.t40 t40Var2 = unVar.f44430u2;
                if (t40Var2 != null) {
                    t40Var2.b(true);
                    return;
                }
                return;
            }
            jg jgVar = unVar.f44187ab;
            if (UserObject.isUserSelf(unVar.f44242f) || ((chatFull = unVar.f44322l8) != null && chatFull.slowmode_next_send_date > 0 && unVar.f44221d4 == 0)) {
                z13 = true;
            }
            if (!unVar.f44443v2 && !unVar.f44417t2 && !z13 && SharedConfig.scheduledHintShows < 3 && !unVar.Y.o0()) {
                AndroidUtilities.cancelRunOnUIThread(jgVar);
                AndroidUtilities.runOnUIThread(jgVar, 4000L);
            }
        }
    }

    @Override
    public final void X0() {
        org.telegram.ui.Components.t60 t60Var = this.f40685c.f44343n3;
        if (t60Var != null) {
            t60Var.i();
        }
    }

    @Override
    public final boolean Y0() {
        un unVar = this.f40685c;
        TLRPC.User user = unVar.f44242f;
        if (user != null && !UserObject.isUserSelf(user) && !unVar.f44242f.bot && unVar.h == null && unVar.f44221d4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void Y1() {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.f40685c;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (!kVar.f22772n0) {
            org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = unVar.f44279i0;
            if (yVar != null && !this.f40684b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = unVar.f44230e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            yr yrVar = unVar.f44217d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
        }
    }

    @Override
    public final void a1() {
        int i10;
        un unVar = this.f40685c;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        long j10 = unVar.f44249f6;
        MessageSuggestionParams messageSuggestionParams = unVar.f44407s5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new bi.g1(parentActivity, i10, j10, messageSuggestionParams, unVar, unVar.getResourceProvider(), 0, new ye(unVar, 1)).show();
    }

    @Override
    public final void b() {
        this.f40685c.Ic();
    }

    @Override
    public final void b1() {
        this.f40685c.O6();
    }

    @Override
    public final void c1() {
        boolean z10;
        boolean z11;
        int i10;
        float f7;
        int i11;
        un unVar = this.f40685c;
        unVar.d7();
        hk hkVar = unVar.Y;
        boolean z12 = hkVar.f25991z3;
        org.telegram.ui.Components.dg dgVar = hkVar.U0;
        if (dgVar != null && dgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        oe.b bVar = unVar.Uc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.a(z11, true);
        if (z12) {
            Activity parentActivity = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
            if (qcVar != null && qcVar.f31890m) {
                qcVar.b();
            }
        } else {
            Activity parentActivity2 = unVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i10);
        }
        zj zjVar = unVar.U1;
        float f10 = 0.0f;
        if (zjVar != null) {
            ViewPropertyAnimator animate = zjVar.animate();
            if (!z12 && !unVar.isInPreviewMode()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).setInterpolator(org.telegram.ui.Components.ds.f27584f).start();
        }
        org.telegram.ui.Components.tz0 tz0Var = unVar.f44367p1;
        if (tz0Var != null) {
            tz0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = unVar.f44367p1.animate();
            if (!z12 && !unVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            animate2.alpha(f10).setInterpolator(org.telegram.ui.Components.ds.f27584f).withEndAction(new bh.n(24, this, z12)).start();
        }
    }

    @Override
    public final void c2() {
        un unVar = this.f40685c;
        di.a3 a3Var = unVar.V1;
        if (a3Var != null) {
            a3Var.O1(null, 0);
        }
        unVar.ha();
    }

    @Override
    public final void e() {
        org.telegram.ui.Components.tz0 tz0Var = this.f40685c.f44367p1;
        if (tz0Var != null) {
            tz0Var.f();
        }
    }

    @Override
    public final void e1(View view, CharSequence charSequence, boolean z10) {
        un unVar = this.f40685c;
        unVar.ec(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            unVar.f44266h0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = unVar.f44230e0;
            if (yVar != null) {
                yVar.f(8);
            }
            yr yrVar = unVar.f44217d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f40685c.R6();
    }

    @Override
    public final int g() {
        return this.f40685c.f44292j1.Q();
    }

    @Override
    public final void g1(CharSequence charSequence) {
        this.f40685c.hb(charSequence, true);
    }

    @Override
    public final boolean h1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f40685c.f44394r5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final kn i0() {
        return this.f40685c.f44473x5;
    }

    @Override
    public final void j1() {
        int i10;
        un unVar = this.f40685c;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        BotForumHelper.getInstance(i10).stopStreaming(unVar.f44249f6, (int) unVar.b());
        unVar.j7(true);
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void l0() {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.f40685c;
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (!kVar.f22772n0) {
            org.telegram.ui.ActionBar.y yVar = unVar.f44279i0;
            if (yVar != null && !this.f40684b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(unVar.Y.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = unVar.f44230e0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                yr yrVar = unVar.f44217d0;
                if (yrVar != null) {
                    yrVar.b(true);
                }
            }
        }
    }

    @Override
    public final void o() {
        boolean z10;
        un unVar = this.f40685c;
        if (unVar.f44481y0 != null) {
            unVar.f44190b0 = unVar.Y.getBackgroundTop();
        }
        zj zjVar = unVar.U1;
        if (zjVar != null) {
            zjVar.getAdapter().f14117f0 = true;
        }
        if (unVar.B5 != null) {
            AndroidUtilities.runOnUIThread(new ui(this, 7), 30L);
        }
        if (unVar.Y.q0()) {
            unVar.Y.b1();
            z10 = true;
        } else {
            z10 = false;
        }
        unVar.Y.S0(true, true, z10);
        if (unVar.A5 != 0) {
            unVar.getConnectionsManager().cancelRequest(unVar.A5, true);
            unVar.A5 = 0;
        }
        unVar.Lc(0, true);
        unVar.uc(false);
        unVar.jd(false);
    }

    @Override
    public final void o1() {
        int i10;
        int i11;
        un unVar = this.f40685c;
        if (!unVar.I9() && (i10 = unVar.f44221d4) != 6 && i10 != 8) {
            MessagesController messagesController = unVar.getMessagesController();
            long j10 = unVar.f44249f6;
            long j11 = unVar.f44370p4;
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i11);
        }
    }

    @Override
    public final boolean p0() {
        int i10;
        un unVar = this.f40685c;
        if ((!unVar.getMessagesController().isForum(unVar.a()) || unVar.f44419t4) && (i10 = unVar.f44221d4) != 9 && unVar.f44234e4 > 0) {
            if (i10 != 0) {
                if (i10 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId()) {
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
        un unVar = this.f40685c;
        if (i10 != 0) {
            unVar.P4 = true;
        }
        unVar.x9();
        unVar.z9();
        unVar.Zc(false, false);
        unVar.f44292j1.invalidate();
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
        if (qcVar != null && unVar.f44452vc != null) {
            qcVar.l();
        }
    }

    @Override
    public final void v0(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.f40685c;
        if (unVar.f44279i0 != null) {
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            final org.telegram.ui.ActionBar.z l4 = kVar.l();
            org.telegram.ui.Components.tz0 tz0Var = unVar.f44367p1;
            if (tz0Var != null) {
                tz0Var.e();
            }
            if (i11 - i10 > 0) {
                org.telegram.ui.ActionBar.y yVar = unVar.f44279i0;
                if (yVar.f23280o == null) {
                    yVar.f23280o = 1;
                    if (unVar.f44279i0.f23277l != 0) {
                        if ((unVar.f44221d4 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId()) || (unVar.f44221d4 == 0 && ((unVar.f44370p4 == 0 || unVar.f44419t4) && !UserObject.isReplyUser(unVar.f44242f) && !unVar.J9()))) {
                            unVar.f44279i0.f(0);
                            un.T3(unVar);
                            org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = unVar.f44230e0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            yr yrVar = unVar.f44217d0;
                            if (yrVar != null) {
                                yrVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                            ofFloat.addListener(new im(this, l4, 0));
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
                unVar.M4 = i10;
                unVar.N4 = i11;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = unVar.f44279i0;
            if (yVar3.f23280o != null) {
                yVar3.f23280o = null;
                if (yVar3.f23277l != 8) {
                    if ((unVar.f44221d4 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId()) || (unVar.f44221d4 == 0 && ((unVar.f44370p4 == 0 || unVar.f44419t4) && !UserObject.isReplyUser(unVar.f44242f) && !unVar.J9()))) {
                        unVar.f44279i0.f(8);
                        if (unVar.Y.h0() && TextUtils.isEmpty(unVar.Y.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = unVar.f44266h0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = unVar.f44230e0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            yr yrVar2 = unVar.f44217d0;
                            if (yrVar2 != null) {
                                yrVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = unVar.f44266h0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = unVar.f44230e0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        yr yrVar3 = unVar.f44217d0;
                        if (yrVar3 != null) {
                            yrVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                    ofFloat2.addListener(new im(this, l4, 1));
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
        un unVar = this.f40685c;
        if (z10) {
            Activity parentActivity = unVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i11);
            unVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i10);
    }

    @Override
    public final void x0() {
        un unVar = this.f40685c;
        unVar.A9 = true;
        fm fmVar = unVar.A0;
        if (fmVar != null) {
            fmVar.K(true);
        }
    }

    @Override
    public final void z() {
        this.f40685c.hc(true, false);
    }

    @Override
    public final void z0() {
        this.f40685c.ta(0, false);
    }
}
