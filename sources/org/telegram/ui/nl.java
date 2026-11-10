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
public final class nl implements org.telegram.ui.Components.vf {
    public int f48223a;
    public final cn f48224b;

    public nl(cn cnVar) {
        this.f48224b = cnVar;
    }

    @Override
    public final void B(boolean z9) {
        int i7;
        int i10;
        cn cnVar = this.f48224b;
        if (z9) {
            Activity parentActivity = cnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            cnVar.fragmentView.requestLayout();
            return;
        }
        Activity parentActivity2 = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity2, i7);
    }

    @Override
    public final void C0() {
        this.f48224b.La(0, false);
    }

    @Override
    public final void D() {
        this.f48224b.Bc(true, false);
    }

    @Override
    public final void E() {
        org.telegram.ui.Components.ow0 ow0Var = this.f48224b.f44640r1;
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
        long b22;
        org.telegram.messenger.mj mjVar;
        org.telegram.messenger.kj kjVar;
        boolean z11;
        TLRPC.Message message;
        org.telegram.messenger.kj kjVar2;
        cn cnVar = this.f48224b;
        ArrayList arrayList = cnVar.K6;
        if (cnVar.A0 != null) {
            cnVar.f44447c0 = cnVar.Z.getBackgroundTop();
        }
        lj ljVar = cnVar.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            cnVar.W1.getAdapter().f16803x.a(charSequence);
        }
        if (i7 != 0) {
            if (cnVar.f44504g4 == -1) {
                cnVar.f44504g4 = 0;
            }
            if (charSequence != null) {
                cnVar.f44504g4++;
            }
            org.telegram.messenger.mj mjVar2 = cnVar.f44694v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.f24035b) != null && !kjVar2.f23704e.isEmpty()) {
                cnVar.f44504g4 += cnVar.f44694v5.f24035b.f23704e.size();
            }
            cnVar.ld(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = cnVar.f44694v5) != null && (kjVar = mjVar.f24035b) != null && !kjVar.f23704e.isEmpty() && cnVar.f44694v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            cnVar.f44694v5.f24035b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer z12 = cnVar.getMessagesController().z1(cnVar.f44545j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.f23266k) != null && !org.telegram.messenger.ij.v5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(cnVar).I(2131624047, org.telegram.messenger.id.M0(2131744306, null), org.telegram.messenger.id.M0(2131744305, null));
                org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Components.yb) I.f32199e).f40544a;
                ch0Var.setScaleX(1.8f);
                ch0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(cnVar.f44473e) && !cnVar.f44693v4 && (ijVar = cnVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23254h1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                b22 = org.telegram.messenger.ij.b2(i11, cnVar.D5.f23266k, true, false);
            } else {
                b22 = tL_forumTopic.f27012id;
            }
            long j10 = b22;
            if (j10 != 0) {
                cnVar.getMediaDataController().D(cnVar.f44545j6, j10, false);
            }
        }
        cnVar.ec(false, null, null, null, null, z9, i7, null, false, j3);
        sj sjVar = cnVar.Z;
        if (sjVar != null && sjVar.getEmojiView() != null && (e1Var = cnVar.Z.getEmojiView().T0) != null) {
            if (e1Var.f16720e) {
                org.telegram.messenger.qp.s1(e1Var.f16717a).C4(2, 0, e1Var.f16718b, e1Var.f16719c, null);
            }
            e1Var.f16721f = -1L;
        }
        if (!cnVar.getMessagesController().D3() && cnVar.getMessagesController().f24898s4 <= 0) {
            if (cnVar.getMessagesController().i7 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !cnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
                    if (ijVar3 != null && !ijVar3.P3() && ((org.telegram.messenger.ij.R4(ijVar3.f23266k) || ijVar3.h4()) && ijVar3.f23266k.media_unread)) {
                        org.telegram.ui.Components.s11.r(ijVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.f48224b.Ca;
    }

    @Override
    public final void I0() {
        cn cnVar = this.f48224b;
        org.telegram.messenger.gz sendMessagesHelper = cnVar.getSendMessagesHelper();
        long j3 = cnVar.f44545j6;
        SparseArray sparseArray = sendMessagesHelper.f22771e;
        SparseArray sparseArray2 = sendMessagesHelper.f22770c;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < sparseArray2.size()) {
                TLRPC.Message message = (TLRPC.Message) sparseArray2.valueAt(i10);
                if (message.dialog_id == j3) {
                    i7 = message.f26981id;
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
                        i7 = message2.f26981id;
                        break;
                    }
                    i11++;
                }
            }
        }
        int i12 = i7;
        if (i12 != 0) {
            this.f48224b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void M(float f10, int i7) {
        org.telegram.ui.Components.t40 t40Var = this.f48224b.f44615p3;
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
        cn cnVar = this.f48224b;
        if (cnVar.f44628q3.getVisibility() != i10) {
            cnVar.f44628q3.setVisibility(i10);
        }
    }

    @Override
    public final int S0() {
        return this.f48224b.l1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.ow0 ow0Var = this.f48224b.f44640r1;
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
        cn cnVar = this.f48224b;
        if (i7 < currentActionBarHeight) {
            cnVar.f44617p5 = false;
            if (cnVar.f44640r1.getVisibility() == 0) {
                cnVar.f44640r1.setVisibility(4);
            }
        } else {
            cnVar.f44617p5 = true;
            if (cnVar.f44640r1.getVisibility() == 4 && !cnVar.isInPreviewMode()) {
                cnVar.f44640r1.setVisibility(0);
            }
        }
        cnVar.f44630q5 = true ^ cnVar.Z.s0();
        if (cnVar.Z.s0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f48223a != i11) {
            cnVar.f44447c0 = 0;
        }
        this.f48223a = i11;
    }

    @Override
    public final void W() {
        boolean z9;
        cn cnVar = this.f48224b;
        sj sjVar = cnVar.Z;
        boolean z10 = sjVar.f31180z3;
        org.telegram.ui.Components.lf lfVar = sjVar.U0;
        boolean z11 = false;
        if (lfVar != null && lfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = cnVar.f44472dd;
        if (z10 && !z9) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final boolean X0() {
        org.telegram.ui.Components.t40 t40Var = this.f48224b.f44615p3;
        if (t40Var != null && t40Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        int indexOfChild;
        int i7;
        cn cnVar = this.f48224b;
        if (cnVar.getParentActivity() != null) {
            if ((cnVar.f44473e != null || cnVar.f44633q8 != null) && cnVar.fragmentView != null) {
                fi.m3 m3Var = cnVar.f44666t2;
                if ((m3Var == null || !m3Var.V) && (indexOfChild = cnVar.l1.indexOfChild(cnVar.T)) != -1) {
                    try {
                        cnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (cnVar.f44666t2 == null) {
                        cnVar.f44666t2 = cnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = cnVar.f44633q8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        fi.m3 m3Var2 = cnVar.f44666t2;
                        if (cnVar.Z.f31045c1) {
                            i7 = 2131743594;
                        } else {
                            i7 = 2131743520;
                        }
                        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i7, cnVar.f44487f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(cnVar.f44473e) && !org.telegram.messenger.t3.s(cnVar.f44473e)) {
                        if (!cnVar.Z6()) {
                            if (cnVar.Z.f31045c1) {
                                cnVar.f44666t2.u(org.telegram.messenger.t3.L(21, cnVar.f44473e));
                            } else {
                                cnVar.f44666t2.u(org.telegram.messenger.t3.L(20, cnVar.f44473e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, cnVar.f44473e)) {
                        cnVar.f44666t2.u(org.telegram.messenger.id.M0(2131749537, null));
                    } else if (org.telegram.messenger.t3.P(21, cnVar.f44473e)) {
                        cnVar.f44666t2.u(org.telegram.messenger.id.M0(2131749540, null));
                    } else if (org.telegram.messenger.t3.P(7, cnVar.f44473e)) {
                        cnVar.f44666t2.u(org.telegram.messenger.id.M0(2131749543, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = cnVar.f44473e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                cnVar.f44666t2.u(org.telegram.messenger.id.M0(2131753955, null));
                            } else {
                                cnVar.f44666t2.u(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(cnVar.f44473e.banned_rights.until_date)));
                            }
                        } else {
                            return;
                        }
                    }
                    View sendButton = cnVar.Z.getSendButton();
                    View audioVideoButtonContainer = cnVar.Z.getAudioVideoButtonContainer();
                    if (sendButton.getAlpha() < audioVideoButtonContainer.getAlpha()) {
                        sendButton = audioVideoButtonContainer;
                    }
                    cnVar.f44666t2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Y(boolean z9) {
        this.f48224b.Bc(false, z9);
    }

    @Override
    public final void Y1(boolean z9) {
        cn cnVar = this.f48224b;
        View view = cnVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        cnVar.f44644r5 = !z9;
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        org.telegram.ui.Components.t40 o40Var;
        cn cnVar = this.f48224b;
        boolean z10 = false;
        if (cnVar.f44615p3 == null && CameraView.isCameraAllowed() && cnVar.getParentActivity() != null) {
            Activity parentActivity = cnVar.getParentActivity();
            an anVar = cnVar.f44750za;
            if (org.telegram.ui.Components.t40.e(org.telegram.messenger.p10.f24474s0)) {
                o40Var = new org.telegram.ui.Components.n40(parentActivity, cnVar, anVar);
            } else {
                o40Var = new org.telegram.ui.Components.o40(parentActivity, cnVar, anVar, true);
            }
            cnVar.f44615p3 = o40Var;
            o40Var.setAnimationCallback(new fe(cnVar, 0));
            cnVar.f44615p3.setTrimCallback(new fe(cnVar, 1));
            cnVar.f44615p3.setRecordingUiFrameCallback(new yi(cnVar));
            cnVar.f44615p3.setClipToPadding(false);
            cnVar.f44615p3.i(cnVar.K, cnVar.f44715x);
            int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
            if (indexOfChild < 0) {
                indexOfChild = cnVar.l1.getChildCount();
            }
            cnVar.l1.addView(cnVar.f44615p3, Math.min(indexOfChild + 1, cnVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.t40 t40Var = cnVar.f44615p3;
        if (t40Var != null) {
            if (i7 == 0) {
                t40Var.j(false);
                cnVar.f44741z0.C0();
                cnVar.C0.T();
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
        this.f48224b.cd();
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
        cn cnVar = this.f48224b;
        if (isEmpty && !cnVar.Z.q0()) {
            z11 = false;
        } else {
            z11 = true;
        }
        B.M = z11;
        lj ljVar = cnVar.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            charSequence2 = charSequence;
            cnVar.W1.getAdapter().U(charSequence2, cnVar.Z.getCursorPosition(), cnVar.K6, false, false);
        } else {
            charSequence2 = charSequence;
        }
        m9.u uVar = cnVar.Z5;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            cnVar.Z5 = null;
        }
        TLRPC.Chat chat = cnVar.f44473e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            sj sjVar = cnVar.Z;
            if (sjVar.Y2 && (!sjVar.q0() || !cnVar.Z.f31032a2)) {
                if (z9) {
                    cnVar.Bb(charSequence2, true);
                } else {
                    cnVar.b7(charSequence2);
                    m9.u uVar2 = new m9.u(this, charSequence2, false, 28);
                    cnVar.Z5 = uVar2;
                    if (org.telegram.messenger.g0.S == null) {
                        j3 = 3000;
                    } else {
                        j3 = 1000;
                    }
                    org.telegram.messenger.g0.i3(uVar2, j3);
                }
            }
        }
        bk bkVar = cnVar.Sa;
        if (bkVar != null) {
            ArrayList arrayList = bkVar.F;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((kx) arrayList.get(i7)).f47451n = true;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.f6294l = true;
        }
        ch.k0 k0Var2 = ch.k0.C;
        if (k0Var2 != null) {
            k0Var2.f6294l = true;
        }
        if (!z10) {
            fi.m3 m3Var2 = cnVar.f44678u2;
            if ((m3Var2 != null && m3Var2.V) || ((m3Var = cnVar.f44705w2) != null && m3Var.V)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                fi.m3 m3Var3 = cnVar.f44705w2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            xf xfVar = cnVar.f44550jb;
            if (org.telegram.messenger.t10.B(cnVar.f44487f) || ((chatFull = cnVar.f44620p8) != null && chatFull.slowmode_next_send_date > 0 && cnVar.f44492f4 == 0)) {
                z12 = true;
            }
            if (!cnVar.f44718x2 && !cnVar.f44691v2 && !z12 && org.telegram.messenger.iz.M < 3 && !cnVar.Z.q0()) {
                org.telegram.messenger.g0.r(xfVar);
                org.telegram.messenger.g0.i3(xfVar, 4000L);
            }
        }
    }

    @Override
    public final void b() {
        org.telegram.ui.Components.ow0 ow0Var = this.f48224b.f44640r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final boolean c() {
        return this.f48224b.Z6();
    }

    @Override
    public final void c1() {
        org.telegram.ui.Components.t40 t40Var = this.f48224b.f44615p3;
        if (t40Var != null) {
            t40Var.k();
        }
    }

    @Override
    public final boolean d1() {
        cn cnVar = this.f48224b;
        TLRPC.User user = cnVar.f44487f;
        if (user != null && !org.telegram.messenger.t10.B(user) && !cnVar.f44487f.bot && cnVar.h == null && cnVar.f44492f4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d2() {
        cn cnVar = this.f48224b;
        fi.m3 m3Var = cnVar.f44678u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = cnVar.f44705w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void e1() {
        int i7;
        cn cnVar = this.f48224b;
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        long j3 = cnVar.f44545j6;
        org.telegram.messenger.nj njVar = cnVar.f44708w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, cnVar, cnVar.getResourceProvider(), 0, new ne(cnVar, 1)).show();
    }

    @Override
    public final void f1() {
        this.f48224b.W6();
    }

    @Override
    public final void h1() {
        boolean z9;
        boolean z10;
        int i7;
        float f10;
        int i10;
        cn cnVar = this.f48224b;
        cnVar.l7();
        sj sjVar = cnVar.Z;
        boolean z11 = sjVar.f31180z3;
        org.telegram.ui.Components.lf lfVar = sjVar.U0;
        if (lfVar != null && lfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = cnVar.f44472dd;
        if (z11 && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        if (z11) {
            Activity parentActivity = cnVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i10);
            org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
            if (bcVar != null && bcVar.f32205l) {
                bcVar.b();
            }
        } else {
            Activity parentActivity2 = cnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity2, i7);
        }
        lj ljVar = cnVar.W1;
        float f11 = 0.0f;
        if (ljVar != null) {
            ViewPropertyAnimator animate = ljVar.animate();
            if (!z11 && !cnVar.isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.wq.f40046f).start();
        }
        org.telegram.ui.Components.ow0 ow0Var = cnVar.f44640r1;
        if (ow0Var != null) {
            ow0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = cnVar.f44640r1.animate();
            if (!z11 && !cnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.wq.f40046f).withEndAction(new bi.k1(20, this, z11)).start();
        }
    }

    @Override
    public final void h2() {
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.f48224b;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!lVar.f27691n0) {
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44527i0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f44488f0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = cnVar.f44474e0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        cn cnVar = this.f48224b;
        cnVar.yc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44527i0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            cnVar.f44527i0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = cnVar.f44488f0;
            if (xVar != null) {
                xVar.e(8);
            }
            fr frVar = cnVar.f44474e0;
            if (frVar != null) {
                frVar.b(false);
            }
        }
    }

    @Override
    public final void j0() {
        org.telegram.ui.Components.ow0 ow0Var = this.f48224b.f44640r1;
        if (ow0Var != null) {
            ow0Var.f();
        }
    }

    @Override
    public final void k1(CharSequence charSequence) {
        this.f48224b.Bb(charSequence, true);
    }

    @Override
    public final int l() {
        return this.f48224b.l1.Q();
    }

    @Override
    public final boolean l1() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.mj mjVar = this.f48224b.f44694v5;
        if (mjVar != null && (kjVar = mjVar.f24035b) != null && !kjVar.f23704e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l2() {
        cn cnVar = this.f48224b;
        di.u2 u2Var = cnVar.X1;
        if (u2Var != null) {
            u2Var.w1(0, null);
        }
        cnVar.za();
    }

    @Override
    public final void m1() {
        int i7;
        char c10;
        long j3;
        cn cnVar = this.f48224b;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = cnVar.f44545j6;
        long b11 = (int) cnVar.b();
        LongSparseArray V = b10.f22358a.V(j10, b11);
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
                    if (!a2Var.f21380e) {
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
            if (a2Var2 != null && !a2Var2.f21380e) {
                Runnable runnable = a2Var2.f21381f;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                }
                b10.f22359b.Z(j10, b11, j12, new Object());
                if (a2Var2.d) {
                    a2Var2.f21380e = true;
                    j3 = j12;
                } else {
                    b10.f22358a.a0(j10, b11, j12);
                    j3 = j12;
                    org.telegram.messenger.qs notificationCenter = b10.getNotificationCenter();
                    org.telegram.messenger.b2 b2Var = new org.telegram.messenger.b2(j10, a2Var2.f21378b, b11);
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
        cnVar.r7(true);
    }

    @Override
    public final sm o0() {
        return this.f48224b.B5;
    }

    @Override
    public final void r0() {
        org.telegram.ui.ActionBar.l lVar;
        cn cnVar = this.f48224b;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!lVar.f27691n0 && !cnVar.ba() && TextUtils.isEmpty(cnVar.Z.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44527i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f44488f0;
            if (xVar != null) {
                xVar.e(0);
            }
            fr frVar = cnVar.f44474e0;
            if (frVar != null) {
                frVar.b(true);
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
        cn cnVar = this.f48224b;
        if (cnVar.A0 != null) {
            cnVar.f44447c0 = cnVar.Z.getBackgroundTop();
        }
        lj ljVar = cnVar.W1;
        if (ljVar != null) {
            ljVar.getAdapter().f16782f0 = true;
        }
        if (cnVar.F5 != null) {
            org.telegram.messenger.g0.i3(new dh(this, 7), 30L);
        }
        if (cnVar.Z.s0()) {
            cnVar.Z.e1();
            z9 = true;
        } else {
            z9 = false;
        }
        cnVar.Z.V0(true, true, z9);
        if (cnVar.E5 != 0) {
            cnVar.getConnectionsManager().cancelRequest(cnVar.E5, true);
            cnVar.E5 = 0;
        }
        cnVar.fd(0, true);
        cnVar.Oc(false);
        cnVar.Fd(false);
    }

    @Override
    public final void t1() {
        int i7;
        int i10;
        cn cnVar = this.f48224b;
        if (!cnVar.W9() && (i7 = cnVar.f44492f4) != 6 && i7 != 8) {
            org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
            long j3 = cnVar.f44545j6;
            long j10 = cnVar.f44643r4;
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            messagesController.C4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final boolean v0() {
        int i7;
        cn cnVar = this.f48224b;
        if ((!cnVar.getMessagesController().t2(cnVar.a()) || cnVar.f44693v4) && (i7 = cnVar.f44492f4) != 9 && cnVar.f44504g4 > 0) {
            if (i7 != 0) {
                if (i7 == 3 && cnVar.d9() == cnVar.getUserConfig().e()) {
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
        cn cnVar = this.f48224b;
        if (i7 != 0) {
            cnVar.P4 = true;
        }
        cnVar.L9();
        cnVar.N9();
        cnVar.ud(false, false);
        cnVar.l1.invalidate();
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
        if (bcVar != null && cnVar.Cc != null) {
            bcVar.l();
        }
    }

    @Override
    public final void w0() {
        cn cnVar = this.f48224b;
        cnVar.J9 = true;
        ll llVar = cnVar.C0;
        if (llVar != null) {
            llVar.K(true);
        }
    }
}
