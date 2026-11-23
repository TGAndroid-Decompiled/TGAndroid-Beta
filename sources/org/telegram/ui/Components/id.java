package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class id implements View.OnClickListener {
    public final int f35989a;
    public final ChatActivityEnterView f35990b;

    public id(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35989a = i7;
        this.f35990b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        eg egVar;
        hf hfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        zi0 zi0Var;
        qh0 qh0Var;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i15;
        int i16;
        int i17;
        float f14;
        mg mgVar;
        org.telegram.ui.bn bnVar;
        boolean z11;
        ?? r52;
        ChatActivityEnterView chatActivityEnterView;
        float f15;
        int i18 = this.f35989a;
        TLRPC.Peer peer2 = null;
        int i19 = 0;
        r8 = false;
        boolean z12 = false;
        r8 = false;
        boolean z13 = false;
        ChatActivityEnterView chatActivityEnterView2 = this.f35990b;
        switch (i18) {
            case 0:
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView2.V;
                if ((i1Var == null || !i1Var.f29071f) && chatActivityEnterView2.G != 0.0f) {
                    chatActivityEnterView2.P3.n1();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView2.V;
                if ((i1Var2 == null || !i1Var2.f29071f) && chatActivityEnterView2.G != 0.0f) {
                    chatActivityEnterView2.P3.v2();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.f35990b;
                org.telegram.ui.bn bnVar2 = chatActivityEnterView3.F3;
                if (!chatActivityEnterView3.f32759p7 ? chatActivityEnterView3.getTranslationY() != 0.0f : chatActivityEnterView3.T0()) {
                    chatActivityEnterView3.f32778s0 = new dd(chatActivityEnterView3, 6);
                    if (chatActivityEnterView3.f32759p7) {
                        chatActivityEnterView3.M0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView3.M0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView3.P3.n() > org.telegram.messenger.g0.L(20.0f)) {
                    int X0 = chatActivityEnterView3.P3.X0();
                    int n10 = chatActivityEnterView3.P3.n();
                    if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                        X0 += n10;
                    }
                    if (chatActivityEnterView3.X0) {
                        X0 -= chatActivityEnterView3.getEmojiPadding();
                    }
                    if (X0 < org.telegram.messenger.g0.L(200.0f)) {
                        chatActivityEnterView3.f32797v0 = new dd(chatActivityEnterView3, 7);
                        chatActivityEnterView3.U();
                        return;
                    }
                }
                if (chatActivityEnterView3.P3.H() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ye yeVar = chatActivityEnterView3.f32769r0;
                    if (yeVar != null) {
                        yeVar.f29036e = false;
                        yeVar.l(new r1.g[0]);
                        return;
                    }
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView3.R);
                    if (chatActivityEnterView3.f32759p7) {
                        peer = chatActivityEnterView3.P3.o();
                    } else {
                        org.telegram.messenger.mp.u1(chatActivityEnterView3.R).O0(Long.valueOf(-chatActivityEnterView3.G3));
                        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(chatActivityEnterView3.R).P0(-chatActivityEnterView3.G3);
                        if (P0 != null) {
                            peer2 = P0.default_send_as;
                        }
                        peer = peer2;
                        peer2 = P0;
                    }
                    if (peer == null && chatActivityEnterView3.P3.H() != null && !chatActivityEnterView3.P3.H().peers.isEmpty()) {
                        peer = chatActivityEnterView3.P3.H().peers.get(0).peer;
                    }
                    TLRPC.Peer peer3 = peer;
                    boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView3.G3)));
                    if (chatActivityEnterView3.f32759p7) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView3.getParent();
                    } else {
                        bnVar2.getParentLayout().getOverlayContainerView();
                    }
                    ye yeVar2 = new ye(chatActivityEnterView3, chatActivityEnterView3.getContext(), chatActivityEnterView3.F3, u12, V, peer3, chatActivityEnterView3.P3.H(), new a3.h(chatActivityEnterView3, peer2, u12, 24), chatActivityEnterView3.M4);
                    chatActivityEnterView3.f32769r0 = yeVar2;
                    yeVar2.f29036e = true;
                    yeVar2.f29035c = 220;
                    yeVar2.setOutsideTouchable(true);
                    chatActivityEnterView3.f32769r0.setClippingEnabled(true);
                    chatActivityEnterView3.f32769r0.setFocusable(true);
                    chatActivityEnterView3.f32769r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView3.f32769r0.setInputMethodMode(2);
                    chatActivityEnterView3.f32769r0.setSoftInputMode(0);
                    chatActivityEnterView3.f32769r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView3.f32769r0.f29034b = false;
                    int i20 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && bnVar2 != null) {
                        bnVar2.getFragmentView().getLocationInWindow(iArr);
                        i7 = iArr[0] + i20;
                    } else {
                        i7 = i20;
                    }
                    int X02 = chatActivityEnterView3.P3.X0();
                    int measuredHeight = chatActivityEnterView3.f32769r0.getContentView().getMeasuredHeight();
                    int n11 = chatActivityEnterView3.P3.n();
                    if (n11 <= org.telegram.messenger.g0.L(20.0f)) {
                        X02 += n11;
                    }
                    if (chatActivityEnterView3.X0) {
                        X02 -= chatActivityEnterView3.getEmojiPadding();
                    }
                    org.telegram.messenger.g0.L(1.0f);
                    int i21 = (i20 * 2) + X02;
                    if (bnVar2 != null && bnVar2.isInBubbleMode()) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.f24220m;
                    }
                    if (measuredHeight < (i21 - i10) - chatActivityEnterView3.f32769r0.f38516p.getMeasuredHeight()) {
                        chatActivityEnterView3.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i20) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (bnVar2 != null && bnVar2.isInBubbleMode()) {
                            i11 = 0;
                        } else {
                            i11 = org.telegram.messenger.g0.f24220m;
                        }
                        chatActivityEnterView3.f32769r0.f38515o.getLayoutParams().height = ((X02 - i11) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView3.getHeightWithTopView();
                        i12 = i11;
                    }
                    ye yeVar3 = chatActivityEnterView3.f32769r0;
                    View view2 = yeVar3.f38521u;
                    ek0 ek0Var = yeVar3.v;
                    TLRPC.Peer peer4 = yeVar3.f38518r;
                    jn0 jn0Var = yeVar3.f38515o;
                    bi.g3 g3Var = yeVar3.f38520t;
                    ArrayList arrayList = yeVar3.f38525z;
                    int size = arrayList.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList.get(i22);
                        i22++;
                        ((r1.g) obj).d();
                    }
                    arrayList.clear();
                    g3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    g3Var.setPivotY(g3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    jn0Var.setPivotX(0.0f);
                    jn0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = yeVar3.f38519s.peers;
                    if (peer4 != null) {
                        int L = org.telegram.messenger.g0.L(54.0f);
                        int size2 = arrayList2.size() * L;
                        i13 = 2;
                        int i23 = 0;
                        while (i23 < arrayList2.size()) {
                            TLRPC.Peer peer5 = arrayList2.get(i23).peer;
                            View view3 = view2;
                            ek0 ek0Var2 = ek0Var;
                            long j3 = peer5.channel_id;
                            if (j3 == 0 || j3 != peer4.channel_id) {
                                long j10 = peer5.user_id;
                                if (j10 == 0 || j10 != peer4.user_id) {
                                    long j11 = peer5.chat_id;
                                    if (j11 == 0 || j11 != peer4.chat_id) {
                                        i23++;
                                        view2 = view3;
                                        ek0Var = ek0Var2;
                                    }
                                }
                            }
                            if (i23 != arrayList2.size() - 1 && ek0Var2.getMeasuredHeight() < size2) {
                                i14 = ek0Var2.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            yeVar3.f38522w.h1(i23, (size2 - ((arrayList2.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (ek0Var2.computeVerticalScrollOffset() > 0) {
                                view3.animate().cancel();
                                view3.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else {
                        i13 = 2;
                    }
                    g3Var.setScaleX(0.25f);
                    g3Var.setScaleY(0.25f);
                    jn0Var.setAlpha(0.25f);
                    r1.g gVar = new r1.g(g3Var, r1.g.f56431q);
                    gVar.f56446m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar.b(new gn0(yeVar3, i13));
                    r1.g gVar2 = new r1.g(g3Var, r1.g.f56432r);
                    gVar2.f56446m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar2.b(new gn0(yeVar3, 3));
                    r1.b bVar = r1.g.v;
                    r1.g gVar3 = new r1.g(g3Var, bVar);
                    gVar3.f56446m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    r1.g gVar4 = new r1.g(jn0Var, bVar);
                    gVar4.f56446m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList.add(gVar5);
                        gVar5.a(new hn0(yeVar3, gVar5, 1));
                        gVar5.h();
                    }
                    ye yeVar4 = chatActivityEnterView3.f32769r0;
                    chatActivityEnterView3.f32784t0 = i7;
                    chatActivityEnterView3.f32790u0 = i12;
                    yeVar4.showAtLocation(view, 51, i7, i12);
                    chatActivityEnterView3.f32760q0.setProgress(1.0f);
                    return;
                }
                return;
            case 3:
                int i24 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView2.l1();
                return;
            case 4:
                hf hfVar2 = chatActivityEnterView2.F0;
                if (hfVar2 == null) {
                    str = "";
                } else {
                    str = hfVar2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView2.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView2.setFieldText("");
                    return;
                }
            case 5:
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView2.M0;
                if (dg0Var == null || dg0Var.f47118u0) {
                    AnimatorSet animatorSet = chatActivityEnterView2.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView2.f32686g0 == null) {
                        chatActivityEnterView2.w1();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                mg mgVar2 = chatActivityEnterView2.P3;
                if (mgVar2 != null) {
                    mgVar2.z0();
                    return;
                }
                return;
            case 7:
                int i25 = ChatActivityEnterView.f32633s7;
                if (chatActivityEnterView2.R2 != null) {
                    if (chatActivityEnterView2.f32661d0 - chatActivityEnterView2.f32669e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView2.f32653c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView2.f32653c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    ig C = chatActivityEnterView2.C();
                    chatActivityEnterView2.S2 = C;
                    kg.z d = kg.z.d(chatActivityEnterView2.R);
                    String str2 = chatActivityEnterView2.R2.link;
                    String str3 = C.f35998a;
                    ArrayList<TLRPC.MessageEntity> arrayList3 = C.f35999b;
                    dd ddVar = new dd(chatActivityEnterView2, 29);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList3;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, ddVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (chatActivityEnterView2.T0.getVisibility() == 0 && chatActivityEnterView2.T0.getAlpha() == 1.0f && !chatActivityEnterView2.f32639a4) {
                    if (!chatActivityEnterView2.f32755p3 || (hfVar = chatActivityEnterView2.F0) == null || !hfVar.isFocused()) {
                        if (chatActivityEnterView2.f32756p4) {
                            if (chatActivityEnterView2.H2 != 0) {
                                chatActivityEnterView2.R1(0, true);
                                chatActivityEnterView2.V0.t(true);
                                chatActivityEnterView2.V0.A();
                                if (chatActivityEnterView2.o4) {
                                    chatActivityEnterView2.P(true);
                                }
                            } else if (!chatActivityEnterView2.f32794u4 && (egVar = chatActivityEnterView2.V0) != null) {
                                egVar.P(false);
                            }
                        } else if (!chatActivityEnterView2.f32794u4) {
                            chatActivityEnterView2.V0.P(true);
                        }
                        if (!chatActivityEnterView2.f32794u4) {
                            chatActivityEnterView2.S1(!chatActivityEnterView2.f32756p4, true, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                int i26 = ChatActivityEnterView.f32633s7;
                if (chatActivityEnterView2.i0() && chatActivityEnterView2.f32800v3 && (recordCircle = chatActivityEnterView2.D2) != null && ChatActivityEnterView.this.f32706i5) {
                    chatActivityEnterView2.n0(false, false);
                    ai.l0 l0Var = chatActivityEnterView2.f32709j1;
                    if (l0Var != null && l0Var.n()) {
                        ai.l0 l0Var2 = chatActivityEnterView2.f32709j1;
                        if (l0Var2.f1347o0 && l0Var2.n()) {
                            l0Var2.q();
                        }
                    } else {
                        ai.l0 l0Var3 = chatActivityEnterView2.f32709j1;
                        if (l0Var3 != null && l0Var3.m()) {
                            hf hfVar3 = chatActivityEnterView2.F0;
                            if (hfVar3 != null) {
                                hfVar3.setText("");
                            }
                            chatActivityEnterView2.f32709j1.j();
                        }
                    }
                    if (chatActivityEnterView2.f32800v3) {
                        chatActivityEnterView2.f32800v3 = false;
                        chatActivityEnterView2.Y1 = 0L;
                        chatActivityEnterView2.u2(2, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView2.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView2.S1;
                    int[] iArr3 = chatActivityEnterView2.R1;
                    if (chatActivityEnterView2.K1 && !chatActivityEnterView2.U1 && (zi0Var = chatActivityEnterView2.f32702i1) != null && chatActivityEnterView2.R3 != null && zi0Var.getVisibility() == 0 && chatActivityEnterView2.f32702i1.getWidth() > 0 && (qh0Var = chatActivityEnterView2.f32695h1) != null) {
                        if (chatActivityEnterView2.f32702i1.T0 == null) {
                            qh0Var.getLocationInWindow(iArr3);
                            chatActivityEnterView2.f32702i1.getLocationInWindow(iArr2);
                            float width = (chatActivityEnterView2.f32695h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                            float height = ((chatActivityEnterView2.f32695h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                            TLRPC.TL_document tL_document = chatActivityEnterView2.R3;
                            chatActivityEnterView2.f32833z5 = null;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.ah(28, chatActivityEnterView2, tL_document), 100L);
                            try {
                                chatActivityEnterView2.f32695h1.performHapticFeedback(3, 2);
                            } catch (Exception unused3) {
                            }
                            qg qgVar = chatActivityEnterView2.E2;
                            if (qgVar != null) {
                                qgVar.invalidate();
                            }
                            chatActivityEnterView2.E5 = 0.0f;
                            chatActivityEnterView2.D5 = 0.0f;
                            ValueAnimator valueAnimator = chatActivityEnterView2.C5;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            chatActivityEnterView2.C5 = ofFloat;
                            ofFloat.setDuration(160L);
                            chatActivityEnterView2.C5.setInterpolator(kr.f36859g);
                            chatActivityEnterView2.C5.addUpdateListener(new pd(chatActivityEnterView2, 9));
                            chatActivityEnterView2.C5.start();
                            zi0 zi0Var2 = chatActivityEnterView2.f32702i1;
                            we weVar = new we(chatActivityEnterView2);
                            xu0 xu0Var = zi0Var2.J0;
                            RectF rectF = zi0Var2.f42881f0;
                            if (zi0Var2.T0 == null && !zi0Var2.X0) {
                                int width2 = zi0Var2.getWidth();
                                int height2 = zi0Var2.getHeight();
                                if (zi0Var2.f42875d0 && width2 > 0 && height2 > 0) {
                                    zi0Var2.setPlaying(false);
                                    zi0Var2.f42893p0 = false;
                                    zi0Var2.W = false;
                                    try {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                        float f16 = width2;
                                        rectF.set(0.0f, 0.0f, f16, height2);
                                        zi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                        int[] iArr4 = new int[width2 * height2];
                                        createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                        int i27 = width2;
                                        int i28 = height2;
                                        zi0Var2.f42868a1 = zi0Var2.f();
                                        if (width < f16 / 2.0f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zi0Var2.Z0 = z10;
                                        int max = Math.max(1, Math.round(org.telegram.messenger.g0.f24225p * 0.75f));
                                        int i29 = 0;
                                        int i30 = 0;
                                        int i31 = 0;
                                        while (i29 < i28) {
                                            while (i19 < i27) {
                                                int i32 = iArr4[(i29 * i27) + i19];
                                                int i33 = i19;
                                                int i34 = i29;
                                                if ((i32 >>> 24) > 60) {
                                                    if (zi0Var2.e(i32)) {
                                                        i30++;
                                                    } else {
                                                        i31++;
                                                    }
                                                }
                                                i19 = i33 + max;
                                                i29 = i34;
                                            }
                                            i29 += max;
                                            i19 = 0;
                                        }
                                        if (i30 > 1100) {
                                            f10 = 1100.0f / i30;
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        if (i31 > 0) {
                                            f11 = Math.min(1.0f, 360.0f / i31);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        xu0Var.a();
                                        xu0Var.S = 0.0f;
                                        xu0Var.R = 0.0f;
                                        xu0Var.e(zi0Var2.f42868a1);
                                        float f17 = org.telegram.messenger.g0.f24225p;
                                        int i35 = 0;
                                        int i36 = 0;
                                        int i37 = 0;
                                        while (i35 < i28) {
                                            float f18 = f10;
                                            int i38 = 0;
                                            while (i38 < i27) {
                                                int i39 = i27;
                                                int i40 = iArr4[(i35 * i27) + i38];
                                                float f19 = f11;
                                                int i41 = i28;
                                                if ((i40 >>> 24) > 60) {
                                                    i37++;
                                                    int i42 = i37 * 7;
                                                    float c11 = zi0.c(i42 + 3);
                                                    if (zi0Var2.e(i40)) {
                                                        f12 = f18;
                                                    } else {
                                                        f12 = f19;
                                                    }
                                                    if (c11 <= f12) {
                                                        if (zi0Var2.Z0) {
                                                            f13 = i38 / f16;
                                                        } else {
                                                            f13 = 1.0f - (i38 / f16);
                                                        }
                                                        float c12 = zi0.c(i42 + 13) * 0.04f;
                                                        float c13 = zi0.c(i42 + 11);
                                                        float f20 = i38;
                                                        i15 = i38;
                                                        float f21 = c13 - 0.5f;
                                                        float f22 = max;
                                                        i16 = max;
                                                        float f23 = (f21 * f22) + f20;
                                                        float c14 = zi0.c(i42 + 12) - 0.5f;
                                                        i17 = i35;
                                                        float f24 = (c14 * f22) + i35;
                                                        f14 = f16;
                                                        zi0Var2.J0.i(f23, f24, org.telegram.ui.Cells.c0.g(c13, 0.25f, 0.25f, width - f23, f23), Math.min(f24, height) - (((zi0.c(i42 + 14) * 9.0f) + 3.0f) * f17), com.google.android.gms.internal.vision.e2.x(c14, 4.0f, f17, width), com.google.android.gms.internal.vision.e2.x(f21, 4.0f, f17, height), com.google.android.gms.internal.vision.e2.B(f13, 0.3f, 0.8f, (zi0.c(i42 + 15) * 0.2f) + 0.45f), ((c12 + (0.42f * f13)) * 760.0f) / 1000.0f);
                                                        i36++;
                                                        i38 = i15 + i16;
                                                        f16 = f14;
                                                        f11 = f19;
                                                        i27 = i39;
                                                        i35 = i17;
                                                        i28 = i41;
                                                        max = i16;
                                                    }
                                                }
                                                i15 = i38;
                                                i16 = max;
                                                i17 = i35;
                                                f14 = f16;
                                                i38 = i15 + i16;
                                                f16 = f14;
                                                f11 = f19;
                                                i27 = i39;
                                                i35 = i17;
                                                i28 = i41;
                                                max = i16;
                                            }
                                            i35 += max;
                                            f10 = f18;
                                        }
                                        zi0Var2.T0 = createBitmap;
                                        zi0Var2.U0 = i36;
                                        zi0Var2.W0 = weVar;
                                        zi0Var2.V0 = SystemClock.uptimeMillis();
                                        zi0Var2.invalidate();
                                        return;
                                    } catch (Throwable unused4) {
                                        weVar.a();
                                        return;
                                    }
                                }
                                weVar.a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    chatActivityEnterView2.t1();
                    return;
                }
                return;
            case 11:
                ki.y yVar = chatActivityEnterView2.m0;
                boolean z14 = yVar.f19158w;
                yVar.setOpened(!z14);
                try {
                    chatActivityEnterView2.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView2.H0()) {
                    if (!z14) {
                        if (!chatActivityEnterView2.X0 && !chatActivityEnterView2.Y0) {
                            chatActivityEnterView2.n1();
                            return;
                        }
                        org.telegram.messenger.g0.h3(new dd(chatActivityEnterView2, 27), 275L);
                        chatActivityEnterView2.L0(false);
                        return;
                    }
                    return;
                } else if (!z14) {
                    if (chatActivityEnterView2.f32738n0 == null) {
                        ff ffVar = new ff(chatActivityEnterView2, chatActivityEnterView2.getContext());
                        chatActivityEnterView2.f32738n0 = ffVar;
                        di.b1 b1Var = ffVar.f19061c;
                        chatActivityEnterView2.getContext();
                        b1Var.setLayoutManager(new v4.c0());
                        ?? r12 = chatActivityEnterView2.f32738n0.f19061c;
                        ?? i0Var = new v4.i0();
                        i0Var.f19130c = new ArrayList();
                        i0Var.d = new ArrayList();
                        i0Var.f19131e = new ArrayList();
                        chatActivityEnterView2.f32745o0 = i0Var;
                        r12.setAdapter(i0Var);
                        chatActivityEnterView2.f32738n0.f19061c.setOnItemClickListener(new gf(chatActivityEnterView2));
                        chatActivityEnterView2.f32738n0.f19061c.setOnItemLongClickListener(new we(chatActivityEnterView2));
                        chatActivityEnterView2.f32738n0.setClipToPadding(false);
                        chatActivityEnterView2.f32655c2.addView(chatActivityEnterView2.f32738n0, c8.na.e(-1, -1, 80));
                        chatActivityEnterView2.f32738n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView2.Y6;
                        if (hVar != null) {
                            chatActivityEnterView2.f32745o0.E(hVar);
                        }
                        chatActivityEnterView2.l2();
                    }
                    ff ffVar2 = chatActivityEnterView2.f32738n0;
                    if (ffVar2.getVisibility() != 0) {
                        ffVar2.setVisibility(0);
                        ffVar2.f19061c.v0(0);
                        ffVar2.f19064n = true;
                        ffVar2.f19063f = false;
                        return;
                    } else if (ffVar2.f19063f) {
                        ffVar2.f19063f = false;
                        ffVar2.a();
                        ffVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    ff ffVar3 = chatActivityEnterView2.f32738n0;
                    if (ffVar3 != null) {
                        ffVar3.c();
                        return;
                    }
                    return;
                }
            case 12:
                if (chatActivityEnterView2.f32776r7 == 3 && (mgVar = chatActivityEnterView2.P3) != null) {
                    mgVar.w1();
                    return;
                }
                return;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(chatActivityEnterView2.R).h7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView2.F3.f46362s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                if (org.telegram.messenger.mp.u1(chatActivityEnterView2.R).f25912y7 && org.telegram.messenger.mp.u1(chatActivityEnterView2.R).f25921z7) {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R).d2(org.telegram.messenger.i10.i(chatActivityEnterView2.R).e());
                if ((chatActivityEnterView2.getParentFragment().f46362s8 == null || !chatActivityEnterView2.getParentFragment().f46362s8.display_gifts_button) && (d2 == null || !d2.display_gifts_button)) {
                    org.telegram.messenger.g0.V3(chatActivityEnterView2.A2, false);
                }
                TLRPC.User j12 = chatActivityEnterView2.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView2.getParentFragment().f46362s8 != null && org.telegram.messenger.v1.e(chatActivityEnterView2.getParentFragment().f46362s8.birthday)) {
                        z13 = true;
                    }
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, chatActivityEnterView2.getContext(), null);
                    t1Var.r(200L);
                    t1Var.setOnCancelListener(new di.z(chatActivityEnterView2, wg.r.j(chatActivityEnterView2.R, null, new fi.w2(chatActivityEnterView2, t1Var, j12, z13)), 4));
                    return;
                }
                return;
            case 14:
                int i43 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView2.l1();
                return;
            case 15:
                mg mgVar3 = chatActivityEnterView2.P3;
                if (mgVar3 != null && !mgVar3.j()) {
                    ?? r13 = chatActivityEnterView2.P3;
                    ug ugVar = chatActivityEnterView2.G0;
                    r13.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.f40370c).getText(), true);
                    return;
                }
                return;
            case 16:
                df dfVar = chatActivityEnterView2.O0;
                if (dfVar != null && dfVar.isShowing()) {
                    chatActivityEnterView2.O0.dismiss();
                }
                b5.J(chatActivityEnterView2.E3, chatActivityEnterView2.F3.a(), new ke(chatActivityEnterView2, 2), chatActivityEnterView2.M4);
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView4 = this.f35990b;
                df dfVar2 = chatActivityEnterView4.O0;
                if (dfVar2 != null && dfVar2.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.x1(true, 2147483646, 0, 0L, true);
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView5 = this.f35990b;
                df dfVar3 = chatActivityEnterView5.O0;
                if (dfVar3 != null && dfVar3.isShowing()) {
                    chatActivityEnterView5.O0.dismiss();
                }
                chatActivityEnterView5.x1(false, 0, 0, 0L, true);
                return;
            case 19:
                if (chatActivityEnterView2.H2 != 0) {
                    chatActivityEnterView2.R1(0, false);
                    chatActivityEnterView2.V0.t(false);
                    hf hfVar4 = chatActivityEnterView2.F0;
                    if (hfVar4 != null) {
                        hfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView2.f32663d3 != null) {
                    if (chatActivityEnterView2.T0() && chatActivityEnterView2.V2 == 1) {
                        if (chatActivityEnterView2.T0() && chatActivityEnterView2.V2 == 1) {
                            chatActivityEnterView2.Z1(0, 1, true, false);
                        }
                    } else {
                        chatActivityEnterView2.Z1(1, 1, true, true);
                    }
                } else if (chatActivityEnterView2.f32681f3) {
                    chatActivityEnterView2.setFieldText("/");
                    hf hfVar5 = chatActivityEnterView2.F0;
                    if (hfVar5 != null) {
                        hfVar5.requestFocus();
                    }
                    chatActivityEnterView2.j1();
                }
                if (chatActivityEnterView2.f32756p4) {
                    chatActivityEnterView2.S1(false, false, false, true);
                    return;
                }
                return;
            case 20:
                int i44 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView2.u0();
                return;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView2.F3;
                ge geVar = chatActivityEnterView2.R0;
                if (chatActivityEnterView2.o0()) {
                    if (chatActivityEnterView2.D6 == null) {
                        chatActivityEnterView2.E6 = true;
                        if (chatActivityEnterView2.B0) {
                            f15 = 0.5f;
                        } else {
                            f15 = 1.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView2.D6 = ofFloat2;
                        ofFloat2.addUpdateListener(new org.telegram.ui.rf(chatActivityEnterView2, f15, 2));
                        chatActivityEnterView2.D6.addListener(new org.telegram.ui.ActionBar.s0(chatActivityEnterView2, f15, 5));
                        chatActivityEnterView2.D6.setDuration(180L);
                        chatActivityEnterView2.D6.setInterpolator(kr.f36860i);
                        chatActivityEnterView2.D6.start();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView2.V;
                if (i1Var3 == null || !i1Var3.f29071f) {
                    if (geVar.f42850x) {
                        x60 x60Var = chatActivityEnterView2.V6;
                        if (x60Var != null) {
                            x60Var.v();
                            chatActivityEnterView2.V6 = null;
                            return;
                        }
                        hf hfVar6 = chatActivityEnterView2.F0;
                        if (hfVar6 != null && bnVar3 != null) {
                            hfVar6.m();
                            ?? r32 = chatActivityEnterView2.f32655c2;
                            if (r32 != null) {
                                chatActivityEnterView = r32;
                            } else {
                                chatActivityEnterView = chatActivityEnterView2;
                            }
                            x60 x60Var2 = new x60(chatActivityEnterView, chatActivityEnterView2.M4, geVar, false, false, true);
                            x60Var2.f41860a0 = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.bn.C8(new t90(x60Var2, chatActivityEnterView2.F0), bnVar3.h, true, true, true, true);
                            x60Var2.X = true;
                            x60Var2.f41886p = new org.telegram.ui.ah(29, chatActivityEnterView2, x60Var2);
                            chatActivityEnterView2.V6 = x60Var2;
                            x60Var2.a0();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView2.B0) {
                        chatActivityEnterView2.a2();
                        return;
                    } else if (chatActivityEnterView2.T0() && chatActivityEnterView2.V2 == 0) {
                        if (chatActivityEnterView2.H2 != 0) {
                            chatActivityEnterView2.R1(0, true);
                            eg egVar2 = chatActivityEnterView2.V0;
                            if (egVar2 != null) {
                                egVar2.t(false);
                            }
                            hf hfVar7 = chatActivityEnterView2.F0;
                            if (hfVar7 != null) {
                                hfVar7.requestFocus();
                            }
                        }
                        if (chatActivityEnterView2.f32756p4) {
                            chatActivityEnterView2.S1(false, true, false, true);
                            chatActivityEnterView2.f32648b4 = true;
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView2, 28), 200L);
                            return;
                        }
                        chatActivityEnterView2.k1();
                        return;
                    } else {
                        chatActivityEnterView2.Z1(1, 0, true, true);
                        eg egVar3 = chatActivityEnterView2.V0;
                        hf hfVar8 = chatActivityEnterView2.F0;
                        if (hfVar8 != null && hfVar8.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bnVar3 != null) {
                            hi.u3 u3Var = bnVar3.N1;
                            if (u3Var != null) {
                                if (u3Var.W) {
                                    u3Var.f(true);
                                }
                                r52 = true;
                            } else {
                                r52 = false;
                            }
                            bnVar3.N1 = null;
                            if (r52 != false) {
                                z12 = true;
                            }
                        }
                        egVar3.C(z11, z12);
                        return;
                    }
                }
                return;
        }
    }
}
