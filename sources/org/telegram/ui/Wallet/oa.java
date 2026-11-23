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
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.w01;
public final class oa extends d51 {
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
    public hi.e f44835a0;
    public int f44836b0;
    public int f44837c0;
    public int f44838d0;
    public TL_wallet.nftItem f44839e;
    public ci.b0 f44840e0;
    public String f44841f;
    public boolean h;
    public m f44842n;
    public boolean f44843r;
    public jg.z1 f44846x;
    public String f44847y;
    public final ArrayList f44844s = new ArrayList();
    public final ArrayList f44845w = new ArrayList();
    public final ma J = new fs() {
        @Override
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            bi.i6 i6Var;
            oa oaVar = oa.this;
            if (!oaVar.f44843r && (i6Var = oaVar.f34213a) != null) {
                i6Var.f35323g3.O(true);
            }
        }
    };
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final na V = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            oa.this.k0(true);
        }
    };

    public static void d0(oa oaVar, v0 v0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        oaVar.f44842n = null;
        if (oaVar.f44843r) {
            return;
        }
        oaVar.f44835a0.setLoading(false);
        if (wallettransaction != null && v0.c(oaVar.f44841f, v0Var.y())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f28641id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            o6.K0(oaVar.getParentActivity(), oaVar.currentAccount, wallettransaction, new w(oaVar, v0Var, user, str), new e(oaVar, 10), null, null, oaVar.getResourceProvider());
            return;
        }
        oaVar.h = false;
        kc b02 = kc.b0(oaVar);
        if (str2 == null) {
            str2 = gd.N0(2131742921, null);
        }
        b02.f0(str2, false);
    }

    public static void e0(oa oaVar, String str) {
        String l02 = l0(str);
        if (!oaVar.isFinished && oaVar.O != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i7 = oaVar.currentAccount;
                mp.u1(i7).f2().a(l02.substring(1), null, new hi.a4(i7, new ia(oaVar, 1), 7));
                return;
            }
            oaVar.O.setText(l02);
            ah.i iVar = oaVar.O;
            iVar.setSelection(iVar.length());
            org.telegram.messenger.g0.v1(oaVar.O);
            oaVar.m0(l02, null);
        }
    }

    public static void f0(oa oaVar, String str, int i7) {
        oaVar.L = null;
        int i10 = oaVar.currentAccount;
        hi.a4 a4Var = new hi.a4(oaVar, i7, 8);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        oaVar.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new f0(2, str, a4Var), mp.u1(i10).Q3, 0);
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
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(kr.h).withEndAction(new qp0(16, view, z10)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !n10.y(user) && !n10.B(user.f28641id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri i12 = o6.i1(str);
        if ("ton".equalsIgnoreCase(i12.getScheme())) {
            if ("transfer".equalsIgnoreCase(i12.getAuthority()) && i12.getPathSegments().size() == 1) {
                String str2 = i12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!o6.G0(i12)) {
            return null;
        } else {
            String j12 = o6.j1(i12);
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
    public final void Z(ArrayList arrayList, b51 b51Var) {
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
            arrayList.add(n41.D(org.telegram.messenger.g0.L(4.0f)));
            b51Var.V();
            arrayList.add(n41.u(gd.N0(2131742769, null)));
            w01 w01Var = this.N;
            n41 n41Var = new n41(-1);
            n41Var.f37647c = w01Var;
            n41Var.A = 50;
            arrayList.add(n41Var);
            b51Var.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f44847y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(getThemedColor(org.telegram.ui.ActionBar.n6.f29543i6), 2, -1));
                    boolean z10 = gd.f24314a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    this.Y = L;
                    imageView.setImageDrawable(new lq(L, getParentActivity().getResources().getDrawable(2131231833).mutate()));
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
                    frameLayout.addView(imageView, c8.na.d(46, 46.0f, i13, f11, 0.0f, f12, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    m10.l(16.0f, 2131742847, 1, textView, null);
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
                    frameLayout.addView(textView, c8.na.d(-1, 24.0f, 48, f13, 8.0f, f14, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(this.I, org.telegram.ui.ActionBar.n6.f29843y6, getResourceProvider());
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
                    frameLayout.addView(textView3, c8.na.d(-1, 22.0f, 48, f15, 32.0f, f16, 0.0f));
                    frameLayout.setOnClickListener(new ha(this, 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = gd.N0(2131742847, null);
                }
                textView4.setText(str);
                this.I.setText(this.f44847y);
                arrayList.add(n41.D(org.telegram.messenger.g0.L(12.0f)));
                b51Var.V();
                FrameLayout frameLayout2 = this.H;
                n41 n41Var2 = new n41(-1);
                n41Var2.f37647c = frameLayout2;
                n41Var2.A = 60;
                arrayList.add(n41Var2);
                b51Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = ri.d0(this.currentAccount).f26721j1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(c22) && hashSet.add(Long.valueOf(c22.f28641id))) {
                        arrayList2.add(c22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f44844s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f28641id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f44845w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(n41.D(org.telegram.messenger.g0.L(f10)));
                    b51Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i5.c.s(2131746174, null, arrayList);
                    }
                }
                n41 w10 = n41.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f37655m = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String o4 = n10.o(user2);
                    if (!TextUtils.isEmpty(o4)) {
                        w10.f37656n = org.telegram.messenger.g0.r0(p5.c.k("@", o4), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.G = new o(user2, w10.f37655m, w10.f37656n, 9);
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
                    arrayList.add(n41.D(org.telegram.messenger.g0.L(f10)));
                    b51Var.V();
                }
                if (this.E != null) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                for (int i19 = i18; i19 < i7; i19++) {
                    arrayList.add(n41.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.M) {
                b51Var.U();
            }
            if (!this.M && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String N0 = gd.N0(2131745605, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                arrayList.add(bj.i(gd.a0(null, null, 2131742754, objArr), N0));
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i7;
        if (this.f44839e == null) {
            i7 = 2131742749;
        } else {
            i7 = 2131742709;
        }
        return gd.N0(i7, null);
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            tr.a0(i7).f27149a.c(new di.m9(i7, user.f28641id, 1));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34213a);
        this.f34213a.r1();
        this.f34213a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f34213a.setClipToPadding(false);
        bi.i6 i6Var = this.f34213a;
        i6Var.f35323g3.f33631r = false;
        i6Var.j(new org.telegram.ui.Components.na(this, 26));
        w01 w01Var = new w01(5, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.O = iVar;
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        ah.i iVar2 = this.O;
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.72f, org.telegram.ui.ActionBar.n6.H6);
        org.telegram.ui.ActionBar.u6.n(iVar2, 1, K.f30010a, -1, 2, K.d, getResourceProvider());
        boolean z10 = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(gd.N0(2131742946, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        w01Var.addView(this.O, c8.na.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(gd.N0(2131742784, null));
        TextView textView2 = this.P;
        int i7 = org.telegram.ui.ActionBar.n6.f29633n6;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i7));
        TextView textView3 = this.P;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.18f, getThemedColor(i7));
        org.telegram.ui.ActionBar.u6.Q(textView3, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.u6.K(0.1f, i7), org.telegram.ui.ActionBar.u6.K(0.18f, i7), getResourceProvider());
        this.P.setOnClickListener(new ha(this, 2));
        c8.sa.b(this.P, 0.04f, 1.2f);
        w01Var.addView(this.P, c8.na.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new j9(this, 2));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232683);
        org.telegram.ui.ActionBar.u6.s(this.Q, i7, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.u6.Q(this.Q, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, getThemedColor(i7)), 1, -1), null, org.telegram.ui.ActionBar.u6.K(0.12f, i7), getResourceProvider());
        this.Q.setContentDescription(gd.N0(2131742756, null));
        this.Q.setOnClickListener(new ha(this, 3));
        w01Var.addView(this.Q, c8.na.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = w01Var;
        jg.z1 z1Var = new jg.z1(true);
        this.f44846x = z1Var;
        z1Var.f17823a = new org.telegram.ui.Cells.aa(this, 10);
        getNotificationCenter().c(this.J, ks.S0);
        ri.d0(this.currentAccount).P0(true);
        this.f44844s.clear();
        int i10 = this.currentAccount;
        tr.a0(i10).f27149a.c(new jg.q(i10, 0, new ka(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            ah.i iVar3 = this.O;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor, themedColor}));
        hi.e eVar = new hi.e(context, getResourceProvider(), true);
        eVar.setRoundRadius(24);
        this.f44835a0 = eVar;
        eVar.setText(gd.N0(2131742903, null));
        this.f44835a0.setEnabled(false);
        this.f44835a0.setOnClickListener(new ha(this, 1));
        hi.e eVar2 = this.f44835a0;
        if (eVar2 != null) {
            if (this.f44847y == null) {
                z10 = false;
            }
            eVar2.setEnabled(z10);
        }
        this.W.addView(this.f44835a0, c8.na.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, c8.na.e(-1, 68, 87));
        o0();
        this.f34213a.f35323g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f44840e0 == null && this.Q != null) {
            org.telegram.messenger.g0.v1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f44840e0 = ci.b0.k(this, this.Q, new ci.y(13), new ia(this, 0), new ja(this, 0));
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
        ArrayList arrayList = this.f44845w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f44847y == null && this.E == null) {
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
                if (dialog != null && dialog.f28496id > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(dialog.f28496id));
                    if (h0(c22) && (((q10 = n10.q(c22)) != null && q10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((o4 = n10.o(c22)) != null && o4.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(c22.f28641id))) {
                            arrayList.add(c22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f44846x.f17826e;
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f28641id))) {
                        arrayList.add(user);
                    }
                }
            }
            bi.i6 i6Var = this.f34213a;
            if (i6Var != null) {
                i6Var.f35323g3.O(true);
                return;
            }
            return;
        }
        bi.i6 i6Var2 = this.f34213a;
        if (i6Var2 != null) {
            i6Var2.f35323g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (!this.f44843r && this.O != null && this.Q != null) {
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
        ea eaVar;
        if (this.f44839e == null) {
            if (user != null) {
                eaVar = new ea(user);
            } else {
                ea eaVar2 = new ea(str);
                if (TextUtils.equals(str, this.f44847y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                eaVar2.A0(str2);
                eaVar = eaVar2;
            }
            presentFragment(eaVar);
        } else if (this.h) {
        } else {
            this.h = true;
            this.f44835a0.setLoading(true);
            v0 D = v0.D(this.currentAccount);
            o oVar = new o(this, D, user);
            if (user != null) {
                D.j0(user, new f0(7, this, oVar));
            } else {
                oVar.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.f44839e = nftitem;
        this.f44841f = v0.D(this.currentAccount).y();
    }

    public final void o0() {
        int max = Math.max(0, this.f44837c0 - this.f44836b0);
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null) {
            i6Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f44836b0 + max);
            this.f34213a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f44836b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f44836b0;
            this.W.setLayoutParams(layoutParams);
            if (this.f44838d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(kr.h).start();
                this.f44838d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.f44840e0;
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
        this.f44843r = true;
        ci.b0 b0Var = this.f44840e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44840e0);
            this.f44840e0 = null;
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
        m mVar = this.f44842n;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44836b0 = i12;
        o0();
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f44837c0 = l1Var.f56381a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        ci.b0 b0Var = this.f44840e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44840e0);
            this.f44840e0 = null;
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
            alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(gd.N0(2131746307, null));
            alertDialog$Builder.k(gd.N0(2131747106, null), new ka(this));
            alertDialog$Builder.h(gd.N0(2131751760, null), null);
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
            na naVar = this.V;
            clipboardManager.removePrimaryClipChangedListener(naVar);
            this.U.addPrimaryClipChangedListener(naVar);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7)) != this.Z) {
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
