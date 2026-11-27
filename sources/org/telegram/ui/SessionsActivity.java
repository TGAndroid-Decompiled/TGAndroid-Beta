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
import org.telegram.ui.SessionsActivity;
public class SessionsActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public pn8 Y;
    public xaa a;
    public gw9 b;
    public b34 c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public taa r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final boolean w;
    public int x;
    public int y;

    public SessionsActivity(int i) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.V = 0;
        this.w = i;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new tk4(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        jla jlaVar = this.simpleActionBar;
        boolean z = this.w;
        if (!z) {
            jlaVar.setTitle(ob6.M0(2131751420, null));
        } else {
            jlaVar.setTitle(ob6.M0(2131742542, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 14));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.a = new xaa(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b34 b34Var = new b34(context, null);
        this.c = b34Var;
        b34Var.b();
        gw9 gw9Var = new gw9((byte) 2, context, this);
        this.b = gw9Var;
        gw9Var.s1();
        this.b.setLayoutManager(new as((byte) 16, 1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        gw9 gw9Var2 = this.b;
        gw9Var2.X1 = true;
        gw9Var2.Y1 = false;
        frameLayout.addView(gw9Var2, tre.c(-1.0f, -1));
        frameLayout.addView(this.c, tre.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        this.b.setItemAnimator(zb3Var);
        this.b.setOnItemClickListener(new t39(this, (byte) 7));
        if (!z) {
            taa taaVar = new taa(this, context);
            this.r = taaVar;
            frameLayout.addView(taaVar, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        q0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.u0) {
            o0(true);
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 16, new Class[]{qmb.class, mf5.class, g9a.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        int i = aob.p7;
        arrayList.add(new apb(this.b, 262148, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.b, 262148, new Class[]{qmb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.q6));
        arrayList.add(new apb(this.b, 262144, new Class[]{g9a.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (zob) null, aob.I6));
        arrayList.add(new apb(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    public final int h0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (!this.w ? 1 : 0);
    }

    public final void i0() {
        if (!this.w) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new oaa(this, (byte) 2));
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new oaa(this, (byte) 3));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        if (getParentActivity() != null) {
            id idVar = new id(3, null, getParentActivity());
            idVar.j0 = false;
            idVar.show();
            int i2 = this.K;
            ArrayList arrayList = this.d;
            if (!this.w) {
                if (i >= i2 && i < this.L) {
                    tL_authorization = (TLRPC.TL_authorization) arrayList.get(i - i2);
                } else {
                    tL_authorization = (TLRPC.TL_authorization) this.e.get(i - this.G);
                }
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new qn8(this, idVar, tL_authorization, (byte) 11));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i - i2);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new qn8(this, idVar, tL_webAuthorization, (byte) 12));
            if (zArr[0]) {
                uc7.s1(this.currentAccount).u(tL_webAuthorization.bot_id);
            }
        }
    }

    public final void k0(int i) {
        String str;
        int L;
        int L2;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z;
        String x;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        ArrayList arrayList;
        String M0;
        int i6;
        boolean z3;
        float f = 4.0f;
        boolean z4 = true;
        if (i == this.ttlRow) {
            if (getParentActivity() != null) {
                int i7 = this.s;
                if (i7 <= 7) {
                    i6 = 0;
                } else if (i7 <= 93) {
                    i6 = 1;
                } else if (i7 <= 183) {
                    i6 = 2;
                } else {
                    i6 = 3;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M02 = ob6.M0(2131745281, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                String[] strArr = {ob6.G(1, "Weeks", new Object[0]), ob6.G(3, "Months", new Object[0]), ob6.G(6, "Months", new Object[0]), ob6.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i8 = 0;
                while (i8 < 4) {
                    j29 j29Var = new j29(getParentActivity(), null);
                    float f2 = f;
                    j29Var.setPadding(hl.L(f), 0, hl.L(f2), 0);
                    j29Var.setTag(Integer.valueOf(i8));
                    j29Var.a(aob.w0(null, aob.g7, false), aob.w0(null, aob.E5, false));
                    String str2 = strArr[i8];
                    if (i6 == i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    j29Var.b(str2, z3);
                    linearLayout.addView(j29Var);
                    j29Var.setBackground(aob.f0(aob.w0(null, aob.i6, false), 2, -1));
                    j29Var.setOnClickListener(new jy8(this, alertDialog$Builder, (byte) 11));
                    i8++;
                    f = f2;
                }
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
                return;
            }
            return;
        }
        int i9 = this.terminateAllSessionsRow;
        boolean z5 = this.w;
        if (i == i9) {
            if (getParentActivity() != null) {
                ArrayList arrayList2 = this.f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList3 = this.f;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (X1 != null) {
                            String p = lbc.p(X1);
                            if (!TextUtils.isEmpty(p)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) p);
                                append.setSpan(new f8c(c00.i("https://t.me/", p), (rmb) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) lbc.r(X1));
                            }
                        }
                    }
                    jj.f0(getParentActivity(), ob6.M0(2131754064, null), ob6.M0(2131754065, null), ob6.V(null, null, 2131754264, spannableStringBuilder), ob6.M0(2131743862, null), new maa(this, (byte) 1), this.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                id idVar2 = alertDialog$Builder2.a;
                if (!z5) {
                    idVar2.U = ob6.M0(2131754065, null);
                    idVar2.S = ob6.M0(2131754064, null);
                    M0 = ob6.M0(2131743862, null);
                } else {
                    idVar2.U = ob6.M0(2131754055, null);
                    idVar2.S = ob6.M0(2131743852, null);
                    M0 = ob6.M0(2131751356, null);
                }
                alertDialog$Builder2.j(M0, new raa(this, (byte) 1));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                showDialog(idVar2);
                TextView textView = (TextView) idVar2.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            }
        } else if (i >= this.M && i < this.N) {
            if (getParentActivity() != null && (arrayList = this.f) != null && !arrayList.isEmpty()) {
                int i11 = i - this.M;
                new dg2(getParentActivity(), (TL_account.TL_connectedBot) this.f.get(i11), new oe7(this, i11, (byte) 17), this.resourceProvider).show();
            }
        } else if (((i >= this.K && i < this.L) || ((i >= this.G && i < this.H) || i == this.y)) && getParentActivity() != null) {
            ArrayList arrayList4 = this.d;
            if (!z5) {
                if (i == this.y) {
                    tL_authorization = this.h;
                    z = true;
                } else {
                    int i12 = this.K;
                    if (i >= i12 && i < this.L) {
                        tL_authorization = (TLRPC.TL_authorization) arrayList4.get(i - i12);
                    } else {
                        tL_authorization = (TLRPC.TL_authorization) this.e.get(i - this.G);
                    }
                    z = false;
                }
                if (tL_authorization != null) {
                    uaa uaaVar = new uaa(this);
                    ?? nx0Var = new nx0(getParentActivity(), false);
                    nx0Var.S0 = true;
                    Activity parentActivity = getParentActivity();
                    nx0Var.l1 = tL_authorization;
                    nx0Var.m1 = this;
                    nx0Var.J();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    nx0Var.n1 = imageView;
                    imageView.setOnClickListener(new x8a(nx0Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, tre.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    bs2.t(textView2, 2, 20.0f);
                    yob.X(textView2, aob.G6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, tre.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    yob.X(textView3, aob.y6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, tre.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        x = ob6.M0(2131747553, null);
                    } else {
                        x = ob6.x(tL_authorization.date_active, true);
                    }
                    textView3.setText(x);
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
                        i4 = aob.U7;
                        i3 = 2131624183;
                    } else if (lowerCase2.contains("edge")) {
                        i4 = aob.U7;
                        i3 = 2131624008;
                    } else if (lowerCase2.contains("chrome")) {
                        i4 = aob.U7;
                        i3 = 2131623986;
                    } else if (lowerCase2.contains("firefox")) {
                        i4 = aob.O7;
                        i3 = 2131624025;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i4 = aob.T7;
                            i3 = 2131624309;
                        } else if (lowerCase.contains("linux")) {
                            i4 = aob.T7;
                            i3 = 2131624081;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i5 = 2131624072;
                            } else {
                                i5 = 2131624073;
                            }
                            i3 = i5;
                            i4 = aob.T7;
                        } else {
                            if (lowerCase.contains("windows")) {
                                i4 = aob.S7;
                            } else if (lowerCase.contains("macos")) {
                                i4 = aob.S7;
                                i3 = 2131624084;
                            } else if (lowerCase.contains("android")) {
                                i4 = aob.R7;
                                i3 = 2131623937;
                            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                                i4 = aob.S7;
                            } else {
                                i4 = aob.U7;
                                i3 = 2131623986;
                            }
                            i3 = 2131624361;
                        }
                        z4 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i2 = 2131231045;
                        } else if (lowerCase2.contains("firefox")) {
                            i2 = 2131231044;
                        } else {
                            i2 = 2131231046;
                        }
                        i3 = i2;
                        i4 = aob.U7;
                        z4 = false;
                    }
                    ShapeDrawable K = aob.K(hl.L(42.0f), aob.w0(null, i4, false));
                    uob M = yob.M(i4);
                    imageView.setBackground(K);
                    yob.j(imageView, K, M, null, null);
                    if (z4) {
                        imageView.f(i3, 50, 50, new int[]{0, aob.w0(null, i4, false)});
                    } else {
                        imageView.setImageDrawable(nx0Var.getContext().getDrawable(i3));
                    }
                    cz1 cz1Var = new cz1(parentActivity, false);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_authorization.app_name);
                    sb2.append(" ");
                    sb2.append(tL_authorization.app_version);
                    ((TextView) cz1Var.d).setText(sb2);
                    Drawable mutate = parentActivity.getDrawable(2131231791).mutate();
                    View view = cz1Var.c;
                    int i13 = aob.m6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    yob.x((ImageView) view, mutate, i13, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) cz1Var.e).setText(ob6.M0(2131754215, null));
                    linearLayout2.addView(cz1Var);
                    if (tL_authorization.country.length() != 0) {
                        cz1 cz1Var2 = new cz1(parentActivity, false);
                        ((TextView) cz1Var2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(2131232214).mutate();
                        View view2 = cz1Var2.c;
                        yob.x((ImageView) view2, mutate2, i13, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) cz1Var2.e).setText(ob6.M0(2131748511, null));
                        cz1Var2.setOnClickListener(new y8a(nx0Var, tL_authorization));
                        cz1Var2.setOnLongClickListener(new z8a(nx0Var, tL_authorization));
                        int i14 = aob.i6;
                        hf0 f0 = aob.f0(aob.w0(null, i14, false), 2, -1);
                        uob M2 = yob.M(i14);
                        cz1Var2.setBackground(f0);
                        yob.j(cz1Var2, f0, null, M2, null);
                        linearLayout2.addView(cz1Var2);
                        cz1Var.b = true;
                        cz1Var = cz1Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        cz1 cz1Var3 = new cz1(parentActivity, false);
                        ((TextView) cz1Var3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(2131232199).mutate();
                        View view3 = cz1Var3.c;
                        yob.x((ImageView) view3, mutate3, i13, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) cz1Var3.e).setText(ob6.M0(2131748856, null));
                        cz1Var3.setOnClickListener(new a9a(nx0Var, tL_authorization));
                        cz1Var3.setOnLongClickListener(new b9a(nx0Var, tL_authorization));
                        int i15 = aob.i6;
                        hf0 f02 = aob.f0(aob.w0(null, i15, false), 2, -1);
                        uob M3 = yob.M(i15);
                        cz1Var3.setBackground(f02);
                        yob.j(cz1Var3, f02, null, M3, null);
                        linearLayout2.addView(cz1Var3);
                        z2 = true;
                        cz1Var.b = true;
                        cz1Var = cz1Var3;
                    } else {
                        z2 = true;
                    }
                    int i16 = tL_authorization.api_id;
                    if (i16 != 2040 && i16 != 2496) {
                        cz1 cz1Var4 = new cz1(parentActivity, z2);
                        ((TextView) cz1Var4.d).setText(ob6.M0(2131754708, null));
                        Drawable mutate4 = parentActivity.getDrawable(2131232360).mutate();
                        View view4 = cz1Var4.c;
                        yob.x((ImageView) view4, mutate4, i13, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) cz1Var4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i17 = aob.i6;
                        hf0 f03 = aob.f0(aob.w0(null, i17, false), 7, -1);
                        uob M4 = yob.M(i17);
                        cz1Var4.setBackground(f03);
                        yob.j(cz1Var4, f03, null, M4, null);
                        cz1Var4.setOnClickListener(new c9a(nx0Var, cz1Var4, tL_authorization));
                        cz1Var.b = true;
                        ((TextView) cz1Var4.e).setText(ob6.M0(2131754707, null));
                        linearLayout2.addView(cz1Var4);
                        cz1Var = cz1Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        cz1 cz1Var5 = new cz1(parentActivity, true);
                        ((TextView) cz1Var5.d).setText(ob6.M0(2131754710, null));
                        Drawable mutate5 = parentActivity.getDrawable(2131232088).mutate();
                        View view5 = cz1Var5.c;
                        yob.x((ImageView) view5, mutate5, i13, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) cz1Var5.f).c(!tL_authorization.call_requests_disabled, false);
                        int i18 = aob.i6;
                        hf0 f04 = aob.f0(aob.w0(null, i18, false), 7, -1);
                        uob M5 = yob.M(i18);
                        cz1Var5.setBackground(f04);
                        yob.j(cz1Var5, f04, null, M5, null);
                        cz1Var5.setOnClickListener(new d9a(nx0Var, cz1Var5, tL_authorization));
                        cz1Var.b = true;
                        ((TextView) cz1Var5.e).setText(ob6.M0(2131754709, null));
                        linearLayout2.addView(cz1Var5);
                    }
                    if (!z) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(hl.o());
                        textView4.setText(ob6.M0(2131743858, null));
                        yob.X(textView4, aob.Ji, null);
                        int L3 = hl.L(24.0f);
                        int i19 = aob.ka;
                        int w0 = aob.w0(null, i19, false);
                        int i20 = aob.d6;
                        int o = vm2.o(aob.w0(null, i20, false), 120);
                        hf0 i0 = aob.i0(L3, L3, L3, L3, w0, o, o);
                        uob M6 = yob.M(i19);
                        uob g = yob.g(i20, 120);
                        textView4.setBackground(i0);
                        yob.j(textView4, i0, M6, g, null);
                        linearLayout2.addView(textView4, tre.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new e9a(nx0Var, uaaVar, tL_authorization, this));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    nx0Var.O = scrollView;
                    nx0Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
            boolean[] zArr = new boolean[1];
            id idVar3 = alertDialog$Builder3.a;
            if (!z5) {
                idVar3.U = ob6.M0(2131743857, null);
                idVar3.S = ob6.M0(2131754066, null);
                charSequence = ob6.M0(2131743862, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList4.get(i - this.K);
                idVar3.U = ob6.a0("TerminateWebSessionText", null, 2131743854, tL_webAuthorization.domain);
                idVar3.S = ob6.M0(2131743853, null);
                CharSequence M03 = ob6.M0(2131751356, null);
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                TLRPC.User X12 = uc7.s1(this.currentAccount).X1(Long.valueOf(tL_webAuthorization.bot_id));
                if (X12 != null) {
                    str = lbc.k(X12, true);
                } else {
                    str = "";
                }
                sg2 sg2Var = new sg2(getParentActivity(), 1);
                sg2Var.setBackgroundDrawable(aob.L0(false));
                sg2Var.e(ob6.a0("TerminateWebSessionStop", null, 2131743855, str), "", false, false, false);
                if (ob6.a0) {
                    L = hl.L(16.0f);
                } else {
                    L = hl.L(8.0f);
                }
                if (ob6.a0) {
                    L2 = hl.L(8.0f);
                } else {
                    L2 = hl.L(16.0f);
                }
                sg2Var.setPadding(L, 0, L2, 0);
                frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                sg2Var.setOnClickListener(new de(zArr, (byte) 13));
                idVar3.H = (byte) 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.j(charSequence, new bf(this, i, zArr, (byte) 16));
            alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
            showDialog(idVar3);
            TextView textView5 = (TextView) idVar3.c(-1);
            if (textView5 != null) {
                yob.X(textView5, aob.q7, null);
            }
        }
    }

    public final void l0() {
        y31.a(this.currentAccount).b();
    }

    public final void m0(Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = this.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = uc7.s1(this.currentAccount).o1(((TL_account.TL_connectedBot) this.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new oaa(this, (byte) 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new oaa(this, (byte) 1));
    }

    public final void n0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.n = false;
        if (tL_error == null) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            uc7.s1(this.currentAccount).j4(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            q0();
        }
        xaa xaaVar = this.a;
        if (xaaVar != null) {
            xaaVar.f();
        }
        pn8 pn8Var = this.Y;
        if (pn8Var != null) {
            pn8Var.a();
        }
        int i = this.V;
        if (i > 0) {
            int i2 = i - 1;
            this.V = i2;
            if (i2 > 0) {
                hl.d3(new paa(this, z, (byte) 0), 2500L);
            }
        }
    }

    public final void o0(final boolean z) {
        if (this.n) {
            return;
        }
        if (!z) {
            this.n = true;
        }
        if (!this.w) {
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity b;

                {
                    this.b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r3) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z2 = z;
                            hl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r5;
                                    boolean z3 = z2;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    SessionsActivity sessionsActivity2 = sessionsActivity;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.n = false;
                                            if (tL_error2 == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i = 0; i < size; i++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.q0();
                                                pn8 pn8Var = sessionsActivity2.Y;
                                                if (pn8Var != null) {
                                                    pn8Var.a();
                                                }
                                            }
                                            xaa xaaVar = sessionsActivity2.a;
                                            if (xaaVar != null) {
                                                xaaVar.f();
                                            }
                                            pn8 pn8Var2 = sessionsActivity2.Y;
                                            if (pn8Var2 != null) {
                                                pn8Var2.a();
                                            }
                                            int i2 = sessionsActivity2.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity2.V = i3;
                                                if (i3 > 0) {
                                                    hl.d3(new paa(sessionsActivity2, z3, (byte) 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            sessionsActivity2.n0(tLObject2, tL_error2, z3);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z3 = z;
                            hl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r5;
                                    boolean z32 = z3;
                                    TLObject tLObject2 = tLObject;
                                    TLRPC.TL_error tL_error2 = tL_error;
                                    SessionsActivity sessionsActivity22 = sessionsActivity2;
                                    switch (b) {
                                        case 0:
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.n = false;
                                            if (tL_error2 == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i = 0; i < size; i++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.q0();
                                                pn8 pn8Var = sessionsActivity22.Y;
                                                if (pn8Var != null) {
                                                    pn8Var.a();
                                                }
                                            }
                                            xaa xaaVar = sessionsActivity22.a;
                                            if (xaaVar != null) {
                                                xaaVar.f();
                                            }
                                            pn8 pn8Var2 = sessionsActivity22.Y;
                                            if (pn8Var2 != null) {
                                                pn8Var2.a();
                                            }
                                            int i2 = sessionsActivity22.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity22.V = i3;
                                                if (i3 > 0) {
                                                    hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            sessionsActivity22.n0(tLObject2, tL_error2, z32);
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
            public final SessionsActivity b;

            {
                this.b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.b;
                        final boolean z2 = z;
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r5;
                                boolean z32 = z2;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                SessionsActivity sessionsActivity22 = sessionsActivity;
                                switch (b) {
                                    case 0:
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error2 == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i = 0; i < size; i++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            pn8 pn8Var = sessionsActivity22.Y;
                                            if (pn8Var != null) {
                                                pn8Var.a();
                                            }
                                        }
                                        xaa xaaVar = sessionsActivity22.a;
                                        if (xaaVar != null) {
                                            xaaVar.f();
                                        }
                                        pn8 pn8Var2 = sessionsActivity22.Y;
                                        if (pn8Var2 != null) {
                                            pn8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        sessionsActivity22.n0(tLObject2, tL_error2, z32);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z3 = z;
                        hl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b = r5;
                                boolean z32 = z3;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                SessionsActivity sessionsActivity22 = sessionsActivity2;
                                switch (b) {
                                    case 0:
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error2 == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject2;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i = 0; i < size; i++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.q0();
                                            pn8 pn8Var = sessionsActivity22.Y;
                                            if (pn8Var != null) {
                                                pn8Var.a();
                                            }
                                        }
                                        xaa xaaVar = sessionsActivity22.a;
                                        if (xaaVar != null) {
                                            xaaVar.f();
                                        }
                                        pn8 pn8Var2 = sessionsActivity22.Y;
                                        if (pn8Var2 != null) {
                                            pn8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                hl.d3(new paa(sessionsActivity22, z32, (byte) 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        sessionsActivity22.n0(tLObject2, tL_error2, z32);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }), this.classGuid);
    }

    @Override
    public final void onBecomeFullyHidden() {
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        o0(false);
        if (!this.w) {
            y31.a(this.currentAccount).c(new maa(this, (byte) 0));
        }
        jn7.f(this.currentAccount).b(this, jn7.u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.u0);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.setTranslationY(-i4);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        taa taaVar = this.r;
        if (taaVar != null) {
            taaVar.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                la1.i0(getParentActivity(), 2, new waa(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
            alertDialog$Builder.j(ob6.M0(2131747027, null), new raa(this, (byte) 0));
            alertDialog$Builder.g(ob6.M0(2131751737, null), null);
            int i2 = aob.L5;
            alertDialog$Builder.l(2131624117, 72, aob.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        xaa xaaVar = this.a;
        if (xaaVar != null) {
            xaaVar.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2) {
            this.X = true;
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt instanceof yaa) {
                    ((yaa) childAt).b.invalidate();
                }
            }
        }
    }

    public final void p0() {
        this.W = true;
    }

    public final void q0() {
        this.S = 0;
        this.x = -1;
        this.y = -1;
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
        if (!this.w && getMessagesController().l4.R0.f) {
            int i = this.S;
            this.Q = i;
            this.S = i + 2;
            this.R = i + 1;
        }
        if (this.n) {
            if (!this.w) {
                int i2 = this.S;
                this.x = i2;
                this.S = i2 + 2;
                this.y = i2 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i3 = this.S;
            this.x = i3;
            this.S = i3 + 2;
            this.y = i3 + 1;
        }
        if (this.e.isEmpty() && this.d.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (!this.w && this.h == null) {
                this.P = -1;
            } else {
                int i4 = this.S;
                this.S = i4 + 1;
                this.P = i4;
            }
        } else {
            int i5 = this.S;
            this.terminateAllSessionsRow = i5;
            this.S = i5 + 2;
            this.E = i5 + 1;
            this.P = -1;
        }
        if (!this.e.isEmpty()) {
            int i6 = this.S;
            int i7 = i6 + 1;
            this.S = i7;
            this.F = i6;
            this.G = i7;
            int size = this.e.size() + i7;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (!this.d.isEmpty()) {
            int i8 = this.S;
            this.S = i8 + 1;
            this.J = i8;
            ArrayList arrayList = this.f;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i9 = this.S;
                this.M = i9;
                int size2 = this.f.size() + i9;
                this.S = size2;
                this.N = size2;
            }
            int i10 = this.S;
            this.K = i10;
            this.L = this.d.size() + i10;
            int size3 = this.d.size() + this.S;
            this.S = size3 + 1;
            this.O = size3;
        } else {
            ArrayList arrayList2 = this.f;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                int i11 = this.S;
                int i12 = i11 + 1;
                this.S = i12;
                this.J = i11;
                this.M = i12;
                int size4 = this.f.size() + i12;
                this.N = size4;
                this.S = size4 + 1;
                this.O = size4;
            }
        }
        if (this.s > 0) {
            int i13 = this.S;
            this.T = i13;
            this.ttlRow = i13 + 1;
            this.S = i13 + 3;
            this.U = i13 + 2;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
