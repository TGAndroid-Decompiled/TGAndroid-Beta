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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public final class w9 extends h41 {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public kw0 N;
    public bh.g O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public gi.d f43357a0;
    public int f43358b0;
    public int f43359c0;
    public int f43360d0;
    public TL_wallet.nftItem f43361e;
    public bi.a0 f43362e0;
    public String f43363f;
    public boolean h;
    public l f43364n;
    public boolean f43365r;
    public kg.v1 f43368x;
    public String f43369y;
    public final ArrayList f43366s = new ArrayList();
    public final ArrayList f43367w = new ArrayList();
    public final u9 J = new cs() {
        @Override
        public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
            ai.h4 h4Var;
            w9 w9Var = w9.this;
            if (!w9Var.f43365r && (h4Var = w9Var.f34298a) != null) {
                h4Var.f35594g3.O(true);
            }
        }
    };
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final v9 V = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            w9.this.k0(true);
        }
    };

    public static void d0(w9 w9Var, k0 k0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        w9Var.f43364n = null;
        if (w9Var.f43365r) {
            return;
        }
        w9Var.f43357a0.setLoading(false);
        if (wallettransaction != null && k0.b(w9Var.f43363f, k0Var.t())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f27150id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            w5.G0(w9Var.getParentActivity(), w9Var.currentAccount, wallettransaction, new s(w9Var, k0Var, user, str), new d(w9Var, 10), null, null, w9Var.getResourceProvider());
            return;
        }
        w9Var.h = false;
        fc a02 = fc.a0(w9Var);
        if (str2 == null) {
            str2 = bd.M0(2131743182, null);
        }
        a02.e0(str2, false);
    }

    public static void e0(w9 w9Var, String str) {
        String l02 = l0(str);
        if (!w9Var.isFinished && w9Var.O != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i3 = w9Var.currentAccount;
                hp.s1(i3).d2().a(l02.substring(1), null, new gi.s3(new q9(w9Var, 1), i3));
                return;
            }
            w9Var.O.setText(l02);
            bh.g gVar = w9Var.O;
            gVar.setSelection(gVar.length());
            org.telegram.messenger.g0.v1(w9Var.O);
            w9Var.m0(l02, null);
        }
    }

    public static void f0(w9 w9Var, String str, int i3) {
        w9Var.L = null;
        int i10 = w9Var.currentAccount;
        gi.s3 s3Var = new gi.s3(w9Var, i3, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        w9Var.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new c3.b(1), new ai.q4(29, str, s3Var), hp.s1(i10).O3, 0);
    }

    public static void g0(View view, boolean z10, boolean z11) {
        float f10;
        view.animate().cancel();
        view.setEnabled(z10);
        float f11 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            f11 = 0.5f;
        }
        int i3 = 0;
        if (!z11) {
            view.setAlpha(f10);
            view.setScaleX(f11);
            view.setScaleY(f11);
            if (!z10) {
                i3 = 8;
            }
            view.setVisibility(i3);
            return;
        }
        view.setVisibility(0);
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(xq.h).withEndAction(new up0(15, view, z10)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !l10.x(user) && !l10.A(user.f27150id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri b12 = w5.b1(str);
        if ("ton".equalsIgnoreCase(b12.getScheme())) {
            if ("transfer".equalsIgnoreCase(b12.getAuthority()) && b12.getPathSegments().size() == 1) {
                String str2 = b12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!w5.C0(b12)) {
            return null;
        } else {
            String c12 = w5.c1(b12);
            if (c12 != null) {
                return "@".concat(c12);
            }
            String queryParameter = b12.getQueryParameter("to");
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
            return t4.c.f("@", queryParameter);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        float f10;
        ArrayList arrayList2;
        int i3;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.N != null) {
            arrayList.add(r31.D(org.telegram.messenger.g0.L(4.0f)));
            f41Var.V();
            arrayList.add(r31.u(bd.M0(2131743050, null)));
            kw0 kw0Var = this.N;
            r31 r31Var = new r31(-1);
            r31Var.f37620c = kw0Var;
            r31Var.f37640z = 50;
            arrayList.add(r31Var);
            f41Var.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f43369y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(getThemedColor(org.telegram.ui.ActionBar.k6.f27972i6), 2, -1));
                    boolean z10 = bd.f21784a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    this.Y = L;
                    imageView.setImageDrawable(new xp(L, getParentActivity().getResources().getDrawable(2131231829).mutate()));
                    int i13 = i11 | 16;
                    if (z10) {
                        f11 = 0.0f;
                    } else {
                        f11 = 11.0f;
                    }
                    if (z10) {
                        f12 = 11.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    frameLayout.addView(imageView, mf.d(46, 46.0f, i13, f11, 0.0f, f12, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    textView.setText(bd.M0(2131743109, null));
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine();
                    textView.setGravity(i11);
                    if (z10) {
                        f13 = 16.0f;
                    } else {
                        f13 = 72.0f;
                    }
                    if (z10) {
                        f14 = 72.0f;
                    } else {
                        f14 = 16.0f;
                    }
                    frameLayout.addView(textView, mf.d(-1, 24.0f, 48, f13, 8.0f, f14, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(this.I, org.telegram.ui.ActionBar.k6.f28273y6, getResourceProvider());
                    this.I.setSingleLine();
                    this.I.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    this.I.setGravity(i11);
                    TextView textView3 = this.I;
                    if (z10) {
                        f15 = 16.0f;
                    } else {
                        f15 = 72.0f;
                    }
                    if (z10) {
                        f16 = 72.0f;
                    } else {
                        f16 = 16.0f;
                    }
                    frameLayout.addView(textView3, mf.d(-1, 22.0f, 48, f15, 32.0f, f16, 0.0f));
                    frameLayout.setOnClickListener(new p9(this, 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = bd.M0(2131743109, null);
                }
                textView4.setText(str);
                this.I.setText(this.f43369y);
                arrayList.add(r31.D(org.telegram.messenger.g0.L(12.0f)));
                f41Var.V();
                FrameLayout frameLayout2 = this.H;
                r31 r31Var2 = new r31(-1);
                r31Var2.f37620c = frameLayout2;
                r31Var2.f37640z = 60;
                arrayList.add(r31Var2);
                f41Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = li.b0(this.currentAccount).f24032j1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(a22) && hashSet.add(Long.valueOf(a22.f27150id))) {
                        arrayList2.add(a22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f43366s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f27150id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f43367w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(f10)));
                    f41Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        arrayList.add(r31.u(bd.M0(2131746378, null)));
                    }
                }
                r31 w10 = r31.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f37627l = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String n4 = l10.n(user2);
                    if (!TextUtils.isEmpty(n4)) {
                        w10.f37628m = org.telegram.messenger.g0.r0(t4.c.f("@", n4), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.F = new m(user2, w10.f37627l, w10.f37628m, 8);
                } else {
                    i10 = i12;
                }
                arrayList.add(w10);
                i16++;
                i12 = i10;
            }
            int i18 = i12;
            if (this.M) {
                if (i16 == 0) {
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(f10)));
                    f41Var.V();
                }
                if (this.E != null) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                for (int i19 = i18; i19 < i3; i19++) {
                    arrayList.add(r31.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.M) {
                f41Var.U();
            }
            if (!this.M && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = bd.M0(2131745811, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                String a02 = bd.a0(null, null, 2131743035, objArr);
                int i20 = org.telegram.ui.Components.li.f35732b;
                r31 K = r31.K(org.telegram.ui.Components.li.class);
                K.f37627l = M0;
                K.f37628m = a02;
                arrayList.add(K);
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i3;
        if (this.f43361e == null) {
            i3 = 2131743030;
        } else {
            i3 = 2131742990;
        }
        return bd.M0(i3, null);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i3 = this.currentAccount;
            qr.a0(i3).f24934a.c(new ci.s9(i3, user.f27150id, 2));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34298a);
        this.f34298a.r1();
        this.f34298a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f34298a.setClipToPadding(false);
        ai.h4 h4Var = this.f34298a;
        h4Var.f35594g3.f33698r = false;
        h4Var.j(new ji(this, 25));
        kw0 kw0Var = new kw0(6, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        bh.g gVar = new bh.g(context);
        this.O = gVar;
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        bh.g gVar2 = this.O;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.72f, org.telegram.ui.ActionBar.k6.H6);
        org.telegram.ui.ActionBar.r6.o(gVar2, 1, L.f28359a, -1, 2, L.d, getResourceProvider());
        boolean z10 = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(bd.M0(2131743207, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        kw0Var.addView(this.O, mf.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(bd.M0(2131743065, null));
        TextView textView2 = this.P;
        int i3 = org.telegram.ui.ActionBar.k6.f28062n6;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i3));
        TextView textView3 = this.P;
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.18f, getThemedColor(i3));
        org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, r12, r13, r13), org.telegram.ui.ActionBar.r6.L(0.1f, i3), org.telegram.ui.ActionBar.r6.L(0.18f, i3), getResourceProvider());
        this.P.setOnClickListener(new p9(this, 2));
        pf.b(this.P, 0.04f, 1.2f);
        kw0Var.addView(this.P, mf.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new bh.h(this, 29));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232676);
        org.telegram.ui.ActionBar.r6.t(this.Q, i3, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.r6.R(this.Q, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.12f, getThemedColor(i3)), 1, -1), null, org.telegram.ui.ActionBar.r6.L(0.12f, i3), getResourceProvider());
        this.Q.setContentDescription(bd.M0(2131743037, null));
        this.Q.setOnClickListener(new p9(this, 3));
        kw0Var.addView(this.Q, mf.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = kw0Var;
        kg.v1 v1Var = new kg.v1(true);
        this.f43368x = v1Var;
        v1Var.f17206a = new org.telegram.ui.Components.i9(this, 9);
        getNotificationCenter().c(this.J, hs.S0);
        li.b0(this.currentAccount).M0(true);
        this.f43366s.clear();
        int i10 = this.currentAccount;
        qr.a0(i10).f24934a.c(new k2.u(i10, 0, new s9(this), 2));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            bh.g gVar3 = this.O;
            gVar3.setSelection(gVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor}));
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f43357a0 = dVar;
        dVar.setText(bd.M0(2131743164, null));
        this.f43357a0.setEnabled(false);
        this.f43357a0.setOnClickListener(new p9(this, 1));
        gi.d dVar2 = this.f43357a0;
        if (dVar2 != null) {
            if (this.f43369y == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.W.addView(this.f43357a0, mf.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, mf.e(-1, 68, 87));
        o0();
        this.f34298a.f35594g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f43362e0 == null && this.Q != null) {
            org.telegram.messenger.g0.v1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f43362e0 = bi.a0.k(this, this.Q, new bi.x(13), new q9(this, 0), new r9(this, 0));
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String p10;
        String n4;
        ArrayList arrayList = this.f43367w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f43369y == null && this.E == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = getMessagesController().K;
            int size = arrayList2.size();
            int i3 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                if (dialog != null && dialog.f27005id > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(dialog.f27005id));
                    if (h0(a22) && (((p10 = l10.p(a22)) != null && p10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((n4 = l10.n(a22)) != null && n4.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(a22.f27150id))) {
                            arrayList.add(a22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f43368x.f17209e;
            int size2 = arrayList3.size();
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f27150id))) {
                        arrayList.add(user);
                    }
                }
            }
            ai.h4 h4Var = this.f34298a;
            if (h4Var != null) {
                h4Var.f35594g3.O(true);
                return;
            }
            return;
        }
        ai.h4 h4Var2 = this.f34298a;
        if (h4Var2 != null) {
            h4Var2.f35594g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (!this.f43365r && this.O != null && this.Q != null) {
            ClipboardManager clipboardManager = this.U;
            if (clipboardManager != null) {
                this.T = clipboardManager.hasPrimaryClip();
            } else {
                this.T = false;
            }
            p0(z10);
        }
    }

    public final void m0(String str, TLRPC.User user) {
        String str2;
        m9 m9Var;
        if (this.f43361e == null) {
            if (user != null) {
                m9Var = new m9(user);
            } else {
                m9 m9Var2 = new m9(str);
                if (TextUtils.equals(str, this.f43369y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                m9Var2.A0(str2);
                m9Var = m9Var2;
            }
            presentFragment(m9Var);
        } else if (this.h) {
        } else {
            this.h = true;
            this.f43357a0.setLoading(true);
            k0 x10 = k0.x(this.currentAccount);
            m mVar = new m(this, x10, user);
            if (user != null) {
                x10.a0(user, new s1(4, this, mVar));
            } else {
                mVar.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.f43361e = nftitem;
        this.f43363f = k0.x(this.currentAccount).t();
    }

    public final void o0() {
        int max = Math.max(0, this.f43359c0 - this.f43358b0);
        ai.h4 h4Var = this.f34298a;
        if (h4Var != null) {
            h4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f43358b0 + max);
            this.f34298a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f43358b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f43358b0;
            this.W.setLayoutParams(layoutParams);
            if (this.f43360d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
                this.f43360d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        bi.a0 a0Var = this.f43362e0;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        this.f43365r = true;
        bi.a0 a0Var = this.f43362e0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.f43362e0);
            this.f43362e0 = null;
        }
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        TextView textView = this.P;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.Q;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().n(this.J, hs.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        l lVar = this.f43364n;
        if (lVar != null) {
            lVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f43358b0 = i12;
        o0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f43359c0 = k1Var.f54026a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        bi.a0 a0Var = this.f43362e0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.f43362e0);
            this.f43362e0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i3, strArr, iArr);
        if (i3 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                i0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(bd.M0(2131746511, null));
            alertDialog$Builder.k(bd.M0(2131747308, null), new s9(this));
            alertDialog$Builder.h(bd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            v9 v9Var = this.V;
            clipboardManager.removePrimaryClipChangedListener(v9Var);
            this.U.addPrimaryClipChangedListener(v9Var);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(getThemedColor(org.telegram.ui.ActionBar.k6.Ci), shapeDrawable);
                ImageView imageView = this.X;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        boolean z11;
        float f10;
        if (this.Q != null) {
            boolean z12 = false;
            if (this.O.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.T) {
                z12 = true;
            }
            if (this.R != z12 || !z10) {
                this.R = z12;
                g0(this.P, z12, z10);
            }
            if (this.S != z11 || !z10) {
                this.S = z11;
                g0(this.Q, z11, z10);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            if (this.R) {
                f10 = 128.0f;
            } else if (this.S) {
                f10 = 60.0f;
            } else {
                f10 = 8.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.O.setLayoutParams(layoutParams);
            }
        }
    }
}
