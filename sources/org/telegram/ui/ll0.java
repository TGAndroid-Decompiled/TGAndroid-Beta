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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class ll0 {
    public static org.telegram.ui.ActionBar.f3 f38430a;

    public static org.telegram.ui.Components.yc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        HashSet hashSet = fi.k3.W0;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            fi.k3 k3Var = null;
            while (it.hasNext()) {
                fi.k3 k3Var2 = (fi.k3) it.next();
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
                return new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(context2), null);
            }
        }
        HashSet hashSet2 = i4.f37215b1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            i4 i4Var = null;
            while (it2.hasNext()) {
                i4 i4Var2 = (i4) it2.next();
                if (i4Var2.V) {
                    i4Var = i4Var2;
                }
            }
            if (i4Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context = U.getParentActivity();
                } else {
                    context = LaunchActivity.G1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(context), null);
            }
        }
        if (U != null && U.getLastSheet() != null && U.getLastSheet().getBulletinFactory() != null) {
            return U.getLastSheet().getBulletinFactory();
        }
        return org.telegram.ui.Components.yc.a0(U);
    }

    public static void b(boolean z10, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.d1 d1Var) {
        final Context context;
        String str3;
        int i11;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z12;
        org.telegram.ui.Cells.w8 w8Var;
        ArrayList arrayList;
        boolean z13;
        org.telegram.ui.ActionBar.n2 U;
        String str4;
        org.telegram.ui.ActionBar.n2 U2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (d1Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(d1Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (d1Var != null) {
                        d1Var.z("oauth_result_confirmed", org.telegram.ui.web.d1.B(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                    if (U3 == null) {
                        return;
                    }
                    of.f.u(U3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z14 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z14) {
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
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z14 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, str4), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gi, false)), R.raw.contact_check).j();
                }
                if (d1Var != null) {
                    d1Var.z("oauth_result_confirmed", org.telegram.ui.web.d1.B(null, "result_url"));
                } else if (z10 && (U2 = LaunchActivity.U()) != null && (context2 = U2.getContext()) != null) {
                    AndroidUtilities.runOnUIThread(new pv(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (d1Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 == null) {
                    return;
                }
                org.telegram.ui.Components.e5.q0(U4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.e5.q0(U, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
            if (U5 == null || (context = U5.getContext()) == null) {
                return;
            }
            org.telegram.ui.ActionBar.f6 resourceProvider = U5.getResourceProvider();
            final org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.wl.i(1, context, U5.getResourceProvider(), false);
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
            Collections.sort(arrayList2, new f6(26));
            final boolean z15 = tL_messages_requestUrlAuth.peer != null;
            boolean z16 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20779i5)));
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            x9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            final int[] iArr = {i10};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            i9Var.r(currentUser);
            x9Var.e(currentUser, i9Var);
            frameLayout5.addView(x9Var, w7.x5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20942r5);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout5.addView(imageView, w7.x5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout4.addView(frameLayout5, w7.x5.e(52, 28, 17));
            frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout3.addView(frameLayout4, w7.x5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.z5.a(frameLayout4);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout4.setVisibility(8);
            }
            LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
            frameLayout3.addView(f7, w7.x5.e(-1, -1, 119));
            org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(context);
            x9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
            i9Var2.r(tL_urlAuthResultRequest2.bot);
            x9Var2.e(tL_urlAuthResultRequest2.bot, i9Var2);
            f7.addView(x9Var2, w7.x5.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                str3 = !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
            } else {
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str5 = str3;
            int i14 = org.telegram.ui.ActionBar.j6.f20797j5;
            TextView b10 = w7.b6.b(context, 20.0f, i14, true, null);
            b10.setGravity(17);
            b10.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, str5), U5.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
            f7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = w7.b6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            if (z16) {
                i11 = R.string.BotAuthAppSubtitle;
            } else {
                i11 = z15 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle;
            }
            org.telegram.messenger.w1.n(i11, b11);
            f7.addView(b11, w7.x5.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout = frameLayout4;
                frameLayout2 = frameLayout5;
                f6Var = resourceProvider;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6)));
                f7.addView(linearLayout, w7.x5.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    frameLayout = frameLayout4;
                    frameLayout2 = frameLayout5;
                    f6Var = resourceProvider;
                } else {
                    LinearLayout f10 = org.telegram.messenger.wl.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    frameLayout = frameLayout4;
                    imageView2.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i14), mode));
                    f10.addView(imageView2, w7.x5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f10.addView(linearLayout2, w7.x5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    frameLayout2 = frameLayout5;
                    TextView b12 = w7.b6.b(context, 16.0f, i14, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, w7.x5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = w7.b6.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f21069y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    f6Var = resourceProvider;
                    linearLayout2.addView(b13, w7.x5.q(-1, -2, 55));
                    linearLayout.addView(f10, w7.x5.n(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z12 = false;
                } else {
                    LinearLayout f11 = org.telegram.messenger.wl.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i14), mode));
                    f11.addView(imageView3, w7.x5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f11.addView(linearLayout3, w7.x5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = w7.b6.b(context, 16.0f, i14, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, w7.x5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z12 = false;
                    TextView b15 = w7.b6.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f21069y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, w7.x5.q(-1, -2, 55));
                    linearLayout.addView(f11, w7.x5.n(-1, -2));
                }
                TextView b16 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f21069y6, z12, null);
                b16.setText(LocaleController.getString(R.string.BotAuthInfo));
                f7.addView(b16, w7.x5.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                int dp = AndroidUtilities.dp(16.0f);
                int i15 = org.telegram.ui.ActionBar.j6.f20690d6;
                frameLayout6.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, U5.getThemedColor(i15)));
                org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, U5.getResourceProvider());
                w8Var2.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                w8Var2.setBackground(org.telegram.ui.ActionBar.j6.Z(U5.getThemedColor(i15), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20780i6), 16, 16));
                w8Var2.setOnClickListener(new l60(w8Var2, 11));
                frameLayout6.addView(w8Var2, w7.x5.e(-1, -1, 119));
                f7.addView(frameLayout6, w7.x5.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f21069y6, false, null);
                b17.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                f7.addView(b17, w7.x5.t(-1, -2, 55, 22, 6, 22, 20));
                w8Var = w8Var2;
            } else {
                w8Var = null;
            }
            LinearLayout f12 = org.telegram.messenger.wl.f(context, 0);
            final di.d dVar = new di.d(context, U5.getResourceProvider(), true);
            dVar.setRoundRadius(24);
            dVar.setColor(U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20907p7));
            dVar.setText(LocaleController.getString(R.string.Decline));
            f12.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final di.d dVar2 = new di.d(context, U5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            dVar2.setText(LocaleController.getString(R.string.BotAuthLogin));
            f12.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f7.addView(f12, w7.x5.t(-1, -2, 7, 12, 12, 12, 8));
            i12.setBackgroundColor(U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20634a7));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout7 = frameLayout;
            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
            il0 il0Var = new il0(iArr, tL_messages_requestUrlAuth, i12, z10, str, urlAuthResult2, strArr, z11, d1Var, str5, f6Var2);
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i10).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i16 = 0;
                while (i16 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i16);
                    i16++;
                    Integer num = (Integer) obj;
                    z13 = z16;
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        il0Var.run(num);
                        break;
                    } else {
                        arrayList3 = arrayList;
                        z16 = z13;
                    }
                }
            }
            arrayList = arrayList3;
            z13 = z16;
            frameLayout7.setOnClickListener(new bi.l0(i12, frameLayout2, arrayList, iArr, il0Var));
            boolean[] zArr = new boolean[1];
            dVar.setOnClickListener(new fi.m3(tL_messages_requestUrlAuth, zArr, i12, dVar, d1Var, i10));
            final boolean[] zArr2 = new boolean[1];
            final boolean z17 = z13;
            final bi.ia iaVar = new bi.ia(tL_urlAuthResultRequest2, strArr, context, i10, new jl0(dVar2, dVar, tL_messages_requestUrlAuth, strArr, w8Var, zArr2, iArr, zArr, i12, str5, f6Var2, z10, str, tL_urlAuthResultRequest2, d1Var), U5, 10);
            dVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str6;
                    if (!di.d.this.N && !dVar.N) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z18 = tL_urlAuthResultRequest3.request_phone_number;
                        final bi.ia iaVar2 = iaVar;
                        if (z18) {
                            TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, U5.getResourceProvider());
                            String string = LocaleController.getString(R.string.BotAuthPhoneNumber);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                            b2Var.R = string;
                            int i17 = R.string.BotAuthPhoneNumberText;
                            if (z15 && !z17) {
                                str6 = UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                            } else {
                                str6 = str5;
                            }
                            gf.b c10 = gf.b.c();
                            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(i17, str6, c10.b("+" + currentUser2.phone).replaceAll(" ", " ")));
                            String string2 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                            final boolean[] zArr3 = zArr2;
                            alertDialog$Builder.h(string2, new org.telegram.ui.ActionBar.a2() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                                    switch (r3) {
                                        case 0:
                                            zArr3[0] = false;
                                            iaVar2.run();
                                            return;
                                        default:
                                            zArr3[0] = true;
                                            iaVar2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.a2() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                                    switch (r3) {
                                        case 0:
                                            zArr3[0] = false;
                                            iaVar2.run();
                                            return;
                                        default:
                                            zArr3[0] = true;
                                            iaVar2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        iaVar2.run();
                    }
                }
            });
            i12.setOnDismissListener(new r5(new org.telegram.ui.ActionBar.f3[1], 9));
            org.telegram.ui.ActionBar.f3 f3Var = f38430a;
            if (f3Var != null) {
                f3Var.dismiss();
                f38430a = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f38430a = c(context, i10, tL_urlAuthResultRequest2.match_codes, str5, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str6 = (String) obj2;
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                        b2Var.q(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str6;
                        tL_messages_checkUrlAuthMatchCode.match_code = str6;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new Object(), new gl0(b2Var, i12, str5, f6Var2, 0));
                    }
                }, false, new org.telegram.ui.Components.r11(zArr, d1Var, tL_messages_requestUrlAuth, i10, 6), U5.getResourceProvider());
                return;
            }
            f38430a = i12;
            i12.show();
        }
    }

    public static org.telegram.ui.ActionBar.f3 c(Context context, int i10, ArrayList arrayList, String str, Utilities.Callback callback, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        kl0 kl0Var;
        int i13;
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        org.telegram.ui.ActionBar.f3 i14 = org.telegram.messenger.wl.i(1, context, null, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i14.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
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
        org.telegram.ui.Components.x9[] x9VarArr = new org.telegram.ui.Components.x9[arrayList.size()];
        int i15 = 0;
        boolean z11 = true;
        while (i15 < arrayList.size()) {
            String str2 = (String) arrayList.get(i15);
            FrameLayout frameLayout = new FrameLayout(context);
            org.telegram.ui.ActionBar.f3 f3Var = i14;
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(70.0f), org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                kl0Var = new kl0(new org.telegram.ui.Components.f01(str2, 30.0f, AndroidUtilities.bold()), f6Var);
                z11 = false;
            } else {
                kl0Var = emojiBigDrawable;
            }
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            x9VarArr[i15] = x9Var;
            x9Var.getImageReceiver().setCurrentAccount(i11);
            x9Var.l(null, null, null, null, kl0Var, null);
            NotificationCenter.listenEmojiLoading(x9Var);
            frameLayout.addView(x9Var, w7.x5.e(40, 40, 17));
            if (i15 == 0) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            linearLayout2.addView(frameLayout, w7.x5.t(70, 70, 16, i13, 0, 0, 0));
            w7.z5.a(frameLayout);
            frameLayout.setOnClickListener(new z(f3VarArr, callback, str2));
            i15++;
            i14 = f3Var;
        }
        org.telegram.ui.ActionBar.f3 f3Var2 = i14;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, null, false, new oj0(2, arrayList, x9VarArr));
        if (z11) {
            i12 = R.string.BotAuthSelectEmoji;
        } else {
            i12 = R.string.BotAuthSelectCode;
        }
        textView.setText(LocaleController.getString(i12));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21069y6, f6Var));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 0, 23, 0, 11));
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        if (z10) {
            g10.d();
            g10.setText(LocaleController.getString(R.string.Cancel));
        } else {
            g10.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20907p7, f6Var));
            g10.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(g10, w7.x5.t(-1, 48, 7, 12, 12, 12, 12));
        g10.setOnClickListener(new z(g10, f3VarArr, runnable, 13));
        f3Var2.show();
        f3VarArr[0] = f3Var2;
        return f3Var2;
    }
}
