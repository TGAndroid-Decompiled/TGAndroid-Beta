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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.z41;
public final class na extends b51 {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public w01 N;
    public ah.i O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public hi.d f44663a0;
    public int f44664b0;
    public int f44665c0;
    public int f44666d0;
    public TL_wallet.nftItem f44667e;
    public ci.b0 f44668e0;
    public String f44669f;
    public boolean h;
    public m f44670n;
    public boolean f44671r;
    public jg.z1 f44674x;
    public String f44675y;
    public final ArrayList f44672s = new ArrayList();
    public final ArrayList f44673w = new ArrayList();
    public final la J = new fs() {
        @Override
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            bi.c6 c6Var;
            na naVar = na.this;
            if (!naVar.f44671r && (c6Var = naVar.f33530a) != null) {
                c6Var.f34607g3.O(true);
            }
        }
    };
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final ma V = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            na.this.k0(true);
        }
    };

    public static void d0(na naVar, u0 u0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        naVar.f44670n = null;
        if (naVar.f44671r) {
            return;
        }
        naVar.f44663a0.setLoading(false);
        if (wallettransaction != null && u0.c(naVar.f44669f, u0Var.y())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f28552id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            n6.K0(naVar.getParentActivity(), naVar.currentAccount, wallettransaction, new v(naVar, u0Var, user, str), new e(naVar, 10), null, null, naVar.getResourceProvider());
            return;
        }
        naVar.h = false;
        lc b02 = lc.b0(naVar);
        if (str2 == null) {
            str2 = gd.M0(2131742934, null);
        }
        b02.f0(str2, false);
    }

    public static void e0(na naVar, String str) {
        String l02 = l0(str);
        if (!naVar.isFinished && naVar.O != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i7 = naVar.currentAccount;
                mp.u1(i7).f2().a(l02.substring(1), null, new ai.y1(i7, new ha(naVar, 1), 8));
                return;
            }
            naVar.O.setText(l02);
            ah.i iVar = naVar.O;
            iVar.setSelection(iVar.length());
            org.telegram.messenger.g0.v1(naVar.O);
            naVar.m0(l02, null);
        }
    }

    public static void f0(na naVar, String str, int i7) {
        naVar.L = null;
        int i10 = naVar.currentAccount;
        ai.y1 y1Var = new ai.y1(naVar, i7, 9);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        naVar.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new e0(2, str, y1Var), mp.u1(i10).Q3, 0);
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
        int i7 = 0;
        if (!z11) {
            view.setAlpha(f10);
            view.setScaleX(f11);
            view.setScaleY(f11);
            if (!z10) {
                i7 = 8;
            }
            view.setVisibility(i7);
            return;
        }
        view.setVisibility(0);
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(lr.h).withEndAction(new pp0(16, view, z10)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !o10.y(user) && !o10.B(user.f28552id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri i12 = n6.i1(str);
        if ("ton".equalsIgnoreCase(i12.getScheme())) {
            if ("transfer".equalsIgnoreCase(i12.getAuthority()) && i12.getPathSegments().size() == 1) {
                String str2 = i12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!n6.G0(i12)) {
            return null;
        } else {
            String j12 = n6.j1(i12);
            if (j12 != null) {
                return "@".concat(j12);
            }
            String queryParameter = i12.getQueryParameter("to");
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
            return p5.c.k("@", queryParameter);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, z41 z41Var) {
        float f10;
        ArrayList arrayList2;
        int i7;
        int i10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.N != null) {
            arrayList.add(l41.D(org.telegram.messenger.g0.L(4.0f)));
            z41Var.V();
            arrayList.add(l41.u(gd.M0(2131742782, null)));
            w01 w01Var = this.N;
            l41 l41Var = new l41(-1);
            l41Var.f37010c = w01Var;
            l41Var.A = 50;
            arrayList.add(l41Var);
            z41Var.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f44675y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(getThemedColor(org.telegram.ui.ActionBar.n6.f29486i6), 2, -1));
                    boolean z10 = gd.f24213a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    this.Y = L;
                    imageView.setImageDrawable(new mq(L, getParentActivity().getResources().getDrawable(2131231830).mutate()));
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
                    frameLayout.addView(imageView, c8.ma.d(46, 46.0f, i13, f11, 0.0f, f12, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    n10.l(16.0f, 2131742860, 1, textView, null);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
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
                    frameLayout.addView(textView, c8.ma.d(-1, 24.0f, 48, f13, 8.0f, f14, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(this.I, org.telegram.ui.ActionBar.n6.f29786y6, getResourceProvider());
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
                    frameLayout.addView(textView3, c8.ma.d(-1, 22.0f, 48, f15, 32.0f, f16, 0.0f));
                    frameLayout.setOnClickListener(new ga(this, 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = gd.M0(2131742860, null);
                }
                textView4.setText(str);
                this.I.setText(this.f44675y);
                arrayList.add(l41.D(org.telegram.messenger.g0.L(12.0f)));
                z41Var.V();
                FrameLayout frameLayout2 = this.H;
                l41 l41Var2 = new l41(-1);
                l41Var2.f37010c = frameLayout2;
                l41Var2.A = 60;
                arrayList.add(l41Var2);
                z41Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = ri.d0(this.currentAccount).f26620j1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(c22) && hashSet.add(Long.valueOf(c22.f28552id))) {
                        arrayList2.add(c22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f44672s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f28552id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f44673w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(l41.D(org.telegram.messenger.g0.L(f10)));
                    z41Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i5.c.s(2131746175, null, arrayList);
                    }
                }
                l41 w10 = l41.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f37018m = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String o4 = o10.o(user2);
                    if (!TextUtils.isEmpty(o4)) {
                        w10.f37019n = org.telegram.messenger.g0.r0(p5.c.k("@", o4), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.G = new o(user2, w10.f37018m, w10.f37019n, 9);
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
                    arrayList.add(l41.D(org.telegram.messenger.g0.L(f10)));
                    z41Var.V();
                }
                if (this.E != null) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                for (int i19 = i18; i19 < i7; i19++) {
                    arrayList.add(l41.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.M) {
                z41Var.U();
            }
            if (!this.M && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = gd.M0(2131745606, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                arrayList.add(aj.i(gd.a0(null, null, 2131742767, objArr), M0));
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i7;
        if (this.f44667e == null) {
            i7 = 2131742762;
        } else {
            i7 = 2131742722;
        }
        return gd.M0(i7, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            tr.a0(i7).f27052a.c(new di.l9(i7, user.f28552id, 1));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f33530a);
        this.f33530a.r1();
        this.f33530a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f33530a.setClipToPadding(false);
        bi.c6 c6Var = this.f33530a;
        c6Var.f34607g3.f42809r = false;
        c6Var.j(new org.telegram.ui.Components.oa(this, 26));
        w01 w01Var = new w01(5, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.O = iVar;
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        ah.i iVar2 = this.O;
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.72f, org.telegram.ui.ActionBar.n6.H6);
        org.telegram.ui.ActionBar.u6.n(iVar2, 1, K.f29909a, -1, 2, K.d, getResourceProvider());
        boolean z10 = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(gd.M0(2131742959, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        w01Var.addView(this.O, c8.ma.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(gd.M0(2131742797, null));
        TextView textView2 = this.P;
        int i7 = org.telegram.ui.ActionBar.n6.f29576n6;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i7));
        TextView textView3 = this.P;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.18f, getThemedColor(i7));
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.u6.K(0.1f, i7), org.telegram.ui.ActionBar.u6.K(0.18f, i7), getResourceProvider());
        this.P.setOnClickListener(new ga(this, 2));
        c8.ra.b(this.P, 0.04f, 1.2f);
        w01Var.addView(this.P, c8.ma.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new i9(this, 2));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232680);
        org.telegram.ui.ActionBar.u6.s(this.Q, i7, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.u6.Q(this.Q, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, getThemedColor(i7)), 1, -1), null, org.telegram.ui.ActionBar.u6.K(0.12f, i7), getResourceProvider());
        this.Q.setContentDescription(gd.M0(2131742769, null));
        this.Q.setOnClickListener(new ga(this, 3));
        w01Var.addView(this.Q, c8.ma.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = w01Var;
        jg.z1 z1Var = new jg.z1(true);
        this.f44674x = z1Var;
        z1Var.f17727a = new of(this, 8);
        getNotificationCenter().c(this.J, ks.S0);
        ri.d0(this.currentAccount).P0(true);
        this.f44672s.clear();
        int i10 = this.currentAccount;
        tr.a0(i10).f27052a.c(new jg.q(i10, 0, new ja(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            ah.i iVar3 = this.O;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor, themedColor}));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f44663a0 = dVar;
        dVar.setText(gd.M0(2131742916, null));
        this.f44663a0.setEnabled(false);
        this.f44663a0.setOnClickListener(new ga(this, 1));
        hi.d dVar2 = this.f44663a0;
        if (dVar2 != null) {
            if (this.f44675y == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.W.addView(this.f44663a0, c8.ma.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, c8.ma.e(-1, 68, 87));
        o0();
        this.f33530a.f34607g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f44668e0 == null && this.Q != null) {
            org.telegram.messenger.g0.v1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f44668e0 = ci.b0.k(this, this.Q, new ci.y(13), new ha(this, 0), new ia(this, 0));
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String q10;
        String o4;
        ArrayList arrayList = this.f44673w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f44675y == null && this.E == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = getMessagesController().K;
            int size = arrayList2.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                if (dialog != null && dialog.f28407id > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(dialog.f28407id));
                    if (h0(c22) && (((q10 = o10.q(c22)) != null && q10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((o4 = o10.o(c22)) != null && o4.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(c22.f28552id))) {
                            arrayList.add(c22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f44674x.f17730e;
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f28552id))) {
                        arrayList.add(user);
                    }
                }
            }
            bi.c6 c6Var = this.f33530a;
            if (c6Var != null) {
                c6Var.f34607g3.O(true);
                return;
            }
            return;
        }
        bi.c6 c6Var2 = this.f33530a;
        if (c6Var2 != null) {
            c6Var2.f34607g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (!this.f44671r && this.O != null && this.Q != null) {
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
        da daVar;
        if (this.f44667e == null) {
            if (user != null) {
                daVar = new da(user);
            } else {
                da daVar2 = new da(str);
                if (TextUtils.equals(str, this.f44675y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                daVar2.A0(str2);
                daVar = daVar2;
            }
            presentFragment(daVar);
        } else if (this.h) {
        } else {
            this.h = true;
            this.f44663a0.setLoading(true);
            u0 D = u0.D(this.currentAccount);
            o oVar = new o(this, D, user);
            if (user != null) {
                D.j0(user, new e0(7, this, oVar));
            } else {
                oVar.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.f44667e = nftitem;
        this.f44669f = u0.D(this.currentAccount).y();
    }

    public final void o0() {
        int max = Math.max(0, this.f44665c0 - this.f44664b0);
        bi.c6 c6Var = this.f33530a;
        if (c6Var != null) {
            c6Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f44664b0 + max);
            this.f33530a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f44664b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f44664b0;
            this.W.setLayoutParams(layoutParams);
            if (this.f44666d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(lr.h).start();
                this.f44666d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.f44668e0;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        this.f44671r = true;
        ci.b0 b0Var = this.f44668e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44668e0);
            this.f44668e0 = null;
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
        getNotificationCenter().n(this.J, ks.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        m mVar = this.f44670n;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44664b0 = i12;
        o0();
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f44665c0 = l1Var.f56258a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        ci.b0 b0Var = this.f44668e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44668e0);
            this.f44668e0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i7, strArr, iArr);
        if (i7 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                i0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28744a.U = org.telegram.messenger.g0.W2(gd.M0(2131746308, null));
            alertDialog$Builder.k(gd.M0(2131747107, null), new ja(this));
            alertDialog$Builder.h(gd.M0(2131751761, null), null);
            int i10 = org.telegram.ui.ActionBar.n6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            ma maVar = this.V;
            clipboardManager.removePrimaryClipChangedListener(maVar);
            this.U.addPrimaryClipChangedListener(maVar);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.n6.C1(getThemedColor(org.telegram.ui.ActionBar.n6.Fi), shapeDrawable);
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
