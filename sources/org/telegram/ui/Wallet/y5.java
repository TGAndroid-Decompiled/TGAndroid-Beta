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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zj;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.a90;
import org.telegram.ui.fq0;
import org.telegram.ui.g71;
import org.telegram.ui.nb1;
import org.telegram.ui.oa0;
import org.telegram.ui.q90;
import org.telegram.ui.w61;
import org.telegram.ui.x21;
import org.telegram.ui.xa1;
import org.telegram.ui.z51;
public final class y5 extends r41 implements is {
    public static Typeface V0;
    public z51 A0;
    public float B0;
    public hi.d C0;
    public hi.d D0;
    public View E;
    public k0 E0;
    public w61 F;
    public d0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public org.telegram.ui.ActionBar.q0 M0;
    public ci.a0 N0;
    public int O0;
    public SpannableString R0;
    public m01 S;
    public boolean S0;
    public i5 T;
    public boolean T0;
    public FrameLayout U;
    public nb1 U0;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public z70 f44727a0;
    public j5 f44728b0;
    public boolean f44729c0;
    public FrameLayout f44730d0;
    public m5 f44731e;
    public FrameLayout f44732e0;
    public j5 f44733f;
    public boolean f44735g0;
    public int h;
    public v61 f44736h0;
    public FrameLayout f44737i0;
    public u8 f44738j0;
    public c8 f44739k0;
    public float m0;
    public n5 f44741n;
    public ValueAnimator f44742n0;
    public ai.r2 f44743o0;
    public boolean f44744p0;
    public hi.i1 f44745q0;
    public int f44746r;
    public u5 f44747r0;
    public boolean f44748s;
    public LinearLayout f44750t0;
    public org.telegram.ui.Components.h6 f44751u0;
    public org.telegram.ui.Components.h6 f44752v0;
    public g6 f44754w0;
    public p5 f44756x0;
    public FrameLayout f44757y;
    public float f44758y0;
    public float f44759z0;
    public final zj f44753w = new zj(this, 27);
    public final i4 f44755x = new ss() {
        @Override
        public final void a(int i7, boolean z10) {
            bi.v3 v3Var;
            y5 y5Var = y5.this;
            zj zjVar = y5Var.f44753w;
            if ((i7 != 1 && i7 != 3) || (v3Var = y5Var.f38880a) == null) {
                return;
            }
            y5Var.f44748s = z10;
            v3Var.removeCallbacks(zjVar);
            zjVar.run();
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
    public int f44734f0 = 0;
    public String f44740l0 = "";
    public final u41[] f44749s0 = new u41[2];
    public final e4 H0 = new e4(this, 4);
    public final e4 L0 = new e4(this, 5);
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
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && d1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, u10 u10Var, s10 s10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        x2[] x2VarArr;
        View[] viewArr;
        s10 s10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                di.c6 c6Var = new di.c6(context, i7, 0L, e6Var, null);
                c6Var.f8316e3 = wallettransaction;
                c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                c6Var.show();
                return;
            }
        }
        boolean z10 = true;
        x2[] x2VarArr2 = new x2[1];
        View[] viewArr2 = new View[1];
        k0 B = l0.x(i7).B();
        ArrayList arrayList = new ArrayList(B.f44044c);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == wallettransaction || l0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (u10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232729).getPadding(rect);
            viewArr = viewArr2;
            ?? y4Var = new y4(context, e6Var, arrayList, B, i7, rect, viewArr);
            y4Var.setPosition(i10);
            x2VarArr = x2VarArr2;
            y4Var.setAdapter(new z4(arrayList, context, e6Var, rect, i7, x2VarArr2));
            s10Var2 = s10Var;
            t02 = y4Var;
        } else {
            x2VarArr = x2VarArr2;
            viewArr = viewArr2;
            s10Var2 = s10Var;
            t02 = t0(context, i7, wallettransaction, u10Var, s10Var, bArr, m0Var, e6Var, x2VarArr, false);
        }
        x2[] x2VarArr3 = x2VarArr;
        a5 a5Var = new a5(context, t02, e6Var, t02, viewArr, context);
        x2VarArr3[0] = a5Var;
        if ((t02 instanceof org.telegram.ui.Components.w61) && s10Var2 != null) {
            a5Var.n(new r(6, s10Var2, wallettransaction));
        }
        x2 x2Var = x2VarArr3[0];
        if (u10Var == null) {
            z10 = false;
        }
        x2Var.A0(z10);
        x2 x2Var2 = x2VarArr3[0];
        x2Var2.U0 = false;
        x2Var2.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, d02, M, null, e6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ja.c(-2.0f, -1));
        linearLayout.addView(new w6(160, context, false), c8.ja.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131743097, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(hd.M0(2131743096, null));
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.q6.U(f10, i10, e6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ja.t(-1, -2, 1, 0, 0, 0, 24));
        r5 r5Var = new r5(context, e6Var);
        r5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var.a(2131232830, hd.M0(2131743019, null), hd.M0(2131743018, null));
        linearLayout.addView(r5Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r5 r5Var2 = new r5(context, e6Var);
        r5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var2.a(2131232828, hd.M0(2131743068, null), hd.M0(2131743067, null));
        linearLayout.addView(r5Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r5 r5Var3 = new r5(context, e6Var);
        r5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        r5Var3.a(2131232832, hd.M0(2131743182, null), hd.M0(2131743181, null));
        linearLayout.addView(r5Var3, c8.ja.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        hi.d g10 = i20.g(24, context, e6Var, true);
        g10.setText(hd.M0(2131743101, null));
        linearLayout.addView(g10, c8.ja.t(-1, 48, 1, 0, 0, 0, 0));
        c8.na.b(g10, 0.02f, 1.1f);
        z70 z70Var = new z70(context, null);
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        z70Var.setTextSize(1, 13.0f);
        z70Var.setGravity(17);
        z70Var.setText(R0(hd.M0(2131743006, null), org.telegram.ui.ActionBar.j6.Xc, e6Var, new f4(context, 1)));
        linearLayout.addView(z70Var, c8.ja.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        k10.O = frameLayout;
        org.telegram.ui.ActionBar.u2[] u2VarArr = {k10};
        u2VarArr[0].u0(true);
        u2VarArr[0].O();
        g10.setOnClickListener(new m4(u2VarArr, 1));
        u2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        l0 x10 = l0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            K0(context, i7, t6, true, null, e6Var);
        }
    }

    public static void K0(Context context, final int i7, String str, final boolean z10, final g gVar, final org.telegram.ui.ActionBar.e6 e6Var) {
        float f10;
        final org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        u2Var.v0(-12207881);
        u2Var.P(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new x5());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ja.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f23606n));
        w5 w5Var = new w5(context, str);
        if (!z10) {
            w5Var.f44626b.setText(hd.M0(2131746500, null));
        }
        linearLayout.addView(w5Var, c8.ja.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131743041, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 1, 24, 0, 24, 20));
        final hi.d dVar = new hi.d(context, null, true);
        dVar.setRoundRadius(24);
        dVar.setColor(-1);
        dVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new eq(2131232808, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131743180, null));
        } else {
            f10 = 12.0f;
            eq eqVar = new eq(2131231956, 0);
            eqVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) hd.M0(2131743017, null));
        }
        dVar.setText(spannableStringBuilder);
        linearLayout.addView(dVar, c8.ja.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z10) {
            int i10 = 8;
            textView.setVisibility(8);
            if (gVar != null) {
                i10 = 0;
            }
            dVar.setVisibility(i10);
        }
        View e10 = i20.e(context, 2131231269);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(hd.M0(2131752041, null));
        c8.na.a(e10);
        frameLayout.addView(e10, c8.ja.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        u2Var.O = frameLayout;
        u2Var.f29721x = true;
        u2Var.f29718v0 = false;
        u2Var.f29720w0 = false;
        u2Var.P(-12207881);
        e10.setOnClickListener(new d4(u2Var, 0));
        w5Var.f44629f = new q0(str, 1);
        u2Var.show();
        u2Var.E0(-12207881);
        org.telegram.messenger.g0.t3(u2Var, -12207881, false, null);
        org.telegram.messenger.g0.n3(u2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && u2Var.getWindow() != null) {
            u2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z11 = z10;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                if (!z11) {
                    u2Var2.dismiss();
                    gVar.run();
                    return;
                }
                hi.d dVar2 = dVar;
                if (dVar2.R) {
                    return;
                }
                dVar2.setLoading(true);
                o4 o4Var = new o4(dVar2, u2Var2, e6Var, 0);
                int i11 = i7;
                l0 x10 = l0.x(i11);
                x10.m0(new u11(i11, o4Var, x10));
            }
        });
    }

    public static SpannableStringBuilder R0(String str, int i7, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new ki.h3(i7, e6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Z0(u41 u41Var, boolean z10) {
        boolean canScrollVertically = u41Var.canScrollVertically(-1);
        u41Var.f39892g3.O(z10);
        u41Var.a0();
        if (!canScrollVertically) {
            u41Var.f39891f3.h1(0, 0);
        }
    }

    public static Uri c1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (B0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static void d0(y5 y5Var) {
        l0 x10 = l0.x(y5Var.currentAccount);
        hi.d dVar = y5Var.D0;
        if (dVar.R) {
            return;
        }
        dVar.setLoading(true);
        x10.m0(new h2.n0((Object) x10, (Object) new x21(13, y5Var, x10), false, false, 4));
    }

    public static String d1(Uri uri) {
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

    public static void e0(y5 y5Var) {
        vf.c.t(y5Var.getParentActivity(), l0.x(y5Var.currentAccount).f44085j);
    }

    public static void f0(y5 y5Var) {
        J0(y5Var.currentAccount, y5Var.getParentActivity(), y5Var.getResourceProvider());
    }

    public static void g0(y5 y5Var, String str, l0 l0Var, m60 m60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, y5Var.getParentActivity(), y5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        z0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = z0Var.f29900b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new i1(l0Var, currencyrate, m60Var, 1));
        linearLayout.addView(z0Var, c8.ja.o(200, -2));
    }

    public static void h0(y5 y5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (y5Var.F != null && (kVar = y5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) y5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (y5Var.F.getParent() != y5Var.actionBar) {
                org.telegram.messenger.g0.E2(y5Var.F);
                y5Var.actionBar.addView(y5Var.F, c8.ja.c(-1.0f, -1));
            }
            y5Var.F.bringToFront();
            y5Var.actionBar.bringToFront();
            y5Var.F.post(new e4(y5Var, 12));
        }
    }

    public static void i0(y5 y5Var) {
        J0(y5Var.currentAccount, y5Var.getParentActivity(), y5Var.getResourceProvider());
    }

    public static void j0(y5 y5Var, String str) {
        Uri c12 = c1(str);
        String d12 = d1(c12);
        if (d12 != null) {
            int i7 = y5Var.currentAccount;
            np.s1(i7).d2().a(d12, null, new ai.y1(new l4(y5Var, 4), i7));
        } else if ((y5Var.getParentActivity() instanceof LaunchActivity) && new q90((LaunchActivity) y5Var.getParentActivity(), y5Var.currentAccount, null, false).g(c12)) {
        } else {
            org.telegram.messenger.g0.h3(new e4(y5Var, 11));
        }
    }

    public static void k0(y5 y5Var, LinearLayout linearLayout, l0 l0Var, m60 m60Var) {
        TL_wallet.currencyRate currencyrate;
        y5 y5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g10 = l0Var2.h.g();
        TL_wallet.currencyRates f10 = l0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                pz pzVar = new pz(y5Var.getParentActivity(), y5Var.getResourceProvider());
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(31);
                linearLayout2.addView(pzVar, c8.ja.o(200, -2));
            }
            return;
        }
        f fVar = l0Var2.h;
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26609b.getSystemService("input_method");
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
            f.a(linkedHashSet, ((org.telegram.messenger.n0) np.s1(fVar.f43810a).f25451y7.O.f15881b).f25133c);
            f.c(linkedHashSet, hd.E0().f24132y);
            f.c(linkedHashSet, hd.E0().f24133z);
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
                g0(y5Var, g10, l0Var2, m60Var, linearLayout2, currencyrate7);
            }
            i12++;
            l0Var2 = l0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            y5Var2 = y5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(y5Var.getParentActivity(), y5Var2.resourceProvider), c8.ja.o(-1, 8));
        } else {
            y5Var2 = y5Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(y5Var2, g10, l0Var, m60Var, linearLayout2, currencyrate8);
            }
            i13++;
            y5Var2 = y5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void l0(final y5 y5Var, Context context, View view) {
        boolean z10;
        l0 x10 = l0.x(y5Var.currentAccount);
        final m60 I = m60.I(y5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.f37111s = 0;
        I.V(5);
        m60 J = I.J();
        J.c(2131231240, hd.M0(2131743192, null), new fq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        g7 g7Var = new g7(y5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ja.o(-1, 350));
        I.c(2131232816, hd.M0(2131743148, null), new g(g7Var, I, J, 11), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i7 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i7);
        String str = i7;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131748779, null));
            spannableStringBuilder.setSpan(new e80(org.telegram.messenger.g0.L(75.0f), y10.f29900b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g7 g7Var2 = new g7(x10, new boolean[]{z10}, y10, g7Var, 12);
        y5Var.Q0.add(g7Var2);
        g7Var.run();
        I.c(2131232834, hd.M0(2131747657, null), new Runnable(y5Var) {
            public final y5 f44386b;

            {
                this.f44386b = y5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        y5 y5Var2 = this.f44386b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        y5 y5Var3 = this.f44386b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        y5 y5Var4 = this.f44386b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new r41());
                        return;
                    default:
                        I.u();
                        y5 y5Var5 = this.f44386b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(2131232827, hd.M0(2131743080, null), new Runnable(y5Var) {
            public final y5 f44386b;

            {
                this.f44386b = y5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        y5 y5Var2 = this.f44386b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        y5 y5Var3 = this.f44386b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        y5 y5Var4 = this.f44386b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new r41());
                        return;
                    default:
                        I.u();
                        y5 y5Var5 = this.f44386b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(2131232807, hd.M0(2131743156, null), new Runnable(y5Var) {
            public final y5 f44386b;

            {
                this.f44386b = y5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        y5 y5Var2 = this.f44386b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        y5 y5Var3 = this.f44386b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        y5 y5Var4 = this.f44386b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new r41());
                        return;
                    default:
                        I.u();
                        y5 y5Var5 = this.f44386b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ x10.f44083g.d.isEmpty());
        I.k();
        I.c(2131232820, hd.M0(2131742960, null), new Runnable(y5Var) {
            public final y5 f44386b;

            {
                this.f44386b = y5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        y5 y5Var2 = this.f44386b;
                        y5Var2.getClass();
                        I.u();
                        y5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        y5 y5Var3 = this.f44386b;
                        y5Var3.getClass();
                        I.u();
                        y5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        y5 y5Var4 = this.f44386b;
                        y5Var4.getClass();
                        I.u();
                        y5Var4.presentFragment(new r41());
                        return;
                    default:
                        I.u();
                        y5 y5Var5 = this.f44386b;
                        y5.I0(y5Var5.getParentActivity(), y5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f37106p = new r(7, y5Var, g7Var2);
        I.Z();
    }

    public static void m0(y5 y5Var, long j3) {
        e4 e4Var = y5Var.L0;
        if (y5Var.f38880a != null) {
            u8 u8Var = y5Var.f44738j0;
            if (u8Var != null) {
                u8Var.a();
            }
            if (y5Var.J0 <= 0.0f && y5Var.A0()) {
                int top = y5Var.f38880a.f39891f3.m(y5Var.h).getTop() - y5Var.f38880a.getPaddingTop();
                y5Var.f38880a.C0();
                if (top < 0) {
                    y5Var.f38880a.w0(0, top, er.h);
                    return;
                }
                return;
            }
            y5Var.f38880a.C0();
            y5Var.s0(true);
            org.telegram.messenger.g0.r(e4Var);
            if (j3 > 0) {
                org.telegram.messenger.g0.i3(e4Var, j3 + 260);
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

    public static android.widget.LinearLayout t0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.u10 r46, org.telegram.messenger.s10 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.e6 r50, org.telegram.ui.Wallet.x2[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.y5.t0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.u10, org.telegram.messenger.s10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.e6, org.telegram.ui.Wallet.x2[], boolean):android.widget.LinearLayout");
    }

    public static String v0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        eq eqVar = new eq(2131232819, 2);
        eqVar.d = false;
        eqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence m10 = l0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.f29260z6, e6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        bi.v3 v3Var = this.f38880a;
        if (v3Var != null && (m10 = v3Var.f39891f3.m(this.h)) != null && this.f44759z0 < 0.5f && m10.getBottom() > this.f38880a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void D0() {
        d0 d0Var;
        u41 u41Var = this.f44749s0[1];
        if (this.f44734f0 == 1 && u41Var != null && u41Var.H && (d0Var = this.F0) != null && !d0Var.f43718i && !d0Var.f43717g && d0Var.f43720k == null && u41Var.f39891f3.N0() >= u41Var.f39892g3.E.size() - 3) {
            this.F0.e();
        }
    }

    public final void E0() {
        k0 k0Var;
        u41 u41Var = this.f44749s0[0];
        if (u41Var != null && u41Var.H && (k0Var = this.E0) != null && !k0Var.h && u41Var.f39891f3.N0() >= u41Var.f39892g3.E.size() - 3) {
            this.E0.h();
        }
    }

    public final CharSequence F0(int i7) {
        org.telegram.ui.Components.h6 h6Var;
        float f10;
        CharSequence[] charSequenceArr = this.P0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            if (i7 == 0) {
                h6Var = this.f44751u0;
            } else {
                h6Var = this.f44752v0;
            }
            if (i7 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            e80 e80Var = new e80(org.telegram.messenger.g0.L(f10), h6Var);
            e80Var.a(org.telegram.ui.ActionBar.j6.r1(0.45f, -1), org.telegram.ui.ActionBar.j6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(e80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i7];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        TL_stars.StarGift starGift = nftitem.gift;
        String str2 = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            di.c6 c6Var = new di.c6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            c6Var.f8311b3 = nftitem;
            if (this.f44739k0 != null) {
                c6Var.f8313c3 = new g5(this, tL_starGiftUnique, nftitem);
                c6Var.f8314d3 = new h5(this, nftitem);
            }
            c6Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(c6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.j6.f28792a7;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.j6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) parentActivity, resourceProvider, false);
            u2Var.f29683b0 = i14;
            u2Var.v0(w02);
            u2Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            i9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232836).mutate();
            int i16 = org.telegram.ui.ActionBar.j6.f29260z6;
            org.telegram.ui.ActionBar.q6.x(i9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            gc c10 = c.c(nftitem, false);
            if (c10 != null) {
                i9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                i9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(i9Var, c8.ja.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = hd.M0(2131743176, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.k5.m(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ja.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.q6.U(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView2.setVisibility(i7);
            linearLayout.addView(textView2, c8.ja.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i19 = org.telegram.ui.ActionBar.j6.f28849d6;
                int w03 = org.telegram.ui.ActionBar.j6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.j6.f28941i6;
                int w04 = org.telegram.ui.ActionBar.j6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i19);
                org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.q6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742981;
                } else {
                    i10 = 2131743023;
                }
                String M0 = hd.M0(i10, str2);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i11 = 2131232847;
                } else {
                    i11 = 2131232840;
                }
                imageView.setImageResource(i11);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.q6.s(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.ja.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.m(textView3, i21, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.ja.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                linearLayout2.addView(linearLayout3, c8.ja.m(1.0f, 0, -1, i12, i13, 0));
                i18++;
                f10 = f11;
                i17 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                vx0 vx0Var = new vx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i22 = org.telegram.ui.ActionBar.j6.f28849d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i22);
                vx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.q6.j(vx0Var, d02, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    vx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(vx0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(hd.M0(2131743063, null));
            linearLayout.addView(dVar, c8.ja.o(-1, 48));
            u2Var.O = scrollView;
            u2Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new a90(26, u2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new g3(parentActivity, 1));
            dVar.setOnClickListener(new g3(u2Var, 2));
            u2Var.show();
            u2Var.P(w02);
            org.telegram.messenger.g0.t3(u2Var, w02, false, null);
        }
    }

    public final void L0() {
        if (getParentActivity() != null && this.N0 == null && this.M0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.N0 = ci.a0.k(this, this.M0, new ci.x(12), new l4(this, 3), new e4(this, 9));
            }
        }
    }

    public final void M0(boolean z10) {
        float f10;
        boolean z11;
        this.f44735g0 = z10;
        if (!z10) {
            this.f44734f0 = 0;
        }
        if (this.f44745q0 != null && this.f44737i0 != null) {
            if (!z10) {
                this.f44738j0.b(false);
                this.f44745q0.setPosition(0);
            }
            a1();
            ValueAnimator valueAnimator = this.f44742n0;
            if (valueAnimator != null) {
                this.f44742n0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.f44743o0.isAttachedToWindow() && this.f44743o0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f44745q0.k(false);
            }
            if (z11 && this.m0 != f10) {
                this.f44737i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
                this.f44742n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f44742n0.setInterpolator(er.h);
                this.f44742n0.addUpdateListener(new k4(this, 0));
                this.f44742n0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
                this.f44742n0.start();
            } else {
                N0(f10);
                this.f44745q0.k(false);
            }
            if (this.f38880a != null && this.f44744p0 != O0()) {
                Y0(false);
            }
        }
    }

    public final void N0(float f10) {
        int i7;
        this.m0 = f10;
        FrameLayout frameLayout = this.f44737i0;
        if (f10 <= 0.0f && this.f44742n0 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        frameLayout.setVisibility(i7);
        this.f44737i0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f44737i0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.f44737i0.setLayoutParams(layoutParams);
    }

    public final boolean O0() {
        k0 k0Var;
        if (!this.f44735g0 && (k0Var = this.E0) != null && k0Var.f44044c.isEmpty()) {
            k0 k0Var2 = this.E0;
            k0Var2.getClass();
            if (k0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void P0() {
        this.G0 = false;
        u8 u8Var = this.f44738j0;
        if (u8Var != null) {
            u8Var.b(false);
        }
        this.f44734f0 = 0;
        hi.i1 i1Var = this.f44745q0;
        if (i1Var != null) {
            i1Var.setPosition(0);
        }
    }

    public final void Q0() {
        this.f44748s = false;
        bi.v3 v3Var = this.f38880a;
        if (v3Var != null) {
            v3Var.E2.f40156b.remove(this.f44755x);
            this.f38880a.removeCallbacks(this.f44753w);
        }
        m5 m5Var = this.f44731e;
        if (m5Var != null) {
            m5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void S0() {
        boolean z10;
        l0 x10 = l0.x(this.currentAccount);
        b1();
        hi.d dVar = this.D0;
        if (x10.G() && x10.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!x10.G()) {
            this.f44751u0.setText(F0(0));
            this.f44752v0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.R0 == null) {
            this.R0 = new SpannableString("G");
            m5 m5Var = this.f44731e;
            m5Var.getClass();
            g6 g6Var = new g6(m5Var);
            this.f44754w0 = g6Var;
            SpannableString spannableString = this.R0;
            spannableString.setSpan(g6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.R0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) h6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.M0(2131749516, null));
        if (this.f44756x0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f44314a = -9577217;
            this.f44756x0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f44756x0, length, spannableStringBuilder.length(), 33);
        this.f44751u0.setText(spannableStringBuilder);
        CharSequence m10 = l0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.f44752v0.setText(F0(1));
        } else {
            this.f44752v0.setText(m10);
        }
        V0(this.f44758y0);
        d0 d0Var = this.F0;
        if (d0Var != null && !d0Var.h && !d0Var.f43718i && d0Var.f43720k == null) {
            d0Var.e();
        }
        String t6 = x10.t();
        if (!TextUtils.isEmpty(t6)) {
            this.f44731e.setCardNumber(v0(t6.toUpperCase()));
        }
    }

    public final void T0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            m5 m5Var = this.f44731e;
            w61 w61Var = this.F;
            Matrix matrix = this.I;
            if (m5Var.g(w61Var, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i7 = 0;
                while (true) {
                    fArr = this.L;
                    fArr2 = this.M;
                    float f11 = 0.0f;
                    if (i7 >= 4) {
                        break;
                    }
                    if (i7 != 1 && i7 != 2) {
                        f10 = 0.0f;
                    } else {
                        f10 = width;
                    }
                    if (i7 >= 2) {
                        f11 = height;
                    }
                    int i10 = i7 * 2;
                    fArr[i10] = f10;
                    int i11 = i10 + 1;
                    fArr[i11] = f11;
                    fArr2[i10] = rect.left + f10;
                    fArr2[i11] = rect.top + f11;
                    i7++;
                }
                matrix.mapPoints(fArr2);
                w61 w61Var2 = this.F;
                int[] iArr = this.P;
                w61Var2.getLocationInWindow(iArr);
                View view = this.E;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.f44731e.i(this.f44758y0, this.f44757y.getWidth() / 0.7826087f);
                float f12 = iArr2[0] - iArr[0];
                float x10 = org.telegram.ui.Cells.y0.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i12 = 0; i12 < 4; i12++) {
                    int i13 = i12 * 2;
                    float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.f44758y0);
                    float[] fArr3 = this.N;
                    fArr3[i13] = T1;
                    int i14 = i13 + 1;
                    fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + x10, this.f44758y0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.F.invalidate();
                }
                m5 m5Var2 = this.f44731e;
                Matrix matrix4 = m5Var2.f43920c;
                Matrix matrix5 = m5Var2.f43923e;
                Matrix matrix6 = m5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!m5Var2.f43931n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        m5Var2.f43931n = true;
                        m5Var2.O.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.f44758y0);
                this.f44752v0.setPivotX(0.0f);
                this.f44752v0.setPivotY(0.0f);
                this.f44752v0.setScaleX(T12);
                this.f44752v0.setScaleY(T12);
            }
        }
    }

    public final void U0() {
        w61 w61Var;
        float i7;
        boolean z10;
        float f10;
        m5 m5Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f11;
        float height;
        m5 m5Var2;
        if (this.f38880a != null && this.f44731e != null && this.f44750t0 != null && this.E != null && (w61Var = this.F) != null && this.actionBar != null) {
            w61Var.bringToFront();
            View m10 = this.f38880a.f39891f3.m(this.h);
            if (m10 == null) {
                if (this.f38880a.f39891f3.L0() > this.h) {
                    i7 = 1.0f;
                } else {
                    i7 = 0.0f;
                }
            } else {
                i7 = Utilities.i((this.f38880a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f44759z0 = i7;
            int i11 = (this.J0 > 0.0f ? 1 : (this.J0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.I0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    i7 = 0.0f;
                } else {
                    i7 = (1.0f - this.I0) * i7;
                }
            }
            this.f44758y0 = i7;
            X0();
            if (m10 != null) {
                f10 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.f44758y0;
            } else {
                f10 = 0.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.f44758y0);
            this.f44731e.setPivotX(m5Var.getWidth() * 0.5f);
            this.f44731e.setPivotY(0.0f);
            this.f44731e.setScaleX(T1);
            this.f44731e.setScaleY(T1);
            this.f44731e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
            m5 m5Var3 = this.f44731e;
            if (!z10 && (m10 == null || i7 >= 1.0f || m10.getBottom() <= this.f38880a.getPaddingTop() || m10.getTop() >= this.f38880a.getHeight() - this.f38880a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            m5Var3.setVisibility(i10);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m10 != null) {
                this.f38880a.getLocationInWindow(iArr2);
                this.f44741n.getLocationInWindow(iArr);
                r16 = 1;
                this.f44731e.setTranslationX(((this.f44733f.getWidth() - this.f44731e.getWidth()) / 2.0f) + this.f44733f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f44731e.setTranslationY(this.f44733f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
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
                this.f44741n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.f44731e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z12) {
                    f15 = a8.p0.f(0.9f - f13, this.f44731e.getHeight(), 2.0f, f15);
                }
                float width = (this.f44741n.getWidth() - this.f44731e.getWidth()) / 2.0f;
                if (!z12) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f38880a.getLocationInWindow(iArr2);
                    float width2 = ((this.f44733f.getWidth() - this.f44731e.getWidth()) / 2.0f) + this.f44733f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y10 = this.f44733f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y10) / (this.f44731e.getHeight() * 0.5f)));
                    if (l10 >= 1.0f) {
                        org.telegram.messenger.g0.r(this.L0);
                        ValueAnimator valueAnimator = this.K0;
                        if (valueAnimator != null) {
                            this.K0 = null;
                            valueAnimator.cancel();
                        }
                        this.I0 = 0.0f;
                        this.J0 = 0.0f;
                        U0();
                        return;
                    }
                    width = org.telegram.messenger.g0.T1(width, width2, l10);
                    f15 = org.telegram.messenger.g0.T1(f15, y10, l10);
                    f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                    f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
                }
                this.f44731e.setPivotX(m5Var2.getWidth() * 0.5f);
                this.f44731e.setPivotY(0.0f);
                this.f44731e.setScaleX(f13);
                this.f44731e.setScaleY(f13);
                this.f44731e.setTranslationX(width);
                this.f44731e.setTranslationY(f15);
                this.f44731e.setAlpha(f12);
            }
            if (i7 > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.G != z11 && (linearLayout = this.f44750t0) != null) {
                Rect rect = this.H;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f44750t0.getHeight() != 0) {
                        rect.set(this.f44750t0.getLeft(), this.f44750t0.getTop(), this.f44750t0.getRight(), this.f44750t0.getBottom());
                    }
                }
                this.f44731e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f44750t0);
                this.G = z11;
                if (z11) {
                    this.F.addView(this.f44750t0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f44750t0.layout(0, 0, rect.width(), rect.height());
                    T0();
                } else {
                    m5 m5Var4 = this.f44731e;
                    m5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = m5Var4.N;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    f6 f6Var = m5Var4.P;
                    f6Var.setScaleX(1.0f);
                    f6Var.setScaleY(1.0f);
                    m5Var4.F.addView(linearLayout2, m5Var4.Q);
                    this.f44750t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f44731e.getClass();
                    T0();
                }
                this.F.invalidate();
            }
            V0(i7);
            if (this.G) {
                T0();
            }
            float f16 = 1.0f - i7;
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

    public final void V0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        this.f44751u0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.h6 h6Var = this.f44752v0;
        float[] fArr = this.f44731e.f43919b0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], q7.p(-7868417, 0, fArr), q7.p(-7868417, 3, fArr));
        }
        h6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        g6 g6Var = this.f44754w0;
        if (g6Var != null) {
            g6Var.f34418y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        }
        p5 p5Var = this.f44756x0;
        if (p5Var != null) {
            float[] fArr2 = this.f44731e.f43919b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], q7.p(-9577217, 0, fArr2), q7.p(-9577217, 3, fArr2));
            }
            p5Var.f44314a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f44751u0.invalidate();
    }

    public final void W0(float[] fArr) {
        boolean z10;
        float f10;
        int n10;
        if (this.C0 != null && this.D0 != null) {
            float f11 = q7.j(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7))[0];
            if (f11 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Fi);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = i7 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = q7.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
                    }
                    iArr[i7] = n10;
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
            float[] j3 = q7.j(themedColor);
            float f14 = j3[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (q7.l(Math.max(f12, Math.min(f10, f14)), j3[1], j3[2]) & 16777215);
            }
            if (themedColor != this.O0) {
                this.O0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.j6.Ji);
                }
                hi.d[] dVarArr = {this.C0, this.D0};
                for (int i12 = 0; i12 < 2; i12++) {
                    hi.d dVar = dVarArr[i12];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i11);
                }
            }
        }
    }

    public final void X0() {
        bi.v3 v3Var = this.f38880a;
        if (v3Var != null && this.f44731e != null) {
            float b10 = v3Var.E2.b(1);
            float min = Math.min(10.0f, this.f38880a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f44731e.setAdditionalTilt(Math.max(0.0f, (this.f44758y0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.f44758y0))) * 90.0f) - 10.0f)) + min);
            this.f44731e.setUseGyroscope(1.0f - ((float) Math.pow(this.f44758y0, 0.33000001311302185d)));
        }
    }

    public final void Y0(boolean z10) {
        boolean O0 = O0();
        bi.v3 v3Var = this.f38880a;
        u41[] u41VarArr = this.f44749s0;
        if (v3Var != null && this.f44744p0 != O0) {
            this.f44744p0 = O0;
            v3Var.C0();
            for (u41 u41Var : u41VarArr) {
                if (u41Var != null) {
                    u41Var.C0();
                }
            }
            this.f38880a.f39892g3.O(false);
            this.f38880a.f39891f3.h1(0, 0);
            this.f38880a.post(new e4(this, 12));
        }
        if (!O0) {
            for (u41 u41Var2 : u41VarArr) {
                if (u41Var2 != null) {
                    Z0(u41Var2, z10);
                }
            }
            ai.r2 r2Var = this.f44743o0;
            if (r2Var != null) {
                r2Var.post(new e4(this, 6));
                this.f44743o0.post(new e4(this, 7));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        l0 x10 = l0.x(this.currentAccount);
        b1();
        arrayList.add(b41.m(this.S));
        this.h = arrayList.size();
        j5 j5Var = this.f44733f;
        b41 b41Var = new b41(-4);
        b41Var.f33177c = j5Var;
        b41Var.f33197z = -1;
        b41Var.f33178e = true;
        arrayList.add(b41Var);
        arrayList.add(b41.m(this.A0));
        boolean O0 = O0();
        this.f44744p0 = O0;
        if (O0) {
            String M0 = hd.M0(2131743019, null);
            String M02 = hd.M0(2131743018, null);
            int i7 = q5.f44388b;
            b41 K = b41.K(q5.class);
            K.f33183k = 2131232830;
            K.f33184l = M0;
            K.f33185m = M02;
            arrayList.add(K);
            String M03 = hd.M0(2131743068, null);
            String M04 = hd.M0(2131743067, null);
            b41 K2 = b41.K(q5.class);
            K2.f33183k = 2131232828;
            K2.f33184l = M03;
            K2.f33185m = M04;
            arrayList.add(K2);
            String M05 = hd.M0(2131743182, null);
            String M06 = hd.M0(2131743181, null);
            b41 K3 = b41.K(q5.class);
            K3.f33183k = 2131232832;
            K3.f33184l = M05;
            K3.f33185m = M06;
            arrayList.add(K3);
            arrayList.add(b41.m(this.f44728b0));
        } else if (this.f44743o0 != null) {
            if (this.S0 && !this.T0 && x10.v() > 500000000) {
                arrayList.add(b41.k(this.f44730d0));
            }
            ai.r2 r2Var = this.f44743o0;
            b41 b41Var2 = new b41(-3);
            b41Var2.f33177c = r2Var;
            b41Var2.f33197z = 0;
            b41Var2.f33196y = 1;
            arrayList.add(b41Var2);
        }
        z70 z70Var = this.f44727a0;
        if (z70Var != null) {
            this.f44729c0 = false;
            z70Var.animate().cancel();
            this.f44727a0.setAlpha(0.0f);
            this.f44727a0.setVisibility(4);
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743003, null);
    }

    public final void a1() {
        u8 u8Var = this.f44738j0;
        if (u8Var != null && this.f44745q0 != null && u8Var.f44574x != 0.0f) {
            u8Var.f44574x = 0.0f;
            u8Var.f44567c.setVisibility(8);
            u8Var.invalidate();
        }
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        d0 d0Var;
        Object obj = b41Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
        } else if (b41Var.d == -10001 && (d0Var = this.F0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) b41Var.G, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i5 i5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = x10.f44084i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(x10.f44085j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        i5Var.i(frameLayout, z11, z10);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h0 h0Var = (h0) obj;
            if (!h0Var.f43893e) {
                long j10 = h0Var.f43892c;
                if (j10 >= 0) {
                    j3 += j10;
                }
            }
        }
        if (j3 > 500000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.X.setText(x0(2131743062, j3));
        }
        this.T.i(this.W, z12, z10);
        long j11 = di.u8.y(this.currentAccount, true).p().amount;
        if (j11 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(x0(2131743100, j11));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        c8 c8Var;
        if ((view instanceof p7) && (c8Var = this.f44739k0) != null) {
            c8Var.S((p7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        c8 c8Var = this.f44739k0;
        if ((c8Var == null || !c8Var.f43680q0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f44742n0;
        if (valueAnimator != null) {
            this.f44742n0 = null;
            valueAnimator.cancel();
        }
        Q0();
        u5 u5Var = this.f44747r0;
        if (u5Var != null) {
            u5Var.b(null);
        }
        this.f44733f = null;
        this.T = null;
        this.S = null;
        this.f44743o0 = null;
        this.f44745q0 = null;
        u41[] u41VarArr = this.f44749s0;
        u41VarArr[0] = null;
        u41VarArr[1] = null;
        d0 d0Var = this.F0;
        if (d0Var != null && !d0Var.f43712a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44735g0 = z10;
        if (!z10) {
            this.f44734f0 = 0;
        } else if (this.G0) {
            this.f44734f0 = 1;
        }
        c8 c8Var = this.f44739k0;
        if (c8Var != null) {
            c8Var.p();
        }
        this.f44739k0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.ja.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        org.telegram.ui.ActionBar.q6.h(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        org.telegram.ui.ActionBar.q0 a10 = s5.a(2, 2131232679);
        this.M0 = a10;
        a10.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f43873b;

            {
                this.f43873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f43873b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        return;
                    case 1:
                        y5.f0(this.f43873b);
                        return;
                    case 2:
                        y5.i0(this.f43873b);
                        return;
                    case 3:
                        this.f43873b.L0();
                        return;
                    default:
                        y5.d0(this.f43873b);
                        return;
                }
            }
        });
        s5.a(1, 2131231244).setOnClickListener(new a90(28, this, context));
        m01 m01Var = new m01(3, context, this);
        this.S = m01Var;
        m01Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        i5 i5Var = new i5(this, context);
        this.T = i5Var;
        i5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new e4(this, 0));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(hd.M0(2131742962, null));
        this.U = u0(this.V, new e4(this, 1));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = u0(textView2, new e4(this, 2));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = u0(textView3, new e4(this, 3));
        this.S.addView(this.T, c8.ja.c(-2.0f, -1));
        z70 z70Var = new z70(context, null);
        this.f44727a0 = z70Var;
        this.f44729c0 = false;
        z70Var.setAlpha(0.0f);
        z70 z70Var2 = this.f44727a0;
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.q6.U(z70Var2, i10, this.resourceProvider);
        this.f44727a0.setTextSize(1, 13.0f);
        this.f44727a0.setGravity(17);
        this.f44727a0.setText(R0(hd.M0(2131743006, null), org.telegram.ui.ActionBar.j6.Xc, this.resourceProvider, new f4(context, 0)));
        this.f44727a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.f44727a0, c8.ja.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        j5 j5Var = new j5(this, context, 0);
        this.f44728b0 = j5Var;
        j5Var.setImportantForAccessibility(2);
        this.f44730d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44732e0 = frameLayout2;
        int i11 = org.telegram.ui.ActionBar.j6.f28849d6;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(themedColor, org.telegram.ui.ActionBar.j6.w(themedColor2, getThemedColor(i12)), 16, 16);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i11, i12);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.f44730d0.addView(this.f44732e0, c8.ja.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232837);
        this.f44732e0.addView(imageView, c8.ja.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.f29090q7, this.resourceProvider);
        i5.c.w(textView4, 1, 16.0f, null, 2131743044);
        this.f44732e0.addView(textView4, c8.ja.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f44732e0.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f43873b;

            {
                this.f43873b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f43873b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        return;
                    case 1:
                        y5.f0(this.f43873b);
                        return;
                    case 2:
                        y5.i0(this.f43873b);
                        return;
                    case 3:
                        this.f43873b.L0();
                        return;
                    default:
                        y5.d0(this.f43873b);
                        return;
                }
            }
        });
        c8.na.b(this.f44732e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44757y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f44757y.setClipToPadding(false);
        this.actionBar.addView(this.f44757y, c8.ja.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.f44757y.addView(view, c8.ja.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        w61 w61Var = new w61(this, context);
        this.F = w61Var;
        w61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        m5 m5Var = new m5(this, context);
        this.f44731e = m5Var;
        m5Var.setDiamondOnCard(true);
        this.f44731e.setCardOnClickListener(new View.OnClickListener(this) {
            public final y5 f43873b;

            {
                this.f43873b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f43873b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        return;
                    case 1:
                        y5.f0(this.f43873b);
                        return;
                    case 2:
                        y5.i0(this.f43873b);
                        return;
                    case 3:
                        this.f43873b.L0();
                        return;
                    default:
                        y5.d0(this.f43873b);
                        return;
                }
            }
        });
        this.f38880a.E2.f40156b.add(this.f44755x);
        j5 j5Var2 = new j5(this, context, 1);
        this.f44733f = j5Var2;
        j5Var2.setImportantForAccessibility(2);
        n5 n5Var = new n5(this, context);
        this.f44741n = n5Var;
        n5Var.setClipChildren(false);
        this.f44741n.setClipToPadding(false);
        this.f44741n.addView(this.f44731e, c8.ja.c(-2.0f, -1));
        oa0Var.addView(this.f44741n, c8.ja.c(-1.0f, -1));
        this.f38880a.setClipChildren(false);
        this.f38880a.setClipToPadding(false);
        this.f44750t0 = this.f44731e.getBalanceLayout();
        this.f44751u0 = this.f44731e.getBalanceView();
        this.f44752v0 = this.f44731e.getUsdBalanceView();
        this.f44731e.setCardHolder(q10.p(getUserConfig().f()).toUpperCase());
        this.B0 = 0.0f;
        z51 z51Var = new z51(25, context, this);
        this.A0 = z51Var;
        z51Var.setOrientation(0);
        this.A0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(hd.M0(2131743204, null));
        this.A0.addView(this.C0, c8.ja.m(1.0f, 0, 48, 0, 4, 0));
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f43873b;

            {
                this.f43873b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f43873b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        return;
                    case 1:
                        y5.f0(this.f43873b);
                        return;
                    case 2:
                        y5.i0(this.f43873b);
                        return;
                    case 3:
                        this.f43873b.L0();
                        return;
                    default:
                        y5.d0(this.f43873b);
                        return;
                }
            }
        });
        hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(hd.M0(2131743022, null));
        this.D0.setEnabled(l0.x(this.currentAccount).e());
        this.D0.setOnClickListener(new View.OnClickListener(this) {
            public final y5 f43873b;

            {
                this.f43873b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y5 y5Var = this.f43873b;
                        y5Var.getClass();
                        y5Var.presentFragment(new xa1(6, null));
                        return;
                    case 1:
                        y5.f0(this.f43873b);
                        return;
                    case 2:
                        y5.i0(this.f43873b);
                        return;
                    case 3:
                        this.f43873b.L0();
                        return;
                    default:
                        y5.d0(this.f43873b);
                        return;
                }
            }
        });
        this.A0.addView(this.D0, c8.ja.m(1.0f, 0, 48, 4, 0, 0));
        W0(this.f44731e.getStickerStyle());
        this.E0 = l0.x(this.currentAccount).B();
        this.f38880a.setDescendantFocusability(131072);
        c8 c8Var2 = new c8(this, this.f44731e, new k8.a(20, this, oa0Var), null);
        this.f44739k0 = c8Var2;
        oa0Var.addView(c8Var2, c8.ja.c(-1.0f, -1));
        this.f44740l0 = "";
        ai.r2 r2Var = new ai.r2(context, 9);
        this.f44743o0 = r2Var;
        r2Var.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(i7, this.f44743o0, getResourceProvider());
        hi.i1 i1Var = new hi.i1(this, context, this.resourceProvider, 9);
        this.f44745q0 = i1Var;
        i1Var.setAllowDisallowInterceptTouch(false);
        this.f44745q0.setAdapter(new di.f4(9, context, this));
        v61 i13 = this.f44745q0.i(-2, true);
        this.f44736h0 = i13;
        i13.g(i10, org.telegram.ui.ActionBar.j6.G6, i10, i12, i11);
        org.telegram.ui.ActionBar.q6.B(this.f44736h0, org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i11)), org.telegram.ui.ActionBar.q6.M(i11), getResourceProvider());
        this.f44737i0 = new FrameLayout(context);
        u8 u8Var = new u8(context, this.f44736h0, this.resourceProvider, new l4(this, 0), new l4(this, 1), new l4(this, 2));
        this.f44738j0 = u8Var;
        this.f44737i0.addView(u8Var, c8.ja.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f44745q0.setPosition(this.f44734f0);
        a1();
        this.f44743o0.addView(this.f44737i0, c8.ja.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f44743o0.addView(this.f44745q0, c8.ja.l(1.0f, -1, 0));
        M0(this.f44735g0);
        d0 d0Var2 = this.F0;
        if (d0Var2 != null) {
            this.f44739k0.Y(d0Var2);
        }
        this.f38880a.j(new ri(this, 23));
        p41 p41Var = this.f38880a.f39892g3;
        p41Var.f38199r = false;
        p41Var.O(false);
        u5 u5Var2 = new u5(this);
        this.f44747r0 = u5Var2;
        u5Var2.b(this.f38880a);
        S0();
        this.E0.h();
        this.actionBar.post(new e4(this, 10));
        this.f38880a.post(new e4(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.v3 v3Var;
        p41 p41Var;
        if (i10 == this.currentAccount) {
            if (i7 == ns.f25468a4 && this.f44751u0 != null) {
                S0();
                Iterator it = this.Q0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i7 == ns.f25611y3) {
                b1();
            } else if (i7 == ns.f25554q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.S0 = true;
                        this.T0 = ((TL_account.Password) obj).has_password;
                        bi.v3 v3Var2 = this.f38880a;
                        if (v3Var2 != null && (p41Var = v3Var2.f39892g3) != null) {
                            p41Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
            } else if (i7 == ns.f25474b4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                k0 k0Var = this.E0;
                if (obj2 == k0Var && (v3Var = this.f38880a) != null && v3Var.f39892g3 != null) {
                    if (k0Var.f44043b.isEmpty()) {
                        k0 k0Var2 = this.E0;
                        if (!k0Var2.h) {
                            k0Var2.h();
                        }
                    }
                    Y0(true);
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
        ci.a0 a0Var = this.N0;
        if (a0Var != null) {
            if (z10) {
                a0Var.e();
            }
            return false;
        }
        u8 u8Var = this.f44738j0;
        if (u8Var != null && u8Var.f44575y) {
            if (z10) {
                u8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        u5 u5Var = this.f44747r0;
        if (u5Var != null) {
            u5Var.c();
        }
        bi.v3 v3Var = this.f38880a;
        if (v3Var != null) {
            v3Var.C0();
        }
        u41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f26609b;
        if (z5.f44804k0.compareAndSet(false, true)) {
            z5.f44805l0.postRunnable(new f4(context, 2));
        }
        getNotificationCenter().c(this, ns.f25468a4);
        getNotificationCenter().c(this, ns.f25611y3);
        getNotificationCenter().c(this, ns.f25474b4);
        getNotificationCenter().c(this, ns.f25554q0);
        l0 x10 = l0.x(this.currentAccount);
        if (x10.f44090o == null) {
            x10.f44090o = new d0(x10);
        }
        d0 d0Var = x10.f44090o;
        this.F0 = d0Var;
        e4 e4Var = this.H0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(e4Var)) {
            arrayList.add(e4Var);
        }
        nb1 nb1Var = this.U0;
        if (nb1Var != null) {
            nb1Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        this.U0 = new nb1(x10, i7, 1);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ci.a0 a0Var = this.N0;
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
        c8 c8Var = this.f44739k0;
        if (c8Var != null) {
            c8Var.p();
        }
        m5 m5Var = this.f44731e;
        if (m5Var != null) {
            m5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.f44742n0;
        if (valueAnimator2 != null) {
            this.f44742n0 = null;
            valueAnimator2.cancel();
        }
        d0 d0Var = this.F0;
        if (d0Var != null) {
            d0Var.d.remove(this.H0);
        }
        Q0();
        u5 u5Var = this.f44747r0;
        if (u5Var != null) {
            u5Var.b(null);
        }
        getNotificationCenter().n(this, ns.f25468a4);
        getNotificationCenter().n(this, ns.f25611y3);
        getNotificationCenter().n(this, ns.f25474b4);
        getNotificationCenter().n(this, ns.f25554q0);
        org.telegram.messenger.g0.E2(this.F);
        k0 k0Var = this.E0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        nb1 nb1Var = this.U0;
        if (nb1Var != null) {
            nb1Var.run();
            this.U0 = null;
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f38880a.setPadding(0, 0, 0, i12);
        this.f38880a.setClipToPadding(false);
        z70 z70Var = this.f44727a0;
        if (z70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.f44727a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ci.a0 a0Var = this.N0;
        if (a0Var != null) {
            a0Var.g();
            org.telegram.messenger.g0.E2(this.N0);
            this.N0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                L0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(hd.M0(2131746503, null));
            alertDialog$Builder.k(hd.M0(2131747300, null), new h4(this));
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
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new e4(this, 10));
        }
        l0.x(this.currentAccount).E();
        if (this.F0 != null && l0.x(this.currentAccount).G()) {
            d0 d0Var = this.F0;
            if (!d0Var.f43719j) {
                d0Var.b();
                d0Var.f(true);
            }
        }
        S0();
        if (this.f38880a != null) {
            Y0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f44751u0 != null && this.f44752v0 != null && this.f44731e != null) {
                V0(this.f44758y0);
            }
            m5 m5Var = this.f44731e;
            if (m5Var != null && this.C0 != null && this.D0 != null) {
                W0(m5Var.getStickerStyle());
            }
            z70 z70Var = this.f44727a0;
            if (z70Var != null) {
                z70Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            i5 i5Var = this.T;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z10) {
        float f10;
        long j3;
        er erVar;
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
        U0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f10);
        this.K0 = ofFloat;
        if (z10) {
            j3 = 260;
        } else {
            j3 = 120;
        }
        ofFloat.setDuration(j3);
        ValueAnimator valueAnimator2 = this.K0;
        if (z10) {
            erVar = new er(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            erVar = new er(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(erVar);
        this.K0.addUpdateListener(new k4(this, 1));
        this.K0.addListener(new g71(this, 7));
        this.K0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ja.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29260z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ja.e(-2, -2, 21));
        frameLayout.setOnClickListener(new g3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.na.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, c8.ja.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        eq eqVar = new eq(2131231955, 0);
        eqVar.d = false;
        spannableStringBuilder.setSpan(eqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l0.o(j3, false));
        spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return hd.V(null, null, i7, spannableStringBuilder);
    }

    public final u41 y0() {
        View currentView;
        if (z0()) {
            hi.i1 i1Var = this.f44745q0;
            if (i1Var == null) {
                currentView = null;
            } else {
                currentView = i1Var.getCurrentView();
            }
            if (currentView instanceof u41) {
                return (u41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        ai.r2 r2Var;
        if (!this.f44744p0 && (r2Var = this.f44743o0) != null && r2Var.isAttachedToWindow()) {
            ViewParent parent = this.f44743o0.getParent();
            bi.v3 v3Var = this.f38880a;
            if (parent == v3Var.f39891f3.m(v3Var.f39892g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
