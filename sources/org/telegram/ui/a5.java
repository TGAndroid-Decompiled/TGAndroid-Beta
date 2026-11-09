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
    public final int f43585a;
    public final Object f43586b;

    public a5(Object obj, int i7) {
        this.f43585a = i7;
        this.f43586b = obj;
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
        c21 c21Var = (c21) this.f43586b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
        b21 b21Var = c21Var.Y1;
        b21 b21Var2 = c21Var.X1;
        TLRPC.User user = c21Var.Q1;
        b21 b21Var3 = c21Var.W1;
        if (b21Var3 != null) {
            ArrayList arrayList2 = b21Var3.d;
            if (b21Var2 != null) {
                ArrayList arrayList3 = b21Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.p10.i(c21Var.f28621a).e()));
                arrayList.add(org.telegram.ui.Components.y31.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (b21Var != null && !TextUtils.isEmpty(b21Var.f43856c.f26955q)) {
                    ArrayList arrayList4 = b21Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                            org.telegram.ui.Components.y31 w10 = org.telegram.ui.Components.y31.w(tLObject);
                            if (org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(c21Var.S1)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            w10.L(z15);
                            arrayList.add(w10);
                        }
                    }
                    if (b21Var.f43858f) {
                        arrayList.add(org.telegram.ui.Components.y31.p(29));
                        arrayList.add(org.telegram.ui.Components.y31.p(29));
                        arrayList.add(org.telegram.ui.Components.y31.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.y31.k(c21Var.V1));
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
                                if (org.telegram.messenger.t3.V(c21Var.P1)) {
                                    i13 = 2131752516;
                                } else {
                                    i13 = 2131749499;
                                }
                                arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                                org.telegram.ui.Components.y31 w11 = org.telegram.ui.Components.y31.w(user);
                                i7 = 29;
                                if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(c21Var.S1)) {
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
                            if (org.telegram.messenger.t3.V(c21Var.P1)) {
                                i12 = 2131752516;
                            } else {
                                i12 = 2131749499;
                            }
                            arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(i12, null)));
                            z9 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                        org.telegram.ui.Components.y31 w12 = org.telegram.ui.Components.y31.w(tLObject2);
                        if (org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(c21Var.S1)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        w12.L(z13);
                        arrayList.add(w12);
                    }
                }
                if (b21Var3.f43858f) {
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                    if (org.telegram.messenger.t3.V(c21Var.P1)) {
                        i11 = 2131752288;
                    } else {
                        i11 = 2131749428;
                    }
                    arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                    org.telegram.ui.Components.y31 w13 = org.telegram.ui.Components.y31.w(user);
                    if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(c21Var.S1)) {
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
                            if (org.telegram.messenger.t3.V(c21Var.P1)) {
                                i10 = 2131752288;
                            } else {
                                i10 = 2131749428;
                            }
                            arrayList.add(org.telegram.ui.Components.y31.r(org.telegram.messenger.id.M0(i10, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                        org.telegram.ui.Components.y31 w14 = org.telegram.ui.Components.y31.w(tLObject3);
                        if (org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(c21Var.S1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w14.L(z11);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && b21Var2.f43858f) {
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                    arrayList.add(org.telegram.ui.Components.y31.p(i7));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        int i7;
        long j3;
        TL_stories.StoryItem storyItem;
        e21 e21Var = (e21) this.f43586b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
        int i10 = e21Var.T1;
        di.r6 r6Var = e21Var.R1;
        if (r6Var == null) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.y31.D(org.telegram.messenger.g0.L(16.0f)));
        ArrayList arrayList2 = r6Var.f9694i;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj3;
            int i14 = k51.f47198c;
            org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(k51.class);
            K.f40577u = 1;
            K.f40581z = 0;
            K.G = ijVar;
            if (ijVar != null && (storyItem = ijVar.f23266l) != null) {
                j3 = storyItem.f27195id;
            } else {
                j3 = -1;
            }
            K.B = j3;
            K.f40563f = true;
            K.v = i10;
            K.L(e21Var.S1.containsKey(Integer.valueOf(ijVar.e1())));
            K.f40577u = 1;
            arrayList.add(K);
            i12--;
            if (i12 == 0) {
                i12 = i10;
            }
        }
        if (r6Var.k() || !r6Var.f9703r) {
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
                org.telegram.ui.Components.y31 q10 = org.telegram.ui.Components.y31.q(i11, 34);
                q10.f40577u = 1;
                arrayList.add(q10);
            }
        }
        arrayList.add(org.telegram.ui.Components.y31.D(org.telegram.messenger.g0.L(68.0f)));
    }

    private final void d(Object obj, Object obj2) {
        u31 u31Var = (u31) this.f43586b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
        LinearLayout linearLayout = u31Var.Q1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.y31.k(linearLayout));
        }
        LinearLayout linearLayout2 = u31Var.R1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.y31.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        int i7;
        int i10;
        boolean z9;
        p41 p41Var;
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
        org.telegram.ui.Components.fx fxVar = null;
        int i14 = 0;
        switch (this.f43585a) {
            case 0:
                b5 b5Var = (b5) this.f43586b;
                b5Var.f43897w.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f43898x = false;
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
                i9 i9Var = (i9) this.f43586b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var = (org.telegram.ui.Components.m41) obj2;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList3 = i9Var.f46532y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.y31 c10 = org.telegram.ui.Components.y31.c(1, 2131231770, org.telegram.messenger.id.M0(2131749490, null));
                    c10.f40573q = true;
                    arrayList2.add(c10);
                    if (!i9Var.getUserConfig().W) {
                        org.telegram.ui.Components.y31 c11 = org.telegram.ui.Components.y31.c(2, 2131231764, org.telegram.messenger.id.M0(2131749461, null));
                        c11.f40573q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.y31.C(null));
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
                            int i16 = g9.f45937b;
                            org.telegram.ui.Components.y31 K = org.telegram.ui.Components.y31.K(g9.class);
                            K.G = M0;
                            K.D = k8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.y31.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList3.get(i17);
                        i17++;
                        f9 f9Var = (f9) obj4;
                        org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(6, i9Var, f9Var);
                        int i18 = d9.f44898b;
                        org.telegram.ui.Components.y31 K2 = org.telegram.ui.Components.y31.K(d9.class);
                        K2.G = f9Var;
                        K2.D = l1Var;
                        K2.L(i9Var.k0(f9Var.f45666c));
                        arrayList2.add(K2);
                    }
                    if (!i9Var.F) {
                        arrayList2.add(org.telegram.ui.Components.y31.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.y31.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.y31.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zd zdVar = (zd) this.f43586b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var2 = (org.telegram.ui.Components.m41) obj2;
                zdVar.R0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.qp.s1(zdVar.f52517o0).M0(Long.valueOf(-zdVar.f52519p0));
                TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(zdVar.f52517o0).N0(-zdVar.f52519p0);
                if (N0 != null) {
                    i7 = N0.stats_dc;
                } else {
                    i7 = -1;
                }
                if (zdVar.f52505b1) {
                    arrayList5.add(org.telegram.ui.Components.y31.g(zdVar.f52525s0));
                    p41 p41Var2 = zdVar.l1;
                    if (p41Var2 != null && !p41Var2.f48629l) {
                        arrayList5.add(org.telegram.ui.Components.y31.h(5, i7, p41Var2));
                        arrayList5.add(org.telegram.ui.Components.y31.B(-1, null));
                    }
                    p41 p41Var3 = zdVar.f52515m1;
                    if (p41Var3 != null && !p41Var3.f48629l) {
                        arrayList5.add(org.telegram.ui.Components.y31.h(2, i7, p41Var3));
                        arrayList5.add(org.telegram.ui.Components.y31.B(-2, null));
                    }
                }
                if (zdVar.f52506c1 && (p41Var = zdVar.n1) != null && !p41Var.f48629l) {
                    arrayList5.add(org.telegram.ui.Components.y31.h(2, i7, p41Var));
                    arrayList5.add(org.telegram.ui.Components.y31.B(-3, null));
                }
                if (zdVar.f52518o1) {
                    arrayList5.add(org.telegram.ui.Components.y31.b(org.telegram.messenger.id.M0(2131748385, null)));
                    arrayList5.add(org.telegram.ui.Components.y31.v(zdVar.f52520p1));
                    arrayList5.add(org.telegram.ui.Components.y31.v(zdVar.f52522q1));
                    arrayList5.add(org.telegram.ui.Components.y31.v(zdVar.f52524r1));
                    arrayList5.add(org.telegram.ui.Components.y31.B(-4, zdVar.f52528u0));
                }
                if (M02 != null && M02.creator) {
                    if (zdVar.f52505b1) {
                        arrayList5.add(org.telegram.ui.Components.y31.b(org.telegram.messenger.id.M0(2131748406, null)));
                        arrayList5.add(org.telegram.ui.Components.y31.k(zdVar.f52530w0));
                        arrayList5.add(org.telegram.ui.Components.y31.B(-5, zdVar.f52527t0));
                        int i19 = org.telegram.messenger.qp.s1(zdVar.f52517o0).f24958z4;
                        String M03 = org.telegram.messenger.id.M0(2131748365, null);
                        if (zdVar.f52523r0 < i19) {
                            i10 = i19;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f25566b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(0, new org.telegram.ui.ActionBar.u2(i10, context, null, false));
                            wpVar.f40121s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.y31 i20 = org.telegram.ui.Components.y31.i(1, M03);
                        if (zdVar.f52523r0 >= i19 && zdVar.f52513j1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        i20.L(z9);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.y31.B(-8, org.telegram.messenger.id.M0(2131748364, null)));
                    }
                    if (zdVar.f52506c1) {
                        arrayList5.add(org.telegram.ui.Components.y31.b(org.telegram.messenger.id.M0(2131748373, null)));
                        arrayList5.add(org.telegram.ui.Components.y31.j(3, zdVar.C0));
                        arrayList5.add(org.telegram.ui.Components.y31.B(-6, zdVar.f52529v0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(zdVar.f52517o0).M0(Long.valueOf(-zdVar.f52519p0))) && org.telegram.messenger.qp.s1(zdVar.f52517o0).f24792g6) {
                    arrayList5.add(hi.f.i(4, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ik, zdVar.f52516n0), rn.i0(org.telegram.messenger.id.M0(2131752474, null)), org.telegram.messenger.id.M0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.y31.B(-7, null));
                }
                if (zdVar.f52504a1.a()) {
                    zdVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.y31.n(zdVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.y31.B(-10, null));
                return;
            case 3:
                td tdVar = (td) this.f43586b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var3 = (org.telegram.ui.Components.m41) obj2;
                vd vdVar = tdVar.f50166f;
                int i21 = tdVar.d;
                int i22 = vd.f50653y;
                if (i21 == 0) {
                    arrayList = vdVar.f50660r;
                } else {
                    arrayList = vdVar.f50659n;
                }
                int size3 = arrayList.size();
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    int i23 = bi.xc.f5048b;
                    org.telegram.ui.Components.y31 K3 = org.telegram.ui.Components.y31.K(bi.xc.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f40573q = true;
                    arrayList6.add(K3);
                }
                if (i21 == 0) {
                    str = vdVar.f50661s;
                } else {
                    str = vdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.y31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.y31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.y31.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                rn rnVar = (rn) this.f43586b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    rnVar.getClass();
                    org.telegram.ui.Components.hc.a0(rnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(rnVar.f49523j0);
                org.telegram.messenger.g0.E2(rnVar.f49520g0);
                org.telegram.messenger.g0.E2(rnVar.f49522i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.i3(new np((qq) this.f43586b, 1), 1000L);
                return;
            case 6:
                ((wf.b) this.f43586b).e0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                pr prVar = (pr) this.f43586b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var4 = (org.telegram.ui.Components.m41) obj2;
                TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
                arrayList7.add(org.telegram.ui.Components.y31.k(prVar.V));
                arrayList7.add(org.telegram.ui.Components.y31.k(prVar.f48788b));
                arrayList7.add(org.telegram.ui.Components.y31.k(prVar.f48789c));
                if (TextUtils.isEmpty(prVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748409, null)), org.telegram.messenger.t10.j(a22, true), "%1$s")));
                } else if (prVar.K) {
                    arrayList7.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MobileVisibleInfo", null, 2131748408, org.telegram.messenger.t10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.y31.C(null));
                }
                if (prVar.I && prVar.K) {
                    org.telegram.ui.Components.y31 i24 = org.telegram.ui.Components.y31.i(2, org.telegram.messenger.id.M0(2131754447, null));
                    i24.L(prVar.X);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.a0(null, null, 2131754446, org.telegram.messenger.t10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.y31.k(prVar.d));
                arrayList7.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131754394, null)));
                if (!prVar.I) {
                    TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.H);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.y31.k(prVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.y31.k(prVar.f48797y));
                    arrayList7.add(org.telegram.ui.Components.y31.k(prVar.D));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.y31.k(prVar.E));
                    }
                    arrayList7.add(org.telegram.ui.Components.y31.C(null));
                    org.telegram.ui.Components.y31 e10 = org.telegram.ui.Components.y31.e(1, org.telegram.messenger.id.M0(2131751552, null));
                    e10.f40574r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.y31.C(null));
                if (prVar.Y) {
                    org.telegram.messenger.g0.h3(new hr(prVar, a22, 0));
                    prVar.Y = false;
                    org.telegram.messenger.g0.i3(new fr(prVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ms.a((ms) this.f43586b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                is isVar = (is) this.f43586b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj2;
                ms msVar = isVar.f46750a;
                ks ksVar = msVar.f47970l;
                if (ksVar != null) {
                    String join = TextUtils.join("", msVar.f47973o);
                    if (c20Var != null) {
                        fxVar = new org.telegram.ui.Components.fx(9, isVar, c20Var);
                    }
                    ksVar.u(charSequence, join, fxVar);
                    if (c20Var == null) {
                        msVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                us usVar = (us) this.f43586b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var5 = (org.telegram.ui.Components.m41) obj2;
                arrayList8.add(org.telegram.ui.Components.y31.k(usVar.P1));
                arrayList8.add(org.telegram.ui.Components.y31.C(null));
                ArrayList arrayList9 = usVar.S1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131749489, null)));
                    while (i14 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i14);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(usVar.f28621a).a2(l11);
                        if (a23 != null) {
                            int i25 = ah.q.f1109b;
                            org.telegram.ui.Components.y31 K4 = org.telegram.ui.Components.y31.K(ah.q.class);
                            K4.G = a23;
                            K4.L(usVar.T1.contains(l11));
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
                yw ywVar = (yw) this.f43586b;
                Long l12 = (Long) obj2;
                ywVar.Q1 = (Long) obj;
                ywVar.g5();
                return;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f43586b).run();
                return;
            case 13:
                px pxVar = (px) this.f43586b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var6 = (org.telegram.ui.Components.m41) obj2;
                String M04 = org.telegram.messenger.id.M0(2131743989, null);
                org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(2);
                y31Var.f40568l = M04;
                y31Var.f40567k = 2131624298;
                arrayList10.add(y31Var);
                org.telegram.ui.Components.y31 i26 = org.telegram.ui.Components.y31.i(1, org.telegram.messenger.id.M0(2131743990, null));
                i26.L(pxVar.f48826c);
                arrayList10.add(i26);
                if (pxVar.f48826c) {
                    arrayList10.add(org.telegram.ui.Components.y31.C(null));
                    arrayList10.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131743988, null)));
                    r3 r3Var = new r3(pxVar, 6);
                    int i27 = nx.f48245b;
                    org.telegram.ui.Components.y31 K5 = org.telegram.ui.Components.y31.K(nx.class);
                    K5.d = 2;
                    K5.G = r3Var;
                    if (!pxVar.f48827e) {
                        if (pxVar.d) {
                            i13 = 0;
                        } else {
                            i13 = 1;
                        }
                    }
                    K5.f40581z = i13;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131743987, null)));
                    return;
                }
                return;
            case 14:
                r90 r90Var = (r90) this.f43586b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                r90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.qp.s1(r90Var.f49348b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.s(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.k5.o(null, 2131754974, r90.d(), 2131624011, 36);
                        return;
                    } else {
                        r90.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                rc0 rc0Var = (rc0) this.f43586b;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ee0 ee0Var = rc0Var.P;
                rc0Var.I = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    rc0Var.n();
                    ee0Var.N1(false, true);
                    rc0Var.postDelayed(new s10(27, rc0Var, auth_authorization), 150L);
                    return;
                }
                ee0Var.C1(false, true);
                if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                    return;
                } else if (!tL_error4.text.contains("PHONE_CODE_EMPTY") && !tL_error4.text.contains("PHONE_CODE_INVALID")) {
                    if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                        rc0Var.c(true);
                        ee0Var.M1(0, true, null, true);
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                        return;
                    } else if (tL_error4.text.contains("FIRSTNAME_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749182, "InvalidFirstName"));
                        return;
                    } else if (tL_error4.text.contains("LASTNAME_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749180, "InvalidLastName"));
                        return;
                    } else {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error4.text);
                        return;
                    }
                } else {
                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, "InvalidCode"));
                    return;
                }
            case 16:
                bs0 bs0Var = (bs0) this.f43586b;
                ri.b bVar2 = bs0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                bs0Var.f44125s = (Bitmap) obj;
                Paint paint = new Paint(1);
                bs0Var.f44127x = paint;
                Bitmap bitmap2 = bs0Var.f44125s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                bs0Var.f44126w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f11);
                bs0Var.f44127x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                bs0Var.f44128y = new Matrix();
                bVar2.a(bitmap);
                ih.d.c(bVar2, bs0Var.f44115c);
                bs0Var.G.d();
                return;
            case 17:
                js0 js0Var = (js0) this.f43586b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var7 = (org.telegram.ui.Components.m41) obj2;
                String M05 = org.telegram.messenger.id.M0(2131754276, null);
                org.telegram.ui.Components.y31 y31Var2 = new org.telegram.ui.Components.y31(2);
                y31Var2.f40568l = M05;
                y31Var2.f40567k = 2131623947;
                arrayList11.add(y31Var2);
                org.telegram.ui.Components.y31 i28 = org.telegram.ui.Components.y31.i(1, org.telegram.messenger.id.M0(2131754277, null));
                i28.L(js0Var.f47075n);
                arrayList11.add(i28);
                arrayList11.add(org.telegram.ui.Components.y31.B(2, null));
                if (js0Var.f47075n) {
                    arrayList11.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131746875, null)));
                    int[] a10 = org.telegram.ui.Cells.t7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) js0Var.getMessagesController().I6);
                    io0 io0Var = new io0(2);
                    org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7();
                    s7Var.f30284c = a10;
                    s7Var.d = 20;
                    s7Var.f30285e = io0Var;
                    js0Var.f47071b.d((int) Utilities.k(js0Var.f47076r, 10000L, 0L), s7Var, new r3(js0Var, 20));
                    arrayList11.add(org.telegram.ui.Components.y31.j(3, js0Var.f47071b));
                    if (js0Var.f47076r > 0) {
                        str2 = js0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.y31.B(4, str2));
                    TLRPC.Chat M06 = js0Var.getMessagesController().M0(Long.valueOf(js0Var.f47070a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        js0Var.f47072c.setLink(js0Var.getMessagesController().U2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.y31.j(5, js0Var.f47072c));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f43586b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f41690e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) this.f43586b;
                Bitmap bitmap3 = (Bitmap) obj;
                ri.b bVar3 = profileActivity.M6;
                bVar3.a((Bitmap) obj2);
                ih.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.N6.d();
                return;
            case 20:
                qy0 qy0Var = (qy0) this.f43586b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.m41 m41Var8 = (org.telegram.ui.Components.m41) obj2;
                org.telegram.ui.Components.r41 r41Var = qy0Var.f49220f;
                ry0 ry0Var = qy0Var.f49224w;
                ArrayList arrayList13 = ry0Var.f49639o1;
                bi.m5 m5Var = qy0Var.h;
                if (m5Var.getMeasuredHeight() <= 0) {
                    m5Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22563q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.y31 D = org.telegram.ui.Components.y31.D(m5Var.getMeasuredHeight());
                D.d = -1;
                D.f40575s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((m5Var.getMeasuredHeight() / org.telegram.messenger.g0.f22562p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = qy0Var.f49217b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || qy0Var.f49218c != null || qy0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || qy0Var.f49218c != null) {
                        Context context2 = qy0Var.getContext();
                        int i29 = org.telegram.ui.ActionBar.l6.L6;
                        int i30 = ry0.f49634s1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i29, 21, 0, 0, false, false, ry0Var.I0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = qy0Var.f49217b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = qy0Var.f49218c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, n4Var, ry0Var.I0);
                        org.telegram.ui.Components.y31 k10 = org.telegram.ui.Components.y31.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (qy0Var.f49217b != null) {
                        for (int i31 = 0; i31 < qy0Var.f49217b.options.size(); i31++) {
                            org.telegram.ui.Components.y31 y31Var3 = new org.telegram.ui.Components.y31(30);
                            y31Var3.f40568l = qy0Var.f49217b.options.get(i31).text;
                            y31Var3.f40567k = 2131232059;
                            y31Var3.d = i31;
                            arrayList12.add(y31Var3);
                            measuredHeight += 50;
                        }
                    } else if (qy0Var.f49218c != null) {
                        for (int i32 = 0; i32 < qy0Var.f49218c.options.size(); i32++) {
                            org.telegram.ui.Components.y31 y31Var4 = new org.telegram.ui.Components.y31(30);
                            y31Var4.f40568l = qy0Var.f49218c.options.get(i32).text;
                            y31Var4.f40567k = 2131232059;
                            y31Var4.d = i32;
                            arrayList12.add(y31Var4);
                            measuredHeight += 50;
                        }
                    } else if (qy0Var.d != null) {
                        if (qy0Var.f49221n == null) {
                            Context context3 = qy0Var.getContext();
                            int i33 = ry0.f49634s1;
                            oy0 oy0Var = new oy0(qy0Var, context3, ry0Var.I0);
                            qy0Var.f49221n = oy0Var;
                            oy0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.i3 i3Var = qy0Var.f49221n.d;
                        if (qy0Var.d.optional) {
                            i11 = 2131746236;
                        } else {
                            i11 = 2131746242;
                        }
                        i3Var.setHint(org.telegram.messenger.id.M0(i11, null));
                        org.telegram.ui.Components.y31 k11 = org.telegram.ui.Components.y31.k(qy0Var.f49221n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j3 = ry0Var.f49641q1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746238;
                            } else {
                                i12 = 2131746241;
                            }
                            arrayList12.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(i12, null)));
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            arrayList12.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131746237, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.qp.s1(ry0Var.f28621a).M0(Long.valueOf(-j3)))) {
                            arrayList12.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131746240, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131746239, null)));
                        }
                        if (qy0Var.f49222r == null) {
                            fi.d dVar = new fi.d(qy0Var.getContext(), ry0Var.I0, true);
                            qy0Var.f49223s = dVar;
                            dVar.i(org.telegram.messenger.id.M0(2131746235, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(qy0Var.getContext());
                            qy0Var.f49222r = frameLayout;
                            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, frameLayout, ry0Var.I0);
                            qy0Var.f49222r.addView(qy0Var.f49223s, c8.ha.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(qy0Var.getContext());
                            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, ry0Var.I0);
                            qy0Var.f49222r.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22562p, 48));
                        }
                        fi.d dVar2 = qy0Var.f49223s;
                        if (!qy0Var.d.optional && TextUtils.isEmpty(qy0Var.f49221n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        qy0Var.f49223s.setOnClickListener(new i40(qy0Var, 29));
                        org.telegram.ui.Components.y31 k12 = org.telegram.ui.Components.y31.k(qy0Var.f49222r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.y31) jg.g.i(1, arrayList12)).f40566j = true;
                    if (ry0Var.l1 && qy0Var.f49216a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(qy0Var.getContext());
                        Drawable mutate = qy0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.s6.x(frameLayout2, mutate, org.telegram.ui.ActionBar.l6.f27829b7, ry0Var.I0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.s6.x(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.l6.f27809a7, ry0Var.I0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, mutate, 0, 0);
                        xpVar.f40453x = true;
                        frameLayout2.setBackground(xpVar);
                        org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(qy0Var.getContext(), null);
                        x70Var.setTextSize(1, 14.0f);
                        x70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.id.M0(2131746233, null), ry0Var.I0, null));
                        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.A6, ry0Var.I0);
                        x70Var.setGravity(17);
                        frameLayout2.addView(x70Var, c8.ha.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.y31 k13 = org.telegram.ui.Components.y31.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (r41Var != null) {
                    int i34 = ry0.f49634s1;
                    if (ry0Var.f28624b.getMeasuredHeight() - org.telegram.messenger.g0.f22557m < org.telegram.messenger.g0.L(measuredHeight)) {
                        r41Var.f37555e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    r41Var.f37555e3.k1(true);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.m41 m41Var9 = (org.telegram.ui.Components.m41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.y31.k(((vy0) this.f43586b).P1));
                return;
            case 22:
                org.telegram.ui.Components.m41 m41Var10 = (org.telegram.ui.Components.m41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.y31.k(((org.telegram.ui.Components.n20) this.f43586b).Q1));
                return;
            case 23:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f43586b).getClass();
                return;
            case 24:
                b(obj, obj2);
                return;
            case 25:
                b21 b21Var = (b21) this.f43586b;
                ArrayList arrayList14 = b21Var.f43857e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                int i35 = b21Var.f43854a;
                ArrayList arrayList15 = b21Var.d;
                if (tL_error6 != null) {
                    if (b21Var.f43860r) {
                        arrayList15.clear();
                        b21Var.f43860r = false;
                    }
                    b21Var.h = true;
                    b21Var.f43858f = false;
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
                if (b21Var.f43860r) {
                    arrayList15.clear();
                    b21Var.f43860r = false;
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
                    b21Var.h = true;
                }
                b21Var.f43858f = false;
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
                org.telegram.ui.Components.m41 m41Var11 = (org.telegram.ui.Components.m41) obj2;
                n31.f0((n31) this.f43586b, (ArrayList) obj);
                return;
            case 28:
                d(obj, obj2);
                return;
            default:
                h81 h81Var = (h81) this.f43586b;
                ri.b bVar4 = h81Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                h81Var.f46256r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                h81Var.f46258w = paint2;
                Bitmap bitmap5 = h81Var.f46256r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                h81Var.f46257s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                org.telegram.messenger.g0.i(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.l6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                org.telegram.messenger.g0.h(colorMatrix2, f13);
                h81Var.f46258w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                h81Var.f46259x = new Matrix();
                bVar4.a(bitmap4);
                ih.d.c(bVar4, h81Var.f46247b);
                h81Var.F.d();
                return;
        }
    }
}
