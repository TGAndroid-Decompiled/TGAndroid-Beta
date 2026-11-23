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
public class SessionsActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public mt0 Y;
    public y21 f43899a;
    public dt f43900b;
    public org.telegram.ui.Components.sy f43901c;
    public final ArrayList d;
    public final ArrayList f43902e;
    public ArrayList f43903f;
    public TLRPC.TL_authorization h;
    public boolean f43904n;
    public u21 f43905r;
    public int f43906s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int f43907w;
    public int f43908x;
    public int f43909y;

    public SessionsActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.f43902e = new ArrayList();
        this.f43903f = new ArrayList();
        this.V = 0;
        this.f43907w = i7;
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
        String N0;
        int i15;
        boolean z12;
        ArrayList arrayList2 = sessionsActivity.d;
        int i16 = sessionsActivity.f43907w;
        boolean z13 = true;
        if (i7 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() != null) {
                int i17 = sessionsActivity.f43906s;
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
                String N02 = org.telegram.messenger.gd.N0(2131745357, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N02;
                String[] strArr = {org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.G(3, "Months", new Object[0]), org.telegram.messenger.gd.G(6, "Months", new Object[0]), org.telegram.messenger.gd.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                int i18 = 0;
                for (int i19 = 4; i18 < i19; i19 = 4) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(sessionsActivity.getParentActivity(), null);
                    j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    j6Var.setTag(Integer.valueOf(i18));
                    j6Var.a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29507g7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E5, false));
                    String str2 = strArr[i18];
                    if (i15 == i18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    j6Var.b(str2, z12);
                    linearLayout.addView(j6Var);
                    j6Var.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false), 2, -1));
                    j6Var.setOnClickListener(new ig0(12, sessionsActivity, alertDialog$Builder));
                    i18++;
                }
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                sessionsActivity.showDialog(t1Var);
            }
        } else if (i7 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() != null) {
                ArrayList arrayList3 = sessionsActivity.f43903f;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList4 = sessionsActivity.f43903f;
                    int size = arrayList4.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj = arrayList4.get(i20);
                        i20++;
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(sessionsActivity.currentAccount).c2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (c22 != null) {
                            String o4 = org.telegram.messenger.n10.o(c22);
                            if (!TextUtils.isEmpty(o4)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) o4);
                                append.setSpan(new org.telegram.ui.Components.r41(p5.c.k("https://t.me/", o4), (org.telegram.ui.Components.ez0) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.n10.q(c22));
                            }
                        }
                    }
                    org.telegram.ui.Components.b5.f0(sessionsActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131754068, null), org.telegram.messenger.gd.N0(2131754069, null), org.telegram.messenger.gd.V(null, null, 2131754268, spannableStringBuilder), org.telegram.messenger.gd.N0(2131743964, null), new r21(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                if (i16 == 0) {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131754069, null);
                    t1Var2.S = org.telegram.messenger.gd.N0(2131754068, null);
                    N0 = org.telegram.messenger.gd.N0(2131743964, null);
                } else {
                    t1Var2.U = org.telegram.messenger.gd.N0(2131754059, null);
                    t1Var2.S = org.telegram.messenger.gd.N0(2131743954, null);
                    N0 = org.telegram.messenger.gd.N0(2131751379, null);
                }
                alertDialog$Builder2.k(N0, new s21(sessionsActivity, 1));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                sessionsActivity.showDialog(t1Var2);
                TextView textView = (TextView) t1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                }
            }
        } else if (i7 >= sessionsActivity.M && i7 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() != null && (arrayList = sessionsActivity.f43903f) != null && !arrayList.isEmpty()) {
                int i21 = i7 - sessionsActivity.M;
                new kg.k0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f43903f.get(i21), new ao0(sessionsActivity, i21, 4), sessionsActivity.resourceProvider).show();
            }
        } else if (((i7 >= sessionsActivity.K && i7 < sessionsActivity.L) || ((i7 >= sessionsActivity.G && i7 < sessionsActivity.H) || i7 == sessionsActivity.f43909y)) && sessionsActivity.getParentActivity() != null) {
            if (i16 == 0) {
                if (i7 == sessionsActivity.f43909y) {
                    tL_authorization = sessionsActivity.h;
                    z10 = true;
                } else {
                    int i22 = sessionsActivity.K;
                    if (i7 >= i22 && i7 < sessionsActivity.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList2.get(i7 - i22);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f43902e.get(i7 - sessionsActivity.G);
                    }
                    z10 = false;
                }
                if (tL_authorization != null) {
                    v21 v21Var = new v21(sessionsActivity);
                    ?? w2Var = new org.telegram.ui.ActionBar.w2(sessionsActivity.getParentActivity(), false);
                    w2Var.S0 = true;
                    Activity parentActivity = sessionsActivity.getParentActivity();
                    w2Var.f49578m1 = tL_authorization;
                    w2Var.n1 = sessionsActivity;
                    w2Var.O();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    w2Var.f49579o1 = imageView;
                    imageView.setOnClickListener(new d21(w2Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, c8.na.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    i5.c.x(textView2, 2, 20.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, c8.na.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29843y6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, c8.na.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        x10 = org.telegram.messenger.gd.N0(2131747632, null);
                    } else {
                        x10 = org.telegram.messenger.gd.x(tL_authorization.date_active, true);
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
                        i13 = org.telegram.ui.ActionBar.n6.U7;
                        i12 = 2131624189;
                    } else if (lowerCase2.contains("edge")) {
                        i13 = org.telegram.ui.ActionBar.n6.U7;
                        i12 = 2131624008;
                    } else if (lowerCase2.contains("chrome")) {
                        i13 = org.telegram.ui.ActionBar.n6.U7;
                        i12 = 2131623986;
                    } else if (lowerCase2.contains("firefox")) {
                        i13 = org.telegram.ui.ActionBar.n6.O7;
                        i12 = 2131624025;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i13 = org.telegram.ui.ActionBar.n6.T7;
                            i12 = 2131624314;
                        } else if (lowerCase.contains("linux")) {
                            i13 = org.telegram.ui.ActionBar.n6.T7;
                            i12 = 2131624081;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i14 = 2131624072;
                            } else {
                                i14 = 2131624073;
                            }
                            i12 = i14;
                            i13 = org.telegram.ui.ActionBar.n6.T7;
                        } else {
                            if (lowerCase.contains("windows")) {
                                i13 = org.telegram.ui.ActionBar.n6.S7;
                            } else if (lowerCase.contains("macos")) {
                                i13 = org.telegram.ui.ActionBar.n6.S7;
                                i12 = 2131624084;
                            } else if (lowerCase.contains("android")) {
                                i13 = org.telegram.ui.ActionBar.n6.R7;
                                i12 = 2131623937;
                            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                                i13 = org.telegram.ui.ActionBar.n6.S7;
                            } else {
                                i13 = org.telegram.ui.ActionBar.n6.U7;
                                i12 = 2131623986;
                            }
                            i12 = 2131624366;
                        }
                        z13 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i11 = 2131231045;
                        } else if (lowerCase2.contains("firefox")) {
                            i11 = 2131231044;
                        } else {
                            i11 = 2131231046;
                        }
                        i12 = i11;
                        i13 = org.telegram.ui.ActionBar.n6.U7;
                        z13 = false;
                    }
                    ShapeDrawable L3 = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                    imageView.setBackground(L3);
                    org.telegram.ui.ActionBar.u6.j(imageView, L3, M, null, null);
                    if (z13) {
                        imageView.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.n6.x0(null, i13, false)});
                    } else {
                        imageView.setImageDrawable(w2Var.getContext().getDrawable(i12));
                    }
                    org.telegram.ui.Components.ug ugVar = new org.telegram.ui.Components.ug(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    ((TextView) ugVar.d).setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(2131231791).mutate();
                    View view = ugVar.f40370c;
                    int i23 = org.telegram.ui.ActionBar.n6.f29616m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    org.telegram.ui.ActionBar.u6.x((ImageView) view, mutate, i23, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) ugVar.f40371e).setText(org.telegram.messenger.gd.N0(2131754219, null));
                    linearLayout2.addView(ugVar);
                    if (tL_authorization.country.length() != 0) {
                        org.telegram.ui.Components.ug ugVar2 = new org.telegram.ui.Components.ug(parentActivity, false);
                        ((TextView) ugVar2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(2131232214).mutate();
                        View view2 = ugVar2.f40370c;
                        org.telegram.ui.ActionBar.u6.x((ImageView) view2, mutate2, i23, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) ugVar2.f40371e).setText(org.telegram.messenger.gd.N0(2131748564, null));
                        ugVar2.setOnClickListener(new e21(w2Var, tL_authorization));
                        ugVar2.setOnLongClickListener(new f21(w2Var, tL_authorization));
                        int i24 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i24, false), 2, -1);
                        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i24);
                        ugVar2.setBackground(h02);
                        org.telegram.ui.ActionBar.u6.j(ugVar2, h02, null, M2, null);
                        linearLayout2.addView(ugVar2);
                        ugVar.f40369b = true;
                        ugVar = ugVar2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        org.telegram.ui.Components.ug ugVar3 = new org.telegram.ui.Components.ug(parentActivity, false);
                        ((TextView) ugVar3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(2131232199).mutate();
                        View view3 = ugVar3.f40370c;
                        org.telegram.ui.ActionBar.u6.x((ImageView) view3, mutate3, i23, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) ugVar3.f40371e).setText(org.telegram.messenger.gd.N0(2131748909, null));
                        ugVar3.setOnClickListener(new g21(w2Var, tL_authorization));
                        ugVar3.setOnLongClickListener(new h21(w2Var, tL_authorization));
                        int i25 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i25, false), 2, -1);
                        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i25);
                        ugVar3.setBackground(h03);
                        org.telegram.ui.ActionBar.u6.j(ugVar3, h03, null, M3, null);
                        linearLayout2.addView(ugVar3);
                        z11 = true;
                        ugVar.f40369b = true;
                        ugVar = ugVar3;
                    } else {
                        z11 = true;
                    }
                    int i26 = tL_authorization.api_id;
                    if (i26 != 2040 && i26 != 2496) {
                        org.telegram.ui.Components.ug ugVar4 = new org.telegram.ui.Components.ug(parentActivity, z11);
                        ((TextView) ugVar4.d).setText(org.telegram.messenger.gd.N0(2131754712, null));
                        Drawable mutate4 = parentActivity.getDrawable(2131232360).mutate();
                        View view4 = ugVar4.f40370c;
                        org.telegram.ui.ActionBar.u6.x((ImageView) view4, mutate4, i23, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) ugVar4.f40372f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i27 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i27, false), 7, -1);
                        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i27);
                        ugVar4.setBackground(h04);
                        org.telegram.ui.ActionBar.u6.j(ugVar4, h04, null, M4, null);
                        ugVar4.setOnClickListener(new i21(w2Var, ugVar4, tL_authorization));
                        ugVar.f40369b = true;
                        ((TextView) ugVar4.f40371e).setText(org.telegram.messenger.gd.N0(2131754711, null));
                        linearLayout2.addView(ugVar4);
                        ugVar = ugVar4;
                    }
                    if (tL_authorization.api_id != 22) {
                        org.telegram.ui.Components.ug ugVar5 = new org.telegram.ui.Components.ug(parentActivity, true);
                        ((TextView) ugVar5.d).setText(org.telegram.messenger.gd.N0(2131754714, null));
                        Drawable mutate5 = parentActivity.getDrawable(2131232088).mutate();
                        View view5 = ugVar5.f40370c;
                        org.telegram.ui.ActionBar.u6.x((ImageView) view5, mutate5, i23, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) ugVar5.f40372f).c(!tL_authorization.call_requests_disabled, false);
                        int i28 = org.telegram.ui.ActionBar.n6.f29543i6;
                        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i28, false), 7, -1);
                        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i28);
                        ugVar5.setBackground(h05);
                        org.telegram.ui.ActionBar.u6.j(ugVar5, h05, null, M5, null);
                        ugVar5.setOnClickListener(new j21(w2Var, ugVar5, tL_authorization));
                        ugVar.f40369b = true;
                        ((TextView) ugVar5.f40371e).setText(org.telegram.messenger.gd.N0(2131754713, null));
                        linearLayout2.addView(ugVar5);
                    }
                    if (!z10) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(org.telegram.messenger.g0.o());
                        textView4.setText(org.telegram.messenger.gd.N0(2131743960, null));
                        org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.Ji, null);
                        int L4 = org.telegram.messenger.g0.L(24.0f);
                        int i29 = org.telegram.ui.ActionBar.n6.f29584ka;
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i29, false);
                        int i30 = org.telegram.ui.ActionBar.n6.f29451d6;
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i30, false), 120);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L4, L4, L4, L4, x02, o10, o10);
                        org.telegram.ui.ActionBar.q6 M6 = org.telegram.ui.ActionBar.u6.M(i29);
                        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i30, 120);
                        textView4.setBackground(k02);
                        org.telegram.ui.ActionBar.u6.j(textView4, k02, M6, g10, null);
                        linearLayout2.addView(textView4, c8.na.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new k21(w2Var, v21Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    w2Var.O = scrollView;
                    w2Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28835a;
            if (i16 == 0) {
                t1Var3.U = org.telegram.messenger.gd.N0(2131743959, null);
                t1Var3.S = org.telegram.messenger.gd.N0(2131754070, null);
                charSequence = org.telegram.messenger.gd.N0(2131743964, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i7 - sessionsActivity.K);
                t1Var3.U = org.telegram.messenger.gd.a0("TerminateWebSessionText", null, 2131743956, tL_webAuthorization.domain);
                t1Var3.S = org.telegram.messenger.gd.N0(2131743955, null);
                CharSequence N03 = org.telegram.messenger.gd.N0(2131751379, null);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User c23 = org.telegram.messenger.mp.u1(sessionsActivity.currentAccount).c2(Long.valueOf(tL_webAuthorization.bot_id));
                if (c23 != null) {
                    i10 = 1;
                    str = org.telegram.messenger.n10.k(c23, true);
                } else {
                    i10 = 1;
                    str = "";
                }
                org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(sessionsActivity.getParentActivity(), i10);
                d2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                Object[] objArr = new Object[i10];
                objArr[0] = str;
                d2Var.e(org.telegram.messenger.gd.a0("TerminateWebSessionStop", null, 2131743957, objArr), "", false, false, false);
                if (org.telegram.messenger.gd.f24314a0) {
                    L = org.telegram.messenger.g0.L(16.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                if (org.telegram.messenger.gd.f24314a0) {
                    L2 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    L2 = org.telegram.messenger.g0.L(16.0f);
                }
                d2Var.setPadding(L, 0, L2, 0);
                frameLayout.addView(d2Var, c8.na.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                d2Var.setOnClickListener(new l8(6, zArr));
                t1Var3.H = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = N03;
            }
            alertDialog$Builder3.k(charSequence, new ai.o1(sessionsActivity, i7, zArr, 16));
            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            sessionsActivity.showDialog(t1Var3);
            TextView textView5 = (TextView) t1Var3.d(-1);
            if (textView5 != null) {
                org.telegram.ui.ActionBar.u6.U(textView5, org.telegram.ui.ActionBar.n6.f29692q7, null);
            }
        }
    }

    public static void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f43903f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.mp.u1(sessionsActivity.currentAccount).q1(((TL_account.TL_connectedBot) sessionsActivity.f43903f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new o21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 1));
    }

    public static void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.f43907w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 2));
            return;
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new o21(sessionsActivity, 3));
    }

    public static void c0(SessionsActivity sessionsActivity, int i7, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, sessionsActivity.getParentActivity(), null);
            t1Var.f30091j0 = false;
            t1Var.show();
            if (sessionsActivity.f43907w == 0) {
                int i10 = sessionsActivity.K;
                if (i7 >= i10 && i7 < sessionsActivity.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i7 - i10);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) sessionsActivity.f43902e.get(i7 - sessionsActivity.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new mo0(sessionsActivity, t1Var, tL_authorization, 8));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i7 - sessionsActivity.K);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new mo0(sessionsActivity, t1Var, tL_webAuthorization, 9));
            if (zArr[0]) {
                org.telegram.messenger.mp.u1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
            }
        }
    }

    public static void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.f43904n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.mp.u1(sessionsActivity.currentAccount).f4(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        y21 y21Var = sessionsActivity.f43899a;
        if (y21Var != null) {
            y21Var.f();
        }
        mt0 mt0Var = sessionsActivity.Y;
        if (mt0Var != null) {
            mt0Var.a();
        }
        int i7 = sessionsActivity.V;
        if (i7 > 0) {
            int i10 = i7 - 1;
            sessionsActivity.V = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.h3(new p21(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new org.telegram.ui.Components.vz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i7 = this.f43907w;
        if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751443, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131742640, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 13));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.f43899a = new y21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.f43901c = syVar;
        syVar.b();
        dt dtVar = new dt(7, context, this);
        this.f43900b = dtVar;
        dtVar.r1();
        this.f43900b.setLayoutManager(new jg.b0(1, false, 18));
        this.f43900b.setSectionsDrawBackground(true);
        this.f43900b.setVerticalScrollBarEnabled(false);
        this.f43900b.setEmptyView(this.f43901c);
        dt dtVar2 = this.f43900b;
        dtVar2.X1 = true;
        dtVar2.Y1 = 0;
        frameLayout.addView(dtVar2, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.f43901c, c8.na.e(-1, -1, 17));
        this.f43900b.setAdapter(this.f43899a);
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        this.f43900b.setItemAnimator(lVar);
        this.f43900b.setOnItemClickListener(new xx0(this, 5));
        if (i7 == 0) {
            u21 u21Var = new u21(this, context);
            this.f43905r = u21Var;
            frameLayout.addView(u21Var, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25297u0) {
            p0(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43900b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43900b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.s6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43901c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        int i7 = org.telegram.ui.ActionBar.n6.f29672p7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43900b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43900b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29691q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43900b, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43905r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        int i7 = 0;
        if (arrayList.size() == 0 && this.f43904n) {
            return 0;
        }
        int size = arrayList.size();
        if (this.f43907w == 0) {
            i7 = 1;
        }
        return size + i7;
    }

    @Override
    public final void onBecomeFullyHidden() {
        u21 u21Var = this.f43905r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.f43907w == 0) {
            kg.f.a(this.currentAccount).c(new r21(this, 0));
        }
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25297u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25297u0);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        u21 u21Var = this.f43905r;
        if (u21Var != null) {
            u21Var.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        u21 u21Var = this.f43905r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                t9.j0(getParentActivity(), 2, new x21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131746307, null));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747106, null), new s21(this, 0));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751760, null), null);
            int i10 = org.telegram.ui.ActionBar.n6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        y21 y21Var = this.f43899a;
        if (y21Var != null) {
            y21Var.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.X = true;
            for (int i7 = 0; i7 < this.f43900b.getChildCount(); i7++) {
                View childAt = this.f43900b.getChildAt(i7);
                if (childAt instanceof z21) {
                    ((z21) childAt).f54503b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z10) {
        if (this.f43904n) {
            return;
        }
        if (!z10) {
            this.f43904n = true;
        }
        if (this.f43907w == 0) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f49938b;

                {
                    this.f49938b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f49938b;
                            final boolean z11 = z10;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f43902e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.f43904n = false;
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
                                                sessionsActivity2.f43906s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                mt0 mt0Var = sessionsActivity2.Y;
                                                if (mt0Var != null) {
                                                    mt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity2.f43899a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            mt0 mt0Var2 = sessionsActivity2.Y;
                                            if (mt0Var2 != null) {
                                                mt0Var2.a();
                                            }
                                            int i10 = sessionsActivity2.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity2.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.h3(new p21(sessionsActivity2, z11, 1), 2500L);
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
                            final SessionsActivity sessionsActivity2 = this.f49938b;
                            final boolean z12 = z10;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r5) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f43902e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.f43904n = false;
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
                                                sessionsActivity22.f43906s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                mt0 mt0Var = sessionsActivity22.Y;
                                                if (mt0Var != null) {
                                                    mt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity22.f43899a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            mt0 mt0Var2 = sessionsActivity22.Y;
                                            if (mt0Var2 != null) {
                                                mt0Var2.a();
                                            }
                                            int i10 = sessionsActivity22.V;
                                            if (i10 > 0) {
                                                int i11 = i10 - 1;
                                                sessionsActivity22.V = i11;
                                                if (i11 > 0) {
                                                    org.telegram.messenger.g0.h3(new p21(sessionsActivity22, z12, 1), 2500L);
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
            public final SessionsActivity f49938b;

            {
                this.f49938b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f49938b;
                        final boolean z11 = z10;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f43902e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f43904n = false;
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
                                            sessionsActivity22.f43906s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            mt0 mt0Var = sessionsActivity22.Y;
                                            if (mt0Var != null) {
                                                mt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.f43899a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        mt0 mt0Var2 = sessionsActivity22.Y;
                                        if (mt0Var2 != null) {
                                            mt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.h3(new p21(sessionsActivity22, z11, 1), 2500L);
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
                        final SessionsActivity sessionsActivity2 = this.f49938b;
                        final boolean z12 = z10;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f43902e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.f43904n = false;
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
                                            sessionsActivity22.f43906s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            mt0 mt0Var = sessionsActivity22.Y;
                                            if (mt0Var != null) {
                                                mt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.f43899a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        mt0 mt0Var2 = sessionsActivity22.Y;
                                        if (mt0Var2 != null) {
                                            mt0Var2.a();
                                        }
                                        int i10 = sessionsActivity22.V;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            sessionsActivity22.V = i11;
                                            if (i11 > 0) {
                                                org.telegram.messenger.g0.h3(new p21(sessionsActivity22, z12, 1), 2500L);
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
        this.f43908x = -1;
        this.f43909y = -1;
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
        int i7 = this.f43907w;
        if (i7 == 0 && getMessagesController().S3) {
            int i10 = this.S;
            this.Q = i10;
            this.S = i10 + 2;
            this.R = i10 + 1;
        }
        if (this.f43904n) {
            if (i7 == 0) {
                int i11 = this.S;
                this.f43908x = i11;
                this.S = i11 + 2;
                this.f43909y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.S;
            this.f43908x = i12;
            this.S = i12 + 2;
            this.f43909y = i12 + 1;
        }
        ArrayList arrayList = this.f43902e;
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
            ArrayList arrayList3 = this.f43903f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.S;
                this.M = i18;
                int size2 = this.f43903f.size() + i18;
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
            ArrayList arrayList4 = this.f43903f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.S;
                int i21 = i20 + 1;
                this.S = i21;
                this.J = i20;
                this.M = i21;
                int size4 = this.f43903f.size() + i21;
                this.N = size4;
                this.S = size4 + 1;
                this.O = size4;
            }
        }
        if (this.f43906s > 0) {
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
