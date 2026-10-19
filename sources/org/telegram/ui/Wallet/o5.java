package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cf0;
import org.telegram.ui.ib0;
import org.telegram.ui.lc0;
import org.telegram.ui.qa1;
import org.telegram.ui.st0;
import org.telegram.ui.tf1;
import org.telegram.ui.vf1;
public final class o5 extends w61 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface T0;
    public ei.d A0;
    public ei.d B0;
    public l0 C0;
    public e0 D0;
    public boolean E;
    public boolean E0;
    public float G0;
    public float H0;
    public ValueAnimator I0;
    public org.telegram.ui.ActionBar.u0 K0;
    public zh.b0 L0;
    public int M0;
    public SpannableString P0;
    public ah.x Q;
    public boolean Q0;
    public x4 R;
    public boolean R0;
    public FrameLayout S;
    public j S0;
    public TextView T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public x90 Y;
    public y4 Z;
    public boolean f34635a0;
    public FrameLayout f34636b0;
    public FrameLayout f34637c0;
    public b5 d;
    public y4 e;
    public boolean f34639e0;
    public int f34640f;
    public c91 f34641f0;
    public FrameLayout f34642g0;
    public c5 h;
    public n8 f34643h0;
    public t7 f34644i0;
    public float f34646k0;
    public ValueAnimator f34647l0;
    public ai.r m0;
    public int f34648n;
    public boolean f34649n0;
    public ei.h1 f34650o0;
    public k5 f34651p0;
    public boolean f34653r;
    public LinearLayout f34654r0;
    public org.telegram.ui.Components.q6 f34656s0;
    public org.telegram.ui.Components.q6 f34657t0;
    public w5 f34658u0;
    public e5 f34659v0;
    public FrameLayout f34660w;
    public float f34661w0;
    public View f34662x;
    public float f34663x0;
    public ah.v f34664y;
    public qa1 f34665y0;
    public float f34666z0;
    public final org.telegram.ui.Cells.k7 f34655s = new org.telegram.ui.Cells.k7(this, 27);
    public final t3 v = new ut() {
        @Override
        public final void a(int i10, boolean z10) {
            v61 v61Var;
            o5 o5Var = o5.this;
            org.telegram.ui.Cells.k7 k7Var = o5Var.f34655s;
            if ((i10 != 1 && i10 != 3) || (v61Var = o5Var.f32025a) == null) {
                return;
            }
            o5Var.f34653r = z10;
            v61Var.removeCallbacks(k7Var);
            k7Var.run();
        }
    };
    public final Rect F = new Rect();
    public final Matrix G = new Matrix();
    public final Matrix H = new Matrix();
    public final Matrix I = new Matrix();
    public final float[] J = new float[8];
    public final float[] K = new float[8];
    public final float[] L = new float[8];
    public final int[] M = new int[2];
    public final int[] N = new int[2];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public int f34638d0 = 0;
    public String f34645j0 = "";
    public final b71[] f34652q0 = new b71[2];
    public final p3 F0 = new p3(this, 3);
    public final p3 J0 = new p3(this, 4);
    public final CharSequence[] N0 = new CharSequence[2];
    public final HashSet O0 = new HashSet();

    public static void B0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        k2[] k2VarArr;
        View[] viewArr;
        Utilities.Callback2 callback22;
        LinearLayout o02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ai.l7 l7Var = new ai.l7(context, i10, 0L, d6Var, null);
                l7Var.f1735i1 = wallettransaction;
                l7Var.K2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                l7Var.show();
                return;
            }
        }
        boolean z10 = true;
        k2[] k2VarArr2 = new k2[1];
        View[] viewArr2 = new View[1];
        l0 A = m0.w(i10).A();
        ArrayList arrayList = new ArrayList(A.f34442c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || m0.f0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (callback3 == null && p0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? n4Var = new n4(context, d6Var, A, arrayList, i10, rect, viewArr);
            n4Var.setPosition(i11);
            o4 o4Var = new o4(arrayList, context, d6Var, rect, i10, k2VarArr2);
            k2VarArr = k2VarArr2;
            n4Var.setAdapter(o4Var);
            callback22 = callback2;
            o02 = n4Var;
        } else {
            k2VarArr = k2VarArr2;
            viewArr = viewArr2;
            callback22 = callback2;
            o02 = o0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr, false);
        }
        k2[] k2VarArr3 = k2VarArr;
        p4 p4Var = new p4(context, o02, d6Var, o02, viewArr, context);
        k2VarArr3[0] = p4Var;
        if ((o02 instanceof d91) && callback22 != null) {
            p4Var.setOnDismissListener(new z3(1, callback22, wallettransaction));
        }
        k2 k2Var = k2VarArr3[0];
        if (callback3 == null) {
            z10 = false;
        }
        k2Var.setFocusable(z10);
        k2 k2Var2 = k2VarArr3[0];
        k2Var2.useBackgroundTopPadding = false;
        k2Var2.show();
    }

    public static void D0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.f3 i10 = kk.i(1, context, d6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21058h5, d6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.z5.c(-2.0f, -1));
        linearLayout.addView(new m6(160, context, false), w7.z5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        kk.o(org.telegram.ui.ActionBar.h6.f21093j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i11.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i12 = org.telegram.ui.ActionBar.h6.f21392z6;
        kk.o(i12, d6Var, i11, 1, 14.0f);
        i11.setGravity(17);
        i11.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i11, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        g5 g5Var = new g5(context, d6Var);
        g5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(g5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g5 g5Var2 = new g5(context, d6Var);
        g5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(g5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g5 g5Var3 = new g5(context, d6Var);
        g5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        g5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(g5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ei.d f7 = kk.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21046gc, d6Var), new q3(context, 1)));
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i10};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new x3(f3VarArr, 1));
        f3VarArr[0].show();
    }

    public static void E0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        m0 w9 = m0.w(i10);
        if (w9.E()) {
            String s10 = w9.s();
            if (TextUtils.isEmpty(s10)) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
            f3Var.setBackgroundColor(-12207881);
            f3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new n5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            m5 m5Var = new m5(context, s10);
            linearLayout.addView(m5Var, w7.z5.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 24, 0, 24, 20));
            ei.d dVar = new ei.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new yq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            f3Var.customView = frameLayout;
            f3Var.occupyNavigationBar = true;
            f3Var.setApplyTopPadding(false);
            f3Var.setApplyBottomPadding(false);
            f3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new o3(f3Var, 0));
            m5Var.e = new r0(s10, 1);
            f3Var.show();
            f3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && f3Var.getWindow() != null) {
                f3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ci.d6(dVar, i10, f3Var, d6Var, 7));
        }
    }

    public static void S0(b71 b71Var, boolean z10) {
        boolean canScrollVertically = b71Var.canScrollVertically(-1);
        b71Var.W2.N(z10);
        b71Var.a0();
        if (!canScrollVertically) {
            b71Var.V2.h1(0, 0);
        }
    }

    public static Uri V0(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (w0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String W0(Uri uri) {
        if (w0(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 1) {
                String str = pathSegments.get(0);
                if (!"sendgrams".equalsIgnoreCase(str) && str.matches("[a-zA-Z][a-zA-Z0-9_]{3,31}")) {
                    return str;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static void Y(o5 o5Var) {
        m0 w9 = m0.w(o5Var.currentAccount);
        ei.d dVar = o5Var.B0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        w9.j0(new e2.o0((Object) w9, (Object) new x(6, o5Var, w9), false, false, 3));
    }

    public static void Z(o5 o5Var) {
        pf.d.r(o5Var.getParentActivity(), m0.w(o5Var.currentAccount).f34476j);
    }

    public static void a0(o5 o5Var) {
        E0(o5Var.getParentActivity(), o5Var.currentAccount, o5Var.getResourceProvider());
    }

    public static void b0(o5 o5Var, String str, m0 m0Var, i80 i80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, o5Var.getParentActivity(), o5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        e1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = e1Var.f20759b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(m0Var, currencyrate, i80Var, 2));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void c0(o5 o5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (o5Var.f34664y != null && (kVar = o5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) o5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (o5Var.f34664y.getParent() != o5Var.actionBar) {
                AndroidUtilities.removeFromParent(o5Var.f34664y);
                o5Var.actionBar.addView(o5Var.f34664y, w7.z5.c(-1.0f, -1));
            }
            o5Var.f34664y.bringToFront();
            o5Var.actionBar.bringToFront();
            o5Var.f34664y.post(new p3(o5Var, 10));
        }
    }

    public static void d0(o5 o5Var) {
        E0(o5Var.getParentActivity(), o5Var.currentAccount, o5Var.getResourceProvider());
    }

    public static void e0(o5 o5Var, String str) {
        Uri V0 = V0(str);
        String W0 = W0(V0);
        if (W0 != null) {
            int i10 = o5Var.currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(W0, new ei.e4(i10, new w3(o5Var, 4)));
        } else if ((o5Var.getParentActivity() instanceof LaunchActivity) && new ib0((LaunchActivity) o5Var.getParentActivity(), o5Var.currentAccount, null, false).g(V0)) {
        } else {
            AndroidUtilities.runOnUIThread(new p3(o5Var, 11));
        }
    }

    public static void f0(o5 o5Var, LinearLayout linearLayout, m0 m0Var, i80 i80Var) {
        TL_wallet.currencyRate currencyrate;
        o5 o5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f7 = m0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                b10 b10Var = new b10(o5Var.getParentActivity(), o5Var.getResourceProvider());
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(31);
                linearLayout2.addView(b10Var, w7.z5.n(200, -2));
            }
            return;
        }
        f fVar = m0Var2.h;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f10 = fVar.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f10 != null && (arrayList = f10.rates) != null) {
            int size = arrayList.size();
            currencyrate = null;
            int i11 = 0;
            while (i11 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i11);
                i11++;
                TL_wallet.currencyRate currencyrate4 = currencyrate3;
                if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "USD")) {
                    currencyrate2 = currencyrate4;
                } else if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "EUR")) {
                    currencyrate = currencyrate4;
                }
            }
        } else {
            currencyrate = null;
        }
        if (currencyrate2 == null) {
            currencyrate2 = f.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f10 != null && f10.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(fVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                if (inputMethodManager != null) {
                    f.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            f.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f34178a).config.phoneCountryIso2.get());
            f.c(linkedHashSet, LocaleController.getInstance().getCurrentLocale());
            f.c(linkedHashSet, LocaleController.getInstance().getSystemDefaultLocale());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f10.rates;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i12);
                            i12++;
                            TL_wallet.currencyRate currencyrate6 = currencyrate5;
                            if (currencyrate6 != null && TextUtils.equals(currencyrate6.currency, str)) {
                                arrayList2.add(currencyrate6);
                                break;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i13);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                b0(o5Var, g10, m0Var2, i80Var, linearLayout2, currencyrate7);
            }
            i13++;
            m0Var2 = m0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            o5Var2 = o5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(o5Var.getParentActivity(), o5Var2.resourceProvider), w7.z5.n(-1, 8));
        } else {
            o5Var2 = o5Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                b0(o5Var2, g10, m0Var, i80Var, linearLayout2, currencyrate8);
            }
            i14++;
            o5Var2 = o5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void g0(o5 o5Var, Context context, View view) {
        boolean z10;
        m0 w9 = m0.w(o5Var.currentAccount);
        final i80 I = i80.I(o5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f27134s = 0;
        I.V(5);
        i80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new st0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w6 w6Var = new w6(o5Var, linearLayout, w9, I, 10);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(w6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = w9.h;
        String i10 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i10);
        String str = i10;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(75.0f), y3.f20759b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w6 w6Var2 = new w6(w9, new boolean[]{z10}, y3, w6Var, 11);
        o5Var.O0.add(w6Var2);
        w6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(o5Var) {
            public final o5 f34066b;

            {
                this.f34066b = o5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o5 o5Var2 = this.f34066b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        o5 o5Var3 = this.f34066b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        o5 o5Var4 = this.f34066b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new w61());
                        return;
                    default:
                        I.u();
                        o5 o5Var5 = this.f34066b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(o5Var) {
            public final o5 f34066b;

            {
                this.f34066b = o5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o5 o5Var2 = this.f34066b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        o5 o5Var3 = this.f34066b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        o5 o5Var4 = this.f34066b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new w61());
                        return;
                    default:
                        I.u();
                        o5 o5Var5 = this.f34066b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(o5Var) {
            public final o5 f34066b;

            {
                this.f34066b = o5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o5 o5Var2 = this.f34066b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        o5 o5Var3 = this.f34066b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        o5 o5Var4 = this.f34066b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new w61());
                        return;
                    default:
                        I.u();
                        o5 o5Var5 = this.f34066b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ w9.f34474g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(o5Var) {
            public final o5 f34066b;

            {
                this.f34066b = o5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o5 o5Var2 = this.f34066b;
                        o5Var2.getClass();
                        I.u();
                        o5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        o5 o5Var3 = this.f34066b;
                        o5Var3.getClass();
                        I.u();
                        o5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        o5 o5Var4 = this.f34066b;
                        o5Var4.getClass();
                        I.u();
                        o5Var4.presentFragment(new w61());
                        return;
                    default:
                        I.u();
                        o5 o5Var5 = this.f34066b;
                        o5.D0(o5Var5.getParentActivity(), o5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f27129p = new z3(3, o5Var, w6Var2);
        I.Z();
    }

    public static void h0(o5 o5Var, long j10) {
        p3 p3Var = o5Var.J0;
        if (o5Var.f32025a != null) {
            n8 n8Var = o5Var.f34643h0;
            if (n8Var != null) {
                n8Var.a();
            }
            if (o5Var.H0 <= 0.0f && o5Var.v0()) {
                int top = o5Var.f32025a.V2.m(o5Var.f34640f).getTop() - o5Var.f32025a.getPaddingTop();
                o5Var.f32025a.B0();
                if (top < 0) {
                    o5Var.f32025a.v0(0, top, bs.h);
                    return;
                }
                return;
            }
            o5Var.f32025a.B0();
            o5Var.n0(true);
            AndroidUtilities.cancelRunOnUIThread(p3Var);
            if (j10 > 0) {
                AndroidUtilities.runOnUIThread(p3Var, j10 + 260);
            }
        }
    }

    public static int l0(o5 o5Var) {
        return o5Var.currentAccount;
    }

    public static Typeface m0(Context context) {
        if (T0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                T0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                T0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        return T0;
    }

    public static android.widget.LinearLayout o0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.Utilities.Callback3 r46, org.telegram.messenger.Utilities.Callback2 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.d6 r50, org.telegram.ui.Wallet.k2[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o5.o0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.d6, org.telegram.ui.Wallet.k2[], boolean):android.widget.LinearLayout");
    }

    public static String q0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder r0(int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
        yqVar.recolorDrawable = false;
        yqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence l4 = m0.w(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21392z6, d6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static boolean w0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean x0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && w0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && W0(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final CharSequence A0(int i10) {
        org.telegram.ui.Components.q6 q6Var;
        float f7;
        CharSequence[] charSequenceArr = this.N0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                q6Var = this.f34656s0;
            } else {
                q6Var = this.f34657t0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ca0 ca0Var = new ca0(AndroidUtilities.dp(f7), q6Var);
            ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ca0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void C0(TL_wallet.nftItem nftitem) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ai.l7 l7Var = new ai.l7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            l7Var.f1729f1 = nftitem;
            if (this.f34644i0 != null) {
                l7Var.f1731g1 = new v4(this, tL_starGiftUnique, nftitem);
                l7Var.f1733h1 = new w4(this, nftitem);
            }
            l7Var.K2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(l7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20929a7, resourceProvider);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
            l4 l4Var = new l4(parentActivity, resourceProvider);
            l4Var.setBackgroundColor(w02);
            l4Var.fixNavigationBar(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            w9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i15 = org.telegram.ui.ActionBar.h6.f21392z6;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider), PorterDuff.Mode.SRC_IN));
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                w9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                w9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(w9Var, w7.z5.q(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = LocaleController.getString(R.string.WalletCollectible);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            textView.setTextColor(w03);
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(AndroidUtilities.bold());
            int i16 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            linearLayout.addView(textView2, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i17 = 0;
            while (i17 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i16);
                int dp = AndroidUtilities.dp(16.0f);
                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, resourceProvider);
                int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21076i6, resourceProvider);
                linearLayout3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w04, w05, w05));
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i17 == 0) {
                    i11 = R.string.WalletTransfer;
                } else {
                    i11 = R.string.WalletSell;
                }
                String string = LocaleController.getString(i11);
                linearLayout3.setContentDescription(string);
                ImageView imageView = new ImageView(parentActivity);
                if (i17 == 0) {
                    i12 = R.drawable.wallet_transfer;
                } else {
                    i12 = R.drawable.wallet_sell;
                }
                imageView.setImageResource(i12);
                imageView.setImportantForAccessibility(2);
                imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                linearLayout3.addView(imageView, w7.z5.n(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(string);
                textView3.setTextColor(w03);
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                linearLayout3.addView(textView3, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i17 == 0) {
                    i13 = 0;
                } else {
                    i13 = 4;
                }
                if (i17 == 0) {
                    i14 = 4;
                } else {
                    i14 = 0;
                }
                linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -1, i13, i14, 0));
                i17++;
                i16 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                k01 k01Var = new k01(parentActivity, resourceProvider);
                k01Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d6, resourceProvider)));
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    k01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(k01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, w7.z5.n(-1, 48));
            l4Var.setCustomView(scrollView);
            l4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new cf0(24, l4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new t2(parentActivity, 1));
            dVar.setOnClickListener(new t2(l4Var, 2));
            l4Var.show();
            l4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) l4Var, w02, false);
        }
    }

    public final void F0() {
        if (getParentActivity() != null && this.L0 == null && this.K0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.L0 = zh.b0.k(this, this.K0, new gi.c(10), new w3(this, 3), new p3(this, 8));
            }
        }
    }

    public final void G0(boolean z10) {
        float f7;
        boolean z11;
        this.f34639e0 = z10;
        if (!z10) {
            this.f34638d0 = 0;
        }
        if (this.f34650o0 != null && this.f34642g0 != null) {
            if (!z10) {
                this.f34643h0.b(false);
                this.f34650o0.setPosition(0);
            }
            T0();
            ValueAnimator valueAnimator = this.f34647l0;
            if (valueAnimator != null) {
                this.f34647l0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.m0.isAttachedToWindow() && this.m0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f34650o0.o(false);
            }
            if (z11 && this.f34646k0 != f7) {
                this.f34642g0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34646k0, f7);
                this.f34647l0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f34647l0.setInterpolator(bs.h);
                this.f34647l0.addUpdateListener(new v3(this, 0));
                this.f34647l0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 7));
                this.f34647l0.start();
            } else {
                H0(f7);
                this.f34650o0.o(false);
            }
            if (this.f32025a != null && this.f34649n0 != I0()) {
                R0(false);
            }
        }
    }

    public final void H0(float f7) {
        int i10;
        this.f34646k0 = f7;
        FrameLayout frameLayout = this.f34642g0;
        if (f7 <= 0.0f && this.f34647l0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        this.f34642g0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34642g0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f34642g0.setLayoutParams(layoutParams);
    }

    public final boolean I0() {
        l0 l0Var;
        if (!this.f34639e0 && (l0Var = this.C0) != null && l0Var.f34442c.isEmpty()) {
            l0 l0Var2 = this.C0;
            l0Var2.getClass();
            if (l0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J0() {
        this.E0 = false;
        n8 n8Var = this.f34643h0;
        if (n8Var != null) {
            n8Var.b(false);
        }
        this.f34638d0 = 0;
        ei.h1 h1Var = this.f34650o0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
    }

    public final void K0() {
        this.f34653r = false;
        v61 v61Var = this.f32025a;
        if (v61Var != null) {
            v61Var.C2.f32211b.remove(this.v);
            this.f32025a.removeCallbacks(this.f34655s);
        }
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void L0() {
        boolean z10;
        m0 w9 = m0.w(this.currentAccount);
        U0();
        ei.d dVar = this.B0;
        if (w9.E() && w9.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!w9.E()) {
            this.f34656s0.setText(A0(0));
            this.f34657t0.setText(A0(1));
            return;
        }
        long u10 = w9.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.P0 == null) {
            this.P0 = new SpannableString("G");
            b5 b5Var = this.d;
            b5Var.getClass();
            w5 w5Var = new w5(b5Var, R.drawable.wallet_gram_large);
            this.f34658u0 = w5Var;
            SpannableString spannableString = this.P0;
            spannableString.setSpan(w5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.P0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) x5.e(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f34659v0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f34146a = -9577217;
            this.f34659v0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f34659v0, length, spannableStringBuilder.length(), 33);
        this.f34656s0.setText(spannableStringBuilder);
        CharSequence l4 = m0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f34657t0.setText(A0(1));
        } else {
            this.f34657t0.setText(l4);
        }
        O0(this.f34661w0);
        e0 e0Var = this.D0;
        if (e0Var != null && !e0Var.h && !e0Var.f34131i && e0Var.f34133k == null) {
            e0Var.e();
        }
        String s10 = w9.s();
        if (!TextUtils.isEmpty(s10)) {
            this.d.setCardNumber(q0(s10.toUpperCase()));
        }
    }

    public final void M0() {
        float[] fArr;
        float[] fArr2;
        float f7;
        Rect rect = this.F;
        if (!rect.isEmpty() && this.f34662x.isAttachedToWindow()) {
            b5 b5Var = this.d;
            ah.v vVar = this.f34664y;
            Matrix matrix = this.G;
            if (b5Var.g(vVar, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i10 = 0;
                while (true) {
                    fArr = this.J;
                    fArr2 = this.K;
                    float f10 = 0.0f;
                    if (i10 >= 4) {
                        break;
                    }
                    if (i10 != 1 && i10 != 2) {
                        f7 = 0.0f;
                    } else {
                        f7 = width;
                    }
                    if (i10 >= 2) {
                        f10 = height;
                    }
                    int i11 = i10 * 2;
                    fArr[i11] = f7;
                    int i12 = i11 + 1;
                    fArr[i12] = f10;
                    fArr2[i11] = rect.left + f7;
                    fArr2[i12] = rect.top + f10;
                    i10++;
                }
                matrix.mapPoints(fArr2);
                ah.v vVar2 = this.f34664y;
                int[] iArr = this.N;
                vVar2.getLocationInWindow(iArr);
                View view = this.f34662x;
                int[] iArr2 = this.M;
                view.getLocationInWindow(iArr2);
                this.d.i(this.f34661w0, this.f34660w.getWidth() / 0.7826087f);
                float f11 = iArr2[0] - iArr[0];
                float z10 = org.telegram.ui.Cells.c1.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = i13 * 2;
                    float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.f34661w0);
                    float[] fArr3 = this.L;
                    fArr3[i14] = lerp;
                    int i15 = i14 + 1;
                    fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + z10, this.f34661w0);
                }
                Matrix matrix2 = this.I;
                boolean polyToPoly = matrix2.setPolyToPoly(this.J, 0, this.L, 0, 4);
                Matrix matrix3 = this.H;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.f34664y.invalidate();
                }
                b5 b5Var2 = this.d;
                Matrix matrix4 = b5Var2.f35094c;
                Matrix matrix5 = b5Var2.e;
                Matrix matrix6 = b5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!b5Var2.f35103n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        b5Var2.f35103n = true;
                        b5Var2.N.invalidate();
                    }
                }
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.f34661w0);
                this.f34657t0.setPivotX(0.0f);
                this.f34657t0.setPivotY(0.0f);
                this.f34657t0.setScaleX(lerp2);
                this.f34657t0.setScaleY(lerp2);
            }
        }
    }

    public final void N0() {
        ah.v vVar;
        float clamp;
        boolean z10;
        float f7;
        b5 b5Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f10;
        float height;
        b5 b5Var2;
        if (this.f32025a != null && this.d != null && this.f34654r0 != null && this.f34662x != null && (vVar = this.f34664y) != null && this.actionBar != null) {
            vVar.bringToFront();
            View m10 = this.f32025a.V2.m(this.f34640f);
            if (m10 == null) {
                if (this.f32025a.V2.L0() > this.f34640f) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f32025a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f34663x0 = clamp;
            int i11 = (this.H0 > 0.0f ? 1 : (this.H0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.G0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    clamp = 0.0f;
                } else {
                    clamp = (1.0f - this.G0) * clamp;
                }
            }
            this.f34661w0 = clamp;
            Q0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f34661w0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f34661w0);
            this.d.setPivotX(b5Var.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(lerp);
            this.d.setScaleY(lerp);
            this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            b5 b5Var3 = this.d;
            if (!z10 && (m10 == null || clamp >= 1.0f || m10.getBottom() <= this.f32025a.getPaddingTop() || m10.getTop() >= this.f32025a.getHeight() - this.f32025a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            b5Var3.setVisibility(i10);
            int[] iArr = this.P;
            int[] iArr2 = this.O;
            if (m10 != null) {
                this.f32025a.getLocationInWindow(iArr2);
                this.h.getLocationInWindow(iArr);
                r16 = 1;
                this.d.setTranslationX(((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.d.setTranslationY(this.e.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f7);
            } else {
                r16 = 1;
            }
            if (z10) {
                if (this.H0 == 0.0f) {
                    z12 = r16;
                } else {
                    z12 = false;
                }
                float f11 = this.G0;
                if (z12) {
                    min = 0.3f * f11;
                    f10 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f11) * 0.06f;
                    f10 = 0.84f;
                }
                float f12 = min + f10;
                this.actionBar.getLocationInWindow(iArr2);
                this.h.getLocationInWindow(iArr);
                float dp = AndroidUtilities.dp(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f13 = 1.0f - f11;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.d.getHeight() * 0.35f;
                }
                float f14 = dp - (f13 * height);
                if (z12) {
                    f14 = a1.g.B(0.9f - f12, this.d.getHeight(), 2.0f, f14);
                }
                float width = (this.h.getWidth() - this.d.getWidth()) / 2.0f;
                if (!z12) {
                    f11 = Math.min(1.0f, f11 * 2.0f);
                }
                if (m10 != null) {
                    this.f32025a.getLocationInWindow(iArr2);
                    float width2 = ((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y3 = this.e.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float clamp01 = Utilities.clamp01(1.0f - ((f14 - y3) / (this.d.getHeight() * 0.5f)));
                    if (clamp01 >= 1.0f) {
                        AndroidUtilities.cancelRunOnUIThread(this.J0);
                        ValueAnimator valueAnimator = this.I0;
                        if (valueAnimator != null) {
                            this.I0 = null;
                            valueAnimator.cancel();
                        }
                        this.G0 = 0.0f;
                        this.H0 = 0.0f;
                        N0();
                        return;
                    }
                    width = AndroidUtilities.lerp(width, width2, clamp01);
                    f14 = AndroidUtilities.lerp(f14, y3, clamp01);
                    f12 = AndroidUtilities.lerp(f12, 1.0f, clamp01);
                    f11 = AndroidUtilities.lerp(f11, 1.0f, clamp01);
                }
                this.d.setPivotX(b5Var2.getWidth() * 0.5f);
                this.d.setPivotY(0.0f);
                this.d.setScaleX(f12);
                this.d.setScaleY(f12);
                this.d.setTranslationX(width);
                this.d.setTranslationY(f14);
                this.d.setAlpha(f11);
            }
            if (clamp > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.E != z11 && (linearLayout = this.f34654r0) != null) {
                Rect rect = this.F;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f34654r0.getHeight() != 0) {
                        rect.set(this.f34654r0.getLeft(), this.f34654r0.getTop(), this.f34654r0.getRight(), this.f34654r0.getBottom());
                    }
                }
                this.d.setOnFrontContentPresented(null);
                AndroidUtilities.removeFromParent(this.f34654r0);
                this.E = z11;
                if (z11) {
                    this.f34664y.addView(this.f34654r0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f34654r0.layout(0, 0, rect.width(), rect.height());
                    M0();
                } else {
                    b5 b5Var4 = this.d;
                    b5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = b5Var4.M;
                    AndroidUtilities.removeFromParent(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    v5 v5Var = b5Var4.O;
                    v5Var.setScaleX(1.0f);
                    v5Var.setScaleY(1.0f);
                    b5Var4.E.addView(linearLayout2, b5Var4.P);
                    this.f34654r0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.d.getClass();
                    M0();
                }
                this.f34664y.invalidate();
            }
            O0(clamp);
            if (this.E) {
                M0();
            }
            float f15 = 1.0f - clamp;
            float f16 = (1.0f - f15) * (-AndroidUtilities.dp(8.0f));
            if (this.actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setAlpha(f15);
                this.actionBar.getTitleTextView().setTranslationY(f16);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setAlpha(f15);
                this.actionBar.getTitleTextView2().setTranslationY(f16);
            }
        }
    }

    public final void O0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        this.f34656s0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.q6 q6Var = this.f34657t0;
        float[] fArr = this.d.f35091a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3));
        }
        q6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.a.o(themedColor, Math.round(142.8f)), f7));
        w5 w5Var = this.f34658u0;
        if (w5Var != null) {
            w5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        e5 e5Var = this.f34659v0;
        if (e5Var != null) {
            float[] fArr2 = this.d.f35091a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.a.f(fArr2[8], h7.p(fArr2, -9577217, 0), h7.p(fArr2, -9577217, 3));
            }
            e5Var.f34146a = i0.a.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.f34656s0.invalidate();
    }

    public final void P0(float[] fArr) {
        boolean z10;
        float f7;
        int n10;
        if (this.A0 != null && this.B0 != null) {
            float f10 = h7.j(getThemedColor(org.telegram.ui.ActionBar.h6.f20929a7))[0];
            if (f10 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
            float f11 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = i10 * 4;
                    float f12 = fArr[i11 + 10];
                    if (f12 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = h7.n(themedColor, (int) f12, (int) fArr[i11 + 11]);
                    }
                    iArr[i10] = n10;
                }
                themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z10) {
                f11 = f10 + 0.25f;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = f10 - 0.2f;
            }
            float[] j10 = h7.j(themedColor);
            float f13 = j10[0];
            int i12 = -16777216;
            if (f13 < f11 || f13 > f7) {
                themedColor = (themedColor & (-16777216)) | (h7.l(Math.max(f11, Math.min(f7, f13)), j10[1], j10[2]) & 16777215);
            }
            if (themedColor != this.M0) {
                this.M0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i12 = getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                }
                ei.d[] dVarArr = {this.A0, this.B0};
                for (int i13 = 0; i13 < 2; i13++) {
                    ei.d dVar = dVarArr[i13];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i12);
                }
            }
        }
    }

    public final void Q0() {
        v61 v61Var = this.f32025a;
        if (v61Var != null && this.d != null) {
            float b10 = v61Var.C2.b(1);
            float min = Math.min(10.0f, this.f32025a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.d.setAdditionalTilt(Math.max(0.0f, (this.f34661w0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f34661w0))) * 90.0f) - 10.0f)) + min);
            this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.f34661w0, 0.33000001311302185d)));
        }
    }

    public final void R0(boolean z10) {
        boolean I0 = I0();
        v61 v61Var = this.f32025a;
        b71[] b71VarArr = this.f34652q0;
        if (v61Var != null && this.f34649n0 != I0) {
            this.f34649n0 = I0;
            v61Var.B0();
            for (b71 b71Var : b71VarArr) {
                if (b71Var != null) {
                    b71Var.B0();
                }
            }
            this.f32025a.W2.N(false);
            this.f32025a.V2.h1(0, 0);
            this.f32025a.post(new p3(this, 10));
        }
        if (!I0) {
            for (b71 b71Var2 : b71VarArr) {
                if (b71Var2 != null) {
                    S0(b71Var2, z10);
                }
            }
            ai.r rVar = this.m0;
            if (rVar != null) {
                rVar.post(new p3(this, 5));
                this.m0.post(new p3(this, 6));
            }
        }
    }

    public final void T0() {
        n8 n8Var = this.f34643h0;
        if (n8Var != null && this.f34650o0 != null && n8Var.f34610w != 0.0f) {
            n8Var.f34610w = 0.0f;
            n8Var.f34605c.setVisibility(8);
            n8Var.invalidate();
        }
    }

    @Override
    public final void U(ArrayList arrayList, t61 t61Var) {
        m0 w9 = m0.w(this.currentAccount);
        U0();
        arrayList.add(g61.l(this.Q));
        this.f34640f = arrayList.size();
        y4 y4Var = this.e;
        g61 g61Var = new g61(-4);
        g61Var.f26491c = y4Var;
        g61Var.f26510z = -1;
        g61Var.e = true;
        arrayList.add(g61Var);
        arrayList.add(g61.l(this.f34665y0));
        boolean I0 = I0();
        this.f34649n0 = I0;
        if (I0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = f5.f34198a;
            g61 J = g61.J(f5.class);
            J.f26496k = i10;
            J.f26497l = string;
            J.f26498m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            g61 J2 = g61.J(f5.class);
            J2.f26496k = i12;
            J2.f26497l = string3;
            J2.f26498m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            g61 J3 = g61.J(f5.class);
            J3.f26496k = i13;
            J3.f26497l = string5;
            J3.f26498m = string6;
            arrayList.add(J3);
            arrayList.add(g61.l(this.Z));
        } else if (this.m0 != null) {
            if (this.Q0 && !this.R0 && w9.u() > 500000000) {
                arrayList.add(g61.k(this.f34636b0));
            }
            arrayList.add(g61.p(this.m0, 0, true));
        }
        x90 x90Var = this.Y;
        if (x90Var != null) {
            this.f34635a0 = false;
            x90Var.animate().cancel();
            this.Y.setAlpha(0.0f);
            this.Y.setVisibility(4);
        }
    }

    public final void U0() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.R == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        boolean z13 = false;
        if (this.R.isAttachedToWindow() && this.R.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x4 x4Var = this.R;
        FrameLayout frameLayout = this.S;
        Boolean bool = w9.f34475i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(w9.f34476j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        x4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = w9.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (!i0Var.e) {
                long j11 = i0Var.f34310c;
                if (j11 >= 0) {
                    j10 += j11;
                }
            }
        }
        if (j10 > 500000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.V.setText(s0(R.string.WalletOldWalletsBalance, j10));
        }
        this.R.i(this.U, z12, z10);
        long j12 = ai.ga.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.X.setText(s0(R.string.WalletGramEarningsBalance, j12));
        }
        this.R.i(this.W, z13, z10);
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override
    public final void W(g61 g61Var, View view) {
        e0 e0Var;
        Object obj = g61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            C0((TL_wallet.nftItem) obj);
        } else if (g61Var.d == -10001 && (e0Var = this.D0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            B0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) g61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean X(g61 g61Var, View view) {
        t7 t7Var;
        if ((view instanceof g7) && (t7Var = this.f34644i0) != null) {
            t7Var.S((g7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        t7 t7Var = this.f34644i0;
        if ((t7Var == null || !t7Var.f34938p0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f34647l0;
        if (valueAnimator != null) {
            this.f34647l0 = null;
            valueAnimator.cancel();
        }
        K0();
        k5 k5Var = this.f34651p0;
        if (k5Var != null) {
            k5Var.b(null);
        }
        this.e = null;
        this.R = null;
        this.Q = null;
        this.m0 = null;
        this.f34650o0 = null;
        b71[] b71VarArr = this.f34652q0;
        b71VarArr[0] = null;
        b71VarArr[1] = null;
        e0 e0Var = this.D0;
        if (e0Var != null && !e0Var.f34126a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34639e0 = z10;
        if (!z10) {
            this.f34638d0 = 0;
        } else if (this.E0) {
            this.f34638d0 = 1;
        }
        t7 t7Var = this.f34644i0;
        if (t7Var != null) {
            t7Var.p();
        }
        this.f34644i0 = null;
        View createView = super.createView(context);
        lc0 lc0Var = new lc0(this, context);
        lc0Var.addView(createView, w7.z5.c(-1.0f, -1));
        this.fragmentView = lc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20929a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 a2 = n10.a(2, R.drawable.scan_qr);
        this.K0 = a2;
        a2.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f34795b;

            {
                this.f34795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f34795b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        return;
                    case 1:
                        o5.a0(this.f34795b);
                        return;
                    case 2:
                        o5.d0(this.f34795b);
                        return;
                    case 3:
                        this.f34795b.F0();
                        return;
                    default:
                        o5.Y(this.f34795b);
                        return;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new cf0(26, this, context));
        ah.x xVar = new ah.x(this, context, 27);
        this.Q = xVar;
        xVar.setClipToPadding(false);
        this.Q.setClipChildren(false);
        this.Q.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        x4 x4Var = new x4(this, context);
        this.R = x4Var;
        x4Var.setDefaultRadiusDp(22);
        this.R.setOnAnimatedHeightChangedListener(new p3(this, 12));
        TextView textView = new TextView(context);
        this.T = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.S = p0(this.T, new p3(this, 0));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        this.U = p0(textView2, new p3(this, 1));
        TextView textView3 = new TextView(context);
        this.X = textView3;
        this.W = p0(textView3, new p3(this, 2));
        this.Q.addView(this.R, w7.z5.c(-2.0f, -1));
        x90 x90Var = new x90(context, null);
        this.Y = x90Var;
        this.f34635a0 = false;
        x90Var.setAlpha(0.0f);
        x90 x90Var2 = this.Y;
        int i11 = org.telegram.ui.ActionBar.h6.f21392z6;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        this.Y.setTextSize(1, 13.0f);
        this.Y.setGravity(17);
        this.Y.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21046gc, this.resourceProvider), new q3(context, 0)));
        this.Y.setVisibility(4);
        ((FrameLayout) createView).addView(this.Y, w7.z5.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        y4 y4Var = new y4(this, context, 0);
        this.Z = y4Var;
        y4Var.setImportantForAccessibility(2);
        this.f34636b0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34637c0 = frameLayout;
        int i12 = org.telegram.ui.ActionBar.h6.f20987d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.h6.f21076i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i13)), 16, 16));
        this.f34636b0.addView(this.f34637c0, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f34637c0.addView(imageView, w7.z5.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        kk.o(org.telegram.ui.ActionBar.h6.f21225q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f34637c0.addView(textView4, w7.z5.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f34637c0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f34795b;

            {
                this.f34795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f34795b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        return;
                    case 1:
                        o5.a0(this.f34795b);
                        return;
                    case 2:
                        o5.d0(this.f34795b);
                        return;
                    case 3:
                        this.f34795b.F0();
                        return;
                    default:
                        o5.Y(this.f34795b);
                        return;
                }
            }
        });
        w7.b6.b(this.f34637c0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34660w = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.f34660w.setClipToPadding(false);
        this.actionBar.addView(this.f34660w, w7.z5.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.f34662x = view;
        this.f34660w.addView(view, w7.z5.e(1, 1, 19));
        this.E = false;
        this.F.setEmpty();
        this.H.reset();
        ah.v vVar = new ah.v(this, context);
        this.f34664y = vVar;
        vVar.setClipChildren(false);
        this.f34664y.setClipToPadding(false);
        b5 b5Var = new b5(this, context);
        this.d = b5Var;
        b5Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) {
            public final o5 f34795b;

            {
                this.f34795b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f34795b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        return;
                    case 1:
                        o5.a0(this.f34795b);
                        return;
                    case 2:
                        o5.d0(this.f34795b);
                        return;
                    case 3:
                        this.f34795b.F0();
                        return;
                    default:
                        o5.Y(this.f34795b);
                        return;
                }
            }
        });
        this.f32025a.C2.f32211b.add(this.v);
        y4 y4Var2 = new y4(this, context, 1);
        this.e = y4Var2;
        y4Var2.setImportantForAccessibility(2);
        c5 c5Var = new c5(this, context);
        this.h = c5Var;
        c5Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.c(-2.0f, -1));
        lc0Var.addView(this.h, w7.z5.c(-1.0f, -1));
        this.f32025a.setClipChildren(false);
        this.f32025a.setClipToPadding(false);
        this.f34654r0 = this.d.getBalanceLayout();
        this.f34656s0 = this.d.getBalanceView();
        this.f34657t0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.f34666z0 = 0.0f;
        qa1 qa1Var = new qa1(this, context, 19);
        this.f34665y0 = qa1Var;
        qa1Var.setOrientation(0);
        this.f34665y0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.f34665y0.addView(this.A0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        this.A0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f34795b;

            {
                this.f34795b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f34795b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        return;
                    case 1:
                        o5.a0(this.f34795b);
                        return;
                    case 2:
                        o5.d0(this.f34795b);
                        return;
                    case 3:
                        this.f34795b.F0();
                        return;
                    default:
                        o5.Y(this.f34795b);
                        return;
                }
            }
        });
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.B0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.B0.setEnabled(m0.w(this.currentAccount).d());
        this.B0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f34795b;

            {
                this.f34795b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f34795b;
                        o5Var.getClass();
                        o5Var.presentFragment(new vf1(6, null));
                        return;
                    case 1:
                        o5.a0(this.f34795b);
                        return;
                    case 2:
                        o5.d0(this.f34795b);
                        return;
                    case 3:
                        this.f34795b.F0();
                        return;
                    default:
                        o5.Y(this.f34795b);
                        return;
                }
            }
        });
        this.f34665y0.addView(this.B0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        P0(this.d.getStickerStyle());
        this.C0 = m0.w(this.currentAccount).A();
        this.f32025a.setDescendantFocusability(131072);
        t7 t7Var2 = new t7(this, this.d, new n2.e(this, lc0Var, false, 12), null);
        this.f34644i0 = t7Var2;
        lc0Var.addView(t7Var2, w7.z5.c(-1.0f, -1));
        this.f34645j0 = "";
        ai.r rVar = new ai.r(context, 8);
        this.m0 = rVar;
        rVar.setOrientation(1);
        this.m0.setBackgroundColor(getThemedColor(i10));
        ei.h1 h1Var = new ei.h1(this, context, this.resourceProvider, 10);
        this.f34650o0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f34650o0.setAdapter(new k4(this, context));
        c91 n11 = this.f34650o0.n(-2, true);
        this.f34641f0 = n11;
        n11.g(i11, org.telegram.ui.ActionBar.h6.G6, i11, i13, i12);
        this.f34641f0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i12)));
        this.f34642g0 = new FrameLayout(context);
        n8 n8Var = new n8(context, this.f34641f0, this.resourceProvider, new w3(this, 0), new w3(this, 1), new w3(this, 2));
        this.f34643h0 = n8Var;
        this.f34642g0.addView(n8Var, w7.z5.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f34650o0.setPosition(this.f34638d0);
        T0();
        this.m0.addView(this.f34642g0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.m0.addView(this.f34650o0, w7.z5.l(1.0f, -1, 0));
        G0(this.f34639e0);
        e0 e0Var2 = this.D0;
        if (e0Var2 != null) {
            this.f34644i0.Y(e0Var2);
        }
        this.f32025a.j(new kv(this, 14));
        t61 t61Var = this.f32025a.W2;
        t61Var.f30436r = false;
        t61Var.N(false);
        k5 k5Var2 = new k5(this);
        this.f34651p0 = k5Var2;
        k5Var2.b(this.f32025a);
        L0();
        this.C0.h();
        this.actionBar.post(new p3(this, 9));
        this.f32025a.post(new p3(this, 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v61 v61Var;
        t61 t61Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f34656s0 != null) {
                L0();
                Iterator it = this.O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i10 == NotificationCenter.starBalanceUpdated) {
                U0();
            } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.Q0 = true;
                        this.R0 = ((TL_account.Password) obj).has_password;
                        v61 v61Var2 = this.f32025a;
                        if (v61Var2 != null && (t61Var = v61Var2.W2) != null) {
                            t61Var.N(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                l0 l0Var = this.C0;
                if (obj2 == l0Var && (v61Var = this.f32025a) != null && v61Var.W2 != null) {
                    if (l0Var.f34441b.isEmpty()) {
                        l0 l0Var2 = this.C0;
                        if (!l0Var2.h) {
                            l0Var2.h();
                        }
                    }
                    R0(true);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(boolean z10) {
        float f7;
        long j10;
        bs bsVar;
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.H0 == f7) {
            return;
        }
        this.H0 = f7;
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        N0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G0, f7);
        this.I0 = ofFloat;
        if (z10) {
            j10 = 260;
        } else {
            j10 = 120;
        }
        ofFloat.setDuration(j10);
        ValueAnimator valueAnimator2 = this.I0;
        if (z10) {
            bsVar = new bs(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            bsVar = new bs(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(bsVar);
        this.I0.addUpdateListener(new v3(this, 1));
        this.I0.addListener(new tf1(this, 4));
        this.I0.start();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        n8 n8Var = this.f34643h0;
        if (n8Var != null && n8Var.f34611x) {
            if (z10) {
                n8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        k5 k5Var = this.f34651p0;
        if (k5Var != null) {
            k5Var.c();
        }
        v61 v61Var = this.f32025a;
        if (v61Var != null) {
            v61Var.B0();
        }
        b71 t02 = t0();
        if (t02 != null) {
            t02.B0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = ApplicationLoader.applicationContext;
        if (p5.f34693k0.compareAndSet(false, true)) {
            p5.f34694l0.postRunnable(new q3(context, 2));
        }
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        m0 w9 = m0.w(this.currentAccount);
        if (w9.f34481o == null) {
            w9.f34481o = new e0(w9);
        }
        e0 e0Var = w9.f34481o;
        this.D0 = e0Var;
        p3 p3Var = this.F0;
        ArrayList arrayList = e0Var.d;
        if (!arrayList.contains(p3Var)) {
            arrayList.add(p3Var);
        }
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
        }
        int i10 = w9.D;
        w9.D = i10 + 1;
        HashSet hashSet = w9.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            w9.Q();
        }
        this.S0 = new j(w9, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.L0);
            this.L0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.J0);
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t7 t7Var = this.f34644i0;
        if (t7Var != null) {
            t7Var.p();
        }
        b5 b5Var = this.d;
        if (b5Var != null) {
            b5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.f34647l0;
        if (valueAnimator2 != null) {
            this.f34647l0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.D0;
        if (e0Var != null) {
            e0Var.d.remove(this.F0);
        }
        K0();
        k5 k5Var = this.f34651p0;
        if (k5Var != null) {
            k5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.f34664y);
        l0 l0Var = this.C0;
        if (l0Var != null) {
            l0Var.a();
        }
        super.onFragmentDestroy();
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
            this.S0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32025a.setPadding(0, 0, 0, i13);
        this.f32025a.setClipToPadding(false);
        x90 x90Var = this.Y;
        if (x90Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x90Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.Y.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        zh.b0 b0Var = this.L0;
        if (b0Var != null) {
            b0Var.g();
            AndroidUtilities.removeFromParent(this.L0);
            this.L0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                F0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20602a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new s3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new p3(this, 9));
        }
        m0.w(this.currentAccount).C();
        if (this.D0 != null && m0.w(this.currentAccount).E()) {
            e0 e0Var = this.D0;
            if (!e0Var.f34132j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        L0();
        if (this.f32025a != null) {
            R0(true);
        }
    }

    public final FrameLayout p0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21076i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21392z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new t2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.b6.b(textView, 0.02f, 1.2f);
        this.R.addView(frameLayout, w7.z5.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence s0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        yq yqVar = new yq(R.drawable.mini_gram_16, 0);
        yqVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        spannableStringBuilder.setSpan(yqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m0.n(j10, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final b71 t0() {
        View currentView;
        if (u0()) {
            ei.h1 h1Var = this.f34650o0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof b71) {
                return (b71) currentView;
            }
        }
        return null;
    }

    public final boolean u0() {
        ai.r rVar;
        if (!this.f34649n0 && (rVar = this.m0) != null && rVar.isAttachedToWindow()) {
            ViewParent parent = this.m0.getParent();
            v61 v61Var = this.f32025a;
            if (parent == v61Var.V2.m(v61Var.W2.f30439x.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v0() {
        View m10;
        v61 v61Var = this.f32025a;
        if (v61Var != null && (m10 = v61Var.V2.m(this.f34640f)) != null && this.f34663x0 < 0.5f && m10.getBottom() > this.f32025a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        e0 e0Var;
        b71 b71Var = this.f34652q0[1];
        if (this.f34638d0 == 1 && b71Var != null && b71Var.G && (e0Var = this.D0) != null && !e0Var.f34131i && !e0Var.f34130g && e0Var.f34133k == null && b71Var.V2.N0() >= b71Var.W2.f30439x.size() - 3) {
            this.D0.e();
        }
    }

    public final void z0() {
        l0 l0Var;
        b71 b71Var = this.f34652q0[0];
        if (b71Var != null && b71Var.G && (l0Var = this.C0) != null && !l0Var.h && b71Var.V2.N0() >= b71Var.W2.f30439x.size() - 3) {
            this.C0.h();
        }
    }
}
