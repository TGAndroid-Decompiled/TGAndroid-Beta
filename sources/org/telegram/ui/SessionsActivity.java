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
public class SessionsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public ux0 Y;
    public i81 f31467a;
    public n60 f31468b;
    public org.telegram.ui.Components.nz f31469c;
    public org.telegram.ui.Components.u00 d;
    public final ArrayList e;
    public final ArrayList f31470f;
    public ArrayList h;
    public TLRPC.TL_authorization f31471n;
    public boolean f31472r;
    public e81 f31473s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f31474w;
    public int f31475x;
    public int f31476y;

    public SessionsActivity(int i10) {
        super(null);
        this.e = new ArrayList();
        this.f31470f = new ArrayList();
        this.h = new ArrayList();
        this.V = 0;
        this.f31474w = i10;
    }

    public static void U(SessionsActivity sessionsActivity, int i10) {
        String str;
        int dp;
        int dp2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        String formatDateTime;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        ArrayList arrayList;
        String string;
        int i15;
        boolean z12;
        ArrayList arrayList2 = sessionsActivity.e;
        int i16 = sessionsActivity.f31474w;
        float f7 = 4.0f;
        boolean z13 = true;
        if (i10 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i17 = sessionsActivity.v;
                if (i17 <= 7) {
                    i15 = 0;
                } else if (i17 <= 93) {
                    i15 = 1;
                } else if (i17 <= 183) {
                    i15 = 2;
                } else {
                    i15 = 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(sessionsActivity.getParentActivity(), null);
                    l6Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(4.0f), 0);
                    l6Var.setTag(Integer.valueOf(i18));
                    l6Var.a(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18844g7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l6Var.b(str2, z12);
                    linearLayout.addView(l6Var);
                    l6Var.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 2, -1));
                    l6Var.setOnClickListener(new py0(4, sessionsActivity, alertDialog$Builder));
                    i18++;
                    f7 = 4.0f;
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var);
            }
        } else if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.h;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.h;
                    int size = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj = arrayList4.get(i19);
                        i19++;
                        TLRPC.User user = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (user != null) {
                            String publicUsername = UserObject.getPublicUsername(user);
                            if (!TextUtils.isEmpty(publicUsername)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                                append.setSpan(new org.telegram.ui.Components.l51(org.telegram.ui.Cells.q3.i("https://t.me/", publicUsername), (org.telegram.ui.Components.n01) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.e5.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new c81(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18409a;
                if (i16 == 0) {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    b2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    b2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new d81(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i20 = i10 - sessionsActivity.M;
                new hg.m0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.kd(sessionsActivity, i20, 27), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.K && i10 < sessionsActivity.L) || ((i10 >= sessionsActivity.G && i10 < sessionsActivity.H) || i10 == sessionsActivity.f31476y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i10 == sessionsActivity.f31476y) {
                    tL_authorization = sessionsActivity.f31471n;
                    z10 = true;
                } else {
                    int i21 = sessionsActivity.K;
                    if (i10 >= i21 && i10 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f31470f.get(i10 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    f81 f81Var = new f81(sessionsActivity);
                    ?? f3Var = new org.telegram.ui.ActionBar.f3(sessionsActivity.getParentActivity(), false);
                    f3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    f3Var.f38553b = tL_authorization;
                    f3Var.f38554c = sessionsActivity;
                    f3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    f3Var.d = imageView;
                    imageView.setOnClickListener(new n71(f3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, w7.x5.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.gms.internal.vision.e2.l(20.0f, 2, textView2);
                    com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, w7.x5.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19170y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 1, 21, 4, 21, 21));
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
                        i12 = R.raw.safari_30;
                        i13 = org.telegram.ui.ActionBar.h6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i12 = R.raw.edge_30;
                        i13 = org.telegram.ui.ActionBar.h6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i12 = R.raw.chrome_30;
                        i13 = org.telegram.ui.ActionBar.h6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i12 = R.raw.firefox_30;
                        i13 = org.telegram.ui.ActionBar.h6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i12 = R.raw.ubuntu_30;
                            i13 = org.telegram.ui.ActionBar.h6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i12 = R.raw.linux_30;
                            i13 = org.telegram.ui.ActionBar.h6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = R.raw.ipad_30;
                            } else {
                                i14 = R.raw.iphone_30;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.h6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.h6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i12 = R.raw.mac_30;
                            i13 = org.telegram.ui.ActionBar.h6.S7;
                        } else if (lowerCase.contains("android")) {
                            i12 = R.raw.android_30;
                            i13 = org.telegram.ui.ActionBar.h6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.h6.S7;
                        } else {
                            i12 = R.raw.chrome_30;
                            i13 = org.telegram.ui.ActionBar.h6.U7;
                        }
                        z13 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i11 = R.drawable.device_web_opera;
                        } else if (lowerCase2.contains("firefox")) {
                            i11 = R.drawable.device_web_firefox;
                        } else {
                            i11 = R.drawable.device_web_other;
                        }
                        i12 = i11;
                        i13 = org.telegram.ui.ActionBar.h6.U7;
                        z13 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.h6.w0(null, i13, false)));
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.h6.w0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(f3Var.getContext().getDrawable(i12));
                    }
                    v71 v71Var = new v71(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    v71Var.f38318b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i22 = org.telegram.ui.ActionBar.h6.f18953m6;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, i22, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    v71Var.f38317a.setImageDrawable(mutate);
                    v71Var.f38319c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(v71Var);
                    if (tL_authorization.country.length() != 0) {
                        v71 v71Var2 = new v71(parentActivity, false);
                        v71Var2.f38318b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i22, false), mode));
                        v71Var2.f38317a.setImageDrawable(mutate2);
                        v71Var2.f38319c.setText(LocaleController.getString(R.string.Location));
                        v71Var2.setOnClickListener(new o71(f3Var, tL_authorization));
                        v71Var2.setOnLongClickListener(new p71(f3Var, tL_authorization));
                        v71Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 2, -1));
                        linearLayout2.addView(v71Var2);
                        v71Var.e = true;
                        v71Var = v71Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        v71 v71Var3 = new v71(parentActivity, false);
                        v71Var3.f38318b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i22, false), mode));
                        v71Var3.f38317a.setImageDrawable(mutate3);
                        v71Var3.f38319c.setText(LocaleController.getString(R.string.IpAddress));
                        v71Var3.setOnClickListener(new q71(f3Var, tL_authorization));
                        v71Var3.setOnLongClickListener(new r71(f3Var, tL_authorization));
                        v71Var3.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 2, -1));
                        linearLayout2.addView(v71Var3);
                        z11 = true;
                        v71Var.e = true;
                        v71Var = v71Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        v71 v71Var4 = new v71(parentActivity, z11);
                        v71Var4.f38318b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i22, false), mode));
                        v71Var4.f38317a.setImageDrawable(mutate4);
                        v71Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        v71Var4.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 7, -1));
                        v71Var4.setOnClickListener(new s71(f3Var, v71Var4, tL_authorization));
                        v71Var.e = true;
                        v71Var4.f38319c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(v71Var4);
                        v71Var = v71Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        v71 v71Var5 = new v71(parentActivity, true);
                        v71Var5.f38318b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i22, false), mode));
                        v71Var5.f38317a.setImageDrawable(mutate5);
                        v71Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        v71Var5.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18878i6, false), 7, -1));
                        v71Var5.setOnClickListener(new t71(f3Var, v71Var5, tL_authorization));
                        v71Var.e = true;
                        v71Var5.f38319c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(v71Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18920ka, false);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, w03, k10, k10));
                        linearLayout2.addView(textView4, w7.x5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new u71(f3Var, f81Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18409a;
            if (i16 == 0) {
                b2Var3.T = LocaleController.getString(R.string.TerminateSessionText);
                b2Var3.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.K);
                b2Var3.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                b2Var3.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
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
                frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new m8(6, zArr));
                b2Var3.G = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new gg.d2(sessionsActivity, i10, zArr, 16));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(b2Var3);
            TextView textView5 = (TextView) b2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
            }
        }
    }

    public static void V(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.h.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new z71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new z71(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f31474w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new z71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new z71(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sessionsActivity.getParentActivity(), 3, null);
            b2Var.f18459g0 = false;
            b2Var.show();
            if (sessionsActivity.f31474w == 0) {
                int i11 = sessionsActivity.K;
                if (i10 >= i11 && i10 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f31470f.get(i10 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new gs0(sessionsActivity, b2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new gs0(sessionsActivity, b2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.f31472r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        i81 i81Var = sessionsActivity.f31467a;
        if (i81Var != null) {
            i81Var.l();
        }
        ux0 ux0Var = sessionsActivity.Y;
        if (ux0Var != null) {
            ux0Var.a();
        }
        int i10 = sessionsActivity.V;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.V = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new a81(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.d = u00Var;
        u00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f31474w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 29));
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f31467a = new i81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        org.telegram.ui.Components.nz nzVar = new org.telegram.ui.Components.nz(context, null);
        this.f31469c = nzVar;
        nzVar.b();
        frameLayout.addView(this.f31469c, w7.x5.e(-1, -1, 17));
        n60 n60Var = new n60(this, context);
        this.f31468b = n60Var;
        n60Var.p1();
        this.actionBar.setAdaptiveBackground(this.f31468b);
        this.f31468b.setLayoutManager(new gg.b0(1, false, 18));
        this.f31468b.setVerticalScrollBarEnabled(false);
        this.f31468b.setEmptyView(this.f31469c);
        n60 n60Var2 = this.f31468b;
        n60Var2.Y1 = true;
        n60Var2.Z1 = 0;
        frameLayout.addView(n60Var2, w7.x5.c(-1.0f, -1));
        this.f31468b.setAdapter(this.f31467a);
        s4.j jVar = new s4.j();
        jVar.n(150L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
        jVar.f42711i = rrVar;
        jVar.f42684o = rrVar;
        this.f31468b.setItemAnimator(jVar);
        this.f31468b.setOnItemClickListener(new s21(this, 5));
        if (i10 == 0) {
            e81 e81Var = new e81(this, context);
            this.f31473s = e81Var;
            frameLayout.addView(e81Var, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        m0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newSessionReceived) {
            k0(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.u6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18733a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f18878i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f18910k0, null, null, org.telegram.ui.ActionBar.h6.f18790d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31469c, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f18860h6));
        int i10 = org.telegram.ui.ActionBar.h6.f19008p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 262148, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 262148, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f18753b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31468b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31473s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f31472r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f31474w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f31472r) {
            return;
        }
        if (!z10) {
            this.f31472r = true;
        }
        if (this.f31474w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f39199b;

                {
                    this.f39199b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f39199b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f31470f;
                                            ArrayList arrayList2 = sessionsActivity2.e;
                                            sessionsActivity2.f31472r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f31471n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                ux0 ux0Var = sessionsActivity2.Y;
                                                if (ux0Var != null) {
                                                    ux0Var.a();
                                                }
                                            }
                                            i81 i81Var = sessionsActivity2.f31467a;
                                            if (i81Var != null) {
                                                i81Var.l();
                                            }
                                            ux0 ux0Var2 = sessionsActivity2.Y;
                                            if (ux0Var2 != null) {
                                                ux0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new a81(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f39199b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f31470f;
                                            ArrayList arrayList2 = sessionsActivity22.e;
                                            sessionsActivity22.f31472r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f31471n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                ux0 ux0Var = sessionsActivity22.Y;
                                                if (ux0Var != null) {
                                                    ux0Var.a();
                                                }
                                            }
                                            i81 i81Var = sessionsActivity22.f31467a;
                                            if (i81Var != null) {
                                                i81Var.l();
                                            }
                                            ux0 ux0Var2 = sessionsActivity22.Y;
                                            if (ux0Var2 != null) {
                                                ux0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new a81(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z12);
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
            public final SessionsActivity f39199b;

            {
                this.f39199b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f39199b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f31470f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f31472r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f31471n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ux0 ux0Var = sessionsActivity22.Y;
                                            if (ux0Var != null) {
                                                ux0Var.a();
                                            }
                                        }
                                        i81 i81Var = sessionsActivity22.f31467a;
                                        if (i81Var != null) {
                                            i81Var.l();
                                        }
                                        ux0 ux0Var2 = sessionsActivity22.Y;
                                        if (ux0Var2 != null) {
                                            ux0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new a81(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f39199b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f31470f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f31472r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f31471n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ux0 ux0Var = sessionsActivity22.Y;
                                            if (ux0Var != null) {
                                                ux0Var.a();
                                            }
                                        }
                                        i81 i81Var = sessionsActivity22.f31467a;
                                        if (i81Var != null) {
                                            i81Var.l();
                                        }
                                        ux0 ux0Var2 = sessionsActivity22.Y;
                                        if (ux0Var2 != null) {
                                            ux0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new a81(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    public final void l0() {
        this.W = true;
    }

    public final void m0() {
        this.S = 0;
        this.f31475x = -1;
        this.f31476y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.T = -1;
        this.ttlRow = -1;
        this.U = -1;
        int i10 = this.f31474w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.S;
            this.Q = i11;
            this.S = i11 + 2;
            this.R = i11 + 1;
        }
        if (this.f31472r) {
            if (i10 == 0) {
                int i12 = this.S;
                this.f31475x = i12;
                this.S = i12 + 2;
                this.f31476y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f31471n != null) {
            int i13 = this.S;
            this.f31475x = i13;
            this.S = i13 + 2;
            this.f31476y = i13 + 1;
        }
        ArrayList arrayList = this.f31470f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i10 != 1 && this.f31471n == null) {
                this.P = -1;
            } else {
                int i14 = this.S;
                this.S = i14 + 1;
                this.P = i14;
            }
        } else {
            int i15 = this.S;
            this.terminateAllSessionsRow = i15;
            this.S = i15 + 2;
            this.E = i15 + 1;
            this.P = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.S;
            int i17 = i16 + 1;
            this.S = i17;
            this.F = i16;
            this.G = i17;
            int size = arrayList.size() + i17;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (!arrayList2.isEmpty()) {
            int i18 = this.S;
            this.S = i18 + 1;
            this.J = i18;
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.S;
                this.M = i19;
                int size2 = this.h.size() + i19;
                this.S = size2;
                this.N = size2;
            }
            int i20 = this.S;
            this.K = i20;
            this.L = arrayList2.size() + i20;
            int size3 = arrayList2.size() + this.S;
            this.S = size3 + 1;
            this.O = size3;
        } else {
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.S;
                int i22 = i21 + 1;
                this.S = i22;
                this.J = i21;
                this.M = i22;
                int size4 = this.h.size() + i22;
                this.N = size4;
                this.S = size4 + 1;
                this.O = size4;
            }
        }
        if (this.v > 0) {
            int i23 = this.S;
            this.T = i23;
            this.ttlRow = i23 + 1;
            this.S = i23 + 3;
            this.U = i23 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        e81 e81Var = this.f31473s;
        if (e81Var != null) {
            e81Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f31474w == 0) {
            hg.g.a(this.currentAccount).c(new c81(this, 0));
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31468b.setPadding(0, 0, 0, i13);
        this.f31468b.setClipToPadding(false);
        e81 e81Var = this.f31473s;
        if (e81Var != null) {
            e81Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        e81 e81Var = this.f31473s;
        if (e81Var != null) {
            e81Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.e0(getParentActivity(), 2, new h81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new d81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        i81 i81Var = this.f31467a;
        if (i81Var != null) {
            i81Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i10 = 0; i10 < this.f31468b.getChildCount(); i10++) {
                View childAt = this.f31468b.getChildAt(i10);
                if (childAt instanceof j81) {
                    ((j81) childAt).f34361b.invalidate();
                }
            }
        }
    }
}
