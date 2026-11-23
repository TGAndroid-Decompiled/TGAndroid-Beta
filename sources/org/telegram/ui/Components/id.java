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
    public final int f36239a;
    public final ChatActivityEnterView f36240b;

    public id(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36239a = i7;
        this.f36240b = chatActivityEnterView;
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
        fg fgVar;
        gf gfVar;
        ChatActivityEnterView.RecordCircle recordCircle;
        zi0 zi0Var;
        rh0 rh0Var;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        int i15;
        int i16;
        int i17;
        float f14;
        ng ngVar;
        org.telegram.ui.bn bnVar;
        boolean z11;
        boolean z12;
        FrameLayout frameLayout;
        float f15;
        int i18 = this.f36239a;
        TLRPC.Peer peer2 = null;
        boolean z13 = false;
        ChatActivityEnterView chatActivityEnterView = this.f36240b;
        switch (i18) {
            case 0:
                org.telegram.ui.ActionBar.i1 i1Var = chatActivityEnterView.V;
                if ((i1Var == null || !i1Var.f29010f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.n1();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.i1 i1Var2 = chatActivityEnterView.V;
                if ((i1Var2 == null || !i1Var2.f29010f) && chatActivityEnterView.G != 0.0f) {
                    chatActivityEnterView.P3.B2();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f36240b;
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                if (!chatActivityEnterView2.f32695p7 ? chatActivityEnterView2.getTranslationY() != 0.0f : chatActivityEnterView2.S0()) {
                    chatActivityEnterView2.f32714s0 = new dd(chatActivityEnterView2, 6);
                    if (chatActivityEnterView2.f32695p7) {
                        chatActivityEnterView2.L0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView2.L0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView2.P3.n() > org.telegram.messenger.g0.L(20.0f)) {
                    int b12 = chatActivityEnterView2.P3.b1();
                    int n10 = chatActivityEnterView2.P3.n();
                    if (n10 <= org.telegram.messenger.g0.L(20.0f)) {
                        b12 += n10;
                    }
                    if (chatActivityEnterView2.X0) {
                        b12 -= chatActivityEnterView2.getEmojiPadding();
                    }
                    if (b12 < org.telegram.messenger.g0.L(200.0f)) {
                        chatActivityEnterView2.f32733v0 = new dd(chatActivityEnterView2, 7);
                        chatActivityEnterView2.U();
                        return;
                    }
                }
                if (chatActivityEnterView2.P3.J() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    xe xeVar = chatActivityEnterView2.f32705r0;
                    if (xeVar != null) {
                        xeVar.f28977e = false;
                        xeVar.l(new r1.g[0]);
                        return;
                    }
                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(chatActivityEnterView2.R);
                    if (chatActivityEnterView2.f32695p7) {
                        peer = chatActivityEnterView2.P3.t();
                    } else {
                        org.telegram.messenger.np.u1(chatActivityEnterView2.R).O0(Long.valueOf(-chatActivityEnterView2.G3));
                        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(chatActivityEnterView2.R).P0(-chatActivityEnterView2.G3);
                        if (P0 != null) {
                            peer2 = P0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = P0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView2.P3.J() != null && !chatActivityEnterView2.P3.J().peers.isEmpty()) {
                        peer = chatActivityEnterView2.P3.J().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = org.telegram.messenger.v3.V(u12.O0(Long.valueOf(-chatActivityEnterView2.G3)));
                    if (chatActivityEnterView2.f32695p7) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView2.getParent();
                    } else {
                        bnVar2.getParentLayout().getOverlayContainerView();
                    }
                    xe xeVar2 = new xe(chatActivityEnterView2, chatActivityEnterView2.getContext(), chatActivityEnterView2.F3, u12, V, peer4, chatActivityEnterView2.P3.J(), new a3.h(chatActivityEnterView2, peer2, u12, 24), chatActivityEnterView2.M4);
                    chatActivityEnterView2.f32705r0 = xeVar2;
                    xeVar2.f28977e = true;
                    xeVar2.f28976c = 220;
                    xeVar2.setOutsideTouchable(true);
                    chatActivityEnterView2.f32705r0.setClippingEnabled(true);
                    chatActivityEnterView2.f32705r0.setFocusable(true);
                    chatActivityEnterView2.f32705r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView2.f32705r0.setInputMethodMode(2);
                    chatActivityEnterView2.f32705r0.setSoftInputMode(0);
                    chatActivityEnterView2.f32705r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView2.f32705r0.f28975b = false;
                    int i19 = -org.telegram.messenger.g0.L(4.0f);
                    int[] iArr = new int[2];
                    if (org.telegram.messenger.g0.Q1() && bnVar2 != null) {
                        bnVar2.getFragmentView().getLocationInWindow(iArr);
                        i7 = iArr[0] + i19;
                    } else {
                        i7 = i19;
                    }
                    int b13 = chatActivityEnterView2.P3.b1();
                    int measuredHeight = chatActivityEnterView2.f32705r0.getContentView().getMeasuredHeight();
                    int n11 = chatActivityEnterView2.P3.n();
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
                        i10 = org.telegram.messenger.g0.f24040m;
                    }
                    if (measuredHeight < (i20 - i10) - chatActivityEnterView2.f32705r0.f38956p.getMeasuredHeight()) {
                        chatActivityEnterView2.getLocationInWindow(iArr);
                        i12 = ((iArr[1] - measuredHeight) - i19) - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        if (bnVar2 != null && bnVar2.isInBubbleMode()) {
                            i11 = 0;
                        } else {
                            i11 = org.telegram.messenger.g0.f24040m;
                        }
                        chatActivityEnterView2.f32705r0.f38955o.getLayoutParams().height = ((b13 - i11) - org.telegram.messenger.g0.L(14.0f)) - chatActivityEnterView2.getHeightWithTopView();
                        i12 = i11;
                    }
                    xe xeVar3 = chatActivityEnterView2.f32705r0;
                    View view2 = xeVar3.f38961u;
                    ek0 ek0Var = xeVar3.v;
                    TLRPC.Peer peer5 = xeVar3.f38958r;
                    kn0 kn0Var = xeVar3.f38955o;
                    bi.e3 e3Var = xeVar3.f38960t;
                    ArrayList arrayList = xeVar3.f38965z;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        ((r1.g) obj).d();
                    }
                    arrayList.clear();
                    e3Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
                    e3Var.setPivotY(e3Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
                    kn0Var.setPivotX(0.0f);
                    kn0Var.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = xeVar3.f38959s.peers;
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
                            if (i22 != arrayList3.size() - 1 && ek0Var.getMeasuredHeight() < size2) {
                                i14 = ek0Var.getMeasuredHeight() % L;
                            } else {
                                i14 = 0;
                            }
                            xeVar3.f38962w.h1(i22, (size2 - ((arrayList3.size() - 2) * L)) + org.telegram.messenger.g0.L(7.0f) + i14);
                            if (ek0Var.computeVerticalScrollOffset() > 0) {
                                view3.animate().cancel();
                                view3.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else {
                        i13 = 2;
                    }
                    e3Var.setScaleX(0.25f);
                    e3Var.setScaleY(0.25f);
                    kn0Var.setAlpha(0.25f);
                    r1.g gVar = new r1.g(e3Var, r1.g.f56353q);
                    gVar.f56368m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar.b(new hn0(xeVar3, i13));
                    r1.g gVar2 = new r1.g(e3Var, r1.g.f56354r);
                    gVar2.f56368m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    gVar2.b(new hn0(xeVar3, 3));
                    r1.b bVar = r1.g.v;
                    r1.g gVar3 = new r1.g(e3Var, bVar);
                    gVar3.f56368m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    r1.g gVar4 = new r1.g(kn0Var, bVar);
                    gVar4.f56368m = org.telegram.ui.Cells.c0.p(1.0f, 750.0f, 1.0f);
                    for (r1.g gVar5 : Arrays.asList(gVar, gVar2, gVar3, gVar4)) {
                        arrayList.add(gVar5);
                        gVar5.a(new in0(xeVar3, gVar5, 1));
                        gVar5.h();
                    }
                    xe xeVar4 = chatActivityEnterView2.f32705r0;
                    chatActivityEnterView2.f32720t0 = i7;
                    chatActivityEnterView2.f32726u0 = i12;
                    xeVar4.showAtLocation(view, 51, i7, i12);
                    chatActivityEnterView2.f32696q0.setProgress(1.0f);
                    return;
                }
                return;
            case 3:
                int i23 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView.k1();
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
                if (eg0Var == null || eg0Var.f47290u0) {
                    AnimatorSet animatorSet = chatActivityEnterView.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView.f32622g0 == null) {
                        chatActivityEnterView.v1();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ng ngVar2 = chatActivityEnterView.P3;
                if (ngVar2 != null) {
                    ngVar2.J0();
                    return;
                }
                return;
            case 7:
                int i24 = ChatActivityEnterView.f32569s7;
                if (chatActivityEnterView.R2 != null) {
                    if (chatActivityEnterView.f32597d0 - chatActivityEnterView.f32605e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView.f32589c0;
                        if (numberTextView != null) {
                            org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView.f32589c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    jg C = chatActivityEnterView.C();
                    chatActivityEnterView.S2 = C;
                    kg.z d = kg.z.d(chatActivityEnterView.R);
                    String str2 = chatActivityEnterView.R2.link;
                    String str3 = C.f36489a;
                    ArrayList<TLRPC.MessageEntity> arrayList4 = C.f36490b;
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
                if (chatActivityEnterView.T0.getVisibility() == 0 && chatActivityEnterView.T0.getAlpha() == 1.0f && !chatActivityEnterView.f32575a4) {
                    if (!chatActivityEnterView.f32691p3 || (gfVar = chatActivityEnterView.F0) == null || !gfVar.isFocused()) {
                        if (chatActivityEnterView.f32692p4) {
                            if (chatActivityEnterView.H2 != 0) {
                                chatActivityEnterView.P1(0, true);
                                chatActivityEnterView.V0.t(true);
                                chatActivityEnterView.V0.A();
                                if (chatActivityEnterView.o4) {
                                    chatActivityEnterView.P(true);
                                }
                            } else if (!chatActivityEnterView.f32730u4 && (fgVar = chatActivityEnterView.V0) != null) {
                                fgVar.P(false);
                            }
                        } else if (!chatActivityEnterView.f32730u4) {
                            chatActivityEnterView.V0.P(true);
                        }
                        if (!chatActivityEnterView.f32730u4) {
                            chatActivityEnterView.Q1(!chatActivityEnterView.f32692p4, true, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                int i25 = ChatActivityEnterView.f32569s7;
                if (chatActivityEnterView.i0() && chatActivityEnterView.f32736v3 && (recordCircle = chatActivityEnterView.D2) != null && ChatActivityEnterView.this.f32642i5) {
                    chatActivityEnterView.n0(false, false);
                    ai.p0 p0Var = chatActivityEnterView.f32645j1;
                    if (p0Var != null && p0Var.p()) {
                        ai.p0 p0Var2 = chatActivityEnterView.f32645j1;
                        if (p0Var2.f1402o0 && p0Var2.p()) {
                            p0Var2.s();
                        }
                    } else {
                        ai.p0 p0Var3 = chatActivityEnterView.f32645j1;
                        if (p0Var3 != null && p0Var3.o()) {
                            gf gfVar3 = chatActivityEnterView.F0;
                            if (gfVar3 != null) {
                                gfVar3.setText("");
                            }
                            chatActivityEnterView.f32645j1.k();
                        }
                    }
                    if (chatActivityEnterView.f32736v3) {
                        chatActivityEnterView.f32736v3 = false;
                        chatActivityEnterView.Y1 = 0L;
                        chatActivityEnterView.s2(2, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                AnimatorSet animatorSet2 = chatActivityEnterView.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView.S1;
                    int[] iArr3 = chatActivityEnterView.R1;
                    if (chatActivityEnterView.K1 && !chatActivityEnterView.U1 && (zi0Var = chatActivityEnterView.f32638i1) != null && chatActivityEnterView.R3 != null && zi0Var.getVisibility() == 0 && chatActivityEnterView.f32638i1.getWidth() > 0 && (rh0Var = chatActivityEnterView.f32631h1) != null) {
                        if (chatActivityEnterView.f32638i1.T0 == null) {
                            rh0Var.getLocationInWindow(iArr3);
                            chatActivityEnterView.f32638i1.getLocationInWindow(iArr2);
                            float width = (chatActivityEnterView.f32631h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                            float height = ((chatActivityEnterView.f32631h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - org.telegram.messenger.g0.L(3.0f);
                            TLRPC.TL_document tL_document = chatActivityEnterView.R3;
                            chatActivityEnterView.f32769z5 = null;
                            org.telegram.messenger.g0.h3(new org.telegram.ui.eh(26, chatActivityEnterView, tL_document), 100L);
                            try {
                                chatActivityEnterView.f32631h1.performHapticFeedback(3, 2);
                            } catch (Exception unused3) {
                            }
                            rg rgVar = chatActivityEnterView.E2;
                            if (rgVar != null) {
                                rgVar.invalidate();
                            }
                            chatActivityEnterView.E5 = 0.0f;
                            chatActivityEnterView.D5 = 0.0f;
                            ValueAnimator valueAnimator = chatActivityEnterView.C5;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            chatActivityEnterView.C5 = ofFloat;
                            ofFloat.setDuration(160L);
                            chatActivityEnterView.C5.setInterpolator(nr.f37962g);
                            chatActivityEnterView.C5.addUpdateListener(new pd(chatActivityEnterView, 9));
                            chatActivityEnterView.C5.start();
                            zi0 zi0Var2 = chatActivityEnterView.f32638i1;
                            ve veVar = new ve(chatActivityEnterView);
                            yu0 yu0Var = zi0Var2.J0;
                            RectF rectF = zi0Var2.f42864f0;
                            if (zi0Var2.T0 == null && !zi0Var2.X0) {
                                int width2 = zi0Var2.getWidth();
                                int height2 = zi0Var2.getHeight();
                                if (zi0Var2.f42858d0 && width2 > 0 && height2 > 0) {
                                    zi0Var2.setPlaying(false);
                                    zi0Var2.f42876p0 = false;
                                    zi0Var2.W = false;
                                    try {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                        float f16 = width2;
                                        rectF.set(0.0f, 0.0f, f16, height2);
                                        zi0Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                        int[] iArr4 = new int[width2 * height2];
                                        createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                        int i26 = width2;
                                        int i27 = height2;
                                        zi0Var2.f42851a1 = zi0Var2.f();
                                        if (width < f16 / 2.0f) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zi0Var2.Z0 = z10;
                                        int max = Math.max(1, Math.round(org.telegram.messenger.g0.f24045p * 0.75f));
                                        int i28 = 0;
                                        int i29 = 0;
                                        int i30 = 0;
                                        while (i28 < i27) {
                                            int i31 = 0;
                                            while (i31 < i26) {
                                                int i32 = iArr4[(i28 * i26) + i31];
                                                int i33 = i31;
                                                int i34 = i28;
                                                if ((i32 >>> 24) > 60) {
                                                    if (zi0Var2.e(i32)) {
                                                        i29++;
                                                    } else {
                                                        i30++;
                                                    }
                                                }
                                                i31 = i33 + max;
                                                i28 = i34;
                                            }
                                            i28 += max;
                                        }
                                        if (i29 > 1100) {
                                            f10 = 1100.0f / i29;
                                        } else {
                                            f10 = 1.0f;
                                        }
                                        if (i30 > 0) {
                                            f11 = Math.min(1.0f, 360.0f / i30);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        yu0Var.a();
                                        yu0Var.S = 0.0f;
                                        yu0Var.R = 0.0f;
                                        yu0Var.e(zi0Var2.f42851a1);
                                        float f17 = org.telegram.messenger.g0.f24045p;
                                        int i35 = 0;
                                        int i36 = 0;
                                        int i37 = 0;
                                        while (i35 < i27) {
                                            float f18 = f10;
                                            int i38 = 0;
                                            while (i38 < i26) {
                                                int i39 = i26;
                                                int i40 = iArr4[(i35 * i26) + i38];
                                                int i41 = i27;
                                                float f19 = f11;
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
                                                        f11 = f19;
                                                        i26 = i39;
                                                        i35 = i17;
                                                        i27 = i41;
                                                        max = i16;
                                                        f16 = f14;
                                                    }
                                                }
                                                i15 = i38;
                                                i16 = max;
                                                i17 = i35;
                                                f14 = f16;
                                                i38 = i15 + i16;
                                                f11 = f19;
                                                i26 = i39;
                                                i35 = i17;
                                                i27 = i41;
                                                max = i16;
                                                f16 = f14;
                                            }
                                            i35 += max;
                                            f10 = f18;
                                        }
                                        zi0Var2.T0 = createBitmap;
                                        zi0Var2.U0 = i36;
                                        zi0Var2.W0 = veVar;
                                        zi0Var2.V0 = SystemClock.uptimeMillis();
                                        zi0Var2.invalidate();
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
                    chatActivityEnterView.s1();
                    return;
                }
                return;
            case 11:
                ki.y yVar = chatActivityEnterView.m0;
                boolean z14 = yVar.f19100w;
                yVar.setOpened(!z14);
                try {
                    chatActivityEnterView.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView.H0()) {
                    if (!z14) {
                        if (!chatActivityEnterView.X0 && !chatActivityEnterView.Y0) {
                            chatActivityEnterView.m1();
                            return;
                        }
                        org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 27), 275L);
                        chatActivityEnterView.K0(false);
                        return;
                    }
                    return;
                } else if (!z14) {
                    if (chatActivityEnterView.f32674n0 == null) {
                        ef efVar = new ef(chatActivityEnterView, chatActivityEnterView.getContext());
                        chatActivityEnterView.f32674n0 = efVar;
                        di.b1 b1Var = efVar.f18993c;
                        chatActivityEnterView.getContext();
                        b1Var.setLayoutManager(new v4.c0());
                        di.b1 b1Var2 = chatActivityEnterView.f32674n0.f18993c;
                        ?? i0Var = new v4.i0();
                        i0Var.f19066c = new ArrayList();
                        i0Var.d = new ArrayList();
                        i0Var.f19067e = new ArrayList();
                        chatActivityEnterView.f32681o0 = i0Var;
                        b1Var2.setAdapter(i0Var);
                        chatActivityEnterView.f32674n0.f18993c.setOnItemClickListener(new ff(chatActivityEnterView));
                        chatActivityEnterView.f32674n0.f18993c.setOnItemLongClickListener(new ve(chatActivityEnterView));
                        chatActivityEnterView.f32674n0.setClipToPadding(false);
                        chatActivityEnterView.f32591c2.addView(chatActivityEnterView.f32674n0, c8.ma.e(-1, -1, 80));
                        chatActivityEnterView.f32674n0.setVisibility(8);
                        a0.h hVar = chatActivityEnterView.Y6;
                        if (hVar != null) {
                            chatActivityEnterView.f32681o0.E(hVar);
                        }
                        chatActivityEnterView.j2();
                    }
                    ef efVar2 = chatActivityEnterView.f32674n0;
                    if (efVar2.getVisibility() != 0) {
                        efVar2.setVisibility(0);
                        efVar2.f18993c.v0(0);
                        efVar2.f18996n = true;
                        efVar2.f18995f = false;
                        return;
                    } else if (efVar2.f18995f) {
                        efVar2.f18995f = false;
                        efVar2.a();
                        efVar2.d(false);
                        return;
                    } else {
                        return;
                    }
                } else {
                    ef efVar3 = chatActivityEnterView.f32674n0;
                    if (efVar3 != null) {
                        efVar3.c();
                        return;
                    }
                    return;
                }
            case 12:
                if (chatActivityEnterView.f32712r7 == 3 && (ngVar = chatActivityEnterView.P3) != null) {
                    ngVar.w1();
                    return;
                }
                return;
            case 13:
                SharedPreferences.Editor edit = org.telegram.messenger.np.u1(chatActivityEnterView.R).h7.edit();
                if (org.telegram.messenger.v1.d(chatActivityEnterView.F3.f46194s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + bnVar.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                if (org.telegram.messenger.np.u1(chatActivityEnterView.R).f26016y7 && org.telegram.messenger.np.u1(chatActivityEnterView.R).f26025z7) {
                    edit.putBoolean("show_gift_for_" + bnVar.a(), false);
                }
                edit.apply();
                TLRPC.UserFull d2 = org.telegram.messenger.np.u1(chatActivityEnterView.R).d2(org.telegram.messenger.k10.i(chatActivityEnterView.R).e());
                if ((chatActivityEnterView.getParentFragment().f46194s8 == null || !chatActivityEnterView.getParentFragment().f46194s8.display_gifts_button) && (d2 == null || !d2.display_gifts_button)) {
                    org.telegram.messenger.g0.V3(chatActivityEnterView.A2, false);
                }
                TLRPC.User j12 = chatActivityEnterView.getParentFragment().j();
                if (j12 != null) {
                    if (chatActivityEnterView.getParentFragment().f46194s8 != null && org.telegram.messenger.v1.e(chatActivityEnterView.getParentFragment().f46194s8.birthday)) {
                        z13 = true;
                    }
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, chatActivityEnterView.getContext(), null);
                    t1Var.r(200L);
                    t1Var.setOnCancelListener(new di.z(chatActivityEnterView, wg.s.j(chatActivityEnterView.R, null, new fi.w2(chatActivityEnterView, t1Var, j12, z13)), 4));
                    return;
                }
                return;
            case 14:
                int i43 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView.k1();
                return;
            case 15:
                ng ngVar3 = chatActivityEnterView.P3;
                if (ngVar3 != null && !ngVar3.k()) {
                    ng ngVar4 = chatActivityEnterView.P3;
                    vg vgVar = chatActivityEnterView.G0;
                    ngVar4.s1(vgVar, ((org.telegram.ui.ActionBar.m5) vgVar.f40821c).getText(), true);
                    return;
                }
                return;
            case 16:
                cf cfVar = chatActivityEnterView.O0;
                if (cfVar != null && cfVar.isShowing()) {
                    chatActivityEnterView.O0.dismiss();
                }
                c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new je(chatActivityEnterView, 2), chatActivityEnterView.M4);
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = this.f36240b;
                cf cfVar2 = chatActivityEnterView3.O0;
                if (cfVar2 != null && cfVar2.isShowing()) {
                    chatActivityEnterView3.O0.dismiss();
                }
                chatActivityEnterView3.w1(true, 2147483646, 0, 0L, true);
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView4 = this.f36240b;
                cf cfVar3 = chatActivityEnterView4.O0;
                if (cfVar3 != null && cfVar3.isShowing()) {
                    chatActivityEnterView4.O0.dismiss();
                }
                chatActivityEnterView4.w1(false, 0, 0, 0L, true);
                return;
            case 19:
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.P1(0, false);
                    chatActivityEnterView.V0.t(false);
                    gf gfVar4 = chatActivityEnterView.F0;
                    if (gfVar4 != null) {
                        gfVar4.requestFocus();
                    }
                }
                if (chatActivityEnterView.f32599d3 != null) {
                    if (chatActivityEnterView.S0() && chatActivityEnterView.V2 == 1) {
                        if (chatActivityEnterView.S0() && chatActivityEnterView.V2 == 1) {
                            chatActivityEnterView.X1(0, 1, true, false);
                        }
                    } else {
                        chatActivityEnterView.X1(1, 1, true, true);
                    }
                } else if (chatActivityEnterView.f32617f3) {
                    chatActivityEnterView.setFieldText("/");
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.requestFocus();
                    }
                    chatActivityEnterView.i1();
                }
                if (chatActivityEnterView.f32692p4) {
                    chatActivityEnterView.Q1(false, false, false, true);
                    return;
                }
                return;
            case 20:
                int i44 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView.u0();
                return;
            default:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
                fe feVar = chatActivityEnterView.R0;
                if (chatActivityEnterView.o0()) {
                    if (chatActivityEnterView.D6 == null) {
                        chatActivityEnterView.E6 = true;
                        if (chatActivityEnterView.B0) {
                            f15 = 0.5f;
                        } else {
                            f15 = 1.0f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView.D6 = ofFloat2;
                        ofFloat2.addUpdateListener(new org.telegram.ui.rf(chatActivityEnterView, f15, 2));
                        chatActivityEnterView.D6.addListener(new org.telegram.ui.ActionBar.s0(chatActivityEnterView, f15, 5));
                        chatActivityEnterView.D6.setDuration(180L);
                        chatActivityEnterView.D6.setInterpolator(nr.f37963i);
                        chatActivityEnterView.D6.start();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.i1 i1Var3 = chatActivityEnterView.V;
                if (i1Var3 == null || !i1Var3.f29010f) {
                    if (feVar.f33520x) {
                        a70 a70Var = chatActivityEnterView.V6;
                        if (a70Var != null) {
                            a70Var.v();
                            chatActivityEnterView.V6 = null;
                            return;
                        }
                        gf gfVar6 = chatActivityEnterView.F0;
                        if (gfVar6 != null && bnVar3 != null) {
                            gfVar6.m();
                            FrameLayout frameLayout2 = chatActivityEnterView.f32591c2;
                            if (frameLayout2 != null) {
                                frameLayout = frameLayout2;
                            } else {
                                frameLayout = chatActivityEnterView;
                            }
                            a70 a70Var2 = new a70(frameLayout, chatActivityEnterView.M4, feVar, false, false, true);
                            a70Var2.f33365a0 = org.telegram.messenger.g0.L(280.0f);
                            org.telegram.ui.bn.C8(new w90(a70Var2, chatActivityEnterView.F0), bnVar3.h, true, true, true, true);
                            a70Var2.X = true;
                            a70Var2.f33391p = new org.telegram.ui.eh(27, chatActivityEnterView, a70Var2);
                            chatActivityEnterView.V6 = a70Var2;
                            a70Var2.a0();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView.B0) {
                        chatActivityEnterView.Y1();
                        return;
                    } else if (chatActivityEnterView.S0() && chatActivityEnterView.V2 == 0) {
                        if (chatActivityEnterView.H2 != 0) {
                            chatActivityEnterView.P1(0, true);
                            fg fgVar2 = chatActivityEnterView.V0;
                            if (fgVar2 != null) {
                                fgVar2.t(false);
                            }
                            gf gfVar7 = chatActivityEnterView.F0;
                            if (gfVar7 != null) {
                                gfVar7.requestFocus();
                            }
                        }
                        if (chatActivityEnterView.f32692p4) {
                            chatActivityEnterView.Q1(false, true, false, true);
                            chatActivityEnterView.f32584b4 = true;
                            org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 28), 200L);
                            return;
                        }
                        chatActivityEnterView.j1();
                        return;
                    } else {
                        chatActivityEnterView.X1(1, 0, true, true);
                        fg fgVar3 = chatActivityEnterView.V0;
                        gf gfVar8 = chatActivityEnterView.F0;
                        if (gfVar8 != null && gfVar8.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (bnVar3 != null) {
                            hi.l3 l3Var = bnVar3.N1;
                            if (l3Var != null) {
                                if (l3Var.W) {
                                    l3Var.f(true);
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
                        fgVar3.C(z11, z13);
                        return;
                    }
                }
                return;
        }
    }
}
