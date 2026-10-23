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
    public fx0 Y;
    public h71 f33848a;
    public g10 f33849b;
    public org.telegram.ui.Components.vz f33850c;
    public org.telegram.ui.Components.b10 d;
    public final ArrayList e;
    public final ArrayList f33851f;
    public ArrayList h;
    public TLRPC.TL_authorization f33852n;
    public boolean f33853r;
    public c71 f33854s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f33855w;
    public int f33856x;
    public int f33857y;

    public SessionsActivity(int i10) {
        super(null);
        this.e = new ArrayList();
        this.f33851f = new ArrayList();
        this.h = new ArrayList();
        this.V = 0;
        this.f33855w = i10;
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
        int i16 = sessionsActivity.f33855w;
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
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                for (int i18 = 0; i18 < 4; i18++) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(sessionsActivity.getParentActivity(), null);
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i18));
                    k6Var.a(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21048g7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k6Var.b(str2, z12);
                    linearLayout.addView(k6Var);
                    k6Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 2, -1));
                    k6Var.setOnClickListener(new cf0(14, sessionsActivity, alertDialog$Builder));
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
                                append.setSpan(new org.telegram.ui.Components.l61(r4.c.h("https://t.me/", publicUsername), (org.telegram.ui.Components.n11) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.f5.h0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new a71(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20609a;
                if (i16 == 0) {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    b2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    b2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new b71(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i20 = i10 - sessionsActivity.M;
                new ig.k0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.e2(sessionsActivity, i20, 28), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.K && i10 < sessionsActivity.L) || ((i10 >= sessionsActivity.G && i10 < sessionsActivity.H) || i10 == sessionsActivity.f33857y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i10 == sessionsActivity.f33857y) {
                    tL_authorization = sessionsActivity.f33852n;
                    z10 = true;
                } else {
                    int i21 = sessionsActivity.K;
                    if (i10 >= i21 && i10 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f33851f.get(i10 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    d71 d71Var = new d71(sessionsActivity);
                    ?? f3Var = new org.telegram.ui.ActionBar.f3(sessionsActivity.getParentActivity(), false);
                    f3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    f3Var.f41822b = tL_authorization;
                    f3Var.f41823c = sessionsActivity;
                    f3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    f3Var.d = imageView;
                    imageView.setOnClickListener(new l61(f3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, w7.z5.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.gms.internal.play_billing.k3.m(20.0f, 2, textView2);
                    com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, w7.z5.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21382y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, w7.z5.t(-1, -2, 1, 21, 4, 21, 21));
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
                    imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.h6.x0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(f3Var.getContext().getDrawable(i12));
                    }
                    t61 t61Var = new t61(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    t61Var.f41614b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i22 = org.telegram.ui.ActionBar.h6.f21157m6;
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, i22, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    t61Var.f41613a.setImageDrawable(mutate);
                    t61Var.f41615c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(t61Var);
                    if (tL_authorization.country.length() != 0) {
                        t61 t61Var2 = new t61(parentActivity, false);
                        t61Var2.f41614b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i22, false), mode));
                        t61Var2.f41613a.setImageDrawable(mutate2);
                        t61Var2.f41615c.setText(LocaleController.getString(R.string.Location));
                        t61Var2.setOnClickListener(new m61(f3Var, tL_authorization));
                        t61Var2.setOnLongClickListener(new n61(f3Var, tL_authorization));
                        t61Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 2, -1));
                        linearLayout2.addView(t61Var2);
                        t61Var.e = true;
                        t61Var = t61Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        t61 t61Var3 = new t61(parentActivity, false);
                        t61Var3.f41614b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i22, false), mode));
                        t61Var3.f41613a.setImageDrawable(mutate3);
                        t61Var3.f41615c.setText(LocaleController.getString(R.string.IpAddress));
                        t61Var3.setOnClickListener(new o61(f3Var, tL_authorization));
                        t61Var3.setOnLongClickListener(new p61(f3Var, tL_authorization));
                        t61Var3.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 2, -1));
                        linearLayout2.addView(t61Var3);
                        z11 = true;
                        t61Var.e = true;
                        t61Var = t61Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        t61 t61Var4 = new t61(parentActivity, z11);
                        t61Var4.f41614b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i22, false), mode));
                        t61Var4.f41613a.setImageDrawable(mutate4);
                        t61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        t61Var4.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 7, -1));
                        t61Var4.setOnClickListener(new q61(f3Var, t61Var4, tL_authorization));
                        t61Var.e = true;
                        t61Var4.f41615c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(t61Var4);
                        t61Var = t61Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        t61 t61Var5 = new t61(parentActivity, true);
                        t61Var5.f41614b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i22, false), mode));
                        t61Var5.f41613a.setImageDrawable(mutate5);
                        t61Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        t61Var5.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false), 7, -1));
                        t61Var5.setOnClickListener(new r61(f3Var, t61Var5, tL_authorization));
                        t61Var.e = true;
                        t61Var5.f41615c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(t61Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21125ka, false);
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, x03, o10, o10));
                        linearLayout2.addView(textView4, w7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new s61(f3Var, d71Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20609a;
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
                org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(sessionsActivity.getParentActivity(), 1);
                a2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                a2Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, str), "", false, false, false);
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
                a2Var.setPadding(dp, 0, dp2, 0);
                frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                a2Var.setOnClickListener(new o8(6, zArr));
                b2Var3.G = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new hg.b2(sessionsActivity, i10, zArr, 16));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(b2Var3);
            TextView textView5 = (TextView) b2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21232q7, false));
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
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new x61(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new x61(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f33855w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new x61(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new x61(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sessionsActivity.getParentActivity(), 3, null);
            b2Var.f20669g0 = false;
            b2Var.show();
            if (sessionsActivity.f33855w == 0) {
                int i11 = sessionsActivity.K;
                if (i10 >= i11 && i10 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f33851f.get(i10 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new tr0(sessionsActivity, b2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new tr0(sessionsActivity, b2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.f33853r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        h71 h71Var = sessionsActivity.f33848a;
        if (h71Var != null) {
            h71Var.l();
        }
        fx0 fx0Var = sessionsActivity.Y;
        if (fx0Var != null) {
            fx0Var.a();
        }
        int i10 = sessionsActivity.V;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.V = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new y61(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.d = b10Var;
        b10Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f33855w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 3));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f33848a = new h71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f33850c = vzVar;
        vzVar.b();
        frameLayout.addView(this.f33850c, w7.z5.e(-1, -1, 17));
        g10 g10Var = new g10(3, context, this);
        this.f33849b = g10Var;
        g10Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33849b);
        this.f33849b.setLayoutManager(new hg.a0(1, false, 18));
        this.f33849b.setVerticalScrollBarEnabled(false);
        this.f33849b.setEmptyView(this.f33850c);
        g10 g10Var2 = this.f33849b;
        g10Var2.W1 = true;
        g10Var2.X1 = 0;
        frameLayout.addView(g10Var2, w7.z5.c(-1.0f, -1));
        this.f33849b.setAdapter(this.f33848a);
        s4.k kVar = new s4.k();
        kVar.n(150L);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25025f;
        kVar.f46003i = bsVar;
        kVar.f45984o = bsVar;
        this.f33849b.setItemAnimator(kVar);
        this.f33849b.setOnItemClickListener(new f11(this, 6));
        if (i10 == 0) {
            c71 c71Var = new c71(this, context);
            this.f33854s = c71Var;
            frameLayout.addView(c71Var, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.t6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20994d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33850c, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21066h6));
        int i10 = org.telegram.ui.ActionBar.h6.f21215p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20956b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33849b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33854s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f33853r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f33855w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f33853r) {
            return;
        }
        if (!z10) {
            this.f33853r = true;
        }
        if (this.f33855w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f42125b;

                {
                    this.f42125b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f42125b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f33851f;
                                            ArrayList arrayList2 = sessionsActivity2.e;
                                            sessionsActivity2.f33853r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f33852n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                fx0 fx0Var = sessionsActivity2.Y;
                                                if (fx0Var != null) {
                                                    fx0Var.a();
                                                }
                                            }
                                            h71 h71Var = sessionsActivity2.f33848a;
                                            if (h71Var != null) {
                                                h71Var.l();
                                            }
                                            fx0 fx0Var2 = sessionsActivity2.Y;
                                            if (fx0Var2 != null) {
                                                fx0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new y61(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f42125b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f33851f;
                                            ArrayList arrayList2 = sessionsActivity22.e;
                                            sessionsActivity22.f33853r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f33852n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                fx0 fx0Var = sessionsActivity22.Y;
                                                if (fx0Var != null) {
                                                    fx0Var.a();
                                                }
                                            }
                                            h71 h71Var = sessionsActivity22.f33848a;
                                            if (h71Var != null) {
                                                h71Var.l();
                                            }
                                            fx0 fx0Var2 = sessionsActivity22.Y;
                                            if (fx0Var2 != null) {
                                                fx0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new y61(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f42125b;

            {
                this.f42125b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f42125b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f33851f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f33853r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f33852n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            fx0 fx0Var = sessionsActivity22.Y;
                                            if (fx0Var != null) {
                                                fx0Var.a();
                                            }
                                        }
                                        h71 h71Var = sessionsActivity22.f33848a;
                                        if (h71Var != null) {
                                            h71Var.l();
                                        }
                                        fx0 fx0Var2 = sessionsActivity22.Y;
                                        if (fx0Var2 != null) {
                                            fx0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new y61(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f42125b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f33851f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f33853r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f33852n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            fx0 fx0Var = sessionsActivity22.Y;
                                            if (fx0Var != null) {
                                                fx0Var.a();
                                            }
                                        }
                                        h71 h71Var = sessionsActivity22.f33848a;
                                        if (h71Var != null) {
                                            h71Var.l();
                                        }
                                        fx0 fx0Var2 = sessionsActivity22.Y;
                                        if (fx0Var2 != null) {
                                            fx0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new y61(sessionsActivity22, z12, 1), 2500L);
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
        this.f33856x = -1;
        this.f33857y = -1;
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
        int i10 = this.f33855w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.S;
            this.Q = i11;
            this.S = i11 + 2;
            this.R = i11 + 1;
        }
        if (this.f33853r) {
            if (i10 == 0) {
                int i12 = this.S;
                this.f33856x = i12;
                this.S = i12 + 2;
                this.f33857y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f33852n != null) {
            int i13 = this.S;
            this.f33856x = i13;
            this.S = i13 + 2;
            this.f33857y = i13 + 1;
        }
        ArrayList arrayList = this.f33851f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i10 != 1 && this.f33852n == null) {
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
        c71 c71Var = this.f33854s;
        if (c71Var != null) {
            c71Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f33855w == 0) {
            ig.f.a(this.currentAccount).c(new a71(this, 0));
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
        this.f33849b.setPadding(0, 0, 0, i13);
        this.f33849b.setClipToPadding(false);
        c71 c71Var = this.f33854s;
        if (c71Var != null) {
            c71Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        c71 c71Var = this.f33854s;
        if (c71Var != null) {
            c71Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                w9.e0(getParentActivity(), 2, new g71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20609a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new b71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        h71 h71Var = this.f33848a;
        if (h71Var != null) {
            h71Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i10 = 0; i10 < this.f33849b.getChildCount(); i10++) {
                View childAt = this.f33849b.getChildAt(i10);
                if (childAt instanceof i71) {
                    ((i71) childAt).f37876b.invalidate();
                }
            }
        }
    }
}
