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
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class id implements View.OnClickListener {
    public final int f36104a;
    public final ChatActivityEnterView f36105b;

    public id(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36104a = i7;
        this.f36105b = chatActivityEnterView;
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
        cg cgVar;
        gf gfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        xi0 xi0Var;
        ph0 ph0Var;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i15;
        int i16;
        int i17;
        float f14;
        kg kgVar;
        org.telegram.ui.bn bnVar;
        boolean z11;
        boolean z12;
        FrameLayout frameLayout;
        float f15;
        int i18 = this.f36104a;
        TLRPC.Peer peer2 = null;
        boolean z13 = false;
        ChatActivityEnterView chatActivityEnterView = this.f36105b;
        switch (i18) {
            case 0:
                org.telegram.ui.ActionBar.j1 j1Var = chatActivityEnterView.V;
                if ((j1Var == null || !j1Var.f29024f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.N3.n1();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.j1 j1Var2 = chatActivityEnterView.V;
                if ((j1Var2 == null || !j1Var2.f29024f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.N3.B2();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f36105b;
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.D3;
                if (!chatActivityEnterView2.f32627k7 ? chatActivityEnterView2.getTranslationY() != 0.0f : chatActivityEnterView2.O0()) {
                    chatActivityEnterView2.f32678s0 = new dd(chatActivityEnterView2, 6);
                    if (chatActivityEnterView2.f32627k7) {
                        chatActivityEnterView2.H0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView2.H0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView2.N3.n() > org.telegram.messenger.g0.L(20.0f)) {
                    int b12 = chatActivityEnterView2.N3.b1();
                    int n10 = chatActivityEnterView2.N3.n();
                    if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                        b12 += n10;
                    }
                    if (chatActivityEnterView2.X0) {
                        b12 -= chatActivityEnterView2.getEmojiPadding();
                    }
                    if (b12 < org.telegram.messenger.g0.L(200.0f)) {
                        chatActivityEnterView2.f32697v0 = new dd(chatActivityEnterView2, 7);
                        chatActivityEnterView2.U();
                        return;
                    }
                }
                if (chatActivityEnterView2.N3.J() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    xe xeVar = chatActivityEnterView2.f32670r0;
                    if (xeVar != null) {
                        xeVar.f28993e = false;
                        xeVar.l(new r1.g[0]);
                        return;
                    }
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R);
                    if (chatActivityEnterView2.f32627k7) {
                        peer = chatActivityEnterView2.N3.t();
                    } else {
                        org.telegram.messenger.mp.u1(chatActivityEnterView2.R).O0(Long.valueOf(-chatActivityEnterView2.E3));
                        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(chatActivityEnterView2.R).P0(-chatActivityEnterView2.E3);
                        if (P0 != null) {
                            peer2 = P0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = P0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView2.N3.J() != null && !chatActivityEnterView2.N3.J().peers.isEmpty()) {
                        peer = chatActivityEnterView2.N3.J().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView2.E3)));
                    if (chatActivityEnterView2.f32627k7) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView2.getParent();
                    } else {
                        bnVar2.getParentLayout().getOverlayContainerView();
                    }
                    xe xeVar2 = new xe(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.D3, u12, V, peer4, chatActivityEnterView2.N3.J(), new a3.h(chatActivityEnterView2, peer2, u12, 24), chatActivityEnterView2.K4);
                    chatActivityEnterView2.f32670r0 = xeVar2;
                    xeVar2.f28993e = true;
                    xeVar2.f28992c = 220;
                    xeVar2.setOutsideTouchable(true);
                    chatActivityEnterView2.f32670r0.setClippingEnabled(true);
                    chatActivityEnterView2.f32670r0.setFocusable(true);
                    chatActivityEnterView2.f32670r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView2.f32670r0.setInputMethodMode(2);
                    chatActivityEnterView2.f32670r0.setSoftInputMode(0);
                    chatActivityEnterView2.f32670r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView2.f32670r0.f28991b = false;
                    int i19 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && bnVar2 != null) {
                        bnVar2.getFragmentView().getLocationInWindow(iArr);
                        i7 = iArr[0] + i19;
                    } else {
                        i7 = i19;
                    }
                    int b13 = chatActivityEnterView2.N3.b1();
                    int measuredHeight = chatActivityEnterView2.f32670r0.getContentView().getMeasuredHeight();
                    int n11 = chatActivityEnterView2.N3.n();
                    if (n11 <= org.telegram.messenger.g0.L(20.0f)) {
                        b13 += n11;
                    }
                    if (chatActivityEnterView2.X0) {
                        b13 -= chatActivityEnterView2.getEmojiPadding();
                    }
                    org.telegram.messenger.g0.L(1.0f);
                    int i20 = (i19 * 2) + b13;
                    if (bnVar2 != null && bnVar2.isInBubbleMode()) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.f24115m;
                    }
                    if (measuredHeight < (i20 - i10) - chatActivityEnterView2.f32670r0.f38137p.getMeasuredHeight()) {
                        chatActivityEnterView2.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i19) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (bnVar2 != null && bnVar2.isInBubbleMode()) {
                            i11 = 0;
                        } else {
                            i11 = org.telegram.messenger.g0.f24115m;
                        }
                        chatActivityEnterView2.f32670r0.f38136o.getLayoutParams().height = ((b13 - i11) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                        i12 = i11;
                    }
                    xe xeVar3 = chatActivityEnterView2.f32670r0;
                    View view2 = xeVar3.f38142u;
                    ck0 ck0Var = xeVar3.v;
                    TLRPC.Peer peer5 = xeVar3.f38139r;
                    in0 in0Var = xeVar3.f38136o;
                    bi.a3 a3Var = xeVar3.f38141t;
                    ArrayList arrayList = xeVar3.f38146z;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        ((r1.g) obj).d();
                    }
                    arrayList.clear();
                    a3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    a3Var.setPivotY(a3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    in0Var.setPivotX(0.0f);
                    in0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = xeVar3.f38140s.peers;
                    if (peer5 != null) {
                        int L = org.telegram.messenger.g0.L(54.0f);
                        int size2 = arrayList2.size() * L;
                        i13 = 2;
                        int i22 = 0;
                        while (i22 < arrayList2.size()) {
                            TLRPC.Peer peer6 = arrayList2.get(i22).peer;
                            View view3 = view2;
                            ArrayList<TLRPC.TL_sendAsPeer> arrayList3 = arrayList2;
                            long j3 = peer6.channel_id;
                            if (j3 == 0 || j3 != peer5.channel_id) {
                                long j10 = peer6.user_id;
                                if (j10 == 0 || j10 != peer5.user_id) {
                                    long j11 = peer6.chat_id;
                                    if (j11 == 0 || j11 != peer5.chat_id) {
                                        i22++;
                                        view2 = view3;
                                        arrayList2 = arrayList3;
                                    }
                                }
                            }
                            if (i22 != arrayList3.size() - 1 && ck0Var.getMeasuredHeight() < size2) {
                                i14 = ck0Var.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            xeVar3.f38143w.h1(i22, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (ck0Var.computeVerticalScrollOffset() > 0) {
                                view3.animate().cancel();
                                view3.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else {
                        i13 = 2;
                    }
                    a3Var.setScaleX(0.25f);
                    a3Var.setScaleY(0.25f);
                    in0Var.setAlpha(0.25f);
                    r1.g gVar = new r1.g(a3Var, r1.g.f56308q);
                    gVar.f56323m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar.b(new en0(xeVar3, i13));
                    r1.g gVar2 = new r1.g(a3Var, r1.g.f56309r);
                    gVar2.f56323m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar2.b(new en0(xeVar3, 3));
                    r1.b bVar = r1.g.v;
                    r1.g gVar3 = new r1.g(a3Var, bVar);
                    gVar3.f56323m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    r1.g gVar4 = new r1.g(in0Var, bVar);
                    gVar4.f56323m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList.add(gVar5);
                        gVar5.a(new fn0(xeVar3, gVar5, 1));
                        gVar5.h();
                    }
                    xe xeVar4 = chatActivityEnterView2.f32670r0;
                    chatActivityEnterView2.f32684t0 = i7;
                    chatActivityEnterView2.f32690u0 = i12;
                    xeVar4.showAtLocation(view, 51, i7, i12);
                    chatActivityEnterView2.f32662q0.setProgress(1.0f);
                    return;
                }
                return;
            case 3:
                int i23 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.g1();
                return;
            case 4:
                gf gfVar2 = chatActivityEnterView.F0;
                if (gfVar2 == null) {
                    str = "";
                } else {
                    str = gfVar2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView.setFieldText("");
                    return;
                }
            case 5:
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var == null || eg0Var.f47250u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.f32602h3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f32591g0 == null) {
                        chatActivityEnterView.r1();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    kgVar2.J0();
                    return;
                }
                return;
            case 7:
                int i24 = ChatActivityEnterView.f32538n7;
                if (chatActivityEnterView.P2 != null) {
                    if (chatActivityEnterView.f32566d0 - chatActivityEnterView.f32574e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f32558c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f32558c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    gg C = chatActivityEnterView.C();
                    chatActivityEnterView.Q2 = C;
                    kg.y d = kg.y.d(chatActivityEnterView.R);
                    String str2 = chatActivityEnterView.P2.link;
                    String str3 = C.f35491a;
                    ArrayList<TLRPC.MessageEntity> arrayList4 = C.f35492b;
                    dd ddVar = new dd(chatActivityEnterView, 29);
                    TL_account.TL_businessChatLink c10 = d.c(str2);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList4;
                        tL_inputBusinessChatLink.title = c10.title;
                        d.b(c10, tL_inputBusinessChatLink, ddVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.Y3) {
                    if (!chatActivityEnterView.f32645n3 || (gfVar = chatActivityEnterView.F0) == null || !gfVar.isFocused()) {
                        if (chatActivityEnterView.f32646n4) {
                            if (chatActivityEnterView.F2 != 0) {
                                chatActivityEnterView.L1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.f32638m4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.f32682s4 && (cgVar = chatActivityEnterView.V0) != null) {
                                cgVar.P(false);
                            }
                        } else if (!chatActivityEnterView.f32682s4) {
                            chatActivityEnterView.V0.P(true);
                        }
                        if (!chatActivityEnterView.f32682s4) {
                            chatActivityEnterView.M1(!chatActivityEnterView.f32646n4, true, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (chatActivityEnterView.l1 && chatActivityEnterView.f32687t3 && (recordCircle = chatActivityEnterView.B2) != null && ChatActivityEnterView.this.f32596g5) {
                    chatActivityEnterView.l0(false, false);
                    ai.n0 n0Var = chatActivityEnterView.f32614j1;
                    if (n0Var != null && n0Var.o()) {
                        ai.n0 n0Var2 = chatActivityEnterView.f32614j1;
                        if (n0Var2.f1374o0 && n0Var2.o()) {
                            n0Var2.r();
                        }
                    } else {
                        ai.n0 n0Var3 = chatActivityEnterView.f32614j1;
                        if (n0Var3 != null && n0Var3.n()) {
                            gf gfVar3 = chatActivityEnterView.F0;
                            if (gfVar3 != null) {
                                gfVar3.setText("");
                            }
                            chatActivityEnterView.f32614j1.j();
                        }
                    }
                    if (chatActivityEnterView.f32687t3) {
                        chatActivityEnterView.f32687t3 = false;
                        chatActivityEnterView.W1 = 0L;
                        chatActivityEnterView.o2(2, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView.f32602h3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.Q1;
                    int[] iArr3 = chatActivityEnterView.P1;
                    if (chatActivityEnterView.I1 && !chatActivityEnterView.S1 && (xi0Var = chatActivityEnterView.f32607i1) != null && chatActivityEnterView.P3 != null && xi0Var.getVisibility() == 0 && chatActivityEnterView.f32607i1.getWidth() > 0 && (ph0Var = chatActivityEnterView.f32600h1) != null) {
                        if (chatActivityEnterView.f32607i1.T0 == null) {
                            ph0Var.getLocationInWindow(iArr3);
                            chatActivityEnterView.f32607i1.getLocationInWindow(iArr2);
                            float width = (chatActivityEnterView.f32600h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                            float height = ((chatActivityEnterView.f32600h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                            TLRPC.TL_document tL_document = chatActivityEnterView.P3;
                            chatActivityEnterView.f32718x5 = null;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.ci(24, chatActivityEnterView, tL_document), 100L);
                            try {
                                chatActivityEnterView.f32600h1.performHapticFeedback(3, 2);
                            } catch (Exception unused3) {
                            }
                            pg pgVar = chatActivityEnterView.C2;
                            if (pgVar != null) {
                                pgVar.invalidate();
                            }
                            chatActivityEnterView.C5 = 0.0f;
                            chatActivityEnterView.B5 = 0.0f;
                            ValueAnimator valueAnimator = chatActivityEnterView.A5;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            chatActivityEnterView.A5 = ofFloat;
                            ofFloat.setDuration(160L);
                            chatActivityEnterView.A5.setInterpolator(lr.f37209g);
                            chatActivityEnterView.A5.addUpdateListener(new pd(chatActivityEnterView, 9));
                            chatActivityEnterView.A5.start();
                            xi0 xi0Var2 = chatActivityEnterView.f32607i1;
                            ve veVar = new ve(chatActivityEnterView);
                            vu0 vu0Var = xi0Var2.J0;
                            RectF rectF = xi0Var2.f42067f0;
                            if (xi0Var2.T0 == null && !xi0Var2.X0) {
                                int width2 = xi0Var2.getWidth();
                                int height2 = xi0Var2.getHeight();
                                if (xi0Var2.f42061d0 && width2 > 0 && height2 > 0) {
                                    xi0Var2.setPlaying(false);
                                    xi0Var2.f42079p0 = false;
                                    xi0Var2.W = false;
                                    try {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                        float f16 = width2;
                                        rectF.set(0.0f, 0.0f, f16, height2);
                                        xi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                        int[] iArr4 = new int[width2 * height2];
                                        createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                        int i25 = width2;
                                        int i26 = height2;
                                        xi0Var2.f42054a1 = xi0Var2.f();
                                        if (width < f16 / 2.0f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        xi0Var2.Z0 = z10;
                                        int max = Math.max(1, Math.round(org.telegram.messenger.g0.f24120p * 0.75f));
                                        int i27 = 0;
                                        int i28 = 0;
                                        int i29 = 0;
                                        while (i27 < i26) {
                                            int i30 = 0;
                                            while (i30 < i25) {
                                                int i31 = iArr4[(i27 * i25) + i30];
                                                int i32 = i30;
                                                int i33 = i27;
                                                if ((i31 >>> 24) > 60) {
                                                    if (xi0Var2.e(i31)) {
                                                        i28++;
                                                    } else {
                                                        i29++;
                                                    }
                                                }
                                                i30 = i32 + max;
                                                i27 = i33;
                                            }
                                            i27 += max;
                                        }
                                        if (i28 > 1100) {
                                            f10 = 1100.0f / i28;
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        if (i29 > 0) {
                                            f11 = Math.min(1.0f, 360.0f / i29);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        vu0Var.a();
                                        vu0Var.S = 0.0f;
                                        vu0Var.R = 0.0f;
                                        vu0Var.e(xi0Var2.f42054a1);
                                        float f17 = org.telegram.messenger.g0.f24120p;
                                        int i34 = 0;
                                        int i35 = 0;
                                        int i36 = 0;
                                        while (i34 < i26) {
                                            float f18 = f10;
                                            int i37 = 0;
                                            while (i37 < i25) {
                                                int i38 = i25;
                                                int i39 = iArr4[(i34 * i25) + i37];
                                                int i40 = i26;
                                                float f19 = f11;
                                                if ((i39 >>> 24) > 60) {
                                                    i36++;
                                                    int i41 = i36 * 7;
                                                    float c11 = xi0.c(i41 + 3);
                                                    if (xi0Var2.e(i39)) {
                                                        f12 = f18;
                                                    } else {
                                                        f12 = f19;
                                                    }
                                                    if (c11 <= f12) {
                                                        if (xi0Var2.Z0) {
                                                            f13 = i37 / f16;
                                                        } else {
                                                            f13 = 1.0f - (i37 / f16);
                                                        }
                                                        float c12 = xi0.c(i41 + 13) * 0.04f;
                                                        float c13 = xi0.c(i41 + 11);
                                                        float f20 = i37;
                                                        i15 = i37;
                                                        float f21 = c13 - 0.5f;
                                                        float f22 = max;
                                                        i16 = max;
                                                        float f23 = (f21 * f22) + f20;
                                                        float c14 = xi0.c(i41 + 12) - 0.5f;
                                                        i17 = i34;
                                                        float f24 = (c14 * f22) + i34;
                                                        f14 = f16;
                                                        xi0Var2.J0.i(f23, f24, org.telegram.ui.Cells.c0.g(c13, 0.25f, 0.25f, width - f23, f23), Math.min(f24, height) - (((xi0.c(i41 + 14) * 9.0f) + 3.0f) * f17), com.google.android.gms.internal.vision.e2.x(c14, 4.0f, f17, width), com.google.android.gms.internal.vision.e2.x(f21, 4.0f, f17, height), com.google.android.gms.internal.vision.e2.B(f13, 0.3f, 0.8f, (xi0.c(i41 + 15) * 0.2f) + 0.45f), ((c12 + (0.42f * f13)) * 760.0f) / 1000.0f);
                                                        i35++;
                                                        i37 = i15 + i16;
                                                        f11 = f19;
                                                        i25 = i38;
                                                        i34 = i17;
                                                        i26 = i40;
                                                        max = i16;
                                                        f16 = f14;
                                                    }
                                                }
                                                i15 = i37;
                                                i16 = max;
                                                i17 = i34;
                                                f14 = f16;
                                                i37 = i15 + i16;
                                                f11 = f19;
                                                i25 = i38;
                                                i34 = i17;
                                                i26 = i40;
                                                max = i16;
                                                f16 = f14;
                                            }
                                            i34 += max;
                                            f10 = f18;
                                        }
                                        xi0Var2.T0 = createBitmap;
                                        xi0Var2.U0 = i35;
                                        xi0Var2.W0 = veVar;
                                        xi0Var2.V0 = SystemClock.uptimeMillis();
                                        xi0Var2.invalidate();
                                        return;
                                    } catch (Throwable unused4) {
                                        veVar.a();
                                        return;
                                    }
                                }
                                veVar.a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    chatActivityEnterView.o1();
                    return;
                }
                return;
            case 11:
                ki.z zVar = chatActivityEnterView.m0;
                boolean z14 = zVar.f19090w;
                zVar.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView.D0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.i1();
                            return;
                        }
                        org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 27), 275L);
                        chatActivityEnterView.G0(false);
                        return;
                    }
                    return;
                } else if (!z14) {
                    if (chatActivityEnterView.f32643n0 == null) {
                        ef efVar = new ef(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.f32643n0 = efVar;
                        di.b1 b1Var = efVar.f18983c;
                        chatActivityEnterView.getContext();
                        b1Var.setLayoutManager(new v4.c0());
                        di.b1 b1Var2 = chatActivityEnterView.f32643n0.f18983c;
                        ?? i0Var = new v4.i0();
                        i0Var.f19056c = new ArrayList();
                        i0Var.d = new ArrayList();
                        i0Var.f19057e = new ArrayList();
                        chatActivityEnterView.f32649o0 = i0Var;
                        b1Var2.setAdapter(i0Var);
                        chatActivityEnterView.f32643n0.f18983c.setOnItemClickListener(new ff(chatActivityEnterView));
                        chatActivityEnterView.f32643n0.f18983c.setOnItemLongClickListener(new ve(chatActivityEnterView));
                        chatActivityEnterView.f32643n0.setClipToPadding(false);
                        chatActivityEnterView.f32542a2.addView(chatActivityEnterView.f32643n0, c8.ma.e(-1, -1, 80));
                        chatActivityEnterView.f32643n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.W6;
                        if (hVar != null) {
                            chatActivityEnterView.f32649o0.E(hVar);
                        }
                        chatActivityEnterView.f2();
                    }
                    ef efVar2 = chatActivityEnterView.f32643n0;
                    if (efVar2.getVisibility() != 0) {
                        efVar2.setVisibility(0);
                        efVar2.f18983c.v0(0);
                        efVar2.f18986n = true;
                        efVar2.f18985f = false;
                        return;
                    } else if (efVar2.f18985f) {
                        efVar2.f18985f = false;
                        efVar2.a();
                        efVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    ef efVar3 = chatActivityEnterView.f32643n0;
                    if (efVar3 != null) {
                        efVar3.c();
                        return;
                    }
                    return;
                }
            case 12:
                if (chatActivityEnterView.f32641m7 == 3 && (kgVar = chatActivityEnterView.N3) != null) {
                    kgVar.w1();
                    return;
                }
                return;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView.D3.f46176s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                if (org.telegram.messenger.mp.u1(chatActivityEnterView.R).f25819y7 && org.telegram.messenger.mp.u1(chatActivityEnterView.R).f25828z7) {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).d2(org.telegram.messenger.j10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().f46176s8 == null || !chatActivityEnterView.getParentFragment().f46176s8.display_gifts_button) && (d2 == null || !d2.display_gifts_button)) {
                    org.telegram.messenger.g0.V3(chatActivityEnterView.f32723y2, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView.getParentFragment().f46176s8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().f46176s8.birthday)) {
                        z13 = true;
                    }
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, chatActivityEnterView.getContext(), null);
                    u1Var.r(200L);
                    u1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.s.j(chatActivityEnterView.R, null, new fi.w2(chatActivityEnterView, u1Var, j12, z13)), 4));
                    return;
                }
                return;
            case 14:
                int i42 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.g1();
                return;
            case 15:
                kg kgVar3 = chatActivityEnterView.N3;
                if (kgVar3 != null && !kgVar3.k()) {
                    kg kgVar4 = chatActivityEnterView.N3;
                    tg tgVar = chatActivityEnterView.G0;
                    kgVar4.s1(tgVar, ((org.telegram.ui.ActionBar.n5) tgVar.f39993c).getText(), true);
                    return;
                }
                return;
            case 16:
                cf cfVar = chatActivityEnterView.O0;
                if (cfVar != null && cfVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new je(chatActivityEnterView, 2), chatActivityEnterView.K4);
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = this.f36105b;
                cf cfVar2 = chatActivityEnterView3.O0;
                if (cfVar2 != null && cfVar2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.s1(true, 2147483646, 0, 0L, true);
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.f36105b;
                cf cfVar3 = chatActivityEnterView4.O0;
                if (cfVar3 != null && cfVar3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.s1(false, 0, 0, 0L, true);
                return;
            case 19:
                if (chatActivityEnterView.F2 != 0) {
                    chatActivityEnterView.L1(0, false);
                    chatActivityEnterView.V0.t(false);
                    gf gfVar4 = chatActivityEnterView.F0;
                    if (gfVar4 != null) {
                        gfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView.f32552b3 != null) {
                    if (chatActivityEnterView.O0() && chatActivityEnterView.T2 == 1) {
                        if (chatActivityEnterView.O0() && chatActivityEnterView.T2 == 1) {
                            chatActivityEnterView.T1(0, 1, true, false);
                        }
                    } else {
                        chatActivityEnterView.T1(1, 1, true, true);
                    }
                } else if (chatActivityEnterView.f32568d3) {
                    chatActivityEnterView.setFieldText("/");
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.requestFocus();
                    }
                    chatActivityEnterView.e1();
                }
                if (chatActivityEnterView.f32646n4) {
                    chatActivityEnterView.M1(false, false, false, true);
                    return;
                }
                return;
            case 20:
                int i43 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.q0();
                return;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.D3;
                fe feVar = chatActivityEnterView.R0;
                if (chatActivityEnterView.m0()) {
                    if (chatActivityEnterView.B6 == null) {
                        chatActivityEnterView.C6 = true;
                        if (chatActivityEnterView.B0) {
                            f15 = 0.5f;
                        } else {
                            f15 = 1.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.B6 = ofFloat2;
                        ofFloat2.addUpdateListener(new org.telegram.ui.rf(chatActivityEnterView, f15, 2));
                        chatActivityEnterView.B6.addListener(new org.telegram.ui.ActionBar.t0(chatActivityEnterView, f15, 5));
                        chatActivityEnterView.B6.setDuration(180L);
                        chatActivityEnterView.B6.setInterpolator(lr.f37210i);
                        chatActivityEnterView.B6.start();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.j1 j1Var3 = chatActivityEnterView.V;
                if (j1Var3 == null || !j1Var3.f29024f) {
                    if (feVar.f42488x) {
                        y60 y60Var = chatActivityEnterView.T6;
                        if (y60Var != null) {
                            y60Var.v();
                            chatActivityEnterView.T6 = null;
                            return;
                        }
                        gf gfVar6 = chatActivityEnterView.F0;
                        if (gfVar6 != null && bnVar3 != null) {
                            gfVar6.m();
                            FrameLayout frameLayout2 = chatActivityEnterView.f32542a2;
                            if (frameLayout2 != null) {
                                frameLayout = frameLayout2;
                            } else {
                                frameLayout = chatActivityEnterView;
                            }
                            y60 y60Var2 = new y60(frameLayout, chatActivityEnterView.K4, feVar, false, false, true);
                            y60Var2.f42343a0 = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.bn.C8(new u90(y60Var2, chatActivityEnterView.F0), bnVar3.h, true, true, true, true);
                            y60Var2.X = true;
                            y60Var2.f42369p = new org.telegram.ui.ci(25, chatActivityEnterView, y60Var2);
                            chatActivityEnterView.T6 = y60Var2;
                            y60Var2.a0();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.B0) {
                        chatActivityEnterView.U1();
                        return;
                    } else if (chatActivityEnterView.O0() && chatActivityEnterView.T2 == 0) {
                        if (chatActivityEnterView.F2 != 0) {
                            chatActivityEnterView.L1(0, true);
                            cg cgVar2 = chatActivityEnterView.V0;
                            if (cgVar2 != null) {
                                cgVar2.t(false);
                            }
                            gf gfVar7 = chatActivityEnterView.F0;
                            if (gfVar7 != null) {
                                gfVar7.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f32646n4) {
                            chatActivityEnterView.M1(false, true, false, true);
                            chatActivityEnterView.Z3 = true;
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 28), 200L);
                            return;
                        }
                        chatActivityEnterView.f1();
                        return;
                    } else {
                        chatActivityEnterView.T1(1, 0, true, true);
                        cg cgVar3 = chatActivityEnterView.V0;
                        gf gfVar8 = chatActivityEnterView.F0;
                        if (gfVar8 != null && gfVar8.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bnVar3 != null) {
                            hi.m3 m3Var = bnVar3.N1;
                            if (m3Var != null) {
                                if (m3Var.W) {
                                    m3Var.f(true);
                                }
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bnVar3.N1 = null;
                            if (z12) {
                                z13 = true;
                            }
                        }
                        cgVar3.C(z11, z13);
                        return;
                    }
                }
                return;
        }
    }
}
