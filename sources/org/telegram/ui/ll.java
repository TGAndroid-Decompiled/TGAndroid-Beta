package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements org.telegram.ui.Components.wf {
    public int f47553a;
    public final an f47554b;

    public ll(an anVar) {
        this.f47554b = anVar;
    }

    @Override
    public final void B(boolean z9) {
        int i7;
        int i10;
        an anVar = this.f47554b;
        if (z9) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            anVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity2, i7);
    }

    @Override
    public final void C0() {
        this.f47554b.Ja(0, false);
    }

    @Override
    public final void D() {
        this.f47554b.yc(true, false);
    }

    @Override
    public final void E() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47554b.f43942r1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override
    public final void F(CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        boolean z10;
        jg.e1 e1Var;
        org.telegram.messenger.ij ijVar;
        int i11;
        long c22;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        boolean z11;
        TLRPC.Message message;
        org.telegram.messenger.kj kjVar2;
        an anVar = this.f47554b;
        ArrayList arrayList = anVar.K6;
        if (anVar.A0 != null) {
            anVar.f43751c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            anVar.W1.getAdapter().f16803x.a(charSequence);
        }
        if (i7 != 0) {
            if (anVar.f43808g4 == -1) {
                anVar.f43808g4 = 0;
            }
            if (charSequence != null) {
                anVar.f43808g4++;
            }
            org.telegram.messenger.mj mjVar2 = anVar.f43996v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.f24031b) != null && !kjVar2.f23700e.isEmpty()) {
                anVar.f43808g4 += anVar.f43996v5.f24031b.f23700e.size();
            }
            anVar.id(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = anVar.f43996v5) != null && (kjVar = mjVar.f24031b) != null && !kjVar.f23700e.isEmpty() && anVar.f43996v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            anVar.f43996v5.f24031b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer z12 = anVar.getMessagesController().z1(anVar.f43848j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.f23262k) != null && !org.telegram.messenger.ij.w5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(anVar).I(2131624047, org.telegram.messenger.id.M0(2131744309, null), org.telegram.messenger.id.M0(2131744308, null));
                org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Components.zb) I.f32541e).f40946a;
                ch0Var.setScaleX(1.8f);
                ch0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(anVar.f43777e) && !anVar.f43995v4 && (ijVar = anVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23250h1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                c22 = org.telegram.messenger.ij.c2(i11, anVar.D5.f23262k, true, false);
            } else {
                c22 = tL_forumTopic.f27008id;
            }
            long j10 = c22;
            if (j10 != 0) {
                anVar.getMediaDataController().D(anVar.f43848j6, j10, false);
            }
        }
        anVar.bc(false, null, null, null, z9, i7, null, false, j3, true);
        qj qjVar = anVar.Z;
        if (qjVar != null && qjVar.getEmojiView() != null && (e1Var = anVar.Z.getEmojiView().T0) != null) {
            if (e1Var.f16720e) {
                org.telegram.messenger.qp.s1(e1Var.f16717a).C4(2, 0, e1Var.f16718b, e1Var.f16719c, null);
            }
            e1Var.f16721f = -1L;
        }
        if (!anVar.getMessagesController().D3() && anVar.getMessagesController().f24894s4 <= 0) {
            if (anVar.getMessagesController().i7 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !anVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
                    if (ijVar3 != null && !ijVar3.Q3() && ((org.telegram.messenger.ij.S4(ijVar3.f23262k) || ijVar3.i4()) && ijVar3.f23262k.media_unread)) {
                        org.telegram.ui.Components.s11.r(ijVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.f47554b.Aa;
    }

    @Override
    public final void I0() {
        an anVar = this.f47554b;
        org.telegram.messenger.gz sendMessagesHelper = anVar.getSendMessagesHelper();
        long j3 = anVar.f43848j6;
        SparseArray sparseArray = sendMessagesHelper.f22767e;
        SparseArray sparseArray2 = sendMessagesHelper.f22766c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f26977id;
                    break;
                }
                i10++;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= sparseArray.size()) {
                        break;
                    }
                    TLRPC.Message message2 = (TLRPC.Message) sparseArray.valueAt(i11);
                    if (message2.dialog_id == j3) {
                        i7 = message2.f26977id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f47554b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void M(float f10, int i7) {
        org.telegram.ui.Components.t40 t40Var = this.f47554b.f43917p3;
        if (t40Var != null) {
            t40Var.b(f10, i7);
        }
    }

    @Override
    public final void R0(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        an anVar = this.f47554b;
        if (anVar.f43930q3.getVisibility() != i10) {
            anVar.f43930q3.setVisibility(i10);
        }
    }

    @Override
    public final int S0() {
        return this.f47554b.l1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47554b.f43942r1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override
    public final boolean V0(long j3) {
        return false;
    }

    @Override
    public final void V1(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        an anVar = this.f47554b;
        if (i7 < currentActionBarHeight) {
            anVar.f43919p5 = false;
            if (anVar.f43942r1.getVisibility() == 0) {
                anVar.f43942r1.setVisibility(4);
            }
        } else {
            anVar.f43919p5 = true;
            if (anVar.f43942r1.getVisibility() == 4 && !anVar.isInPreviewMode()) {
                anVar.f43942r1.setVisibility(0);
            }
        }
        anVar.f43932q5 = true ^ anVar.Z.s0();
        if (anVar.Z.s0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f47553a != i11) {
            anVar.f43751c0 = 0;
        }
        this.f47553a = i11;
    }

    @Override
    public final void W() {
        boolean z9;
        an anVar = this.f47554b;
        qj qjVar = anVar.Z;
        boolean z10 = qjVar.f31164z3;
        org.telegram.ui.Components.mf mfVar = qjVar.U0;
        boolean z11 = false;
        if (mfVar != null && mfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = anVar.bd;
        if (z10 && !z9) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final boolean X0() {
        org.telegram.ui.Components.t40 t40Var = this.f47554b.f43917p3;
        if (t40Var != null && t40Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        int indexOfChild;
        int i7;
        an anVar = this.f47554b;
        if (anVar.getParentActivity() != null) {
            if ((anVar.f43777e != null || anVar.f43935q8 != null) && anVar.fragmentView != null) {
                fi.m3 m3Var = anVar.f43968t2;
                if ((m3Var == null || !m3Var.V) && (indexOfChild = anVar.l1.indexOfChild(anVar.T)) != -1) {
                    try {
                        anVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (anVar.f43968t2 == null) {
                        anVar.f43968t2 = anVar.D6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = anVar.f43935q8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        fi.m3 m3Var2 = anVar.f43968t2;
                        if (anVar.Z.f31029c1) {
                            i7 = 2131743597;
                        } else {
                            i7 = 2131743523;
                        }
                        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i7, anVar.f43791f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(anVar.f43777e) && !org.telegram.messenger.t3.s(anVar.f43777e)) {
                        if (!anVar.Y6()) {
                            if (anVar.Z.f31029c1) {
                                anVar.f43968t2.u(org.telegram.messenger.t3.L(21, anVar.f43777e));
                            } else {
                                anVar.f43968t2.u(org.telegram.messenger.t3.L(20, anVar.f43777e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, anVar.f43777e)) {
                        anVar.f43968t2.u(org.telegram.messenger.id.M0(2131749538, null));
                    } else if (org.telegram.messenger.t3.P(21, anVar.f43777e)) {
                        anVar.f43968t2.u(org.telegram.messenger.id.M0(2131749541, null));
                    } else if (org.telegram.messenger.t3.P(7, anVar.f43777e)) {
                        anVar.f43968t2.u(org.telegram.messenger.id.M0(2131749544, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = anVar.f43777e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                anVar.f43968t2.u(org.telegram.messenger.id.M0(2131753955, null));
                            } else {
                                anVar.f43968t2.u(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(anVar.f43777e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = anVar.Z.getSendButton();
                    View audioVideoButtonContainer = anVar.Z.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    anVar.f43968t2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Y(boolean z9) {
        this.f47554b.yc(false, z9);
    }

    @Override
    public final void Y1(boolean z9) {
        an anVar = this.f47554b;
        View view = anVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        anVar.f43946r5 = !z9;
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        org.telegram.ui.Components.t40 o40Var;
        an anVar = this.f47554b;
        boolean z10 = false;
        if (anVar.f43917p3 == null && CameraView.isCameraAllowed() && anVar.getParentActivity() != null) {
            Activity parentActivity = anVar.getParentActivity();
            ym ymVar = anVar.f44028xa;
            if (org.telegram.ui.Components.t40.e(org.telegram.messenger.p10.f24470s0)) {
                o40Var = new org.telegram.ui.Components.n40(parentActivity, anVar, ymVar);
            } else {
                o40Var = new org.telegram.ui.Components.o40(parentActivity, anVar, ymVar, true);
            }
            anVar.f43917p3 = o40Var;
            o40Var.setAnimationCallback(new fe(anVar, 0));
            anVar.f43917p3.setTrimCallback(new fe(anVar, 1));
            anVar.f43917p3.setRecordingUiFrameCallback(new wi(anVar));
            anVar.f43917p3.setClipToPadding(false);
            anVar.f43917p3.i(anVar.K, anVar.f44017x);
            int indexOfChild = anVar.l1.indexOfChild(anVar.T);
            if (indexOfChild < 0) {
                indexOfChild = anVar.l1.getChildCount();
            }
            anVar.l1.addView(anVar.f43917p3, Math.min(indexOfChild + 1, anVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.t40 t40Var = anVar.f43917p3;
        if (t40Var != null) {
            if (i7 == 0) {
                t40Var.j(false);
                anVar.f44043z0.C0();
                anVar.C0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z10 = true;
                    }
                    t40Var.a(z10);
                }
            } else {
                t40Var.h(i7, i10, i11, j3, j10, z9);
            }
        }
    }

    @Override
    public final void a() {
        this.f47554b.Zc();
    }

    @Override
    public final void a1(CharSequence charSequence, boolean z9, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        long j3;
        fi.m3 m3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = false;
        an anVar = this.f47554b;
        if (isEmpty && !anVar.Z.q0()) {
            z11 = false;
        } else {
            z11 = true;
        }
        B.M = z11;
        jj jjVar = anVar.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            anVar.W1.getAdapter().U(charSequence2, anVar.Z.getCursorPosition(), anVar.K6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = anVar.Z5;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            anVar.Z5 = null;
        }
        TLRPC.Chat chat = anVar.f43777e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            qj qjVar = anVar.Z;
            if (qjVar.Y2 && (!qjVar.q0() || !anVar.Z.f31016a2)) {
                if (z9) {
                    anVar.yb(charSequence2, true);
                } else {
                    anVar.a7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 28);
                    anVar.Z5 = uVar2;
                    if (org.telegram.messenger.g0.S == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    org.telegram.messenger.g0.i3(uVar2, j3);
                }
            }
        }
        zj zjVar = anVar.Qa;
        if (zjVar != null) {
            ArrayList arrayList = zjVar.F;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((hx) arrayList.get(i7)).f46514n = true;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.f6291l = true;
        }
        ch.k0 k0Var2 = ch.k0.C;
        if (k0Var2 != null) {
            k0Var2.f6291l = true;
        }
        if (!z10) {
            fi.m3 m3Var2 = anVar.f43980u2;
            if ((m3Var2 != null && m3Var2.V) || ((m3Var = anVar.f44007w2) != null && m3Var.V)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                fi.m3 m3Var3 = anVar.f44007w2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            xf xfVar = anVar.f43828hb;
            if (org.telegram.messenger.t10.B(anVar.f43791f) || ((chatFull = anVar.f43922p8) != null && chatFull.slowmode_next_send_date > 0 && anVar.f43796f4 == 0)) {
                z12 = true;
            }
            if (!anVar.f44020x2 && !anVar.f43993v2 && !z12 && org.telegram.messenger.iz.M < 3 && !anVar.Z.q0()) {
                org.telegram.messenger.g0.r(xfVar);
                org.telegram.messenger.g0.i3(xfVar, 4000L);
            }
        }
    }

    @Override
    public final void b() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47554b.f43942r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final boolean c() {
        return this.f47554b.Y6();
    }

    @Override
    public final void c1() {
        org.telegram.ui.Components.t40 t40Var = this.f47554b.f43917p3;
        if (t40Var != null) {
            t40Var.k();
        }
    }

    @Override
    public final boolean d1() {
        an anVar = this.f47554b;
        TLRPC.User user = anVar.f43791f;
        if (user != null && !org.telegram.messenger.t10.B(user) && !anVar.f43791f.bot && anVar.h == null && anVar.f43796f4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d2() {
        an anVar = this.f47554b;
        fi.m3 m3Var = anVar.f43980u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = anVar.f44007w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void e1() {
        int i7;
        an anVar = this.f47554b;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        long j3 = anVar.f43848j6;
        org.telegram.messenger.nj njVar = anVar.f44010w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, anVar, anVar.getResourceProvider(), 0, new ne(anVar, 1)).show();
    }

    @Override
    public final void f1() {
        this.f47554b.V6();
    }

    @Override
    public final void h1() {
        boolean z9;
        boolean z10;
        int i7;
        float f10;
        int i10;
        an anVar = this.f47554b;
        anVar.k7();
        qj qjVar = anVar.Z;
        boolean z11 = qjVar.f31164z3;
        org.telegram.ui.Components.mf mfVar = qjVar.U0;
        if (mfVar != null && mfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = anVar.bd;
        if (z11 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        if (z11) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
            if (ccVar != null && ccVar.f32547l) {
                ccVar.b();
            }
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        jj jjVar = anVar.W1;
        float f11 = 0.0f;
        if (jjVar != null) {
            ViewPropertyAnimator animate = jjVar.animate();
            if (!z11 && !anVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40366f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = anVar.f43942r1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = anVar.f43942r1.animate();
            if (!z11 && !anVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40366f).withEndAction(new bi.k1(20, this, z11)).start();
        }
    }

    @Override
    public final void h2() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f47554b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (!kVar.f27680n0) {
            org.telegram.ui.ActionBar.r0 r0Var = anVar.f43831i0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f43792f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = anVar.f43778e0;
            if (crVar != null) {
                crVar.b(false);
            }
        }
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        an anVar = this.f47554b;
        anVar.vc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = anVar.f43831i0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            anVar.f43831i0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = anVar.f43792f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = anVar.f43778e0;
            if (crVar != null) {
                crVar.b(false);
            }
        }
    }

    @Override
    public final void j0() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47554b.f43942r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final void k1(CharSequence charSequence) {
        this.f47554b.yb(charSequence, true);
    }

    @Override
    public final int l() {
        return this.f47554b.l1.Q();
    }

    @Override
    public final boolean l1() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.mj mjVar = this.f47554b.f43996v5;
        if (mjVar != null && (kjVar = mjVar.f24031b) != null && !kjVar.f23700e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l2() {
        an anVar = this.f47554b;
        di.u2 u2Var = anVar.X1;
        if (u2Var != null) {
            u2Var.w1(0, null);
        }
        anVar.xa();
    }

    @Override
    public final void m1() {
        int i7;
        char c10;
        long j3;
        an anVar = this.f47554b;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = anVar.f43848j6;
        long b11 = (int) anVar.b();
        LongSparseArray V = b10.f22354a.V(j10, b11);
        if (V != null && V.size() > 0) {
            int size = V.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    j11 = V.keyAt(i10);
                    a2Var = (org.telegram.messenger.a2) V.valueAt(i10);
                    c10 = 0;
                    if (!a2Var.f21375e) {
                        break;
                    }
                    i10++;
                } else {
                    c10 = 0;
                    break;
                }
            }
            org.telegram.messenger.a2 a2Var2 = a2Var;
            long j12 = j11;
            if (a2Var2 != null && !a2Var2.f21375e) {
                Runnable runnable = a2Var2.f21376f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f22355b.Z(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f21375e = true;
                    j3 = j12;
                } else {
                    b10.f22354a.a0(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.qs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f21373b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.qs.L5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j3;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().j1(j10);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (b11 != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) b11;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new jh.b(1));
            }
        }
        anVar.q7(true);
    }

    @Override
    public final qm o0() {
        return this.f47554b.B5;
    }

    @Override
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f47554b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (!kVar.f27680n0 && !anVar.aa() && TextUtils.isEmpty(anVar.Z.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = anVar.f43831i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f43792f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cr crVar = anVar.f43778e0;
            if (crVar != null) {
                crVar.b(true);
            }
        }
    }

    @Override
    public final TLRPC.Peer s() {
        return null;
    }

    @Override
    public final void t() {
        boolean z9;
        an anVar = this.f47554b;
        if (anVar.A0 != null) {
            anVar.f43751c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null) {
            jjVar.getAdapter().f16782f0 = true;
        }
        if (anVar.F5 != null) {
            org.telegram.messenger.g0.i3(new bh(this, 7), 30L);
        }
        if (anVar.Z.s0()) {
            anVar.Z.d1();
            z9 = true;
        } else {
            z9 = false;
        }
        anVar.Z.U0(true, true, z9);
        if (anVar.E5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.E5, true);
            anVar.E5 = 0;
        }
        anVar.cd(0, true);
        anVar.Lc(false);
        anVar.Cd(false);
    }

    @Override
    public final void t1() {
        int i7;
        int i10;
        an anVar = this.f47554b;
        if (!anVar.V9() && (i7 = anVar.f43796f4) != 6 && i7 != 8) {
            org.telegram.messenger.qp messagesController = anVar.getMessagesController();
            long j3 = anVar.f43848j6;
            long j10 = anVar.f43945r4;
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            messagesController.C4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final boolean v0() {
        int i7;
        an anVar = this.f47554b;
        if ((!anVar.getMessagesController().t2(anVar.a()) || anVar.f43995v4) && (i7 = anVar.f43796f4) != 9 && anVar.f43808g4 > 0) {
            if (i7 != 0) {
                if (i7 == 3 && anVar.c9() == anVar.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void w(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        an anVar = this.f47554b;
        if (i7 != 0) {
            anVar.P4 = true;
        }
        anVar.K9();
        anVar.M9();
        anVar.rd(false, false);
        anVar.l1.invalidate();
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
        if (ccVar != null && anVar.Ac != null) {
            ccVar.l();
        }
    }

    @Override
    public final void w0() {
        an anVar = this.f47554b;
        anVar.H9 = true;
        jl jlVar = anVar.C0;
        if (jlVar != null) {
            jlVar.K(true);
        }
    }
}
