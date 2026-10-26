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
public abstract class dl0 {
    public static org.telegram.ui.ActionBar.k3 f38906a;

    public static org.telegram.ui.Components.wc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        HashSet hashSet = hi.m3.f13098a1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            hi.m3 m3Var = null;
            while (it.hasNext()) {
                hi.m3 m3Var2 = (hi.m3) it.next();
                if (m3Var2.Z0) {
                    m3Var = m3Var2;
                }
            }
            if (m3Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context2 = U.getParentActivity();
                } else {
                    context2 = LaunchActivity.I1;
                    if (context2 == null) {
                        context2 = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(context2), null);
            }
        }
        HashSet hashSet2 = j4.f40405c1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            j4 j4Var = null;
            while (it2.hasNext()) {
                j4 j4Var2 = (j4) it2.next();
                if (j4Var2.V) {
                    j4Var = j4Var2;
                }
            }
            if (j4Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context = U.getParentActivity();
                } else {
                    context = LaunchActivity.I1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(context), null);
            }
        }
        if (U != null && U.getLastSheet() != null && U.getLastSheet().getBulletinFactory() != null) {
            return U.getLastSheet().getBulletinFactory();
        }
        return org.telegram.ui.Components.wc.b0(U);
    }

    public static void b(boolean z10, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.a1 a1Var) {
        final Context context;
        String str3;
        int i11;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        boolean z12;
        org.telegram.ui.Cells.a9 a9Var;
        fi.d dVar;
        fi.d dVar2;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.r2 U;
        String str4;
        org.telegram.ui.ActionBar.r2 U2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (a1Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(a1Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (a1Var != null) {
                        a1Var.y("oauth_result_confirmed", org.telegram.ui.web.a1.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                    if (U3 == null) {
                        return;
                    }
                    qf.d.t(U3.getContext(), tL_urlAuthResultAccepted.url);
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
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z13 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, str4), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Gi, false)), R.raw.contact_check).j();
                }
                if (a1Var != null) {
                    a1Var.y("oauth_result_confirmed", org.telegram.ui.web.a1.A(null, "result_url"));
                } else if (z10 && (U2 = LaunchActivity.U()) != null && (context2 = U2.getContext()) != null) {
                    AndroidUtilities.runOnUIThread(new av(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (a1Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 == null) {
                    return;
                }
                org.telegram.ui.Components.g5.p0(U4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.g5.p0(U, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.r2 U5 = LaunchActivity.U();
            if (U5 == null || (context = U5.getContext()) == null) {
                return;
            }
            final org.telegram.ui.ActionBar.u6 resourceProvider = U5.getResourceProvider();
            org.telegram.ui.ActionBar.k3 i12 = org.telegram.messenger.vh.i(1, context, U5.getResourceProvider(), false);
            FrameLayout frameLayout3 = new FrameLayout(context);
            i12.customView = frameLayout3;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
            arrayList2.clear();
            for (int i13 = 0; i13 < 4; i13++) {
                if (UserConfig.getInstance(i13).isClientActivated() && ConnectionsManager.getInstance(i13).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i13));
                }
            }
            Collections.sort(arrayList2, new bv(5));
            final boolean z14 = tL_messages_requestUrlAuth.peer != null;
            final boolean z15 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(14.0f);
            int i14 = org.telegram.ui.ActionBar.y6.f23447i5;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, U5.getThemedColor(i14));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
            frameLayout5.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(frameLayout5, c02, N, null, resourceProvider);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            final int[] iArr = {i10};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            j9Var.r(currentUser);
            y9Var.f(currentUser, j9Var);
            frameLayout5.addView(y9Var, org.telegram.ui.Components.gb1.i(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i15 = org.telegram.ui.ActionBar.y6.f23614r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.f7.t(imageView, i15, resourceProvider, mode);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout5.addView(imageView, org.telegram.ui.Components.gb1.h(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout4.addView(frameLayout5, org.telegram.ui.Components.gb1.i(52, 28, 17));
            frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout3.addView(frameLayout4, org.telegram.ui.Components.gb1.t(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            org.telegram.ui.Components.gb1.b(frameLayout4);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout4.setVisibility(8);
            }
            LinearLayout d = org.telegram.messenger.vh.d(context, 1);
            frameLayout3.addView(d, org.telegram.ui.Components.gb1.i(-1, -1, 119));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            y9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var2.r(tL_urlAuthResultRequest2.bot);
            y9Var2.f(tL_urlAuthResultRequest2.bot, j9Var2);
            d.addView(y9Var2, org.telegram.ui.Components.gb1.x(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                str3 = !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
            } else {
                str3 = tL_urlAuthResultRequest2.domain;
            }
            int i16 = org.telegram.ui.ActionBar.y6.f23464j5;
            TextView L = org.telegram.ui.Components.gb1.L(context, 20.0f, i16, true, null);
            L.setGravity(17);
            final String str5 = str3;
            L.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.BotAuthTitle, str5), org.telegram.ui.ActionBar.y6.Oh, U5.getResourceProvider(), null));
            d.addView(L, org.telegram.ui.Components.gb1.v(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView L2 = org.telegram.ui.Components.gb1.L(context, 14.0f, i16, false, null);
            L2.setGravity(17);
            if (z15) {
                i11 = R.string.BotAuthAppSubtitle;
            } else {
                i11 = z14 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle;
            }
            org.telegram.messenger.t.n(i11, L2);
            d.addView(L2, org.telegram.ui.Components.gb1.x(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout = frameLayout4;
                frameLayout2 = frameLayout5;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int dp2 = AndroidUtilities.dp(16.0f);
                int i17 = org.telegram.ui.ActionBar.y6.f23356d6;
                Drawable e02 = org.telegram.ui.ActionBar.y6.e0(dp2, U5.getThemedColor(i17));
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i17);
                linearLayout.setBackground(e02);
                org.telegram.ui.ActionBar.f7.k(linearLayout, e02, N2, null, resourceProvider);
                d.addView(linearLayout, org.telegram.ui.Components.gb1.x(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    frameLayout = frameLayout4;
                    frameLayout2 = frameLayout5;
                } else {
                    LinearLayout d10 = org.telegram.messenger.vh.d(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    org.telegram.ui.ActionBar.f7.t(imageView2, i16, resourceProvider, mode);
                    d10.addView(imageView2, org.telegram.ui.Components.gb1.x(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    d10.addView(linearLayout2, org.telegram.ui.Components.gb1.v(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    frameLayout = frameLayout4;
                    TextView L3 = org.telegram.ui.Components.gb1.L(context, 16.0f, i16, false, null);
                    L3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(L3, org.telegram.ui.Components.gb1.v(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView L4 = org.telegram.ui.Components.gb1.L(context, 13.0f, org.telegram.ui.ActionBar.y6.f23748y6, false, null);
                    L4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    frameLayout2 = frameLayout5;
                    linearLayout2.addView(L4, org.telegram.ui.Components.gb1.u(-1, -2, 55));
                    linearLayout.addView(d10, org.telegram.ui.Components.gb1.r(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z12 = false;
                } else {
                    LinearLayout d11 = org.telegram.messenger.vh.d(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    org.telegram.ui.ActionBar.f7.t(imageView3, i16, resourceProvider, mode);
                    d11.addView(imageView3, org.telegram.ui.Components.gb1.x(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    d11.addView(linearLayout3, org.telegram.ui.Components.gb1.v(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView L5 = org.telegram.ui.Components.gb1.L(context, 16.0f, i16, false, null);
                    L5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(L5, org.telegram.ui.Components.gb1.v(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z12 = false;
                    TextView L6 = org.telegram.ui.Components.gb1.L(context, 13.0f, org.telegram.ui.ActionBar.y6.f23748y6, false, null);
                    L6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(L6, org.telegram.ui.Components.gb1.u(-1, -2, 55));
                    linearLayout.addView(d11, org.telegram.ui.Components.gb1.r(-1, -2));
                }
                TextView L7 = org.telegram.ui.Components.gb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.f23748y6, z12, null);
                L7.setText(LocaleController.getString(R.string.BotAuthInfo));
                d.addView(L7, org.telegram.ui.Components.gb1.x(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                int dp3 = AndroidUtilities.dp(16.0f);
                int i18 = org.telegram.ui.ActionBar.y6.f23356d6;
                InsetDrawable e03 = org.telegram.ui.ActionBar.y6.e0(dp3, U5.getThemedColor(i18));
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i18);
                frameLayout6.setBackground(e03);
                org.telegram.ui.ActionBar.f7.k(frameLayout6, e03, N3, null, resourceProvider);
                org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context, U5.getResourceProvider());
                a9Var2.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                int themedColor = U5.getThemedColor(i18);
                int i19 = org.telegram.ui.ActionBar.y6.f23448i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(themedColor, U5.getThemedColor(i19), 16, 16);
                org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i18);
                org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i19);
                a9Var2.setBackground(a02);
                org.telegram.ui.ActionBar.f7.k(a9Var2, a02, N4, N5, resourceProvider);
                a9Var2.setOnClickListener(new x50(a9Var2, 13));
                frameLayout6.addView(a9Var2, org.telegram.ui.Components.gb1.i(-1, -1, 119));
                d.addView(frameLayout6, org.telegram.ui.Components.gb1.x(-1, -2, 7, 9, -3, 9, -3));
                TextView L8 = org.telegram.ui.Components.gb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.f23748y6, false, null);
                L8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                d.addView(L8, org.telegram.ui.Components.gb1.x(-1, -2, 55, 22, 6, 22, 20));
                a9Var = a9Var2;
            } else {
                a9Var = null;
            }
            LinearLayout d12 = org.telegram.messenger.vh.d(context, 0);
            fi.d dVar3 = new fi.d(context, U5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            int i20 = org.telegram.ui.ActionBar.y6.f23581p7;
            dVar3.setColor(U5.getThemedColor(i20));
            if (dVar3.getBackground() != null) {
                Drawable background = dVar3.getBackground();
                org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i20);
                dVar3.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(dVar3, background, N6, null, resourceProvider);
            }
            dVar3.setText(LocaleController.getString(R.string.Decline));
            d12.addView(dVar3, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            fi.d dVar4 = new fi.d(context, U5.getResourceProvider(), true);
            dVar4.setRoundRadius(24);
            dVar4.setText(LocaleController.getString(R.string.BotAuthLogin));
            d12.addView(dVar4, org.telegram.ui.Components.gb1.t(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            d.addView(d12, org.telegram.ui.Components.gb1.x(-1, -2, 7, 12, 12, 12, 8));
            i12.setDelegate(new bl0(dVar4));
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.k3[] k3VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            i12.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.f23299a7);
            final String[] strArr = {str2};
            org.telegram.ui.Cells.a9 a9Var3 = a9Var;
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout7 = frameLayout;
            zk0 zk0Var = new zk0(iArr, dVar4, dVar3, tL_messages_requestUrlAuth, i12, z10, str, urlAuthResult2, strArr, z11, a1Var, str5, resourceProvider);
            fi.d dVar5 = dVar4;
            fi.d dVar6 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i10).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i21 = 0;
                while (i21 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i21);
                    i21++;
                    Integer num = (Integer) obj;
                    dVar = dVar5;
                    dVar2 = dVar6;
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        zk0Var.run(num);
                        break;
                    }
                    dVar6 = dVar2;
                    dVar5 = dVar;
                    arrayList3 = arrayList;
                }
            }
            dVar = dVar5;
            dVar2 = dVar6;
            arrayList = arrayList3;
            frameLayout7.setOnClickListener(new di.e0(i12, frameLayout2, arrayList, iArr, zk0Var));
            boolean[] zArr2 = new boolean[1];
            final fi.d dVar7 = dVar;
            final fi.d dVar8 = dVar2;
            dVar8.setOnClickListener(new bi.ob(dVar7, tL_messages_requestUrlAuth, zArr2, i12, dVar8, a1Var, i10));
            final boolean[] zArr3 = new boolean[1];
            final ag.q0 q0Var = new ag.q0(tL_urlAuthResultRequest2, strArr, context, i10, new al0(dVar7, dVar8, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, a9Var3, zArr3, zArr, iArr, zArr2, i12, str5, resourceProvider, z10, str, a1Var), U5, 13);
            dVar7.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str6;
                    if (!fi.d.this.Q && !dVar8.Q) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z16 = tL_urlAuthResultRequest3.request_phone_number;
                        final ag.q0 q0Var2 = q0Var;
                        if (z16) {
                            TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, U5.getResourceProvider());
                            String string = LocaleController.getString(R.string.BotAuthPhoneNumber);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                            e2Var.R = string;
                            int i22 = R.string.BotAuthPhoneNumberText;
                            if (z14 && !z15) {
                                str6 = UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                            } else {
                                str6 = str5;
                            }
                            kf.b c10 = kf.b.c();
                            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i22, str6, c10.b("+" + currentUser2.phone).replaceAll(" ", " ")));
                            String string2 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(string2, new org.telegram.ui.ActionBar.b2() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i23) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            q0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            q0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.b2() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i23) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            q0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            q0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.p();
                            return;
                        }
                        q0Var2.run();
                    }
                }
            });
            i12.setOnDismissListener(new bi.s7(zArr, inputtonconnectoauthsessionArr, k3VarArr, new org.telegram.ui.ActionBar.k3[1]));
            org.telegram.ui.ActionBar.k3 k3Var = f38906a;
            if (k3Var != null) {
                k3Var.dismiss();
                f38906a = null;
            }
            final org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(tL_urlAuthResultRequest2, i12, k3VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, q0Var);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f38906a = c(context, i10, tL_urlAuthResultRequest2.match_codes, str5, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str6 = (String) obj2;
                        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
                        e2Var.r(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str6;
                        tL_messages_checkUrlAuthMatchCode.match_code = str6;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new Object(), new bi.s2(e2Var, v51Var, str5, resourceProvider, 2));
                    }
                }, false, new org.telegram.ui.Components.zr0(zArr2, a1Var, tL_messages_requestUrlAuth, i10, 11), U5.getResourceProvider());
            } else {
                v51Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.k3 c(Context context, int i10, ArrayList arrayList, String str, Utilities.Callback callback, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        int i12;
        cl0 cl0Var;
        int i13;
        org.telegram.ui.ActionBar.k3[] k3VarArr = new org.telegram.ui.ActionBar.k3[1];
        org.telegram.ui.ActionBar.k3 i14 = org.telegram.messenger.vh.i(1, context, null, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i14.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 0, 0, 0, 0));
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
            int dp = AndroidUtilities.dp(70.0f);
            int i16 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.k3 k3Var = i14;
            int i17 = i15;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.o1(0.05f, org.telegram.ui.ActionBar.y6.w0(i16, u6Var)));
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.05f, i16);
            frameLayout.setBackground(K);
            org.telegram.ui.ActionBar.f7.k(frameLayout, K, L, null, u6Var);
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                cl0Var = new cl0(new org.telegram.ui.Components.q11(str2, 30.0f, AndroidUtilities.bold()), u6Var);
                z11 = false;
            } else {
                cl0Var = emojiBigDrawable;
            }
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9VarArr[i17] = y9Var;
            y9Var.getImageReceiver().setCurrentAccount(i11);
            y9Var.l(null, null, null, null, cl0Var, null);
            NotificationCenter.listenEmojiLoading(y9Var);
            frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.i(40, 40, 17));
            if (i17 == 0) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            linearLayout2.addView(frameLayout, org.telegram.ui.Components.gb1.x(70, 70, 16, i13, 0, 0, 0));
            org.telegram.ui.Components.gb1.b(frameLayout);
            frameLayout.setOnClickListener(new z(k3VarArr, callback, str2));
            i15 = i17 + 1;
            i14 = k3Var;
        }
        org.telegram.ui.ActionBar.k3 k3Var2 = i14;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, null, false, new org.telegram.ui.Components.oy(17, arrayList, y9VarArr));
        if (z11) {
            i12 = R.string.BotAuthSelectEmoji;
        } else {
            i12 = R.string.BotAuthSelectCode;
        }
        textView.setText(LocaleController.getString(i12));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
        textView2.setText(AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.y6.Oh, null, null));
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 0, 23, 0, 11));
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        if (z10) {
            f7.e();
            f7.setText(LocaleController.getString(R.string.Cancel));
        } else {
            int i18 = org.telegram.ui.ActionBar.y6.f23581p7;
            f7.setColor(org.telegram.ui.ActionBar.y6.w0(i18, u6Var));
            if (f7.getBackground() != null) {
                Drawable background = f7.getBackground();
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
                f7.setBackground(background);
                org.telegram.ui.ActionBar.f7.k(f7, background, N, null, u6Var);
            }
            f7.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(f7, org.telegram.ui.Components.gb1.x(-1, 48, 7, 12, 12, 12, 12));
        f7.setOnClickListener(new z(f7, k3VarArr, runnable, 13));
        k3Var2.show();
        k3VarArr[0] = k3Var2;
        return k3Var2;
    }
}
