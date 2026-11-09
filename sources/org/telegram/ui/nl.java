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
public final class nl implements org.telegram.ui.Components.wf {
    public int f48203a;
    public final cn f48204b;

    public nl(cn cnVar) {
        this.f48204b = cnVar;
    }

    @Override
    public final void B(boolean z9) {
        int i7;
        int i10;
        cn cnVar = this.f48204b;
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
        this.f48204b.La(0, false);
    }

    @Override
    public final void D() {
        this.f48204b.Bc(true, false);
    }

    @Override
    public final void E() {
        org.telegram.ui.Components.pw0 pw0Var = this.f48204b.f44599r1;
        if (pw0Var != null) {
            pw0Var.e();
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
        cn cnVar = this.f48204b;
        ArrayList arrayList = cnVar.K6;
        if (cnVar.A0 != null) {
            cnVar.f44406c0 = cnVar.Z.getBackgroundTop();
        }
        lj ljVar = cnVar.W1;
        if (ljVar != null && ljVar.getAdapter() != null) {
            cnVar.W1.getAdapter().f16803x.a(charSequence);
        }
        if (i7 != 0) {
            if (cnVar.f44463g4 == -1) {
                cnVar.f44463g4 = 0;
            }
            if (charSequence != null) {
                cnVar.f44463g4++;
            }
            org.telegram.messenger.mj mjVar2 = cnVar.f44653v5;
            if (mjVar2 != null && (kjVar2 = mjVar2.f24031b) != null && !kjVar2.f23700e.isEmpty()) {
                cnVar.f44463g4 += cnVar.f44653v5.f24031b.f23700e.size();
            }
            cnVar.ld(false);
        }
        if (!TextUtils.isEmpty(charSequence) && (mjVar = cnVar.f44653v5) != null && (kjVar = mjVar.f24031b) != null && !kjVar.f23700e.isEmpty() && cnVar.f44653v5.d == null && j3 <= 0) {
            ArrayList arrayList2 = new ArrayList();
            cnVar.f44653v5.f24031b.b(arrayList2);
            if (arrayList2.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            TLRPC.Peer z12 = cnVar.getMessagesController().z1(cnVar.f44504j6);
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList2.size()) {
                    break;
                }
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i12);
                if (ijVar2 != null && (message = ijVar2.f23262k) != null && !org.telegram.messenger.ij.v5(message.peer_id, z12)) {
                    z11 = false;
                    break;
                }
                i12++;
            }
            if (z11) {
                org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(cnVar).I(2131624047, org.telegram.messenger.id.M0(2131744306, null), org.telegram.messenger.id.M0(2131744305, null));
                org.telegram.ui.Components.dh0 dh0Var = ((org.telegram.ui.Components.zb) I.f32623e).f40948a;
                dh0Var.setScaleX(1.8f);
                dh0Var.setScaleY(1.8f);
                I.k(true);
            }
        }
        if (org.telegram.messenger.t3.c0(cnVar.f44432e) && !cnVar.f44652v4 && (ijVar = cnVar.D5) != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ijVar.f23250h1;
            if (tL_forumTopic == null) {
                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                b22 = org.telegram.messenger.ij.b2(i11, cnVar.D5.f23262k, true, false);
            } else {
                b22 = tL_forumTopic.f27008id;
            }
            long j10 = b22;
            if (j10 != 0) {
                cnVar.getMediaDataController().D(cnVar.f44504j6, j10, false);
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
        if (!cnVar.getMessagesController().D3() && cnVar.getMessagesController().f24894s4 <= 0) {
            if (cnVar.getMessagesController().i7 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !cnVar.getUserConfig().q() && !TextUtils.isEmpty(charSequence) && arrayList != null) {
                for (int i13 = 1; i13 < Math.min(5, arrayList.size()); i13++) {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i13);
                    if (ijVar3 != null && !ijVar3.P3() && ((org.telegram.messenger.ij.R4(ijVar3.f23262k) || ijVar3.h4()) && ijVar3.f23262k.media_unread)) {
                        org.telegram.ui.Components.t11.r(ijVar3, true);
                    }
                }
            }
        }
    }

