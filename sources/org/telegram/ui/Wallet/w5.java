package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
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
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.e51;
import org.telegram.ui.hb0;
import org.telegram.ui.i81;
import org.telegram.ui.ka0;
import org.telegram.ui.m90;
import org.telegram.ui.ma1;
import org.telegram.ui.n61;
import org.telegram.ui.ra1;
import org.telegram.ui.s51;
import org.telegram.ui.xp0;
public final class w5 extends h41 implements cs {
    public static Typeface V0;
    public s51 A0;
    public float B0;
    public gi.d C0;
    public gi.d D0;
    public View E;
    public j0 E0;
    public n61 F;
    public c0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public org.telegram.ui.ActionBar.q0 M0;
    public bi.a0 N0;
    public int O0;
    public SpannableString R0;
    public kw0 S;
    public boolean S0;
    public g5 T;
    public boolean T0;
    public FrameLayout U;
    public org.telegram.ui.Components.o2 U0;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public s70 f43319a0;
    public h5 f43320b0;
    public boolean f43321c0;
    public FrameLayout f43322d0;
    public k5 f43323e;
    public FrameLayout f43324e0;
    public h5 f43325f;
    public boolean f43327g0;
    public int h;
    public m61 f43328h0;
    public FrameLayout f43329i0;
    public s8 f43330j0;
    public b8 f43331k0;
    public float m0;
    public l5 f43333n;
    public ValueAnimator f43334n0;
    public ci.q f43335o0;
    public boolean f43336p0;
    public gi.g1 f43337q0;
    public int f43338r;
    public s5 f43339r0;
    public boolean f43340s;
    public LinearLayout f43342t0;
    public org.telegram.ui.Components.h6 f43343u0;
    public org.telegram.ui.Components.h6 f43344v0;
    public e6 f43346w0;
    public n5 f43348x0;
    public FrameLayout f43349y;
    public float f43350y0;
    public float f43351z0;
    public final lt f43345w = new lt(this, 19);
    public final h4 f43347x = new ms() {
        @Override
        public final void a(int i3, boolean z10) {
            ai.h4 h4Var;
            w5 w5Var = w5.this;
            lt ltVar = w5Var.f43345w;
            if ((i3 != 1 && i3 != 3) || (h4Var = w5Var.f34298a) == null) {
                return;
            }
            w5Var.f43340s = z10;
            h4Var.removeCallbacks(ltVar);
            ltVar.run();
        }
    };
    public final Rect H = new Rect();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final Matrix K = new Matrix();
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final float[] N = new float[8];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public int f43326f0 = 0;
    public String f43332l0 = "";
    public final l41[] f43341s0 = new l41[2];
    public final d4 H0 = new d4(this, 3);
    public final d4 L0 = new d4(this, 4);
    public final CharSequence[] P0 = new CharSequence[2];
    public final HashSet Q0 = new HashSet();

