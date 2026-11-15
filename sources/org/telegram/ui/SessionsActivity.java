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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
public class SessionsActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public kt0 Y;
    public v21 f43327a;
    public ct f43328b;
    public org.telegram.ui.Components.ny f43329c;
    public final ArrayList d;
    public final ArrayList f43330e;
    public ArrayList f43331f;
    public TLRPC.TL_authorization h;
    public boolean f43332n;
    public r21 f43333r;
    public int f43334s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f43335w;
    public int f43336x;
    public int f43337y;

    public SessionsActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f43330e = new ArrayList();
        this.f43331f = new ArrayList();
        this.V = 0;
        this.f43335w = i7;
    }

    public static void Z(SessionsActivity sessionsActivity, int i7) {
        int i10;
        String str;
        int L;
        int L2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        String x10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        ArrayList arrayList;
        String M0;
        int i15;
        boolean z12;
        ArrayList arrayList2 = sessionsActivity.d;
        int i16 = sessionsActivity.f43335w;
        float f10 = 4.0f;
        boolean z13 = true;
        if (i7 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i17 = sessionsActivity.f43334s;
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
                String M02 = org.telegram.messenger.hd.M0(2131745553, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M02;
                String[] strArr = {org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(3, "Months", new Object[0]), org.telegram.messenger.hd.G(6, "Months", new Object[0]), org.telegram.messenger.hd.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(sessionsActivity.getParentActivity(), null);
                    float f11 = f10;
                    i6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                    i6Var.setTag(Integer.valueOf(i18));
                    i6Var.a(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28905g7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i6Var.b(str2, z12);
                    linearLayout.addView(i6Var);
                    i6Var.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false), 2, -1));
                    i6Var.setOnClickListener(new a90(18, sessionsActivity, alertDialog$Builder));
                    i18++;
                    f10 = f11;
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                sessionsActivity.showDialog(t1Var);
            }
        } else if (i7 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.f43331f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.f43331f;
                    int size = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj = arrayList4.get(i19);
                        i19++;
                        TLRPC.User a22 = org.telegram.messenger.np.s1(sessionsActivity.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (a22 != null) {
                            String n10 = org.telegram.messenger.q10.n(a22);
                            if (!TextUtils.isEmpty(n10)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) n10);
                                append.setSpan(new org.telegram.ui.Components.f41(r.b.k("https://t.me/", n10), (org.telegram.ui.Components.wy0) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.q10.p(a22));
                            }
                        }
                    }
                    org.telegram.ui.Components.t4.f0(sessionsActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131754071, null), org.telegram.messenger.hd.M0(2131754072, null), org.telegram.messenger.hd.V(null, null, 2131754271, spannableStringBuilder), org.telegram.messenger.hd.M0(2131744209, null), new o21(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                if (i16 == 0) {
                    t1Var2.U = org.telegram.messenger.hd.M0(2131754072, null);
                    t1Var2.S = org.telegram.messenger.hd.M0(2131754071, null);
                    M0 = org.telegram.messenger.hd.M0(2131744209, null);
                } else {
                    t1Var2.U = org.telegram.messenger.hd.M0(2131754062, null);
                    t1Var2.S = org.telegram.messenger.hd.M0(2131744199, null);
                    M0 = org.telegram.messenger.hd.M0(2131751391, null);
                }
                alertDialog$Builder2.k(M0, new p21(sessionsActivity, 1));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                sessionsActivity.showDialog(t1Var2);
                TextView textView = (TextView) t1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                }
            }
        } else if (i7 >= sessionsActivity.M && i7 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.f43331f) != null && !arrayList.isEmpty()) {
                int i20 = i7 - sessionsActivity.M;
                new kg.i0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f43331f.get(i20), new org.telegram.ui.Components.a2(sessionsActivity, i20, 29), sessionsActivity.resourceProvider).show();
            }
        } else if (((i7 >= sessionsActivity.K && i7 < sessionsActivity.L) || ((i7 >= sessionsActivity.G && i7 < sessionsActivity.H) || i7 == sessionsActivity.f43337y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i7 == sessionsActivity.f43337y) {
                    tL_authorization = sessionsActivity.h;
                    z10 = true;
                } else {
                    int i21 = sessionsActivity.K;
                    if (i7 >= i21 && i7 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i7 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f43330e.get(i7 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    s21 s21Var = new s21(sessionsActivity);
                    ?? u2Var = new org.telegram.ui.ActionBar.u2(sessionsActivity.getParentActivity(), false);
                    u2Var.S0 = true;
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    u2Var.f47887m1 = tL_authorization;
                    u2Var.n1 = sessionsActivity;
                    u2Var.O();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    u2Var.f47888o1 = imageView;
                    imageView.setOnClickListener(new a21(u2Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, c8.ja.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    i5.c.v(textView2, 2, 20.0f);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, c8.ja.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29241y6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, c8.ja.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        x10 = org.telegram.messenger.hd.M0(2131747826, null);
                    } else {
                        x10 = org.telegram.messenger.hd.x(tL_authorization.date_active, true);
                    }
                    textView3.setText(x10);
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
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                        i12 = 2131624189;
                    } else if (lowerCase2.contains("edge")) {
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                        i12 = 2131624008;
                    } else if (lowerCase2.contains("chrome")) {
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                        i12 = 2131623986;
                    } else if (lowerCase2.contains("firefox")) {
                        i13 = org.telegram.ui.ActionBar.j6.O7;
                        i12 = 2131624025;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                            i12 = 2131624314;
                        } else if (lowerCase.contains("linux")) {
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                            i12 = 2131624081;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = 2131624072;
                            } else {
                                i14 = 2131624073;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.j6.T7;
                        } else {
                            if (lowerCase.contains("windows")) {
                                i13 = org.telegram.ui.ActionBar.j6.S7;
                            } else if (lowerCase.contains("macos")) {
                                i13 = org.telegram.ui.ActionBar.j6.S7;
                                i12 = 2131624084;
                            } else if (lowerCase.contains("android")) {
                                i13 = org.telegram.ui.ActionBar.j6.R7;
                                i12 = 2131623937;
                            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                                i13 = org.telegram.ui.ActionBar.j6.S7;
                            } else {
                                i13 = org.telegram.ui.ActionBar.j6.U7;
                                i12 = 2131623986;
                            }
                            i12 = 2131624366;
                        }
                        z13 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i11 = 2131231043;
                        } else if (lowerCase2.contains("firefox")) {
                            i11 = 2131231042;
                        } else {
                            i11 = 2131231044;
                        }
                        i12 = i11;
                        i13 = org.telegram.ui.ActionBar.j6.U7;
                        z13 = false;
                    }
                    ShapeDrawable L3 = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.j6.x0(null, i13, false));
                    org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                    imageView.setBackground(L3);
                    org.telegram.ui.ActionBar.q6.j(imageView, L3, M, null, null);
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.j6.x0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(u2Var.getContext().getDrawable(i12));
                    }
                    org.telegram.ui.Components.kg kgVar = new org.telegram.ui.Components.kg(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    ((TextView) kgVar.d).setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(2131231787).mutate();
                    View view = kgVar.f36417c;
                    int i22 = org.telegram.ui.ActionBar.j6.f29014m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    org.telegram.ui.ActionBar.q6.x((ImageView) view, mutate, i22, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) kgVar.f36418e).setText(org.telegram.messenger.hd.M0(2131754222, null));
                    linearLayout2.addView(kgVar);
                    if (tL_authorization.country.length() != 0) {
                        org.telegram.ui.Components.kg kgVar2 = new org.telegram.ui.Components.kg(parentActivity, false);
                        ((TextView) kgVar2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(2131232210).mutate();
                        View view2 = kgVar2.f36417c;
                        org.telegram.ui.ActionBar.q6.x((ImageView) view2, mutate2, i22, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) kgVar2.f36418e).setText(org.telegram.messenger.hd.M0(2131748757, null));
                        kgVar2.setOnClickListener(new b21(u2Var, tL_authorization));
                        kgVar2.setOnLongClickListener(new c21(u2Var, tL_authorization));
                        int i23 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i23, false), 2, -1);
                        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i23);
                        kgVar2.setBackground(h02);
                        org.telegram.ui.ActionBar.q6.j(kgVar2, h02, null, M2, null);
                        linearLayout2.addView(kgVar2);
                        kgVar.f36416b = true;
                        kgVar = kgVar2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        org.telegram.ui.Components.kg kgVar3 = new org.telegram.ui.Components.kg(parentActivity, false);
                        ((TextView) kgVar3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(2131232195).mutate();
                        View view3 = kgVar3.f36417c;
                        org.telegram.ui.ActionBar.q6.x((ImageView) view3, mutate3, i22, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) kgVar3.f36418e).setText(org.telegram.messenger.hd.M0(2131749102, null));
                        kgVar3.setOnClickListener(new d21(u2Var, tL_authorization));
                        kgVar3.setOnLongClickListener(new e21(u2Var, tL_authorization));
                        int i24 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i24, false), 2, -1);
                        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i24);
                        kgVar3.setBackground(h03);
                        org.telegram.ui.ActionBar.q6.j(kgVar3, h03, null, M3, null);
                        linearLayout2.addView(kgVar3);
                        z11 = true;
                        kgVar.f36416b = true;
                        kgVar = kgVar3;
                    } else {
                        z11 = true;
                    }
                    int i25 = tL_authorization.api_id;
                    if (i25 != 2040 && i25 != 2496) {
                        org.telegram.ui.Components.kg kgVar4 = new org.telegram.ui.Components.kg(parentActivity, z11);
                        ((TextView) kgVar4.d).setText(org.telegram.messenger.hd.M0(2131754713, null));
                        Drawable mutate4 = parentActivity.getDrawable(2131232356).mutate();
                        View view4 = kgVar4.f36417c;
                        org.telegram.ui.ActionBar.q6.x((ImageView) view4, mutate4, i22, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) kgVar4.f36419f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i26 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i26, false), 7, -1);
                        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i26);
                        kgVar4.setBackground(h04);
                        org.telegram.ui.ActionBar.q6.j(kgVar4, h04, null, M4, null);
                        kgVar4.setOnClickListener(new f21(u2Var, kgVar4, tL_authorization));
                        kgVar.f36416b = true;
                        ((TextView) kgVar4.f36418e).setText(org.telegram.messenger.hd.M0(2131754712, null));
                        linearLayout2.addView(kgVar4);
                        kgVar = kgVar4;
                    }
                    if (tL_authorization.api_id != 22) {
                        org.telegram.ui.Components.kg kgVar5 = new org.telegram.ui.Components.kg(parentActivity, true);
                        ((TextView) kgVar5.d).setText(org.telegram.messenger.hd.M0(2131754715, null));
                        Drawable mutate5 = parentActivity.getDrawable(2131232084).mutate();
                        View view5 = kgVar5.f36417c;
                        org.telegram.ui.ActionBar.q6.x((ImageView) view5, mutate5, i22, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) kgVar5.f36419f).c(!tL_authorization.call_requests_disabled, false);
                        int i27 = org.telegram.ui.ActionBar.j6.f28941i6;
                        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i27, false), 7, -1);
                        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i27);
                        kgVar5.setBackground(h05);
                        org.telegram.ui.ActionBar.q6.j(kgVar5, h05, null, M5, null);
                        kgVar5.setOnClickListener(new g21(u2Var, kgVar5, tL_authorization));
                        kgVar.f36416b = true;
                        ((TextView) kgVar5.f36418e).setText(org.telegram.messenger.hd.M0(2131754714, null));
                        linearLayout2.addView(kgVar5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        textView4.setText(org.telegram.messenger.hd.M0(2131744205, null));
                        org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.Ji, null);
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int i28 = org.telegram.ui.ActionBar.j6.f28982ka;
                        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i28, false);
                        int i29 = org.telegram.ui.ActionBar.j6.f28849d6;
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i29, false), 120);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L4, L4, L4, L4, x02, o4, o4);
                        org.telegram.ui.ActionBar.m6 M6 = org.telegram.ui.ActionBar.q6.M(i28);
                        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i29, 120);
                        textView4.setBackground(k02);
                        org.telegram.ui.ActionBar.q6.j(textView4, k02, M6, g10, null);
                        linearLayout2.addView(textView4, c8.ja.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new h21(u2Var, s21Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    u2Var.O = scrollView;
                    u2Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
            if (i16 == 0) {
                t1Var3.U = org.telegram.messenger.hd.M0(2131744204, null);
                t1Var3.S = org.telegram.messenger.hd.M0(2131754073, null);
                charSequence = org.telegram.messenger.hd.M0(2131744209, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i7 - sessionsActivity.K);
                t1Var3.U = org.telegram.messenger.hd.a0("TerminateWebSessionText", null, 2131744201, tL_webAuthorization.domain);
                t1Var3.S = org.telegram.messenger.hd.M0(2131744200, null);
                CharSequence M03 = org.telegram.messenger.hd.M0(2131751391, null);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User a23 = org.telegram.messenger.np.s1(sessionsActivity.currentAccount).a2(Long.valueOf(tL_webAuthorization.bot_id));
                if (a23 != null) {
                    i10 = 1;
                    str = org.telegram.messenger.q10.j(a23, true);
                } else {
                    i10 = 1;
                    str = "";
                }
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(sessionsActivity.getParentActivity(), i10);
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.N0(false));
                Object[] objArr = new Object[i10];
                objArr[0] = str;
                c2Var.e(org.telegram.messenger.hd.a0("TerminateWebSessionStop", null, 2131744202, objArr), "", false, false, false);
                if (org.telegram.messenger.hd.f24101a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.hd.f24101a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                frameLayout.addView(c2Var, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setOnClickListener(new k8(6, zArr));
                t1Var3.H = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.k(charSequence, new ai.q1(sessionsActivity, i7, zArr, 15));
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            sessionsActivity.showDialog(t1Var3);
            TextView textView5 = (TextView) t1Var3.d(-1);
            if (textView5 != null) {
                org.telegram.ui.ActionBar.q6.U(textView5, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        }
    }

    public static void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f43331f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.np.s1(sessionsActivity.currentAccount).o1(((TL_account.TL_connectedBot) sessionsActivity.f43331f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new l21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new l21(sessionsActivity, 1));
    }

    public static void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f43335w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new l21(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new l21(sessionsActivity, 3));
    }

    public static void c0(SessionsActivity sessionsActivity, int i7, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, sessionsActivity.getParentActivity(), null);
            t1Var.f29637j0 = false;
            t1Var.show();
            if (sessionsActivity.f43335w == 0) {
                int i10 = sessionsActivity.K;
                if (i7 >= i10 && i7 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i7 - i10);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f43330e.get(i7 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new jo0(sessionsActivity, t1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i7 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new jo0(sessionsActivity, t1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.np.s1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f43332n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.np.s1(sessionsActivity.currentAccount).Y3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        v21 v21Var = sessionsActivity.f43327a;
        if (v21Var != null) {
            v21Var.f();
        }
        kt0 kt0Var = sessionsActivity.Y;
        if (kt0Var != null) {
            kt0Var.a();
        }
        int i7 = sessionsActivity.V;
        if (i7 > 0) {
            int i10 = i7 - 1;
            sessionsActivity.V = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.i3(new m21(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.pz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f43335w;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751455, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131742911, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 11));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f43327a = new v21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.f43329c = nyVar;
        nyVar.b();
        ct ctVar = new ct(7, context, this);
        this.f43328b = ctVar;
        ctVar.r1();
        this.f43328b.setLayoutManager(new jg.b0(1, false, 18));
        this.f43328b.setSectionsDrawBackground(true);
        this.f43328b.setVerticalScrollBarEnabled(false);
        this.f43328b.setEmptyView(this.f43329c);
        ct ctVar2 = this.f43328b;
        ctVar2.X1 = true;
        ctVar2.Y1 = 0;
        frameLayout.addView(ctVar2, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.f43329c, c8.ja.e(-1, -1, 17));
        this.f43328b.setAdapter(this.f43327a);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        this.f43328b.setItemAnimator(kVar);
        this.f43328b.setOnItemClickListener(new ux0(this, 5));
        if (i7 == 0) {
            r21 r21Var = new r21(this, context);
            this.f43333r = r21Var;
            frameLayout.addView(r21Var, c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25580u0) {
            p0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43328b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43328b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43329c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        int i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43328b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43328b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29089q6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43328b, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43333r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        int i7 = 0;
        if (arrayList.size() == 0 && this.f43332n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f43335w == 0) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final void onBecomeFullyHidden() {
        r21 r21Var = this.f43333r;
        if (r21Var != null) {
            r21Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.f43335w == 0) {
            kg.f.a(this.currentAccount).c(new o21(this, 0));
        }
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25580u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25580u0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        r21 r21Var = this.f43333r;
        if (r21Var != null) {
            r21Var.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        r21 r21Var = this.f43333r;
        if (r21Var != null) {
            r21Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                t9.j0(getParentActivity(), 2, new u21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746503, null));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new p21(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.j6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        v21 v21Var = this.f43327a;
        if (v21Var != null) {
            v21Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i7 = 0; i7 < this.f43328b.getChildCount(); i7++) {
                View childAt = this.f43328b.getChildAt(i7);
                if (childAt instanceof w21) {
                    ((w21) childAt).f52369b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z10) {
        if (this.f43332n) {
            return;
        }
        if (!z10) {
            this.f43332n = true;
        }
        if (this.f43335w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f48203b;

                {
                    this.f48203b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f48203b;
                            final boolean z11 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f43330e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f43332n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i7 = 0; i7 < size; i7++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i7);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.f43334s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                kt0 kt0Var = sessionsActivity2.Y;
                                                if (kt0Var != null) {
                                                    kt0Var.a();
                                                }
                                            }
                                            v21 v21Var = sessionsActivity2.f43327a;
                                            if (v21Var != null) {
                                                v21Var.f();
                                            }
                                            kt0 kt0Var2 = sessionsActivity2.Y;
                                            if (kt0Var2 != null) {
                                                kt0Var2.a();
                                            }
                                            int i10 = sessionsActivity2.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity2.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new m21(sessionsActivity2, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f48203b;
                            final boolean z12 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f43330e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f43332n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i7 = 0; i7 < size; i7++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i7);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.f43334s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                kt0 kt0Var = sessionsActivity22.Y;
                                                if (kt0Var != null) {
                                                    kt0Var.a();
                                                }
                                            }
                                            v21 v21Var = sessionsActivity22.f43327a;
                                            if (v21Var != null) {
                                                v21Var.f();
                                            }
                                            kt0 kt0Var2 = sessionsActivity22.Y;
                                            if (kt0Var2 != null) {
                                                kt0Var2.a();
                                            }
                                            int i10 = sessionsActivity22.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity22.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new m21(sessionsActivity22, z12, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
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
            public final SessionsActivity f48203b;

            {
                this.f48203b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f48203b;
                        final boolean z11 = z10;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f43330e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f43332n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i7 = 0; i7 < size; i7++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i7);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f43334s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            kt0 kt0Var = sessionsActivity22.Y;
                                            if (kt0Var != null) {
                                                kt0Var.a();
                                            }
                                        }
                                        v21 v21Var = sessionsActivity22.f43327a;
                                        if (v21Var != null) {
                                            v21Var.f();
                                        }
                                        kt0 kt0Var2 = sessionsActivity22.Y;
                                        if (kt0Var2 != null) {
                                            kt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new m21(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f48203b;
                        final boolean z12 = z10;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f43330e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f43332n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i7 = 0; i7 < size; i7++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i7);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.f43334s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            kt0 kt0Var = sessionsActivity22.Y;
                                            if (kt0Var != null) {
                                                kt0Var.a();
                                            }
                                        }
                                        v21 v21Var = sessionsActivity22.f43327a;
                                        if (v21Var != null) {
                                            v21Var.f();
                                        }
                                        kt0 kt0Var2 = sessionsActivity22.Y;
                                        if (kt0Var2 != null) {
                                            kt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new m21(sessionsActivity22, z12, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    public final void q0() {
        this.W = true;
    }

    public final void r0() {
        this.S = 0;
        this.f43336x = -1;
        this.f43337y = -1;
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
        int i7 = this.f43335w;
        if (i7 == 0 && getMessagesController().Q3) {
            int i10 = this.S;
            this.Q = i10;
            this.S = i10 + 2;
            this.R = i10 + 1;
        }
        if (this.f43332n) {
            if (i7 == 0) {
                int i11 = this.S;
                this.f43336x = i11;
                this.S = i11 + 2;
                this.f43337y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.S;
            this.f43336x = i12;
            this.S = i12 + 2;
            this.f43337y = i12 + 1;
        }
        ArrayList arrayList = this.f43330e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i7 != 1 && this.h == null) {
                this.P = -1;
            } else {
                int i13 = this.S;
                this.S = i13 + 1;
                this.P = i13;
            }
        } else {
            int i14 = this.S;
            this.terminateAllSessionsRow = i14;
            this.S = i14 + 2;
            this.E = i14 + 1;
            this.P = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.F = i15;
            this.G = i16;
            int size = arrayList.size() + i16;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.S;
            this.S = i17 + 1;
            this.J = i17;
            ArrayList arrayList3 = this.f43331f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.S;
                this.M = i18;
                int size2 = this.f43331f.size() + i18;
                this.S = size2;
                this.N = size2;
            }
            int i19 = this.S;
            this.K = i19;
            this.L = arrayList2.size() + i19;
            int size3 = arrayList2.size() + this.S;
            this.S = size3 + 1;
            this.O = size3;
        } else {
            ArrayList arrayList4 = this.f43331f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.S;
                int i21 = i20 + 1;
                this.S = i21;
                this.J = i20;
                this.M = i21;
                int size4 = this.f43331f.size() + i21;
                this.N = size4;
                this.S = size4 + 1;
                this.O = size4;
            }
        }
        if (this.f43334s > 0) {
            int i22 = this.S;
            this.T = i22;
            this.ttlRow = i22 + 1;
            this.S = i22 + 3;
            this.U = i22 + 2;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
