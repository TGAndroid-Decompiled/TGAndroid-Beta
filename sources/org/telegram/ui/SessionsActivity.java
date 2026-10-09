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
    public by0 Y;
    public u81 f34473a;
    public o60 f34474b;
    public org.telegram.ui.Components.c00 f34475c;
    public org.telegram.ui.Components.j10 d;
    public final ArrayList f34476e;
    public final ArrayList f34477f;
    public ArrayList h;
    public TLRPC.TL_authorization f34478n;
    public boolean f34479r;
    public q81 f34480s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f34481w;
    public int f34482x;
    public int f34483y;

    public SessionsActivity(int i10) {
        super(null);
        this.f34476e = new ArrayList();
        this.f34477f = new ArrayList();
        this.h = new ArrayList();
        this.V = 0;
        this.f34481w = i10;
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
        ArrayList arrayList2 = sessionsActivity.f34476e;
        int i16 = sessionsActivity.f34481w;
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
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(sessionsActivity.getParentActivity(), null);
                    float f10 = f7;
                    l6Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f10), 0);
                    l6Var.setTag(Integer.valueOf(i18));
                    l6Var.a(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20854g7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l6Var.b(str2, z12);
                    linearLayout.addView(l6Var);
                    l6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 2, -1));
                    l6Var.setOnClickListener(new vy0(4, sessionsActivity, alertDialog$Builder));
                    i18++;
                    f7 = f10;
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
                                append.setSpan(new org.telegram.ui.Components.t61(sc.v.i("https://t.me/", publicUsername), (org.telegram.ui.Components.t11) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.g5.h0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new n81(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20374a;
                if (i16 == 0) {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    b2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    b2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    b2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new o81(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i20 = i10 - sessionsActivity.M;
                new hg.l0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.nd(sessionsActivity, i20, 27), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.K && i10 < sessionsActivity.L) || ((i10 >= sessionsActivity.G && i10 < sessionsActivity.H) || i10 == sessionsActivity.f34483y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i10 == sessionsActivity.f34483y) {
                    tL_authorization = sessionsActivity.f34478n;
                    z10 = true;
                } else {
                    int i21 = sessionsActivity.K;
                    if (i10 >= i21 && i10 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f34477f.get(i10 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    r81 r81Var = new r81(sessionsActivity);
                    ?? f3Var = new org.telegram.ui.ActionBar.f3(sessionsActivity.getParentActivity(), false);
                    f3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    f3Var.f38231b = tL_authorization;
                    f3Var.f38232c = sessionsActivity;
                    f3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    f3Var.d = imageView;
                    imageView.setOnClickListener(new y71(f3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, w7.x5.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.gms.internal.vision.e2.l(20.0f, 2, textView2);
                    com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, w7.x5.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21181y6, false));
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
                        i13 = org.telegram.ui.ActionBar.i6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i12 = R.raw.edge_30;
                        i13 = org.telegram.ui.ActionBar.i6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i12 = R.raw.chrome_30;
                        i13 = org.telegram.ui.ActionBar.i6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i12 = R.raw.firefox_30;
                        i13 = org.telegram.ui.ActionBar.i6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i12 = R.raw.ubuntu_30;
                            i13 = org.telegram.ui.ActionBar.i6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i12 = R.raw.linux_30;
                            i13 = org.telegram.ui.ActionBar.i6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = R.raw.ipad_30;
                            } else {
                                i14 = R.raw.iphone_30;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.i6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.i6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i12 = R.raw.mac_30;
                            i13 = org.telegram.ui.ActionBar.i6.S7;
                        } else if (lowerCase.contains("android")) {
                            i12 = R.raw.android_30;
                            i13 = org.telegram.ui.ActionBar.i6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.i6.S7;
                        } else {
                            i12 = R.raw.chrome_30;
                            i13 = org.telegram.ui.ActionBar.i6.U7;
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
                        i13 = org.telegram.ui.ActionBar.i6.U7;
                        z13 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.i6.x0(null, i13, false)));
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.i6.x0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(f3Var.getContext().getDrawable(i12));
                    }
                    g81 g81Var = new g81(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    g81Var.f37939b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i22 = org.telegram.ui.ActionBar.i6.f20962m6;
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, i22, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g81Var.f37938a.setImageDrawable(mutate);
                    g81Var.f37940c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(g81Var);
                    if (tL_authorization.country.length() != 0) {
                        g81 g81Var2 = new g81(parentActivity, false);
                        g81Var2.f37939b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i22, false), mode));
                        g81Var2.f37938a.setImageDrawable(mutate2);
                        g81Var2.f37940c.setText(LocaleController.getString(R.string.Location));
                        g81Var2.setOnClickListener(new z71(f3Var, tL_authorization));
                        g81Var2.setOnLongClickListener(new a81(f3Var, tL_authorization));
                        g81Var2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 2, -1));
                        linearLayout2.addView(g81Var2);
                        g81Var.f37941e = true;
                        g81Var = g81Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        g81 g81Var3 = new g81(parentActivity, false);
                        g81Var3.f37939b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i22, false), mode));
                        g81Var3.f37938a.setImageDrawable(mutate3);
                        g81Var3.f37940c.setText(LocaleController.getString(R.string.IpAddress));
                        g81Var3.setOnClickListener(new b81(f3Var, tL_authorization));
                        g81Var3.setOnLongClickListener(new c81(f3Var, tL_authorization));
                        g81Var3.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 2, -1));
                        linearLayout2.addView(g81Var3);
                        z11 = true;
                        g81Var.f37941e = true;
                        g81Var = g81Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        g81 g81Var4 = new g81(parentActivity, z11);
                        g81Var4.f37939b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i22, false), mode));
                        g81Var4.f37938a.setImageDrawable(mutate4);
                        g81Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        g81Var4.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 7, -1));
                        g81Var4.setOnClickListener(new d81(f3Var, g81Var4, tL_authorization));
                        g81Var.f37941e = true;
                        g81Var4.f37940c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(g81Var4);
                        g81Var = g81Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        g81 g81Var5 = new g81(parentActivity, true);
                        g81Var5.f37939b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i22, false), mode));
                        g81Var5.f37938a.setImageDrawable(mutate5);
                        g81Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        g81Var5.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20888i6, false), 7, -1));
                        g81Var5.setOnClickListener(new e81(f3Var, g81Var5, tL_authorization));
                        g81Var.f37941e = true;
                        g81Var5.f37940c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(g81Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20929ka, false);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.i6.j0(dp3, dp3, dp3, dp3, x03, k10, k10));
                        linearLayout2.addView(textView4, w7.x5.a(48.0f, 16.0f, 15.0f, 16.0f, 16.0f, -1, 0));
                        textView4.setOnClickListener(new f81(f3Var, r81Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20374a;
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
                a2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
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
                frameLayout.addView(a2Var, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                a2Var.setOnClickListener(new l8(6, zArr));
                b2Var3.G = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new gg.c2(sessionsActivity, i10, zArr, 16));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(b2Var3);
            TextView textView5 = (TextView) b2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
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
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new k81(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new k81(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f34481w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new k81(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new k81(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.f34476e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sessionsActivity.getParentActivity(), 3, null);
            b2Var.f20420g0 = false;
            b2Var.show();
            if (sessionsActivity.f34481w == 0) {
                int i11 = sessionsActivity.K;
                if (i10 >= i11 && i10 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f34477f.get(i10 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new ns0(sessionsActivity, b2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new ns0(sessionsActivity, b2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.f34476e;
        sessionsActivity.f34479r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        u81 u81Var = sessionsActivity.f34473a;
        if (u81Var != null) {
            u81Var.l();
        }
        by0 by0Var = sessionsActivity.Y;
        if (by0Var != null) {
            by0Var.a();
        }
        int i10 = sessionsActivity.V;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.V = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new l81(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
        this.d = j10Var;
        j10Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f34481w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 0));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f34473a = new u81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context, null);
        this.f34475c = c00Var;
        c00Var.b();
        frameLayout.addView(this.f34475c, w7.x5.e(-1, -1, 17));
        o60 o60Var = new o60(this, context);
        this.f34474b = o60Var;
        o60Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34474b);
        this.f34474b.setLayoutManager(new gg.a0(1, false, 18));
        this.f34474b.setVerticalScrollBarEnabled(false);
        this.f34474b.setEmptyView(this.f34475c);
        o60 o60Var2 = this.f34474b;
        o60Var2.W1 = true;
        o60Var2.X1 = 0;
        frameLayout.addView(o60Var2, w7.x5.d(-1.0f, -1));
        this.f34474b.setAdapter(this.f34473a);
        s4.j jVar = new s4.j();
        jVar.n(150L);
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27118f;
        jVar.f47754i = hsVar;
        jVar.f47718o = hsVar;
        this.f34474b.setItemAnimator(jVar);
        this.f34474b.setOnItemClickListener(new z21(this, 6));
        if (i10 == 0) {
            q81 q81Var = new q81(this, context);
            this.f34480s = q81Var;
            frameLayout.addView(q81Var, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.v6.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34475c, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20869h6));
        int i10 = org.telegram.ui.ActionBar.i6.f21018p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 262148, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 262148, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34474b, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.i6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f34480s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.f34476e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f34479r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f34481w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f34479r) {
            return;
        }
        if (!z10) {
            this.f34479r = true;
        }
        if (this.f34481w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f38540b;

                {
                    this.f38540b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f38540b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f34477f;
                                            ArrayList arrayList2 = sessionsActivity2.f34476e;
                                            sessionsActivity2.f34479r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f34478n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                by0 by0Var = sessionsActivity2.Y;
                                                if (by0Var != null) {
                                                    by0Var.a();
                                                }
                                            }
                                            u81 u81Var = sessionsActivity2.f34473a;
                                            if (u81Var != null) {
                                                u81Var.l();
                                            }
                                            by0 by0Var2 = sessionsActivity2.Y;
                                            if (by0Var2 != null) {
                                                by0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new l81(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f38540b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f34477f;
                                            ArrayList arrayList2 = sessionsActivity22.f34476e;
                                            sessionsActivity22.f34479r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f34478n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                by0 by0Var = sessionsActivity22.Y;
                                                if (by0Var != null) {
                                                    by0Var.a();
                                                }
                                            }
                                            u81 u81Var = sessionsActivity22.f34473a;
                                            if (u81Var != null) {
                                                u81Var.l();
                                            }
                                            by0 by0Var2 = sessionsActivity22.Y;
                                            if (by0Var2 != null) {
                                                by0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new l81(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f38540b;

            {
                this.f38540b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f38540b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f34477f;
                                        ArrayList arrayList2 = sessionsActivity22.f34476e;
                                        sessionsActivity22.f34479r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f34478n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            by0 by0Var = sessionsActivity22.Y;
                                            if (by0Var != null) {
                                                by0Var.a();
                                            }
                                        }
                                        u81 u81Var = sessionsActivity22.f34473a;
                                        if (u81Var != null) {
                                            u81Var.l();
                                        }
                                        by0 by0Var2 = sessionsActivity22.Y;
                                        if (by0Var2 != null) {
                                            by0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new l81(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f38540b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f34477f;
                                        ArrayList arrayList2 = sessionsActivity22.f34476e;
                                        sessionsActivity22.f34479r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f34478n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            by0 by0Var = sessionsActivity22.Y;
                                            if (by0Var != null) {
                                                by0Var.a();
                                            }
                                        }
                                        u81 u81Var = sessionsActivity22.f34473a;
                                        if (u81Var != null) {
                                            u81Var.l();
                                        }
                                        by0 by0Var2 = sessionsActivity22.Y;
                                        if (by0Var2 != null) {
                                            by0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new l81(sessionsActivity22, z12, 1), 2500L);
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
        this.f34482x = -1;
        this.f34483y = -1;
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
        int i10 = this.f34481w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.S;
            this.Q = i11;
            this.S = i11 + 2;
            this.R = i11 + 1;
        }
        if (this.f34479r) {
            if (i10 == 0) {
                int i12 = this.S;
                this.f34482x = i12;
                this.S = i12 + 2;
                this.f34483y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f34478n != null) {
            int i13 = this.S;
            this.f34482x = i13;
            this.S = i13 + 2;
            this.f34483y = i13 + 1;
        }
        ArrayList arrayList = this.f34477f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f34476e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i10 != 1 && this.f34478n == null) {
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
        q81 q81Var = this.f34480s;
        if (q81Var != null) {
            q81Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f34481w == 0) {
            hg.g.a(this.currentAccount).c(new n81(this, 0));
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
        this.f34474b.setPadding(0, 0, 0, i13);
        this.f34474b.setClipToPadding(false);
        q81 q81Var = this.f34480s;
        if (q81Var != null) {
            q81Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        q81 q81Var = this.f34480s;
        if (q81Var != null) {
            q81Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                v9.e0(getParentActivity(), false, 2, new t81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new o81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        u81 u81Var = this.f34473a;
        if (u81Var != null) {
            u81Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i10 = 0; i10 < this.f34474b.getChildCount(); i10++) {
                View childAt = this.f34474b.getChildAt(i10);
                if (childAt instanceof v81) {
                    ((v81) childAt).f42709b.invalidate();
                }
            }
        }
    }
}
