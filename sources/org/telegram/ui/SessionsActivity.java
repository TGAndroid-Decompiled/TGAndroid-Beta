package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public class SessionsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public xw0 U;
    public k71 f36173a;
    public w50 f36174b;
    public org.telegram.ui.Components.yy f36175c;
    public org.telegram.ui.Components.e00 d;
    public final ArrayList f36176e;
    public final ArrayList f36177f;
    public ArrayList h;
    public TLRPC.TL_authorization f36178n;
    public boolean f36179r;
    public g71 f36180s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f36181w;
    public int f36182x;
    public int f36183y;

    public SessionsActivity(int i9) {
        super(null);
        this.f36176e = new ArrayList();
        this.f36177f = new ArrayList();
        this.h = new ArrayList();
        this.R = 0;
        this.f36181w = i9;
    }

    public static void T(SessionsActivity sessionsActivity, int i9) {
        String str;
        int dp;
        int dp2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        String formatDateTime;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        ArrayList arrayList;
        String string;
        int i14;
        boolean z12;
        ArrayList arrayList2 = sessionsActivity.f36176e;
        int i15 = sessionsActivity.f36181w;
        boolean z13 = true;
        if (i9 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i16 = sessionsActivity.v;
                if (i16 <= 7) {
                    i14 = 0;
                } else if (i16 <= 93) {
                    i14 = 1;
                } else if (i16 <= 183) {
                    i14 = 2;
                } else {
                    i14 = 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                for (int i17 = 0; i17 < 4; i17++) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(sessionsActivity.getParentActivity(), null);
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i17));
                    k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                    String str2 = strArr[i17];
                    if (i14 == i17) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k6Var.b(str2, z12);
                    linearLayout.addView(k6Var);
                    k6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                    k6Var.setOnClickListener(new v80(21, sessionsActivity, alertDialog$Builder));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var);
            }
        } else if (i9 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.h;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.h;
                    int size = arrayList4.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList4.get(i18);
                        i18++;
                        TLRPC.User user = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (user != null) {
                            String publicUsername = UserObject.getPublicUsername(user);
                            if (!TextUtils.isEmpty(publicUsername)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                                append.setSpan(new org.telegram.ui.Components.p41(ta.b.d("https://t.me/", publicUsername), (org.telegram.ui.Components.vz0) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.y4.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new e71(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                if (i15 == 0) {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureSessions);
                    c2Var2.N = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureWebSessions);
                    c2Var2.N = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new f71(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            }
        } else if (i9 >= sessionsActivity.I && i9 < sessionsActivity.J) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i19 = i9 - sessionsActivity.I;
                new pf.g0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i19), new org.telegram.ui.Components.qd(sessionsActivity, i19, 25), sessionsActivity.resourceProvider).show();
            }
        } else if (((i9 >= sessionsActivity.G && i9 < sessionsActivity.H) || ((i9 >= sessionsActivity.C && i9 < sessionsActivity.D) || i9 == sessionsActivity.f36183y)) && sessionsActivity.getParentActivity() != null) {
            if (i15 == 0) {
                if (i9 == sessionsActivity.f36183y) {
                    tL_authorization = sessionsActivity.f36178n;
                    z10 = true;
                } else {
                    int i20 = sessionsActivity.G;
                    if (i9 >= i20 && i9 < sessionsActivity.H) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i9 - i20);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f36177f.get(i9 - sessionsActivity.C);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    h71 h71Var = new h71(sessionsActivity);
                    ?? f3Var = new org.telegram.ui.ActionBar.f3(sessionsActivity.getParentActivity(), false);
                    f3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    f3Var.f44759b = tL_authorization;
                    f3Var.f44760c = sessionsActivity;
                    f3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    f3Var.d = imageView;
                    imageView.setOnClickListener(new p61(f3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, g7.e6.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    j3.r0.u(20.0f, 2, textView2);
                    j3.r0.w(org.telegram.ui.ActionBar.f6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, g7.e6.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, g7.e6.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        formatDateTime = LocaleController.getString(R.string.Online);
                    } else {
                        formatDateTime = LocaleController.formatDateTime(tL_authorization.date_active, true);
                    }
                    textView3.setText(formatDateTime);
                    StringBuilder sb2 = new StringBuilder();
                    if (tL_authorization.device_model.length() != 0) {
                        sb2.append(tL_authorization.device_model);
                    }
                    if (sb2.length() == 0) {
                        if (tL_authorization.platform.length() != 0) {
                            sb2.append(tL_authorization.platform);
                        }
                        if (tL_authorization.system_version.length() != 0) {
                            if (tL_authorization.platform.length() != 0) {
                                sb2.append(" ");
                            }
                            sb2.append(tL_authorization.system_version);
                        }
                    }
                    textView2.setText(sb2);
                    String lowerCase = tL_authorization.platform.toLowerCase();
                    if (lowerCase.isEmpty()) {
                        lowerCase = tL_authorization.system_version.toLowerCase();
                    }
                    String lowerCase2 = tL_authorization.device_model.toLowerCase();
                    if (lowerCase2.contains("safari")) {
                        i11 = R.raw.safari_30;
                        i12 = org.telegram.ui.ActionBar.f6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i11 = R.raw.edge_30;
                        i12 = org.telegram.ui.ActionBar.f6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i11 = R.raw.chrome_30;
                        i12 = org.telegram.ui.ActionBar.f6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i11 = R.raw.firefox_30;
                        i12 = org.telegram.ui.ActionBar.f6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i11 = R.raw.ubuntu_30;
                            i12 = org.telegram.ui.ActionBar.f6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i11 = R.raw.linux_30;
                            i12 = org.telegram.ui.ActionBar.f6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i13 = R.raw.ipad_30;
                            } else {
                                i13 = R.raw.iphone_30;
                            }
                            i11 = i13;
                            i12 = org.telegram.ui.ActionBar.f6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.f6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i11 = R.raw.mac_30;
                            i12 = org.telegram.ui.ActionBar.f6.S7;
                        } else if (lowerCase.contains("android")) {
                            i11 = R.raw.android_30;
                            i12 = org.telegram.ui.ActionBar.f6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.f6.S7;
                        } else {
                            i11 = R.raw.chrome_30;
                            i12 = org.telegram.ui.ActionBar.f6.U7;
                        }
                        z13 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i10 = R.drawable.device_web_opera;
                        } else if (lowerCase2.contains("firefox")) {
                            i10 = R.drawable.device_web_firefox;
                        } else {
                            i10 = R.drawable.device_web_other;
                        }
                        i11 = i10;
                        i12 = org.telegram.ui.ActionBar.f6.U7;
                        z13 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.f6.w0(null, i12, false)));
                    if (z13) {
                        imageView.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.f6.w0(null, i12, false)});
                    } else {
                        imageView.setImageDrawable(f3Var.getContext().getDrawable(i11));
                    }
                    x61 x61Var = new x61(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    x61Var.f44386b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i21 = org.telegram.ui.ActionBar.f6.f23162m6;
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, i21, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    x61Var.f44385a.setImageDrawable(mutate);
                    x61Var.f44387c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(x61Var);
                    if (tL_authorization.country.length() != 0) {
                        x61 x61Var2 = new x61(parentActivity, false);
                        x61Var2.f44386b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
                        x61Var2.f44385a.setImageDrawable(mutate2);
                        x61Var2.f44387c.setText(LocaleController.getString(R.string.Location));
                        x61Var2.setOnClickListener(new q61(f3Var, tL_authorization));
                        x61Var2.setOnLongClickListener(new r61(f3Var, tL_authorization));
                        x61Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                        linearLayout2.addView(x61Var2);
                        x61Var.f44388e = true;
                        x61Var = x61Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        x61 x61Var3 = new x61(parentActivity, false);
                        x61Var3.f44386b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
                        x61Var3.f44385a.setImageDrawable(mutate3);
                        x61Var3.f44387c.setText(LocaleController.getString(R.string.IpAddress));
                        x61Var3.setOnClickListener(new s61(f3Var, tL_authorization));
                        x61Var3.setOnLongClickListener(new t61(f3Var, tL_authorization));
                        x61Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
                        linearLayout2.addView(x61Var3);
                        z11 = true;
                        x61Var.f44388e = true;
                        x61Var = x61Var3;
                    } else {
                        z11 = true;
                    }
                    int i22 = tL_authorization.api_id;
                    if (i22 != 2040 && i22 != 2496) {
                        x61 x61Var4 = new x61(parentActivity, z11);
                        x61Var4.f44386b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
                        x61Var4.f44385a.setImageDrawable(mutate4);
                        x61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        x61Var4.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 7, -1));
                        x61Var4.setOnClickListener(new u61(f3Var, x61Var4, tL_authorization));
                        x61Var.f44388e = true;
                        x61Var4.f44387c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(x61Var4);
                        x61Var = x61Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        x61 x61Var5 = new x61(parentActivity, true);
                        x61Var5.f44386b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
                        x61Var5.f44385a.setImageDrawable(mutate5);
                        x61Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        x61Var5.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 7, -1));
                        x61Var5.setOnClickListener(new v61(f3Var, x61Var5, tL_authorization));
                        x61Var.f44388e = true;
                        x61Var5.f44387c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(x61Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, w03, k10, k10));
                        linearLayout2.addView(textView4, g7.e6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new w61(f3Var, h71Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    f3Var.setCustomView(scrollView);
                    f3Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
            if (i15 == 0) {
                c2Var3.P = LocaleController.getString(R.string.TerminateSessionText);
                c2Var3.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i9 - sessionsActivity.G);
                c2Var3.P = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                c2Var3.N = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                z1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, str), "", false, false, false);
                if (LocaleController.isRTL) {
                    dp = AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                if (LocaleController.isRTL) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(16.0f);
                }
                z1Var.setPadding(dp, 0, dp2, 0);
                frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new l8(6, zArr));
                c2Var3.C = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new c3.e(sessionsActivity, i9, zArr, 14));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(c2Var3);
            TextView textView5 = (TextView) c2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }

    public static void U(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.h.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new b71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new b71(sessionsActivity, 1));
    }

    public static void V(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f36181w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new b71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new b71(sessionsActivity, 3));
    }

    public static void W(SessionsActivity sessionsActivity, int i9, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.f36176e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(sessionsActivity.getParentActivity(), 3, null);
            c2Var.f22766c0 = false;
            c2Var.show();
            if (sessionsActivity.f36181w == 0) {
                int i10 = sessionsActivity.G;
                if (i9 >= i10 && i9 < sessionsActivity.H) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i9 - i10);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f36177f.get(i9 - sessionsActivity.C);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new kr0(sessionsActivity, c2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i9 - sessionsActivity.G);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new kr0(sessionsActivity, c2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void X(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.f36176e;
        sessionsActivity.f36179r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.l0();
        }
        k71 k71Var = sessionsActivity.f36173a;
        if (k71Var != null) {
            k71Var.l();
        }
        xw0 xw0Var = sessionsActivity.U;
        if (xw0Var != null) {
            xw0Var.a();
        }
        int i9 = sessionsActivity.R;
        if (i9 > 0) {
            int i10 = i9 - 1;
            sessionsActivity.R = i10;
            if (i10 > 0) {
                AndroidUtilities.runOnUIThread(new c71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.d = e00Var;
        e00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.f36181w;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 24));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f36173a = new k71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.f36175c = yyVar;
        yyVar.b();
        frameLayout.addView(this.f36175c, g7.e6.e(-1, -1, 17));
        w50 w50Var = new w50(this, context);
        this.f36174b = w50Var;
        w50Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36174b);
        this.f36174b.setLayoutManager(new of.y(1, false, 17));
        this.f36174b.setVerticalScrollBarEnabled(false);
        this.f36174b.setEmptyView(this.f36175c);
        w50 w50Var2 = this.f36174b;
        w50Var2.U1 = true;
        w50Var2.V1 = 0;
        frameLayout.addView(w50Var2, g7.e6.c(-1.0f, -1));
        this.f36174b.setAdapter(this.f36173a);
        f2.n nVar = new f2.n();
        nVar.n(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
        nVar.f5552i = grVar;
        nVar.f5449o = grVar;
        this.f36174b.setItemAnimator(nVar);
        this.f36174b.setOnItemClickListener(new c21(this, 4));
        if (i9 == 0) {
            g71 g71Var = new g71(this, context);
            this.f36180s = g71Var;
            frameLayout.addView(g71Var, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        l0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.newSessionReceived) {
            j0(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36175c, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        int i9 = org.telegram.ui.ActionBar.f6.f23212p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23229q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        int i11 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36174b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i9));
        int i12 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36180s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i12));
        return arrayList;
    }

    public final int i0() {
        ArrayList arrayList = this.f36176e;
        int i9 = 0;
        if (arrayList.size() == 0 && this.f36179r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f36181w == 0) {
            i9 = 1;
        }
        return size + i9;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(final boolean z10) {
        if (this.f36179r) {
            return;
        }
        if (!z10) {
            this.f36179r = true;
        }
        if (this.f36181w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f45053b;

                {
                    this.f45053b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f45053b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f36177f;
                                            ArrayList arrayList2 = sessionsActivity2.f36176e;
                                            sessionsActivity2.f36179r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i9 = 0; i9 < size; i9++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i9);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f36178n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.l0();
                                                xw0 xw0Var = sessionsActivity2.U;
                                                if (xw0Var != null) {
                                                    xw0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity2.f36173a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            xw0 xw0Var2 = sessionsActivity2.U;
                                            if (xw0Var2 != null) {
                                                xw0Var2.a();
                                            }
                                            int i10 = sessionsActivity2.R;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity2.R = i11;
                                                if (i11 > 0) {
                                                    AndroidUtilities.runOnUIThread(new c71(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.X(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f45053b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f36177f;
                                            ArrayList arrayList2 = sessionsActivity22.f36176e;
                                            sessionsActivity22.f36179r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i9 = 0; i9 < size; i9++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i9);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f36178n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.l0();
                                                xw0 xw0Var = sessionsActivity22.U;
                                                if (xw0Var != null) {
                                                    xw0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity22.f36173a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            xw0 xw0Var2 = sessionsActivity22.U;
                                            if (xw0Var2 != null) {
                                                xw0Var2.a();
                                            }
                                            int i10 = sessionsActivity22.R;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity22.R = i11;
                                                if (i11 > 0) {
                                                    AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.X(sessionsActivity2, tL_error, tLObject, z12);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            }), this.classGuid);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) {
            public final SessionsActivity f45053b;

            {
                this.f45053b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f45053b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f36177f;
                                        ArrayList arrayList2 = sessionsActivity22.f36176e;
                                        sessionsActivity22.f36179r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i9 = 0; i9 < size; i9++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i9);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f36178n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.l0();
                                            xw0 xw0Var = sessionsActivity22.U;
                                            if (xw0Var != null) {
                                                xw0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.f36173a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        xw0 xw0Var2 = sessionsActivity22.U;
                                        if (xw0Var2 != null) {
                                            xw0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.R;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.R = i11;
                                            if (i11 > 0) {
                                                AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.X(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f45053b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f36177f;
                                        ArrayList arrayList2 = sessionsActivity22.f36176e;
                                        sessionsActivity22.f36179r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i9 = 0; i9 < size; i9++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i9);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f36178n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.l0();
                                            xw0 xw0Var = sessionsActivity22.U;
                                            if (xw0Var != null) {
                                                xw0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.f36173a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        xw0 xw0Var2 = sessionsActivity22.U;
                                        if (xw0Var2 != null) {
                                            xw0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.R;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.R = i11;
                                            if (i11 > 0) {
                                                AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.X(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    public final void k0() {
        this.S = true;
    }

    public final void l0() {
        this.O = 0;
        this.f36182x = -1;
        this.f36183y = -1;
        this.terminateAllSessionsRow = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.ttlRow = -1;
        this.Q = -1;
        int i9 = this.f36181w;
        if (i9 == 0 && getMessagesController().qrLoginCamera) {
            int i10 = this.O;
            this.M = i10;
            this.O = i10 + 2;
            this.N = i10 + 1;
        }
        if (this.f36179r) {
            if (i9 == 0) {
                int i11 = this.O;
                this.f36182x = i11;
                this.O = i11 + 2;
                this.f36183y = i11 + 1;
                return;
            }
            return;
        }
        if (this.f36178n != null) {
            int i12 = this.O;
            this.f36182x = i12;
            this.O = i12 + 2;
            this.f36183y = i12 + 1;
        }
        ArrayList arrayList = this.f36177f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f36176e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.A = -1;
            if (i9 != 1 && this.f36178n == null) {
                this.L = -1;
            } else {
                int i13 = this.O;
                this.O = i13 + 1;
                this.L = i13;
            }
        } else {
            int i14 = this.O;
            this.terminateAllSessionsRow = i14;
            this.O = i14 + 2;
            this.A = i14 + 1;
            this.L = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.O;
            int i16 = i15 + 1;
            this.O = i16;
            this.B = i15;
            this.C = i16;
            int size = arrayList.size() + i16;
            this.D = size;
            this.O = size + 1;
            this.E = size;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.O;
            this.O = i17 + 1;
            this.F = i17;
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.O;
                this.I = i18;
                int size2 = this.h.size() + i18;
                this.O = size2;
                this.J = size2;
            }
            int i19 = this.O;
            this.G = i19;
            this.H = arrayList2.size() + i19;
            int size3 = arrayList2.size() + this.O;
            this.O = size3 + 1;
            this.K = size3;
        } else {
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.O;
                int i21 = i20 + 1;
                this.O = i21;
                this.F = i20;
                this.I = i21;
                int size4 = this.h.size() + i21;
                this.J = size4;
                this.O = size4 + 1;
                this.K = size4;
            }
        }
        if (this.v > 0) {
            int i22 = this.O;
            this.P = i22;
            this.ttlRow = i22 + 1;
            this.O = i22 + 3;
            this.Q = i22 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        g71 g71Var = this.f36180s;
        if (g71Var != null) {
            g71Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        j0(false);
        if (this.f36181w == 0) {
            pf.g.a(this.currentAccount).c(new e71(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f36174b.setPadding(0, 0, 0, i12);
        this.f36174b.setClipToPadding(false);
        g71 g71Var = this.f36180s;
        if (g71Var != null) {
            g71Var.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        g71 g71Var = this.f36180s;
        if (g71Var != null) {
            g71Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i9 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.d0(getParentActivity(), 2, new j71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new f71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        k71 k71Var = this.f36173a;
        if (k71Var != null) {
            k71Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.T = true;
            for (int i9 = 0; i9 < this.f36174b.getChildCount(); i9++) {
                View childAt = this.f36174b.getChildAt(i9);
                if (childAt instanceof l71) {
                    ((l71) childAt).f40074b.invalidate();
                }
            }
        }
    }
}
