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
public final class a5 implements org.telegram.messenger.s10 {
    public final int f44936a;
    public final Object f44937b;

    public a5(Object obj, int i7) {
        this.f44936a = i7;
        this.f44937b = obj;
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
        x11 x11Var = (x11) this.f44937b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) obj2;
        w11 w11Var = x11Var.f53069c2;
        w11 w11Var2 = x11Var.f53068b2;
        TLRPC.User user = x11Var.U1;
        w11 w11Var3 = x11Var.f53067a2;
        if (w11Var3 != null) {
            ArrayList arrayList2 = w11Var3.d;
            if (w11Var2 != null) {
                ArrayList arrayList3 = w11Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.m10.i(x11Var.f29679a).e()));
                arrayList.add(org.telegram.ui.Components.b41.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (w11Var != null && !TextUtils.isEmpty(w11Var.f52361c.f28050q)) {
                    ArrayList arrayList4 = w11Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                            org.telegram.ui.Components.b41 w10 = org.telegram.ui.Components.b41.w(tLObject);
                            if (org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(x11Var.W1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (w11Var.f52363f) {
                        arrayList.add(org.telegram.ui.Components.b41.p(29));
                        arrayList.add(org.telegram.ui.Components.b41.p(29));
                        arrayList.add(org.telegram.ui.Components.b41.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.b41.k(x11Var.Z1));
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
                        if (org.telegram.messenger.m5.d((TLObject) obj4) == org.telegram.messenger.m5.d(user)) {
                            if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                                if (org.telegram.messenger.t3.V(x11Var.T1)) {
                                    i13 = 2131752516;
                                } else {
                                    i13 = 2131749499;
                                }
                                arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                                org.telegram.ui.Components.b41 w11 = org.telegram.ui.Components.b41.w(user);
                                i7 = 29;
                                if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(x11Var.W1)) {
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
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                        if (z10) {
                            if (org.telegram.messenger.t3.V(x11Var.T1)) {
                                i12 = 2131752516;
                            } else {
                                i12 = 2131749499;
                            }
                            arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(i12, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                        org.telegram.ui.Components.b41 w12 = org.telegram.ui.Components.b41.w(tLObject2);
                        if (org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(x11Var.W1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (w11Var3.f52363f) {
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                    if (org.telegram.messenger.t3.V(x11Var.T1)) {
                        i11 = 2131752288;
                    } else {
                        i11 = 2131749428;
                    }
                    arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                    org.telegram.ui.Components.b41 w13 = org.telegram.ui.Components.b41.w(user);
                    if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(x11Var.W1)) {
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
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)))) {
                        if (z11) {
                            if (org.telegram.messenger.t3.V(x11Var.T1)) {
                                i10 = 2131752288;
                            } else {
                                i10 = 2131749428;
                            }
                            arrayList.add(org.telegram.ui.Components.b41.r(org.telegram.messenger.hd.M0(i10, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                        org.telegram.ui.Components.b41 w14 = org.telegram.ui.Components.b41.w(tLObject3);
                        if (org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(x11Var.W1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && w11Var2.f52363f) {
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                    arrayList.add(org.telegram.ui.Components.b41.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        z11 z11Var = (z11) this.f44937b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) obj2;
        int i10 = z11Var.X1;
        fi.k6 k6Var = z11Var.V1;
        if (k6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = k6Var.f11944i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj3;
            int i14 = g51.f47339c;
            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g51.class);
            K.f33193u = 1;
            K.f33197z = 0;
            K.G = gjVar;
            if (gjVar != null && (storyItem = gjVar.f23824l) != null) {
                j3 = storyItem.f28290id;
            } else {
                j3 = -1;
            }
            K.B = j3;
            K.f33179f = true;
            K.v = i10;
            K.L(z11Var.W1.containsKey(Integer.valueOf(gjVar.e1())));
            K.f33193u = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (k6Var.k() || !k6Var.f11953r) {
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
                org.telegram.ui.Components.b41 q10 = org.telegram.ui.Components.b41.q(i11, 34);
                q10.f33193u = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.b41.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        r31 r31Var = (r31) this.f44937b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) obj2;
        LinearLayout linearLayout = r31Var.U1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.b41.k(linearLayout));
        }
        LinearLayout linearLayout2 = r31Var.V1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.b41.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        int i7;
        int i10;
        l41 l41Var;
        ArrayList arrayList;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        float f10;
        float f11;
        String str2;
        int i11;
        boolean z10;
        int i12;
        float f12;
        float f13;
        int i13 = 2;
        org.telegram.ui.Components.gh ghVar = null;
        boolean z11 = true;
        int i14 = 0;
        switch (this.f44936a) {
            case 0:
                b5 b5Var = (b5) this.f44937b;
                b5Var.f45586w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f45587x = false;
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
                i9 i9Var = (i9) this.f44937b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var = (org.telegram.ui.Components.p41) obj2;
                boolean isEmpty = i9Var.H.isEmpty();
                ArrayList arrayList3 = i9Var.f47975y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.b41 c10 = org.telegram.ui.Components.b41.c(1, 2131231770, org.telegram.messenger.hd.M0(2131749490, null));
                    c10.f33189q = true;
                    arrayList2.add(c10);
                    if (!i9Var.getUserConfig().X) {
                        org.telegram.ui.Components.b41 c11 = org.telegram.ui.Components.b41.c(2, 2131231764, org.telegram.messenger.hd.M0(2131749461, null));
                        c11.f33189q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.b41.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = i9Var.H;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = i9Var.getMessagesController().M0(l10)) != null) {
                            l8 l8Var = new l8(i9Var, 0);
                            int i16 = g9.f47378b;
                            org.telegram.ui.Components.b41 K = org.telegram.ui.Components.b41.K(g9.class);
                            K.G = M0;
                            K.D = l8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.b41.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList3.get(i14);
                        i14++;
                        f9 f9Var = (f9) obj4;
                        org.telegram.messenger.video.e eVar = new org.telegram.messenger.video.e(13, i9Var, f9Var);
                        int i17 = d9.f46311b;
                        org.telegram.ui.Components.b41 K2 = org.telegram.ui.Components.b41.K(d9.class);
                        K2.G = f9Var;
                        K2.D = eVar;
                        K2.L(i9Var.k0(f9Var.f47075c));
                        arrayList2.add(K2);
                    }
                    if (!i9Var.G) {
                        arrayList2.add(org.telegram.ui.Components.b41.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.b41.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.b41.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) this.f44937b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var2 = (org.telegram.ui.Components.p41) obj2;
                xdVar.S0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(xdVar.f53192p0).M0(Long.valueOf(-xdVar.f53194q0));
                TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(xdVar.f53192p0).N0(-xdVar.f53194q0);
                if (N0 != null) {
                    i7 = N0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (xdVar.f53179c1) {
                    arrayList5.add(org.telegram.ui.Components.b41.g(xdVar.f53200t0));
                    l41 l41Var2 = xdVar.f53188m1;
                    if (l41Var2 != null && !l41Var2.f48835l) {
                        arrayList5.add(org.telegram.ui.Components.b41.h(5, i7, l41Var2));
                        arrayList5.add(org.telegram.ui.Components.b41.B(-1, null));
                    }
                    l41 l41Var3 = xdVar.n1;
                    if (l41Var3 != null && !l41Var3.f48835l) {
                        arrayList5.add(org.telegram.ui.Components.b41.h(2, i7, l41Var3));
                        arrayList5.add(org.telegram.ui.Components.b41.B(-2, null));
                    }
                }
                if (xdVar.f53180d1 && (l41Var = xdVar.f53191o1) != null && !l41Var.f48835l) {
                    arrayList5.add(org.telegram.ui.Components.b41.h(2, i7, l41Var));
                    arrayList5.add(org.telegram.ui.Components.b41.B(-3, null));
                }
                if (xdVar.f53193p1) {
                    arrayList5.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748385, null)));
                    arrayList5.add(org.telegram.ui.Components.b41.v(xdVar.f53195q1));
                    arrayList5.add(org.telegram.ui.Components.b41.v(xdVar.f53197r1));
                    arrayList5.add(org.telegram.ui.Components.b41.v(xdVar.f53199s1));
                    arrayList5.add(org.telegram.ui.Components.b41.B(-4, xdVar.f53203v0));
                }
                if (M02 != null && M02.creator) {
                    if (xdVar.f53179c1) {
                        arrayList5.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748406, null)));
                        arrayList5.add(org.telegram.ui.Components.b41.k(xdVar.f53205x0));
                        arrayList5.add(org.telegram.ui.Components.b41.B(-5, xdVar.f53202u0));
                        int i18 = org.telegram.messenger.np.s1(xdVar.f53192p0).A4;
                        String M03 = org.telegram.messenger.hd.M0(2131748365, null);
                        if (xdVar.f53198s0 < i18) {
                            i10 = i18;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f26609b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(0, new org.telegram.ui.ActionBar.t2(i10, context, null, false));
                            eqVar.f34415s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.b41 i19 = org.telegram.ui.Components.b41.i(1, M03);
                        i19.L((xdVar.f53198s0 < i18 || !xdVar.f53187k1) ? false : false);
                        arrayList5.add(i19);
                        arrayList5.add(org.telegram.ui.Components.b41.B(-8, org.telegram.messenger.hd.M0(2131748364, null)));
                    }
                    if (xdVar.f53180d1) {
                        arrayList5.add(org.telegram.ui.Components.b41.b(org.telegram.messenger.hd.M0(2131748373, null)));
                        arrayList5.add(org.telegram.ui.Components.b41.j(3, xdVar.D0));
                        arrayList5.add(org.telegram.ui.Components.b41.B(-6, xdVar.f53204w0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(xdVar.f53192p0).M0(Long.valueOf(-xdVar.f53194q0))) && org.telegram.messenger.np.s1(xdVar.f53192p0).f25300h6) {
                    arrayList5.add(ki.g.i(4, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, xdVar.f53190o0), qn.i0(org.telegram.messenger.hd.M0(2131752474, null)), org.telegram.messenger.hd.M0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.b41.B(-7, null));
                }
                if (xdVar.f53178b1.a()) {
                    xdVar.S0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.b41.n(xdVar.U0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.b41.B(-10, null));
                return;
            case 3:
                rd rdVar = (rd) this.f44937b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var3 = (org.telegram.ui.Components.p41) obj2;
                td tdVar = rdVar.f50931f;
                int i20 = rdVar.d;
                int i21 = td.f51554y;
                if (i20 == 0) {
                    arrayList = tdVar.f51561r;
                } else {
                    arrayList = tdVar.f51560n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i22 = di.fb.f8568b;
                    org.telegram.ui.Components.b41 K3 = org.telegram.ui.Components.b41.K(di.fb.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f33189q = true;
                    arrayList6.add(K3);
                }
                if (i20 == 0) {
                    str = tdVar.f51562s;
                } else {
                    str = tdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.b41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.b41.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.b41.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                qn qnVar = (qn) this.f44937b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    qnVar.getClass();
                    org.telegram.ui.Components.cc.a0(qnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(qnVar.f50675k0);
                org.telegram.messenger.g0.E2(qnVar.f50672h0);
                org.telegram.messenger.g0.E2(qnVar.f50674j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.i3(new np((qq) this.f44937b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f44937b).M(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                pr prVar = (pr) this.f44937b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var4 = (org.telegram.ui.Components.p41) obj2;
                TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.W));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.f50337b));
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.f50338c));
                if (TextUtils.isEmpty(prVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748409, null)), org.telegram.messenger.q10.j(a22, true), "%1$s")));
                } else if (prVar.L) {
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MobileVisibleInfo", null, 2131748408, org.telegram.messenger.q10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.b41.C(null));
                }
                if (prVar.J && prVar.L) {
                    org.telegram.ui.Components.b41 i23 = org.telegram.ui.Components.b41.i(2, org.telegram.messenger.hd.M0(2131754447, null));
                    i23.L(prVar.Y);
                    arrayList7.add(i23);
                    arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.a0(null, null, 2131754446, org.telegram.messenger.q10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.b41.k(prVar.d));
                arrayList7.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131754394, null)));
                if (!prVar.J) {
                    TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.I);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.b41.k(prVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.b41.k(prVar.f50346y));
                    arrayList7.add(org.telegram.ui.Components.b41.k(prVar.E));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.b41.k(prVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.b41.C(null));
                    org.telegram.ui.Components.b41 e10 = org.telegram.ui.Components.b41.e(1, org.telegram.messenger.hd.M0(2131751552, null));
                    e10.f33190r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.b41.C(null));
                if (prVar.Z) {
                    org.telegram.messenger.g0.h3(new hr(prVar, a22, 0));
                    prVar.Z = false;
                    org.telegram.messenger.g0.i3(new fr(prVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ns.a((ns) this.f44937b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                js jsVar = (js) this.f44937b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj2;
                ns nsVar = jsVar.f48406a;
                ls lsVar = nsVar.f49656l;
                if (lsVar != null) {
                    String join = TextUtils.join("", nsVar.f49659o);
                    if (z10Var != null) {
                        ghVar = new org.telegram.ui.Components.gh(14, jsVar, z10Var);
                    }
                    lsVar.y(charSequence, join, ghVar);
                    if (z10Var == null) {
                        nsVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                vs vsVar = (vs) this.f44937b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var5 = (org.telegram.ui.Components.p41) obj2;
                arrayList8.add(org.telegram.ui.Components.b41.k(vsVar.T1));
                arrayList8.add(org.telegram.ui.Components.b41.C(null));
                ArrayList arrayList9 = vsVar.W1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749489, null)));
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.np.s1(vsVar.f29679a).a2(l11);
                        if (a23 != null) {
                            int i24 = ah.q.f1107b;
                            org.telegram.ui.Components.b41 K4 = org.telegram.ui.Components.b41.K(ah.q.class);
                            K4.G = a23;
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
                yw ywVar = (yw) this.f44937b;
                Long l12 = (Long) obj2;
                ywVar.R1 = (Long) obj;
                ywVar.g5();
                return;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f44937b).run();
                return;
            case 13:
                ox oxVar = (ox) this.f44937b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var6 = (org.telegram.ui.Components.p41) obj2;
                String M04 = org.telegram.messenger.hd.M0(2131743989, null);
                org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(2);
                b41Var.f33184l = M04;
                b41Var.f33183k = 2131624299;
                arrayList10.add(b41Var);
                org.telegram.ui.Components.b41 i25 = org.telegram.ui.Components.b41.i(1, org.telegram.messenger.hd.M0(2131743990, null));
                i25.L(oxVar.f50052c);
                arrayList10.add(i25);
                if (oxVar.f50052c) {
                    arrayList10.add(org.telegram.ui.Components.b41.C(null));
                    arrayList10.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131743988, null)));
                    r3 r3Var = new r3(oxVar, 6);
                    int i26 = mx.f49328b;
                    org.telegram.ui.Components.b41 K5 = org.telegram.ui.Components.b41.K(mx.class);
                    K5.d = 2;
                    K5.G = r3Var;
                    if (!oxVar.f50053e) {
                        if (oxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.f33197z = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131743987, null)));
                    return;
                }
                return;
            case 14:
                q90 q90Var = (q90) this.f44937b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                q90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.np.s1(q90Var.f50502b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.k5.n(null, 2131754974, q90.d(), 2131624012, 36);
                        return;
                    } else {
                        q90.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                oc0 oc0Var = (oc0) this.f44937b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ce0 ce0Var = oc0Var.Q;
                oc0Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    oc0Var.n();
                    ce0Var.N1(false, true);
                    oc0Var.postDelayed(new g50(23, oc0Var, auth_authorization), 150L);
                    return;
                }
                ce0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        oc0Var.c(true);
                        ce0Var.M1(0, true, null, true);
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749182, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749180, "InvalidLastName"));
                        return;
                    } else {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error4.text);
                        return;
                    }
                } else {
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, "InvalidCode"));
                    return;
                }
            case 16:
                xr0 xr0Var = (xr0) this.f44937b;
                ui.b bVar2 = xr0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                xr0Var.f53307s = (Bitmap) obj;
                Paint paint = new Paint(1);
                xr0Var.f53309x = paint;
                Bitmap bitmap2 = xr0Var.f53307s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                xr0Var.f53308w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                xr0Var.f53309x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                xr0Var.f53310y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, xr0Var.f53296c);
                xr0Var.H.d();
                return;
            case 17:
                es0 es0Var = (es0) this.f44937b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var7 = (org.telegram.ui.Components.p41) obj2;
                String M05 = org.telegram.messenger.hd.M0(2131754276, null);
                org.telegram.ui.Components.b41 b41Var2 = new org.telegram.ui.Components.b41(2);
                b41Var2.f33184l = M05;
                b41Var2.f33183k = 2131623947;
                arrayList11.add(b41Var2);
                org.telegram.ui.Components.b41 i27 = org.telegram.ui.Components.b41.i(1, org.telegram.messenger.hd.M0(2131754277, null));
                i27.L(es0Var.f46897n);
                arrayList11.add(i27);
                arrayList11.add(org.telegram.ui.Components.b41.B(2, null));
                if (es0Var.f46897n) {
                    arrayList11.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131746875, null)));
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) es0Var.getMessagesController().J6);
                    t70 t70Var = new t70(8);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.f31358c = a10;
                    r7Var.d = 20;
                    r7Var.f31359e = t70Var;
                    es0Var.f46893b.d((int) Utilities.k(es0Var.f46898r, 10000L, 0L), r7Var, new r3(es0Var, 20));
                    arrayList11.add(org.telegram.ui.Components.b41.j(3, es0Var.f46893b));
                    if (es0Var.f46898r > 0) {
                        str2 = es0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.b41.B(4, str2));
                    TLRPC.Chat M06 = es0Var.getMessagesController().M0(Long.valueOf(es0Var.f46892a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        es0Var.f46894c.setLink(es0Var.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.b41.j(5, es0Var.f46894c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44937b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f43054e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f44937b;
                Bitmap bitmap3 = (Bitmap) obj;
                ui.b bVar3 = profileActivity.O6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.P6.d();
                return;
            case 20:
                ly0 ly0Var = (ly0) this.f44937b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.p41 p41Var8 = (org.telegram.ui.Components.p41) obj2;
                org.telegram.ui.Components.u41 u41Var = ly0Var.f49061f;
                my0 my0Var = ly0Var.f49065w;
                ArrayList arrayList13 = my0Var.f49345s1;
                di.k4 k4Var = ly0Var.h;
                if (k4Var.getMeasuredHeight() <= 0) {
                    k4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23611q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.b41 D = org.telegram.ui.Components.b41.D(k4Var.getMeasuredHeight());
                D.d = -1;
                D.f33191s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((k4Var.getMeasuredHeight() / org.telegram.messenger.g0.f23610p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ly0Var.f49058b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || ly0Var.f49059c != null || ly0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || ly0Var.f49059c != null) {
                        Context context2 = ly0Var.getContext();
                        int i28 = org.telegram.ui.ActionBar.j6.L6;
                        int i29 = my0.f49339w1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i28, 21, 0, 0, false, false, my0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = ly0Var.f49058b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ly0Var.f49059c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, n4Var, my0Var.J0);
                        org.telegram.ui.Components.b41 k10 = org.telegram.ui.Components.b41.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (ly0Var.f49058b != null) {
                        for (int i30 = 0; i30 < ly0Var.f49058b.options.size(); i30++) {
                            org.telegram.ui.Components.b41 b41Var3 = new org.telegram.ui.Components.b41(30);
                            b41Var3.f33184l = ly0Var.f49058b.options.get(i30).text;
                            b41Var3.f33183k = 2131232060;
                            b41Var3.d = i30;
                            arrayList12.add(b41Var3);
                            measuredHeight += 50;
                        }
                    } else if (ly0Var.f49059c != null) {
                        for (int i31 = 0; i31 < ly0Var.f49059c.options.size(); i31++) {
                            org.telegram.ui.Components.b41 b41Var4 = new org.telegram.ui.Components.b41(30);
                            b41Var4.f33184l = ly0Var.f49059c.options.get(i31).text;
                            b41Var4.f33183k = 2131232060;
                            b41Var4.d = i31;
                            arrayList12.add(b41Var4);
                            measuredHeight += 50;
                        }
                    } else if (ly0Var.d != null) {
                        if (ly0Var.f49062n == null) {
                            Context context3 = ly0Var.getContext();
                            int i32 = my0.f49339w1;
                            jy0 jy0Var = new jy0(ly0Var, context3, my0Var.J0);
                            ly0Var.f49062n = jy0Var;
                            jy0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.i3 i3Var = ly0Var.f49062n.d;
                        if (ly0Var.d.optional) {
                            i11 = 2131746236;
                        } else {
                            i11 = 2131746242;
                        }
                        i3Var.setHint(org.telegram.messenger.hd.M0(i11, null));
                        org.telegram.ui.Components.b41 k11 = org.telegram.ui.Components.b41.k(ly0Var.f49062n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = my0Var.f49347u1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746238;
                            } else {
                                i12 = 2131746241;
                            }
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(i12, null)));
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746237, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.np.s1(my0Var.f29679a).M0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746240, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131746239, null)));
                        }
                        if (ly0Var.f49063r == null) {
                            hi.d dVar = new hi.d(ly0Var.getContext(), my0Var.J0, true);
                            ly0Var.f49064s = dVar;
                            dVar.i(org.telegram.messenger.hd.M0(2131746235, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(ly0Var.getContext());
                            ly0Var.f49063r = frameLayout;
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, frameLayout, my0Var.J0);
                            ly0Var.f49063r.addView(ly0Var.f49064s, c8.ja.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(ly0Var.getContext());
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, my0Var.J0);
                            ly0Var.f49063r.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.f23610p, 48));
                        }
                        hi.d dVar2 = ly0Var.f49064s;
                        if (!ly0Var.d.optional && TextUtils.isEmpty(ly0Var.f49062n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        ly0Var.f49064s.setOnClickListener(new g40(ly0Var, 29));
                        org.telegram.ui.Components.b41 k12 = org.telegram.ui.Components.b41.k(ly0Var.f49063r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.b41) i5.c.h(1, arrayList12)).f33182j = true;
                    if (my0Var.f49342p1 && ly0Var.f49057a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(ly0Var.getContext());
                        Drawable mutate = ly0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.q6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.j6.f28813b7, my0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.q6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.j6.f28792a7, my0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(colorDrawable, mutate, 0, 0);
                        fqVar.f34682x = true;
                        frameLayout2.setBackground(fqVar);
                        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(ly0Var.getContext(), null);
                        z70Var.setTextSize(1, 14.0f);
                        z70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.M0(2131746233, null), my0Var.J0, null));
                        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.A6, my0Var.J0);
                        z70Var.setGravity(17);
                        frameLayout2.addView(z70Var, c8.ja.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.b41 k13 = org.telegram.ui.Components.b41.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (u41Var != null) {
                    int i33 = my0.f49339w1;
                    if (my0Var.f29682b.getMeasuredHeight() - org.telegram.messenger.g0.f23605m < org.telegram.messenger.g0.L(measuredHeight)) {
                        u41Var.f39891f3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    u41Var.f39891f3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.p41 p41Var9 = (org.telegram.ui.Components.p41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.b41.k(((qy0) this.f44937b).T1));
                return;
            case 22:
                org.telegram.ui.Components.p41 p41Var10 = (org.telegram.ui.Components.p41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.b41.k(((org.telegram.ui.Components.p20) this.f44937b).U1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f44937b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                w11 w11Var = (w11) this.f44937b;
                ArrayList arrayList14 = w11Var.f52362e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i34 = w11Var.f52359a;
                ArrayList arrayList15 = w11Var.d;
                if (tL_error6 != null) {
                    if (w11Var.f52365r) {
                        arrayList15.clear();
                        w11Var.f52365r = false;
                    }
                    w11Var.h = true;
                    w11Var.f52363f = false;
                    int size4 = arrayList14.size();
                    while (i14 < size4) {
                        Object obj6 = arrayList14.get(i14);
                        i14++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.np.s1(i34).Y3(channels_channelparticipants.users, false);
                org.telegram.messenger.np.s1(i34).S3(channels_channelparticipants.chats, false);
                if (w11Var.f52365r) {
                    arrayList15.clear();
                    w11Var.f52365r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i35 = 0;
                while (i35 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i35);
                    i35++;
                    TLObject e22 = org.telegram.messenger.np.s1(i34).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                    if (e22 != null) {
                        arrayList15.add(e22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    w11Var.h = true;
                }
                w11Var.f52363f = false;
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
                org.telegram.ui.Components.p41 p41Var11 = (org.telegram.ui.Components.p41) obj2;
                k31.f0((k31) this.f44937b, (ArrayList) obj);
                return;
            case 28:
                d(obj, obj2);
                return;
            default:
                e81 e81Var = (e81) this.f44937b;
                ui.b bVar4 = e81Var.F;
                Bitmap bitmap4 = (Bitmap) obj2;
                e81Var.f46632r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                e81Var.f46634w = paint2;
                Bitmap bitmap5 = e81Var.f46632r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                e81Var.f46633s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f13);
                e81Var.f46634w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                e81Var.f46635x = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, e81Var.f46622b);
                e81Var.G.d();
                return;
        }
    }
}
