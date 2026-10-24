package org.telegram.ui.Wallet;

import ai.ra;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z50;
import org.telegram.ui.Components.zr;
public final class s9 extends d71 {
    public TextView E;
    public FrameLayout F;
    public TextView G;
    public int I;
    public Runnable J;
    public boolean K;
    public ah.x L;
    public ei.e2 M;
    public TextView N;
    public ImageView O;
    public ClipboardManager S;
    public FrameLayout U;
    public ImageView V;
    public ShapeDrawable W;
    public int X;
    public ei.d Y;
    public int Z;
    public int f35183a0;
    public int f35184b0;
    public zh.b0 f35185c0;
    public TL_wallet.nftItem d;
    public String e;
    public boolean f35186f;
    public m h;
    public boolean f35187n;
    public hg.a2 v;
    public String f35190w;
    public String f35191x;
    public int f35192y;
    public final ArrayList f35188r = new ArrayList();
    public final ArrayList f35189s = new ArrayList();
    public final h3 H = new h3(this, 1);
    public boolean P = true;
    public boolean Q = true;
    public boolean R = true;
    public final r9 T = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            s9.this.f0(true);
        }
    };

    public static void Y(s9 s9Var, l0 l0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        s9Var.h = null;
        if (s9Var.f35187n) {
            return;
        }
        s9Var.Y.setLoading(false);
        if (wallettransaction != null && l0.a(s9Var.e, l0Var.s())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f20491id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            o5.B0(s9Var.getParentActivity(), s9Var.currentAccount, wallettransaction, new s(s9Var, l0Var, user, str), new d(s9Var, 10), null, null, s9Var.getResourceProvider());
            return;
        }
        s9Var.f35186f = false;
        vc a02 = vc.a0(s9Var);
        if (str2 == null) {
            str2 = LocaleController.getString(R.string.WalletCollectibleTransferPrepareFailed);
        }
        a02.e0(str2, false);
    }

    public static void Z(s9 s9Var, String str) {
        String g02 = g0(str);
        if (!s9Var.isFinished && s9Var.M != null && g02 != null) {
            if (g02.startsWith("@")) {
                int i10 = s9Var.currentAccount;
                MessagesController.getInstance(i10).getUserNameResolver().resolve(g02.substring(1), new ei.e4(i10, new n9(s9Var, 1)));
                return;
            }
            s9Var.M.setText(g02);
            ei.e2 e2Var = s9Var.M;
            e2Var.setSelection(e2Var.length());
            AndroidUtilities.hideKeyboard(s9Var.M);
            s9Var.h0(g02, null);
        }
    }

    public static void a0(s9 s9Var, String str, int i10) {
        s9Var.J = null;
        int i11 = s9Var.currentAccount;
        ei.e4 e4Var = new ei.e4(s9Var, i10, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        s9Var.f35192y = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new ai.r5(29, str, e4Var), MessagesController.getInstance(i11).webFileDatacenterId, 0);
    }

    public static void b0(View view, boolean z10, boolean z11) {
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
        view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(zr.h).withEndAction(new z50(18, view, z10)).start();
    }

    public static boolean c0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20491id)) {
            return true;
        }
        return false;
    }

    public static String g0(String str) {
        Uri W0 = o5.W0(str);
        if ("ton".equalsIgnoreCase(W0.getScheme())) {
            if ("transfer".equalsIgnoreCase(W0.getAuthority()) && W0.getPathSegments().size() == 1) {
                String str2 = W0.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!o5.x0(W0)) {
            return null;
        } else {
            String X0 = o5.X0(W0);
            if (X0 != null) {
                return "@".concat(X0);
            }
            String queryParameter = W0.getQueryParameter("to");
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
            return si.o0.h("@", queryParameter);
        }
    }

    @Override
    public final void U(ArrayList arrayList, a71 a71Var) {
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
        if (this.L != null) {
            arrayList.add(l61.C(AndroidUtilities.dp(4.0f)));
            a71Var.U();
            i2.o1.q(R.string.WalletRecipient, arrayList);
            ah.x xVar = this.L;
            l61 l61Var = new l61(-1);
            l61Var.f28221c = xVar;
            l61Var.f28240z = 50;
            arrayList.add(l61Var);
            a71Var.T();
            String trim = this.M.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f16 = 12.0f;
            int i13 = 0;
            if (this.f35190w != null) {
                if (this.F == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6), 2, -1));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    this.V = imageView;
                    ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(46.0f), getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
                    this.W = K;
                    imageView.setImageDrawable(new wq(K, getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
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
                    frameLayout.addView(imageView, w7.z5.d(46, 46.0f, i14, f10, 0.0f, f11, 0.0f));
                    TextView textView = new TextView(getParentActivity());
                    this.E = textView;
                    tl.n(R.string.WalletGramWalletAddress, textView, 1, 16.0f);
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                    textView.setTypeface(AndroidUtilities.bold());
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
                    frameLayout.addView(textView, w7.z5.d(-1, 24.0f, 48, f12, 8.0f, f13, 0.0f));
                    TextView textView2 = new TextView(getParentActivity());
                    this.G = textView2;
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.W(this.G, org.telegram.ui.ActionBar.k6.f21572y6, getResourceProvider());
                    this.G.setSingleLine();
                    this.G.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    this.G.setGravity(i12);
                    TextView textView3 = this.G;
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
                    frameLayout.addView(textView3, w7.z5.d(-1, 22.0f, 48, f14, 32.0f, f15, 0.0f));
                    frameLayout.setOnClickListener(new m9(this, 0));
                    this.F = frameLayout;
                }
                TextView textView4 = this.E;
                String str = this.f35191x;
                if (str == null) {
                    str = LocaleController.getString(R.string.WalletGramWalletAddress);
                }
                textView4.setText(str);
                this.G.setText(this.f35190w);
                arrayList.add(l61.C(AndroidUtilities.dp(12.0f)));
                a71Var.U();
                FrameLayout frameLayout2 = this.F;
                l61 l61Var2 = new l61(-1);
                l61Var2.f28221c = frameLayout2;
                l61Var2.f28240z = 60;
                arrayList.add(l61Var2);
                a71Var.T();
                return;
            }
            if (TextUtils.isEmpty(lowerCase)) {
                arrayList2 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList<TLRPC.TL_topPeer> arrayList3 = MediaDataController.getInstance(this.currentAccount).hints;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    TLRPC.TL_topPeer tL_topPeer = arrayList3.get(i15);
                    i15++;
                    float f17 = f16;
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_topPeer.peer.user_id));
                    if (c0(user) && hashSet.add(Long.valueOf(user.f20491id))) {
                        arrayList2.add(user);
                    }
                    f16 = f17;
                }
                f7 = f16;
                ArrayList arrayList4 = this.f35188r;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    TLRPC.User user2 = (TLRPC.User) obj;
                    if (hashSet.add(Long.valueOf(user2.f20491id))) {
                        arrayList2.add(user2);
                    }
                }
            } else {
                f7 = 12.0f;
                arrayList2 = this.f35189s;
            }
            int size3 = arrayList2.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size3) {
                Object obj2 = arrayList2.get(i18);
                i18++;
                TLRPC.User user3 = (TLRPC.User) obj2;
                if (i17 == 0) {
                    arrayList.add(l61.C(AndroidUtilities.dp(f7)));
                    a71Var.U();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i2.o1.q(R.string.Recent, arrayList);
                    }
                }
                l61 v = l61.v(user3);
                if (!TextUtils.isEmpty(lowerCase)) {
                    v.f28227l = AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, trim);
                    String publicUsername = UserObject.getPublicUsername(user3);
                    if (!TextUtils.isEmpty(publicUsername)) {
                        v.f28228m = AndroidUtilities.generateSearchName(si.o0.h("@", publicUsername), null, "@".concat(trim));
                    }
                    i11 = i13;
                    v.F = new o(user3, v.f28227l, v.f28228m, 8);
                } else {
                    i11 = i13;
                }
                arrayList.add(v);
                i17++;
                i13 = i11;
            }
            int i19 = i13;
            if (this.K) {
                if (i17 == 0) {
                    arrayList.add(l61.C(AndroidUtilities.dp(f7)));
                    a71Var.U();
                }
                if (this.f35191x != null) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                for (int i20 = i19; i20 < i10; i20++) {
                    arrayList.add(l61.o((-1) - i20, 18));
                }
            }
            if (i17 > 0 || this.K) {
                a71Var.T();
            }
            if (!this.K && i17 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String string = LocaleController.getString(R.string.SearchEmptyViewTitle);
                int i21 = R.string.WalletSearchNoResults;
                Object[] objArr = new Object[1];
                objArr[i19] = lowerCase;
                String formatString = LocaleController.formatString(i21, objArr);
                int i22 = bj.f25021a;
                l61 J = l61.J(bj.class);
                J.f28227l = string;
                J.f28228m = formatString;
                arrayList.add(J);
            }
        }
    }

    @Override
    public final CharSequence V() {
        int i10;
        if (this.d == null) {
            i10 = R.string.WalletSendGrams;
        } else {
            i10 = R.string.WalletTransferCollectible;
        }
        return LocaleController.getString(i10);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new ra(i10, user.f20491id, 2));
            AndroidUtilities.hideKeyboard(this.M);
            h0(null, user);
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f25615a);
        this.f25615a.t1();
        this.f25615a.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f));
        this.f25615a.setClipToPadding(false);
        c71 c71Var = this.f25615a;
        c71Var.Z2.f24646r = false;
        c71Var.j(new iv(this, 16));
        ah.x xVar = new ah.x(this, context, 29);
        this.S = (ClipboardManager) context.getSystemService("clipboard");
        ei.e2 e2Var = new ei.e2(context);
        this.M = e2Var;
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        ei.e2 e2Var2 = this.M;
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.72f, org.telegram.ui.ActionBar.k6.H6);
        org.telegram.ui.ActionBar.r6.o(e2Var2, 1, M.f21711a, -1, 2, M.d, getResourceProvider());
        boolean z10 = true;
        this.M.setTextSize(1, 16.0f);
        this.M.setHint(LocaleController.getString(R.string.WalletAddressOrName));
        this.M.setSingleLine(true);
        this.M.setBackground(null);
        this.M.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.M.setClipToPadding(true);
        this.M.setCursorWidth(1.5f);
        this.M.setGravity(16);
        this.M.setInputType(524289);
        this.M.setImeOptions(33554437);
        xVar.addView(this.M, w7.z5.d(-1, -1.0f, 119, 8.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setText(LocaleController.getString(R.string.WalletPaste));
        TextView textView2 = this.N;
        int i10 = org.telegram.ui.ActionBar.k6.f21367n6;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, getResourceProvider());
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setGravity(17);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10));
        TextView textView3 = this.N;
        int dp = AndroidUtilities.dp(16.0f);
        int o13 = org.telegram.ui.ActionBar.k6.o1(0.18f, getThemedColor(i10));
        org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o12, o13, o13), org.telegram.ui.ActionBar.r6.M(0.1f, i10), org.telegram.ui.ActionBar.r6.M(0.18f, i10), getResourceProvider());
        this.N.setOnClickListener(new m9(this, 2));
        w7.b6.b(this.N, 0.04f, 1.2f);
        xVar.addView(this.N, w7.z5.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.M.addTextChangedListener(new ai.u(this, 17));
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setImageResource(R.drawable.scan_qr);
        org.telegram.ui.ActionBar.r6.t(this.O, i10, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        org.telegram.ui.ActionBar.r6.S(this.O, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.12f, getThemedColor(i10)), 1, -1), null, org.telegram.ui.ActionBar.r6.M(0.12f, i10), getResourceProvider());
        this.O.setContentDescription(LocaleController.getString(R.string.WalletScanQRCode));
        this.O.setOnClickListener(new m9(this, 3));
        xVar.addView(this.O, w7.z5.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        f0(false);
        this.L = xVar;
        hg.a2 a2Var = new hg.a2(true);
        this.v = a2Var;
        a2Var.f11819a = new ki.t1(this, 19);
        getNotificationCenter().addObserver(this.H, NotificationCenter.reloadHints);
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.f35188r.clear();
        int i11 = this.currentAccount;
        MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new hg.n(i11, 0, new p9(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.M.setText((CharSequence) null);
            ei.e2 e2Var3 = this.M;
            e2Var3.setSelection(e2Var3.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
        this.U.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.Y = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletContinue));
        this.Y.setEnabled(false);
        this.Y.setOnClickListener(new m9(this, 1));
        ei.d dVar2 = this.Y;
        if (dVar2 != null) {
            if (this.f35190w == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.U.addView(this.Y, w7.z5.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.U, w7.z5.e(-1, 68, 87));
        j0();
        this.f25615a.Z2.N(false);
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() != null && this.f35185c0 == null && this.O != null) {
            AndroidUtilities.hideKeyboard(this.M);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.f35185c0 = zh.b0.k(this, this.O, new gi.c(11), new n9(this, 0), new o9(this, 0));
            }
        }
    }

    public final void e0(String str) {
        String userName;
        String publicUsername;
        ArrayList arrayList = this.f35189s;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f35190w == null && this.f35191x == null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Dialog> arrayList2 = getMessagesController().dialogsUsersOnly;
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.Dialog dialog = arrayList2.get(i11);
                i11++;
                TLRPC.Dialog dialog2 = dialog;
                if (dialog2 != null && dialog2.f20348id > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(dialog2.f20348id));
                    if (c0(user) && (((userName = UserObject.getUserName(user)) != null && userName.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(user.f20491id))) {
                            arrayList.add(user);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.v.e;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj = arrayList3.get(i10);
                i10++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    if (c0(user2) && hashSet.add(Long.valueOf(user2.f20491id))) {
                        arrayList.add(user2);
                    }
                }
            }
            c71 c71Var = this.f25615a;
            if (c71Var != null) {
                c71Var.Z2.N(true);
                return;
            }
            return;
        }
        c71 c71Var2 = this.f25615a;
        if (c71Var2 != null) {
            c71Var2.Z2.N(true);
        }
    }

    public final void f0(boolean z10) {
        if (!this.f35187n && this.M != null && this.O != null) {
            ClipboardManager clipboardManager = this.S;
            if (clipboardManager != null) {
                this.R = clipboardManager.hasPrimaryClip();
            } else {
                this.R = false;
            }
            k0(z10);
        }
    }

    public final void h0(String str, TLRPC.User user) {
        String str2;
        j9 j9Var;
        if (this.d == null) {
            if (user != null) {
                j9Var = new j9(user);
            } else {
                j9 j9Var2 = new j9(str);
                if (TextUtils.equals(str, this.f35190w)) {
                    str2 = this.f35191x;
                } else {
                    str2 = null;
                }
                j9Var2.v0(str2);
                j9Var = j9Var2;
            }
            presentFragment(j9Var);
        } else if (this.f35186f) {
        } else {
            this.f35186f = true;
            this.Y.setLoading(true);
            l0 w9 = l0.w(this.currentAccount);
            o oVar = new o((d71) this, w9, (Object) user, 7);
            if (user != null) {
                w9.Y(user, new r1(4, this, oVar));
            } else {
                oVar.run(str);
            }
        }
    }

    public final void i0(TL_wallet.nftItem nftitem) {
        this.d = nftitem;
        this.e = l0.w(this.currentAccount).s();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int max = Math.max(0, this.f35183a0 - this.Z);
        c71 c71Var = this.f25615a;
        if (c71Var != null) {
            c71Var.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f) + this.Z + max);
            this.f25615a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f) + this.Z);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(68.0f) + this.Z;
            this.U.setLayoutParams(layoutParams);
            if (this.f35184b0 != max) {
                this.U.animate().cancel();
                this.U.animate().translationY(-max).setDuration(320L).setInterpolator(zr.h).start();
                this.f35184b0 = max;
            }
        }
    }

    public final void k0(boolean z10) {
        boolean z11;
        float f7;
        if (this.O != null) {
            boolean z12 = false;
            if (this.M.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.R) {
                z12 = true;
            }
            if (this.P != z12 || !z10) {
                this.P = z12;
                b0(this.N, z12, z10);
            }
            if (this.Q != z11 || !z10) {
                this.Q = z11;
                b0(this.O, z11, z10);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.M.getLayoutParams();
            if (this.P) {
                f7 = 128.0f;
            } else if (this.Q) {
                f7 = 60.0f;
            } else {
                f7 = 8.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (layoutParams.rightMargin != dp) {
                layoutParams.rightMargin = dp;
                this.M.setLayoutParams(layoutParams);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b0 b0Var = this.f35185c0;
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
        this.f35187n = true;
        zh.b0 b0Var = this.f35185c0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.f35185c0);
            this.f35185c0 = null;
        }
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.animate().cancel();
        }
        ImageView imageView = this.O;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        if (this.f35192y != 0) {
            getConnectionsManager().cancelRequest(this.f35192y, true);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
        }
        getNotificationCenter().removeObserver(this.H, NotificationCenter.reloadHints);
        Runnable runnable = this.J;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        m mVar = this.h;
        if (mVar != null) {
            mVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.Z = i13;
        j0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f35183a0 = k1Var.f45250a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        zh.b0 b0Var = this.f35185c0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.f35185c0);
            this.f35185c0 = null;
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i10, strArr, iArr);
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                d0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p9(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            r9 r9Var = this.T;
            clipboardManager.removePrimaryClipChangedListener(r9Var);
            this.S.addPrimaryClipChangedListener(r9Var);
        }
        f0(true);
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            FrameLayout frameLayout = this.U;
            if (frameLayout != null && (frameLayout.getBackground() instanceof GradientDrawable) && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7)) != this.X) {
                this.X = themedColor;
                ((GradientDrawable) this.U.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor});
            }
            ShapeDrawable shapeDrawable = this.W;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.z1(getThemedColor(org.telegram.ui.ActionBar.k6.Oh), shapeDrawable);
                ImageView imageView = this.V;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
