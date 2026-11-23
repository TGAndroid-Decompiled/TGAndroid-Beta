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
public final class a5 implements org.telegram.messenger.p10 {
    public final int f45588a;
    public final Object f45589b;

    public a5(Object obj, int i7) {
        this.f45588a = i7;
        this.f45589b = obj;
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
        a21 a21Var = (a21) this.f45589b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj2;
        z11 z11Var = a21Var.f45570c2;
        z11 z11Var2 = a21Var.f45569b2;
        TLRPC.User user = a21Var.U1;
        z11 z11Var3 = a21Var.f45568a2;
        if (z11Var3 != null) {
            ArrayList arrayList2 = z11Var3.d;
            if (z11Var2 != null) {
                ArrayList arrayList3 = z11Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.i10.i(a21Var.f30223a).e()));
                arrayList.add(org.telegram.ui.Components.n41.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (z11Var != null && !TextUtils.isEmpty(z11Var.f54483c.f28491q)) {
                    ArrayList arrayList4 = z11Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject)));
                            org.telegram.ui.Components.n41 w10 = org.telegram.ui.Components.n41.w(tLObject);
                            if (org.telegram.messenger.n5.d(tLObject) == org.telegram.messenger.n5.d(a21Var.W1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (z11Var.f54485f) {
                        arrayList.add(org.telegram.ui.Components.n41.p(29));
                        arrayList.add(org.telegram.ui.Components.n41.p(29));
                        arrayList.add(org.telegram.ui.Components.n41.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.n41.k(a21Var.Z1));
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
                                if (org.telegram.messenger.v3.V(a21Var.T1)) {
                                    i13 = 2131752504;
                                } else {
                                    i13 = 2131749306;
                                }
                                arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                                org.telegram.ui.Components.n41 w11 = org.telegram.ui.Components.n41.w(user);
                                i7 = 29;
                                if (org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(a21Var.W1)) {
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
                            if (org.telegram.messenger.v3.V(a21Var.T1)) {
                                i12 = 2131752504;
                            } else {
                                i12 = 2131749306;
                            }
                            arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(i12, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject2)));
                        org.telegram.ui.Components.n41 w12 = org.telegram.ui.Components.n41.w(tLObject2);
                        if (org.telegram.messenger.n5.d(tLObject2) == org.telegram.messenger.n5.d(a21Var.W1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (z11Var3.f54485f) {
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.n5.d(user)))) {
                    if (org.telegram.messenger.v3.V(a21Var.T1)) {
                        i11 = 2131752276;
                    } else {
                        i11 = 2131749235;
                    }
                    arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(user)));
                    org.telegram.ui.Components.n41 w13 = org.telegram.ui.Components.n41.w(user);
                    if (org.telegram.messenger.n5.d(user) == org.telegram.messenger.n5.d(a21Var.W1)) {
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
                            if (org.telegram.messenger.v3.V(a21Var.T1)) {
                                i10 = 2131752276;
                            } else {
                                i10 = 2131749235;
                            }
                            arrayList.add(org.telegram.ui.Components.n41.r(org.telegram.messenger.gd.N0(i10, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.d(tLObject3)));
                        org.telegram.ui.Components.n41 w14 = org.telegram.ui.Components.n41.w(tLObject3);
                        if (org.telegram.messenger.n5.d(tLObject3) == org.telegram.messenger.n5.d(a21Var.W1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && z11Var2.f54485f) {
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                    arrayList.add(org.telegram.ui.Components.n41.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        c21 c21Var = (c21) this.f45589b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj2;
        int i10 = c21Var.X1;
        fi.h6 h6Var = c21Var.V1;
        if (h6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = h6Var.f12051i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj3;
            int i14 = i51.f48723c;
            org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(i51.class);
            K.v = 1;
            K.A = 0;
            K.H = fjVar;
            if (fjVar != null && (storyItem = fjVar.f24078l) != null) {
                j3 = storyItem.f28731id;
            } else {
                j3 = -1;
            }
            K.C = j3;
            K.f37649f = true;
            K.f37664w = i10;
            K.L(c21Var.W1.containsKey(Integer.valueOf(fjVar.e1())));
            K.v = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (h6Var.k() || !h6Var.f12060r) {
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
                org.telegram.ui.Components.n41 q10 = org.telegram.ui.Components.n41.q(i11, 34);
                q10.v = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.n41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        t31 t31Var = (t31) this.f45589b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj2;
        LinearLayout linearLayout = t31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.n41.k(linearLayout));
        }
        LinearLayout linearLayout2 = t31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.n41.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat O0;
        int i7;
        int i10;
        boolean z10;
        n41 n41Var;
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
        switch (this.f45588a) {
            case 0:
                b5 b5Var = (b5) this.f45589b;
                b5Var.f45920w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f45921x = false;
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
                j9 j9Var = (j9) this.f45589b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj2;
                boolean isEmpty = j9Var.G.isEmpty();
                ArrayList arrayList3 = j9Var.f49057x;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, 2131231774, org.telegram.messenger.gd.N0(2131749297, null));
                    c10.f37660r = true;
                    arrayList2.add(c10);
                    if (!j9Var.getUserConfig().X) {
                        org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, 2131231768, org.telegram.messenger.gd.N0(2131749268, null));
                        c11.f37660r = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.n41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = j9Var.G;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (O0 = j9Var.getMessagesController().O0(l10)) != null) {
                            m8 m8Var = new m8(j9Var, 0);
                            int i16 = h9.f48511b;
                            org.telegram.ui.Components.n41 K = org.telegram.ui.Components.n41.K(h9.class);
                            K.H = O0;
                            K.E = m8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.n41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        g9 g9Var = (g9) obj4;
                        oi.i1 i1Var = new oi.i1(8, j9Var, g9Var);
                        int i18 = e9.f47477b;
                        org.telegram.ui.Components.n41 K2 = org.telegram.ui.Components.n41.K(e9.class);
                        K2.H = g9Var;
                        K2.E = i1Var;
                        K2.L(j9Var.k0(g9Var.f48189c));
                        arrayList2.add(K2);
                    }
                    if (!j9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.n41.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.n41.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.n41.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) this.f45589b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var2 = (org.telegram.ui.Components.b51) obj2;
                xdVar.S0 = -1;
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(xdVar.f53935p0).O0(Long.valueOf(-xdVar.f53937q0));
                TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(xdVar.f53935p0).P0(-xdVar.f53937q0);
                if (P0 != null) {
                    i7 = P0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (xdVar.f53922c1) {
                    arrayList5.add(org.telegram.ui.Components.n41.g(xdVar.f53943t0));
                    n41 n41Var2 = xdVar.f53931m1;
                    if (n41Var2 != null && !n41Var2.f50217l) {
                        arrayList5.add(org.telegram.ui.Components.n41.h(5, i7, n41Var2));
                        arrayList5.add(org.telegram.ui.Components.n41.B(-1, null));
                    }
                    n41 n41Var3 = xdVar.n1;
                    if (n41Var3 != null && !n41Var3.f50217l) {
                        arrayList5.add(org.telegram.ui.Components.n41.h(2, i7, n41Var3));
                        arrayList5.add(org.telegram.ui.Components.n41.B(-2, null));
                    }
                }
                if (xdVar.f53923d1 && (n41Var = xdVar.f53934o1) != null && !n41Var.f50217l) {
                    arrayList5.add(org.telegram.ui.Components.n41.h(2, i7, n41Var));
                    arrayList5.add(org.telegram.ui.Components.n41.B(-3, null));
                }
                if (xdVar.f53936p1) {
                    arrayList5.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748192, null)));
                    arrayList5.add(org.telegram.ui.Components.n41.v(xdVar.f53938q1));
                    arrayList5.add(org.telegram.ui.Components.n41.v(xdVar.f53940r1));
                    arrayList5.add(org.telegram.ui.Components.n41.v(xdVar.f53942s1));
                    arrayList5.add(org.telegram.ui.Components.n41.B(-4, xdVar.f53946v0));
                }
                if (O02 != null && O02.creator) {
                    if (xdVar.f53922c1) {
                        arrayList5.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748213, null)));
                        arrayList5.add(org.telegram.ui.Components.n41.k(xdVar.f53948x0));
                        arrayList5.add(org.telegram.ui.Components.n41.B(-5, xdVar.f53945u0));
                        int i19 = org.telegram.messenger.mp.u1(xdVar.f53935p0).C4;
                        String N0 = org.telegram.messenger.gd.N0(2131748172, null);
                        if (xdVar.f53941s0 < i19) {
                            i10 = i19;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f27013b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(0, new org.telegram.ui.ActionBar.v2(i10, context, null, false));
                            kqVar.f36854s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            N0 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.n41 i20 = org.telegram.ui.Components.n41.i(1, N0);
                        if (xdVar.f53941s0 >= i19 && xdVar.f53930k1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i20.L(z10);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.n41.B(-8, org.telegram.messenger.gd.N0(2131748171, null)));
                    }
                    if (xdVar.f53923d1) {
                        arrayList5.add(org.telegram.ui.Components.n41.b(org.telegram.messenger.gd.N0(2131748180, null)));
                        arrayList5.add(org.telegram.ui.Components.n41.j(3, xdVar.D0));
                        arrayList5.add(org.telegram.ui.Components.n41.B(-6, xdVar.f53947w0));
                    }
                }
                if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(xdVar.f53935p0).O0(Long.valueOf(-xdVar.f53937q0))) && org.telegram.messenger.mp.u1(xdVar.f53935p0).f25776j6) {
                    arrayList5.add(ki.f.i(4, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, xdVar.f53933o0), rn.i0(org.telegram.messenger.gd.N0(2131752462, null)), org.telegram.messenger.gd.N0(2131752463, null)));
                    arrayList5.add(org.telegram.ui.Components.n41.B(-7, null));
                }
                if (xdVar.f53921b1.a()) {
                    xdVar.S0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.n41.n(xdVar.U0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.n41.B(-10, null));
                return;
            case 3:
                rd rdVar = (rd) this.f45589b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var3 = (org.telegram.ui.Components.b51) obj2;
                td tdVar = rdVar.f51707f;
                int i21 = rdVar.d;
                int i22 = td.f52361y;
                if (i21 == 0) {
                    arrayList = tdVar.f52368r;
                } else {
                    arrayList = tdVar.f52367n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i23 = di.jb.f9091b;
                    org.telegram.ui.Components.n41 K3 = org.telegram.ui.Components.n41.K(di.jb.class);
                    K3.H = (TL_stars.StarsTransaction) obj5;
                    K3.f37660r = true;
                    arrayList6.add(K3);
                }
                if (i21 == 0) {
                    str = tdVar.f52369s;
                } else {
                    str = tdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.n41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.n41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.n41.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                rn rnVar = (rn) this.f45589b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rnVar.getClass();
                    org.telegram.ui.Components.kc.b0(rnVar).g0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(rnVar.f51779k0);
                org.telegram.messenger.g0.E2(rnVar.f51776h0);
                org.telegram.messenger.g0.E2(rnVar.f51778j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.h3(new op((rq) this.f45589b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f45589b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qr qrVar = (qr) this.f45589b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var4 = (org.telegram.ui.Components.b51) obj2;
                TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.W));
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.f51519b));
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.f51520c));
                if (TextUtils.isEmpty(qrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748216, null)), org.telegram.messenger.n10.k(c22, true), "%1$s")));
                } else if (qrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MobileVisibleInfo", null, 2131748215, org.telegram.messenger.n10.k(c22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.n41.C(null));
                }
                if (qrVar.J && qrVar.L) {
                    org.telegram.ui.Components.n41 i24 = org.telegram.ui.Components.n41.i(2, org.telegram.messenger.gd.N0(2131754444, null));
                    i24.L(qrVar.Y);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.a0(null, null, 2131754443, org.telegram.messenger.n10.k(c22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.d));
                arrayList7.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131754391, null)));
                if (!qrVar.J) {
                    TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
                    if (d2 != null && d2.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.f51528y));
                    arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.E));
                    if (c22 != null && (userProfilePhoto = c22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.n41.k(qrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.n41.C(null));
                    org.telegram.ui.Components.n41 e10 = org.telegram.ui.Components.n41.e(1, org.telegram.messenger.gd.N0(2131751540, null));
                    e10.f37661s = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.n41.C(null));
                if (qrVar.Z) {
                    org.telegram.messenger.g0.g3(new ir(qrVar, c22, 0));
                    qrVar.Z = false;
                    org.telegram.messenger.g0.h3(new gr(qrVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ns.a((ns) this.f45589b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                js jsVar = (js) this.f45589b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) obj2;
                ns nsVar = jsVar.f49201a;
                ls lsVar = nsVar.f50414l;
                if (lsVar != null) {
                    String join = TextUtils.join("", nsVar.f50417o);
                    if (w10Var != null) {
                        phVar = new org.telegram.ui.Components.ph(14, jsVar, w10Var);
                    }
                    lsVar.K(charSequence, join, phVar);
                    if (w10Var == null) {
                        nsVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                vs vsVar = (vs) this.f45589b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var5 = (org.telegram.ui.Components.b51) obj2;
                arrayList8.add(org.telegram.ui.Components.n41.k(vsVar.T1));
                arrayList8.add(org.telegram.ui.Components.n41.C(null));
                ArrayList arrayList9 = vsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    i5.c.s(2131749296, null, arrayList8);
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User c23 = org.telegram.messenger.mp.u1(vsVar.f30223a).c2(l11);
                        if (c23 != null) {
                            int i25 = ah.q.f1106b;
                            org.telegram.ui.Components.n41 K4 = org.telegram.ui.Components.n41.K(ah.q.class);
                            K4.H = c23;
                            K4.L(vsVar.X1.contains(l11));
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
                bx bxVar = (bx) this.f45589b;
                Long l12 = (Long) obj2;
                bxVar.R1 = (Long) obj;
                bxVar.o5();
                return;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f45589b).run();
                return;
            case 13:
                qx qxVar = (qx) this.f45589b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var6 = (org.telegram.ui.Components.b51) obj2;
                String N02 = org.telegram.messenger.gd.N0(2131743742, null);
                org.telegram.ui.Components.n41 n41Var4 = new org.telegram.ui.Components.n41(2);
                n41Var4.f37655m = N02;
                n41Var4.f37653k = 2131624299;
                arrayList10.add(n41Var4);
                org.telegram.ui.Components.n41 i26 = org.telegram.ui.Components.n41.i(1, org.telegram.messenger.gd.N0(2131743745, null));
                i26.L(qxVar.f51552c);
                arrayList10.add(i26);
                if (qxVar.f51552c) {
                    arrayList10.add(org.telegram.ui.Components.n41.C(null));
                    arrayList10.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131743741, null)));
                    r3 r3Var = new r3(qxVar, 6);
                    int i27 = ox.f50779b;
                    org.telegram.ui.Components.n41 K5 = org.telegram.ui.Components.n41.K(ox.class);
                    K5.d = 2;
                    K5.H = r3Var;
                    if (!qxVar.f51553e) {
                        if (qxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.A = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131743740, null)));
                    return;
                }
                return;
            case 14:
                r90 r90Var = (r90) this.f45589b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                r90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.mp.u1(r90Var.f51668b).f4(tL_tones.users, false);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
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
                oc0 oc0Var = (oc0) this.f45589b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                de0 de0Var = oc0Var.Q;
                oc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    oc0Var.n();
                    de0Var.N1(false, true);
                    oc0Var.postDelayed(new i50(24, oc0Var, auth_authorization), 150L);
                    return;
                }
                de0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        oc0Var.c(true);
                        de0Var.M1(0, true, null, true);
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748989, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748987, "InvalidLastName"));
                        return;
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error4.text);
                        return;
                    }
                } else {
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, "InvalidCode"));
                    return;
                }
            case 16:
                zr0 zr0Var = (zr0) this.f45589b;
                ui.b bVar2 = zr0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                zr0Var.f54708s = (Bitmap) obj;
                Paint paint = new Paint(1);
                zr0Var.f54710x = paint;
                Bitmap bitmap2 = zr0Var.f54708s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                zr0Var.f54709w = bitmapShader;
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
                zr0Var.f54710x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                zr0Var.f54711y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, zr0Var.f54697c);
                zr0Var.H.d();
                return;
            case 17:
                hs0 hs0Var = (hs0) this.f45589b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var7 = (org.telegram.ui.Components.b51) obj2;
                String N03 = org.telegram.messenger.gd.N0(2131754273, null);
                org.telegram.ui.Components.n41 n41Var5 = new org.telegram.ui.Components.n41(2);
                n41Var5.f37655m = N03;
                n41Var5.f37653k = 2131623947;
                arrayList11.add(n41Var5);
                org.telegram.ui.Components.n41 i28 = org.telegram.ui.Components.n41.i(1, org.telegram.messenger.gd.N0(2131754274, null));
                i28.L(hs0Var.f48624n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.n41.B(2, null));
                if (hs0Var.f48624n) {
                    i5.c.s(2131746681, null, arrayList11);
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) hs0Var.getMessagesController().L6);
                    l60 l60Var = new l60(9);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f31865c = a10;
                    s7Var.d = 20;
                    s7Var.f31866e = l60Var;
                    hs0Var.f48620b.d((int) Utilities.k(hs0Var.f48625r, 10000L, 0L), s7Var, new r3(hs0Var, 21));
                    arrayList11.add(org.telegram.ui.Components.n41.j(3, hs0Var.f48620b));
                    if (hs0Var.f48625r > 0) {
                        str2 = hs0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.n41.B(4, str2));
                    TLRPC.Chat O03 = hs0Var.getMessagesController().O0(Long.valueOf(hs0Var.f48619a));
                    if (O03 != null && !TextUtils.isEmpty(org.telegram.messenger.v3.K(O03, false))) {
                        hs0Var.f48621c.setLink(hs0Var.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(O03, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.n41.u(org.telegram.messenger.gd.N0(2131752375, null)));
                        arrayList11.add(org.telegram.ui.Components.n41.j(5, hs0Var.f48621c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f45589b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f43625e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f45589b;
                Bitmap bitmap3 = (Bitmap) obj;
                ui.b bVar3 = profileActivity.Q6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.R6.d();
                return;
            case 20:
                oy0 oy0Var = (oy0) this.f45589b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.b51 b51Var8 = (org.telegram.ui.Components.b51) obj2;
                org.telegram.ui.Components.g51 g51Var = oy0Var.f50789f;
                py0 py0Var = oy0Var.f50793w;
                ArrayList arrayList13 = py0Var.f51193s1;
                di.n4 n4Var = oy0Var.h;
                if (n4Var.getMeasuredHeight() <= 0) {
                    n4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24226q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.n41 D = org.telegram.ui.Components.n41.D(n4Var.getMeasuredHeight());
                D.d = -1;
                D.f37662t = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((n4Var.getMeasuredHeight() / org.telegram.messenger.g0.f24225p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = oy0Var.f50786b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || oy0Var.f50787c != null || oy0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || oy0Var.f50787c != null) {
                        Context context2 = oy0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.n6.L6;
                        int i30 = py0.f51187w1;
                        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i29, 21, 0, 0, false, false, py0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = oy0Var.f50786b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            o4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = oy0Var.f50787c;
                            if (tL_reportResultChooseOption != null) {
                                o4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, o4Var, py0Var.J0);
                        org.telegram.ui.Components.n41 k10 = org.telegram.ui.Components.n41.k(o4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (oy0Var.f50786b != null) {
                        for (int i31 = 0; i31 < oy0Var.f50786b.options.size(); i31++) {
                            org.telegram.ui.Components.n41 n41Var6 = new org.telegram.ui.Components.n41(30);
                            n41Var6.f37655m = oy0Var.f50786b.options.get(i31).text;
                            n41Var6.f37653k = 2131232064;
                            n41Var6.d = i31;
                            arrayList12.add(n41Var6);
                            measuredHeight += 50;
                        }
                    } else if (oy0Var.f50787c != null) {
                        for (int i32 = 0; i32 < oy0Var.f50787c.options.size(); i32++) {
                            org.telegram.ui.Components.n41 n41Var7 = new org.telegram.ui.Components.n41(30);
                            n41Var7.f37655m = oy0Var.f50787c.options.get(i32).text;
                            n41Var7.f37653k = 2131232064;
                            n41Var7.d = i32;
                            arrayList12.add(n41Var7);
                            measuredHeight += 50;
                        }
                    } else if (oy0Var.d != null) {
                        if (oy0Var.f50790n == null) {
                            Context context3 = oy0Var.getContext();
                            int i33 = py0.f51187w1;
                            my0 my0Var = new my0(oy0Var, context3, py0Var.J0);
                            oy0Var.f50790n = my0Var;
                            my0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.j3 j3Var = oy0Var.f50790n.d;
                        if (oy0Var.d.optional) {
                            i11 = 2131746040;
                        } else {
                            i11 = 2131746046;
                        }
                        j3Var.setHint(org.telegram.messenger.gd.N0(i11, null));
                        org.telegram.ui.Components.n41 k11 = org.telegram.ui.Components.n41.k(oy0Var.f50790n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = py0Var.f51195u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746042;
                            } else {
                                i12 = 2131746045;
                            }
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(i12, null)));
                        } else if (org.telegram.messenger.n5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746041, null)));
                        } else if (org.telegram.messenger.v3.V(org.telegram.messenger.mp.u1(py0Var.f30223a).O0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746044, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.n41.C(org.telegram.messenger.gd.N0(2131746043, null)));
                        }
                        if (oy0Var.f50791r == null) {
                            hi.e eVar = new hi.e(oy0Var.getContext(), py0Var.J0, true);
                            oy0Var.f50792s = eVar;
                            eVar.i(org.telegram.messenger.gd.N0(2131746039, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(oy0Var.getContext());
                            oy0Var.f50791r = frameLayout;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, frameLayout, py0Var.J0);
                            oy0Var.f50791r.addView(oy0Var.f50792s, c8.na.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(oy0Var.getContext());
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, py0Var.J0);
                            oy0Var.f50791r.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24225p, 48));
                        }
                        hi.e eVar2 = oy0Var.f50792s;
                        if (!oy0Var.d.optional && TextUtils.isEmpty(oy0Var.f50790n.getText())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        eVar2.setEnabled(z11);
                        oy0Var.f50792s.setOnClickListener(new i40(oy0Var, 29));
                        org.telegram.ui.Components.n41 k12 = org.telegram.ui.Components.n41.k(oy0Var.f50791r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.n41) i5.c.h(1, arrayList12)).f37652j = true;
                    if (py0Var.f51190p1 && oy0Var.f50785a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(oy0Var.getContext());
                        Drawable mutate = oy0Var.getContext().getResources().getDrawable(2131231232).mutate();
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.n6.f29415b7, py0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.u6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.n6.f29394a7, py0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(colorDrawable, mutate, 0, 0);
                        lqVar.f37204x = true;
                        frameLayout2.setBackground(lqVar);
                        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(oy0Var.getContext(), null);
                        j80Var.setTextSize(1, 14.0f);
                        j80Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.gd.N0(2131746037, null), py0Var.J0, null));
                        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.A6, py0Var.J0);
                        j80Var.setGravity(17);
                        frameLayout2.addView(j80Var, c8.na.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.n41 k13 = org.telegram.ui.Components.n41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g51Var != null) {
                    int i34 = py0.f51187w1;
                    if (py0Var.f30226b.getMeasuredHeight() - org.telegram.messenger.g0.f24220m < org.telegram.messenger.g0.L(measuredHeight)) {
                        g51Var.f35322f3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    g51Var.f35322f3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.b51 b51Var9 = (org.telegram.ui.Components.b51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((ty0) this.f45589b).T1));
                return;
            case 22:
                org.telegram.ui.Components.b51 b51Var10 = (org.telegram.ui.Components.b51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.n41.k(((org.telegram.ui.Components.x20) this.f45589b).U1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f45589b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                z11 z11Var = (z11) this.f45589b;
                ArrayList arrayList14 = z11Var.f54484e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i35 = z11Var.f54481a;
                ArrayList arrayList15 = z11Var.d;
                if (tL_error6 != null) {
                    if (z11Var.f54487r) {
                        arrayList15.clear();
                        z11Var.f54487r = false;
                    }
                    z11Var.h = true;
                    z11Var.f54485f = false;
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
                if (z11Var.f54487r) {
                    arrayList15.clear();
                    z11Var.f54487r = false;
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
                    z11Var.h = true;
                }
                z11Var.f54485f = false;
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
                org.telegram.ui.Components.b51 b51Var11 = (org.telegram.ui.Components.b51) obj2;
                n31.f0((n31) this.f45589b, (ArrayList) obj);
                return;
            case 28:
                d(obj, obj2);
                return;
            default:
                g81 g81Var = (g81) this.f45589b;
                ui.b bVar4 = g81Var.F;
                Bitmap bitmap4 = (Bitmap) obj2;
                g81Var.f48182r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                g81Var.f48184w = paint2;
                Bitmap bitmap5 = g81Var.f48182r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                g81Var.f48183s = bitmapShader2;
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
                g81Var.f48184w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                g81Var.f48185x = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, g81Var.f48172b);
                g81Var.G.d();
                return;
        }
    }
}
