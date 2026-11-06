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
    public int f47530a;
    public final an f47531b;

    public ll(an anVar) {
        this.f47531b = anVar;
    }

    @Override
    public final void B(boolean z9) {
        int i7;
        int i10;
        an anVar = this.f47531b;
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
        this.f47531b.Ja(0, false);
    }

    @Override
    public final void D() {
        this.f47531b.yc(true, false);
    }

    @Override
    public final void E() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47531b.f43912r1;
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
        an anVar = this.f47531b;
        ArrayList arrayList = anVar.K6;
        if (anVar.A0 != null) {
            anVar.f43721c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null && jjVar.getAdapter() != null) {
            anVar.W1.getAdapter().f16800x.a(charSequence);
        }
        if (i7 != 0) {
            if (anVar.f43778g4 == -1) {
                anVar.f43778g4 = 0;
            }
            if (charSequence != null) {
                anVar.f43778g4++;
            }
            org.telegram.messenger.mj mjVar2 = anVar.f43966v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.f24019b) != null && !kjVar2.f23689e.isEmpty()) {
                anVar.f43778g4 += anVar.f43966v5.f24019b.f23689e.size();
            }
            anVar.id(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = anVar.f43966v5) != null && (kjVar = mjVar.f24019b) != null && !kjVar.f23689e.isEmpty() && anVar.f43966v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            anVar.f43966v5.f24019b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer z12 = anVar.getMessagesController().z1(anVar.f43818j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.f23237k) != null && !org.telegram.messenger.ij.w5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(anVar).I(2131624047, org.telegram.messenger.hd.M0(2131744307, null), org.telegram.messenger.hd.M0(2131744306, null));
                org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Components.zb) I.f32519e).f40882a;
                ch0Var.setScaleX(1.8f);
                ch0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(anVar.f43747e) && !anVar.f43965v4 && (ijVar = anVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23225h1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                c22 = org.telegram.messenger.ij.c2(i11, anVar.D5.f23237k, true, false);
            } else {
                c22 = tL_forumTopic.f27004id;
            }
            long j10 = c22;
            if (j10 != 0) {
                anVar.getMediaDataController().D(anVar.f43818j6, j10, false);
            }
        }
        anVar.bc(false, null, null, null, z9, i7, null, false, j3, true);
        qj qjVar = anVar.Z;
        if (qjVar != null && qjVar.getEmojiView() != null && (e1Var = anVar.Z.getEmojiView().T0) != null) {
            if (e1Var.f16717e) {
                org.telegram.messenger.qp.s1(e1Var.f16714a).C4(2, 0, e1Var.f16715b, e1Var.f16716c, null);
            }
            e1Var.f16718f = -1L;
        }
        if (!anVar.getMessagesController().D3() && anVar.getMessagesController().f24879s4 <= 0) {
            if (anVar.getMessagesController().i7 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !anVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
                    if (ijVar3 != null && !ijVar3.Q3() && ((org.telegram.messenger.ij.S4(ijVar3.f23237k) || ijVar3.i4()) && ijVar3.f23237k.media_unread)) {
                        org.telegram.ui.Components.m11.r(ijVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.f47531b.Aa;
    }

    @Override
    public final void I0() {
        an anVar = this.f47531b;
        org.telegram.messenger.gz sendMessagesHelper = anVar.getSendMessagesHelper();
        long j3 = anVar.f43818j6;
        SparseArray sparseArray = sendMessagesHelper.f22754e;
        SparseArray sparseArray2 = sendMessagesHelper.f22753c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f26973id;
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
                        i7 = message2.f26973id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f47531b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void M(float f10, int i7) {
        org.telegram.ui.Components.t40 t40Var = this.f47531b.f43887p3;
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
        an anVar = this.f47531b;
        if (anVar.f43900q3.getVisibility() != i10) {
            anVar.f43900q3.setVisibility(i10);
        }
    }

    @Override
    public final int S0() {
        return this.f47531b.l1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47531b.f43912r1;
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
        an anVar = this.f47531b;
        if (i7 < currentActionBarHeight) {
            anVar.f43889p5 = false;
            if (anVar.f43912r1.getVisibility() == 0) {
                anVar.f43912r1.setVisibility(4);
            }
        } else {
            anVar.f43889p5 = true;
            if (anVar.f43912r1.getVisibility() == 4 && !anVar.isInPreviewMode()) {
                anVar.f43912r1.setVisibility(0);
            }
        }
        anVar.f43902q5 = true ^ anVar.Z.s0();
        if (anVar.Z.s0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f47530a != i11) {
            anVar.f43721c0 = 0;
        }
        this.f47530a = i11;
    }

    @Override
    public final void W() {
        boolean z9;
        an anVar = this.f47531b;
        qj qjVar = anVar.Z;
        boolean z10 = qjVar.f31159z3;
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
        org.telegram.ui.Components.t40 t40Var = this.f47531b.f43887p3;
        if (t40Var != null && t40Var.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        int indexOfChild;
        int i7;
        an anVar = this.f47531b;
        if (anVar.getParentActivity() != null) {
            if ((anVar.f43747e != null || anVar.f43905q8 != null) && anVar.fragmentView != null) {
                fi.m3 m3Var = anVar.f43938t2;
                if ((m3Var == null || !m3Var.V) && (indexOfChild = anVar.l1.indexOfChild(anVar.T)) != -1) {
                    try {
                        anVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (anVar.f43938t2 == null) {
                        anVar.f43938t2 = anVar.D6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = anVar.f43905q8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        fi.m3 m3Var2 = anVar.f43938t2;
                        if (anVar.Z.f31024c1) {
                            i7 = 2131743595;
                        } else {
                            i7 = 2131743521;
                        }
                        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i7, anVar.f43761f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(anVar.f43747e) && !org.telegram.messenger.t3.s(anVar.f43747e)) {
                        if (!anVar.Y6()) {
                            if (anVar.Z.f31024c1) {
                                anVar.f43938t2.u(org.telegram.messenger.t3.L(21, anVar.f43747e));
                            } else {
                                anVar.f43938t2.u(org.telegram.messenger.t3.L(20, anVar.f43747e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, anVar.f43747e)) {
                        anVar.f43938t2.u(org.telegram.messenger.hd.M0(2131749536, null));
                    } else if (org.telegram.messenger.t3.P(21, anVar.f43747e)) {
                        anVar.f43938t2.u(org.telegram.messenger.hd.M0(2131749539, null));
                    } else if (org.telegram.messenger.t3.P(7, anVar.f43747e)) {
                        anVar.f43938t2.u(org.telegram.messenger.hd.M0(2131749542, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = anVar.f43747e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                anVar.f43938t2.u(org.telegram.messenger.hd.M0(2131753955, null));
                            } else {
                                anVar.f43938t2.u(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.hd.v(anVar.f43747e.banned_rights.until_date)));
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
                    anVar.f43938t2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Y(boolean z9) {
        this.f47531b.yc(false, z9);
    }

    @Override
    public final void Y1(boolean z9) {
        an anVar = this.f47531b;
        View view = anVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        anVar.f43916r5 = !z9;
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        org.telegram.ui.Components.t40 o40Var;
        an anVar = this.f47531b;
        boolean z10 = false;
        if (anVar.f43887p3 == null && CameraView.isCameraAllowed() && anVar.getParentActivity() != null) {
            Activity parentActivity = anVar.getParentActivity();
            ym ymVar = anVar.f43998xa;
            if (org.telegram.ui.Components.t40.d(org.telegram.messenger.p10.f24459s0)) {
                o40Var = new org.telegram.ui.Components.n40(parentActivity, anVar, ymVar);
            } else {
                o40Var = new org.telegram.ui.Components.o40(parentActivity, anVar, ymVar, true);
            }
            anVar.f43887p3 = o40Var;
            o40Var.setAnimationCallback(new fe(anVar, 0));
            anVar.f43887p3.setTrimCallback(new fe(anVar, 1));
            anVar.f43887p3.setRecordingUiFrameCallback(new wi(anVar));
            anVar.f43887p3.setClipToPadding(false);
            anVar.f43887p3.h(anVar.K, anVar.f43987x);
            int indexOfChild = anVar.l1.indexOfChild(anVar.T);
            if (indexOfChild < 0) {
                indexOfChild = anVar.l1.getChildCount();
            }
            anVar.l1.addView(anVar.f43887p3, Math.min(indexOfChild + 1, anVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.t40 t40Var = anVar.f43887p3;
        if (t40Var != null) {
            if (i7 == 0) {
                t40Var.i(false);
                anVar.f44013z0.C0();
                anVar.C0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z10 = true;
                    }
                    t40Var.a(z10);
                }
            } else {
                t40Var.g(i7, i10, i11, j3, j10, z9);
            }
        }
    }

    @Override
    public final void a() {
        this.f47531b.Zc();
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
        an anVar = this.f47531b;
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
        TLRPC.Chat chat = anVar.f43747e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            qj qjVar = anVar.Z;
            if (qjVar.Y2 && (!qjVar.q0() || !anVar.Z.f31011a2)) {
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
                ((hx) arrayList.get(i7)).f46507n = true;
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
            fi.m3 m3Var2 = anVar.f43950u2;
            if ((m3Var2 != null && m3Var2.V) || ((m3Var = anVar.f43977w2) != null && m3Var.V)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                fi.m3 m3Var3 = anVar.f43977w2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            xf xfVar = anVar.f43798hb;
            if (org.telegram.messenger.t10.B(anVar.f43761f) || ((chatFull = anVar.f43892p8) != null && chatFull.slowmode_next_send_date > 0 && anVar.f43766f4 == 0)) {
                z12 = true;
            }
            if (!anVar.f43990x2 && !anVar.f43963v2 && !z12 && org.telegram.messenger.iz.M < 3 && !anVar.Z.q0()) {
                org.telegram.messenger.g0.r(xfVar);
                org.telegram.messenger.g0.i3(xfVar, 4000L);
            }
        }
    }

    @Override
    public final void b() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47531b.f43912r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final boolean c() {
        return this.f47531b.Y6();
    }

    @Override
    public final void c1() {
        org.telegram.ui.Components.t40 t40Var = this.f47531b.f43887p3;
        if (t40Var != null) {
            t40Var.j();
        }
    }

    @Override
    public final boolean d1() {
        an anVar = this.f47531b;
        TLRPC.User user = anVar.f43761f;
        if (user != null && !org.telegram.messenger.t10.B(user) && !anVar.f43761f.bot && anVar.h == null && anVar.f43766f4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d2() {
        an anVar = this.f47531b;
        fi.m3 m3Var = anVar.f43950u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = anVar.f43977w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void e1() {
        int i7;
        an anVar = this.f47531b;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        long j3 = anVar.f43818j6;
        org.telegram.messenger.nj njVar = anVar.f43980w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, anVar, anVar.getResourceProvider(), 0, new ne(anVar, 1)).show();
    }

    @Override
    public final void f1() {
        this.f47531b.V6();
    }

    @Override
    public final void h1() {
        boolean z9;
        boolean z10;
        int i7;
        float f10;
        int i10;
        an anVar = this.f47531b;
        anVar.k7();
        qj qjVar = anVar.Z;
        boolean z11 = qjVar.f31159z3;
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
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32515w;
            if (ccVar != null && ccVar.f32525l) {
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40310f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = anVar.f43912r1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = anVar.f43912r1.animate();
            if (!z11 && !anVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40310f).withEndAction(new bi.k1(20, this, z11)).start();
        }
    }

    @Override
    public final void h2() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f47531b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (!kVar.f27676n0) {
            org.telegram.ui.ActionBar.r0 r0Var = anVar.f43801i0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f43762f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = anVar.f43748e0;
            if (crVar != null) {
                crVar.b(false);
            }
        }
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        an anVar = this.f47531b;
        anVar.vc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = anVar.f43801i0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            anVar.f43801i0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = anVar.f43762f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cr crVar = anVar.f43748e0;
            if (crVar != null) {
                crVar.b(false);
            }
        }
    }

    @Override
    public final void j0() {
        org.telegram.ui.Components.ow0 ow0Var = this.f47531b.f43912r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final void k1(CharSequence charSequence) {
        this.f47531b.yb(charSequence, true);
    }

    @Override
    public final int l() {
        return this.f47531b.l1.Q();
    }

    @Override
    public final boolean l1() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.mj mjVar = this.f47531b.f43966v5;
        if (mjVar != null && (kjVar = mjVar.f24019b) != null && !kjVar.f23689e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l2() {
        an anVar = this.f47531b;
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
        an anVar = this.f47531b;
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = anVar.f43818j6;
        long b11 = (int) anVar.b();
        LongSparseArray V = b10.f22328a.V(j10, b11);
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
                    if (!a2Var.f21372e) {
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
            if (a2Var2 != null && !a2Var2.f21372e) {
                Runnable runnable = a2Var2.f21373f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f22329b.Z(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f21372e = true;
                    j3 = j12;
                } else {
                    b10.f22328a.a0(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.qs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f21370b, b11);
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
        return this.f47531b.B5;
    }

    @Override
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f47531b;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (!kVar.f27676n0 && !anVar.aa() && TextUtils.isEmpty(anVar.Z.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = anVar.f43801i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = anVar.f43762f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cr crVar = anVar.f43748e0;
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
        an anVar = this.f47531b;
        if (anVar.A0 != null) {
            anVar.f43721c0 = anVar.Z.getBackgroundTop();
        }
        jj jjVar = anVar.W1;
        if (jjVar != null) {
            jjVar.getAdapter().f16779f0 = true;
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
        an anVar = this.f47531b;
        if (!anVar.V9() && (i7 = anVar.f43766f4) != 6 && i7 != 8) {
            org.telegram.messenger.qp messagesController = anVar.getMessagesController();
            long j3 = anVar.f43818j6;
            long j10 = anVar.f43915r4;
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).classGuid;
            messagesController.C4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final boolean v0() {
        int i7;
        an anVar = this.f47531b;
        if ((!anVar.getMessagesController().t2(anVar.a()) || anVar.f43965v4) && (i7 = anVar.f43766f4) != 9 && anVar.f43778g4 > 0) {
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
        an anVar = this.f47531b;
        if (i7 != 0) {
            anVar.P4 = true;
        }
        anVar.K9();
        anVar.M9();
        anVar.rd(false, false);
        anVar.l1.invalidate();
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32515w;
        if (ccVar != null && anVar.Ac != null) {
            ccVar.l();
        }
    }

    @Override
    public final void w0() {
        an anVar = this.f47531b;
        anVar.H9 = true;
        jl jlVar = anVar.C0;
        if (jlVar != null) {
            jlVar.K(true);
        }
    }
}
