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
public final class a5 implements org.telegram.messenger.r10 {
    public final int f45467a;
    public final Object f45468b;

    public a5(Object obj, int i7) {
        this.f45467a = i7;
        this.f45468b = obj;
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
        b21 b21Var = (b21) this.f45468b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) obj2;
        a21 a21Var = b21Var.f45709c2;
        a21 a21Var2 = b21Var.f45708b2;
        TLRPC.User user = b21Var.U1;
        a21 a21Var3 = b21Var.f45707a2;
        if (a21Var3 != null) {
            ArrayList arrayList2 = a21Var3.d;
            if (a21Var2 != null) {
                ArrayList arrayList3 = a21Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.k10.i(b21Var.f30139a).e()));
                arrayList.add(org.telegram.ui.Components.o41.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (a21Var != null && !TextUtils.isEmpty(a21Var.f45443c.f28397q)) {
                    ArrayList arrayList4 = a21Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                            org.telegram.ui.Components.o41 w10 = org.telegram.ui.Components.o41.w(tLObject);
                            if (org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(b21Var.W1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (a21Var.f45445f) {
                        arrayList.add(org.telegram.ui.Components.o41.p(29));
                        arrayList.add(org.telegram.ui.Components.o41.p(29));
                        arrayList.add(org.telegram.ui.Components.o41.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.o41.k(b21Var.Z1));
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
                                    i13 = 2131752504;
                                } else {
                                    i13 = 2131749306;
                                }
                                arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                                org.telegram.ui.Components.o41 w11 = org.telegram.ui.Components.o41.w(user);
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
                                i12 = 2131752504;
                            } else {
                                i12 = 2131749306;
                            }
                            arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(i12, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                        org.telegram.ui.Components.o41 w12 = org.telegram.ui.Components.o41.w(tLObject2);
                        if (org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(b21Var.W1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (a21Var3.f45445f) {
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                    if (org.telegram.messenger.v3.V(b21Var.T1)) {
                        i11 = 2131752276;
                    } else {
                        i11 = 2131749235;
                    }
                    arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                    org.telegram.ui.Components.o41 w13 = org.telegram.ui.Components.o41.w(user);
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
                                i10 = 2131752276;
                            } else {
                                i10 = 2131749235;
                            }
                            arrayList.add(org.telegram.ui.Components.o41.r(org.telegram.messenger.hd.N0(i10, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                        org.telegram.ui.Components.o41 w14 = org.telegram.ui.Components.o41.w(tLObject3);
                        if (org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(b21Var.W1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && a21Var2.f45445f) {
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                    arrayList.add(org.telegram.ui.Components.o41.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        d21 d21Var = (d21) this.f45468b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) obj2;
        int i10 = d21Var.X1;
        fi.h6 h6Var = d21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.o41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.f12040i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj3;
            int i14 = j51.f48912c;
            org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(j51.class);
            K.v = 1;
            K.A = 0;
            K.H = gjVar;
            if (gjVar != null && (storyItem = gjVar.f24182l) != null) {
                j3 = storyItem.f28637id;
            } else {
                j3 = -1;
            }
            K.C = j3;
            K.f38052f = true;
            K.f38067w = i10;
            K.L(d21Var.W1.containsKey(Integer.valueOf(gjVar.e1())));
            K.v = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (h6Var.k() || !h6Var.f12049r) {
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
                org.telegram.ui.Components.o41 q10 = org.telegram.ui.Components.o41.q(i11, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.o41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        u31 u31Var = (u31) this.f45468b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) obj2;
        LinearLayout linearLayout = u31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.o41.k(linearLayout));
        }
        LinearLayout linearLayout2 = u31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.o41.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        int i7;
        int i10;
        o41 o41Var;
        ArrayList arrayList;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        float f10;
        String str2;
        int i11;
        boolean z10;
        int i12;
        float f11;
        float f12 = 0.25f;
        int i13 = 2;
        org.telegram.ui.Components.rh rhVar = null;
        boolean z11 = true;
        int i14 = 0;
        switch (this.f45467a) {
            case 0:
                b5 b5Var = (b5) this.f45468b;
                b5Var.f45738w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f45739x = false;
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
                i9 i9Var = (i9) this.f45468b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var = (org.telegram.ui.Components.c51) obj2;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList3 = i9Var.f48674x;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.o41 c10 = org.telegram.ui.Components.o41.c(1, 2131231771, org.telegram.messenger.hd.N0(2131749297, null));
                    c10.f38063r = true;
                    arrayList2.add(c10);
                    if (!i9Var.getUserConfig().X) {
                        org.telegram.ui.Components.o41 c11 = org.telegram.ui.Components.o41.c(2, 2131231765, org.telegram.messenger.hd.N0(2131749268, null));
                        c11.f38063r = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.o41.C(null));
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
                            int i16 = g9.f47958b;
                            org.telegram.ui.Components.o41 K = org.telegram.ui.Components.o41.K(g9.class);
                            K.H = O0;
                            K.E = l8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.o41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList3.get(i14);
                        i14++;
                        f9 f9Var = (f9) obj4;
                        oi.h1 h1Var = new oi.h1(8, i9Var, f9Var);
                        int i17 = d9.f46864b;
                        org.telegram.ui.Components.o41 K2 = org.telegram.ui.Components.o41.K(d9.class);
                        K2.H = f9Var;
                        K2.E = h1Var;
                        K2.L(i9Var.k0(f9Var.f47608c));
                        arrayList2.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.o41.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.o41.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.o41.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) this.f45468b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var2 = (org.telegram.ui.Components.c51) obj2;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.np.u1(xdVar.f53768p0).O0(Long.valueOf(-xdVar.f53770q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(xdVar.f53768p0).P0(-xdVar.f53770q0);
                if (P0 != null) {
                    i7 = P0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (xdVar.f53755c1) {
                    arrayList5.add(org.telegram.ui.Components.o41.g(xdVar.f53776t0));
                    o41 o41Var2 = xdVar.f53764m1;
                    if (o41Var2 != null && !o41Var2.f50470l) {
                        arrayList5.add(org.telegram.ui.Components.o41.h(5, i7, o41Var2));
                        arrayList5.add(org.telegram.ui.Components.o41.B(-1, null));
                    }
                    o41 o41Var3 = xdVar.n1;
                    if (o41Var3 != null && !o41Var3.f50470l) {
                        arrayList5.add(org.telegram.ui.Components.o41.h(2, i7, o41Var3));
                        arrayList5.add(org.telegram.ui.Components.o41.B(-2, null));
                    }
                }
                if (xdVar.f53756d1 && (o41Var = xdVar.f53767o1) != null && !o41Var.f50470l) {
                    arrayList5.add(org.telegram.ui.Components.o41.h(2, i7, o41Var));
                    arrayList5.add(org.telegram.ui.Components.o41.B(-3, null));
                }
                if (xdVar.f53769p1) {
                    arrayList5.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748192, null)));
                    arrayList5.add(org.telegram.ui.Components.o41.v(xdVar.f53771q1));
                    arrayList5.add(org.telegram.ui.Components.o41.v(xdVar.f53773r1));
                    arrayList5.add(org.telegram.ui.Components.o41.v(xdVar.f53775s1));
                    arrayList5.add(org.telegram.ui.Components.o41.B(-4, xdVar.f53779v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.f53755c1) {
                        arrayList5.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748213, null)));
                        arrayList5.add(org.telegram.ui.Components.o41.k(xdVar.f53781x0));
                        arrayList5.add(org.telegram.ui.Components.o41.B(-5, xdVar.f53778u0));
                        int i18 = org.telegram.messenger.np.u1(xdVar.f53768p0).C4;
                        String N0 = org.telegram.messenger.hd.N0(2131748172, null);
                        if (xdVar.f53774s0 < i18) {
                            i10 = i18;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f26895b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(0, new org.telegram.ui.ActionBar.v2(i10, context, null, false));
                            nqVar.f37908s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            N0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.o41 i19 = org.telegram.ui.Components.o41.i(1, N0);
                        i19.L((xdVar.f53774s0 < i18 || !xdVar.f53763k1) ? false : false);
                        arrayList5.add(i19);
                        arrayList5.add(org.telegram.ui.Components.o41.B(-8, org.telegram.messenger.hd.N0(2131748171, null)));
                    }
                    if (xdVar.f53756d1) {
                        arrayList5.add(org.telegram.ui.Components.o41.b(org.telegram.messenger.hd.N0(2131748180, null)));
                        arrayList5.add(org.telegram.ui.Components.o41.j(3, xdVar.D0));
                        arrayList5.add(org.telegram.ui.Components.o41.B(-6, xdVar.f53780w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.np.u1(xdVar.f53768p0).O0(Long.valueOf(-xdVar.f53770q0))) && org.telegram.messenger.np.u1(xdVar.f53768p0).f25844j6) {
                    arrayList5.add(ki.f.i(4, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, xdVar.f53766o0), rn.i0(org.telegram.messenger.hd.N0(2131752462, null)), org.telegram.messenger.hd.N0(2131752463, null)));
                    arrayList5.add(org.telegram.ui.Components.o41.B(-7, null));
                }
                if (xdVar.f53754b1.a()) {
                    xdVar.S0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.o41.n(xdVar.U0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.o41.B(-10, null));
                return;
            case 3:
                rd rdVar = (rd) this.f45468b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var3 = (org.telegram.ui.Components.c51) obj2;
                td tdVar = rdVar.f51592f;
                int i20 = rdVar.d;
                int i21 = td.f52251y;
                if (i20 == 0) {
                    arrayList = tdVar.f52258r;
                } else {
                    arrayList = tdVar.f52257n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i22 = di.jb.f9095b;
                    org.telegram.ui.Components.o41 K3 = org.telegram.ui.Components.o41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.f38063r = true;
                    arrayList6.add(K3);
                }
                if (i20 == 0) {
                    str = tdVar.f52259s;
                } else {
                    str = tdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.o41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.o41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.o41.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                rn rnVar = (rn) this.f45468b;
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
                org.telegram.messenger.g0.h3(new op((rq) this.f45468b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f45468b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qr qrVar = (qr) this.f45468b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var4 = (org.telegram.ui.Components.c51) obj2;
                TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.f51271b));
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.f51272c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748216, null)), org.telegram.messenger.p10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("MobileVisibleInfo", null, 2131748215, org.telegram.messenger.p10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.o41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.o41 i23 = org.telegram.ui.Components.o41.i(2, org.telegram.messenger.hd.N0(2131754444, null));
                    i23.L(qrVar.Y);
                    arrayList7.add(i23);
                    arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.a0(null, null, 2131754443, org.telegram.messenger.p10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131754391, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.f51280y));
                    arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.o41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.o41.C(null));
                    org.telegram.ui.Components.o41 e10 = org.telegram.ui.Components.o41.e(1, org.telegram.messenger.hd.N0(2131751540, null));
                    e10.f38064s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.o41.C(null));
                if (qrVar.Z) {
                    org.telegram.messenger.g0.g3(new ir(qrVar, c22, 0));
                    qrVar.Z = false;
                    org.telegram.messenger.g0.h3(new gr(qrVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ns.a((ns) this.f45468b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                js jsVar = (js) this.f45468b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj2;
                ns nsVar = jsVar.f49052a;
                ls lsVar = nsVar.f50302l;
                if (lsVar != null) {
                    String join = TextUtils.join("", nsVar.f50305o);
                    if (y10Var != null) {
                        rhVar = new org.telegram.ui.Components.rh(13, jsVar, y10Var);
                    }
                    lsVar.y(charSequence, join, rhVar);
                    if (y10Var == null) {
                        nsVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ws wsVar = (ws) this.f45468b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var5 = (org.telegram.ui.Components.c51) obj2;
                arrayList8.add(org.telegram.ui.Components.o41.k(wsVar.T1));
                arrayList8.add(org.telegram.ui.Components.o41.C(null));
                ArrayList arrayList9 = wsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749296, null, arrayList8);
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.np.u1(wsVar.f30139a).c2(l11);
                        if (c23 != null) {
                            int i24 = ah.q.f1106b;
                            org.telegram.ui.Components.o41 K4 = org.telegram.ui.Components.o41.K(ah.q.class);
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
                cx cxVar = (cx) this.f45468b;
                Long l12 = (Long) obj2;
                cxVar.R1 = (Long) obj;
                cxVar.o5();
                return;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f45468b).run();
                return;
            case 13:
                rx rxVar = (rx) this.f45468b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var6 = (org.telegram.ui.Components.c51) obj2;
                String N02 = org.telegram.messenger.hd.N0(2131743746, null);
                org.telegram.ui.Components.o41 o41Var4 = new org.telegram.ui.Components.o41(2);
                o41Var4.f38058m = N02;
                o41Var4.f38056k = 2131624299;
                arrayList10.add(o41Var4);
                org.telegram.ui.Components.o41 i25 = org.telegram.ui.Components.o41.i(1, org.telegram.messenger.hd.N0(2131743749, null));
                i25.L(rxVar.f51815c);
                arrayList10.add(i25);
                if (rxVar.f51815c) {
                    arrayList10.add(org.telegram.ui.Components.o41.C(null));
                    arrayList10.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131743745, null)));
                    r3 r3Var = new r3(rxVar, 6);
                    int i26 = px.f50934b;
                    org.telegram.ui.Components.o41 K5 = org.telegram.ui.Components.o41.K(px.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    if (!rxVar.f51816e) {
                        if (rxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.A = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131743744, null)));
                    return;
                }
                return;
            case 14:
                s90 s90Var = (s90) this.f45468b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                s90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.np.u1(s90Var.f51948b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.w(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.f3.n(null, 2131754974, s90.d(), 2131624012, 36);
                        return;
                    } else {
                        s90.d().g0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                pc0 pc0Var = (pc0) this.f45468b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                de0 de0Var = pc0Var.Q;
                pc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    pc0Var.n();
                    de0Var.N1(false, true);
                    pc0Var.postDelayed(new o60(18, pc0Var, auth_authorization), 150L);
                    return;
                }
                de0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        pc0Var.c(true);
                        de0Var.M1(0, true, null, true);
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748989, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748987, "InvalidLastName"));
                        return;
                    } else {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error4.text);
                        return;
                    }
                } else {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, "InvalidCode"));
                    return;
                }
            case 16:
                bs0 bs0Var = (bs0) this.f45468b;
                ui.b bVar2 = bs0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                bs0Var.f46292s = (Bitmap) obj;
                Paint paint = new Paint(1);
                bs0Var.f46294x = paint;
                Bitmap bitmap2 = bs0Var.f46292s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                bs0Var.f46293w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f12 = 0.05f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f12);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f10);
                bs0Var.f46294x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                bs0Var.f46295y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, bs0Var.f46281c);
                bs0Var.H.d();
                return;
            case 17:
                js0 js0Var = (js0) this.f45468b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var7 = (org.telegram.ui.Components.c51) obj2;
                String N03 = org.telegram.messenger.hd.N0(2131754273, null);
                org.telegram.ui.Components.o41 o41Var5 = new org.telegram.ui.Components.o41(2);
                o41Var5.f38058m = N03;
                o41Var5.f38056k = 2131623947;
                arrayList11.add(o41Var5);
                org.telegram.ui.Components.o41 i27 = org.telegram.ui.Components.o41.i(1, org.telegram.messenger.hd.N0(2131754274, null));
                i27.L(js0Var.f49058n);
                arrayList11.add(i27);
                arrayList11.add(org.telegram.ui.Components.o41.B(2, null));
                if (js0Var.f49058n) {
                    i5.c.s(2131746681, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.u7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) js0Var.getMessagesController().L6);
                    l60 l60Var = new l60(9);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.f31844c = a10;
                    t7Var.d = 20;
                    t7Var.f31845e = l60Var;
                    js0Var.f49054b.d((int) Utilities.k(js0Var.f49059r, 10000L, 0L), t7Var, new r3(js0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.o41.j(3, js0Var.f49054b));
                    if (js0Var.f49059r > 0) {
                        str2 = js0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.o41.B(4, str2));
                    TLRPC.Chat O03 = js0Var.getMessagesController().O0(Long.valueOf(js0Var.f49053a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        js0Var.f49055c.setLink(js0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131752375, null)));
                        arrayList11.add(org.telegram.ui.Components.o41.j(5, js0Var.f49055c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45468b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f43509e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f45468b;
                Bitmap bitmap3 = (Bitmap) obj;
                ui.b bVar3 = profileActivity.Q6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.R6.d();
                return;
            case 20:
                py0 py0Var = (py0) this.f45468b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.c51 c51Var8 = (org.telegram.ui.Components.c51) obj2;
                org.telegram.ui.Components.h51 h51Var = py0Var.f50942f;
                qy0 qy0Var = py0Var.f50946w;
                ArrayList arrayList13 = qy0Var.f51366s1;
                di.n4 n4Var = py0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24010q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.o41 D = org.telegram.ui.Components.o41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.f38065t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.f24009p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = py0Var.f50939b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.f50940c != null || py0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || py0Var.f50940c != null) {
                        Context context2 = py0Var.getContext();
                        int i28 = org.telegram.ui.ActionBar.m6.L6;
                        int i29 = qy0.f51360w1;
                        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i28, 21, 0, 0, false, false, qy0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = py0Var.f50939b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            o4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = py0Var.f50940c;
                            if (tL_reportResultChooseOption != null) {
                                o4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, o4Var, qy0Var.J0);
                        org.telegram.ui.Components.o41 k10 = org.telegram.ui.Components.o41.k(o4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (py0Var.f50939b != null) {
                        for (int i30 = 0; i30 < py0Var.f50939b.options.size(); i30++) {
                            org.telegram.ui.Components.o41 o41Var6 = new org.telegram.ui.Components.o41(30);
                            o41Var6.f38058m = py0Var.f50939b.options.get(i30).text;
                            o41Var6.f38056k = 2131232061;
                            o41Var6.d = i30;
                            arrayList12.add(o41Var6);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.f50940c != null) {
                        for (int i31 = 0; i31 < py0Var.f50940c.options.size(); i31++) {
                            org.telegram.ui.Components.o41 o41Var7 = new org.telegram.ui.Components.o41(30);
                            o41Var7.f38058m = py0Var.f50940c.options.get(i31).text;
                            o41Var7.f38056k = 2131232061;
                            o41Var7.d = i31;
                            arrayList12.add(o41Var7);
                            measuredHeight += 50;
                        }
                    } else if (py0Var.d != null) {
                        if (py0Var.f50943n == null) {
                            Context context3 = py0Var.getContext();
                            int i32 = qy0.f51360w1;
                            ny0 ny0Var = new ny0(py0Var, context3, qy0Var.J0);
                            py0Var.f50943n = ny0Var;
                            ny0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.j3 j3Var = py0Var.f50943n.d;
                        if (py0Var.d.optional) {
                            i11 = 2131746040;
                        } else {
                            i11 = 2131746046;
                        }
                        j3Var.setHint(org.telegram.messenger.hd.N0(i11, null));
                        org.telegram.ui.Components.o41 k11 = org.telegram.ui.Components.o41.k(py0Var.f50943n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = qy0Var.f51368u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746042;
                            } else {
                                i12 = 2131746045;
                            }
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(i12, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746041, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.np.u1(qy0Var.f30139a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746044, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131746043, null)));
                        }
                        if (py0Var.f50944r == null) {
                            hi.d dVar = new hi.d(py0Var.getContext(), qy0Var.J0, true);
                            py0Var.f50945s = dVar;
                            dVar.i(org.telegram.messenger.hd.N0(2131746039, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(py0Var.getContext());
                            py0Var.f50944r = frameLayout;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29420h5, frameLayout, qy0Var.J0);
                            py0Var.f50944r.addView(py0Var.f50945s, c8.na.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(py0Var.getContext());
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29348d7, view, qy0Var.J0);
                            py0Var.f50944r.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24009p, 48));
                        }
                        hi.d dVar2 = py0Var.f50945s;
                        if (!py0Var.d.optional && TextUtils.isEmpty(py0Var.f50943n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        py0Var.f50945s.setOnClickListener(new j40(py0Var, 29));
                        org.telegram.ui.Components.o41 k12 = org.telegram.ui.Components.o41.k(py0Var.f50944r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.o41) i5.c.h(1, arrayList12)).f38055j = true;
                    if (qy0Var.f51363p1 && py0Var.f50938a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(py0Var.getContext());
                        Drawable mutate = py0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.t6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.m6.f29311b7, qy0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.t6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.m6.f29290a7, qy0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(colorDrawable, mutate, 0, 0);
                        oqVar.f38309x = true;
                        frameLayout2.setBackground(oqVar);
                        org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(py0Var.getContext(), null);
                        m80Var.setTextSize(1, 14.0f);
                        m80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.N0(2131746037, null), qy0Var.J0, null));
                        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.A6, qy0Var.J0);
                        m80Var.setGravity(17);
                        frameLayout2.addView(m80Var, c8.na.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.o41 k13 = org.telegram.ui.Components.o41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (h51Var != null) {
                    int i33 = qy0.f51360w1;
                    if (qy0Var.f30142b.getMeasuredHeight() - org.telegram.messenger.g0.f24004m < org.telegram.messenger.g0.L(measuredHeight)) {
                        h51Var.f35741f3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    h51Var.f35741f3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.c51 c51Var9 = (org.telegram.ui.Components.c51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.o41.k(((uy0) this.f45468b).T1));
                return;
            case 22:
                org.telegram.ui.Components.c51 c51Var10 = (org.telegram.ui.Components.c51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.o41.k(((org.telegram.ui.Components.a30) this.f45468b).U1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f45468b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                a21 a21Var = (a21) this.f45468b;
                ArrayList arrayList14 = a21Var.f45444e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i34 = a21Var.f45441a;
                ArrayList arrayList15 = a21Var.d;
                if (tL_error6 != null) {
                    if (a21Var.f45447r) {
                        arrayList15.clear();
                        a21Var.f45447r = false;
                    }
                    a21Var.h = true;
                    a21Var.f45445f = false;
                    int size4 = arrayList14.size();
                    while (i14 < size4) {
                        Object obj6 = arrayList14.get(i14);
                        i14++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.np.u1(i34).f4(channels_channelparticipants.users, false);
                org.telegram.messenger.np.u1(i34).Z3(channels_channelparticipants.chats, false);
                if (a21Var.f45447r) {
                    arrayList15.clear();
                    a21Var.f45447r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i35 = 0;
                while (i35 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i35);
                    i35++;
                    TLObject g22 = org.telegram.messenger.np.u1(i34).g2(org.telegram.messenger.n5.o(channelParticipant.peer));
                    if (g22 != null) {
                        arrayList15.add(g22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    a21Var.h = true;
                }
                a21Var.f45445f = false;
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
                org.telegram.ui.Components.c51 c51Var11 = (org.telegram.ui.Components.c51) obj2;
                o31.f0((o31) this.f45468b, (ArrayList) obj);
                return;
            case 28:
                d(obj, obj2);
                return;
            default:
                i81 i81Var = (i81) this.f45468b;
                ui.b bVar4 = i81Var.F;
                Bitmap bitmap4 = (Bitmap) obj2;
                i81Var.f48660r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                i81Var.f48662w = paint2;
                Bitmap bitmap5 = i81Var.f48660r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                i81Var.f48661s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f12 = 0.05f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f11);
                i81Var.f48662w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                i81Var.f48663x = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, i81Var.f48650b);
                i81Var.G.d();
                return;
        }
    }
}
