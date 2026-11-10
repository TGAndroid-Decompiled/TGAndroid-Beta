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
import bi.ua;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
public final class y9 extends o41 {
    public String D;
    public int E;
    public TextView F;
    public FrameLayout G;
    public TextView H;
    public int J;
    public Runnable K;
    public boolean L;
    public w41 M;
    public ah.i N;
    public TextView O;
    public ImageView P;
    public ClipboardManager T;
    public FrameLayout V;
    public ImageView W;
    public ShapeDrawable X;
    public int Y;
    public fi.d Z;
    public int f43392a0;
    public int f43393b0;
    public int f43394c0;
    public ai.i0 f43395d0;
    public TL_wallet.nftItem f43396e;
    public String f43397f;
    public boolean h;
    public l f43398n;
    public boolean f43399r;
    public jg.z1 f43402x;
    public String f43403y;
    public final ArrayList f43400s = new ArrayList();
    public final ArrayList f43401w = new ArrayList();
    public final w9 I = new ls() {
        @Override
        public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
            fi.w3 w3Var;
            y9 y9Var = y9.this;
            if (!y9Var.f43399r && (w3Var = y9Var.f36518a) != null) {
                w3Var.f37496f3.O(true);
            }
        }
    };
    public boolean Q = true;
    public boolean R = true;
    public boolean S = true;
    public final x9 U = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            y9.this.k0(true);
        }
    };

    public static void d0(y9 y9Var, l0 l0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        y9Var.f43398n = null;
        if (y9Var.f43399r) {
            return;
        }
        y9Var.Z.setLoading(false);
        if (wallettransaction != null && l0.b(y9Var.f43397f, l0Var.t())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f27109id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            z5.G0(y9Var.getParentActivity(), y9Var.currentAccount, wallettransaction, new t(y9Var, l0Var, user, str), new d(y9Var, 10), null, null, y9Var.getResourceProvider());
            return;
        }
        y9Var.h = false;
        gc a02 = gc.a0(y9Var);
        if (str2 == null) {
            str2 = id.M0(2131743172, null);
        }
        a02.e0(str2, false);
    }

    public static void e0(y9 y9Var, String str) {
        String l02 = l0(str);
        if (!y9Var.isFinished && y9Var.N != null && l02 != null) {
            if (l02.startsWith("@")) {
                int i7 = y9Var.currentAccount;
                qp.s1(i7).d2().a(l02.substring(1), null, new fi.t3(new s9(y9Var, 1), i7));
                return;
            }
            y9Var.N.setText(l02);
            ah.i iVar = y9Var.N;
            iVar.setSelection(iVar.length());
            org.telegram.messenger.g0.v1(y9Var.N);
            y9Var.m0(l02, null);
        }
    }

    public static void f0(y9 y9Var, String str, int i7) {
        y9Var.K = null;
        int i10 = y9Var.currentAccount;
        fi.t3 t3Var = new fi.t3(y9Var, i7, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        y9Var.E = ConnectionsManager.getInstance(i10).sendRequestTyped(performapirequest, new d3.b(1), new bi.p5(28, str, t3Var), qp.s1(i10).N3, 0);
    }

    public static void g0(View view, boolean z9, boolean z10) {
        float f10;
        view.animate().cancel();
        view.setEnabled(z9);
        float f11 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (!z9) {
            f11 = 0.5f;
        }
        int i7 = 0;
        if (!z10) {
            view.setAlpha(f10);
            view.setScaleX(f11);
            view.setScaleY(f11);
            if (!z9) {
                i7 = 8;
            }
            view.setVisibility(i7);
            return;
        }
        view.setVisibility(0);
        view.animate().alpha(f10).scaleX(f11).scaleY(f11).setDuration(320L).setInterpolator(wq.h).withEndAction(new tp0(15, view, z9)).start();
    }

    public static boolean h0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !t10.x(user) && !t10.A(user.f27109id)) {
            return true;
        }
        return false;
    }

    public static String l0(String str) {
        Uri c12 = z5.c1(str);
        if ("ton".equalsIgnoreCase(c12.getScheme())) {
            if ("transfer".equalsIgnoreCase(c12.getAuthority()) && c12.getPathSegments().size() == 1) {
                String str2 = c12.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!z5.C0(c12)) {
            return null;
        } else {
            String d12 = z5.d1(c12);
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
            return rf.b.i("@", queryParameter);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, m41 m41Var) {
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
        if (this.M != null) {
            arrayList.add(x31.D(org.telegram.messenger.g0.L(4.0f)));
            m41Var.V();
            arrayList.add(x31.u(id.M0(2131743040, null)));
            w41 w41Var = this.M;
            x31 x31Var = new x31(-1);
            x31Var.f40149c = w41Var;
            x31Var.f40169z = 50;
            arrayList.add(x31Var);
            m41Var.U();
            String trim = this.N.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f17 = 12.0f;
            int i12 = 0;
            if (this.f43403y != null) {
                if (this.G == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(getThemedColor(org.telegram.ui.ActionBar.m6.f27982i6), 2, -1));
                    boolean z9 = id.f23161a0;
                    if (z9) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.W = imageView;
                    ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(46.0f), getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                    this.X = L;
                    imageView.setImageDrawable(new xp(L, getParentActivity().getResources().getDrawable(2131231829).mutate()));
                    int i13 = i11 | 16;
                    if (z9) {
                        f11 = 0.0f;
                    } else {
                        f11 = 11.0f;
                    }
                    if (z9) {
                        f12 = 11.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    frameLayout.addView(imageView, c8.ha.d(46, 46.0f, i13, f11, 0.0f, f12, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.F = textView;
                    textView.setText(id.M0(2131743099, null));
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setSingleLine();
                    textView.setGravity(i11);
                    if (z9) {
                        f13 = 16.0f;
                    } else {
                        f13 = 72.0f;
                    }
                    if (z9) {
                        f14 = 72.0f;
                    } else {
                        f14 = 16.0f;
                    }
                    frameLayout.addView(textView, c8.ha.d(-1, 24.0f, 48, f13, 8.0f, f14, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.H = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(this.H, org.telegram.ui.ActionBar.m6.f28282y6, getResourceProvider());
                    this.H.setSingleLine();
                    this.H.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    this.H.setGravity(i11);
                    TextView textView3 = this.H;
                    if (z9) {
                        f15 = 16.0f;
                    } else {
                        f15 = 72.0f;
                    }
                    if (z9) {
                        f16 = 72.0f;
                    } else {
                        f16 = 16.0f;
                    }
                    frameLayout.addView(textView3, c8.ha.d(-1, 22.0f, 48, f15, 32.0f, f16, 0.0f));
                    frameLayout.setOnClickListener(new r9(this, 0));
                    this.G = frameLayout;
                }
                TextView textView4 = this.F;
                String str = this.D;
                if (str == null) {
                    str = id.M0(2131743099, null);
                }
                textView4.setText(str);
                this.H.setText(this.f43403y);
                arrayList.add(x31.D(org.telegram.messenger.g0.L(12.0f)));
                m41Var.V();
                FrameLayout frameLayout2 = this.G;
                x31 x31Var2 = new x31(-1);
                x31Var2.f40149c = frameLayout2;
                x31Var2.f40169z = 60;
                arrayList.add(x31Var2);
                m41Var.U();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = ui.b0(this.currentAccount).f25825i1;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    float f18 = f17;
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (h0(a22) && hashSet.add(Long.valueOf(a22.f27109id))) {
                        arrayList2.add(a22);
                    }
                    f17 = f18;
                }
                f10 = f17;
                ArrayList arrayList4 = this.f43400s;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList4.get(i15);
                    i15++;
                    TLRPC.User user = (TLRPC.User) obj2;
                    if (hashSet.add(Long.valueOf(user.f27109id))) {
                        arrayList2.add(user);
                    }
                }
            } else {
                f10 = 12.0f;
                arrayList2 = this.f43401w;
            }
            int size3 = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size3) {
                Object obj3 = arrayList2.get(i17);
                i17++;
                TLRPC.User user2 = (TLRPC.User) obj3;
                if (i16 == 0) {
                    arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                    m41Var.V();
                    if (TextUtils.isEmpty(lowerCase)) {
                        arrayList.add(x31.u(id.M0(2131746370, null)));
                    }
                }
                x31 w10 = x31.w(user2);
                if (!TextUtils.isEmpty(lowerCase)) {
                    w10.f40156l = org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, trim);
                    String n10 = t10.n(user2);
                    if (!TextUtils.isEmpty(n10)) {
                        w10.f40157m = org.telegram.messenger.g0.r0(rf.b.i("@", n10), null, "@".concat(trim));
                    }
                    i10 = i12;
                    w10.F = new m(user2, w10.f40156l, w10.f40157m, 8);
                } else {
                    i10 = i12;
                }
                arrayList.add(w10);
                i16++;
                i12 = i10;
            }
            int i18 = i12;
            if (this.L) {
                if (i16 == 0) {
                    arrayList.add(x31.D(org.telegram.messenger.g0.L(f10)));
                    m41Var.V();
                }
                if (this.D != null) {
                    i7 = 1;
                } else {
                    i7 = 3;
                }
                for (int i19 = i18; i19 < i7; i19++) {
                    arrayList.add(x31.q((-1) - i19, 18));
                }
            }
            if (i16 > 0 || this.L) {
                m41Var.U();
            }
            if (!this.L && i16 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String M0 = id.M0(2131745801, null);
                Object[] objArr = new Object[1];
                objArr[i18] = lowerCase;
                String a02 = id.a0(null, null, 2131743025, objArr);
                int i20 = ki.f35352b;
                x31 K = x31.K(ki.class);
                K.f40156l = M0;
                K.f40157m = a02;
                arrayList.add(K);
            }
        }
    }

    @Override
    public final CharSequence a0() {
        int i7;
        if (this.f43396e == null) {
            i7 = 2131743020;
        } else {
            i7 = 2131742980;
        }
        return id.M0(i7, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        Object obj = x31Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i7 = this.currentAccount;
            yr.a0(i7).f26723a.c(new ua(i7, user.f27109id, 2));
            org.telegram.messenger.g0.v1(this.N);
            m0(null, user);
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f36518a);
        this.f36518a.r1();
        this.f36518a.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f));
        this.f36518a.setClipToPadding(false);
        fi.w3 w3Var = this.f36518a;
        w3Var.f37496f3.f35845r = false;
        w3Var.j(new ti(this, 23));
        w41 w41Var = new w41(5, context, this);
        this.T = (ClipboardManager) context.getSystemService("clipboard");
        ah.i iVar = new ah.i(context);
        this.N = iVar;
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        ah.i iVar2 = this.N;
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.72f, org.telegram.ui.ActionBar.m6.H6);
        org.telegram.ui.ActionBar.t6.n(iVar2, 1, K.f28387a, -1, 2, K.d, getResourceProvider());
        boolean z9 = true;
        this.N.setTextSize(1, 16.0f);
        this.N.setHint(id.M0(2131743197, null));
        this.N.setSingleLine(true);
        this.N.setBackground(null);
        this.N.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.N.setClipToPadding(true);
        this.N.setCursorWidth(1.5f);
        this.N.setGravity(16);
        this.N.setInputType(524289);
        this.N.setImeOptions(33554437);
        w41Var.addView(this.N, c8.ha.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setText(id.M0(2131743055, null));
        TextView textView2 = this.O;
        int i7 = org.telegram.ui.ActionBar.m6.f28072n6;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, getResourceProvider());
        this.O.setTextSize(1, 14.0f);
        this.O.setTypeface(org.telegram.messenger.g0.o());
        this.O.setGravity(17);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        TextView textView3 = this.O;
        int L = org.telegram.messenger.g0.L(16.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.18f, getThemedColor(i7));
        org.telegram.ui.ActionBar.t6.Q(textView3, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, r12, r13, r13), org.telegram.ui.ActionBar.t6.K(0.1f, i7), org.telegram.ui.ActionBar.t6.K(0.18f, i7), getResourceProvider());
        this.O.setOnClickListener(new r9(this, 2));
        c8.ka.b(this.O, 0.04f, 1.2f);
        w41Var.addView(this.O, c8.ha.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.N.addTextChangedListener(new ah.j(this, 29));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setImageResource(2131232678);
        org.telegram.ui.ActionBar.t6.s(this.P, i7, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.t6.Q(this.P, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, getThemedColor(i7)), 1, -1), null, org.telegram.ui.ActionBar.t6.K(0.12f, i7), getResourceProvider());
        this.P.setContentDescription(id.M0(2131743027, null));
        this.P.setOnClickListener(new r9(this, 3));
        w41Var.addView(this.P, c8.ha.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k0(false);
        this.M = w41Var;
        jg.z1 z1Var = new jg.z1(true);
        this.f43402x = z1Var;
        z1Var.f16992a = new qt(this, 6);
        getNotificationCenter().c(this.I, qs.S0);
        ui.b0(this.currentAccount).M0(true);
        this.f43400s.clear();
        int i10 = this.currentAccount;
        yr.a0(i10).f26723a.c(new jg.r(i10, 0, new u9(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.N.setText((CharSequence) null);
            ah.i iVar3 = this.N;
            iVar3.setSelection(iVar3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7);
        this.V.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor}));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.Z = dVar;
        dVar.setText(id.M0(2131743154, null));
        this.Z.setEnabled(false);
        this.Z.setOnClickListener(new r9(this, 1));
        fi.d dVar2 = this.Z;
        if (dVar2 != null) {
            if (this.f43403y == null) {
                z9 = false;
            }
            dVar2.setEnabled(z9);
        }
        this.V.addView(this.Z, c8.ha.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.V, c8.ha.e(-1, 68, 87));
        o0();
        this.f36518a.f37496f3.O(false);
        return this.fragmentView;
    }

    public final void i0() {
        if (getParentActivity() != null && this.f43395d0 == null && this.P != null) {
            org.telegram.messenger.g0.v1(this.N);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f43395d0 = ai.i0.k(this, this.P, new ai.c0(13), new s9(this, 0), new t9(this, 0));
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
        ArrayList arrayList = this.f43401w;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f43403y == null && this.D == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = getMessagesController().J;
            int size = arrayList2.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                if (dialog != null && dialog.f26964id > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(dialog.f26964id));
                    if (h0(a22) && (((p10 = t10.p(a22)) != null && p10.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((n10 = t10.n(a22)) != null && n10.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(a22.f27109id))) {
                            arrayList.add(a22);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f43402x.f16995e;
            int size2 = arrayList3.size();
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (h0(user) && hashSet.add(Long.valueOf(user.f27109id))) {
                        arrayList.add(user);
                    }
                }
            }
            fi.w3 w3Var = this.f36518a;
            if (w3Var != null) {
                w3Var.f37496f3.O(true);
                return;
            }
            return;
        }
        fi.w3 w3Var2 = this.f36518a;
        if (w3Var2 != null) {
            w3Var2.f37496f3.O(true);
        }
    }

    public final void k0(boolean z9) {
        if (!this.f43399r && this.N != null && this.P != null) {
            ClipboardManager clipboardManager = this.T;
            if (clipboardManager != null) {
                this.S = clipboardManager.hasPrimaryClip();
            } else {
                this.S = false;
            }
            p0(z9);
        }
    }

    public final void m0(String str, TLRPC.User user) {
        String str2;
        o9 o9Var;
        if (this.f43396e == null) {
            if (user != null) {
                o9Var = new o9(user);
            } else {
                o9 o9Var2 = new o9(str);
                if (TextUtils.equals(str, this.f43403y)) {
                    str2 = this.D;
                } else {
                    str2 = null;
                }
                o9Var2.A0(str2);
                o9Var = o9Var2;
            }
            presentFragment(o9Var);
        } else if (this.h) {
        } else {
            this.h = true;
            this.Z.setLoading(true);
            l0 x10 = l0.x(this.currentAccount);
            m mVar = new m(this, x10, user);
            if (user != null) {
                x10.a0(user, new t1(3, this, mVar));
            } else {
                mVar.a(str);
            }
        }
    }

    public final void n0(TL_wallet.nftItem nftitem) {
        this.f43396e = nftitem;
        this.f43397f = l0.x(this.currentAccount).t();
    }

    public final void o0() {
        int max = Math.max(0, this.f43393b0 - this.f43392a0);
        fi.w3 w3Var = this.f36518a;
        if (w3Var != null) {
            w3Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(68.0f) + this.f43392a0 + max);
            this.f36518a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(10.0f) + this.f43392a0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V.getLayoutParams();
            layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.f43392a0;
            this.V.setLayoutParams(layoutParams);
            if (this.f43394c0 != max) {
                this.V.animate().cancel();
                this.V.animate().translationY(-max).setDuration(320L).setInterpolator(wq.h).start();
                this.f43394c0 = max;
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        ai.i0 i0Var = this.f43395d0;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onFragmentDestroy() {
        this.f43399r = true;
        ai.i0 i0Var = this.f43395d0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.f43395d0);
            this.f43395d0 = null;
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
        getNotificationCenter().n(this.I, qs.S0);
        Runnable runnable = this.K;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        l lVar = this.f43398n;
        if (lVar != null) {
            lVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f43392a0 = i12;
        o0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f43393b0 = k1Var.f54213a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.U);
        }
        ai.i0 i0Var = this.f43395d0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.f43395d0);
            this.f43395d0 = null;
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
            alertDialog$Builder.f27300a.T = org.telegram.messenger.g0.X2(id.M0(2131746503, null));
            alertDialog$Builder.k(id.M0(2131747300, null), new u9(this));
            alertDialog$Builder.h(id.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.m6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.T;
        if (clipboardManager != null) {
            x9 x9Var = this.U;
            clipboardManager.removePrimaryClipChangedListener(x9Var);
            this.T.addPrimaryClipChangedListener(x9Var);
        }
        k0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.V;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7)) != this.Y) {
                this.Y = themedColor;
                ((GradientDrawable) this.V.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.X;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(getThemedColor(org.telegram.ui.ActionBar.m6.Ci), shapeDrawable);
                ImageView imageView = this.W;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        boolean z10;
        float f10;
        if (this.P != null) {
            boolean z11 = false;
            if (this.N.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.S) {
                z11 = true;
            }
            if (this.Q != z11 || !z9) {
                this.Q = z11;
                g0(this.O, z11, z9);
            }
            if (this.R != z10 || !z9) {
                this.R = z10;
                g0(this.P, z10, z9);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
            if (this.Q) {
                f10 = 128.0f;
            } else if (this.R) {
                f10 = 60.0f;
            } else {
                f10 = 8.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (layoutParams.rightMargin != L) {
                layoutParams.rightMargin = L;
                this.N.setLayoutParams(layoutParams);
            }
        }
    }
}
