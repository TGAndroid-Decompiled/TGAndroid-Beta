package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.dg1;
import org.telegram.ui.fc1;
import org.telegram.ui.lb0;
import org.telegram.ui.nc0;
import org.telegram.ui.wg1;
import org.telegram.ui.xa1;
import org.telegram.ui.xd0;
import org.telegram.ui.zc1;
import org.telegram.ui.zt0;
public final class m5 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public k0 D0;
    public bh.p E;
    public d0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.w0 L0;
    public ai.o0 M0;
    public int N0;
    public SpannableString Q0;
    public bh.r R;
    public boolean R0;
    public u4 S;
    public boolean S0;
    public FrameLayout T;
    public wg1 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public z90 Z;
    public v4 f36936a0;
    public boolean f36937b0;
    public FrameLayout f36938c0;
    public FrameLayout f36939d0;
    public y4 e;
    public v4 f36941f;
    public boolean f36942f0;
    public t91 f36943g0;
    public int h;
    public FrameLayout f36944h0;
    public n8 f36945i0;
    public t7 f36946j0;
    public float f36948l0;
    public ValueAnimator m0;
    public z4 f36949n;
    public bi.r f36950n0;
    public boolean f36951o0;
    public fi.h1 f36952p0;
    public i5 f36953q0;
    public int f36954r;
    public boolean f36956s;
    public LinearLayout f36957s0;
    public org.telegram.ui.Components.s6 f36958t0;
    public org.telegram.ui.Components.s6 f36959u0;
    public v5 f36960v0;
    public b5 f36962w0;
    public FrameLayout f36963x;
    public float f36964x0;
    public View f36965y;
    public float f36966y0;
    public xa1 f36967z0;
    public final cy0 v = new cy0(this, 6);
    public final s3 f36961w = new wt() {
        @Override
        public final void a(int i10, boolean z10) {
            l71 l71Var;
            m5 m5Var = m5.this;
            cy0 cy0Var = m5Var.v;
            if ((i10 != 1 && i10 != 3) || (l71Var = m5Var.f30419a) == null) {
                return;
            }
            m5Var.f36956s = z10;
            l71Var.removeCallbacks(cy0Var);
            cy0Var.run();
        }
    };
    public final Rect G = new Rect();
    public final Matrix H = new Matrix();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final float[] K = new float[8];
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final int[] N = new int[2];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public int f36940e0 = 0;
    public String f36947k0 = "";
    public final r71[] f36955r0 = new r71[2];
    public final o3 G0 = new o3(this, 3);
    public final o3 K0 = new o3(this, 4);
    public final CharSequence[] O0 = new CharSequence[2];
    public final HashSet P0 = new HashSet();

    public static void C0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.o0 o0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        j2[] j2VarArr;
        View[] viewArr;
        Utilities.Callback2 callback22;
        LinearLayout p02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                bi.h7 h7Var = new bi.h7(context, i10, 0L, u6Var, null);
                h7Var.f4744i1 = wallettransaction;
                h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                h7Var.show();
                return;
            }
        }
        boolean z10 = true;
        j2[] j2VarArr2 = new j2[1];
        View[] viewArr2 = new View[1];
        k0 A = l0.w(i10).A();
        ArrayList arrayList = new ArrayList(A.f36763c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || l0.f0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (callback3 == null && o0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? k4Var = new k4(context, u6Var, A, arrayList, i10, rect, viewArr);
            k4Var.setPosition(i11);
            l4 l4Var = new l4(arrayList, context, u6Var, rect, i10, j2VarArr2);
            j2VarArr = j2VarArr2;
            k4Var.setAdapter(l4Var);
            callback22 = callback2;
            p02 = k4Var;
        } else {
            j2VarArr = j2VarArr2;
            viewArr = viewArr2;
            callback22 = callback2;
            p02 = p0(context, i10, wallettransaction, callback3, callback2, bArr, o0Var, u6Var, j2VarArr, false);
        }
        j2[] j2VarArr3 = j2VarArr;
        m4 m4Var = new m4(context, p02, u6Var, p02, viewArr, context);
        j2VarArr3[0] = m4Var;
        if ((p02 instanceof u91) && callback22 != null) {
            m4Var.setOnDismissListener(new zc1(21, callback22, wallettransaction));
        }
        j2 j2Var = j2VarArr3[0];
        if (callback3 == null) {
            z10 = false;
        }
        j2Var.setFocusable(z10);
        j2 j2Var2 = j2VarArr3[0];
        j2Var2.useBackgroundTopPadding = false;
        j2Var2.show();
    }

    public static void E0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.ActionBar.k3 i10 = vh.i(1, context, u6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23427h5;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, gb1.g(-2.0f, -1));
        linearLayout.addView(new l6(160, context, false), gb1.x(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, u6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 1, 0, 0, 0, 6), context);
        e.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i12 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.f7.V(e, i12, u6Var);
        e.setTextSize(1, 14.0f);
        e.setGravity(17);
        e.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(e, gb1.x(-1, -2, 1, 0, 0, 0, 24));
        d5 d5Var = new d5(context, u6Var);
        d5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(d5Var, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var2 = new d5(context, u6Var);
        d5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(d5Var2, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var3 = new d5(context, u6Var);
        d5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(d5Var3, gb1.o(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d f7 = vh.f(24, context, u6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, gb1.x(-1, 48, 1, 0, 0, 0, 0));
        gb1.c(f7, 0.02f, 1.1f);
        z90 z90Var = new z90(context, null);
        org.telegram.ui.ActionBar.f7.V(z90Var, i12, u6Var);
        z90Var.setTextSize(1, 13.0f);
        z90Var.setGravity(17);
        z90Var.setText(M0(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.y6.gc, u6Var, new p3(context, 1)));
        linearLayout.addView(z90Var, gb1.o(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.k3[] k3VarArr = {i10};
        k3VarArr[0].setAllowNestedScroll(true);
        k3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new w3(k3VarArr, 1));
        k3VarArr[0].show();
    }

    public static void F0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        l0 w10 = l0.w(i10);
        if (w10.E()) {
            String s10 = w10.s();
            if (TextUtils.isEmpty(s10)) {
                return;
            }
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var, false);
            k3Var.setBackgroundColor(-12207881);
            k3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new l5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, gb1.j(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            k5 k5Var = new k5(context, s10);
            linearLayout.addView(k5Var, gb1.u(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, gb1.x(-1, -2, 1, 24, 0, 24, 20));
            fi.d dVar = new fi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new zq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, gb1.x(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            gb1.b(imageView);
            frameLayout.addView(imageView, gb1.h(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            k3Var.customView = frameLayout;
            k3Var.occupyNavigationBar = true;
            k3Var.setApplyTopPadding(false);
            k3Var.setApplyBottomPadding(false);
            k3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new n3(k3Var, 0));
            k5Var.e = new q0(s10, 1);
            k3Var.show();
            k3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) k3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) k3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && k3Var.getWindow() != null) {
                k3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new di.c6(dVar, i10, k3Var, u6Var, 7));
        }
    }

    public static SpannableStringBuilder M0(String str, int i10, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i12 = indexOf2 - indexOf) > 2) {
            i11 = i12 - 2;
        } else {
            indexOf = -1;
            i11 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new h5(i10, u6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void U0(r71 r71Var, boolean z10) {
        boolean canScrollVertically = r71Var.canScrollVertically(-1);
        r71Var.f32152g3.O(z10);
        r71Var.a0();
        if (!canScrollVertically) {
            r71Var.f32151f3.h1(0, 0);
        }
    }

    public static Uri X0(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (x0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String Y0(Uri uri) {
        if (x0(uri.getHost())) {
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

    public static void Z(m5 m5Var) {
        l0 w10 = l0.w(m5Var.currentAccount);
        fi.d dVar = m5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        w10.j0(new e2.p0((Object) w10, (Object) new s(8, m5Var, w10), false, false, 3));
    }

    public static void a0(m5 m5Var) {
        qf.d.r(m5Var.getParentActivity(), l0.w(m5Var.currentAccount).f36813j);
    }

    public static void b0(m5 m5Var) {
        F0(m5Var.getParentActivity(), m5Var.currentAccount, m5Var.getResourceProvider());
    }

    public static void c0(m5 m5Var, String str, l0 l0Var, k80 k80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(2, m5Var.getParentActivity(), m5Var.resourceProvider, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        g1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = g1Var.f22637b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        g1Var.setChecked(equals);
        g1Var.setOnClickListener(new m1(l0Var, currencyrate, k80Var, 2));
        linearLayout.addView(g1Var, gb1.r(200, -2));
    }

    public static void d0(m5 m5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (m5Var.E != null && (kVar = m5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) m5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (m5Var.E.getParent() != m5Var.actionBar) {
                AndroidUtilities.removeFromParent(m5Var.E);
                m5Var.actionBar.addView(m5Var.E, gb1.g(-1.0f, -1));
            }
            m5Var.E.bringToFront();
            m5Var.actionBar.bringToFront();
            m5Var.E.post(new o3(m5Var, 10));
        }
    }

    public static void e0(m5 m5Var) {
        F0(m5Var.getParentActivity(), m5Var.currentAccount, m5Var.getResourceProvider());
    }

    public static void f0(m5 m5Var, String str) {
        Uri X0 = X0(str);
        String Y0 = Y0(X0);
        if (Y0 != null) {
            int i10 = m5Var.currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(Y0, new fi.c4(i10, new v3(m5Var, 4)));
        } else if ((m5Var.getParentActivity() instanceof LaunchActivity) && new lb0((LaunchActivity) m5Var.getParentActivity(), m5Var.currentAccount, null, false).g(X0)) {
        } else {
            AndroidUtilities.runOnUIThread(new o3(m5Var, 11));
        }
    }

    public static void g0(m5 m5Var, LinearLayout linearLayout, l0 l0Var, k80 k80Var) {
        TL_wallet.currencyRate currencyrate;
        m5 m5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g7 = l0Var2.h.g();
        TL_wallet.currencyRates f7 = l0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                c10 c10Var = new c10(m5Var.getParentActivity(), m5Var.getResourceProvider());
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(31);
                linearLayout2.addView(c10Var, gb1.r(200, -2));
            }
            return;
        }
        f fVar = l0Var2.h;
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
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f36540a).config.phoneCountryIso2.get());
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
                c0(m5Var, g7, l0Var2, k80Var, linearLayout2, currencyrate7);
            }
            i13++;
            l0Var2 = l0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            m5Var2 = m5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.l1(m5Var.getParentActivity(), m5Var2.resourceProvider), gb1.r(-1, 8));
        } else {
            m5Var2 = m5Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                c0(m5Var2, g7, l0Var, k80Var, linearLayout2, currencyrate8);
            }
            i14++;
            m5Var2 = m5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void h0(m5 m5Var, Context context, View view) {
        boolean z10;
        l0 w10 = l0.w(m5Var.currentAccount);
        final k80 I = k80.I(m5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f29868s = 0;
        I.V(5);
        k80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new zt0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w6 w6Var = new w6(m5Var, linearLayout, w10, I, 10);
        J.r(scrollView, gb1.r(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(w6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.g1 y3 = I.y();
        f fVar = w10.h;
        String i10 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i10);
        String str = i10;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ea0(AndroidUtilities.dp(75.0f), y3.f22637b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w6 w6Var2 = new w6(w10, new boolean[]{z10}, y3, w6Var, 11);
        m5Var.P0.add(w6Var2);
        w6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(m5Var) {
            public final m5 f37557b;

            {
                this.f37557b = m5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m5 m5Var2 = this.f37557b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        return;
                    case 1:
                        m5 m5Var3 = this.f37557b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        m5 m5Var4 = this.f37557b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new m71());
                        return;
                    default:
                        I.u();
                        m5 m5Var5 = this.f37557b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(m5Var) {
            public final m5 f37557b;

            {
                this.f37557b = m5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m5 m5Var2 = this.f37557b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        return;
                    case 1:
                        m5 m5Var3 = this.f37557b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        m5 m5Var4 = this.f37557b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new m71());
                        return;
                    default:
                        I.u();
                        m5 m5Var5 = this.f37557b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(m5Var) {
            public final m5 f37557b;

            {
                this.f37557b = m5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m5 m5Var2 = this.f37557b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        return;
                    case 1:
                        m5 m5Var3 = this.f37557b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        m5 m5Var4 = this.f37557b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new m71());
                        return;
                    default:
                        I.u();
                        m5 m5Var5 = this.f37557b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ w10.f36811g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(m5Var) {
            public final m5 f37557b;

            {
                this.f37557b = m5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        m5 m5Var2 = this.f37557b;
                        m5Var2.getClass();
                        I.u();
                        m5Var2.presentFragment(PasscodeActivity.l0());
                        return;
                    case 1:
                        m5 m5Var3 = this.f37557b;
                        m5Var3.getClass();
                        I.u();
                        m5Var3.presentFragment(new h8());
                        return;
                    case 2:
                        m5 m5Var4 = this.f37557b;
                        m5Var4.getClass();
                        I.u();
                        m5Var4.presentFragment(new m71());
                        return;
                    default:
                        I.u();
                        m5 m5Var5 = this.f37557b;
                        m5.E0(m5Var5.getParentActivity(), m5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f29863p = new zc1(23, m5Var, w6Var2);
        I.Z();
    }

    public static void i0(m5 m5Var, long j10) {
        o3 o3Var = m5Var.K0;
        if (m5Var.f30419a != null) {
            n8 n8Var = m5Var.f36945i0;
            if (n8Var != null) {
                n8Var.a();
            }
            if (m5Var.I0 <= 0.0f && m5Var.w0()) {
                int top = m5Var.f30419a.f32151f3.m(m5Var.h).getTop() - m5Var.f30419a.getPaddingTop();
                m5Var.f30419a.C0();
                if (top < 0) {
                    m5Var.f30419a.w0(0, top, ds.h);
                    return;
                }
                return;
            }
            m5Var.f30419a.C0();
            m5Var.o0(true);
            AndroidUtilities.cancelRunOnUIThread(o3Var);
            if (j10 > 0) {
                AndroidUtilities.runOnUIThread(o3Var, j10 + 260);
            }
        }
    }

    public static int m0(m5 m5Var) {
        return m5Var.currentAccount;
    }

    public static Typeface n0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        return U0;
    }

    public static android.widget.LinearLayout p0(final android.content.Context r35, int r36, org.telegram.tgnet.tl.TL_wallet.walletTransaction r37, org.telegram.messenger.Utilities.Callback3 r38, org.telegram.messenger.Utilities.Callback2 r39, byte[] r40, java.lang.Runnable r41, org.telegram.ui.ActionBar.u6 r42, org.telegram.ui.Wallet.j2[] r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m5.p0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.u6, org.telegram.ui.Wallet.j2[], boolean):android.widget.LinearLayout");
    }

    public static String r0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder s0(int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
        zqVar.recolorDrawable = false;
        zqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence l4 = l0.w(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23767z6, u6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static boolean x0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && x0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && Y0(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A0() {
        k0 k0Var;
        r71 r71Var = this.f36955r0[0];
        if (r71Var != null && r71Var.G && (k0Var = this.D0) != null && !k0Var.h && r71Var.f32151f3.N0() >= r71Var.f32152g3.f29511y.size() - 3) {
            this.D0.h();
        }
    }

    public final CharSequence B0(int i10) {
        org.telegram.ui.Components.s6 s6Var;
        float f7;
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                s6Var = this.f36958t0;
            } else {
                s6Var = this.f36959u0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ea0 ea0Var = new ea0(AndroidUtilities.dp(f7), s6Var);
            ea0Var.a(org.telegram.ui.ActionBar.y6.o1(0.45f, -1), org.telegram.ui.ActionBar.y6.o1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ea0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void D0(TL_wallet.nftItem nftitem) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            bi.h7 h7Var = new bi.h7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            h7Var.f4738f1 = nftitem;
            if (this.f36946j0 != null) {
                h7Var.f4740g1 = new s4(this, tL_starGiftUnique, nftitem);
                h7Var.f4742h1 = new t4(this, nftitem);
            }
            h7Var.J2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(h7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23299a7, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.y6.w0(i15, resourceProvider);
            i4 i4Var = new i4(parentActivity, resourceProvider);
            i4Var.setBackgroundColor(w02);
            i4Var.fixNavigationBar(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
            y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            y9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i16 = org.telegram.ui.ActionBar.y6.f23767z6;
            org.telegram.ui.ActionBar.f7.y(y9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                y9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                y9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(y9Var, gb1.u(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = LocaleController.getString(R.string.WalletCollectible);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.t.r(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, gb1.o(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.f7.V(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            linearLayout.addView(textView2, gb1.o(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, gb1.o(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int dp = AndroidUtilities.dp(16.0f);
                int i19 = org.telegram.ui.ActionBar.y6.f23356d6;
                int w03 = org.telegram.ui.ActionBar.y6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.y6.f23448i6;
                int w04 = org.telegram.ui.ActionBar.y6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w03, w04, w04);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i20);
                linearLayout3.setBackground(j02);
                org.telegram.ui.ActionBar.f7.k(linearLayout3, j02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i11 = R.string.WalletTransfer;
                } else {
                    i11 = R.string.WalletSell;
                }
                String string = LocaleController.getString(i11);
                linearLayout3.setContentDescription(string);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i12 = R.drawable.wallet_transfer;
                } else {
                    i12 = R.drawable.wallet_sell;
                }
                imageView.setImageResource(i12);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.t(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, gb1.r(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(string);
                org.telegram.messenger.t.r(textView3, i21, resourceProvider, 1, 12.0f);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, gb1.o(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i18 == 0) {
                    i13 = 0;
                } else {
                    i13 = 4;
                }
                if (i18 == 0) {
                    i14 = 4;
                } else {
                    i14 = 0;
                }
                linearLayout2.addView(linearLayout3, gb1.q(1.0f, 0, -1, i13, i14, 0));
                i18++;
                i17 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                w01 w01Var = new w01(parentActivity, resourceProvider);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i22 = org.telegram.ui.ActionBar.y6.f23356d6;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i22);
                w01Var.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(w01Var, c02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    w01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(w01Var, gb1.o(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, gb1.r(-1, 48));
            i4Var.setCustomView(scrollView);
            i4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new xd0(25, i4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new s2(parentActivity, 1));
            dVar.setOnClickListener(new s2(i4Var, 2));
            i4Var.show();
            i4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) i4Var, w02, false);
        }
    }

    public final void G0() {
        if (getParentActivity() != null && this.M0 == null && this.L0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.M0 = ai.o0.k(this, this.L0, new ai.d0(14), new v3(this, 3), new o3(this, 8));
            }
        }
    }

    public final void H0(boolean z10) {
        float f7;
        boolean z11;
        this.f36942f0 = z10;
        if (!z10) {
            this.f36940e0 = 0;
        }
        if (this.f36952p0 != null && this.f36944h0 != null) {
            if (!z10) {
                this.f36945i0.b(false);
                this.f36952p0.setPosition(0);
            }
            V0();
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                this.m0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.f36950n0.isAttachedToWindow() && this.f36950n0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f36952p0.o(false);
            }
            if (z11 && this.f36948l0 != f7) {
                this.f36944h0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36948l0, f7);
                this.m0 = ofFloat;
                ofFloat.setDuration(250L);
                this.m0.setInterpolator(ds.h);
                this.m0.addUpdateListener(new u3(this, 0));
                this.m0.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 8));
                this.m0.start();
            } else {
                I0(f7);
                this.f36952p0.o(false);
            }
            if (this.f30419a != null && this.f36951o0 != J0()) {
                T0(false);
            }
        }
    }

    public final void I0(float f7) {
        int i10;
        this.f36948l0 = f7;
        FrameLayout frameLayout = this.f36944h0;
        if (f7 <= 0.0f && this.m0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        this.f36944h0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36944h0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f36944h0.setLayoutParams(layoutParams);
    }

    public final boolean J0() {
        k0 k0Var;
        if (!this.f36942f0 && (k0Var = this.D0) != null && k0Var.f36763c.isEmpty()) {
            k0 k0Var2 = this.D0;
            k0Var2.getClass();
            if (k0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K0() {
        this.F0 = false;
        n8 n8Var = this.f36945i0;
        if (n8Var != null) {
            n8Var.b(false);
        }
        this.f36940e0 = 0;
        fi.h1 h1Var = this.f36952p0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
    }

    public final void L0() {
        this.f36956s = false;
        l71 l71Var = this.f30419a;
        if (l71Var != null) {
            l71Var.D2.f35139b.remove(this.f36961w);
            this.f30419a.removeCallbacks(this.v);
        }
        y4 y4Var = this.e;
        if (y4Var != null) {
            y4Var.setAdditionalTilt(0.0f);
        }
    }

    public final void N0() {
        boolean z10;
        l0 w10 = l0.w(this.currentAccount);
        W0();
        fi.d dVar = this.C0;
        if (w10.E() && w10.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!w10.E()) {
            this.f36958t0.setText(B0(0));
            this.f36959u0.setText(B0(1));
            return;
        }
        long u10 = w10.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            y4 y4Var = this.e;
            y4Var.getClass();
            v5 v5Var = new v5(y4Var, R.drawable.wallet_gram_large);
            this.f36960v0 = v5Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(v5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) w5.e(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f36962w0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f36394a = -9577217;
            this.f36962w0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f36962w0, length, spannableStringBuilder.length(), 33);
        this.f36958t0.setText(spannableStringBuilder);
        CharSequence l4 = l0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f36959u0.setText(B0(1));
        } else {
            this.f36959u0.setText(l4);
        }
        Q0(this.f36964x0);
        d0 d0Var = this.E0;
        if (d0Var != null && !d0Var.h && !d0Var.f36447i && d0Var.f36449k == null) {
            d0Var.e();
        }
        String s10 = w10.s();
        if (!TextUtils.isEmpty(s10)) {
            this.e.setCardNumber(r0(s10.toUpperCase()));
        }
    }

    public final void O0() {
        float[] fArr;
        float[] fArr2;
        float f7;
        Rect rect = this.G;
        if (!rect.isEmpty() && this.f36965y.isAttachedToWindow()) {
            y4 y4Var = this.e;
            bh.p pVar = this.E;
            Matrix matrix = this.H;
            if (y4Var.g(pVar, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i10 = 0;
                while (true) {
                    fArr = this.K;
                    fArr2 = this.L;
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
                bh.p pVar2 = this.E;
                int[] iArr = this.O;
                pVar2.getLocationInWindow(iArr);
                View view = this.f36965y;
                int[] iArr2 = this.N;
                view.getLocationInWindow(iArr2);
                this.e.i(this.f36964x0, this.f36963x.getWidth() / 0.7826087f);
                float f11 = iArr2[0] - iArr[0];
                float A = org.telegram.ui.d3.A(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = i13 * 2;
                    float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.f36964x0);
                    float[] fArr3 = this.M;
                    fArr3[i14] = lerp;
                    int i15 = i14 + 1;
                    fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + A, this.f36964x0);
                }
                Matrix matrix2 = this.J;
                boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
                Matrix matrix3 = this.I;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.E.invalidate();
                }
                y4 y4Var2 = this.e;
                Matrix matrix4 = y4Var2.f37424c;
                Matrix matrix5 = y4Var2.e;
                Matrix matrix6 = y4Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!y4Var2.f37433n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        y4Var2.f37433n = true;
                        y4Var2.N.invalidate();
                    }
                }
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.f36964x0);
                this.f36959u0.setPivotX(0.0f);
                this.f36959u0.setPivotY(0.0f);
                this.f36959u0.setScaleX(lerp2);
                this.f36959u0.setScaleY(lerp2);
            }
        }
    }

    public final void P0() {
        bh.p pVar;
        float clamp;
        boolean z10;
        float f7;
        y4 y4Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f10;
        float height;
        y4 y4Var2;
        if (this.f30419a != null && this.e != null && this.f36957s0 != null && this.f36965y != null && (pVar = this.E) != null && this.actionBar != null) {
            pVar.bringToFront();
            View m10 = this.f30419a.f32151f3.m(this.h);
            if (m10 == null) {
                if (this.f30419a.f32151f3.L0() > this.h) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f30419a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f36966y0 = clamp;
            int i11 = (this.I0 > 0.0f ? 1 : (this.I0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.H0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    clamp = 0.0f;
                } else {
                    clamp = (1.0f - this.H0) * clamp;
                }
            }
            this.f36964x0 = clamp;
            S0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f36964x0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f36964x0);
            this.e.setPivotX(y4Var.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(lerp);
            this.e.setScaleY(lerp);
            this.e.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            y4 y4Var3 = this.e;
            if (!z10 && (m10 == null || clamp >= 1.0f || m10.getBottom() <= this.f30419a.getPaddingTop() || m10.getTop() >= this.f30419a.getHeight() - this.f30419a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            y4Var3.setVisibility(i10);
            int[] iArr = this.Q;
            int[] iArr2 = this.P;
            if (m10 != null) {
                this.f30419a.getLocationInWindow(iArr2);
                this.f36949n.getLocationInWindow(iArr);
                r16 = 1;
                this.e.setTranslationX(((this.f36941f.getWidth() - this.e.getWidth()) / 2.0f) + this.f36941f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.e.setTranslationY(this.f36941f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f7);
            } else {
                r16 = 1;
            }
            if (z10) {
                if (this.I0 == 0.0f) {
                    z12 = r16;
                } else {
                    z12 = false;
                }
                float f11 = this.H0;
                if (z12) {
                    min = 0.3f * f11;
                    f10 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f11) * 0.06f;
                    f10 = 0.84f;
                }
                float f12 = min + f10;
                this.actionBar.getLocationInWindow(iArr2);
                this.f36949n.getLocationInWindow(iArr);
                float dp = AndroidUtilities.dp(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f13 = 1.0f - f11;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.e.getHeight() * 0.35f;
                }
                float f14 = dp - (f13 * height);
                if (z12) {
                    f14 = a1.g.C(0.9f - f12, this.e.getHeight(), 2.0f, f14);
                }
                float width = (this.f36949n.getWidth() - this.e.getWidth()) / 2.0f;
                if (!z12) {
                    f11 = Math.min(1.0f, f11 * 2.0f);
                }
                if (m10 != null) {
                    this.f30419a.getLocationInWindow(iArr2);
                    float width2 = ((this.f36941f.getWidth() - this.e.getWidth()) / 2.0f) + this.f36941f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y3 = this.f36941f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float clamp01 = Utilities.clamp01(1.0f - ((f14 - y3) / (this.e.getHeight() * 0.5f)));
                    if (clamp01 >= 1.0f) {
                        AndroidUtilities.cancelRunOnUIThread(this.K0);
                        ValueAnimator valueAnimator = this.J0;
                        if (valueAnimator != null) {
                            this.J0 = null;
                            valueAnimator.cancel();
                        }
                        this.H0 = 0.0f;
                        this.I0 = 0.0f;
                        P0();
                        return;
                    }
                    width = AndroidUtilities.lerp(width, width2, clamp01);
                    f14 = AndroidUtilities.lerp(f14, y3, clamp01);
                    f12 = AndroidUtilities.lerp(f12, 1.0f, clamp01);
                    f11 = AndroidUtilities.lerp(f11, 1.0f, clamp01);
                }
                this.e.setPivotX(y4Var2.getWidth() * 0.5f);
                this.e.setPivotY(0.0f);
                this.e.setScaleX(f12);
                this.e.setScaleY(f12);
                this.e.setTranslationX(width);
                this.e.setTranslationY(f14);
                this.e.setAlpha(f11);
            }
            if (clamp > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.F != z11 && (linearLayout = this.f36957s0) != null) {
                Rect rect = this.G;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f36957s0.getHeight() != 0) {
                        rect.set(this.f36957s0.getLeft(), this.f36957s0.getTop(), this.f36957s0.getRight(), this.f36957s0.getBottom());
                    }
                }
                this.e.setOnFrontContentPresented(null);
                AndroidUtilities.removeFromParent(this.f36957s0);
                this.F = z11;
                if (z11) {
                    this.E.addView(this.f36957s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f36957s0.layout(0, 0, rect.width(), rect.height());
                    O0();
                } else {
                    y4 y4Var4 = this.e;
                    y4Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = y4Var4.M;
                    AndroidUtilities.removeFromParent(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    u5 u5Var = y4Var4.O;
                    u5Var.setScaleX(1.0f);
                    u5Var.setScaleY(1.0f);
                    y4Var4.E.addView(linearLayout2, y4Var4.P);
                    this.f36957s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.e.getClass();
                    O0();
                }
                this.E.invalidate();
            }
            Q0(clamp);
            if (this.F) {
                O0();
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

    public final void Q0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.G6);
        this.f36958t0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.s6 s6Var = this.f36959u0;
        float[] fArr = this.e.f37421a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3));
        }
        s6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.a.o(themedColor, Math.round(142.8f)), f7));
        v5 v5Var = this.f36960v0;
        if (v5Var != null) {
            v5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.y6.Oh), f7));
        }
        b5 b5Var = this.f36962w0;
        if (b5Var != null) {
            float[] fArr2 = this.e.f37421a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.a.f(fArr2[8], h7.p(fArr2, -9577217, 0), h7.p(fArr2, -9577217, 3));
            }
            b5Var.f36394a = i0.a.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.f36958t0.invalidate();
    }

    public final void R0(float[] fArr) {
        boolean z10;
        float f7;
        int n10;
        if (this.B0 != null && this.C0 != null) {
            float f10 = h7.j(getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7))[0];
            if (f10 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
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
            if (themedColor != this.N0) {
                this.N0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i12 = getThemedColor(org.telegram.ui.ActionBar.y6.Sh);
                }
                fi.d[] dVarArr = {this.B0, this.C0};
                for (int i13 = 0; i13 < 2; i13++) {
                    fi.d dVar = dVarArr[i13];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i12);
                }
            }
        }
    }

    public final void S0() {
        l71 l71Var = this.f30419a;
        if (l71Var != null && this.e != null) {
            float b10 = l71Var.D2.b(1);
            float min = Math.min(10.0f, this.f30419a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.e.setAdditionalTilt(Math.max(0.0f, (this.f36964x0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f36964x0))) * 90.0f) - 10.0f)) + min);
            this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.f36964x0, 0.33000001311302185d)));
        }
    }

    public final void T0(boolean z10) {
        boolean J0 = J0();
        l71 l71Var = this.f30419a;
        r71[] r71VarArr = this.f36955r0;
        if (l71Var != null && this.f36951o0 != J0) {
            this.f36951o0 = J0;
            l71Var.C0();
            for (r71 r71Var : r71VarArr) {
                if (r71Var != null) {
                    r71Var.C0();
                }
            }
            this.f30419a.f32152g3.O(false);
            this.f30419a.f32151f3.h1(0, 0);
            this.f30419a.post(new o3(this, 10));
        }
        if (!J0) {
            for (r71 r71Var2 : r71VarArr) {
                if (r71Var2 != null) {
                    U0(r71Var2, z10);
                }
            }
            bi.r rVar = this.f36950n0;
            if (rVar != null) {
                rVar.post(new o3(this, 5));
                this.f36950n0.post(new o3(this, 6));
            }
        }
    }

    @Override
    public final void V(ArrayList arrayList, j71 j71Var) {
        l0 w10 = l0.w(this.currentAccount);
        W0();
        arrayList.add(t61.m(this.R));
        this.h = arrayList.size();
        v4 v4Var = this.f36941f;
        t61 t61Var = new t61(-4);
        t61Var.f32869c = v4Var;
        t61Var.f32888z = -1;
        t61Var.e = true;
        arrayList.add(t61Var);
        arrayList.add(t61.m(this.f36967z0));
        boolean J0 = J0();
        this.f36951o0 = J0;
        if (J0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = c5.f36428a;
            t61 K = t61.K(c5.class);
            K.f32874k = i10;
            K.f32875l = string;
            K.f32876m = string2;
            arrayList.add(K);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            t61 K2 = t61.K(c5.class);
            K2.f32874k = i12;
            K2.f32875l = string3;
            K2.f32876m = string4;
            arrayList.add(K2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            t61 K3 = t61.K(c5.class);
            K3.f32874k = i13;
            K3.f32875l = string5;
            K3.f32876m = string6;
            arrayList.add(K3);
            arrayList.add(t61.m(this.f36936a0));
        } else if (this.f36950n0 != null) {
            if (this.R0 && !this.S0 && w10.u() > 500000000) {
                arrayList.add(t61.k(this.f36938c0));
            }
            bi.r rVar = this.f36950n0;
            t61 t61Var2 = new t61(-3);
            t61Var2.f32869c = rVar;
            t61Var2.f32888z = 0;
            t61Var2.f32887y = 1;
            arrayList.add(t61Var2);
        }
        z90 z90Var = this.Z;
        if (z90Var != null) {
            this.f36937b0 = false;
            z90Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void V0() {
        n8 n8Var = this.f36945i0;
        if (n8Var != null && this.f36952p0 != null && n8Var.f37038w != 0.0f) {
            n8Var.f37038w = 0.0f;
            n8Var.f37033c.setVisibility(8);
            n8Var.invalidate();
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    public final void W0() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.S == null) {
            return;
        }
        l0 w10 = l0.w(this.currentAccount);
        boolean z13 = false;
        if (this.S.isAttachedToWindow() && this.S.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u4 u4Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = w10.f36812i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(w10.f36813j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        u4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = w10.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (!h0Var.e) {
                long j11 = h0Var.f36620c;
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
            this.W.setText(t0(R.string.WalletOldWalletsBalance, j10));
        }
        this.S.i(this.V, z12, z10);
        long j12 = bi.ca.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Y.setText(t0(R.string.WalletGramEarningsBalance, j12));
        }
        this.S.i(this.X, z13, z10);
    }

    @Override
    public final void X(t61 t61Var, View view) {
        d0 d0Var;
        Object obj = t61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            D0((TL_wallet.nftItem) obj);
        } else if (t61Var.d == -10001 && (d0Var = this.E0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            C0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) t61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        t7 t7Var;
        if ((view instanceof g7) && (t7Var = this.f36946j0) != null) {
            t7Var.S((g7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        t7 t7Var = this.f36946j0;
        if ((t7Var == null || !t7Var.f37308p0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        L0();
        i5 i5Var = this.f36953q0;
        if (i5Var != null) {
            i5Var.b(null);
        }
        this.f36941f = null;
        this.S = null;
        this.R = null;
        this.f36950n0 = null;
        this.f36952p0 = null;
        r71[] r71VarArr = this.f36955r0;
        r71VarArr[0] = null;
        r71VarArr[1] = null;
        d0 d0Var = this.E0;
        if (d0Var != null && !d0Var.f36442a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36942f0 = z10;
        if (!z10) {
            this.f36940e0 = 0;
        } else if (this.F0) {
            this.f36940e0 = 1;
        }
        t7 t7Var = this.f36946j0;
        if (t7Var != null) {
            t7Var.p();
        }
        this.f36946j0 = null;
        View createView = super.createView(context);
        nc0 nc0Var = new nc0(this, context);
        nc0Var.addView(createView, gb1.g(-1.0f, -1));
        this.fragmentView = nc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.f23299a7;
        org.telegram.ui.ActionBar.f7.i(i10, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        org.telegram.ui.ActionBar.w0 a2 = l4.a(2, R.drawable.scan_qr);
        this.L0 = a2;
        a2.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f37128b;

            {
                this.f37128b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f37128b;
                        m5Var.getClass();
                        m5Var.presentFragment(new dg1(6, null));
                        return;
                    case 1:
                        m5.b0(this.f37128b);
                        return;
                    case 2:
                        m5.e0(this.f37128b);
                        return;
                    case 3:
                        this.f37128b.G0();
                        return;
                    default:
                        m5.Z(this.f37128b);
                        return;
                }
            }
        });
        l4.a(1, R.drawable.ic_ab_other).setOnClickListener(new xd0(27, this, context));
        bh.r rVar = new bh.r(this, context, 29);
        this.R = rVar;
        rVar.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        u4 u4Var = new u4(this, context);
        this.S = u4Var;
        u4Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new o3(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.T = q0(this.U, new o3(this, 0));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = q0(textView2, new o3(this, 1));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = q0(textView3, new o3(this, 2));
        this.R.addView(this.S, gb1.g(-2.0f, -1));
        z90 z90Var = new z90(context, null);
        this.Z = z90Var;
        this.f36937b0 = false;
        z90Var.setAlpha(0.0f);
        z90 z90Var2 = this.Z;
        int i11 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.f7.V(z90Var2, i11, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(M0(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.y6.gc, this.resourceProvider, new p3(context, 0)));
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, gb1.h(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        v4 v4Var = new v4(this, context, 0);
        this.f36936a0 = v4Var;
        v4Var.setImportantForAccessibility(2);
        this.f36938c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36939d0 = frameLayout2;
        int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.y6.a0(themedColor, org.telegram.ui.ActionBar.y6.v(themedColor2, getThemedColor(i13)), 16, 16);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i12, i13);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(a02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, a02, N, q5, resourceProvider);
        this.f36938c0.addView(this.f36939d0, gb1.h(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f36939d0.addView(imageView, gb1.h(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.f23598q7, this.resourceProvider);
        textView4.setTextSize(1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f36939d0.addView(textView4, gb1.h(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f36939d0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f37128b;

            {
                this.f37128b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f37128b;
                        m5Var.getClass();
                        m5Var.presentFragment(new dg1(6, null));
                        return;
                    case 1:
                        m5.b0(this.f37128b);
                        return;
                    case 2:
                        m5.e0(this.f37128b);
                        return;
                    case 3:
                        this.f37128b.G0();
                        return;
                    default:
                        m5.Z(this.f37128b);
                        return;
                }
            }
        });
        gb1.c(this.f36939d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f36963x = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f36963x.setClipToPadding(false);
        this.actionBar.addView(this.f36963x, gb1.h(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.f36965y = view;
        this.f36963x.addView(view, gb1.i(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        bh.p pVar = new bh.p(this, context);
        this.E = pVar;
        pVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        y4 y4Var = new y4(this, context);
        this.e = y4Var;
        y4Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) {
            public final m5 f37128b;

            {
                this.f37128b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f37128b;
                        m5Var.getClass();
                        m5Var.presentFragment(new dg1(6, null));
                        return;
                    case 1:
                        m5.b0(this.f37128b);
                        return;
                    case 2:
                        m5.e0(this.f37128b);
                        return;
                    case 3:
                        this.f37128b.G0();
                        return;
                    default:
                        m5.Z(this.f37128b);
                        return;
                }
            }
        });
        this.f30419a.D2.f35139b.add(this.f36961w);
        v4 v4Var2 = new v4(this, context, 1);
        this.f36941f = v4Var2;
        v4Var2.setImportantForAccessibility(2);
        z4 z4Var = new z4(this, context);
        this.f36949n = z4Var;
        z4Var.setClipChildren(false);
        this.f36949n.setClipToPadding(false);
        this.f36949n.addView(this.e, gb1.g(-2.0f, -1));
        nc0Var.addView(this.f36949n, gb1.g(-1.0f, -1));
        this.f30419a.setClipChildren(false);
        this.f30419a.setClipToPadding(false);
        this.f36957s0 = this.e.getBalanceLayout();
        this.f36958t0 = this.e.getBalanceView();
        this.f36959u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.A0 = 0.0f;
        xa1 xa1Var = new xa1(this, context, 20);
        this.f36967z0 = xa1Var;
        xa1Var.setOrientation(0);
        this.f36967z0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.f36967z0.addView(this.B0, gb1.q(1.0f, 0, 48, 0, 4, 0));
        this.B0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f37128b;

            {
                this.f37128b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f37128b;
                        m5Var.getClass();
                        m5Var.presentFragment(new dg1(6, null));
                        return;
                    case 1:
                        m5.b0(this.f37128b);
                        return;
                    case 2:
                        m5.e0(this.f37128b);
                        return;
                    case 3:
                        this.f37128b.G0();
                        return;
                    default:
                        m5.Z(this.f37128b);
                        return;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.C0.setEnabled(l0.w(this.currentAccount).d());
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f37128b;

            {
                this.f37128b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f37128b;
                        m5Var.getClass();
                        m5Var.presentFragment(new dg1(6, null));
                        return;
                    case 1:
                        m5.b0(this.f37128b);
                        return;
                    case 2:
                        m5.e0(this.f37128b);
                        return;
                    case 3:
                        this.f37128b.G0();
                        return;
                    default:
                        m5.Z(this.f37128b);
                        return;
                }
            }
        });
        this.f36967z0.addView(this.C0, gb1.q(1.0f, 0, 48, 4, 0, 0));
        R0(this.e.getStickerStyle());
        this.D0 = l0.w(this.currentAccount).A();
        this.f30419a.setDescendantFocusability(131072);
        t7 t7Var2 = new t7(this, this.e, new m4.c(this, nc0Var, false, 14), null);
        this.f36946j0 = t7Var2;
        nc0Var.addView(t7Var2, gb1.g(-1.0f, -1));
        this.f36947k0 = "";
        bi.r rVar2 = new bi.r(context, 7);
        this.f36950n0 = rVar2;
        rVar2.setOrientation(1);
        org.telegram.ui.ActionBar.f7.i(i10, this.f36950n0, getResourceProvider());
        fi.h1 h1Var = new fi.h1(this, context, this.resourceProvider, 10);
        this.f36952p0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f36952p0.setAdapter(new h4(this, context));
        t91 n10 = this.f36952p0.n(-2, true);
        this.f36943g0 = n10;
        n10.g(i11, org.telegram.ui.ActionBar.y6.G6, i11, i13, i12);
        org.telegram.ui.ActionBar.f7.C(this.f36943g0, org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i12)), org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
        this.f36944h0 = new FrameLayout(context);
        n8 n8Var = new n8(context, this.f36943g0, this.resourceProvider, new v3(this, 0), new v3(this, 1), new v3(this, 2));
        this.f36945i0 = n8Var;
        this.f36944h0.addView(n8Var, gb1.h(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f36952p0.setPosition(this.f36940e0);
        V0();
        this.f36950n0.addView(this.f36944h0, gb1.o(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f36950n0.addView(this.f36952p0, gb1.p(1.0f, -1, 0));
        H0(this.f36942f0);
        d0 d0Var2 = this.E0;
        if (d0Var2 != null) {
            this.f36946j0.Y(d0Var2);
        }
        this.f30419a.j(new ml(this, 19));
        j71 j71Var = this.f30419a.f32152g3;
        j71Var.f29507r = false;
        j71Var.O(false);
        i5 i5Var2 = new i5(this);
        this.f36953q0 = i5Var2;
        i5Var2.b(this.f30419a);
        N0();
        this.D0.h();
        this.actionBar.post(new o3(this, 9));
        this.f30419a.post(new o3(this, 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l71 l71Var;
        j71 j71Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f36958t0 != null) {
                N0();
                Iterator it = this.P0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i10 == NotificationCenter.starBalanceUpdated) {
                W0();
            } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.R0 = true;
                        this.S0 = ((TL_account.Password) obj).has_password;
                        l71 l71Var2 = this.f30419a;
                        if (l71Var2 != null && (j71Var = l71Var2.f32152g3) != null) {
                            j71Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                k0 k0Var = this.D0;
                if (obj2 == k0Var && (l71Var = this.f30419a) != null && l71Var.f32152g3 != null) {
                    if (k0Var.f36762b.isEmpty()) {
                        k0 k0Var2 = this.D0;
                        if (!k0Var2.h) {
                            k0Var2.h();
                        }
                    }
                    T0(true);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void o0(boolean z10) {
        float f7;
        long j10;
        ds dsVar;
        AndroidUtilities.cancelRunOnUIThread(this.K0);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.I0 == f7) {
            return;
        }
        this.I0 = f7;
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        P0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f7);
        this.J0 = ofFloat;
        if (z10) {
            j10 = 260;
        } else {
            j10 = 120;
        }
        ofFloat.setDuration(j10);
        ValueAnimator valueAnimator2 = this.J0;
        if (z10) {
            dsVar = new ds(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            dsVar = new ds(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(dsVar);
        this.J0.addUpdateListener(new u3(this, 1));
        this.J0.addListener(new fc1(this, 7));
        this.J0.start();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            if (z10) {
                o0Var.e();
            }
            return false;
        }
        n8 n8Var = this.f36945i0;
        if (n8Var != null && n8Var.f37039x) {
            if (z10) {
                n8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        i5 i5Var = this.f36953q0;
        if (i5Var != null) {
            i5Var.c();
        }
        l71 l71Var = this.f30419a;
        if (l71Var != null) {
            l71Var.C0();
        }
        r71 u02 = u0();
        if (u02 != null) {
            u02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = ApplicationLoader.applicationContext;
        if (n5.f36992k0.compareAndSet(false, true)) {
            n5.f36993l0.postRunnable(new p3(context, 2));
        }
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        l0 w10 = l0.w(this.currentAccount);
        if (w10.f36818o == null) {
            w10.f36818o = new d0(w10);
        }
        d0 d0Var = w10.f36818o;
        this.E0 = d0Var;
        o3 o3Var = this.G0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(o3Var)) {
            arrayList.add(o3Var);
        }
        wg1 wg1Var = this.T0;
        if (wg1Var != null) {
            wg1Var.run();
        }
        int i10 = w10.D;
        w10.D = i10 + 1;
        HashSet hashSet = w10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            w10.Q();
        }
        this.T0 = new wg1(w10, i10, 1);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.M0);
            this.M0 = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        t7 t7Var = this.f36946j0;
        if (t7Var != null) {
            t7Var.p();
        }
        y4 y4Var = this.e;
        if (y4Var != null) {
            y4Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        d0 d0Var = this.E0;
        if (d0Var != null) {
            d0Var.d.remove(this.G0);
        }
        L0();
        i5 i5Var = this.f36953q0;
        if (i5Var != null) {
            i5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        k0 k0Var = this.D0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        wg1 wg1Var = this.T0;
        if (wg1Var != null) {
            wg1Var.run();
            this.T0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30419a.setPadding(0, 0, 0, i13);
        this.f30419a.setClipToPadding(false);
        z90 z90Var = this.Z;
        if (z90Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z90Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ai.o0 o0Var = this.M0;
        if (o0Var != null) {
            o0Var.g();
            AndroidUtilities.removeFromParent(this.M0);
            this.M0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                G0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new r3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.y6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new o3(this, 9));
        }
        l0.w(this.currentAccount).C();
        if (this.E0 != null && l0.w(this.currentAccount).E()) {
            d0 d0Var = this.E0;
            if (!d0Var.f36448j) {
                d0Var.b();
                d0Var.f(true);
            }
        }
        N0();
        if (this.f30419a != null) {
            T0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f36958t0 != null && this.f36959u0 != null && this.e != null) {
                Q0(this.f36964x0);
            }
            y4 y4Var = this.e;
            if (y4Var != null && this.B0 != null && this.C0 != null) {
                R0(y4Var.getStickerStyle());
            }
            z90 z90Var = this.Z;
            if (z90Var != null) {
                z90Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            u4 u4Var = this.S;
            if (u4Var != null) {
                u4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final FrameLayout q0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        int i10 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(getThemedColor(i10), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, g02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, gb1.h(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23767z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, gb1.i(-2, -2, 21));
        frameLayout.setOnClickListener(new s2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        gb1.c(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, gb1.r(-1, -2));
        return frameLayout;
    }

    public final CharSequence t0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        zq zqVar = new zq(R.drawable.mini_gram_16, 0);
        zqVar.recolorDrawable = false;
        spannableStringBuilder.setSpan(zqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l0.n(j10, false));
        spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.Oh, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final r71 u0() {
        View currentView;
        if (v0()) {
            fi.h1 h1Var = this.f36952p0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof r71) {
                return (r71) currentView;
            }
        }
        return null;
    }

    public final boolean v0() {
        bi.r rVar;
        if (!this.f36951o0 && (rVar = this.f36950n0) != null && rVar.isAttachedToWindow()) {
            ViewParent parent = this.f36950n0.getParent();
            l71 l71Var = this.f30419a;
            if (parent == l71Var.f32151f3.m(l71Var.f32152g3.f29511y.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean w0() {
        View m10;
        l71 l71Var = this.f30419a;
        if (l71Var != null && (m10 = l71Var.f32151f3.m(this.h)) != null && this.f36966y0 < 0.5f && m10.getBottom() > this.f30419a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void z0() {
        d0 d0Var;
        r71 r71Var = this.f36955r0[1];
        if (this.f36940e0 == 1 && r71Var != null && r71Var.G && (d0Var = this.E0) != null && !d0Var.f36447i && !d0Var.f36446g && d0Var.f36449k == null && r71Var.f32151f3.N0() >= r71Var.f32152g3.f29511y.size() - 3) {
            this.E0.e();
        }
    }
}
