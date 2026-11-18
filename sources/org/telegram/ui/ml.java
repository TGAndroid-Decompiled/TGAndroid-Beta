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
    public int f49875a;
    public final bn f49876b;

    public ml(bn bnVar) {
        this.f49876b = bnVar;
    }

    @Override
    public final void A(boolean z10) {
        int i7;
        int i10;
        bn bnVar = this.f49876b;
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
        bn bnVar = this.f49876b;
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null) {
            n2Var.x1(0, null);
        }
        bnVar.Aa();
    }

    @Override
    public final void D() {
        this.f49876b.Cc(true, false);
    }

    @Override
    public final boolean E0() {
        int i7;
        bn bnVar = this.f49876b;
        if ((!bnVar.getMessagesController().y2(bnVar.a()) || bnVar.f46236x4) && (i7 = bnVar.f46018g4) != 9 && bnVar.f46032h4 > 0) {
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
        org.telegram.ui.Components.yw0 yw0Var = this.f49876b.f46170s1;
        if (yw0Var != null) {
            yw0Var.e();
        }
    }

    @Override
    public final void G0() {
        bn bnVar = this.f49876b;
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
        bn bnVar = this.f49876b;
        if (!bnVar.X9() && (i7 = bnVar.f46018g4) != 6 && i7 != 8) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46085l6;
            long j10 = bnVar.f46173s4;
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
        bn bnVar = this.f49876b;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.B0 != null) {
            bnVar.f45975d0 = bnVar.f45932a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            bnVar.X1.getAdapter().f17532x.a(charSequence);
        }
        if (i7 != 0) {
            if (bnVar.f46032h4 == -1) {
                bnVar.f46032h4 = 0;
            }
            if (charSequence != null) {
                bnVar.f46032h4++;
            }
            org.telegram.messenger.jj jjVar2 = bnVar.f46237x5;
            if (jjVar2 != null && (hjVar2 = jjVar2.f24868b) != null && !hjVar2.f24458e.isEmpty()) {
                bnVar.f46032h4 += bnVar.f46237x5.f24868b.f24458e.size();
            }
            bnVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (jjVar = bnVar.f46237x5) != null && (hjVar = jjVar.f24868b) != null && !hjVar.f24458e.isEmpty() && bnVar.f46237x5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            bnVar.f46237x5.f24868b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.Peer B1 = bnVar.getMessagesController().B1(bnVar.f46085l6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                if (fjVar2 != null && (message = fjVar2.f23968k) != null && !org.telegram.messenger.fj.v5(message.peer_id, B1)) {
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
        if (org.telegram.messenger.v3.c0(bnVar.f45987e) && !bnVar.f46236x4 && (fjVar = bnVar.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = fjVar.f23966j1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                b22 = org.telegram.messenger.fj.b2(i11, bnVar.F5.f23968k, true, false);
            } else {
                b22 = tL_forumTopic.f28457id;
            }
            long j10 = b22;
            if (j10 != 0) {
                bnVar.getMediaDataController().F(bnVar.f46085l6, j10, false);
            }
        }
        bnVar.fc(false, null, null, null, z10, i7, null, false, j3, true);
        rj rjVar = bnVar.f45932a0;
        if (rjVar != null && rjVar.getEmojiView() != null && (d1Var = bnVar.f45932a0.getEmojiView().U0) != null) {
            if (d1Var.f17440e) {
                org.telegram.messenger.mp.u1(d1Var.f17437a).N4(2, 0, d1Var.f17438b, d1Var.f17439c, null);
            }
            d1Var.f17441f = -1L;
        }
        if (!bnVar.getMessagesController().K3() && bnVar.getMessagesController().f25786v4 <= 0) {
            if (bnVar.getMessagesController().f25701l7 >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !bnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i13);
                    if (fjVar3 != null && !fjVar3.P3() && ((org.telegram.messenger.fj.R4(fjVar3.f23968k) || fjVar3.h4()) && fjVar3.f23968k.media_unread)) {
                        org.telegram.ui.Components.g21.t(fjVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f49876b.Ea;
    }

    @Override
    public final void J0() {
        this.f49876b.Ma(0, false);
    }

    @Override
    public final void Q(float f10, int i7) {
        org.telegram.ui.Components.e50 e50Var = this.f49876b.f46144q3;
        if (e50Var != null) {
            e50Var.b(f10, i7);
        }
    }

    @Override
    public final void Q0() {
        bn bnVar = this.f49876b;
        org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
        long j3 = bnVar.f46085l6;
        SparseArray sparseArray = sendMessagesHelper.f28390e;
        SparseArray sparseArray2 = sendMessagesHelper.f28389c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f28426id;
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
                        i7 = message2.f28426id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f49876b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void V() {
        boolean z10;
        bn bnVar = this.f49876b;
        rj rjVar = bnVar.f45932a0;
        boolean z11 = rjVar.f32646n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        boolean z12 = false;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46013fd;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void a0(boolean z10) {
        this.f49876b.Cc(false, z10);
    }

    @Override
    public final void a1(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bn bnVar = this.f49876b;
        if (bnVar.f46158r3.getVisibility() != i10) {
            bnVar.f46158r3.setVisibility(i10);
        }
    }

    @Override
    public final void b0() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49876b.f46170s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override
    public final int b1() {
        return this.f49876b.f46093m1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final void d() {
        this.f49876b.dd();
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final void g() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49876b.f46170s1;
        if (yw0Var != null) {
            yw0Var.f();
        }
    }

    @Override
    public final boolean g1() {
        org.telegram.ui.Components.e50 e50Var = this.f49876b.f46144q3;
        if (e50Var != null && e50Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.yw0 yw0Var = this.f49876b.f46170s1;
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
        bn bnVar = this.f49876b;
        if (isEmpty && !bnVar.f45932a0.M0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            bnVar.X1.getAdapter().U(charSequence2, bnVar.f45932a0.getCursorPosition(), bnVar.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = bnVar.f45953b6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            bnVar.f45953b6 = null;
        }
        TLRPC.Chat chat = bnVar.f45987e;
        if (chat == null || org.telegram.messenger.v3.m(chat)) {
            rj rjVar = bnVar.f45932a0;
            if (rjVar.M3 && (!rjVar.M0() || !bnVar.f45932a0.O2)) {
                if (z10) {
                    bnVar.Cb(charSequence2, true);
                } else {
                    bnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    bnVar.f45953b6 = uVar2;
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
                ((mx) arrayList.get(i7)).f50002n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5412l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.f5412l = true;
        }
        if (!z11) {
            hi.m3 m3Var2 = bnVar.f46207v2;
            if ((m3Var2 != null && m3Var2.W) || ((m3Var = bnVar.f46234x2) != null && m3Var.W)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                hi.m3 m3Var3 = bnVar.f46234x2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            vf vfVar = bnVar.f46090lb;
            if (org.telegram.messenger.o10.C(bnVar.f46001f) || ((chatFull = bnVar.f46163r8) != null && chatFull.slowmode_next_send_date > 0 && bnVar.f46018g4 == 0)) {
                z13 = true;
            }
            if (!bnVar.f46247y2 && !bnVar.f46221w2 && !z13 && org.telegram.messenger.bz.M < 3 && !bnVar.f45932a0.M0()) {
                org.telegram.messenger.g0.r(vfVar);
                org.telegram.messenger.g0.h3(vfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean k() {
        return this.f49876b.Z6();
    }

    @Override
    public final void k2(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        bn bnVar = this.f49876b;
        if (i7 < currentActionBarHeight) {
            bnVar.f46160r5 = false;
            if (bnVar.f46170s1.getVisibility() == 0) {
                bnVar.f46170s1.setVisibility(4);
            }
        } else {
            bnVar.f46160r5 = true;
            if (bnVar.f46170s1.getVisibility() == 4 && !bnVar.isInPreviewMode()) {
                bnVar.f46170s1.setVisibility(0);
            }
        }
        bnVar.s5 = true ^ bnVar.f45932a0.O0();
        if (bnVar.f45932a0.O0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f49875a != i11) {
            bnVar.f45975d0 = 0;
        }
        this.f49875a = i11;
    }

    @Override
    public final void l1() {
        org.telegram.ui.Components.e50 e50Var = this.f49876b.f46144q3;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override
    public final rm m0() {
        return this.f49876b.D5;
    }

    @Override
    public final boolean m1() {
        bn bnVar = this.f49876b;
        TLRPC.User user = bnVar.f46001f;
        if (user != null && !org.telegram.messenger.o10.C(user) && !bnVar.f46001f.bot && bnVar.h == null && bnVar.f46018g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2() {
        int indexOfChild;
        int i7;
        bn bnVar = this.f49876b;
        if (bnVar.getParentActivity() != null) {
            if ((bnVar.f45987e != null || bnVar.f46176s8 != null) && bnVar.fragmentView != null) {
                hi.m3 m3Var = bnVar.f46194u2;
                if ((m3Var == null || !m3Var.W) && (indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.U)) != -1) {
                    try {
                        bnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (bnVar.f46194u2 == null) {
                        bnVar.f46194u2 = bnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = bnVar.f46176s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        hi.m3 m3Var2 = bnVar.f46194u2;
                        if (bnVar.f45932a0.f32567d1) {
                            i7 = 2131743357;
                        } else {
                            i7 = 2131743283;
                        }
                        m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i7, bnVar.f46001f.first_name)));
                    } else if (!org.telegram.messenger.v3.v(bnVar.f45987e) && !org.telegram.messenger.v3.s(bnVar.f45987e)) {
                        if (!bnVar.Z6()) {
                            if (bnVar.f45932a0.f32567d1) {
                                bnVar.f46194u2.v(org.telegram.messenger.v3.L(21, bnVar.f45987e));
                            } else {
                                bnVar.f46194u2.v(org.telegram.messenger.v3.L(20, bnVar.f45987e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.v3.P(20, bnVar.f45987e)) {
                        bnVar.f46194u2.v(org.telegram.messenger.gd.M0(2131749362, null));
                    } else if (org.telegram.messenger.v3.P(21, bnVar.f45987e)) {
                        bnVar.f46194u2.v(org.telegram.messenger.gd.M0(2131749365, null));
                    } else if (org.telegram.messenger.v3.P(7, bnVar.f45987e)) {
                        bnVar.f46194u2.v(org.telegram.messenger.gd.M0(2131749368, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = bnVar.f45987e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                bnVar.f46194u2.v(org.telegram.messenger.gd.M0(2131753953, null));
                            } else {
                                bnVar.f46194u2.v(org.telegram.messenger.gd.a0("AttachMediaRestricted", null, 2131753954, org.telegram.messenger.gd.v(bnVar.f45987e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = bnVar.f45932a0.getSendButton();
                    View audioVideoButtonContainer = bnVar.f45932a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    bnVar.f46194u2.z(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int n() {
        return this.f49876b.f46093m1.Q();
    }

    @Override
    public final void n1() {
        int i7;
        bn bnVar = this.f49876b;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        long j3 = bnVar.f46085l6;
        org.telegram.messenger.kj kjVar = bnVar.f46250y5;
        if (kjVar == null) {
            kjVar = org.telegram.messenger.kj.a();
        }
        new di.r0(parentActivity, i7, j3, kjVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
    }

    @Override
    public final void n2(boolean z10) {
        bn bnVar = this.f49876b;
        View view = bnVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        bnVar.f46185t5 = !z10;
    }

    @Override
    public final void o1() {
        this.f49876b.W6();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.e50 z40Var;
        bn bnVar = this.f49876b;
        boolean z11 = false;
        if (bnVar.f46144q3 == null && CameraView.isCameraAllowed() && bnVar.getParentActivity() != null) {
            Activity parentActivity = bnVar.getParentActivity();
            zm zmVar = bnVar.Ba;
            if (org.telegram.ui.Components.e50.e(org.telegram.messenger.j10.f24773t0)) {
                z40Var = new org.telegram.ui.Components.y40(parentActivity, bnVar, zmVar);
            } else {
                z40Var = new org.telegram.ui.Components.z40(parentActivity, bnVar, zmVar, true);
            }
            bnVar.f46144q3 = z40Var;
            z40Var.setAnimationCallback(new ee(bnVar, 0));
            bnVar.f46144q3.setTrimCallback(new ee(bnVar, 1));
            bnVar.f46144q3.setRecordingUiFrameCallback(new xi(bnVar));
            bnVar.f46144q3.setClipToPadding(false);
            bnVar.f46144q3.i(bnVar.L, bnVar.f46231x);
            int indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.U);
            if (indexOfChild < 0) {
                indexOfChild = bnVar.f46093m1.getChildCount();
            }
            bnVar.f46093m1.addView(bnVar.f46144q3, Math.min(indexOfChild + 1, bnVar.f46093m1.getChildCount()), c8.ma.e(-1, -1, 51));
        }
        org.telegram.ui.Components.e50 e50Var = bnVar.f46144q3;
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
        bn bnVar = this.f49876b;
        bnVar.l7();
        rj rjVar = bnVar.f45932a0;
        boolean z12 = rjVar.f32646n4;
        org.telegram.ui.Components.cg cgVar = rjVar.V0;
        if (cgVar != null && cgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46013fd;
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
        org.telegram.ui.Components.yw0 yw0Var = bnVar.f46170s1;
        if (yw0Var != null) {
            yw0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = bnVar.f46170s1.animate();
            if (!z12 && !bnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.lr.f37208f).withEndAction(new ch.k(20, this, z12)).start();
        }
    }

    @Override
    public final void r2() {
        bn bnVar = this.f49876b;
        hi.m3 m3Var = bnVar.f46207v2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        hi.m3 m3Var2 = bnVar.f46234x2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49876b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.f29088o0 && !bnVar.ca() && TextUtils.isEmpty(bnVar.f45932a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46054j0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46014g0;
            if (yVar != null) {
                yVar.e(0);
            }
            fr frVar = bnVar.f46002f0;
            if (frVar != null) {
                frVar.b(true);
            }
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        bn bnVar = this.f49876b;
        bnVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46054j0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            bnVar.f46054j0.setVisibility(0);
            org.telegram.ui.ActionBar.y yVar = bnVar.f46014g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = bnVar.f46002f0;
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
        bn bnVar = this.f49876b;
        if (bnVar.B0 != null) {
            bnVar.f45975d0 = bnVar.f45932a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null) {
            kjVar.getAdapter().f17512g0 = true;
        }
        if (bnVar.H5 != null) {
            org.telegram.messenger.g0.h3(new bh(this, 7), 30L);
        }
        if (bnVar.f45932a0.O0()) {
            bnVar.f45932a0.C1();
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.f45932a0.t1(true, true, z10);
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
        this.f49876b.Cb(charSequence, true);
    }

    @Override
    public final boolean v1() {
        org.telegram.messenger.hj hjVar;
        org.telegram.messenger.jj jjVar = this.f49876b.f46237x5;
        if (jjVar != null && (hjVar = jjVar.f24868b) != null && !hjVar.f24458e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w1() {
        int i7;
        char c10;
        long j3;
        bn bnVar = this.f49876b;
        i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = bnVar.f46085l6;
        long d = (int) bnVar.d();
        LongSparseArray p10 = b10.f23825a.p(j10, d);
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
                    if (!a2Var.f22815e) {
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
            if (a2Var2 != null && !a2Var2.f22815e) {
                Runnable runnable = a2Var2.f22816f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f23826b.w(j10, d, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f22815e = true;
                    j3 = j12;
                } else {
                    b10.f23825a.y(j10, d, j12);
                    j3 = j12;
                    org.telegram.messenger.ks notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f22813b, d);
                    d = d;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ks.N5, objArr);
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
        bn bnVar = this.f49876b;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.f29088o0) {
            org.telegram.ui.ActionBar.r0 r0Var = bnVar.f46054j0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.y yVar = bnVar.f46014g0;
            if (yVar != null) {
                yVar.e(8);
            }
            fr frVar = bnVar.f46002f0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void x(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        bn bnVar = this.f49876b;
        if (i7 != 0) {
            bnVar.R4 = true;
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        bnVar.f46093m1.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
        if (gcVar != null && bnVar.Ec != null) {
            gcVar.l();
        }
    }
}