    public static boolean B0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean C0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && B0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && c1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void G0(Context context, int i3, TL_wallet.walletTransaction wallettransaction, p10 p10Var, n10 n10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        y2[] y2VarArr;
        View[] viewArr;
        n10 n10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ci.l6 l6Var = new ci.l6(context, i3, 0L, e6Var, null);
                l6Var.f5449b3 = wallettransaction;
                l6Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                l6Var.show();
                return;
            }
        }
        boolean z10 = true;
        y2[] y2VarArr2 = new y2[1];
        View[] viewArr2 = new View[1];
        j0 B = k0.x(i3).B();
        ArrayList arrayList = new ArrayList(B.f42681c);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == wallettransaction || k0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (p10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232726).getPadding(rect);
            viewArr = viewArr2;
            ?? w4Var = new w4(context, e6Var, arrayList, B, i3, rect, viewArr);
            w4Var.setPosition(i10);
            y2VarArr = y2VarArr2;
            w4Var.setAdapter(new x4(arrayList, context, e6Var, rect, i3, y2VarArr2));
            n10Var2 = n10Var;
            t02 = w4Var;
        } else {
            y2VarArr = y2VarArr2;
            viewArr = viewArr2;
            n10Var2 = n10Var;
            t02 = t0(context, i3, wallettransaction, p10Var, n10Var, bArr, m0Var, e6Var, y2VarArr, false);
        }
        y2[] y2VarArr3 = y2VarArr;
        y4 y4Var = new y4(context, t02, e6Var, t02, viewArr, context);
        y2VarArr3[0] = y4Var;
        if ((t02 instanceof org.telegram.ui.Components.n61) && n10Var2 != null) {
            y4Var.n(new ma1(14, n10Var2, wallettransaction));
        }
        y2 y2Var = y2VarArr3[0];
        if (p10Var == null) {
            z10 = false;
        }
        y2Var.A0(z10);
        y2 y2Var2 = y2VarArr3[0];
        y2Var2.U0 = false;
        y2Var2.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, mf.c(-2.0f, -1));
        linearLayout.addView(new u6(160, context, false), mf.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131743107, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(bd.M0(2131743106, null));
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.r6.V(f10, i10, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, mf.t(-1, -2, 1, 0, 0, 0, 24));
        p5 p5Var = new p5(context, e6Var);
        p5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var.a(2131232827, bd.M0(2131743029, null), bd.M0(2131743028, null));
        linearLayout.addView(p5Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        p5 p5Var2 = new p5(context, e6Var);
        p5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var2.a(2131232825, bd.M0(2131743078, null), bd.M0(2131743077, null));
        linearLayout.addView(p5Var2, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        p5 p5Var3 = new p5(context, e6Var);
        p5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        p5Var3.a(2131232829, bd.M0(2131743192, null), bd.M0(2131743191, null));
        linearLayout.addView(p5Var3, mf.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131743111, null));
        linearLayout.addView(h, mf.t(-1, 48, 1, 0, 0, 0, 0));
        pf.b(h, 0.02f, 1.1f);
        s70 s70Var = new s70(context, null);
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        s70Var.setTextSize(1, 13.0f);
        s70Var.setGravity(17);
        s70Var.setText(Q0(bd.M0(2131743016, null), org.telegram.ui.ActionBar.k6.Uc, e6Var, new e4(context, 1)));
        linearLayout.addView(s70Var, mf.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.O = frameLayout;
        org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
        t2VarArr[0].u0(true);
        t2VarArr[0].N();
        h.setOnClickListener(new l4(t2VarArr, 1));
        t2VarArr[0].show();
    }

    public static void J0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        k0 x10 = k0.x(i3);
        if (x10.G()) {
            String t10 = x10.t();
            if (TextUtils.isEmpty(t10)) {
                return;
            }
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, context, e6Var, false);
            t2Var.v0(-12207881);
            t2Var.O(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new v5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, mf.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22603n));
            u5 u5Var = new u5(context, t10);
            linearLayout.addView(u5Var, mf.r(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(bd.M0(2131743051, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
            linearLayout.addView(textView, mf.t(-1, -2, 1, 24, 0, 24, 20));
            gi.d dVar = new gi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(2131232805, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131743190, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, mf.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131231269);
            imageView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            imageView.setContentDescription(bd.M0(2131752041, null));
            pf.a(imageView);
            frameLayout.addView(imageView, mf.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            t2Var.O = frameLayout;
            t2Var.f28622x = true;
            t2Var.f28619v0 = false;
            t2Var.f28621w0 = false;
            t2Var.O(-12207881);
            imageView.setOnClickListener(new c4(t2Var, 0));
            u5Var.f43242e = new p0(t10, 1);
            t2Var.show();
            t2Var.E0(-12207881);
            org.telegram.messenger.g0.u3(t2Var, -12207881, false, null);
            org.telegram.messenger.g0.n3(t2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && t2Var.getWindow() != null) {
                t2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ei.t5(dVar, i3, t2Var, e6Var, 7));
        }
    }

    public static SpannableStringBuilder Q0(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new ii.k3(i3, e6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Y0(l41 l41Var, boolean z10) {
        boolean canScrollVertically = l41Var.canScrollVertically(-1);
        l41Var.f35594g3.O(z10);
        l41Var.a0();
        if (!canScrollVertically) {
            l41Var.f35593f3.h1(0, 0);
        }
    }

    public static Uri b1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (B0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static String c1(Uri uri) {
        if (B0(uri.getHost())) {
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

    public static void d0(w5 w5Var) {
        k0 x10 = k0.x(w5Var.currentAccount);
        gi.d dVar = w5Var.D0;
        if (dVar.R) {
            return;
        }
        dVar.setLoading(true);
        x10.m0(new g2.p0((Object) x10, (Object) new e51(11, w5Var, x10), false, false, 4));
    }

    public static void e0(w5 w5Var) {
        sf.c.t(w5Var.getParentActivity(), k0.x(w5Var.currentAccount).f42725j);
    }

    public static void f0(w5 w5Var) {
        J0(w5Var.currentAccount, w5Var.getParentActivity(), w5Var.getResourceProvider());
    }

    public static void g0(w5 w5Var, String str, k0 k0Var, f60 f60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, w5Var.getParentActivity(), w5Var.resourceProvider, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        y0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = y0Var.f28813b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        y0Var.setChecked(equals);
        y0Var.setOnClickListener(new h1(k0Var, currencyrate, f60Var, 2));
        linearLayout.addView(y0Var, mf.o(200, -2));
    }

    public static void h0(w5 w5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (w5Var.F != null && (kVar = w5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) w5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (w5Var.F.getParent() != w5Var.actionBar) {
                org.telegram.messenger.g0.E2(w5Var.F);
                w5Var.actionBar.addView(w5Var.F, mf.c(-1.0f, -1));
            }
            w5Var.F.bringToFront();
            w5Var.actionBar.bringToFront();
            w5Var.F.post(new d4(w5Var, 10));
        }
    }

    public static void i0(w5 w5Var) {
        J0(w5Var.currentAccount, w5Var.getParentActivity(), w5Var.getResourceProvider());
    }

    public static void j0(w5 w5Var, String str) {
        Uri b12 = b1(str);
        String c12 = c1(b12);
        if (c12 != null) {
            int i3 = w5Var.currentAccount;
            hp.s1(i3).d2().a(c12, null, new gi.s3(new k4(w5Var, 4), i3));
        } else if ((w5Var.getParentActivity() instanceof LaunchActivity) && new m90((LaunchActivity) w5Var.getParentActivity(), w5Var.currentAccount, null, false).g(b12)) {
        } else {
            org.telegram.messenger.g0.h3(new d4(w5Var, 11));
        }
    }

    public static void k0(w5 w5Var, LinearLayout linearLayout, k0 k0Var, f60 f60Var) {
        TL_wallet.currencyRate currencyrate;
        w5 w5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g7 = k0Var2.h.g();
        TL_wallet.currencyRates f10 = k0Var2.h.f();
        if (f10 == null) {
            for (int i3 = 0; i3 < 3; i3++) {
                iz izVar = new iz(w5Var.getParentActivity(), w5Var.getResourceProvider());
                izVar.setIsSingleCell(true);
                izVar.setViewType(31);
                linearLayout2.addView(izVar, mf.o(200, -2));
            }
            return;
        }
        f fVar = k0Var2.h;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f11 = fVar.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f11 != null && (arrayList = f11.rates) != null) {
            int size = arrayList.size();
            currencyrate = null;
            int i10 = 0;
            while (i10 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i10);
                i10++;
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
        if (f11 != null && f11.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(fVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25457b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    f.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            f.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            f.a(linkedHashSet, ((org.telegram.messenger.n0) hp.s1(fVar.f42502a).f23167x7.O.f13798b).f24297c);
            f.c(linkedHashSet, bd.E0().f21812y);
            f.c(linkedHashSet, bd.E0().f21813z);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f11.rates;
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i11);
                            i11++;
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
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i12);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                g0(w5Var, g7, k0Var2, f60Var, linearLayout2, currencyrate7);
            }
            i12++;
            k0Var2 = k0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            w5Var2 = w5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.c1(w5Var.getParentActivity(), w5Var2.resourceProvider), mf.o(-1, 8));
        } else {
            w5Var2 = w5Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(w5Var2, g7, k0Var, f60Var, linearLayout2, currencyrate8);
            }
            i13++;
            w5Var2 = w5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void l0(final w5 w5Var, Context context, View view) {
        boolean z10;
        k0 x10 = k0.x(w5Var.currentAccount);
        final f60 I = f60.I(w5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.f33747s = 0;
        I.V(5);
        f60 J = I.J();
        J.c(2131231240, bd.M0(2131743202, null), new xp0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        e7 e7Var = new e7(w5Var, linearLayout, x10, I, 11);
        J.r(scrollView, mf.o(-1, 350));
        I.c(2131232813, bd.M0(2131743158, null), new g(e7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.y0 y9 = I.y();
        f fVar = x10.h;
        String i3 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i3);
        String str = i3;
        if (isEmpty) {
            y9.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131748787, null));
            spannableStringBuilder.setSpan(new x70(org.telegram.messenger.g0.L(75.0f), y9.f28813b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y9.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e7 e7Var2 = new e7(x10, new boolean[]{z10}, y9, e7Var, 12);
        w5Var.Q0.add(e7Var2);
        e7Var.run();
        I.c(2131232831, bd.M0(2131747665, null), new Runnable(w5Var) {
            public final w5 f43006b;

            {
                this.f43006b = w5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        w5 w5Var2 = this.f43006b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        w5 w5Var3 = this.f43006b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        w5 w5Var4 = this.f43006b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new h41());
                        return;
                    default:
                        I.u();
                        w5 w5Var5 = this.f43006b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(2131232824, bd.M0(2131743090, null), new Runnable(w5Var) {
            public final w5 f43006b;

            {
                this.f43006b = w5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        w5 w5Var2 = this.f43006b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        w5 w5Var3 = this.f43006b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        w5 w5Var4 = this.f43006b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new h41());
                        return;
                    default:
                        I.u();
                        w5 w5Var5 = this.f43006b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(2131232804, bd.M0(2131743166, null), new Runnable(w5Var) {
            public final w5 f43006b;

            {
                this.f43006b = w5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        w5 w5Var2 = this.f43006b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        w5 w5Var3 = this.f43006b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        w5 w5Var4 = this.f43006b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new h41());
                        return;
                    default:
                        I.u();
                        w5 w5Var5 = this.f43006b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ x10.f42723g.d.isEmpty());
        I.k();
        I.c(2131232817, bd.M0(2131742970, null), new Runnable(w5Var) {
            public final w5 f43006b;

            {
                this.f43006b = w5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        w5 w5Var2 = this.f43006b;
                        w5Var2.getClass();
                        I.u();
                        w5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        w5 w5Var3 = this.f43006b;
                        w5Var3.getClass();
                        I.u();
                        w5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        w5 w5Var4 = this.f43006b;
                        w5Var4.getClass();
                        I.u();
                        w5Var4.presentFragment(new h41());
                        return;
                    default:
                        I.u();
                        w5 w5Var5 = this.f43006b;
                        w5.I0(w5Var5.getParentActivity(), w5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f33742p = new ma1(16, w5Var, e7Var2);
        I.Z();
    }

    public static void m0(w5 w5Var, long j10) {
        d4 d4Var = w5Var.L0;
        if (w5Var.f34298a != null) {
            s8 s8Var = w5Var.f43330j0;
            if (s8Var != null) {
                s8Var.a();
            }
            if (w5Var.J0 <= 0.0f && w5Var.A0()) {
                int top = w5Var.f34298a.f35593f3.m(w5Var.h).getTop() - w5Var.f34298a.getPaddingTop();
                w5Var.f34298a.C0();
                if (top < 0) {
                    w5Var.f34298a.w0(0, top, xq.h);
                    return;
                }
                return;
            }
            w5Var.f34298a.C0();
            w5Var.s0(true);
            org.telegram.messenger.g0.r(d4Var);
            if (j10 > 0) {
                org.telegram.messenger.g0.i3(d4Var, j10 + 260);
            }
        }
    }

    public static Typeface r0(Context context) {
        if (V0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                V0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                V0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return V0;
    }

    public static android.widget.LinearLayout t0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.p10 r46, org.telegram.messenger.n10 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.e6 r50, org.telegram.ui.Wallet.y2[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.w5.t0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.p10, org.telegram.messenger.n10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.e6, org.telegram.ui.Wallet.y2[], boolean):android.widget.LinearLayout");
    }

    public static String v0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 > 0 && i3 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i3));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder w0(int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wp wpVar = new wp(2131232816, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence m10 = k0.x(i3).m(j10, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.f28290z6, e6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        ai.h4 h4Var = this.f34298a;
        if (h4Var != null && (m10 = h4Var.f35593f3.m(this.h)) != null && this.f43351z0 < 0.5f && m10.getBottom() > this.f34298a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void D0() {
        c0 c0Var;
        l41 l41Var = this.f43341s0[1];
        if (this.f43326f0 == 1 && l41Var != null && l41Var.H && (c0Var = this.F0) != null && !c0Var.f42366i && !c0Var.f42365g && c0Var.f42368k == null && l41Var.f35593f3.N0() >= l41Var.f35594g3.E.size() - 3) {
            this.F0.e();
        }
    }

    public final void E0() {
        j0 j0Var;
        l41 l41Var = this.f43341s0[0];
        if (l41Var != null && l41Var.H && (j0Var = this.E0) != null && !j0Var.h && l41Var.f35593f3.N0() >= l41Var.f35594g3.E.size() - 3) {
            this.E0.h();
        }
    }

    public final CharSequence F0(int i3) {
        org.telegram.ui.Components.h6 h6Var;
        float f10;
        CharSequence[] charSequenceArr = this.P0;
        if (charSequenceArr[i3] == null) {
            charSequenceArr[i3] = new SpannableString("l");
            if (i3 == 0) {
                h6Var = this.f43343u0;
            } else {
                h6Var = this.f43344v0;
            }
            if (i3 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            x70 x70Var = new x70(org.telegram.messenger.g0.L(f10), h6Var);
            x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.45f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i3];
            ((SpannableString) charSequence).setSpan(x70Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i3];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        String str;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        TL_stars.StarGift starGift = nftitem.gift;
        String str2 = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ci.l6 l6Var = new ci.l6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            l6Var.Y2 = nftitem;
            if (this.f43331k0 != null) {
                l6Var.Z2 = new e5(this, tL_starGiftUnique, nftitem);
                l6Var.f5447a3 = new f5(this, nftitem);
            }
            l6Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(l6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.k6.f27824a7;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.k6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) parentActivity, resourceProvider, false);
            t2Var.f28587b0 = i14;
            t2Var.v0(w02);
            t2Var.O(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            k9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232833).mutate();
            int i16 = org.telegram.ui.ActionBar.k6.f28290z6;
            org.telegram.ui.ActionBar.r6.y(k9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            ac c2 = c.c(nftitem, false);
            if (c2 != null) {
                k9Var.j(c2, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(k9Var, mf.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = bd.M0(2131743186, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.k5.n(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, mf.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.r6.V(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView2.setVisibility(i3);
            linearLayout.addView(textView2, mf.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, mf.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i19 = org.telegram.ui.ActionBar.k6.f27878d6;
                int w03 = org.telegram.ui.ActionBar.k6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.k6.f27972i6;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.r6.k(linearLayout3, k02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742991;
                } else {
                    i10 = 2131743033;
                }
                String M0 = bd.M0(i10, str2);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i11 = 2131232844;
                } else {
                    i11 = 2131232837;
                }
                imageView.setImageResource(i11);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.t(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, mf.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.n(textView3, i21, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i18 == 0) {
                    i12 = 0;
                } else {
                    i12 = 4;
                }
                if (i18 == 0) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
                linearLayout2.addView(linearLayout3, mf.m(1.0f, 0, -1, i12, i13, 0));
                i18++;
                f10 = f11;
                i17 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                rx0 rx0Var = new rx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i22 = org.telegram.ui.ActionBar.k6.f27878d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i22);
                rx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(rx0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    rx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(rx0Var, mf.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            gi.d dVar = new gi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(bd.M0(2131743073, null));
            linearLayout.addView(dVar, mf.o(-1, 48));
            t2Var.O = scrollView;
            t2Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new hb0(25, t2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new h3(parentActivity, 1));
            dVar.setOnClickListener(new h3(t2Var, 2));
            t2Var.show();
            t2Var.O(w02);
            org.telegram.messenger.g0.u3(t2Var, w02, false, null);
        }
    }

    public final void K0() {
        if (getParentActivity() != null && this.N0 == null && this.M0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.N0 = bi.a0.k(this, this.M0, new bi.x(12), new k4(this, 3), new d4(this, 8));
            }
        }
    }

    public final void L0(boolean z10) {
        float f10;
        boolean z11;
        this.f43327g0 = z10;
        if (!z10) {
            this.f43326f0 = 0;
        }
        if (this.f43337q0 != null && this.f43329i0 != null) {
            if (!z10) {
                this.f43330j0.b(false);
                this.f43337q0.setPosition(0);
            }
            Z0();
            ValueAnimator valueAnimator = this.f43334n0;
            if (valueAnimator != null) {
                this.f43334n0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.f43335o0.isAttachedToWindow() && this.f43335o0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f43337q0.k(false);
            }
            if (z11 && this.m0 != f10) {
                this.f43329i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
                this.f43334n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f43334n0.setInterpolator(xq.h);
                this.f43334n0.addUpdateListener(new j4(this, 0));
                this.f43334n0.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 7));
                this.f43334n0.start();
            } else {
                M0(f10);
                this.f43337q0.k(false);
            }
            if (this.f34298a != null && this.f43336p0 != N0()) {
                X0(false);
            }
        }
    }

    public final void M0(float f10) {
        int i3;
        this.m0 = f10;
        FrameLayout frameLayout = this.f43329i0;
        if (f10 <= 0.0f && this.f43334n0 == null) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
        this.f43329i0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43329i0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.f43329i0.setLayoutParams(layoutParams);
    }

    public final boolean N0() {
        j0 j0Var;
        if (!this.f43327g0 && (j0Var = this.E0) != null && j0Var.f42681c.isEmpty()) {
            j0 j0Var2 = this.E0;
            j0Var2.getClass();
            if (j0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0() {
        this.G0 = false;
        s8 s8Var = this.f43330j0;
        if (s8Var != null) {
            s8Var.b(false);
        }
        this.f43326f0 = 0;
        gi.g1 g1Var = this.f43337q0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void P0() {
        this.f43340s = false;
        ai.h4 h4Var = this.f34298a;
        if (h4Var != null) {
            h4Var.E2.f36933b.remove(this.f43347x);
            this.f34298a.removeCallbacks(this.f43345w);
        }
        k5 k5Var = this.f43323e;
        if (k5Var != null) {
            k5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void R0() {
        boolean z10;
        k0 x10 = k0.x(this.currentAccount);
        a1();
        gi.d dVar = this.D0;
        if (x10.G() && x10.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!x10.G()) {
            this.f43343u0.setText(F0(0));
            this.f43344v0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.R0 == null) {
            this.R0 = new SpannableString("G");
            k5 k5Var = this.f43323e;
            k5Var.getClass();
            e6 e6Var = new e6(k5Var);
            this.f43346w0 = e6Var;
            SpannableString spannableString = this.R0;
            spannableString.setSpan(e6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.R0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) f6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        if (this.f43348x0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f42933a = -9577217;
            this.f43348x0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f43348x0, length, spannableStringBuilder.length(), 33);
        this.f43343u0.setText(spannableStringBuilder);
        CharSequence m10 = k0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.f43344v0.setText(F0(1));
        } else {
            this.f43344v0.setText(m10);
        }
        U0(this.f43350y0);
        c0 c0Var = this.F0;
        if (c0Var != null && !c0Var.h && !c0Var.f42366i && c0Var.f42368k == null) {
            c0Var.e();
        }
        String t10 = x10.t();
        if (!TextUtils.isEmpty(t10)) {
            this.f43323e.setCardNumber(v0(t10.toUpperCase()));
        }
    }

    public final void S0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            k5 k5Var = this.f43323e;
            n61 n61Var = this.F;
            Matrix matrix = this.I;
            if (k5Var.g(n61Var, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i3 = 0;
                while (true) {
                    fArr = this.L;
                    fArr2 = this.M;
                    float f11 = 0.0f;
                    if (i3 >= 4) {
                        break;
                    }
                    if (i3 != 1 && i3 != 2) {
                        f10 = 0.0f;
                    } else {
                        f10 = width;
                    }
                    if (i3 >= 2) {
                        f11 = height;
                    }
                    int i10 = i3 * 2;
                    fArr[i10] = f10;
                    int i11 = i10 + 1;
                    fArr[i11] = f11;
                    fArr2[i10] = rect.left + f10;
                    fArr2[i11] = rect.top + f11;
                    i3++;
                }
                matrix.mapPoints(fArr2);
                n61 n61Var2 = this.F;
                int[] iArr = this.P;
                n61Var2.getLocationInWindow(iArr);
                View view = this.E;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.f43323e.i(this.f43350y0, this.f43349y.getWidth() / 0.7826087f);
                float f12 = iArr2[0] - iArr[0];
                float A = org.telegram.ui.Cells.f1.A(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i12 = 0; i12 < 4; i12++) {
                    int i13 = i12 * 2;
                    float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.f43350y0);
                    float[] fArr3 = this.N;
                    fArr3[i13] = T1;
                    int i14 = i13 + 1;
                    fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + A, this.f43350y0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.F.invalidate();
                }
                k5 k5Var2 = this.f43323e;
                Matrix matrix4 = k5Var2.f42526c;
                Matrix matrix5 = k5Var2.f42529e;
                Matrix matrix6 = k5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!k5Var2.f42537n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        k5Var2.f42537n = true;
                        k5Var2.O.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.f43350y0);
                this.f43344v0.setPivotX(0.0f);
                this.f43344v0.setPivotY(0.0f);
                this.f43344v0.setScaleX(T12);
                this.f43344v0.setScaleY(T12);
            }
        }
    }

    public final void T0() {
        n61 n61Var;
        float i3;
        boolean z10;
        float f10;
        k5 k5Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f11;
        float height;
        k5 k5Var2;
        if (this.f34298a != null && this.f43323e != null && this.f43342t0 != null && this.E != null && (n61Var = this.F) != null && this.actionBar != null) {
            n61Var.bringToFront();
            View m10 = this.f34298a.f35593f3.m(this.h);
            if (m10 == null) {
                if (this.f34298a.f35593f3.L0() > this.h) {
                    i3 = 1.0f;
                } else {
                    i3 = 0.0f;
                }
            } else {
                i3 = Utilities.i((this.f34298a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f43351z0 = i3;
            int i11 = (this.J0 > 0.0f ? 1 : (this.J0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.I0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    i3 = 0.0f;
                } else {
                    i3 = (1.0f - this.I0) * i3;
                }
            }
            this.f43350y0 = i3;
            W0();
            if (m10 != null) {
                f10 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.f43350y0;
            } else {
                f10 = 0.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.f43350y0);
            this.f43323e.setPivotX(k5Var.getWidth() * 0.5f);
            this.f43323e.setPivotY(0.0f);
            this.f43323e.setScaleX(T1);
            this.f43323e.setScaleY(T1);
            this.f43323e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i3, 0.75f, 1.0f)));
            k5 k5Var3 = this.f43323e;
            if (!z10 && (m10 == null || i3 >= 1.0f || m10.getBottom() <= this.f34298a.getPaddingTop() || m10.getTop() >= this.f34298a.getHeight() - this.f34298a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            k5Var3.setVisibility(i10);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m10 != null) {
                this.f34298a.getLocationInWindow(iArr2);
                this.f43333n.getLocationInWindow(iArr);
                r16 = 1;
                this.f43323e.setTranslationX(((this.f43325f.getWidth() - this.f43323e.getWidth()) / 2.0f) + this.f43325f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f43323e.setTranslationY(this.f43325f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
            } else {
                r16 = 1;
            }
            if (z10) {
                if (this.J0 == 0.0f) {
                    z12 = r16;
                } else {
                    z12 = false;
                }
                float f12 = this.I0;
                if (z12) {
                    min = 0.3f * f12;
                    f11 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                    f11 = 0.84f;
                }
                float f13 = min + f11;
                this.actionBar.getLocationInWindow(iArr2);
                this.f43333n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.f43323e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z12) {
                    f15 = a1.g.e(0.9f - f13, this.f43323e.getHeight(), 2.0f, f15);
                }
                float width = (this.f43333n.getWidth() - this.f43323e.getWidth()) / 2.0f;
                if (!z12) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f34298a.getLocationInWindow(iArr2);
                    float width2 = ((this.f43325f.getWidth() - this.f43323e.getWidth()) / 2.0f) + this.f43325f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y9 = this.f43325f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y9) / (this.f43323e.getHeight() * 0.5f)));
                    if (l10 >= 1.0f) {
                        org.telegram.messenger.g0.r(this.L0);
                        ValueAnimator valueAnimator = this.K0;
                        if (valueAnimator != null) {
                            this.K0 = null;
                            valueAnimator.cancel();
                        }
                        this.I0 = 0.0f;
                        this.J0 = 0.0f;
                        T0();
                        return;
                    }
                    width = org.telegram.messenger.g0.T1(width, width2, l10);
                    f15 = org.telegram.messenger.g0.T1(f15, y9, l10);
                    f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                    f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
                }
                this.f43323e.setPivotX(k5Var2.getWidth() * 0.5f);
                this.f43323e.setPivotY(0.0f);
                this.f43323e.setScaleX(f13);
                this.f43323e.setScaleY(f13);
                this.f43323e.setTranslationX(width);
                this.f43323e.setTranslationY(f15);
                this.f43323e.setAlpha(f12);
            }
            if (i3 > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.G != z11 && (linearLayout = this.f43342t0) != null) {
                Rect rect = this.H;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f43342t0.getHeight() != 0) {
                        rect.set(this.f43342t0.getLeft(), this.f43342t0.getTop(), this.f43342t0.getRight(), this.f43342t0.getBottom());
                    }
                }
                this.f43323e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f43342t0);
                this.G = z11;
                if (z11) {
                    this.F.addView(this.f43342t0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f43342t0.layout(0, 0, rect.width(), rect.height());
                    S0();
                } else {
                    k5 k5Var4 = this.f43323e;
                    k5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = k5Var4.N;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    d6 d6Var = k5Var4.P;
                    d6Var.setScaleX(1.0f);
                    d6Var.setScaleY(1.0f);
                    k5Var4.F.addView(linearLayout2, k5Var4.Q);
                    this.f43342t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f43323e.getClass();
                    S0();
                }
                this.F.invalidate();
            }
            U0(i3);
            if (this.G) {
                S0();
            }
            float f16 = 1.0f - i3;
            float f17 = (1.0f - f16) * (-org.telegram.messenger.g0.L(8.0f));
            if (this.actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setAlpha(f16);
                this.actionBar.getTitleTextView().setTranslationY(f17);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setAlpha(f16);
                this.actionBar.getTitleTextView2().setTranslationY(f17);
            }
        }
    }

    public final void U0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        this.f43343u0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.h6 h6Var = this.f43344v0;
        float[] fArr = this.f43323e.f42525b0;
        int i3 = -7868417;
        if (fArr != null) {
            i3 = i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr));
        }
        h6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i3, i0.a.o(themedColor, Math.round(142.8f))));
        e6 e6Var = this.f43346w0;
        if (e6Var != null) {
            e6Var.f40049y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
        }
        n5 n5Var = this.f43348x0;
        if (n5Var != null) {
            float[] fArr2 = this.f43323e.f42525b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], p7.p(-9577217, 0, fArr2), p7.p(-9577217, 3, fArr2));
            }
            n5Var.f42933a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f43343u0.invalidate();
    }

    public final void V0(float[] fArr) {
        boolean z10;
        float f10;
        int n4;
        if (this.C0 != null && this.D0 != null) {
            float f11 = p7.j(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7))[0];
            if (f11 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i3 = 0; i3 < 2; i3++) {
                    int i10 = i3 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n4 = themedColor;
                    } else {
                        n4 = p7.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
                    }
                    iArr[i3] = n4;
                }
                themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z10) {
                f12 = f11 + 0.25f;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = f11 - 0.2f;
            }
            float[] j10 = p7.j(themedColor);
            float f14 = j10[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (p7.l(Math.max(f12, Math.min(f10, f14)), j10[1], j10[2]) & 16777215);
            }
            if (themedColor != this.O0) {
                this.O0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
                }
                gi.d[] dVarArr = {this.C0, this.D0};
                for (int i12 = 0; i12 < 2; i12++) {
                    gi.d dVar = dVarArr[i12];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i11);
                }
            }
        }
    }

    public final void W0() {
        ai.h4 h4Var = this.f34298a;
        if (h4Var != null && this.f43323e != null) {
            float b10 = h4Var.E2.b(1);
            float min = Math.min(10.0f, this.f34298a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f43323e.setAdditionalTilt(Math.max(0.0f, (this.f43350y0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.f43350y0))) * 90.0f) - 10.0f)) + min);
            this.f43323e.setUseGyroscope(1.0f - ((float) Math.pow(this.f43350y0, 0.33000001311302185d)));
        }
    }

    public final void X0(boolean z10) {
        boolean N0 = N0();
        ai.h4 h4Var = this.f34298a;
        l41[] l41VarArr = this.f43341s0;
        if (h4Var != null && this.f43336p0 != N0) {
            this.f43336p0 = N0;
            h4Var.C0();
            for (l41 l41Var : l41VarArr) {
                if (l41Var != null) {
                    l41Var.C0();
                }
            }
            this.f34298a.f35594g3.O(false);
            this.f34298a.f35593f3.h1(0, 0);
            this.f34298a.post(new d4(this, 10));
        }
        if (!N0) {
            for (l41 l41Var2 : l41VarArr) {
                if (l41Var2 != null) {
                    Y0(l41Var2, z10);
                }
            }
            ci.q qVar = this.f43335o0;
            if (qVar != null) {
                qVar.post(new d4(this, 5));
                this.f43335o0.post(new d4(this, 6));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
        k0 x10 = k0.x(this.currentAccount);
        a1();
        arrayList.add(r31.m(this.S));
        this.h = arrayList.size();
        h5 h5Var = this.f43325f;
        r31 r31Var = new r31(-4);
        r31Var.f37620c = h5Var;
        r31Var.f37640z = -1;
        r31Var.f37621e = true;
        arrayList.add(r31Var);
        arrayList.add(r31.m(this.A0));
        boolean N0 = N0();
        this.f43336p0 = N0;
        if (N0) {
            String M0 = bd.M0(2131743029, null);
            String M02 = bd.M0(2131743028, null);
            int i3 = o5.f43008b;
            r31 K = r31.K(o5.class);
            K.f37626k = 2131232827;
            K.f37627l = M0;
            K.f37628m = M02;
            arrayList.add(K);
            String M03 = bd.M0(2131743078, null);
            String M04 = bd.M0(2131743077, null);
            r31 K2 = r31.K(o5.class);
            K2.f37626k = 2131232825;
            K2.f37627l = M03;
            K2.f37628m = M04;
            arrayList.add(K2);
            String M05 = bd.M0(2131743192, null);
            String M06 = bd.M0(2131743191, null);
            r31 K3 = r31.K(o5.class);
            K3.f37626k = 2131232829;
            K3.f37627l = M05;
            K3.f37628m = M06;
            arrayList.add(K3);
            arrayList.add(r31.m(this.f43320b0));
        } else if (this.f43335o0 != null) {
            if (this.S0 && !this.T0 && x10.v() > 500000000) {
                arrayList.add(r31.k(this.f43322d0));
            }
            ci.q qVar = this.f43335o0;
            r31 r31Var2 = new r31(-3);
            r31Var2.f37620c = qVar;
            r31Var2.f37640z = 0;
            r31Var2.f37639y = 1;
            arrayList.add(r31Var2);
        }
        s70 s70Var = this.f43319a0;
        if (s70Var != null) {
            this.f43321c0 = false;
            s70Var.animate().cancel();
            this.f43319a0.setAlpha(0.0f);
            this.f43319a0.setVisibility(4);
        }
    }

    public final void Z0() {
        s8 s8Var = this.f43330j0;
        if (s8Var != null && this.f43337q0 != null && s8Var.f43174x != 0.0f) {
            s8Var.f43174x = 0.0f;
            s8Var.f43167c.setVisibility(8);
            s8Var.invalidate();
        }
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131743013, null);
    }

    public final void a1() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5 g5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = x10.f42724i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(x10.f42725j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        g5Var.i(frameLayout, z11, z10);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i3 = 0;
        long j10 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            g0 g0Var = (g0) obj;
            if (!g0Var.f42559e) {
                long j11 = g0Var.f42558c;
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
            this.X.setText(x0(2131743072, j10));
        }
        this.T.i(this.W, z12, z10);
        long j12 = ci.e9.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(x0(2131743110, j12));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final void b0(r31 r31Var, View view) {
        c0 c0Var;
        Object obj = r31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
        } else if (r31Var.d == -10001 && (c0Var = this.F0) != null) {
            c0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) r31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        b8 b8Var;
        if ((view instanceof o7) && (b8Var = this.f43331k0) != null) {
            b8Var.S((o7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        b8 b8Var = this.f43331k0;
        if ((b8Var == null || !b8Var.f42323q0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f43334n0;
        if (valueAnimator != null) {
            this.f43334n0 = null;
            valueAnimator.cancel();
        }
        P0();
        s5 s5Var = this.f43339r0;
        if (s5Var != null) {
            s5Var.b(null);
        }
        this.f43325f = null;
        this.T = null;
        this.S = null;
        this.f43335o0 = null;
        this.f43337q0 = null;
        l41[] l41VarArr = this.f43341s0;
        l41VarArr[0] = null;
        l41VarArr[1] = null;
        c0 c0Var = this.F0;
        if (c0Var != null && !c0Var.f42360a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43327g0 = z10;
        if (!z10) {
            this.f43326f0 = 0;
        } else if (this.G0) {
            this.f43326f0 = 1;
        }
        b8 b8Var = this.f43331k0;
        if (b8Var != null) {
            b8Var.p();
        }
        this.f43331k0 = null;
        View createView = super.createView(context);
        ka0 ka0Var = new ka0(this, context);
        ka0Var.addView(createView, mf.c(-1.0f, -1));
        this.fragmentView = ka0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        org.telegram.ui.ActionBar.r6.i(i3, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        org.telegram.ui.ActionBar.q0 a10 = q10.a(2, 2131232676);
        this.M0 = a10;
        a10.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f42517b;

            {
                this.f42517b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f42517b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        return;
                    case 1:
                        w5.f0(this.f42517b);
                        return;
                    case 2:
                        w5.i0(this.f42517b);
                        return;
                    case 3:
                        this.f42517b.K0();
                        return;
                    default:
                        w5.d0(this.f42517b);
                        return;
                }
            }
        });
        q10.a(1, 2131231244).setOnClickListener(new hb0(27, this, context));
        kw0 kw0Var = new kw0(4, context, this);
        this.S = kw0Var;
        kw0Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        g5 g5Var = new g5(this, context);
        this.T = g5Var;
        g5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new d4(this, 12));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(bd.M0(2131742972, null));
        this.U = u0(this.V, new d4(this, 0));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = u0(textView2, new d4(this, 1));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = u0(textView3, new d4(this, 2));
        this.S.addView(this.T, mf.c(-2.0f, -1));
        s70 s70Var = new s70(context, null);
        this.f43319a0 = s70Var;
        this.f43321c0 = false;
        s70Var.setAlpha(0.0f);
        s70 s70Var2 = this.f43319a0;
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.r6.V(s70Var2, i10, this.resourceProvider);
        this.f43319a0.setTextSize(1, 13.0f);
        this.f43319a0.setGravity(17);
        this.f43319a0.setText(Q0(bd.M0(2131743016, null), org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider, new e4(context, 0)));
        this.f43319a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.f43319a0, mf.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        h5 h5Var = new h5(this, context, 0);
        this.f43320b0 = h5Var;
        h5Var.setImportantForAccessibility(2);
        this.f43322d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43324e0 = frameLayout2;
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i12)), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 q11 = org.telegram.ui.ActionBar.r6.q(i11, i12);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, b02, N, q11, resourceProvider);
        this.f43322d0.addView(this.f43324e0, mf.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232834);
        this.f43324e0.addView(imageView, mf.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.f28122q7, this.resourceProvider);
        k2.p1.u(textView4, 1, 16.0f, null, 2131743054);
        this.f43324e0.addView(textView4, mf.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f43324e0.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f42517b;

            {
                this.f42517b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f42517b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        return;
                    case 1:
                        w5.f0(this.f42517b);
                        return;
                    case 2:
                        w5.i0(this.f42517b);
                        return;
                    case 3:
                        this.f42517b.K0();
                        return;
                    default:
                        w5.d0(this.f42517b);
                        return;
                }
            }
        });
        pf.b(this.f43324e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f43349y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f43349y.setClipToPadding(false);
        this.actionBar.addView(this.f43349y, mf.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.f43349y.addView(view, mf.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        n61 n61Var = new n61(this, context);
        this.F = n61Var;
        n61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        k5 k5Var = new k5(this, context);
        this.f43323e = k5Var;
        k5Var.setDiamondOnCard(true);
        this.f43323e.setCardOnClickListener(new View.OnClickListener(this) {
            public final w5 f42517b;

            {
                this.f42517b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f42517b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        return;
                    case 1:
                        w5.f0(this.f42517b);
                        return;
                    case 2:
                        w5.i0(this.f42517b);
                        return;
                    case 3:
                        this.f42517b.K0();
                        return;
                    default:
                        w5.d0(this.f42517b);
                        return;
                }
            }
        });
        this.f34298a.E2.f36933b.add(this.f43347x);
        h5 h5Var2 = new h5(this, context, 1);
        this.f43325f = h5Var2;
        h5Var2.setImportantForAccessibility(2);
        l5 l5Var = new l5(this, context);
        this.f43333n = l5Var;
        l5Var.setClipChildren(false);
        this.f43333n.setClipToPadding(false);
        this.f43333n.addView(this.f43323e, mf.c(-2.0f, -1));
        ka0Var.addView(this.f43333n, mf.c(-1.0f, -1));
        this.f34298a.setClipChildren(false);
        this.f34298a.setClipToPadding(false);
        this.f43342t0 = this.f43323e.getBalanceLayout();
        this.f43343u0 = this.f43323e.getBalanceView();
        this.f43344v0 = this.f43323e.getUsdBalanceView();
        this.f43323e.setCardHolder(l10.p(getUserConfig().f()).toUpperCase());
        this.B0 = 0.0f;
        s51 s51Var = new s51(24, context, this);
        this.A0 = s51Var;
        s51Var.setOrientation(0);
        this.A0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(bd.M0(2131743214, null));
        this.A0.addView(this.C0, mf.m(1.0f, 0, 48, 0, 4, 0));
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f42517b;

            {
                this.f42517b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f42517b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        return;
                    case 1:
                        w5.f0(this.f42517b);
                        return;
                    case 2:
                        w5.i0(this.f42517b);
                        return;
                    case 3:
                        this.f42517b.K0();
                        return;
                    default:
                        w5.d0(this.f42517b);
                        return;
                }
            }
        });
        gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(bd.M0(2131743032, null));
        this.D0.setEnabled(k0.x(this.currentAccount).e());
        this.D0.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f42517b;

            {
                this.f42517b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f42517b;
                        w5Var.getClass();
                        w5Var.presentFragment(new ra1(6, null));
                        return;
                    case 1:
                        w5.f0(this.f42517b);
                        return;
                    case 2:
                        w5.i0(this.f42517b);
                        return;
                    case 3:
                        this.f42517b.K0();
                        return;
                    default:
                        w5.d0(this.f42517b);
                        return;
                }
            }
        });
        this.A0.addView(this.D0, mf.m(1.0f, 0, 48, 4, 0, 0));
        V0(this.f43323e.getStickerStyle());
        this.E0 = k0.x(this.currentAccount).B();
        this.f34298a.setDescendantFocusability(131072);
        b8 b8Var2 = new b8(this, this.f43323e, new m2.t(17, this, ka0Var), null);
        this.f43331k0 = b8Var2;
        ka0Var.addView(b8Var2, mf.c(-1.0f, -1));
        this.f43332l0 = "";
        ci.q qVar = new ci.q(context, 9);
        this.f43335o0 = qVar;
        qVar.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i3, this.f43335o0, getResourceProvider());
        gi.g1 g1Var = new gi.g1(this, context, this.resourceProvider, 9);
        this.f43337q0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.f43337q0.setAdapter(new ci.o4(9, context, this));
        m61 j10 = this.f43337q0.j(-2, true);
        this.f43328h0 = j10;
        j10.g(i10, org.telegram.ui.ActionBar.k6.G6, i10, i12, i11);
        org.telegram.ui.ActionBar.r6.C(this.f43328h0, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i11)), org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.f43329i0 = new FrameLayout(context);
        s8 s8Var = new s8(context, this.f43328h0, this.resourceProvider, new k4(this, 0), new k4(this, 1), new k4(this, 2));
        this.f43330j0 = s8Var;
        this.f43329i0.addView(s8Var, mf.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f43337q0.setPosition(this.f43326f0);
        Z0();
        this.f43335o0.addView(this.f43329i0, mf.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f43335o0.addView(this.f43337q0, mf.l(1.0f, -1, 0));
        L0(this.f43327g0);
        c0 c0Var2 = this.F0;
        if (c0Var2 != null) {
            this.f43331k0.Y(c0Var2);
        }
        this.f34298a.j(new ji(this, 23));
        f41 f41Var = this.f34298a.f35594g3;
        f41Var.f33698r = false;
        f41Var.O(false);
        s5 s5Var2 = new s5(this);
        this.f43339r0 = s5Var2;
        s5Var2.b(this.f34298a);
        R0();
        this.E0.h();
        this.actionBar.post(new d4(this, 9));
        this.f34298a.post(new d4(this, 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ai.h4 h4Var;
        f41 f41Var;
        if (i10 == this.currentAccount) {
            if (i3 == hs.f23200a4 && this.f43343u0 != null) {
                R0();
                Iterator it = this.Q0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i3 == hs.f23343y3) {
                a1();
            } else if (i3 == hs.f23286q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.S0 = true;
                        this.T0 = ((TL_account.Password) obj).has_password;
                        ai.h4 h4Var2 = this.f34298a;
                        if (h4Var2 != null && (f41Var = h4Var2.f35594g3) != null) {
                            f41Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new c3.b(1), new d(this, 7));
            } else if (i3 == hs.f23206b4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                j0 j0Var = this.E0;
                if (obj2 == j0Var && (h4Var = this.f34298a) != null && h4Var.f35594g3 != null) {
                    if (j0Var.f42680b.isEmpty()) {
                        j0 j0Var2 = this.E0;
                        if (!j0Var2.h) {
                            j0Var2.h();
                        }
                    }
                    X0(true);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        s8 s8Var = this.f43330j0;
        if (s8Var != null && s8Var.f43175y) {
            if (z10) {
                s8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        s5 s5Var = this.f43339r0;
        if (s5Var != null) {
            s5Var.c();
        }
        ai.h4 h4Var = this.f34298a;
        if (h4Var != null) {
            h4Var.C0();
        }
        l41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f25457b;
        if (x5.f43400k0.compareAndSet(false, true)) {
            x5.f43401l0.postRunnable(new e4(context, 2));
        }
        getNotificationCenter().c(this, hs.f23200a4);
        getNotificationCenter().c(this, hs.f23343y3);
        getNotificationCenter().c(this, hs.f23206b4);
        getNotificationCenter().c(this, hs.f23286q0);
        k0 x10 = k0.x(this.currentAccount);
        if (x10.f42730o == null) {
            x10.f42730o = new c0(x10);
        }
        c0 c0Var = x10.f42730o;
        this.F0 = c0Var;
        d4 d4Var = this.H0;
        ArrayList arrayList = c0Var.d;
        if (!arrayList.contains(d4Var)) {
            arrayList.add(d4Var);
        }
        org.telegram.ui.Components.o2 o2Var = this.U0;
        if (o2Var != null) {
            o2Var.run();
        }
        int i3 = x10.D;
        x10.D = i3 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i3));
        if (isEmpty) {
            x10.S();
        }
        this.U0 = new org.telegram.ui.Components.o2(x10, i3, 28);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new c3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
        org.telegram.messenger.g0.r(this.L0);
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b8 b8Var = this.f43331k0;
        if (b8Var != null) {
            b8Var.p();
        }
        k5 k5Var = this.f43323e;
        if (k5Var != null) {
            k5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.f43334n0;
        if (valueAnimator2 != null) {
            this.f43334n0 = null;
            valueAnimator2.cancel();
        }
        c0 c0Var = this.F0;
        if (c0Var != null) {
            c0Var.d.remove(this.H0);
        }
        P0();
        s5 s5Var = this.f43339r0;
        if (s5Var != null) {
            s5Var.b(null);
        }
        getNotificationCenter().n(this, hs.f23200a4);
        getNotificationCenter().n(this, hs.f23343y3);
        getNotificationCenter().n(this, hs.f23206b4);
        getNotificationCenter().n(this, hs.f23286q0);
        org.telegram.messenger.g0.E2(this.F);
        j0 j0Var = this.E0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.o2 o2Var = this.U0;
        if (o2Var != null) {
            o2Var.run();
            this.U0 = null;
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f34298a.setPadding(0, 0, 0, i12);
        this.f34298a.setClipToPadding(false);
        s70 s70Var = this.f43319a0;
        if (s70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.f43319a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        bi.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (i3 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                K0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(bd.M0(2131746511, null));
            alertDialog$Builder.k(bd.M0(2131747308, null), new g4(this));
            alertDialog$Builder.h(bd.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new d4(this, 9));
        }
        k0.x(this.currentAccount).E();
        if (this.F0 != null && k0.x(this.currentAccount).G()) {
            c0 c0Var = this.F0;
            if (!c0Var.f42367j) {
                c0Var.b();
                c0Var.f(true);
            }
        }
        R0();
        if (this.f34298a != null) {
            X0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f43343u0 != null && this.f43344v0 != null && this.f43323e != null) {
                U0(this.f43350y0);
            }
            k5 k5Var = this.f43323e;
            if (k5Var != null && this.C0 != null && this.D0 != null) {
                V0(k5Var.getStickerStyle());
            }
            s70 s70Var = this.f43319a0;
            if (s70Var != null) {
                s70Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            g5 g5Var = this.T;
            if (g5Var != null) {
                g5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z10) {
        float f10;
        long j10;
        xq xqVar;
        org.telegram.messenger.g0.r(this.L0);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.J0 == f10) {
            return;
        }
        this.J0 = f10;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        T0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f10);
        this.K0 = ofFloat;
        if (z10) {
            j10 = 260;
        } else {
            j10 = 120;
        }
        ofFloat.setDuration(j10);
        ValueAnimator valueAnimator2 = this.K0;
        if (z10) {
            xqVar = new xq(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            xqVar = new xq(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(xqVar);
        this.K0.addUpdateListener(new j4(this, 1));
        this.K0.addListener(new i81(this, 6));
        this.K0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(getThemedColor(i3), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, mf.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28290z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, mf.e(-2, -2, 21));
        frameLayout.setOnClickListener(new h3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        pf.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, mf.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i3, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        wp wpVar = new wp(2131231955, 0);
        wpVar.d = false;
        spannableStringBuilder.setSpan(wpVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.o(j10, false));
        spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return bd.V(null, null, i3, spannableStringBuilder);
    }

    public final l41 y0() {
        View currentView;
        if (z0()) {
            gi.g1 g1Var = this.f43337q0;
            if (g1Var == null) {
                currentView = null;
            } else {
                currentView = g1Var.getCurrentView();
            }
            if (currentView instanceof l41) {
                return (l41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        ci.q qVar;
        if (!this.f43336p0 && (qVar = this.f43335o0) != null && qVar.isAttachedToWindow()) {
            ViewParent parent = this.f43335o0.getParent();
            ai.h4 h4Var = this.f34298a;
            if (parent == h4Var.f35593f3.m(h4Var.f35594g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
