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
public class SessionsActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public nx0 X;
    public n71 f36208a;
    public k10 f36209b;
    public org.telegram.ui.Components.uz f36210c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f36211f;
    public TLRPC.TL_authorization h;
    public boolean f36212n;
    public i71 f36213r;
    public int f36214s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int v;
    public int f36215w;
    public int f36216x;
    public int f36217y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f36211f = new ArrayList();
        this.U = 0;
        this.v = i10;
    }

    public static void V(SessionsActivity sessionsActivity, int i10) {
        String str;
        int dp;
        int dp2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        j71 j71Var;
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
                int i15 = sessionsActivity.f36214s;
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
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R = string2;
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                for (int i16 = 0; i16 < 4; i16++) {
                    org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(sessionsActivity.getParentActivity(), null);
                    p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    p6Var.setTag(Integer.valueOf(i16));
                    p6Var.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.g7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E5, false));
                    String str2 = strArr[i16];
                    if (i13 == i16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    p6Var.b(str2, z12);
                    linearLayout.addView(p6Var);
                    p6Var.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false), 2, -1));
                    p6Var.setOnClickListener(new xd0(15, sessionsActivity, alertDialog$Builder));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(e2Var);
            }
        } else if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.f36211f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.f36211f;
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
                                append.setSpan(new org.telegram.ui.Components.x61(org.telegram.ui.Components.b10.j("https://t.me/", publicUsername), (org.telegram.ui.Components.y11) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                            }
                        }
                    }
                    org.telegram.ui.Components.g5.h0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new f71(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22366a;
                if (i14 == 0) {
                    e2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    e2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    e2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    e2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new g71(sessionsActivity, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(e2Var2);
                TextView textView = (TextView) e2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                }
            }
        } else if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.f36211f) != null && !arrayList.isEmpty()) {
                int i18 = i10 - sessionsActivity.L;
                new jg.k0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f36211f.get(i18), new org.telegram.ui.Components.h2(sessionsActivity, i18, 29), sessionsActivity.resourceProvider).show();
            }
        } else if (((i10 >= sessionsActivity.J && i10 < sessionsActivity.K) || ((i10 >= sessionsActivity.F && i10 < sessionsActivity.G) || i10 == sessionsActivity.f36216x)) && sessionsActivity.getParentActivity() != null) {
            if (i14 == 0) {
                if (i10 == sessionsActivity.f36216x) {
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
                    j71 j71Var2 = new j71(sessionsActivity);
                    ?? k3Var = new org.telegram.ui.ActionBar.k3(sessionsActivity.getParentActivity(), false);
                    k3Var.setOpenNoDelay(true);
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    k3Var.f46188b = tL_authorization;
                    k3Var.f46189c = sessionsActivity;
                    k3Var.fixNavigationBar();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    k3Var.d = imageView;
                    imageView.setOnClickListener(new q61(k3Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, org.telegram.ui.Components.gb1.x(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    ic.a.o(20.0f, 2, textView2);
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23746y6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, org.telegram.ui.Components.gb1.x(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        formatDateTime = LocaleController.getString(R.string.Online);
                        j71Var = j71Var2;
                    } else {
                        j71Var = j71Var2;
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
                        i12 = org.telegram.ui.ActionBar.y6.U7;
                    } else if (lowerCase2.contains("edge")) {
                        i11 = R.raw.edge_30;
                        i12 = org.telegram.ui.ActionBar.y6.U7;
                    } else if (lowerCase2.contains("chrome")) {
                        i11 = R.raw.chrome_30;
                        i12 = org.telegram.ui.ActionBar.y6.U7;
                    } else if (lowerCase2.contains("firefox")) {
                        i11 = R.raw.firefox_30;
                        i12 = org.telegram.ui.ActionBar.y6.O7;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i11 = R.raw.ubuntu_30;
                            i12 = org.telegram.ui.ActionBar.y6.T7;
                        } else if (lowerCase.contains("linux")) {
                            i11 = R.raw.linux_30;
                            i12 = org.telegram.ui.ActionBar.y6.T7;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i11 = R.raw.ipad_30;
                            } else {
                                i11 = R.raw.iphone_30;
                            }
                            i12 = org.telegram.ui.ActionBar.y6.T7;
                        } else if (lowerCase.contains("windows")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.y6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i11 = R.raw.mac_30;
                            i12 = org.telegram.ui.ActionBar.y6.S7;
                        } else if (lowerCase.contains("android")) {
                            i11 = R.raw.android_30;
                            i12 = org.telegram.ui.ActionBar.y6.R7;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i11 = R.raw.windows_30;
                            i12 = org.telegram.ui.ActionBar.y6.S7;
                        } else {
                            i11 = R.raw.chrome_30;
                            i12 = org.telegram.ui.ActionBar.y6.U7;
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
                        i12 = org.telegram.ui.ActionBar.y6.U7;
                        z13 = false;
                    }
                    ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.y6.x0(null, i12, false));
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                    imageView.setBackground(K);
                    org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, null);
                    if (z13) {
                        imageView.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.y6.x0(null, i12, false)});
                    } else {
                        imageView.setImageDrawable(k3Var.getContext().getDrawable(i11));
                    }
                    y61 y61Var = new y61(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    y61Var.f45973b.setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    int i20 = org.telegram.ui.ActionBar.y6.f23518m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    ImageView imageView2 = y61Var.f45972a;
                    org.telegram.ui.ActionBar.f7.y(imageView2, mutate, i20, null, mode);
                    imageView2.setImageDrawable(mutate);
                    y61Var.f45974c.setText(LocaleController.getString(R.string.Application));
                    linearLayout2.addView(y61Var);
                    if (tL_authorization.country.length() != 0) {
                        y61 y61Var2 = new y61(parentActivity, false);
                        y61Var2.f45973b.setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        ImageView imageView3 = y61Var2.f45972a;
                        org.telegram.ui.ActionBar.f7.y(imageView3, mutate2, i20, null, mode);
                        imageView3.setImageDrawable(mutate2);
                        y61Var2.f45974c.setText(LocaleController.getString(R.string.Location));
                        y61Var2.setOnClickListener(new r61(k3Var, tL_authorization));
                        y61Var2.setOnLongClickListener(new s61(k3Var, tL_authorization));
                        int i21 = org.telegram.ui.ActionBar.y6.f23446i6;
                        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i21, false), 2, -1);
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i21);
                        y61Var2.setBackground(g02);
                        org.telegram.ui.ActionBar.f7.k(y61Var2, g02, null, N2, null);
                        linearLayout2.addView(y61Var2);
                        y61Var.e = true;
                        y61Var = y61Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        y61 y61Var3 = new y61(parentActivity, false);
                        y61Var3.f45973b.setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        ImageView imageView4 = y61Var3.f45972a;
                        org.telegram.ui.ActionBar.f7.y(imageView4, mutate3, i20, null, mode);
                        imageView4.setImageDrawable(mutate3);
                        y61Var3.f45974c.setText(LocaleController.getString(R.string.IpAddress));
                        y61Var3.setOnClickListener(new t61(k3Var, tL_authorization));
                        y61Var3.setOnLongClickListener(new u61(k3Var, tL_authorization));
                        int i22 = org.telegram.ui.ActionBar.y6.f23446i6;
                        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i22, false), 2, -1);
                        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i22);
                        y61Var3.setBackground(g03);
                        org.telegram.ui.ActionBar.f7.k(y61Var3, g03, null, N3, null);
                        linearLayout2.addView(y61Var3);
                        z11 = true;
                        y61Var.e = true;
                        y61Var = y61Var3;
                    } else {
                        z11 = true;
                    }
                    int i23 = tL_authorization.api_id;
                    if (i23 != 2040 && i23 != 2496) {
                        y61 y61Var4 = new y61(parentActivity, z11);
                        y61Var4.f45973b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        ImageView imageView5 = y61Var4.f45972a;
                        org.telegram.ui.ActionBar.f7.y(imageView5, mutate4, i20, null, mode);
                        imageView5.setImageDrawable(mutate4);
                        y61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                        int i24 = org.telegram.ui.ActionBar.y6.f23446i6;
                        org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i24, false), 7, -1);
                        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i24);
                        y61Var4.setBackground(g04);
                        org.telegram.ui.ActionBar.f7.k(y61Var4, g04, null, N4, null);
                        y61Var4.setOnClickListener(new v61(k3Var, y61Var4, tL_authorization));
                        y61Var.e = true;
                        y61Var4.f45974c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                        linearLayout2.addView(y61Var4);
                        y61Var = y61Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        y61 y61Var5 = new y61(parentActivity, true);
                        y61Var5.f45973b.setText(LocaleController.getString(R.string.AcceptCalls));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        ImageView imageView6 = y61Var5.f45972a;
                        org.telegram.ui.ActionBar.f7.y(imageView6, mutate5, i20, null, mode);
                        imageView6.setImageDrawable(mutate5);
                        y61Var5.d.c(!tL_authorization.call_requests_disabled, false);
                        int i25 = org.telegram.ui.ActionBar.y6.f23446i6;
                        org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i25, false), 7, -1);
                        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i25);
                        y61Var5.setBackground(g05);
                        org.telegram.ui.ActionBar.f7.k(y61Var5, g05, null, N5, null);
                        y61Var5.setOnClickListener(new w61(k3Var, y61Var5, tL_authorization));
                        y61Var.e = true;
                        y61Var5.f45974c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                        linearLayout2.addView(y61Var5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(AndroidUtilities.bold());
                        textView4.setText(LocaleController.getString(R.string.TerminateSession));
                        org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.Sh, null);
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int i26 = org.telegram.ui.ActionBar.y6.f23486ka;
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i26, false);
                        int i27 = org.telegram.ui.ActionBar.y6.f23354d6;
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i27, false), 120);
                        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, x02, o10, o10);
                        org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i26);
                        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i27, 120);
                        textView4.setBackground(j02);
                        org.telegram.ui.ActionBar.f7.k(textView4, j02, N6, h, null);
                        linearLayout2.addView(textView4, org.telegram.ui.Components.gb1.h(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new x61(k3Var, j71Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    k3Var.setCustomView(scrollView);
                    k3Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22366a;
            if (i14 == 0) {
                e2Var3.T = LocaleController.getString(R.string.TerminateSessionText);
                e2Var3.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.J);
                e2Var3.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                e2Var3.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                if (user2 != null) {
                    str = UserObject.getFirstName(user2);
                } else {
                    str = "";
                }
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sessionsActivity.getParentActivity(), 1);
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
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
                frameLayout.addView(y1Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                y1Var.setOnClickListener(new p8(6, zArr));
                e2Var3.G = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new i2.z(sessionsActivity, i10, zArr, 17));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(e2Var3);
            TextView textView5 = (TextView) e2Var3.d(-1);
            if (textView5 != null) {
                org.telegram.ui.ActionBar.f7.V(textView5, org.telegram.ui.ActionBar.y6.f23596q7, null);
            }
        }
    }

    public static void W(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f36211f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.f36211f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new c71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new c71(sessionsActivity, 1));
    }

    public static void X(SessionsActivity sessionsActivity) {
        if (sessionsActivity.v == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new c71(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new c71(sessionsActivity, 3));
    }

    public static void Y(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(sessionsActivity.getParentActivity(), 3, null);
            e2Var.f22573i0 = false;
            e2Var.show();
            if (sessionsActivity.v == 0) {
                int i11 = sessionsActivity.J;
                if (i10 >= i11 && i10 < sessionsActivity.K) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i10 - i11);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new as0(sessionsActivity, e2Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new as0(sessionsActivity, e2Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void Z(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f36212n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.n0();
        }
        n71 n71Var = sessionsActivity.f36208a;
        if (n71Var != null) {
            n71Var.l();
        }
        nx0 nx0Var = sessionsActivity.X;
        if (nx0Var != null) {
            nx0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new d71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23579p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23316b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.c10(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.v;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 6));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.f36208a = new n71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f36210c = uzVar;
        uzVar.b();
        k10 k10Var = new k10(3, context, this);
        this.f36209b = k10Var;
        k10Var.u1();
        this.f36209b.setLayoutManager(new ig.a0(1, false, 18));
        this.f36209b.setSectionsDrawBackground(true);
        this.f36209b.setVerticalScrollBarEnabled(false);
        this.f36209b.setEmptyView(this.f36210c);
        k10 k10Var2 = this.f36209b;
        k10Var2.W1 = true;
        k10Var2.X1 = 0;
        frameLayout.addView(k10Var2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.f36210c, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        this.f36209b.setAdapter(this.f36208a);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        this.f36209b.setItemAnimator(lVar);
        this.f36209b.setOnItemClickListener(new m11(this, 6));
        if (i10 == 0) {
            i71 i71Var = new i71(this, context);
            this.f36213r = i71Var;
            frameLayout.addView(i71Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newSessionReceived) {
            l0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f36209b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36209b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23354d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36210c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23426h6));
        int i10 = org.telegram.ui.ActionBar.y6.f23579p7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36209b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36209b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23595q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36209b, 262144, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36213r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        ArrayList arrayList = this.d;
        int i10 = 0;
        if (arrayList.size() == 0 && this.f36212n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.v == 0) {
            i10 = 1;
        }
        return size + i10;
    }

    public final void l0(final boolean z10) {
        if (this.f36212n) {
            return;
        }
        if (!z10) {
            this.f36212n = true;
        }
        if (this.v == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f37656b;

                {
                    this.f37656b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f37656b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f36212n = false;
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
                                                sessionsActivity2.f36214s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.n0();
                                                nx0 nx0Var = sessionsActivity2.X;
                                                if (nx0Var != null) {
                                                    nx0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity2.f36208a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            nx0 nx0Var2 = sessionsActivity2.X;
                                            if (nx0Var2 != null) {
                                                nx0Var2.a();
                                            }
                                            int i11 = sessionsActivity2.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity2.U = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new d71(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Z(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f37656b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f36212n = false;
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
                                                sessionsActivity22.f36214s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.n0();
                                                nx0 nx0Var = sessionsActivity22.X;
                                                if (nx0Var != null) {
                                                    nx0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity22.f36208a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            nx0 nx0Var2 = sessionsActivity22.X;
                                            if (nx0Var2 != null) {
                                                nx0Var2.a();
                                            }
                                            int i11 = sessionsActivity22.U;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                sessionsActivity22.U = i12;
                                                if (i12 > 0) {
                                                    AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.Z(sessionsActivity2, tL_error, tLObject, z12);
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
            public final SessionsActivity f37656b;

            {
                this.f37656b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f37656b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f36212n = false;
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
                                            sessionsActivity22.f36214s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.n0();
                                            nx0 nx0Var = sessionsActivity22.X;
                                            if (nx0Var != null) {
                                                nx0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.f36208a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        nx0 nx0Var2 = sessionsActivity22.X;
                                        if (nx0Var2 != null) {
                                            nx0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Z(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f37656b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f36212n = false;
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
                                            sessionsActivity22.f36214s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.n0();
                                            nx0 nx0Var = sessionsActivity22.X;
                                            if (nx0Var != null) {
                                                nx0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.f36208a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        nx0 nx0Var2 = sessionsActivity22.X;
                                        if (nx0Var2 != null) {
                                            nx0Var2.a();
                                        }
                                        int i11 = sessionsActivity22.U;
                                        if (i11 > 0) {
                                            int i12 = i11 - 1;
                                            sessionsActivity22.U = i12;
                                            if (i12 > 0) {
                                                AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.Z(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    public final void m0() {
        this.V = true;
    }

    public final void n0() {
        this.R = 0;
        this.f36215w = -1;
        this.f36216x = -1;
        this.terminateAllSessionsRow = -1;
        this.f36217y = -1;
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
        if (this.f36212n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.f36215w = i12;
                this.R = i12 + 2;
                this.f36216x = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.f36215w = i13;
            this.R = i13 + 2;
            this.f36216x = i13 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.f36217y = -1;
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
            this.f36217y = i15 + 1;
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
            ArrayList arrayList3 = this.f36211f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i19 = this.R;
                this.L = i19;
                int size2 = this.f36211f.size() + i19;
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
            ArrayList arrayList4 = this.f36211f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.R;
                int i22 = i21 + 1;
                this.R = i22;
                this.I = i21;
                this.L = i22;
                int size4 = this.f36211f.size() + i22;
                this.M = size4;
                this.R = size4 + 1;
                this.N = size4;
            }
        }
        if (this.f36214s > 0) {
            int i23 = this.R;
            this.S = i23;
            this.ttlRow = i23 + 1;
            this.R = i23 + 3;
            this.T = i23 + 2;
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        i71 i71Var = this.f36213r;
        if (i71Var != null) {
            i71Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        n0();
        l0(false);
        if (this.v == 0) {
            jg.f.a(this.currentAccount).c(new f71(this, 0));
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
        i71 i71Var = this.f36213r;
        if (i71Var != null) {
            i71Var.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        i71 i71Var = this.f36213r;
        if (i71Var != null) {
            i71Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                y9.f0(getParentActivity(), 2, new m71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22366a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new g71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.y6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        n71 n71Var = this.f36208a;
        if (n71Var != null) {
            n71Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.W = true;
            for (int i10 = 0; i10 < this.f36209b.getChildCount(); i10++) {
                View childAt = this.f36209b.getChildAt(i10);
                if (childAt instanceof o71) {
                    ((o71) childAt).f42112b.invalidate();
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
