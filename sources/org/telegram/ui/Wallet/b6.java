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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.k20;
import org.telegram.messenger.m20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.d01;
import org.telegram.ui.hk;
import org.telegram.ui.ms0;
import org.telegram.ui.qr0;
import org.telegram.ui.qv0;
import org.telegram.ui.rc1;
import org.telegram.ui.s71;
import org.telegram.ui.ta0;
import org.telegram.ui.vb0;
import org.telegram.ui.ya;
import org.telegram.ui.zh;
public final class b6 extends s51 implements vs {
    public static Typeface U0;
    public float A0;
    public vh.d B0;
    public vh.d C0;
    public View D;
    public j0 D0;
    public fg.i E;
    public c0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.t0 L0;
    public qh.y M0;
    public int N0;
    public SpannableString Q0;
    public org.telegram.ui.Components.voip.j0 R;
    public boolean R0;
    public k5 S;
    public boolean S0;
    public FrameLayout T;
    public qq T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public p80 Z;
    public l5 f34243a0;
    public boolean f34244b0;
    public FrameLayout f34245c0;
    public FrameLayout f34246d0;
    public o5 e;
    public l5 f34248f;
    public boolean f34249f0;
    public w71 f34250g0;
    public int h;
    public FrameLayout f34251h0;
    public y8 f34252i0;
    public h8 f34253j0;
    public float f34255l0;
    public ValueAnimator m0;
    public p5 f34256n;
    public jg.z2 f34257n0;
    public boolean f34258o0;
    public hk f34259p0;
    public x5 f34260q0;
    public int f34261r;
    public boolean f34263s;
    public LinearLayout f34264s0;
    public org.telegram.ui.Components.f6 f34265t0;
    public org.telegram.ui.Components.f6 f34266u0;
    public k6 f34267v0;
    public r5 f34269w0;
    public float f34271x0;
    public FrameLayout f34272y;
    public float f34273y0;
    public s71 f34274z0;
    public final ew f34268w = new ew(this, 18);
    public final j4 f34270x = new xs() {
        @Override
        public final void a(int i10, boolean z10) {
            ii iiVar;
            b6 b6Var = b6.this;
            ew ewVar = b6Var.f34268w;
            if ((i10 != 1 && i10 != 3) || (iiVar = b6Var.f30217a) == null) {
                return;
            }
            b6Var.f34263s = z10;
            iiVar.removeCallbacks(ewVar);
            ewVar.run();
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
    public int f34247e0 = 0;
    public String f34254k0 = "";
    public final v51[] f34262r0 = new v51[2];
    public final f4 G0 = new f4(this, 3);
    public final f4 K0 = new f4(this, 4);
    public final CharSequence[] O0 = new CharSequence[2];
    public final HashSet P0 = new HashSet();

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

    public static void G0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, m20 m20Var, k20 k20Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        a3[] a3VarArr;
        View[] viewArr;
        k20 k20Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                rh.e4 e4Var = new rh.e4(context, i10, 0L, p6Var, null);
                e4Var.f46812a3 = wallettransaction;
                e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                e4Var.show();
                return;
            }
        }
        boolean z10 = true;
        a3[] a3VarArr2 = new a3[1];
        View[] viewArr2 = new View[1];
        j0 B = k0.x(i10).B();
        ArrayList arrayList = new ArrayList(B.f34736c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || k0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (m20Var == null && m0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232725).getPadding(rect);
            viewArr = viewArr2;
            ?? z4Var = new z4(context, p6Var, arrayList, B, i10, rect, viewArr);
            z4Var.setPosition(i11);
            a3VarArr = a3VarArr2;
            z4Var.setAdapter(new a5(arrayList, context, p6Var, rect, i10, a3VarArr2));
            k20Var2 = k20Var;
            t02 = z4Var;
        } else {
            a3VarArr = a3VarArr2;
            viewArr = viewArr2;
            k20Var2 = k20Var;
            t02 = t0(context, i10, wallettransaction, m20Var, k20Var, bArr, m0Var, p6Var, a3VarArr, false);
        }
        a3[] a3VarArr3 = a3VarArr;
        c5 c5Var = new c5(context, t02, p6Var, t02, viewArr, context);
        a3VarArr3[0] = c5Var;
        if ((t02 instanceof x71) && k20Var2 != null) {
            c5Var.n(new m2(3, k20Var2, wallettransaction));
        }
        a3 a3Var = a3VarArr3[0];
        if (m20Var == null) {
            z10 = false;
        }
        a3Var.A0(z10);
        a3 a3Var2 = a3VarArr3[0];
        a3Var2.T0 = false;
        a3Var2.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
        frameLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.b6.c(-2.0f, -1));
        linearLayout.addView(new a7(160, context, false), w7.b6.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(dd.L0(2131743123, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f7 = a30.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 0, 0, 0, 6), context);
        f7.setText(dd.L0(2131743122, null));
        int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.a7.V(f7, i11, p6Var);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(17);
        f7.setLineSpacing(org.telegram.messenger.i0.L(1.0f), 1.0f);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 0, 0, 0, 24));
        t5 t5Var = new t5(context, p6Var);
        t5Var.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var.a(2131232827, dd.L0(2131743045, null), dd.L0(2131743044, null));
        linearLayout.addView(t5Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t5 t5Var2 = new t5(context, p6Var);
        t5Var2.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var2.a(2131232825, dd.L0(2131743094, null), dd.L0(2131743093, null));
        linearLayout.addView(t5Var2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t5 t5Var3 = new t5(context, p6Var);
        t5Var3.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
        t5Var3.a(2131232829, dd.L0(2131743208, null), dd.L0(2131743207, null));
        linearLayout.addView(t5Var3, w7.b6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        vh.d i12 = a30.i(24, context, p6Var, true);
        i12.setText(dd.L0(2131743127, null));
        linearLayout.addView(i12, w7.b6.t(-1, 48, 1, 0, 0, 0, 0));
        w7.e6.b(i12, 0.02f, 1.1f);
        p80 p80Var = new p80(context, null);
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setGravity(17);
        p80Var.setText(Q0(dd.L0(2131743032, null), org.telegram.ui.ActionBar.t6.Uc, p6Var, new g4(context, 1)));
        linearLayout.addView(p80Var, w7.b6.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        k10.N = frameLayout;
        org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
        z2VarArr[0].u0(true);
        z2VarArr[0].O();
        i12.setOnClickListener(new n4(z2VarArr, 1));
        z2VarArr[0].show();
    }

    public static void J0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        k0 x10 = k0.x(i10);
        if (x10.G()) {
            String t10 = x10.t();
            if (TextUtils.isEmpty(t10)) {
                return;
            }
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, p6Var, false);
            z2Var.v0(-12207881);
            z2Var.P(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new a6());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.b6.f(-2.0f, -1, 55, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.f16167n));
            z5 z5Var = new z5(context, t10);
            linearLayout.addView(z5Var, w7.b6.r(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(dd.L0(2131743067, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.i0.L(1.0f), 1.0f);
            linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 24, 0, 24, 20));
            vh.d dVar = new vh.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new dq(2131232805, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.L0(2131743206, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.b6.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131231270);
            imageView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            imageView.setContentDescription(dd.L0(2131752041, null));
            w7.e6.a(imageView);
            frameLayout.addView(imageView, w7.b6.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            z2Var.N = frameLayout;
            z2Var.f21621x = true;
            z2Var.f21617u0 = false;
            z2Var.f21618v0 = false;
            z2Var.P(-12207881);
            imageView.setOnClickListener(new e4(z2Var, 0));
            z5Var.e = new q0(t10, 1);
            z2Var.show();
            z2Var.E0(-12207881);
            org.telegram.messenger.i0.t3(z2Var, -12207881, false, null);
            org.telegram.messenger.i0.m3(z2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && z2Var.getWindow() != null) {
                z2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ya(dVar, i10, z2Var, p6Var, 6));
        }
    }

    public static SpannableStringBuilder Q0(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new w5(i10, p6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Y0(v51 v51Var, boolean z10) {
        boolean canScrollVertically = v51Var.canScrollVertically(-1);
        v51Var.f31183f3.O(z10);
        v51Var.a0();
        if (!canScrollVertically) {
            v51Var.f31182e3.h1(0, 0);
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

    public static void d0(b6 b6Var) {
        k0 x10 = k0.x(b6Var.currentAccount);
        vh.d dVar = b6Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        x10.m0(new e2.n0((Object) x10, (Object) new d01(15, b6Var, x10), false, false, 4));
    }

    public static void e0(b6 b6Var) {
        gf.f.r(b6Var.getParentActivity(), k0.x(b6Var.currentAccount).f34787j);
    }

    public static void f0(b6 b6Var) {
        J0(b6Var.currentAccount, b6Var.getParentActivity(), b6Var.getResourceProvider());
    }

    public static void g0(b6 b6Var, String str, k0 k0Var, z60 z60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(2, b6Var.getParentActivity(), b6Var.resourceProvider, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        b1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = b1Var.f20166b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.i0.L(f7), 0);
        b1Var.setChecked(equals);
        b1Var.setOnClickListener(new j1(k0Var, currencyrate, z60Var, 2));
        linearLayout.addView(b1Var, w7.b6.o(200, -2));
    }

    public static void h0(b6 b6Var) {
        org.telegram.ui.ActionBar.l lVar;
        if (b6Var.E != null && (lVar = b6Var.actionBar) != null && (lVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) b6Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (b6Var.E.getParent() != b6Var.actionBar) {
                org.telegram.messenger.i0.E2(b6Var.E);
                b6Var.actionBar.addView(b6Var.E, w7.b6.c(-1.0f, -1));
            }
            b6Var.E.bringToFront();
            b6Var.actionBar.bringToFront();
            b6Var.E.post(new f4(b6Var, 10));
        }
    }

    public static void i0(b6 b6Var) {
        J0(b6Var.currentAccount, b6Var.getParentActivity(), b6Var.getResourceProvider());
    }

    public static void j0(b6 b6Var, String str) {
        Uri b12 = b1(str);
        String c12 = c1(b12);
        if (c12 != null) {
            int i10 = b6Var.currentAccount;
            wp.r1(i10).c2().a(c12, null, new ag.s2(new m4(b6Var, 4), i10));
        } else if ((b6Var.getParentActivity() instanceof LaunchActivity) && new ta0((LaunchActivity) b6Var.getParentActivity(), b6Var.currentAccount, null, false).g(b12)) {
        } else {
            org.telegram.messenger.i0.g3(new f4(b6Var, 11));
        }
    }

    public static void k0(b6 b6Var, LinearLayout linearLayout, k0 k0Var, z60 z60Var) {
        TL_wallet.currencyRate currencyrate;
        b6 b6Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g10 = k0Var2.h.g();
        TL_wallet.currencyRates f7 = k0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                zz zzVar = new zz(b6Var.getParentActivity(), b6Var.getResourceProvider());
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(31);
                linearLayout2.addView(zzVar, w7.b6.o(200, -2));
            }
            return;
        }
        f fVar = k0Var2.h;
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.f18945b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    f.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            f.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            f.a(linkedHashSet, ((org.telegram.messenger.q0) wp.r1(fVar.f34473a).f19300y7.O.f13481b).f17725c);
            f.c(linkedHashSet, dd.D0().f15365y);
            f.c(linkedHashSet, dd.D0().f15366z);
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
                g0(b6Var, g10, k0Var2, z60Var, linearLayout2, currencyrate7);
            }
            i13++;
            k0Var2 = k0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            b6Var2 = b6Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.h1(b6Var.getParentActivity(), b6Var2.resourceProvider), w7.b6.o(-1, 8));
        } else {
            b6Var2 = b6Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(b6Var2, g10, k0Var, z60Var, linearLayout2, currencyrate8);
            }
            i14++;
            b6Var2 = b6Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void l0(final b6 b6Var, Context context, View view) {
        boolean z10;
        k0 x10 = k0.x(b6Var.currentAccount);
        final z60 I = z60.I(b6Var, view);
        I.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
        I.f33044s = 0;
        I.V(5);
        z60 J = I.J();
        J.c(2131231241, dd.L0(2131743218, null), new qr0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        k7 k7Var = new k7(b6Var, linearLayout, x10, I, 11);
        J.r(scrollView, w7.b6.o(-1, 350));
        I.c(2131232813, dd.L0(2131743174, null), new g(k7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.b1 y3 = I.y();
        f fVar = x10.h;
        String i10 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i10);
        String str = i10;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131748789, null));
            spannableStringBuilder.setSpan(new u80(org.telegram.messenger.i0.L(75.0f), y3.f20166b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k7 k7Var2 = new k7(x10, new boolean[]{z10}, y3, k7Var, 12);
        b6Var.P0.add(k7Var2);
        k7Var.run();
        I.c(2131232831, dd.L0(2131747673, null), new Runnable(b6Var) {
            public final b6 f35120b;

            {
                this.f35120b = b6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b6 b6Var2 = this.f35120b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        b6 b6Var3 = this.f35120b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        return;
                    case 2:
                        b6 b6Var4 = this.f35120b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new s51());
                        return;
                    default:
                        I.u();
                        b6 b6Var5 = this.f35120b;
                        b6.I0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(2131232824, dd.L0(2131743106, null), new Runnable(b6Var) {
            public final b6 f35120b;

            {
                this.f35120b = b6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b6 b6Var2 = this.f35120b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        b6 b6Var3 = this.f35120b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        return;
                    case 2:
                        b6 b6Var4 = this.f35120b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new s51());
                        return;
                    default:
                        I.u();
                        b6 b6Var5 = this.f35120b;
                        b6.I0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(2131232804, dd.L0(2131743182, null), new Runnable(b6Var) {
            public final b6 f35120b;

            {
                this.f35120b = b6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b6 b6Var2 = this.f35120b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        b6 b6Var3 = this.f35120b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        return;
                    case 2:
                        b6 b6Var4 = this.f35120b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new s51());
                        return;
                    default:
                        I.u();
                        b6 b6Var5 = this.f35120b;
                        b6.I0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ x10.f34785g.d.isEmpty());
        I.k();
        I.c(2131232817, dd.L0(2131742986, null), new Runnable(b6Var) {
            public final b6 f35120b;

            {
                this.f35120b = b6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        b6 b6Var2 = this.f35120b;
                        b6Var2.getClass();
                        I.u();
                        b6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        b6 b6Var3 = this.f35120b;
                        b6Var3.getClass();
                        I.u();
                        b6Var3.presentFragment(new t8());
                        return;
                    case 2:
                        b6 b6Var4 = this.f35120b;
                        b6Var4.getClass();
                        I.u();
                        b6Var4.presentFragment(new s51());
                        return;
                    default:
                        I.u();
                        b6 b6Var5 = this.f35120b;
                        b6.I0(b6Var5.getParentActivity(), b6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f33039p = new m2(5, b6Var, k7Var2);
        I.Z();
    }

    public static void m0(b6 b6Var, long j10) {
        f4 f4Var = b6Var.K0;
        if (b6Var.f30217a != null) {
            y8 y8Var = b6Var.f34252i0;
            if (y8Var != null) {
                y8Var.a();
            }
            if (b6Var.I0 <= 0.0f && b6Var.A0()) {
                int top = b6Var.f30217a.f31182e3.m(b6Var.h).getTop() - b6Var.f30217a.getPaddingTop();
                b6Var.f30217a.C0();
                if (top < 0) {
                    b6Var.f30217a.w0(0, top, gr.h);
                    return;
                }
                return;
            }
            b6Var.f30217a.C0();
            b6Var.s0(true);
            org.telegram.messenger.i0.r(f4Var);
            if (j10 > 0) {
                org.telegram.messenger.i0.h3(f4Var, j10 + 260);
            }
        }
    }

    public static Typeface r0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        return U0;
    }

    public static android.widget.LinearLayout t0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.m20 r46, org.telegram.messenger.k20 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.p6 r50, org.telegram.ui.Wallet.a3[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b6.t0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.m20, org.telegram.messenger.k20, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.p6, org.telegram.ui.Wallet.a3[], boolean):android.widget.LinearLayout");
    }

    public static String v0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder w0(int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        dq dqVar = new dq(2131232816, 2);
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(16.0f));
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence m10 = k0.x(i10).m(j10, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.f21331z6, p6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        ii iiVar = this.f30217a;
        if (iiVar != null && (m10 = iiVar.f31182e3.m(this.h)) != null && this.f34273y0 < 0.5f && m10.getBottom() > this.f30217a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void D0() {
        c0 c0Var;
        v51 v51Var = this.f34262r0[1];
        if (this.f34247e0 == 1 && v51Var != null && v51Var.G && (c0Var = this.E0) != null && !c0Var.f34303i && !c0Var.f34302g && c0Var.f34305k == null && v51Var.f31182e3.N0() >= v51Var.f31183f3.D.size() - 3) {
            this.E0.e();
        }
    }

    public final void E0() {
        j0 j0Var;
        v51 v51Var = this.f34262r0[0];
        if (v51Var != null && v51Var.G && (j0Var = this.D0) != null && !j0Var.h && v51Var.f31182e3.N0() >= v51Var.f31183f3.D.size() - 3) {
            this.D0.h();
        }
    }

    public final CharSequence F0(int i10) {
        org.telegram.ui.Components.f6 f6Var;
        float f7;
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                f6Var = this.f34265t0;
            } else {
                f6Var = this.f34266u0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            u80 u80Var = new u80(org.telegram.messenger.i0.L(f7), f6Var);
            u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.45f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(u80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void H0(TL_wallet.nftItem nftitem) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_stars.StarGift starGift = nftitem.gift;
        String str2 = null;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            rh.e4 e4Var = new rh.e4(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            e4Var.X2 = nftitem;
            if (this.f34253j0 != null) {
                e4Var.Y2 = new i5(this, tL_starGiftUnique, nftitem);
                e4Var.Z2 = new j5(this, nftitem);
            }
            e4Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(e4Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i15 = org.telegram.ui.ActionBar.t6.f20873a7;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i15, resourceProvider);
            int i16 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.t6.w0(i16, resourceProvider);
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) parentActivity, resourceProvider, false);
            z2Var.f21585a0 = i15;
            z2Var.v0(w02);
            z2Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f7 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
            g9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232833).mutate();
            int i17 = org.telegram.ui.ActionBar.t6.f21331z6;
            org.telegram.ui.ActionBar.a7.y(g9Var, mutate, i17, resourceProvider, PorterDuff.Mode.SRC_IN);
            jc c10 = c.c(nftitem, false);
            if (c10 != null) {
                g9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                g9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(g9Var, w7.b6.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = dd.L0(2131743202, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.m5.m(textView, i16, resourceProvider, 1, 17.0f);
            int i18 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, w7.b6.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.a7.V(textView2, i17, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            linearLayout.addView(textView2, w7.b6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i19 = 0;
            while (i19 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i18);
                int L = org.telegram.messenger.i0.L(16.0f);
                int i20 = org.telegram.ui.ActionBar.t6.f20930d6;
                int w03 = org.telegram.ui.ActionBar.t6.w0(i20, resourceProvider);
                int i21 = org.telegram.ui.ActionBar.t6.f21021i6;
                int w04 = org.telegram.ui.ActionBar.t6.w0(i21, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i20);
                org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i21);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.a7.k(linearLayout3, k02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i19 == 0) {
                    i11 = 2131743007;
                } else {
                    i11 = 2131743049;
                }
                String L0 = dd.L0(i11, str2);
                linearLayout3.setContentDescription(L0);
                ImageView imageView = new ImageView(parentActivity);
                if (i19 == 0) {
                    i12 = 2131232844;
                } else {
                    i12 = 2131232837;
                }
                imageView.setImageResource(i12);
                imageView.setImportantForAccessibility(2);
                int i22 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.a7.t(imageView, i22, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, w7.b6.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(L0);
                float f10 = f7;
                org.telegram.messenger.m5.m(textView3, i22, resourceProvider, 1, f10);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i19 == 0) {
                    i13 = 0;
                } else {
                    i13 = 4;
                }
                if (i19 == 0) {
                    i14 = 4;
                } else {
                    i14 = 0;
                }
                linearLayout2.addView(linearLayout3, w7.b6.m(1.0f, 0, -1, i13, i14, 0));
                i19++;
                f7 = f10;
                i18 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                xy0 xy0Var = new xy0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.i0.L(10.0f);
                int i23 = org.telegram.ui.ActionBar.t6.f20930d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i23, resourceProvider));
                org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i23);
                xy0Var.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(xy0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i24 = 0;
                while (i24 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i24);
                    i24++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    xy0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(xy0Var, w7.b6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            vh.d dVar = new vh.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(dd.L0(2131743089, null));
            linearLayout.addView(dVar, w7.b6.o(-1, 48));
            z2Var.N = scrollView;
            z2Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new qv0(13, z2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new j3(parentActivity, 1));
            dVar.setOnClickListener(new j3(z2Var, 2));
            z2Var.show();
            z2Var.P(w02);
            org.telegram.messenger.i0.t3(z2Var, w02, false, null);
        }
    }

    public final void K0() {
        if (getParentActivity() != null && this.M0 == null && this.L0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.M0 = qh.y.k(this, this.L0, new zh(9), new m4(this, 3), new f4(this, 8));
            }
        }
    }

    public final void L0(boolean z10) {
        float f7;
        boolean z11;
        this.f34249f0 = z10;
        if (!z10) {
            this.f34247e0 = 0;
        }
        if (this.f34259p0 != null && this.f34251h0 != null) {
            if (!z10) {
                this.f34252i0.b(false);
                this.f34259p0.setPosition(0);
            }
            Z0();
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
            if (this.f34257n0.isAttachedToWindow() && this.f34257n0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f34259p0.o(false);
            }
            if (z11 && this.f34255l0 != f7) {
                this.f34251h0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34255l0, f7);
                this.m0 = ofFloat;
                ofFloat.setDuration(250L);
                this.m0.setInterpolator(gr.h);
                this.m0.addUpdateListener(new l4(this, 0));
                this.m0.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 7));
                this.m0.start();
            } else {
                M0(f7);
                this.f34259p0.o(false);
            }
            if (this.f30217a != null && this.f34258o0 != N0()) {
                X0(false);
            }
        }
    }

    public final void M0(float f7) {
        int i10;
        this.f34255l0 = f7;
        FrameLayout frameLayout = this.f34251h0;
        if (f7 <= 0.0f && this.m0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        this.f34251h0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34251h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.i0.L(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.i0.L(6.0f) * f7);
        this.f34251h0.setLayoutParams(layoutParams);
    }

    public final boolean N0() {
        j0 j0Var;
        if (!this.f34249f0 && (j0Var = this.D0) != null && j0Var.f34736c.isEmpty()) {
            j0 j0Var2 = this.D0;
            j0Var2.getClass();
            if (j0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0() {
        this.F0 = false;
        y8 y8Var = this.f34252i0;
        if (y8Var != null) {
            y8Var.b(false);
        }
        this.f34247e0 = 0;
        hk hkVar = this.f34259p0;
        if (hkVar != null) {
            hkVar.setPosition(0);
        }
    }

    public final void P0() {
        this.f34263s = false;
        ii iiVar = this.f30217a;
        if (iiVar != null) {
            iiVar.D2.f33219b.remove(this.f34270x);
            this.f30217a.removeCallbacks(this.f34268w);
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void R0() {
        boolean z10;
        k0 x10 = k0.x(this.currentAccount);
        a1();
        vh.d dVar = this.C0;
        if (x10.G() && x10.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!x10.G()) {
            this.f34265t0.setText(F0(0));
            this.f34266u0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            o5 o5Var = this.e;
            o5Var.getClass();
            k6 k6Var = new k6(o5Var);
            this.f34267v0 = k6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(k6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) l6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) dd.L0(2131749525, null));
        if (this.f34269w0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f35122a = -9577217;
            this.f34269w0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f34269w0, length, spannableStringBuilder.length(), 33);
        this.f34265t0.setText(spannableStringBuilder);
        CharSequence m10 = k0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.f34266u0.setText(F0(1));
        } else {
            this.f34266u0.setText(m10);
        }
        U0(this.f34271x0);
        c0 c0Var = this.E0;
        if (c0Var != null && !c0Var.h && !c0Var.f34303i && c0Var.f34305k == null) {
            c0Var.e();
        }
        String t10 = x10.t();
        if (!TextUtils.isEmpty(t10)) {
            this.e.setCardNumber(v0(t10.toUpperCase()));
        }
    }

    public final void S0() {
        float[] fArr;
        float[] fArr2;
        float f7;
        Rect rect = this.G;
        if (!rect.isEmpty() && this.D.isAttachedToWindow()) {
            o5 o5Var = this.e;
            fg.i iVar = this.E;
            Matrix matrix = this.H;
            if (o5Var.g(iVar, matrix)) {
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
                fg.i iVar2 = this.E;
                int[] iArr = this.O;
                iVar2.getLocationInWindow(iArr);
                View view = this.D;
                int[] iArr2 = this.N;
                view.getLocationInWindow(iArr2);
                this.e.i(this.f34271x0, this.f34272y.getWidth() / 0.7826087f);
                float f11 = iArr2[0] - iArr[0];
                float x10 = org.telegram.ui.Cells.f1.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = i13 * 2;
                    float T1 = org.telegram.messenger.i0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.f34271x0);
                    float[] fArr3 = this.M;
                    fArr3[i14] = T1;
                    int i15 = i14 + 1;
                    fArr3[i15] = org.telegram.messenger.i0.T1(fArr2[i15], (fArr[i15] * 0.7826087f) + x10, this.f34271x0);
                }
                Matrix matrix2 = this.J;
                boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
                Matrix matrix3 = this.I;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.E.invalidate();
                }
                o5 o5Var2 = this.e;
                Matrix matrix4 = o5Var2.f34852c;
                Matrix matrix5 = o5Var2.e;
                Matrix matrix6 = o5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!o5Var2.f34861n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        o5Var2.f34861n = true;
                        o5Var2.N.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.i0.T1(1.0f, 1.0952381f, this.f34271x0);
                this.f34266u0.setPivotX(0.0f);
                this.f34266u0.setPivotY(0.0f);
                this.f34266u0.setScaleX(T12);
                this.f34266u0.setScaleY(T12);
            }
        }
    }

    public final void T0() {
        fg.i iVar;
        float i10;
        boolean z10;
        float f7;
        o5 o5Var;
        int i11;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f10;
        float height;
        o5 o5Var2;
        if (this.f30217a != null && this.e != null && this.f34264s0 != null && this.D != null && (iVar = this.E) != null && this.actionBar != null) {
            iVar.bringToFront();
            View m10 = this.f30217a.f31182e3.m(this.h);
            if (m10 == null) {
                if (this.f30217a.f31182e3.L0() > this.h) {
                    i10 = 1.0f;
                } else {
                    i10 = 0.0f;
                }
            } else {
                i10 = Utilities.i((this.f30217a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f34273y0 = i10;
            int i12 = (this.I0 > 0.0f ? 1 : (this.I0 == 0.0f ? 0 : -1));
            if (i12 <= 0 && this.H0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i12 > 0) {
                    i10 = 0.0f;
                } else {
                    i10 = (1.0f - this.H0) * i10;
                }
            }
            this.f34271x0 = i10;
            W0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.i0.L(24.0f)) * this.f34271x0;
            } else {
                f7 = 0.0f;
            }
            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.8f, this.f34271x0);
            this.e.setPivotX(o5Var.getWidth() * 0.5f);
            this.e.setPivotY(0.0f);
            this.e.setScaleX(T1);
            this.e.setScaleY(T1);
            this.e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.i0.z1(i10, 0.75f, 1.0f)));
            o5 o5Var3 = this.e;
            if (!z10 && (m10 == null || i10 >= 1.0f || m10.getBottom() <= this.f30217a.getPaddingTop() || m10.getTop() >= this.f30217a.getHeight() - this.f30217a.getPaddingBottom())) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            o5Var3.setVisibility(i11);
            int[] iArr = this.Q;
            int[] iArr2 = this.P;
            if (m10 != null) {
                this.f30217a.getLocationInWindow(iArr2);
                this.f34256n.getLocationInWindow(iArr);
                r16 = 1;
                this.e.setTranslationX(((this.f34248f.getWidth() - this.e.getWidth()) / 2.0f) + this.f34248f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.e.setTranslationY(this.f34248f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f7);
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
                this.f34256n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.i0.L(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f13 = 1.0f - f11;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.e.getHeight() * 0.35f;
                }
                float f14 = L - (f13 * height);
                if (z12) {
                    f14 = a1.g.A(0.9f - f12, this.e.getHeight(), 2.0f, f14);
                }
                float width = (this.f34256n.getWidth() - this.e.getWidth()) / 2.0f;
                if (!z12) {
                    f11 = Math.min(1.0f, f11 * 2.0f);
                }
                if (m10 != null) {
                    this.f30217a.getLocationInWindow(iArr2);
                    float width2 = ((this.f34248f.getWidth() - this.e.getWidth()) / 2.0f) + this.f34248f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y3 = this.f34248f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l4 = Utilities.l(1.0f - ((f14 - y3) / (this.e.getHeight() * 0.5f)));
                    if (l4 >= 1.0f) {
                        org.telegram.messenger.i0.r(this.K0);
                        ValueAnimator valueAnimator = this.J0;
                        if (valueAnimator != null) {
                            this.J0 = null;
                            valueAnimator.cancel();
                        }
                        this.H0 = 0.0f;
                        this.I0 = 0.0f;
                        T0();
                        return;
                    }
                    width = org.telegram.messenger.i0.T1(width, width2, l4);
                    f14 = org.telegram.messenger.i0.T1(f14, y3, l4);
                    f12 = org.telegram.messenger.i0.T1(f12, 1.0f, l4);
                    f11 = org.telegram.messenger.i0.T1(f11, 1.0f, l4);
                }
                this.e.setPivotX(o5Var2.getWidth() * 0.5f);
                this.e.setPivotY(0.0f);
                this.e.setScaleX(f12);
                this.e.setScaleY(f12);
                this.e.setTranslationX(width);
                this.e.setTranslationY(f14);
                this.e.setAlpha(f11);
            }
            if (i10 > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.F != z11 && (linearLayout = this.f34264s0) != null) {
                Rect rect = this.G;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f34264s0.getHeight() != 0) {
                        rect.set(this.f34264s0.getLeft(), this.f34264s0.getTop(), this.f34264s0.getRight(), this.f34264s0.getBottom());
                    }
                }
                this.e.setOnFrontContentPresented(null);
                org.telegram.messenger.i0.E2(this.f34264s0);
                this.F = z11;
                if (z11) {
                    this.E.addView(this.f34264s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f34264s0.layout(0, 0, rect.width(), rect.height());
                    S0();
                } else {
                    o5 o5Var4 = this.e;
                    o5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = o5Var4.M;
                    org.telegram.messenger.i0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    j6 j6Var = o5Var4.O;
                    j6Var.setScaleX(1.0f);
                    j6Var.setScaleY(1.0f);
                    o5Var4.E.addView(linearLayout2, o5Var4.P);
                    this.f34264s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.e.getClass();
                    S0();
                }
                this.E.invalidate();
            }
            U0(i10);
            if (this.F) {
                S0();
            }
            float f15 = 1.0f - i10;
            float f16 = (1.0f - f15) * (-org.telegram.messenger.i0.L(8.0f));
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

    public final void U0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.G6);
        this.f34265t0.setTextColor(org.telegram.messenger.i0.d2(f7, -1, themedColor));
        org.telegram.ui.Components.f6 f6Var = this.f34266u0;
        float[] fArr = this.e.f34849a0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.b.f(fArr[8], v7.p(-7868417, 0, fArr), v7.p(-7868417, 3, fArr));
        }
        f6Var.setTextColor(org.telegram.messenger.i0.d2(f7, i10, i0.b.o(themedColor, Math.round(142.8f))));
        k6 k6Var = this.f34267v0;
        if (k6Var != null) {
            k6Var.f25572y = org.telegram.messenger.i0.d2(f7, -1, getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
        }
        r5 r5Var = this.f34269w0;
        if (r5Var != null) {
            float[] fArr2 = this.e.f34849a0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.b.f(fArr2[8], v7.p(-9577217, 0, fArr2), v7.p(-9577217, 3, fArr2));
            }
            r5Var.f35122a = i0.b.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.f34265t0.invalidate();
    }

    public final void V0(float[] fArr) {
        boolean z10;
        float f7;
        int n10;
        if (this.B0 != null && this.C0 != null) {
            float f10 = v7.j(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7))[0];
            if (f10 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci);
            float f11 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = i10 * 4;
                    float f12 = fArr[i11 + 10];
                    if (f12 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = v7.n(themedColor, (int) f12, (int) fArr[i11 + 11]);
                    }
                    iArr[i10] = n10;
                }
                themedColor = i0.b.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z10) {
                f11 = f10 + 0.25f;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = f10 - 0.2f;
            }
            float[] j10 = v7.j(themedColor);
            float f13 = j10[0];
            int i12 = -16777216;
            if (f13 < f11 || f13 > f7) {
                themedColor = (themedColor & (-16777216)) | (v7.l(Math.max(f11, Math.min(f7, f13)), j10[1], j10[2]) & 16777215);
            }
            if (themedColor != this.N0) {
                this.N0 = themedColor;
                if (i0.b.h(themedColor) <= 0.550000011920929d) {
                    i12 = getThemedColor(org.telegram.ui.ActionBar.t6.Gi);
                }
                vh.d[] dVarArr = {this.B0, this.C0};
                for (int i13 = 0; i13 < 2; i13++) {
                    vh.d dVar = dVarArr[i13];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i12);
                }
            }
        }
    }

    public final void W0() {
        ii iiVar = this.f30217a;
        if (iiVar != null && this.e != null) {
            float b10 = iiVar.D2.b(1);
            float min = Math.min(10.0f, this.f30217a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.e.setAdditionalTilt(Math.max(0.0f, (this.f34271x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.f34271x0))) * 90.0f) - 10.0f)) + min);
            this.e.setUseGyroscope(1.0f - ((float) Math.pow(this.f34271x0, 0.33000001311302185d)));
        }
    }

    public final void X0(boolean z10) {
        boolean N0 = N0();
        ii iiVar = this.f30217a;
        v51[] v51VarArr = this.f34262r0;
        if (iiVar != null && this.f34258o0 != N0) {
            this.f34258o0 = N0;
            iiVar.C0();
            for (v51 v51Var : v51VarArr) {
                if (v51Var != null) {
                    v51Var.C0();
                }
            }
            this.f30217a.f31183f3.O(false);
            this.f30217a.f31182e3.h1(0, 0);
            this.f30217a.post(new f4(this, 10));
        }
        if (!N0) {
            for (v51 v51Var2 : v51VarArr) {
                if (v51Var2 != null) {
                    Y0(v51Var2, z10);
                }
            }
            jg.z2 z2Var = this.f34257n0;
            if (z2Var != null) {
                z2Var.post(new f4(this, 5));
                this.f34257n0.post(new f4(this, 6));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
        k0 x10 = k0.x(this.currentAccount);
        a1();
        arrayList.add(b51.m(this.R));
        this.h = arrayList.size();
        l5 l5Var = this.f34248f;
        b51 b51Var = new b51(-4);
        b51Var.f24637c = l5Var;
        b51Var.f24656z = -1;
        b51Var.e = true;
        arrayList.add(b51Var);
        arrayList.add(b51.m(this.f34274z0));
        boolean N0 = N0();
        this.f34258o0 = N0;
        if (N0) {
            String L0 = dd.L0(2131743045, null);
            String L02 = dd.L0(2131743044, null);
            int i10 = s5.f35187b;
            b51 K = b51.K(s5.class);
            K.f24642k = 2131232827;
            K.f24643l = L0;
            K.f24644m = L02;
            arrayList.add(K);
            String L03 = dd.L0(2131743094, null);
            String L04 = dd.L0(2131743093, null);
            b51 K2 = b51.K(s5.class);
            K2.f24642k = 2131232825;
            K2.f24643l = L03;
            K2.f24644m = L04;
            arrayList.add(K2);
            String L05 = dd.L0(2131743208, null);
            String L06 = dd.L0(2131743207, null);
            b51 K3 = b51.K(s5.class);
            K3.f24642k = 2131232829;
            K3.f24643l = L05;
            K3.f24644m = L06;
            arrayList.add(K3);
            arrayList.add(b51.m(this.f34243a0));
        } else if (this.f34257n0 != null) {
            if (this.R0 && !this.S0 && x10.v() > 500000000) {
                arrayList.add(b51.k(this.f34245c0));
            }
            jg.z2 z2Var = this.f34257n0;
            b51 b51Var2 = new b51(-3);
            b51Var2.f24637c = z2Var;
            b51Var2.f24656z = 0;
            b51Var2.f24655y = 1;
            arrayList.add(b51Var2);
        }
        p80 p80Var = this.Z;
        if (p80Var != null) {
            this.f34244b0 = false;
            p80Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void Z0() {
        y8 y8Var = this.f34252i0;
        if (y8Var != null && this.f34259p0 != null && y8Var.f35430x != 0.0f) {
            y8Var.f35430x = 0.0f;
            y8Var.f35424c.setVisibility(8);
            y8Var.invalidate();
        }
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131743029, null);
    }

    public final void a1() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.S == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        boolean z13 = false;
        if (this.S.isAttachedToWindow() && this.S.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k5 k5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.f34786i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(x10.f34787j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        k5Var.i(frameLayout, z11, z10);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (!g0Var.e) {
                long j11 = g0Var.f34533c;
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
            this.W.setText(x0(2131743088, j10));
        }
        this.S.i(this.V, z12, z10);
        long j12 = rh.e6.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Y.setText(x0(2131743126, j12));
        }
        this.S.i(this.X, z13, z10);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        c0 c0Var;
        Object obj = b51Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
        } else if (b51Var.d == -10001 && (c0Var = this.E0) != null) {
            c0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) b51Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        h8 h8Var;
        if ((view instanceof u7) && (h8Var = this.f34253j0) != null) {
            h8Var.S((u7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        h8 h8Var = this.f34253j0;
        if ((h8Var == null || !h8Var.f34666p0) && super.canBeginSlide()) {
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
        P0();
        x5 x5Var = this.f34260q0;
        if (x5Var != null) {
            x5Var.b(null);
        }
        this.f34248f = null;
        this.S = null;
        this.R = null;
        this.f34257n0 = null;
        this.f34259p0 = null;
        v51[] v51VarArr = this.f34262r0;
        v51VarArr[0] = null;
        v51VarArr[1] = null;
        c0 c0Var = this.E0;
        if (c0Var != null && !c0Var.f34298a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34249f0 = z10;
        if (!z10) {
            this.f34247e0 = 0;
        } else if (this.F0) {
            this.f34247e0 = 1;
        }
        h8 h8Var = this.f34253j0;
        if (h8Var != null) {
            h8Var.p();
        }
        this.f34253j0 = null;
        View createView = super.createView(context);
        vb0 vb0Var = new vb0(this, context);
        vb0Var.addView(createView, w7.b6.c(-1.0f, -1));
        this.fragmentView = vb0Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f20873a7;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        org.telegram.ui.ActionBar.t0 a2 = p5.a(2, 2131232675);
        this.L0 = a2;
        a2.setOnClickListener(new View.OnClickListener(this) {
            public final b6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f34622b;
                        b6Var.getClass();
                        b6Var.presentFragment(new rc1(6, null));
                        return;
                    case 1:
                        b6.f0(this.f34622b);
                        return;
                    case 2:
                        b6.i0(this.f34622b);
                        return;
                    case 3:
                        this.f34622b.K0();
                        return;
                    default:
                        b6.d0(this.f34622b);
                        return;
                }
            }
        });
        p5.a(1, 2131231245).setOnClickListener(new qv0(15, this, context));
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(this, context, 1);
        this.R = j0Var;
        j0Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        k5 k5Var = new k5(this, context);
        this.S = k5Var;
        k5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new f4(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(dd.L0(2131742988, null));
        this.T = u0(this.U, new f4(this, 0));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = u0(textView2, new f4(this, 1));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = u0(textView3, new f4(this, 2));
        this.R.addView(this.S, w7.b6.c(-2.0f, -1));
        p80 p80Var = new p80(context, null);
        this.Z = p80Var;
        this.f34244b0 = false;
        p80Var.setAlpha(0.0f);
        p80 p80Var2 = this.Z;
        int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.a7.V(p80Var2, i11, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(Q0(dd.L0(2131743032, null), org.telegram.ui.ActionBar.t6.Uc, this.resourceProvider, new g4(context, 0)));
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, w7.b6.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        l5 l5Var = new l5(this, context, 0);
        this.f34243a0 = l5Var;
        l5Var.setImportantForAccessibility(2);
        this.f34245c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34246d0 = frameLayout2;
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.t6.b0(themedColor, org.telegram.ui.ActionBar.t6.w(themedColor2, getThemedColor(i13)), 16, 16);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i12, i13);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, b02, N, q6, resourceProvider);
        this.f34245c0.addView(this.f34246d0, w7.b6.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.i0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232834);
        this.f34246d0.addView(imageView, w7.b6.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21171q7, this.resourceProvider);
        sc.e.u(textView4, 1, 16.0f, null, 2131743070);
        this.f34246d0.addView(textView4, w7.b6.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f34246d0.setOnClickListener(new View.OnClickListener(this) {
            public final b6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f34622b;
                        b6Var.getClass();
                        b6Var.presentFragment(new rc1(6, null));
                        return;
                    case 1:
                        b6.f0(this.f34622b);
                        return;
                    case 2:
                        b6.i0(this.f34622b);
                        return;
                    case 3:
                        this.f34622b.K0();
                        return;
                    default:
                        b6.d0(this.f34622b);
                        return;
                }
            }
        });
        w7.e6.b(this.f34246d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f34272y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f34272y.setClipToPadding(false);
        this.actionBar.addView(this.f34272y, w7.b6.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.D = view;
        this.f34272y.addView(view, w7.b6.e(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        fg.i iVar = new fg.i(this, context);
        this.E = iVar;
        iVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        o5 o5Var = new o5(this, context);
        this.e = o5Var;
        o5Var.setDiamondOnCard(true);
        this.e.setCardOnClickListener(new View.OnClickListener(this) {
            public final b6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f34622b;
                        b6Var.getClass();
                        b6Var.presentFragment(new rc1(6, null));
                        return;
                    case 1:
                        b6.f0(this.f34622b);
                        return;
                    case 2:
                        b6.i0(this.f34622b);
                        return;
                    case 3:
                        this.f34622b.K0();
                        return;
                    default:
                        b6.d0(this.f34622b);
                        return;
                }
            }
        });
        this.f30217a.D2.f33219b.add(this.f34270x);
        l5 l5Var2 = new l5(this, context, 1);
        this.f34248f = l5Var2;
        l5Var2.setImportantForAccessibility(2);
        p5 p5Var = new p5(this, context);
        this.f34256n = p5Var;
        p5Var.setClipChildren(false);
        this.f34256n.setClipToPadding(false);
        this.f34256n.addView(this.e, w7.b6.c(-2.0f, -1));
        vb0Var.addView(this.f34256n, w7.b6.c(-1.0f, -1));
        this.f30217a.setClipChildren(false);
        this.f30217a.setClipToPadding(false);
        this.f34264s0 = this.e.getBalanceLayout();
        this.f34265t0 = this.e.getBalanceView();
        this.f34266u0 = this.e.getUsdBalanceView();
        this.e.setCardHolder(i20.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        s71 s71Var = new s71(this, context, 19);
        this.f34274z0 = s71Var;
        s71Var.setOrientation(0);
        this.f34274z0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(dd.L0(2131743230, null));
        this.f34274z0.addView(this.B0, w7.b6.m(1.0f, 0, 48, 0, 4, 0));
        this.B0.setOnClickListener(new View.OnClickListener(this) {
            public final b6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f34622b;
                        b6Var.getClass();
                        b6Var.presentFragment(new rc1(6, null));
                        return;
                    case 1:
                        b6.f0(this.f34622b);
                        return;
                    case 2:
                        b6.i0(this.f34622b);
                        return;
                    case 3:
                        this.f34622b.K0();
                        return;
                    default:
                        b6.d0(this.f34622b);
                        return;
                }
            }
        });
        vh.d dVar2 = new vh.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(dd.L0(2131743048, null));
        this.C0.setEnabled(k0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final b6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        b6 b6Var = this.f34622b;
                        b6Var.getClass();
                        b6Var.presentFragment(new rc1(6, null));
                        return;
                    case 1:
                        b6.f0(this.f34622b);
                        return;
                    case 2:
                        b6.i0(this.f34622b);
                        return;
                    case 3:
                        this.f34622b.K0();
                        return;
                    default:
                        b6.d0(this.f34622b);
                        return;
                }
            }
        });
        this.f34274z0.addView(this.C0, w7.b6.m(1.0f, 0, 48, 4, 0, 0));
        V0(this.e.getStickerStyle());
        this.D0 = k0.x(this.currentAccount).B();
        this.f30217a.setDescendantFocusability(131072);
        h8 h8Var2 = new h8(this, this.e, new m4.c(20, this, vb0Var), null);
        this.f34253j0 = h8Var2;
        vb0Var.addView(h8Var2, w7.b6.c(-1.0f, -1));
        this.f34254k0 = "";
        jg.z2 z2Var = new jg.z2(context, 9);
        this.f34257n0 = z2Var;
        z2Var.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(i10, this.f34257n0, getResourceProvider());
        hk hkVar = new hk(this, context, this.resourceProvider, 6);
        this.f34259p0 = hkVar;
        hkVar.setAllowDisallowInterceptTouch(false);
        this.f34259p0.setAdapter(new mg.s(this, context, 8));
        w71 n10 = this.f34259p0.n(-2, true);
        this.f34250g0 = n10;
        n10.g(i11, org.telegram.ui.ActionBar.t6.G6, i11, i13, i12);
        org.telegram.ui.ActionBar.a7.C(this.f34250g0, org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), getThemedColor(i12)), org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
        this.f34251h0 = new FrameLayout(context);
        y8 y8Var = new y8(context, this.f34250g0, this.resourceProvider, new m4(this, 0), new m4(this, 1), new m4(this, 2));
        this.f34252i0 = y8Var;
        this.f34251h0.addView(y8Var, w7.b6.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f34259p0.setPosition(this.f34247e0);
        Z0();
        this.f34257n0.addView(this.f34251h0, w7.b6.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f34257n0.addView(this.f34259p0, w7.b6.l(1.0f, -1, 0));
        L0(this.f34249f0);
        c0 c0Var2 = this.E0;
        if (c0Var2 != null) {
            this.f34253j0.Y(c0Var2);
        }
        this.f30217a.j(new cu0(this, 6));
        q51 q51Var = this.f30217a.f31183f3;
        q51Var.f29638r = false;
        q51Var.O(false);
        x5 x5Var2 = new x5(this);
        this.f34260q0 = x5Var2;
        x5Var2.b(this.f30217a);
        R0();
        this.D0.h();
        this.actionBar.post(new f4(this, 9));
        this.f30217a.post(new f4(this, 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        q51 q51Var;
        if (i11 == this.currentAccount) {
            if (i10 == at.f14678a4 && this.f34265t0 != null) {
                R0();
                Iterator it = this.P0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i10 == at.y3) {
                a1();
            } else if (i10 == at.f14766q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.R0 = true;
                        this.S0 = ((TL_account.Password) obj).has_password;
                        ii iiVar2 = this.f30217a;
                        if (iiVar2 != null && (q51Var = iiVar2.f31183f3) != null) {
                            q51Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new a3.b(1), new d(this, 7));
            } else if (i10 == at.f14684b4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                j0 j0Var = this.D0;
                if (obj2 == j0Var && (iiVar = this.f30217a) != null && iiVar.f31183f3 != null) {
                    if (j0Var.f34735b.isEmpty()) {
                        j0 j0Var2 = this.D0;
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
        qh.y yVar = this.M0;
        if (yVar != null) {
            if (z10) {
                yVar.e();
            }
            return false;
        }
        y8 y8Var = this.f34252i0;
        if (y8Var != null && y8Var.f35431y) {
            if (z10) {
                y8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        x5 x5Var = this.f34260q0;
        if (x5Var != null) {
            x5Var.c();
        }
        ii iiVar = this.f30217a;
        if (iiVar != null) {
            iiVar.C0();
        }
        v51 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.w0.f18945b;
        if (c6.f34321k0.compareAndSet(false, true)) {
            c6.f34322l0.postRunnable(new g4(context, 2));
        }
        getNotificationCenter().c(this, at.f14678a4);
        getNotificationCenter().c(this, at.y3);
        getNotificationCenter().c(this, at.f14684b4);
        getNotificationCenter().c(this, at.f14766q0);
        k0 x10 = k0.x(this.currentAccount);
        if (x10.f34792o == null) {
            x10.f34792o = new c0(x10);
        }
        c0 c0Var = x10.f34792o;
        this.E0 = c0Var;
        f4 f4Var = this.G0;
        ArrayList arrayList = c0Var.d;
        if (!arrayList.contains(f4Var)) {
            arrayList.add(f4Var);
        }
        qq qqVar = this.T0;
        if (qqVar != null) {
            qqVar.run();
        }
        int i10 = x10.D;
        x10.D = i10 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new qq(x10, i10, 23);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new a3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        qh.y yVar = this.M0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.M0);
            this.M0 = null;
        }
        org.telegram.messenger.i0.r(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        h8 h8Var = this.f34253j0;
        if (h8Var != null) {
            h8Var.p();
        }
        o5 o5Var = this.e;
        if (o5Var != null) {
            o5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        c0 c0Var = this.E0;
        if (c0Var != null) {
            c0Var.d.remove(this.G0);
        }
        P0();
        x5 x5Var = this.f34260q0;
        if (x5Var != null) {
            x5Var.b(null);
        }
        getNotificationCenter().n(this, at.f14678a4);
        getNotificationCenter().n(this, at.y3);
        getNotificationCenter().n(this, at.f14684b4);
        getNotificationCenter().n(this, at.f14766q0);
        org.telegram.messenger.i0.E2(this.E);
        j0 j0Var = this.D0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        qq qqVar = this.T0;
        if (qqVar != null) {
            qqVar.run();
            this.T0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30217a.setPadding(0, 0, 0, i13);
        this.f30217a.setClipToPadding(false);
        p80 p80Var = this.Z;
        if (p80Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p80Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(24.0f) + i13;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        qh.y yVar = this.M0;
        if (yVar != null) {
            yVar.g();
            org.telegram.messenger.i0.E2(this.M0);
            this.M0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                K0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20135a.T = org.telegram.messenger.i0.W2(dd.L0(2131746518, null));
            alertDialog$Builder.k(dd.L0(2131747316, null), new i4(this));
            alertDialog$Builder.h(dd.L0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.post(new f4(this, 9));
        }
        k0.x(this.currentAccount).E();
        if (this.E0 != null && k0.x(this.currentAccount).G()) {
            c0 c0Var = this.E0;
            if (!c0Var.f34304j) {
                c0Var.b();
                c0Var.f(true);
            }
        }
        R0();
        if (this.f30217a != null) {
            X0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f34265t0 != null && this.f34266u0 != null && this.e != null) {
                U0(this.f34271x0);
            }
            o5 o5Var = this.e;
            if (o5Var != null && this.B0 != null && this.C0 != null) {
                V0(o5Var.getStickerStyle());
            }
            p80 p80Var = this.Z;
            if (p80Var != null) {
                p80Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            k5 k5Var = this.S;
            if (k5Var != null) {
                k5Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s0(boolean z10) {
        float f7;
        long j10;
        gr grVar;
        org.telegram.messenger.i0.r(this.K0);
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
        T0();
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
            grVar = new gr(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            grVar = new gr(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(grVar);
        this.J0.addUpdateListener(new l4(this, 1));
        this.J0.addListener(new ms0(this, 17));
        this.J0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(14.0f));
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(getThemedColor(i10), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21331z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, w7.b6.e(-2, -2, 21));
        frameLayout.setOnClickListener(new j3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.e6.b(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, w7.b6.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        dq dqVar = new dq(2131231954, 0);
        dqVar.d = false;
        spannableStringBuilder.setSpan(dqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.o(j10, false));
        spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return dd.V(null, null, i10, spannableStringBuilder);
    }

    public final v51 y0() {
        View currentView;
        if (z0()) {
            hk hkVar = this.f34259p0;
            if (hkVar == null) {
                currentView = null;
            } else {
                currentView = hkVar.getCurrentView();
            }
            if (currentView instanceof v51) {
                return (v51) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        jg.z2 z2Var;
        if (!this.f34258o0 && (z2Var = this.f34257n0) != null && z2Var.isAttachedToWindow()) {
            ViewParent parent = this.f34257n0.getParent();
            ii iiVar = this.f30217a;
            if (parent == iiVar.f31182e3.m(iiVar.f31183f3.D.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
