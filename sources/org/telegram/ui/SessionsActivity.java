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
    public ww0 U;
    public n71 f36238a;
    public i71 f36239b;
    public org.telegram.ui.Components.hz f36240c;
    public org.telegram.ui.Components.p00 d;
    public final ArrayList f36241e;
    public final ArrayList f36242f;
    public ArrayList h;
    public TLRPC.TL_authorization f36243n;
    public boolean f36244r;
    public j71 f36245s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int f36246w;
    public int f36247x;
    public int f36248y;

    public SessionsActivity(int i10) {
        super(null);
        this.f36241e = new ArrayList();
        this.f36242f = new ArrayList();
        this.h = new ArrayList();
        this.R = 0;
        this.f36246w = i10;
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
        ArrayList arrayList2 = sessionsActivity.f36241e;
        int i14 = sessionsActivity.f36246w;
        float f9 = 4.0f;
        boolean z13 = true;
        if (i10 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i15 = sessionsActivity.v;
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
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i16 = 0;
                while (i16 < 4) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(sessionsActivity.getParentActivity(), null);
                    i6Var.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(4.0f), 0);
                    i6Var.setTag(Integer.valueOf(i16));
                    i6Var.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23118g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E5, false));
                    String str2 = strArr[i16];
                    if (i13 == i16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i6Var.b(str2, z12);
                    linearLayout.addView(i6Var);
                    i6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
                    i6Var.setOnClickListener(new t70(22, sessionsActivity, alertDialog$Builder));
                    i16++;
                    f9 = 4.0f;
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var);
            }
        } else if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.h;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.h;
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
                                append.setSpan(new org.telegram.ui.Components.a51(u3.c.e("https://t.me/", publicUsername), (org.telegram.ui.Components.h01) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.c5.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new g71(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                if (i14 == 0) {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureSessions);
                    c2Var2.N = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureWebSessions);
                    c2Var2.N = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new h71(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            }
        } else if (i10 >= sessionsActivity.I && i10 < sessionsActivity.J) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
                int i18 = i10 - sessionsActivity.I;
                new sf.f0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i18), new org.telegram.ui.Components.i8(sessionsActivity, i18, 27), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.G && i10 < sessionsActivity.H) || ((i10 >= sessionsActivity.C && i10 < sessionsActivity.D) || i10 == sessionsActivity.f36248y)) && sessionsActivity.getParentActivity() != null) {
            if (i14 == 0) {
                if (i10 == sessionsActivity.f36248y) {
                    tL_authorization = sessionsActivity.f36243n;
                    z10 = true;
                } else {
                    int i19 = sessionsActivity.G;
                    if (i10 >= i19 && i10 < sessionsActivity.H) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i10 - i19);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f36242f.get(i10 - sessionsActivity.C);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    k71 k71Var = new k71(sessionsActivity);
                    ?? f3Var = new org.telegram.ui.ActionBar.f3(sessionsActivity.getParentActivity(), false);
                    f3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    f3Var.f36449b = tL_authorization;
                    f3Var.f36450c = sessionsActivity;
                    f3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    f3Var.d = imageView;
                    imageView.setOnClickListener(new r61(f3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, i7.f6.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    th.n(20.0f, 2, textView2);
                    th.s(org.telegram.ui.ActionBar.g6.G6, null, false, textView2, 17);
                    linearLayout2.addView(textView2, i7.f6.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, i7.f6.t(-1, -2, 1, 21, 4, 21, 21));
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
                        i12 = org.telegram.ui.ActionBar.g6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i11 = R.raw.edge_30;
                        i12 = org.telegram.ui.ActionBar.g6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i11 = R.raw.chrome_30;
                        i12 = org.telegram.ui.ActionBar.g6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i11 = R.raw.firefox_30;
                        i12 = org.telegram.ui.ActionBar.g6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i11 = R.raw.ubuntu_30;
                            i12 = org.telegram.ui.ActionBar.g6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i11 = R.raw.linux_30;
                            i12 = org.telegram.ui.ActionBar.g6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i11 = R.raw.ipad_30;
                            } else {
                                i11 = R.raw.iphone_30;
                            }
                            i12 = org.telegram.ui.ActionBar.g6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.g6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i11 = R.raw.mac_30;
                            i12 = org.telegram.ui.ActionBar.g6.S7;
                        } else if (lowerCase.contains("android")) {
                            i11 = R.raw.android_30;
                            i12 = org.telegram.ui.ActionBar.g6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.g6.S7;
                        } else {
                            i11 = R.raw.chrome_30;
                            i12 = org.telegram.ui.ActionBar.g6.U7;
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
                        i12 = org.telegram.ui.ActionBar.g6.U7;
                        z13 = false;
                    }
                    imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.g6.w0(null, i12, false)));
                    if (z13) {
                        imageView.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.g6.w0(null, i12, false)});
                    } else {
                        imageView.setImageDrawable(f3Var.getContext().getDrawable(i11));
                    }
                    z61 z61Var = new z61(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    z61Var.f45094b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i20 = org.telegram.ui.ActionBar.g6.f23223m6;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, i20, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    z61Var.f45093a.setImageDrawable(mutate);
                    z61Var.f45095c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(z61Var);
                    if (tL_authorization.country.length() != 0) {
                        z61 z61Var2 = new z61(parentActivity, false);
                        z61Var2.f45094b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i20, false), mode));
                        z61Var2.f45093a.setImageDrawable(mutate2);
                        z61Var2.f45095c.setText(LocaleController.getString(R.string.Location));
                        z61Var2.setOnClickListener(new s61(f3Var, tL_authorization));
                        z61Var2.setOnLongClickListener(new t61(f3Var, tL_authorization));
                        z61Var2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
                        linearLayout2.addView(z61Var2);
                        z61Var.f45096e = true;
                        z61Var = z61Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        z61 z61Var3 = new z61(parentActivity, false);
                        z61Var3.f45094b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i20, false), mode));
                        z61Var3.f45093a.setImageDrawable(mutate3);
                        z61Var3.f45095c.setText(LocaleController.getString(R.string.IpAddress));
                        z61Var3.setOnClickListener(new u61(f3Var, tL_authorization));
                        z61Var3.setOnLongClickListener(new v61(f3Var, tL_authorization));
                        z61Var3.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
                        linearLayout2.addView(z61Var3);
                        z11 = true;
                        z61Var.f45096e = true;
                        z61Var = z61Var3;
                    } else {
                        z11 = true;
                    }
                    int i21 = tL_authorization.api_id;
                    if (i21 != 2040 && i21 != 2496) {
                        z61 z61Var4 = new z61(parentActivity, z11);
                        z61Var4.f45094b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i20, false), mode));
                        z61Var4.f45093a.setImageDrawable(mutate4);
                        z61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        z61Var4.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 7, -1));
                        z61Var4.setOnClickListener(new w61(f3Var, z61Var4, tL_authorization));
                        z61Var.f45096e = true;
                        z61Var4.f45095c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(z61Var4);
                        z61Var = z61Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        z61 z61Var5 = new z61(parentActivity, true);
                        z61Var5.f45094b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i20, false), mode));
                        z61Var5.f45093a.setImageDrawable(mutate5);
                        z61Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        z61Var5.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 7, -1));
                        z61Var5.setOnClickListener(new x61(f3Var, z61Var5, tL_authorization));
                        z61Var.f45096e = true;
                        z61Var5.f45095c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(z61Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23192ka, false);
                        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), 120);
                        textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, w03, k9, k9));
                        linearLayout2.addView(textView4, i7.f6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new y61(f3Var, k71Var, tL_authorization, sessionsActivity));
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
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
            if (i14 == 0) {
                c2Var3.P = LocaleController.getString(R.string.TerminateSessionText);
                c2Var3.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.G);
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
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sessionsActivity.getParentActivity(), 1);
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                y1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, str), "", false, false, false);
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
                y1Var.setPadding(dp, 0, dp2, 0);
                frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                y1Var.setOnClickListener(new k8(6, zArr));
                c2Var3.C = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new e3.d(sessionsActivity, i10, zArr, 13));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(c2Var3);
            TextView textView5 = (TextView) c2Var3.d(-1);
            if (textView5 != null) {
                textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
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
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new d71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new d71(sessionsActivity, 1));
    }

    public static void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f36246w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new d71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new d71(sessionsActivity, 3));
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.f36241e;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(sessionsActivity.getParentActivity(), 3, null);
            c2Var.f22783c0 = false;
            c2Var.show();
            if (sessionsActivity.f36246w == 0) {
                int i11 = sessionsActivity.G;
                if (i10 >= i11 && i10 < sessionsActivity.H) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f36242f.get(i10 - sessionsActivity.C);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new jr0(sessionsActivity, c2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.G);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new jr0(sessionsActivity, c2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.f36241e;
        sessionsActivity.f36244r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        n71 n71Var = sessionsActivity.f36238a;
        if (n71Var != null) {
            n71Var.l();
        }
        ww0 ww0Var = sessionsActivity.U;
        if (ww0Var != null) {
            ww0Var.a();
        }
        int i10 = sessionsActivity.R;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.R = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new e71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.d = p00Var;
        p00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f36246w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 16));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f36238a = new n71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.f36240c = hzVar;
        hzVar.b();
        frameLayout.addView(this.f36240c, i7.f6.e(-1, -1, 17));
        i71 i71Var = new i71(this, context, 0);
        this.f36239b = i71Var;
        i71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36239b);
        this.f36239b.setLayoutManager(new k(1, false, 16));
        this.f36239b.setVerticalScrollBarEnabled(false);
        this.f36239b.setEmptyView(this.f36240c);
        i71 i71Var2 = this.f36239b;
        i71Var2.U1 = true;
        i71Var2.V1 = 0;
        frameLayout.addView(i71Var2, i7.f6.c(-1.0f, -1));
        this.f36239b.setAdapter(this.f36238a);
        f2.l lVar = new f2.l();
        lVar.n(150L);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
        lVar.f6490i = jrVar;
        lVar.f6404o = jrVar;
        this.f36239b.setItemAnimator(lVar);
        this.f36239b.setOnItemClickListener(new d21(this, 4));
        if (i10 == 0) {
            j71 j71Var = new j71(this, context);
            this.f36245s = j71Var;
            frameLayout.addView(j71Var, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.r6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36240c, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        int i10 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 262148, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 262148, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36239b, 0, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36245s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.f36241e;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f36244r) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f36246w == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void k0(final boolean z10) {
        if (this.f36244r) {
            return;
        }
        if (!z10) {
            this.f36244r = true;
        }
        if (this.f36246w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f36708b;

                {
                    this.f36708b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f36708b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f36242f;
                                            ArrayList arrayList2 = sessionsActivity2.f36241e;
                                            sessionsActivity2.f36244r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.f36243n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                ww0 ww0Var = sessionsActivity2.U;
                                                if (ww0Var != null) {
                                                    ww0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity2.f36238a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            ww0 ww0Var2 = sessionsActivity2.U;
                                            if (ww0Var2 != null) {
                                                ww0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.R;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.R = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new e71(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f36708b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f36242f;
                                            ArrayList arrayList2 = sessionsActivity22.f36241e;
                                            sessionsActivity22.f36244r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i10 = 0; i10 < size; i10++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.f36243n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                ww0 ww0Var = sessionsActivity22.U;
                                                if (ww0Var != null) {
                                                    ww0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity22.f36238a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            ww0 ww0Var2 = sessionsActivity22.U;
                                            if (ww0Var2 != null) {
                                                ww0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.R;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.R = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new e71(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f36708b;

            {
                this.f36708b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f36708b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f36242f;
                                        ArrayList arrayList2 = sessionsActivity22.f36241e;
                                        sessionsActivity22.f36244r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f36243n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ww0 ww0Var = sessionsActivity22.U;
                                            if (ww0Var != null) {
                                                ww0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.f36238a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        ww0 ww0Var2 = sessionsActivity22.U;
                                        if (ww0Var2 != null) {
                                            ww0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.R;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.R = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new e71(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f36708b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f36242f;
                                        ArrayList arrayList2 = sessionsActivity22.f36241e;
                                        sessionsActivity22.f36244r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i10 = 0; i10 < size; i10++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i10);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.f36243n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            ww0 ww0Var = sessionsActivity22.U;
                                            if (ww0Var != null) {
                                                ww0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.f36238a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        ww0 ww0Var2 = sessionsActivity22.U;
                                        if (ww0Var2 != null) {
                                            ww0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.R;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.R = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new e71(sessionsActivity22, z12, 1), 2500L);
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
        this.S = true;
    }

    public final void m0() {
        this.O = 0;
        this.f36247x = -1;
        this.f36248y = -1;
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
        int i10 = this.f36246w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.O;
            this.M = i11;
            this.O = i11 + 2;
            this.N = i11 + 1;
        }
        if (this.f36244r) {
            if (i10 == 0) {
                int i12 = this.O;
                this.f36247x = i12;
                this.O = i12 + 2;
                this.f36248y = i12 + 1;
                return;
            }
            return;
        }
        if (this.f36243n != null) {
            int i13 = this.O;
            this.f36247x = i13;
            this.O = i13 + 2;
            this.f36248y = i13 + 1;
        }
        ArrayList arrayList = this.f36242f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f36241e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.A = -1;
            if (i10 != 1 && this.f36243n == null) {
                this.L = -1;
            } else {
                int i14 = this.O;
                this.O = i14 + 1;
                this.L = i14;
            }
        } else {
            int i15 = this.O;
            this.terminateAllSessionsRow = i15;
            this.O = i15 + 2;
            this.A = i15 + 1;
            this.L = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.O;
            int i17 = i16 + 1;
            this.O = i17;
            this.B = i16;
            this.C = i17;
            int size = arrayList.size() + i17;
            this.D = size;
            this.O = size + 1;
            this.E = size;
        }
        if (!arrayList2.isEmpty()) {
            int i18 = this.O;
            this.O = i18 + 1;
            this.F = i18;
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.O;
                this.I = i19;
                int size2 = this.h.size() + i19;
                this.O = size2;
                this.J = size2;
            }
            int i20 = this.O;
            this.G = i20;
            this.H = arrayList2.size() + i20;
            int size3 = arrayList2.size() + this.O;
            this.O = size3 + 1;
            this.K = size3;
        } else {
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.O;
                int i22 = i21 + 1;
                this.O = i22;
                this.F = i21;
                this.I = i22;
                int size4 = this.h.size() + i22;
                this.J = size4;
                this.O = size4 + 1;
                this.K = size4;
            }
        }
        if (this.v > 0) {
            int i23 = this.O;
            this.P = i23;
            this.ttlRow = i23 + 1;
            this.O = i23 + 3;
            this.Q = i23 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        j71 j71Var = this.f36245s;
        if (j71Var != null) {
            j71Var.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.f36246w == 0) {
            sf.g.a(this.currentAccount).c(new g71(this, 0));
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
        this.f36239b.setPadding(0, 0, 0, i13);
        this.f36239b.setClipToPadding(false);
        j71 j71Var = this.f36245s;
        if (j71Var != null) {
            j71Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        j71 j71Var = this.f36245s;
        if (j71Var != null) {
            j71Var.e(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                r9.e0(getParentActivity(), 2, new m71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new h71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        n71 n71Var = this.f36238a;
        if (n71Var != null) {
            n71Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.T = true;
            for (int i10 = 0; i10 < this.f36239b.getChildCount(); i10++) {
                View childAt = this.f36239b.getChildAt(i10);
                if (childAt instanceof o71) {
                    ((o71) childAt).f40999b.invalidate();
                }
            }
        }
    }
}
