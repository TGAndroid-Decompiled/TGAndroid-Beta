package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
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

public final class hm implements org.telegram.ui.Components.ag {

    public int f38855a;

    public boolean f38856b;

    public final rn f38857c;

    public hm(rn rnVar) {
        this.f38857c = rnVar;
    }

    @Override
    public final void A(float f10, int i10) {
        wk wkVar = this.f38857c.X2;
        if (wkVar != null) {
            wkVar.e(f10, i10);
        }
    }

    @Override
    public final void F() {
        rn rnVar = this.f38857c;
        ck ckVar = rnVar.U;
        boolean z10 = ckVar.f26186u3;
        org.telegram.ui.Components.qf qfVar = ckVar.Q0;
        boolean z11 = false;
        boolean z12 = qfVar != null && qfVar.getCurrentPage() == 0;
        ud.a aVar = rnVar.f42225tc;
        if (z10 && !z12) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final void G(boolean z10) {
        this.f38857c.Vb(false, z10);
    }

    @Override
    public final void I0() {
        rn rnVar = this.f38857c;
        int sendingMessageId = rnVar.getSendMessagesHelper().getSendingMessageId(rnVar.P5);
        if (sendingMessageId != 0) {
            this.f38857c.j(sendingMessageId, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void N() {
        org.telegram.ui.Components.wx0 wx0Var = this.f38857c.Z0;
        if (wx0Var != null) {
            wx0Var.f();
        }
    }

    @Override
    public final void N0(int i10) {
        int i11 = i10 == 0 ? 8 : 0;
        rn rnVar = this.f38857c;
        if (rnVar.Y2.getVisibility() != i11) {
            rnVar.Y2.setVisibility(i11);
        }
    }

    @Override
    public final void N1() {
        org.telegram.ui.Components.wx0 wx0Var = this.f38857c.Z0;
        if (wx0Var != null) {
            wx0Var.e();
        }
    }

    @Override
    public final hn P() {
        return this.f38857c.f42069h5;
    }

    @Override
    public final int P0() {
        return this.f38857c.T0.getHeight();
    }

    @Override
    public final void S1(int i10) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
        rn rnVar = this.f38857c;
        if (i10 < currentActionBarHeight) {
            rnVar.V4 = false;
            if (rnVar.Z0.getVisibility() == 0) {
                rnVar.Z0.setVisibility(4);
            }
        } else {
            rnVar.V4 = true;
            if (rnVar.Z0.getVisibility() == 4 && !rnVar.isInPreviewMode()) {
                rnVar.Z0.setVisibility(0);
            }
        }
        rnVar.W4 = true ^ rnVar.U.t0();
        int i11 = i10 + (rnVar.U.t0() ? 65536 : 0);
        if (this.f38855a != i11) {
            rnVar.X = 0;
        }
        this.f38855a = i11;
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final void U1() {
        jm jmVar;
        int iIndexOfChild;
        rn rnVar = this.f38857c;
        if (rnVar.getParentActivity() != null) {
            if ((rnVar.f42026e == null && rnVar.W7 == null) || rnVar.fragmentView == null) {
                return;
            }
            org.telegram.ui.Components.x30 x30Var = rnVar.f41989b2;
            if ((x30Var == null || x30Var.getVisibility() != 0) && (iIndexOfChild = (jmVar = rnVar.T0).indexOfChild(rnVar.O)) != -1) {
                try {
                    rnVar.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (rnVar.f41989b2 == null) {
                    org.telegram.ui.Components.x30 x30Var2 = new org.telegram.ui.Components.x30(9, rnVar.getParentActivity(), rnVar.f41983aa, false);
                    rnVar.f41989b2 = x30Var2;
                    x30Var2.setVisibility(8);
                    jmVar.addView(rnVar.f41989b2, iIndexOfChild + 1, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                TLRPC.UserFull userFull = rnVar.W7;
                if (userFull != null && userFull.voice_messages_forbidden) {
                    rnVar.f41989b2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(rnVar.U.Y0 ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, rnVar.f42039f.first_name)));
                } else if (ChatObject.canSendVoice(rnVar.f42026e) || ChatObject.canSendRoundVideo(rnVar.f42026e)) {
                    if (ChatObject.isActionBannedByDefault(rnVar.f42026e, 20)) {
                        rnVar.f41989b2.setText(LocaleController.getString(R.string.GlobalAttachVoiceRestricted));
                    } else if (ChatObject.isActionBannedByDefault(rnVar.f42026e, 21)) {
                        rnVar.f41989b2.setText(LocaleController.getString(R.string.GlobalAttachRoundRestricted));
                    } else if (ChatObject.isActionBannedByDefault(rnVar.f42026e, 7)) {
                        rnVar.f41989b2.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = rnVar.f42026e.banned_rights;
                        if (tL_chatBannedRights == null) {
                            return;
                        }
                        if (AndroidUtilities.isBannedForever(tL_chatBannedRights)) {
                            rnVar.f41989b2.setText(LocaleController.getString(R.string.AttachMediaRestrictedForever));
                        } else {
                            rnVar.f41989b2.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(rnVar.f42026e.banned_rights.until_date)));
                        }
                    }
                } else {
                    if (rnVar.K6()) {
                        return;
                    }
                    if (rnVar.U.Y0) {
                        rnVar.f41989b2.setText(ChatObject.getRestrictedErrorText(rnVar.f42026e, 21));
                    } else {
                        rnVar.f41989b2.setText(ChatObject.getRestrictedErrorText(rnVar.f42026e, 20));
                    }
                }
                View sendButton = rnVar.U.getSendButton();
                View audioVideoButtonContainer = rnVar.U.getAudioVideoButtonContainer();
                if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                    sendButton = audioVideoButtonContainer;
                }
                rnVar.f41989b2.f(sendButton, true);
            }
        }
    }

    @Override
    public final void W1(boolean z10) {
        rn rnVar = this.f38857c;
        View view = rnVar.f42202s2;
        if (view != null) {
            view.setVisibility(8);
        }
        rnVar.X4 = !z10;
    }

    @Override
    public final boolean X0(long j10) {
        return false;
    }

    @Override
    public final void X1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        rn rnVar = this.f38857c;
        if (rnVar.X2 == null && CameraView.isCameraAllowed() && rnVar.getParentActivity() != null) {
            wk wkVar = new wk(rnVar, rnVar.getParentActivity(), rnVar, rnVar.f41983aa);
            rnVar.X2 = wkVar;
            wkVar.setClipToPadding(false);
            wk wkVar2 = rnVar.X2;
            jg.a aVar = rnVar.F;
            zi ziVar = rnVar.f42251w;
            LinearLayout linearLayout = wkVar2.N0;
            lg.d dVarC = aVar.c(linearLayout, ziVar, false);
            dVarC.o(AndroidUtilities.dp(6.0f));
            dVarC.p(AndroidUtilities.dp(21.0f));
            linearLayout.setBackground(dVarC);
            int iIndexOfChild = rnVar.T0.indexOfChild(rnVar.O);
            if (iIndexOfChild < 0) {
                iIndexOfChild = rnVar.T0.getChildCount();
            }
            rnVar.T0.addView(rnVar.X2, Math.min(iIndexOfChild + 1, rnVar.T0.getChildCount()), h7.z5.e(-1, -1, 51));
        }
        wk wkVar3 = rnVar.X2;
        if (wkVar3 != null) {
            if (i10 == 0) {
                wkVar3.l(false);
                rnVar.f42213t0.B0();
                rnVar.f42252w0.T();
            } else if (i10 == 1 || i10 == 3 || i10 == 4) {
                wkVar3.k(i10, i11, i12, j10, j11, z10);
            } else if (i10 == 2 || i10 == 5) {
                wkVar3.d(i10 == 2);
            }
        }
    }

    @Override
    public final boolean b1() {
        wk wkVar = this.f38857c.X2;
        return (wkVar == null || wkVar.f29968a0) ? false : true;
    }

    @Override
    public final void c() {
        this.f38857c.vc();
    }

    @Override
    public final void c1(CharSequence charSequence, boolean z10, boolean z11) {
        CharSequence charSequence2;
        org.telegram.ui.Components.x30 x30Var;
        TLRPC.ChatFull chatFull;
        MediaController mediaController = MediaController.getInstance();
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        rn rnVar = this.f38857c;
        mediaController.setInputFieldHasText(!zIsEmpty || rnVar.U.r0());
        vj vjVar = rnVar.E1;
        if (vjVar == null || vjVar.getAdapter() == null) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            rnVar.E1.getAdapter().U(charSequence2, rnVar.U.getCursorPosition(), rnVar.q6, false, false);
        }
        o0.m mVar = rnVar.F5;
        if (mVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mVar);
            rnVar.F5 = null;
        }
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat == null || ChatObject.canSendEmbed(chat)) {
            ck ckVar = rnVar.U;
            if (ckVar.T2 && (!ckVar.r0() || !rnVar.U.V1)) {
                if (z10) {
                    rnVar.Ya(charSequence2, true);
                } else {
                    rnVar.M6(charSequence2);
                    o0.m mVar2 = new o0.m(this, charSequence2, false, 1);
                    rnVar.F5 = mVar2;
                    AndroidUtilities.runOnUIThread(mVar2, AndroidUtilities.WEB_URL == null ? 3000L : 1000L);
                }
            }
        }
        nk nkVar = rnVar.f42223ta;
        if (nkVar != null) {
            ArrayList arrayList = nkVar.B;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ry) arrayList.get(i10)).f42370n = true;
            }
        }
        ig.m0 m0Var = ig.m0.B;
        if (m0Var != null) {
            m0Var.f11360l = true;
        }
        ig.m0 m0Var2 = ig.m0.C;
        if (m0Var2 != null) {
            m0Var2.f11360l = true;
        }
        if (z11) {
            return;
        }
        yi yiVar = rnVar.f42003c2;
        if ((yiVar != null && yiVar.getVisibility() == 0) || ((x30Var = rnVar.f42029e2) != null && x30Var.getVisibility() == 0)) {
            yi yiVar2 = rnVar.f42003c2;
            if (yiVar2 != null) {
                yiVar2.b(true);
            }
            org.telegram.ui.Components.x30 x30Var2 = rnVar.f42029e2;
            if (x30Var2 != null) {
                x30Var2.b(true);
                return;
            }
            return;
        }
        gf gfVar = rnVar.Ja;
        if (UserObject.isUserSelf(rnVar.f42039f) || ((chatFull = rnVar.V7) != null && chatFull.slowmode_next_send_date > 0 && rnVar.N3 == 0)) {
            z12 = true;
        }
        if (rnVar.f42042f2 || rnVar.f42015d2 || z12 || SharedConfig.scheduledHintShows >= 3 || rnVar.U.r0()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(gfVar);
        AndroidUtilities.runOnUIThread(gfVar, 4000L);
    }

    @Override
    public final void e() {
        org.telegram.ui.Components.wx0 wx0Var = this.f38857c.Z0;
        if (wx0Var != null) {
            wx0Var.f();
        }
    }

    @Override
    public final void e2() {
        rn rnVar = this.f38857c;
        yi yiVar = rnVar.f42003c2;
        if (yiVar != null) {
            yiVar.b(true);
        }
        org.telegram.ui.Components.x30 x30Var = rnVar.f42029e2;
        if (x30Var != null) {
            x30Var.b(true);
        }
    }

    @Override
    public final void f1() {
        wk wkVar = this.f38857c.X2;
        if (wkVar != null) {
            wkVar.q();
        }
    }

    @Override
    public final boolean g() {
        return this.f38857c.K6();
    }

    @Override
    public final void g0() {
        rn rnVar = this.f38857c;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.f23578j0) {
            return;
        }
        org.telegram.ui.ActionBar.y yVar = rnVar.f42027e0;
        if (yVar != null && !this.f38856b) {
            yVar.f(8);
        }
        if (TextUtils.isEmpty(rnVar.U.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar2 = rnVar.f41975a0;
            if (yVar2 != null) {
                yVar2.f(0);
            }
            xr xrVar = rnVar.Z;
            if (xrVar != null) {
                xrVar.b(true);
            }
        }
    }

    @Override
    public final boolean g1() {
        rn rnVar = this.f38857c;
        TLRPC.User user = rnVar.f42039f;
        return (user == null || UserObject.isUserSelf(user) || rnVar.f42039f.bot || rnVar.h != null || rnVar.N3 != 0) ? false : true;
    }

    @Override
    public final int i() {
        return this.f38857c.T0.R();
    }

    @Override
    public final void i1() {
        rn rnVar = this.f38857c;
        Activity parentActivity = rnVar.getParentActivity();
        int i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
        long j10 = rnVar.P5;
        MessageSuggestionParams messageSuggestionParamsEmpty = rnVar.f42006c5;
        if (messageSuggestionParamsEmpty == null) {
            messageSuggestionParamsEmpty = MessageSuggestionParams.empty();
        }
        new hh.t0(parentActivity, i10, j10, messageSuggestionParamsEmpty, rnVar, rnVar.getResourceProvider(), 0, new se(rnVar, 3)).show();
    }

    @Override
    public final void j1() {
        this.f38857c.H6();
    }

    @Override
    public final void k1() {
        rn rnVar = this.f38857c;
        rnVar.W6();
        ck ckVar = rnVar.U;
        boolean z10 = ckVar.f26186u3;
        org.telegram.ui.Components.qf qfVar = ckVar.Q0;
        rnVar.f42225tc.a(z10 && !(qfVar != null && qfVar.getCurrentPage() == 0), true);
        if (z10) {
            AndroidUtilities.setAdjustResizeToNothing(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
            if (ecVar != null && ecVar.f28022l) {
                ecVar.b();
            }
        } else {
            AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        }
        vj vjVar = rnVar.E1;
        float f10 = 0.0f;
        if (vjVar != null) {
            vjVar.animate().alpha((z10 || rnVar.isInPreviewMode()) ? 0.0f : 1.0f).setInterpolator(org.telegram.ui.Components.er.f28122f).start();
        }
        org.telegram.ui.Components.wx0 wx0Var = rnVar.Z0;
        if (wx0Var != null) {
            wx0Var.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = rnVar.Z0.animate();
            if (!z10 && !rnVar.isInPreviewMode()) {
                f10 = 1.0f;
            }
            viewPropertyAnimatorAnimate.alpha(f10).setInterpolator(org.telegram.ui.Components.er.f28122f).withEndAction(new fh.f(24, this, z10)).start();
        }
    }

    @Override
    public final TLRPC.Peer l() {
        return null;
    }

    @Override
    public final void l1(View view, CharSequence charSequence, boolean z10) {
        rn rnVar = this.f38857c;
        rnVar.Sb(view, charSequence, z10);
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
        if (v0Var == null || v0Var.getVisibility() == 0) {
            return;
        }
        rnVar.f42013d0.setVisibility(0);
        org.telegram.ui.ActionBar.y yVar = rnVar.f41975a0;
        if (yVar != null) {
            yVar.f(8);
        }
        xr xrVar = rnVar.Z;
        if (xrVar != null) {
            xrVar.b(false);
        }
    }

    @Override
    public final void l2() {
        rn rnVar = this.f38857c;
        if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.f23578j0) {
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        org.telegram.ui.ActionBar.y yVar = rnVar.f42027e0;
        if (yVar != null && !this.f38856b) {
            yVar.f(8);
        }
        org.telegram.ui.ActionBar.y yVar2 = rnVar.f41975a0;
        if (yVar2 != null) {
            yVar2.f(8);
        }
        xr xrVar = rnVar.Z;
        if (xrVar != null) {
            xrVar.b(false);
        }
    }

    @Override
    public final void m() {
        boolean z10;
        rn rnVar = this.f38857c;
        if (rnVar.f42226u0 != null) {
            rnVar.X = rnVar.U.getBackgroundTop();
        }
        vj vjVar = rnVar.E1;
        if (vjVar != null) {
            vjVar.getAdapter().f45922b0 = true;
        }
        if (rnVar.f42119l5 != null) {
            AndroidUtilities.runOnUIThread(new ti(this, 6), 30L);
        }
        if (rnVar.U.t0()) {
            rnVar.U.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        rnVar.U.U0(true, true, z10);
        if (rnVar.f42108k5 != 0) {
            rnVar.getConnectionsManager().cancelRequest(rnVar.f42108k5, true);
            rnVar.f42108k5 = 0;
        }
        rnVar.yc(0, true);
        rnVar.hc(false);
        rnVar.Wc(false);
    }

    @Override
    public final void n(float f10) {
        rn rnVar = this.f38857c;
        if (f10 != 0.0f) {
            rnVar.f42294z4 = true;
        }
        rnVar.o9();
        rnVar.r9();
        rnVar.Mc(false, false);
        rnVar.T0.invalidate();
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar == null || rnVar.Vb == null) {
            return;
        }
        ecVar.l();
    }

    @Override
    public final boolean n0() {
        int i10;
        rn rnVar = this.f38857c;
        if ((rnVar.getMessagesController().isForum(rnVar.a()) && !rnVar.f42017d4) || (i10 = rnVar.N3) == 9 || rnVar.O3 <= 0) {
            return false;
        }
        if (i10 != 0) {
            return i10 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId();
        }
        return true;
    }

    @Override
    public final void n1(CharSequence charSequence) {
        this.f38857c.Ya(charSequence, true);
    }

    @Override
    public final void o0(int i10, int i11) {
        rn rnVar = this.f38857c;
        if (rnVar.f42027e0 == null) {
            return;
        }
        final org.telegram.ui.ActionBar.z zVarN = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.n();
        org.telegram.ui.Components.wx0 wx0Var = rnVar.Z0;
        if (wx0Var != null) {
            wx0Var.e();
        }
        final int i12 = 1;
        final int i13 = 0;
        if (i11 - i10 > 0) {
            org.telegram.ui.ActionBar.y yVar = rnVar.f42027e0;
            if (yVar.f23969o == null) {
                yVar.f23969o = 1;
                if (rnVar.f42027e0.f23966l != 0) {
                    if (!(rnVar.N3 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId()) && (rnVar.N3 != 0 || (!(rnVar.Z3 == 0 || rnVar.f42017d4) || UserObject.isReplyUser(rnVar.f42039f) || rnVar.A9()))) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(48.0f), 0.0f);
                        valueAnimatorOfFloat.setDuration(220L);
                        valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
                        valueAnimatorOfFloat.addListener(new gm(this, zVarN, 0));
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        zVarN.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                    default:
                                        zVarN.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat.start();
                    } else {
                        rnVar.f42027e0.f(0);
                        rn.J3(rnVar);
                        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        org.telegram.ui.ActionBar.y yVar2 = rnVar.f41975a0;
                        if (yVar2 != null) {
                            yVar2.f(8);
                        }
                        xr xrVar = rnVar.Z;
                        if (xrVar != null) {
                            xrVar.b(false);
                        }
                    }
                }
            }
            rnVar.f42256w4 = i10;
            rnVar.f42268x4 = i11;
            return;
        }
        org.telegram.ui.ActionBar.y yVar3 = rnVar.f42027e0;
        if (yVar3.f23969o != null) {
            yVar3.f23969o = null;
            if (yVar3.f23966l != 8) {
                if (!(rnVar.N3 == 3 && rnVar.I8() == rnVar.getUserConfig().getClientUserId()) && (rnVar.N3 != 0 || (!(rnVar.Z3 == 0 || rnVar.f42017d4) || UserObject.isReplyUser(rnVar.f42039f) || rnVar.A9()))) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, AndroidUtilities.dp(48.0f));
                    valueAnimatorOfFloat2.setDuration(220L);
                    valueAnimatorOfFloat2.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    valueAnimatorOfFloat2.addListener(new gm(this, zVarN, 1));
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i12) {
                                case 0:
                                    zVarN.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                                default:
                                    zVarN.r(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat2.start();
                    return;
                }
                rnVar.f42027e0.f(8);
                if (rnVar.U.k0() && TextUtils.isEmpty(rnVar.U.getSlowModeTimer())) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = rnVar.f42013d0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar4 = rnVar.f41975a0;
                    if (yVar4 != null) {
                        yVar4.f(0);
                    }
                    xr xrVar2 = rnVar.Z;
                    if (xrVar2 != null) {
                        xrVar2.b(true);
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.v0 v0Var3 = rnVar.f42013d0;
                if (v0Var3 != null) {
                    v0Var3.setVisibility(0);
                }
                org.telegram.ui.ActionBar.y yVar5 = rnVar.f41975a0;
                if (yVar5 != null) {
                    yVar5.f(8);
                }
                xr xrVar3 = rnVar.Z;
                if (xrVar3 != null) {
                    xrVar3.b(false);
                }
            }
        }
    }

    @Override
    public final boolean o1() {
        MessagePreviewParams.Messages messages;
        MessagePreviewParams messagePreviewParams = this.f38857c.f41992b5;
        return (messagePreviewParams == null || (messages = messagePreviewParams.forwardMessages) == null || messages.messages.isEmpty()) ? false : true;
    }

    @Override
    public final void q0() {
        rn rnVar = this.f38857c;
        rnVar.f42112k9 = true;
        dm dmVar = rnVar.f42252w0;
        if (dmVar != null) {
            dmVar.K(true);
        }
    }

    @Override
    public final void q2() {
        rn rnVar = this.f38857c;
        jh.t2 t2Var = rnVar.F1;
        if (t2Var != null) {
            t2Var.I1(null, 0);
        }
        rnVar.X9();
    }

    @Override
    public final void r(boolean z10) {
        rn rnVar = this.f38857c;
        if (!z10) {
            AndroidUtilities.requestAdjustResize(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
        } else {
            AndroidUtilities.setAdjustResizeToNothing(rnVar.getParentActivity(), ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
            rnVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void r1() {
        rn rnVar = this.f38857c;
        BotForumHelper.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).stopStreaming(rnVar.P5, (int) rnVar.b());
        rnVar.c7(true);
    }

    @Override
    public final void s() {
        this.f38857c.Vb(true, false);
    }

    @Override
    public final void w(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        org.telegram.ui.Components.ow owVar;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        TLRPC.Message message;
        MessagePreviewParams.Messages messages2;
        rn rnVar = this.f38857c;
        ArrayList arrayList = rnVar.q6;
        if (rnVar.f42226u0 != null) {
            rnVar.X = rnVar.U.getBackgroundTop();
        }
        vj vjVar = rnVar.E1;
        if (vjVar != null && vjVar.getAdapter() != null) {
            rnVar.E1.getAdapter().f45948w.a(charSequence);
        }
        boolean z11 = false;
        if (i10 != 0) {
            if (rnVar.O3 == -1) {
                rnVar.O3 = 0;
            }
            if (charSequence != null) {
                rnVar.O3++;
            }
            MessagePreviewParams messagePreviewParams2 = rnVar.f41992b5;
            if (messagePreviewParams2 != null && (messages2 = messagePreviewParams2.forwardMessages) != null && !messages2.messages.isEmpty()) {
                rnVar.O3 += rnVar.f41992b5.forwardMessages.messages.size();
            }
            rnVar.Ec(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (messagePreviewParams = rnVar.f41992b5) != null && (messages = messagePreviewParams.forwardMessages) != null && !messages.messages.isEmpty() && rnVar.f41992b5.quote == null && j10 <= 0) {
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            rnVar.f41992b5.forwardMessages.getSelectedMessages(arrayList2);
            boolean z12 = arrayList2.size() > 0;
            TLRPC.Peer peer = rnVar.getMessagesController().getPeer(rnVar.P5);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    z11 = z12;
                    break;
                }
                MessageObject messageObject2 = arrayList2.get(i12);
                if (messageObject2 != null && (message = messageObject2.messageOwner) != null && !MessageObject.peersEqual(message.peer_id, peer)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (z11) {
                org.telegram.ui.Components.ec ecVarM = org.telegram.ui.Components.mc.a0(rnVar).M(LocaleController.getString(R.string.SwipeToReplyHint), LocaleController.getString(R.string.SwipeToReplyHintMessage), R.raw.hint_swipe_reply);
                org.telegram.ui.Components.ri0 ri0Var = ((org.telegram.ui.Components.bc) ecVarM.f28016e).f27063a;
                ri0Var.setScaleX(1.8f);
                ri0Var.setScaleY(1.8f);
                ecVarM.k(true);
            }
        }
        if (ChatObject.isForum(rnVar.f42026e) && !rnVar.f42017d4 && (messageObject = rnVar.f42095j5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            long topicId = tL_forumTopic != null ? tL_forumTopic.f22432id : MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f42095j5.messageOwner, true);
            if (topicId != 0) {
                rnVar.getMediaDataController().cleanDraft(rnVar.P5, topicId, false);
            }
        }
        rnVar.yb(false, null, null, null, null, z10, i10, null, false, j10, null, true);
        ck ckVar = rnVar.U;
        if (ckVar != null && ckVar.getEmojiView() != null && (owVar = rnVar.U.getEmojiView().P0) != null) {
            if (owVar.f31418e) {
                MessagesController.getInstance(owVar.f31415a).sendTyping(owVar.f31416b, owVar.f31417c, 2, 0);
            }
            owVar.f31419f = -1L;
        }
        if (rnVar.getMessagesController().premiumFeaturesBlocked() || rnVar.getMessagesController().transcribeAudioTrialWeeklyNumber > 0 || rnVar.getMessagesController().didPressTranscribeButtonEnough() || rnVar.getUserConfig().isPremium() || TextUtils.isEmpty(charSequence) || arrayList == null) {
            return;
        }
        for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
            MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
            if (messageObject3 != null && !messageObject3.isOutOwner() && ((messageObject3.isVoice() || messageObject3.isRoundVideo()) && messageObject3.isContentUnread())) {
                org.telegram.ui.Components.k21.u(messageObject3, true);
            }
        }
    }

    @Override
    public final void w0() {
        this.f38857c.ja(0, false);
    }

    @Override
    public final void w1() {
        int i10;
        rn rnVar = this.f38857c;
        if (rnVar.z9() || (i10 = rnVar.N3) == 6 || i10 == 8) {
            return;
        }
        rnVar.getMessagesController().sendTyping(rnVar.P5, rnVar.Z3, 0, ((org.telegram.ui.ActionBar.n2) rnVar).classGuid);
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers y() {
        return this.f38857c.f42023da;
    }
}
