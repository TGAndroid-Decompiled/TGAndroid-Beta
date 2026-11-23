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
    public int f49894a;
    public final bn f49895b;

    public ml(bn bnVar) {
        this.f49895b = bnVar;
    }

    @Override
    public final void A(boolean z10) {
        int i7;
        int i10;
        bn bnVar = this.f49895b;
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
        bn bnVar = this.f49895b;
        fi.n2 n2Var = bnVar.Y1;
        if (n2Var != null) {
            n2Var.x1(0, null);
        }
        bnVar.Aa();
    }

    @Override
    public final void D() {
        this.f49895b.Cc(true, false);
    }

    @Override
    public final boolean E0() {
        int i7;
        bn bnVar = this.f49895b;
        if ((!bnVar.getMessagesController().y2(bnVar.a()) || bnVar.f46254x4) && (i7 = bnVar.f46036g4) != 9 && bnVar.f46050h4 > 0) {
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
        org.telegram.ui.Components.ax0 ax0Var = this.f49895b.f46188s1;
        if (ax0Var != null) {
            ax0Var.e();
        }
    }

    @Override
    public final void G0() {
        bn bnVar = this.f49895b;
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
        bn bnVar = this.f49895b;
        if (!bnVar.X9() && (i7 = bnVar.f46036g4) != 6 && i7 != 8) {
            org.telegram.messenger.np messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46103l6;
            long j10 = bnVar.f46191s4;
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            messagesController.N4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final void H(CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        boolean z11;
        jg.d1 d1Var;
        org.telegram.messenger.gj gjVar;
        int i11;
        long b22;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        boolean z12;
        TLRPC.Message message;
        org.telegram.messenger.ij ijVar2;
        bn bnVar = this.f49895b;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.B0 != null) {
            bnVar.f45993d0 = bnVar.f45950a0.getBackgroundTop();
        }
        kj kjVar2 = bnVar.X1;
        if (kjVar2 != null && kjVar2.getAdapter() != null) {
            bnVar.X1.getAdapter().f17557x.a(charSequence);
        }
        if (i7 != 0) {
            if (bnVar.f46050h4 == -1) {
                bnVar.f46050h4 = 0;
            }
            if (charSequence != null) {
                bnVar.f46050h4++;
            }
            org.telegram.messenger.kj kjVar3 = bnVar.f46255x5;
            if (kjVar3 != null && (ijVar2 = kjVar3.f25080b) != null && !ijVar2.f24736e.isEmpty()) {
                bnVar.f46050h4 += bnVar.f46255x5.f25080b.f24736e.size();
            }
            bnVar.md(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (kjVar = bnVar.f46255x5) != null && (ijVar = kjVar.f25080b) != null && !ijVar.f24736e.isEmpty() && bnVar.f46255x5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            bnVar.f46255x5.f25080b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.Peer B1 = bnVar.getMessagesController().B1(bnVar.f46103l6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList2.get(i12);
                if (gjVar2 != null && (message = gjVar2.f24213k) != null && !org.telegram.messenger.gj.v5(message.peer_id, B1)) {
                    z12 = false;
                    break;
                }
                i12++;
            }
            if (z12) {
                org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(bnVar).I(2131624048, org.telegram.messenger.hd.N0(2131744063, null), org.telegram.messenger.hd.N0(2131744062, null));
                org.telegram.ui.Components.rh0 rh0Var = ((org.telegram.ui.Components.dc) I.f35523e).f34466a;
                rh0Var.setScaleX(1.8f);
                rh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.v3.c0(bnVar.f46005e) && !bnVar.f46254x4 && (gjVar = bnVar.F5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = gjVar.f24211j1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                b22 = org.telegram.messenger.gj.b2(i11, bnVar.F5.f24213k, true, false);
            } else {
                b22 = tL_forumTopic.f28486id;
            }
            long j10 = b22;
            if (j10 != 0) {
                bnVar.getMediaDataController().F(bnVar.f46103l6, j10, false);
            }
        }
        bnVar.fc(false, null, null, null, null, z10, i7, null, false, j3);
        rj rjVar = bnVar.f45950a0;
        if (rjVar != null && rjVar.getEmojiView() != null && (d1Var = bnVar.f45950a0.getEmojiView().U0) != null) {
            if (d1Var.f17465e) {
                org.telegram.messenger.np.u1(d1Var.f17462a).N4(2, 0, d1Var.f17463b, d1Var.f17464c, null);
            }
            d1Var.f17466f = -1L;
        }
        if (!bnVar.getMessagesController().K3() && bnVar.getMessagesController().f25983v4 <= 0) {
            if (bnVar.getMessagesController().f25898l7 >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !bnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) arrayList.get(i13);
                    if (gjVar3 != null && !gjVar3.P3() && ((org.telegram.messenger.gj.R4(gjVar3.f24213k) || gjVar3.h4()) && gjVar3.f24213k.media_unread)) {
                        org.telegram.ui.Components.j21.v(gjVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers J() {
        return this.f49895b.Ea;
    }

    @Override
    public final void J0() {
        this.f49895b.Ma(0, false);
    }

    @Override
    public final void Q(float f10, int i7) {
        org.telegram.ui.Components.h50 h50Var = this.f49895b.f46162q3;
        if (h50Var != null) {
            h50Var.b(f10, i7);
        }
    }

    @Override
    public final void Q0() {
        bn bnVar = this.f49895b;
        org.telegram.messenger.az sendMessagesHelper = bnVar.getSendMessagesHelper();
        long j3 = bnVar.f46103l6;
        SparseArray sparseArray = sendMessagesHelper.f23007e;
        SparseArray sparseArray2 = sendMessagesHelper.f23006c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f28455id;
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
                        i7 = message2.f28455id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f49895b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void V() {
        boolean z10;
        bn bnVar = this.f49895b;
        rj rjVar = bnVar.f45950a0;
        boolean z11 = rjVar.f32692p4;
        org.telegram.ui.Components.fg fgVar = rjVar.V0;
        boolean z12 = false;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46031fd;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final void a0(boolean z10) {
        this.f49895b.Cc(false, z10);
    }

    @Override
    public final void a1(int i7) {
        int i10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        bn bnVar = this.f49895b;
        if (bnVar.f46176r3.getVisibility() != i10) {
            bnVar.f46176r3.setVisibility(i10);
        }
    }

    @Override
    public final void b0() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49895b.f46188s1;
        if (ax0Var != null) {
            ax0Var.f();
        }
    }

    @Override
    public final int b1() {
        return this.f49895b.f46111m1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem c1() {
        return null;
    }

    @Override
    public final void d() {
        this.f49895b.dd();
    }

    @Override
    public final boolean e1(long j3) {
        return false;
    }

    @Override
    public final void g() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49895b.f46188s1;
        if (ax0Var != null) {
            ax0Var.f();
        }
    }

    @Override
    public final boolean g1() {
        org.telegram.ui.Components.h50 h50Var = this.f49895b.f46162q3;
        if (h50Var != null && h50Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void i2() {
        org.telegram.ui.Components.ax0 ax0Var = this.f49895b.f46188s1;
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
        bn bnVar = this.f49895b;
        if (isEmpty && !bnVar.f45950a0.Q0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        kj kjVar = bnVar.X1;
        if (kjVar != null && kjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            bnVar.X1.getAdapter().U(charSequence2, bnVar.f45950a0.getCursorPosition(), bnVar.M6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = bnVar.f45971b6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            bnVar.f45971b6 = null;
        }
        TLRPC.Chat chat = bnVar.f46005e;
        if (chat == null || org.telegram.messenger.v3.m(chat)) {
            rj rjVar = bnVar.f45950a0;
            if (rjVar.O3 && (!rjVar.Q0() || !bnVar.f45950a0.Q2)) {
                if (z10) {
                    bnVar.Cb(charSequence2, true);
                } else {
                    bnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 27);
                    bnVar.f45971b6 = uVar2;
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
                ((mx) arrayList.get(i7)).f50021n = true;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.f5441l = true;
        }
        ch.l0 l0Var2 = ch.l0.C;
        if (l0Var2 != null) {
            l0Var2.f5441l = true;
        }
        if (!z11) {
            hi.l3 l3Var2 = bnVar.f46225v2;
            if ((l3Var2 != null && l3Var2.W) || ((l3Var = bnVar.f46252x2) != null && l3Var.W)) {
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
                hi.l3 l3Var3 = bnVar.f46252x2;
                if (l3Var3 != null) {
                    l3Var3.f(true);
                    return;
                }
                return;
            }
            vf vfVar = bnVar.f46108lb;
            if (org.telegram.messenger.p10.C(bnVar.f46019f) || ((chatFull = bnVar.f46181r8) != null && chatFull.slowmode_next_send_date > 0 && bnVar.f46036g4 == 0)) {
                z13 = true;
            }
            if (!bnVar.f46265y2 && !bnVar.f46239w2 && !z13 && org.telegram.messenger.cz.M < 3 && !bnVar.f45950a0.Q0()) {
                org.telegram.messenger.g0.r(vfVar);
                org.telegram.messenger.g0.h3(vfVar, 4000L);
            }
        }
    }

    @Override
    public final boolean k() {
        return this.f49895b.Z6();
    }

    @Override
    public final void k2(int i7) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        bn bnVar = this.f49895b;
        if (i7 < currentActionBarHeight) {
            bnVar.f46178r5 = false;
            if (bnVar.f46188s1.getVisibility() == 0) {
                bnVar.f46188s1.setVisibility(4);
            }
        } else {
            bnVar.f46178r5 = true;
            if (bnVar.f46188s1.getVisibility() == 4 && !bnVar.isInPreviewMode()) {
                bnVar.f46188s1.setVisibility(0);
            }
        }
        bnVar.s5 = true ^ bnVar.f45950a0.S0();
        if (bnVar.f45950a0.S0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f49894a != i11) {
            bnVar.f45993d0 = 0;
        }
        this.f49894a = i11;
    }

    @Override
    public final void l1() {
        org.telegram.ui.Components.h50 h50Var = this.f49895b.f46162q3;
        if (h50Var != null) {
            h50Var.k();
        }
    }

    @Override
    public final rm m0() {
        return this.f49895b.D5;
    }

    @Override
    public final boolean m1() {
        bn bnVar = this.f49895b;
        TLRPC.User user = bnVar.f46019f;
        if (user != null && !org.telegram.messenger.p10.C(user) && !bnVar.f46019f.bot && bnVar.h == null && bnVar.f46036g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2() {
        int indexOfChild;
        int i7;
        bn bnVar = this.f49895b;
        if (bnVar.getParentActivity() != null) {
            if ((bnVar.f46005e != null || bnVar.f46194s8 != null) && bnVar.fragmentView != null) {
                hi.l3 l3Var = bnVar.f46212u2;
                if ((l3Var == null || !l3Var.W) && (indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.U)) != -1) {
                    try {
                        bnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (bnVar.f46212u2 == null) {
                        bnVar.f46212u2 = bnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = bnVar.f46194s8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        hi.l3 l3Var2 = bnVar.f46212u2;
                        if (bnVar.f45950a0.f32598d1) {
                            i7 = 2131743349;
                        } else {
                            i7 = 2131743275;
                        }
                        l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i7, bnVar.f46019f.first_name)));
                    } else if (!org.telegram.messenger.v3.v(bnVar.f46005e) && !org.telegram.messenger.v3.s(bnVar.f46005e)) {
                        if (!bnVar.Z6()) {
                            if (bnVar.f45950a0.f32598d1) {
                                bnVar.f46212u2.v(org.telegram.messenger.v3.L(21, bnVar.f46005e));
                            } else {
                                bnVar.f46212u2.v(org.telegram.messenger.v3.L(20, bnVar.f46005e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.v3.P(20, bnVar.f46005e)) {
                        bnVar.f46212u2.v(org.telegram.messenger.hd.N0(2131749361, null));
                    } else if (org.telegram.messenger.v3.P(21, bnVar.f46005e)) {
                        bnVar.f46212u2.v(org.telegram.messenger.hd.N0(2131749364, null));
                    } else if (org.telegram.messenger.v3.P(7, bnVar.f46005e)) {
                        bnVar.f46212u2.v(org.telegram.messenger.hd.N0(2131749367, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = bnVar.f46005e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                bnVar.f46212u2.v(org.telegram.messenger.hd.N0(2131753952, null));
                            } else {
                                bnVar.f46212u2.v(org.telegram.messenger.hd.a0("AttachMediaRestricted", null, 2131753953, org.telegram.messenger.hd.v(bnVar.f46005e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = bnVar.f45950a0.getSendButton();
                    View audioVideoButtonContainer = bnVar.f45950a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    bnVar.f46212u2.z(sendButton, true);
                }
            }
        }
    }

    @Override
    public final int n() {
        return this.f49895b.f46111m1.Q();
    }

    @Override
    public final void n1() {
        int i7;
        bn bnVar = this.f49895b;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        long j3 = bnVar.f46103l6;
        org.telegram.messenger.lj ljVar = bnVar.f46268y5;
        if (ljVar == null) {
            ljVar = org.telegram.messenger.lj.a();
        }
        new di.r0(parentActivity, i7, j3, ljVar, bnVar, bnVar.getResourceProvider(), 0, new me(bnVar, 1)).show();
    }

    @Override
    public final void n2(boolean z10) {
        bn bnVar = this.f49895b;
        View view = bnVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        bnVar.f46203t5 = !z10;
    }

    @Override
    public final void o1() {
        this.f49895b.W6();
    }

    @Override
    public final void o2(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        org.telegram.ui.Components.h50 c50Var;
        bn bnVar = this.f49895b;
        boolean z11 = false;
        if (bnVar.f46162q3 == null && CameraView.isCameraAllowed() && bnVar.getParentActivity() != null) {
            Activity parentActivity = bnVar.getParentActivity();
            zm zmVar = bnVar.Ba;
            if (org.telegram.ui.Components.h50.e(org.telegram.messenger.k10.f24968t0)) {
                c50Var = new org.telegram.ui.Components.b50(parentActivity, bnVar, zmVar);
            } else {
                c50Var = new org.telegram.ui.Components.c50(parentActivity, bnVar, zmVar, true);
            }
            bnVar.f46162q3 = c50Var;
            c50Var.setAnimationCallback(new ee(bnVar, 0));
            bnVar.f46162q3.setTrimCallback(new ee(bnVar, 1));
            bnVar.f46162q3.setRecordingUiFrameCallback(new xi(bnVar));
            bnVar.f46162q3.setClipToPadding(false);
            bnVar.f46162q3.i(bnVar.L, bnVar.f46249x);
            int indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.U);
            if (indexOfChild < 0) {
                indexOfChild = bnVar.f46111m1.getChildCount();
            }
            bnVar.f46111m1.addView(bnVar.f46162q3, Math.min(indexOfChild + 1, bnVar.f46111m1.getChildCount()), c8.ma.e(-1, -1, 51));
        }
        org.telegram.ui.Components.h50 h50Var = bnVar.f46162q3;
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
        bn bnVar = this.f49895b;
        bnVar.l7();
        rj rjVar = bnVar.f45950a0;
        boolean z12 = rjVar.f32692p4;
        org.telegram.ui.Components.fg fgVar = rjVar.V0;
        if (fgVar != null && fgVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        te.a aVar = bnVar.f46031fd;
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
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
            if (gcVar != null && gcVar.f35529l) {
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.nr.f37961f).start();
        }
        org.telegram.ui.Components.ax0 ax0Var = bnVar.f46188s1;
        if (ax0Var != null) {
            ax0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = bnVar.f46188s1.animate();
            if (!z12 && !bnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.nr.f37961f).withEndAction(new ch.k(20, this, z12)).start();
        }
    }

    @Override
    public final void r2() {
        bn bnVar = this.f49895b;
        hi.l3 l3Var = bnVar.f46225v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = bnVar.f46252x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final void s0() {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49895b;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.f29150o0 && !bnVar.ca() && TextUtils.isEmpty(bnVar.f45950a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46072j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.f46032g0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = bnVar.f46020f0;
            if (frVar != null) {
                frVar.b(true);
            }
        }
    }

    @Override
    public final void s1(View view, CharSequence charSequence, boolean z10) {
        bn bnVar = this.f49895b;
        bnVar.zc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46072j0;
        if (q0Var != null && q0Var.getVisibility() != 0) {
            bnVar.f46072j0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = bnVar.f46032g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = bnVar.f46020f0;
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
        bn bnVar = this.f49895b;
        if (bnVar.B0 != null) {
            bnVar.f45993d0 = bnVar.f45950a0.getBackgroundTop();
        }
        kj kjVar = bnVar.X1;
        if (kjVar != null) {
            kjVar.getAdapter().f17537g0 = true;
        }
        if (bnVar.H5 != null) {
            org.telegram.messenger.g0.h3(new bh(this, 7), 30L);
        }
        if (bnVar.f45950a0.S0()) {
            bnVar.f45950a0.G1();
            z10 = true;
        } else {
            z10 = false;
        }
        bnVar.f45950a0.x1(true, true, z10);
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
        this.f49895b.Cb(charSequence, true);
    }

    @Override
    public final boolean v1() {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.kj kjVar = this.f49895b.f46255x5;
        if (kjVar != null && (ijVar = kjVar.f25080b) != null && !ijVar.f24736e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void w1() {
        int i7;
        char c10;
        long j3;
        bn bnVar = this.f49895b;
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = bnVar.f46103l6;
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
                    if (!a2Var.f22855e) {
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
            if (a2Var2 != null && !a2Var2.f22855e) {
                Runnable runnable = a2Var2.f22856f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f23823b.w(j10, d, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f22855e = true;
                    j3 = j12;
                } else {
                    b10.f23822a.y(j10, d, j12);
                    j3 = j12;
                    org.telegram.messenger.ls notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f22853b, d);
                    d = d;
                    Object[] objArr = new Object[1];
                    objArr[c10] = b2Var;
                    notificationCenter.k(org.telegram.messenger.ls.O5, objArr);
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
        bn bnVar = this.f49895b;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.f29150o0) {
            org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46072j0;
            if (q0Var != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = bnVar.f46032g0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = bnVar.f46020f0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void x(float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        bn bnVar = this.f49895b;
        if (i7 != 0) {
            bnVar.R4 = true;
        }
        bnVar.M9();
        bnVar.O9();
        bnVar.vd(false, false);
        bnVar.f46111m1.invalidate();
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
        if (gcVar != null && bnVar.Ec != null) {
            gcVar.l();
        }
    }
}
