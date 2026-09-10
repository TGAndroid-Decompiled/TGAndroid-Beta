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
    public dy0 Y;
    public v81 f30608a;
    public zp0 f30609b;
    public org.telegram.ui.Components.tz f30610c;
    public org.telegram.ui.Components.a10 d;
    public final ArrayList e;
    public final ArrayList f30611f;
    public ArrayList h;
    public TLRPC.TL_authorization f30612n;
    public boolean f30613r;
    public r81 f30614s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f30615w;
    public int f30616x;
    public int f30617y;

    public SessionsActivity(int i10) {
        super(null);
        this.e = new ArrayList();
        this.f30611f = new ArrayList();
        this.h = new ArrayList();
        this.V = 0;
        this.f30615w = i10;
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
        int i16 = sessionsActivity.f30615w;
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
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                for (int i18 = 0; i18 < 4; i18++) {
                    org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(sessionsActivity.getParentActivity(), null);
                    m6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    m6Var.setTag(Integer.valueOf(i18));
                    m6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17983g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m6Var.b(str2, z12);
                    linearLayout.addView(m6Var);
                    m6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
                    m6Var.setOnClickListener(new w71(1, sessionsActivity, alertDialog$Builder));
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
                                append.setSpan(new org.telegram.ui.Components.z51(org.telegram.ui.Cells.r6.i("https://t.me/", publicUsername), (org.telegram.ui.Components.b11) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.d5.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new p81(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                if (i16 == 0) {
                    d2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    d2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    d2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    d2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new q81(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i20 = i10 - sessionsActivity.M;
                new gg.p0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.zd(sessionsActivity, i20, 26), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.K && i10 < sessionsActivity.L) || ((i10 >= sessionsActivity.G && i10 < sessionsActivity.H) || i10 == sessionsActivity.f30617y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i10 == sessionsActivity.f30617y) {
                    tL_authorization = sessionsActivity.f30612n;
                    z10 = true;
                } else {
                    int i21 = sessionsActivity.K;
                    if (i10 >= i21 && i10 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f30611f.get(i10 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    s81 s81Var = new s81(sessionsActivity);
                    ?? h3Var = new org.telegram.ui.ActionBar.h3(sessionsActivity.getParentActivity(), false);
                    h3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    h3Var.f34053b = tL_authorization;
                    h3Var.f34054c = sessionsActivity;
                    h3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    h3Var.d = imageView;
                    imageView.setOnClickListener(new a81(h3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, w7.a6.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.gms.internal.vision.e2.k(20.0f, 2, textView2);
                    com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, w7.a6.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, w7.a6.t(-1, -2, 1, 21, 4, 21, 21));
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
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i12 = R.raw.edge_30;
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i12 = R.raw.chrome_30;
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i12 = R.raw.firefox_30;
                        i13 = org.telegram.ui.ActionBar.j6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i12 = R.raw.ubuntu_30;
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i12 = R.raw.linux_30;
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = R.raw.ipad_30;
                            } else {
                                i14 = R.raw.iphone_30;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.j6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i12 = R.raw.mac_30;
                            i13 = org.telegram.ui.ActionBar.j6.S7;
                        } else if (lowerCase.contains("android")) {
                            i12 = R.raw.android_30;
                            i13 = org.telegram.ui.ActionBar.j6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i12 = R.raw.windows_30;
                            i13 = org.telegram.ui.ActionBar.j6.S7;
                        } else {
                            i12 = R.raw.chrome_30;
                            i13 = org.telegram.ui.ActionBar.j6.U7;
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
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                        z13 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.j6.w0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(h3Var.getContext().getDrawable(i12));
                    }
                    i81 i81Var = new i81(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    i81Var.f33560b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i22 = org.telegram.ui.ActionBar.j6.f18091m6;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    i81Var.f33559a.setImageDrawable(mutate);
                    i81Var.f33561c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(i81Var);
                    if (tL_authorization.country.length() != 0) {
                        i81 i81Var2 = new i81(parentActivity, false);
                        i81Var2.f33560b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
                        i81Var2.f33559a.setImageDrawable(mutate2);
                        i81Var2.f33561c.setText(LocaleController.getString(R.string.Location));
                        i81Var2.setOnClickListener(new b81(h3Var, tL_authorization));
                        i81Var2.setOnLongClickListener(new c81(h3Var, tL_authorization));
                        i81Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
                        linearLayout2.addView(i81Var2);
                        i81Var.e = true;
                        i81Var = i81Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        i81 i81Var3 = new i81(parentActivity, false);
                        i81Var3.f33560b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
                        i81Var3.f33559a.setImageDrawable(mutate3);
                        i81Var3.f33561c.setText(LocaleController.getString(R.string.IpAddress));
                        i81Var3.setOnClickListener(new d81(h3Var, tL_authorization));
                        i81Var3.setOnLongClickListener(new e81(h3Var, tL_authorization));
                        i81Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 2, -1));
                        linearLayout2.addView(i81Var3);
                        z11 = true;
                        i81Var.e = true;
                        i81Var = i81Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        i81 i81Var4 = new i81(parentActivity, z11);
                        i81Var4.f33560b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
                        i81Var4.f33559a.setImageDrawable(mutate4);
                        i81Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        i81Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 7, -1));
                        i81Var4.setOnClickListener(new f81(h3Var, i81Var4, tL_authorization));
                        i81Var.e = true;
                        i81Var4.f33561c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(i81Var4);
                        i81Var = i81Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        i81 i81Var5 = new i81(parentActivity, true);
                        i81Var5.f33560b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
                        i81Var5.f33559a.setImageDrawable(mutate5);
                        i81Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        i81Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 7, -1));
                        i81Var5.setOnClickListener(new g81(h3Var, i81Var5, tL_authorization));
                        i81Var.e = true;
                        i81Var5.f33561c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(i81Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18059ka, false);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, w03, k10, k10));
                        linearLayout2.addView(textView4, w7.a6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new h81(h3Var, s81Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f17528a;
            if (i16 == 0) {
                d2Var3.T = LocaleController.getString(R.string.TerminateSessionText);
                d2Var3.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.K);
                d2Var3.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                d2Var3.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
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
                frameLayout.addView(z1Var, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new m8(6, zArr));
                d2Var3.G = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new fg.e2(sessionsActivity, i10, zArr, 15));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(d2Var3);
            TextView textView5 = (TextView) d2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new m81(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new m81(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f30615w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new m81(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new m81(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(sessionsActivity.getParentActivity(), 3, null);
            d2Var.f17621g0 = false;
            d2Var.show();
            if (sessionsActivity.f30615w == 0) {
                int i11 = sessionsActivity.K;
                if (i10 >= i11 && i10 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f30611f.get(i10 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new ms0(sessionsActivity, d2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new ms0(sessionsActivity, d2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.f30613r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        v81 v81Var = sessionsActivity.f30608a;
        if (v81Var != null) {
            v81Var.l();
        }
        dy0 dy0Var = sessionsActivity.Y;
        if (dy0Var != null) {
            dy0Var.a();
        }
        int i10 = sessionsActivity.V;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.V = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new n81(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.d = a10Var;
        a10Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f30615w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 29));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f30608a = new v81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f30610c = tzVar;
        tzVar.b();
        frameLayout.addView(this.f30610c, w7.a6.e(-1, -1, 17));
        zp0 zp0Var = new zp0(this, context, 1);
        this.f30609b = zp0Var;
        zp0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f30609b);
        this.f30609b.setLayoutManager(new fg.a0(1, false, 18));
        this.f30609b.setVerticalScrollBarEnabled(false);
        this.f30609b.setEmptyView(this.f30610c);
        zp0 zp0Var2 = this.f30609b;
        zp0Var2.Y1 = true;
        zp0Var2.Z1 = 0;
        frameLayout.addView(zp0Var2, w7.a6.c(-1.0f, -1));
        this.f30609b.setAdapter(this.f30608a);
        s4.j jVar = new s4.j();
        jVar.n(150L);
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
        jVar.f41694i = wrVar;
        jVar.f41667o = wrVar;
        this.f30609b.setItemAnimator(jVar);
        this.f30609b.setOnItemClickListener(new f31(this, 5));
        if (i10 == 0) {
            r81 r81Var = new r81(this, context);
            this.f30614s = r81Var;
            frameLayout.addView(r81Var, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30610c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f17999h6));
        int i10 = org.telegram.ui.ActionBar.j6.f18144p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 262144, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 262144, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30609b, 0, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30614s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f30613r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f30615w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f30613r) {
            return;
        }
        if (!z10) {
            this.f30613r = true;
        }
        if (this.f30615w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f34269b;

                {
                    this.f34269b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f34269b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f30611f;
                                            ArrayList arrayList2 = sessionsActivity2.e;
                                            sessionsActivity2.f30613r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f30612n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                dy0 dy0Var = sessionsActivity2.Y;
                                                if (dy0Var != null) {
                                                    dy0Var.a();
                                                }
                                            }
                                            v81 v81Var = sessionsActivity2.f30608a;
                                            if (v81Var != null) {
                                                v81Var.l();
                                            }
                                            dy0 dy0Var2 = sessionsActivity2.Y;
                                            if (dy0Var2 != null) {
                                                dy0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new n81(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f34269b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f30611f;
                                            ArrayList arrayList2 = sessionsActivity22.e;
                                            sessionsActivity22.f30613r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f30612n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                dy0 dy0Var = sessionsActivity22.Y;
                                                if (dy0Var != null) {
                                                    dy0Var.a();
                                                }
                                            }
                                            v81 v81Var = sessionsActivity22.f30608a;
                                            if (v81Var != null) {
                                                v81Var.l();
                                            }
                                            dy0 dy0Var2 = sessionsActivity22.Y;
                                            if (dy0Var2 != null) {
                                                dy0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.V;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.V = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new n81(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f34269b;

            {
                this.f34269b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f34269b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f30611f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f30613r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f30612n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            dy0 dy0Var = sessionsActivity22.Y;
                                            if (dy0Var != null) {
                                                dy0Var.a();
                                            }
                                        }
                                        v81 v81Var = sessionsActivity22.f30608a;
                                        if (v81Var != null) {
                                            v81Var.l();
                                        }
                                        dy0 dy0Var2 = sessionsActivity22.Y;
                                        if (dy0Var2 != null) {
                                            dy0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new n81(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f34269b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f30611f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.f30613r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f30612n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            dy0 dy0Var = sessionsActivity22.Y;
                                            if (dy0Var != null) {
                                                dy0Var.a();
                                            }
                                        }
                                        v81 v81Var = sessionsActivity22.f30608a;
                                        if (v81Var != null) {
                                            v81Var.l();
                                        }
                                        dy0 dy0Var2 = sessionsActivity22.Y;
                                        if (dy0Var2 != null) {
                                            dy0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.V;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.V = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new n81(sessionsActivity22, z12, 1), 2500L);
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
        this.f30616x = -1;
        this.f30617y = -1;
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
        int i10 = this.f30615w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.S;
            this.Q = i11;
            this.S = i11 + 2;
            this.R = i11 + 1;
        }
        if (this.f30613r) {
            if (i10 == 0) {
                int i12 = this.S;
                this.f30616x = i12;
                this.S = i12 + 2;
                this.f30617y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f30612n != null) {
            int i13 = this.S;
            this.f30616x = i13;
            this.S = i13 + 2;
            this.f30617y = i13 + 1;
        }
        ArrayList arrayList = this.f30611f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i10 != 1 && this.f30612n == null) {
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
        r81 r81Var = this.f30614s;
        if (r81Var != null) {
            r81Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f30615w == 0) {
            gg.f.a(this.currentAccount).c(new p81(this, 0));
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
        this.f30609b.setPadding(0, 0, 0, i13);
        this.f30609b.setClipToPadding(false);
        r81 r81Var = this.f30614s;
        if (r81Var != null) {
            r81Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        r81 r81Var = this.f30614s;
        if (r81Var != null) {
            r81Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.e0(getParentActivity(), 2, new u81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new q81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        v81 v81Var = this.f30608a;
        if (v81Var != null) {
            v81Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i10 = 0; i10 < this.f30609b.getChildCount(); i10++) {
                View childAt = this.f30609b.getChildAt(i10);
                if (childAt instanceof w81) {
                    ((w81) childAt).f37749b.invalidate();
                }
            }
        }
    }
}
