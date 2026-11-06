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
public abstract class bi0 {
    public static org.telegram.ui.ActionBar.v2 f44355a;

    public static org.telegram.ui.Components.hc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        HashSet hashSet = hi.a3.f14507a1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            hi.a3 a3Var = null;
            while (it.hasNext()) {
                hi.a3 a3Var2 = (hi.a3) it.next();
                if (a3Var2.Z0) {
                    a3Var = a3Var2;
                }
            }
            if (a3Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context2 = T.getParentActivity();
                } else {
                    context2 = LaunchActivity.G1;
                    if (context2 == null) {
                        context2 = org.telegram.messenger.t0.f25563b;
                    }
                }
                return new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(context2), null);
            }
        }
        HashSet hashSet2 = g4.f45799c1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            g4 g4Var = null;
            while (it2.hasNext()) {
                g4 g4Var2 = (g4) it2.next();
                if (g4Var2.V) {
                    g4Var = g4Var2;
                }
            }
            if (g4Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context = T.getParentActivity();
                } else {
                    context = LaunchActivity.G1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25563b;
                    }
                }
                return new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(context), null);
            }
        }
        if (T != null && T.getLastSheet() != null && T.getLastSheet().k() != null) {
            return T.getLastSheet().k();
        }
        return org.telegram.ui.Components.hc.a0(T);
    }

    public static void b(boolean z9, final int i7, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z10, org.telegram.ui.web.x0 x0Var) {
        final Context context;
        org.telegram.ui.ActionBar.f6 f6Var;
        String str3;
        boolean z11;
        ?? r82;
        boolean z12;
        org.telegram.ui.Cells.r8 r8Var;
        String str4;
        ArrayList arrayList;
        fi.d dVar;
        org.telegram.ui.ActionBar.f2 T;
        String str5;
        org.telegram.ui.ActionBar.f2 T2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (x0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(x0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (x0Var != null) {
                        x0Var.y("oauth_result_confirmed", org.telegram.ui.web.x0.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                    if (T3 == null) {
                        return;
                    }
                    vf.c.v(T3.getContext(), tL_urlAuthResultAccepted.url, true);
                    return;
                }
                boolean z13 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z13) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : org.telegram.messenger.hd.M0(2131743826, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623989, org.telegram.messenger.hd.M0(2131753126, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.uj, false), org.telegram.messenger.hd.a0(null, null, z13 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z10 ? 2131753125 : 2131753127, str5))).j();
                }
                if (x0Var != null) {
                    x0Var.y("oauth_result_confirmed", org.telegram.ui.web.x0.A(null, "result_url"));
                } else if (z9 && (T2 = LaunchActivity.T()) != null && (context2 = T2.getContext()) != null) {
                    org.telegram.messenger.g0.i3(new bu(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (x0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 == null) {
                    return;
                }
                org.telegram.ui.Components.v4.n0(T4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (T = LaunchActivity.T()) != null) {
                org.telegram.ui.Components.v4.n0(T, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.f2 T5 = LaunchActivity.T();
            if (T5 == null || (context = T5.getContext()) == null) {
                return;
            }
            final org.telegram.ui.ActionBar.f6 resourceProvider = T5.getResourceProvider();
            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, T5.getResourceProvider(), false);
            FrameLayout frameLayout = new FrameLayout(context);
            l10.N = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i7).isTestBackend();
            arrayList2.clear();
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.p10.i(i10).p() && ConnectionsManager.getInstance(i10).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i10));
                }
            }
            Collections.sort(arrayList2, new oe(28));
            final boolean z14 = tL_messages_requestUrlAuth.peer != null;
            boolean z15 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(14.0f);
            int i11 = org.telegram.ui.ActionBar.k6.f27940i5;
            Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, T5.getThemedColor(i11));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, resourceProvider);
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            l9Var.getImageReceiver().A0 = true;
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            final int[] iArr = {i7};
            TLRPC.User f10 = org.telegram.messenger.p10.i(iArr[0]).f();
            w8Var.r(f10);
            l9Var.e(f10, w8Var);
            frameLayout3.addView(l9Var, c8.ha.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.k6.f28107r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, c8.ha.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, c8.ha.e(52, 28, 17));
            ArrayList arrayList3 = arrayList2;
            frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            frameLayout.addView(frameLayout2, c8.ha.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            c8.ka.a(frameLayout2);
            if (arrayList3.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
            frameLayout.addView(f11, c8.ha.e(-1, -1, 119));
            org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var2.r(tL_urlAuthResultRequest2.bot);
            l9Var2.e(tL_urlAuthResultRequest2.bot, w8Var2);
            f11.addView(l9Var2, c8.ha.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    f6Var = null;
                    str3 = org.telegram.messenger.hd.M0(2131743826, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    f6Var = null;
                }
            } else {
                f6Var = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str6 = str3;
            int i13 = org.telegram.ui.ActionBar.k6.f27957j5;
            TextView b10 = c8.qa.b(context, 20.0f, i13, true, f6Var);
            b10.setGravity(17);
            b10.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131753113, str6), org.telegram.ui.ActionBar.k6.Ci, T5.getResourceProvider(), null, false));
            f11.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = c8.qa.b(context, 14.0f, i13, false, null);
            b11.setGravity(17);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(z15 ? 2131753134 : z14 ? 2131753132 : 2131753114, null)));
            f11.addView(b11, c8.ha.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z11 = z15;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.k6.f27849d6;
                Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L2, T5.getThemedColor(i14));
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                linearLayout.setBackground(f02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, f02, N2, null, resourceProvider);
                f11.addView(linearLayout, c8.ha.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z11 = z15;
                } else {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232024);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i13, resourceProvider, mode);
                    f12.addView(imageView2, c8.ha.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f12.addView(linearLayout2, c8.ha.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b12 = c8.qa.b(context, 16.0f, i13, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, c8.ha.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = c8.qa.b(context, 13.0f, org.telegram.ui.ActionBar.k6.f28241y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z11 = z15;
                    linearLayout2.addView(b13, c8.ha.r(-1, -2, 55));
                    linearLayout.addView(f12, c8.ha.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r82 = 0;
                    z12 = false;
                } else {
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232030);
                    org.telegram.ui.ActionBar.r6.t(imageView3, i13, resourceProvider, mode);
                    f13.addView(imageView3, c8.ha.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f13.addView(linearLayout3, c8.ha.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = c8.qa.b(context, 16.0f, i13, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, c8.ha.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r82 = 0;
                    z12 = false;
                    TextView b15 = c8.qa.b(context, 13.0f, org.telegram.ui.ActionBar.k6.f28241y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : org.telegram.messenger.hd.a0(null, null, 2131753133, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, c8.ha.r(-1, -2, 55));
                    linearLayout.addView(f13, c8.ha.o(-1, -2));
                }
                TextView b16 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28241y6, z12, r82);
                b16.setText(org.telegram.messenger.hd.M0(2131753131, r82));
                f11.addView(b16, c8.ha.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int i15 = org.telegram.ui.ActionBar.k6.f27849d6;
                InsetDrawable f03 = org.telegram.ui.ActionBar.k6.f0(L3, T5.getThemedColor(i15));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
                frameLayout4.setBackground(f03);
                org.telegram.ui.ActionBar.r6.k(frameLayout4, f03, N3, null, resourceProvider);
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context, T5.getResourceProvider());
                r8Var2.f(org.telegram.messenger.hd.M0(2131753136, null), true, false);
                int themedColor = T5.getThemedColor(i15);
                int i16 = org.telegram.ui.ActionBar.k6.f27941i6;
                org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, T5.getThemedColor(i16), 16, 16);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
                r8Var2.setBackground(b02);
                org.telegram.ui.ActionBar.r6.k(r8Var2, b02, N4, N5, resourceProvider);
                r8Var2.setOnClickListener(new g40(r8Var2, 12));
                frameLayout4.addView(r8Var2, c8.ha.e(-1, -1, 119));
                f11.addView(frameLayout4, c8.ha.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28241y6, false, null);
                b17.setText(org.telegram.messenger.hd.a0(null, null, 2131753135, org.telegram.messenger.t10.p(tL_urlAuthResultRequest2.bot)));
                f11.addView(b17, c8.ha.t(-1, -2, 55, 22, 6, 22, 20));
                r8Var = r8Var2;
            } else {
                r8Var = null;
            }
            LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
            final fi.d dVar2 = new fi.d(context, T5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            int i17 = org.telegram.ui.ActionBar.k6.f28070p7;
            dVar2.setColor(T5.getThemedColor(i17));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i17);
                dVar2.setBackground(background);
                str4 = null;
                org.telegram.ui.ActionBar.r6.k(dVar2, background, N6, null, resourceProvider);
            } else {
                str4 = null;
            }
            dVar2.setText(org.telegram.messenger.hd.M0(2131751605, str4));
            f14.addView(dVar2, c8.ha.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            fi.d dVar3 = new fi.d(context, T5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            dVar3.setText(org.telegram.messenger.hd.M0(2131753124, null));
            f14.addView(dVar3, c8.ha.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f11.addView(f14, c8.ha.t(-1, -2, 7, 12, 12, 12, 8));
            l10.f28654y0 = new ai0(dVar3);
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.v2[] v2VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            l10.w0(org.telegram.ui.ActionBar.k6.f27793a7);
            final String[] strArr = {str2};
            org.telegram.ui.Cells.r8 r8Var3 = r8Var;
            yh0 yh0Var = new yh0(iArr, dVar3, dVar2, tL_messages_requestUrlAuth, l10, z9, str, urlAuthResult2, strArr, z10, x0Var, str6, resourceProvider);
            fi.d dVar4 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && org.telegram.messenger.p10.i(i7).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i18);
                    i18++;
                    Integer num = (Integer) obj;
                    int i19 = size;
                    dVar = dVar4;
                    if (org.telegram.messenger.p10.i(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        yh0Var.a(num);
                        break;
                    }
                    dVar4 = dVar;
                    size = i19;
                    arrayList3 = arrayList;
                }
            }
            arrayList = arrayList3;
            dVar = dVar4;
            frameLayout2.setOnClickListener(new di.d0(l10, frameLayout3, arrayList, iArr, yh0Var));
            boolean[] zArr2 = new boolean[1];
            final fi.d dVar5 = dVar;
            dVar2.setOnClickListener(new bi.lb(dVar5, tL_messages_requestUrlAuth, zArr2, l10, dVar2, x0Var, i7));
            final boolean[] zArr3 = new boolean[1];
            final boolean z16 = z11;
            final bg.l0 l0Var = new bg.l0(tL_urlAuthResultRequest2, strArr, context, i7, new zh0(dVar5, dVar2, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, r8Var3, zArr3, zArr, iArr, zArr2, l10, str6, resourceProvider, z9, str, x0Var), T5, 11);
            dVar5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!fi.d.this.Q && !dVar2.Q) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z17 = tL_urlAuthResultRequest3.request_phone_number;
                        final bg.l0 l0Var2 = l0Var;
                        if (z17) {
                            TLRPC.User f15 = org.telegram.messenger.p10.i(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, T5.getResourceProvider());
                            String M0 = org.telegram.messenger.hd.M0(2131753120, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                            u1Var.R = M0;
                            if (z14 && !z16) {
                                str7 = org.telegram.messenger.t10.p(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            pf.b c10 = pf.b.c();
                            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131753117, str7, c10.b("+" + f15.phone).replaceAll(" ", " ")));
                            String M02 = org.telegram.messenger.hd.M0(2131753118, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.r1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i20) {
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
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753119, null), new org.telegram.ui.ActionBar.r1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i20) {
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
            l10.setOnDismissListener(new bi.s7(zArr, inputtonconnectoauthsessionArr, v2VarArr, new org.telegram.ui.ActionBar.v2[1]));
            org.telegram.ui.ActionBar.v2 v2Var = f44355a;
            if (v2Var != null) {
                v2Var.dismiss();
                f44355a = null;
            }
            final org.telegram.ui.Components.y21 y21Var = new org.telegram.ui.Components.y21(tL_urlAuthResultRequest2, l10, v2VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, l0Var);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f44355a = c(context, i7, tL_urlAuthResultRequest2.match_codes, str6, new org.telegram.messenger.c20() {
                    @Override
                    public final void a(Object obj2) {
                        String str7 = (String) obj2;
                        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
                        u1Var.r(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str7;
                        tL_messages_checkUrlAuthMatchCode.match_code = str7;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new d3.b(1), new bi.q2(u1Var, y21Var, str6, resourceProvider, 2));
                    }
                }, false, new org.telegram.ui.Components.pp0(zArr2, x0Var, tL_messages_requestUrlAuth, i7, 11), T5.getResourceProvider());
            } else {
                y21Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.v2 c(Context context, int i7, ArrayList arrayList, String str, org.telegram.messenger.c20 c20Var, boolean z9, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        org.telegram.ui.Components.oc ocVar;
        int i12;
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        f10.addView(textView, c8.ha.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f));
        f10.addView(linearLayout, c8.ha.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i7).isTestBackend()) {
            i10 = 0;
            while (i10 < 4) {
                if (org.telegram.messenger.p10.i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                    break;
                }
                i10++;
            }
        }
        i10 = i7;
        org.telegram.ui.Components.l9[] l9VarArr = new org.telegram.ui.Components.l9[arrayList.size()];
        boolean z10 = true;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            String str2 = (String) arrayList.get(i13);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(70.0f);
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.v2 v2Var = l10;
            int i15 = i13;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.r1(0.05f, org.telegram.ui.ActionBar.k6.w0(i14, f6Var)));
            org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.05f, i14);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(frameLayout, L2, L3, null, f6Var);
            org.telegram.messenger.e6 f11 = org.telegram.messenger.i6.f(str2);
            if (f11 == null) {
                ocVar = new org.telegram.ui.Components.oc(3, new org.telegram.ui.Components.my0(str2, 30.0f, org.telegram.messenger.g0.o()), f6Var);
                z10 = false;
            } else {
                ocVar = f11;
            }
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9VarArr[i15] = l9Var;
            l9Var.getImageReceiver().d = i10;
            l9Var.m(null, null, null, null, ocVar, null);
            org.telegram.messenger.qs.i(l9Var);
            frameLayout.addView(l9Var, c8.ha.e(40, 40, 17));
            if (i15 == 0) {
                i12 = 0;
            } else {
                i12 = 24;
            }
            linearLayout.addView(frameLayout, c8.ha.t(70, 70, 16, i12, 0, 0, 0));
            c8.ka.a(frameLayout);
            frameLayout.setOnClickListener(new z(v2VarArr, c20Var, str2));
            i13 = i15 + 1;
            l10 = v2Var;
        }
        org.telegram.ui.ActionBar.v2 v2Var2 = l10;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        org.telegram.messenger.ui.b0(i10).l0(tL_inputStickerSetShortName, null, false, false, new org.telegram.ui.Components.ex(arrayList, l9VarArr));
        if (z10) {
            i11 = 2131753115;
        } else {
            i11 = 2131753116;
        }
        textView.setText(org.telegram.messenger.hd.M0(i11, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28241y6, f6Var);
        textView2.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, 2131753123, str), org.telegram.ui.ActionBar.k6.Ci, null, null, false));
        f10.addView(textView2, c8.ha.t(-1, -2, 1, 0, 23, 0, 11));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        if (z9) {
            h.e();
            h.setText(org.telegram.messenger.hd.M0(2131752589, null));
        } else {
            int i16 = org.telegram.ui.ActionBar.k6.f28070p7;
            h.setColor(org.telegram.ui.ActionBar.k6.w0(i16, f6Var));
            if (h.getBackground() != null) {
                Drawable background = h.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                h.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(h, background, N, null, f6Var);
            }
            h.setText(org.telegram.messenger.hd.M0(2131751605, null));
        }
        f10.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 12));
        h.setOnClickListener(new z(h, v2VarArr, runnable, 13));
        v2Var2.show();
        v2VarArr[0] = v2Var2;
        return v2Var2;
    }
}
