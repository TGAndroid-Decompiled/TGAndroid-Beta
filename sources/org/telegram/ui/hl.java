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
public final class hl implements org.telegram.ui.Components.uf {
    public int f45932a;
    public final wm f45933b;

    public hl(wm wmVar) {
        this.f45933b = wmVar;
    }

    @Override
    public final void A(boolean z10) {
        int i3;
        int i10;
        wm wmVar = this.f45933b;
        if (z10) {
            Activity parentActivity = wmVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            wmVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity2, i3);
    }

    @Override
    public final void E() {
        this.f45933b.yc(true, false);
    }

    @Override
    public final void F() {
        org.telegram.ui.Components.ow0 ow0Var = this.f45933b.f51472s1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override
    public final void F0() {
        this.f45933b.Ja(0, false);
    }

    @Override
    public final void G(CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        boolean z11;
        kg.a1 a1Var;
        org.telegram.messenger.zi ziVar;
        int i11;
        long c2;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        boolean z12;
        TLRPC.Message message;
        org.telegram.messenger.bj bjVar2;
        wm wmVar = this.f45933b;
        ArrayList arrayList = wmVar.L6;
        if (wmVar.B0 != null) {
            wmVar.f51278d0 = wmVar.f51237a0.getBackgroundTop();
        }
        fj fjVar = wmVar.X1;
        if (fjVar != null && fjVar.getAdapter() != null) {
            wmVar.X1.getAdapter().f17019x.a(charSequence);
        }
        if (i3 != 0) {
            if (wmVar.f51338h4 == -1) {
                wmVar.f51338h4 = 0;
            }
            if (charSequence != null) {
                wmVar.f51338h4++;
            }
            org.telegram.messenger.dj djVar2 = wmVar.f51526w5;
            if (djVar2 != null && (bjVar2 = djVar2.f22198b) != null && !bjVar2.f21841e.isEmpty()) {
                wmVar.f51338h4 += wmVar.f51526w5.f22198b.f21841e.size();
            }
            wmVar.id(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (djVar = wmVar.f51526w5) != null && (bjVar = djVar.f22198b) != null && !bjVar.f21841e.isEmpty() && wmVar.f51526w5.d == null && j10 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            wmVar.f51526w5.f22198b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            TLRPC.Peer z13 = wmVar.getMessagesController().z1(wmVar.f51376k6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i12);
                if (ziVar2 != null && (message = ziVar2.f26868k) != null && !org.telegram.messenger.zi.w5(message.peer_id, z13)) {
                    z12 = false;
                    break;
                }
                i12++;
            }
            if (z12) {
                org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(wmVar).I(2131624047, org.telegram.messenger.bd.M0(2131744316, null), org.telegram.messenger.bd.M0(2131744315, null));
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.xb) I.f31788e).f40302a;
                fh0Var.setScaleX(1.8f);
                fh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(wmVar.f51292e) && !wmVar.f51525w4 && (ziVar = wmVar.E5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ziVar.f26856h1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                c2 = org.telegram.messenger.zi.c2(i11, wmVar.E5.f26868k, true, false);
            } else {
                c2 = tL_forumTopic.f27053id;
            }
            long j11 = c2;
            if (j11 != 0) {
                wmVar.getMediaDataController().D(wmVar.f51376k6, j11, false);
            }
        }
        wmVar.bc(false, null, null, null, null, z10, i3, null, false, j10, null, true);
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null && mjVar.getEmojiView() != null && (a1Var = wmVar.f51237a0.getEmojiView().U0) != null) {
            if (a1Var.f16923e) {
                org.telegram.messenger.hp.s1(a1Var.f16920a).C4(2, 0, a1Var.f16921b, a1Var.f16922c, null);
            }
            a1Var.f16924f = -1L;
        }
        if (!wmVar.getMessagesController().D3() && wmVar.getMessagesController().f23118s4 <= 0) {
            if (wmVar.getMessagesController().f23033i7 >= 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !wmVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i13);
                    if (ziVar3 != null && !ziVar3.Q3() && ((org.telegram.messenger.zi.S4(ziVar3.f26868k) || ziVar3.i4()) && ziVar3.f26868k.media_unread)) {
                        org.telegram.ui.Components.m11.r(ziVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final void I0() {
        wm wmVar = this.f45933b;
        org.telegram.messenger.yy sendMessagesHelper = wmVar.getSendMessagesHelper();
        long j10 = wmVar.f51376k6;
        SparseArray sparseArray = sendMessagesHelper.f26681e;
        SparseArray sparseArray2 = sendMessagesHelper.f26680c;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j10) {
                    i3 = message.f27022id;
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
                    if (message2.dialog_id == j10) {
                        i3 = message2.f27022id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i3;
        if (i12 != 0) {
            this.f45933b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers M() {
        return this.f45933b.Ba;
    }

    @Override
    public final void M0(int i3) {
        int i10;
        if (i3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        wm wmVar = this.f45933b;
        if (wmVar.f51462r3.getVisibility() != i10) {
            wmVar.f51462r3.setVisibility(i10);
        }
    }

    @Override
    public final void O(float f10, int i3) {
        org.telegram.ui.Components.p40 p40Var = this.f45933b.f51448q3;
        if (p40Var != null) {
            p40Var.b(f10, i3);
        }
    }

    @Override
    public final int O0() {
        return this.f45933b.m1.getHeight();
    }

    @Override
    public final void O1() {
        org.telegram.ui.Components.ow0 ow0Var = this.f45933b.f51472s1;
        if (ow0Var != null) {
            ow0Var.e();
        }
    }

    @Override
    public final TL_stories.StoryItem R0() {
        return null;
    }

    @Override
    public final boolean T0(long j10) {
        return false;
    }

    @Override
    public final void T1(int i3) {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        wm wmVar = this.f45933b;
        if (i3 < currentActionBarHeight) {
            wmVar.f51450q5 = false;
            if (wmVar.f51472s1.getVisibility() == 0) {
                wmVar.f51472s1.setVisibility(4);
            }
        } else {
            wmVar.f51450q5 = true;
            if (wmVar.f51472s1.getVisibility() == 4 && !wmVar.isInPreviewMode()) {
                wmVar.f51472s1.setVisibility(0);
            }
        }
        wmVar.r5 = true ^ wmVar.f51237a0.r0();
        if (wmVar.f51237a0.r0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i3 + i10;
        if (this.f45932a != i11) {
            wmVar.f51278d0 = 0;
        }
        this.f45932a = i11;
    }

    @Override
    public final boolean V0() {
        org.telegram.ui.Components.p40 p40Var = this.f45933b.f51448q3;
        if (p40Var != null && p40Var.e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void Y0(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12;
        CharSequence charSequence2;
        long j10;
        gi.l3 l3Var;
        TLRPC.ChatFull chatFull;
        MediaController B = MediaController.B();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z13 = false;
        wm wmVar = this.f45933b;
        if (isEmpty && !wmVar.f51237a0.p0()) {
            z12 = false;
        } else {
            z12 = true;
        }
        B.N = z12;
        fj fjVar = wmVar.X1;
        if (fjVar != null && fjVar.getAdapter() != null) {
            charSequence2 = charSequence;
            wmVar.X1.getAdapter().U(charSequence2, wmVar.f51237a0.getCursorPosition(), wmVar.L6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        l9.u uVar = wmVar.f51243a6;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            wmVar.f51243a6 = null;
        }
        TLRPC.Chat chat = wmVar.f51292e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            mj mjVar = wmVar.f51237a0;
            if (mjVar.Z2 && (!mjVar.p0() || !wmVar.f51237a0.f31093b2)) {
                if (z10) {
                    wmVar.yb(charSequence2, true);
                } else {
                    wmVar.a7(charSequence2);
                    l9.u uVar2 = new l9.u(this, charSequence2, false, 26);
                    wmVar.f51243a6 = uVar2;
                    if (org.telegram.messenger.g0.S == null) {
                        j10 = 3000;
                    } else {
                        j10 = 1000;
                    }
                    org.telegram.messenger.g0.i3(uVar2, j10);
                }
            }
        }
        vj vjVar = wmVar.Ra;
        if (vjVar != null) {
            ArrayList arrayList = vjVar.G;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((ex) arrayList.get(i3)).f45074n = true;
            }
        }
        dh.j0 j0Var = dh.j0.B;
        if (j0Var != null) {
            j0Var.f9043l = true;
        }
        dh.j0 j0Var2 = dh.j0.C;
        if (j0Var2 != null) {
            j0Var2.f9043l = true;
        }
        if (!z11) {
            gi.l3 l3Var2 = wmVar.f51509v2;
            if ((l3Var2 != null && l3Var2.W) || ((l3Var = wmVar.f51537x2) != null && l3Var.W)) {
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
                gi.l3 l3Var3 = wmVar.f51537x2;
                if (l3Var3 != null) {
                    l3Var3.f(true);
                    return;
                }
                return;
            }
            tf tfVar = wmVar.f51356ib;
            if (org.telegram.messenger.l10.B(wmVar.f51306f) || ((chatFull = wmVar.f51453q8) != null && chatFull.slowmode_next_send_date > 0 && wmVar.f51325g4 == 0)) {
                z13 = true;
            }
            if (!wmVar.f51550y2 && !wmVar.f51523w2 && !z13 && org.telegram.messenger.az.M < 3 && !wmVar.f51237a0.p0()) {
                org.telegram.messenger.g0.r(tfVar);
                org.telegram.messenger.g0.i3(tfVar, 4000L);
            }
        }
    }

    @Override
    public final void Z0() {
        org.telegram.ui.Components.p40 p40Var = this.f45933b.f51448q3;
        if (p40Var != null) {
            p40Var.j();
        }
    }

    @Override
    public final void a0() {
        boolean z10;
        wm wmVar = this.f45933b;
        mj mjVar = wmVar.f51237a0;
        boolean z11 = mjVar.A3;
        org.telegram.ui.Components.kf kfVar = mjVar.V0;
        boolean z12 = false;
        if (kfVar != null && kfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qe.a aVar = wmVar.f51277cd;
        if (z11 && !z10) {
            z12 = true;
        }
        aVar.a(z12, true);
    }

    @Override
    public final boolean a1() {
        wm wmVar = this.f45933b;
        TLRPC.User user = wmVar.f51306f;
        if (user != null && !org.telegram.messenger.l10.B(user) && !wmVar.f51306f.bot && wmVar.h == null && wmVar.f51325g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void b1() {
        int i3;
        wm wmVar = this.f45933b;
        Activity parentActivity = wmVar.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        long j10 = wmVar.f51376k6;
        org.telegram.messenger.ej ejVar = wmVar.f51540x5;
        if (ejVar == null) {
            ejVar = org.telegram.messenger.ej.a();
        }
        new ci.x0(parentActivity, i3, j10, ejVar, wmVar, wmVar.getResourceProvider(), 0, new le(wmVar, 1)).show();
    }

    @Override
    public final void b2() {
        int indexOfChild;
        int i3;
        wm wmVar = this.f45933b;
        if (wmVar.getParentActivity() != null) {
            if ((wmVar.f51292e != null || wmVar.f51466r8 != null) && wmVar.fragmentView != null) {
                gi.l3 l3Var = wmVar.f51497u2;
                if ((l3Var == null || !l3Var.W) && (indexOfChild = wmVar.m1.indexOfChild(wmVar.U)) != -1) {
                    try {
                        wmVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (wmVar.f51497u2 == null) {
                        wmVar.f51497u2 = wmVar.D6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = wmVar.f51466r8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        gi.l3 l3Var2 = wmVar.f51497u2;
                        if (wmVar.f51237a0.f31104d1) {
                            i3 = 2131743604;
                        } else {
                            i3 = 2131743530;
                        }
                        l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i3, wmVar.f51306f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(wmVar.f51292e) && !org.telegram.messenger.t3.s(wmVar.f51292e)) {
                        if (!wmVar.Y6()) {
                            if (wmVar.f51237a0.f31104d1) {
                                wmVar.f51497u2.u(org.telegram.messenger.t3.L(21, wmVar.f51292e));
                            } else {
                                wmVar.f51497u2.u(org.telegram.messenger.t3.L(20, wmVar.f51292e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, wmVar.f51292e)) {
                        wmVar.f51497u2.u(org.telegram.messenger.bd.M0(2131749545, null));
                    } else if (org.telegram.messenger.t3.P(21, wmVar.f51292e)) {
                        wmVar.f51497u2.u(org.telegram.messenger.bd.M0(2131749548, null));
                    } else if (org.telegram.messenger.t3.P(7, wmVar.f51292e)) {
                        wmVar.f51497u2.u(org.telegram.messenger.bd.M0(2131749551, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = wmVar.f51292e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                wmVar.f51497u2.u(org.telegram.messenger.bd.M0(2131753955, null));
                            } else {
                                wmVar.f51497u2.u(org.telegram.messenger.bd.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.bd.v(wmVar.f51292e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = wmVar.f51237a0.getSendButton();
                    View audioVideoButtonContainer = wmVar.f51237a0.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    wmVar.f51497u2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void c0(boolean z10) {
        this.f45933b.yc(false, z10);
    }

    @Override
    public final void c2(boolean z10) {
        wm wmVar = this.f45933b;
        View view = wmVar.L2;
        if (view != null) {
            view.setVisibility(8);
        }
        wmVar.f51476s5 = !z10;
    }

    @Override
    public final void d2(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        org.telegram.ui.Components.p40 k40Var;
        wm wmVar = this.f45933b;
        boolean z11 = false;
        if (wmVar.f51448q3 == null && CameraView.isCameraAllowed() && wmVar.getParentActivity() != null) {
            Activity parentActivity = wmVar.getParentActivity();
            um umVar = wmVar.f51557ya;
            if (org.telegram.ui.Components.p40.d(org.telegram.messenger.h10.f22829t0)) {
                k40Var = new org.telegram.ui.Components.j40(parentActivity, wmVar, umVar);
            } else {
                k40Var = new org.telegram.ui.Components.k40(parentActivity, wmVar, umVar, true);
            }
            wmVar.f51448q3 = k40Var;
            k40Var.setAnimationCallback(new de(wmVar, 0));
            wmVar.f51448q3.setTrimCallback(new de(wmVar, 1));
            wmVar.f51448q3.setRecordingUiFrameCallback(new si(wmVar));
            wmVar.f51448q3.setClipToPadding(false);
            wmVar.f51448q3.h(wmVar.L, wmVar.f51534x);
            int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
            if (indexOfChild < 0) {
                indexOfChild = wmVar.m1.getChildCount();
            }
            wmVar.m1.addView(wmVar.f51448q3, Math.min(indexOfChild + 1, wmVar.m1.getChildCount()), b8.mf.e(-1, -1, 51));
        }
        org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
        if (p40Var != null) {
            if (i3 == 0) {
                p40Var.i(false);
                wmVar.A0.C0();
                wmVar.D0.T();
            } else if (i3 != 1 && i3 != 3 && i3 != 4) {
                if (i3 == 2 || i3 == 5) {
                    if (i3 == 2) {
                        z11 = true;
                    }
                    p40Var.a(z11);
                }
            } else {
                p40Var.g(i3, i10, i11, j10, j11, z10);
            }
        }
    }

    @Override
    public final void e() {
        this.f45933b.Zc();
    }

    @Override
    public final void e1() {
        this.f45933b.V6();
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ow0 ow0Var = this.f45933b.f51472s1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final void g0() {
        org.telegram.ui.Components.ow0 ow0Var = this.f45933b.f51472s1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final void g1() {
        boolean z10;
        boolean z11;
        int i3;
        float f10;
        int i10;
        wm wmVar = this.f45933b;
        wmVar.k7();
        mj mjVar = wmVar.f51237a0;
        boolean z12 = mjVar.A3;
        org.telegram.ui.Components.kf kfVar = mjVar.V0;
        if (kfVar != null && kfVar.getCurrentPage() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qe.a aVar = wmVar.f51277cd;
        if (z12 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.a(z11, true);
        if (z12) {
            Activity parentActivity = wmVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            if (acVar != null && acVar.f31794l) {
                acVar.b();
            }
        } else {
            Activity parentActivity2 = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i3);
        }
        fj fjVar = wmVar.X1;
        float f11 = 0.0f;
        if (fjVar != null) {
            ViewPropertyAnimator animate = fjVar.animate();
            if (!z12 && !wmVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = wmVar.f51472s1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = wmVar.f51472s1.animate();
            if (!z12 && !wmVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40452f).withEndAction(new ci.e1(20, this, z12)).start();
        }
    }

    @Override
    public final void g2() {
        wm wmVar = this.f45933b;
        gi.l3 l3Var = wmVar.f51509v2;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = wmVar.f51537x2;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    @Override
    public final void h1(View view, CharSequence charSequence, boolean z10) {
        wm wmVar = this.f45933b;
        wmVar.vc(view, charSequence, z10);
        org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51359j0;
        if (q0Var != null && q0Var.getVisibility() != 0) {
            wmVar.f51359j0.setVisibility(0);
            org.telegram.ui.ActionBar.w wVar = wmVar.f51321g0;
            if (wVar != null) {
                wVar.e(8);
            }
            ar arVar = wmVar.f51307f0;
            if (arVar != null) {
                arVar.b(false);
            }
        }
    }

    @Override
    public final mm i0() {
        return this.f45933b.C5;
    }

    @Override
    public final void j1(CharSequence charSequence) {
        this.f45933b.yb(charSequence, true);
    }

    @Override
    public final boolean k() {
        return this.f45933b.Y6();
    }

    @Override
    public final boolean k1() {
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.dj djVar = this.f45933b.f51526w5;
        if (djVar != null && (bjVar = djVar.f22198b) != null && !bjVar.f21841e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void m1() {
        int i3;
        char c2;
        long j10;
        wm wmVar = this.f45933b;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i3);
        long j11 = wmVar.f51376k6;
        long b11 = (int) wmVar.b();
        LongSparseArray U = b10.f22437a.U(j11, b11);
        if (U != null && U.size() > 0) {
            int size = U.size();
            org.telegram.messenger.a2 a2Var = null;
            long j12 = 0;
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    j12 = U.keyAt(i10);
                    a2Var = (org.telegram.messenger.a2) U.valueAt(i10);
                    c2 = 0;
                    if (!a2Var.f21430e) {
                        break;
                    }
                    i10++;
                } else {
                    c2 = 0;
                    break;
                }
            }
            org.telegram.messenger.a2 a2Var2 = a2Var;
            long j13 = j12;
            if (a2Var2 != null && !a2Var2.f21430e) {
                Runnable runnable = a2Var2.f21431f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f22438b.Y(j11, b11, j13, new Object());
                if (a2Var2.d) {
                    a2Var2.f21430e = true;
                    j10 = j13;
                } else {
                    b10.f22437a.b0(j11, b11, j13);
                    j10 = j13;
                    org.telegram.messenger.hs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j11, a2Var2.f21428b, b11);
                    b11 = b11;
                    Object[] objArr = new Object[1];
                    objArr[c2] = b2Var;
                    notificationCenter.k(org.telegram.messenger.hs.L5, objArr);
                }
                TLRPC.TL_sendMessageStopDraftAction tL_sendMessageStopDraftAction = new TLRPC.TL_sendMessageStopDraftAction();
                tL_sendMessageStopDraftAction.random_id = j10;
                TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                tL_messages_setTyping.peer = b10.getMessagesController().j1(j11);
                tL_messages_setTyping.action = tL_sendMessageStopDraftAction;
                if (b11 != 0) {
                    tL_messages_setTyping.flags |= 1;
                    tL_messages_setTyping.top_msg_id = (int) b11;
                }
                b10.getConnectionsManager().sendRequestTyped(tL_messages_setTyping, new kh.b(1));
            }
        }
        wmVar.q7(true);
    }

    @Override
    public final void n2() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.f45933b;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (!kVar.f27728o0) {
            org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51359j0;
            if (q0Var != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w wVar = wmVar.f51321g0;
            if (wVar != null) {
                wVar.e(8);
            }
            ar arVar = wmVar.f51307f0;
            if (arVar != null) {
                arVar.b(false);
            }
        }
    }

    @Override
    public final int o() {
        return this.f45933b.m1.Q();
    }

    @Override
    public final void q0() {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.f45933b;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (!kVar.f27728o0 && !wmVar.aa() && TextUtils.isEmpty(wmVar.f51237a0.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51359j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = wmVar.f51321g0;
            if (wVar != null) {
                wVar.e(0);
            }
            ar arVar = wmVar.f51307f0;
            if (arVar != null) {
                arVar.b(true);
            }
        }
    }

    @Override
    public final void r2() {
        wm wmVar = this.f45933b;
        ei.x2 x2Var = wmVar.Y1;
        if (x2Var != null) {
            x2Var.w1(0, null);
        }
        wmVar.xa();
    }

    @Override
    public final void s1() {
        int i3;
        int i10;
        wm wmVar = this.f45933b;
        if (!wmVar.V9() && (i3 = wmVar.f51325g4) != 6 && i3 != 8) {
            org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
            long j10 = wmVar.f51376k6;
            long j11 = wmVar.f51475s4;
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            messagesController.C4(0, i10, j10, j11, null);
        }
    }

    @Override
    public final TLRPC.Peer t() {
        return null;
    }

    @Override
    public final void u() {
        boolean z10;
        wm wmVar = this.f45933b;
        if (wmVar.B0 != null) {
            wmVar.f51278d0 = wmVar.f51237a0.getBackgroundTop();
        }
        fj fjVar = wmVar.X1;
        if (fjVar != null) {
            fjVar.getAdapter().f16999g0 = true;
        }
        if (wmVar.G5 != null) {
            org.telegram.messenger.g0.i3(new xg(this, 7), 30L);
        }
        if (wmVar.f51237a0.r0()) {
            wmVar.f51237a0.d1();
            z10 = true;
        } else {
            z10 = false;
        }
        wmVar.f51237a0.U0(true, true, z10);
        if (wmVar.F5 != 0) {
            wmVar.getConnectionsManager().cancelRequest(wmVar.F5, true);
            wmVar.F5 = 0;
        }
        wmVar.cd(0, true);
        wmVar.Lc(false);
        wmVar.Cd(false);
    }

    @Override
    public final boolean u0() {
        int i3;
        wm wmVar = this.f45933b;
        if ((!wmVar.getMessagesController().t2(wmVar.a()) || wmVar.f51525w4) && (i3 = wmVar.f51325g4) != 9 && wmVar.f51338h4 > 0) {
            if (i3 != 0) {
                if (i3 == 3 && wmVar.c9() == wmVar.getUserConfig().e()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void w0() {
        wm wmVar = this.f45933b;
        wmVar.I9 = true;
        fl flVar = wmVar.D0;
        if (flVar != null) {
            flVar.K(true);
        }
    }

    @Override
    public final void x(float f10) {
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        wm wmVar = this.f45933b;
        if (i3 != 0) {
            wmVar.Q4 = true;
        }
        wmVar.K9();
        wmVar.M9();
        wmVar.rd(false, false);
        wmVar.m1.invalidate();
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
        if (acVar != null && wmVar.Bc != null) {
            acVar.l();
        }
    }
}
