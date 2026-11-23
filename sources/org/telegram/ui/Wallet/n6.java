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
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.d61;
import org.telegram.ui.hq0;
import org.telegram.ui.jg0;
import org.telegram.ui.jw0;
import org.telegram.ui.k71;
import org.telegram.ui.p51;
import org.telegram.ui.pa0;
import org.telegram.ui.s90;
import org.telegram.ui.y61;
public final class n6 extends e51 implements gs {
    public static Typeface Y0;
    public float A0;
    public float B0;
    public d61 C0;
    public float D0;
    public View E;
    public hi.e E0;
    public y61 F;
    public hi.e F0;
    public boolean G;
    public t0 G0;
    public l0 H0;
    public boolean I0;
    public View K0;
    public float L0;
    public float M0;
    public ValueAnimator N0;
    public org.telegram.ui.ActionBar.g5 P0;
    public ci.b0 Q0;
    public int R0;
    public k5 S;
    public x5 T;
    public FrameLayout U;
    public SpannableString U0;
    public TextView V;
    public boolean V0;
    public FrameLayout W;
    public boolean W0;
    public TextView X;
    public jw0 X0;
    public FrameLayout Y;
    public TextView Z;
    public m80 f44665a0;
    public y5 f44666b0;
    public boolean f44667c0;
    public FrameLayout f44668d0;
    public b6 f44669e;
    public FrameLayout f44670e0;
    public y5 f44671f;
    public boolean f44673g0;
    public int h;
    public i71 f44674h0;
    public FrameLayout f44675i0;
    public j9 f44676j0;
    public r8 f44677k0;
    public float m0;
    public c6 f44679n;
    public ValueAnimator f44680n0;
    public k5 f44681o0;
    public int f44682p0;
    public boolean f44683q0;
    public int f44684r;
    public boolean f44685r0;
    public boolean f44686s;
    public hi.i1 f44687s0;
    public j6 f44688t0;
    public LinearLayout f44690v0;
    public org.telegram.ui.Components.o6 f44692w0;
    public org.telegram.ui.Components.o6 f44694x0;
    public FrameLayout f44695y;
    public w6 f44696y0;
    public e6 f44697z0;
    public final ik f44691w = new ik(this, 27);
    public final p4 f44693x = new bt() {
        @Override
        public final void a(int i7, boolean z10) {
            bi.f6 f6Var;
            n6 n6Var = n6.this;
            ik ikVar = n6Var.f44691w;
            if ((i7 != 1 && i7 != 3) || (f6Var = n6Var.f34681a) == null) {
                return;
            }
            n6Var.f44686s = z10;
            f6Var.removeCallbacks(ikVar);
            ikVar.run();
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
    public int f44672f0 = 0;
    public String f44678l0 = "";
    public final h51[] f44689u0 = new h51[2];
    public final q4 J0 = new q4(this, 0);
    public final q4 O0 = new q4(this, 1);
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

    public static void K0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, t10 t10Var, r10 r10Var, byte[] bArr, org.telegram.ui.Cells.n0 n0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        TL_wallet.nftItem nftitem;
        String str;
        e3[] e3VarArr;
        View[] viewArr;
        r10 r10Var2;
        LinearLayout u02;
        if (context == null) {
            return;
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        if (((walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) || (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnchainGift)) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                di.f6 f6Var = new di.f6(context, i7, 0L, h6Var, null);
                f6Var.f8803e3 = wallettransaction;
                f3 c10 = f3.c(wallettransaction);
                if (c10 != null) {
                    str = c10.e();
                } else {
                    str = null;
                }
                f6Var.f8797b2.setStatusPill(str);
                f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                f6Var.show();
                return;
            }
        }
        boolean z10 = true;
        e3[] e3VarArr2 = new e3[1];
        View[] viewArr2 = new View[1];
        t0 H = u0.D(i7).H();
        ArrayList arrayList = new ArrayList(H.f45087c);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (arrayList.get(i10) == wallettransaction || u0.t0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (t10Var == null && n0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232730).getPadding(rect);
            viewArr = viewArr2;
            ?? n5Var = new n5(context, h6Var, arrayList, H, i7, rect, viewArr);
            n5Var.setPosition(i10);
            e3VarArr = e3VarArr2;
            n5Var.setAdapter(new o5(arrayList, context, h6Var, rect, i7, e3VarArr2));
            r10Var2 = r10Var;
            u02 = n5Var;
        } else {
            e3VarArr = e3VarArr2;
            viewArr = viewArr2;
            r10Var2 = r10Var;
            u02 = u0(context, i7, wallettransaction, t10Var, r10Var, bArr, n0Var, h6Var, e3VarArr, false);
        }
        e3[] e3VarArr3 = e3VarArr;
        p5 p5Var = new p5(context, u02, h6Var, u02, viewArr, context);
        e3VarArr3[0] = p5Var;
        if ((u02 instanceof j71) && r10Var2 != null) {
            p5Var.n(new u4(0, r10Var2, wallettransaction));
        }
        e3 e3Var = e3VarArr3[0];
        if (t10Var == null) {
            z10 = false;
        }
        e3Var.A0(z10);
        e3 e3Var2 = e3VarArr3[0];
        e3Var2.U0 = false;
        e3Var2.show();
    }

    public static void M0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f29454h5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ma.c(-2.0f, -1));
        linearLayout.addView(new m7(160, context, false), c8.ma.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131742850, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, h6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = o10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(hd.N0(2131742849, null));
        int i10 = org.telegram.ui.ActionBar.m6.f29792z6;
        org.telegram.ui.ActionBar.t6.U(f10, i10, h6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 0, 0, 0, 24));
        g6 g6Var = new g6(context, h6Var);
        g6Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        g6Var.a(2131232832, hd.N0(2131742753, null), hd.N0(2131742752, null));
        linearLayout.addView(g6Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g6 g6Var2 = new g6(context, h6Var);
        g6Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        g6Var2.a(2131232830, hd.N0(2131742821, null), hd.N0(2131742820, null));
        linearLayout.addView(g6Var2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        g6 g6Var3 = new g6(context, h6Var);
        g6Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        g6Var3.a(2131232834, hd.N0(2131742936, null), hd.N0(2131742935, null));
        linearLayout.addView(g6Var3, c8.ma.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        hi.e g10 = o10.g(24, context, h6Var, true);
        g10.setText(hd.N0(2131742854, null));
        linearLayout.addView(g10, c8.ma.t(-1, 48, 1, 0, 0, 0, 0));
        c8.ra.b(g10, 0.02f, 1.1f);
        m80 m80Var = new m80(context, null);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        m80Var.setTextSize(1, 13.0f);
        m80Var.setGravity(17);
        m80Var.setText(V0(hd.N0(2131742740, null), org.telegram.ui.ActionBar.m6.Xc, h6Var, new d5(context, 0)));
        linearLayout.addView(m80Var, c8.ma.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        j3.O = frameLayout;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
        w2VarArr[0].u0(true);
        w2VarArr[0].O();
        g10.setOnClickListener(new a5(w2VarArr, 1));
        w2VarArr[0].show();
    }

    public static void N0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        u0 D = u0.D(i7);
        if (D.N()) {
            String y10 = D.y();
            if (TextUtils.isEmpty(y10)) {
                return;
            }
            O0(context, i7, y10, true, null, h6Var);
        }
    }

    public static void O0(Context context, final int i7, String str, final boolean z10, final p pVar, final org.telegram.ui.ActionBar.h6 h6Var) {
        float f10;
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        w2Var.v0(-12207881);
        w2Var.P(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new m6());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ma.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24041n));
        l6 l6Var = new l6(context, str);
        if (!z10) {
            l6Var.f44536b.setText(hd.N0(2131746304, null));
        }
        linearLayout.addView(l6Var, c8.ma.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131742775, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 1, 24, 0, 24, 20));
        final hi.e eVar = new hi.e(context, null, true);
        eVar.setRoundRadius(24);
        eVar.setColor(-1);
        eVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new nq(2131232810, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131742934, null));
        } else {
            f10 = 12.0f;
            nq nqVar = new nq(2131231957, 0);
            nqVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) hd.N0(2131742751, null));
        }
        eVar.setText(spannableStringBuilder);
        linearLayout.addView(eVar, c8.ma.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z10) {
            int i10 = 8;
            textView.setVisibility(8);
            if (pVar != null) {
                i10 = 0;
            }
            eVar.setVisibility(i10);
        }
        View e10 = o10.e(context, 2131231269);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(hd.N0(2131752029, null));
        c8.ra.a(e10);
        frameLayout.addView(e10, c8.ma.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        w2Var.O = frameLayout;
        w2Var.f30215x = true;
        w2Var.f30212v0 = false;
        w2Var.f30214w0 = false;
        w2Var.P(-12207881);
        e10.setOnClickListener(new r4(w2Var, 0));
        l6Var.f44539f = new a1(str, 1);
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
                x4 x4Var = new x4(eVar2, w2Var2, h6Var, 0);
                int i11 = i7;
                u0 D = u0.D(i11);
                D.x0(new f21(i11, x4Var, D));
            }
        });
    }

    public static SpannableStringBuilder V0(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new ki.b3(i7, h6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void d0(n6 n6Var) {
        N0(n6Var.currentAccount, n6Var.getParentActivity(), n6Var.getResourceProvider());
    }

    public static void d1(h51 h51Var, boolean z10) {
        boolean canScrollVertically = h51Var.canScrollVertically(-1);
        h51Var.f35789g3.O(z10);
        h51Var.a0();
        if (!canScrollVertically) {
            h51Var.f35788f3.h1(0, 0);
        }
    }

    public static void e0(n6 n6Var, String str, u0 u0Var, a70 a70Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, n6Var.getParentActivity(), n6Var.resourceProvider, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        y0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = y0Var.f30288b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        y0Var.setChecked(equals);
        y0Var.setOnClickListener(new r1(u0Var, currencyrate, a70Var, 2));
        linearLayout.addView(y0Var, c8.ma.o(200, -2));
    }

    public static void f0(n6 n6Var) {
        N0(n6Var.currentAccount, n6Var.getParentActivity(), n6Var.getResourceProvider());
    }

    public static void g0(n6 n6Var) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (n6Var.F != null && (z4Var = n6Var.simpleActionBar) != null && (z4Var.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) n6Var.simpleActionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (n6Var.F.getParent() != n6Var.simpleActionBar) {
                org.telegram.messenger.g0.E2(n6Var.F);
                n6Var.simpleActionBar.addView(n6Var.F, c8.ma.c(56.0f, -1));
            }
            n6Var.F.bringToFront();
            n6Var.F.post(new q4(n6Var, 6));
        }
    }

    public static void h0(n6 n6Var) {
        u0 D = u0.D(n6Var.currentAccount);
        hi.e eVar = n6Var.F0;
        if (eVar.R) {
            return;
        }
        eVar.setLoading(true);
        D.x0(new h2.n0((Object) D, (Object) new p51(12, n6Var, D), false, false, 4));
    }

    public static void i0(n6 n6Var, LinearLayout linearLayout, u0 u0Var, a70 a70Var) {
        TL_wallet.currencyRate currencyrate;
        n6 n6Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        u0 u0Var2 = u0Var;
        linearLayout2.removeAllViews();
        String g10 = u0Var2.h.g();
        TL_wallet.currencyRates f10 = u0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                yz yzVar = new yz(n6Var.getParentActivity(), n6Var.getResourceProvider());
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(31);
                linearLayout2.addView(yzVar, c8.ma.o(200, -2));
            }
            return;
        }
        g gVar = u0Var2.h;
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26931b.getSystemService("input_method");
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
            g.a(linkedHashSet, ((org.telegram.messenger.n0) np.u1(gVar.f44277a).A7.T.f15508b).f25711c);
            g.c(linkedHashSet, hd.E0().f24472y);
            g.c(linkedHashSet, hd.E0().f24473z);
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
                e0(n6Var, g10, u0Var2, a70Var, linearLayout2, currencyrate7);
            }
            i12++;
            u0Var2 = u0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            n6Var2 = n6Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(n6Var.getParentActivity(), n6Var2.resourceProvider), c8.ma.o(-1, 8));
        } else {
            n6Var2 = n6Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                e0(n6Var2, g10, u0Var, a70Var, linearLayout2, currencyrate8);
            }
            i13++;
            n6Var2 = n6Var;
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

    public static void j0(n6 n6Var) {
        vf.c.t(n6Var.getParentActivity(), u0.D(n6Var.currentAccount).f45134j);
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

    public static void k0(n6 n6Var, String str) {
        Uri i12 = i1(str);
        String j12 = j1(i12);
        if (j12 != null) {
            int i7 = n6Var.currentAccount;
            np.u1(i7).f2().a(j12, null, new ai.b2(i7, new w4(n6Var, 4), 8));
        } else if ((n6Var.getParentActivity() instanceof LaunchActivity) && new s90((LaunchActivity) n6Var.getParentActivity(), n6Var.currentAccount, null, false).g(i12)) {
        } else {
            org.telegram.messenger.g0.g3(new q4(n6Var, 9));
        }
    }

    public static void l0(final n6 n6Var, Context context, org.telegram.ui.ActionBar.g5 g5Var, View view) {
        boolean z10;
        u0 D = u0.D(n6Var.currentAccount);
        final a70 J = a70.J(n6Var, view);
        J.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        J.f33397s = 0;
        J.W(5);
        a70 K = J.K();
        K.c(2131231240, hd.N0(2131742946, null), new hq0(J, 27), false);
        K.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        v7 v7Var = new v7(n6Var, linearLayout, D, J, 10);
        K.r(scrollView, c8.ma.o(-1, 350));
        J.c(2131232818, hd.N0(2131742902, null), new p(v7Var, J, K, 11), false);
        org.telegram.ui.ActionBar.y0 z11 = J.z();
        g gVar = D.h;
        String i7 = gVar.i();
        boolean isEmpty = TextUtils.isEmpty(i7);
        String str = i7;
        if (isEmpty) {
            z11.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131748586, null));
            spannableStringBuilder.setSpan(new r80(org.telegram.messenger.g0.L(75.0f), z11.f30288b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        z11.setSubtext(str);
        if (gVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        final v7 v7Var2 = new v7(D, new boolean[]{z10}, z11, v7Var, 11);
        n6Var.T0.add(v7Var2);
        v7Var.run();
        J.c(2131232836, hd.N0(2131747463, null), new Runnable(n6Var) {
            public final n6 f45390b;

            {
                this.f45390b = n6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        n6 n6Var2 = this.f45390b;
                        n6Var2.getClass();
                        J.v();
                        n6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        n6 n6Var3 = this.f45390b;
                        n6Var3.getClass();
                        J.v();
                        n6Var3.presentFragment(new d9());
                        return;
                    case 2:
                        n6 n6Var4 = this.f45390b;
                        n6Var4.getClass();
                        J.v();
                        n6Var4.presentFragment(new e51());
                        return;
                    default:
                        J.v();
                        n6 n6Var5 = this.f45390b;
                        n6.M0(n6Var5.getParentActivity(), n6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.c(2131232829, hd.N0(2131742833, null), new Runnable(n6Var) {
            public final n6 f45390b;

            {
                this.f45390b = n6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        n6 n6Var2 = this.f45390b;
                        n6Var2.getClass();
                        J.v();
                        n6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        n6 n6Var3 = this.f45390b;
                        n6Var3.getClass();
                        J.v();
                        n6Var3.presentFragment(new d9());
                        return;
                    case 2:
                        n6 n6Var4 = this.f45390b;
                        n6Var4.getClass();
                        J.v();
                        n6Var4.presentFragment(new e51());
                        return;
                    default:
                        J.v();
                        n6 n6Var5 = this.f45390b;
                        n6.M0(n6Var5.getParentActivity(), n6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        J.l(2131232809, hd.N0(2131742910, null), new Runnable(n6Var) {
            public final n6 f45390b;

            {
                this.f45390b = n6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        n6 n6Var2 = this.f45390b;
                        n6Var2.getClass();
                        J.v();
                        n6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        n6 n6Var3 = this.f45390b;
                        n6Var3.getClass();
                        J.v();
                        n6Var3.presentFragment(new d9());
                        return;
                    case 2:
                        n6 n6Var4 = this.f45390b;
                        n6Var4.getClass();
                        J.v();
                        n6Var4.presentFragment(new e51());
                        return;
                    default:
                        J.v();
                        n6 n6Var5 = this.f45390b;
                        n6.M0(n6Var5.getParentActivity(), n6Var5.getResourceProvider());
                        return;
                }
            }
        }, !D.f45132g.d.isEmpty());
        J.k();
        J.c(2131232822, hd.N0(2131742694, null), new Runnable(n6Var) {
            public final n6 f45390b;

            {
                this.f45390b = n6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        n6 n6Var2 = this.f45390b;
                        n6Var2.getClass();
                        J.v();
                        n6Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        n6 n6Var3 = this.f45390b;
                        n6Var3.getClass();
                        J.v();
                        n6Var3.presentFragment(new d9());
                        return;
                    case 2:
                        n6 n6Var4 = this.f45390b;
                        n6Var4.getClass();
                        J.v();
                        n6Var4.presentFragment(new e51());
                        return;
                    default:
                        J.v();
                        n6 n6Var5 = this.f45390b;
                        n6.M0(n6Var5.getParentActivity(), n6Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = n6Var.getSimpleMenuOverlay();
        if (simpleMenuOverlay != null) {
            simpleMenuOverlay.setOutlineProvider(null);
            simpleMenuOverlay.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        if (simpleMenuOverlay != null) {
            ViewGroup viewGroup = J.A;
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                org.telegram.ui.ActionBar.z4 z4Var = n6Var.simpleActionBar;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                org.telegram.ui.ActionBar.j5 menuOverlay = z4Var.getMenuOverlay();
                if (menuOverlay != null && g5Var.getParent() == z4Var.d) {
                    menuOverlay.d(z4Var, g5Var, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    J.f33391p = new m(simpleMenuOverlay, 6);
                    simpleMenuOverlay.setOnClosed(new Runnable(n6Var) {
                        public final n6 f45352b;

                        {
                            this.f45352b = n6Var;
                        }

                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    this.f45352b.T0.remove(v7Var2);
                                    return;
                                default:
                                    this.f45352b.T0.remove(v7Var2);
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        J.f33391p = new Runnable(n6Var) {
            public final n6 f45352b;

            {
                this.f45352b = n6Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f45352b.T0.remove(v7Var2);
                        return;
                    default:
                        this.f45352b.T0.remove(v7Var2);
                        return;
                }
            }
        };
        J.a0();
    }

    public static void m0(n6 n6Var, long j3) {
        q4 q4Var = n6Var.O0;
        if (n6Var.f34681a != null) {
            j9 j9Var = n6Var.f44676j0;
            if (j9Var != null) {
                j9Var.a();
            }
            if (n6Var.M0 <= 0.0f && n6Var.D0()) {
                int top = n6Var.f34681a.f35788f3.m(n6Var.h).getTop() - n6Var.f34681a.getPaddingTop();
                n6Var.f34681a.C0();
                if (top < 0) {
                    n6Var.f34681a.w0(0, top, nr.h);
                    return;
                }
                return;
            }
            n6Var.f34681a.C0();
            n6Var.t0(true);
            org.telegram.messenger.g0.r(q4Var);
            if (j3 > 0) {
                org.telegram.messenger.g0.h3(q4Var, j3 + 260);
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

    public static android.widget.LinearLayout u0(final android.content.Context r38, int r39, org.telegram.tgnet.tl.TL_wallet.walletTransaction r40, org.telegram.messenger.t10 r41, org.telegram.messenger.r10 r42, byte[] r43, java.lang.Runnable r44, org.telegram.ui.ActionBar.h6 r45, org.telegram.ui.Wallet.e3[] r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n6.u0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.t10, org.telegram.messenger.r10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.h6, org.telegram.ui.Wallet.e3[], boolean):android.widget.LinearLayout");
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
            return hd.N0(2131742707, null);
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

    public static SpannableStringBuilder z0(int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        nq nqVar = new nq(2131232821, 2);
        nqVar.d = false;
        nqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence r10 = u0.D(i7).r(j3, true);
        if (!TextUtils.isEmpty(r10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(r10);
            spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.f29792z6, h6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final CharSequence A0(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        nq nqVar = new nq(2131231956, 0);
        nqVar.d = false;
        spannableStringBuilder.setSpan(nqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) u0.t(j3, false));
        spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.Fi, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return hd.V(null, null, i7, spannableStringBuilder);
    }

    public final h51 B0() {
        View currentView;
        if (C0()) {
            hi.i1 i1Var = this.f44687s0;
            if (i1Var == null) {
                currentView = null;
            } else {
                currentView = i1Var.getCurrentView();
            }
            if (currentView instanceof h51) {
                return (h51) currentView;
            }
        }
        return null;
    }

    public final boolean C0() {
        k5 k5Var;
        if (!this.f44685r0 && (k5Var = this.f44681o0) != null && k5Var.isAttachedToWindow()) {
            ViewParent parent = this.f44681o0.getParent();
            bi.f6 f6Var = this.f34681a;
            if (parent == f6Var.f35788f3.m(f6Var.f35789g3.E.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean D0() {
        View m10;
        bi.f6 f6Var = this.f34681a;
        if (f6Var != null && (m10 = f6Var.f35788f3.m(this.h)) != null && this.B0 < 0.5f && m10.getBottom() > this.f34681a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final boolean E0() {
        k5 k5Var = this.f44681o0;
        if (k5Var != null && this.f34681a != null && (k5Var.getParent() instanceof View) && ((View) this.f44681o0.getParent()).getTop() <= this.f34681a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void H0() {
        l0 l0Var;
        h51 h51Var = this.f44689u0[1];
        if (this.f44672f0 == 1 && h51Var != null && h51Var.H && (l0Var = this.H0) != null && !l0Var.f44510i && !l0Var.f44509g && l0Var.f44514m == null && h51Var.f35788f3.N0() >= h51Var.f35789g3.E.size() - 3) {
            this.H0.f();
        }
    }

    public final void I0() {
        t0 t0Var;
        h51 h51Var = this.f44689u0[0];
        if (h51Var != null && h51Var.H && (t0Var = this.G0) != null && !t0Var.f45093k && !t0Var.h && h51Var.f35788f3.N0() >= h51Var.f35789g3.E.size() - 3) {
            this.G0.h();
        }
    }

    public final CharSequence J0(int i7) {
        org.telegram.ui.Components.o6 o6Var;
        float f10;
        CharSequence[] charSequenceArr = this.S0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            if (i7 == 0) {
                o6Var = this.f44692w0;
            } else {
                o6Var = this.f44694x0;
            }
            if (i7 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            r80 r80Var = new r80(org.telegram.messenger.g0.L(f10), o6Var);
            r80Var.a(org.telegram.ui.ActionBar.m6.r1(0.45f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i7];
            ((SpannableString) charSequence).setSpan(r80Var, 0, charSequence.length(), 33);
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
            f6Var.f8798b3 = nftitem;
            if (this.f44677k0 != null) {
                f6Var.f8800c3 = new v5(this, tL_starGiftUnique, nftitem);
                f6Var.f8801d3 = new w5(this, nftitem);
            }
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(f6Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.m6.f29324a7;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.m6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) parentActivity, resourceProvider, false);
            w2Var.f30177b0 = i14;
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
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(parentActivity);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
            q9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(2131232838).mutate();
            int i16 = org.telegram.ui.ActionBar.m6.f29792z6;
            org.telegram.ui.ActionBar.t6.x(q9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            gc c10 = c.c(nftitem, false);
            if (c10 != null) {
                q9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                q9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(q9Var, c8.ma.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = hd.N0(2131742930, null);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            org.telegram.messenger.f3.l(textView, i15, resourceProvider, 1, 17.0f);
            int i17 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, c8.ma.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            org.telegram.ui.ActionBar.t6.U(textView2, i16, resourceProvider);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            textView2.setVisibility(i7);
            linearLayout.addView(textView2, c8.ma.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i18 = 0;
            while (i18 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i17);
                int L = org.telegram.messenger.g0.L(16.0f);
                int i19 = org.telegram.ui.ActionBar.m6.f29381d6;
                int w03 = org.telegram.ui.ActionBar.m6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.m6.f29473i6;
                int w04 = org.telegram.ui.ActionBar.m6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.t6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742715;
                } else {
                    i10 = 2131742757;
                }
                String N0 = hd.N0(i10, str2);
                linearLayout3.setContentDescription(N0);
                ImageView imageView = new ImageView(parentActivity);
                if (i18 == 0) {
                    i11 = 2131232851;
                } else {
                    i11 = 2131232842;
                }
                imageView.setImageResource(i11);
                imageView.setImportantForAccessibility(2);
                int i21 = org.telegram.ui.ActionBar.m6.G6;
                org.telegram.ui.ActionBar.t6.s(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
                linearLayout3.addView(imageView, c8.ma.o(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(N0);
                float f11 = f10;
                org.telegram.messenger.f3.l(textView3, i21, resourceProvider, 1, f11);
                textView3.setGravity(17);
                linearLayout3.addView(textView3, c8.ma.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                linearLayout2.addView(linearLayout3, c8.ma.m(1.0f, 0, -1, i12, i13, 0));
                i18++;
                f10 = f11;
                i17 = 17;
                str2 = null;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                ey0 ey0Var = new ey0(parentActivity, resourceProvider);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                int i22 = org.telegram.ui.ActionBar.m6.f29381d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i22);
                ey0Var.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(ey0Var, d02, M3, null, resourceProvider);
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i23 = 0;
                while (i23 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i23);
                    i23++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    ey0Var.e(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(ey0Var, c8.ma.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
            eVar.setRoundRadius(24);
            eVar.setText(hd.N0(2131742816, null));
            linearLayout.addView(eVar, c8.ma.o(-1, 48));
            w2Var.O = scrollView;
            w2Var.U0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new jg0(20, w2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new o3(parentActivity, 1));
            eVar.setOnClickListener(new o3(w2Var, 2));
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
                this.Q0 = ci.b0.k(this, this.P0, new ci.y(12), new w4(this, 3), new q4(this, 7));
            }
        }
    }

    public final void Q0(boolean z10) {
        float f10;
        boolean z11;
        this.f44673g0 = z10;
        if (!z10) {
            this.f44672f0 = 0;
        }
        if (this.f44687s0 != null && this.f44675i0 != null) {
            if (!z10) {
                this.f44676j0.b(false);
                this.f44687s0.setPosition(0);
            }
            g1();
            ValueAnimator valueAnimator = this.f44680n0;
            if (valueAnimator != null) {
                this.f44680n0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.f44681o0.isAttachedToWindow() && this.f44681o0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f44687s0.j(false);
            }
            if (z11 && this.m0 != f10) {
                this.f44675i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f10);
                this.f44680n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f44680n0.setInterpolator(nr.h);
                this.f44680n0.addUpdateListener(new v4(this, 0));
                this.f44680n0.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 8));
                this.f44680n0.start();
            } else {
                R0(f10);
                this.f44687s0.j(false);
            }
            if (this.f34681a != null && this.f44685r0 != S0()) {
                c1(false);
            }
        }
    }

    public final void R0(float f10) {
        this.m0 = f10;
        this.f44675i0.setAlpha(f10);
        f1();
        int round = Math.round(org.telegram.messenger.g0.L(46.0f) * f10);
        if (this.f44682p0 != round) {
            this.f44682p0 = round;
            e1(0);
            e1(1);
        }
    }

    public final boolean S0() {
        t0 t0Var;
        if (!this.f44673g0 && (t0Var = this.G0) != null && t0Var.f45087c.isEmpty()) {
            t0 t0Var2 = this.G0;
            if (!t0Var2.f45093k && t0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void T0() {
        this.I0 = false;
        j9 j9Var = this.f44676j0;
        if (j9Var != null) {
            j9Var.b(false);
        }
        this.f44672f0 = 0;
        hi.i1 i1Var = this.f44687s0;
        if (i1Var != null) {
            i1Var.setPosition(0);
        }
    }

    public final void U0() {
        this.f44686s = false;
        bi.f6 f6Var = this.f34681a;
        if (f6Var != null) {
            f6Var.E2.f34568b.remove(this.f44693x);
            this.f34681a.removeCallbacks(this.f44691w);
        }
        b6 b6Var = this.f44669e;
        if (b6Var != null) {
            b6Var.setAdditionalTilt(0.0f);
        }
    }

    public final void W0() {
        boolean z10;
        u0 D = u0.D(this.currentAccount);
        h1();
        hi.e eVar = this.F0;
        if (D.N() && D.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        eVar.setEnabled(z10);
        if (!D.N()) {
            this.f44692w0.setText(J0(0));
            this.f44694x0.setText(J0(1));
            return;
        }
        long A = D.A();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.U0 == null) {
            this.U0 = new SpannableString("G");
            b6 b6Var = this.f44669e;
            b6Var.getClass();
            w6 w6Var = new w6(b6Var);
            this.f44696y0 = w6Var;
            SpannableString spannableString = this.U0;
            spannableString.setSpan(w6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.U0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) x6.e(A));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.N0(2131749340, null));
        if (this.f44697z0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f44157a = -9577217;
            this.f44697z0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f44697z0, length, spannableStringBuilder.length(), 33);
        this.f44692w0.setText(spannableStringBuilder);
        CharSequence r10 = u0.D(this.currentAccount).r(A, false);
        if (TextUtils.isEmpty(r10)) {
            this.f44694x0.setText(J0(1));
        } else {
            this.f44694x0.setText(r10);
        }
        Z0(this.A0);
        l0 l0Var = this.H0;
        if (l0Var != null && !l0Var.h && !l0Var.f44510i && l0Var.f44514m == null) {
            l0Var.f();
        }
        String y10 = D.y();
        if (!TextUtils.isEmpty(y10)) {
            this.f44669e.setCardNumber(x0(y10.toUpperCase()));
        }
    }

    public final void X0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.E.isAttachedToWindow()) {
            b6 b6Var = this.f44669e;
            y61 y61Var = this.F;
            Matrix matrix = this.I;
            if (b6Var.g(y61Var, matrix)) {
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
                y61 y61Var2 = this.F;
                int[] iArr = this.P;
                y61Var2.getLocationInWindow(iArr);
                View view = this.E;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.f44669e.i(this.A0, this.f44695y.getWidth() / 0.7826087f);
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
                b6 b6Var2 = this.f44669e;
                Matrix matrix4 = b6Var2.f45304c;
                Matrix matrix5 = b6Var2.f45307e;
                Matrix matrix6 = b6Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!b6Var2.f45315n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        b6Var2.f45315n = true;
                        b6Var2.O.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.A0);
                this.f44694x0.setPivotX(0.0f);
                this.f44694x0.setPivotY(0.0f);
                this.f44694x0.setScaleX(T12);
                this.f44694x0.setScaleY(T12);
            }
        }
    }

    public final void Y0() {
        y61 y61Var;
        float i7;
        boolean z10;
        float f10;
        b6 b6Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f11;
        float height;
        b6 b6Var2;
        if (this.f34681a != null && this.f44669e != null && this.f44690v0 != null && this.E != null && (y61Var = this.F) != null && this.simpleActionBar != null) {
            y61Var.bringToFront();
            View m10 = this.f34681a.f35788f3.m(this.h);
            if (m10 == null) {
                if (this.f34681a.f35788f3.L0() > this.h) {
                    i7 = 1.0f;
                } else {
                    i7 = 0.0f;
                }
            } else {
                i7 = Utilities.i((this.f34681a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
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
            this.f44669e.setPivotX(b6Var.getWidth() * 0.5f);
            this.f44669e.setPivotY(0.0f);
            this.f44669e.setScaleX(T1);
            this.f44669e.setScaleY(T1);
            this.f44669e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
            b6 b6Var3 = this.f44669e;
            if (!z10 && (m10 == null || i7 >= 1.0f || m10.getBottom() <= this.f34681a.getPaddingTop() || m10.getTop() >= this.f34681a.getHeight() - this.f34681a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            b6Var3.setVisibility(i10);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m10 != null) {
                this.f34681a.getLocationInWindow(iArr2);
                this.f44679n.getLocationInWindow(iArr);
                r16 = 1;
                this.f44669e.setTranslationX(((this.f44671f.getWidth() - this.f44669e.getWidth()) / 2.0f) + this.f44671f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f44669e.setTranslationY(this.f44671f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
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
                this.f44679n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.simpleActionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.f44669e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z12) {
                    f15 = a8.p0.f(0.9f - f13, this.f44669e.getHeight(), 2.0f, f15);
                }
                float width = (this.f44679n.getWidth() - this.f44669e.getWidth()) / 2.0f;
                if (!z12) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f34681a.getLocationInWindow(iArr2);
                    float width2 = ((this.f44671f.getWidth() - this.f44669e.getWidth()) / 2.0f) + this.f44671f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y10 = this.f44671f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y10) / (this.f44669e.getHeight() * 0.5f)));
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
                this.f44669e.setPivotX(b6Var2.getWidth() * 0.5f);
                this.f44669e.setPivotY(0.0f);
                this.f44669e.setScaleX(f13);
                this.f44669e.setScaleY(f13);
                this.f44669e.setTranslationX(width);
                this.f44669e.setTranslationY(f15);
                this.f44669e.setAlpha(f12);
            }
            if (i7 > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.G != z11 && (linearLayout = this.f44690v0) != null) {
                Rect rect = this.H;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f44690v0.getHeight() != 0) {
                        rect.set(this.f44690v0.getLeft(), this.f44690v0.getTop(), this.f44690v0.getRight(), this.f44690v0.getBottom());
                    }
                }
                this.f44669e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f44690v0);
                this.G = z11;
                if (z11) {
                    this.F.addView(this.f44690v0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f44690v0.layout(0, 0, rect.width(), rect.height());
                    X0();
                } else {
                    b6 b6Var4 = this.f44669e;
                    b6Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = b6Var4.N;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    v6 v6Var = b6Var4.P;
                    v6Var.setScaleX(1.0f);
                    v6Var.setScaleY(1.0f);
                    b6Var4.F.addView(linearLayout2, b6Var4.Q);
                    this.f44690v0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f44669e.getClass();
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
    public final void Z(ArrayList arrayList, c51 c51Var) {
        u0 D = u0.D(this.currentAccount);
        h1();
        arrayList.add(o41.m(this.S));
        this.h = arrayList.size();
        y5 y5Var = this.f44671f;
        o41 o41Var = new o41(-4);
        o41Var.f38083c = y5Var;
        o41Var.A = -1;
        o41Var.f38084e = true;
        arrayList.add(o41Var);
        arrayList.add(o41.m(this.C0));
        boolean S0 = S0();
        this.f44685r0 = S0;
        if (S0) {
            String N0 = hd.N0(2131742753, null);
            String N02 = hd.N0(2131742752, null);
            int i7 = f6.f44243b;
            o41 K = o41.K(f6.class);
            K.f38089k = 2131232832;
            K.f38091m = N0;
            K.f38092n = N02;
            arrayList.add(K);
            String N03 = hd.N0(2131742821, null);
            String N04 = hd.N0(2131742820, null);
            o41 K2 = o41.K(f6.class);
            K2.f38089k = 2131232830;
            K2.f38091m = N03;
            K2.f38092n = N04;
            arrayList.add(K2);
            String N05 = hd.N0(2131742936, null);
            String N06 = hd.N0(2131742935, null);
            o41 K3 = o41.K(f6.class);
            K3.f38089k = 2131232834;
            K3.f38091m = N05;
            K3.f38092n = N06;
            arrayList.add(K3);
            arrayList.add(o41.m(this.f44666b0));
        } else if (this.f44681o0 != null) {
            if (this.V0 && !this.W0 && D.A() > 500000000) {
                arrayList.add(o41.k(this.f44668d0));
            }
            k5 k5Var = this.f44681o0;
            o41 o41Var2 = new o41(-3);
            o41Var2.f38083c = k5Var;
            o41Var2.A = 0;
            o41Var2.f38103z = 1;
            arrayList.add(o41Var2);
        }
        m80 m80Var = this.f44665a0;
        if (m80Var != null) {
            this.f44667c0 = false;
            m80Var.animate().cancel();
            this.f44665a0.setAlpha(0.0f);
            this.f44665a0.setVisibility(4);
        }
    }

    public final void Z0(float f10) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        this.f44692w0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.o6 o6Var = this.f44694x0;
        float[] fArr = this.f44669e.f45303b0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], f8.p(-7868417, 0, fArr), f8.p(-7868417, 3, fArr));
        }
        o6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        w6 w6Var = this.f44696y0;
        if (w6Var != null) {
            w6Var.f37954y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
        }
        e6 e6Var = this.f44697z0;
        if (e6Var != null) {
            float[] fArr2 = this.f44669e.f45303b0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], f8.p(-9577217, 0, fArr2), f8.p(-9577217, 3, fArr2));
            }
            e6Var.f44157a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f44692w0.invalidate();
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131742737, null);
    }

    public final void a1(float[] fArr) {
        boolean z10;
        float f10;
        int n10;
        if (this.E0 != null && this.F0 != null) {
            float f11 = f8.j(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7))[0];
            if (f11 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Fi);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = i7 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = f8.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
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
            float[] j3 = f8.j(themedColor);
            float f14 = j3[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (f8.l(Math.max(f12, Math.min(f10, f14)), j3[1], j3[2]) & 16777215);
            }
            if (themedColor != this.R0) {
                this.R0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.m6.Ji);
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
    public final void b0(o41 o41Var, View view) {
        l0 l0Var;
        Object obj = o41Var.H;
        if (obj instanceof TL_wallet.nftItem) {
            L0((TL_wallet.nftItem) obj);
        } else if (o41Var.d == -10001 && (l0Var = this.H0) != null) {
            l0Var.f();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            K0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) o41Var.H, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        bi.f6 f6Var = this.f34681a;
        if (f6Var != null && this.f44669e != null) {
            float b10 = f6Var.E2.b(1);
            float min = Math.min(10.0f, this.f34681a.E2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f44669e.setAdditionalTilt(Math.max(0.0f, (this.A0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.A0))) * 90.0f) - 10.0f)) + min);
            this.f44669e.setUseGyroscope(1.0f - ((float) Math.pow(this.A0, 0.33000001311302185d)));
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        r8 r8Var;
        if ((view instanceof e8) && (r8Var = this.f44677k0) != null) {
            r8Var.S((e8) view);
            return true;
        }
        return false;
    }

    public final void c1(boolean z10) {
        boolean S0 = S0();
        bi.f6 f6Var = this.f34681a;
        h51[] h51VarArr = this.f44689u0;
        if (f6Var != null && this.f44685r0 != S0) {
            this.f44685r0 = S0;
            f6Var.C0();
            for (h51 h51Var : h51VarArr) {
                if (h51Var != null) {
                    h51Var.C0();
                }
            }
            this.f34681a.f35789g3.O(false);
            this.f34681a.f35788f3.h1(0, 0);
            this.f34681a.post(new q4(this, 6));
        }
        if (!S0) {
            for (h51 h51Var2 : h51VarArr) {
                if (h51Var2 != null) {
                    d1(h51Var2, z10);
                }
            }
            k5 k5Var = this.f44681o0;
            if (k5Var != null) {
                k5Var.post(new q4(this, 2));
                this.f44681o0.post(new q4(this, 3));
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        r8 r8Var = this.f44677k0;
        if ((r8Var == null || !r8Var.f44962q0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int childCount;
        ValueAnimator valueAnimator = this.f44680n0;
        if (valueAnimator != null) {
            this.f44680n0 = null;
            valueAnimator.cancel();
        }
        U0();
        j6 j6Var = this.f44688t0;
        if (j6Var != null) {
            j6Var.b(null);
        }
        this.f44671f = null;
        this.T = null;
        this.S = null;
        this.f44681o0 = null;
        this.f44687s0 = null;
        h51[] h51VarArr = this.f44689u0;
        h51VarArr[0] = null;
        h51VarArr[1] = null;
        l0 l0Var = this.H0;
        if (l0Var != null && !l0Var.f44504a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44673g0 = z10;
        if (!z10) {
            this.f44672f0 = 0;
        } else if (this.I0) {
            this.f44672f0 = 1;
        }
        r8 r8Var = this.f44677k0;
        if (r8Var != null) {
            r8Var.p();
        }
        this.f44677k0 = null;
        View createView = super.createView(context);
        pa0 pa0Var = new pa0(this, context);
        pa0Var.addView(createView, c8.ma.c(-1.0f, -1));
        this.fragmentView = pa0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, pa0Var, getResourceProvider());
        this.simpleActionBar.setClipChildren(false);
        this.simpleActionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(2, 2131232680);
        this.P0 = b10;
        b10.setOnClickListener(new View.OnClickListener(this) {
            public final n6 f44658b;

            {
                this.f44658b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44658b.P0();
                        return;
                    case 1:
                        n6 n6Var = this.f44658b;
                        n6Var.getClass();
                        n6Var.presentFragment(new bb1(6, null));
                        return;
                    case 2:
                        n6.d0(this.f44658b);
                        return;
                    case 3:
                        n6.f0(this.f44658b);
                        return;
                    default:
                        n6.h0(this.f44658b);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.g5 b11 = t6.b(1, 2131231244);
        b11.setOnClickListener(new r1(this, context, b11, 1));
        k5 k5Var = new k5(this, context, 1);
        this.S = k5Var;
        k5Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        x5 x5Var = new x5(this, context);
        this.T = x5Var;
        x5Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new q4(this, 8));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(hd.N0(2131742696, null));
        this.U = v0(this.V, new q4(this, 10));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = v0(textView2, new q4(this, 11));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = v0(textView3, new q4(this, 12));
        this.S.addView(this.T, c8.ma.c(-2.0f, -1));
        m80 m80Var = new m80(context, null);
        this.f44665a0 = m80Var;
        this.f44667c0 = false;
        m80Var.setAlpha(0.0f);
        m80 m80Var2 = this.f44665a0;
        int i7 = org.telegram.ui.ActionBar.m6.f29792z6;
        org.telegram.ui.ActionBar.t6.U(m80Var2, i7, this.resourceProvider);
        this.f44665a0.setTextSize(1, 13.0f);
        this.f44665a0.setGravity(17);
        this.f44665a0.setText(V0(hd.N0(2131742740, null), org.telegram.ui.ActionBar.m6.Xc, this.resourceProvider, new d5(context, 1)));
        this.f44665a0.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.f44665a0, c8.ma.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        y5 y5Var = new y5(this, context, 0);
        this.f44666b0 = y5Var;
        y5Var.setImportantForAccessibility(2);
        this.f44668d0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44670e0 = frameLayout2;
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(themedColor, org.telegram.ui.ActionBar.m6.w(themedColor2, getThemedColor(i11)), 16, 16);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i10, i11);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.f44668d0.addView(this.f44670e0, c8.ma.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232839);
        this.f44670e0.addView(imageView, c8.ma.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.f29622q7, this.resourceProvider);
        i5.c.r(16.0f, 1, 2131742778, textView4, null);
        this.f44670e0.addView(textView4, c8.ma.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f44670e0.setOnClickListener(new View.OnClickListener(this) {
            public final n6 f44658b;

            {
                this.f44658b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44658b.P0();
                        return;
                    case 1:
                        n6 n6Var = this.f44658b;
                        n6Var.getClass();
                        n6Var.presentFragment(new bb1(6, null));
                        return;
                    case 2:
                        n6.d0(this.f44658b);
                        return;
                    case 3:
                        n6.f0(this.f44658b);
                        return;
                    default:
                        n6.h0(this.f44658b);
                        return;
                }
            }
        });
        c8.ra.b(this.f44670e0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f44695y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f44695y.setClipToPadding(false);
        this.simpleActionBar.addView(this.f44695y, c8.ma.d(-1, 56.0f, 3, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.E = view;
        this.f44695y.addView(view, c8.ma.e(1, 1, 19));
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        y61 y61Var = new y61(this, context);
        this.F = y61Var;
        y61Var.setClipChildren(false);
        this.F.setClipToPadding(false);
        b6 b6Var = new b6(this, context);
        this.f44669e = b6Var;
        b6Var.setDiamondOnCard(true);
        this.f44669e.setCardOnClickListener(new View.OnClickListener(this) {
            public final n6 f44658b;

            {
                this.f44658b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44658b.P0();
                        return;
                    case 1:
                        n6 n6Var = this.f44658b;
                        n6Var.getClass();
                        n6Var.presentFragment(new bb1(6, null));
                        return;
                    case 2:
                        n6.d0(this.f44658b);
                        return;
                    case 3:
                        n6.f0(this.f44658b);
                        return;
                    default:
                        n6.h0(this.f44658b);
                        return;
                }
            }
        });
        this.f34681a.E2.f34568b.add(this.f44693x);
        y5 y5Var2 = new y5(this, context, 1);
        this.f44671f = y5Var2;
        y5Var2.setImportantForAccessibility(2);
        c6 c6Var = new c6(this, context);
        this.f44679n = c6Var;
        c6Var.setClipChildren(false);
        this.f44679n.setClipToPadding(false);
        this.f44679n.addView(this.f44669e, c8.ma.c(-2.0f, -1));
        pa0Var.addView(this.f44679n, c8.ma.c(-1.0f, -1));
        this.f34681a.setClipChildren(false);
        this.f34681a.setClipToPadding(false);
        this.f44690v0 = this.f44669e.getBalanceLayout();
        this.f44692w0 = this.f44669e.getBalanceView();
        this.f44694x0 = this.f44669e.getUsdBalanceView();
        this.f44669e.setCardHolder(p10.q(getUserConfig().f()).toUpperCase());
        this.D0 = 0.0f;
        d61 d61Var = new d61(24, context, this);
        this.C0 = d61Var;
        d61Var.setOrientation(0);
        this.C0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        eVar.setRoundRadius(24);
        this.E0 = eVar;
        eVar.setText(hd.N0(2131742958, null));
        this.C0.addView(this.E0, c8.ma.m(1.0f, 0, 48, 0, 4, 0));
        this.E0.setOnClickListener(new View.OnClickListener(this) {
            public final n6 f44658b;

            {
                this.f44658b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44658b.P0();
                        return;
                    case 1:
                        n6 n6Var = this.f44658b;
                        n6Var.getClass();
                        n6Var.presentFragment(new bb1(6, null));
                        return;
                    case 2:
                        n6.d0(this.f44658b);
                        return;
                    case 3:
                        n6.f0(this.f44658b);
                        return;
                    default:
                        n6.h0(this.f44658b);
                        return;
                }
            }
        });
        hi.e eVar2 = new hi.e(context, this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.F0 = eVar2;
        eVar2.setText(hd.N0(2131742756, null));
        this.F0.setEnabled(u0.D(this.currentAccount).f());
        this.F0.setOnClickListener(new View.OnClickListener(this) {
            public final n6 f44658b;

            {
                this.f44658b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44658b.P0();
                        return;
                    case 1:
                        n6 n6Var = this.f44658b;
                        n6Var.getClass();
                        n6Var.presentFragment(new bb1(6, null));
                        return;
                    case 2:
                        n6.d0(this.f44658b);
                        return;
                    case 3:
                        n6.f0(this.f44658b);
                        return;
                    default:
                        n6.h0(this.f44658b);
                        return;
                }
            }
        });
        this.C0.addView(this.F0, c8.ma.m(1.0f, 0, 48, 4, 0, 0));
        a1(this.f44669e.getStickerStyle());
        this.G0 = u0.D(this.currentAccount).H();
        this.f34681a.setDescendantFocusability(131072);
        r8 r8Var2 = new r8(this, this.f44669e, new k8.a(20, this, pa0Var), null);
        this.f44677k0 = r8Var2;
        pa0Var.addView(r8Var2, c8.ma.c(-1.0f, -1));
        this.f44678l0 = "";
        this.f44681o0 = new k5(this, context, 0);
        hi.i1 i1Var = new hi.i1(this, context, this.resourceProvider, 9);
        this.f44687s0 = i1Var;
        i1Var.setAllowDisallowInterceptTouch(false);
        this.f44687s0.setAdapter(new di.i4(9, context, this));
        this.glassEngine.c(this.f44687s0);
        i71 i12 = this.f44687s0.i(-2, true);
        this.f44674h0 = i12;
        i12.h(i7, org.telegram.ui.ActionBar.m6.G6, i7, i11, i10);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        gh.e m10 = c8.i0.m(this.resourceProvider);
        i71 i71Var = this.f44674h0;
        fh.g c10 = baseSimpleGlass.f56661c.c(i71Var, null, false);
        c10.p(m10);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        i71Var.setBlurredBackground(c10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44675i0 = frameLayout4;
        frameLayout4.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        this.f44675i0.setClipChildren(false);
        this.f44675i0.setClipToPadding(false);
        j9 j9Var = new j9(context, this.f44674h0, this.resourceProvider, new w4(this, 0), new w4(this, 1), new w4(this, 2));
        this.f44676j0 = j9Var;
        j9Var.setClipChildren(false);
        j9 j9Var2 = this.f44676j0;
        fh.g c11 = baseSimpleGlass.f56661c.c(j9Var2, null, false);
        c11.p(m10);
        c11.r(org.telegram.messenger.g0.L(20.0f));
        j9Var2.f44469y = c11;
        j9Var2.invalidate();
        this.f44675i0.addView(this.f44676j0, c8.ma.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f44687s0.setPosition(this.f44672f0);
        g1();
        this.f44681o0.addView(this.f44687s0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        FrameLayout frameLayout5 = this.f44675i0;
        r8 r8Var3 = this.f44677k0;
        if (r8Var3 != null) {
            childCount = viewGroup.indexOfChild(r8Var3);
        } else {
            childCount = viewGroup.getChildCount();
        }
        viewGroup.addView(frameLayout5, childCount, c8.ma.e(-1, 40, 48));
        Q0(this.f44673g0);
        l0 l0Var2 = this.H0;
        if (l0Var2 != null) {
            this.f44677k0.Y(l0Var2);
        }
        this.f34681a.j(new org.telegram.ui.Components.oa(this, 24));
        c51 c51Var = this.f34681a.f35789g3;
        c51Var.f34062r = false;
        c51Var.O(false);
        j6 j6Var2 = new j6(this);
        this.f44688t0 = j6Var2;
        j6Var2.b(this.f34681a);
        W0();
        this.G0.h();
        this.simpleActionBar.post(new q4(this, 5));
        this.f34681a.post(new q4(this, 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.f6 f6Var;
        c51 c51Var;
        if (i10 == this.currentAccount) {
            if (i7 == ls.f25296d4 && this.f44692w0 != null) {
                W0();
                Iterator it = this.T0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i7 == ls.A3) {
                h1();
            } else if (i7 == ls.f25365q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.V0 = true;
                        this.W0 = ((TL_account.Password) obj).has_password;
                        bi.f6 f6Var2 = this.f34681a;
                        if (f6Var2 != null && (c51Var = f6Var2.f35789g3) != null) {
                            c51Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new e(this, 7));
            } else if (i7 == ls.f25302e4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                t0 t0Var = this.G0;
                if (obj2 == t0Var && (f6Var = this.f34681a) != null && f6Var.f35789g3 != null) {
                    if (t0Var.f45086b.isEmpty()) {
                        t0 t0Var2 = this.G0;
                        if (!t0Var2.h) {
                            t0Var2.h();
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
        h51 h51Var = this.f44689u0[i7];
        if (h51Var != null) {
            bi.f6 f6Var = this.f34681a;
            if (f6Var != null) {
                i10 = f6Var.getPaddingTop();
            } else {
                i10 = 0;
            }
            int i14 = i10 + this.f44682p0;
            if (i7 == 1) {
                i11 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i11 = 0;
            }
            int i15 = i14 + i11;
            bi.f6 f6Var2 = this.f34681a;
            if (f6Var2 != null) {
                i12 = f6Var2.getPaddingBottom();
            } else {
                i12 = 0;
            }
            if (i7 == 1) {
                i13 = org.telegram.messenger.g0.L(12.0f);
            } else {
                i13 = 0;
            }
            int i16 = i12 + i13;
            if (h51Var.getPaddingTop() != i15 || h51Var.getPaddingBottom() != i16) {
                boolean canScrollVertically = h51Var.canScrollVertically(-1);
                if (i7 == 1) {
                    h51Var.setPadding(org.telegram.messenger.g0.L(9.0f), i15, org.telegram.messenger.g0.L(9.0f), i16);
                } else {
                    h51Var.setPadding(0, i15, 0, i16);
                }
                if (!canScrollVertically) {
                    h51Var.f35788f3.h1(0, 0);
                }
            }
        }
    }

    public final void f1() {
        View view;
        boolean z10;
        int i7;
        k5 k5Var;
        if (this.f44675i0 != null) {
            boolean E0 = E0();
            if (this.f44683q0 != E0 && (k5Var = this.f44681o0) != null) {
                this.f44683q0 = E0;
                k5Var.invalidate();
            }
            if (C0()) {
                view = (View) this.f44681o0.getParent();
            } else {
                view = null;
            }
            int i10 = 0;
            if (view != null && (this.m0 > 0.0f || this.f44680n0 != null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f44675i0;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            View view2 = (View) this.f34681a.getParent();
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                i10 = z4Var.getHeight();
            }
            if (z10) {
                float y10 = this.f34681a.getY() + view2.getY();
                float y11 = view.getY() + y10 + org.telegram.messenger.g0.L(2.0f);
                this.f44675i0.setTranslationY(y11);
                float paddingTop = y10 + this.f34681a.getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
                float L = (org.telegram.messenger.g0.L(46.0f) + paddingTop) - Math.max(0.0f, y11 - paddingTop);
                float f10 = this.m0;
                i10 = Math.max(i10, Math.round(((1.0f - f10) * i10) + (L * f10)));
            }
            w0(this.S);
            w0(this.C0);
            w0(this.f44668d0);
            View view3 = this.K0;
            if (view3 != null && view3.getLayoutParams().height != i10) {
                this.K0.getLayoutParams().height = i10;
                this.K0.requestLayout();
            }
        }
    }

    public final void g1() {
        j9 j9Var = this.f44676j0;
        if (j9Var != null && this.f44687s0 != null && j9Var.f44468x != 0.0f) {
            j9Var.f44468x = 0.0f;
            j9Var.f44461c.setVisibility(8);
            j9Var.invalidate();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34681a;
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        u0 D = u0.D(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5 x5Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = D.f45133i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(D.f45134j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        x5Var.j(frameLayout, z11, z10);
        long j3 = 0;
        if (!TextUtils.isEmpty(D.y())) {
            ArrayList arrayList = D.J;
            int size = arrayList.size();
            int i7 = 0;
            long j10 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                q0 q0Var = (q0) obj;
                if (!q0Var.f44852e) {
                    long j11 = q0Var.f44851c;
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
            this.X.setText(A0(2131742815, j3));
        }
        this.T.j(this.W, z12, z10);
        long j12 = di.y8.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(A0(2131742853, j12));
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
        j9 j9Var = this.f44676j0;
        if (j9Var != null && j9Var.E) {
            if (z10) {
                j9Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        j6 j6Var = this.f44688t0;
        if (j6Var != null) {
            j6Var.c();
        }
        bi.f6 f6Var = this.f34681a;
        if (f6Var != null) {
            f6Var.C0();
        }
        h51 B0 = B0();
        if (B0 != null) {
            B0.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f26931b;
        if (p6.f44797k0.compareAndSet(false, true)) {
            p6.f44798l0.postRunnable(new d5(context, 2));
        }
        getNotificationCenter().c(this, ls.f25296d4);
        getNotificationCenter().c(this, ls.A3);
        getNotificationCenter().c(this, ls.f25302e4);
        getNotificationCenter().c(this, ls.f25365q0);
        u0 D = u0.D(this.currentAccount);
        l0 B = D.B();
        this.H0 = B;
        q4 q4Var = this.J0;
        ArrayList arrayList = B.d;
        if (!arrayList.contains(q4Var)) {
            arrayList.add(q4Var);
        }
        jw0 jw0Var = this.X0;
        if (jw0Var != null) {
            jw0Var.run();
        }
        int i7 = D.F;
        D.F = i7 + 1;
        HashSet hashSet = D.G;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            D.a0();
        }
        this.X0 = new jw0(D, i7, 5);
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
        r8 r8Var = this.f44677k0;
        if (r8Var != null) {
            r8Var.p();
        }
        b6 b6Var = this.f44669e;
        if (b6Var != null) {
            b6Var.setOnFrontContentPresented(null);
        }
        ValueAnimator valueAnimator2 = this.f44680n0;
        if (valueAnimator2 != null) {
            this.f44680n0 = null;
            valueAnimator2.cancel();
        }
        l0 l0Var = this.H0;
        if (l0Var != null) {
            l0Var.d.remove(this.J0);
        }
        U0();
        j6 j6Var = this.f44688t0;
        if (j6Var != null) {
            j6Var.b(null);
        }
        getNotificationCenter().n(this, ls.f25296d4);
        getNotificationCenter().n(this, ls.A3);
        getNotificationCenter().n(this, ls.f25302e4);
        getNotificationCenter().n(this, ls.f25365q0);
        org.telegram.messenger.g0.E2(this.F);
        t0 t0Var = this.G0;
        if (t0Var != null) {
            t0Var.a();
        }
        super.onFragmentDestroy();
        jw0 jw0Var = this.X0;
        if (jw0Var != null) {
            jw0Var.run();
            this.X0 = null;
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (this.f44681o0 != null) {
            e1(0);
            e1(1);
            this.f44681o0.requestLayout();
        }
        m80 m80Var = this.f44665a0;
        if (m80Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m80Var.getLayoutParams();
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(24.0f) + i12;
            this.f44665a0.setLayoutParams(layoutParams);
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
            alertDialog$Builder.f28777a.U = org.telegram.messenger.g0.W2(hd.N0(2131746307, null));
            alertDialog$Builder.k(hd.N0(2131747106, null), new o4(this));
            alertDialog$Builder.h(hd.N0(2131751760, null), null);
            int i10 = org.telegram.ui.ActionBar.m6.L5;
            alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.post(new q4(this, 5));
        }
        u0.D(this.currentAccount).K();
        if (this.H0 != null && u0.D(this.currentAccount).N()) {
            this.H0.e();
        }
        W0();
        if (this.f34681a != null) {
            c1(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f44692w0 != null && this.f44694x0 != null && this.f44669e != null) {
                Z0(this.A0);
            }
            b6 b6Var = this.f44669e;
            if (b6Var != null && this.E0 != null && this.F0 != null) {
                a1(b6Var.getStickerStyle());
            }
            m80 m80Var = this.f44665a0;
            if (m80Var != null) {
                m80Var.invalidate();
            }
            TextView textView = this.X;
            if (textView != null) {
                textView.invalidate();
            }
            TextView textView2 = this.Z;
            if (textView2 != null) {
                textView2.invalidate();
            }
            x5 x5Var = this.T;
            if (x5Var != null) {
                x5Var.invalidate();
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
            FrameLayout frameLayout2 = this.f44675i0;
            if (frameLayout2 != null && frameLayout2.getParent() == frameLayout) {
                indexOfChild = Math.min(indexOfChild, frameLayout.indexOfChild(this.f44675i0));
            }
            frameLayout.addView(this.K0, indexOfChild, c8.ma.e(-1, 0, 48));
            this.K0.setBackground(getBaseSimpleGlass().a(this.K0));
            this.simpleActionBar.setBackground(null);
        }
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (z4Var2 != null) {
            z4Var2.setOutlineProvider(null);
            this.simpleActionBar.setTranslationZ(org.telegram.messenger.g0.L(20.0f));
        }
        getBaseSimpleGlass().f56671o = new eh.a() {
            @Override
            public final void c(dh.a aVar, RectF rectF) {
                aVar.f8401a = true;
            }

            @Override
            public final void d(Canvas canvas, RectF rectF) {
                Canvas canvas2;
                n6 n6Var = n6.this;
                bi.f6 f6Var = n6Var.f34681a;
                ih.d.a(f6Var, canvas, rectF, f6Var, (ViewGroup) n6Var.fragmentView);
                b6 b6Var = n6Var.f44669e;
                if (b6Var != null && n6Var.f44679n != null && b6Var.getVisibility() == 0 && n6Var.f44669e.getAlpha() > 0.0f) {
                    int save = canvas.save();
                    canvas.translate(n6Var.f44679n.getX() + n6Var.f44669e.getLeft(), n6Var.f44679n.getY() + n6Var.f44669e.getTop());
                    canvas.concat(n6Var.f44669e.getMatrix());
                    if (n6Var.f44669e.getAlpha() < 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, n6Var.f44669e.getWidth(), n6Var.f44669e.getHeight(), (int) (n6Var.f44669e.getAlpha() * 255.0f));
                    } else {
                        canvas2 = canvas;
                    }
                    n6Var.f44669e.draw(canvas2);
                    canvas2.restoreToCount(save);
                }
            }
        };
    }

    public final void t0(boolean z10) {
        float f10;
        long j3;
        nr nrVar;
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
            nrVar = new nr(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            nrVar = new nr(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(nrVar);
        this.N0.addUpdateListener(new v4(this, 1));
        this.N0.addListener(new k71(this, 7));
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
        int i7 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29792z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ma.e(-2, -2, 21));
        frameLayout.setOnClickListener(new o3(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        c8.ra.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, c8.ma.o(-1, -2));
        return frameLayout;
    }

    public final void w0(ViewGroup viewGroup) {
        float f10;
        if (viewGroup != null) {
            float f11 = 0.0f;
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != 0 && viewGroup2 != this.f34681a) {
                f11 += viewGroup2.getY();
                if (viewGroup2.getParent() instanceof View) {
                    viewGroup2 = (View) viewGroup2.getParent();
                } else {
                    viewGroup2 = 0;
                }
            }
            if (viewGroup2 != 0 && viewGroup.getHeight() > 0) {
                f10 = Utilities.l(((f11 + viewGroup.getHeight()) - this.f34681a.getPaddingTop()) / viewGroup.getHeight());
            } else {
                f10 = 1.0f;
            }
            if (viewGroup.getAlpha() != f10) {
                viewGroup.setAlpha(f10);
            }
        }
    }
}
