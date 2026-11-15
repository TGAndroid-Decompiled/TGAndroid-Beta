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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;
public final class z9 extends r41 {
    public String E;
    public int F;
    public TextView G;
    public FrameLayout H;
    public TextView I;
    public int K;
    public Runnable L;
    public boolean M;
    public m01 N;
    public ah.i O;
    public TextView P;
    public ImageView Q;
    public ClipboardManager U;
    public FrameLayout W;
    public ImageView X;
    public ShapeDrawable Y;
    public int Z;
    public hi.d f44853a0;
    public int f44854b0;
    public int f44855c0;
    public int f44856d0;
    public TL_wallet.nftItem f44857e;
    public ci.a0 f44858e0;
    public String f44859f;
    public boolean h;
    public l f44860n;
    public boolean f44861r;
    public jg.z1 f44864x;
    public String f44865y;
    public final ArrayList f44862s = new ArrayList();
    public final ArrayList f44863w = new ArrayList();
    public final x9 J = new is() {
        @Override
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            bi.v3 v3Var;
            z9 z9Var = z9.this;
            if (!z9Var.f44861r && (v3Var = z9Var.f38880a) != null) {
                v3Var.f39892g3.O(true);
            }
        }
    };
    public boolean R = true;
    public boolean S = true;
    public boolean T = true;
    public final y9 V = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            z9.this.k0(true);
        }
    };

    public static void d0(z9 z9Var, l0 l0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        z9Var.f44860n = null;
        if (z9Var.f44861r) {
            return;
        }
        z9Var.f44853a0.setLoading(false);
        if (wallettransaction != null && l0.b(z9Var.f44859f, l0Var.t())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f28200id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            y5.G0(z9Var.getParentActivity(), z9Var.currentAccount, wallettransaction, new t(z9Var, l0Var, user, str), new d(z9Var, 10), null, null, z9Var.getResourceProvider());
            return;
        }
        z9Var.h = false;
        cc a02 = cc.a0(z9Var);
        if (str2 == null) {
            str2 = hd.M0(2131743172, null);
        }
        a02.e0(str2, false);
    }

    public static void e0(z9 z9Var, String str) {
        String l02 = l0(str);
        if (!z9Var.isFinished && z9Var.O != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i7 = z9Var.currentAccount;
                np.s1(i7).d2().a(l02.substring(1), null, new ai.y1(new t9(z9Var, 1), i7));
                return;
            }
            z9Var.O.setText(l02);
            ah.i iVar = z9Var.O;
            iVar.setSelection(iVar.length());
            org.telegram.messenger.g0.v1(z9Var.O);
            z9Var.m0(l02, null);
        }
    }

    public static void f0(z9 z9Var, String str, int i7) {
        z9Var.L = null;
        int i10 = z9Var.currentAccount;
        ai.y1 y1Var = new ai.y1(z9Var, i7, 8);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        z9Var.F = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new bi.e4(29, str, y1Var), np.s1(i10).O3, 0);
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
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(er.h).withEndAction(new fp0(16, view, z10)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !q10.x(user) && !q10.A(user.f28200id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri c12 = y5.c1(str);
        if ("ton".equalsIgnoreCase(c12.getScheme())) {
            if ("transfer".equalsIgnoreCase(c12.getAuthority()) && c12.getPathSegments().size() == 1) {
                String str2 = c12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!y5.C0(c12)) {
            return null;
        } else {
            String d12 = y5.d1(c12);
            if (d12 != null) {
                return "@".concat(d12);
            }
            String queryParameter = c12.getQueryParameter("to");
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
            return r.b.k("@", queryParameter);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
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
            arrayList.add(b41.D(org.telegram.messenger.g0.L(4.0f)));
            p41Var.V();
            arrayList.add(b41.u(hd.M0(2131743040, null)));
            m01 m01Var = this.N;
            b41 b41Var = new b41(-1);
            b41Var.f33177c = m01Var;
            b41Var.f33197z = 50;
            arrayList.add(b41Var);
            p41Var.U();
            String trim = this.O.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f44865y != null) {
                if (this.H == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(getThemedColor(org.telegram.ui.ActionBar.j6.f28941i6), 2, -1));
                    boolean z10 = hd.f24104a0;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.X = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    this.Y = L;
                    imageView.setImageDrawable(new fq(L, getParentActivity().getResources().getDrawable(2131231829).mutate()));
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
                    frameLayout.addView(imageView, c8.ja.d(46, 46.0f, i13, f11, 0.0f, f12, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.G = textView;
                    textView.setText(hd.M0(2131743099, null));
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
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
                    frameLayout.addView(textView, c8.ja.d(-1, 24.0f, 48, f13, 8.0f, f14, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.I = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(this.I, org.telegram.ui.ActionBar.j6.f29241y6, getResourceProvider());
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
                    frameLayout.addView(textView3, c8.ja.d(-1, 22.0f, 48, f15, 32.0f, f16, 0.0f));
                    frameLayout.setOnClickListener(new s9(this, 0));
                    this.H = frameLayout;
                }
                TextView textView4 = this.G;
                String str = this.E;
                if (str == null) {
                    str = hd.M0(2131743099, null);
                }
                textView4.setText(str);
                this.I.setText(this.f44865y);
                arrayList.add(b41.D(org.telegram.messenger.g0.L(12.0f)));
                p41Var.V();
                FrameLayout frameLayout2 = this.H;
                b41 b41Var2 = new b41(-1);
                b41Var2.f33177c = frameLayout2;
                b41Var2.f33197z = 60;
                arrayList.add(b41Var2);
                p41Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = si.b0(this.currentAccount).f26492j1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(a22) && hashSet.add(Long.valueOf(a22.f28200id))) {
                        arrayList2.add(a22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f44862s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f28200id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f44863w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(f10)));
                    p41Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        arrayList.add(b41.u(hd.M0(2131746370, null)));
                    }
                }
                b41 w10 = b41.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f33184l = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String n10 = q10.n(user2);
                    if (!TextUtils.isEmpty(n10)) {
                        w10.f33185m = org.telegram.messenger.g0.r0(r.b.k("@", n10), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.F = new m(user2, w10.f33184l, w10.f33185m, 8);
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
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(f10)));
                    p41Var.V();
                }
                if (this.E != null) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                for (int i19 = i18; i19 < i7; i19++) {
                    arrayList.add(b41.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.M) {
                p41Var.U();
            }
            if (!this.M && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = hd.M0(2131745801, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                String a02 = hd.a0(null, null, 2131743025, objArr);
                int i20 = ti.f39700b;
                b41 K = b41.K(ti.class);
                K.f33184l = M0;
                K.f33185m = a02;
                arrayList.add(K);
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i7;
        if (this.f44857e == null) {
            i7 = 2131743020;
        } else {
            i7 = 2131742980;
        }
        return hd.M0(i7, null);
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            vr.a0(i7).f27219a.c(new di.i9(i7, user.f28200id, 1));
            org.telegram.messenger.g0.v1(this.O);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f38880a);
        this.f38880a.r1();
        this.f38880a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f38880a.setClipToPadding(false);
        bi.v3 v3Var = this.f38880a;
        v3Var.f39892g3.f38199r = false;
        v3Var.j(new ri(this, 25));
        m01 m01Var = new m01(6, context, this);
        this.U = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.O = iVar;
        org.telegram.ui.ActionBar.q6.U(iVar, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
        ah.i iVar2 = this.O;
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.72f, org.telegram.ui.ActionBar.j6.H6);
        org.telegram.ui.ActionBar.q6.n(iVar2, 1, K.f29392a, -1, 2, K.d, getResourceProvider());
        boolean z10 = true;
        this.O.setTextSize(1, 16.0f);
        this.O.setHint(hd.M0(2131743197, null));
        this.O.setSingleLine(true);
        this.O.setBackground(null);
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.setClipToPadding(true);
        this.O.setCursorWidth(1.5f);
        this.O.setGravity(16);
        this.O.setInputType(524289);
        this.O.setImeOptions(33554437);
        m01Var.addView(this.O, c8.ja.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setText(hd.M0(2131743055, null));
        TextView textView2 = this.P;
        int i7 = org.telegram.ui.ActionBar.j6.f29031n6;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i7));
        TextView textView3 = this.P;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.j6.r1(0.18f, getThemedColor(i7));
        org.telegram.ui.ActionBar.q6.Q(textView3, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.q6.K(0.1f, i7), org.telegram.ui.ActionBar.q6.K(0.18f, i7), getResourceProvider());
        this.P.setOnClickListener(new s9(this, 2));
        c8.na.b(this.P, 0.04f, 1.2f);
        m01Var.addView(this.P, c8.ja.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.O.addTextChangedListener(new i9(this, 1));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.Q.setImageResource(2131232679);
        org.telegram.ui.ActionBar.q6.s(this.Q, i7, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.q6.Q(this.Q, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.12f, getThemedColor(i7)), 1, -1), null, org.telegram.ui.ActionBar.q6.K(0.12f, i7), getResourceProvider());
        this.Q.setContentDescription(hd.M0(2131743027, null));
        this.Q.setOnClickListener(new s9(this, 3));
        m01Var.addView(this.Q, c8.ja.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.N = m01Var;
        jg.z1 z1Var = new jg.z1(true);
        this.f44864x = z1Var;
        z1Var.f17344a = new ff(this, 8);
        getNotificationCenter().c(this.J, ns.S0);
        si.b0(this.currentAccount).M0(true);
        this.f44862s.clear();
        int i10 = this.currentAccount;
        vr.a0(i10).f27219a.c(new jg.q(i10, 0, new v9(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.O.setText((CharSequence) null);
            ah.i iVar3 = this.O;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7);
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor, themedColor}));
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f44853a0 = dVar;
        dVar.setText(hd.M0(2131743154, null));
        this.f44853a0.setEnabled(false);
        this.f44853a0.setOnClickListener(new s9(this, 1));
        hi.d dVar2 = this.f44853a0;
        if (dVar2 != null) {
            if (this.f44865y == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.W.addView(this.f44853a0, c8.ja.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.W, c8.ja.e(-1, 68, 87));
        o0();
        this.f38880a.f39892g3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f44858e0 == null && this.Q != null) {
            org.telegram.messenger.g0.v1(this.O);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f44858e0 = ci.a0.k(this, this.Q, new ci.x(13), new t9(this, 0), new u9(this, 0));
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        String p10;
        String n10;
        ArrayList arrayList = this.f44863w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f44865y == null && this.E == null) {
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
                if (dialog != null && dialog.f28055id > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(dialog.f28055id));
                    if (h0(a22) && (((p10 = q10.p(a22)) != null && p10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((n10 = q10.n(a22)) != null && n10.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(a22.f28200id))) {
                            arrayList.add(a22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f44864x.f17347e;
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f28200id))) {
                        arrayList.add(user);
                    }
                }
            }
            bi.v3 v3Var = this.f38880a;
            if (v3Var != null) {
                v3Var.f39892g3.O(true);
                return;
            }
            return;
        }
        bi.v3 v3Var2 = this.f38880a;
        if (v3Var2 != null) {
            v3Var2.f39892g3.O(true);
        }
    }

    public final void k0(boolean z10) {
        if (!this.f44861r && this.O != null && this.Q != null) {
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
        p9 p9Var;
        if (this.f44857e == null) {
            if (user != null) {
                p9Var = new p9(user);
            } else {
                p9 p9Var2 = new p9(str);
                if (TextUtils.equals(str, this.f44865y)) {
                    str2 = this.E;
                } else {
                    str2 = null;
                }
                p9Var2.A0(str2);
                p9Var = p9Var2;
            }
            presentFragment(p9Var);
        } else if (this.h) {
        } else {
            this.h = true;
            this.f44853a0.setLoading(true);
            l0 x10 = l0.x(this.currentAccount);
            m mVar = new m(this, x10, user);
            if (user != null) {
                x10.a0(user, new t1(4, this, mVar));
            } else {
                mVar.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.f44857e = nftitem;
        this.f44859f = l0.x(this.currentAccount).t();
    }

    public final void o0() {
        int max = Math.max(0, this.f44855c0 - this.f44854b0);
        bi.v3 v3Var = this.f38880a;
        if (v3Var != null) {
            v3Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f44854b0 + max);
            this.f38880a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f44854b0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.W.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f44854b0;
            this.W.setLayoutParams(layoutParams);
            if (this.f44856d0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(er.h).start();
                this.f44856d0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.a0 a0Var = this.f44858e0;
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
        this.f44861r = true;
        ci.a0 a0Var = this.f44858e0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.f44858e0);
            this.f44858e0 = null;
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
        getNotificationCenter().n(this.J, ns.S0);
        Runnable runnable = this.L;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        l lVar = this.f44860n;
        if (lVar != null) {
            lVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44854b0 = i12;
        o0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f44855c0 = k1Var.f55682a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.V);
        }
        ci.a0 a0Var = this.f44858e0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.f44858e0);
            this.f44858e0 = null;
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
            alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(hd.M0(2131746503, null));
            alertDialog$Builder.k(hd.M0(2131747300, null), new v9(this));
            alertDialog$Builder.h(hd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.j6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.j6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.U;
        if (clipboardManager != null) {
            y9 y9Var = this.V;
            clipboardManager.removePrimaryClipChangedListener(y9Var);
            this.U.addPrimaryClipChangedListener(y9Var);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.W;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7)) != this.Z) {
                this.Z = themedColor;
                ((GradientDrawable) this.W.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.Y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.j6.C1(getThemedColor(org.telegram.ui.ActionBar.j6.Fi), shapeDrawable);
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
