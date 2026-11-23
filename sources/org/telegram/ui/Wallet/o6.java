package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
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
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.a31;
import org.telegram.ui.ao0;
import org.telegram.ui.b61;
import org.telegram.ui.hq0;
import org.telegram.ui.i71;
import org.telegram.ui.ig0;
import org.telegram.ui.oa0;
import org.telegram.ui.r90;
import org.telegram.ui.w61;
import org.telegram.ui.za1;
public final class o6 extends d51 implements fs {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public b61 C0;
    public float D0;
    public View E;
    public hi.e E0;
    public w61 F;
    public hi.e F0;
    public boolean G;
    public u0 G0;
    public m0 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public org.telegram.ui.ActionBar.g5 P0;
    public ci.b0 Q0;
    public int R0;
    public k5 S;
    public y5 T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public ao0 X0;
    public FrameLayout Y;
    public TextView Z;
    public j80 f44793a0;
    public z5 f44794b0;
    public boolean f44795c0;
    public FrameLayout f44796d0;
    public c6 f44797e;
    public FrameLayout f44798e0;
    public z5 f44799f;
    public boolean f44801g0;
    public int h;
    public j71 f44802h0;
    public FrameLayout f44803i0;
    public k9 f44804j0;
    public s8 f44805k0;
    public float m0;
    public d6 f44807n;
    public ValueAnimator f44808n0;
    public k5 f44809o0;
    public int f44810p0;
    public boolean f44811q0;
    public int f44812r;
    public boolean f44813r0;
    public boolean f44814s;
    public hi.q1 f44815s0;
    public k6 f44816t0;
    public LinearLayout f44818v0;
    public org.telegram.ui.Components.n6 f44820w0;
    public org.telegram.ui.Components.n6 f44822x0;
    public FrameLayout f44823y;
    public x6 f44824y0;
    public f6 f44825z0;
    public final o5 f44819w = new o5(this, 0);
    public final q4 f44821x = new ys() {
        @Override
        public final void a(int i7, boolean z10) {
            bi.i6 i6Var;
            o6 o6Var = o6.this;
            o5 o5Var = o6Var.f44819w;
            if ((i7 != 1 && i7 != 3) || (i6Var = o6Var.f34213a) == null) {
                return;
            }
            o6Var.f44814s = z10;
            i6Var.removeCallbacks(o5Var);
            o5Var.run();
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
    public int f44800f0 = 0;
    public String f44806l0 = "";
    public final g51[] f44817u0 = new g51[2];
    public final r4 J0 = new r4(this, 0);
    public final r4 O0 = new r4(this, 1);
    public final CharSequence[] S0 = new CharSequence[2];
    public final HashSet T0 = new HashSet();

    public static boolean F0(String str) {
        if (str != null) {
            if ("t.me".equalsIgnoreCase(str) || "telegram.me".equalsIgnoreCase(str) || "telegram.dog".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean G0(Uri uri) {
        String scheme = uri.getScheme();
        if (!"ton".equalsIgnoreCase(scheme) && !"tc".equalsIgnoreCase(scheme)) {
            if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && F0(uri.getHost())) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && j1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void K0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, r10 r10Var, p10 p10Var, byte[] bArr, org.telegram.ui.Cells.n0 n0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        TL_wallet.nftItem nftitem;
        String str;
        f3[] f3VarArr;
        View[] viewArr;
        p10 p10Var2;
        LinearLayout u02;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                di.f6 f6Var = new di.f6(context, i7, 0L, i6Var, null);
                f6Var.f8764e3 = wallettransaction;
                g3 c10 = g3.c(wallettransaction);
                if (c10 != null) {
                    str = c10.e();
                } else {
                    str = null;
                }
                f6Var.f8758b2.setStatusPill(str);
                f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                f6Var.show();
                return;
            }
        }
        boolean z10 = true;
        f3[] f3VarArr2 = new f3[1];
        View[] viewArr2 = new View[1];
        u0 H = v0.D(i7).H();
        ArrayList arrayList = new ArrayList(H.f45215c);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == wallettransaction || v0.t0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (r10Var == null && n0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232733).getPadding(rect);
            viewArr = viewArr2;
            ?? n5Var = new n5(context, i6Var, arrayList, H, i7, rect, viewArr);
            n5Var.setPosition(i10);
            f3VarArr = f3VarArr2;
            n5Var.setAdapter(new p5(arrayList, context, i6Var, rect, i7, f3VarArr2));
            p10Var2 = p10Var;
            u02 = n5Var;
        } else {
            f3VarArr = f3VarArr2;
            viewArr = viewArr2;
            p10Var2 = p10Var;
            u02 = u0(context, i7, wallettransaction, r10Var, p10Var, bArr, n0Var, i6Var, f3VarArr, false);
        }
        f3[] f3VarArr3 = f3VarArr;
        q5 q5Var = new q5(context, u02, i6Var, u02, viewArr, context);
        f3VarArr3[0] = q5Var;
        if ((u02 instanceof k71) && p10Var2 != null) {
            q5Var.n(new r(4, p10Var2, wallettransaction));
        }
        f3 f3Var = f3VarArr3[0];
        if (r10Var == null) {
            z10 = false;
        }
        f3Var.A0(z10);
        f3 f3Var2 = f3VarArr3[0];
        f3Var2.U0 = false;
        f3Var2.show();
    }

    public static void M0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.na.c(-2.0f, -1));
        linearLayout.addView(new n7(160, context, false), c8.na.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131742845, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(gd.N0(2131742844, null));
        int i10 = org.telegram.ui.ActionBar.n6.f29862z6;
        org.telegram.ui.ActionBar.u6.U(f10, i10, i6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.na.t(-1, -2, 1, 0, 0, 0, 24));
        h6 h6Var = new h6(context, i6Var);
        h6Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var.a(2131232835, gd.N0(2131742748, null), gd.N0(2131742747, null));
        linearLayout.addView(h6Var, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        h6 h6Var2 = new h6(context, i6Var);
        h6Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var2.a(2131232833, gd.N0(2131742816, null), gd.N0(2131742815, null));
        linearLayout.addView(h6Var2, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        h6 h6Var3 = new h6(context, i6Var);
        h6Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        h6Var3.a(2131232837, gd.N0(2131742931, null), gd.N0(2131742930, null));
        linearLayout.addView(h6Var3, c8.na.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        hi.e g10 = m10.g(24, context, i6Var, true);
        g10.setText(gd.N0(2131742849, null));
        linearLayout.addView(g10, c8.na.t(-1, 48, 1, 0, 0, 0, 0));
        c8.sa.b(g10, 0.02f, 1.1f);
        j80 j80Var = new j80(context, null);
        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
        j80Var.setTextSize(1, 13.0f);
        j80Var.setGravity(17);
        j80Var.setText(V0(gd.N0(2131742735, null), org.telegram.ui.ActionBar.n6.Xc, i6Var, new d5(context, 0)));
        linearLayout.addView(j80Var, c8.na.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        j3.O = frameLayout;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        w2VarArr[0].u0(true);
        w2VarArr[0].O();
        g10.setOnClickListener(new a5(w2VarArr, 1));
        w2VarArr[0].show();
    }

    public static void N0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        v0 D = v0.D(i7);
        if (D.N()) {
            String y10 = D.y();
            if (TextUtils.isEmpty(y10)) {
                return;
            }
            O0(context, i7, y10, true, null, i6Var);
        }
    }

    public static void O0(Context context, final int i7, String str, final boolean z10, final p pVar, final org.telegram.ui.ActionBar.i6 i6Var) {
        float f10;
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, i6Var, false);
        w2Var.v0(-12207881);
        w2Var.P(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new n6());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.na.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24221n));
        m6 m6Var = new m6(context, str);
        if (!z10) {
            m6Var.f44663b.setText(gd.N0(2131746304, null));
        }
        linearLayout.addView(m6Var, c8.na.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131742770, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.na.t(-1, -2, 1, 24, 0, 24, 20));
        final hi.e eVar = new hi.e(context, null, true);
        eVar.setRoundRadius(24);
        eVar.setColor(-1);
        eVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new kq(2131232813, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131742929, null));
        } else {
            f10 = 12.0f;
            kq kqVar = new kq(2131231960, 0);
            kqVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) gd.N0(2131742746, null));
        }
        eVar.setText(spannableStringBuilder);
        linearLayout.addView(eVar, c8.na.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z10) {
            int i10 = 8;
            textView.setVisibility(8);
            if (pVar != null) {
                i10 = 0;
            }
            eVar.setVisibility(i10);
        }
        View e10 = m10.e(context, 2131231272);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(gd.N0(2131752029, null));
        c8.sa.a(e10);
        frameLayout.addView(e10, c8.na.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        w2Var.O = frameLayout;
        w2Var.f30265x = true;
        w2Var.f30262v0 = false;
        w2Var.f30264w0 = false;
        w2Var.P(-12207881);
        e10.setOnClickListener(new s4(w2Var, 0));
        m6Var.f44666f = new b1(str, 1);
        w2Var.show();
        w2Var.E0(-12207881);
        org.telegram.messenger.g0.s3(w2Var, -12207881, false, null);
        org.telegram.messenger.g0.m3(w2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && w2Var.getWindow() != null) {
            w2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        eVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z11 = z10;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                if (!z11) {
                    w2Var2.dismiss();
                    pVar.run();
                    return;
                }
                hi.e eVar2 = eVar;
                if (eVar2.R) {
                    return;
                }
                eVar2.setLoading(true);
                x4 x4Var = new x4(eVar2, w2Var2, i6Var, 0);
                int i11 = i7;
                v0 D = v0.D(i11);
                D.x0(new e21(i11, x4Var, D));
            }
        });
    }

    public static SpannableStringBuilder V0(String str, int i7, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new ki.c3(i7, i6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void d0(o6 o6Var) {
        N0(o6Var.currentAccount, o6Var.getParentActivity(), o6Var.getResourceProvider());
    }

    public static void d1(g51 g51Var, boolean z10) {
        boolean canScrollVertically = g51Var.canScrollVertically(-1);
        g51Var.f35323g3.O(z10);
        g51Var.a0();
        if (!canScrollVertically) {
            g51Var.f35322f3.h1(0, 0);
        }
    }

    public static void e0(o6 o6Var, String str, v0 v0Var, x60 x60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, o6Var.getParentActivity(), o6Var.resourceProvider, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        y0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = y0Var.f30345b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        y0Var.setChecked(equals);
        y0Var.setOnClickListener(new s1(v0Var, currencyrate, x60Var, 2));
        linearLayout.addView(y0Var, c8.na.o(200, -2));
    }

    public static void f0(o6 o6Var) {
        N0(o6Var.currentAccount, o6Var.getParentActivity(), o6Var.getResourceProvider());
    }

    public static void g0(o6 o6Var) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (o6Var.F != null && (z4Var = o6Var.simpleActionBar) != null && (z4Var.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) o6Var.simpleActionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (o6Var.F.getParent() != o6Var.simpleActionBar) {
                org.telegram.messenger.g0.E2(o6Var.F);
                o6Var.simpleActionBar.addView(o6Var.F, c8.na.c(56.0f, -1));
            }
            o6Var.F.bringToFront();
            o6Var.F.post(new r4(o6Var, 6));
        }
    }

    public static void h0(o6 o6Var) {
        v0 D = v0.D(o6Var.currentAccount);
        hi.e eVar = o6Var.F0;
        if (eVar.R) {
            return;
        }
        eVar.setLoading(true);
        D.x0(new h2.n0((Object) D, (Object) new a31(13, o6Var, D), false, false, 4));
    }

    public static void i0(o6 o6Var, LinearLayout linearLayout, v0 v0Var, x60 x60Var) {
        TL_wallet.currencyRate currencyrate;
        o6 o6Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        v0 v0Var2 = v0Var;
        linearLayout2.removeAllViews();
        String g10 = v0Var2.h.g();
        TL_wallet.currencyRates f10 = v0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                vz vzVar = new vz(o6Var.getParentActivity(), o6Var.getResourceProvider());
                vzVar.setIsSingleCell(true);
                vzVar.setViewType(31);
                linearLayout2.addView(vzVar, c8.na.o(200, -2));
            }
            return;
        }
        g gVar = v0Var2.h;
        gVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f11 = gVar.f();
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
            currencyrate2 = g.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f11 != null && f11.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(gVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f27013b.getSystemService("input_method");
                if (inputMethodManager != null) {
                    g.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            g.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            g.a(linkedHashSet, ((org.telegram.messenger.n0) mp.u1(gVar.f44331a).A7.T.f15482b).f25966c);
            g.c(linkedHashSet, gd.E0().f24342y);
            g.c(linkedHashSet, gd.E0().f24343z);
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
                e0(o6Var, g10, v0Var2, x60Var, linearLayout2, currencyrate7);
            }
            i12++;
            v0Var2 = v0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            o6Var2 = o6Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(o6Var.getParentActivity(), o6Var2.resourceProvider), c8.na.o(-1, 8));
        } else {
            o6Var2 = o6Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                e0(o6Var2, g10, v0Var, x60Var, linearLayout2, currencyrate8);
            }
            i13++;
            o6Var2 = o6Var;
            linearLayout2 = linearLayout;
        }
    }

    public static Uri i1(String str) {
        Uri parse = Uri.parse(str.trim());
        if (parse.getScheme() == null) {
            Uri parse2 = Uri.parse("https://" + str.trim());
            if (F0(parse2.getHost())) {
                return parse2;
            }
        }
        return parse;
    }

    public static void j0(o6 o6Var) {
        vf.c.t(o6Var.getParentActivity(), v0.D(o6Var.currentAccount).f45262j);
    }

    public static String j1(Uri uri) {
        if (F0(uri.getHost())) {
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

    public static void k0(o6 o6Var, String str) {
        Uri i12 = i1(str);
        String j12 = j1(i12);
        if (j12 != null) {
            int i7 = o6Var.currentAccount;
            mp.u1(i7).f2().a(j12, null, new hi.a4(i7, new w4(o6Var, 4), 7));
        } else if ((o6Var.getParentActivity() instanceof LaunchActivity) && new r90((LaunchActivity) o6Var.getParentActivity(), o6Var.currentAccount, null, false).g(i12)) {
        } else {
            org.telegram.messenger.g0.g3(new r4(o6Var, 9));
        }
    }

    public static void l0(final o6 o6Var, Context context, org.telegram.ui.ActionBar.g5 g5Var, View view) {
        boolean z10;
        v0 D = v0.D(o6Var.currentAccount);
        final x60 J = x60.J(o6Var, view);
        J.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        J.f41892s = 0;
        J.W(5);
        x60 K = J.K();
        K.c(2131231243, gd.N0(2131742941, null), new hq0(J, 27), false);
        K.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        w7 w7Var = new w7(o6Var, linearLayout, D, J, 10);
        K.r(scrollView, c8.na.o(-1, 350));
        J.c(2131232821, gd.N0(2131742897, null), new p(w7Var, J, K, 11), false);
        org.telegram.ui.ActionBar.y0 z11 = J.z();
        g gVar = D.h;
        String i7 = gVar.i();
        boolean isEmpty = TextUtils.isEmpty(i7);
        String str = i7;
        if (isEmpty) {
            z11.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131748586, null));
            spannableStringBuilder.setSpan(new o80(org.telegram.messenger.g0.L(75.0f), z11.f30345b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z11.setSubtext(str);
        if (gVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        final w7 w7Var2 = new w7(D, new boolean[]{z10}, z11, w7Var, 11);
        o6Var.T0.add(w7Var2);
        w7Var.run();
        J.c(2131232839, gd.N0(2131747463, null), new Runnable(o6Var) {
            public final o6 f45480b;

            {
                this.f45480b = o6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o6 o6Var2 = this.f45480b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        o6 o6Var3 = this.f45480b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        return;
                    case 2:
                        o6 o6Var4 = this.f45480b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new d51());
                        return;
                    default:
                        J.v();
                        o6 o6Var5 = this.f45480b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.c(2131232832, gd.N0(2131742828, null), new Runnable(o6Var) {
            public final o6 f45480b;

            {
                this.f45480b = o6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o6 o6Var2 = this.f45480b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        o6 o6Var3 = this.f45480b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        return;
                    case 2:
                        o6 o6Var4 = this.f45480b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new d51());
                        return;
                    default:
                        J.v();
                        o6 o6Var5 = this.f45480b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.l(2131232812, gd.N0(2131742905, null), new Runnable(o6Var) {
            public final o6 f45480b;

            {
                this.f45480b = o6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o6 o6Var2 = this.f45480b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        o6 o6Var3 = this.f45480b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        return;
                    case 2:
                        o6 o6Var4 = this.f45480b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new d51());
                        return;
                    default:
                        J.v();
                        o6 o6Var5 = this.f45480b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        return;
                }
            }
        }, !D.f45260g.d.isEmpty());
        J.k();
        J.c(2131232825, gd.N0(2131742689, null), new Runnable(o6Var) {
            public final o6 f45480b;

            {
                this.f45480b = o6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        o6 o6Var2 = this.f45480b;
                        o6Var2.getClass();
                        J.v();
                        o6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        o6 o6Var3 = this.f45480b;
                        o6Var3.getClass();
                        J.v();
                        o6Var3.presentFragment(new e9());
                        return;
                    case 2:
                        o6 o6Var4 = this.f45480b;
                        o6Var4.getClass();
                        J.v();
                        o6Var4.presentFragment(new d51());
                        return;
                    default:
                        J.v();
                        o6 o6Var5 = this.f45480b;
                        o6.M0(o6Var5.getParentActivity(), o6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        org.telegram.ui.ActionBar.k5 simpleMenuOverlay = o6Var.getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        if (simpleMenuOverlay != null) {
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                org.telegram.ui.ActionBar.z4 z4Var = o6Var.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                org.telegram.ui.ActionBar.k5 menuOverlay = z4Var.getMenuOverlay();
                if (menuOverlay != null && g5Var.getParent() == z4Var.d) {
                    menuOverlay.d(z4Var, g5Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.f41886p = new m(simpleMenuOverlay, 6);
                    simpleMenuOverlay.setOnClosed(new Runnable(o6Var) {
                        public final o6 f45424b;

                        {
                            this.f45424b = o6Var;
                        }

                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    this.f45424b.T0.remove(w7Var2);
                                    return;
                                default:
                                    this.f45424b.T0.remove(w7Var2);
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.f41886p = new Runnable(o6Var) {
            public final o6 f45424b;

            {
                this.f45424b = o6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f45424b.T0.remove(w7Var2);
                        return;
                    default:
                        this.f45424b.T0.remove(w7Var2);
                        return;
                }
            }
        };
        J.a0();
    }

    public static void m0(o6 o6Var, long j3) {
        r4 r4Var = o6Var.O0;
        if (o6Var.f34213a != null) {
            k9 k9Var = o6Var.f44804j0;
            if (k9Var != null) {
                k9Var.a();
            }
            if (o6Var.M0 <= 0.0f && o6Var.D0()) {
                int top = o6Var.f34213a.f35322f3.m(o6Var.h).getTop() - o6Var.f34213a.getPaddingTop();
                o6Var.f34213a.C0();
                if (top < 0) {
                    o6Var.f34213a.w0(0, top, kr.h);
                    return;
                }
                return;
            }
            o6Var.f34213a.C0();
            o6Var.t0(true);
            org.telegram.messenger.g0.r(r4Var);
            if (j3 > 0) {
                org.telegram.messenger.g0.h3(r4Var, j3 + 260);
            }
        }
    }

    public static Typeface s0(Context context) {
        if (Y0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                Y0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                Y0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        return Y0;
    }

    public static android.widget.LinearLayout u0(final android.content.Context r39, int r40, org.telegram.tgnet.tl.TL_wallet.walletTransaction r41, org.telegram.messenger.r10 r42, org.telegram.messenger.p10 r43, byte[] r44, java.lang.Runnable r45, org.telegram.ui.ActionBar.i6 r46, org.telegram.ui.Wallet.f3[] r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o6.u0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.r10, org.telegram.messenger.p10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.i6, org.telegram.ui.Wallet.f3[], boolean):android.widget.LinearLayout");
    }

    public static String x0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static CharSequence y0(String str, Runnable runnable) {
        if (TextUtils.isEmpty(str)) {
            return gd.N0(2131742702, null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = 0;
        while (true) {
            char c10 = '\n';
            if (i7 < str.length()) {
                if (i7 > 0 && i7 % 4 == 0) {
                    if (i7 % 16 != 0) {
                        c10 = ' ';
                    }
                    spannableStringBuilder.append(c10);
                    spannableStringBuilder.length();
                }
                spannableStringBuilder.append(str.charAt(i7));
                if (i7 % 4 == 3) {
                    spannableStringBuilder.length();
                }
                i7++;
            } else {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(str, runnable, 10), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        }
    }

    public static SpannableStringBuilder z0(int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        kq kqVar = new kq(2131232824, 2);
        kqVar.d = false;
        kqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence r10 = v0.D(i7).r(j3, true);
        if (!TextUtils.isEmpty(r10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(r10);
            spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29862z6, i6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final CharSequence A0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        kq kqVar = new kq(2131231959, 0);
        kqVar.d = false;
        spannableStringBuilder.setSpan(kqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) v0.t(j3, false));
        spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return gd.V(null, null, i7, spannableStringBuilder);
    }

    public final g51 B0() {
        View currentView;
        if (C0()) {
            hi.q1 q1Var = this.f44815s0;
            if (q1Var == null) {
                currentView = null;
            } else {
                currentView = q1Var.getCurrentView();
            }
            if (currentView instanceof g51) {
                return (g51) currentView;
            }
        }
        return null;
    }

    public final boolean C0() {
        k5 k5Var;
        if (!this.f44813r0 && (k5Var = this.f44809o0) != null && k5Var.isAttachedToWindow()) {
            ViewParent parent = this.f44809o0.getParent();
            bi.i6 i6Var = this.f34213a;
            if (parent == i6Var.f35322f3.m(i6Var.f35323g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean D0() {
        View m10;
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null && (m10 = i6Var.f35322f3.m(this.h)) != null && this.B0 < 0.5f && m10.getBottom() > this.f34213a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final boolean E0() {
        k5 k5Var = this.f44809o0;
        if (k5Var != null && this.f34213a != null && (k5Var.getParent() instanceof View) && ((View) this.f44809o0.getParent()).getTop() <= this.f34213a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void H0() {
        m0 m0Var;
        g51 g51Var = this.f44817u0[1];
        if (this.f44800f0 == 1 && g51Var != null && g51Var.H && (m0Var = this.H0) != null && !m0Var.f44635i && !m0Var.f44634g && m0Var.f44639m == null && g51Var.f35322f3.N0() >= g51Var.f35323g3.E.size() - 3) {
            this.H0.f();
        }
    }

    public final void I0() {
        u0 u0Var;
        g51 g51Var = this.f44817u0[0];
        if (g51Var != null && g51Var.H && (u0Var = this.G0) != null && !u0Var.f45221k && !u0Var.h && g51Var.f35322f3.N0() >= g51Var.f35323g3.E.size() - 3) {
            this.G0.h();
        }
    }

    public final CharSequence J0(int i7) {
        org.telegram.ui.Components.n6 n6Var;
        float f10;
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            if (i7 == 0) {
                n6Var = this.f44820w0;
            } else {
                n6Var = this.f44822x0;
            }
            if (i7 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            o80 o80Var = new o80(org.telegram.messenger.g0.L(f10), n6Var);
            o80Var.a(org.telegram.ui.ActionBar.n6.r1(0.45f, -1), org.telegram.ui.ActionBar.n6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(o80Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i7];
    }

    public final void L0(TL_wallet.nftItem nftitem) {
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
            di.f6 f6Var = new di.f6(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            f6Var.f8759b3 = nftitem;
            if (this.f44805k0 != null) {
                f6Var.f8761c3 = new w5(this, tL_starGiftUnique, nftitem);
                f6Var.f8762d3 = new x5(this, nftitem);
            }
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(f6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.n6.f29394a7;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.n6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) parentActivity, resourceProvider, false);
            w2Var.f30227b0 = i14;
            w2Var.v0(w02);
            w2Var.P(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            float f10 = 12.0f;
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(parentActivity);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            p9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232841).mutate();
            int i16 = org.telegram.ui.ActionBar.n6.f29862z6;
            org.telegram.ui.ActionBar.u6.x(p9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            fc c10 = c.c(nftitem, false);
            if (c10 != null) {
                p9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                p9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(p9Var, c8.na.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = gd.N0(2131742925, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.f3.l(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.na.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.u6.U(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView2.setVisibility(i7);
            linearLayout.addView(textView2, c8.na.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.na.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i19 = org.telegram.ui.ActionBar.n6.f29451d6;
                int w03 = org.telegram.ui.ActionBar.n6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.n6.f29543i6;
                int w04 = org.telegram.ui.ActionBar.n6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i19);
                org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.u6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742710;
                } else {
                    i10 = 2131742752;
                }
                String N0 = gd.N0(i10, str2);
                linearLayout3.setContentDescription(N0);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i11 = 2131232854;
                } else {
                    i11 = 2131232845;
                }
                imageView.setImageResource(i11);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.n6.G6;
                org.telegram.ui.ActionBar.u6.s(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.na.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(N0);
                float f11 = f10;
                org.telegram.messenger.f3.l(textView3, i21, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.na.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                linearLayout2.addView(linearLayout3, c8.na.m(1.0f, 0, -1, i12, i13, 0));
                i18++;
                f10 = f11;
                i17 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                dy0 dy0Var = new dy0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i22 = org.telegram.ui.ActionBar.n6.f29451d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i22);
                dy0Var.setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(dy0Var, d02, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    dy0Var.e(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(dy0Var, c8.na.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
            eVar.setRoundRadius(24);
            eVar.setText(gd.N0(2131742811, null));
            linearLayout.addView(eVar, c8.na.o(-1, 48));
            w2Var.O = scrollView;
            w2Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ig0(20, w2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new p3(parentActivity, 1));
            eVar.setOnClickListener(new p3(w2Var, 2));
            w2Var.show();
            w2Var.P(w02);
            org.telegram.messenger.g0.s3(w2Var, w02, false, null);
        }
    }

    public final void P0() {
        if (getParentActivity() != null && this.Q0 == null && this.P0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.Q0 = ci.b0.k(this, this.P0, new ci.y(12), new w4(this, 3), new r4(this, 7));
            }
        }
    }

    public final void Q0(boolean z10) {
        float f10;
        boolean z11;
        this.f44801g0 = z10;
        if (!z10) {
            this.f44800f0 = 0;
        }
        if (this.f44815s0 != null && this.f44803i0 != null) {
            if (!z10) {
                this.f44804j0.b(false);
                this.f44815s0.setPosition(0);
            }
            g1();
            ValueAnimator valueAnimator = this.f44808n0;
            if (valueAnimator != null) {
                this.f44808n0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.f44809o0.isAttachedToWindow() && this.f44809o0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f44815s0.l(false);
            }
            if (z11 && this.m0 != f10) {
                this.f44803i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
                this.f44808n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f44808n0.setInterpolator(kr.h);
                this.f44808n0.addUpdateListener(new v4(this, 0));
                this.f44808n0.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 8));
                this.f44808n0.start();
            } else {
                R0(f10);
                this.f44815s0.l(false);
            }
            if (this.f34213a != null && this.f44813r0 != S0()) {
                c1(false);
            }
        }
    }

    public final void R0(float f10) {
        this.m0 = f10;
        this.f44803i0.setAlpha(f10);
        f1();
        int round = Math.round(org.telegram.messenger.g0.L(46.0f) * f10);
        if (this.f44810p0 != round) {
            this.f44810p0 = round;
            e1(0);
            e1(1);
        }
    }

    public final boolean S0() {
        u0 u0Var;
        if (!this.f44801g0 && (u0Var = this.G0) != null && u0Var.f45215c.isEmpty()) {
            u0 u0Var2 = this.G0;
            if (!u0Var2.f45221k && u0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T0() {
        this.I0 = false;
        k9 k9Var = this.f44804j0;
        if (k9Var != null) {
            k9Var.b(false);
        }
        this.f44800f0 = 0;
        hi.q1 q1Var = this.f44815s0;
        if (q1Var != null) {
            q1Var.setPosition(0);
        }
    }

    public final void U0() {
        this.f44814s = false;
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null) {
            i6Var.E2.f33550b.remove(this.f44821x);
            this.f34213a.removeCallbacks(this.f44819w);
        }
        c6 c6Var = this.f44797e;
        if (c6Var != null) {
            c6Var.setAdditionalTilt(0.0f);
        }
    }

    public final void W0() {
        boolean z10;
        v0 D = v0.D(this.currentAccount);
        h1();
        hi.e eVar = this.F0;
        if (D.N() && D.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.setEnabled(z10);
        if (!D.N()) {
            this.f44820w0.setText(J0(0));
            this.f44822x0.setText(J0(1));
            return;
        }
        long A = D.A();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            c6 c6Var = this.f44797e;
            c6Var.getClass();
            x6 x6Var = new x6(c6Var);
            this.f44824y0 = x6Var;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(x6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) y6.e(A));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) gd.N0(2131749340, null));
        if (this.f44825z0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f44286a = -9577217;
            this.f44825z0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f44825z0, length, spannableStringBuilder.length(), 33);
        this.f44820w0.setText(spannableStringBuilder);
        CharSequence r10 = v0.D(this.currentAccount).r(A, false);
        if (TextUtils.isEmpty(r10)) {
            this.f44822x0.setText(J0(1));
        } else {
            this.f44822x0.setText(r10);
        }
        Z0(this.A0);
        m0 m0Var = this.H0;
        if (m0Var != null && !m0Var.h && !m0Var.f44635i && m0Var.f44639m == null) {
            m0Var.f();
        }
        String y10 = D.y();
        if (!TextUtils.isEmpty(y10)) {
            this.f44797e.setCardNumber(x0(y10.toUpperCase()));
        }
    }

    public final void X0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            c6 c6Var = this.f44797e;
            w61 w61Var = this.F;
            Matrix matrix = this.I;
            if (c6Var.g(w61Var, matrix)) {
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
                this.f44797e.i(this.A0, this.f44823y.getWidth() / 0.7826087f);
                float f12 = iArr2[0] - iArr[0];
                float z10 = org.telegram.ui.Cells.c0.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i12 = 0; i12 < 4; i12++) {
                    int i13 = i12 * 2;
                    float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.A0);
                    float[] fArr3 = this.N;
                    fArr3[i13] = T1;
                    int i14 = i13 + 1;
                    fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + z10, this.A0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.F.invalidate();
                }
                c6 c6Var2 = this.f44797e;
                Matrix matrix4 = c6Var2.f45432c;
                Matrix matrix5 = c6Var2.f45435e;
                Matrix matrix6 = c6Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!c6Var2.f45443n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        c6Var2.f45443n = true;
                        c6Var2.O.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.A0);
                this.f44822x0.setPivotX(0.0f);
                this.f44822x0.setPivotY(0.0f);
                this.f44822x0.setScaleX(T12);
                this.f44822x0.setScaleY(T12);
            }
        }
    }

    public final void Y0() {
        w61 w61Var;
        float i7;
        boolean z10;
        float f10;
        c6 c6Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f11;
        float height;
        c6 c6Var2;
        if (this.f34213a != null && this.f44797e != null && this.f44818v0 != null && this.E != null && (w61Var = this.F) != null && this.simpleActionBar != null) {
            w61Var.bringToFront();
            View m10 = this.f34213a.f35322f3.m(this.h);
            if (m10 == null) {
                if (this.f34213a.f35322f3.L0() > this.h) {
                    i7 = 1.0f;
                } else {
                    i7 = 0.0f;
                }
            } else {
                i7 = Utilities.i((this.f34213a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.B0 = i7;
            int i11 = (this.M0 > 0.0f ? 1 : (this.M0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.L0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    i7 = 0.0f;
                } else {
                    i7 = (1.0f - this.L0) * i7;
                }
            }
            this.A0 = i7;
            b1();
            if (m10 != null) {
                f10 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.A0;
            } else {
                f10 = 0.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.A0);
            this.f44797e.setPivotX(c6Var.getWidth() * 0.5f);
            this.f44797e.setPivotY(0.0f);
            this.f44797e.setScaleX(T1);
            this.f44797e.setScaleY(T1);
            this.f44797e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
            c6 c6Var3 = this.f44797e;
            if (!z10 && (m10 == null || i7 >= 1.0f || m10.getBottom() <= this.f34213a.getPaddingTop() || m10.getTop() >= this.f34213a.getHeight() - this.f34213a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            c6Var3.setVisibility(i10);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m10 != null) {
                this.f34213a.getLocationInWindow(iArr2);
                this.f44807n.getLocationInWindow(iArr);
                r16 = 1;
                this.f44797e.setTranslationX(((this.f44799f.getWidth() - this.f44797e.getWidth()) / 2.0f) + this.f44799f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f44797e.setTranslationY(this.f44799f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
            } else {
                r16 = 1;
            }
            if (z10) {
                if (this.M0 == 0.0f) {
                    z12 = r16;
                } else {
                    z12 = false;
                }
                float f12 = this.L0;
                if (z12) {
                    min = 0.3f * f12;
                    f11 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f12) * 0.06f;
                    f11 = 0.84f;
                }
                float f13 = min + f11;
                this.simpleActionBar.getLocationInWindow(iArr2);
                this.f44807n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.f44797e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z12) {
                    f15 = a8.p0.f(0.9f - f13, this.f44797e.getHeight(), 2.0f, f15);
                }
                float width = (this.f44807n.getWidth() - this.f44797e.getWidth()) / 2.0f;
                if (!z12) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f34213a.getLocationInWindow(iArr2);
                    float width2 = ((this.f44799f.getWidth() - this.f44797e.getWidth()) / 2.0f) + this.f44799f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y10 = this.f44799f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y10) / (this.f44797e.getHeight() * 0.5f)));
                    if (l10 >= 1.0f) {
                        org.telegram.messenger.g0.r(this.O0);
                        ValueAnimator valueAnimator = this.N0;
                        if (valueAnimator != null) {
                            this.N0 = null;
                            valueAnimator.cancel();
                        }
                        this.L0 = 0.0f;
                        this.M0 = 0.0f;
                        Y0();
                        return;
                    }
                    width = org.telegram.messenger.g0.T1(width, width2, l10);
                    f15 = org.telegram.messenger.g0.T1(f15, y10, l10);
                    f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                    f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
                }
                this.f44797e.setPivotX(c6Var2.getWidth() * 0.5f);
                this.f44797e.setPivotY(0.0f);
                this.f44797e.setScaleX(f13);
                this.f44797e.setScaleY(f13);
                this.f44797e.setTranslationX(width);
                this.f44797e.setTranslationY(f15);
                this.f44797e.setAlpha(f12);
            }
            if (i7 > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.G != z11 && (linearLayout = this.f44818v0) != null) {
                Rect rect = this.H;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f44818v0.getHeight() != 0) {
                        rect.set(this.f44818v0.getLeft(), this.f44818v0.getTop(), this.f44818v0.getRight(), this.f44818v0.getBottom());
                    }
                }
                this.f44797e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f44818v0);
                this.G = z11;
                if (z11) {
                    this.F.addView(this.f44818v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f44818v0.layout(0, 0, rect.width(), rect.height());
                    X0();
                } else {
                    c6 c6Var4 = this.f44797e;
                    c6Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = c6Var4.N;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    w6 w6Var = c6Var4.P;
                    w6Var.setScaleX(1.0f);
                    w6Var.setScaleY(1.0f);
                    c6Var4.F.addView(linearLayout2, c6Var4.Q);
                    this.f44818v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f44797e.getClass();
                    X0();
                }
                this.F.invalidate();
            }
            Z0(i7);
            if (this.G) {
                X0();
            }
            float f16 = 1.0f - i7;
            this.simpleActionBar.setTitlesAlpha(f16);
            if (this.simpleActionBar.getTitleTextView() != null) {
                this.simpleActionBar.getTitleTextView().setTranslationY((1.0f - f16) * (-org.telegram.messenger.g0.L(8.0f)));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        v0 D = v0.D(this.currentAccount);
        h1();
        arrayList.add(n41.m(this.S));
        this.h = arrayList.size();
        z5 z5Var = this.f44799f;
        n41 n41Var = new n41(-4);
        n41Var.f37647c = z5Var;
        n41Var.A = -1;
        n41Var.f37648e = true;
        arrayList.add(n41Var);
        arrayList.add(n41.m(this.C0));
        boolean S0 = S0();
        this.f44813r0 = S0;
        if (S0) {
            String N0 = gd.N0(2131742748, null);
            String N02 = gd.N0(2131742747, null);
            int i7 = g6.f44374b;
            n41 K = n41.K(g6.class);
            K.f37653k = 2131232835;
            K.f37655m = N0;
            K.f37656n = N02;
            arrayList.add(K);
            String N03 = gd.N0(2131742816, null);
            String N04 = gd.N0(2131742815, null);
            n41 K2 = n41.K(g6.class);
            K2.f37653k = 2131232833;
            K2.f37655m = N03;
            K2.f37656n = N04;
            arrayList.add(K2);
            String N05 = gd.N0(2131742931, null);
            String N06 = gd.N0(2131742930, null);
            n41 K3 = n41.K(g6.class);
            K3.f37653k = 2131232837;
            K3.f37655m = N05;
            K3.f37656n = N06;
            arrayList.add(K3);
            arrayList.add(n41.m(this.f44794b0));
        } else if (this.f44809o0 != null) {
            if (this.V0 && !this.W0 && D.A() > 500000000) {
                arrayList.add(n41.k(this.f44796d0));
            }
            k5 k5Var = this.f44809o0;
            n41 n41Var2 = new n41(-3);
            n41Var2.f37647c = k5Var;
            n41Var2.A = 0;
            n41Var2.f37667z = 1;
            arrayList.add(n41Var2);
        }
        j80 j80Var = this.f44793a0;
        if (j80Var != null) {
            this.f44795c0 = false;
            j80Var.animate().cancel();
            this.f44793a0.setAlpha(0.0f);
            this.f44793a0.setVisibility(4);
        }
    }

    public final void Z0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.G6);
        this.f44820w0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.n6 n6Var = this.f44822x0;
        float[] fArr = this.f44797e.f45431b0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], g8.p(-7868417, 0, fArr), g8.p(-7868417, 3, fArr));
        }
        n6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        x6 x6Var = this.f44824y0;
        if (x6Var != null) {
            x6Var.f36857y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
        }
        f6 f6Var = this.f44825z0;
        if (f6Var != null) {
            float[] fArr2 = this.f44797e.f45431b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], g8.p(-9577217, 0, fArr2), g8.p(-9577217, 3, fArr2));
            }
            f6Var.f44286a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f44820w0.invalidate();
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742732, null);
    }

    public final void a1(float[] fArr) {
        boolean z10;
        float f10;
        int n10;
        if (this.E0 != null && this.F0 != null) {
            float f11 = g8.j(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7))[0];
            if (f11 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Fi);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = i7 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = g8.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
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
            float[] j3 = g8.j(themedColor);
            float f14 = j3[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (g8.l(Math.max(f12, Math.min(f10, f14)), j3[1], j3[2]) & 16777215);
            }
            if (themedColor != this.R0) {
                this.R0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.n6.Ji);
                }
                hi.e[] eVarArr = {this.E0, this.F0};
                for (int i12 = 0; i12 < 2; i12++) {
                    hi.e eVar = eVarArr[i12];
                    eVar.setColor(themedColor);
                    eVar.setTextColor(i11);
                }
            }
        }
    }

    @Override
    public final void b0(n41 n41Var, View view) {
        m0 m0Var;
        Object obj = n41Var.H;
        if (obj instanceof TL_wallet.nftItem) {
            L0((TL_wallet.nftItem) obj);
        } else if (n41Var.d == -10001 && (m0Var = this.H0) != null) {
            m0Var.f();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            K0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) n41Var.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null && this.f44797e != null) {
            float b10 = i6Var.E2.b(1);
            float min = Math.min(10.0f, this.f34213a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f44797e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + min);
            this.f44797e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
        }
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        s8 s8Var;
        if ((view instanceof f8) && (s8Var = this.f44805k0) != null) {
            s8Var.S((f8) view);
            return true;
        }
        return false;
    }

    public final void c1(boolean z10) {
        boolean S0 = S0();
        bi.i6 i6Var = this.f34213a;
        g51[] g51VarArr = this.f44817u0;
        if (i6Var != null && this.f44813r0 != S0) {
            this.f44813r0 = S0;
            i6Var.C0();
            for (g51 g51Var : g51VarArr) {
                if (g51Var != null) {
                    g51Var.C0();
                }
            }
            this.f34213a.f35323g3.O(false);
            this.f34213a.f35322f3.h1(0, 0);
            this.f34213a.post(new r4(this, 6));
        }
        if (!S0) {
            for (g51 g51Var2 : g51VarArr) {
                if (g51Var2 != null) {
                    d1(g51Var2, z10);
                }
            }
            k5 k5Var = this.f44809o0;
            if (k5Var != null) {
                k5Var.post(new r4(this, 2));
                this.f44809o0.post(new r4(this, 3));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        s8 s8Var = this.f44805k0;
        if ((s8Var == null || !s8Var.f45090q0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int childCount;
        ValueAnimator valueAnimator = this.f44808n0;
        if (valueAnimator != null) {
            this.f44808n0 = null;
            valueAnimator.cancel();
        }
        U0();
        k6 k6Var = this.f44816t0;
        if (k6Var != null) {
            k6Var.b(null);
        }
        this.f44799f = null;
        this.T = null;
        this.S = null;
        this.f44809o0 = null;
        this.f44815s0 = null;
        g51[] g51VarArr = this.f44817u0;
        g51VarArr[0] = null;
        g51VarArr[1] = null;
        m0 m0Var = this.H0;
        if (m0Var != null && !m0Var.f44629a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44801g0 = z10;
        if (!z10) {
            this.f44800f0 = 0;
        } else if (this.I0) {
            this.f44800f0 = 1;
        }
        s8 s8Var = this.f44805k0;
        if (s8Var != null) {
            s8Var.p();
        }
        this.f44805k0 = null;
        View createView = super.createView(context);
        oa0 oa0Var = new oa0(this, context);
        oa0Var.addView(createView, c8.na.c(-1.0f, -1));
        this.fragmentView = oa0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, oa0Var, getResourceProvider());
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(2, 2131232683);
        this.P0 = b10;
        b10.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f44790b;

            {
                this.f44790b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44790b.P0();
                        return;
                    case 1:
                        o6 o6Var = this.f44790b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        return;
                    case 2:
                        o6.d0(this.f44790b);
                        return;
                    case 3:
                        o6.f0(this.f44790b);
                        return;
                    default:
                        o6.h0(this.f44790b);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g5 b11 = t6.b(1, 2131231247);
        b11.setOnClickListener(new s1(this, context, b11, 1));
        k5 k5Var = new k5(this, context, 1);
        this.S = k5Var;
        k5Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        y5 y5Var = new y5(this, context);
        this.T = y5Var;
        y5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new r4(this, 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(gd.N0(2131742691, null));
        this.U = v0(this.V, new r4(this, 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = v0(textView2, new r4(this, 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = v0(textView3, new r4(this, 12));
        this.S.addView(this.T, c8.na.c(-2.0f, -1));
        j80 j80Var = new j80(context, null);
        this.f44793a0 = j80Var;
        this.f44795c0 = false;
        j80Var.setAlpha(0.0f);
        j80 j80Var2 = this.f44793a0;
        int i7 = org.telegram.ui.ActionBar.n6.f29862z6;
        org.telegram.ui.ActionBar.u6.U(j80Var2, i7, this.resourceProvider);
        this.f44793a0.setTextSize(1, 13.0f);
        this.f44793a0.setGravity(17);
        this.f44793a0.setText(V0(gd.N0(2131742735, null), org.telegram.ui.ActionBar.n6.Xc, this.resourceProvider, new d5(context, 1)));
        this.f44793a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.f44793a0, c8.na.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        z5 z5Var = new z5(this, context, 0);
        this.f44794b0 = z5Var;
        z5Var.setImportantForAccessibility(2);
        this.f44796d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44798e0 = frameLayout2;
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(themedColor, org.telegram.ui.ActionBar.n6.w(themedColor2, getThemedColor(i11)), 16, 16);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i10, i11);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.f44796d0.addView(this.f44798e0, c8.na.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232842);
        this.f44798e0.addView(imageView, c8.na.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.f29692q7, this.resourceProvider);
        i5.c.r(16.0f, 1, 2131742773, textView4, null);
        this.f44798e0.addView(textView4, c8.na.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f44798e0.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f44790b;

            {
                this.f44790b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44790b.P0();
                        return;
                    case 1:
                        o6 o6Var = this.f44790b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        return;
                    case 2:
                        o6.d0(this.f44790b);
                        return;
                    case 3:
                        o6.f0(this.f44790b);
                        return;
                    default:
                        o6.h0(this.f44790b);
                        return;
                }
            }
        });
        c8.sa.b(this.f44798e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44823y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f44823y.setClipToPadding(false);
        this.simpleActionBar.addView(this.f44823y, c8.na.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.f44823y.addView(view, c8.na.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        w61 w61Var = new w61(this, context);
        this.F = w61Var;
        w61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        c6 c6Var = new c6(this, context);
        this.f44797e = c6Var;
        c6Var.setDiamondOnCard(true);
        this.f44797e.setCardOnClickListener(new View.OnClickListener(this) {
            public final o6 f44790b;

            {
                this.f44790b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44790b.P0();
                        return;
                    case 1:
                        o6 o6Var = this.f44790b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        return;
                    case 2:
                        o6.d0(this.f44790b);
                        return;
                    case 3:
                        o6.f0(this.f44790b);
                        return;
                    default:
                        o6.h0(this.f44790b);
                        return;
                }
            }
        });
        this.f34213a.E2.f33550b.add(this.f44821x);
        z5 z5Var2 = new z5(this, context, 1);
        this.f44799f = z5Var2;
        z5Var2.setImportantForAccessibility(2);
        d6 d6Var = new d6(this, context);
        this.f44807n = d6Var;
        d6Var.setClipChildren(false);
        this.f44807n.setClipToPadding(false);
        this.f44807n.addView(this.f44797e, c8.na.c(-2.0f, -1));
        oa0Var.addView(this.f44807n, c8.na.c(-1.0f, -1));
        this.f34213a.setClipChildren(false);
        this.f34213a.setClipToPadding(false);
        this.f44818v0 = this.f44797e.getBalanceLayout();
        this.f44820w0 = this.f44797e.getBalanceView();
        this.f44822x0 = this.f44797e.getUsdBalanceView();
        this.f44797e.setCardHolder(n10.q(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        b61 b61Var = new b61(24, context, this);
        this.C0 = b61Var;
        b61Var.setOrientation(0);
        this.C0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        eVar.setRoundRadius(24);
        this.E0 = eVar;
        eVar.setText(gd.N0(2131742953, null));
        this.C0.addView(this.E0, c8.na.m(1.0f, 0, 48, 0, 4, 0));
        this.E0.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f44790b;

            {
                this.f44790b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44790b.P0();
                        return;
                    case 1:
                        o6 o6Var = this.f44790b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        return;
                    case 2:
                        o6.d0(this.f44790b);
                        return;
                    case 3:
                        o6.f0(this.f44790b);
                        return;
                    default:
                        o6.h0(this.f44790b);
                        return;
                }
            }
        });
        hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.F0 = eVar2;
        eVar2.setText(gd.N0(2131742751, null));
        this.F0.setEnabled(v0.D(this.currentAccount).f());
        this.F0.setOnClickListener(new View.OnClickListener(this) {
            public final o6 f44790b;

            {
                this.f44790b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44790b.P0();
                        return;
                    case 1:
                        o6 o6Var = this.f44790b;
                        o6Var.getClass();
                        o6Var.presentFragment(new za1(6, null));
                        return;
                    case 2:
                        o6.d0(this.f44790b);
                        return;
                    case 3:
                        o6.f0(this.f44790b);
                        return;
                    default:
                        o6.h0(this.f44790b);
                        return;
                }
            }
        });
        this.C0.addView(this.F0, c8.na.m(1.0f, 0, 48, 4, 0, 0));
        a1(this.f44797e.getStickerStyle());
        this.G0 = v0.D(this.currentAccount).H();
        this.f34213a.setDescendantFocusability(131072);
        s8 s8Var2 = new s8(this, this.f44797e, new jb.m(this, oa0Var, false, 21), null);
        this.f44805k0 = s8Var2;
        oa0Var.addView(s8Var2, c8.na.c(-1.0f, -1));
        this.f44806l0 = "";
        this.f44809o0 = new k5(this, context, 0);
        hi.q1 q1Var = new hi.q1(this, context, this.resourceProvider, 9);
        this.f44815s0 = q1Var;
        q1Var.setAllowDisallowInterceptTouch(false);
        this.f44815s0.setAdapter(new di.i4(9, context, this));
        this.glassEngine.c(this.f44815s0);
        j71 k10 = this.f44815s0.k(-2, true);
        this.f44802h0 = k10;
        k10.h(i7, org.telegram.ui.ActionBar.n6.G6, i7, i11, i10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        gh.e m10 = c8.j0.m(this.resourceProvider);
        j71 j71Var = this.f44802h0;
        fh.g c10 = baseSimpleGlass.f56739c.c(j71Var, null, false);
        c10.p(m10);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        j71Var.setBlurredBackground(c10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44803i0 = frameLayout4;
        frameLayout4.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        this.f44803i0.setClipChildren(false);
        this.f44803i0.setClipToPadding(false);
        k9 k9Var = new k9(context, this.f44802h0, this.resourceProvider, new w4(this, 0), new w4(this, 1), new w4(this, 2));
        this.f44804j0 = k9Var;
        k9Var.setClipChildren(false);
        k9 k9Var2 = this.f44804j0;
        fh.g c11 = baseSimpleGlass.f56739c.c(k9Var2, null, false);
        c11.p(m10);
        c11.r(org.telegram.messenger.g0.L(20.0f));
        k9Var2.f44596y = c11;
        k9Var2.invalidate();
        this.f44803i0.addView(this.f44804j0, c8.na.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f44815s0.setPosition(this.f44800f0);
        g1();
        this.f44809o0.addView(this.f44815s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout5 = this.f44803i0;
        s8 s8Var3 = this.f44805k0;
        if (s8Var3 != null) {
            childCount = viewGroup.indexOfChild(s8Var3);
        } else {
            childCount = viewGroup.getChildCount();
        }
        viewGroup.addView(frameLayout5, childCount, c8.na.e(-1, 40, 48));
        Q0(this.f44801g0);
        m0 m0Var2 = this.H0;
        if (m0Var2 != null) {
            this.f44805k0.Y(m0Var2);
        }
        this.f34213a.j(new org.telegram.ui.Components.na(this, 24));
        b51 b51Var = this.f34213a.f35323g3;
        b51Var.f33631r = false;
        b51Var.O(false);
        k6 k6Var2 = new k6(this);
        this.f44816t0 = k6Var2;
        k6Var2.b(this.f34213a);
        W0();
        this.G0.h();
        this.simpleActionBar.post(new r4(this, 5));
        this.f34213a.post(new r4(this, 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.i6 i6Var;
        b51 b51Var;
        if (i10 == this.currentAccount) {
            if (i7 == ks.f25201d4 && this.f44820w0 != null) {
                W0();
                Iterator it = this.T0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i7 == ks.A3) {
                h1();
            } else if (i7 == ks.f25270q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.V0 = true;
                        this.W0 = ((TL_account.Password) obj).has_password;
                        bi.i6 i6Var2 = this.f34213a;
                        if (i6Var2 != null && (b51Var = i6Var2.f35323g3) != null) {
                            b51Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new e(this, 7));
            } else if (i7 == ks.f25207e4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                u0 u0Var = this.G0;
                if (obj2 == u0Var && (i6Var = this.f34213a) != null && i6Var.f35323g3 != null) {
                    if (u0Var.f45214b.isEmpty()) {
                        u0 u0Var2 = this.G0;
                        if (!u0Var2.h) {
                            u0Var2.h();
                        }
                    }
                    c1(true);
                }
            }
        }
    }

    public final void e1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        g51 g51Var = this.f44817u0[i7];
        if (g51Var != null) {
            bi.i6 i6Var = this.f34213a;
            if (i6Var != null) {
                i10 = i6Var.getPaddingTop();
            } else {
                i10 = 0;
            }
            int i14 = i10 + this.f44810p0;
            if (i7 == 1) {
                i11 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i11 = 0;
            }
            int i15 = i14 + i11;
            bi.i6 i6Var2 = this.f34213a;
            if (i6Var2 != null) {
                i12 = i6Var2.getPaddingBottom();
            } else {
                i12 = 0;
            }
            if (i7 == 1) {
                i13 = org.telegram.messenger.g0.L(12.0f);
            } else {
                i13 = 0;
            }
            int i16 = i12 + i13;
            if (g51Var.getPaddingTop() != i15 || g51Var.getPaddingBottom() != i16) {
                boolean canScrollVertically = g51Var.canScrollVertically(-1);
                if (i7 == 1) {
                    g51Var.setPadding(org.telegram.messenger.g0.L(9.0f), i15, org.telegram.messenger.g0.L(9.0f), i16);
                } else {
                    g51Var.setPadding(0, i15, 0, i16);
                }
                if (!canScrollVertically) {
                    g51Var.f35322f3.h1(0, 0);
                }
            }
        }
    }

    public final void f1() {
        View view;
        boolean z10;
        int i7;
        k5 k5Var;
        if (this.f44803i0 != null) {
            boolean E0 = E0();
            if (this.f44811q0 != E0 && (k5Var = this.f44809o0) != null) {
                this.f44811q0 = E0;
                k5Var.invalidate();
            }
            if (C0()) {
                view = (View) this.f44809o0.getParent();
            } else {
                view = null;
            }
            int i10 = 0;
            if (view != null && (this.m0 > 0.0f || this.f44808n0 != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f44803i0;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            View view2 = (View) this.f34213a.getParent();
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                i10 = z4Var.getHeight();
            }
            if (z10) {
                float y10 = this.f34213a.getY() + view2.getY();
                float y11 = view.getY() + y10 + org.telegram.messenger.g0.L(2.0f);
                this.f44803i0.setTranslationY(y11);
                float paddingTop = y10 + this.f34213a.getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
                float L = (org.telegram.messenger.g0.L(46.0f) + paddingTop) - Math.max(0.0f, y11 - paddingTop);
                float f10 = this.m0;
                i10 = Math.max(i10, Math.round(((1.0f - f10) * i10) + (L * f10)));
            }
            w0(this.S);
            w0(this.C0);
            w0(this.f44796d0);
            View view3 = this.K0;
            if (view3 != null && view3.getLayoutParams().height != i10) {
                this.K0.getLayoutParams().height = i10;
                this.K0.requestLayout();
            }
        }
    }

    public final void g1() {
        k9 k9Var = this.f44804j0;
        if (k9Var != null && this.f44815s0 != null && k9Var.f44595x != 0.0f) {
            k9Var.f44595x = 0.0f;
            k9Var.f44588c.setVisibility(8);
            k9Var.invalidate();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34213a;
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        v0 D = v0.D(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y5 y5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = D.f45261i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(D.f45262j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        y5Var.j(frameLayout, z11, z10);
        long j3 = 0;
        if (!TextUtils.isEmpty(D.y())) {
            ArrayList arrayList = D.J;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                r0 r0Var = (r0) obj;
                if (!r0Var.f44980e) {
                    long j11 = r0Var.f44979c;
                    if (j11 >= 0) {
                        j10 += j11;
                    }
                }
            }
            j3 = j10;
        }
        if (j3 > 500000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.X.setText(A0(2131742810, j3));
        }
        this.T.j(this.W, z12, z10);
        long j12 = di.y8.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(A0(2131742848, j12));
        }
        this.T.j(this.Y, z13, z10);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            if (z10) {
                b0Var.e();
            }
            return false;
        }
        k9 k9Var = this.f44804j0;
        if (k9Var != null && k9Var.E) {
            if (z10) {
                k9Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        k6 k6Var = this.f44816t0;
        if (k6Var != null) {
            k6Var.c();
        }
        bi.i6 i6Var = this.f34213a;
        if (i6Var != null) {
            i6Var.C0();
        }
        g51 B0 = B0();
        if (B0 != null) {
            B0.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f27013b;
        if (q6.f44925k0.compareAndSet(false, true)) {
            q6.f44926l0.postRunnable(new d5(context, 2));
        }
        getNotificationCenter().c(this, ks.f25201d4);
        getNotificationCenter().c(this, ks.A3);
        getNotificationCenter().c(this, ks.f25207e4);
        getNotificationCenter().c(this, ks.f25270q0);
        v0 D = v0.D(this.currentAccount);
        m0 B = D.B();
        this.H0 = B;
        r4 r4Var = this.J0;
        ArrayList arrayList = B.d;
        if (!arrayList.contains(r4Var)) {
            arrayList.add(r4Var);
        }
        ao0 ao0Var = this.X0;
        if (ao0Var != null) {
            ao0Var.run();
        }
        int i7 = D.F;
        D.F = i7 + 1;
        HashSet hashSet = D.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            D.a0();
        }
        this.X0 = new ao0(D, i7, 7);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new e(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.Q0);
            this.Q0 = null;
        }
        org.telegram.messenger.g0.r(this.O0);
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        s8 s8Var = this.f44805k0;
        if (s8Var != null) {
            s8Var.p();
        }
        c6 c6Var = this.f44797e;
        if (c6Var != null) {
            c6Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.f44808n0;
        if (valueAnimator2 != null) {
            this.f44808n0 = null;
            valueAnimator2.cancel();
        }
        m0 m0Var = this.H0;
        if (m0Var != null) {
            m0Var.d.remove(this.J0);
        }
        U0();
        k6 k6Var = this.f44816t0;
        if (k6Var != null) {
            k6Var.b(null);
        }
        getNotificationCenter().n(this, ks.f25201d4);
        getNotificationCenter().n(this, ks.A3);
        getNotificationCenter().n(this, ks.f25207e4);
        getNotificationCenter().n(this, ks.f25270q0);
        org.telegram.messenger.g0.E2(this.F);
        u0 u0Var = this.G0;
        if (u0Var != null) {
            u0Var.a();
        }
        super.onFragmentDestroy();
        ao0 ao0Var = this.X0;
        if (ao0Var != null) {
            ao0Var.run();
            this.X0 = null;
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (this.f44809o0 != null) {
            e1(0);
            e1(1);
            this.f44809o0.requestLayout();
        }
        j80 j80Var = this.f44793a0;
        if (j80Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j80Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.f44793a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ci.b0 b0Var = this.Q0;
        if (b0Var != null) {
            b0Var.g();
            org.telegram.messenger.g0.E2(this.Q0);
            this.Q0 = null;
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (i7 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                P0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(gd.N0(2131746307, null));
            alertDialog$Builder.k(gd.N0(2131747106, null), new p4(this));
            alertDialog$Builder.h(gd.N0(2131751760, null), null);
            int i10 = org.telegram.ui.ActionBar.n6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.n6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.post(new r4(this, 5));
        }
        v0.D(this.currentAccount).K();
        if (this.H0 != null && v0.D(this.currentAccount).N()) {
            this.H0.e();
        }
        W0();
        if (this.f34213a != null) {
            c1(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f44820w0 != null && this.f44822x0 != null && this.f44797e != null) {
                Z0(this.A0);
            }
            c6 c6Var = this.f44797e;
            if (c6Var != null && this.E0 != null && this.F0 != null) {
                a1(c6Var.getStickerStyle());
            }
            j80 j80Var = this.f44793a0;
            if (j80Var != null) {
                j80Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            y5 y5Var = this.T;
            if (y5Var != null) {
                y5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getParent() == view) {
            FrameLayout frameLayout = (FrameLayout) view;
            View view2 = new View(view.getContext());
            this.K0 = view2;
            view2.setOutlineProvider(null);
            this.K0.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
            int indexOfChild = frameLayout.indexOfChild(this.simpleActionBar);
            FrameLayout frameLayout2 = this.f44803i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.f44803i0));
            }
            frameLayout.addView(this.K0, indexOfChild, c8.na.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            z4Var2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        getBaseSimpleGlass().f56749o = new eh.a() {
            @Override
            public final void c(dh.a aVar, RectF rectF) {
                aVar.f8363a = true;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                Canvas canvas2;
                o6 o6Var = o6.this;
                bi.i6 i6Var = o6Var.f34213a;
                ih.d.a(i6Var, canvas, rectF, i6Var, (ViewGroup) o6Var.fragmentView);
                c6 c6Var = o6Var.f44797e;
                if (c6Var != null && o6Var.f44807n != null && c6Var.getVisibility() == 0 && o6Var.f44797e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(o6Var.f44807n.getX() + o6Var.f44797e.getLeft(), o6Var.f44807n.getY() + o6Var.f44797e.getTop());
                    canvas.concat(o6Var.f44797e.getMatrix());
                    if (o6Var.f44797e.getAlpha() < 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, o6Var.f44797e.getWidth(), o6Var.f44797e.getHeight(), (int) (o6Var.f44797e.getAlpha() * 255.0f));
                    } else {
                        canvas2 = canvas;
                    }
                    o6Var.f44797e.draw(canvas2);
                    canvas2.restoreToCount(save);
                }
            }
        };
    }

    public final void t0(boolean z10) {
        float f10;
        long j3;
        kr krVar;
        org.telegram.messenger.g0.r(this.O0);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.M0 == f10) {
            return;
        }
        this.M0 = f10;
        ValueAnimator valueAnimator = this.N0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Y0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L0, f10);
        this.N0 = ofFloat;
        if (z10) {
            j3 = 260;
        } else {
            j3 = 120;
        }
        ofFloat.setDuration(j3);
        ValueAnimator valueAnimator2 = this.N0;
        if (z10) {
            krVar = new kr(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            krVar = new kr(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(krVar);
        this.N0.addUpdateListener(new v4(this, 1));
        this.N0.addListener(new i71(this, 7));
        this.N0.start();
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final FrameLayout v0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29862z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.na.e(-2, -2, 21));
        frameLayout.setOnClickListener(new p3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.sa.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, c8.na.o(-1, -2));
        return frameLayout;
    }

    public final void w0(ViewGroup viewGroup) {
        float f10;
        if (viewGroup != null) {
            float f11 = 0.0f;
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != 0 && viewGroup2 != this.f34213a) {
                f11 += viewGroup2.getY();
                if (viewGroup2.getParent() instanceof View) {
                    viewGroup2 = (View) viewGroup2.getParent();
                } else {
                    viewGroup2 = 0;
                }
            }
            if (viewGroup2 != 0 && viewGroup.getHeight() > 0) {
                f10 = Utilities.l(((f11 + viewGroup.getHeight()) - this.f34213a.getPaddingTop()) / viewGroup.getHeight());
            } else {
                f10 = 1.0f;
            }
            if (viewGroup.getAlpha() != f10) {
                viewGroup.setAlpha(f10);
            }
        }
    }
}
