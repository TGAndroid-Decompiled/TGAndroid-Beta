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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.x01;
public final class na extends e51 {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public x01 N;
    public ah.i O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public hi.d f44673a0;
    public int f44674b0;
    public int f44675c0;
    public int f44676d0;
    public TL_wallet.nftItem f44677e;
    public ci.b0 f44678e0;
    public String f44679f;
    public boolean h;
    public m f44680n;
    public boolean f44681r;
    public jg.z1 f44684x;
    public String f44685y;
    public final ArrayList f44682s = new ArrayList();
    public final ArrayList f44683w = new ArrayList();
    public final la J = new gs() {
        @Override
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            bi.i6 i6Var;
            na naVar = na.this;
            if (!naVar.f44681r && (i6Var = naVar.f34671a) != null) {
                i6Var.f35742g3.O(true);
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
        naVar.f44680n = null;
        if (naVar.f44681r) {
            return;
        }
        naVar.f44673a0.setLoading(false);
        if (wallettransaction != null && u0.c(naVar.f44679f, u0Var.y())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f28547id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            n6.K0(naVar.getParentActivity(), naVar.currentAccount, wallettransaction, new v(naVar, u0Var, user, str), new e(naVar, 10), null, null, naVar.getResourceProvider());
            return;
        }
        naVar.h = false;
        lc b02 = lc.b0(naVar);
        if (str2 == null) {
            str2 = hd.N0(2131742928, null);
        }
        b02.f0(str2, false);
    }

    public static void e0(na naVar, String str) {
        String l02 = l0(str);
        if (!naVar.isFinished && naVar.O != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i7 = naVar.currentAccount;
                np.u1(i7).f2().a(l02.substring(1), null, new hi.r3(i7, new ha(naVar, 1), 7));
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
        hi.r3 r3Var = new hi.r3(naVar, i7, 8);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        naVar.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new e0(2, str, r3Var), np.u1(i10).Q3, 0);
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
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(nr.h).withEndAction(new rp0(16, view, z10)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !p10.y(user) && !p10.B(user.f28547id)) {
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
    public final void Z(ArrayList arrayList, c51 c51Var) {
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
            arrayList.add(o41.D(org.telegram.messenger.g0.L(4.0f)));
            c51Var.V();
            arrayList.add(o41.u(hd.N0(2131742776, null)));
            x01 x01Var = this.N;
            o41 o41Var = new o41(-1);
            o41Var.f38050c = x01Var;
            o41Var.A = 50;
            arrayList.add(o41Var);
            c51Var.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f44685y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(getThemedColor(org.telegram.ui.ActionBar.m6.f29439i6), 2, -1));
                    boolean z10 = hd.f24408a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                    this.Y = L;
                    imageView.setImageDrawable(new oq(L, getParentActivity().getResources().getDrawable(2131231830).mutate()));
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
                    o10.l(16.0f, 2131742854, 1, textView, null);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
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
                    org.telegram.ui.ActionBar.t6.U(this.I, org.telegram.ui.ActionBar.m6.f29739y6, getResourceProvider());
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
                    frameLayout.setOnClickListener(new ga(this, 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = hd.N0(2131742854, null);
                }
                textView4.setText(str);
                this.I.setText(this.f44685y);
                arrayList.add(o41.D(org.telegram.messenger.g0.L(12.0f)));
                c51Var.V();
                FrameLayout frameLayout2 = this.H;
                o41 o41Var2 = new o41(-1);
                o41Var2.f38050c = frameLayout2;
                o41Var2.A = 60;
                arrayList.add(o41Var2);
                c51Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = si.d0(this.currentAccount).f26798j1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(c22) && hashSet.add(Long.valueOf(c22.f28547id))) {
                        arrayList2.add(c22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f44682s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f28547id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f44683w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(o41.D(org.telegram.messenger.g0.L(f10)));
                    c51Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i5.c.s(2131746174, null, arrayList);
                    }
                }
                o41 w10 = o41.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f38058m = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String o4 = p10.o(user2);
                    if (!TextUtils.isEmpty(o4)) {
                        w10.f38059n = org.telegram.messenger.g0.r0(p5.c.k("@", o4), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.G = new o(user2, w10.f38058m, w10.f38059n, 9);
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
                    arrayList.add(o41.D(org.telegram.messenger.g0.L(f10)));
                    c51Var.V();
                }
                if (this.E != null) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                for (int i19 = i18; i19 < i7; i19++) {
                    arrayList.add(o41.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.M) {
                c51Var.U();
            }
            if (!this.M && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String N0 = hd.N0(2131745605, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                arrayList.add(cj.i(hd.a0(null, null, 2131742761, objArr), N0));
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i7;
        if (this.f44677e == null) {
            i7 = 2131742756;
        } else {
            i7 = 2131742716;
        }
        return hd.N0(i7, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            ur.a0(i7).f27214a.c(new di.m9(i7, user.f28547id, 1));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34671a);
        this.f34671a.r1();
        this.f34671a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f34671a.setClipToPadding(false);
        bi.i6 i6Var = this.f34671a;
        i6Var.f35742g3.f34026r = false;
        i6Var.j(new org.telegram.ui.Components.oa(this, 26));
        x01 x01Var = new x01(5, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.O = iVar;
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        ah.i iVar2 = this.O;
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.72f, org.telegram.ui.ActionBar.m6.H6);
        org.telegram.ui.ActionBar.t6.n(iVar2, 1, K.f29861a, -1, 2, K.d, getResourceProvider());
        boolean z10 = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(hd.N0(2131742953, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        x01Var.addView(this.O, c8.na.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(hd.N0(2131742791, null));
        TextView textView2 = this.P;
        int i7 = org.telegram.ui.ActionBar.m6.f29529n6;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        TextView textView3 = this.P;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.18f, getThemedColor(i7));
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.t6.K(0.1f, i7), org.telegram.ui.ActionBar.t6.K(0.18f, i7), getResourceProvider());
        this.P.setOnClickListener(new ga(this, 2));
        c8.sa.b(this.P, 0.04f, 1.2f);
        x01Var.addView(this.P, c8.na.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new i9(this, 2));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232680);
        org.telegram.ui.ActionBar.t6.s(this.Q, i7, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.t6.Q(this.Q, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, getThemedColor(i7)), 1, -1), null, org.telegram.ui.ActionBar.t6.K(0.12f, i7), getResourceProvider());
        this.Q.setContentDescription(hd.N0(2131742763, null));
        this.Q.setOnClickListener(new ga(this, 3));
        x01Var.addView(this.Q, c8.na.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = x01Var;
        jg.z1 z1Var = new jg.z1(true);
        this.f44684x = z1Var;
        z1Var.f17721a = new pf(this, 8);
        getNotificationCenter().c(this.J, ls.S0);
        si.d0(this.currentAccount).P0(true);
        this.f44682s.clear();
        int i10 = this.currentAccount;
        ur.a0(i10).f27214a.c(new jg.q(i10, 0, new ja(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            ah.i iVar3 = this.O;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f29290a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor}));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f44673a0 = dVar;
        dVar.setText(hd.N0(2131742910, null));
        this.f44673a0.setEnabled(false);
        this.f44673a0.setOnClickListener(new ga(this, 1));
        hi.d dVar2 = this.f44673a0;
        if (dVar2 != null) {
            if (this.f44685y == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.W.addView(this.f44673a0, c8.na.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, c8.na.e(-1, 68, 87));
        o0();
        this.f34671a.f35742g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f44678e0 == null && this.Q != null) {
            org.telegram.messenger.g0.v1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f44678e0 = ci.b0.k(this, this.Q, new ci.y(13), new ha(this, 0), new ia(this, 0));
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
        ArrayList arrayList = this.f44683w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f44685y == null && this.E == null) {
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
                if (dialog != null && dialog.f28402id > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(dialog.f28402id));
                    if (h0(c22) && (((q10 = p10.q(c22)) != null && q10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((o4 = p10.o(c22)) != null && o4.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(c22.f28547id))) {
                            arrayList.add(c22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f44684x.f17724e;
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f28547id))) {
                        arrayList.add(user);
                    }
                }
            }
            bi.i6 i6Var = this.f34671a;
            if (i6Var != null) {
                i6Var.f35742g3.O(true);
                return;
            }
            return;
        }
        bi.i6 i6Var2 = this.f34671a;
        if (i6Var2 != null) {
            i6Var2.f35742g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (!this.f44681r && this.O != null && this.Q != null) {
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
        if (this.f44677e == null) {
            if (user != null) {
                daVar = new da(user);
            } else {
                da daVar2 = new da(str);
                if (TextUtils.equals(str, this.f44685y)) {
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
            this.f44673a0.setLoading(true);
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
        this.f44677e = nftitem;
        this.f44679f = u0.D(this.currentAccount).y();
    }

    public final void o0() {
        int max = Math.max(0, this.f44675c0 - this.f44674b0);
        bi.i6 i6Var = this.f34671a;
        if (i6Var != null) {
            i6Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f44674b0 + max);
            this.f34671a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f44674b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f44674b0;
            this.W.setLayoutParams(layoutParams);
            if (this.f44676d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(nr.h).start();
                this.f44676d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.f44678e0;
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
        this.f44681r = true;
        ci.b0 b0Var = this.f44678e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44678e0);
            this.f44678e0 = null;
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
        getNotificationCenter().n(this.J, ls.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        m mVar = this.f44680n;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44674b0 = i12;
        o0();
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f44675c0 = l1Var.f56268a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        ci.b0 b0Var = this.f44678e0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.f44678e0);
            this.f44678e0 = null;
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
            alertDialog$Builder.f28743a.U = org.telegram.messenger.g0.W2(hd.N0(2131746307, null));
            alertDialog$Builder.k(hd.N0(2131747106, null), new ja(this));
            alertDialog$Builder.h(hd.N0(2131751760, null), null);
            int i10 = org.telegram.ui.ActionBar.m6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
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
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f29290a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(getThemedColor(org.telegram.ui.ActionBar.m6.Fi), shapeDrawable);
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
