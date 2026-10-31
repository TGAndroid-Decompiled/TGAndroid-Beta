package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vc implements View.OnClickListener {
    public final int f31211a;
    public final ChatActivityEnterView f31212b;

    public vc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31211a = i10;
        this.f31212b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        sf sfVar;
        boolean z10;
        gf gfVar;
        se seVar;
        long j10;
        int i10;
        org.telegram.ui.un unVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        uu0 uu0Var;
        ?? r62;
        long j11;
        float f7;
        TLRPC.Peer peer;
        int i11;
        int i12;
        int i13;
        jg.l0 l0Var;
        int i14;
        int i15;
        int i16 = this.f31211a;
        TLRPC.Peer peer2 = null;
        ChatActivityEnterView chatActivityEnterView = this.f31212b;
        switch (i16) {
            case 0:
                se seVar2 = chatActivityEnterView.E0;
                if (seVar2 == null) {
                    str = "";
                } else {
                    str = seVar2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView.setFieldText("");
                    return;
                }
            case 1:
                pe peVar = chatActivityEnterView.L0;
                if (peVar == null || peVar.f38847p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f23790t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f23706f0 == null) {
                        chatActivityEnterView.Q0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                sf sfVar2 = chatActivityEnterView.Z2;
                if (sfVar2 != null) {
                    sfVar2.q0();
                    return;
                }
                return;
            case 3:
                int i17 = ChatActivityEnterView.f23672s5;
                if (chatActivityEnterView.f23682b2 != null) {
                    if (chatActivityEnterView.f23687c0 - chatActivityEnterView.f23693d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f23680b0;
                        if (numberTextView != null) {
                            org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f23680b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    of t10 = chatActivityEnterView.t();
                    chatActivityEnterView.f23689c2 = t10;
                    ag.s0 d = ag.s0.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f23682b2.link;
                    String str3 = t10.f29071a;
                    ArrayList<TLRPC.MessageEntity> arrayList = t10.f29072b;
                    tc tcVar = new tc(chatActivityEnterView, 15);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, tcVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.f23781r5 == 3 && (sfVar = chatActivityEnterView.Z2) != null) {
                    sfVar.i1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f23739k3) {
                    if (!chatActivityEnterView.f23822z2 || (seVar = chatActivityEnterView.E0) == null || !seVar.isFocused()) {
                        if (chatActivityEnterView.f23823z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z10 = true;
                                chatActivityEnterView.k1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.B();
                                if (chatActivityEnterView.y3) {
                                    chatActivityEnterView.F(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (gfVar = chatActivityEnterView.U0) != null) {
                                    gfVar.P(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.E3) {
                                z10 = true;
                                chatActivityEnterView.U0.P(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.l1(chatActivityEnterView.f23823z3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f23790t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    nj0 nj0Var = chatActivityEnterView.f23719h1;
                    if (nj0Var != null) {
                        nj0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f23702e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        sf sfVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i10 = Integer.MAX_VALUE;
                        } else {
                            i10 = 0;
                        }
                        sfVar3.V1(2, 0, i10, chatActivityEnterView.S4, 0L, true);
                        be beVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        beVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
                        if (jjVar != null && jjVar == chatActivityEnterView.f23696d3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.f23690c3 != null) {
                        if (org.telegram.messenger.v2.f18448a) {
                            a1.g.z(chatActivityEnterView.f23690c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f23690c3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j12 = chatActivityEnterView.Q2;
                    org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                    if (unVar2 != null && unVar2.f42445v4) {
                        j10 = unVar2.b();
                    } else {
                        j10 = 0;
                    }
                    b02.B1(j12, j10, null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.f23725i1 = 0L;
                    chatActivityEnterView.k0(false);
                    chatActivityEnterView.F(true);
                    return;
                }
                return;
            case 7:
                xh.w wVar = chatActivityEnterView.f23742l0;
                boolean z15 = wVar.f54091w;
                wVar.setOpened(!z15);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.f0()) {
                    if (!z15) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.J0();
                            return;
                        }
                        org.telegram.messenger.i0.h3(new tc(chatActivityEnterView, 14), 275L);
                        chatActivityEnterView.i0(false);
                        return;
                    }
                    return;
                } else if (!z15) {
                    if (chatActivityEnterView.m0 == null) {
                        qe qeVar = new qe(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = qeVar;
                        org.telegram.ui.nb0 nb0Var = qeVar.f54012c;
                        chatActivityEnterView.getContext();
                        nb0Var.setLayoutManager(new s4.a0());
                        org.telegram.ui.nb0 nb0Var2 = chatActivityEnterView.m0.f54012c;
                        ?? g0Var = new s4.g0();
                        g0Var.f54076c = new ArrayList();
                        g0Var.d = new ArrayList();
                        g0Var.e = new ArrayList();
                        chatActivityEnterView.f23752n0 = g0Var;
                        nb0Var2.setAdapter(g0Var);
                        chatActivityEnterView.m0.f54012c.setOnItemClickListener(new re(chatActivityEnterView));
                        chatActivityEnterView.m0.f54012c.setOnItemLongClickListener(new vd(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f23746m1.addView(chatActivityEnterView.m0, w7.b6.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.f23685b5;
                        if (hVar != null) {
                            chatActivityEnterView.f23752n0.E(hVar);
                        }
                        chatActivityEnterView.B1();
                    }
                    qe qeVar2 = chatActivityEnterView.m0;
                    if (qeVar2.getVisibility() != 0) {
                        qeVar2.setVisibility(0);
                        qeVar2.f54012c.v0(0);
                        qeVar2.f54014n = true;
                        qeVar2.f54013f = false;
                        return;
                    } else if (qeVar2.f54013f) {
                        qeVar2.f54013f = false;
                        qeVar2.a();
                        qeVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    qe qeVar3 = chatActivityEnterView.m0;
                    if (qeVar3 != null) {
                        qeVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                sf sfVar4 = chatActivityEnterView.Z2;
                if (sfVar4 != null && !sfVar4.m()) {
                    sf sfVar5 = chatActivityEnterView.Z2;
                    ag agVar = chatActivityEnterView.F0;
                    sfVar5.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.f24409c).getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f7.edit();
                if (org.telegram.messenger.y1.d(chatActivityEnterView.P2.f42385q8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + unVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + unVar.a(), false);
                }
                if (org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f18938w7 && org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f18948x7) {
                    edit.putBoolean("show_gift_for_" + unVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).a2(org.telegram.messenger.d20.i(chatActivityEnterView.Q).e());
                if ((chatActivityEnterView.getParentFragment().f42385q8 == null || !chatActivityEnterView.getParentFragment().f42385q8.display_gifts_button) && (a2 == null || !a2.display_gifts_button)) {
                    org.telegram.messenger.i0.W3(chatActivityEnterView.K1, false);
                }
                TLRPC.User j13 = chatActivityEnterView.getParentFragment().j();
                if (j13 != null) {
                    if (chatActivityEnterView.getParentFragment().f42385q8 != null && org.telegram.messenger.y1.e(chatActivityEnterView.getParentFragment().f42385q8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, chatActivityEnterView.getContext(), null);
                    x1Var.r(200L);
                    x1Var.setOnCancelListener(new org.telegram.ui.ba(chatActivityEnterView, mg.k0.j(chatActivityEnterView.Q, null, new nd(chatActivityEnterView, x1Var, j13, z11)), 3));
                    return;
                }
                return;
            case 10:
                int i18 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.H0();
                return;
            case 11:
                oe oeVar = chatActivityEnterView.N0;
                if (oeVar != null && oeVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                s4.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new k2.m0(chatActivityEnterView), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f31212b;
                oe oeVar2 = chatActivityEnterView2.N0;
                if (oeVar2 != null && oeVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.R0(true, 2147483646, 0, 0L, true);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f31212b;
                oe oeVar3 = chatActivityEnterView3.N0;
                if (oeVar3 != null && oeVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.R0(false, 0, 0, 0L, true);
                return;
            case 14:
                org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                rd rdVar = chatActivityEnterView.Q0;
                org.telegram.ui.ActionBar.m1 m1Var = chatActivityEnterView.U;
                if (m1Var == null || !m1Var.f20565f) {
                    if (rdVar.f26057x) {
                        z60 z60Var = chatActivityEnterView.Y4;
                        if (z60Var != null) {
                            z60Var.u();
                            chatActivityEnterView.Y4 = null;
                            return;
                        }
                        se seVar3 = chatActivityEnterView.E0;
                        if (seVar3 != null && unVar3 != null) {
                            seVar3.m();
                            uu0 uu0Var2 = chatActivityEnterView.f23746m1;
                            if (uu0Var2 != null) {
                                uu0Var = uu0Var2;
                            } else {
                                uu0Var = chatActivityEnterView;
                            }
                            z60 z60Var2 = new z60(uu0Var, chatActivityEnterView.W3, rdVar, false, false, true);
                            z60Var2.X = org.telegram.messenger.i0.L(280.0f);
                            org.telegram.ui.un.t8(new z90(z60Var2, chatActivityEnterView.E0), unVar3.h, true, true, true, true);
                            z60Var2.U = true;
                            z60Var2.f32936p = new cd(1, chatActivityEnterView, z60Var2);
                            chatActivityEnterView.Y4 = z60Var2;
                            z60Var2.Z();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.A0) {
                        chatActivityEnterView.s1();
                        return;
                    } else if (chatActivityEnterView.q0() && chatActivityEnterView.f23708f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.k1(0, true);
                            gf gfVar2 = chatActivityEnterView.U0;
                            if (gfVar2 != null) {
                                gfVar2.t(false);
                            }
                            se seVar4 = chatActivityEnterView.E0;
                            if (seVar4 != null) {
                                seVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f23823z3) {
                            chatActivityEnterView.l1(false, true, false, true);
                            chatActivityEnterView.f23744l3 = true;
                            org.telegram.messenger.i0.h3(new tc(chatActivityEnterView, 23), 200L);
                            return;
                        }
                        chatActivityEnterView.G0();
                        return;
                    } else {
                        chatActivityEnterView.r1(1, 0, true, true);
                        gf gfVar3 = chatActivityEnterView.U0;
                        se seVar5 = chatActivityEnterView.E0;
                        if (seVar5 != null && seVar5.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (unVar3 != null) {
                            vh.p2 p2Var = unVar3.M1;
                            if (p2Var != null) {
                                if (p2Var.V) {
                                    p2Var.e(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            unVar3.M1 = null;
                            if (z14) {
                                z13 = true;
                                gfVar3.D(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        gfVar3.D(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, false);
                    chatActivityEnterView.U0.t(false);
                    se seVar6 = chatActivityEnterView.E0;
                    if (seVar6 != null) {
                        seVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.f23754n2 != null) {
                    if (chatActivityEnterView.q0()) {
                        r62 = 1;
                        if (chatActivityEnterView.f23708f2 == 1) {
                            if (chatActivityEnterView.q0() && chatActivityEnterView.f23708f2 == 1) {
                                chatActivityEnterView.r1(0, 1, true, false);
                            }
                        }
                    } else {
                        r62 = 1;
                    }
                    chatActivityEnterView.r1(r62, r62, r62, r62);
                } else if (chatActivityEnterView.f23766p2) {
                    chatActivityEnterView.setFieldText("/");
                    se seVar7 = chatActivityEnterView.E0;
                    if (seVar7 != null) {
                        seVar7.requestFocus();
                    }
                    chatActivityEnterView.F0();
                }
                if (chatActivityEnterView.f23823z3) {
                    chatActivityEnterView.l1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f31212b;
                org.telegram.ui.un unVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.p5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.q0()) {
                    chatActivityEnterView4.f23776r0 = new ld(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.p5) {
                        chatActivityEnterView4.j0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.j0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.r() > org.telegram.messenger.i0.L(20.0f)) {
                    int H0 = chatActivityEnterView4.Z2.H0();
                    int r10 = chatActivityEnterView4.Z2.r();
                    j11 = 0;
                    if (r10 <= org.telegram.messenger.i0.L(20.0f)) {
                        H0 += r10;
                    }
                    if (chatActivityEnterView4.W0) {
                        H0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (H0 < org.telegram.messenger.i0.L(200.0f)) {
                        chatActivityEnterView4.f23793u0 = new tc(chatActivityEnterView4, 0);
                        chatActivityEnterView4.L();
                        return;
                    }
                } else {
                    j11 = 0;
                }
                if (chatActivityEnterView4.Z2.F() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ie ieVar = chatActivityEnterView4.f23769q0;
                    if (ieVar != null) {
                        ieVar.e = false;
                        ieVar.l(new o1.j[0]);
                        return;
                    }
                    org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.p5) {
                        peer = chatActivityEnterView4.Z2.u();
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f;
                        org.telegram.messenger.vp.r1(chatActivityEnterView4.Q).L0(Long.valueOf(-chatActivityEnterView4.Q2));
                        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(chatActivityEnterView4.Q).M0(-chatActivityEnterView4.Q2);
                        if (M0 != null) {
                            peer2 = M0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = M0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView4.Z2.F() != null && !chatActivityEnterView4.Z2.F().peers.isEmpty()) {
                        peer = chatActivityEnterView4.Z2.F().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = org.telegram.messenger.w3.V(r12.L0(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.p5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        unVar4.getParentLayout().getOverlayContainerView();
                    }
                    ie ieVar2 = new ie(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, r12, V, peer4, chatActivityEnterView4.Z2.F(), new androidx.car.app.utils.a(chatActivityEnterView4, peer2, r12, 13), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f23769q0 = ieVar2;
                    ieVar2.e = true;
                    ieVar2.f20456c = 220;
                    ieVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f23769q0.setClippingEnabled(true);
                    chatActivityEnterView4.f23769q0.setFocusable(true);
                    chatActivityEnterView4.f23769q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f23769q0.setInputMethodMode(2);
                    chatActivityEnterView4.f23769q0.setSoftInputMode(0);
                    chatActivityEnterView4.f23769q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f23769q0.f20455b = false;
                    int i19 = -org.telegram.messenger.i0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.i0.Q1() && unVar4 != null) {
                        unVar4.getFragmentView().getLocationInWindow(iArr);
                        i11 = iArr[0] + i19;
                    } else {
                        i11 = i19;
                    }
                    int H02 = chatActivityEnterView4.Z2.H0();
                    int measuredHeight = chatActivityEnterView4.f23769q0.getContentView().getMeasuredHeight();
                    int r11 = chatActivityEnterView4.Z2.r();
                    float f10 = f7;
                    if (r11 <= org.telegram.messenger.i0.L(20.0f)) {
                        H02 += r11;
                    }
                    if (chatActivityEnterView4.W0) {
                        H02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    org.telegram.messenger.i0.L(f10);
                    int i20 = (i19 * 2) + H02;
                    if (unVar4 != null && unVar4.isInBubbleMode()) {
                        i12 = 0;
                    } else {
                        i12 = org.telegram.messenger.i0.f16020m;
                    }
                    if (measuredHeight < (i20 - i12) - chatActivityEnterView4.f23769q0.f25113p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i13 = ((iArr[1] - measuredHeight) - i19) - org.telegram.messenger.i0.L(2.0f);
                    } else {
                        if (unVar4 != null && unVar4.isInBubbleMode()) {
                            i13 = 0;
                        } else {
                            i13 = org.telegram.messenger.i0.f16020m;
                        }
                        chatActivityEnterView4.f23769q0.f25112o.getLayoutParams().height = ((H02 - i13) - org.telegram.messenger.i0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    ie ieVar3 = chatActivityEnterView4.f23769q0;
                    View view2 = ieVar3.f25118u;
                    tk0 tk0Var = ieVar3.v;
                    TLRPC.Peer peer5 = ieVar3.f25115r;
                    wn0 wn0Var = ieVar3.f25112o;
                    jg.l0 l0Var2 = ieVar3.f25117t;
                    ArrayList arrayList2 = ieVar3.f25122z;
                    int i21 = 1;
                    int size = arrayList2.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList2.get(i22);
                        i22++;
                        ((o1.j) obj).d();
                    }
                    arrayList2.clear();
                    l0Var2.setPivotX(org.telegram.messenger.i0.L(8.0f));
                    l0Var2.setPivotY(l0Var2.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f));
                    wn0Var.setPivotX(0.0f);
                    wn0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = ieVar3.f25116s.peers;
                    if (peer5 != null) {
                        int L = org.telegram.messenger.i0.L(54.0f);
                        int size2 = arrayList3.size() * L;
                        i14 = 2;
                        int i23 = 0;
                        while (i23 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i23).peer;
                            long j14 = peer6.channel_id;
                            if (j14 == j11 || j14 != peer5.channel_id) {
                                long j15 = peer6.user_id;
                                if (j15 == j11 || j15 != peer5.user_id) {
                                    long j16 = peer6.chat_id;
                                    if (j16 == j11 || j16 != peer5.chat_id) {
                                        i23++;
                                        l0Var2 = l0Var2;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            if (i23 != arrayList3.size() - 1 && tk0Var.getMeasuredHeight() < size2) {
                                i15 = tk0Var.getMeasuredHeight() % L;
                            } else {
                                i15 = 0;
                            }
                            ieVar3.f25119w.h1(i23, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.i0.L(7.0f) + i15);
                            if (tk0Var.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                l0Var = l0Var2;
                                view2.animate().alpha(f10).setDuration(150L).start();
                            }
                            l0Var = l0Var2;
                        }
                        l0Var = l0Var2;
                    } else {
                        l0Var = l0Var2;
                        i14 = 2;
                    }
                    l0Var.setScaleX(0.25f);
                    l0Var.setScaleY(0.25f);
                    wn0Var.setAlpha(0.25f);
                    o1.j jVar = new o1.j(l0Var, o1.j.f13943q);
                    jVar.f13957m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                    jVar.b(new tn0(ieVar3, i14));
                    o1.j jVar2 = new o1.j(l0Var, o1.j.f13944r);
                    jVar2.f13957m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                    jVar2.b(new tn0(ieVar3, 3));
                    o1.c cVar = o1.j.v;
                    o1.j jVar3 = new o1.j(l0Var, cVar);
                    jVar3.f13957m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                    o1.j jVar4 = new o1.j(wn0Var, cVar);
                    jVar4.f13957m = org.telegram.ui.Cells.f1.p(1.0f, 750.0f, 1.0f);
                    for (o1.j jVar5 : Arrays.asList(jVar, jVar2, jVar3, jVar4)) {
                        arrayList2.add(jVar5);
                        jVar5.a(new un0(ieVar3, jVar5, i21));
                        jVar5.h();
                        i21 = 1;
                    }
                    ie ieVar4 = chatActivityEnterView4.f23769q0;
                    chatActivityEnterView4.f23783s0 = i11;
                    chatActivityEnterView4.f23788t0 = i13;
                    ieVar4.showAtLocation(view, 51, i11, i13);
                    chatActivityEnterView4.f23764p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i24 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.Z();
                return;
            case 18:
                org.telegram.ui.ActionBar.m1 m1Var2 = chatActivityEnterView.U;
                if ((m1Var2 == null || !m1Var2.f20565f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.h2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.m1 m1Var3 = chatActivityEnterView.U;
                if ((m1Var3 == null || !m1Var3.f20565f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.a1();
                    return;
                }
                return;
            default:
                int i25 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.H0();
                return;
        }
    }
}
