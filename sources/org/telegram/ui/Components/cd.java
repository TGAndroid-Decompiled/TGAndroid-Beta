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
public final class cd implements View.OnClickListener {
    public final int f32642a;
    public final ChatActivityEnterView f32643b;

    public cd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f32642a = i7;
        this.f32643b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        String str;
        wf wfVar;
        boolean z9;
        mf mfVar;
        xe xeVar;
        long j3;
        int i7;
        org.telegram.ui.cn cnVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        tt0 tt0Var;
        ?? r10;
        float f10;
        TLRPC.Peer peer;
        int i10;
        int i11;
        int i12;
        bi.e5 e5Var;
        int i13;
        int i14;
        int i15 = this.f32642a;
        TLRPC.Peer peer2 = null;
        ChatActivityEnterView chatActivityEnterView = this.f32643b;
        switch (i15) {
            case 0:
                xe xeVar2 = chatActivityEnterView.E0;
                if (xeVar2 == null) {
                    str = "";
                } else {
                    str = xeVar2.getText().toString();
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
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar == null || ueVar.f44967p0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f31135t2;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f31052f0 == null) {
                        chatActivityEnterView.S0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    wfVar2.C0();
                    return;
                }
                return;
            case 3:
                int i16 = ChatActivityEnterView.s5;
                if (chatActivityEnterView.f31028b2 != null) {
                    if (chatActivityEnterView.f31033c0 - chatActivityEnterView.f31039d0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f31026b0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f31026b0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                    }
                    sf u10 = chatActivityEnterView.u();
                    chatActivityEnterView.f31035c2 = u10;
                    kg.y d = kg.y.d(chatActivityEnterView.Q);
                    String str2 = chatActivityEnterView.f31028b2.link;
                    String str3 = u10.f38046a;
                    ArrayList<TLRPC.MessageEntity> arrayList = u10.f38047b;
                    ad adVar = new ad(chatActivityEnterView, 15);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, adVar);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (chatActivityEnterView.f31126r5 == 3 && (wfVar = chatActivityEnterView.Z2) != null) {
                    wfVar.m1();
                    return;
                }
                return;
            case 5:
                if (chatActivityEnterView.S0.getVisibility() == 0 && chatActivityEnterView.S0.getAlpha() == 1.0f && !chatActivityEnterView.f31084k3) {
                    if (!chatActivityEnterView.f31168z2 || (xeVar = chatActivityEnterView.E0) == null || !xeVar.isFocused()) {
                        if (chatActivityEnterView.f31169z3) {
                            if (chatActivityEnterView.R1 != 0) {
                                z9 = true;
                                chatActivityEnterView.m1(0, true);
                                chatActivityEnterView.U0.t(true);
                                chatActivityEnterView.U0.A();
                                if (chatActivityEnterView.f31164y3) {
                                    chatActivityEnterView.E(true);
                                }
                            } else {
                                if (!chatActivityEnterView.E3 && (mfVar = chatActivityEnterView.U0) != null) {
                                    mfVar.O(false);
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
                            chatActivityEnterView.n1(chatActivityEnterView.f31169z3 ^ z9, z9, false, z9);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnimatorSet animatorSet2 = chatActivityEnterView.f31135t2;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    ki0 ki0Var = chatActivityEnterView.f31065h1;
                    if (ki0Var != null) {
                        ki0Var.setPlaying(false);
                    }
                    if (chatActivityEnterView.f31048e3 != null) {
                        CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                        wf wfVar3 = chatActivityEnterView.Z2;
                        if (chatActivityEnterView.O) {
                            i7 = Integer.MAX_VALUE;
                        } else {
                            i7 = 0;
                        }
                        wfVar3.Z1(2, 0, i7, chatActivityEnterView.S4, 0L, true);
                        ge geVar = chatActivityEnterView.J0;
                        chatActivityEnterView.S4 = 0L;
                        geVar.setEffect(0L);
                    } else {
                        org.telegram.messenger.ij ijVar = MediaController.B().f21295u0;
                        if (ijVar != null && ijVar == chatActivityEnterView.f31041d3) {
                            MediaController.B().q(true, true, false, false);
                        }
                    }
                    if (chatActivityEnterView.f31036c3 != null) {
                        if (org.telegram.messenger.r2.f25212a) {
                            org.telegram.ui.Cells.f1.u(chatActivityEnterView.f31036c3, new StringBuilder("delete file "));
                        }
                        new File(chatActivityEnterView.f31036c3).delete();
                    }
                    MediaController.B().n(true);
                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
                    if (cnVar2 != null && cnVar2.f44652v4) {
                        j3 = cnVar2.b();
                    } else {
                        j3 = 0;
                    }
                    b02.B1(j10, j3, null);
                    MediaController.B().B0(0, 0, false, false);
                    chatActivityEnterView.f31071i1 = 0L;
                    chatActivityEnterView.m0(false);
                    chatActivityEnterView.E(true);
                    return;
                }
                return;
            case 7:
                hi.y yVar = chatActivityEnterView.f31087l0;
                boolean z14 = yVar.f15044w;
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
                        org.telegram.messenger.g0.i3(new ad(chatActivityEnterView, 14), 275L);
                        chatActivityEnterView.k0(false);
                        return;
                    }
                    return;
                } else if (!z14) {
                    if (chatActivityEnterView.m0 == null) {
                        ve veVar = new ve(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.m0 = veVar;
                        bi.q1 q1Var = veVar.f14967c;
                        chatActivityEnterView.getContext();
                        q1Var.setLayoutManager(new v4.b0());
                        bi.q1 q1Var2 = chatActivityEnterView.m0.f14967c;
                        ?? g0Var = new v4.g0();
                        g0Var.f15026c = new ArrayList();
                        g0Var.d = new ArrayList();
                        g0Var.f15027e = new ArrayList();
                        chatActivityEnterView.f31098n0 = g0Var;
                        q1Var2.setAdapter(g0Var);
                        chatActivityEnterView.m0.f14967c.setOnItemClickListener(new we(chatActivityEnterView));
                        chatActivityEnterView.m0.f14967c.setOnItemLongClickListener(new me(chatActivityEnterView));
                        chatActivityEnterView.m0.setClipToPadding(false);
                        chatActivityEnterView.f31092m1.addView(chatActivityEnterView.m0, c8.ha.e(-1, -1, 80));
                        chatActivityEnterView.m0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.f31031b5;
                        if (hVar != null) {
                            chatActivityEnterView.f31098n0.E(hVar);
                        }
                        chatActivityEnterView.E1();
                    }
                    ve veVar2 = chatActivityEnterView.m0;
                    if (veVar2.getVisibility() != 0) {
                        veVar2.setVisibility(0);
                        veVar2.f14967c.v0(0);
                        veVar2.f14970n = true;
                        veVar2.f14969f = false;
                        return;
                    } else if (veVar2.f14969f) {
                        veVar2.f14969f = false;
                        veVar2.a();
                        veVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    ve veVar3 = chatActivityEnterView.m0;
                    if (veVar3 != null) {
                        veVar3.c();
                        return;
                    }
                    return;
                }
            case 8:
                wf wfVar4 = chatActivityEnterView.Z2;
                if (wfVar4 != null && !wfVar4.c()) {
                    wf wfVar5 = chatActivityEnterView.Z2;
                    eg egVar = chatActivityEnterView.F0;
                    wfVar5.i1(egVar, ((org.telegram.ui.ActionBar.l5) egVar.f33380c).getText(), true);
                    return;
                }
                return;
            case 9:
                SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24774e7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView.P2.f44592q8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + cnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + cnVar.a(), false);
                }
                if (org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24922v7 && org.telegram.messenger.qp.s1(chatActivityEnterView.Q).f24932w7) {
                    edit.putBoolean("show_gift_for_" + cnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).b2(org.telegram.messenger.p10.i(chatActivityEnterView.Q).e());
                if ((chatActivityEnterView.getParentFragment().f44592q8 == null || !chatActivityEnterView.getParentFragment().f44592q8.display_gifts_button) && (b22 == null || !b22.display_gifts_button)) {
                    org.telegram.messenger.g0.X3(chatActivityEnterView.K1, false);
                }
                TLRPC.User j11 = chatActivityEnterView.getParentFragment().j();
                if (j11 != null) {
                    if (chatActivityEnterView.getParentFragment().f44592q8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().f44592q8.birthday)) {
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
                te teVar = chatActivityEnterView.N0;
                if (teVar != null && teVar.isShowing()) {
                    chatActivityEnterView.N0.dismiss();
                }
                v4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new zd(chatActivityEnterView, 1), chatActivityEnterView.W3);
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView2 = this.f32643b;
                te teVar2 = chatActivityEnterView2.N0;
                if (teVar2 != null && teVar2.isShowing()) {
                    chatActivityEnterView2.N0.dismiss();
                }
                chatActivityEnterView2.T0(true, 2147483646, 0, 0L, true);
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView3 = this.f32643b;
                te teVar3 = chatActivityEnterView3.N0;
                if (teVar3 != null && teVar3.isShowing()) {
                    chatActivityEnterView3.N0.dismiss();
                }
                chatActivityEnterView3.T0(false, 0, 0, 0L, true);
                return;
            case 14:
                org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
                wd wdVar = chatActivityEnterView.Q0;
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.U;
                if (i1Var == null || !i1Var.f27524f) {
                    if (wdVar.f35009x) {
                        l60 l60Var = chatActivityEnterView.Y4;
                        if (l60Var != null) {
                            l60Var.u();
                            chatActivityEnterView.Y4 = null;
                            return;
                        }
                        xe xeVar3 = chatActivityEnterView.E0;
                        if (xeVar3 != null && cnVar3 != null) {
                            xeVar3.m();
                            tt0 tt0Var2 = chatActivityEnterView.f31092m1;
                            if (tt0Var2 != null) {
                                tt0Var = tt0Var2;
                            } else {
                                tt0Var = chatActivityEnterView;
                            }
                            l60 l60Var2 = new l60(tt0Var, chatActivityEnterView.W3, wdVar, false, false, true);
                            l60Var2.X = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.cn.B8(new i90(l60Var2, chatActivityEnterView.E0), cnVar3.h, true, true, true, true);
                            l60Var2.U = true;
                            l60Var2.f35612p = new f(7, chatActivityEnterView, l60Var2);
                            chatActivityEnterView.Y4 = l60Var2;
                            l60Var2.Z();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.A0) {
                        chatActivityEnterView.u1();
                        return;
                    } else if (chatActivityEnterView.s0() && chatActivityEnterView.f31054f2 == 0) {
                        if (chatActivityEnterView.R1 != 0) {
                            chatActivityEnterView.m1(0, true);
                            mf mfVar2 = chatActivityEnterView.U0;
                            if (mfVar2 != null) {
                                mfVar2.t(false);
                            }
                            xe xeVar4 = chatActivityEnterView.E0;
                            if (xeVar4 != null) {
                                xeVar4.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f31169z3) {
                            chatActivityEnterView.n1(false, true, false, true);
                            chatActivityEnterView.f31089l3 = true;
                            org.telegram.messenger.g0.i3(new ad(chatActivityEnterView, 23), 200L);
                            return;
                        }
                        chatActivityEnterView.I0();
                        return;
                    } else {
                        chatActivityEnterView.t1(1, 0, true, true);
                        mf mfVar3 = chatActivityEnterView.U0;
                        xe xeVar5 = chatActivityEnterView.E0;
                        if (xeVar5 != null && xeVar5.length() > 0) {
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
                                mfVar3.C(z11, z12);
                                return;
                            }
                        }
                        z12 = false;
                        mfVar3.C(z11, z12);
                        return;
                    }
                }
                return;
            case 15:
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.U0.t(false);
                    xe xeVar6 = chatActivityEnterView.E0;
                    if (xeVar6 != null) {
                        xeVar6.requestFocus();
                    }
                }
                if (chatActivityEnterView.f31099n2 != null) {
                    if (chatActivityEnterView.s0()) {
                        r10 = 1;
                        if (chatActivityEnterView.f31054f2 == 1) {
                            if (chatActivityEnterView.s0() && chatActivityEnterView.f31054f2 == 1) {
                                chatActivityEnterView.t1(0, 1, true, false);
                            }
                        }
                    } else {
                        r10 = 1;
                    }
                    chatActivityEnterView.t1(r10, r10, r10, r10);
                } else if (chatActivityEnterView.f31110p2) {
                    chatActivityEnterView.setFieldText("/");
                    xe xeVar7 = chatActivityEnterView.E0;
                    if (xeVar7 != null) {
                        xeVar7.requestFocus();
                    }
                    chatActivityEnterView.H0();
                }
                if (chatActivityEnterView.f31169z3) {
                    chatActivityEnterView.n1(false, false, false, true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView4 = this.f32643b;
                org.telegram.ui.cn cnVar4 = chatActivityEnterView4.P2;
                if (!chatActivityEnterView4.f31113p5 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.s0()) {
                    chatActivityEnterView4.f31121r0 = new rd(chatActivityEnterView4, 4);
                    if (chatActivityEnterView4.f31113p5) {
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
                        chatActivityEnterView4.f31138u0 = new ad(chatActivityEnterView4, 0);
                        chatActivityEnterView4.L();
                        return;
                    }
                }
                if (chatActivityEnterView4.Z2.I() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    ne neVar = chatActivityEnterView4.f31114q0;
                    if (neVar != null) {
                        neVar.f27487e = false;
                        neVar.l(new r1.g[0]);
                        return;
                    }
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView4.Q);
                    if (chatActivityEnterView4.f31113p5) {
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
                    if (chatActivityEnterView4.f31113p5) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        cnVar4.getParentLayout().getOverlayContainerView();
                    }
                    ne neVar2 = new ne(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.P2, s12, V, peer4, chatActivityEnterView4.Z2.I(), new a3.h(chatActivityEnterView4, peer2, s12, 21), chatActivityEnterView4.W3);
                    chatActivityEnterView4.f31114q0 = neVar2;
                    neVar2.f27487e = true;
                    neVar2.f27486c = 220;
                    neVar2.setOutsideTouchable(true);
                    chatActivityEnterView4.f31114q0.setClippingEnabled(true);
                    chatActivityEnterView4.f31114q0.setFocusable(true);
                    chatActivityEnterView4.f31114q0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.f31114q0.setInputMethodMode(2);
                    chatActivityEnterView4.f31114q0.setSoftInputMode(0);
                    chatActivityEnterView4.f31114q0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.f31114q0.f27485b = false;
                    int i18 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && cnVar4 != null) {
                        cnVar4.getFragmentView().getLocationInWindow(iArr);
                        i10 = iArr[0] + i18;
                    } else {
                        i10 = i18;
                    }
                    int S02 = chatActivityEnterView4.Z2.S0();
                    int measuredHeight = chatActivityEnterView4.f31114q0.getContentView().getMeasuredHeight();
                    int l11 = chatActivityEnterView4.Z2.l();
                    float f11 = f10;
                    if (l11 <= org.telegram.messenger.g0.L(20.0f)) {
                        S02 += l11;
                    }
                    if (chatActivityEnterView4.W0) {
                        S02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    org.telegram.messenger.g0.L(f11);
                    int i19 = (i18 * 2) + S02;
                    if (cnVar4 != null && cnVar4.isInBubbleMode()) {
                        i11 = 0;
                    } else {
                        i11 = org.telegram.messenger.g0.f22557m;
                    }
                    if (measuredHeight < (i19 - i11) - chatActivityEnterView4.f31114q0.f32717p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i18) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (cnVar4 != null && cnVar4.isInBubbleMode()) {
                            i12 = 0;
                        } else {
                            i12 = org.telegram.messenger.g0.f22557m;
                        }
                        chatActivityEnterView4.f31114q0.f32716o.getLayoutParams().height = ((S02 - i12) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    ne neVar3 = chatActivityEnterView4.f31114q0;
                    View view2 = neVar3.f32722u;
                    qj0 qj0Var = neVar3.v;
                    TLRPC.Peer peer5 = neVar3.f32719r;
                    wm0 wm0Var = neVar3.f32716o;
                    bi.e5 e5Var2 = neVar3.f32721t;
                    ArrayList arrayList2 = neVar3.f32726z;
                    int i20 = 1;
                    int size = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList2.get(i21);
                        i21++;
                        ((r1.g) obj).d();
                    }
                    arrayList2.clear();
                    e5Var2.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    e5Var2.setPivotY(e5Var2.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    wm0Var.setPivotX(0.0f);
                    wm0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = neVar3.f32720s.peers;
                    if (peer5 != null) {
                        int L = org.telegram.messenger.g0.L(54.0f);
                        int size2 = arrayList3.size() * L;
                        i13 = 2;
                        int i22 = 0;
                        while (i22 < arrayList3.size()) {
                            TLRPC.Peer peer6 = arrayList3.get(i22).peer;
                            qj0 qj0Var2 = qj0Var;
                            bi.e5 e5Var3 = e5Var2;
                            long j12 = peer6.channel_id;
                            if (j12 == 0 || j12 != peer5.channel_id) {
                                long j13 = peer6.user_id;
                                if (j13 == 0 || j13 != peer5.user_id) {
                                    long j14 = peer6.chat_id;
                                    if (j14 == 0 || j14 != peer5.chat_id) {
                                        i22++;
                                        e5Var2 = e5Var3;
                                        qj0Var = qj0Var2;
                                        f11 = 1.0f;
                                    }
                                }
                            }
                            if (i22 != arrayList3.size() - 1 && qj0Var2.getMeasuredHeight() < size2) {
                                i14 = qj0Var2.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            neVar3.f32723w.h1(i22, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (qj0Var2.computeVerticalScrollOffset() > 0) {
                                view2.animate().cancel();
                                e5Var = e5Var3;
                                view2.animate().alpha(f11).setDuration(150L).start();
                            } else {
                                e5Var = e5Var3;
                            }
                        }
                        e5Var = e5Var2;
                    } else {
                        e5Var = e5Var2;
                        i13 = 2;
                    }
                    e5Var.setScaleX(0.25f);
                    e5Var.setScaleY(0.25f);
                    wm0Var.setAlpha(0.25f);
                    r1.g gVar = new r1.g(e5Var, r1.g.f54265q);
                    gVar.f54280m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    gVar.b(new tm0(neVar3, i13));
                    r1.g gVar2 = new r1.g(e5Var, r1.g.f54266r);
                    gVar2.f54280m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    gVar2.b(new tm0(neVar3, 3));
                    r1.b bVar = r1.g.v;
                    r1.g gVar3 = new r1.g(e5Var, bVar);
                    gVar3.f54280m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    r1.g gVar4 = new r1.g(wm0Var, bVar);
                    gVar4.f54280m = org.telegram.ui.Cells.f1.o(1.0f, 750.0f, 1.0f);
                    for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList2.add(gVar5);
                        gVar5.a(new um0(neVar3, gVar5, i20));
                        gVar5.h();
                        i20 = 1;
                    }
                    ne neVar4 = chatActivityEnterView4.f31114q0;
                    chatActivityEnterView4.f31128s0 = i10;
                    chatActivityEnterView4.f31133t0 = i12;
                    neVar4.showAtLocation(view, 51, i10, i12);
                    chatActivityEnterView4.f31108p0.setProgress(1.0f);
                    return;
                }
                return;
            case 17:
                int i23 = ChatActivityEnterView.s5;
                chatActivityEnterView.a0();
                return;
            case 18:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.U;
                if ((i1Var2 == null || !i1Var2.f27524f) && chatActivityEnterView.F != 0.0f) {
                    chatActivityEnterView.Z2.l2();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.U;
                if ((i1Var3 == null || !i1Var3.f27524f) && chatActivityEnterView.F != 0.0f) {
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
