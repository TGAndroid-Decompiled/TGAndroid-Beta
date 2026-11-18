package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a5 implements org.telegram.messenger.q10 {
    public final int f45457a;
    public final Object f45458b;

    public a5(Object obj, int i7) {
        this.f45457a = i7;
        this.f45458b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean z16;
        b21 b21Var = (b21) this.f45458b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
        a21 a21Var = b21Var.f45735c2;
        a21 a21Var2 = b21Var.f45734b2;
        TLRPC.User user = b21Var.U1;
        a21 a21Var3 = b21Var.f45733a2;
        if (a21Var3 != null) {
            ArrayList arrayList2 = a21Var3.d;
            if (a21Var2 != null) {
                ArrayList arrayList3 = a21Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.j10.i(b21Var.f30189a).e()));
                arrayList.add(org.telegram.ui.Components.l41.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (a21Var != null && !TextUtils.isEmpty(a21Var.f45433c.f28404q)) {
                    ArrayList arrayList4 = a21Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                            org.telegram.ui.Components.l41 w10 = org.telegram.ui.Components.l41.w(tLObject);
                            if (org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(b21Var.W1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (a21Var.f45435f) {
                        arrayList.add(org.telegram.ui.Components.l41.p(29));
                        arrayList.add(org.telegram.ui.Components.l41.p(29));
                        arrayList.add(org.telegram.ui.Components.l41.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.l41.k(b21Var.Z1));
                        return;
                    }
                    return;
                }
                if (user != null) {
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            break;
                        }
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        if (org.telegram.messenger.n5.d((TLObject) obj4) == org.telegram.messenger.n5.d(user)) {
                            if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                                if (org.telegram.messenger.v3.V(b21Var.T1)) {
                                    i13 = 2131752505;
                                } else {
                                    i13 = 2131749307;
                                }
                                arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                                org.telegram.ui.Components.l41 w11 = org.telegram.ui.Components.l41.w(user);
                                i7 = 29;
                                if (org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(b21Var.W1)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                w11.L(z15);
                                arrayList.add(w11);
                                z10 = false;
                            }
                        }
                    }
                }
                i7 = 29;
                z10 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)))) {
                        if (z10) {
                            if (org.telegram.messenger.v3.V(b21Var.T1)) {
                                i12 = 2131752505;
                            } else {
                                i12 = 2131749307;
                            }
                            arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(i12, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                        org.telegram.ui.Components.l41 w12 = org.telegram.ui.Components.l41.w(tLObject2);
                        if (org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(b21Var.W1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (a21Var3.f45435f) {
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                    if (org.telegram.messenger.v3.V(b21Var.T1)) {
                        i11 = 2131752277;
                    } else {
                        i11 = 2131749236;
                    }
                    arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                    org.telegram.ui.Components.l41 w13 = org.telegram.ui.Components.l41.w(user);
                    if (org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(b21Var.W1)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w13.L(z13);
                    arrayList.add(w13);
                    z11 = false;
                } else {
                    z11 = true;
                }
                int size4 = arrayList3.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj6 = arrayList3.get(i17);
                    i17++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)))) {
                        if (z11) {
                            if (org.telegram.messenger.v3.V(b21Var.T1)) {
                                i10 = 2131752277;
                            } else {
                                i10 = 2131749236;
                            }
                            arrayList.add(org.telegram.ui.Components.l41.r(org.telegram.messenger.gd.M0(i10, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                        org.telegram.ui.Components.l41 w14 = org.telegram.ui.Components.l41.w(tLObject3);
                        if (org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(b21Var.W1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && a21Var2.f45435f) {
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                    arrayList.add(org.telegram.ui.Components.l41.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        d21 d21Var = (d21) this.f45458b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
        int i10 = d21Var.X1;
        fi.h6 h6Var = d21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.l41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.f12048i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj3;
            int i14 = j51.f48883c;
            org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(j51.class);
            K.v = 1;
            K.A = 0;
            K.H = fjVar;
            if (fjVar != null && (storyItem = fjVar.f23973l) != null) {
                j3 = storyItem.f28644id;
            } else {
                j3 = -1;
            }
            K.C = j3;
            K.f37012f = true;
            K.f37027w = i10;
            K.L(d21Var.W1.containsKey(Integer.valueOf(fjVar.e1())));
            K.v = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (h6Var.k() || !h6Var.f12057r) {
            while (true) {
                if (i12 <= 0) {
                    i7 = i10;
                } else {
                    i7 = i12;
                }
                if (i11 >= i7) {
                    break;
                }
                i11++;
                org.telegram.ui.Components.l41 q10 = org.telegram.ui.Components.l41.q(i11, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.l41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        int i7;
        int i10;
        boolean z10;
        o41 o41Var;
        ArrayList arrayList;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        float f10;
        float f11;
        String str2;
        int i11;
        boolean z11;
        int i12;
        float f12;
        float f13;
        int i13 = 2;
        org.telegram.ui.Components.ph phVar = null;
        int i14 = 0;
        switch (this.f45457a) {
            case 0:
                b5 b5Var = (b5) this.f45458b;
                b5Var.f45764w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f45765x = false;
                ui.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.f45458b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList3 = i9Var.f48663x;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(1, 2131231771, org.telegram.messenger.gd.M0(2131749298, null));
                    c10.f37023r = true;
                    arrayList2.add(c10);
                    arrayList2.add(org.telegram.ui.Components.l41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = i9Var.G;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (O0 = i9Var.getMessagesController().O0(l10)) != null) {
                            l8 l8Var = new l8(i9Var, 0);
                            int i16 = g9.f48003b;
                            org.telegram.ui.Components.l41 K = org.telegram.ui.Components.l41.K(g9.class);
                            K.H = O0;
                            K.E = l8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.l41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        f9 f9Var = (f9) obj4;
                        ni.b bVar2 = new ni.b(9, i9Var, f9Var);
                        int i18 = d9.f46899b;
                        org.telegram.ui.Components.l41 K2 = org.telegram.ui.Components.l41.K(d9.class);
                        K2.H = f9Var;
                        K2.E = bVar2;
                        K2.L(i9Var.k0(f9Var.f47616c));
                        arrayList2.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.l41.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.l41.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.l41.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) this.f45458b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var2 = (org.telegram.ui.Components.z41) obj2;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(xdVar.f53807p0).O0(Long.valueOf(-xdVar.f53809q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(xdVar.f53807p0).P0(-xdVar.f53809q0);
                if (P0 != null) {
                    i7 = P0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (xdVar.f53794c1) {
                    arrayList5.add(org.telegram.ui.Components.l41.g(xdVar.f53815t0));
                    o41 o41Var2 = xdVar.f53803m1;
                    if (o41Var2 != null && !o41Var2.f50472l) {
                        arrayList5.add(org.telegram.ui.Components.l41.h(5, i7, o41Var2));
                        arrayList5.add(org.telegram.ui.Components.l41.B(-1, null));
                    }
                    o41 o41Var3 = xdVar.n1;
                    if (o41Var3 != null && !o41Var3.f50472l) {
                        arrayList5.add(org.telegram.ui.Components.l41.h(2, i7, o41Var3));
                        arrayList5.add(org.telegram.ui.Components.l41.B(-2, null));
                    }
                }
                if (xdVar.f53795d1 && (o41Var = xdVar.f53806o1) != null && !o41Var.f50472l) {
                    arrayList5.add(org.telegram.ui.Components.l41.h(2, i7, o41Var));
                    arrayList5.add(org.telegram.ui.Components.l41.B(-3, null));
                }
                if (xdVar.f53808p1) {
                    arrayList5.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748193, null)));
                    arrayList5.add(org.telegram.ui.Components.l41.v(xdVar.f53810q1));
                    arrayList5.add(org.telegram.ui.Components.l41.v(xdVar.f53812r1));
                    arrayList5.add(org.telegram.ui.Components.l41.v(xdVar.f53814s1));
                    arrayList5.add(org.telegram.ui.Components.l41.B(-4, xdVar.f53818v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.f53794c1) {
                        arrayList5.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748214, null)));
                        arrayList5.add(org.telegram.ui.Components.l41.k(xdVar.f53820x0));
                        arrayList5.add(org.telegram.ui.Components.l41.B(-5, xdVar.f53817u0));
                        int i19 = org.telegram.messenger.mp.u1(xdVar.f53807p0).C4;
                        String M0 = org.telegram.messenger.gd.M0(2131748173, null);
                        if (xdVar.f53813s0 < i19) {
                            i10 = i19;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f26915b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(0, new org.telegram.ui.ActionBar.w2(i10, context, null, false));
                            lqVar.f37199s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l41 i20 = org.telegram.ui.Components.l41.i(1, M0);
                        if (xdVar.f53813s0 >= i19 && xdVar.f53802k1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i20.L(z10);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.l41.B(-8, org.telegram.messenger.gd.M0(2131748172, null)));
                    }
                    if (xdVar.f53795d1) {
                        arrayList5.add(org.telegram.ui.Components.l41.b(org.telegram.messenger.gd.M0(2131748181, null)));
                        arrayList5.add(org.telegram.ui.Components.l41.j(3, xdVar.D0));
                        arrayList5.add(org.telegram.ui.Components.l41.B(-6, xdVar.f53819w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(xdVar.f53807p0).O0(Long.valueOf(-xdVar.f53809q0))) && org.telegram.messenger.mp.u1(xdVar.f53807p0).f25683j6) {
                    arrayList5.add(ki.g.i(4, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, xdVar.f53805o0), rn.i0(org.telegram.messenger.gd.M0(2131752463, null)), org.telegram.messenger.gd.M0(2131752464, null)));
                    arrayList5.add(org.telegram.ui.Components.l41.B(-7, null));
                }
                if (xdVar.f53793b1.a()) {
                    xdVar.S0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.l41.n(xdVar.U0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.l41.B(-10, null));
                return;
            case 3:
                rd rdVar = (rd) this.f45458b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var3 = (org.telegram.ui.Components.z41) obj2;
                td tdVar = rdVar.f51592f;
                int i21 = rdVar.d;
                int i22 = td.f52257y;
                if (i21 == 0) {
                    arrayList = tdVar.f52264r;
                } else {
                    arrayList = tdVar.f52263n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i23 = di.jb.f9107b;
                    org.telegram.ui.Components.l41 K3 = org.telegram.ui.Components.l41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.f37023r = true;
                    arrayList6.add(K3);
                }
                if (i21 == 0) {
                    str = tdVar.f52265s;
                } else {
                    str = tdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.l41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.l41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.l41.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                rn rnVar = (rn) this.f45458b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rnVar.getClass();
                    org.telegram.ui.Components.lc.b0(rnVar).g0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(rnVar.f51690k0);
                org.telegram.messenger.g0.E2(rnVar.f51687h0);
                org.telegram.messenger.g0.E2(rnVar.f51689j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.h3(new op((rq) this.f45458b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f45458b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qr qrVar = (qr) this.f45458b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var4 = (org.telegram.ui.Components.z41) obj2;
                TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.f51319b));
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.f51320c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748217, null)), org.telegram.messenger.o10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MobileVisibleInfo", null, 2131748216, org.telegram.messenger.o10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.l41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.l41 i24 = org.telegram.ui.Components.l41.i(2, org.telegram.messenger.gd.M0(2131754445, null));
                    i24.L(qrVar.Y);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.a0(null, null, 2131754444, org.telegram.messenger.o10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131754392, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.f51328y));
                    arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.l41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.l41.C(null));
                    org.telegram.ui.Components.l41 e10 = org.telegram.ui.Components.l41.e(1, org.telegram.messenger.gd.M0(2131751541, null));
                    e10.f37024s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.l41.C(null));
                if (qrVar.Z) {
                    org.telegram.messenger.g0.g3(new ir(qrVar, c22, 0));
                    qrVar.Z = false;
                    org.telegram.messenger.g0.h3(new gr(qrVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ns.a((ns) this.f45458b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                js jsVar = (js) this.f45458b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) obj2;
                ns nsVar = jsVar.f49073a;
                ls lsVar = nsVar.f50303l;
                if (lsVar != null) {
                    String join = TextUtils.join("", nsVar.f50306o);
                    if (x10Var != null) {
                        phVar = new org.telegram.ui.Components.ph(13, jsVar, x10Var);
                    }
                    lsVar.y(charSequence, join, phVar);
                    if (x10Var == null) {
                        nsVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ws wsVar = (ws) this.f45458b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var5 = (org.telegram.ui.Components.z41) obj2;
                arrayList8.add(org.telegram.ui.Components.l41.k(wsVar.T1));
                arrayList8.add(org.telegram.ui.Components.l41.C(null));
                ArrayList arrayList9 = wsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749297, null, arrayList8);
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(wsVar.f30189a).c2(l11);
                        if (c23 != null) {
                            int i25 = ah.q.f1106b;
                            org.telegram.ui.Components.l41 K4 = org.telegram.ui.Components.l41.K(ah.q.class);
                            K4.H = c23;
                            K4.L(wsVar.X1.contains(l11));
                            arrayList8.add(K4);
                            i14++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                cx cxVar = (cx) this.f45458b;
                Long l12 = (Long) obj2;
                cxVar.R1 = (Long) obj;
                cxVar.o5();
                return;
            case 12:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f45458b).run();
                return;
            case 13:
                rx rxVar = (rx) this.f45458b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var6 = (org.telegram.ui.Components.z41) obj2;
                String M02 = org.telegram.messenger.gd.M0(2131743752, null);
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.f37018m = M02;
                l41Var.f37016k = 2131624299;
                arrayList10.add(l41Var);
                org.telegram.ui.Components.l41 i26 = org.telegram.ui.Components.l41.i(1, org.telegram.messenger.gd.M0(2131743755, null));
                i26.L(rxVar.f51813c);
                arrayList10.add(i26);
                if (rxVar.f51813c) {
                    arrayList10.add(org.telegram.ui.Components.l41.C(null));
                    arrayList10.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131743751, null)));
                    r3 r3Var = new r3(rxVar, 6);
                    int i27 = px.f51032b;
                    org.telegram.ui.Components.l41 K5 = org.telegram.ui.Components.l41.K(px.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    if (!rxVar.f51814e) {
                        if (rxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.A = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131743750, null)));
                    return;
                }
                return;
            case 14:
                r90 r90Var = (r90) this.f45458b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                r90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.mp.u1(r90Var.f51541b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.v(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.f3.n(null, 2131754974, r90.d(), 2131624012, 36);
                        return;
                    } else {
                        r90.d().g0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                oc0 oc0Var = (oc0) this.f45458b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                de0 de0Var = oc0Var.Q;
                oc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    oc0Var.n();
                    de0Var.N1(false, true);
                    oc0Var.postDelayed(new n60(18, oc0Var, auth_authorization), 150L);
                    return;
                }
                de0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        oc0Var.c(true);
                        de0Var.M1(0, true, null, true);
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748990, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748988, "InvalidLastName"));
                        return;
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error4.text);
                        return;
                    }
                } else {
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, "InvalidCode"));
                    return;
                }
            case 16:
                as0 as0Var = (as0) this.f45458b;
                ui.b bVar3 = as0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                as0Var.f45662s = (Bitmap) obj;
                Paint paint = new Paint(1);
                as0Var.f45664x = paint;
                Bitmap bitmap2 = as0Var.f45662s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                as0Var.f45663w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                as0Var.f45664x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                as0Var.f45665y = new Matrix();
                bVar3.a(bitmap);
                ih.d.c(bVar3, as0Var.f45651c);
                as0Var.H.d();
                return;
            case 17:
                is0 is0Var = (is0) this.f45458b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var7 = (org.telegram.ui.Components.z41) obj2;
                String M03 = org.telegram.messenger.gd.M0(2131754274, null);
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(2);
                l41Var2.f37018m = M03;
                l41Var2.f37016k = 2131623947;
                arrayList11.add(l41Var2);
                org.telegram.ui.Components.l41 i28 = org.telegram.ui.Components.l41.i(1, org.telegram.messenger.gd.M0(2131754275, null));
                i28.L(is0Var.f48795n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.l41.B(2, null));
                if (is0Var.f48795n) {
                    i5.c.s(2131746682, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) is0Var.getMessagesController().L6);
                    l60 l60Var = new l60(9);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f31796c = a10;
                    s7Var.d = 20;
                    s7Var.f31797e = l60Var;
                    is0Var.f48791b.d((int) Utilities.k(is0Var.f48796r, 10000L, 0L), s7Var, new r3(is0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.l41.j(3, is0Var.f48791b));
                    if (is0Var.f48796r > 0) {
                        str2 = is0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.l41.B(4, str2));
                    TLRPC.Chat O03 = is0Var.getMessagesController().O0(Long.valueOf(is0Var.f48790a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        is0Var.f48792c.setLink(is0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131752376, null)));
                        arrayList11.add(org.telegram.ui.Components.l41.j(5, is0Var.f48792c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45458b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f43499e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f45458b;
                Bitmap bitmap3 = (Bitmap) obj;
                ui.b bVar4 = profileActivity.Q6;
                bVar4.a((Bitmap) obj2);
                ih.d.c(bVar4, profileActivity.fragmentView);
                profileActivity.R6.d();
                return;
            case 20:
                py0 py0Var = (py0) this.f45458b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var8 = (org.telegram.ui.Components.z41) obj2;
                org.telegram.ui.Components.e51 e51Var = py0Var.f51040f;
                qy0 qy0Var = py0Var.f51044w;
                ArrayList arrayList13 = qy0Var.f51382s1;
                di.n4 n4Var = py0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24121q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.l41 D = org.telegram.ui.Components.l41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.f37025t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.f24120p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.f51037b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.f51038c != null || py0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.f51038c != null) {
                        Context context2 = py0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.n6.L6;
                        int i30 = qy0.f51376w1;
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context2, i29, 21, 0, 0, false, false, qy0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = py0Var.f51037b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var2.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.f51038c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var2.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, n4Var2, qy0Var.J0);
                        org.telegram.ui.Components.l41 k10 = org.telegram.ui.Components.l41.k(n4Var2);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (py0Var.f51037b != null) {
                        for (int i31 = 0; i31 < py0Var.f51037b.options.size(); i31++) {
                            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(30);
                            l41Var3.f37018m = py0Var.f51037b.options.get(i31).text;
                            l41Var3.f37016k = 2131232061;
                            l41Var3.d = i31;
                            arrayList12.add(l41Var3);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.f51038c != null) {
                        for (int i32 = 0; i32 < py0Var.f51038c.options.size(); i32++) {
                            org.telegram.ui.Components.l41 l41Var4 = new org.telegram.ui.Components.l41(30);
                            l41Var4.f37018m = py0Var.f51038c.options.get(i32).text;
                            l41Var4.f37016k = 2131232061;
                            l41Var4.d = i32;
                            arrayList12.add(l41Var4);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.d != null) {
                        if (py0Var.f51041n == null) {
                            Context context3 = py0Var.getContext();
                            int i33 = qy0.f51376w1;
                            ny0 ny0Var = new ny0(py0Var, context3, qy0Var.J0);
                            py0Var.f51041n = ny0Var;
                            ny0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.i3 i3Var = py0Var.f51041n.d;
                        if (py0Var.d.optional) {
                            i11 = 2131746041;
                        } else {
                            i11 = 2131746047;
                        }
                        i3Var.setHint(org.telegram.messenger.gd.M0(i11, null));
                        org.telegram.ui.Components.l41 k11 = org.telegram.ui.Components.l41.k(py0Var.f51041n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = qy0Var.f51384u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746043;
                            } else {
                                i12 = 2131746046;
                            }
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(i12, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746042, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(qy0Var.f30189a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746045, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131746044, null)));
                        }
                        if (py0Var.f51042r == null) {
                            hi.d dVar = new hi.d(py0Var.getContext(), qy0Var.J0, true);
                            py0Var.f51043s = dVar;
                            dVar.i(org.telegram.messenger.gd.M0(2131746040, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(py0Var.getContext());
                            py0Var.f51042r = frameLayout;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29469h5, frameLayout, qy0Var.J0);
                            py0Var.f51042r.addView(py0Var.f51043s, c8.ma.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(py0Var.getContext());
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29397d7, view, qy0Var.J0);
                            py0Var.f51042r.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24120p, 48));
                        }
                        hi.d dVar2 = py0Var.f51043s;
                        if (!py0Var.d.optional && TextUtils.isEmpty(py0Var.f51041n.getText())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                        py0Var.f51043s.setOnClickListener(new j40(py0Var, 29));
                        org.telegram.ui.Components.l41 k12 = org.telegram.ui.Components.l41.k(py0Var.f51042r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l41) i5.c.h(1, arrayList12)).f37015j = true;
                    if (qy0Var.f51379p1 && py0Var.f51036a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(py0Var.getContext());
                        Drawable mutate = py0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.n6.f29360b7, qy0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.n6.f29339a7, qy0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(colorDrawable, mutate, 0, 0);
                        mqVar.f37616x = true;
                        frameLayout2.setBackground(mqVar);
                        org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(py0Var.getContext(), null);
                        k80Var.setTextSize(1, 14.0f);
                        k80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.M0(2131746038, null), qy0Var.J0, null));
                        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.A6, qy0Var.J0);
                        k80Var.setGravity(17);
                        frameLayout2.addView(k80Var, c8.ma.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.l41 k13 = org.telegram.ui.Components.l41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e51Var != null) {
                    int i34 = qy0.f51376w1;
                    if (qy0Var.f30192b.getMeasuredHeight() - org.telegram.messenger.g0.f24115m < org.telegram.messenger.g0.L(measuredHeight)) {
                        e51Var.f34606f3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    e51Var.f34606f3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.z41 z41Var9 = (org.telegram.ui.Components.z41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((uy0) this.f45458b).T1));
                return;
            case 22:
                org.telegram.ui.Components.z41 z41Var10 = (org.telegram.ui.Components.z41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((org.telegram.ui.Components.x20) this.f45458b).U1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f45458b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                a21 a21Var = (a21) this.f45458b;
                ArrayList arrayList14 = a21Var.f45434e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i35 = a21Var.f45431a;
                ArrayList arrayList15 = a21Var.d;
                if (tL_error6 != null) {
                    if (a21Var.f45437r) {
                        arrayList15.clear();
                        a21Var.f45437r = false;
                    }
                    a21Var.h = true;
                    a21Var.f45435f = false;
                    int size4 = arrayList14.size();
                    while (i14 < size4) {
                        Object obj6 = arrayList14.get(i14);
                        i14++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.mp.u1(i35).f4(channels_channelparticipants.users, false);
                org.telegram.messenger.mp.u1(i35).Z3(channels_channelparticipants.chats, false);
                if (a21Var.f45437r) {
                    arrayList15.clear();
                    a21Var.f45437r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i36 = 0;
                while (i36 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i36);
                    i36++;
                    TLObject g22 = org.telegram.messenger.mp.u1(i35).g2(org.telegram.messenger.n5.o(channelParticipant.peer));
                    if (g22 != null) {
                        arrayList15.add(g22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    a21Var.h = true;
                }
                a21Var.f45435f = false;
                int size6 = arrayList14.size();
                while (i14 < size6) {
                    Object obj7 = arrayList14.get(i14);
                    i14++;
                    ((Runnable) obj7).run();
                }
                return;
            case 26:
                c(obj, obj2);
                return;
            case 27:
                org.telegram.ui.Components.z41 z41Var11 = (org.telegram.ui.Components.z41) obj2;
                o31.f0((o31) this.f45458b, (ArrayList) obj);
                return;
            case 28:
                u31 u31Var = (u31) this.f45458b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var12 = (org.telegram.ui.Components.z41) obj2;
                LinearLayout linearLayout = u31Var.U1;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.l41.k(linearLayout));
                }
                LinearLayout linearLayout2 = u31Var.V1;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.l41.k(linearLayout2));
                    return;
                }
                return;
            default:
                i81 i81Var = (i81) this.f45458b;
                ui.b bVar5 = i81Var.F;
                Bitmap bitmap4 = (Bitmap) obj2;
                i81Var.f48649r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                i81Var.f48651w = paint2;
                Bitmap bitmap5 = i81Var.f48649r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                i81Var.f48650s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f13);
                i81Var.f48651w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                i81Var.f48652x = new Matrix();
                bVar5.a(bitmap4);
                ih.d.c(bVar5, i81Var.f48639b);
                i81Var.G.d();
                return;
        }
    }
}
