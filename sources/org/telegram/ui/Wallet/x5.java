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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.c61;
import org.telegram.ui.fk0;
import org.telegram.ui.gq0;
import org.telegram.ui.oa0;
import org.telegram.ui.p90;
import org.telegram.ui.s81;
import org.telegram.ui.za1;
public final class x5 extends n41 implements ls {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public View D;
    public l0 D0;
    public bi.x5 E;
    public e0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.r0 L0;
    public ai.i0 M0;
    public int N0;
    public SpannableString Q0;
    public v41 R;
    public boolean R0;
    public h5 S;
    public boolean S0;
    public FrameLayout T;
    public org.telegram.ui.Components.r2 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public w70 Z;
    public i5 f43331a0;
    public boolean f43332b0;
    public FrameLayout f43333c0;
    public FrameLayout f43334d0;
    public l5 f43335e;
    public i5 f43337f;
    public boolean f43338f0;
    public u61 f43339g0;
    public int h;
    public FrameLayout f43340h0;
    public s8 f43341i0;
    public b8 f43342j0;
    public float f43344l0;
    public ValueAnimator m0;
    public m5 f43345n;
    public bi.t f43346n0;
    public boolean f43347o0;
    public fi.g1 f43348p0;
    public t5 f43349q0;
    public int f43350r;
    public boolean f43352s;
    public LinearLayout f43353s0;
    public org.telegram.ui.Components.j6 f43354t0;
    public org.telegram.ui.Components.j6 f43355u0;
    public f6 f43356v0;
    public o5 f43358w0;
    public float f43360x0;
    public FrameLayout f43361y;
    public float f43362y0;
    public c61 f43363z0;
    public final et f43357w = new et(this, 24);
    public final i4 f43359x = new ms() {
        @Override
        public final void a(int i7, boolean z9) {
            fi.w3 w3Var;
            x5 x5Var = x5.this;
            et etVar = x5Var.f43357w;
            if ((i7 != 1 && i7 != 3) || (w3Var = x5Var.f36243a) == null) {
                return;
            }
            x5Var.f43352s = z9;
            w3Var.removeCallbacks(etVar);
            etVar.run();
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
    public int f43336e0 = 0;
    public String f43343k0 = "";
    public final q41[] f43351r0 = new q41[2];
    public final e4 G0 = new e4(this, 3);
    public final e4 K0 = new e4(this, 4);
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

    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        z2[] z2VarArr;
        View[] viewArr;
        v10 v10Var2;
        LinearLayout t02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                bi.k7 k7Var = new bi.k7(context, i7, 0L, f6Var, null);
                k7Var.f4165a3 = wallettransaction;
                k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
                return;
            }
        }
        boolean z9 = true;
        z2[] z2VarArr2 = new z2[1];
        View[] viewArr2 = new View[1];
        l0 B = m0.x(i7).B();
        ArrayList arrayList = new ArrayList(B.f42726c);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == wallettransaction || m0.i0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (x10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232728).getPadding(rect);
            viewArr = viewArr2;
            ?? x4Var = new x4(context, f6Var, arrayList, B, i7, rect, viewArr);
            x4Var.setPosition(i10);
            z2VarArr = z2VarArr2;
            x4Var.setAdapter(new y4(arrayList, context, f6Var, rect, i7, z2VarArr2));
            v10Var2 = v10Var;
            t02 = x4Var;
        } else {
            z2VarArr = z2VarArr2;
            viewArr = viewArr2;
            v10Var2 = v10Var;
            t02 = t0(context, i7, wallettransaction, x10Var, v10Var, bArr, m0Var, f6Var, z2VarArr, false);
        }
        z2[] z2VarArr3 = z2VarArr;
        z4 z4Var = new z4(context, t02, f6Var, t02, viewArr, context);
        z2VarArr3[0] = z4Var;
        if ((t02 instanceof v61) && v10Var2 != null) {
            z4Var.n(new n(9, v10Var2, wallettransaction));
        }
        z2 z2Var = z2VarArr3[0];
        if (x10Var == null) {
            z9 = false;
        }
        z2Var.A0(z9);
        z2 z2Var2 = z2VarArr3[0];
        z2Var2.T0 = false;
        z2Var2.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.f27925h5;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
        linearLayout.addView(new v6(160, context, false), c8.ha.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743100, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(id.M0(2131743099, null));
        int i10 = org.telegram.ui.ActionBar.k6.f28262z6;
        org.telegram.ui.ActionBar.r6.V(f10, i10, f6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 0, 0, 0, 24));
        q5 q5Var = new q5(context, f6Var);
        q5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var.a(2131232829, id.M0(2131743022, null), id.M0(2131743021, null));
        linearLayout.addView(q5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        q5 q5Var2 = new q5(context, f6Var);
        q5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var2.a(2131232827, id.M0(2131743071, null), id.M0(2131743070, null));
        linearLayout.addView(q5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        q5 q5Var3 = new q5(context, f6Var);
        q5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        q5Var3.a(2131232831, id.M0(2131743185, null), id.M0(2131743184, null));
        linearLayout.addView(q5Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(id.M0(2131743104, null));
        linearLayout.addView(h, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        c8.ka.b(h, 0.02f, 1.1f);
        w70 w70Var = new w70(context, null);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setGravity(17);
        w70Var.setText(Q0(id.M0(2131743009, null), org.telegram.ui.ActionBar.k6.Uc, f6Var, new f4(context, 1)));
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.N = frameLayout;
        org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
        v2VarArr[0].u0(true);
        v2VarArr[0].N();
        h.setOnClickListener(new m4(v2VarArr, 1));
        v2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        m0 x10 = m0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, context, f6Var, false);
            v2Var.v0(-12207881);
            v2Var.O(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new w5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, c8.ha.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22558n));
            v5 v5Var = new v5(context, t6);
            linearLayout.addView(v5Var, c8.ha.r(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131743044, null));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
            linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 24, 0, 24, 20));
            fi.d dVar = new fi.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(2131232807, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131743183, null));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131231269);
            imageView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            imageView.setContentDescription(id.M0(2131752041, null));
            c8.ka.a(imageView);
            frameLayout.addView(imageView, c8.ha.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
            v2Var.N = frameLayout;
            v2Var.f28654x = true;
            v2Var.f28650u0 = false;
            v2Var.f28651v0 = false;
            v2Var.O(-12207881);
            imageView.setOnClickListener(new d4(v2Var, 0));
            v5Var.f43253e = new r0(t6, 1);
            v2Var.show();
            v2Var.E0(-12207881);
            org.telegram.messenger.g0.u3(v2Var, -12207881, false, null);
            org.telegram.messenger.g0.n3(v2Var, false);
            if (Build.VERSION.SDK_INT >= 29 && v2Var.getWindow() != null) {
                v2Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new di.t5(dVar, i7, v2Var, f6Var, 7));
        }
    }

    public static SpannableStringBuilder Q0(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new hi.k3(i7, f6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Y0(q41 q41Var, boolean z9) {
        boolean canScrollVertically = q41Var.canScrollVertically(-1);
        q41Var.f37190f3.O(z9);
        q41Var.a0();
        if (!canScrollVertically) {
            q41Var.f37189e3.h1(0, 0);
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

    public static void d0(x5 x5Var) {
        m0 x10 = m0.x(x5Var.currentAccount);
        fi.d dVar = x5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        x10.m0(new h2.o0((Object) x10, (Object) new t(8, x5Var, x10), false, false, 4));
    }

    public static void e0(x5 x5Var) {
        vf.c.t(x5Var.getParentActivity(), m0.x(x5Var.currentAccount).f42769j);
    }

    public static void f0(x5 x5Var) {
        J0(x5Var.currentAccount, x5Var.getParentActivity(), x5Var.getResourceProvider());
    }

    public static void g0(x5 x5Var, String str, m0 m0Var, k60 k60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, x5Var.getParentActivity(), x5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        z0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = z0Var.f28815b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new j1(m0Var, currencyrate, k60Var, 2));
        linearLayout.addView(z0Var, c8.ha.o(200, -2));
    }

    public static void h0(x5 x5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (x5Var.E != null && (kVar = x5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) x5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (x5Var.E.getParent() != x5Var.actionBar) {
                org.telegram.messenger.g0.E2(x5Var.E);
                x5Var.actionBar.addView(x5Var.E, c8.ha.c(-1.0f, -1));
            }
            x5Var.E.bringToFront();
            x5Var.actionBar.bringToFront();
            x5Var.E.post(new e4(x5Var, 10));
        }
    }

    public static void i0(x5 x5Var) {
        J0(x5Var.currentAccount, x5Var.getParentActivity(), x5Var.getResourceProvider());
    }

    public static void j0(x5 x5Var, String str) {
        Uri b12 = b1(str);
        String c12 = c1(b12);
        if (c12 != null) {
            int i7 = x5Var.currentAccount;
            qp.s1(i7).d2().a(c12, null, new fi.t3(new l4(x5Var, 4), i7));
        } else if ((x5Var.getParentActivity() instanceof LaunchActivity) && new p90((LaunchActivity) x5Var.getParentActivity(), x5Var.currentAccount, null, false).g(b12)) {
        } else {
            org.telegram.messenger.g0.h3(new e4(x5Var, 11));
        }
    }

    public static void k0(x5 x5Var, LinearLayout linearLayout, m0 m0Var, k60 k60Var) {
        TL_wallet.currencyRate currencyrate;
        x5 x5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f10 = m0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                mz mzVar = new mz(x5Var.getParentActivity(), x5Var.getResourceProvider());
                mzVar.setIsSingleCell(true);
                mzVar.setViewType(31);
                linearLayout2.addView(mzVar, c8.ha.o(200, -2));
            }
            return;
        }
        f fVar = m0Var2.h;
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25566b.getSystemService("input_method");
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
            f.a(linkedHashSet, ((org.telegram.messenger.n0) qp.s1(fVar.f42479a).f24942x7.O.f13555b).f24118c);
            f.c(linkedHashSet, id.E0().f23185y);
            f.c(linkedHashSet, id.E0().f23186z);
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
                g0(x5Var, g10, m0Var2, k60Var, linearLayout2, currencyrate7);
            }
            i12++;
            m0Var2 = m0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            x5Var2 = x5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(x5Var.getParentActivity(), x5Var2.resourceProvider), c8.ha.o(-1, 8));
        } else {
            x5Var2 = x5Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(x5Var2, g10, m0Var, k60Var, linearLayout2, currencyrate8);
            }
            i13++;
            x5Var2 = x5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void l0(final x5 x5Var, Context context, View view) {
        boolean z9;
        m0 x10 = m0.x(x5Var.currentAccount);
        final k60 I = k60.I(x5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.f35231s = 0;
        I.V(5);
        k60 J = I.J();
        J.c(2131231240, id.M0(2131743195, null), new gq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        f7 f7Var = new f7(x5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ha.o(-1, 350));
        I.c(2131232815, id.M0(2131743151, null), new g(f7Var, I, J, 10), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i7 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i7);
        String str = i7;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131748780, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(75.0f), y10.f28815b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        if (fVar.f() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        f7 f7Var2 = new f7(x10, new boolean[]{z9}, y10, f7Var, 12);
        x5Var.P0.add(f7Var2);
        f7Var.run();
        I.c(2131232833, id.M0(2131747658, null), new Runnable(x5Var) {
            public final x5 f43021b;

            {
                this.f43021b = x5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x5 x5Var2 = this.f43021b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        x5 x5Var3 = this.f43021b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        x5 x5Var4 = this.f43021b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new n41());
                        return;
                    default:
                        I.u();
                        x5 x5Var5 = this.f43021b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(2131232826, id.M0(2131743083, null), new Runnable(x5Var) {
            public final x5 f43021b;

            {
                this.f43021b = x5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x5 x5Var2 = this.f43021b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        x5 x5Var3 = this.f43021b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        x5 x5Var4 = this.f43021b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new n41());
                        return;
                    default:
                        I.u();
                        x5 x5Var5 = this.f43021b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(2131232806, id.M0(2131743159, null), new Runnable(x5Var) {
            public final x5 f43021b;

            {
                this.f43021b = x5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x5 x5Var2 = this.f43021b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        x5 x5Var3 = this.f43021b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        x5 x5Var4 = this.f43021b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new n41());
                        return;
                    default:
                        I.u();
                        x5 x5Var5 = this.f43021b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ x10.f42767g.d.isEmpty());
        I.k();
        I.c(2131232819, id.M0(2131742963, null), new Runnable(x5Var) {
            public final x5 f43021b;

            {
                this.f43021b = x5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x5 x5Var2 = this.f43021b;
                        x5Var2.getClass();
                        I.u();
                        x5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        x5 x5Var3 = this.f43021b;
                        x5Var3.getClass();
                        I.u();
                        x5Var3.presentFragment(new n8());
                        return;
                    case 2:
                        x5 x5Var4 = this.f43021b;
                        x5Var4.getClass();
                        I.u();
                        x5Var4.presentFragment(new n41());
                        return;
                    default:
                        I.u();
                        x5 x5Var5 = this.f43021b;
                        x5.I0(x5Var5.getParentActivity(), x5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f35226p = new n(11, x5Var, f7Var2);
        I.Z();
    }

    public static void m0(x5 x5Var, long j3) {
        e4 e4Var = x5Var.K0;
        if (x5Var.f36243a != null) {
            s8 s8Var = x5Var.f43341i0;
            if (s8Var != null) {
                s8Var.a();
            }
            if (x5Var.I0 <= 0.0f && x5Var.A0()) {
                int top = x5Var.f36243a.f37189e3.m(x5Var.h).getTop() - x5Var.f36243a.getPaddingTop();
                x5Var.f36243a.C0();
                if (top < 0) {
                    x5Var.f36243a.w0(0, top, xq.h);
                    return;
                }
                return;
            }
            x5Var.f36243a.C0();
            x5Var.s0(true);
            org.telegram.messenger.g0.r(e4Var);
            if (j3 > 0) {
                org.telegram.messenger.g0.i3(e4Var, j3 + 260);
            }
        }
    }

    public static Typeface r0(Context context) {
        if (U0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                U0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                U0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return U0;
    }

    public static android.widget.LinearLayout t0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.x10 r46, org.telegram.messenger.v10 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.f6 r50, org.telegram.ui.Wallet.z2[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.x5.t0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.x10, org.telegram.messenger.v10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.f6, org.telegram.ui.Wallet.z2[], boolean):android.widget.LinearLayout");
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

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        wp wpVar = new wp(2131232818, 2);
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence m10 = m0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.f28262z6, f6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        fi.w3 w3Var = this.f36243a;
        if (w3Var != null && (m10 = w3Var.f37189e3.m(this.h)) != null && this.f43362y0 < 0.5f && m10.getBottom() > this.f36243a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void D0() {
        e0 e0Var;
        q41 q41Var = this.f43351r0[1];
        if (this.f43336e0 == 1 && q41Var != null && q41Var.G && (e0Var = this.E0) != null && !e0Var.f42416i && !e0Var.f42415g && e0Var.f42418k == null && q41Var.f37189e3.N0() >= q41Var.f37190f3.D.size() - 3) {
            this.E0.e();
        }
    }

    public final void E0() {
        l0 l0Var;
        q41 q41Var = this.f43351r0[0];
        if (q41Var != null && q41Var.G && (l0Var = this.D0) != null && !l0Var.h && q41Var.f37189e3.N0() >= q41Var.f37190f3.D.size() - 3) {
            this.D0.h();
        }
    }

    public final CharSequence F0(int i7) {
        org.telegram.ui.Components.j6 j6Var;
        float f10;
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            if (i7 == 0) {
                j6Var = this.f43354t0;
            } else {
                j6Var = this.f43355u0;
            }
            if (i7 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            b80 b80Var = new b80(org.telegram.messenger.g0.L(f10), j6Var);
            b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.45f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(b80Var, 0, charSequence.length(), 33);
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
            bi.k7 k7Var = new bi.k7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            k7Var.X2 = nftitem;
            if (this.f43342j0 != null) {
                k7Var.Y2 = new f5(this, tL_starGiftUnique, nftitem);
                k7Var.Z2 = new g5(this, nftitem);
            }
            k7Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.k6.f27796a7;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.k6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) parentActivity, resourceProvider, false);
            v2Var.f28617a0 = i14;
            v2Var.v0(w02);
            v2Var.O(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            l9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232835).mutate();
            int i16 = org.telegram.ui.ActionBar.k6.f28262z6;
            org.telegram.ui.ActionBar.r6.y(l9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            hc c10 = c.c(nftitem, false);
            if (c10 != null) {
                l9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                l9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(l9Var, c8.ha.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = id.M0(2131743179, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.k5.n(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ha.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.r6.V(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView2.setVisibility(i7);
            linearLayout.addView(textView2, c8.ha.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i19 = org.telegram.ui.ActionBar.k6.f27852d6;
                int w03 = org.telegram.ui.ActionBar.k6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.k6.f27944i6;
                int w04 = org.telegram.ui.ActionBar.k6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i19);
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.r6.k(linearLayout3, k02, N, N2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742984;
                } else {
                    i10 = 2131743026;
                }
                String M0 = id.M0(i10, str2);
                linearLayout3.setContentDescription(M0);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i11 = 2131232846;
                } else {
                    i11 = 2131232839;
                }
                imageView.setImageResource(i11);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.t(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.ha.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(M0);
                float f11 = f10;
                org.telegram.messenger.k5.n(textView3, i21, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                linearLayout2.addView(linearLayout3, c8.ha.m(1.0f, 0, -1, i12, i13, 0));
                i18++;
                f10 = f11;
                i17 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                tx0 tx0Var = new tx0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i22 = org.telegram.ui.ActionBar.k6.f27852d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L2, org.telegram.ui.ActionBar.k6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i22);
                tx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(tx0Var, d02, N3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    tx0Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            fi.d dVar = new fi.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(id.M0(2131743066, null));
            linearLayout.addView(dVar, c8.ha.o(-1, 48));
            v2Var.N = scrollView;
            v2Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new fk0(19, v2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new i3(parentActivity, 1));
            dVar.setOnClickListener(new i3(v2Var, 2));
            v2Var.show();
            v2Var.O(w02);
            org.telegram.messenger.g0.u3(v2Var, w02, false, null);
        }
    }

    public final void K0() {
        if (getParentActivity() != null && this.M0 == null && this.L0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.M0 = ai.i0.k(this, this.L0, new ai.c0(12), new l4(this, 3), new e4(this, 8));
            }
        }
    }

    public final void L0(boolean z9) {
        float f10;
        boolean z10;
        this.f43338f0 = z9;
        if (!z9) {
            this.f43336e0 = 0;
        }
        if (this.f43348p0 != null && this.f43340h0 != null) {
            if (!z9) {
                this.f43341i0.b(false);
                this.f43348p0.setPosition(0);
            }
            Z0();
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                this.m0 = null;
                valueAnimator.cancel();
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.f43346n0.isAttachedToWindow() && this.f43346n0.isLaidOut()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9) {
                this.f43348p0.o(false);
            }
            if (z10 && this.f43344l0 != f10) {
                this.f43340h0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43344l0, f10);
                this.m0 = ofFloat;
                ofFloat.setDuration(250L);
                this.m0.setInterpolator(xq.h);
                this.m0.addUpdateListener(new k4(this, 0));
                this.m0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
                this.m0.start();
            } else {
                M0(f10);
                this.f43348p0.o(false);
            }
            if (this.f36243a != null && this.f43347o0 != N0()) {
                X0(false);
            }
        }
    }

    public final void M0(float f10) {
        int i7;
        this.f43344l0 = f10;
        FrameLayout frameLayout = this.f43340h0;
        if (f10 <= 0.0f && this.m0 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        frameLayout.setVisibility(i7);
        this.f43340h0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43340h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.f43340h0.setLayoutParams(layoutParams);
    }

    public final boolean N0() {
        l0 l0Var;
        if (!this.f43338f0 && (l0Var = this.D0) != null && l0Var.f42726c.isEmpty()) {
            l0 l0Var2 = this.D0;
            l0Var2.getClass();
            if (l0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O0() {
        this.F0 = false;
        s8 s8Var = this.f43341i0;
        if (s8Var != null) {
            s8Var.b(false);
        }
        this.f43336e0 = 0;
        fi.g1 g1Var = this.f43348p0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void P0() {
        this.f43352s = false;
        fi.w3 w3Var = this.f36243a;
        if (w3Var != null) {
            w3Var.D2.f36690b.remove(this.f43359x);
            this.f36243a.removeCallbacks(this.f43357w);
        }
        l5 l5Var = this.f43335e;
        if (l5Var != null) {
            l5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void R0() {
        boolean z9;
        m0 x10 = m0.x(this.currentAccount);
        a1();
        fi.d dVar = this.C0;
        if (x10.G() && x10.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.setEnabled(z9);
        if (!x10.G()) {
            this.f43354t0.setText(F0(0));
            this.f43355u0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            l5 l5Var = this.f43335e;
            l5Var.getClass();
            f6 f6Var = new f6(l5Var);
            this.f43356v0 = f6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(f6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) g6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749517, null));
        if (this.f43358w0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f42962a = -9577217;
            this.f43358w0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f43358w0, length, spannableStringBuilder.length(), 33);
        this.f43354t0.setText(spannableStringBuilder);
        CharSequence m10 = m0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.f43355u0.setText(F0(1));
        } else {
            this.f43355u0.setText(m10);
        }
        U0(this.f43360x0);
        e0 e0Var = this.E0;
        if (e0Var != null && !e0Var.h && !e0Var.f42416i && e0Var.f42418k == null) {
            e0Var.e();
        }
        String t6 = x10.t();
        if (!TextUtils.isEmpty(t6)) {
            this.f43335e.setCardNumber(v0(t6.toUpperCase()));
        }
    }

    public final void S0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.G;
        if (!rect.isEmpty() && this.D.isAttachedToWindow()) {
            l5 l5Var = this.f43335e;
            bi.x5 x5Var = this.E;
            Matrix matrix = this.H;
            if (l5Var.g(x5Var, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i7 = 0;
                while (true) {
                    fArr = this.K;
                    fArr2 = this.L;
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
                bi.x5 x5Var2 = this.E;
                int[] iArr = this.O;
                x5Var2.getLocationInWindow(iArr);
                View view = this.D;
                int[] iArr2 = this.N;
                view.getLocationInWindow(iArr2);
                this.f43335e.i(this.f43360x0, this.f43361y.getWidth() / 0.7826087f);
                float f12 = iArr2[0] - iArr[0];
                float x10 = org.telegram.ui.Cells.f1.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i12 = 0; i12 < 4; i12++) {
                    int i13 = i12 * 2;
                    float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.f43360x0);
                    float[] fArr3 = this.M;
                    fArr3[i13] = T1;
                    int i14 = i13 + 1;
                    fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + x10, this.f43360x0);
                }
                Matrix matrix2 = this.J;
                boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
                Matrix matrix3 = this.I;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.E.invalidate();
                }
                l5 l5Var2 = this.f43335e;
                Matrix matrix4 = l5Var2.f42540c;
                Matrix matrix5 = l5Var2.f42543e;
                Matrix matrix6 = l5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!l5Var2.f42550n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        l5Var2.f42550n = true;
                        l5Var2.N.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.f43360x0);
                this.f43355u0.setPivotX(0.0f);
                this.f43355u0.setPivotY(0.0f);
                this.f43355u0.setScaleX(T12);
                this.f43355u0.setScaleY(T12);
            }
        }
    }

    public final void T0() {
        bi.x5 x5Var;
        float i7;
        boolean z9;
        float f10;
        l5 l5Var;
        int i10;
        ?? r16;
        boolean z10;
        LinearLayout linearLayout;
        boolean z11;
        float min;
        float f11;
        float height;
        l5 l5Var2;
        if (this.f36243a != null && this.f43335e != null && this.f43353s0 != null && this.D != null && (x5Var = this.E) != null && this.actionBar != null) {
            x5Var.bringToFront();
            View m10 = this.f36243a.f37189e3.m(this.h);
            if (m10 == null) {
                if (this.f36243a.f37189e3.L0() > this.h) {
                    i7 = 1.0f;
                } else {
                    i7 = 0.0f;
                }
            } else {
                i7 = Utilities.i((this.f36243a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f43362y0 = i7;
            int i11 = (this.I0 > 0.0f ? 1 : (this.I0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.H0 <= 0.0f) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                if (i11 > 0) {
                    i7 = 0.0f;
                } else {
                    i7 = (1.0f - this.H0) * i7;
                }
            }
            this.f43360x0 = i7;
            W0();
            if (m10 != null) {
                f10 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.f43360x0;
            } else {
                f10 = 0.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.f43360x0);
            this.f43335e.setPivotX(l5Var.getWidth() * 0.5f);
            this.f43335e.setPivotY(0.0f);
            this.f43335e.setScaleX(T1);
            this.f43335e.setScaleY(T1);
            this.f43335e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
            l5 l5Var3 = this.f43335e;
            if (!z9 && (m10 == null || i7 >= 1.0f || m10.getBottom() <= this.f36243a.getPaddingTop() || m10.getTop() >= this.f36243a.getHeight() - this.f36243a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            l5Var3.setVisibility(i10);
            int[] iArr = this.Q;
            int[] iArr2 = this.P;
            if (m10 != null) {
                this.f36243a.getLocationInWindow(iArr2);
                this.f43345n.getLocationInWindow(iArr);
                r16 = 1;
                this.f43335e.setTranslationX(((this.f43337f.getWidth() - this.f43335e.getWidth()) / 2.0f) + this.f43337f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f43335e.setTranslationY(this.f43337f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
            } else {
                r16 = 1;
            }
            if (z9) {
                if (this.I0 == 0.0f) {
                    z11 = r16;
                } else {
                    z11 = false;
                }
                float f12 = this.H0;
                if (z11) {
                    min = 0.3f * f12;
                    f11 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                    f11 = 0.84f;
                }
                float f13 = min + f11;
                this.actionBar.getLocationInWindow(iArr2);
                this.f43345n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z11) {
                    height = 0.0f;
                } else {
                    height = this.f43335e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z11) {
                    f15 = a8.p0.f(0.9f - f13, this.f43335e.getHeight(), 2.0f, f15);
                }
                float width = (this.f43345n.getWidth() - this.f43335e.getWidth()) / 2.0f;
                if (!z11) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f36243a.getLocationInWindow(iArr2);
                    float width2 = ((this.f43337f.getWidth() - this.f43335e.getWidth()) / 2.0f) + this.f43337f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y10 = this.f43337f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y10) / (this.f43335e.getHeight() * 0.5f)));
                    if (l10 >= 1.0f) {
                        org.telegram.messenger.g0.r(this.K0);
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
                    width = org.telegram.messenger.g0.T1(width, width2, l10);
                    f15 = org.telegram.messenger.g0.T1(f15, y10, l10);
                    f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                    f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
                }
                this.f43335e.setPivotX(l5Var2.getWidth() * 0.5f);
                this.f43335e.setPivotY(0.0f);
                this.f43335e.setScaleX(f13);
                this.f43335e.setScaleY(f13);
                this.f43335e.setTranslationX(width);
                this.f43335e.setTranslationY(f15);
                this.f43335e.setAlpha(f12);
            }
            if (i7 > 0.0f) {
                z10 = r16;
            } else {
                z10 = false;
            }
            if (this.F != z10 && (linearLayout = this.f43353s0) != null) {
                Rect rect = this.G;
                if (z10) {
                    if (linearLayout.getWidth() != 0 && this.f43353s0.getHeight() != 0) {
                        rect.set(this.f43353s0.getLeft(), this.f43353s0.getTop(), this.f43353s0.getRight(), this.f43353s0.getBottom());
                    }
                }
                this.f43335e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f43353s0);
                this.F = z10;
                if (z10) {
                    this.E.addView(this.f43353s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f43353s0.layout(0, 0, rect.width(), rect.height());
                    S0();
                } else {
                    l5 l5Var4 = this.f43335e;
                    l5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = l5Var4.M;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    e6 e6Var = l5Var4.O;
                    e6Var.setScaleX(1.0f);
                    e6Var.setScaleY(1.0f);
                    l5Var4.E.addView(linearLayout2, l5Var4.P);
                    this.f43353s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f43335e.getClass();
                    S0();
                }
                this.E.invalidate();
            }
            U0(i7);
            if (this.F) {
                S0();
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

    public final void U0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        this.f43354t0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.j6 j6Var = this.f43355u0;
        float[] fArr = this.f43335e.f42537a0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr));
        }
        j6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        f6 f6Var = this.f43356v0;
        if (f6Var != null) {
            f6Var.f40024y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
        }
        o5 o5Var = this.f43358w0;
        if (o5Var != null) {
            float[] fArr2 = this.f43335e.f42537a0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], p7.p(-9577217, 0, fArr2), p7.p(-9577217, 3, fArr2));
            }
            o5Var.f42962a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f43354t0.invalidate();
    }

    public final void V0(float[] fArr) {
        boolean z9;
        float f10;
        int n10;
        if (this.B0 != null && this.C0 != null) {
            float f11 = p7.j(getThemedColor(org.telegram.ui.ActionBar.k6.f27796a7))[0];
            if (f11 < 0.6f) {
                z9 = true;
            } else {
                z9 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ci);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = i7 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = p7.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
                    }
                    iArr[i7] = n10;
                }
                themedColor = i0.a.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z9) {
                f12 = f11 + 0.25f;
            }
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = f11 - 0.2f;
            }
            float[] j3 = p7.j(themedColor);
            float f14 = j3[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (p7.l(Math.max(f12, Math.min(f10, f14)), j3[1], j3[2]) & 16777215);
            }
            if (themedColor != this.N0) {
                this.N0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
                }
                fi.d[] dVarArr = {this.B0, this.C0};
                for (int i12 = 0; i12 < 2; i12++) {
                    fi.d dVar = dVarArr[i12];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i11);
                }
            }
        }
    }

    public final void W0() {
        fi.w3 w3Var = this.f36243a;
        if (w3Var != null && this.f43335e != null) {
            float b10 = w3Var.D2.b(1);
            float min = Math.min(10.0f, this.f36243a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f43335e.setAdditionalTilt(Math.max(0.0f, (this.f43360x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.f43360x0))) * 90.0f) - 10.0f)) + min);
            this.f43335e.setUseGyroscope(1.0f - ((float) Math.pow(this.f43360x0, 0.33000001311302185d)));
        }
    }

    public final void X0(boolean z9) {
        boolean N0 = N0();
        fi.w3 w3Var = this.f36243a;
        q41[] q41VarArr = this.f43351r0;
        if (w3Var != null && this.f43347o0 != N0) {
            this.f43347o0 = N0;
            w3Var.C0();
            for (q41 q41Var : q41VarArr) {
                if (q41Var != null) {
                    q41Var.C0();
                }
            }
            this.f36243a.f37190f3.O(false);
            this.f36243a.f37189e3.h1(0, 0);
            this.f36243a.post(new e4(this, 10));
        }
        if (!N0) {
            for (q41 q41Var2 : q41VarArr) {
                if (q41Var2 != null) {
                    Y0(q41Var2, z9);
                }
            }
            bi.t tVar = this.f43346n0;
            if (tVar != null) {
                tVar.post(new e4(this, 5));
                this.f43346n0.post(new e4(this, 6));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, l41 l41Var) {
        m0 x10 = m0.x(this.currentAccount);
        a1();
        arrayList.add(x31.m(this.R));
        this.h = arrayList.size();
        i5 i5Var = this.f43337f;
        x31 x31Var = new x31(-4);
        x31Var.f40173c = i5Var;
        x31Var.f40193z = -1;
        x31Var.f40174e = true;
        arrayList.add(x31Var);
        arrayList.add(x31.m(this.f43363z0));
        boolean N0 = N0();
        this.f43347o0 = N0;
        if (N0) {
            String M0 = id.M0(2131743022, null);
            String M02 = id.M0(2131743021, null);
            int i7 = p5.f43023b;
            x31 K = x31.K(p5.class);
            K.f40179k = 2131232829;
            K.f40180l = M0;
            K.f40181m = M02;
            arrayList.add(K);
            String M03 = id.M0(2131743071, null);
            String M04 = id.M0(2131743070, null);
            x31 K2 = x31.K(p5.class);
            K2.f40179k = 2131232827;
            K2.f40180l = M03;
            K2.f40181m = M04;
            arrayList.add(K2);
            String M05 = id.M0(2131743185, null);
            String M06 = id.M0(2131743184, null);
            x31 K3 = x31.K(p5.class);
            K3.f40179k = 2131232831;
            K3.f40180l = M05;
            K3.f40181m = M06;
            arrayList.add(K3);
            arrayList.add(x31.m(this.f43331a0));
        } else if (this.f43346n0 != null) {
            if (this.R0 && !this.S0 && x10.v() > 500000000) {
                arrayList.add(x31.k(this.f43333c0));
            }
            bi.t tVar = this.f43346n0;
            x31 x31Var2 = new x31(-3);
            x31Var2.f40173c = tVar;
            x31Var2.f40193z = 0;
            x31Var2.f40192y = 1;
            arrayList.add(x31Var2);
        }
        w70 w70Var = this.Z;
        if (w70Var != null) {
            this.f43332b0 = false;
            w70Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    public final void Z0() {
        s8 s8Var = this.f43341i0;
        if (s8Var != null && this.f43348p0 != null && s8Var.f43150x != 0.0f) {
            s8Var.f43150x = 0.0f;
            s8Var.f43143c.setVisibility(8);
            s8Var.invalidate();
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131743006, null);
    }

    public final void a1() {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.S == null) {
            return;
        }
        m0 x10 = m0.x(this.currentAccount);
        boolean z12 = false;
        if (this.S.isAttachedToWindow() && this.S.isLaidOut()) {
            z9 = true;
        } else {
            z9 = false;
        }
        h5 h5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.f42768i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(x10.f42769j)) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5Var.i(frameLayout, z10, z9);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            i0 i0Var = (i0) obj;
            if (!i0Var.f42607e) {
                long j10 = i0Var.f42606c;
                if (j10 >= 0) {
                    j3 += j10;
                }
            }
        }
        if (j3 > 500000000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.W.setText(x0(2131743065, j3));
        }
        this.S.i(this.V, z11, z9);
        long j11 = bi.ea.y(this.currentAccount, true).p().amount;
        if (j11 > 500000000) {
            z12 = true;
        }
        if (z12) {
            this.Y.setText(x0(2131743103, j11));
        }
        this.S.i(this.X, z12, z9);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        e0 e0Var;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
        } else if (x31Var.d == -10001 && (e0Var = this.E0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) x31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        b8 b8Var;
        if ((view instanceof o7) && (b8Var = this.f43342j0) != null) {
            b8Var.S((o7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        b8 b8Var = this.f43342j0;
        if ((b8Var == null || !b8Var.f42249p0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        ValueAnimator valueAnimator = this.m0;
        if (valueAnimator != null) {
            this.m0 = null;
            valueAnimator.cancel();
        }
        P0();
        t5 t5Var = this.f43349q0;
        if (t5Var != null) {
            t5Var.b(null);
        }
        this.f43337f = null;
        this.S = null;
        this.R = null;
        this.f43346n0 = null;
        this.f43348p0 = null;
        q41[] q41VarArr = this.f43351r0;
        q41VarArr[0] = null;
        q41VarArr[1] = null;
        e0 e0Var = this.E0;
        if (e0Var != null && !e0Var.f42410a.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f43338f0 = z9;
        if (!z9) {
            this.f43336e0 = 0;
        } else if (this.F0) {
            this.f43336e0 = 1;
        }
        b8 b8Var = this.f43342j0;
        if (b8Var != null) {
            b8Var.p();
        }
        this.f43342j0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.ha.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        org.telegram.ui.ActionBar.r6.i(i7, kVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        org.telegram.ui.ActionBar.r0 a10 = q10.a(2, 2131232678);
        this.L0 = a10;
        a10.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42531b;

            {
                this.f42531b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f42531b;
                        x5Var.getClass();
                        x5Var.presentFragment(new za1(6, null));
                        return;
                    case 1:
                        x5.f0(this.f42531b);
                        return;
                    case 2:
                        x5.i0(this.f42531b);
                        return;
                    case 3:
                        this.f42531b.K0();
                        return;
                    default:
                        x5.d0(this.f42531b);
                        return;
                }
            }
        });
        q10.a(1, 2131231244).setOnClickListener(new fk0(21, this, context));
        v41 v41Var = new v41(2, context, this);
        this.R = v41Var;
        v41Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        h5 h5Var = new h5(this, context);
        this.S = h5Var;
        h5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new e4(this, 12));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(id.M0(2131742965, null));
        this.T = u0(this.U, new e4(this, 0));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = u0(textView2, new e4(this, 1));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = u0(textView3, new e4(this, 2));
        this.R.addView(this.S, c8.ha.c(-2.0f, -1));
        w70 w70Var = new w70(context, null);
        this.Z = w70Var;
        this.f43332b0 = false;
        w70Var.setAlpha(0.0f);
        w70 w70Var2 = this.Z;
        int i10 = org.telegram.ui.ActionBar.k6.f28262z6;
        org.telegram.ui.ActionBar.r6.V(w70Var2, i10, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(Q0(id.M0(2131743009, null), org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider, new f4(context, 0)));
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, c8.ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        i5 i5Var = new i5(this, context, 0);
        this.f43331a0 = i5Var;
        i5Var.setImportantForAccessibility(2);
        this.f43333c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43334d0 = frameLayout2;
        int i11 = org.telegram.ui.ActionBar.k6.f27852d6;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i12)), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.n6 q11 = org.telegram.ui.ActionBar.r6.q(i11, i12);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, b02, N, q11, resourceProvider);
        this.f43333c0.addView(this.f43334d0, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N2 = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N2, N2, N2, N2, N2, N2, N2, N2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232836);
        this.f43334d0.addView(imageView, c8.ha.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.f28093q7, this.resourceProvider);
        jg.g.v(textView4, 1, 16.0f, null, 2131743047);
        this.f43334d0.addView(textView4, c8.ha.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f43334d0.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42531b;

            {
                this.f42531b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f42531b;
                        x5Var.getClass();
                        x5Var.presentFragment(new za1(6, null));
                        return;
                    case 1:
                        x5.f0(this.f42531b);
                        return;
                    case 2:
                        x5.i0(this.f42531b);
                        return;
                    case 3:
                        this.f42531b.K0();
                        return;
                    default:
                        x5.d0(this.f42531b);
                        return;
                }
            }
        });
        c8.ka.b(this.f43334d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f43361y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f43361y.setClipToPadding(false);
        this.actionBar.addView(this.f43361y, c8.ha.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.D = view;
        this.f43361y.addView(view, c8.ha.e(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        bi.x5 x5Var = new bi.x5(this, context);
        this.E = x5Var;
        x5Var.setClipChildren(false);
        this.E.setClipToPadding(false);
        l5 l5Var = new l5(this, context);
        this.f43335e = l5Var;
        l5Var.setDiamondOnCard(true);
        this.f43335e.setCardOnClickListener(new View.OnClickListener(this) {
            public final x5 f42531b;

            {
                this.f42531b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x5 x5Var2 = this.f42531b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        return;
                    case 1:
                        x5.f0(this.f42531b);
                        return;
                    case 2:
                        x5.i0(this.f42531b);
                        return;
                    case 3:
                        this.f42531b.K0();
                        return;
                    default:
                        x5.d0(this.f42531b);
                        return;
                }
            }
        });
        this.f36243a.D2.f36690b.add(this.f43359x);
        i5 i5Var2 = new i5(this, context, 1);
        this.f43337f = i5Var2;
        i5Var2.setImportantForAccessibility(2);
        m5 m5Var = new m5(this, context);
        this.f43345n = m5Var;
        m5Var.setClipChildren(false);
        this.f43345n.setClipToPadding(false);
        this.f43345n.addView(this.f43335e, c8.ha.c(-2.0f, -1));
        oa0Var.addView(this.f43345n, c8.ha.c(-1.0f, -1));
        this.f36243a.setClipChildren(false);
        this.f36243a.setClipToPadding(false);
        this.f43353s0 = this.f43335e.getBalanceLayout();
        this.f43354t0 = this.f43335e.getBalanceView();
        this.f43355u0 = this.f43335e.getUsdBalanceView();
        this.f43335e.setCardHolder(t10.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        c61 c61Var = new c61(23, context, this);
        this.f43363z0 = c61Var;
        c61Var.setOrientation(0);
        this.f43363z0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(id.M0(2131743207, null));
        this.f43363z0.addView(this.B0, c8.ha.m(1.0f, 0, 48, 0, 4, 0));
        this.B0.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42531b;

            {
                this.f42531b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x5 x5Var2 = this.f42531b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        return;
                    case 1:
                        x5.f0(this.f42531b);
                        return;
                    case 2:
                        x5.i0(this.f42531b);
                        return;
                    case 3:
                        this.f42531b.K0();
                        return;
                    default:
                        x5.d0(this.f42531b);
                        return;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(id.M0(2131743025, null));
        this.C0.setEnabled(m0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final x5 f42531b;

            {
                this.f42531b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x5 x5Var2 = this.f42531b;
                        x5Var2.getClass();
                        x5Var2.presentFragment(new za1(6, null));
                        return;
                    case 1:
                        x5.f0(this.f42531b);
                        return;
                    case 2:
                        x5.i0(this.f42531b);
                        return;
                    case 3:
                        this.f42531b.K0();
                        return;
                    default:
                        x5.d0(this.f42531b);
                        return;
                }
            }
        });
        this.f43363z0.addView(this.C0, c8.ha.m(1.0f, 0, 48, 4, 0, 0));
        V0(this.f43335e.getStickerStyle());
        this.D0 = m0.x(this.currentAccount).B();
        this.f36243a.setDescendantFocusability(131072);
        b8 b8Var2 = new b8(this, this.f43335e, new m4.d0(this, oa0Var, false), null);
        this.f43342j0 = b8Var2;
        oa0Var.addView(b8Var2, c8.ha.c(-1.0f, -1));
        this.f43343k0 = "";
        bi.t tVar = new bi.t(context, 9);
        this.f43346n0 = tVar;
        tVar.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i7, this.f43346n0, getResourceProvider());
        fi.g1 g1Var = new fi.g1(this, context, this.resourceProvider, 9);
        this.f43348p0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.f43348p0.setAdapter(new bi.g5(9, context, this));
        u61 n10 = this.f43348p0.n(-2, true);
        this.f43339g0 = n10;
        n10.g(i10, org.telegram.ui.ActionBar.k6.G6, i10, i12, i11);
        org.telegram.ui.ActionBar.r6.C(this.f43339g0, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i11)), org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
        this.f43340h0 = new FrameLayout(context);
        s8 s8Var = new s8(context, this.f43339g0, this.resourceProvider, new l4(this, 0), new l4(this, 1), new l4(this, 2));
        this.f43341i0 = s8Var;
        this.f43340h0.addView(s8Var, c8.ha.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f43348p0.setPosition(this.f43336e0);
        Z0();
        this.f43346n0.addView(this.f43340h0, c8.ha.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f43346n0.addView(this.f43348p0, c8.ha.l(1.0f, -1, 0));
        L0(this.f43338f0);
        e0 e0Var2 = this.E0;
        if (e0Var2 != null) {
            this.f43342j0.Y(e0Var2);
        }
        this.f36243a.j(new ui(this, 21));
        l41 l41Var = this.f36243a.f37190f3;
        l41Var.f35528r = false;
        l41Var.O(false);
        t5 t5Var2 = new t5(this);
        this.f43349q0 = t5Var2;
        t5Var2.b(this.f36243a);
        R0();
        this.D0.h();
        this.actionBar.post(new e4(this, 9));
        this.f36243a.post(new e4(this, 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        l41 l41Var;
        if (i10 == this.currentAccount) {
            if (i7 == qs.f24971a4 && this.f43354t0 != null) {
                R0();
                Iterator it = this.P0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i7 == qs.f25114y3) {
                a1();
            } else if (i7 == qs.f25057q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.R0 = true;
                        this.S0 = ((TL_account.Password) obj).has_password;
                        fi.w3 w3Var2 = this.f36243a;
                        if (w3Var2 != null && (l41Var = w3Var2.f37190f3) != null) {
                            l41Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
            } else if (i7 == qs.f24977b4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                l0 l0Var = this.D0;
                if (obj2 == l0Var && (w3Var = this.f36243a) != null && w3Var.f37190f3 != null) {
                    if (l0Var.f42725b.isEmpty()) {
                        l0 l0Var2 = this.D0;
                        if (!l0Var2.h) {
                            l0Var2.h();
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
    public final boolean onBackPressed(boolean z9) {
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
            }
            return false;
        }
        s8 s8Var = this.f43341i0;
        if (s8Var != null && s8Var.f43151y) {
            if (z9) {
                s8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onBeginSlide() {
        t5 t5Var = this.f43349q0;
        if (t5Var != null) {
            t5Var.c();
        }
        fi.w3 w3Var = this.f36243a;
        if (w3Var != null) {
            w3Var.C0();
        }
        q41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f25566b;
        if (y5.f43397k0.compareAndSet(false, true)) {
            y5.f43398l0.postRunnable(new f4(context, 2));
        }
        getNotificationCenter().c(this, qs.f24971a4);
        getNotificationCenter().c(this, qs.f25114y3);
        getNotificationCenter().c(this, qs.f24977b4);
        getNotificationCenter().c(this, qs.f25057q0);
        m0 x10 = m0.x(this.currentAccount);
        if (x10.f42774o == null) {
            x10.f42774o = new e0(x10);
        }
        e0 e0Var = x10.f42774o;
        this.E0 = e0Var;
        e4 e4Var = this.G0;
        ArrayList arrayList = e0Var.d;
        if (!arrayList.contains(e4Var)) {
            arrayList.add(e4Var);
        }
        org.telegram.ui.Components.r2 r2Var = this.T0;
        if (r2Var != null) {
            r2Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new org.telegram.ui.Components.r2(x10, i7, 28);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.M0);
            this.M0 = null;
        }
        org.telegram.messenger.g0.r(this.K0);
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b8 b8Var = this.f43342j0;
        if (b8Var != null) {
            b8Var.p();
        }
        l5 l5Var = this.f43335e;
        if (l5Var != null) {
            l5Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.m0;
        if (valueAnimator2 != null) {
            this.m0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.E0;
        if (e0Var != null) {
            e0Var.d.remove(this.G0);
        }
        P0();
        t5 t5Var = this.f43349q0;
        if (t5Var != null) {
            t5Var.b(null);
        }
        getNotificationCenter().n(this, qs.f24971a4);
        getNotificationCenter().n(this, qs.f25114y3);
        getNotificationCenter().n(this, qs.f24977b4);
        getNotificationCenter().n(this, qs.f25057q0);
        org.telegram.messenger.g0.E2(this.E);
        l0 l0Var = this.D0;
        if (l0Var != null) {
            l0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.r2 r2Var = this.T0;
        if (r2Var != null) {
            r2Var.run();
            this.T0 = null;
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f36243a.setPadding(0, 0, 0, i12);
        this.f36243a.setClipToPadding(false);
        w70 w70Var = this.Z;
        if (w70Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w70Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.Z.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            i0Var.g();
            org.telegram.messenger.g0.E2(this.M0);
            this.M0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                K0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27296a.T = org.telegram.messenger.g0.X2(id.M0(2131746504, null));
            alertDialog$Builder.k(id.M0(2131747301, null), new h4(this));
            alertDialog$Builder.h(id.M0(2131751772, null), null);
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
            kVar.post(new e4(this, 9));
        }
        m0.x(this.currentAccount).E();
        if (this.E0 != null && m0.x(this.currentAccount).G()) {
            e0 e0Var = this.E0;
            if (!e0Var.f42417j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        R0();
        if (this.f36243a != null) {
            X0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f43354t0 != null && this.f43355u0 != null && this.f43335e != null) {
                U0(this.f43360x0);
            }
            l5 l5Var = this.f43335e;
            if (l5Var != null && this.B0 != null && this.C0 != null) {
                V0(l5Var.getStickerStyle());
            }
            w70 w70Var = this.Z;
            if (w70Var != null) {
                w70Var.invalidate();
            }
            TextView textView = this.W;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.invalidate();
            }
            h5 h5Var = this.S;
            if (h5Var != null) {
                h5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z9) {
        float f10;
        long j3;
        xq xqVar;
        org.telegram.messenger.g0.r(this.K0);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.I0 == f10) {
            return;
        }
        this.I0 = f10;
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        T0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H0, f10);
        this.J0 = ofFloat;
        if (z9) {
            j3 = 260;
        } else {
            j3 = 120;
        }
        ofFloat.setDuration(j3);
        ValueAnimator valueAnimator2 = this.J0;
        if (z9) {
            xqVar = new xq(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            xqVar = new xq(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(xqVar);
        this.J0.addUpdateListener(new k4(this, 1));
        this.J0.addListener(new s81(this, 6));
        this.J0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, h02, null, N, resourceProvider);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28262z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ha.e(-2, -2, 21));
        frameLayout.setOnClickListener(new i3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.ka.b(textView, 0.02f, 1.2f);
        this.S.addView(frameLayout, c8.ha.o(-1, -2));
        return frameLayout;
    }

    public final CharSequence x0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        wp wpVar = new wp(2131231955, 0);
        wpVar.d = false;
        spannableStringBuilder.setSpan(wpVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m0.o(j3, false));
        spannableStringBuilder.setSpan(new yz(org.telegram.ui.ActionBar.k6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return id.V(null, null, i7, spannableStringBuilder);
    }

    public final q41 y0() {
        View currentView;
        if (z0()) {
            fi.g1 g1Var = this.f43348p0;
            if (g1Var == null) {
                currentView = null;
            } else {
                currentView = g1Var.getCurrentView();
            }
            if (currentView instanceof q41) {
                return (q41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        bi.t tVar;
        if (!this.f43347o0 && (tVar = this.f43346n0) != null && tVar.isAttachedToWindow()) {
            ViewParent parent = this.f43346n0.getParent();
            fi.w3 w3Var = this.f36243a;
            if (parent == w3Var.f37189e3.m(w3Var.f37190f3.D.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
