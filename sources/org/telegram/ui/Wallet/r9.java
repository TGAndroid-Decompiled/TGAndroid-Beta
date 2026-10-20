package org.telegram.ui.Wallet;

import ai.qa;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zq;
public final class r9 extends x61 {
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
    public ei.d V;
    public int W;
    public int X;
    public int Y;
    public zh.b0 Z;
    public TL_wallet.nftItem d;
    public String e;
    public boolean f34814f;
    public n h;
    public boolean f34815n;
    public hg.a2 v;
    public String f34818w;
    public String f34819x;
    public int f34820y;
    public final ArrayList f34816r = new ArrayList();
    public final ArrayList f34817s = new ArrayList();
    public final i3 H = new i3(this, 1);
    public boolean P = true;
    public boolean Q = true;
    public boolean R = true;
    public final q9 T = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            r9.this.f0(true);
        }
    };

    public static void Y(r9 r9Var, m0 m0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        r9Var.h = null;
        if (r9Var.f34815n) {
            return;
        }
        r9Var.V.setLoading(false);
        if (wallettransaction != null && m0.a(r9Var.e, m0Var.s())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f20423id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            o5.B0(r9Var.getParentActivity(), r9Var.currentAccount, wallettransaction, new t(r9Var, m0Var, user, str), new d(r9Var, 10), null, null, r9Var.getResourceProvider());
            return;
        }
        r9Var.f34814f = false;
        xc a02 = xc.a0(r9Var);
        if (str2 == null) {
            str2 = LocaleController.getString(R.string.WalletCollectibleTransferPrepareFailed);
        }
        a02.e0(str2, false);
    }

    public static void Z(r9 r9Var, String str) {
        String g02 = g0(str);
        if (!r9Var.isFinished && r9Var.M != null && g02 != null) {
            if (g02.startsWith("@")) {
                int i10 = r9Var.currentAccount;
                MessagesController.getInstance(i10).getUserNameResolver().resolve(g02.substring(1), new ei.e4(i10, new m9(r9Var, 1)));
                return;
            }
            r9Var.M.setText(g02);
            ei.e2 e2Var = r9Var.M;
            e2Var.setSelection(e2Var.length());
            AndroidUtilities.hideKeyboard(r9Var.M);
            r9Var.h0(g02, null);
        }
    }

    public static void a0(r9 r9Var, String str, int i10) {
        r9Var.J = null;
        int i11 = r9Var.currentAccount;
        ei.e4 e4Var = new ei.e4(r9Var, i10, 7);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        r9Var.f34820y = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new ai.r5(29, str, e4Var), MessagesController.getInstance(i11).webFileDatacenterId, 0);
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
        view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(bs.h).withEndAction(new b60(17, view, z10)).start();
    }

    public static boolean c0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20423id)) {
            return true;
        }
        return false;
    }

    public static String g0(String str) {
        Uri V0 = o5.V0(str);
        if ("ton".equalsIgnoreCase(V0.getScheme())) {
            if ("transfer".equalsIgnoreCase(V0.getAuthority()) && V0.getPathSegments().size() == 1) {
                String str2 = V0.getPathSegments().get(0);
                if (WalletEngine2.isValidRecipientAddress(str2)) {
                    return str2;
                }
            }
            return null;
        } else if (!o5.x0(V0)) {
            return null;
        } else {
            String W0 = o5.W0(V0);
            if (W0 != null) {
                return "@".concat(W0);
            }
            String queryParameter = V0.getQueryParameter("to");
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
            return r4.c.h("@", queryParameter);
        }
    }

    @Override
    public final void U(ArrayList arrayList, u61 u61Var) {
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
            arrayList.add(h61.C(AndroidUtilities.dp(4.0f)));
            u61Var.U();
            i2.e.p(R.string.WalletRecipient, arrayList);
            ah.x xVar = this.L;
            h61 h61Var = new h61(-1);
            h61Var.f26776c = xVar;
            h61Var.f26795z = 50;
            arrayList.add(h61Var);
            u61Var.T();
            String trim = this.M.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f16 = 12.0f;
            int i13 = 0;
            if (this.f34818w != null) {
                if (this.F == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6), 2, -1));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    imageView.setImageDrawable(new zq(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(46.0f), getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
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
                    mk.j(16.0f, R.string.WalletGramWalletAddress, 1, textView);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
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
                    this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21378y6));
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
                    frameLayout.setOnClickListener(new l9(this, 0));
                    this.F = frameLayout;
                }
                TextView textView4 = this.E;
                String str = this.f34819x;
                if (str == null) {
                    str = LocaleController.getString(R.string.WalletGramWalletAddress);
                }
                textView4.setText(str);
                this.G.setText(this.f34818w);
                arrayList.add(h61.C(AndroidUtilities.dp(12.0f)));
                u61Var.U();
                FrameLayout frameLayout2 = this.F;
                h61 h61Var2 = new h61(-1);
                h61Var2.f26776c = frameLayout2;
                h61Var2.f26795z = 60;
                arrayList.add(h61Var2);
                u61Var.T();
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
                    if (c0(user) && hashSet.add(Long.valueOf(user.f20423id))) {
                        arrayList2.add(user);
                    }
                    f16 = f17;
                }
                f7 = f16;
                ArrayList arrayList4 = this.f34816r;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    TLRPC.User user2 = (TLRPC.User) obj;
                    if (hashSet.add(Long.valueOf(user2.f20423id))) {
                        arrayList2.add(user2);
                    }
                }
            } else {
                f7 = 12.0f;
                arrayList2 = this.f34817s;
            }
            int size3 = arrayList2.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size3) {
                Object obj2 = arrayList2.get(i18);
                i18++;
                TLRPC.User user3 = (TLRPC.User) obj2;
                if (i17 == 0) {
                    arrayList.add(h61.C(AndroidUtilities.dp(f7)));
                    u61Var.U();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i2.e.p(R.string.Recent, arrayList);
                    }
                }
                h61 v = h61.v(user3);
                if (!TextUtils.isEmpty(lowerCase)) {
                    v.f26782l = AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, trim);
                    String publicUsername = UserObject.getPublicUsername(user3);
                    if (!TextUtils.isEmpty(publicUsername)) {
                        v.f26783m = AndroidUtilities.generateSearchName(r4.c.h("@", publicUsername), null, "@".concat(trim));
                    }
                    i11 = i13;
                    v.F = new p(user3, v.f26782l, v.f26783m, 8);
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
                    arrayList.add(h61.C(AndroidUtilities.dp(f7)));
                    u61Var.U();
                }
                if (this.f34819x != null) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                for (int i20 = i19; i20 < i10; i20++) {
                    arrayList.add(h61.o((-1) - i20, 18));
                }
            }
            if (i17 > 0 || this.K) {
                u61Var.T();
            }
            if (!this.K && i17 <= 0 && !TextUtils.isEmpty(lowerCase)) {
                String string = LocaleController.getString(R.string.SearchEmptyViewTitle);
                int i21 = R.string.WalletSearchNoResults;
                Object[] objArr = new Object[1];
                objArr[i19] = lowerCase;
                String formatString = LocaleController.formatString(i21, objArr);
                int i22 = dj.f25506a;
                h61 J = h61.J(dj.class);
                J.f26782l = string;
                J.f26783m = formatString;
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
    public final void W(h61 h61Var, View view) {
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new qa(i10, user.f20423id, 2));
            AndroidUtilities.hideKeyboard(this.M);
            h0(null, user);
        }
    }

    @Override
    public final boolean X(h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f32355a);
        this.f32355a.p1();
        this.f32355a.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f));
        this.f32355a.setClipToPadding(false);
        w61 w61Var = this.f32355a;
        w61Var.W2.f30860r = false;
        w61Var.j(new kv(this, 16));
        ah.x xVar = new ah.x(this, context, 29);
        this.S = (ClipboardManager) context.getSystemService("clipboard");
        ei.e2 e2Var = new ei.e2(context);
        this.M = e2Var;
        e2Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        this.M.setHintTextColor(org.telegram.ui.ActionBar.h6.m1(0.72f, getThemedColor(org.telegram.ui.ActionBar.h6.H6)));
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
        int i10 = org.telegram.ui.ActionBar.h6.f21173n6;
        textView2.setTextColor(getThemedColor(i10));
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setGravity(17);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i10));
        TextView textView3 = this.N;
        int dp = AndroidUtilities.dp(16.0f);
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.18f, getThemedColor(i10));
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
        this.N.setOnClickListener(new l9(this, 2));
        w7.b6.b(this.N, 0.04f, 1.2f);
        xVar.addView(this.N, w7.z5.d(58, 32.0f, 21, 0.0f, 0.0f, 62.0f, 0.0f));
        this.M.addTextChangedListener(new ai.u(this, 17));
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setImageResource(R.drawable.scan_qr);
        this.O.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        this.O.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.12f, getThemedColor(i10)), 1, -1));
        this.O.setContentDescription(LocaleController.getString(R.string.WalletScanQRCode));
        this.O.setOnClickListener(new l9(this, 3));
        xVar.addView(this.O, w7.z5.d(32, 40.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        f0(false);
        this.L = xVar;
        hg.a2 a2Var = new hg.a2(true);
        this.v = a2Var;
        a2Var.f11792a = new ki.t1(this, 19);
        getNotificationCenter().addObserver(this.H, NotificationCenter.reloadHints);
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.f34816r.clear();
        int i11 = this.currentAccount;
        MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new hg.n(i11, 0, new o9(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.M.setText((CharSequence) null);
            ei.e2 e2Var2 = this.M;
            e2Var2.setSelection(e2Var2.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20932a7);
        this.U.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, themedColor), themedColor, themedColor}));
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletContinue));
        this.V.setEnabled(false);
        this.V.setOnClickListener(new l9(this, 1));
        ei.d dVar2 = this.V;
        if (dVar2 != null) {
            if (this.f34818w == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.U.addView(this.V, w7.z5.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.U, w7.z5.e(-1, 68, 87));
        j0();
        this.f32355a.W2.N(false);
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() != null && this.Z == null && this.O != null) {
            AndroidUtilities.hideKeyboard(this.M);
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.Z = zh.b0.k(this, this.O, new gi.c(11), new m9(this, 0), new n9(this, 0));
            }
        }
    }

    public final void e0(String str) {
        String userName;
        String publicUsername;
        ArrayList arrayList = this.f34817s;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f34818w == null && this.f34819x == null) {
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
                if (dialog2 != null && dialog2.f20280id > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(dialog2.f20280id));
                    if (c0(user) && (((userName = UserObject.getUserName(user)) != null && userName.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(user.f20423id))) {
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
                    if (c0(user2) && hashSet.add(Long.valueOf(user2.f20423id))) {
                        arrayList.add(user2);
                    }
                }
            }
            w61 w61Var = this.f32355a;
            if (w61Var != null) {
                w61Var.W2.N(true);
                return;
            }
            return;
        }
        w61 w61Var2 = this.f32355a;
        if (w61Var2 != null) {
            w61Var2.W2.N(true);
        }
    }

    public final void f0(boolean z10) {
        if (!this.f34815n && this.M != null && this.O != null) {
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
        i9 i9Var;
        if (this.d == null) {
            if (user != null) {
                i9Var = new i9(user);
            } else {
                i9 i9Var2 = new i9(str);
                if (TextUtils.equals(str, this.f34818w)) {
                    str2 = this.f34819x;
                } else {
                    str2 = null;
                }
                i9Var2.u0(str2);
                i9Var = i9Var2;
            }
            presentFragment(i9Var);
        } else if (this.f34814f) {
        } else {
            this.f34814f = true;
            this.V.setLoading(true);
            m0 w9 = m0.w(this.currentAccount);
            p pVar = new p((x61) this, w9, (Object) user, 7);
            if (user != null) {
                w9.Y(user, new s1(4, this, pVar));
            } else {
                pVar.run(str);
            }
        }
    }

    public final void i0(TL_wallet.nftItem nftitem) {
        this.d = nftitem;
        this.e = m0.w(this.currentAccount).s();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int max = Math.max(0, this.X - this.W);
        w61 w61Var = this.f32355a;
        if (w61Var != null) {
            w61Var.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f) + this.W + max);
            this.f32355a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f) + this.W);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(68.0f) + this.W;
            this.U.setLayoutParams(layoutParams);
            if (this.Y != max) {
                this.U.animate().cancel();
                this.U.animate().translationY(-max).setDuration(320L).setInterpolator(bs.h).start();
                this.Y = max;
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
        zh.b0 b0Var = this.Z;
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
        this.f34815n = true;
        zh.b0 b0Var = this.Z;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.Z);
            this.Z = null;
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
        if (this.f34820y != 0) {
            getConnectionsManager().cancelRequest(this.f34820y, true);
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
        n nVar = this.h;
        if (nVar != null) {
            nVar.run();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        j0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.X = k1Var.f44835a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        zh.b0 b0Var = this.Z;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.Z);
            this.Z = null;
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
            alertDialog$Builder.f20605a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new o9(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            q9 q9Var = this.T;
            clipboardManager.removePrimaryClipChangedListener(q9Var);
            this.S.addPrimaryClipChangedListener(q9Var);
        }
        f0(true);
    }
}
