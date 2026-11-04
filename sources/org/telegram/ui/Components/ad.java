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
public final class ad implements View.OnClickListener {
    public final int f31805a;
    public final ChatActivityEnterView f31806b;

    public ad(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f31805a = i3;
        this.f31806b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        uf ufVar;
        boolean z10;
        kf kfVar;
        ve veVar;
        long j10;
        int i3;
        org.telegram.ui.wm wmVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        qt0 qt0Var;
        ?? r10;
        float f10;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12;
        ai.o2 o2Var;
        int i13;
        int i14;
        int i15 = this.f31805a;
        TLRPC.Peer peer2 = null;
        ChatActivityEnterView chatActivityEnterView = this.f31806b;
        switch (i15) {
            case 0:
                ve veVar2 = chatActivityEnterView.F0;
                if (veVar2 == null) {
                    str = "";
                } else {
                    str = veVar2.getText().toString();
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
                se seVar = chatActivityEnterView.M0;
                if (seVar == null || seVar.f50493q0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f31205u2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f31123g0 == null) {
                        chatActivityEnterView.R0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                uf ufVar2 = chatActivityEnterView.f31087a3;
                if (ufVar2 != null) {
                    ufVar2.F0();
                    return;
                }
                return;
            case 3:
                int i16 = ChatActivityEnterView.f31082t5;
                if (chatActivityEnterView.c2 != null) {
                    if (chatActivityEnterView.f31103d0 - chatActivityEnterView.f31110e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f31098c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f31098c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    qf u10 = chatActivityEnterView.u();
                    chatActivityEnterView.f31105d2 = u10;
                    lg.z d = lg.z.d(chatActivityEnterView.R);
                    String str2 = chatActivityEnterView.c2.link;
                    String str3 = u10.f37454a;
                    ArrayList<TLRPC.MessageEntity> arrayList = u10.f37455b;
                    yc ycVar = new yc(chatActivityEnterView, 15);
                    TL_account.TL_businessChatLink c2 = d.c(str2);
                    if (c2 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c2.title;
                        d.b(c2, tL_inputBusinessChatLink, ycVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.f31197s5 == 3 && (ufVar = chatActivityEnterView.f31087a3) != null) {
                    ufVar.m1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.f31154l3) {
                    if (!chatActivityEnterView.A2 || (veVar = chatActivityEnterView.F0) == null || !veVar.isFocused()) {
                        if (chatActivityEnterView.A3) {
                            if (chatActivityEnterView.S1 != 0) {
                                z10 = true;
                                chatActivityEnterView.l1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.f31234z3) {
                                    chatActivityEnterView.E(true);
                                }
                            } else {
                                if (!chatActivityEnterView.F3 && (kfVar = chatActivityEnterView.V0) != null) {
                                    kfVar.O(false);
                                }
                                z10 = true;
                            }
                        } else {
                            if (!chatActivityEnterView.F3) {
                                z10 = true;
                                chatActivityEnterView.V0.O(true);
                            }
                            z10 = true;
                        }
                        if (!chatActivityEnterView.F3) {
                            chatActivityEnterView.m1(chatActivityEnterView.A3 ^ z10, z10, false, z10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f31205u2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    mi0 mi0Var = chatActivityEnterView.f31136i1;
                    if (mi0Var != null) {
                        mi0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f31120f3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.I3);
                        uf ufVar3 = chatActivityEnterView.f31087a3;
                        if (chatActivityEnterView.P) {
                            i3 = Integer.MAX_VALUE;
                        } else {
                            i3 = 0;
                        }
                        ufVar3.d2(2, 0, i3, chatActivityEnterView.T4, 0L, true);
                        ee eeVar = chatActivityEnterView.K0;
                        chatActivityEnterView.T4 = 0L;
                        eeVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                        if (ziVar != null && ziVar == chatActivityEnterView.f31113e3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.f31106d3 != null) {
                        if (org.telegram.messenger.r2.f25040a) {
                            k2.p1.w(chatActivityEnterView.f31106d3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f31106d3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                    long j11 = chatActivityEnterView.R2;
                    org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
                    if (wmVar2 != null && wmVar2.f51525w4) {
                        j10 = wmVar2.b();
                    } else {
                        j10 = 0;
                    }
                    b02.B1(j11, j10, null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.f31141j1 = 0L;
                    chatActivityEnterView.l0(false);
                    chatActivityEnterView.E(true);
                    return;
                }
                return;
            case 7:
                ii.a0 a0Var = chatActivityEnterView.m0;
                boolean z15 = a0Var.f14778w;
                a0Var.setOpened(!z15);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                if (chatActivityEnterView.g0()) {
                    if (!z15) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.K0();
                            return;
                        }
                        org.telegram.messenger.g0.i3(new yc(chatActivityEnterView, 14), 275L);
                        chatActivityEnterView.j0(false);
                        return;
                    }
                    return;
                } else if (!z15) {
                    if (chatActivityEnterView.f31162n0 == null) {
                        te teVar = new te(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.f31162n0 = teVar;
                        ci.j1 j1Var = teVar.f15279c;
                        chatActivityEnterView.getContext();
                        j1Var.setLayoutManager(new u4.b0());
                        ci.j1 j1Var2 = chatActivityEnterView.f31162n0.f15279c;
                        ?? h0Var = new u4.h0();
                        h0Var.f15332c = new ArrayList();
                        h0Var.d = new ArrayList();
                        h0Var.f15333e = new ArrayList();
                        chatActivityEnterView.f31167o0 = h0Var;
                        j1Var2.setAdapter(h0Var);
                        chatActivityEnterView.f31162n0.f15279c.setOnItemClickListener(new ue(chatActivityEnterView));
                        chatActivityEnterView.f31162n0.f15279c.setOnItemLongClickListener(new ke(chatActivityEnterView));
                        chatActivityEnterView.f31162n0.setClipToPadding(false);
                        chatActivityEnterView.f31163n1.addView(chatActivityEnterView.f31162n0, b8.mf.e(-1, -1, 80));
                        chatActivityEnterView.f31162n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.f31102c5;
                        if (hVar != null) {
                            chatActivityEnterView.f31167o0.E(hVar);
                        }
                        chatActivityEnterView.D1();
                    }
                    te teVar2 = chatActivityEnterView.f31162n0;
                    if (teVar2.getVisibility() != 0) {
                        teVar2.setVisibility(0);
                        teVar2.f15279c.v0(0);
                        teVar2.f15282n = true;
                        teVar2.f15281f = false;
                        return;
                    } else if (teVar2.f15281f) {
                        teVar2.f15281f = false;
                        teVar2.a();
                        teVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    te teVar3 = chatActivityEnterView.f31162n0;
                    if (teVar3 != null) {
                        teVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                uf ufVar4 = chatActivityEnterView.f31087a3;
                if (ufVar4 != null && !ufVar4.k()) {
                    uf ufVar5 = chatActivityEnterView.f31087a3;
                    cg cgVar = chatActivityEnterView.G0;
                    ufVar5.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.f32702c).getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(chatActivityEnterView.R).f22999e7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView.Q2.f51466r8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + wmVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + wmVar.a(), false);
                }
                if (org.telegram.messenger.hp.s1(chatActivityEnterView.R).f23147v7 && org.telegram.messenger.hp.s1(chatActivityEnterView.R).f23157w7) {
                    edit.putBoolean("show_gift_for_" + wmVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(chatActivityEnterView.R).b2(org.telegram.messenger.h10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().f51466r8 == null || !chatActivityEnterView.getParentFragment().f51466r8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.X3(chatActivityEnterView.L1, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView.getParentFragment().f51466r8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().f51466r8.birthday)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, chatActivityEnterView.getContext(), null);
                    s1Var.r(200L);
                    s1Var.setOnCancelListener(new ci.b0(chatActivityEnterView, xg.s.j(chatActivityEnterView.R, null, new ei.g3(chatActivityEnterView, s1Var, j12, z11)), 4));
                    return;
                }
                return;
            case 10:
                int i17 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.I0();
                return;
            case 11:
                re reVar = chatActivityEnterView.O0;
                if (reVar != null && reVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                t4.L(chatActivityEnterView.P2, chatActivityEnterView.Q2.a(), new xd(chatActivityEnterView, 1), chatActivityEnterView.X3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f31806b;
                re reVar2 = chatActivityEnterView2.O0;
                if (reVar2 != null && reVar2.isShowing()) {
                    chatActivityEnterView2.O0.dismiss();
                }
                chatActivityEnterView2.S0(true, 2147483646, 0, 0L, true);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f31806b;
                re reVar3 = chatActivityEnterView3.O0;
                if (reVar3 != null && reVar3.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.S0(false, 0, 0, 0L, true);
                return;
            case 14:
                org.telegram.ui.wm wmVar3 = chatActivityEnterView.Q2;
                ud udVar = chatActivityEnterView.R0;
                org.telegram.ui.ActionBar.h1 h1Var = chatActivityEnterView.V;
                if (h1Var == null || !h1Var.f27556f) {
                    if (udVar.f34384x) {
                        f60 f60Var = chatActivityEnterView.Z4;
                        if (f60Var != null) {
                            f60Var.u();
                            chatActivityEnterView.Z4 = null;
                            return;
                        }
                        ve veVar3 = chatActivityEnterView.F0;
                        if (veVar3 != null && wmVar3 != null) {
                            veVar3.m();
                            qt0 qt0Var2 = chatActivityEnterView.f31163n1;
                            if (qt0Var2 != null) {
                                qt0Var = qt0Var2;
                            } else {
                                qt0Var = chatActivityEnterView;
                            }
                            f60 f60Var2 = new f60(qt0Var, chatActivityEnterView.X3, udVar, false, false, true);
                            f60Var2.X = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.wm.A8(new d90(f60Var2, chatActivityEnterView.F0), wmVar3.h, true, true, true, true);
                            f60Var2.U = true;
                            f60Var2.f33742p = new org.telegram.ui.lo(12, chatActivityEnterView, f60Var2);
                            chatActivityEnterView.Z4 = f60Var2;
                            f60Var2.Z();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.B0) {
                        chatActivityEnterView.t1();
                        return;
                    } else if (chatActivityEnterView.r0() && chatActivityEnterView.f31125g2 == 0) {
                        if (chatActivityEnterView.S1 != 0) {
                            chatActivityEnterView.l1(0, true);
                            kf kfVar2 = chatActivityEnterView.V0;
                            if (kfVar2 != null) {
                                kfVar2.t(false);
                            }
                            ve veVar4 = chatActivityEnterView.F0;
                            if (veVar4 != null) {
                                veVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.A3) {
                            chatActivityEnterView.m1(false, true, false, true);
                            chatActivityEnterView.f31158m3 = true;
                            org.telegram.messenger.g0.i3(new yc(chatActivityEnterView, 23), 200L);
                            return;
                        }
                        chatActivityEnterView.H0();
                        return;
                    } else {
                        chatActivityEnterView.s1(1, 0, true, true);
                        kf kfVar3 = chatActivityEnterView.V0;
                        ve veVar5 = chatActivityEnterView.F0;
                        if (veVar5 != null && veVar5.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (wmVar3 != null) {
                            gi.l3 l3Var = wmVar3.N1;
                            if (l3Var != null) {
                                if (l3Var.W) {
                                    l3Var.f(true);
                                }
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            wmVar3.N1 = null;
                            if (z14) {
                                z13 = true;
                                kfVar3.C(z12, z13);
                                return;
                            }
                        }
                        z13 = false;
                        kfVar3.C(z12, z13);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.S1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.V0.t(false);
                    ve veVar6 = chatActivityEnterView.F0;
                    if (veVar6 != null) {
                        veVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.f31169o2 != null) {
                    if (chatActivityEnterView.r0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f31125g2 == 1) {
                            if (chatActivityEnterView.r0() && chatActivityEnterView.f31125g2 == 1) {
                                chatActivityEnterView.s1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.s1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.f31181q2) {
                    chatActivityEnterView.setFieldText("/");
                    ve veVar7 = chatActivityEnterView.F0;
                    if (veVar7 != null) {
                        veVar7.requestFocus();
                    }
                    chatActivityEnterView.G0();
                }
                if (chatActivityEnterView.A3) {
                    chatActivityEnterView.m1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f31806b;
                org.telegram.ui.wm wmVar4 = chatActivityEnterView4.Q2;
                if (!chatActivityEnterView4.f31184q5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.r0()) {
                    chatActivityEnterView4.f31192s0 = new pd(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.f31184q5) {
                        chatActivityEnterView4.k0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.k0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.f31087a3.o() > org.telegram.messenger.g0.L(20.0f)) {
                    int O0 = chatActivityEnterView4.f31087a3.O0();
                    int o10 = chatActivityEnterView4.f31087a3.o();
                    if (o10 <= org.telegram.messenger.g0.L(20.0f)) {
                        O0 += o10;
                    }
                    if (chatActivityEnterView4.X0) {
                        O0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (O0 < org.telegram.messenger.g0.L(200.0f)) {
                        chatActivityEnterView4.f31208v0 = new yc(chatActivityEnterView4, 0);
                        chatActivityEnterView4.L();
                        return;
                    }
                }
                if (chatActivityEnterView4.f31087a3.M() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    le leVar = chatActivityEnterView4.f31186r0;
                    if (leVar != null) {
                        leVar.f27495e = false;
                        leVar.l(new q1.g[0]);
                        return;
                    }
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView4.R);
                    if (chatActivityEnterView4.f31184q5) {
                        peer = chatActivityEnterView4.f31087a3.t();
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        org.telegram.messenger.hp.s1(chatActivityEnterView4.R).M0(Long.valueOf(-chatActivityEnterView4.R2));
                        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(chatActivityEnterView4.R).N0(-chatActivityEnterView4.R2);
                        if (N0 != null) {
                            peer2 = N0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = N0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView4.f31087a3.M() != null && !chatActivityEnterView4.f31087a3.M().peers.isEmpty()) {
                        peer = chatActivityEnterView4.f31087a3.M().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = org.telegram.messenger.t3.V(s12.M0(Long.valueOf(-chatActivityEnterView4.R2)));
                    if (chatActivityEnterView4.f31184q5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        wmVar4.getParentLayout().getOverlayContainerView();
                    }
                    le leVar2 = new le(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.Q2, s12, V, peer4, chatActivityEnterView4.f31087a3.M(), new aa.a(chatActivityEnterView4, peer2, s12, 21), chatActivityEnterView4.X3);
                    chatActivityEnterView4.f31186r0 = leVar2;
                    leVar2.f27495e = true;
                    leVar2.f27494c = 220;
                    leVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f31186r0.setClippingEnabled(true);
                    chatActivityEnterView4.f31186r0.setFocusable(true);
                    chatActivityEnterView4.f31186r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f31186r0.setInputMethodMode(2);
                    chatActivityEnterView4.f31186r0.setSoftInputMode(0);
                    chatActivityEnterView4.f31186r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f31186r0.f27493b = false;
                    int i18 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && wmVar4 != null) {
                        wmVar4.getFragmentView().getLocationInWindow(iArr);
                        i10 = iArr[0] + i18;
                    } else {
                        i10 = i18;
                    }
                    int O02 = chatActivityEnterView4.f31087a3.O0();
                    int measuredHeight = chatActivityEnterView4.f31186r0.getContentView().getMeasuredHeight();
                    int o11 = chatActivityEnterView4.f31087a3.o();
                    float f11 = f10;
                    if (o11 <= org.telegram.messenger.g0.L(20.0f)) {
                        O02 += o11;
                    }
                    if (chatActivityEnterView4.X0) {
                        O02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    org.telegram.messenger.g0.L(f11);
                    int i19 = (i18 * 2) + O02;
                    if (wmVar4 != null && wmVar4.isInBubbleMode()) {
                        i11 = 0;
                    } else {
                        i11 = org.telegram.messenger.g0.f22602m;
                    }
                    if (measuredHeight < (i19 - i11) - chatActivityEnterView4.f31186r0.f33422p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i18) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (wmVar4 != null && wmVar4.isInBubbleMode()) {
                            i12 = 0;
                        } else {
                            i12 = org.telegram.messenger.g0.f22602m;
                        }
                        chatActivityEnterView4.f31186r0.f33421o.getLayoutParams().height = ((O02 - i12) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    le leVar3 = chatActivityEnterView4.f31186r0;
                    View view2 = leVar3.f33427u;
                    tj0 tj0Var = leVar3.v;
                    TLRPC.Peer peer5 = leVar3.f33424r;
                    ym0 ym0Var = leVar3.f33421o;
                    ai.o2 o2Var2 = leVar3.f33426t;
                    ArrayList arrayList2 = leVar3.f33431z;
                    int i20 = 1;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList2.get(i21);
                        i21++;
                        ((q1.g) obj).d();
                    }
                    arrayList2.clear();
                    o2Var2.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    o2Var2.setPivotY(o2Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    ym0Var.setPivotX(0.0f);
                    ym0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = leVar3.f33425s.peers;
                    if (peer5 != null) {
                        int L = org.telegram.messenger.g0.L(54.0f);
                        int size2 = arrayList3.size() * L;
                        i13 = 2;
                        int i22 = 0;
                        while (i22 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i22).peer;
                            tj0 tj0Var2 = tj0Var;
                            ai.o2 o2Var3 = o2Var2;
                            long j13 = peer6.channel_id;
                            if (j13 == 0 || j13 != peer5.channel_id) {
                                long j14 = peer6.user_id;
                                if (j14 == 0 || j14 != peer5.user_id) {
                                    long j15 = peer6.chat_id;
                                    if (j15 == 0 || j15 != peer5.chat_id) {
                                        i22++;
                                        o2Var2 = o2Var3;
                                        tj0Var = tj0Var2;
                                        f11 = 1.0f;
                                    }
                                }
                            }
                            if (i22 != arrayList3.size() - 1 && tj0Var2.getMeasuredHeight() < size2) {
                                i14 = tj0Var2.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            leVar3.f33428w.h1(i22, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (tj0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                o2Var = o2Var3;
                                view2.animate().alpha(f11).setDuration(150L).start();
                            } else {
                                o2Var = o2Var3;
                            }
                        }
                        o2Var = o2Var2;
                    } else {
                        o2Var = o2Var2;
                        i13 = 2;
                    }
                    o2Var.setScaleX(0.25f);
                    o2Var.setScaleY(0.25f);
                    ym0Var.setAlpha(0.25f);
                    q1.g gVar = new q1.g(o2Var, q1.g.f53638q);
                    gVar.f53653m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                    gVar.b(new vm0(leVar3, i13));
                    q1.g gVar2 = new q1.g(o2Var, q1.g.f53639r);
                    gVar2.f53653m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                    gVar2.b(new vm0(leVar3, 3));
                    q1.b bVar = q1.g.v;
                    q1.g gVar3 = new q1.g(o2Var, bVar);
                    gVar3.f53653m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                    q1.g gVar4 = new q1.g(ym0Var, bVar);
                    gVar4.f53653m = org.telegram.ui.Cells.f1.s(1.0f, 750.0f, 1.0f);
                    for (q1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList2.add(gVar5);
                        gVar5.a(new wm0(leVar3, gVar5, i20));
                        gVar5.h();
                        i20 = 1;
                    }
                    le leVar4 = chatActivityEnterView4.f31186r0;
                    chatActivityEnterView4.f31198t0 = i10;
                    chatActivityEnterView4.f31203u0 = i12;
                    leVar4.showAtLocation(view, 51, i10, i12);
                    chatActivityEnterView4.f31179q0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i23 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.a0();
                return;
            case 18:
                org.telegram.ui.ActionBar.h1 h1Var2 = chatActivityEnterView.V;
                if ((h1Var2 == null || !h1Var2.f27556f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.f31087a3.r2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.h1 h1Var3 = chatActivityEnterView.V;
                if ((h1Var3 == null || !h1Var3.f27556f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.f31087a3.b1();
                    return;
                }
                return;
            default:
                int i24 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.I0();
                return;
        }
    }
}