    @Override
    public final TLRPC.TL_channels_sendAsPeers I() {
        return this.f48204b.Ca;
    }

    @Override
    public final void I0() {
        cn cnVar = this.f48204b;
        org.telegram.messenger.gz sendMessagesHelper = cnVar.getSendMessagesHelper();
        long j3 = cnVar.f44504j6;
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
            this.f48204b.l(i12, 0, true, 0, true, 0);
        }
    }

    @Override
    public final void M(float f10, int i7) {
        org.telegram.ui.Components.u40 u40Var = this.f48204b.f44574p3;
        if (u40Var != null) {
            u40Var.b(f10, i7);
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
        cn cnVar = this.f48204b;
        if (cnVar.f44587q3.getVisibility() != i10) {
            cnVar.f44587q3.setVisibility(i10);
        }
    }

    @Override
    public final int S0() {
        return this.f48204b.l1.getHeight();
    }

    @Override
    public final TL_stories.StoryItem T0() {
        return null;
    }

    @Override
    public final void T1() {
        org.telegram.ui.Components.pw0 pw0Var = this.f48204b.f44599r1;
        if (pw0Var != null) {
            pw0Var.e();
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
        cn cnVar = this.f48204b;
        if (i7 < currentActionBarHeight) {
            cnVar.f44576p5 = false;
            if (cnVar.f44599r1.getVisibility() == 0) {
                cnVar.f44599r1.setVisibility(4);
            }
        } else {
            cnVar.f44576p5 = true;
            if (cnVar.f44599r1.getVisibility() == 4 && !cnVar.isInPreviewMode()) {
                cnVar.f44599r1.setVisibility(0);
            }
        }
        cnVar.f44589q5 = true ^ cnVar.Z.s0();
        if (cnVar.Z.s0()) {
            i10 = 65536;
        } else {
            i10 = 0;
        }
        int i11 = i7 + i10;
        if (this.f48203a != i11) {
            cnVar.f44406c0 = 0;
        }
        this.f48203a = i11;
    }

    @Override
    public final void W() {
        boolean z9;
        cn cnVar = this.f48204b;
        sj sjVar = cnVar.Z;
        boolean z10 = sjVar.f31169z3;
        org.telegram.ui.Components.mf mfVar = sjVar.U0;
        boolean z11 = false;
        if (mfVar != null && mfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = cnVar.f44431dd;
        if (z10 && !z9) {
            z11 = true;
        }
        aVar.a(z11, true);
    }

    @Override
    public final boolean X0() {
        org.telegram.ui.Components.u40 u40Var = this.f48204b.f44574p3;
        if (u40Var != null && u40Var.f()) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1() {
        int indexOfChild;
        int i7;
        cn cnVar = this.f48204b;
        if (cnVar.getParentActivity() != null) {
            if ((cnVar.f44432e != null || cnVar.f44592q8 != null) && cnVar.fragmentView != null) {
                fi.m3 m3Var = cnVar.f44625t2;
                if ((m3Var == null || !m3Var.V) && (indexOfChild = cnVar.l1.indexOfChild(cnVar.T)) != -1) {
                    try {
                        cnVar.fragmentView.performHapticFeedback(3, 2);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (cnVar.f44625t2 == null) {
                        cnVar.f44625t2 = cnVar.E6(310.0f, 3, indexOfChild + 1, false);
                    }
                    TLRPC.UserFull userFull = cnVar.f44592q8;
                    if (userFull != null && userFull.voice_messages_forbidden) {
                        fi.m3 m3Var2 = cnVar.f44625t2;
                        if (cnVar.Z.f31034c1) {
                            i7 = 2131743594;
                        } else {
                            i7 = 2131743520;
                        }
                        m3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i7, cnVar.f44446f.first_name)));
                    } else if (!org.telegram.messenger.t3.v(cnVar.f44432e) && !org.telegram.messenger.t3.s(cnVar.f44432e)) {
                        if (!cnVar.Z6()) {
                            if (cnVar.Z.f31034c1) {
                                cnVar.f44625t2.u(org.telegram.messenger.t3.L(21, cnVar.f44432e));
                            } else {
                                cnVar.f44625t2.u(org.telegram.messenger.t3.L(20, cnVar.f44432e));
                            }
                        } else {
                            return;
                        }
                    } else if (org.telegram.messenger.t3.P(20, cnVar.f44432e)) {
                        cnVar.f44625t2.u(org.telegram.messenger.id.M0(2131749537, null));
                    } else if (org.telegram.messenger.t3.P(21, cnVar.f44432e)) {
                        cnVar.f44625t2.u(org.telegram.messenger.id.M0(2131749540, null));
                    } else if (org.telegram.messenger.t3.P(7, cnVar.f44432e)) {
                        cnVar.f44625t2.u(org.telegram.messenger.id.M0(2131749543, null));
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = cnVar.f44432e.banned_rights;
                        if (tL_chatBannedRights != null) {
                            if (org.telegram.messenger.g0.D1(tL_chatBannedRights)) {
                                cnVar.f44625t2.u(org.telegram.messenger.id.M0(2131753955, null));
                            } else {
                                cnVar.f44625t2.u(org.telegram.messenger.id.a0("AttachMediaRestricted", null, 2131753956, org.telegram.messenger.id.v(cnVar.f44432e.banned_rights.until_date)));
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
                    cnVar.f44625t2.y(sendButton, true);
                }
            }
        }
    }

    @Override
    public final void Y(boolean z9) {
        this.f48204b.Bc(false, z9);
    }

    @Override
    public final void Y1(boolean z9) {
        cn cnVar = this.f48204b;
        View view = cnVar.K2;
        if (view != null) {
            view.setVisibility(8);
        }
        cnVar.f44603r5 = !z9;
    }

    @Override
    public final void Z1(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        org.telegram.ui.Components.u40 p40Var;
        cn cnVar = this.f48204b;
        boolean z10 = false;
        if (cnVar.f44574p3 == null && CameraView.isCameraAllowed() && cnVar.getParentActivity() != null) {
            Activity parentActivity = cnVar.getParentActivity();
            an anVar = cnVar.f44709za;
            if (org.telegram.ui.Components.u40.e(org.telegram.messenger.p10.f24470s0)) {
                p40Var = new org.telegram.ui.Components.o40(parentActivity, cnVar, anVar);
            } else {
                p40Var = new org.telegram.ui.Components.p40(parentActivity, cnVar, anVar, true);
            }
            cnVar.f44574p3 = p40Var;
            p40Var.setAnimationCallback(new fe(cnVar, 0));
            cnVar.f44574p3.setTrimCallback(new fe(cnVar, 1));
            cnVar.f44574p3.setRecordingUiFrameCallback(new yi(cnVar));
            cnVar.f44574p3.setClipToPadding(false);
            cnVar.f44574p3.i(cnVar.K, cnVar.f44674x);
            int indexOfChild = cnVar.l1.indexOfChild(cnVar.T);
            if (indexOfChild < 0) {
                indexOfChild = cnVar.l1.getChildCount();
            }
            cnVar.l1.addView(cnVar.f44574p3, Math.min(indexOfChild + 1, cnVar.l1.getChildCount()), c8.ha.e(-1, -1, 51));
        }
        org.telegram.ui.Components.u40 u40Var = cnVar.f44574p3;
        if (u40Var != null) {
            if (i7 == 0) {
                u40Var.j(false);
                cnVar.f44700z0.C0();
                cnVar.C0.T();
            } else if (i7 != 1 && i7 != 3 && i7 != 4) {
                if (i7 == 2 || i7 == 5) {
                    if (i7 == 2) {
                        z10 = true;
                    }
                    u40Var.a(z10);
                }
            } else {
                u40Var.h(i7, i10, i11, j3, j10, z9);
            }
        }
    }

    @Override
    public final void a() {
        this.f48204b.cd();
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
        cn cnVar = this.f48204b;
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
        TLRPC.Chat chat = cnVar.f44432e;
        if (chat == null || org.telegram.messenger.t3.m(chat)) {
            sj sjVar = cnVar.Z;
            if (sjVar.Y2 && (!sjVar.q0() || !cnVar.Z.f31021a2)) {
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
                ((jx) arrayList.get(i7)).f47117n = true;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.f6289l = true;
        }
        ch.k0 k0Var2 = ch.k0.C;
        if (k0Var2 != null) {
            k0Var2.f6289l = true;
        }
        if (!z10) {
            fi.m3 m3Var2 = cnVar.f44637u2;
            if ((m3Var2 != null && m3Var2.V) || ((m3Var = cnVar.f44664w2) != null && m3Var.V)) {
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
                fi.m3 m3Var3 = cnVar.f44664w2;
                if (m3Var3 != null) {
                    m3Var3.f(true);
                    return;
                }
                return;
            }
            xf xfVar = cnVar.f44509jb;
            if (org.telegram.messenger.t10.B(cnVar.f44446f) || ((chatFull = cnVar.f44579p8) != null && chatFull.slowmode_next_send_date > 0 && cnVar.f44451f4 == 0)) {
                z12 = true;
            }
            if (!cnVar.f44677x2 && !cnVar.f44650v2 && !z12 && org.telegram.messenger.iz.M < 3 && !cnVar.Z.q0()) {
                org.telegram.messenger.g0.r(xfVar);
                org.telegram.messenger.g0.i3(xfVar, 4000L);
            }
        }
    }

    @Override
    public final void b() {
        org.telegram.ui.Components.pw0 pw0Var = this.f48204b.f44599r1;
        if (pw0Var != null) {
            pw0Var.f();
        }
    }

    @Override
    public final boolean c() {
        return this.f48204b.Z6();
    }

    @Override
    public final void c1() {
        org.telegram.ui.Components.u40 u40Var = this.f48204b.f44574p3;
        if (u40Var != null) {
            u40Var.k();
        }
    }

    @Override
    public final boolean d1() {
        cn cnVar = this.f48204b;
        TLRPC.User user = cnVar.f44446f;
        if (user != null && !org.telegram.messenger.t10.B(user) && !cnVar.f44446f.bot && cnVar.h == null && cnVar.f44451f4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d2() {
        cn cnVar = this.f48204b;
        fi.m3 m3Var = cnVar.f44637u2;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = cnVar.f44664w2;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
    }

    @Override
    public final void e1() {
        int i7;
        cn cnVar = this.f48204b;
        Activity parentActivity = cnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        long j3 = cnVar.f44504j6;
        org.telegram.messenger.nj njVar = cnVar.f44667w5;
        if (njVar == null) {
            njVar = org.telegram.messenger.nj.a();
        }
        new bi.e1(parentActivity, i7, j3, njVar, cnVar, cnVar.getResourceProvider(), 0, new ne(cnVar, 1)).show();
    }

    @Override
    public final void f1() {
        this.f48204b.W6();
    }

    @Override
    public final void h1() {
        boolean z9;
        boolean z10;
        int i7;
        float f10;
        int i10;
        cn cnVar = this.f48204b;
        cnVar.l7();
        sj sjVar = cnVar.Z;
        boolean z11 = sjVar.f31169z3;
        org.telegram.ui.Components.mf mfVar = sjVar.U0;
        if (mfVar != null && mfVar.getCurrentPage() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        te.a aVar = cnVar.f44431dd;
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
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
            if (ccVar != null && ccVar.f32629l) {
                ccVar.b();
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
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.xq.f40458f).start();
        }
        org.telegram.ui.Components.pw0 pw0Var = cnVar.f44599r1;
        if (pw0Var != null) {
            pw0Var.setVisibility(0);
            ViewPropertyAnimator animate2 = cnVar.f44599r1.animate();
            if (!z11 && !cnVar.isInPreviewMode()) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40458f).withEndAction(new bi.k1(20, this, z11)).start();
        }
    }

    @Override
    public final void h2() {
        org.telegram.ui.ActionBar.k kVar;
        cn cnVar = this.f48204b;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!kVar.f27664n0) {
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44486i0;
            if (r0Var != null) {
                r0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f44447f0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = cnVar.f44433e0;
            if (erVar != null) {
                erVar.b(false);
            }
        }
    }

    @Override
    public final void i1(View view, CharSequence charSequence, boolean z9) {
        cn cnVar = this.f48204b;
        cnVar.yc(view, charSequence, z9);
        org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44486i0;
        if (r0Var != null && r0Var.getVisibility() != 0) {
            cnVar.f44486i0.setVisibility(0);
            org.telegram.ui.ActionBar.x xVar = cnVar.f44447f0;
            if (xVar != null) {
                xVar.e(8);
            }
            er erVar = cnVar.f44433e0;
            if (erVar != null) {
                erVar.b(false);
            }
        }
    }

    @Override
    public final void j0() {
        org.telegram.ui.Components.pw0 pw0Var = this.f48204b.f44599r1;
        if (pw0Var != null) {
            pw0Var.f();
        }
    }

    @Override
    public final void k1(CharSequence charSequence) {
        this.f48204b.Bb(charSequence, true);
    }

    @Override
    public final int l() {
        return this.f48204b.l1.Q();
    }

    @Override
    public final boolean l1() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.mj mjVar = this.f48204b.f44653v5;
        if (mjVar != null && (kjVar = mjVar.f24031b) != null && !kjVar.f23700e.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l2() {
        cn cnVar = this.f48204b;
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
        cn cnVar = this.f48204b;
        i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.messenger.f2 b10 = org.telegram.messenger.f2.b(i7);
        long j10 = cnVar.f44504j6;
        long b11 = (int) cnVar.b();
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
        cnVar.r7(true);
    }

    @Override
    public final sm o0() {
        return this.f48204b.B5;
    }

    @Override
    public final void r0() {
        org.telegram.ui.ActionBar.k kVar;
        cn cnVar = this.f48204b;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (!kVar.f27664n0 && !cnVar.ba() && TextUtils.isEmpty(cnVar.Z.getSlowModeTimer())) {
            org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44486i0;
            if (r0Var != null) {
                r0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = cnVar.f44447f0;
            if (xVar != null) {
                xVar.e(0);
            }
            er erVar = cnVar.f44433e0;
            if (erVar != null) {
                erVar.b(true);
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
        cn cnVar = this.f48204b;
        if (cnVar.A0 != null) {
            cnVar.f44406c0 = cnVar.Z.getBackgroundTop();
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
        cn cnVar = this.f48204b;
        if (!cnVar.W9() && (i7 = cnVar.f44451f4) != 6 && i7 != 8) {
            org.telegram.messenger.qp messagesController = cnVar.getMessagesController();
            long j3 = cnVar.f44504j6;
            long j10 = cnVar.f44602r4;
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).classGuid;
            messagesController.C4(0, i10, j3, j10, null);
        }
    }

    @Override
    public final boolean v0() {
        int i7;
        cn cnVar = this.f48204b;
        if ((!cnVar.getMessagesController().t2(cnVar.a()) || cnVar.f44652v4) && (i7 = cnVar.f44451f4) != 9 && cnVar.f44463g4 > 0) {
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
        cn cnVar = this.f48204b;
        if (i7 != 0) {
            cnVar.P4 = true;
        }
        cnVar.L9();
        cnVar.N9();
        cnVar.ud(false, false);
        cnVar.l1.invalidate();
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32619w;
        if (ccVar != null && cnVar.Cc != null) {
            ccVar.l();
        }
    }

    @Override
    public final void w0() {
        cn cnVar = this.f48204b;
        cnVar.J9 = true;
        ll llVar = cnVar.C0;
        if (llVar != null) {
            llVar.K(true);
        }
    }
}
