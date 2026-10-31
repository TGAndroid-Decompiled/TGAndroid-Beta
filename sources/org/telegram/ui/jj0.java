package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class jj0 {
    public static org.telegram.ui.ActionBar.z2 f38536a;

    public static org.telegram.ui.Components.cc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        HashSet hashSet = xh.m2.f53871a1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            xh.m2 m2Var = null;
            while (it.hasNext()) {
                xh.m2 m2Var2 = (xh.m2) it.next();
                if (m2Var2.Z0) {
                    m2Var = m2Var2;
                }
            }
            if (m2Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context2 = T.getParentActivity();
                } else {
                    context2 = LaunchActivity.I1;
                    if (context2 == null) {
                        context2 = org.telegram.messenger.w0.f19025b;
                    }
                }
                return new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(context2), null);
            }
        }
        HashSet hashSet2 = h4.f37702c1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            h4 h4Var = null;
            while (it2.hasNext()) {
                h4 h4Var2 = (h4) it2.next();
                if (h4Var2.V) {
                    h4Var = h4Var2;
                }
            }
            if (h4Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context = T.getParentActivity();
                } else {
                    context = LaunchActivity.I1;
                    if (context == null) {
                        context = org.telegram.messenger.w0.f19025b;
                    }
                }
                return new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(context), null);
            }
        }
        if (T != null && T.getLastSheet() != null && T.getLastSheet().k() != null) {
            return T.getLastSheet().k();
        }
        return org.telegram.ui.Components.cc.a0(T);
    }

    public static void b(boolean z10, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.z0 z0Var) {
        final Context context;
        org.telegram.ui.ActionBar.p6 p6Var;
        String str3;
        boolean z12;
        ?? r82;
        boolean z13;
        org.telegram.ui.Cells.t8 t8Var;
        String str4;
        ArrayList arrayList;
        vh.d dVar;
        org.telegram.ui.ActionBar.k2 T;
        String str5;
        org.telegram.ui.ActionBar.k2 T2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (z0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(z0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (z0Var != null) {
                        z0Var.x("oauth_result_confirmed", org.telegram.ui.web.z0.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                    if (T3 == null) {
                        return;
                    }
                    gf.f.t(T3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z14 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z14) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : org.telegram.messenger.cd.L0(2131743851, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623989, org.telegram.messenger.cd.L0(2131753126, null), org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.uj, false), org.telegram.messenger.cd.a0(null, null, z14 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? 2131753125 : 2131753127, str5))).j();
                }
                if (z0Var != null) {
                    z0Var.x("oauth_result_confirmed", org.telegram.ui.web.z0.A(null, "result_url"));
                } else if (z10 && (T2 = LaunchActivity.T()) != null && (context2 = T2.getContext()) != null) {
                    org.telegram.messenger.i0.h3(new ev(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (z0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 == null) {
                    return;
                }
                org.telegram.ui.Components.s4.p0(T4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (T = LaunchActivity.T()) != null) {
                org.telegram.ui.Components.s4.p0(T, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
            if (T5 == null || (context = T5.getContext()) == null) {
                return;
            }
            final org.telegram.ui.ActionBar.p6 resourceProvider = T5.getResourceProvider();
            org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, T5.getResourceProvider(), false);
            FrameLayout frameLayout = new FrameLayout(context);
            k10.N = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
            arrayList2.clear();
            for (int i11 = 0; i11 < 4; i11++) {
                if (org.telegram.messenger.d20.i(i11).p() && ConnectionsManager.getInstance(i11).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            Collections.sort(arrayList2, new f6(27));
            final boolean z15 = tL_messages_requestUrlAuth.peer != null;
            boolean z16 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(14.0f);
            int i12 = org.telegram.ui.ActionBar.t6.f21019i5;
            Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, T5.getThemedColor(i12));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(frameLayout3, d02, N, null, resourceProvider);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
            g9Var.getImageReceiver().A0 = true;
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            final int[] iArr = {i10};
            TLRPC.User f7 = org.telegram.messenger.d20.i(iArr[0]).f();
            r8Var.r(f7);
            g9Var.e(f7, r8Var);
            frameLayout3.addView(g9Var, w7.b6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.t6.f21185r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.a7.t(imageView, i13, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, w7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, w7.b6.e(52, 28, 17));
            frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.b6.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.e6.a(frameLayout2);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
            frameLayout.addView(f10, w7.b6.e(-1, -1, 119));
            org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(40.0f));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(tL_urlAuthResultRequest2.bot);
            g9Var2.e(tL_urlAuthResultRequest2.bot, r8Var2);
            f10.addView(g9Var2, w7.b6.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    p6Var = null;
                    str3 = org.telegram.messenger.cd.L0(2131743851, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    p6Var = null;
                }
            } else {
                p6Var = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str6 = str3;
            int i14 = org.telegram.ui.ActionBar.t6.f21037j5;
            TextView b10 = w7.g6.b(context, 20.0f, i14, true, p6Var);
            b10.setGravity(17);
            b10.setText(org.telegram.messenger.i0.P2(org.telegram.messenger.cd.a0(null, null, 2131753113, str6), org.telegram.ui.ActionBar.t6.Ci, T5.getResourceProvider(), null, false));
            f10.addView(b10, w7.b6.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = w7.g6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            b11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(z16 ? 2131753134 : z15 ? 2131753132 : 2131753114, null)));
            f10.addView(b11, w7.b6.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z12 = z16;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                int i15 = org.telegram.ui.ActionBar.t6.f20929d6;
                Drawable f02 = org.telegram.ui.ActionBar.t6.f0(L2, T5.getThemedColor(i15));
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
                linearLayout.setBackground(f02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, f02, N2, null, resourceProvider);
                f10.addView(linearLayout, w7.b6.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z12 = z16;
                } else {
                    LinearLayout f11 = org.telegram.messenger.m5.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232023);
                    org.telegram.ui.ActionBar.a7.t(imageView2, i14, resourceProvider, mode);
                    f11.addView(imageView2, w7.b6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f11.addView(linearLayout2, w7.b6.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b12 = w7.g6.b(context, 16.0f, i14, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, w7.b6.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = w7.g6.b(context, 13.0f, org.telegram.ui.ActionBar.t6.f21311y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z12 = z16;
                    linearLayout2.addView(b13, w7.b6.r(-1, -2, 55));
                    linearLayout.addView(f11, w7.b6.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r82 = 0;
                    z13 = false;
                } else {
                    LinearLayout f12 = org.telegram.messenger.m5.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232029);
                    org.telegram.ui.ActionBar.a7.t(imageView3, i14, resourceProvider, mode);
                    f12.addView(imageView3, w7.b6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f12.addView(linearLayout3, w7.b6.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = w7.g6.b(context, 16.0f, i14, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, w7.b6.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r82 = 0;
                    z13 = false;
                    TextView b15 = w7.g6.b(context, 13.0f, org.telegram.ui.ActionBar.t6.f21311y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : org.telegram.messenger.cd.a0(null, null, 2131753133, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, w7.b6.r(-1, -2, 55));
                    linearLayout.addView(f12, w7.b6.o(-1, -2));
                }
                TextView b16 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.f21311y6, z13, r82);
                b16.setText(org.telegram.messenger.cd.L0(2131753131, r82));
                f10.addView(b16, w7.b6.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = org.telegram.messenger.i0.L(16.0f);
                int i16 = org.telegram.ui.ActionBar.t6.f20929d6;
                InsetDrawable f03 = org.telegram.ui.ActionBar.t6.f0(L3, T5.getThemedColor(i16));
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i16);
                frameLayout4.setBackground(f03);
                org.telegram.ui.ActionBar.a7.k(frameLayout4, f03, N3, null, resourceProvider);
                org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, T5.getResourceProvider());
                t8Var2.f(org.telegram.messenger.cd.L0(2131753136, null), true, false);
                int themedColor = T5.getThemedColor(i16);
                int i17 = org.telegram.ui.ActionBar.t6.f21020i6;
                org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(themedColor, T5.getThemedColor(i17), 16, 16);
                org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i16);
                org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i17);
                t8Var2.setBackground(b02);
                org.telegram.ui.ActionBar.a7.k(t8Var2, b02, N4, N5, resourceProvider);
                t8Var2.setOnClickListener(new f50(t8Var2, 12));
                frameLayout4.addView(t8Var2, w7.b6.e(-1, -1, 119));
                f10.addView(frameLayout4, w7.b6.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = w7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.t6.f21311y6, false, null);
                b17.setText(org.telegram.messenger.cd.a0(null, null, 2131753135, org.telegram.messenger.h20.p(tL_urlAuthResultRequest2.bot)));
                f10.addView(b17, w7.b6.t(-1, -2, 55, 22, 6, 22, 20));
                t8Var = t8Var2;
            } else {
                t8Var = null;
            }
            LinearLayout f13 = org.telegram.messenger.m5.f(context, 0);
            final vh.d dVar2 = new vh.d(context, T5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            int i18 = org.telegram.ui.ActionBar.t6.f21153p7;
            dVar2.setColor(T5.getThemedColor(i18));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i18);
                dVar2.setBackground(background);
                str4 = null;
                org.telegram.ui.ActionBar.a7.k(dVar2, background, N6, null, resourceProvider);
            } else {
                str4 = null;
            }
            dVar2.setText(org.telegram.messenger.cd.L0(2131751605, str4));
            f13.addView(dVar2, w7.b6.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            vh.d dVar3 = new vh.d(context, T5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            dVar3.setText(org.telegram.messenger.cd.L0(2131753124, null));
            f13.addView(dVar3, w7.b6.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f10.addView(f13, w7.b6.t(-1, -2, 7, 12, 12, 12, 8));
            k10.f21623y0 = new ij0(dVar3);
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.z2[] z2VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            k10.w0(org.telegram.ui.ActionBar.t6.f20872a7);
            final String[] strArr = {str2};
            org.telegram.ui.Cells.t8 t8Var3 = t8Var;
            ArrayList arrayList3 = arrayList2;
            gj0 gj0Var = new gj0(iArr, dVar3, dVar2, tL_messages_requestUrlAuth, k10, z10, str, urlAuthResult2, strArr, z11, z0Var, str6, resourceProvider);
            vh.d dVar4 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && org.telegram.messenger.d20.i(i10).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i19 = 0;
                while (i19 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i19);
                    i19++;
                    Integer num = (Integer) obj;
                    int i20 = size;
                    dVar = dVar4;
                    if (org.telegram.messenger.d20.i(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        gj0Var.a(num);
                        break;
                    }
                    dVar4 = dVar;
                    size = i20;
                    arrayList3 = arrayList;
                }
            }
            arrayList = arrayList3;
            dVar = dVar4;
            frameLayout2.setOnClickListener(new bi.c(k10, frameLayout3, arrayList, iArr, gj0Var));
            boolean[] zArr2 = new boolean[1];
            final vh.d dVar5 = dVar;
            dVar2.setOnClickListener(new wt(dVar5, tL_messages_requestUrlAuth, zArr2, k10, dVar2, z0Var, i10));
            final boolean[] zArr3 = new boolean[1];
            final boolean z17 = z12;
            final m4.a1 a1Var = new m4.a1(tL_urlAuthResultRequest2, strArr, context, i10, new hj0(dVar5, dVar2, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, t8Var3, zArr3, zArr, iArr, zArr2, k10, str6, resourceProvider, z10, str, z0Var), T5, 10);
            dVar5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!vh.d.this.Q && !dVar2.Q) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z18 = tL_urlAuthResultRequest3.request_phone_number;
                        final m4.a1 a1Var2 = a1Var;
                        if (z18) {
                            TLRPC.User f14 = org.telegram.messenger.d20.i(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, T5.getResourceProvider());
                            String L0 = org.telegram.messenger.cd.L0(2131753120, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L0;
                            if (z15 && !z17) {
                                str7 = org.telegram.messenger.h20.p(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            af.b c10 = af.b.c();
                            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131753117, str7, c10.b("+" + f14.phone).replaceAll(" ", " ")));
                            String L02 = org.telegram.messenger.cd.L0(2131753118, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(L02, new org.telegram.ui.ActionBar.u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i21) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            a1Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            a1Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753119, null), new org.telegram.ui.ActionBar.u1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i21) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            a1Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            a1Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.p();
                            return;
                        }
                        a1Var2.run();
                    }
                }
            });
            k10.setOnDismissListener(new aj0(zArr, inputtonconnectoauthsessionArr, z2VarArr, new org.telegram.ui.ActionBar.z2[1]));
            org.telegram.ui.ActionBar.z2 z2Var = f38536a;
            if (z2Var != null) {
                z2Var.dismiss();
                f38536a = null;
            }
            final org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(tL_urlAuthResultRequest2, k10, z2VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, a1Var);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f38536a = c(context, i10, tL_urlAuthResultRequest2.match_codes, str6, new org.telegram.messenger.q20() {
                    @Override
                    public final void a(Object obj2) {
                        String str7 = (String) obj2;
                        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
                        x1Var.r(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str7;
                        tL_messages_checkUrlAuthMatchCode.match_code = str7;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new a3.b(1), new cj0(x1Var, b41Var, str6, resourceProvider, 0));
                    }
                }, false, new org.telegram.ui.Components.c11(zArr2, z0Var, tL_messages_requestUrlAuth, i10, 6), T5.getResourceProvider());
            } else {
                b41Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.z2 c(Context context, int i10, ArrayList arrayList, String str, org.telegram.messenger.q20 q20Var, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11;
        int i12;
        jh.g gVar;
        int i13;
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, null, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        f7.addView(textView, w7.b6.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(19.0f), 0, org.telegram.messenger.i0.L(19.0f));
        f7.addView(linearLayout, w7.b6.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i11 = 0;
            while (i11 < 4) {
                if (org.telegram.messenger.d20.i(i11).p() && !ConnectionsManager.getInstance(i11).isTestBackend()) {
                    break;
                }
                i11++;
            }
        }
        i11 = i10;
        org.telegram.ui.Components.g9[] g9VarArr = new org.telegram.ui.Components.g9[arrayList.size()];
        boolean z11 = true;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            String str2 = (String) arrayList.get(i14);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(70.0f);
            int i15 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.z2 z2Var = k10;
            int i16 = i14;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var)));
            org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.05f, i15);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.a7.k(frameLayout, L2, L3, null, p6Var);
            org.telegram.messenger.g6 f10 = org.telegram.messenger.k6.f(str2);
            if (f10 == null) {
                gVar = new jh.g(6, new org.telegram.ui.Components.qz0(str2, 30.0f, org.telegram.messenger.i0.o()), p6Var);
                z11 = false;
            } else {
                gVar = f10;
            }
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
            g9VarArr[i16] = g9Var;
            g9Var.getImageReceiver().d = i11;
            g9Var.m(null, null, null, null, gVar, null);
            org.telegram.messenger.zs.i(g9Var);
            frameLayout.addView(g9Var, w7.b6.e(40, 40, 17));
            if (i16 == 0) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            linearLayout.addView(frameLayout, w7.b6.t(70, 70, 16, i13, 0, 0, 0));
            w7.e6.a(frameLayout);
            frameLayout.setOnClickListener(new x(z2VarArr, q20Var, str2));
            i14 = i16 + 1;
            k10 = z2Var;
        }
        org.telegram.ui.ActionBar.z2 z2Var2 = k10;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        org.telegram.messenger.ui.b0(i11).l0(tL_inputStickerSetShortName, null, false, false, new org.telegram.ui.Components.vg(23, arrayList, g9VarArr));
        if (z11) {
            i12 = 2131753115;
        } else {
            i12 = 2131753116;
        }
        textView.setText(org.telegram.messenger.cd.L0(i12, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
        textView2.setText(org.telegram.messenger.i0.P2(org.telegram.messenger.cd.a0(null, null, 2131753123, str), org.telegram.ui.ActionBar.t6.Ci, null, null, false));
        f7.addView(textView2, w7.b6.t(-1, -2, 1, 0, 23, 0, 11));
        vh.d i17 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        if (z10) {
            i17.e();
            i17.setText(org.telegram.messenger.cd.L0(2131752589, null));
        } else {
            int i18 = org.telegram.ui.ActionBar.t6.f21153p7;
            i17.setColor(org.telegram.ui.ActionBar.t6.w0(i18, p6Var));
            if (i17.getBackground() != null) {
                Drawable background = i17.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
                i17.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(i17, background, N, null, p6Var);
            }
            i17.setText(org.telegram.messenger.cd.L0(2131751605, null));
        }
        f7.addView(i17, w7.b6.t(-1, 48, 7, 12, 12, 12, 12));
        i17.setOnClickListener(new x(i17, z2VarArr, runnable, 13));
        z2Var2.show();
        z2VarArr[0] = z2Var2;
        return z2Var2;
    }
}
