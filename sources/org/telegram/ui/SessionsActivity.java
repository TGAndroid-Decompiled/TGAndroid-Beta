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
public class SessionsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int S;
    public boolean T;
    public boolean U;
    public ox0 V;
    public h81 f34817a;
    public c81 f34818b;
    public org.telegram.ui.Components.oz f34819c;
    public org.telegram.ui.Components.u00 d;
    public final ArrayList f34820e;
    public final ArrayList f34821f;
    public ArrayList h;
    public TLRPC.TL_authorization f34822n;
    public boolean f34823r;
    public d81 f34824s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f34825w;
    public int f34826x;
    public int f34827y;

    public SessionsActivity(int i10) {
        super(null);
        this.f34820e = new ArrayList();
        this.f34821f = new ArrayList();
        this.h = new ArrayList();
        this.S = 0;
        this.f34825w = i10;
    }

    public static void U(SessionsActivity sessionsActivity, int i10) {
        String str;
        int dp;
        int dp2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z4;
        String formatDateTime;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        ArrayList arrayList;
        String string;
        int i15;
        boolean z11;
        ArrayList arrayList2 = sessionsActivity.f34820e;
        int i16 = sessionsActivity.f34825w;
        boolean z12 = true;
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
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                for (int i18 = 0; i18 < 4; i18++) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(sessionsActivity.getParentActivity(), null);
                    k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    k6Var.setTag(Integer.valueOf(i18));
                    k6Var.a(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21717g7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var.b(str2, z11);
                    linearLayout.addView(k6Var);
                    k6Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                    k6Var.setOnClickListener(new hb0(19, sessionsActivity, alertDialog$Builder));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(d2Var);
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
                                append.setSpan(new org.telegram.ui.Components.l51(yh.k("https://t.me/", publicUsername), (org.telegram.ui.Components.s01) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.z4.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new a81(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                if (i16 == 0) {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureSessions);
                    d2Var2.O = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureWebSessions);
                    d2Var2.O = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new b81(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.J && i10 < sessionsActivity.K) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i20 = i10 - sessionsActivity.J;
                new vf.e0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.im(sessionsActivity, i20, 25), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.H && i10 < sessionsActivity.I) || ((i10 >= sessionsActivity.D && i10 < sessionsActivity.E) || i10 == sessionsActivity.f34827y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i10 == sessionsActivity.f34827y) {
                    tL_authorization = sessionsActivity.f34822n;
                    z4 = true;
                } else {
                    int i21 = sessionsActivity.H;
                    if (i10 >= i21 && i10 < sessionsActivity.I) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f34821f.get(i10 - sessionsActivity.D);
                    }
                    z4 = false;
                }
                if (tL_authorization != null) {
                    e81 e81Var = new e81(sessionsActivity);
                    ?? h3Var = new org.telegram.ui.ActionBar.h3(sessionsActivity.getParentActivity(), false);
                    h3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    h3Var.f41750b = tL_authorization;
                    h3Var.f41751c = sessionsActivity;
                    h3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    h3Var.d = imageView;
                    imageView.setOnClickListener(new l71(h3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, k7.c6.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    yh.p(20.0f, 2, textView2);
                    yh.t(org.telegram.ui.ActionBar.k6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, k7.c6.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, k7.c6.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        formatDateTime = LocaleController.getString(R.string.Online);
                    } else {
                        formatDateTime = LocaleController.formatDateTime(tL_authorization.date_active, true);
                    }
                    textView3.setText(formatDateTime);
                    StringBuilder sb = new StringBuilder();
                    if (tL_authorization.device_model.length() != 0) {
                        sb.append(tL_authorization.device_model);
                    }
                    if (sb.length() == 0) {
                        if (tL_authorization.platform.length() != 0) {
                            sb.append(tL_authorization.platform);
                        }
                        if (tL_authorization.system_version.length() != 0) {
                            if (tL_authorization.platform.length() != 0) {
                                sb.append(" ");
                            }
                            sb.append(tL_authorization.system_version);
                        }
                    }
                    textView2.setText(sb);
                    String lowerCase = tL_authorization.platform.toLowerCase();
                    if (lowerCase.isEmpty()) {
                        lowerCase = tL_authorization.system_version.toLowerCase();
                    }
                    String lowerCase2 = tL_authorization.device_model.toLowerCase();
                    if (lowerCase2.contains("safari")) {
                        i12 = R.raw.safari_30;
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i12 = R.raw.edge_30;
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i12 = R.raw.chrome_30;
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i12 = R.raw.firefox_30;
                        i13 = org.telegram.ui.ActionBar.k6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i12 = R.raw.ubuntu_30;
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i12 = R.raw.linux_30;
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = R.raw.ipad_30;
                            } else {
                                i14 = R.raw.iphone_30;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.k6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i12 = R.raw.mac_30;
                            i13 = org.telegram.ui.ActionBar.k6.S7;
                        } else if (lowerCase.contains("android")) {
                            i12 = R.raw.android_30;
                            i13 = org.telegram.ui.ActionBar.k6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.k6.S7;
                        } else {
                            i12 = R.raw.chrome_30;
                            i13 = org.telegram.ui.ActionBar.k6.U7;
                        }
                        z12 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i11 = R.drawable.device_web_opera;
                        } else if (lowerCase2.contains("firefox")) {
                            i11 = R.drawable.device_web_firefox;
                        } else {
                            i11 = R.drawable.device_web_other;
                        }
                        i12 = i11;
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                        z12 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.k6.w0(null, i13, false)));
                    if (z12) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.k6.w0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(h3Var.getContext().getDrawable(i12));
                    }
                    t71 t71Var = new t71(parentActivity, false);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_authorization.app_name);
                    sb2.append(" ");
                    sb2.append(tL_authorization.app_version);
                    t71Var.f41455b.setText(sb2);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i22 = org.telegram.ui.ActionBar.k6.f21823m6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, i22, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    t71Var.f41454a.setImageDrawable(mutate);
                    t71Var.f41456c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(t71Var);
                    if (tL_authorization.country.length() != 0) {
                        t71 t71Var2 = new t71(parentActivity, false);
                        t71Var2.f41455b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i22, false), mode));
                        t71Var2.f41454a.setImageDrawable(mutate2);
                        t71Var2.f41456c.setText(LocaleController.getString(R.string.Location));
                        t71Var2.setOnClickListener(new m71(h3Var, tL_authorization));
                        t71Var2.setOnLongClickListener(new n71(h3Var, tL_authorization));
                        t71Var2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                        linearLayout2.addView(t71Var2);
                        t71Var.f41457e = true;
                        t71Var = t71Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        t71 t71Var3 = new t71(parentActivity, false);
                        t71Var3.f41455b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i22, false), mode));
                        t71Var3.f41454a.setImageDrawable(mutate3);
                        t71Var3.f41456c.setText(LocaleController.getString(R.string.IpAddress));
                        t71Var3.setOnClickListener(new o71(h3Var, tL_authorization));
                        t71Var3.setOnLongClickListener(new p71(h3Var, tL_authorization));
                        t71Var3.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 2, -1));
                        linearLayout2.addView(t71Var3);
                        z10 = true;
                        t71Var.f41457e = true;
                        t71Var = t71Var3;
                    } else {
                        z10 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        t71 t71Var4 = new t71(parentActivity, z10);
                        t71Var4.f41455b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i22, false), mode));
                        t71Var4.f41454a.setImageDrawable(mutate4);
                        t71Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        t71Var4.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 7, -1));
                        t71Var4.setOnClickListener(new q71(h3Var, t71Var4, tL_authorization));
                        t71Var.f41457e = true;
                        t71Var4.f41456c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(t71Var4);
                        t71Var = t71Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        t71 t71Var5 = new t71(parentActivity, true);
                        t71Var5.f41455b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i22, false), mode));
                        t71Var5.f41454a.setImageDrawable(mutate5);
                        t71Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        t71Var5.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false), 7, -1));
                        t71Var5.setOnClickListener(new r71(h3Var, t71Var5, tL_authorization));
                        t71Var.f41457e = true;
                        t71Var5.f41456c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(t71Var5);
                    }
                    if (!z4) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21791ka, false);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, w03, k10, k10));
                        linearLayout2.addView(textView4, k7.c6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new s71(h3Var, e81Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
            if (i16 == 0) {
                d2Var3.Q = LocaleController.getString(R.string.TerminateSessionText);
                d2Var3.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.H);
                d2Var3.Q = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                d2Var3.O = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
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
                frameLayout.addView(z1Var, k7.c6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new o8(6, zArr));
                d2Var3.D = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new e3.d(sessionsActivity, i10, zArr, 13));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(d2Var3);
            TextView textView5 = (TextView) d2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new x71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new x71(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f34825w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new x71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new x71(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.f34820e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(sessionsActivity.getParentActivity(), 3, null);
            d2Var.f21243d0 = false;
            d2Var.show();
            if (sessionsActivity.f34825w == 0) {
                int i11 = sessionsActivity.H;
                if (i10 >= i11 && i10 < sessionsActivity.I) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f34821f.get(i10 - sessionsActivity.D);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new yr0(sessionsActivity, d2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.H);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new yr0(sessionsActivity, d2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        ArrayList arrayList = sessionsActivity.f34820e;
        sessionsActivity.f34823r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        h81 h81Var = sessionsActivity.f34817a;
        if (h81Var != null) {
            h81Var.l();
        }
        ox0 ox0Var = sessionsActivity.V;
        if (ox0Var != null) {
            ox0Var.a();
        }
        int i10 = sessionsActivity.S;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.S = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new y71(sessionsActivity, z4, 0), 2500L);
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
        int i10 = this.f34825w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 16));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f34817a = new h81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f34819c = ozVar;
        ozVar.b();
        frameLayout.addView(this.f34819c, k7.c6.e(-1, -1, 17));
        c81 c81Var = new c81(this, context, 0);
        this.f34818b = c81Var;
        c81Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34818b);
        this.f34818b.setLayoutManager(new k(1, false, 16));
        this.f34818b.setVerticalScrollBarEnabled(false);
        this.f34818b.setEmptyView(this.f34819c);
        c81 c81Var2 = this.f34818b;
        c81Var2.V1 = true;
        c81Var2.W1 = 0;
        frameLayout.addView(c81Var2, k7.c6.c(-1.0f, -1));
        this.f34818b.setAdapter(this.f34817a);
        f2.l lVar = new f2.l();
        lVar.n(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
        lVar.f5934i = prVar;
        lVar.f5852o = prVar;
        this.f34818b.setItemAnimator(lVar);
        this.f34818b.setOnItemClickListener(new p21(this, 5));
        if (i10 == 0) {
            d81 d81Var = new d81(this, context);
            this.f34824s = d81Var;
            frameLayout.addView(d81Var, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34819c, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21734h6));
        int i10 = org.telegram.ui.ActionBar.k6.f21878p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 262148, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 262148, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21896q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        int i12 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34818b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34824s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.f34820e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f34823r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f34825w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z4) {
        if (this.f34823r) {
            return;
        }
        if (!z4) {
            this.f34823r = true;
        }
        if (this.f34825w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f42030b;

                {
                    this.f42030b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f42030b;
                            final boolean z10 = z4;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f34821f;
                                            ArrayList arrayList2 = sessionsActivity2.f34820e;
                                            sessionsActivity2.f34823r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f34822n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                ox0 ox0Var = sessionsActivity2.V;
                                                if (ox0Var != null) {
                                                    ox0Var.a();
                                                }
                                            }
                                            h81 h81Var = sessionsActivity2.f34817a;
                                            if (h81Var != null) {
                                                h81Var.l();
                                            }
                                            ox0 ox0Var2 = sessionsActivity2.V;
                                            if (ox0Var2 != null) {
                                                ox0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.S;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.S = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new y71(sessionsActivity2, z10, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z10);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f42030b;
                            final boolean z11 = z4;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f34821f;
                                            ArrayList arrayList2 = sessionsActivity22.f34820e;
                                            sessionsActivity22.f34823r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f34822n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                ox0 ox0Var = sessionsActivity22.V;
                                                if (ox0Var != null) {
                                                    ox0Var.a();
                                                }
                                            }
                                            h81 h81Var = sessionsActivity22.f34817a;
                                            if (h81Var != null) {
                                                h81Var.l();
                                            }
                                            ox0 ox0Var2 = sessionsActivity22.V;
                                            if (ox0Var2 != null) {
                                                ox0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.S;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.S = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new y71(sessionsActivity22, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z11);
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
            public final SessionsActivity f42030b;

            {
                this.f42030b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f42030b;
                        final boolean z10 = z4;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f34821f;
                                        ArrayList arrayList2 = sessionsActivity22.f34820e;
                                        sessionsActivity22.f34823r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f34822n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ox0 ox0Var = sessionsActivity22.V;
                                            if (ox0Var != null) {
                                                ox0Var.a();
                                            }
                                        }
                                        h81 h81Var = sessionsActivity22.f34817a;
                                        if (h81Var != null) {
                                            h81Var.l();
                                        }
                                        ox0 ox0Var2 = sessionsActivity22.V;
                                        if (ox0Var2 != null) {
                                            ox0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.S;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.S = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new y71(sessionsActivity22, z10, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z10);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f42030b;
                        final boolean z11 = z4;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f34821f;
                                        ArrayList arrayList2 = sessionsActivity22.f34820e;
                                        sessionsActivity22.f34823r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f34822n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ox0 ox0Var = sessionsActivity22.V;
                                            if (ox0Var != null) {
                                                ox0Var.a();
                                            }
                                        }
                                        h81 h81Var = sessionsActivity22.f34817a;
                                        if (h81Var != null) {
                                            h81Var.l();
                                        }
                                        ox0 ox0Var2 = sessionsActivity22.V;
                                        if (ox0Var2 != null) {
                                            ox0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.S;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.S = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new y71(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z11);
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
        this.T = true;
    }

    public final void m0() {
        this.P = 0;
        this.f34826x = -1;
        this.f34827y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.O = -1;
        this.Q = -1;
        this.ttlRow = -1;
        this.R = -1;
        int i10 = this.f34825w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.P;
            this.N = i11;
            this.P = i11 + 2;
            this.O = i11 + 1;
        }
        if (this.f34823r) {
            if (i10 == 0) {
                int i12 = this.P;
                this.f34826x = i12;
                this.P = i12 + 2;
                this.f34827y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f34822n != null) {
            int i13 = this.P;
            this.f34826x = i13;
            this.P = i13 + 2;
            this.f34827y = i13 + 1;
        }
        ArrayList arrayList = this.f34821f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f34820e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.B = -1;
            if (i10 != 1 && this.f34822n == null) {
                this.M = -1;
            } else {
                int i14 = this.P;
                this.P = i14 + 1;
                this.M = i14;
            }
        } else {
            int i15 = this.P;
            this.terminateAllSessionsRow = i15;
            this.P = i15 + 2;
            this.B = i15 + 1;
            this.M = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.P;
            int i17 = i16 + 1;
            this.P = i17;
            this.C = i16;
            this.D = i17;
            int size = arrayList.size() + i17;
            this.E = size;
            this.P = size + 1;
            this.F = size;
        }
        if (!arrayList2.isEmpty()) {
            int i18 = this.P;
            this.P = i18 + 1;
            this.G = i18;
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.P;
                this.J = i19;
                int size2 = this.h.size() + i19;
                this.P = size2;
                this.K = size2;
            }
            int i20 = this.P;
            this.H = i20;
            this.I = arrayList2.size() + i20;
            int size3 = arrayList2.size() + this.P;
            this.P = size3 + 1;
            this.L = size3;
        } else {
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.P;
                int i22 = i21 + 1;
                this.P = i22;
                this.G = i21;
                this.J = i22;
                int size4 = this.h.size() + i22;
                this.K = size4;
                this.P = size4 + 1;
                this.L = size4;
            }
        }
        if (this.v > 0) {
            int i23 = this.P;
            this.Q = i23;
            this.ttlRow = i23 + 1;
            this.P = i23 + 3;
            this.R = i23 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        d81 d81Var = this.f34824s;
        if (d81Var != null) {
            d81Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f34825w == 0) {
            vf.f.a(this.currentAccount).c(new a81(this, 0));
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
        this.f34818b.setPadding(0, 0, 0, i13);
        this.f34818b.setClipToPadding(false);
        d81 d81Var = this.f34824s;
        if (d81Var != null) {
            d81Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        d81 d81Var = this.f34824s;
        if (d81Var != null) {
            d81Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                v9.e0(getParentActivity(), 2, new g81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new b81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        h81 h81Var = this.f34817a;
        if (h81Var != null) {
            h81Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && !z10) {
            this.U = true;
            for (int i10 = 0; i10 < this.f34818b.getChildCount(); i10++) {
                View childAt = this.f34818b.getChildAt(i10);
                if (childAt instanceof i81) {
                    ((i81) childAt).f37575b.invalidate();
                }
            }
        }
    }
}
