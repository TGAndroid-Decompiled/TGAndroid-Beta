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
public final class bd implements View.OnClickListener {
    public final int f32218a;
    public final ChatActivityEnterView f32219b;

    public bd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f32218a = i7;
        this.f32219b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        vf vfVar;
        boolean z9;
        lf lfVar;
        we weVar;
        long j3;
        int i7;
        org.telegram.ui.cn cnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        st0 st0Var;
        ?? r92;
        float f10;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f32218a;
        TLRPC.Peer peer2 = null;
        ChatActivityEnterView chatActivityEnterView = this.f32219b;
        switch (i15) {
            case 0:
                we weVar2 = chatActivityEnterView.E0;
                if (weVar2 == null) {
                    str = "";
                } else {
                    str = weVar2.getText().toString();
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
                te teVar = chatActivityEnterView.L0;
                if (teVar == null || teVar.f45288p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f31146t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f31063f0 == null) {
                        chatActivityEnterView.S0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                vf vfVar2 = chatActivityEnterView.Z2;
                if (vfVar2 != null) {
                    vfVar2.C0();
                    return;
                }
                return;
            case 3:
                int i16 = ChatActivityEnterView.s5;
                if (chatActivityEnterView.f31039b2 != null) {
                    if (chatActivityEnterView.f31044c0 - chatActivityEnterView.f31050d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f31037b0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f31037b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    rf u10 = chatActivityEnterView.u();
                    chatActivityEnterView.f31046c2 = u10;
                    kg.y d = kg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f31039b2.link;
                    String str3 = u10.f37632a;
                    ArrayList<TLRPC.MessageEntity> arrayList = u10.f37633b;
                    zc zcVar = new zc(chatActivityEnterView, 15);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, zcVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.f31137r5 == 3 && (vfVar = chatActivityEnterView.Z2) != null) {
                    vfVar.m1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f31095k3) {
                    if (!chatActivityEnterView.f31179z2 || (weVar = chatActivityEnterView.E0) == null || !weVar.isFocused()) {
                        if (chatActivityEnterView.f31180z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z9 = true;
                                chatActivityEnterView.m1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.f31175y3) {
                                    chatActivityEnterView.E(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (lfVar = chatActivityEnterView.U0) != null) {
                                    lfVar.O(false);
                                }
                                z9 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.E3) {
                                z9 = true;
                                chatActivityEnterView.U0.O(true);
                            }
                            z9 = true;
                        }
                        if (!chatActivityEnterView.E3) {
                            chatActivityEnterView.n1(chatActivityEnterView.f31180z3 ^ z9, z9, false, z9);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f31146t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    ji0 ji0Var = chatActivityEnterView.f31076h1;
                    if (ji0Var != null) {
                        ji0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f31059e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        vf vfVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        vfVar3.Z1(2, 0, i7, chatActivityEnterView.S4, 0L, true);
                        fe feVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        feVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.ij ijVar = MediaController.B().f21300u0;
                        if (ijVar != null && ijVar == chatActivityEnterView.f31052d3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.f31047c3 != null) {
                        if (org.telegram.messenger.r2.f25216a) {
                            org.telegram.ui.Cells.f1.u(chatActivityEnterView.f31047c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f31047c3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
                    if (cnVar2 != null && cnVar2.f44693v4) {
                        j3 = cnVar2.b();
                    } else {
                        j3 = 0;
                    }
                    b02.B1(j10, j3, null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.f31082i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.E(true);
                    return;
                }
                return;
            case 7:
                hi.y yVar = chatActivityEnterView.f31098l0;
                boolean z14 = yVar.f15046w;
                yVar.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.W0 && !chatActivityEnterView.X0) {
                            chatActivityEnterView.L0();
                            return;
                        }
                        org.telegram.messenger.g0.i3(new zc(chatActivityEnterView, 14), 275L);
                        chatActivityEnterView.k0(false);
                        return;
                    }
                    return;
                } else if (!z14) {
                    if (chatActivityEnterView.m0 == null) {
                        ue ueVar = new ue(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = ueVar;
                        bi.q1 q1Var = ueVar.f14969c;
                        chatActivityEnterView.getContext();
                        q1Var.setLayoutManager(new v4.b0());
                        bi.q1 q1Var2 = chatActivityEnterView.m0.f14969c;
                        ?? g0Var = new v4.g0();
                        g0Var.f15028c = new ArrayList();
                        g0Var.d = new ArrayList();
                        g0Var.f15029e = new ArrayList();
                        chatActivityEnterView.f31109n0 = g0Var;
                        q1Var2.setAdapter(g0Var);
                        chatActivityEnterView.m0.f14969c.setOnItemClickListener(new ve(chatActivityEnterView));
                        chatActivityEnterView.m0.f14969c.setOnItemLongClickListener(new le(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f31103m1.addView(chatActivityEnterView.m0, c8.ha.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.f31042b5;
                        if (hVar != null) {
                            chatActivityEnterView.f31109n0.E(hVar);
                        }
                        chatActivityEnterView.E1();
                    }
                    ue ueVar2 = chatActivityEnterView.m0;
                    if (ueVar2.getVisibility() != 0) {
                        ueVar2.setVisibility(0);
                        ueVar2.f14969c.v0(0);
                        ueVar2.f14972n = true;
                        ueVar2.f14971f = false;
                        return;
                    } else if (ueVar2.f14971f) {
                        ueVar2.f14971f = false;
                        ueVar2.a();
                        ueVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    ue ueVar3 = chatActivityEnterView.m0;
                    if (ueVar3 != null) {
                        ueVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                vf vfVar4 = chatActivityEnterView.Z2;
                if (vfVar4 != null && !vfVar4.c()) {
                    vf vfVar5 = chatActivityEnterView.Z2;
                    dg dgVar = chatActivityEnterView.F0;
                    vfVar5.i1(dgVar, ((org.telegram.ui.ActionBar.m5) dgVar.f32965c).getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24778e7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView.P2.f44633q8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + cnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + cnVar.a(), false);
                }
                if (org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24926v7 && org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24936w7) {
                    edit.putBoolean("show_gift_for_" + cnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).b2(org.telegram.messenger.p10.i(chatActivityEnterView.Q).e());
                if ((chatActivityEnterView.getParentFragment().f44633q8 == null || !chatActivityEnterView.getParentFragment().f44633q8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.X3(chatActivityEnterView.K1, false);
                }
                TLRPC.User j11 = chatActivityEnterView.getParentFragment().j();
                if (j11 != null) {
                    if (chatActivityEnterView.getParentFragment().f44633q8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().f44633q8.birthday)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, chatActivityEnterView.getContext(), null);
                    u1Var.r(200L);
                    u1Var.setOnCancelListener(new bi.g0(chatActivityEnterView, wg.r.j(chatActivityEnterView.Q, null, new di.d3(chatActivityEnterView, u1Var, j11, z10)), 4));
                    return;
                }
                return;
            case 10:
                int i17 = ChatActivityEnterView.s5;
                chatActivityEnterView.J0();
                return;
            case 11:
                se seVar = chatActivityEnterView.N0;
                if (seVar != null && seVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                u4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new yd(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f32219b;
                se seVar2 = chatActivityEnterView2.N0;
                if (seVar2 != null && seVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(true, 2147483646, 0, 0L, true);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f32219b;
                se seVar3 = chatActivityEnterView3.N0;
                if (seVar3 != null && seVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(false, 0, 0, 0L, true);
                return;
            case 14:
                org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
                vd vdVar = chatActivityEnterView.Q0;
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.U;
                if (i1Var == null || !i1Var.f27532f) {
                    if (vdVar.f34618x) {
                        k60 k60Var = chatActivityEnterView.Y4;
                        if (k60Var != null) {
                            k60Var.u();
                            chatActivityEnterView.Y4 = null;
                            return;
                        }
                        we weVar3 = chatActivityEnterView.E0;
                        if (weVar3 != null && cnVar3 != null) {
                            weVar3.m();
                            st0 st0Var2 = chatActivityEnterView.f31103m1;
                            if (st0Var2 != null) {
                                st0Var = st0Var2;
                            } else {
                                st0Var = chatActivityEnterView;
                            }
                            k60 k60Var2 = new k60(st0Var, chatActivityEnterView.W3, vdVar, false, false, true);
                            k60Var2.X = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.cn.B8(new h90(k60Var2, chatActivityEnterView.E0), cnVar3.h, true, true, true, true);
                            k60Var2.U = true;
                            k60Var2.f35214p = new org.telegram.ui.fq(8, chatActivityEnterView, k60Var2);
                            chatActivityEnterView.Y4 = k60Var2;
                            k60Var2.Z();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        return;
                    } else if (chatActivityEnterView.s0() && chatActivityEnterView.f31065f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            lf lfVar2 = chatActivityEnterView.U0;
                            if (lfVar2 != null) {
                                lfVar2.t(false);
                            }
                            we weVar4 = chatActivityEnterView.E0;
                            if (weVar4 != null) {
                                weVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f31180z3) {
                            chatActivityEnterView.n1(false, true, false, true);
                            chatActivityEnterView.f31100l3 = true;
                            org.telegram.messenger.g0.i3(new zc(chatActivityEnterView, 23), 200L);
                            return;
                        }
                        chatActivityEnterView.I0();
                        return;
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        lf lfVar3 = chatActivityEnterView.U0;
                        we weVar5 = chatActivityEnterView.E0;
                        if (weVar5 != null && weVar5.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (cnVar3 != null) {
                            fi.m3 m3Var = cnVar3.M1;
                            if (m3Var != null) {
                                if (m3Var.V) {
                                    m3Var.f(true);
                                }
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            cnVar3.M1 = null;
                            if (z13) {
                                z12 = true;
                                lfVar3.C(z11, z12);
                                return;
                            }
                        }
                        z12 = false;
                        lfVar3.C(z11, z12);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    we weVar6 = chatActivityEnterView.E0;
                    if (weVar6 != null) {
                        weVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.f31110n2 != null) {
                    if (chatActivityEnterView.s0()) {
                        r92 = 1;
                        if (chatActivityEnterView.f31065f2 == 1) {
                            if (chatActivityEnterView.s0() && chatActivityEnterView.f31065f2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r92 = 1;
                    }
                    chatActivityEnterView.t1(r92, r92, r92, r92);
                } else if (chatActivityEnterView.f31121p2) {
                    chatActivityEnterView.setFieldText("/");
                    we weVar7 = chatActivityEnterView.E0;
                    if (weVar7 != null) {
                        weVar7.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.f31180z3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f32219b;
                org.telegram.ui.cn cnVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f31124p5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.s0()) {
                    chatActivityEnterView4.f31132r0 = new qd(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.f31124p5) {
                        chatActivityEnterView4.l0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.l0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.l() > org.telegram.messenger.g0.L(20.0f)) {
                    int S0 = chatActivityEnterView4.Z2.S0();
                    int l10 = chatActivityEnterView4.Z2.l();
                    if (l10 <= org.telegram.messenger.g0.L(20.0f)) {
                        S0 += l10;
                    }
                    if (chatActivityEnterView4.W0) {
                        S0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (S0 < org.telegram.messenger.g0.L(200.0f)) {
                        chatActivityEnterView4.f31149u0 = new zc(chatActivityEnterView4, 0);
                        chatActivityEnterView4.L();
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.I() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    me meVar = chatActivityEnterView4.f31125q0;
                    if (meVar != null) {
                        meVar.f27493e = false;
                        meVar.l(new r1.g[0]);
                        return;
                    }
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f31124p5) {
                        peer = chatActivityEnterView4.Z2.s();
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        org.telegram.messenger.qp.s1(chatActivityEnterView4.Q).M0(Long.valueOf(-chatActivityEnterView4.Q2));
                        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(chatActivityEnterView4.Q).N0(-chatActivityEnterView4.Q2);
                        if (N0 != null) {
                            peer2 = N0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = N0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView4.Z2.I() != null && !chatActivityEnterView4.Z2.I().peers.isEmpty()) {
                        peer = chatActivityEnterView4.Z2.I().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = org.telegram.messenger.t3.V(s12.M0(Long.valueOf(-chatActivityEnterView4.Q2)));
                    if (chatActivityEnterView4.f31124p5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        cnVar4.getParentLayout().getOverlayContainerView();
                    }
                    me meVar2 = new me(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, s12, V, peer4, chatActivityEnterView4.Z2.I(), new a3.h(chatActivityEnterView4, peer2, s12, 21), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f31125q0 = meVar2;
                    meVar2.f27493e = true;
                    meVar2.f27492c = 220;
                    meVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f31125q0.setClippingEnabled(true);
                    chatActivityEnterView4.f31125q0.setFocusable(true);
                    chatActivityEnterView4.f31125q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f31125q0.setInputMethodMode(2);
                    chatActivityEnterView4.f31125q0.setSoftInputMode(0);
                    chatActivityEnterView4.f31125q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f31125q0.f27491b = false;
                    int i18 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && cnVar4 != null) {
                        cnVar4.getFragmentView().getLocationInWindow(iArr);
                        i10 = iArr[0] + i18;
                    } else {
                        i10 = i18;
                    }
                    int S02 = chatActivityEnterView4.Z2.S0();
                    int measuredHeight = chatActivityEnterView4.f31125q0.getContentView().getMeasuredHeight();
                    int l11 = chatActivityEnterView4.Z2.l();
                    if (l11 <= org.telegram.messenger.g0.L(20.0f)) {
                        S02 += l11;
                    }
                    if (chatActivityEnterView4.W0) {
                        S02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    org.telegram.messenger.g0.L(f10);
                    int i19 = (i18 * 2) + S02;
                    if (cnVar4 != null && cnVar4.isInBubbleMode()) {
                        i11 = 0;
                    } else {
                        i11 = org.telegram.messenger.g0.f22561m;
                    }
                    if (measuredHeight < (i19 - i11) - chatActivityEnterView4.f31125q0.f32292p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i18) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (cnVar4 != null && cnVar4.isInBubbleMode()) {
                            i12 = 0;
                        } else {
                            i12 = org.telegram.messenger.g0.f22561m;
                        }
                        chatActivityEnterView4.f31125q0.f32291o.getLayoutParams().height = ((S02 - i12) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    me meVar3 = chatActivityEnterView4.f31125q0;
                    View view2 = meVar3.f32297u;
                    pj0 pj0Var = meVar3.v;
                    TLRPC.Peer peer5 = meVar3.f32294r;
                    vm0 vm0Var = meVar3.f32291o;
                    bi.e5 e5Var = meVar3.f32296t;
                    ArrayList arrayList2 = meVar3.f32301z;
                    int i20 = 1;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList2.get(i21);
                        i21++;
                        ((r1.g) obj).d();
                    }
                    arrayList2.clear();
                    e5Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    e5Var.setPivotY(e5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    vm0Var.setPivotX(0.0f);
                    vm0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = meVar3.f32295s.peers;
                    if (peer5 != null) {
                        int L = org.telegram.messenger.g0.L(54.0f);
                        int size2 = arrayList3.size() * L;
                        i13 = 2;
                        int i22 = 0;
                        while (i22 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i22).peer;
                            pj0 pj0Var2 = pj0Var;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList4 = arrayList3;
                            long j12 = peer6.channel_id;
                            if (j12 == 0 || j12 != peer5.channel_id) {
                                long j13 = peer6.user_id;
                                if (j13 == 0 || j13 != peer5.user_id) {
                                    long j14 = peer6.chat_id;
                                    if (j14 == 0 || j14 != peer5.chat_id) {
                                        i22++;
                                        pj0Var = pj0Var2;
                                        arrayList3 = arrayList4;
                                        f10 = 1.0f;
                                    }
                                }
                            }
                            if (i22 != arrayList4.size() - 1 && pj0Var2.getMeasuredHeight() < size2) {
                                i14 = pj0Var2.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            meVar3.f32298w.h1(i22, (size2 - ((arrayList4.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (pj0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                view2.animate().alpha(f10).setDuration(150L).start();
                            }
                        }
                    } else {
                        i13 = 2;
                    }
                    e5Var.setScaleX(0.25f);
                    e5Var.setScaleY(0.25f);
                    vm0Var.setAlpha(0.25f);
                    r1.g gVar = new r1.g(e5Var, r1.g.f54264q);
                    gVar.f54279m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    gVar.b(new sm0(meVar3, i13));
                    r1.g gVar2 = new r1.g(e5Var, r1.g.f54265r);
                    gVar2.f54279m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    gVar2.b(new sm0(meVar3, 3));
                    r1.b bVar = r1.g.v;
                    r1.g gVar3 = new r1.g(e5Var, bVar);
                    gVar3.f54279m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    r1.g gVar4 = new r1.g(vm0Var, bVar);
                    gVar4.f54279m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList2.add(gVar5);
                        gVar5.a(new tm0(meVar3, gVar5, i20));
                        gVar5.h();
                        i20 = 1;
                    }
                    me meVar4 = chatActivityEnterView4.f31125q0;
                    chatActivityEnterView4.f31139s0 = i10;
                    chatActivityEnterView4.f31144t0 = i12;
                    meVar4.showAtLocation(view, 51, i10, i12);
                    chatActivityEnterView4.f31119p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i23 = ChatActivityEnterView.s5;
                chatActivityEnterView.a0();
                return;
            case 18:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.U;
                if ((i1Var2 == null || !i1Var2.f27532f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.U;
                if ((i1Var3 == null || !i1Var3.f27532f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.e1();
                    return;
                }
                return;
            default:
                int i24 = ChatActivityEnterView.s5;
                chatActivityEnterView.J0();
                return;
        }
    }
}
