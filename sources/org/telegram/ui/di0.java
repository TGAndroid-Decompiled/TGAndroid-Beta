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
public abstract class di0 {
    public static org.telegram.ui.ActionBar.u2 f46411a;

    public static org.telegram.ui.Components.cc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        HashSet hashSet = ki.x2.f18648b1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            ki.x2 x2Var = null;
            while (it.hasNext()) {
                ki.x2 x2Var2 = (ki.x2) it.next();
                if (x2Var2.f18653a1) {
                    x2Var = x2Var2;
                }
            }
            if (x2Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context2 = T.getParentActivity();
                } else {
                    context2 = LaunchActivity.H1;
                    if (context2 == null) {
                        context2 = org.telegram.messenger.t0.f26600b;
                    }
                }
                return new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(context2), null);
            }
        }
        HashSet hashSet2 = g4.f47292d1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            g4 g4Var = null;
            while (it2.hasNext()) {
                g4 g4Var2 = (g4) it2.next();
                if (g4Var2.W) {
                    g4Var = g4Var2;
                }
            }
            if (g4Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context = T.getParentActivity();
                } else {
                    context = LaunchActivity.H1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f26600b;
                    }
                }
                return new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(context), null);
            }
        }
        if (T != null && T.getLastSheet() != null && T.getLastSheet().k() != null) {
            return T.getLastSheet().k();
        }
        return org.telegram.ui.Components.cc.a0(T);
    }

    public static void b(boolean z10, final int i7, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.v0 v0Var) {
        final Context context;
        org.telegram.ui.ActionBar.e6 e6Var;
        String str3;
        boolean z12;
        ?? r82;
        boolean z13;
        org.telegram.ui.Cells.q8 q8Var;
        String str4;
        ArrayList arrayList;
        hi.d dVar;
        org.telegram.ui.ActionBar.e2 T;
        String str5;
        org.telegram.ui.ActionBar.e2 T2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (v0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(v0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (v0Var != null) {
                        v0Var.y("oauth_result_confirmed", org.telegram.ui.web.v0.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                    if (T3 == null) {
                        return;
                    }
                    vf.c.v(T3.getContext(), tL_urlAuthResultAccepted.url, true);
                    return;
                }
                boolean z14 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z14) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : org.telegram.messenger.hd.M0(2131743825, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623990, org.telegram.messenger.hd.M0(2131753126, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.xj, false), org.telegram.messenger.hd.a0(null, null, z14 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? 2131753125 : 2131753127, str5))).j();
                }
                if (v0Var != null) {
                    v0Var.y("oauth_result_confirmed", org.telegram.ui.web.v0.A(null, "result_url"));
                } else if (z10 && (T2 = LaunchActivity.T()) != null && (context2 = T2.getContext()) != null) {
                    org.telegram.messenger.g0.i3(new du(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (v0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.e2 T4 = LaunchActivity.T();
                if (T4 == null) {
                    return;
                }
                org.telegram.ui.Components.t4.n0(T4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (T = LaunchActivity.T()) != null) {
                org.telegram.ui.Components.t4.n0(T, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.e2 T5 = LaunchActivity.T();
            if (T5 == null || (context = T5.getContext()) == null) {
                return;
            }
            final org.telegram.ui.ActionBar.e6 resourceProvider = T5.getResourceProvider();
            org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, T5.getResourceProvider(), false);
            FrameLayout frameLayout = new FrameLayout(context);
            k10.O = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
            arrayList2.clear();
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.m10.i(i10).p() && ConnectionsManager.getInstance(i10).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i10));
                }
            }
            Collections.sort(arrayList2, new me(27));
            final boolean z15 = tL_messages_requestUrlAuth.peer != null;
            boolean z16 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(14.0f);
            int i11 = org.telegram.ui.ActionBar.j6.f28940i5;
            Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, T5.getThemedColor(i11));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.q6.j(frameLayout3, d02, M, null, resourceProvider);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            i9Var.getImageReceiver().B0 = true;
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            final int[] iArr = {i7};
            TLRPC.User f10 = org.telegram.messenger.m10.i(iArr[0]).f();
            t8Var.r(f10);
            i9Var.f(f10, t8Var);
            frameLayout3.addView(i9Var, c8.ja.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.j6.f29107r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.q6.s(imageView, i12, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, c8.ja.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, c8.ja.e(52, 28, 17));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            frameLayout.addView(frameLayout2, c8.ja.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            c8.na.a(frameLayout2);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
            frameLayout.addView(f11, c8.ja.e(-1, -1, 119));
            org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
            i9Var2.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var2.r(tL_urlAuthResultRequest2.bot);
            i9Var2.f(tL_urlAuthResultRequest2.bot, t8Var2);
            f11.addView(i9Var2, c8.ja.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    e6Var = null;
                    str3 = org.telegram.messenger.hd.M0(2131743825, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    e6Var = null;
                }
            } else {
                e6Var = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str6 = str3;
            int i13 = org.telegram.ui.ActionBar.j6.f28957j5;
            TextView b10 = c8.sa.b(context, 20.0f, i13, true, e6Var);
            b10.setGravity(17);
            b10.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131753113, str6), org.telegram.ui.ActionBar.j6.Fi, T5.getResourceProvider(), null, false));
            f11.addView(b10, c8.ja.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = c8.sa.b(context, 14.0f, i13, false, null);
            b11.setGravity(17);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(z16 ? 2131753134 : z15 ? 2131753132 : 2131753114, null)));
            f11.addView(b11, c8.ja.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z12 = z16;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.j6.f28849d6;
                Drawable f02 = org.telegram.ui.ActionBar.j6.f0(L2, T5.getThemedColor(i14));
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
                linearLayout.setBackground(f02);
                org.telegram.ui.ActionBar.q6.j(linearLayout, f02, M2, null, resourceProvider);
                f11.addView(linearLayout, c8.ja.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z12 = z16;
                } else {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232024);
                    org.telegram.ui.ActionBar.q6.s(imageView2, i13, resourceProvider, mode);
                    f12.addView(imageView2, c8.ja.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f12.addView(linearLayout2, c8.ja.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b12 = c8.sa.b(context, 16.0f, i13, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, c8.ja.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = c8.sa.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z12 = z16;
                    linearLayout2.addView(b13, c8.ja.r(-1, -2, 55));
                    linearLayout.addView(f12, c8.ja.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r82 = 0;
                    z13 = false;
                } else {
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232030);
                    org.telegram.ui.ActionBar.q6.s(imageView3, i13, resourceProvider, mode);
                    f13.addView(imageView3, c8.ja.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f13.addView(linearLayout3, c8.ja.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = c8.sa.b(context, 16.0f, i13, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, c8.ja.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r82 = 0;
                    z13 = false;
                    TextView b15 = c8.sa.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : org.telegram.messenger.hd.a0(null, null, 2131753133, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, c8.ja.r(-1, -2, 55));
                    linearLayout.addView(f13, c8.ja.o(-1, -2));
                }
                TextView b16 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f29241y6, z13, r82);
                b16.setText(org.telegram.messenger.hd.M0(2131753131, r82));
                f11.addView(b16, c8.ja.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int i15 = org.telegram.ui.ActionBar.j6.f28849d6;
                InsetDrawable f03 = org.telegram.ui.ActionBar.j6.f0(L3, T5.getThemedColor(i15));
                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i15);
                frameLayout4.setBackground(f03);
                org.telegram.ui.ActionBar.q6.j(frameLayout4, f03, M3, null, resourceProvider);
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, T5.getResourceProvider());
                q8Var2.f(org.telegram.messenger.hd.M0(2131753136, null), true, false);
                int themedColor = T5.getThemedColor(i15);
                int i16 = org.telegram.ui.ActionBar.j6.f28941i6;
                org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(themedColor, T5.getThemedColor(i16), 16, 16);
                org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i15);
                org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i16);
                q8Var2.setBackground(b02);
                org.telegram.ui.ActionBar.q6.j(q8Var2, b02, M4, M5, resourceProvider);
                q8Var2.setOnClickListener(new g40(q8Var2, 12));
                frameLayout4.addView(q8Var2, c8.ja.e(-1, -1, 119));
                f11.addView(frameLayout4, c8.ja.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f29241y6, false, null);
                b17.setText(org.telegram.messenger.hd.a0(null, null, 2131753135, org.telegram.messenger.q10.p(tL_urlAuthResultRequest2.bot)));
                f11.addView(b17, c8.ja.t(-1, -2, 55, 22, 6, 22, 20));
                q8Var = q8Var2;
            } else {
                q8Var = null;
            }
            LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
            final hi.d dVar2 = new hi.d(context, T5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            int i17 = org.telegram.ui.ActionBar.j6.f29070p7;
            dVar2.setColor(T5.getThemedColor(i17));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.m6 M6 = org.telegram.ui.ActionBar.q6.M(i17);
                dVar2.setBackground(background);
                str4 = null;
                org.telegram.ui.ActionBar.q6.j(dVar2, background, M6, null, resourceProvider);
            } else {
                str4 = null;
            }
            dVar2.setText(org.telegram.messenger.hd.M0(2131751604, str4));
            f14.addView(dVar2, c8.ja.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            hi.d dVar3 = new hi.d(context, T5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            dVar3.setText(org.telegram.messenger.hd.M0(2131753124, null));
            f14.addView(dVar3, c8.ja.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f11.addView(f14, c8.ja.t(-1, -2, 7, 12, 12, 12, 8));
            k10.f29725z0 = new ci0(dVar3);
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.u2[] u2VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            k10.w0(org.telegram.ui.ActionBar.j6.f28792a7);
            final String[] strArr = {str2};
            org.telegram.ui.Cells.q8 q8Var3 = q8Var;
            ArrayList arrayList3 = arrayList2;
            ai0 ai0Var = new ai0(iArr, dVar3, dVar2, tL_messages_requestUrlAuth, k10, z10, str, urlAuthResult2, strArr, z11, v0Var, str6, resourceProvider);
            hi.d dVar4 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && org.telegram.messenger.m10.i(i7).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i18);
                    i18++;
                    Integer num = (Integer) obj;
                    int i19 = size;
                    dVar = dVar4;
                    if (org.telegram.messenger.m10.i(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        ai0Var.a(num);
                        break;
                    }
                    dVar4 = dVar;
                    size = i19;
                    arrayList3 = arrayList;
                }
            }
            arrayList = arrayList3;
            dVar = dVar4;
            frameLayout2.setOnClickListener(new fi.d0(k10, frameLayout3, arrayList, iArr, ai0Var));
            boolean[] zArr2 = new boolean[1];
            final hi.d dVar5 = dVar;
            dVar2.setOnClickListener(new di.y9(dVar5, tL_messages_requestUrlAuth, zArr2, k10, dVar2, v0Var, i7));
            final boolean[] zArr3 = new boolean[1];
            final boolean z17 = z12;
            final bg.l0 l0Var = new bg.l0(tL_urlAuthResultRequest2, strArr, context, i7, new bi0(dVar5, dVar2, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, q8Var3, zArr3, zArr, iArr, zArr2, k10, str6, resourceProvider, z10, str, v0Var), T5, 12);
            dVar5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!hi.d.this.R && !dVar2.R) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z18 = tL_urlAuthResultRequest3.request_phone_number;
                        final bg.l0 l0Var2 = l0Var;
                        if (z18) {
                            TLRPC.User f15 = org.telegram.messenger.m10.i(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, T5.getResourceProvider());
                            String M0 = org.telegram.messenger.hd.M0(2131753120, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            if (z15 && !z17) {
                                str7 = org.telegram.messenger.q10.p(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            pf.b c10 = pf.b.c();
                            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131753117, str7, c10.b("+" + f15.phone).replaceAll(" ", " ")));
                            String M02 = org.telegram.messenger.hd.M0(2131753118, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i20) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            l0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            l0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753119, null), new org.telegram.ui.ActionBar.q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i20) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            l0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            l0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.p();
                            return;
                        }
                        l0Var2.run();
                    }
                }
            });
            k10.setOnDismissListener(new di.k6(zArr, inputtonconnectoauthsessionArr, u2VarArr, new org.telegram.ui.ActionBar.u2[1]));
            org.telegram.ui.ActionBar.u2 u2Var = f46411a;
            if (u2Var != null) {
                u2Var.dismiss();
                f46411a = null;
            }
            final org.telegram.ui.Components.d31 d31Var = new org.telegram.ui.Components.d31(tL_urlAuthResultRequest2, k10, u2VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, l0Var);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f46411a = c(context, i7, tL_urlAuthResultRequest2.match_codes, str6, new org.telegram.messenger.z10() {
                    @Override
                    public final void a(Object obj2) {
                        String str7 = (String) obj2;
                        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
                        t1Var.r(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str7;
                        tL_messages_checkUrlAuthMatchCode.match_code = str7;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(1), new di.b2(t1Var, d31Var, str6, resourceProvider, 2));
                    }
                }, false, new org.telegram.ui.Components.sp0(zArr2, v0Var, tL_messages_requestUrlAuth, i7, 11), T5.getResourceProvider());
            } else {
                d31Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.u2 c(Context context, int i7, ArrayList arrayList, String str, org.telegram.messenger.z10 z10Var, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        org.telegram.ui.Components.jc jcVar;
        int i12;
        org.telegram.ui.ActionBar.u2[] u2VarArr = new org.telegram.ui.ActionBar.u2[1];
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        f10.addView(textView, c8.ja.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f));
        f10.addView(linearLayout, c8.ja.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i7).isTestBackend()) {
            i10 = 0;
            while (i10 < 4) {
                if (org.telegram.messenger.m10.i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                    break;
                }
                i10++;
            }
        }
        i10 = i7;
        org.telegram.ui.Components.i9[] i9VarArr = new org.telegram.ui.Components.i9[arrayList.size()];
        boolean z11 = true;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            String str2 = (String) arrayList.get(i13);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(70.0f);
            int i14 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.u2 u2Var = k10;
            int i15 = i13;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.r1(0.05f, org.telegram.ui.ActionBar.j6.w0(i14, e6Var)));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.05f, i14);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.q6.j(frameLayout, L2, K, null, e6Var);
            org.telegram.messenger.f6 f11 = org.telegram.messenger.j6.f(str2);
            if (f11 == null) {
                jcVar = new org.telegram.ui.Components.jc(3, new org.telegram.ui.Components.oy0(str2, 30.0f, org.telegram.messenger.g0.o()), e6Var);
                z11 = false;
            } else {
                jcVar = f11;
            }
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9VarArr[i15] = i9Var;
            i9Var.getImageReceiver().d = i10;
            i9Var.m(null, null, null, null, jcVar, null);
            org.telegram.messenger.ns.i(i9Var);
            frameLayout.addView(i9Var, c8.ja.e(40, 40, 17));
            if (i15 == 0) {
                i12 = 0;
            } else {
                i12 = 24;
            }
            linearLayout.addView(frameLayout, c8.ja.t(70, 70, 16, i12, 0, 0, 0));
            c8.na.a(frameLayout);
            frameLayout.setOnClickListener(new y(u2VarArr, z10Var, str2));
            i13 = i15 + 1;
            k10 = u2Var;
        }
        org.telegram.ui.ActionBar.u2 u2Var2 = k10;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        org.telegram.messenger.si.b0(i10).l0(tL_inputStickerSetShortName, null, false, false, new org.telegram.ui.Components.gh(22, arrayList, i9VarArr));
        if (z11) {
            i11 = 2131753115;
        } else {
            i11 = 2131753116;
        }
        textView.setText(org.telegram.messenger.hd.M0(i11, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        textView2.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131753123, str), org.telegram.ui.ActionBar.j6.Fi, null, null, false));
        f10.addView(textView2, c8.ja.t(-1, -2, 1, 0, 23, 0, 11));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        if (z10) {
            g10.e();
            g10.setText(org.telegram.messenger.hd.M0(2131752589, null));
        } else {
            int i16 = org.telegram.ui.ActionBar.j6.f29070p7;
            g10.setColor(org.telegram.ui.ActionBar.j6.w0(i16, e6Var));
            if (g10.getBackground() != null) {
                Drawable background = g10.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
                g10.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(g10, background, M, null, e6Var);
            }
            g10.setText(org.telegram.messenger.hd.M0(2131751604, null));
        }
        f10.addView(g10, c8.ja.t(-1, 48, 7, 12, 12, 12, 12));
        g10.setOnClickListener(new y(g10, u2VarArr, runnable, 13));
        u2Var2.show();
        u2VarArr[0] = u2Var2;
        return u2Var2;
    }
}
