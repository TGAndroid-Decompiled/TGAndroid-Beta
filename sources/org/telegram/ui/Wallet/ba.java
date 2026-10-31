package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.yv0;
import org.telegram.ui.zh;
public final class ba extends r51 {
    public String D;
    public int E;
    public TextView F;
    public FrameLayout G;
    public TextView H;
    public int J;
    public Runnable K;
    public boolean L;
    public org.telegram.ui.Components.voip.i0 M;
    public org.telegram.ui.ActionBar.n0 N;
    public TextView O;
    public ImageView P;
    public ClipboardManager T;
    public FrameLayout V;
    public ImageView W;
    public ShapeDrawable X;
    public int Y;
    public vh.d Z;
    public int f34279a0;
    public int f34280b0;
    public int f34281c0;
    public qh.y f34282d0;
    public TL_wallet.nftItem e;
    public String f34283f;
    public boolean h;
    public l f34284n;
    public boolean f34285r;
    public zf.m1 f34288x;
    public String f34289y;
    public final ArrayList f34286s = new ArrayList();
    public final ArrayList f34287w = new ArrayList();
    public final z9 I = new us() {
        @Override
        public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
            ii iiVar;
            ba baVar = ba.this;
            if (!baVar.f34285r && (iiVar = baVar.f29837a) != null) {
                iiVar.f30819f3.O(true);
            }
        }
    };
    public boolean Q = true;
    public boolean R = true;
    public boolean S = true;
    public final aa U = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            ba.this.j0(true);
        }
    };

    public static void c0(ba baVar, k0 k0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        baVar.f34284n = null;
        if (baVar.f34285r) {
            return;
        }
        baVar.Z.setLoading(false);
        if (wallettransaction != null && k0.b(baVar.f34283f, k0Var.t())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f19942id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            b6.F0(baVar.getParentActivity(), baVar.currentAccount, wallettransaction, new s(baVar, k0Var, user, str), new d(baVar, 10), null, null, baVar.getResourceProvider());
            return;
        }
        baVar.h = false;
        cc a02 = cc.a0(baVar);
        if (str2 == null) {
            str2 = cd.L0(2131743198, null);
        }
        a02.e0(str2, false);
    }

    public static void d0(ba baVar, String str) {
        String k02 = k0(str);
        if (!baVar.isFinished && baVar.N != null && k02 != null) {
            if (k02.startsWith("@")) {
                int i10 = baVar.currentAccount;
                vp.r1(i10).c2().a(k02.substring(1), null, new ag.s2(new v9(baVar, 1), i10));
                return;
            }
            baVar.N.setText(k02);
            org.telegram.ui.ActionBar.n0 n0Var = baVar.N;
            n0Var.setSelection(n0Var.length());
            org.telegram.messenger.i0.v1(baVar.N);
            baVar.l0(k02, null);
        }
    }

    public static void e0(ba baVar, String str, int i10) {
        baVar.K = null;
        int i11 = baVar.currentAccount;
        ag.s2 s2Var = new ag.s2(baVar, i10, 5);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        baVar.E = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new a3.b(1), new ih.s(str, s2Var), vp.r1(i11).P3, 0);
    }

    public static void f0(View view, boolean z10, boolean z11) {
        float f7;
        view.animate().cancel();
        view.setEnabled(z10);
        float f10 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (!z10) {
            f10 = 0.5f;
        }
        int i10 = 0;
        if (!z11) {
            view.setAlpha(f7);
            view.setScaleX(f10);
            view.setScaleY(f10);
            if (!z10) {
                i10 = 8;
            }
            view.setVisibility(i10);
            return;
        }
        view.setVisibility(0);
        view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(gr.h).withEndAction(new yv0(4, view, z10)).start();
    }

    public static boolean g0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !h20.x(user) && !h20.A(user.f19942id)) {
            return true;
        }
        return false;
    }

    public static String k0(String str) {
        Uri a12 = b6.a1(str);
        if ("ton".equalsIgnoreCase(a12.getScheme())) {
            if ("transfer".equalsIgnoreCase(a12.getAuthority()) && a12.getPathSegments().size() == 1) {
                String str2 = a12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!b6.B0(a12)) {
            return null;
        } else {
            String b12 = b6.b1(a12);
            if (b12 != null) {
                return "@".concat(b12);
            }
            String queryParameter = a12.getQueryParameter("to");
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            if (!queryParameter.startsWith("@") && !queryParameter.matches("[a-zA-Z0-9_]{1,32}")) {
                if (!WalletEngine2.isValidRecipientAddress(queryParameter)) {
                    return null;
                }
                return queryParameter;
            }
            if (queryParameter.startsWith("@")) {
                queryParameter = queryParameter.substring(1);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return null;
            }
            return sc.e.h("@", queryParameter);
        }
    }

    @Override
    public final void Y(ArrayList arrayList, p51 p51Var) {
        float f7;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.M != null) {
            arrayList.add(a51.D(org.telegram.messenger.i0.L(4.0f)));
            p51Var.V();
            arrayList.add(a51.u(cd.L0(2131743066, null)));
            org.telegram.ui.Components.voip.i0 i0Var = this.M;
            a51 a51Var = new a51(-1);
            a51Var.f24286c = i0Var;
            a51Var.f24305z = 50;
            arrayList.add(a51Var);
            p51Var.U();
            String trim = this.N.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f16 = 12.0f;
            int i13 = 0;
            if (this.f34289y != null) {
                if (this.G == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.t6.h0(getThemedColor(org.telegram.ui.ActionBar.t6.f21020i6), 2, -1));
                    boolean z10 = cd.X;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.W = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
                    this.X = L;
                    imageView.setImageDrawable(new eq(L, getParentActivity().getResources().getDrawable(2131231828).mutate()));
                    int i14 = i12 | 16;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 11.0f;
                    }
                    if (z10) {
                        f11 = 11.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    frameLayout.addView(imageView, w7.b6.d(46, 46.0f, i14, f10, 0.0f, f11, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.F = textView;
                    textView.setText(cd.L0(2131743125, null));
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    textView.setSingleLine();
                    textView.setGravity(i12);
                    if (z10) {
                        f12 = 16.0f;
                    } else {
                        f12 = 72.0f;
                    }
                    if (z10) {
                        f13 = 72.0f;
                    } else {
                        f13 = 16.0f;
                    }
                    frameLayout.addView(textView, w7.b6.d(-1, 24.0f, 48, f12, 8.0f, f13, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.H = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(this.H, org.telegram.ui.ActionBar.t6.f21311y6, getResourceProvider());
                    this.H.setSingleLine();
                    this.H.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    this.H.setGravity(i12);
                    TextView textView3 = this.H;
                    if (z10) {
                        f14 = 16.0f;
                    } else {
                        f14 = 72.0f;
                    }
                    if (z10) {
                        f15 = 72.0f;
                    } else {
                        f15 = 16.0f;
                    }
                    frameLayout.addView(textView3, w7.b6.d(-1, 22.0f, 48, f14, 32.0f, f15, 0.0f));
                    frameLayout.setOnClickListener(new u9(this, 0));
                    this.G = frameLayout;
                }
                TextView textView4 = this.F;
                String str = this.D;
                if (str == null) {
                    str = cd.L0(2131743125, null);
                }
                textView4.setText(str);
                this.H.setText(this.f34289y);
                arrayList.add(a51.D(org.telegram.messenger.i0.L(12.0f)));
                p51Var.V();
                FrameLayout frameLayout2 = this.G;
                a51 a51Var2 = new a51(-1);
                a51Var2.f24286c = frameLayout2;
                a51Var2.f24305z = 60;
                arrayList.add(a51Var2);
                p51Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = ui.b0(this.currentAccount).f18325i1;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    float f17 = f16;
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (g0(Z1) && hashSet.add(Long.valueOf(Z1.f19942id))) {
                        arrayList2.add(Z1);
                    }
                    f16 = f17;
                }
                f7 = f16;
                ArrayList arrayList4 = this.f34286s;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f19942id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f7 = 12.0f;
                arrayList2 = this.f34287w;
            }
            int size3 = arrayList2.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList2.get(i18);
                i18++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i17 == 0) {
                    arrayList.add(a51.D(org.telegram.messenger.i0.L(f7)));
                    p51Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        arrayList.add(a51.u(cd.L0(2131746385, null)));
                    }
                }
                a51 w9 = a51.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w9.f24292l = org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, trim);
                    String n10 = h20.n(user2);
                    if (!TextUtils.isEmpty(n10)) {
                        w9.f24293m = org.telegram.messenger.i0.r0(sc.e.h("@", n10), null, "@".concat(trim));
                    }
                    i11 = i13;
                    w9.F = new m(user2, w9.f24292l, w9.f24293m, 8);
                } else {
                    i11 = i13;
                }
                arrayList.add(w9);
                i17++;
                i13 = i11;
            }
            int i19 = i13;
            if (this.L) {
                if (i17 == 0) {
                    arrayList.add(a51.D(org.telegram.messenger.i0.L(f7)));
                    p51Var.V();
                }
                if (this.D != null) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                for (int i20 = i19; i20 < i10; i20++) {
                    arrayList.add(a51.q((-1) - i20, 18));
                }
            }
            if (i17 > 0 || this.L) {
                p51Var.U();
            }
            if (!this.L && i17 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String L0 = cd.L0(2131745818, null);
                Object[] objArr = new Object[1];
                objArr[i19] = lowerCase;
                String a02 = cd.a0(null, null, 2131743051, objArr);
                int i21 = ki.f27767b;
                a51 K = a51.K(ki.class);
                K.f24292l = L0;
                K.f24293m = a02;
                arrayList.add(K);
            }
        }
    }

    @Override
    public final CharSequence Z() {
        int i10;
        if (this.e == null) {
            i10 = 2131743046;
        } else {
            i10 = 2131743006;
        }
        return cd.L0(i10, null);
    }

    @Override
    public final void a0(a51 a51Var, View view) {
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            hs.a0(i10).f15938a.c(new org.telegram.ui.web.l(i10, user.f19942id, 3));
            org.telegram.messenger.i0.v1(this.N);
            l0(null, user);
        }
    }

    @Override
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f29837a);
        this.f29837a.r1();
        this.f29837a.setPadding(0, 0, 0, org.telegram.messenger.i0.L(68.0f));
        this.f29837a.setClipToPadding(false);
        ii iiVar = this.f29837a;
        iiVar.f30819f3.f29295r = false;
        iiVar.j(new bu0(this, 8));
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, context, 3);
        this.T = (ClipboardManager) context.getSystemService("clipboard");
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(context);
        this.N = n0Var;
        org.telegram.ui.ActionBar.a7.V(n0Var, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.n0 n0Var2 = this.N;
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.72f, org.telegram.ui.ActionBar.t6.H6);
        org.telegram.ui.ActionBar.a7.o(n0Var2, 1, L.f21452a, -1, 2, L.d, getResourceProvider());
        boolean z10 = true;
        this.N.setTextSize(1, 16.0f);
        this.N.setHint(cd.L0(2131743223, null));
        this.N.setSingleLine(true);
        this.N.setBackground(null);
        this.N.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        this.N.setClipToPadding(true);
        this.N.setCursorWidth(1.5f);
        this.N.setGravity(16);
        this.N.setInputType(524289);
        this.N.setImeOptions(33554437);
        i0Var.addView(this.N, w7.b6.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setText(cd.L0(2131743081, null));
        TextView textView2 = this.O;
        int i10 = org.telegram.ui.ActionBar.t6.f21115n6;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, getResourceProvider());
        this.O.setTextSize(1, 14.0f);
        this.O.setTypeface(org.telegram.messenger.i0.o());
        this.O.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, getThemedColor(i10));
        TextView textView3 = this.O;
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.18f, getThemedColor(i10));
        org.telegram.ui.ActionBar.a7.R(textView3, org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, r12, r13, r13), org.telegram.ui.ActionBar.a7.L(0.1f, i10), org.telegram.ui.ActionBar.a7.L(0.18f, i10), getResourceProvider());
        this.O.setOnClickListener(new u9(this, 2));
        w7.e6.b(this.O, 0.04f, 1.2f);
        i0Var.addView(this.O, w7.b6.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.N.addTextChangedListener(new ag.a1(this, 24));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setImageResource(2131232675);
        org.telegram.ui.ActionBar.a7.t(this.P, i10, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.a7.R(this.P, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.12f, getThemedColor(i10)), 1, -1), null, org.telegram.ui.ActionBar.a7.L(0.12f, i10), getResourceProvider());
        this.P.setContentDescription(cd.L0(2131743053, null));
        this.P.setOnClickListener(new u9(this, 3));
        i0Var.addView(this.P, w7.b6.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        j0(false);
        this.M = i0Var;
        zf.m1 m1Var = new zf.m1(true);
        this.f34288x = m1Var;
        m1Var.f55575a = new m2.t(this, 15);
        getNotificationCenter().c(this.I, zs.S0);
        ui.b0(this.currentAccount).M0(true);
        this.f34286s.clear();
        int i11 = this.currentAccount;
        hs.a0(i11).f15938a.c(new i2.u(i11, 0, new x9(this), 17));
        if (!TextUtils.isEmpty(null)) {
            this.N.setText((CharSequence) null);
            org.telegram.ui.ActionBar.n0 n0Var3 = this.N;
            n0Var3.setSelection(n0Var3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7);
        this.V.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor, themedColor}));
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(cd.L0(2131743180, null));
        this.Z.setEnabled(false);
        this.Z.setOnClickListener(new u9(this, 1));
        vh.d dVar2 = this.Z;
        if (dVar2 != null) {
            if (this.f34289y == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.V.addView(this.Z, w7.b6.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.V, w7.b6.e(-1, 68, 87));
        n0();
        this.f29837a.f30819f3.O(false);
        return this.fragmentView;
    }

    public final void h0() {
        if (getParentActivity() != null && this.f34282d0 == null && this.P != null) {
            org.telegram.messenger.i0.v1(this.N);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f34282d0 = qh.y.k(this, this.P, new zh(10), new v9(this, 0), new w9(this, 0));
            }
        }
    }

    public final void i0(String str) {
        String p5;
        String n10;
        ArrayList arrayList = this.f34287w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f34289y == null && this.D == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = getMessagesController().J;
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                if (dialog != null && dialog.f19797id > 0) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(dialog.f19797id));
                    if (g0(Z1) && (((p5 = h20.p(Z1)) != null && p5.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((n10 = h20.n(Z1)) != null && n10.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(Z1.f19942id))) {
                            arrayList.add(Z1);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f34288x.e;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (g0(user) && hashSet.add(Long.valueOf(user.f19942id))) {
                        arrayList.add(user);
                    }
                }
            }
            ii iiVar = this.f29837a;
            if (iiVar != null) {
                iiVar.f30819f3.O(true);
                return;
            }
            return;
        }
        ii iiVar2 = this.f29837a;
        if (iiVar2 != null) {
            iiVar2.f30819f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (!this.f34285r && this.N != null && this.P != null) {
            ClipboardManager clipboardManager = this.T;
            if (clipboardManager != null) {
                this.S = clipboardManager.hasPrimaryClip();
            } else {
                this.S = false;
            }
            o0(z10);
        }
    }

    public final void l0(String str, TLRPC.User user) {
        String str2;
        r9 r9Var;
        if (this.e == null) {
            if (user != null) {
                r9Var = new r9(user);
            } else {
                r9 r9Var2 = new r9(str);
                if (TextUtils.equals(str, this.f34289y)) {
                    str2 = this.D;
                } else {
                    str2 = null;
                }
                r9Var2.z0(str2);
                r9Var = r9Var2;
            }
            presentFragment(r9Var);
        } else if (this.h) {
        } else {
            this.h = true;
            this.Z.setLoading(true);
            k0 x10 = k0.x(this.currentAccount);
            m mVar = new m(this, x10, user);
            if (user != null) {
                x10.a0(user, new ih.s(27, this, mVar));
            } else {
                mVar.a(str);
            }
        }
    }

    public final void m0(TL_wallet.nftItem nftitem) {
        this.e = nftitem;
        this.f34283f = k0.x(this.currentAccount).t();
    }

    public final void n0() {
        int max = Math.max(0, this.f34280b0 - this.f34279a0);
        ii iiVar = this.f29837a;
        if (iiVar != null) {
            iiVar.setPadding(0, 0, 0, org.telegram.messenger.i0.L(68.0f) + this.f34279a0 + max);
            this.f29837a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(10.0f) + this.f34279a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
            layoutParams.height = org.telegram.messenger.i0.L(68.0f) + this.f34279a0;
            this.V.setLayoutParams(layoutParams);
            if (this.f34281c0 != max) {
                this.V.animate().cancel();
                this.V.animate().translationY(-max).setDuration(320L).setInterpolator(gr.h).start();
                this.f34281c0 = max;
            }
        }
    }

    public final void o0(boolean z10) {
        boolean z11;
        float f7;
        if (this.P != null) {
            boolean z12 = false;
            if (this.N.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.S) {
                z12 = true;
            }
            if (this.Q != z12 || !z10) {
                this.Q = z12;
                f0(this.O, z12, z10);
            }
            if (this.R != z11 || !z10) {
                this.R = z11;
                f0(this.P, z11, z10);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            if (this.Q) {
                f7 = 128.0f;
            } else if (this.R) {
                f7 = 60.0f;
            } else {
                f7 = 8.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.N.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        qh.y yVar = this.f34282d0;
        if (yVar != null) {
            if (z10) {
                yVar.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        this.f34285r = true;
        qh.y yVar = this.f34282d0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.f34282d0);
            this.f34282d0 = null;
        }
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        TextView textView = this.O;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.P;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().n(this.I, zs.S0);
        Runnable runnable = this.K;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        l lVar = this.f34284n;
        if (lVar != null) {
            lVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34279a0 = i13;
        n0();
    }

    @Override
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        this.f34280b0 = j1Var.f46132a.f(8).d;
        return super.onInsetsInternal(view, j1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        qh.y yVar = this.f34282d0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.f34282d0);
            this.f34282d0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i10, strArr, iArr);
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                h0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.L0(2131746518, null));
            alertDialog$Builder.k(cd.L0(2131747316, null), new x9(this));
            alertDialog$Builder.h(cd.L0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            aa aaVar = this.U;
            clipboardManager.removePrimaryClipChangedListener(aaVar);
            this.T.addPrimaryClipChangedListener(aaVar);
        }
        j0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.V;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7)) != this.Y) {
                this.Y = themedColor;
                ((GradientDrawable) this.V.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.X;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(getThemedColor(org.telegram.ui.ActionBar.t6.Ci), shapeDrawable);
                ImageView imageView = this.W;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
