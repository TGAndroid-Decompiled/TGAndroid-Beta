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
public final class ml implements org.telegram.ui.Components.kg {
    public int f49849a;
    public final bn f49850b;

    public ml(bn bnVar) {
        this.f49850b = bnVar;
    }

    @Override
    public final void A(boolean z10) {
        int i7;
        int i10;
        bn bnVar = this.f49850b;
        if (z10) {
            Activity parentActivity = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i10);
            bnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
        org.telegram.messenger.g0.Z2(parentActivity2, i7);
    }

    @Override
    public final void B2() {
        bn bnVar = this.f49850b;
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null) {
            n2Var.x1(0, null);
        }
        bnVar.Aa();
    }

    @Override
    public final void D() {
        this.f49850b.Cc(true, false);
    }

    @Override
    public final boolean E0() {
        int i7;
        bn bnVar = this.f49850b;
        if ((!bnVar.getMessagesController().y2(bnVar.a()) || bnVar.f46227x4) && (i7 = bnVar.f46009g4) != 9 && bnVar.f46023h4 > 0) {
            if (i7 != 0) {
                if (i7 == 3 && bnVar.e9() == bnVar.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void G() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49850b.f46161s1;
        if (yw0Var != null) {
            yw0Var.e();
        }
    }

    @Override
    public final void G0() {
        bn bnVar = this.f49850b;
        bnVar.L9 = true;
        kl klVar = bnVar.D0;
        if (klVar != null) {
            klVar.K(true);
        }
    }

    @Override
    public final void G1() {
        int i7;
        int i10;
        bn bnVar = this.f49850b;
        if (!bnVar.X9() && (i7 = bnVar.f46009g4) != 6 && i7 != 8) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46076l6;
            long j10 = bnVar.f46164s4;
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            messagesController.N4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        boolean z11;
        jg.d1 d1Var;
        org.telegram.messenger.fj fjVar;
        int i11;
        long b22;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        boolean z12;
        TLRPC.Message message;
        org.telegram.messenger.hj hjVar2;
        bn bnVar = this.f49850b;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.B0 != null) {
            bnVar.f45966d0 = bnVar.f45923a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            bnVar.X1.getAdapter().f17529x.a(charSequence);
        }
        if (i7 != 0) {
            if (bnVar.f46023h4 == -1) {
                bnVar.f46023h4 = 0;
            }
            if (charSequence != null) {
                bnVar.f46023h4++;
            }
            org.telegram.messenger.jj jjVar2 = bnVar.f46228x5;
            if (jjVar2 != null && (hjVar2 = jjVar2.f24865b) != null && !hjVar2.f24455e.isEmpty()) {
                bnVar.f46023h4 += bnVar.f46228x5.f24865b.f24455e.size();
            }
            bnVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (jjVar = bnVar.f46228x5) != null && (hjVar = jjVar.f24865b) != null && !hjVar.f24455e.isEmpty() && bnVar.f46228x5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            bnVar.f46228x5.f24865b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.Peer B1 = bnVar.getMessagesController().B1(bnVar.f46076l6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                if (fjVar2 != null && (message = fjVar2.f23965k) != null && !org.telegram.messenger.fj.v5(message.peer_id, B1)) {
                    z12 = false;
                    break;
                }
                i12++;
            }
            if (z12) {
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(2131624048, org.telegram.messenger.gd.M0(2131744071, null), org.telegram.messenger.gd.M0(2131744070, null));
                org.telegram.ui.Components.ph0 ph0Var = ((org.telegram.ui.Components.dc) I.f35457e).f34369a;
                ph0Var.setScaleX(1.8f);
                ph0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.v3.c0(bnVar.f45978e) && !bnVar.f46227x4 && (fjVar = bnVar.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = fjVar.f23963j1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                b22 = org.telegram.messenger.fj.b2(i11, bnVar.F5.f23965k, true, false);
            } else {
                b22 = tL_forumTopic.f28455id;
            }
            long j10 = b22;
            if (j10 != 0) {
                bnVar.getMediaDataController().F(bnVar.f46076l6, j10, false);
            }
        }
        bnVar.fc(false, null, null, null, z10, i7, null, false, j3, true);
        rj rjVar = bnVar.f45923a0;
        if (rjVar != null && rjVar.getEmojiView() != null && (d1Var = bnVar.f45923a0.getEmojiView().U0) != null) {
            if (d1Var.f17437e) {
                org.telegram.messenger.mp.u1(d1Var.f17434a).N4(2, 0, d1Var.f17435b, d1Var.f17436c, null);
            }
            d1Var.f17438f = -1L;
        }
        if (!bnVar.getMessagesController().K3() && bnVar.getMessagesController().f25784v4 <= 0) {
            if (bnVar.getMessagesController().f25699l7 >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !bnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i13);
                    if (fjVar3 != null && !fjVar3.P3() && ((org.telegram.messenger.fj.R4(fjVar3.f23965k) || fjVar3.h4()) && fjVar3.f23965k.media_unread)) {
                        org.telegram.ui.Components.g21.t(fjVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f49850b.Ea;
    }

    @Override
    public final void J0() {
        this.f49850b.Ma(0, false);
    }

    @Override
    public final void Q(float f10, int i7) {
        org.telegram.ui.Components.e50 e50Var = this.f49850b.f46135q3;
        if (e50Var != null) {
            e50Var.b(f10, i7);
        }
    }

    @Override
    public final void Q0() {
        bn bnVar = this.f49850b;
        org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
        long j3 = bnVar.f46076l6;
        SparseArray sparseArray = sendMessagesHelper.f28388e;
        SparseArray sparseArray2 = sendMessagesHelper.f28387c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f28424id;
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
                        i7 = message2.f28424id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f49850b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void V() {
        boolean z10;
        bn bnVar = this.f49850b;
        rj rjVar = bnVar.f45923a0;
        boolean z11 = rjVar.f32646n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        boolean z12 = false;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46004fd;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void a0(boolean z10) {
        this.f49850b.Cc(false, z10);
    }

    @Override
    public final void a1(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bn bnVar = this.f49850b;
        if (bnVar.f46149r3.getVisibility() != i10) {
            bnVar.f46149r3.setVisibility(i10);
        }
    }

    @Override
    public final void b0() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49850b.f46161s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override
    public final int b1() {
        return this.f49850b.f46084m1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final void d() {
        this.f49850b.dd();
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final void g() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49850b.f46161s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override
    public final boolean g1() {
        org.telegram.ui.Components.e50 e50Var = this.f49850b.f46135q3;
        if (e50Var != null && e50Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49850b.f46161s1;
        if (yw0Var != null) {
            yw0Var.e();
        }
    }

    @Override
    public final void j1(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j3;
        hi.m3 m3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        bn bnVar = this.f49850b;
        if (isEmpty && !bnVar.f45923a0.M0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            bnVar.X1.getAdapter().U(charSequence2, bnVar.f45923a0.getCursorPosition(), bnVar.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = bnVar.f45944b6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            bnVar.f45944b6 = null;
        }
        TLRPC.Chat chat = bnVar.f45978e;
        if (chat == null || org.telegram.messenger.v3.m(chat)) {
            rj rjVar = bnVar.f45923a0;
            if (rjVar.M3 && (!rjVar.M0() || !bnVar.f45923a0.O2)) {
                if (z10) {
                    bnVar.Cb(charSequence2, true);
                } else {
                    bnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    bnVar.f45944b6 = uVar2;
                    if (org.telegram.messenger.g0.S == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    org.telegram.messenger.g0.h3(uVar2, j3);
                }
            }
        }
        ak akVar = bnVar.Ua;
        if (akVar != null) {
            ArrayList arrayList = akVar.G;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((mx) arrayList.get(i7)).f49976n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5409l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.f5409l = true;
        }
        if (!z11) {
            hi.m3 m3Var2 = bnVar.f46198v2;
            if ((m3Var2 != null && m3Var2.W) || ((m3Var = bnVar.f46225x2) != null && m3Var.W)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                hi.m3 m3Var3 = bnVar.f46225x2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            vf vfVar = bnVar.f46081lb;
            if (org.telegram.messenger.o10.C(bnVar.f45992f) || ((chatFull = bnVar.f46154r8) != null && chatFull.slowmode_next_send_date > 0 && bnVar.f46009g4 == 0)) {
                z13 = true;
            }
            if (!bnVar.f46238y2 && !bnVar.f46212w2 && !z13 && org.telegram.messenger.bz.M < 3 && !bnVar.f45923a0.M0()) {
                org.telegram.messenger.g0.r(vfVar);
                org.telegram.messenger.g0.h3(vfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean k() {
        return this.f49850b.Z6();
    }

    @Override
    public final void k2(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        bn bnVar = this.f49850b;
        if (i7 < currentActionBarHeight) {
            bnVar.f46151r5 = false;
            if (bnVar.f46161s1.getVisibility() == 0) {
                bnVar.f46161s1.setVisibility(4);
            }
        } else {
            bnVar.f46151r5 = true;
            if (bnVar.f46161s1.getVisibility() == 4 && !bnVar.isInPreviewMode()) {
                bnVar.f46161s1.setVisibility(0);
            }
        }
        bnVar.s5 = true ^ bnVar.f45923a0.O0();
        if (bnVar.f45923a0.O0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f49849a != i11) {
            bnVar.f45966d0 = 0;
        }
        this.f49849a = i11;
    }

    @Override
    public final void l1() {
        org.telegram.ui.Components.e50 e50Var = this.f49850b.f46135q3;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override
    public final rm m0() {
        return this.f49850b.D5;
    }

    @Override
    public final boolean m1() {
        bn bnVar = this.f49850b;
        TLRPC.User user = bnVar.f45992f;
        if (user != null && !org.telegram.messenger.o10.C(user) && !bnVar.f45992f.bot && bnVar.h == null && bnVar.f46009g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2() {
        int indexOfChild;
        int i7;
        bn bnVar = this.f49850b;
        if (bnVar.getParentActivity() != null) {
            if ((bnVar.f45978e != null || bnVar.f46167s8 != null) && bnVar.fragmentView != null) {
                hi.m3 m3Var = bnVar.f46185u2;
                if ((m3Var == null || !m3Var.W) && (indexOfChild = bnVar.f46084m1.indexOfChild(bnVar.U)) != -1) {
                    try {
                        bnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (bnVar.f46185u2 == null) {
                        bnVar.f46185u2 = bnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = bnVar.f46167s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        hi.m3 m3Var2 = bnVar.f46185u2;
                        if (bnVar.f45923a0.f32567d1) {
                            i7 = 2131743357;
                        } else {
                            i7 = 2131743283;
                        }
                        m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i7, bnVar.f45992f.first_name)));
                    } else if (!org.telegram.messenger.v3.v(bnVar.f45978e) && !org.telegram.messenger.v3.s(bnVar.f45978e)) {
                        if (!bnVar.Z6()) {
                            if (bnVar.f45923a0.f32567d1) {
                                bnVar.f46185u2.v(org.telegram.messenger.v3.L(21, bnVar.f45978e));
                            } else {
                                bnVar.f46185u2.v(org.telegram.messenger.v3.L(20, bnVar.f45978e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.v3.P(20, bnVar.f45978e)) {
                        bnVar.f46185u2.v(org.telegram.messenger.gd.M0(2131749362, null));
                    } else if (org.telegram.messenger.v3.P(21, bnVar.f45978e)) {
                        bnVar.f46185u2.v(org.telegram.messenger.gd.M0(2131749365, null));
                    } else if (org.telegram.messenger.v3.P(7, bnVar.f45978e)) {
                        bnVar.f46185u2.v(org.telegram.messenger.gd.M0(2131749368, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = bnVar.f45978e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                bnVar.f46185u2.v(org.telegram.messenger.gd.M0(2131753953, null));
                            } else {
                                bnVar.f46185u2.v(org.telegram.messenger.gd.a0("AttachMediaRestricted", null, 2131753954, org.telegram.messenger.gd.v(bnVar.f45978e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = bnVar.f45923a0.getSendButton();
                    View audioVideoButtonContainer = bnVar.f45923a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    bnVar.f46185u2.z(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int n() {
        return this.f49850b.f46084m1.Q();
    }

    @Override
    public final void n1() {
        int i7;
        bn bnVar = this.f49850b;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        long j3 = bnVar.f46076l6;
        org.telegram.messenger.kj kjVar = bnVar.f46241y5;
        if (kjVar == null) {
            kjVar = org.telegram.messenger.kj.a();
        }
        new di.r0(parentActivity, i7, j3, kjVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
    }

    @Override
    public final void n2(boolean z10) {
        bn bnVar = this.f49850b;
        View view = bnVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        bnVar.f46176t5 = !z10;
    }

    @Override
    public final void o1() {
        this.f49850b.W6();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.e50 z40Var;
        bn bnVar = this.f49850b;
        boolean z11 = false;
        if (bnVar.f46135q3 == null && CameraView.isCameraAllowed() && bnVar.getParentActivity() != null) {
            Activity parentActivity = bnVar.getParentActivity();
            zm zmVar = bnVar.Ba;
            if (org.telegram.ui.Components.e50.e(org.telegram.messenger.j10.f24770t0)) {
                z40Var = new org.telegram.ui.Components.y40(parentActivity, bnVar, zmVar);
            } else {
                z40Var = new org.telegram.ui.Components.z40(parentActivity, bnVar, zmVar, true);
            }
            bnVar.f46135q3 = z40Var;
            z40Var.setAnimationCallback(new ee(bnVar, 0));
            bnVar.f46135q3.setTrimCallback(new ee(bnVar, 1));
            bnVar.f46135q3.setRecordingUiFrameCallback(new xi(bnVar));
            bnVar.f46135q3.setClipToPadding(false);
            bnVar.f46135q3.i(bnVar.L, bnVar.f46222x);
            int indexOfChild = bnVar.f46084m1.indexOfChild(bnVar.U);
            if (indexOfChild < 0) {
                indexOfChild = bnVar.f46084m1.getChildCount();
            }
            bnVar.f46084m1.addView(bnVar.f46135q3, Math.min(indexOfChild + 1, bnVar.f46084m1.getChildCount()), c8.ma.e(-1, -1, 51));
        }
        org.telegram.ui.Components.e50 e50Var = bnVar.f46135q3;
        if (e50Var != null) {
            if (i7 == 0) {
                e50Var.j(false);
                bnVar.A0.C0();
                bnVar.D0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z11 = true;
                    }
                    e50Var.a(z11);
                }
            } else {
                e50Var.h(i7, i10, i11, j3, j10, z10);
            }
        }
    }

    @Override
    public final void q1() {
        boolean z10;
        boolean z11;
        int i7;
        float f10;
        int i10;
        bn bnVar = this.f49850b;
        bnVar.l7();
        rj rjVar = bnVar.f45923a0;
        boolean z12 = rjVar.f32646n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46004fd;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i10);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
            if (gcVar != null && gcVar.f35463l) {
                gcVar.b();
            }
        } else {
            Activity parentActivity2 = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity2, i7);
        }
        kj kjVar = bnVar.X1;
        float f11 = 0.0f;
        if (kjVar != null) {
            ViewPropertyAnimator animate = kjVar.animate();
            if (!z12 && !bnVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.lr.f37208f).start();
        }
        org.telegram.ui.Components.yw0 yw0Var = bnVar.f46161s1;
        if (yw0Var != null) {
            yw0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = bnVar.f46161s1.animate();
            if (!z12 && !bnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.lr.f37208f).withEndAction(new ch.k(20, this, z12)).start();
        }
    }

    @Override
    public final void r2() {
        bn bnVar = this.f49850b;
        hi.m3 m3Var = bnVar.f46198v2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        hi.m3 m3Var2 = bnVar.f46225x2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49850b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.f29086o0 && !bnVar.ca() && TextUtils.isEmpty(bnVar.f45923a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46045j0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46005g0;
            if (yVar != null) {
                yVar.e(0);
            }
            fr frVar = bnVar.f45993f0;
            if (frVar != null) {
                frVar.b(true);
            }
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        bn bnVar = this.f49850b;
        bnVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46045j0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            bnVar.f46045j0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = bnVar.f46005g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = bnVar.f45993f0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final TLRPC.Peer t() {
        return null;
    }

    @Override
    public final void u() {
        boolean z10;
        bn bnVar = this.f49850b;
        if (bnVar.B0 != null) {
            bnVar.f45966d0 = bnVar.f45923a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null) {
            kjVar.getAdapter().f17509g0 = true;
        }
        if (bnVar.H5 != null) {
            org.telegram.messenger.g0.h3(new bh(this, 7), 30L);
        }
        if (bnVar.f45923a0.O0()) {
            bnVar.f45923a0.C1();
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.f45923a0.t1(true, true, z10);
        if (bnVar.G5 != 0) {
            bnVar.getConnectionsManager().cancelRequest(bnVar.G5, true);
            bnVar.G5 = 0;
        }
        bnVar.gd(0, true);
        bnVar.Pc(false);
        bnVar.Gd(false);
    }

    @Override
    public final void u1(CharSequence charSequence) {
        this.f49850b.Cb(charSequence, true);
    }

    @Override
    public final boolean v1() {
        org.telegram.messenger.hj hjVar;
        org.telegram.messenger.jj jjVar = this.f49850b.f46228x5;
        if (jjVar != null && (hjVar = jjVar.f24865b) != null && !hjVar.f24455e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w1() {
        int i7;
        char c10;
        long j3;
        bn bnVar = this.f49850b;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = bnVar.f46076l6;
        long d = (int) bnVar.d();
        LongSparseArray p10 = b10.f23822a.p(j10, d);
        if (p10 != null && p10.size() > 0) {
            int size = p10.size();
            org.telegram.messenger.a2 a2Var = null;
            long j11 = 0;
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    j11 = p10.keyAt(i10);
                    a2Var = (org.telegram.messenger.a2) p10.valueAt(i10);
                    c10 = 0;
                    if (!a2Var.f22812e) {
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
            if (a2Var2 != null && !a2Var2.f22812e) {
                Runnable runnable = a2Var2.f22813f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f23823b.w(j10, d, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f22812e = true;
                    j3 = j12;
                } else {
                    b10.f23822a.y(j10, d, j12);
                    j3 = j12;
                    org.telegram.messenger.ks notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f22810b, d);
                    d = d;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ks.O5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j3;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().l1(j10);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (d != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) d;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new jh.b(1));
            }
        }
        bnVar.r7(true);
    }

    @Override
    public final void w2() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49850b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.f29086o0) {
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46045j0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46005g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = bnVar.f45993f0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void x(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        bn bnVar = this.f49850b;
        if (i7 != 0) {
            bnVar.R4 = true;
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        bnVar.f46084m1.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
        if (gcVar != null && bnVar.Ec != null) {
            gcVar.l();
        }
    }
}
