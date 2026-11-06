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
public final class a5 implements org.telegram.messenger.v10 {
    public final int f43543a;
    public final Object f43544b;

    public a5(Object obj, int i7) {
        this.f43543a = i7;
        this.f43544b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        a21 a21Var = (a21) this.f43544b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
        z11 z11Var = a21Var.Y1;
        z11 z11Var2 = a21Var.X1;
        TLRPC.User user = a21Var.Q1;
        z11 z11Var3 = a21Var.W1;
        if (z11Var3 != null) {
            ArrayList arrayList2 = z11Var3.d;
            if (z11Var2 != null) {
                ArrayList arrayList3 = z11Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.p10.i(a21Var.f28612a).e()));
                arrayList.add(org.telegram.ui.Components.r31.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (z11Var != null && !TextUtils.isEmpty(z11Var.f52423c.f26951q)) {
                    ArrayList arrayList4 = z11Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                            org.telegram.ui.Components.r31 w10 = org.telegram.ui.Components.r31.w(tLObject);
                            if (org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(a21Var.S1)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            w10.L(z15);
                            arrayList.add(w10);
                        }
                    }
                    if (z11Var.f52425f) {
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.r31.k(a21Var.V1));
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
                                if (org.telegram.messenger.t3.V(a21Var.P1)) {
                                    i13 = 2131752516;
                                } else {
                                    i13 = 2131749498;
                                }
                                arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.hd.M0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                                org.telegram.ui.Components.r31 w11 = org.telegram.ui.Components.r31.w(user);
                                i7 = 29;
                                if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(a21Var.S1)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                w11.L(z14);
                                arrayList.add(w11);
                                z9 = false;
                            }
                        }
                    }
                }
                i7 = 29;
                z9 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                        if (z9) {
                            if (org.telegram.messenger.t3.V(a21Var.P1)) {
                                i12 = 2131752516;
                            } else {
                                i12 = 2131749498;
                            }
                            arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.hd.M0(i12, null)));
                            z9 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                        org.telegram.ui.Components.r31 w12 = org.telegram.ui.Components.r31.w(tLObject2);
                        if (org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(a21Var.S1)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        w12.L(z13);
                        arrayList.add(w12);
                    }
                }
                if (z11Var3.f52425f) {
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                    if (org.telegram.messenger.t3.V(a21Var.P1)) {
                        i11 = 2131752288;
                    } else {
                        i11 = 2131749427;
                    }
                    arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.hd.M0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                    org.telegram.ui.Components.r31 w13 = org.telegram.ui.Components.r31.w(user);
                    if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(a21Var.S1)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    w13.L(z12);
                    arrayList.add(w13);
                    z10 = false;
                } else {
                    z10 = true;
                }
                int size4 = arrayList3.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj6 = arrayList3.get(i17);
                    i17++;
                    TLObject tLObject3 = (TLObject) obj6;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)))) {
                        if (z10) {
                            if (org.telegram.messenger.t3.V(a21Var.P1)) {
                                i10 = 2131752288;
                            } else {
                                i10 = 2131749427;
                            }
                            arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.hd.M0(i10, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                        org.telegram.ui.Components.r31 w14 = org.telegram.ui.Components.r31.w(tLObject3);
                        if (org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(a21Var.S1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w14.L(z11);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && z11Var2.f52425f) {
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                    arrayList.add(org.telegram.ui.Components.r31.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        c21 c21Var = (c21) this.f43544b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
        int i10 = c21Var.T1;
        di.q6 q6Var = c21Var.R1;
        if (q6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = q6Var.f9643i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj3;
            int i14 = j51.f46824c;
            org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(j51.class);
            K.f37607u = 1;
            K.f37611z = 0;
            K.G = ijVar;
            if (ijVar != null && (storyItem = ijVar.f23241l) != null) {
                j3 = storyItem.f27191id;
            } else {
                j3 = -1;
            }
            K.B = j3;
            K.f37593f = true;
            K.v = i10;
            K.L(c21Var.S1.containsKey(Integer.valueOf(ijVar.f1())));
            K.f37607u = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (q6Var.k() || !q6Var.f9652r) {
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
                org.telegram.ui.Components.r31 q10 = org.telegram.ui.Components.r31.q(i11, 34);
                q10.f37607u = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        t31 t31Var = (t31) this.f43544b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
        LinearLayout linearLayout = t31Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout));
        }
        LinearLayout linearLayout2 = t31Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        int i7;
        int i10;
        boolean z9;
        o41 o41Var;
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
        org.telegram.ui.Components.ex exVar = null;
        int i14 = 0;
        switch (this.f43543a) {
            case 0:
                b5 b5Var = (b5) this.f43544b;
                b5Var.f44175w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f44176x = false;
                ri.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.f43544b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList3 = i9Var.f46603y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(1, 2131231770, org.telegram.messenger.hd.M0(2131749489, null));
                    c10.f37603q = true;
                    arrayList2.add(c10);
                    if (!i9Var.getUserConfig().W) {
                        org.telegram.ui.Components.r31 c11 = org.telegram.ui.Components.r31.c(2, 2131231764, org.telegram.messenger.hd.M0(2131749460, null));
                        c11.f37603q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = i9Var.G;
                    int size = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = i9Var.getMessagesController().M0(l10)) != null) {
                            k8 k8Var = new k8(i9Var, 0);
                            int i16 = g9.f45897b;
                            org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(g9.class);
                            K.G = M0;
                            K.D = k8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        f9 f9Var = (f9) obj4;
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(6, i9Var, f9Var);
                        int i18 = d9.f45003b;
                        org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(d9.class);
                        K2.G = f9Var;
                        K2.D = l1Var;
                        K2.L(i9Var.k0(f9Var.f45569c));
                        arrayList2.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.r31.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.r31.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.r31.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zd zdVar = (zd) this.f43544b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var2 = (org.telegram.ui.Components.f41) obj2;
                zdVar.R0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(zdVar.f52537o0).M0(Long.valueOf(-zdVar.f52539p0));
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(zdVar.f52537o0).N0(-zdVar.f52539p0);
                if (N0 != null) {
                    i7 = N0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (zdVar.f52525b1) {
                    arrayList5.add(org.telegram.ui.Components.r31.g(zdVar.f52545s0));
                    o41 o41Var2 = zdVar.l1;
                    if (o41Var2 != null && !o41Var2.f48234l) {
                        arrayList5.add(org.telegram.ui.Components.r31.h(5, i7, o41Var2));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-1, null));
                    }
                    o41 o41Var3 = zdVar.f52535m1;
                    if (o41Var3 != null && !o41Var3.f48234l) {
                        arrayList5.add(org.telegram.ui.Components.r31.h(2, i7, o41Var3));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-2, null));
                    }
                }
                if (zdVar.f52526c1 && (o41Var = zdVar.n1) != null && !o41Var.f48234l) {
                    arrayList5.add(org.telegram.ui.Components.r31.h(2, i7, o41Var));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-3, null));
                }
                if (zdVar.f52538o1) {
                    arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.hd.M0(2131748384, null)));
                    arrayList5.add(org.telegram.ui.Components.r31.v(zdVar.f52540p1));
                    arrayList5.add(org.telegram.ui.Components.r31.v(zdVar.f52542q1));
                    arrayList5.add(org.telegram.ui.Components.r31.v(zdVar.f52544r1));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-4, zdVar.f52548u0));
                }
                if (M02 != null && M02.creator) {
                    if (zdVar.f52525b1) {
                        arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.hd.M0(2131748405, null)));
                        arrayList5.add(org.telegram.ui.Components.r31.k(zdVar.f52550w0));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-5, zdVar.f52547t0));
                        int i19 = org.telegram.messenger.qp.s1(zdVar.f52537o0).f24943z4;
                        String M03 = org.telegram.messenger.hd.M0(2131748364, null);
                        if (zdVar.f52543r0 < i19) {
                            i10 = i19;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f25555b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(0, new org.telegram.ui.ActionBar.u2(i10, context, null, false));
                            wpVar.f40056s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.r31 i20 = org.telegram.ui.Components.r31.i(1, M03);
                        if (zdVar.f52543r0 >= i19 && zdVar.f52533j1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i20.L(z9);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.r31.B(-8, org.telegram.messenger.hd.M0(2131748363, null)));
                    }
                    if (zdVar.f52526c1) {
                        arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.hd.M0(2131748372, null)));
                        arrayList5.add(org.telegram.ui.Components.r31.j(3, zdVar.C0));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-6, zdVar.f52549v0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(zdVar.f52537o0).M0(Long.valueOf(-zdVar.f52539p0))) && org.telegram.messenger.qp.s1(zdVar.f52537o0).f24777g6) {
                    arrayList5.add(hi.f.i(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, zdVar.f52536n0), pn.i0(org.telegram.messenger.hd.M0(2131752474, null)), org.telegram.messenger.hd.M0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-7, null));
                }
                if (zdVar.f52524a1.a()) {
                    zdVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.r31.n(zdVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.r31.B(-10, null));
                return;
            case 3:
                td tdVar = (td) this.f43544b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var3 = (org.telegram.ui.Components.f41) obj2;
                vd vdVar = tdVar.f50012f;
                int i21 = tdVar.d;
                int i22 = vd.f50689y;
                if (i21 == 0) {
                    arrayList = vdVar.f50696r;
                } else {
                    arrayList = vdVar.f50695n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i23 = bi.xc.f5050b;
                    org.telegram.ui.Components.r31 K3 = org.telegram.ui.Components.r31.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f37603q = true;
                    arrayList6.add(K3);
                }
                if (i21 == 0) {
                    str = vdVar.f50697s;
                } else {
                    str = vdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                pn pnVar = (pn) this.f43544b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    pnVar.getClass();
                    org.telegram.ui.Components.hc.a0(pnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(pnVar.f48876j0);
                org.telegram.messenger.g0.E2(pnVar.f48873g0);
                org.telegram.messenger.g0.E2(pnVar.f48875i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.i3(new lp((oq) this.f43544b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f43544b).e0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                nr nrVar = (nr) this.f43544b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var4 = (org.telegram.ui.Components.f41) obj2;
                TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
                arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.V));
                arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.f48093b));
                arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.f48094c));
                if (TextUtils.isEmpty(nrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748408, null)), org.telegram.messenger.t10.j(a22, true), "%1$s")));
                } else if (nrVar.K) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MobileVisibleInfo", null, 2131748407, org.telegram.messenger.t10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                }
                if (nrVar.I && nrVar.K) {
                    org.telegram.ui.Components.r31 i24 = org.telegram.ui.Components.r31.i(2, org.telegram.messenger.hd.M0(2131754447, null));
                    i24.L(nrVar.X);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.a0(null, null, 2131754446, org.telegram.messenger.t10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.d));
                arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(2131754394, null)));
                if (!nrVar.I) {
                    TLRPC.UserFull b22 = nrVar.getMessagesController().b2(nrVar.H);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.f48102y));
                    arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.D));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(nrVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                    org.telegram.ui.Components.r31 e10 = org.telegram.ui.Components.r31.e(1, org.telegram.messenger.hd.M0(2131751553, null));
                    e10.f37604r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.r31.C(null));
                if (nrVar.Y) {
                    org.telegram.messenger.g0.h3(new fr(nrVar, a22, 0));
                    nrVar.Y = false;
                    org.telegram.messenger.g0.i3(new dr(nrVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ks.a((ks) this.f43544b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                gs gsVar = (gs) this.f43544b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                ks ksVar = gsVar.f46062a;
                is isVar = ksVar.f47257l;
                if (isVar != null) {
                    String join = TextUtils.join("", ksVar.f47260o);
                    if (c20Var != null) {
                        exVar = new org.telegram.ui.Components.ex(9, gsVar, c20Var);
                    }
                    isVar.u(charSequence, join, exVar);
                    if (c20Var == null) {
                        ksVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ss ssVar = (ss) this.f43544b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var5 = (org.telegram.ui.Components.f41) obj2;
                arrayList8.add(org.telegram.ui.Components.r31.k(ssVar.P1));
                arrayList8.add(org.telegram.ui.Components.r31.C(null));
                ArrayList arrayList9 = ssVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.hd.M0(2131749488, null)));
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(ssVar.f28612a).a2(l11);
                        if (a23 != null) {
                            int i25 = ah.q.f1109b;
                            org.telegram.ui.Components.r31 K4 = org.telegram.ui.Components.r31.K(ah.q.class);
                            K4.G = a23;
                            K4.L(ssVar.T1.contains(l11));
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
                ww wwVar = (ww) this.f43544b;
                Long l12 = (Long) obj2;
                wwVar.P1 = (Long) obj;
                wwVar.g5();
                return;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f43544b).run();
                return;
            case 13:
                nx nxVar = (nx) this.f43544b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var6 = (org.telegram.ui.Components.f41) obj2;
                String M04 = org.telegram.messenger.hd.M0(2131743990, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.f37598l = M04;
                r31Var.f37597k = 2131624298;
                arrayList10.add(r31Var);
                org.telegram.ui.Components.r31 i26 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.hd.M0(2131743991, null));
                i26.L(nxVar.f48127c);
                arrayList10.add(i26);
                if (nxVar.f48127c) {
                    arrayList10.add(org.telegram.ui.Components.r31.C(null));
                    arrayList10.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.hd.M0(2131743989, null)));
                    r3 r3Var = new r3(nxVar, 6);
                    int i27 = lx.f47572b;
                    org.telegram.ui.Components.r31 K5 = org.telegram.ui.Components.r31.K(lx.class);
                    K5.d = 2;
                    K5.G = r3Var;
                    if (!nxVar.f48128e) {
                        if (nxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.f37611z = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(2131743988, null)));
                    return;
                }
                return;
            case 14:
                p90 p90Var = (p90) this.f43544b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                p90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.qp.s1(p90Var.f48724b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.s(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.k5.o(null, 2131754974, p90.d(), 2131624011, 36);
                        return;
                    } else {
                        p90.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                pc0 pc0Var = (pc0) this.f43544b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ce0 ce0Var = pc0Var.P;
                pc0Var.I = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    pc0Var.n();
                    ce0Var.N1(false, true);
                    pc0Var.postDelayed(new q10(27, pc0Var, auth_authorization), 150L);
                    return;
                }
                ce0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        pc0Var.c(true);
                        ce0Var.M1(0, true, null, true);
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749181, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749179, "InvalidLastName"));
                        return;
                    } else {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error4.text);
                        return;
                    }
                } else {
                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749182, "InvalidCode"));
                    return;
                }
            case 16:
                yr0 yr0Var = (yr0) this.f43544b;
                ri.b bVar2 = yr0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                yr0Var.f52311s = (Bitmap) obj;
                Paint paint = new Paint(1);
                yr0Var.f52313x = paint;
                Bitmap bitmap2 = yr0Var.f52311s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                yr0Var.f52312w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                yr0Var.f52313x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                yr0Var.f52314y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, yr0Var.f52301c);
                yr0Var.G.d();
                return;
            case 17:
                gs0 gs0Var = (gs0) this.f43544b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var7 = (org.telegram.ui.Components.f41) obj2;
                String M05 = org.telegram.messenger.hd.M0(2131754276, null);
                org.telegram.ui.Components.r31 r31Var2 = new org.telegram.ui.Components.r31(2);
                r31Var2.f37598l = M05;
                r31Var2.f37597k = 2131623947;
                arrayList11.add(r31Var2);
                org.telegram.ui.Components.r31 i28 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.hd.M0(2131754277, null));
                i28.L(gs0Var.f46068n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.r31.B(2, null));
                if (gs0Var.f46068n) {
                    arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.hd.M0(2131746874, null)));
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) gs0Var.getMessagesController().I6);
                    fo0 fo0Var = new fo0(2);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f30275c = a10;
                    s7Var.d = 20;
                    s7Var.f30276e = fo0Var;
                    gs0Var.f46064b.d((int) Utilities.k(gs0Var.f46069r, 10000L, 0L), s7Var, new r3(gs0Var, 20));
                    arrayList11.add(org.telegram.ui.Components.r31.j(3, gs0Var.f46064b));
                    if (gs0Var.f46069r > 0) {
                        str2 = gs0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.r31.B(4, str2));
                    TLRPC.Chat M06 = gs0Var.getMessagesController().M0(Long.valueOf(gs0Var.f46063a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        gs0Var.f46065c.setLink(gs0Var.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.hd.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.r31.j(5, gs0Var.f46065c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43544b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f41655e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f43544b;
                Bitmap bitmap3 = (Bitmap) obj;
                ri.b bVar3 = profileActivity.J6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.K6.d();
                return;
            case 20:
                ny0 ny0Var = (ny0) this.f43544b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var8 = (org.telegram.ui.Components.f41) obj2;
                org.telegram.ui.Components.k41 k41Var = ny0Var.f48144f;
                oy0 oy0Var = ny0Var.f48148w;
                ArrayList arrayList13 = oy0Var.f48577o1;
                bi.m5 m5Var = ny0Var.h;
                if (m5Var.getMeasuredHeight() <= 0) {
                    m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22537q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.r31 D = org.telegram.ui.Components.r31.D(m5Var.getMeasuredHeight());
                D.d = -1;
                D.f37605s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((m5Var.getMeasuredHeight() / org.telegram.messenger.g0.f22536p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = ny0Var.f48141b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || ny0Var.f48142c != null || ny0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || ny0Var.f48142c != null) {
                        Context context2 = ny0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.k6.L6;
                        int i30 = oy0.f48572s1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i29, 21, 0, 0, false, false, oy0Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = ny0Var.f48141b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = ny0Var.f48142c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, n4Var, oy0Var.I0);
                        org.telegram.ui.Components.r31 k10 = org.telegram.ui.Components.r31.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (ny0Var.f48141b != null) {
                        for (int i31 = 0; i31 < ny0Var.f48141b.options.size(); i31++) {
                            org.telegram.ui.Components.r31 r31Var3 = new org.telegram.ui.Components.r31(30);
                            r31Var3.f37598l = ny0Var.f48141b.options.get(i31).text;
                            r31Var3.f37597k = 2131232059;
                            r31Var3.d = i31;
                            arrayList12.add(r31Var3);
                            measuredHeight += 50;
                        }
                    } else if (ny0Var.f48142c != null) {
                        for (int i32 = 0; i32 < ny0Var.f48142c.options.size(); i32++) {
                            org.telegram.ui.Components.r31 r31Var4 = new org.telegram.ui.Components.r31(30);
                            r31Var4.f37598l = ny0Var.f48142c.options.get(i32).text;
                            r31Var4.f37597k = 2131232059;
                            r31Var4.d = i32;
                            arrayList12.add(r31Var4);
                            measuredHeight += 50;
                        }
                    } else if (ny0Var.d != null) {
                        if (ny0Var.f48145n == null) {
                            Context context3 = ny0Var.getContext();
                            int i33 = oy0.f48572s1;
                            ly0 ly0Var = new ly0(ny0Var, context3, oy0Var.I0);
                            ny0Var.f48145n = ly0Var;
                            ly0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.i3 i3Var = ny0Var.f48145n.d;
                        if (ny0Var.d.optional) {
                            i11 = 2131746237;
                        } else {
                            i11 = 2131746243;
                        }
                        i3Var.setHint(org.telegram.messenger.hd.M0(i11, null));
                        org.telegram.ui.Components.r31 k11 = org.telegram.ui.Components.r31.k(ny0Var.f48145n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = oy0Var.f48579q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746239;
                            } else {
                                i12 = 2131746242;
                            }
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(i12, null)));
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(2131746238, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(oy0Var.f28612a).M0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(2131746241, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.hd.M0(2131746240, null)));
                        }
                        if (ny0Var.f48146r == null) {
                            fi.d dVar = new fi.d(ny0Var.getContext(), oy0Var.I0, true);
                            ny0Var.f48147s = dVar;
                            dVar.i(org.telegram.messenger.hd.M0(2131746236, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(ny0Var.getContext());
                            ny0Var.f48146r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, frameLayout, oy0Var.I0);
                            ny0Var.f48146r.addView(ny0Var.f48147s, c8.ha.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(ny0Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, view, oy0Var.I0);
                            ny0Var.f48146r.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22536p, 48));
                        }
                        fi.d dVar2 = ny0Var.f48147s;
                        if (!ny0Var.d.optional && TextUtils.isEmpty(ny0Var.f48145n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        ny0Var.f48147s.setOnClickListener(new g40(ny0Var, 29));
                        org.telegram.ui.Components.r31 k12 = org.telegram.ui.Components.r31.k(ny0Var.f48146r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.r31) jg.g.i(1, arrayList12)).f37596j = true;
                    if (oy0Var.l1 && ny0Var.f48140a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(ny0Var.getContext());
                        Drawable mutate = ny0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.f27812b7, oy0Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.f27792a7, oy0Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, mutate, 0, 0);
                        xpVar.f40305x = true;
                        frameLayout2.setBackground(xpVar);
                        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(ny0Var.getContext(), null);
                        w70Var.setTextSize(1, 14.0f);
                        w70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.hd.M0(2131746234, null), oy0Var.I0, null));
                        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.A6, oy0Var.I0);
                        w70Var.setGravity(17);
                        frameLayout2.addView(w70Var, c8.ha.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.r31 k13 = org.telegram.ui.Components.r31.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (k41Var != null) {
                    int i34 = oy0.f48572s1;
                    if (oy0Var.f28615b.getMeasuredHeight() - org.telegram.messenger.g0.f22531m < org.telegram.messenger.g0.L(measuredHeight)) {
                        k41Var.f35166e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    k41Var.f35166e3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.f41 f41Var9 = (org.telegram.ui.Components.f41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((sy0) this.f43544b).P1));
                return;
            case 22:
                org.telegram.ui.Components.f41 f41Var10 = (org.telegram.ui.Components.f41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((org.telegram.ui.Components.m20) this.f43544b).Q1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f43544b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                z11 z11Var = (z11) this.f43544b;
                ArrayList arrayList14 = z11Var.f52424e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i35 = z11Var.f52421a;
                ArrayList arrayList15 = z11Var.d;
                if (tL_error6 != null) {
                    if (z11Var.f52427r) {
                        arrayList15.clear();
                        z11Var.f52427r = false;
                    }
                    z11Var.h = true;
                    z11Var.f52425f = false;
                    int size4 = arrayList14.size();
                    while (i14 < size4) {
                        Object obj6 = arrayList14.get(i14);
                        i14++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.qp.s1(i35).Y3(channels_channelparticipants.users, false);
                org.telegram.messenger.qp.s1(i35).S3(channels_channelparticipants.chats, false);
                if (z11Var.f52427r) {
                    arrayList15.clear();
                    z11Var.f52427r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i36 = 0;
                while (i36 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i36);
                    i36++;
                    TLObject e22 = org.telegram.messenger.qp.s1(i35).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                    if (e22 != null) {
                        arrayList15.add(e22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    z11Var.h = true;
                }
                z11Var.f52425f = false;
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
                org.telegram.ui.Components.f41 f41Var11 = (org.telegram.ui.Components.f41) obj2;
                m31.f0((m31) this.f43544b, (ArrayList) obj);
                return;
            case 28:
                d(obj, obj2);
                return;
            default:
                f81 f81Var = (f81) this.f43544b;
                ri.b bVar4 = f81Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                f81Var.f45562r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                f81Var.f45564w = paint2;
                Bitmap bitmap5 = f81Var.f45562r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                f81Var.f45563s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f13);
                f81Var.f45564w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                f81Var.f45565x = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, f81Var.f45553b);
                f81Var.F.d();
                return;
        }
    }
}
