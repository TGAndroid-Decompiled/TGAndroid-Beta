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
public class SessionsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public lt0 X;
    public y21 f41927a;
    public zs f41928b;
    public org.telegram.ui.Components.iy f41929c;
    public final ArrayList d;
    public final ArrayList f41930e;
    public ArrayList f41931f;
    public TLRPC.TL_authorization h;
    public boolean f41932n;
    public u21 f41933r;
    public int f41934s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f41935w;
    public int f41936x;
    public int f41937y;

    public SessionsActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f41930e = new ArrayList();
        this.f41931f = new ArrayList();
        this.U = 0;
        this.f41935w = i7;
    }

    public static void Z(SessionsActivity sessionsActivity, int i7) {
        int i10;
        String str;
        int L;
        int L2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z9;
        String x10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        ArrayList arrayList;
        String M0;
        int i15;
        boolean z11;
        ArrayList arrayList2 = sessionsActivity.d;
        int i16 = sessionsActivity.f41935w;
        float f10 = 4.0f;
        boolean z12 = true;
        if (i7 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i17 = sessionsActivity.f41934s;
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
                String M02 = org.telegram.messenger.hd.M0(2131745554, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M02;
                String[] strArr = {org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(3, "Months", new Object[0]), org.telegram.messenger.hd.G(6, "Months", new Object[0]), org.telegram.messenger.hd.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i18 = 0;
                while (i18 < 4) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(sessionsActivity.getParentActivity(), null);
                    float f11 = f10;
                    j6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                    j6Var.setTag(Integer.valueOf(i18));
                    j6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27904g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j6Var.b(str2, z11);
                    linearLayout.addView(j6Var);
                    j6Var.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27940i6, false), 2, -1));
                    j6Var.setOnClickListener(new fk0(10, sessionsActivity, alertDialog$Builder));
                    i18++;
                    f10 = f11;
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                sessionsActivity.showDialog(u1Var);
            }
        } else if (i7 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.f41931f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.f41931f;
                    int size = arrayList4.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj = arrayList4.get(i19);
                        i19++;
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (a22 != null) {
                            String n10 = org.telegram.messenger.t10.n(a22);
                            if (!TextUtils.isEmpty(n10)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) n10);
                                append.setSpan(new org.telegram.ui.Components.v31(rf.b.i("https://t.me/", n10), (org.telegram.ui.Components.ty0) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.t10.p(a22));
                            }
                        }
                    }
                    org.telegram.ui.Components.v4.f0(sessionsActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131754071, null), org.telegram.messenger.hd.M0(2131754072, null), org.telegram.messenger.hd.V(null, null, 2131754271, spannableStringBuilder), org.telegram.messenger.hd.M0(2131744210, null), new r21(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                if (i16 == 0) {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131754072, null);
                    u1Var2.R = org.telegram.messenger.hd.M0(2131754071, null);
                    M0 = org.telegram.messenger.hd.M0(2131744210, null);
                } else {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131754062, null);
                    u1Var2.R = org.telegram.messenger.hd.M0(2131744200, null);
                    M0 = org.telegram.messenger.hd.M0(2131751392, null);
                }
                alertDialog$Builder2.k(M0, new s21(sessionsActivity, 1));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                sessionsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                }
            }
        } else if (i7 >= sessionsActivity.L && i7 < sessionsActivity.M) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.f41931f) != null && !arrayList.isEmpty()) {
                int i20 = i7 - sessionsActivity.L;
                new kg.i0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f41931f.get(i20), new org.telegram.ui.Components.r2(sessionsActivity, i20, 26), sessionsActivity.resourceProvider).show();
            }
        } else if (((i7 >= sessionsActivity.J && i7 < sessionsActivity.K) || ((i7 >= sessionsActivity.F && i7 < sessionsActivity.G) || i7 == sessionsActivity.f41937y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i7 == sessionsActivity.f41937y) {
                    tL_authorization = sessionsActivity.h;
                    z9 = true;
                } else {
                    int i21 = sessionsActivity.J;
                    if (i7 >= i21 && i7 < sessionsActivity.K) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i7 - i21);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f41930e.get(i7 - sessionsActivity.F);
                    }
                    z9 = false;
                }
                if (tL_authorization != null) {
                    v21 v21Var = new v21(sessionsActivity);
                    ?? v2Var = new org.telegram.ui.ActionBar.v2(sessionsActivity.getParentActivity(), false);
                    v2Var.R0 = true;
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    v2Var.f47364i1 = tL_authorization;
                    v2Var.f47365j1 = sessionsActivity;
                    v2Var.N();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    v2Var.f47366k1 = imageView;
                    imageView.setOnClickListener(new d21(v2Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, c8.ha.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    com.google.android.recaptcha.internal.a.q(textView2, 2, 20.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, c8.ha.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28240y6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, c8.ha.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        x10 = org.telegram.messenger.hd.M0(2131747825, null);
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
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                        i12 = 2131624188;
                    } else if (lowerCase2.contains("edge")) {
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                        i12 = 2131624007;
                    } else if (lowerCase2.contains("chrome")) {
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                        i12 = 2131623985;
                    } else if (lowerCase2.contains("firefox")) {
                        i13 = org.telegram.ui.ActionBar.k6.O7;
                        i12 = 2131624024;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                            i12 = 2131624313;
                        } else if (lowerCase.contains("linux")) {
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                            i12 = 2131624080;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = 2131624071;
                            } else {
                                i14 = 2131624072;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.k6.T7;
                        } else {
                            if (lowerCase.contains("windows")) {
                                i13 = org.telegram.ui.ActionBar.k6.S7;
                            } else if (lowerCase.contains("macos")) {
                                i13 = org.telegram.ui.ActionBar.k6.S7;
                                i12 = 2131624083;
                            } else if (lowerCase.contains("android")) {
                                i13 = org.telegram.ui.ActionBar.k6.R7;
                                i12 = 2131623937;
                            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                                i13 = org.telegram.ui.ActionBar.k6.S7;
                            } else {
                                i13 = org.telegram.ui.ActionBar.k6.U7;
                                i12 = 2131623985;
                            }
                            i12 = 2131624365;
                        }
                        z12 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i11 = 2131231043;
                        } else if (lowerCase2.contains("firefox")) {
                            i11 = 2131231042;
                        } else {
                            i11 = 2131231044;
                        }
                        i12 = i11;
                        i13 = org.telegram.ui.ActionBar.k6.U7;
                        z12 = false;
                    }
                    ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                    imageView.setBackground(L3);
                    org.telegram.ui.ActionBar.r6.k(imageView, L3, N, null, null);
                    if (z12) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.k6.x0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(v2Var.getContext().getDrawable(i12));
                    }
                    org.telegram.ui.Components.eg egVar = new org.telegram.ui.Components.eg(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    ((TextView) egVar.d).setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(2131231787).mutate();
                    View view = egVar.f33235c;
                    int i22 = org.telegram.ui.ActionBar.k6.f28013m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    org.telegram.ui.ActionBar.r6.y((ImageView) view, mutate, i22, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) egVar.f33236e).setText(org.telegram.messenger.hd.M0(2131754222, null));
                    linearLayout2.addView(egVar);
                    if (tL_authorization.country.length() != 0) {
                        org.telegram.ui.Components.eg egVar2 = new org.telegram.ui.Components.eg(parentActivity, false);
                        ((TextView) egVar2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(2131232209).mutate();
                        View view2 = egVar2.f33235c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view2, mutate2, i22, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) egVar2.f33236e).setText(org.telegram.messenger.hd.M0(2131748756, null));
                        egVar2.setOnClickListener(new e21(v2Var, tL_authorization));
                        egVar2.setOnLongClickListener(new f21(v2Var, tL_authorization));
                        int i23 = org.telegram.ui.ActionBar.k6.f27940i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i23, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i23);
                        egVar2.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(egVar2, h02, null, N2, null);
                        linearLayout2.addView(egVar2);
                        egVar.f33234b = true;
                        egVar = egVar2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        org.telegram.ui.Components.eg egVar3 = new org.telegram.ui.Components.eg(parentActivity, false);
                        ((TextView) egVar3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(2131232194).mutate();
                        View view3 = egVar3.f33235c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view3, mutate3, i22, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) egVar3.f33236e).setText(org.telegram.messenger.hd.M0(2131749101, null));
                        egVar3.setOnClickListener(new g21(v2Var, tL_authorization));
                        egVar3.setOnLongClickListener(new h21(v2Var, tL_authorization));
                        int i24 = org.telegram.ui.ActionBar.k6.f27940i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i24, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i24);
                        egVar3.setBackground(h03);
                        org.telegram.ui.ActionBar.r6.k(egVar3, h03, null, N3, null);
                        linearLayout2.addView(egVar3);
                        z10 = true;
                        egVar.f33234b = true;
                        egVar = egVar3;
                    } else {
                        z10 = true;
                    }
                    int i25 = tL_authorization.api_id;
                    if (i25 != 2040 && i25 != 2496) {
                        org.telegram.ui.Components.eg egVar4 = new org.telegram.ui.Components.eg(parentActivity, z10);
                        ((TextView) egVar4.d).setText(org.telegram.messenger.hd.M0(2131754713, null));
                        Drawable mutate4 = parentActivity.getDrawable(2131232355).mutate();
                        View view4 = egVar4.f33235c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view4, mutate4, i22, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) egVar4.f33237f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i26 = org.telegram.ui.ActionBar.k6.f27940i6;
                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i26, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i26);
                        egVar4.setBackground(h04);
                        org.telegram.ui.ActionBar.r6.k(egVar4, h04, null, N4, null);
                        egVar4.setOnClickListener(new i21(v2Var, egVar4, tL_authorization));
                        egVar.f33234b = true;
                        ((TextView) egVar4.f33236e).setText(org.telegram.messenger.hd.M0(2131754712, null));
                        linearLayout2.addView(egVar4);
                        egVar = egVar4;
                    }
                    if (tL_authorization.api_id != 22) {
                        org.telegram.ui.Components.eg egVar5 = new org.telegram.ui.Components.eg(parentActivity, true);
                        ((TextView) egVar5.d).setText(org.telegram.messenger.hd.M0(2131754715, null));
                        Drawable mutate5 = parentActivity.getDrawable(2131232083).mutate();
                        View view5 = egVar5.f33235c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view5, mutate5, i22, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) egVar5.f33237f).c(!tL_authorization.call_requests_disabled, false);
                        int i27 = org.telegram.ui.ActionBar.k6.f27940i6;
                        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i27, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i27);
                        egVar5.setBackground(h05);
                        org.telegram.ui.ActionBar.r6.k(egVar5, h05, null, N5, null);
                        egVar5.setOnClickListener(new j21(v2Var, egVar5, tL_authorization));
                        egVar.f33234b = true;
                        ((TextView) egVar5.f33236e).setText(org.telegram.messenger.hd.M0(2131754714, null));
                        linearLayout2.addView(egVar5);
                    }
                    if (!z9) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        textView4.setText(org.telegram.messenger.hd.M0(2131744206, null));
                        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.Gi, null);
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int i28 = org.telegram.ui.ActionBar.k6.f27981ka;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i28, false);
                        int i29 = org.telegram.ui.ActionBar.k6.f27848d6;
                        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i29, false), 120);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L4, L4, L4, L4, x02, o4, o4);
                        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i28);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i29, 120);
                        textView4.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(textView4, k02, N6, h, null);
                        linearLayout2.addView(textView4, c8.ha.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new k21(v2Var, v21Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    v2Var.N = scrollView;
                    v2Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27292a;
            if (i16 == 0) {
                u1Var3.T = org.telegram.messenger.hd.M0(2131744205, null);
                u1Var3.R = org.telegram.messenger.hd.M0(2131754073, null);
                charSequence = org.telegram.messenger.hd.M0(2131744210, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i7 - sessionsActivity.J);
                u1Var3.T = org.telegram.messenger.hd.a0("TerminateWebSessionText", null, 2131744202, tL_webAuthorization.domain);
                u1Var3.R = org.telegram.messenger.hd.M0(2131744201, null);
                CharSequence M03 = org.telegram.messenger.hd.M0(2131751392, null);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User a23 = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(tL_webAuthorization.bot_id));
                if (a23 != null) {
                    i10 = 1;
                    str = org.telegram.messenger.t10.j(a23, true);
                } else {
                    i10 = 1;
                    str = "";
                }
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(sessionsActivity.getParentActivity(), i10);
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                Object[] objArr = new Object[i10];
                objArr[0] = str;
                c2Var.e(org.telegram.messenger.hd.a0("TerminateWebSessionStop", null, 2131744203, objArr), "", false, false, false);
                if (org.telegram.messenger.hd.f22871a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.hd.f22871a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                c2Var.setPadding(L, 0, L2, 0);
                frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setOnClickListener(new j8(6, zArr));
                u1Var3.G = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.k(charSequence, new jg.a2(sessionsActivity, i7, zArr, 14));
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            sessionsActivity.showDialog(u1Var3);
            TextView textView5 = (TextView) u1Var3.d(-1);
            if (textView5 != null) {
                org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.f28089q7, null);
            }
        }
    }

    public static void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f41931f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).o1(((TL_account.TL_connectedBot) sessionsActivity.f41931f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new o21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 1));
    }

    public static void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f41935w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new o21(sessionsActivity, 3));
    }

    public static void c0(SessionsActivity sessionsActivity, int i7, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, sessionsActivity.getParentActivity(), null);
            u1Var.f28568i0 = false;
            u1Var.show();
            if (sessionsActivity.f41935w == 0) {
                int i10 = sessionsActivity.J;
                if (i7 >= i10 && i7 < sessionsActivity.K) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i7 - i10);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f41930e.get(i7 - sessionsActivity.F);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new ko0(sessionsActivity, u1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i7 - sessionsActivity.J);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new ko0(sessionsActivity, u1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f41932n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).Y3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        y21 y21Var = sessionsActivity.f41927a;
        if (y21Var != null) {
            y21Var.f();
        }
        lt0 lt0Var = sessionsActivity.X;
        if (lt0Var != null) {
            lt0Var.a();
        }
        int i7 = sessionsActivity.U;
        if (i7 > 0) {
            int i10 = i7 - 1;
            sessionsActivity.U = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.i3(new p21(sessionsActivity, z9, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28069p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.lz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = this.f41935w;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131742912, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mt0(this, 10));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f41927a = new y21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f41929c = iyVar;
        iyVar.b();
        zs zsVar = new zs(7, context, this);
        this.f41928b = zsVar;
        zsVar.r1();
        this.f41928b.setLayoutManager(new jg.b0(1, false, 18));
        this.f41928b.setSectionsDrawBackground(true);
        this.f41928b.setVerticalScrollBarEnabled(false);
        this.f41928b.setEmptyView(this.f41929c);
        zs zsVar2 = this.f41928b;
        zsVar2.W1 = true;
        zsVar2.X1 = 0;
        frameLayout.addView(zsVar2, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f41929c, c8.ha.e(-1, -1, 17));
        this.f41928b.setAdapter(this.f41927a);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        this.f41928b.setItemAnimator(kVar);
        this.f41928b.setOnItemClickListener(new vx0(this, 5));
        if (i7 == 0) {
            u21 u21Var = new u21(this, context);
            this.f41933r = u21Var;
            frameLayout.addView(u21Var, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25067u0) {
            p0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41928b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41928b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.s6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41929c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h6));
        int i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41928b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41928b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28088q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41928b, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41933r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        int i7 = 0;
        if (arrayList.size() == 0 && this.f41932n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f41935w == 0) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final void onBecomeFullyHidden() {
        u21 u21Var = this.f41933r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.f41935w == 0) {
            kg.f.a(this.currentAccount).c(new r21(this, 0));
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25067u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25067u0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        u21 u21Var = this.f41933r;
        if (u21Var != null) {
            u21Var.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        u21 u21Var = this.f41933r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 2, new x21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27292a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131746502, null));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new s21(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        y21 y21Var = this.f41927a;
        if (y21Var != null) {
            y21Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && !z10) {
            this.W = true;
            for (int i7 = 0; i7 < this.f41928b.getChildCount(); i7++) {
                View childAt = this.f41928b.getChildAt(i7);
                if (childAt instanceof z21) {
                    ((z21) childAt).f52441b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z9) {
        if (this.f41932n) {
            return;
        }
        if (!z9) {
            this.f41932n = true;
        }
        if (this.f41935w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f47608b;

                {
                    this.f47608b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f47608b;
                            final boolean z10 = z9;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f41930e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f41932n = false;
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
                                                sessionsActivity2.f41934s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                lt0 lt0Var = sessionsActivity2.X;
                                                if (lt0Var != null) {
                                                    lt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity2.f41927a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            lt0 lt0Var2 = sessionsActivity2.X;
                                            if (lt0Var2 != null) {
                                                lt0Var2.a();
                                            }
                                            int i10 = sessionsActivity2.U;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity2.U = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new p21(sessionsActivity2, z10, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z10);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f47608b;
                            final boolean z11 = z9;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f41930e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f41932n = false;
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
                                                sessionsActivity22.f41934s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                lt0 lt0Var = sessionsActivity22.X;
                                                if (lt0Var != null) {
                                                    lt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity22.f41927a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            lt0 lt0Var2 = sessionsActivity22.X;
                                            if (lt0Var2 != null) {
                                                lt0Var2.a();
                                            }
                                            int i10 = sessionsActivity22.U;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity22.U = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z11, 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z11);
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
            public final SessionsActivity f47608b;

            {
                this.f47608b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f47608b;
                        final boolean z10 = z9;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f41930e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f41932n = false;
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
                                            sessionsActivity22.f41934s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            lt0 lt0Var = sessionsActivity22.X;
                                            if (lt0Var != null) {
                                                lt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.f41927a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        lt0 lt0Var2 = sessionsActivity22.X;
                                        if (lt0Var2 != null) {
                                            lt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.U;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.U = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z10, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z10);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f47608b;
                        final boolean z11 = z9;
                        org.telegram.messenger.g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f41930e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f41932n = false;
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
                                            sessionsActivity22.f41934s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            lt0 lt0Var = sessionsActivity22.X;
                                            if (lt0Var != null) {
                                                lt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.f41927a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        lt0 lt0Var2 = sessionsActivity22.X;
                                        if (lt0Var2 != null) {
                                            lt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.U;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.U = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z11, 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z11);
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
        this.V = true;
    }

    public final void r0() {
        this.R = 0;
        this.f41936x = -1;
        this.f41937y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.P = -1;
        this.Q = -1;
        this.S = -1;
        this.ttlRow = -1;
        this.T = -1;
        int i7 = this.f41935w;
        if (i7 == 0 && getMessagesController().P3) {
            int i10 = this.R;
            this.P = i10;
            this.R = i10 + 2;
            this.Q = i10 + 1;
        }
        if (this.f41932n) {
            if (i7 == 0) {
                int i11 = this.R;
                this.f41936x = i11;
                this.R = i11 + 2;
                this.f41937y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.R;
            this.f41936x = i12;
            this.R = i12 + 2;
            this.f41937y = i12 + 1;
        }
        ArrayList arrayList = this.f41930e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.D = -1;
            if (i7 != 1 && this.h == null) {
                this.O = -1;
            } else {
                int i13 = this.R;
                this.R = i13 + 1;
                this.O = i13;
            }
        } else {
            int i14 = this.R;
            this.terminateAllSessionsRow = i14;
            this.R = i14 + 2;
            this.D = i14 + 1;
            this.O = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.R;
            int i16 = i15 + 1;
            this.R = i16;
            this.E = i15;
            this.F = i16;
            int size = arrayList.size() + i16;
            this.G = size;
            this.R = size + 1;
            this.H = size;
        }
        if (!arrayList2.isEmpty()) {
            int i17 = this.R;
            this.R = i17 + 1;
            this.I = i17;
            ArrayList arrayList3 = this.f41931f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.R;
                this.L = i18;
                int size2 = this.f41931f.size() + i18;
                this.R = size2;
                this.M = size2;
            }
            int i19 = this.R;
            this.J = i19;
            this.K = arrayList2.size() + i19;
            int size3 = arrayList2.size() + this.R;
            this.R = size3 + 1;
            this.N = size3;
        } else {
            ArrayList arrayList4 = this.f41931f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.R;
                int i21 = i20 + 1;
                this.R = i21;
                this.I = i20;
                this.L = i21;
                int size4 = this.f41931f.size() + i21;
                this.M = size4;
                this.R = size4 + 1;
                this.N = size4;
            }
        }
        if (this.f41934s > 0) {
            int i22 = this.R;
            this.S = i22;
            this.ttlRow = i22 + 1;
            this.R = i22 + 3;
            this.T = i22 + 2;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
