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
public class SessionsActivity extends org.telegram.ui.ActionBar.d implements jm7 {
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
    public em8 Y;
    public h9a a;
    public pu9 b;
    public r34 c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public d9a r;
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
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        new tk4(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        boolean z = this.w;
        if (!z) {
            rjaVar.setTitle(jb6.M0(2131751392, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131742574, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 13));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.a = new h9a(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.c = r34Var;
        r34Var.b();
        pu9 pu9Var = new pu9((byte) 2, context, this);
        this.b = pu9Var;
        pu9Var.r1();
        this.b.setLayoutManager(new zs((byte) 16, 1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        pu9 pu9Var2 = this.b;
        pu9Var2.X1 = true;
        pu9Var2.Y1 = false;
        frameLayout.addView(pu9Var2, qoe.c(-1.0f, -1));
        frameLayout.addView(this.c, qoe.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        this.b.setItemAnimator(sc3Var);
        this.b.setOnItemClickListener(new s19(this, (byte) 8));
        if (!z) {
            d9a d9aVar = new d9a(this, context);
            this.r = d9aVar;
            frameLayout.addView(d9aVar, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.u0) {
            p0(true);
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 16, new Class[]{vkb.class, jf5.class, q7a.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        int i = cmb.o7;
        arrayList.add(new cnb(this.b, 262148, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.b, 262148, new Class[]{vkb.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.p6));
        arrayList.add(new cnb(this.b, 262144, new Class[]{q7a.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (bnb) null, cmb.H6));
        arrayList.add(new cnb(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final int i0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (!this.w ? 1 : 0);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (!this.w) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new y8a(this, (byte) 2));
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new y8a(this, (byte) 3));
    }

    public final void k0(int i, boolean[] zArr) {
        TLRPC.TL_authorization tL_authorization;
        if (getParentActivity() != null) {
            he heVar = new he(3, null, getParentActivity());
            heVar.j0 = false;
            heVar.show();
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new fm8(this, heVar, tL_authorization, (byte) 11));
                return;
            }
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i - i2);
            TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
            resetwebauthorization.hash = tL_webAuthorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new fm8(this, heVar, tL_webAuthorization, (byte) 12));
            if (zArr[0]) {
                oc7.r1(this.currentAccount).t(tL_webAuthorization.bot_id);
            }
        }
    }

    public final void l0(int i) {
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
                String M02 = jb6.M0(2131745287, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M02;
                String[] strArr = {jb6.G(1, "Weeks", new Object[0]), jb6.G(3, "Months", new Object[0]), jb6.G(6, "Months", new Object[0]), jb6.G(1, "Years", new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                int i8 = 0;
                while (i8 < 4) {
                    x09 x09Var = new x09(getParentActivity(), null);
                    float f2 = f;
                    x09Var.setPadding(gm.L(f), 0, gm.L(f2), 0);
                    x09Var.setTag(Integer.valueOf(i8));
                    x09Var.a(cmb.w0(null, cmb.f7, false), cmb.w0(null, cmb.D5, false));
                    String str2 = strArr[i8];
                    if (i6 == i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    x09Var.b(str2, z3);
                    linearLayout.addView(x09Var);
                    x09Var.setBackground(cmb.f0(cmb.w0(null, cmb.h6, false), 2, -1));
                    x09Var.setOnClickListener(new r39(this, alertDialog$Builder, (byte) 9));
                    i8++;
                    f = f2;
                }
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
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
                        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                        if (W1 != null) {
                            String p = m9c.p(W1);
                            if (!TextUtils.isEmpty(p)) {
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) p);
                                append.setSpan(new g6c(b10.h("https://t.me/", p), (wkb) null), 0, append.length(), 33);
                                spannableStringBuilder.append((CharSequence) append);
                            } else {
                                spannableStringBuilder.append((CharSequence) m9c.r(W1));
                            }
                        }
                    }
                    ik.f0(getParentActivity(), jb6.M0(2131754036, null), jb6.M0(2131754037, null), jb6.V(null, null, 2131754236, spannableStringBuilder), jb6.M0(2131743894, null), new b9a(this, (byte) 1), this.resourceProvider, false);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                he heVar2 = alertDialog$Builder2.a;
                if (!z5) {
                    heVar2.U = jb6.M0(2131754037, null);
                    heVar2.S = jb6.M0(2131754036, null);
                    M0 = jb6.M0(2131743894, null);
                } else {
                    heVar2.U = jb6.M0(2131754027, null);
                    heVar2.S = jb6.M0(2131743884, null);
                    M0 = jb6.M0(2131751328, null);
                }
                alertDialog$Builder2.j(M0, new c9a(this, (byte) 1));
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                showDialog(heVar2);
                TextView textView = (TextView) heVar2.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            }
        } else if (i >= this.M && i < this.N) {
            if (getParentActivity() != null && (arrayList = this.f) != null && !arrayList.isEmpty()) {
                int i11 = i - this.M;
                new yg2(getParentActivity(), (TL_account.TL_connectedBot) this.f.get(i11), new ge7(this, i11, (byte) 16), this.resourceProvider).show();
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
                    e9a e9aVar = new e9a(this);
                    ?? my0Var = new my0(getParentActivity(), false);
                    my0Var.S0 = true;
                    Activity parentActivity = getParentActivity();
                    my0Var.l1 = tL_authorization;
                    my0Var.m1 = this;
                    my0Var.J();
                    LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
                    ?? imageView = new ImageView(parentActivity);
                    my0Var.n1 = imageView;
                    imageView.setOnClickListener(new h7a(my0Var));
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    linearLayout2.addView((View) imageView, qoe.t(70, 70, 1, 0, 16, 0, 0));
                    TextView textView2 = new TextView(parentActivity);
                    ts2.s(textView2, 2, 20.0f);
                    anb.X(textView2, cmb.F6, null);
                    textView2.setGravity(17);
                    linearLayout2.addView(textView2, qoe.t(-1, -2, 1, 21, 12, 21, 0));
                    TextView textView3 = new TextView(parentActivity);
                    anb.X(textView3, cmb.x6, null);
                    textView3.setTextSize(2, 13.0f);
                    textView3.setGravity(17);
                    linearLayout2.addView(textView3, qoe.t(-1, -2, 1, 21, 4, 21, 21));
                    if ((tL_authorization.flags & 1) != 0) {
                        x = jb6.M0(2131747559, null);
                    } else {
                        x = jb6.x(tL_authorization.date_active, true);
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
                        i4 = cmb.T7;
                        i3 = 2131624183;
                    } else if (lowerCase2.contains("edge")) {
                        i4 = cmb.T7;
                        i3 = 2131624008;
                    } else if (lowerCase2.contains("chrome")) {
                        i4 = cmb.T7;
                        i3 = 2131623986;
                    } else if (lowerCase2.contains("firefox")) {
                        i4 = cmb.N7;
                        i3 = 2131624025;
                    } else if (!lowerCase2.contains("opera") && !lowerCase2.contains("firefox") && !lowerCase2.contains("vivaldi")) {
                        if (lowerCase.contains("ubuntu")) {
                            i4 = cmb.S7;
                            i3 = 2131624309;
                        } else if (lowerCase.contains("linux")) {
                            i4 = cmb.S7;
                            i3 = 2131624081;
                        } else if (lowerCase.contains("ios")) {
                            if (lowerCase2.contains("ipad")) {
                                i5 = 2131624072;
                            } else {
                                i5 = 2131624073;
                            }
                            i3 = i5;
                            i4 = cmb.S7;
                        } else {
                            if (lowerCase.contains("windows")) {
                                i4 = cmb.R7;
                            } else if (lowerCase.contains("macos")) {
                                i4 = cmb.R7;
                                i3 = 2131624084;
                            } else if (lowerCase.contains("android")) {
                                i4 = cmb.Q7;
                                i3 = 2131623937;
                            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                                i4 = cmb.R7;
                            } else {
                                i4 = cmb.T7;
                                i3 = 2131623986;
                            }
                            i3 = 2131624361;
                        }
                        z4 = true;
                    } else {
                        if (lowerCase2.contains("opera")) {
                            i2 = 2131231046;
                        } else if (lowerCase2.contains("firefox")) {
                            i2 = 2131231045;
                        } else {
                            i2 = 2131231047;
                        }
                        i3 = i2;
                        i4 = cmb.T7;
                        z4 = false;
                    }
                    ShapeDrawable K = cmb.K(gm.L(42.0f), cmb.w0(null, i4, false));
                    wmb M = anb.M(i4);
                    imageView.setBackground(K);
                    anb.j(imageView, K, M, null, null);
                    if (z4) {
                        imageView.f(i3, 50, 50, new int[]{0, cmb.w0(null, i4, false)});
                    } else {
                        imageView.setImageDrawable(my0Var.getContext().getDrawable(i3));
                    }
                    yz1 yz1Var = new yz1(parentActivity, false);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tL_authorization.app_name);
                    sb2.append(" ");
                    sb2.append(tL_authorization.app_version);
                    ((TextView) yz1Var.d).setText(sb2);
                    Drawable mutate = parentActivity.getDrawable(2131231792).mutate();
                    View view = yz1Var.c;
                    int i13 = cmb.l6;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    anb.x((ImageView) view, mutate, i13, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) yz1Var.e).setText(jb6.M0(2131754187, null));
                    linearLayout2.addView(yz1Var);
                    if (tL_authorization.country.length() != 0) {
                        yz1 yz1Var2 = new yz1(parentActivity, false);
                        ((TextView) yz1Var2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(2131232215).mutate();
                        View view2 = yz1Var2.c;
                        anb.x((ImageView) view2, mutate2, i13, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) yz1Var2.e).setText(jb6.M0(2131748514, null));
                        yz1Var2.setOnClickListener(new i7a(my0Var, tL_authorization));
                        yz1Var2.setOnLongClickListener(new j7a(my0Var, tL_authorization));
                        int i14 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.w0(null, i14, false), 2, -1);
                        wmb M2 = anb.M(i14);
                        yz1Var2.setBackground(f0);
                        anb.j(yz1Var2, f0, null, M2, null);
                        linearLayout2.addView(yz1Var2);
                        yz1Var.b = true;
                        yz1Var = yz1Var2;
                    }
                    if (tL_authorization.ip.length() != 0) {
                        yz1 yz1Var3 = new yz1(parentActivity, false);
                        ((TextView) yz1Var3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(2131232200).mutate();
                        View view3 = yz1Var3.c;
                        anb.x((ImageView) view3, mutate3, i13, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) yz1Var3.e).setText(jb6.M0(2131748859, null));
                        yz1Var3.setOnClickListener(new k7a(my0Var, tL_authorization));
                        yz1Var3.setOnLongClickListener(new l7a(my0Var, tL_authorization));
                        int i15 = cmb.h6;
                        fg0 f02 = cmb.f0(cmb.w0(null, i15, false), 2, -1);
                        wmb M3 = anb.M(i15);
                        yz1Var3.setBackground(f02);
                        anb.j(yz1Var3, f02, null, M3, null);
                        linearLayout2.addView(yz1Var3);
                        z2 = true;
                        yz1Var.b = true;
                        yz1Var = yz1Var3;
                    } else {
                        z2 = true;
                    }
                    int i16 = tL_authorization.api_id;
                    if (i16 != 2040 && i16 != 2496) {
                        yz1 yz1Var4 = new yz1(parentActivity, z2);
                        ((TextView) yz1Var4.d).setText(jb6.M0(2131754712, null));
                        Drawable mutate4 = parentActivity.getDrawable(2131232361).mutate();
                        View view4 = yz1Var4.c;
                        anb.x((ImageView) view4, mutate4, i13, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) yz1Var4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i17 = cmb.h6;
                        fg0 f03 = cmb.f0(cmb.w0(null, i17, false), 7, -1);
                        wmb M4 = anb.M(i17);
                        yz1Var4.setBackground(f03);
                        anb.j(yz1Var4, f03, null, M4, null);
                        yz1Var4.setOnClickListener(new m7a(my0Var, yz1Var4, tL_authorization));
                        yz1Var.b = true;
                        ((TextView) yz1Var4.e).setText(jb6.M0(2131754711, null));
                        linearLayout2.addView(yz1Var4);
                        yz1Var = yz1Var4;
                    }
                    if (tL_authorization.api_id != 22) {
                        yz1 yz1Var5 = new yz1(parentActivity, true);
                        ((TextView) yz1Var5.d).setText(jb6.M0(2131754714, null));
                        Drawable mutate5 = parentActivity.getDrawable(2131232089).mutate();
                        View view5 = yz1Var5.c;
                        anb.x((ImageView) view5, mutate5, i13, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) yz1Var5.f).c(!tL_authorization.call_requests_disabled, false);
                        int i18 = cmb.h6;
                        fg0 f04 = cmb.f0(cmb.w0(null, i18, false), 7, -1);
                        wmb M5 = anb.M(i18);
                        yz1Var5.setBackground(f04);
                        anb.j(yz1Var5, f04, null, M5, null);
                        yz1Var5.setOnClickListener(new n7a(my0Var, yz1Var5, tL_authorization));
                        yz1Var.b = true;
                        ((TextView) yz1Var5.e).setText(jb6.M0(2131754713, null));
                        linearLayout2.addView(yz1Var5);
                    }
                    if (!z) {
                        TextView textView4 = new TextView(parentActivity);
                        textView4.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                        textView4.setGravity(17);
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTypeface(gm.o());
                        textView4.setText(jb6.M0(2131743890, null));
                        anb.X(textView4, cmb.Ii, null);
                        int L3 = gm.L(24.0f);
                        int i19 = cmb.ja;
                        int w0 = cmb.w0(null, i19, false);
                        int i20 = cmb.c6;
                        int p2 = on2.p(cmb.w0(null, i20, false), 120);
                        fg0 i0 = cmb.i0(L3, L3, L3, L3, w0, p2, p2);
                        wmb M6 = anb.M(i19);
                        wmb g = anb.g(i20, 120);
                        textView4.setBackground(i0);
                        anb.j(textView4, i0, M6, g, null);
                        linearLayout2.addView(textView4, qoe.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView4.setOnClickListener(new o7a(my0Var, e9aVar, tL_authorization, this));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    my0Var.O = scrollView;
                    my0Var.show();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
            boolean[] zArr = new boolean[1];
            he heVar3 = alertDialog$Builder3.a;
            if (!z5) {
                heVar3.U = jb6.M0(2131743889, null);
                heVar3.S = jb6.M0(2131754038, null);
                charSequence = jb6.M0(2131743894, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList4.get(i - this.K);
                heVar3.U = jb6.a0("TerminateWebSessionText", null, 2131743886, tL_webAuthorization.domain);
                heVar3.S = jb6.M0(2131743885, null);
                CharSequence M03 = jb6.M0(2131751328, null);
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                TLRPC.User W12 = oc7.r1(this.currentAccount).W1(Long.valueOf(tL_webAuthorization.bot_id));
                if (W12 != null) {
                    str = m9c.k(W12, true);
                } else {
                    str = "";
                }
                oh2 oh2Var = new oh2(getParentActivity(), 1);
                oh2Var.setBackgroundDrawable(cmb.L0(false));
                oh2Var.e(jb6.a0("TerminateWebSessionStop", null, 2131743887, str), "", false, false, false);
                if (jb6.a0) {
                    L = gm.L(16.0f);
                } else {
                    L = gm.L(8.0f);
                }
                if (jb6.a0) {
                    L2 = gm.L(8.0f);
                } else {
                    L2 = gm.L(16.0f);
                }
                oh2Var.setPadding(L, 0, L2, 0);
                frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                oh2Var.setOnClickListener(new gf(zArr, (byte) 13));
                heVar3.H = (byte) 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.j(charSequence, new yg(this, i, zArr, (byte) 15));
            alertDialog$Builder3.g(jb6.M0(2131752542, null), null);
            showDialog(heVar3);
            TextView textView5 = (TextView) heVar3.c(-1);
            if (textView5 != null) {
                anb.X(textView5, cmb.p7, null);
            }
        }
    }

    public final void m0() {
        x41.a(this.currentAccount).b();
    }

    public final void n0(Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = this.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = oc7.r1(this.currentAccount).n1(((TL_account.TL_connectedBot) this.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new y8a(this, (byte) 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new y8a(this, (byte) 1));
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.n = false;
        if (tL_error == null) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            oc7.r1(this.currentAccount).d4(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            r0();
        }
        h9a h9aVar = this.a;
        if (h9aVar != null) {
            h9aVar.f();
        }
        em8 em8Var = this.Y;
        if (em8Var != null) {
            em8Var.a();
        }
        int i = this.V;
        if (i > 0) {
            int i2 = i - 1;
            this.V = i2;
            if (i2 > 0) {
                gm.d3(new z8a(this, z, (byte) 0), 2500L);
            }
        }
    }

    @Override
    public final void onBecomeFullyHidden() {
        d9a d9aVar = this.r;
        if (d9aVar != null) {
            d9aVar.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (!this.w) {
            x41.a(this.currentAccount).c(new b9a(this, (byte) 0));
        }
        nm7.f(this.currentAccount).b(this, nm7.u0);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.u0);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        d9a d9aVar = this.r;
        if (d9aVar != null) {
            d9aVar.setTranslationY(-i4);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        d9a d9aVar = this.r;
        if (d9aVar != null) {
            d9aVar.d(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                lb1.j0(getParentActivity(), 2, new g9a(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
            alertDialog$Builder.j(jb6.M0(2131747033, null), new c9a(this, (byte) 0));
            alertDialog$Builder.g(jb6.M0(2131751709, null), null);
            int i2 = cmb.K5;
            alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        h9a h9aVar = this.a;
        if (h9aVar != null) {
            h9aVar.f();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2) {
            this.X = true;
            for (int i = 0; i < this.b.getChildCount(); i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt instanceof i9a) {
                    ((i9a) childAt).b.invalidate();
                }
            }
        }
    }

    public final void p0(final boolean z) {
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
                            gm.c3(new Runnable() {
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
                                                sessionsActivity2.r0();
                                                em8 em8Var = sessionsActivity2.Y;
                                                if (em8Var != null) {
                                                    em8Var.a();
                                                }
                                            }
                                            h9a h9aVar = sessionsActivity2.a;
                                            if (h9aVar != null) {
                                                h9aVar.f();
                                            }
                                            em8 em8Var2 = sessionsActivity2.Y;
                                            if (em8Var2 != null) {
                                                em8Var2.a();
                                            }
                                            int i2 = sessionsActivity2.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity2.V = i3;
                                                if (i3 > 0) {
                                                    gm.d3(new z8a(sessionsActivity2, z3, (byte) 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            sessionsActivity2.o0(tLObject2, tL_error2, z3);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z3 = z;
                            gm.c3(new Runnable() {
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
                                                sessionsActivity22.r0();
                                                em8 em8Var = sessionsActivity22.Y;
                                                if (em8Var != null) {
                                                    em8Var.a();
                                                }
                                            }
                                            h9a h9aVar = sessionsActivity22.a;
                                            if (h9aVar != null) {
                                                h9aVar.f();
                                            }
                                            em8 em8Var2 = sessionsActivity22.Y;
                                            if (em8Var2 != null) {
                                                em8Var2.a();
                                            }
                                            int i2 = sessionsActivity22.V;
                                            if (i2 > 0) {
                                                int i3 = i2 - 1;
                                                sessionsActivity22.V = i3;
                                                if (i3 > 0) {
                                                    gm.d3(new z8a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            sessionsActivity22.o0(tLObject2, tL_error2, z32);
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
                        gm.c3(new Runnable() {
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
                                            sessionsActivity22.r0();
                                            em8 em8Var = sessionsActivity22.Y;
                                            if (em8Var != null) {
                                                em8Var.a();
                                            }
                                        }
                                        h9a h9aVar = sessionsActivity22.a;
                                        if (h9aVar != null) {
                                            h9aVar.f();
                                        }
                                        em8 em8Var2 = sessionsActivity22.Y;
                                        if (em8Var2 != null) {
                                            em8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                gm.d3(new z8a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        sessionsActivity22.o0(tLObject2, tL_error2, z32);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z3 = z;
                        gm.c3(new Runnable() {
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
                                            sessionsActivity22.r0();
                                            em8 em8Var = sessionsActivity22.Y;
                                            if (em8Var != null) {
                                                em8Var.a();
                                            }
                                        }
                                        h9a h9aVar = sessionsActivity22.a;
                                        if (h9aVar != null) {
                                            h9aVar.f();
                                        }
                                        em8 em8Var2 = sessionsActivity22.Y;
                                        if (em8Var2 != null) {
                                            em8Var2.a();
                                        }
                                        int i2 = sessionsActivity22.V;
                                        if (i2 > 0) {
                                            int i3 = i2 - 1;
                                            sessionsActivity22.V = i3;
                                            if (i3 > 0) {
                                                gm.d3(new z8a(sessionsActivity22, z32, (byte) 1), 2500L);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        sessionsActivity22.o0(tLObject2, tL_error2, z32);
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
        if (!this.w && getMessagesController().l4.J0.f) {
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
