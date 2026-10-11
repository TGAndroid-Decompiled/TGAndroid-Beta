package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class ll0 {
    public static org.telegram.ui.ActionBar.e3 f39697a;

    public static org.telegram.ui.Components.ad a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        HashSet hashSet = ei.k3.W0;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            ei.k3 k3Var = null;
            while (it.hasNext()) {
                ei.k3 k3Var2 = (ei.k3) it.next();
                if (k3Var2.V0) {
                    k3Var = k3Var2;
                }
            }
            if (k3Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context2 = U.getParentActivity();
                } else {
                    context2 = LaunchActivity.G1;
                    if (context2 == null) {
                        context2 = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(context2), null);
            }
        }
        HashSet hashSet2 = h4.f38241b1;
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
                if (U != null && U.getParentActivity() != null) {
                    context = U.getParentActivity();
                } else {
                    context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(context), null);
            }
        }
        if (U != null && U.getLastSheet() != null && U.getLastSheet().getBulletinFactory() != null) {
            return U.getLastSheet().getBulletinFactory();
        }
        return org.telegram.ui.Components.ad.a0(U);
    }

    public static void b(boolean z10, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.b1 b1Var) {
        final Context context;
        String str3;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        ArrayList arrayList;
        FrameLayout frameLayout;
        boolean z12;
        org.telegram.ui.Cells.w8 w8Var;
        ci.d dVar;
        ci.d dVar2;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.m2 U;
        String str4;
        org.telegram.ui.ActionBar.m2 U2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (b1Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(b1Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (b1Var != null) {
                        b1Var.y("oauth_result_confirmed", org.telegram.ui.web.b1.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                    if (U3 == null) {
                        return;
                    }
                    of.f.u(U3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z13 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z13) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str4 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
                    } else {
                        str4 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4)) {
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z13 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, str4), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Gi, false)), R.raw.contact_check).j();
                }
                if (b1Var != null) {
                    b1Var.y("oauth_result_confirmed", org.telegram.ui.web.b1.A(null, "result_url"));
                } else if (z10 && (U2 = LaunchActivity.U()) != null && (context2 = U2.getContext()) != null) {
                    AndroidUtilities.runOnUIThread(new mv(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (b1Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                if (U4 == null) {
                    return;
                }
                org.telegram.ui.Components.g5.p0(U4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.g5.p0(U, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.m2 U5 = LaunchActivity.U();
            if (U5 == null || (context = U5.getContext()) == null) {
                return;
            }
            org.telegram.ui.ActionBar.d6 resourceProvider = U5.getResourceProvider();
            org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.ai.i(1, context, U5.getResourceProvider(), false);
            FrameLayout frameLayout2 = new FrameLayout(context);
            i12.customView = frameLayout2;
            ArrayList arrayList3 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
            arrayList3.clear();
            for (int i13 = 0; i13 < 4; i13++) {
                if (UserConfig.getInstance(i13).isClientActivated() && ConnectionsManager.getInstance(i13).isTestBackend() == isTestBackend) {
                    arrayList3.add(Integer.valueOf(i13));
                }
            }
            Collections.sort(arrayList3, new ff(24));
            final boolean z14 = tL_messages_requestUrlAuth.peer != null;
            final boolean z15 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout3 = new FrameLayout(context);
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(14.0f), U5.getThemedColor(org.telegram.ui.ActionBar.h6.f20876i5)));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
            final int[] iArr = {i10};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            j9Var.r(currentUser);
            y9Var.e(currentUser, j9Var);
            frameLayout4.addView(y9Var, w7.x5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = U5.getThemedColor(org.telegram.ui.ActionBar.h6.f21044r5);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout4.addView(imageView, w7.x5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
            frameLayout3.addView(frameLayout4, w7.x5.e(52, 28, 17));
            frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout2.addView(frameLayout3, w7.x5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.z5.a(frameLayout3);
            if (arrayList3.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout3.setVisibility(8);
            }
            LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
            frameLayout2.addView(e7, w7.x5.e(-1, -1, 119));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            y9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
            j9Var2.r(tL_urlAuthResultRequest2.bot);
            y9Var2.e(tL_urlAuthResultRequest2.bot, j9Var2);
            e7.addView(y9Var2, w7.x5.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                str3 = !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
            } else {
                str3 = tL_urlAuthResultRequest2.domain;
            }
            int i14 = org.telegram.ui.ActionBar.h6.f20894j5;
            TextView b10 = w7.b6.b(context, 20.0f, i14, true, null);
            b10.setGravity(17);
            final String str5 = str3;
            b10.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, str5), U5.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
            e7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = w7.b6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            if (z15) {
                i11 = R.string.BotAuthAppSubtitle;
            } else {
                i11 = z14 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle;
            }
            org.telegram.messenger.q.n(i11, b11);
            e7.addView(b11, w7.x5.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                d6Var = resourceProvider;
                arrayList = arrayList3;
                frameLayout = frameLayout4;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(16.0f), U5.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6)));
                e7.addView(linearLayout, w7.x5.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    d6Var = resourceProvider;
                    arrayList = arrayList3;
                    frameLayout = frameLayout4;
                } else {
                    LinearLayout e10 = org.telegram.messenger.ai.e(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    d6Var = resourceProvider;
                    imageView2.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i14), mode));
                    e10.addView(imageView2, w7.x5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    e10.addView(linearLayout2, w7.x5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    arrayList = arrayList3;
                    TextView b12 = w7.b6.b(context, 16.0f, i14, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, w7.x5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = w7.b6.b(context, 13.0f, org.telegram.ui.ActionBar.h6.f21171y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    frameLayout = frameLayout4;
                    linearLayout2.addView(b13, w7.x5.q(-1, -2, 55));
                    linearLayout.addView(e10, w7.x5.n(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z12 = false;
                } else {
                    LinearLayout e11 = org.telegram.messenger.ai.e(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i14), mode));
                    e11.addView(imageView3, w7.x5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    e11.addView(linearLayout3, w7.x5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = w7.b6.b(context, 16.0f, i14, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, w7.x5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z12 = false;
                    TextView b15 = w7.b6.b(context, 13.0f, org.telegram.ui.ActionBar.h6.f21171y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, w7.x5.q(-1, -2, 55));
                    linearLayout.addView(e11, w7.x5.n(-1, -2));
                }
                TextView b16 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.f21171y6, z12, null);
                b16.setText(LocaleController.getString(R.string.BotAuthInfo));
                e7.addView(b16, w7.x5.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout5 = new FrameLayout(context);
                int dp = AndroidUtilities.dp(16.0f);
                int i15 = org.telegram.ui.ActionBar.h6.f20786d6;
                frameLayout5.setBackground(org.telegram.ui.ActionBar.h6.e0(dp, U5.getThemedColor(i15)));
                w8Var = new org.telegram.ui.Cells.w8(context, U5.getResourceProvider());
                w8Var.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                w8Var.setBackground(org.telegram.ui.ActionBar.h6.a0(U5.getThemedColor(i15), U5.getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6), 16, 16));
                w8Var.setOnClickListener(new m60(w8Var, 10));
                frameLayout5.addView(w8Var, w7.x5.e(-1, -1, 119));
                e7.addView(frameLayout5, w7.x5.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.f21171y6, false, null);
                b17.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                e7.addView(b17, w7.x5.t(-1, -2, 55, 22, 6, 22, 20));
            } else {
                w8Var = null;
            }
            LinearLayout e12 = org.telegram.messenger.ai.e(context, 0);
            ci.d dVar3 = new ci.d(context, U5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            dVar3.setColor(U5.getThemedColor(org.telegram.ui.ActionBar.h6.f21007p7));
            dVar3.setText(LocaleController.getString(R.string.Decline));
            e12.addView(dVar3, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            ci.d dVar4 = new ci.d(context, U5.getResourceProvider(), true);
            dVar4.setRoundRadius(24);
            dVar4.setText(LocaleController.getString(R.string.BotAuthLogin));
            e12.addView(dVar4, w7.x5.p(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            e7.addView(e12, w7.x5.t(-1, -2, 7, 12, 12, 12, 8));
            i12.setDelegate(new jl0(dVar4));
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.e3[] e3VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            i12.setBackgroundColor(U5.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7));
            final String[] strArr = {str2};
            org.telegram.ui.Cells.w8 w8Var2 = w8Var;
            final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
            hl0 hl0Var = new hl0(iArr, dVar4, dVar3, tL_messages_requestUrlAuth, i12, z10, str, urlAuthResult2, strArr, z11, b1Var, str5, d6Var2);
            ci.d dVar5 = dVar4;
            ci.d dVar6 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i10).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    arrayList2 = arrayList;
                    Object obj = arrayList2.get(i16);
                    i16++;
                    Integer num = (Integer) obj;
                    dVar = dVar5;
                    dVar2 = dVar6;
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        hl0Var.run(num);
                        break;
                    }
                    dVar6 = dVar2;
                    dVar5 = dVar;
                    arrayList = arrayList2;
                }
            }
            dVar = dVar5;
            dVar2 = dVar6;
            arrayList2 = arrayList;
            frameLayout3.setOnClickListener(new ai.s0(i12, frameLayout, arrayList2, iArr, hl0Var));
            boolean[] zArr2 = new boolean[1];
            final ci.d dVar7 = dVar;
            final ci.d dVar8 = dVar2;
            dVar8.setOnClickListener(new cu(dVar7, tL_messages_requestUrlAuth, zArr2, i12, dVar8, b1Var, i10));
            final boolean[] zArr3 = new boolean[1];
            final ai.db dbVar = new ai.db(tL_urlAuthResultRequest2, strArr, context, i10, new il0(dVar7, dVar8, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, w8Var2, zArr3, zArr, iArr, zArr2, i12, str5, d6Var2, z10, str, b1Var), U5, 10);
            dVar7.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str6;
                    if (!ci.d.this.N && !dVar8.N) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z16 = tL_urlAuthResultRequest3.request_phone_number;
                        final ai.db dbVar2 = dbVar;
                        if (z16) {
                            TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, U5.getResourceProvider());
                            String string = LocaleController.getString(R.string.BotAuthPhoneNumber);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                            a2Var.R = string;
                            int i17 = R.string.BotAuthPhoneNumberText;
                            if (z14 && !z15) {
                                str6 = UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                            } else {
                                str6 = str5;
                            }
                            hf.b c10 = hf.b.c();
                            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i17, str6, c10.b("+" + currentUser2.phone).replaceAll(" ", " ")));
                            String string2 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(string2, new org.telegram.ui.ActionBar.z1() {
                                @Override
                                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i18) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            dbVar2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            dbVar2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.z1() {
                                @Override
                                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i18) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            dbVar2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            dbVar2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        dbVar2.run();
                    }
                }
            });
            i12.setOnDismissListener(new bl0(zArr, inputtonconnectoauthsessionArr, e3VarArr, new org.telegram.ui.ActionBar.e3[1]));
            org.telegram.ui.ActionBar.e3 e3Var = f39697a;
            if (e3Var != null) {
                e3Var.dismiss();
                f39697a = null;
            }
            final org.telegram.ui.Components.s51 s51Var = new org.telegram.ui.Components.s51(tL_urlAuthResultRequest2, i12, e3VarArr, context, iArr, d6Var2, zArr, inputtonconnectoauthsessionArr, dbVar);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f39697a = c(context, i10, tL_urlAuthResultRequest2.match_codes, str5, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str6 = (String) obj2;
                        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
                        a2Var.q(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str6;
                        tL_messages_checkUrlAuthMatchCode.match_code = str6;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new Object(), new dl0(a2Var, s51Var, str5, d6Var2, 0));
                    }
                }, false, new org.telegram.ui.Components.s21(zArr2, b1Var, tL_messages_requestUrlAuth, i10, 7), U5.getResourceProvider());
            } else {
                s51Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.e3 c(Context context, int i10, ArrayList arrayList, String str, Utilities.Callback callback, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        int i12;
        kl0 kl0Var;
        int i13;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        org.telegram.ui.ActionBar.e3 i14 = org.telegram.messenger.ai.i(1, context, null, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i14.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i11 = 0;
            while (i11 < 4) {
                if (UserConfig.getInstance(i11).isClientActivated() && !ConnectionsManager.getInstance(i11).isTestBackend()) {
                    break;
                }
                i11++;
            }
        }
        i11 = i10;
        org.telegram.ui.Components.y9[] y9VarArr = new org.telegram.ui.Components.y9[arrayList.size()];
        boolean z11 = true;
        int i15 = 0;
        while (i15 < arrayList.size()) {
            String str2 = (String) arrayList.get(i15);
            FrameLayout frameLayout = new FrameLayout(context);
            org.telegram.ui.ActionBar.e3 e3Var = i14;
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(70.0f), org.telegram.ui.ActionBar.h6.m1(0.05f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                kl0Var = new kl0(new org.telegram.ui.Components.n11(str2, 30.0f, AndroidUtilities.bold()), d6Var);
                z11 = false;
            } else {
                kl0Var = emojiBigDrawable;
            }
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9VarArr[i15] = y9Var;
            y9Var.getImageReceiver().setCurrentAccount(i11);
            y9Var.l(null, null, null, null, kl0Var, null);
            NotificationCenter.listenEmojiLoading(y9Var);
            frameLayout.addView(y9Var, w7.x5.e(40, 40, 17));
            if (i15 == 0) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            linearLayout2.addView(frameLayout, w7.x5.t(70, 70, 16, i13, 0, 0, 0));
            w7.z5.a(frameLayout);
            frameLayout.setOnClickListener(new z(e3VarArr, callback, str2));
            i15++;
            i14 = e3Var;
        }
        org.telegram.ui.ActionBar.e3 e3Var2 = i14;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, null, false, new et(9, arrayList, y9VarArr));
        if (z11) {
            i12 = R.string.BotAuthSelectEmoji;
        } else {
            i12 = R.string.BotAuthSelectCode;
        }
        textView.setText(LocaleController.getString(i12));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21171y6, d6Var));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false)));
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 0, 23, 0, 11));
        ci.d f7 = org.telegram.messenger.ai.f(24, context, d6Var, true);
        if (z10) {
            f7.d();
            f7.setText(LocaleController.getString(R.string.Cancel));
        } else {
            f7.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007p7, d6Var));
            f7.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(f7, w7.x5.t(-1, 48, 7, 12, 12, 12, 12));
        f7.setOnClickListener(new z(f7, e3VarArr, runnable, 13));
        e3Var2.show();
        e3VarArr[0] = e3Var2;
        return e3Var2;
    }
}
