package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
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
    public boolean V;
    public boolean W;
    public ix0 X;
    public k71 f34147a;
    public k10 f34148b;
    public org.telegram.ui.Components.tz f34149c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f34150f;
    public TLRPC.TL_authorization h;
    public boolean f34151n;
    public f71 f34152r;
    public int f34153s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int v;
    public int f34154w;
    public int f34155x;
    public int f34156y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f34150f = new ArrayList();
        this.U = 0;
        this.v = i10;
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
        boolean z11;
        ArrayList arrayList;
        String string;
        int i13;
        boolean z12;
        ArrayList arrayList2 = sessionsActivity.d;
        int i14 = sessionsActivity.v;
        boolean z13 = true;
        if (i10 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i15 = sessionsActivity.f34153s;
                if (i15 <= 7) {
                    i13 = 0;
                } else if (i15 <= 93) {
                    i13 = 1;
                } else if (i15 <= 183) {
                    i13 = 2;
                } else {
                    i13 = 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                for (int i16 = 0; i16 < 4; i16++) {
                    org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(sessionsActivity.getParentActivity(), null);
                    l6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    l6Var.setTag(Integer.valueOf(i16));
                    l6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21238g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    String str2 = strArr[i16];
                    if (i13 == i16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l6Var.b(str2, z12);
                    linearLayout.addView(l6Var);
                    l6Var.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false), 2, -1));
                    l6Var.setOnClickListener(new zd0(15, sessionsActivity, alertDialog$Builder));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var);
            }
        } else if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.f34150f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.f34150f;
                    int size = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList4.get(i17);
                        i17++;
                        TLRPC.User user = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (user != null) {
                            String publicUsername = UserObject.getPublicUsername(user);
                            if (!TextUtils.isEmpty(publicUsername)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                                append.setSpan(new org.telegram.ui.Components.p61(si.o0.h("https://t.me/", publicUsername), (org.telegram.ui.Components.p11) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.d5.h0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new d71(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                if (i14 == 0) {
                    c2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    c2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    c2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    c2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new e71(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                }
            }
        } else if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.f34150f) != null && !arrayList.isEmpty()) {
                int i18 = i10 - sessionsActivity.L;
                new ig.j0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f34150f.get(i18), new org.telegram.ui.Components.c2(sessionsActivity, i18, 29), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.J && i10 < sessionsActivity.K) || ((i10 >= sessionsActivity.F && i10 < sessionsActivity.G) || i10 == sessionsActivity.f34155x)) && sessionsActivity.getParentActivity() != null) {
            if (i14 == 0) {
                if (i10 == sessionsActivity.f34155x) {
                    tL_authorization = sessionsActivity.h;
                    z10 = true;
                } else {
                    int i19 = sessionsActivity.J;
                    if (i10 >= i19 && i10 < sessionsActivity.K) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i19);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    h71 h71Var = new h71(sessionsActivity);
                    ?? h3Var = new org.telegram.ui.ActionBar.h3(sessionsActivity.getParentActivity(), false);
                    h3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    h3Var.f43482b = tL_authorization;
                    h3Var.f43483c = sessionsActivity;
                    h3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    h3Var.d = imageView;
                    imageView.setOnClickListener(new o61(h3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, w7.z5.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.gms.internal.play_billing.k3.m(20.0f, 2, textView2);
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, w7.z5.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21572y6, null);
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
                        i11 = R.raw.safari_30;
                        i12 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i11 = R.raw.edge_30;
                        i12 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i11 = R.raw.chrome_30;
                        i12 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i11 = R.raw.firefox_30;
                        i12 = org.telegram.ui.ActionBar.k6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i11 = R.raw.ubuntu_30;
                            i12 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i11 = R.raw.linux_30;
                            i12 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i11 = R.raw.ipad_30;
                            } else {
                                i11 = R.raw.iphone_30;
                            }
                            i12 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.k6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i11 = R.raw.mac_30;
                            i12 = org.telegram.ui.ActionBar.k6.S7;
                        } else if (lowerCase.contains("android")) {
                            i11 = R.raw.android_30;
                            i12 = org.telegram.ui.ActionBar.k6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.k6.S7;
                        } else {
                            i11 = R.raw.chrome_30;
                            i12 = org.telegram.ui.ActionBar.k6.U7;
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
                        i12 = org.telegram.ui.ActionBar.k6.U7;
                        z13 = false;
                    }
                    ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                    imageView.setBackground(K);
                    org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, null);
                    if (z13) {
                        imageView.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.k6.x0(null, i12, false)});
                    } else {
                        imageView.setImageDrawable(h3Var.getContext().getDrawable(i11));
                    }
                    w61 w61Var = new w61(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    w61Var.f42927b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i20 = org.telegram.ui.ActionBar.k6.f21347m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    ImageView imageView2 = w61Var.f42926a;
                    org.telegram.ui.ActionBar.r6.z(imageView2, mutate, i20, null, mode);
                    imageView2.setImageDrawable(mutate);
                    w61Var.f42928c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(w61Var);
                    if (tL_authorization.country.length() != 0) {
                        w61 w61Var2 = new w61(parentActivity, false);
                        w61Var2.f42927b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        ImageView imageView3 = w61Var2.f42926a;
                        org.telegram.ui.ActionBar.r6.z(imageView3, mutate2, i20, null, mode);
                        imageView3.setImageDrawable(mutate2);
                        w61Var2.f42928c.setText(LocaleController.getString(R.string.Location));
                        w61Var2.setOnClickListener(new p61(h3Var, tL_authorization));
                        w61Var2.setOnLongClickListener(new q61(h3Var, tL_authorization));
                        int i21 = org.telegram.ui.ActionBar.k6.f21273i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i21, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i21);
                        w61Var2.setBackground(g02);
                        org.telegram.ui.ActionBar.r6.k(w61Var2, g02, null, O2, null);
                        linearLayout2.addView(w61Var2);
                        w61Var.e = true;
                        w61Var = w61Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        w61 w61Var3 = new w61(parentActivity, false);
                        w61Var3.f42927b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        ImageView imageView4 = w61Var3.f42926a;
                        org.telegram.ui.ActionBar.r6.z(imageView4, mutate3, i20, null, mode);
                        imageView4.setImageDrawable(mutate3);
                        w61Var3.f42928c.setText(LocaleController.getString(R.string.IpAddress));
                        w61Var3.setOnClickListener(new r61(h3Var, tL_authorization));
                        w61Var3.setOnLongClickListener(new s61(h3Var, tL_authorization));
                        int i22 = org.telegram.ui.ActionBar.k6.f21273i6;
                        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i22, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i22);
                        w61Var3.setBackground(g03);
                        org.telegram.ui.ActionBar.r6.k(w61Var3, g03, null, O3, null);
                        linearLayout2.addView(w61Var3);
                        z11 = true;
                        w61Var.e = true;
                        w61Var = w61Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        w61 w61Var4 = new w61(parentActivity, z11);
                        w61Var4.f42927b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        ImageView imageView5 = w61Var4.f42926a;
                        org.telegram.ui.ActionBar.r6.z(imageView5, mutate4, i20, null, mode);
                        imageView5.setImageDrawable(mutate4);
                        w61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        int i24 = org.telegram.ui.ActionBar.k6.f21273i6;
                        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i24, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i24);
                        w61Var4.setBackground(g04);
                        org.telegram.ui.ActionBar.r6.k(w61Var4, g04, null, O4, null);
                        w61Var4.setOnClickListener(new t61(h3Var, w61Var4, tL_authorization));
                        w61Var.e = true;
                        w61Var4.f42928c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(w61Var4);
                        w61Var = w61Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        w61 w61Var5 = new w61(parentActivity, true);
                        w61Var5.f42927b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        ImageView imageView6 = w61Var5.f42926a;
                        org.telegram.ui.ActionBar.r6.z(imageView6, mutate5, i20, null, mode);
                        imageView6.setImageDrawable(mutate5);
                        w61Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        int i25 = org.telegram.ui.ActionBar.k6.f21273i6;
                        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i25, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i25);
                        w61Var5.setBackground(g05);
                        org.telegram.ui.ActionBar.r6.k(w61Var5, g05, null, O5, null);
                        w61Var5.setOnClickListener(new u61(h3Var, w61Var5, tL_authorization));
                        w61Var.e = true;
                        w61Var5.f42928c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(w61Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.Sh, null);
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int i26 = org.telegram.ui.ActionBar.k6.f21315ka;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i26, false);
                        int i27 = org.telegram.ui.ActionBar.k6.f21184d6;
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i27, false), 120);
                        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, x02, o10, o10);
                        org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(i26);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i27, 120);
                        textView4.setBackground(j02);
                        org.telegram.ui.ActionBar.r6.k(textView4, j02, O6, h, null);
                        linearLayout2.addView(textView4, w7.z5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new v61(h3Var, h71Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    h3Var.setCustomView(scrollView);
                    h3Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20679a;
            if (i14 == 0) {
                c2Var3.T = LocaleController.getString(R.string.TerminateSessionText);
                c2Var3.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.J);
                c2Var3.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                c2Var3.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
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
                frameLayout.addView(z1Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new o8(6, zArr));
                c2Var3.G = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new hg.b2(sessionsActivity, i10, zArr, 16));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(c2Var3);
            TextView textView5 = (TextView) c2Var3.d(-1);
            if (textView5 != null) {
                org.telegram.ui.ActionBar.r6.W(textView5, org.telegram.ui.ActionBar.k6.f21422q7, null);
            }
        }
    }

    public static void V(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f34150f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.f34150f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new a71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new a71(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.v == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new a71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new a71(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(sessionsActivity.getParentActivity(), 3, null);
            c2Var.f20763i0 = false;
            c2Var.show();
            if (sessionsActivity.v == 0) {
                int i11 = sessionsActivity.J;
                if (i10 >= i11 && i10 < sessionsActivity.K) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new vr0(sessionsActivity, c2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new vr0(sessionsActivity, c2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f34151n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        k71 k71Var = sessionsActivity.f34147a;
        if (k71Var != null) {
            k71Var.l();
        }
        ix0 ix0Var = sessionsActivity.X;
        if (ix0Var != null) {
            ix0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new b71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21405p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        new org.telegram.ui.Components.z00(context, null).setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 3));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f34147a = new k71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f34149c = tzVar;
        tzVar.b();
        frameLayout.addView(this.f34149c, w7.z5.e(-1, -1, 17));
        k10 k10Var = new k10(3, context, this);
        this.f34148b = k10Var;
        k10Var.t1();
        this.actionBar.setAdaptiveBackground(this.f34148b);
        this.f34148b.setLayoutManager(new hg.a0(1, false, 18));
        this.f34148b.setVerticalScrollBarEnabled(false);
        this.f34148b.setEmptyView(this.f34149c);
        k10 k10Var2 = this.f34148b;
        k10Var2.W1 = true;
        k10Var2.X1 = 0;
        frameLayout.addView(k10Var2, w7.z5.c(-1.0f, -1));
        this.f34148b.setAdapter(this.f34147a);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.zr.h);
        kVar.C = false;
        this.f34148b.setItemAnimator(kVar);
        this.f34148b.setOnItemClickListener(new i11(this, 6));
        if (i10 == 0) {
            f71 f71Var = new f71(this, context);
            this.f34152r = f71Var;
            frameLayout.addView(f71Var, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34148b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.v6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34149c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        int i10 = org.telegram.ui.ActionBar.k6.f21405p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34148b, 262148, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34148b, 262148, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34148b, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f34152r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.d;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f34151n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.v == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f34151n) {
            return;
        }
        if (!z10) {
            this.f34151n = true;
        }
        if (this.v == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f43772b;

                {
                    this.f43772b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f43772b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f34151n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.f34153s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                ix0 ix0Var = sessionsActivity2.X;
                                                if (ix0Var != null) {
                                                    ix0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity2.f34147a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            ix0 ix0Var2 = sessionsActivity2.X;
                                            if (ix0Var2 != null) {
                                                ix0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.U = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new b71(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f43772b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f34151n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.f34153s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                ix0 ix0Var = sessionsActivity22.X;
                                                if (ix0Var != null) {
                                                    ix0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity22.f34147a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            ix0 ix0Var2 = sessionsActivity22.X;
                                            if (ix0Var2 != null) {
                                                ix0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.U = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new b71(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f43772b;

            {
                this.f43772b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f43772b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34151n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f34153s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ix0 ix0Var = sessionsActivity22.X;
                                            if (ix0Var != null) {
                                                ix0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.f34147a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        ix0 ix0Var2 = sessionsActivity22.X;
                                        if (ix0Var2 != null) {
                                            ix0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new b71(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f43772b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f34151n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f34153s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ix0 ix0Var = sessionsActivity22.X;
                                            if (ix0Var != null) {
                                                ix0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.f34147a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        ix0 ix0Var2 = sessionsActivity22.X;
                                        if (ix0Var2 != null) {
                                            ix0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new b71(sessionsActivity22, z12, 1), 2500L);
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
        this.V = true;
    }

    public final void m0() {
        this.R = 0;
        this.f34154w = -1;
        this.f34155x = -1;
        this.terminateAllSessionsRow = -1;
        this.f34156y = -1;
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
        this.S = -1;
        this.ttlRow = -1;
        this.T = -1;
        int i10 = this.v;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.R;
            this.P = i11;
            this.R = i11 + 2;
            this.Q = i11 + 1;
        }
        if (this.f34151n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.f34154w = i12;
                this.R = i12 + 2;
                this.f34155x = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.f34154w = i13;
            this.R = i13 + 2;
            this.f34155x = i13 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.f34156y = -1;
            if (i10 != 1 && this.h == null) {
                this.O = -1;
            } else {
                int i14 = this.R;
                this.R = i14 + 1;
                this.O = i14;
            }
        } else {
            int i15 = this.R;
            this.terminateAllSessionsRow = i15;
            this.R = i15 + 2;
            this.f34156y = i15 + 1;
            this.O = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.R;
            int i17 = i16 + 1;
            this.R = i17;
            this.E = i16;
            this.F = i17;
            int size = arrayList.size() + i17;
            this.G = size;
            this.R = size + 1;
            this.H = size;
        }
        if (!arrayList2.isEmpty()) {
            int i18 = this.R;
            this.R = i18 + 1;
            this.I = i18;
            ArrayList arrayList3 = this.f34150f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.R;
                this.L = i19;
                int size2 = this.f34150f.size() + i19;
                this.R = size2;
                this.M = size2;
            }
            int i20 = this.R;
            this.J = i20;
            this.K = arrayList2.size() + i20;
            int size3 = arrayList2.size() + this.R;
            this.R = size3 + 1;
            this.N = size3;
        } else {
            ArrayList arrayList4 = this.f34150f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.R;
                int i22 = i21 + 1;
                this.R = i22;
                this.I = i21;
                this.L = i22;
                int size4 = this.f34150f.size() + i22;
                this.M = size4;
                this.R = size4 + 1;
                this.N = size4;
            }
        }
        if (this.f34153s > 0) {
            int i23 = this.R;
            this.S = i23;
            this.ttlRow = i23 + 1;
            this.R = i23 + 3;
            this.T = i23 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        f71 f71Var = this.f34152r;
        if (f71Var != null) {
            f71Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.v == 0) {
            ig.f.a(this.currentAccount).c(new d71(this, 0));
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
        this.f34148b.setPadding(0, 0, 0, i13);
        this.f34148b.setClipToPadding(false);
        f71 f71Var = this.f34152r;
        if (f71Var != null) {
            f71Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        f71 f71Var = this.f34152r;
        if (f71Var != null) {
            f71Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                w9.e0(getParentActivity(), 2, new j71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new e71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        k71 k71Var = this.f34147a;
        if (k71Var != null) {
            k71Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.W = true;
            for (int i10 = 0; i10 < this.f34148b.getChildCount(); i10++) {
                View childAt = this.f34148b.getChildAt(i10);
                if (childAt instanceof l71) {
                    ((l71) childAt).f39131b.invalidate();
                }
            }
        }
    }
}
