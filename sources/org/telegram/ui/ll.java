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
public final class ll implements org.telegram.ui.Components.cg {
    public int f48997a;
    public final an f48998b;

    public ll(an anVar) {
        this.f48998b = anVar;
    }

    @Override
    public final void B2() {
        an anVar = this.f48998b;
        fi.p2 p2Var = anVar.Y1;
        if (p2Var != null) {
            p2Var.w1(0, null);
        }
        anVar.Aa();
    }

    @Override
    public final void C(boolean z10) {
        int i7;
        int i10;
        an anVar = this.f48998b;
        if (z10) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            anVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity2, i7);
    }

    @Override
    public final void E() {
        this.f48998b.Cc(true, false);
    }

    @Override
    public final boolean E0() {
        int i7;
        an anVar = this.f48998b;
        if ((!anVar.getMessagesController().t2(anVar.a()) || anVar.f45407w4) && (i7 = anVar.f45203g4) != 9 && anVar.f45217h4 > 0) {
            if (i7 != 0) {
                if (i7 == 3 && anVar.e9() == anVar.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void G0() {
        an anVar = this.f48998b;
        anVar.K9 = true;
        jl jlVar = anVar.D0;
        if (jlVar != null) {
            jlVar.K(true);
        }
    }

    @Override
    public final void G1() {
        int i7;
        int i10;
        an anVar = this.f48998b;
        if (!anVar.X9() && (i7 = anVar.f45203g4) != 6 && i7 != 8) {
            org.telegram.messenger.np messagesController = anVar.getMessagesController();
            long j3 = anVar.f45258k6;
            long j10 = anVar.f45357s4;
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            messagesController.D4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final void I() {
        org.telegram.ui.Components.rw0 rw0Var = this.f48998b.f45354s1;
        if (rw0Var != null) {
            rw0Var.e();
        }
    }

    @Override
    public final void J0() {
        this.f48998b.Ma(0, false);
    }

    @Override
    public final void M(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        jg.d1 d1Var;
        org.telegram.messenger.gj gjVar;
        int i11;
        long b22;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        boolean z11;
        TLRPC.Message message;
        org.telegram.messenger.ij ijVar2;
        an anVar = this.f48998b;
        ArrayList arrayList = anVar.L6;
        if (anVar.B0 != null) {
            anVar.f45160d0 = anVar.f45117a0.getBackgroundTop();
        }
        jj jjVar = anVar.X1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            anVar.X1.getAdapter().f17146x.a(charSequence);
        }
        boolean z12 = false;
        if (i7 != 0) {
            if (anVar.f45217h4 == -1) {
                anVar.f45217h4 = 0;
            }
            if (charSequence != null) {
                anVar.f45217h4++;
            }
            org.telegram.messenger.kj kjVar2 = anVar.f45408w5;
            if (kjVar2 != null && (ijVar2 = kjVar2.f24707b) != null && !ijVar2.f24403e.isEmpty()) {
                anVar.f45217h4 += anVar.f45408w5.f24707b.f24403e.size();
            }
            anVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (kjVar = anVar.f45408w5) != null && (ijVar = kjVar.f24707b) != null && !ijVar.f24403e.isEmpty() && anVar.f45408w5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            anVar.f45408w5.f24707b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer z13 = anVar.getMessagesController().z1(anVar.f45258k6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i12);
                if (gjVar2 != null && (message = gjVar2.f23819k) != null && !org.telegram.messenger.gj.v5(message.peer_id, z13)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(anVar).I(2131624048, org.telegram.messenger.hd.M0(2131744306, null), org.telegram.messenger.hd.M0(2131744305, null));
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.ub) I.f41631e).f39987a;
                fh0Var.setScaleX(1.8f);
                fh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(anVar.f45172e) && !anVar.f45407w4 && (gjVar = anVar.E5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = gjVar.f23817j1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                b22 = org.telegram.messenger.gj.b2(i11, anVar.E5.f23819k, true, false);
            } else {
                b22 = tL_forumTopic.f28103id;
            }
            long j10 = b22;
            if (j10 != 0) {
                anVar.getMediaDataController().D(anVar.f45258k6, j10, false);
            }
        }
        anVar.fc(false, null, null, null, z10, i7, null, false, j3);
        qj qjVar = anVar.f45117a0;
        if (qjVar != null && qjVar.getEmojiView() != null && (d1Var = anVar.f45117a0.getEmojiView().U0) != null) {
            if (d1Var.f17054e) {
                org.telegram.messenger.np.s1(d1Var.f17051a).D4(2, 0, d1Var.f17052b, d1Var.f17053c, null);
            }
            d1Var.f17055f = -1L;
        }
        if (!anVar.getMessagesController().D3() && anVar.getMessagesController().f25401t4 <= 0) {
            if (anVar.getMessagesController().f25316j7 >= 2) {
                z12 = true;
            }
            if (!z12 && !anVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i13);
                    if (gjVar3 != null && !gjVar3.P3() && ((org.telegram.messenger.gj.R4(gjVar3.f23819k) || gjVar3.h4()) && gjVar3.f23819k.media_unread)) {
                        org.telegram.ui.Components.x11.t(gjVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers O() {
        return this.f48998b.Da;
    }

    @Override
    public final void Q0() {
        an anVar = this.f48998b;
        org.telegram.messenger.ez sendMessagesHelper = anVar.getSendMessagesHelper();
        long j3 = anVar.f45258k6;
        SparseArray sparseArray = sendMessagesHelper.f23392e;
        SparseArray sparseArray2 = sendMessagesHelper.f23391c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f28072id;
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
                        i7 = message2.f28072id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f48998b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void W(float f10, int i7) {
        org.telegram.ui.Components.w40 w40Var = this.f48998b.f45328q3;
        if (w40Var != null) {
            w40Var.b(f10, i7);
        }
    }

    @Override
    public final void Y() {
        boolean z10;
        an anVar = this.f48998b;
        qj qjVar = anVar.f45117a0;
        boolean z11 = qjVar.f32210h4;
        org.telegram.ui.Components.sf sfVar = qjVar.V0;
        boolean z12 = false;
        if (sfVar != null && sfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = anVar.f45185ed;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void a1(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        an anVar = this.f48998b;
        if (anVar.f45342r3.getVisibility() != i10) {
            anVar.f45342r3.setVisibility(i10);
        }
    }

    @Override
    public final void b() {
        this.f48998b.dd();
    }

    @Override
    public final void b0(boolean z10) {
        this.f48998b.Cc(false, z10);
    }

    @Override
    public final int b1() {
        return this.f48998b.f45277m1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final void d() {
        org.telegram.ui.Components.rw0 rw0Var = this.f48998b.f45354s1;
        if (rw0Var != null) {
            rw0Var.f();
        }
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final boolean g1() {
        org.telegram.ui.Components.w40 w40Var = this.f48998b.f45328q3;
        if (w40Var != null && w40Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.rw0 rw0Var = this.f48998b.f45354s1;
        if (rw0Var != null) {
            rw0Var.e();
        }
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        hi.l3 l3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        an anVar = this.f48998b;
        if (isEmpty && !anVar.f45117a0.E0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        jj jjVar = anVar.X1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            anVar.X1.getAdapter().U(charSequence2, anVar.f45117a0.getCursorPosition(), anVar.L6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = anVar.f45123a6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            anVar.f45123a6 = null;
        }
        TLRPC.Chat chat = anVar.f45172e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            qj qjVar = anVar.f45117a0;
            if (qjVar.G3 && (!qjVar.E0() || !anVar.f45117a0.I2)) {
                if (z10) {
                    anVar.Cb(charSequence2, true);
                } else {
                    anVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    anVar.f45123a6 = uVar2;
                    if (org.telegram.messenger.g0.S == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    org.telegram.messenger.g0.i3(uVar2, j3);
                }
            }
        }
        zj zjVar = anVar.Ta;
        if (zjVar != null) {
            ArrayList arrayList = zjVar.G;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((ix) arrayList.get(i7)).f48135n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5124l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.f5124l = true;
        }
        if (!z11) {
            hi.l3 l3Var2 = anVar.f45391v2;
            if ((l3Var2 != null && l3Var2.W) || ((l3Var = anVar.f45418x2) != null && l3Var.W)) {
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
                hi.l3 l3Var3 = anVar.f45418x2;
                if (l3Var3 != null) {
                    l3Var3.f(true);
                    return;
                }
                return;
            }
            uf ufVar = anVar.kb;
            if (org.telegram.messenger.q10.B(anVar.f45186f) || ((chatFull = anVar.f45333q8) != null && chatFull.slowmode_next_send_date > 0 && anVar.f45203g4 == 0)) {
                z13 = true;
            }
            if (!anVar.f45431y2 && !anVar.f45405w2 && !z13 && org.telegram.messenger.gz.M < 3 && !anVar.f45117a0.E0()) {
                org.telegram.messenger.g0.r(ufVar);
                org.telegram.messenger.g0.i3(ufVar, 4000L);
            }
        }
    }

    @Override
    public final void k2(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        an anVar = this.f48998b;
        if (i7 < currentActionBarHeight) {
            anVar.f45330q5 = false;
            if (anVar.f45354s1.getVisibility() == 0) {
                anVar.f45354s1.setVisibility(4);
            }
        } else {
            anVar.f45330q5 = true;
            if (anVar.f45354s1.getVisibility() == 4 && !anVar.isInPreviewMode()) {
                anVar.f45354s1.setVisibility(0);
            }
        }
        anVar.f45344r5 = true ^ anVar.f45117a0.G0();
        if (anVar.f45117a0.G0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f48997a != i11) {
            anVar.f45160d0 = 0;
        }
        this.f48997a = i11;
    }

    @Override
    public final boolean l() {
        return this.f48998b.Z6();
    }

    @Override
    public final void l1() {
        org.telegram.ui.Components.w40 w40Var = this.f48998b.f45328q3;
        if (w40Var != null) {
            w40Var.k();
        }
    }

    @Override
    public final void m0() {
        org.telegram.ui.Components.rw0 rw0Var = this.f48998b.f45354s1;
        if (rw0Var != null) {
            rw0Var.f();
        }
    }

    @Override
    public final boolean m1() {
        an anVar = this.f48998b;
        TLRPC.User user = anVar.f45186f;
        if (user != null && !org.telegram.messenger.q10.B(user) && !anVar.f45186f.bot && anVar.h == null && anVar.f45203g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2() {
        int indexOfChild;
        int i7;
        an anVar = this.f48998b;
        if (anVar.getParentActivity() != null) {
            if ((anVar.f45172e != null || anVar.f45347r8 != null) && anVar.fragmentView != null) {
                hi.l3 l3Var = anVar.f45378u2;
                if ((l3Var == null || !l3Var.W) && (indexOfChild = anVar.f45277m1.indexOfChild(anVar.U)) != -1) {
                    try {
                        anVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (anVar.f45378u2 == null) {
                        anVar.f45378u2 = anVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = anVar.f45347r8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        hi.l3 l3Var2 = anVar.f45378u2;
                        if (anVar.f45117a0.f32178d1) {
                            i7 = 2131743594;
                        } else {
                            i7 = 2131743520;
                        }
                        l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i7, anVar.f45186f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(anVar.f45172e) && !org.telegram.messenger.t3.s(anVar.f45172e)) {
                        if (!anVar.Z6()) {
                            if (anVar.f45117a0.f32178d1) {
                                anVar.f45378u2.u(org.telegram.messenger.t3.L(21, anVar.f45172e));
                            } else {
                                anVar.f45378u2.u(org.telegram.messenger.t3.L(20, anVar.f45172e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, anVar.f45172e)) {
                        anVar.f45378u2.u(org.telegram.messenger.hd.M0(2131749537, null));
                    } else if (org.telegram.messenger.t3.P(21, anVar.f45172e)) {
                        anVar.f45378u2.u(org.telegram.messenger.hd.M0(2131749540, null));
                    } else if (org.telegram.messenger.t3.P(7, anVar.f45172e)) {
                        anVar.f45378u2.u(org.telegram.messenger.hd.M0(2131749543, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = anVar.f45172e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                anVar.f45378u2.u(org.telegram.messenger.hd.M0(2131753955, null));
                            } else {
                                anVar.f45378u2.u(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.hd.v(anVar.f45172e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = anVar.f45117a0.getSendButton();
                    View audioVideoButtonContainer = anVar.f45117a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    anVar.f45378u2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int n() {
        return this.f48998b.f45277m1.Q();
    }

    @Override
    public final void n1() {
        int i7;
        an anVar = this.f48998b;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        long j3 = anVar.f45258k6;
        org.telegram.messenger.lj ljVar = anVar.f45421x5;
        if (ljVar == null) {
            ljVar = org.telegram.messenger.lj.a();
        }
        new di.s0(parentActivity, i7, j3, ljVar, anVar, anVar.getResourceProvider(), 0, new ke(anVar, 1)).show();
    }

    @Override
    public final void n2(boolean z10) {
        an anVar = this.f48998b;
        View view = anVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        anVar.s5 = !z10;
    }

    @Override
    public final void o1() {
        this.f48998b.W6();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.w40 r40Var;
        an anVar = this.f48998b;
        boolean z11 = false;
        if (anVar.f45328q3 == null && CameraView.isCameraAllowed() && anVar.getParentActivity() != null) {
            Activity parentActivity = anVar.getParentActivity();
            ym ymVar = anVar.Aa;
            if (org.telegram.ui.Components.w40.e(org.telegram.messenger.m10.f24940t0)) {
                r40Var = new org.telegram.ui.Components.q40(parentActivity, anVar, ymVar);
            } else {
                r40Var = new org.telegram.ui.Components.r40(parentActivity, anVar, ymVar, true);
            }
            anVar.f45328q3 = r40Var;
            r40Var.setAnimationCallback(new ce(anVar, 0));
            anVar.f45328q3.setTrimCallback(new ce(anVar, 1));
            anVar.f45328q3.setRecordingUiFrameCallback(new wi(anVar));
            anVar.f45328q3.setClipToPadding(false);
            anVar.f45328q3.i(anVar.L, anVar.f45415x);
            int indexOfChild = anVar.f45277m1.indexOfChild(anVar.U);
            if (indexOfChild < 0) {
                indexOfChild = anVar.f45277m1.getChildCount();
            }
            anVar.f45277m1.addView(anVar.f45328q3, Math.min(indexOfChild + 1, anVar.f45277m1.getChildCount()), c8.ja.e(-1, -1, 51));
        }
        org.telegram.ui.Components.w40 w40Var = anVar.f45328q3;
        if (w40Var != null) {
            if (i7 == 0) {
                w40Var.j(false);
                anVar.A0.C0();
                anVar.D0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z11 = true;
                    }
                    w40Var.a(z11);
                }
            } else {
                w40Var.h(i7, i10, i11, j3, j10, z10);
            }
        }
    }

    @Override
    public final qm p0() {
        return this.f48998b.C5;
    }

    @Override
    public final void q1() {
        boolean z10;
        boolean z11;
        int i7;
        float f10;
        int i10;
        an anVar = this.f48998b;
        anVar.l7();
        qj qjVar = anVar.f45117a0;
        boolean z12 = qjVar.f32210h4;
        org.telegram.ui.Components.sf sfVar = qjVar.V0;
        if (sfVar != null && sfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = anVar.f45185ed;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = anVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
            if (xbVar != null && xbVar.f41637l) {
                xbVar.b();
            }
        } else {
            Activity parentActivity2 = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        jj jjVar = anVar.X1;
        float f11 = 0.0f;
        if (jjVar != null) {
            ViewPropertyAnimator animate = jjVar.animate();
            if (!z12 && !anVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.er.f34419f).start();
        }
        org.telegram.ui.Components.rw0 rw0Var = anVar.f45354s1;
        if (rw0Var != null) {
            rw0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = anVar.f45354s1.animate();
            if (!z12 && !anVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.er.f34419f).withEndAction(new ai.q(21, this, z12)).start();
        }
    }

    @Override
    public final void r2() {
        an anVar = this.f48998b;
        hi.l3 l3Var = anVar.f45391v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = anVar.f45418x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final TLRPC.Peer s() {
        return null;
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f48998b;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (!kVar.f29304o0 && !anVar.ca() && TextUtils.isEmpty(anVar.f45117a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.q0 q0Var = anVar.f45239j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f45199g0;
            if (xVar != null) {
                xVar.e(0);
            }
            er erVar = anVar.f45187f0;
            if (erVar != null) {
                erVar.b(true);
            }
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        an anVar = this.f48998b;
        anVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = anVar.f45239j0;
        if (q0Var != null && q0Var.getVisibility() != 0) {
            anVar.f45239j0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = anVar.f45199g0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = anVar.f45187f0;
            if (erVar != null) {
                erVar.b(false);
            }
        }
    }

    @Override
    public final void u1(CharSequence charSequence) {
        this.f48998b.Cb(charSequence, true);
    }

    @Override
    public final void v() {
        boolean z10;
        an anVar = this.f48998b;
        if (anVar.B0 != null) {
            anVar.f45160d0 = anVar.f45117a0.getBackgroundTop();
        }
        jj jjVar = anVar.X1;
        if (jjVar != null) {
            jjVar.getAdapter().f17126g0 = true;
        }
        if (anVar.G5 != null) {
            org.telegram.messenger.g0.i3(new bh(this, 7), 30L);
        }
        if (anVar.f45117a0.G0()) {
            anVar.f45117a0.u1();
            z10 = true;
        } else {
            z10 = false;
        }
        anVar.f45117a0.l1(true, true, z10);
        if (anVar.F5 != 0) {
            anVar.getConnectionsManager().cancelRequest(anVar.F5, true);
            anVar.F5 = 0;
        }
        anVar.gd(0, true);
        anVar.Pc(false);
        anVar.Gd(false);
    }

    @Override
    public final boolean v1() {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.kj kjVar = this.f48998b.f45408w5;
        if (kjVar != null && (ijVar = kjVar.f24707b) != null && !ijVar.f24403e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w1() {
        int i7;
        char c10;
        long j3;
        an anVar = this.f48998b;
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = anVar.f45258k6;
        long b11 = (int) anVar.b();
        LongSparseArray w10 = b10.f23418a.w(j10, b11);
        if (w10 != null && w10.size() > 0) {
            int size = w10.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    j11 = w10.keyAt(i10);
                    a2Var = (org.telegram.messenger.a2) w10.valueAt(i10);
                    c10 = 0;
                    if (!a2Var.f22452e) {
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
            if (a2Var2 != null && !a2Var2.f22452e) {
                Runnable runnable = a2Var2.f22453f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f23419b.T(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f22452e = true;
                    j3 = j12;
                } else {
                    b10.f23418a.W(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.ns notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f22450b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ns.L5, objArr);
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
        anVar.r7(true);
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f48998b;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (!kVar.f29304o0) {
            org.telegram.ui.ActionBar.q0 q0Var = anVar.f45239j0;
            if (q0Var != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f45199g0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = anVar.f45187f0;
            if (erVar != null) {
                erVar.b(false);
            }
        }
    }

    @Override
    public final void y(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        an anVar = this.f48998b;
        if (i7 != 0) {
            anVar.Q4 = true;
        }
        anVar.M9();
        anVar.O9();
        anVar.vd(false, false);
        anVar.f45277m1.invalidate();
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
        if (xbVar != null && anVar.Dc != null) {
            xbVar.l();
        }
    }
}
