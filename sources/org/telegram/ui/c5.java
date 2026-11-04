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
public final class c5 implements org.telegram.messenger.n10 {
    public final int f44236a;
    public final Object f44237b;

    public c5(Object obj, int i3) {
        this.f44236a = i3;
        this.f44237b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i3;
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
        q11 q11Var = (q11) this.f44237b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
        p11 p11Var = q11Var.Z1;
        p11 p11Var2 = q11Var.Y1;
        TLRPC.User user = q11Var.R1;
        p11 p11Var3 = q11Var.X1;
        if (p11Var3 != null) {
            ArrayList arrayList2 = p11Var3.d;
            if (p11Var2 != null) {
                ArrayList arrayList3 = p11Var2.d;
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(org.telegram.messenger.h10.i(q11Var.f28583a).e()));
                arrayList.add(org.telegram.ui.Components.r31.E(3, org.telegram.messenger.g0.L(64.0f)));
                if (p11Var != null && !TextUtils.isEmpty(p11Var.f48405c.f27000q)) {
                    ArrayList arrayList4 = p11Var.d;
                    int size = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList4.get(i14);
                        i14++;
                        TLObject tLObject = (TLObject) obj3;
                        if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject)))) {
                            hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject)));
                            org.telegram.ui.Components.r31 w10 = org.telegram.ui.Components.r31.w(tLObject);
                            if (org.telegram.messenger.m5.d(tLObject) == org.telegram.messenger.m5.d(q11Var.T1)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            w10.L(z16);
                            arrayList.add(w10);
                        }
                    }
                    if (p11Var.f48407f) {
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                        arrayList.add(org.telegram.ui.Components.r31.p(29));
                    }
                    if (arrayList.size() == 1) {
                        arrayList.add(org.telegram.ui.Components.r31.k(q11Var.W1));
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
                                if (org.telegram.messenger.t3.V(q11Var.Q1)) {
                                    i13 = 2131752516;
                                } else {
                                    i13 = 2131749507;
                                }
                                arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(i13, null)));
                                hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                                org.telegram.ui.Components.r31 w11 = org.telegram.ui.Components.r31.w(user);
                                i3 = 29;
                                if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(q11Var.T1)) {
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
                i3 = 29;
                z10 = true;
                int size3 = arrayList2.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    TLObject tLObject2 = (TLObject) obj5;
                    if (!hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)))) {
                        if (z10) {
                            if (org.telegram.messenger.t3.V(q11Var.Q1)) {
                                i12 = 2131752516;
                            } else {
                                i12 = 2131749507;
                            }
                            arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(i12, null)));
                            z10 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject2)));
                        org.telegram.ui.Components.r31 w12 = org.telegram.ui.Components.r31.w(tLObject2);
                        if (org.telegram.messenger.m5.d(tLObject2) == org.telegram.messenger.m5.d(q11Var.T1)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        w12.L(z14);
                        arrayList.add(w12);
                    }
                }
                if (p11Var3.f48407f) {
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                }
                if (user != null && !hashSet.contains(Long.valueOf(org.telegram.messenger.m5.d(user)))) {
                    if (org.telegram.messenger.t3.V(q11Var.Q1)) {
                        i11 = 2131752288;
                    } else {
                        i11 = 2131749436;
                    }
                    arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(i11, null)));
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(user)));
                    org.telegram.ui.Components.r31 w13 = org.telegram.ui.Components.r31.w(user);
                    if (org.telegram.messenger.m5.d(user) == org.telegram.messenger.m5.d(q11Var.T1)) {
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
                            if (org.telegram.messenger.t3.V(q11Var.Q1)) {
                                i10 = 2131752288;
                            } else {
                                i10 = 2131749436;
                            }
                            arrayList.add(org.telegram.ui.Components.r31.r(org.telegram.messenger.bd.M0(i10, null)));
                            z11 = false;
                        }
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.d(tLObject3)));
                        org.telegram.ui.Components.r31 w14 = org.telegram.ui.Components.r31.w(tLObject3);
                        if (org.telegram.messenger.m5.d(tLObject3) == org.telegram.messenger.m5.d(q11Var.T1)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        w14.L(z12);
                        arrayList.add(w14);
                    }
                }
                if (!arrayList3.isEmpty() && p11Var2.f48407f) {
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                    arrayList.add(org.telegram.ui.Components.r31.p(i3));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        j31 j31Var = (j31) this.f44237b;
        ArrayList arrayList = (ArrayList) obj;
        org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
        LinearLayout linearLayout = j31Var.R1;
        if (linearLayout != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout));
        }
        LinearLayout linearLayout2 = j31Var.S1;
        if (linearLayout2 != null) {
            arrayList.add(org.telegram.ui.Components.r31.k(linearLayout2));
        }
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Chat M0;
        int i3;
        int i10;
        boolean z10;
        d41 d41Var;
        ArrayList arrayList;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        float f10;
        float f11;
        String str2;
        int i11;
        boolean z11;
        int i12;
        int i13;
        long j10;
        TL_stories.StoryItem storyItem;
        float f12;
        float f13;
        int i14 = 2;
        org.telegram.ui.Components.ei eiVar = null;
        int i15 = 0;
        switch (this.f44236a) {
            case 0:
                d5 d5Var = (d5) this.f44237b;
                d5Var.f44559w.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.f44560x = false;
                si.b bVar = d5Var.h;
                bVar.a((Bitmap) obj2);
                jh.d.c(bVar, d5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                h9 h9Var = (h9) this.f44237b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var = (org.telegram.ui.Components.f41) obj2;
                boolean isEmpty = h9Var.H.isEmpty();
                ArrayList arrayList3 = h9Var.f45865y;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(1, 2131231770, org.telegram.messenger.bd.M0(2131749498, null));
                    c2.f37632q = true;
                    arrayList2.add(c2);
                    if (!h9Var.getUserConfig().X) {
                        org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(2, 2131231764, org.telegram.messenger.bd.M0(2131749469, null));
                        c10.f37632q = true;
                        arrayList2.add(c10);
                    }
                    arrayList2.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = h9Var.H;
                    int size = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList4.get(i16);
                        i16++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (M0 = h9Var.getMessagesController().M0(l10)) != null) {
                            l8 l8Var = new l8(h9Var, 0);
                            int i17 = f9.f45219b;
                            org.telegram.ui.Components.r31 K = org.telegram.ui.Components.r31.K(f9.class);
                            K.G = M0;
                            K.D = l8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.r31.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList3.get(i18);
                        i18++;
                        e9 e9Var = (e9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, h9Var, e9Var);
                        int i19 = c9.f44278b;
                        org.telegram.ui.Components.r31 K2 = org.telegram.ui.Components.r31.K(c9.class);
                        K2.G = e9Var;
                        K2.D = gVar;
                        K2.L(h9Var.k0(e9Var.f44928c));
                        arrayList2.add(K2);
                    }
                    if (!h9Var.G) {
                        arrayList2.add(org.telegram.ui.Components.r31.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.r31.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.r31.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xd xdVar = (xd) this.f44237b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var2 = (org.telegram.ui.Components.f41) obj2;
                xdVar.S0 = -1;
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(xdVar.f51929p0).M0(Long.valueOf(-xdVar.f51931q0));
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(xdVar.f51929p0).N0(-xdVar.f51931q0);
                if (N0 != null) {
                    i3 = N0.stats_dc;
                } else {
                    i3 = -1;
                }
                if (xdVar.f51916c1) {
                    arrayList5.add(org.telegram.ui.Components.r31.g(xdVar.f51937t0));
                    d41 d41Var2 = xdVar.m1;
                    if (d41Var2 != null && !d41Var2.f44547l) {
                        arrayList5.add(org.telegram.ui.Components.r31.h(5, i3, d41Var2));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-1, null));
                    }
                    d41 d41Var3 = xdVar.f51926n1;
                    if (d41Var3 != null && !d41Var3.f44547l) {
                        arrayList5.add(org.telegram.ui.Components.r31.h(2, i3, d41Var3));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-2, null));
                    }
                }
                if (xdVar.f51917d1 && (d41Var = xdVar.f51928o1) != null && !d41Var.f44547l) {
                    arrayList5.add(org.telegram.ui.Components.r31.h(2, i3, d41Var));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-3, null));
                }
                if (xdVar.f51930p1) {
                    arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748393, null)));
                    arrayList5.add(org.telegram.ui.Components.r31.v(xdVar.f51932q1));
                    arrayList5.add(org.telegram.ui.Components.r31.v(xdVar.f51934r1));
                    arrayList5.add(org.telegram.ui.Components.r31.v(xdVar.f51936s1));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-4, xdVar.f51940v0));
                }
                if (M02 != null && M02.creator) {
                    if (xdVar.f51916c1) {
                        arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748414, null)));
                        arrayList5.add(org.telegram.ui.Components.r31.k(xdVar.f51942x0));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-5, xdVar.f51939u0));
                        int i20 = org.telegram.messenger.hp.s1(xdVar.f51929p0).f23183z4;
                        String M03 = org.telegram.messenger.bd.M0(2131748373, null);
                        if (xdVar.f51935s0 < i20) {
                            i10 = i20;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = org.telegram.messenger.t0.f25457b;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M03);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(0, new org.telegram.ui.ActionBar.s2(i10, context, null, false));
                            wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
                            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            M03 = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.r31 i21 = org.telegram.ui.Components.r31.i(1, M03);
                        if (xdVar.f51935s0 >= i20 && xdVar.k1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i21.L(z10);
                        arrayList5.add(i21);
                        arrayList5.add(org.telegram.ui.Components.r31.B(-8, org.telegram.messenger.bd.M0(2131748372, null)));
                    }
                    if (xdVar.f51917d1) {
                        arrayList5.add(org.telegram.ui.Components.r31.b(org.telegram.messenger.bd.M0(2131748381, null)));
                        arrayList5.add(org.telegram.ui.Components.r31.j(3, xdVar.D0));
                        arrayList5.add(org.telegram.ui.Components.r31.B(-6, xdVar.f51941w0));
                    }
                }
                if (org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(xdVar.f51929p0).M0(Long.valueOf(-xdVar.f51931q0))) && org.telegram.messenger.hp.s1(xdVar.f51929p0).f23017g6) {
                    arrayList5.add(ii.g.i(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, xdVar.f51927o0), ln.i0(org.telegram.messenger.bd.M0(2131752474, null)), org.telegram.messenger.bd.M0(2131752475, null)));
                    arrayList5.add(org.telegram.ui.Components.r31.B(-7, null));
                }
                if (xdVar.f51915b1.a()) {
                    xdVar.S0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.r31.n(xdVar.U0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.r31.B(-10, null));
                return;
            case 3:
                rd rdVar = (rd) this.f44237b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var3 = (org.telegram.ui.Components.f41) obj2;
                td tdVar = rdVar.f49203f;
                int i22 = rdVar.d;
                int i23 = td.f49774y;
                if (i22 == 0) {
                    arrayList = tdVar.f49781r;
                } else {
                    arrayList = tdVar.f49780n;
                }
                int size3 = arrayList.size();
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    int i24 = ci.qb.f5855b;
                    org.telegram.ui.Components.r31 K3 = org.telegram.ui.Components.r31.K(ci.qb.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f37632q = true;
                    arrayList6.add(K3);
                }
                if (i22 == 0) {
                    str = tdVar.f49782s;
                } else {
                    str = tdVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.r31.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                ln lnVar = (ln) this.f44237b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    lnVar.getClass();
                    org.telegram.ui.Components.fc.a0(lnVar).f0(tL_error, false);
                }
                org.telegram.messenger.g0.E2(lnVar.f47379k0);
                org.telegram.messenger.g0.E2(lnVar.f47376h0);
                org.telegram.messenger.g0.E2(lnVar.f47378j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.messenger.g0.i3(new jp((nq) this.f44237b, 1), 1000L);
                return;
            case 6:
                ((tf.b) this.f44237b).x(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                lr lrVar = (lr) this.f44237b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var4 = (org.telegram.ui.Components.f41) obj2;
                TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.W));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.f47416b));
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.f47417c));
                if (TextUtils.isEmpty(lrVar.g0())) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748417, null)), org.telegram.messenger.l10.j(a22, true), "%1$s")));
                } else if (lrVar.L) {
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MobileVisibleInfo", null, 2131748416, org.telegram.messenger.l10.j(a22, true)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                }
                if (lrVar.J && lrVar.L) {
                    org.telegram.ui.Components.r31 i25 = org.telegram.ui.Components.r31.i(2, org.telegram.messenger.bd.M0(2131754447, null));
                    i25.L(lrVar.Y);
                    arrayList7.add(i25);
                    arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.a0(null, null, 2131754446, org.telegram.messenger.l10.j(a22, true))));
                }
                arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.d));
                arrayList7.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131754394, null)));
                if (!lrVar.J) {
                    TLRPC.UserFull b22 = lrVar.getMessagesController().b2(lrVar.I);
                    if (b22 != null && b22.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.G));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.f47425y));
                    arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.E));
                    if (a22 != null && (userProfilePhoto = a22.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.r31.k(lrVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.r31.C(null));
                    org.telegram.ui.Components.r31 e10 = org.telegram.ui.Components.r31.e(1, org.telegram.messenger.bd.M0(2131751553, null));
                    e10.f37633r = true;
                    arrayList7.add(e10);
                }
                arrayList7.add(org.telegram.ui.Components.r31.C(null));
                if (lrVar.Z) {
                    org.telegram.messenger.g0.h3(new dr(lrVar, a22, 0));
                    lrVar.Z = false;
                    org.telegram.messenger.g0.i3(new br(lrVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                is.a((is) this.f44237b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                es esVar = (es) this.f44237b;
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) obj2;
                is isVar = esVar.f45025a;
                gs gsVar = isVar.f46396l;
                if (gsVar != null) {
                    String join = TextUtils.join("", isVar.f46399o);
                    if (u10Var != null) {
                        eiVar = new org.telegram.ui.Components.ei(12, esVar, u10Var);
                    }
                    gsVar.K(charSequence, join, eiVar);
                    if (u10Var == null) {
                        isVar.o();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                qs qsVar = (qs) this.f44237b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var5 = (org.telegram.ui.Components.f41) obj2;
                arrayList8.add(org.telegram.ui.Components.r31.k(qsVar.Q1));
                arrayList8.add(org.telegram.ui.Components.r31.C(null));
                ArrayList arrayList9 = qsVar.T1;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    arrayList8.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749497, null)));
                    while (i15 < arrayList9.size()) {
                        Long l11 = (Long) arrayList9.get(i15);
                        l11.getClass();
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(qsVar.f28583a).a2(l11);
                        if (a23 != null) {
                            int i26 = bh.o.f3346b;
                            org.telegram.ui.Components.r31 K4 = org.telegram.ui.Components.r31.K(bh.o.class);
                            K4.G = a23;
                            K4.L(qsVar.U1.contains(l11));
                            arrayList8.add(K4);
                            i15++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                uw uwVar = (uw) this.f44237b;
                Long l12 = (Long) obj2;
                uwVar.Q1 = (Long) obj;
                uwVar.g5();
                return;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                Long l13 = (Long) obj2;
                ((Runnable) this.f44237b).run();
                return;
            case 13:
                kx kxVar = (kx) this.f44237b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var6 = (org.telegram.ui.Components.f41) obj2;
                String M04 = org.telegram.messenger.bd.M0(2131743999, null);
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(2);
                r31Var.f37627l = M04;
                r31Var.f37626k = 2131624298;
                arrayList10.add(r31Var);
                org.telegram.ui.Components.r31 i27 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.bd.M0(2131744000, null));
                i27.L(kxVar.f47045c);
                arrayList10.add(i27);
                if (kxVar.f47045c) {
                    arrayList10.add(org.telegram.ui.Components.r31.C(null));
                    arrayList10.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131743998, null)));
                    s3 s3Var = new s3(kxVar, 6);
                    int i28 = ix.f46430b;
                    org.telegram.ui.Components.r31 K5 = org.telegram.ui.Components.r31.K(ix.class);
                    K5.d = 2;
                    K5.G = s3Var;
                    if (!kxVar.f47046e) {
                        if (kxVar.d) {
                            i14 = 0;
                        } else {
                            i14 = 1;
                        }
                    }
                    K5.f37640z = i14;
                    arrayList10.add(K5);
                    arrayList10.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131743997, null)));
                    return;
                }
                return;
            case 14:
                m90 m90Var = (m90) this.f44237b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                m90Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    org.telegram.messenger.hp.s1(m90Var.f47567b).Y3(tL_tones.users, false);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(T.getContext(), tL_tones.tones.get(0), T.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.k5.o(null, 2131754974, m90.d(), 2131624011, 36);
                        return;
                    } else {
                        m90.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                pr0 pr0Var = (pr0) this.f44237b;
                si.b bVar2 = pr0Var.G;
                Bitmap bitmap = (Bitmap) obj2;
                pr0Var.f48652s = (Bitmap) obj;
                Paint paint = new Paint(1);
                pr0Var.f48654x = paint;
                Bitmap bitmap2 = pr0Var.f48652s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                pr0Var.f48653w = bitmapShader;
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
                pr0Var.f48654x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                pr0Var.f48655y = new Matrix();
                bVar2.a(bitmap);
                jh.d.c(bVar2, pr0Var.f48641c);
                pr0Var.H.d();
                return;
            case 16:
                xr0 xr0Var = (xr0) this.f44237b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var7 = (org.telegram.ui.Components.f41) obj2;
                String M05 = org.telegram.messenger.bd.M0(2131754276, null);
                org.telegram.ui.Components.r31 r31Var2 = new org.telegram.ui.Components.r31(2);
                r31Var2.f37627l = M05;
                r31Var2.f37626k = 2131623947;
                arrayList11.add(r31Var2);
                org.telegram.ui.Components.r31 i29 = org.telegram.ui.Components.r31.i(1, org.telegram.messenger.bd.M0(2131754277, null));
                i29.L(xr0Var.f52087n);
                arrayList11.add(i29);
                arrayList11.add(org.telegram.ui.Components.r31.B(2, null));
                if (xr0Var.f52087n) {
                    arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131746883, null)));
                    int[] a10 = org.telegram.ui.Cells.s7.a(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) xr0Var.getMessagesController().I6);
                    u70 u70Var = new u70(7);
                    org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7();
                    r7Var.f30282c = a10;
                    r7Var.d = 20;
                    r7Var.f30283e = u70Var;
                    xr0Var.f52083b.d((int) Utilities.k(xr0Var.f52088r, 10000L, 0L), r7Var, new s3(xr0Var, 19));
                    arrayList11.add(org.telegram.ui.Components.r31.j(3, xr0Var.f52083b));
                    if (xr0Var.f52088r > 0) {
                        str2 = xr0Var.b0();
                    } else {
                        str2 = null;
                    }
                    arrayList11.add(org.telegram.ui.Components.r31.B(4, str2));
                    TLRPC.Chat M06 = xr0Var.getMessagesController().M0(Long.valueOf(xr0Var.f52082a));
                    if (M06 != null && !TextUtils.isEmpty(org.telegram.messenger.t3.K(M06, false))) {
                        xr0Var.f52084c.setLink(xr0Var.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(M06, false) + "?direct");
                        arrayList11.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131752387, null)));
                        arrayList11.add(org.telegram.ui.Components.r31.j(5, xr0Var.f52084c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f44237b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f41711e = passkeys.passkeys;
                    privacySettingsActivity.F0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f44237b;
                Bitmap bitmap3 = (Bitmap) obj;
                si.b bVar3 = profileActivity.K6;
                bVar3.a((Bitmap) obj2);
                jh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.L6.d();
                return;
            case 19:
                dy0 dy0Var = (dy0) this.f44237b;
                ArrayList arrayList12 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var8 = (org.telegram.ui.Components.f41) obj2;
                org.telegram.ui.Components.l41 l41Var = dy0Var.f44832f;
                ey0 ey0Var = dy0Var.f44836w;
                ArrayList arrayList13 = ey0Var.f45097p1;
                ci.t4 t4Var = dy0Var.h;
                if (t4Var.getMeasuredHeight() <= 0) {
                    t4Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22608q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.r31 D = org.telegram.ui.Components.r31.D(t4Var.getMeasuredHeight());
                D.d = -1;
                D.f37634s = true;
                arrayList12.add(D);
                int measuredHeight = (int) ((t4Var.getMeasuredHeight() / org.telegram.messenger.g0.f22607p) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = dy0Var.f44829b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || dy0Var.f44830c != null || dy0Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || dy0Var.f44830c != null) {
                        Context context2 = dy0Var.getContext();
                        int i30 = org.telegram.ui.ActionBar.k6.L6;
                        int i31 = ey0.f45092t1;
                        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i30, 21, 0, 0, false, false, ey0Var.J0);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = dy0Var.f44829b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            n4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = dy0Var.f44830c;
                            if (tL_reportResultChooseOption != null) {
                                n4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, n4Var, ey0Var.J0);
                        org.telegram.ui.Components.r31 k10 = org.telegram.ui.Components.r31.k(n4Var);
                        k10.d = -2;
                        arrayList12.add(k10);
                        measuredHeight += 40;
                    }
                    if (dy0Var.f44829b != null) {
                        for (int i32 = 0; i32 < dy0Var.f44829b.options.size(); i32++) {
                            org.telegram.ui.Components.r31 r31Var3 = new org.telegram.ui.Components.r31(30);
                            r31Var3.f37627l = dy0Var.f44829b.options.get(i32).text;
                            r31Var3.f37626k = 2131232059;
                            r31Var3.d = i32;
                            arrayList12.add(r31Var3);
                            measuredHeight += 50;
                        }
                    } else if (dy0Var.f44830c != null) {
                        for (int i33 = 0; i33 < dy0Var.f44830c.options.size(); i33++) {
                            org.telegram.ui.Components.r31 r31Var4 = new org.telegram.ui.Components.r31(30);
                            r31Var4.f37627l = dy0Var.f44830c.options.get(i33).text;
                            r31Var4.f37626k = 2131232059;
                            r31Var4.d = i33;
                            arrayList12.add(r31Var4);
                            measuredHeight += 50;
                        }
                    } else if (dy0Var.d != null) {
                        if (dy0Var.f44833n == null) {
                            Context context3 = dy0Var.getContext();
                            int i34 = ey0.f45092t1;
                            by0 by0Var = new by0(dy0Var, context3, ey0Var.J0);
                            dy0Var.f44833n = by0Var;
                            by0Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.i3 i3Var = dy0Var.f44833n.d;
                        if (dy0Var.d.optional) {
                            i11 = 2131746246;
                        } else {
                            i11 = 2131746252;
                        }
                        i3Var.setHint(org.telegram.messenger.bd.M0(i11, null));
                        org.telegram.ui.Components.r31 k11 = org.telegram.ui.Components.r31.k(dy0Var.f44833n);
                        k11.d = -3;
                        arrayList12.add(k11);
                        long j11 = ey0Var.f45099r1;
                        if (arrayList13 != null && !arrayList13.isEmpty()) {
                            if (arrayList13.size() > 1) {
                                i12 = 2131746248;
                            } else {
                                i12 = 2131746251;
                            }
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(i12, null)));
                        } else if (org.telegram.messenger.m5.E(j11)) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746247, null)));
                        } else if (org.telegram.messenger.t3.V(org.telegram.messenger.hp.s1(ey0Var.f28583a).M0(Long.valueOf(-j11)))) {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746250, null)));
                        } else {
                            arrayList12.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131746249, null)));
                        }
                        if (dy0Var.f44834r == null) {
                            gi.d dVar = new gi.d(dy0Var.getContext(), ey0Var.J0, true);
                            dy0Var.f44835s = dVar;
                            dVar.i(org.telegram.messenger.bd.M0(2131746245, null), false, true);
                            FrameLayout frameLayout = new FrameLayout(dy0Var.getContext());
                            dy0Var.f44834r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout, ey0Var.J0);
                            dy0Var.f44834r.addView(dy0Var.f44835s, b8.mf.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(dy0Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, ey0Var.J0);
                            dy0Var.f44834r.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22607p, 48));
                        }
                        gi.d dVar2 = dy0Var.f44835s;
                        if (!dy0Var.d.optional && TextUtils.isEmpty(dy0Var.f44833n.getText())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                        dy0Var.f44835s.setOnClickListener(new b40(dy0Var, 29));
                        org.telegram.ui.Components.r31 k12 = org.telegram.ui.Components.r31.k(dy0Var.f44834r);
                        k12.d = -4;
                        arrayList12.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.r31) k2.p1.h(1, arrayList12)).f37625j = true;
                    if (ey0Var.m1 && dy0Var.f44828a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(dy0Var.getContext());
                        Drawable mutate = dy0Var.getContext().getResources().getDrawable(2131231229).mutate();
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.f27843b7, ey0Var.J0, PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.y(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.f27824a7, ey0Var.J0, PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(colorDrawable, mutate, 0, 0);
                        xpVar.f40447x = true;
                        frameLayout2.setBackground(xpVar);
                        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(dy0Var.getContext(), null);
                        s70Var.setTextSize(1, 14.0f);
                        s70Var.setText(org.telegram.messenger.g0.L2(org.telegram.messenger.bd.M0(2131746243, null), ey0Var.J0, null));
                        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.A6, ey0Var.J0);
                        s70Var.setGravity(17);
                        frameLayout2.addView(s70Var, b8.mf.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.r31 k13 = org.telegram.ui.Components.r31.k(frameLayout2);
                        k13.d = -3;
                        arrayList12.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (l41Var != null) {
                    int i35 = ey0.f45092t1;
                    if (ey0Var.f28586b.getMeasuredHeight() - org.telegram.messenger.g0.f22602m < org.telegram.messenger.g0.L(measuredHeight)) {
                        l41Var.f35593f3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList12);
                    l41Var.f35593f3.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.f41 f41Var9 = (org.telegram.ui.Components.f41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((iy0) this.f44237b).Q1));
                return;
            case 21:
                org.telegram.ui.Components.f41 f41Var10 = (org.telegram.ui.Components.f41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.r31.k(((org.telegram.ui.Components.i20) this.f44237b).R1));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f44237b).getClass();
                return;
            case 23:
                b(obj, obj2);
                return;
            case 24:
                p11 p11Var = (p11) this.f44237b;
                ArrayList arrayList14 = p11Var.f48406e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = p11Var.f48403a;
                ArrayList arrayList15 = p11Var.d;
                if (tL_error5 != null) {
                    if (p11Var.f48409r) {
                        arrayList15.clear();
                        p11Var.f48409r = false;
                    }
                    p11Var.h = true;
                    p11Var.f48407f = false;
                    int size4 = arrayList14.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList14.get(i15);
                        i15++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                org.telegram.messenger.hp.s1(i36).Y3(channels_channelparticipants.users, false);
                org.telegram.messenger.hp.s1(i36).S3(channels_channelparticipants.chats, false);
                if (p11Var.f48409r) {
                    arrayList15.clear();
                    p11Var.f48409r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList16 = channels_channelparticipants.participants;
                int size5 = arrayList16.size();
                int i37 = 0;
                while (i37 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList16.get(i37);
                    i37++;
                    TLObject e22 = org.telegram.messenger.hp.s1(i36).e2(org.telegram.messenger.m5.o(channelParticipant.peer));
                    if (e22 != null) {
                        arrayList15.add(e22);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    p11Var.h = true;
                }
                p11Var.f48407f = false;
                int size6 = arrayList14.size();
                while (i15 < size6) {
                    Object obj7 = arrayList14.get(i15);
                    i15++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                s11 s11Var = (s11) this.f44237b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.f41 f41Var11 = (org.telegram.ui.Components.f41) obj2;
                int i38 = s11Var.U1;
                ei.r6 r6Var = s11Var.S1;
                if (r6Var != null) {
                    arrayList17.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(16.0f)));
                    ArrayList arrayList18 = r6Var.f10876i;
                    int size7 = arrayList18.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size7) {
                        Object obj8 = arrayList18.get(i40);
                        i40++;
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj8;
                        int i41 = y41.f52191c;
                        org.telegram.ui.Components.r31 K6 = org.telegram.ui.Components.r31.K(y41.class);
                        K6.f37636u = 1;
                        K6.f37640z = 0;
                        K6.G = ziVar;
                        if (ziVar != null && (storyItem = ziVar.f26871l) != null) {
                            j10 = storyItem.f27240id;
                        } else {
                            j10 = -1;
                        }
                        K6.B = j10;
                        K6.f37622f = true;
                        K6.v = i38;
                        K6.L(s11Var.T1.containsKey(Integer.valueOf(ziVar.f1())));
                        K6.f37636u = 1;
                        arrayList17.add(K6);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (r6Var.k() || !r6Var.f10885r) {
                        while (true) {
                            if (i39 <= 0) {
                                i13 = i38;
                            } else {
                                i13 = i39;
                            }
                            if (i15 < i13) {
                                i15++;
                                org.telegram.ui.Components.r31 q10 = org.telegram.ui.Components.r31.q(i15, 34);
                                q10.f37636u = 1;
                                arrayList17.add(q10);
                            }
                        }
                    }
                    arrayList17.add(org.telegram.ui.Components.r31.D(org.telegram.messenger.g0.L(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.f41 f41Var12 = (org.telegram.ui.Components.f41) obj2;
                c31.f0((c31) this.f44237b, (ArrayList) obj);
                return;
            case 27:
                c(obj, obj2);
                return;
            default:
                w71 w71Var = (w71) this.f44237b;
                si.b bVar4 = w71Var.F;
                Bitmap bitmap4 = (Bitmap) obj2;
                w71Var.f50743r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                w71Var.f50745w = paint2;
                Bitmap bitmap5 = w71Var.f50743r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                w71Var.f50744s = bitmapShader2;
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
                w71Var.f50745w.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                w71Var.f50746x = new Matrix();
                bVar4.a(bitmap4);
                jh.d.c(bVar4, w71Var.f50733b);
                w71Var.G.d();
                return;
        }
    }
}
