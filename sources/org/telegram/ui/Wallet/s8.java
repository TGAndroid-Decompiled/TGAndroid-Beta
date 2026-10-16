package org.telegram.ui.Wallet;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.z9;
public final class s8 extends d71 {
    public TextView E;
    public FrameLayout F;
    public TextView G;
    public int I;
    public Runnable J;
    public boolean K;
    public ah.x L;
    public di.g2 M;
    public TextView N;
    public ImageView O;
    public ClipboardManager S;
    public FrameLayout U;
    public di.d V;
    public int W;
    public int X;
    public int Y;
    public TL_wallet.nftItem d;
    public String e;
    public boolean f33435f;
    public n h;
    public boolean f33436n;
    public hg.a2 v;
    public String f33439w;
    public String f33440x;
    public int f33441y;
    public final ArrayList f33437r = new ArrayList();
    public final ArrayList f33438s = new ArrayList();
    public final p8 H = new NotificationCenter.NotificationCenterDelegate() {
        @Override
        public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
            c71 c71Var;
            s8 s8Var = s8.this;
            if (!s8Var.f33436n && (c71Var = s8Var.f24003a) != null) {
                c71Var.W2.N(true);
            }
        }
    };
    public boolean P = true;
    public boolean Q = true;
    public boolean R = true;
    public final q8 T = new ClipboardManager.OnPrimaryClipChangedListener() {
        @Override
        public final void onPrimaryClipChanged() {
            s8.this.e0(true);
        }
    };

    public static void Y(s8 s8Var, String str, int i10) {
        s8Var.J = null;
        int i11 = s8Var.currentAccount;
        di.k4 k4Var = new di.k4(s8Var, i10, 6);
        TL_toncenter.performApiRequest performapirequest = new TL_toncenter.performApiRequest();
        performapirequest.endpoint = "/api/v3/dns/records";
        performapirequest.query = "domain=" + Uri.encode(str) + "&limit=2";
        s8Var.f33441y = ConnectionsManager.getInstance(i11).sendRequestTyped(performapirequest, new Object(), new bi.f0(24, str, k4Var), MessagesController.getInstance(i11).webFileDatacenterId, 0);
    }

    public static void Z(s8 s8Var, k0 k0Var, TLRPC.User user, String str, TL_wallet.walletTransaction wallettransaction, String str2) {
        s8Var.h = null;
        if (s8Var.f33436n) {
            return;
        }
        s8Var.V.setLoading(false);
        if (wallettransaction != null && k0.b(s8Var.e, k0Var.r())) {
            if (user != null) {
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                wallettransactionpeeruser.user_id = user.f19063id;
                wallettransactionpeeruser.address = str;
                wallettransaction.peer = wallettransactionpeeruser;
            }
            a5.s0(s8Var.getParentActivity(), s8Var.currentAccount, wallettransaction, new u(s8Var, k0Var, user, str), new d(s8Var, 10), null, null, s8Var.getResourceProvider());
            return;
        }
        s8Var.f33435f = false;
        zc a02 = zc.a0(s8Var);
        if (str2 == null) {
            str2 = LocaleController.getString(R.string.WalletCollectibleTransferPrepareFailed);
        }
        a02.e0(str2, false);
    }

    public static void a0(View view, boolean z10, boolean z11) {
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
        view.animate().alpha(f7).scaleX(f10).scaleY(f10).setDuration(320L).setInterpolator(es.h).withEndAction(new zr0(15, view, z10)).start();
    }

    public static boolean b0(TLRPC.User user) {
        if (user != null && !user.bot && !user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19063id)) {
            return true;
        }
        return false;
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
            arrayList.add(m61.C(AndroidUtilities.dp(4.0f)));
            a71Var.U();
            i2.d.p(R.string.WalletRecipient, arrayList);
            ah.x xVar = this.L;
            m61 m61Var = new m61(-1);
            m61Var.f26940c = xVar;
            m61Var.f26959z = 50;
            arrayList.add(m61Var);
            a71Var.T();
            String trim = this.M.getText().toString().trim();
            String lowerCase = trim.toLowerCase(Locale.ROOT);
            float f16 = 12.0f;
            int i13 = 0;
            if (this.f33439w != null) {
                if (this.F == null) {
                    FrameLayout frameLayout = new FrameLayout(getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 2, -1));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    ImageView imageView = new ImageView(getParentActivity());
                    imageView.setImageDrawable(new cr(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(46.0f), getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), getParentActivity().getResources().getDrawable(R.drawable.menu_gram_24).mutate()));
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
                    frameLayout.addView(imageView, w7.z5.a(46.0f, f10, 0.0f, f11, 0.0f, 46, i14));
                    TextView textView = new TextView(getParentActivity());
                    this.E = textView;
                    sk.j(16.0f, R.string.WalletGramWalletAddress, 1, textView);
                    textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
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
                    frameLayout.addView(textView, w7.z5.a(24.0f, f12, 8.0f, f13, 0.0f, -1, 48));
                    TextView textView2 = new TextView(getParentActivity());
                    this.G = textView2;
                    textView2.setTextSize(1, 14.0f);
                    this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19988y6));
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
                    frameLayout.addView(textView3, w7.z5.a(22.0f, f14, 32.0f, f15, 0.0f, -1, 48));
                    frameLayout.setOnClickListener(new m8(this, 0));
                    this.F = frameLayout;
                }
                TextView textView4 = this.E;
                String str = this.f33440x;
                if (str == null) {
                    str = LocaleController.getString(R.string.WalletGramWalletAddress);
                }
                textView4.setText(str);
                this.G.setText(this.f33439w);
                arrayList.add(m61.C(AndroidUtilities.dp(12.0f)));
                a71Var.U();
                FrameLayout frameLayout2 = this.F;
                m61 m61Var2 = new m61(-1);
                m61Var2.f26940c = frameLayout2;
                m61Var2.f26959z = 60;
                arrayList.add(m61Var2);
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
                    if (b0(user) && hashSet.add(Long.valueOf(user.f19063id))) {
                        arrayList2.add(user);
                    }
                    f16 = f17;
                }
                f7 = f16;
                ArrayList arrayList4 = this.f33437r;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    TLRPC.User user2 = (TLRPC.User) obj;
                    if (hashSet.add(Long.valueOf(user2.f19063id))) {
                        arrayList2.add(user2);
                    }
                }
            } else {
                f7 = 12.0f;
                arrayList2 = this.f33438s;
            }
            int size3 = arrayList2.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size3) {
                Object obj2 = arrayList2.get(i18);
                i18++;
                TLRPC.User user3 = (TLRPC.User) obj2;
                if (i17 == 0) {
                    arrayList.add(m61.C(AndroidUtilities.dp(f7)));
                    a71Var.U();
                    if (TextUtils.isEmpty(lowerCase)) {
                        i2.d.p(R.string.Recent, arrayList);
                    }
                }
                m61 v = m61.v(user3);
                if (!TextUtils.isEmpty(lowerCase)) {
                    v.f26946l = AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, trim);
                    String publicUsername = UserObject.getPublicUsername(user3);
                    if (!TextUtils.isEmpty(publicUsername)) {
                        v.f26947m = AndroidUtilities.generateSearchName(t8.b.h("@", publicUsername), null, "@".concat(trim));
                    }
                    i11 = i13;
                    v.F = new p(user3, v.f26946l, v.f26947m, 8);
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
                    arrayList.add(m61.C(AndroidUtilities.dp(f7)));
                    a71Var.U();
                }
                if (this.f33440x != null) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
                for (int i20 = i19; i20 < i10; i20++) {
                    arrayList.add(m61.o((-1) - i20, 18));
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
                int i22 = fj.f24759a;
                m61 J = m61.J(fj.class);
                J.f26946l = string;
                J.f26947m = formatString;
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
    public final void W(m61 m61Var, View view) {
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            int i10 = this.currentAccount;
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new fi.a2(i10, user.f19063id, 1));
            AndroidUtilities.hideKeyboard(this.M);
            f0(null, user);
        }
    }

    @Override
    public final boolean X(m61 m61Var, View view) {
        return false;
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.M);
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            return;
        }
        z9.e0(getParentActivity(), true, 1, new r8(this));
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f24003a);
        this.f24003a.p1();
        this.f24003a.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f));
        this.f24003a.setClipToPadding(false);
        c71 c71Var = this.f24003a;
        c71Var.W2.f23145r = false;
        c71Var.j(new kc0(this, 12));
        ah.x xVar = new ah.x(this, context, 26);
        this.S = (ClipboardManager) context.getSystemService("clipboard");
        di.g2 g2Var = new di.g2(context);
        this.M = g2Var;
        g2Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        this.M.setHintTextColor(org.telegram.ui.ActionBar.g6.m1(0.72f, getThemedColor(org.telegram.ui.ActionBar.g6.H6)));
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
        xVar.addView(this.M, w7.z5.a(-1.0f, 8.0f, 0.0f, 52.0f, 0.0f, -1, 119));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setText(LocaleController.getString(R.string.WalletPaste));
        TextView textView2 = this.N;
        int i10 = org.telegram.ui.ActionBar.g6.f19784n6;
        textView2.setTextColor(getThemedColor(i10));
        this.N.setTextSize(1, 14.0f);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setGravity(17);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.1f, getThemedColor(i10));
        TextView textView3 = this.N;
        int dp = AndroidUtilities.dp(16.0f);
        int m13 = org.telegram.ui.ActionBar.g6.m1(0.18f, getThemedColor(i10));
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, m12, m13, m13));
        this.N.setOnClickListener(new m8(this, 2));
        w7.b6.b(this.N, 0.04f, 1.2f);
        xVar.addView(this.N, w7.z5.a(32.0f, 0.0f, 0.0f, 62.0f, 0.0f, 58, 21));
        this.M.addTextChangedListener(new di.h2(this, 16));
        ImageView imageView = new ImageView(context);
        this.O = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setImageResource(R.drawable.scan_qr);
        this.O.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        this.O.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.12f, getThemedColor(i10)), 1, -1));
        this.O.setContentDescription(LocaleController.getString(R.string.WalletScanQRCode));
        this.O.setOnClickListener(new m8(this, 3));
        xVar.addView(this.O, w7.z5.a(40.0f, 0.0f, 0.0f, 20.0f, 0.0f, 32, 21));
        e0(false);
        this.L = xVar;
        hg.a2 a2Var = new hg.a2(true);
        this.v = a2Var;
        a2Var.f10488a = new ji.w4(this, 17);
        getNotificationCenter().addObserver(this.H, NotificationCenter.reloadHints);
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        this.f33437r.clear();
        int i11 = this.currentAccount;
        MessagesStorage.getInstance(i11).getStorageQueue().postRunnable(new hg.n(i11, 0, new n8(this), 0));
        if (!TextUtils.isEmpty(null)) {
            this.M.setText((CharSequence) null);
            di.g2 g2Var2 = this.M;
            g2Var2.setSelection(g2Var2.length());
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7);
        this.U.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, themedColor), themedColor, themedColor}));
        di.d dVar = new di.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.V = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletContinue));
        this.V.setEnabled(false);
        this.V.setOnClickListener(new m8(this, 1));
        di.d dVar2 = this.V;
        if (dVar2 != null) {
            if (this.f33439w == null) {
                z10 = false;
            }
            dVar2.setEnabled(z10);
        }
        this.U.addView(this.V, w7.z5.e(-1, 48, 119));
        ((FrameLayout) this.fragmentView).addView(this.U, w7.z5.e(-1, 68, 87));
        h0();
        this.f24003a.W2.N(false);
        return this.fragmentView;
    }

    public final void d0(String str) {
        String userName;
        String publicUsername;
        ArrayList arrayList = this.f33438s;
        arrayList.clear();
        if (!TextUtils.isEmpty(str) && this.f33439w == null && this.f33440x == null) {
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
                if (dialog2 != null && dialog2.f18920id > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(dialog2.f18920id));
                    if (b0(user) && (((userName = UserObject.getUserName(user)) != null && userName.toLowerCase(Locale.ROOT).contains(lowerCase)) || ((publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.toLowerCase(Locale.ROOT).contains(lowerCase)))) {
                        if (hashSet.add(Long.valueOf(user.f19063id))) {
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
                    if (b0(user2) && hashSet.add(Long.valueOf(user2.f19063id))) {
                        arrayList.add(user2);
                    }
                }
            }
            c71 c71Var = this.f24003a;
            if (c71Var != null) {
                c71Var.W2.N(true);
                return;
            }
            return;
        }
        c71 c71Var2 = this.f24003a;
        if (c71Var2 != null) {
            c71Var2.W2.N(true);
        }
    }

    public final void e0(boolean z10) {
        if (!this.f33436n && this.M != null && this.O != null) {
            ClipboardManager clipboardManager = this.S;
            if (clipboardManager != null) {
                this.R = clipboardManager.hasPrimaryClip();
            } else {
                this.R = false;
            }
            i0(z10);
        }
    }

    public final void f0(String str, TLRPC.User user) {
        String str2;
        j8 j8Var;
        if (this.d == null) {
            if (user != null) {
                j8Var = new j8(user);
            } else {
                j8 j8Var2 = new j8(str);
                if (TextUtils.equals(str, this.f33439w)) {
                    str2 = this.f33440x;
                } else {
                    str2 = null;
                }
                j8Var2.u0(str2);
                j8Var = j8Var2;
            }
            presentFragment(j8Var);
        } else if (this.f33435f) {
        } else {
            this.f33435f = true;
            this.V.setLoading(true);
            k0 v = k0.v(this.currentAccount);
            p pVar = new p((d71) this, v, (Object) user, 7);
            if (user != null) {
                v.W(user, new bi.f0(29, this, pVar));
            } else {
                pVar.run(str);
            }
        }
    }

    public final void g0(TL_wallet.nftItem nftitem) {
        this.d = nftitem;
        this.e = k0.v(this.currentAccount).r();
    }

    public final void h0() {
        int max = Math.max(0, this.X - this.W);
        c71 c71Var = this.f24003a;
        if (c71Var != null) {
            c71Var.setPadding(0, 0, 0, AndroidUtilities.dp(68.0f) + this.W + max);
            this.f24003a.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.U;
        if (frameLayout != null) {
            frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f) + this.W);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(68.0f) + this.W;
            this.U.setLayoutParams(layoutParams);
            if (this.Y != max) {
                this.U.animate().cancel();
                this.U.animate().translationY(-max).setDuration(320L).setInterpolator(es.h).start();
                this.Y = max;
            }
        }
    }

    public final void i0(boolean z10) {
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
                a0(this.N, z12, z10);
            }
            if (this.Q != z11 || !z10) {
                this.Q = z11;
                a0(this.O, z11, z10);
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.f33436n = true;
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
        if (this.f33441y != 0) {
            getConnectionsManager().cancelRequest(this.f33441y, true);
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
        h0();
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.X = l1Var.f43497a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override
    public final void onPause() {
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            clipboardManager.removePrimaryClipChangedListener(this.T);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResultFragment(i10, strArr, iArr);
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                c0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n8(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ClipboardManager clipboardManager = this.S;
        if (clipboardManager != null) {
            q8 q8Var = this.T;
            clipboardManager.removePrimaryClipChangedListener(q8Var);
            this.S.addPrimaryClipChangedListener(q8Var);
        }
        e0(true);
    }
}
