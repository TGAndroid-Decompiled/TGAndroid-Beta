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
public final class ml implements org.telegram.ui.Components.ng {
    public int f49890a;
    public final bn f49891b;

    public ml(bn bnVar) {
        this.f49891b = bnVar;
    }

    @Override
    public final void A(boolean z10) {
        int i7;
        int i10;
        bn bnVar = this.f49891b;
        if (z10) {
            Activity parentActivity = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i10);
            bnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        org.telegram.messenger.g0.Z2(parentActivity2, i7);
    }

    @Override
    public final void B2() {
        bn bnVar = this.f49891b;
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null) {
            n2Var.x1(0, null);
        }
        bnVar.Aa();
    }

    @Override
    public final void D() {
        this.f49891b.Cc(true, false);
    }

    @Override
    public final boolean E0() {
        int i7;
        bn bnVar = this.f49891b;
        if ((!bnVar.getMessagesController().y2(bnVar.a()) || bnVar.f46250x4) && (i7 = bnVar.f46032g4) != 9 && bnVar.f46046h4 > 0) {
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
        org.telegram.ui.Components.ax0 ax0Var = this.f49891b.f46184s1;
        if (ax0Var != null) {
            ax0Var.e();
        }
    }

    @Override
    public final void G0() {
        bn bnVar = this.f49891b;
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
        bn bnVar = this.f49891b;
        if (!bnVar.X9() && (i7 = bnVar.f46032g4) != 6 && i7 != 8) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46099l6;
            long j10 = bnVar.f46187s4;
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
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
        bn bnVar = this.f49891b;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.B0 != null) {
            bnVar.f45989d0 = bnVar.f45946a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            bnVar.X1.getAdapter().f17554x.a(charSequence);
        }
        if (i7 != 0) {
            if (bnVar.f46046h4 == -1) {
                bnVar.f46046h4 = 0;
            }
            if (charSequence != null) {
                bnVar.f46046h4++;
            }
            org.telegram.messenger.jj jjVar2 = bnVar.f46251x5;
            if (jjVar2 != null && (hjVar2 = jjVar2.f24893b) != null && !hjVar2.f24483e.isEmpty()) {
                bnVar.f46046h4 += bnVar.f46251x5.f24893b.f24483e.size();
            }
            bnVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (jjVar = bnVar.f46251x5) != null && (hjVar = jjVar.f24893b) != null && !hjVar.f24483e.isEmpty() && bnVar.f46251x5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            bnVar.f46251x5.f24893b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.Peer B1 = bnVar.getMessagesController().B1(bnVar.f46099l6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList2.get(i12);
                if (fjVar2 != null && (message = fjVar2.f23993k) != null && !org.telegram.messenger.fj.v5(message.peer_id, B1)) {
                    z12 = false;
                    break;
                }
                i12++;
            }
            if (z12) {
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(2131624048, org.telegram.messenger.gd.N0(2131744065, null), org.telegram.messenger.gd.N0(2131744064, null));
                org.telegram.ui.Components.rh0 rh0Var = ((org.telegram.ui.Components.dc) I.f35504e).f34471a;
                rh0Var.setScaleX(1.8f);
                rh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.v3.c0(bnVar.f46001e) && !bnVar.f46250x4 && (fjVar = bnVar.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = fjVar.f23991j1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                b22 = org.telegram.messenger.fj.b2(i11, bnVar.F5.f23993k, true, false);
            } else {
                b22 = tL_forumTopic.f28483id;
            }
            long j10 = b22;
            if (j10 != 0) {
                bnVar.getMediaDataController().F(bnVar.f46099l6, j10, false);
            }
        }
        bnVar.fc(false, null, null, null, null, z10, i7, null, false, j3);
        rj rjVar = bnVar.f45946a0;
        if (rjVar != null && rjVar.getEmojiView() != null && (d1Var = bnVar.f45946a0.getEmojiView().U0) != null) {
            if (d1Var.f17462e) {
                org.telegram.messenger.mp.u1(d1Var.f17459a).N4(2, 0, d1Var.f17460b, d1Var.f17461c, null);
            }
            d1Var.f17463f = -1L;
        }
        if (!bnVar.getMessagesController().K3() && bnVar.getMessagesController().f25812v4 <= 0) {
            if (bnVar.getMessagesController().f25727l7 >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !bnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i13);
                    if (fjVar3 != null && !fjVar3.P3() && ((org.telegram.messenger.fj.R4(fjVar3.f23993k) || fjVar3.h4()) && fjVar3.f23993k.media_unread)) {
                        org.telegram.ui.Components.j21.u(fjVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f49891b.Ea;
    }

    @Override
    public final void J0() {
        this.f49891b.Ma(0, false);
    }

    @Override
    public final void Q(float f10, int i7) {
        org.telegram.ui.Components.h50 h50Var = this.f49891b.f46158q3;
        if (h50Var != null) {
            h50Var.b(f10, i7);
        }
    }

    @Override
    public final void Q0() {
        bn bnVar = this.f49891b;
        org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
        long j3 = bnVar.f46099l6;
        SparseArray sparseArray = sendMessagesHelper.f28416e;
        SparseArray sparseArray2 = sendMessagesHelper.f28415c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f28452id;
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
                        i7 = message2.f28452id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f49891b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void V() {
        boolean z10;
        bn bnVar = this.f49891b;
        rj rjVar = bnVar.f45946a0;
        boolean z11 = rjVar.f32689p4;
        org.telegram.ui.Components.fg fgVar = rjVar.V0;
        boolean z12 = false;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46027fd;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void a0(boolean z10) {
        this.f49891b.Cc(false, z10);
    }

    @Override
    public final void a1(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bn bnVar = this.f49891b;
        if (bnVar.f46172r3.getVisibility() != i10) {
            bnVar.f46172r3.setVisibility(i10);
        }
    }

    @Override
    public final void b0() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49891b.f46184s1;
        if (ax0Var != null) {
            ax0Var.f();
        }
    }

    @Override
    public final int b1() {
        return this.f49891b.f46107m1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final void d() {
        this.f49891b.dd();
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final void g() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49891b.f46184s1;
        if (ax0Var != null) {
            ax0Var.f();
        }
    }

    @Override
    public final boolean g1() {
        org.telegram.ui.Components.h50 h50Var = this.f49891b.f46158q3;
        if (h50Var != null && h50Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49891b.f46184s1;
        if (ax0Var != null) {
            ax0Var.e();
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
        bn bnVar = this.f49891b;
        if (isEmpty && !bnVar.f45946a0.Q0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            bnVar.X1.getAdapter().U(charSequence2, bnVar.f45946a0.getCursorPosition(), bnVar.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = bnVar.f45967b6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            bnVar.f45967b6 = null;
        }
        TLRPC.Chat chat = bnVar.f46001e;
        if (chat == null || org.telegram.messenger.v3.m(chat)) {
            rj rjVar = bnVar.f45946a0;
            if (rjVar.O3 && (!rjVar.Q0() || !bnVar.f45946a0.Q2)) {
                if (z10) {
                    bnVar.Cb(charSequence2, true);
                } else {
                    bnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    bnVar.f45967b6 = uVar2;
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
                ((mx) arrayList.get(i7)).f50017n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5438l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.f5438l = true;
        }
        if (!z11) {
            hi.l3 l3Var2 = bnVar.f46221v2;
            if ((l3Var2 != null && l3Var2.W) || ((l3Var = bnVar.f46248x2) != null && l3Var.W)) {
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
                hi.l3 l3Var3 = bnVar.f46248x2;
                if (l3Var3 != null) {
                    l3Var3.f(true);
                    return;
                }
                return;
            }
            vf vfVar = bnVar.f46104lb;
            if (org.telegram.messenger.o10.C(bnVar.f46015f) || ((chatFull = bnVar.f46177r8) != null && chatFull.slowmode_next_send_date > 0 && bnVar.f46032g4 == 0)) {
                z13 = true;
            }
            if (!bnVar.f46261y2 && !bnVar.f46235w2 && !z13 && org.telegram.messenger.bz.M < 3 && !bnVar.f45946a0.Q0()) {
                org.telegram.messenger.g0.r(vfVar);
                org.telegram.messenger.g0.h3(vfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean k() {
        return this.f49891b.Z6();
    }

    @Override
    public final void k2(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        bn bnVar = this.f49891b;
        if (i7 < currentActionBarHeight) {
            bnVar.f46174r5 = false;
            if (bnVar.f46184s1.getVisibility() == 0) {
                bnVar.f46184s1.setVisibility(4);
            }
        } else {
            bnVar.f46174r5 = true;
            if (bnVar.f46184s1.getVisibility() == 4 && !bnVar.isInPreviewMode()) {
                bnVar.f46184s1.setVisibility(0);
            }
        }
        bnVar.s5 = true ^ bnVar.f45946a0.S0();
        if (bnVar.f45946a0.S0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f49890a != i11) {
            bnVar.f45989d0 = 0;
        }
        this.f49890a = i11;
    }

    @Override
    public final void l1() {
        org.telegram.ui.Components.h50 h50Var = this.f49891b.f46158q3;
        if (h50Var != null) {
            h50Var.k();
        }
    }

    @Override
    public final rm m0() {
        return this.f49891b.D5;
    }

    @Override
    public final boolean m1() {
        bn bnVar = this.f49891b;
        TLRPC.User user = bnVar.f46015f;
        if (user != null && !org.telegram.messenger.o10.C(user) && !bnVar.f46015f.bot && bnVar.h == null && bnVar.f46032g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2() {
        int indexOfChild;
        int i7;
        bn bnVar = this.f49891b;
        if (bnVar.getParentActivity() != null) {
            if ((bnVar.f46001e != null || bnVar.f46190s8 != null) && bnVar.fragmentView != null) {
                hi.l3 l3Var = bnVar.f46208u2;
                if ((l3Var == null || !l3Var.W) && (indexOfChild = bnVar.f46107m1.indexOfChild(bnVar.U)) != -1) {
                    try {
                        bnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (bnVar.f46208u2 == null) {
                        bnVar.f46208u2 = bnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = bnVar.f46190s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        hi.l3 l3Var2 = bnVar.f46208u2;
                        if (bnVar.f45946a0.f32595d1) {
                            i7 = 2131743351;
                        } else {
                            i7 = 2131743277;
                        }
                        l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i7, bnVar.f46015f.first_name)));
                    } else if (!org.telegram.messenger.v3.v(bnVar.f46001e) && !org.telegram.messenger.v3.s(bnVar.f46001e)) {
                        if (!bnVar.Z6()) {
                            if (bnVar.f45946a0.f32595d1) {
                                bnVar.f46208u2.v(org.telegram.messenger.v3.L(21, bnVar.f46001e));
                            } else {
                                bnVar.f46208u2.v(org.telegram.messenger.v3.L(20, bnVar.f46001e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.v3.P(20, bnVar.f46001e)) {
                        bnVar.f46208u2.v(org.telegram.messenger.gd.N0(2131749361, null));
                    } else if (org.telegram.messenger.v3.P(21, bnVar.f46001e)) {
                        bnVar.f46208u2.v(org.telegram.messenger.gd.N0(2131749364, null));
                    } else if (org.telegram.messenger.v3.P(7, bnVar.f46001e)) {
                        bnVar.f46208u2.v(org.telegram.messenger.gd.N0(2131749367, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = bnVar.f46001e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                bnVar.f46208u2.v(org.telegram.messenger.gd.N0(2131753952, null));
                            } else {
                                bnVar.f46208u2.v(org.telegram.messenger.gd.a0("AttachMediaRestricted", null, 2131753953, org.telegram.messenger.gd.v(bnVar.f46001e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = bnVar.f45946a0.getSendButton();
                    View audioVideoButtonContainer = bnVar.f45946a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    bnVar.f46208u2.z(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int n() {
        return this.f49891b.f46107m1.Q();
    }

    @Override
    public final void n1() {
        int i7;
        bn bnVar = this.f49891b;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        long j3 = bnVar.f46099l6;
        org.telegram.messenger.kj kjVar = bnVar.f46264y5;
        if (kjVar == null) {
            kjVar = org.telegram.messenger.kj.a();
        }
        new di.r0(parentActivity, i7, j3, kjVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
    }

    @Override
    public final void n2(boolean z10) {
        bn bnVar = this.f49891b;
        View view = bnVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        bnVar.f46199t5 = !z10;
    }

    @Override
    public final void o1() {
        this.f49891b.W6();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.h50 c50Var;
        bn bnVar = this.f49891b;
        boolean z11 = false;
        if (bnVar.f46158q3 == null && CameraView.isCameraAllowed() && bnVar.getParentActivity() != null) {
            Activity parentActivity = bnVar.getParentActivity();
            zm zmVar = bnVar.Ba;
            if (org.telegram.ui.Components.h50.e(org.telegram.messenger.j10.f24798t0)) {
                c50Var = new org.telegram.ui.Components.b50(parentActivity, bnVar, zmVar);
            } else {
                c50Var = new org.telegram.ui.Components.c50(parentActivity, bnVar, zmVar, true);
            }
            bnVar.f46158q3 = c50Var;
            c50Var.setAnimationCallback(new ee(bnVar, 0));
            bnVar.f46158q3.setTrimCallback(new ee(bnVar, 1));
            bnVar.f46158q3.setRecordingUiFrameCallback(new xi(bnVar));
            bnVar.f46158q3.setClipToPadding(false);
            bnVar.f46158q3.i(bnVar.L, bnVar.f46245x);
            int indexOfChild = bnVar.f46107m1.indexOfChild(bnVar.U);
            if (indexOfChild < 0) {
                indexOfChild = bnVar.f46107m1.getChildCount();
            }
            bnVar.f46107m1.addView(bnVar.f46158q3, Math.min(indexOfChild + 1, bnVar.f46107m1.getChildCount()), c8.ma.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h50 h50Var = bnVar.f46158q3;
        if (h50Var != null) {
            if (i7 == 0) {
                h50Var.j(false);
                bnVar.A0.C0();
                bnVar.D0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z11 = true;
                    }
                    h50Var.a(z11);
                }
            } else {
                h50Var.h(i7, i10, i11, j3, j10, z10);
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
        bn bnVar = this.f49891b;
        bnVar.l7();
        rj rjVar = bnVar.f45946a0;
        boolean z12 = rjVar.f32689p4;
        org.telegram.ui.Components.fg fgVar = rjVar.V0;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46027fd;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = bnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i10);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35500w;
            if (gcVar != null && gcVar.f35510l) {
                gcVar.b();
            }
        } else {
            Activity parentActivity2 = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f37956f).start();
        }
        org.telegram.ui.Components.ax0 ax0Var = bnVar.f46184s1;
        if (ax0Var != null) {
            ax0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = bnVar.f46184s1.animate();
            if (!z12 && !bnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.nr.f37956f).withEndAction(new ch.k(20, this, z12)).start();
        }
    }

    @Override
    public final void r2() {
        bn bnVar = this.f49891b;
        hi.l3 l3Var = bnVar.f46221v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = bnVar.f46248x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49891b;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.f29147o0 && !bnVar.ca() && TextUtils.isEmpty(bnVar.f45946a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46068j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.f46028g0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = bnVar.f46016f0;
            if (frVar != null) {
                frVar.b(true);
            }
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        bn bnVar = this.f49891b;
        bnVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46068j0;
        if (q0Var != null && q0Var.getVisibility() != 0) {
            bnVar.f46068j0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = bnVar.f46028g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = bnVar.f46016f0;
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
        bn bnVar = this.f49891b;
        if (bnVar.B0 != null) {
            bnVar.f45989d0 = bnVar.f45946a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null) {
            kjVar.getAdapter().f17534g0 = true;
        }
        if (bnVar.H5 != null) {
            org.telegram.messenger.g0.h3(new bh(this, 7), 30L);
        }
        if (bnVar.f45946a0.S0()) {
            bnVar.f45946a0.G1();
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.f45946a0.x1(true, true, z10);
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
        this.f49891b.Cb(charSequence, true);
    }

    @Override
    public final boolean v1() {
        org.telegram.messenger.hj hjVar;
        org.telegram.messenger.jj jjVar = this.f49891b.f46251x5;
        if (jjVar != null && (hjVar = jjVar.f24893b) != null && !hjVar.f24483e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w1() {
        int i7;
        char c10;
        long j3;
        bn bnVar = this.f49891b;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = bnVar.f46099l6;
        long d = (int) bnVar.d();
        LongSparseArray p10 = b10.f23850a.p(j10, d);
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
                    if (!a2Var.f22840e) {
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
            if (a2Var2 != null && !a2Var2.f22840e) {
                Runnable runnable = a2Var2.f22841f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f23851b.w(j10, d, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f22840e = true;
                    j3 = j12;
                } else {
                    b10.f23850a.y(j10, d, j12);
                    j3 = j12;
                    org.telegram.messenger.ks notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f22838b, d);
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
        bn bnVar = this.f49891b;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.f29147o0) {
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46068j0;
            if (q0Var != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.f46028g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = bnVar.f46016f0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void x(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        bn bnVar = this.f49891b;
        if (i7 != 0) {
            bnVar.R4 = true;
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        bnVar.f46107m1.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35500w;
        if (gcVar != null && bnVar.Ec != null) {
            gcVar.l();
        }
    }
}
