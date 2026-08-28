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
public final class gm implements org.telegram.ui.Components.eg {
    public int f38566a;
    public boolean f38567b;
    public final qn f38568c;

    public gm(qn qnVar) {
        this.f38568c = qnVar;
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers A() {
        return this.f38568c.f41887da;
    }

    @Override
    public final void B(float f10, int i9) {
        uk ukVar = this.f38568c.X2;
        if (ukVar != null) {
            ukVar.e(f10, i9);
        }
    }

    @Override
    public final void G() {
        boolean z10;
        qn qnVar = this.f38568c;
        ak akVar = qnVar.U;
        boolean z11 = akVar.f26190u3;
        org.telegram.ui.Components.uf ufVar = akVar.Q0;
        boolean z12 = false;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        td.a aVar = qnVar.f42089tc;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void H(boolean z10) {
        this.f38568c.Vb(false, z10);
    }

    @Override
    public final void J0() {
        qn qnVar = this.f38568c;
        int sendingMessageId = qnVar.getSendMessagesHelper().getSendingMessageId(qnVar.P5);
        if (sendingMessageId != 0) {
            this.f38568c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void J1() {
        org.telegram.ui.Components.ux0 ux0Var = this.f38568c.Z0;
        if (ux0Var != null) {
            ux0Var.e();
        }
    }

    @Override
    public final void K1(int i9) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        qn qnVar = this.f38568c;
        if (i9 < currentActionBarHeight) {
            qnVar.V4 = false;
            if (qnVar.Z0.getVisibility() == 0) {
                qnVar.Z0.setVisibility(4);
            }
        } else {
            qnVar.V4 = true;
            if (qnVar.Z0.getVisibility() == 4 && !qnVar.isInPreviewMode()) {
                qnVar.Z0.setVisibility(0);
            }
        }
        qnVar.W4 = true ^ qnVar.U.s0();
        if (qnVar.U.s0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i9 + i10;
        if (this.f38566a != i11) {
            qnVar.X = 0;
        }
        this.f38566a = i11;
    }

    @Override
    public final void L0(int i9) {
        int i10;
        if (i9 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        qn qnVar = this.f38568c;
        if (qnVar.Y2.getVisibility() != i10) {
            qnVar.Y2.setVisibility(i10);
        }
    }

    @Override
    public final int N0() {
        return this.f38568c.T0.getHeight();
    }

    @Override
    public final TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public final void Q() {
        org.telegram.ui.Components.ux0 ux0Var = this.f38568c.Z0;
        if (ux0Var != null) {
            ux0Var.f();
        }
    }

    @Override
    public final void Q1() {
        im imVar;
        int indexOfChild;
        int i9;
        qn qnVar = this.f38568c;
        if (qnVar.getParentActivity() != null) {
            if ((qnVar.f41890e != null || qnVar.W7 != null) && qnVar.fragmentView != null) {
                org.telegram.ui.Components.s30 s30Var = qnVar.f41854b2;
                if ((s30Var == null || s30Var.getVisibility() != 0) && (indexOfChild = (imVar = qnVar.T0).indexOfChild(qnVar.O)) != -1) {
                    try {
                        qnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (qnVar.f41854b2 == null) {
                        org.telegram.ui.Components.s30 s30Var2 = new org.telegram.ui.Components.s30(9, qnVar.getParentActivity(), qnVar.f41848aa, false);
                        qnVar.f41854b2 = s30Var2;
                        s30Var2.setVisibility(8);
                        imVar.addView(qnVar.f41854b2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    }
                    TLRPC.UserFull userFull = qnVar.W7;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        org.telegram.ui.Components.s30 s30Var3 = qnVar.f41854b2;
                        if (qnVar.U.Y0) {
                            i9 = R.string.VideoMessagesRestrictedByPrivacy;
                        } else {
                            i9 = R.string.VoiceMessagesRestrictedByPrivacy;
                        }
                        s30Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i9, qnVar.f41903f.first_name)));
                    } else if (!ChatObject.canSendVoice(qnVar.f41890e) && !ChatObject.canSendRoundVideo(qnVar.f41890e)) {
                        if (!qnVar.K6()) {
                            if (qnVar.U.Y0) {
                                qnVar.f41854b2.setText(ChatObject.getRestrictedErrorText(qnVar.f41890e, 21));
                            } else {
                                qnVar.f41854b2.setText(ChatObject.getRestrictedErrorText(qnVar.f41890e, 20));
                            }
                        } else {
                            return;
                        }
                    } else if (ChatObject.isActionBannedByDefault(qnVar.f41890e, 20)) {
                        qnVar.f41854b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.f41890e, 21)) {
                        qnVar.f41854b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(qnVar.f41890e, 7)) {
                        qnVar.f41854b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = qnVar.f41890e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                                qnVar.f41854b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                            } else {
                                qnVar.f41854b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(qnVar.f41890e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = qnVar.U.getSendButton();
                    View audioVideoButtonContainer = qnVar.U.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    qnVar.f41854b2.f(sendButton, true);
                }
            }
        }
    }

    @Override
    public final gn T() {
        return this.f38568c.f41934h5;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final void T1(boolean z10) {
        qn qnVar = this.f38568c;
        View view = qnVar.f42066s2;
        if (view != null) {
            view.setVisibility(8);
        }
        qnVar.X4 = !z10;
    }

    @Override
    public final void U1(int i9, int i10, int i11, long j10, long j11, boolean z10) {
        qn qnVar = this.f38568c;
        boolean z11 = true;
        if (qnVar.X2 == null && CameraView.isCameraAllowed() && qnVar.getParentActivity() != null) {
            uk ukVar = new uk(qnVar, qnVar.getParentActivity(), qnVar, qnVar.f41848aa);
            qnVar.X2 = ukVar;
            ukVar.setClipToPadding(false);
            uk ukVar2 = qnVar.X2;
            ig.a aVar = qnVar.F;
            xi xiVar = qnVar.f42113w;
            View view = ukVar2.N0;
            kg.d c10 = aVar.c(view, xiVar, false);
            c10.o(AndroidUtilities.dp(6.0f));
            c10.p(AndroidUtilities.dp(21.0f));
            view.setBackground(c10);
            int indexOfChild = qnVar.T0.indexOfChild(qnVar.O);
            if (indexOfChild < 0) {
                indexOfChild = qnVar.T0.getChildCount();
            }
            qnVar.T0.addView(qnVar.X2, Math.min(indexOfChild + 1, qnVar.T0.getChildCount()), g7.e6.e(-1, -1, 51));
        }
        uk ukVar3 = qnVar.X2;
        if (ukVar3 != null) {
            if (i9 == 0) {
                ukVar3.l(false);
                qnVar.f42077t0.B0();
                qnVar.f42114w0.T();
            } else if (i9 != 1 && i9 != 3 && i9 != 4) {
                if (i9 == 2 || i9 == 5) {
                    if (i9 != 2) {
                        z11 = false;
                    }
                    ukVar3.d(z11);
                }
            } else {
                ukVar3.k(i9, i10, i11, j10, j11, z10);
            }
        }
    }

    @Override
    public final boolean X0() {
        uk ukVar = this.f38568c.X2;
        if (ukVar != null && !ukVar.f28273a0) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        qn qnVar = this.f38568c;
        wi wiVar = qnVar.f41867c2;
        if (wiVar != null) {
            wiVar.b(true);
        }
        org.telegram.ui.Components.s30 s30Var = qnVar.f41893e2;
        if (s30Var != null) {
            s30Var.b(true);
        }
    }

    @Override
    public final void b1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        org.telegram.ui.Components.s30 s30Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        qn qnVar = this.f38568c;
        if (isEmpty && !qnVar.U.q0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        mediaController.setInputFieldHasText(z12);
        tj tjVar = qnVar.E1;
        if (tjVar != null && tjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            qnVar.E1.getAdapter().U(charSequence2, qnVar.U.getCursorPosition(), qnVar.f42042q6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        fm fmVar = qnVar.F5;
        if (fmVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fmVar);
            qnVar.F5 = null;
        }
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ak akVar = qnVar.U;
            if (akVar.T2 && (!akVar.q0() || !qnVar.U.V1)) {
                if (z10) {
                    qnVar.Ya(charSequence2, true);
                } else {
                    qnVar.M6(charSequence2);
                    fm fmVar2 = new fm(0, this, charSequence2);
                    qnVar.F5 = fmVar2;
                    if (AndroidUtilities.WEB_URL == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    AndroidUtilities.runOnUIThread(fmVar2, j10);
                }
            }
        }
        lk lkVar = qnVar.f42087ta;
        if (lkVar != null) {
            ArrayList arrayList = lkVar.B;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((oy) arrayList.get(i9)).f41273n = true;
            }
        }
        hg.n0 n0Var = hg.n0.B;
        if (n0Var != null) {
            n0Var.f10665l = true;
        }
        hg.n0 n0Var2 = hg.n0.C;
        if (n0Var2 != null) {
            n0Var2.f10665l = true;
        }
        if (!z11) {
            wi wiVar = qnVar.f41867c2;
            if ((wiVar != null && wiVar.getVisibility() == 0) || ((s30Var = qnVar.f41893e2) != null && s30Var.getVisibility() == 0)) {
                wi wiVar2 = qnVar.f41867c2;
                if (wiVar2 != null) {
                    wiVar2.b(true);
                }
                org.telegram.ui.Components.s30 s30Var2 = qnVar.f41893e2;
                if (s30Var2 != null) {
                    s30Var2.b(true);
                    return;
                }
                return;
            }
            gf gfVar = qnVar.Ja;
            if (UserObject.isUserSelf(qnVar.f41903f) || ((chatFull = qnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && qnVar.N3 == 0)) {
                z13 = true;
            }
            if (!qnVar.f41906f2 && !qnVar.f41880d2 && !z13 && SharedConfig.scheduledHintShows < 3 && !qnVar.U.q0()) {
                AndroidUtilities.cancelRunOnUIThread(gfVar);
                AndroidUtilities.runOnUIThread(gfVar, 4000L);
            }
        }
    }

    @Override
    public final void c() {
        this.f38568c.vc();
    }

    @Override
    public final void c1() {
        uk ukVar = this.f38568c.X2;
        if (ukVar != null) {
            ukVar.q();
        }
    }

    @Override
    public final void c2() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f38568c;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (!kVar.f23577j0) {
            org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
            if (w0Var != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = qnVar.f41891e0;
            if (yVar != null && !this.f38567b) {
                yVar.f(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = qnVar.f41840a0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            wr wrVar = qnVar.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
        }
    }

    @Override
    public final void d2() {
        qn qnVar = this.f38568c;
        ih.u2 u2Var = qnVar.F1;
        if (u2Var != null) {
            u2Var.I1(null, 0);
        }
        qnVar.X9();
    }

    @Override
    public final void e() {
        org.telegram.ui.Components.ux0 ux0Var = this.f38568c.Z0;
        if (ux0Var != null) {
            ux0Var.f();
        }
    }

    @Override
    public final boolean f1() {
        qn qnVar = this.f38568c;
        TLRPC.User user = qnVar.f41903f;
        if (user != null && !UserObject.isUserSelf(user) && !qnVar.f41903f.bot && qnVar.h == null && qnVar.N3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f38568c.K6();
    }

    @Override
    public final void h0() {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f38568c;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (!kVar.f23577j0) {
            org.telegram.ui.ActionBar.y yVar = qnVar.f41891e0;
            if (yVar != null && !this.f38567b) {
                yVar.f(8);
            }
            if (TextUtils.isEmpty(qnVar.U.getSlowModeTimer())) {
                org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                }
                org.telegram.ui.ActionBar.y yVar2 = qnVar.f41840a0;
                if (yVar2 != null) {
                    yVar2.f(0);
                }
                wr wrVar = qnVar.Z;
                if (wrVar != null) {
                    wrVar.b(true);
                }
            }
        }
    }

    @Override
    public final void h1() {
        int i9;
        qn qnVar = this.f38568c;
        Activity parentActivity = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        long j10 = qnVar.P5;
        MessageSuggestionParams messageSuggestionParams = qnVar.f41870c5;
        if (messageSuggestionParams == null) {
            messageSuggestionParams = MessageSuggestionParams.empty();
        }
        new gh.t0(parentActivity, i9, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new se(qnVar, 3)).show();
    }

    @Override
    public final void i1() {
        this.f38568c.H6();
    }

    @Override
    public final int j() {
        return this.f38568c.T0.R();
    }

    @Override
    public final void j1() {
        boolean z10;
        boolean z11;
        int i9;
        float f10;
        int i10;
        qn qnVar = this.f38568c;
        qnVar.W6();
        ak akVar = qnVar.U;
        boolean z12 = akVar.f26190u3;
        org.telegram.ui.Components.uf ufVar = akVar.Q0;
        if (ufVar != null && ufVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        td.a aVar = qnVar.f42089tc;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
            if (gcVar != null && gcVar.f28739l) {
                gcVar.b();
            }
        } else {
            Activity parentActivity2 = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity2, i9);
        }
        tj tjVar = qnVar.E1;
        float f11 = 0.0f;
        if (tjVar != null) {
            ViewPropertyAnimator animate = tjVar.animate();
            if (!z12 && !qnVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
        }
        org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
        if (ux0Var != null) {
            ux0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = qnVar.Z0.animate();
            if (!z12 && !qnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.gr.f28844f).withEndAction(new eh.f(24, this, z12)).start();
        }
    }

    @Override
    public final TLRPC.Peer k() {
        return null;
    }

    @Override
    public final void k1(View view, CharSequence charSequence, boolean z10) {
        qn qnVar = this.f38568c;
        qnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
        if (w0Var != null && w0Var.getVisibility() != 0) {
            qnVar.f41878d0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = qnVar.f41840a0;
            if (yVar != null) {
                yVar.f(8);
            }
            wr wrVar = qnVar.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
        }
    }

    @Override
    public final void m1(CharSequence charSequence) {
        this.f38568c.Ya(charSequence, true);
    }

    @Override
    public final void n() {
        boolean z10;
        qn qnVar = this.f38568c;
        if (qnVar.f42090u0 != null) {
            qnVar.X = qnVar.U.getBackgroundTop();
        }
        tj tjVar = qnVar.E1;
        if (tjVar != null) {
            tjVar.getAdapter().f19321b0 = true;
        }
        if (qnVar.f41982l5 != null) {
            AndroidUtilities.runOnUIThread(new ri(this, 6), 30L);
        }
        if (qnVar.U.s0()) {
            qnVar.U.e1();
            z10 = true;
        } else {
            z10 = false;
        }
        qnVar.U.V0(true, true, z10);
        if (qnVar.f41971k5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.f41971k5, true);
            qnVar.f41971k5 = 0;
        }
        qnVar.yc(0, true);
        qnVar.hc(false);
        qnVar.Wc(false);
    }

    @Override
    public final boolean n0() {
        int i9;
        qn qnVar = this.f38568c;
        if ((!qnVar.getMessagesController().isForum(qnVar.a()) || qnVar.f41882d4) && (i9 = qnVar.N3) != 9 && qnVar.O3 > 0) {
            if (i9 != 0) {
                if (i9 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean n1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f38568c.f41857b5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(float f10) {
        qn qnVar = this.f38568c;
        if (f10 != 0.0f) {
            qnVar.f42157z4 = true;
        }
        qnVar.o9();
        qnVar.r9();
        qnVar.Mc(false, false);
        qnVar.T0.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
        if (gcVar != null && qnVar.Vb != null) {
            gcVar.l();
        }
    }

    @Override
    public final void p(boolean z10) {
        int i9;
        int i10;
        qn qnVar = this.f38568c;
        if (z10) {
            Activity parentActivity = qnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
            qnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity2, i9);
    }

    @Override
    public final void p0(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f38568c;
        if (qnVar.f41891e0 != null) {
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            final org.telegram.ui.ActionBar.z n10 = kVar.n();
            org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
            if (ux0Var != null) {
                ux0Var.e();
            }
            if (i10 - i9 > 0) {
                org.telegram.ui.ActionBar.y yVar = qnVar.f41891e0;
                if (yVar.f23967o == null) {
                    yVar.f23967o = 1;
                    if (qnVar.f41891e0.f23964l != 0) {
                        if ((qnVar.N3 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId()) || (qnVar.N3 == 0 && ((qnVar.Z3 == 0 || qnVar.f41882d4) && !UserObject.isReplyUser(qnVar.f41903f) && !qnVar.A9()))) {
                            qnVar.f41891e0.f(0);
                            qn.J3(qnVar);
                            org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
                            if (w0Var != null) {
                                w0Var.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar2 = qnVar.f41840a0;
                            if (yVar2 != null) {
                                yVar2.f(8);
                            }
                            wr wrVar = qnVar.Z;
                            if (wrVar != null) {
                                wrVar.b(false);
                            }
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                            ofFloat.setDuration(220L);
                            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                            ofFloat.addListener(new em(this, n10, 0));
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
                qnVar.f42118w4 = i9;
                qnVar.f42131x4 = i10;
                return;
            }
            org.telegram.ui.ActionBar.y yVar3 = qnVar.f41891e0;
            if (yVar3.f23967o != null) {
                yVar3.f23967o = null;
                if (yVar3.f23964l != 8) {
                    if ((qnVar.N3 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId()) || (qnVar.N3 == 0 && ((qnVar.Z3 == 0 || qnVar.f41882d4) && !UserObject.isReplyUser(qnVar.f41903f) && !qnVar.A9()))) {
                        qnVar.f41891e0.f(8);
                        if (qnVar.U.j0() && TextUtils.isEmpty(qnVar.U.getSlowModeTimer())) {
                            org.telegram.ui.ActionBar.w0 w0Var2 = qnVar.f41878d0;
                            if (w0Var2 != null) {
                                w0Var2.setVisibility(8);
                            }
                            org.telegram.ui.ActionBar.y yVar4 = qnVar.f41840a0;
                            if (yVar4 != null) {
                                yVar4.f(0);
                            }
                            wr wrVar2 = qnVar.Z;
                            if (wrVar2 != null) {
                                wrVar2.b(true);
                                return;
                            }
                            return;
                        }
                        org.telegram.ui.ActionBar.w0 w0Var3 = qnVar.f41878d0;
                        if (w0Var3 != null) {
                            w0Var3.setVisibility(0);
                        }
                        org.telegram.ui.ActionBar.y yVar5 = qnVar.f41840a0;
                        if (yVar5 != null) {
                            yVar5.f(8);
                        }
                        wr wrVar3 = qnVar.Z;
                        if (wrVar3 != null) {
                            wrVar3.b(false);
                            return;
                        }
                        return;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    ofFloat2.setDuration(220L);
                    ofFloat2.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    ofFloat2.addListener(new em(this, n10, 1));
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
    public final void q1() {
        int i9;
        qn qnVar = this.f38568c;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        BotForumHelper.getInstance(i9).stopStreaming(qnVar.P5, (int) qnVar.b());
        qnVar.c7(true);
    }

    @Override
    public final void t0() {
        qn qnVar = this.f38568c;
        qnVar.f41975k9 = true;
        bm bmVar = qnVar.f42114w0;
        if (bmVar != null) {
            bmVar.K(true);
        }
    }

    @Override
    public final void u() {
        this.f38568c.Vb(true, false);
    }

    @Override
    public final void u1() {
        int i9;
        int i10;
        qn qnVar = this.f38568c;
        if (!qnVar.z9() && (i9 = qnVar.N3) != 6 && i9 != 8) {
            MessagesController messagesController = qnVar.getMessagesController();
            long j10 = qnVar.P5;
            long j11 = qnVar.Z3;
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            messagesController.sendTyping(j10, j11, 0, i10);
        }
    }

    @Override
    public final void x0() {
        this.f38568c.ja(0, false);
    }

    @Override
    public final void y(CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        of.b1 b1Var;
        MessageObject messageObject;
        int i11;
        long topicId;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        boolean z11;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        qn qnVar = this.f38568c;
        ArrayList arrayList = qnVar.f42042q6;
        if (qnVar.f42090u0 != null) {
            qnVar.X = qnVar.U.getBackgroundTop();
        }
        tj tjVar = qnVar.E1;
        if (tjVar != null && tjVar.getAdapter() != null) {
            qnVar.E1.getAdapter().f19347w.a(charSequence);
        }
        boolean z12 = false;
        if (i9 != 0) {
            if (qnVar.O3 == -1) {
                qnVar.O3 = 0;
            }
            if (charSequence != null) {
                qnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.f41857b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                qnVar.O3 += qnVar.f41857b5.forwardMessages.messages.size();
            }
            qnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = qnVar.f41857b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && qnVar.f41857b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            qnVar.f41857b5.forwardMessages.getSelectedMessages(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(qnVar.P5);
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    MessageObject messageObject2 = arrayList2.get(i12);
                    if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                        break;
                    }
                    i12++;
                } else {
                    z12 = z11;
                    break;
                }
            }
            if (z12) {
                org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(qnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.pi0 pi0Var = ((org.telegram.ui.Components.dc) M.f28733e).f27703a;
                pi0Var.setScaleX(1.8f);
                pi0Var.setScaleY(1.8f);
                M.k(true);
            }
        }
        if (ChatObject.isForum(qnVar.f41890e) && !qnVar.f41882d4 && (messageObject = qnVar.f41959j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                topicId = MessageObject.getTopicId(i11, qnVar.f41959j5.messageOwner, true);
            } else {
                topicId = tL_forumTopic.f22432id;
            }
            long j11 = topicId;
            if (j11 != 0) {
                qnVar.getMediaDataController().cleanDraft(qnVar.P5, j11, false);
            }
        }
        qnVar.zb(false, null, null, null, null, z10, i9, null, false, j10, null, true);
        ak akVar = qnVar.U;
        if (akVar != null && akVar.getEmojiView() != null && (b1Var = qnVar.U.getEmojiView().P0) != null) {
            if (b1Var.f19250e) {
                MessagesController.getInstance(b1Var.f19247a).sendTyping(b1Var.f19248b, b1Var.f19249c, 2, 0);
            }
            b1Var.f19251f = -1L;
        }
        if (!qnVar.getMessagesController().premiumFeaturesBlocked() && qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !qnVar.getMessagesController().didPressTranscribeButtonEnough() && !qnVar.getUserConfig().isPremium() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
            for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                    org.telegram.ui.Components.i21.u(messageObject3, true);
                }
            }
        }
    }
}
