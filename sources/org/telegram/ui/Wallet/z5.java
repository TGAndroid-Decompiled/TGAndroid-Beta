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
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cb1;
import org.telegram.ui.e61;
import org.telegram.ui.h10;
import org.telegram.ui.ik0;
import org.telegram.ui.jq0;
import org.telegram.ui.ra0;
import org.telegram.ui.s90;
import org.telegram.ui.sb1;
import org.telegram.ui.u81;
public final class z5 extends o41 implements ls {
    public static Typeface U0;
    public float A0;
    public fi.d B0;
    public fi.d C0;
    public View D;
    public k0 D0;
    public bi.x5 E;
    public d0 E0;
    public boolean F;
    public boolean F0;
    public float H0;
    public float I0;
    public ValueAnimator J0;
    public org.telegram.ui.ActionBar.r0 L0;
    public ai.i0 M0;
    public int N0;
    public SpannableString Q0;
    public w41 R;
    public boolean R0;
    public j5 S;
    public boolean S0;
    public FrameLayout T;
    public org.telegram.ui.Components.q2 T0;
    public TextView U;
    public FrameLayout V;
    public TextView W;
    public FrameLayout X;
    public TextView Y;
    public w70 Z;
    public k5 f43444a0;
    public boolean f43445b0;
    public FrameLayout f43446c0;
    public FrameLayout f43447d0;
    public n5 f43448e;
    public k5 f43450f;
    public boolean f43451f0;
    public u61 f43452g0;
    public int h;
    public FrameLayout f43453h0;
    public u8 f43454i0;
    public d8 f43455j0;
    public float f43457l0;
    public ValueAnimator m0;
    public o5 f43458n;
    public bi.t f43459n0;
    public boolean f43460o0;
    public fi.g1 f43461p0;
    public v5 f43462q0;
    public int f43463r;
    public boolean f43465s;
    public LinearLayout f43466s0;
    public org.telegram.ui.Components.i6 f43467t0;
    public org.telegram.ui.Components.i6 f43468u0;
    public h6 f43469v0;
    public q5 f43471w0;
    public float f43473x0;
    public FrameLayout f43474y;
    public float f43475y0;
    public e61 f43476z0;
    public final dt f43470w = new dt(this, 24);
    public final j4 f43472x = new org.telegram.ui.Components.ls() {
        @Override
        public final void a(int i7, boolean z9) {
            fi.w3 w3Var;
            z5 z5Var = z5.this;
            dt dtVar = z5Var.f43470w;
            if ((i7 != 1 && i7 != 3) || (w3Var = z5Var.f36518a) == null) {
                return;
            }
            z5Var.f43465s = z9;
            w3Var.removeCallbacks(dtVar);
            dtVar.run();
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
    public int f43449e0 = 0;
    public String f43456k0 = "";
    public final r41[] f43464r0 = new r41[2];
    public final f4 G0 = new f4(this, 4);
    public final f4 K0 = new f4(this, 5);
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
                if (pathSegments.size() != 1 || (!"sendgrams".equalsIgnoreCase(pathSegments.get(0)) && d1(uri) == null)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void G0(Context context, int i7, TL_wallet.walletTransaction wallettransaction, x10 x10Var, v10 v10Var, byte[] bArr, org.telegram.ui.Cells.m0 m0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        y2[] y2VarArr;
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
                bi.k7 k7Var = new bi.k7(context, i7, 0L, h6Var, null);
                k7Var.f4167d3 = wallettransaction;
                k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
                return;
            }
        }
        boolean z9 = true;
        y2[] y2VarArr2 = new y2[1];
        View[] viewArr2 = new View[1];
        k0 B = l0.x(i7).B();
        ArrayList arrayList = new ArrayList(B.f42699c);
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
        if (x10Var == null && m0Var == null && i10 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(2131232728).getPadding(rect);
            viewArr = viewArr2;
            ?? z4Var = new z4(context, h6Var, arrayList, B, i7, rect, viewArr);
            z4Var.setPosition(i10);
            y2VarArr = y2VarArr2;
            z4Var.setAdapter(new a5(arrayList, context, h6Var, rect, i7, y2VarArr2));
            v10Var2 = v10Var;
            t02 = z4Var;
        } else {
            y2VarArr = y2VarArr2;
            viewArr = viewArr2;
            v10Var2 = v10Var;
            t02 = t0(context, i7, wallettransaction, x10Var, v10Var, bArr, m0Var, h6Var, y2VarArr, false);
        }
        y2[] y2VarArr3 = y2VarArr;
        b5 b5Var = new b5(context, t02, h6Var, t02, viewArr, context);
        y2VarArr3[0] = b5Var;
        if ((t02 instanceof v61) && v10Var2 != null) {
            b5Var.n(new sb1(11, v10Var2, wallettransaction));
        }
        y2 y2Var = y2VarArr3[0];
        if (x10Var == null) {
            z9 = false;
        }
        y2Var.A0(z9);
        y2 y2Var2 = y2VarArr3[0];
        y2Var2.T0 = false;
        y2Var2.show();
    }

    public static void I0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
        linearLayout.addView(new x6(160, context, false), c8.ha.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743097, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 0, 0, 0, 6), context);
        f10.setText(id.M0(2131743096, null));
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.t6.U(f10, i10, h6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 0, 0, 0, 24));
        s5 s5Var = new s5(context, h6Var);
        s5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var.a(2131232829, id.M0(2131743019, null), id.M0(2131743018, null));
        linearLayout.addView(s5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s5 s5Var2 = new s5(context, h6Var);
        s5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var2.a(2131232827, id.M0(2131743068, null), id.M0(2131743067, null));
        linearLayout.addView(s5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        s5 s5Var3 = new s5(context, h6Var);
        s5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
        s5Var3.a(2131232831, id.M0(2131743182, null), id.M0(2131743181, null));
        linearLayout.addView(s5Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        h.setText(id.M0(2131743101, null));
        linearLayout.addView(h, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        c8.ka.b(h, 0.02f, 1.1f);
        w70 w70Var = new w70(context, null);
        org.telegram.ui.ActionBar.t6.U(w70Var, i10, h6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setGravity(17);
        w70Var.setText(R0(id.M0(2131743006, null), org.telegram.ui.ActionBar.m6.Uc, h6Var, new g4(context, 1)));
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        l10.N = frameLayout;
        org.telegram.ui.ActionBar.w2[] w2VarArr = {l10};
        w2VarArr[0].u0(true);
        w2VarArr[0].N();
        h.setOnClickListener(new n4(w2VarArr, 1));
        w2VarArr[0].show();
    }

    public static void J0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        l0 x10 = l0.x(i7);
        if (x10.G()) {
            String t6 = x10.t();
            if (TextUtils.isEmpty(t6)) {
                return;
            }
            K0(context, i7, t6, true, null, h6Var);
        }
    }

    public static void K0(Context context, final int i7, String str, final boolean z9, final g gVar, final org.telegram.ui.ActionBar.h6 h6Var) {
        float f10;
        final org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, context, h6Var, false);
        w2Var.v0(-12207881);
        w2Var.O(-12207881);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(new y5());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, c8.ha.f(-2.0f, -1, 55, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22562n));
        x5 x5Var = new x5(context, str);
        if (!z9) {
            x5Var.f43327b.setText(id.M0(2131746500, null));
        }
        linearLayout.addView(x5Var, c8.ha.r(288, 302, 1));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131743041, null));
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 24, 0, 24, 20));
        final fi.d dVar = new fi.d(context, null, true);
        dVar.setRoundRadius(24);
        dVar.setColor(-1);
        dVar.setTextColor(-15556886);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z9) {
            f10 = 12.0f;
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new wp(2131232807, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131743180, null));
        } else {
            f10 = 12.0f;
            wp wpVar = new wp(2131231956, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            spannableStringBuilder.append((CharSequence) "G");
            spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) id.M0(2131743017, null));
        }
        dVar.setText(spannableStringBuilder);
        linearLayout.addView(dVar, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
        if (!z9) {
            int i10 = 8;
            textView.setVisibility(8);
            if (gVar != null) {
                i10 = 0;
            }
            dVar.setVisibility(i10);
        }
        View e10 = org.telegram.messenger.camera.q.e(context, 2131231269);
        e10.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
        e10.setContentDescription(id.M0(2131752041, null));
        c8.ka.a(e10);
        frameLayout.addView(e10, c8.ha.d(48, 48.0f, 51, 4.0f, 2.0f, 0.0f, 0.0f));
        w2Var.N = frameLayout;
        w2Var.f28710x = true;
        w2Var.f28706u0 = false;
        w2Var.f28707v0 = false;
        w2Var.O(-12207881);
        e10.setOnClickListener(new e4(w2Var, 0));
        x5Var.f43330f = new q0(str, 1);
        w2Var.show();
        w2Var.E0(-12207881);
        org.telegram.messenger.g0.u3(w2Var, -12207881, false, null);
        org.telegram.messenger.g0.n3(w2Var, false);
        if (Build.VERSION.SDK_INT >= 29 && w2Var.getWindow() != null) {
            w2Var.getWindow().setNavigationBarContrastEnforced(false);
        }
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                boolean z10 = z9;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                if (!z10) {
                    w2Var2.dismiss();
                    gVar.run();
                    return;
                }
                fi.d dVar2 = dVar;
                if (dVar2.Q) {
                    return;
                }
                dVar2.setLoading(true);
                p4 p4Var = new p4(dVar2, w2Var2, h6Var, 0);
                int i11 = i7;
                l0 x10 = l0.x(i11);
                x10.m0(new h10(i11, p4Var, x10));
            }
        });
    }

    public static SpannableStringBuilder R0(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var, Runnable runnable) {
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
            spannableStringBuilder.setSpan(new hi.k3(i7, h6Var, runnable), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Z0(r41 r41Var, boolean z9) {
        boolean canScrollVertically = r41Var.canScrollVertically(-1);
        r41Var.f37496f3.O(z9);
        r41Var.a0();
        if (!canScrollVertically) {
            r41Var.f37495e3.h1(0, 0);
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

    public static void d0(z5 z5Var) {
        l0 x10 = l0.x(z5Var.currentAccount);
        fi.d dVar = z5Var.C0;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        x10.m0(new h2.o0((Object) x10, (Object) new s(8, z5Var, x10), false, false, 4));
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

    public static void e0(z5 z5Var) {
        vf.c.t(z5Var.getParentActivity(), l0.x(z5Var.currentAccount).f42756j);
    }

    public static void f0(z5 z5Var) {
        J0(z5Var.currentAccount, z5Var.getParentActivity(), z5Var.getResourceProvider());
    }

    public static void g0(z5 z5Var, String str, l0 l0Var, k60 k60Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f10;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, z5Var.getParentActivity(), z5Var.resourceProvider, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        z0Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = z0Var.f28803b;
        if (equals) {
            f10 = 42.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(f10), 0);
        z0Var.setChecked(equals);
        z0Var.setOnClickListener(new i1(l0Var, currencyrate, k60Var, 1));
        linearLayout.addView(z0Var, c8.ha.o(200, -2));
    }

    public static void h0(z5 z5Var) {
        org.telegram.ui.ActionBar.l lVar;
        if (z5Var.E != null && (lVar = z5Var.actionBar) != null && (lVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) z5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (z5Var.E.getParent() != z5Var.actionBar) {
                org.telegram.messenger.g0.E2(z5Var.E);
                z5Var.actionBar.addView(z5Var.E, c8.ha.c(-1.0f, -1));
            }
            z5Var.E.bringToFront();
            z5Var.actionBar.bringToFront();
            z5Var.E.post(new f4(z5Var, 12));
        }
    }

    public static void i0(z5 z5Var) {
        J0(z5Var.currentAccount, z5Var.getParentActivity(), z5Var.getResourceProvider());
    }

    public static void j0(z5 z5Var, String str) {
        Uri c12 = c1(str);
        String d12 = d1(c12);
        if (d12 != null) {
            int i7 = z5Var.currentAccount;
            qp.s1(i7).d2().a(d12, null, new fi.t3(new m4(z5Var, 4), i7));
        } else if ((z5Var.getParentActivity() instanceof LaunchActivity) && new s90((LaunchActivity) z5Var.getParentActivity(), z5Var.currentAccount, null, false).g(c12)) {
        } else {
            org.telegram.messenger.g0.h3(new f4(z5Var, 11));
        }
    }

    public static void k0(z5 z5Var, LinearLayout linearLayout, l0 l0Var, k60 k60Var) {
        TL_wallet.currencyRate currencyrate;
        z5 z5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g10 = l0Var2.h.g();
        TL_wallet.currencyRates f10 = l0Var2.h.f();
        if (f10 == null) {
            for (int i7 = 0; i7 < 3; i7++) {
                lz lzVar = new lz(z5Var.getParentActivity(), z5Var.getResourceProvider());
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(31);
                linearLayout2.addView(lzVar, c8.ha.o(200, -2));
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
                InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25570b.getSystemService("input_method");
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
            f.a(linkedHashSet, ((org.telegram.messenger.n0) qp.s1(fVar.f42478a).f24946x7.O.f13557b).f24122c);
            f.c(linkedHashSet, id.E0().f23189y);
            f.c(linkedHashSet, id.E0().f23190z);
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
                g0(z5Var, g10, l0Var2, k60Var, linearLayout2, currencyrate7);
            }
            i12++;
            l0Var2 = l0Var;
        }
        if (!hashSet.isEmpty() && !f10.rates.isEmpty()) {
            z5Var2 = z5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.d1(z5Var.getParentActivity(), z5Var2.resourceProvider), c8.ha.o(-1, 8));
        } else {
            z5Var2 = z5Var;
        }
        int i13 = 0;
        while (i13 < f10.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f10.rates.get(i13);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                g0(z5Var2, g10, l0Var, k60Var, linearLayout2, currencyrate8);
            }
            i13++;
            z5Var2 = z5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void l0(final z5 z5Var, Context context, View view) {
        boolean z9;
        l0 x10 = l0.x(z5Var.currentAccount);
        final k60 I = k60.I(z5Var, view);
        I.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.f35219s = 0;
        I.V(5);
        k60 J = I.J();
        J.c(2131231240, id.M0(2131743192, null), new jq0(I, 27), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        h7 h7Var = new h7(z5Var, linearLayout, x10, I, 11);
        J.r(scrollView, c8.ha.o(-1, 350));
        I.c(2131232815, id.M0(2131743148, null), new g(h7Var, I, J, 11), false);
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        f fVar = x10.h;
        String i7 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i7);
        String str = i7;
        if (isEmpty) {
            y10.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131748779, null));
            spannableStringBuilder.setSpan(new b80(org.telegram.messenger.g0.L(75.0f), y10.f28803b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y10.setSubtext(str);
        if (fVar.f() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        h7 h7Var2 = new h7(x10, new boolean[]{z9}, y10, h7Var, 12);
        z5Var.P0.add(h7Var2);
        h7Var.run();
        I.c(2131232833, id.M0(2131747657, null), new Runnable(z5Var) {
            public final z5 f43113b;

            {
                this.f43113b = z5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        z5 z5Var2 = this.f43113b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        z5 z5Var3 = this.f43113b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        z5 z5Var4 = this.f43113b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new o41());
                        return;
                    default:
                        I.u();
                        z5 z5Var5 = this.f43113b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.c(2131232826, id.M0(2131743080, null), new Runnable(z5Var) {
            public final z5 f43113b;

            {
                this.f43113b = z5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        z5 z5Var2 = this.f43113b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        z5 z5Var3 = this.f43113b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        z5 z5Var4 = this.f43113b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new o41());
                        return;
                    default:
                        I.u();
                        z5 z5Var5 = this.f43113b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.l(2131232806, id.M0(2131743156, null), new Runnable(z5Var) {
            public final z5 f43113b;

            {
                this.f43113b = z5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        z5 z5Var2 = this.f43113b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        z5 z5Var3 = this.f43113b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        z5 z5Var4 = this.f43113b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new o41());
                        return;
                    default:
                        I.u();
                        z5 z5Var5 = this.f43113b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        return;
                }
            }
        }, true ^ x10.f42754g.d.isEmpty());
        I.k();
        I.c(2131232819, id.M0(2131742960, null), new Runnable(z5Var) {
            public final z5 f43113b;

            {
                this.f43113b = z5Var;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        z5 z5Var2 = this.f43113b;
                        z5Var2.getClass();
                        I.u();
                        z5Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 1:
                        z5 z5Var3 = this.f43113b;
                        z5Var3.getClass();
                        I.u();
                        z5Var3.presentFragment(new p8());
                        return;
                    case 2:
                        z5 z5Var4 = this.f43113b;
                        z5Var4.getClass();
                        I.u();
                        z5Var4.presentFragment(new o41());
                        return;
                    default:
                        I.u();
                        z5 z5Var5 = this.f43113b;
                        z5.I0(z5Var5.getParentActivity(), z5Var5.getResourceProvider());
                        return;
                }
            }
        }, false);
        I.f35214p = new sb1(12, z5Var, h7Var2);
        I.Z();
    }

    public static void m0(z5 z5Var, long j3) {
        f4 f4Var = z5Var.K0;
        if (z5Var.f36518a != null) {
            u8 u8Var = z5Var.f43454i0;
            if (u8Var != null) {
                u8Var.a();
            }
            if (z5Var.I0 <= 0.0f && z5Var.A0()) {
                int top = z5Var.f36518a.f37495e3.m(z5Var.h).getTop() - z5Var.f36518a.getPaddingTop();
                z5Var.f36518a.C0();
                if (top < 0) {
                    z5Var.f36518a.w0(0, top, wq.h);
                    return;
                }
                return;
            }
            z5Var.f36518a.C0();
            z5Var.s0(true);
            org.telegram.messenger.g0.r(f4Var);
            if (j3 > 0) {
                org.telegram.messenger.g0.i3(f4Var, j3 + 260);
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

    public static android.widget.LinearLayout t0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.x10 r46, org.telegram.messenger.v10 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.h6 r50, org.telegram.ui.Wallet.y2[] r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z5.t0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.x10, org.telegram.messenger.v10, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.h6, org.telegram.ui.Wallet.y2[], boolean):android.widget.LinearLayout");
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

    public static SpannableStringBuilder w0(int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
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
        CharSequence m10 = l0.x(i7).m(j3, true);
        if (!TextUtils.isEmpty(m10)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(m10);
            spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.f28300z6, h6Var), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final boolean A0() {
        View m10;
        fi.w3 w3Var = this.f36518a;
        if (w3Var != null && (m10 = w3Var.f37495e3.m(this.h)) != null && this.f43475y0 < 0.5f && m10.getBottom() > this.f36518a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void D0() {
        d0 d0Var;
        r41 r41Var = this.f43464r0[1];
        if (this.f43449e0 == 1 && r41Var != null && r41Var.G && (d0Var = this.E0) != null && !d0Var.f42275i && !d0Var.f42274g && d0Var.f42277k == null && r41Var.f37495e3.N0() >= r41Var.f37496f3.D.size() - 3) {
            this.E0.e();
        }
    }

    public final void E0() {
        k0 k0Var;
        r41 r41Var = this.f43464r0[0];
        if (r41Var != null && r41Var.G && (k0Var = this.D0) != null && !k0Var.h && r41Var.f37495e3.N0() >= r41Var.f37496f3.D.size() - 3) {
            this.D0.h();
        }
    }

    public final CharSequence F0(int i7) {
        org.telegram.ui.Components.i6 i6Var;
        float f10;
        CharSequence[] charSequenceArr = this.O0;
        if (charSequenceArr[i7] == null) {
            charSequenceArr[i7] = new SpannableString("l");
            if (i7 == 0) {
                i6Var = this.f43467t0;
            } else {
                i6Var = this.f43468u0;
            }
            if (i7 == 0) {
                f10 = 100.0f;
            } else {
                f10 = 50.0f;
            }
            b80 b80Var = new b80(org.telegram.messenger.g0.L(f10), i6Var);
            b80Var.a(org.telegram.ui.ActionBar.m6.r1(0.45f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1));
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
            k7Var.f4162a3 = nftitem;
            if (this.f43455j0 != null) {
                k7Var.f4164b3 = new h5(this, tL_starGiftUnique, nftitem);
                k7Var.f4166c3 = new i5(this, nftitem);
            }
            k7Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int i14 = org.telegram.ui.ActionBar.m6.f27834a7;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i14, resourceProvider);
            int i15 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.m6.w0(i15, resourceProvider);
            org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) parentActivity, resourceProvider, false);
            w2Var.f28670a0 = i14;
            w2Var.v0(w02);
            w2Var.O(w02);
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
            Drawable mutate = parentActivity.getResources().getDrawable(2131232835).mutate();
            int i16 = org.telegram.ui.ActionBar.m6.f28300z6;
            org.telegram.ui.ActionBar.t6.x(k9Var, mutate, i16, resourceProvider, PorterDuff.Mode.SRC_IN);
            hc c10 = c.c(nftitem, false);
            if (c10 != null) {
                k9Var.j(c10, "120_120", mutate, nftitem);
            } else {
                k9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(k9Var, c8.ha.r(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = id.M0(2131743176, null);
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
            org.telegram.ui.ActionBar.t6.U(textView2, i16, resourceProvider);
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
                int i19 = org.telegram.ui.ActionBar.m6.f27890d6;
                int w03 = org.telegram.ui.ActionBar.m6.w0(i19, resourceProvider);
                int i20 = org.telegram.ui.ActionBar.m6.f27982i6;
                int w04 = org.telegram.ui.ActionBar.m6.w0(i20, resourceProvider);
                org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w03, w04, w04);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i19);
                org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i20);
                linearLayout3.setBackground(k02);
                org.telegram.ui.ActionBar.t6.j(linearLayout3, k02, M, M2, resourceProvider);
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i18 == 0) {
                    i10 = 2131742981;
                } else {
                    i10 = 2131743023;
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
                int i21 = org.telegram.ui.ActionBar.m6.G6;
                org.telegram.ui.ActionBar.t6.s(imageView, i21, resourceProvider, PorterDuff.Mode.SRC_IN);
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
                int i22 = org.telegram.ui.ActionBar.m6.f27890d6;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i22, resourceProvider));
                org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i22);
                tx0Var.setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(tx0Var, d02, M3, null, resourceProvider);
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
            dVar.setText(id.M0(2131743063, null));
            linearLayout.addView(dVar, c8.ha.o(-1, 48));
            w2Var.N = scrollView;
            w2Var.T0 = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ik0(18, w2Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new h3(parentActivity, 1));
            dVar.setOnClickListener(new h3(w2Var, 2));
            w2Var.show();
            w2Var.O(w02);
            org.telegram.messenger.g0.u3(w2Var, w02, false, null);
        }
    }

    public final void L0() {
        if (getParentActivity() != null && this.M0 == null && this.L0 != null) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            } else {
                this.M0 = ai.i0.k(this, this.L0, new ai.c0(12), new m4(this, 3), new f4(this, 9));
            }
        }
    }

    public final void M0(boolean z9) {
        float f10;
        boolean z10;
        this.f43451f0 = z9;
        if (!z9) {
            this.f43449e0 = 0;
        }
        if (this.f43461p0 != null && this.f43453h0 != null) {
            if (!z9) {
                this.f43454i0.b(false);
                this.f43461p0.setPosition(0);
            }
            a1();
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
            if (this.f43459n0.isAttachedToWindow() && this.f43459n0.isLaidOut()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9) {
                this.f43461p0.o(false);
            }
            if (z10 && this.f43457l0 != f10) {
                this.f43453h0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43457l0, f10);
                this.m0 = ofFloat;
                ofFloat.setDuration(250L);
                this.m0.setInterpolator(wq.h);
                this.m0.addUpdateListener(new l4(this, 0));
                this.m0.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
                this.m0.start();
            } else {
                N0(f10);
                this.f43461p0.o(false);
            }
            if (this.f36518a != null && this.f43460o0 != O0()) {
                Y0(false);
            }
        }
    }

    public final void N0(float f10) {
        int i7;
        this.f43457l0 = f10;
        FrameLayout frameLayout = this.f43453h0;
        if (f10 <= 0.0f && this.m0 == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        frameLayout.setVisibility(i7);
        this.f43453h0.setAlpha(f10);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f43453h0.getLayoutParams();
        layoutParams.height = Math.round(org.telegram.messenger.g0.L(52.0f) * f10);
        layoutParams.bottomMargin = -Math.round(org.telegram.messenger.g0.L(6.0f) * f10);
        this.f43453h0.setLayoutParams(layoutParams);
    }

    public final boolean O0() {
        k0 k0Var;
        if (!this.f43451f0 && (k0Var = this.D0) != null && k0Var.f42699c.isEmpty()) {
            k0 k0Var2 = this.D0;
            k0Var2.getClass();
            if (k0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void P0() {
        this.F0 = false;
        u8 u8Var = this.f43454i0;
        if (u8Var != null) {
            u8Var.b(false);
        }
        this.f43449e0 = 0;
        fi.g1 g1Var = this.f43461p0;
        if (g1Var != null) {
            g1Var.setPosition(0);
        }
    }

    public final void Q0() {
        this.f43465s = false;
        fi.w3 w3Var = this.f36518a;
        if (w3Var != null) {
            w3Var.D2.f36368b.remove(this.f43472x);
            this.f36518a.removeCallbacks(this.f43470w);
        }
        n5 n5Var = this.f43448e;
        if (n5Var != null) {
            n5Var.setAdditionalTilt(0.0f);
        }
    }

    public final void S0() {
        boolean z9;
        l0 x10 = l0.x(this.currentAccount);
        b1();
        fi.d dVar = this.C0;
        if (x10.G() && x10.e()) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.setEnabled(z9);
        if (!x10.G()) {
            this.f43467t0.setText(F0(0));
            this.f43468u0.setText(F0(1));
            return;
        }
        long v = x10.v();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.Q0 == null) {
            this.Q0 = new SpannableString("G");
            n5 n5Var = this.f43448e;
            n5Var.getClass();
            h6 h6Var = new h6(n5Var);
            this.f43469v0 = h6Var;
            SpannableString spannableString = this.Q0;
            spannableString.setSpan(h6Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.Q0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) i6.e(v));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749516, null));
        if (this.f43471w0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f43056a = -9577217;
            this.f43471w0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f43471w0, length, spannableStringBuilder.length(), 33);
        this.f43467t0.setText(spannableStringBuilder);
        CharSequence m10 = l0.x(this.currentAccount).m(v, false);
        if (TextUtils.isEmpty(m10)) {
            this.f43468u0.setText(F0(1));
        } else {
            this.f43468u0.setText(m10);
        }
        V0(this.f43473x0);
        d0 d0Var = this.E0;
        if (d0Var != null && !d0Var.h && !d0Var.f42275i && d0Var.f42277k == null) {
            d0Var.e();
        }
        String t6 = x10.t();
        if (!TextUtils.isEmpty(t6)) {
            this.f43448e.setCardNumber(v0(t6.toUpperCase()));
        }
    }

    public final void T0() {
        float[] fArr;
        float[] fArr2;
        float f10;
        Rect rect = this.G;
        if (!rect.isEmpty() && this.D.isAttachedToWindow()) {
            n5 n5Var = this.f43448e;
            bi.x5 x5Var = this.E;
            Matrix matrix = this.H;
            if (n5Var.g(x5Var, matrix)) {
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
                this.f43448e.i(this.f43473x0, this.f43474y.getWidth() / 0.7826087f);
                float f12 = iArr2[0] - iArr[0];
                float x10 = org.telegram.ui.Cells.f1.x(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i12 = 0; i12 < 4; i12++) {
                    int i13 = i12 * 2;
                    float T1 = org.telegram.messenger.g0.T1(fArr2[i13], (fArr[i13] * 0.7826087f) + f12, this.f43473x0);
                    float[] fArr3 = this.M;
                    fArr3[i13] = T1;
                    int i14 = i13 + 1;
                    fArr3[i14] = org.telegram.messenger.g0.T1(fArr2[i14], (fArr[i14] * 0.7826087f) + x10, this.f43473x0);
                }
                Matrix matrix2 = this.J;
                boolean polyToPoly = matrix2.setPolyToPoly(this.K, 0, this.M, 0, 4);
                Matrix matrix3 = this.I;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.E.invalidate();
                }
                n5 n5Var2 = this.f43448e;
                Matrix matrix4 = n5Var2.f42624c;
                Matrix matrix5 = n5Var2.f42627e;
                Matrix matrix6 = n5Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!n5Var2.f42634n || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        n5Var2.f42634n = true;
                        n5Var2.N.invalidate();
                    }
                }
                float T12 = org.telegram.messenger.g0.T1(1.0f, 1.0952381f, this.f43473x0);
                this.f43468u0.setPivotX(0.0f);
                this.f43468u0.setPivotY(0.0f);
                this.f43468u0.setScaleX(T12);
                this.f43468u0.setScaleY(T12);
            }
        }
    }

    public final void U0() {
        bi.x5 x5Var;
        float i7;
        boolean z9;
        float f10;
        n5 n5Var;
        int i10;
        ?? r16;
        boolean z10;
        LinearLayout linearLayout;
        boolean z11;
        float min;
        float f11;
        float height;
        n5 n5Var2;
        if (this.f36518a != null && this.f43448e != null && this.f43466s0 != null && this.D != null && (x5Var = this.E) != null && this.actionBar != null) {
            x5Var.bringToFront();
            View m10 = this.f36518a.f37495e3.m(this.h);
            if (m10 == null) {
                if (this.f36518a.f37495e3.L0() > this.h) {
                    i7 = 1.0f;
                } else {
                    i7 = 0.0f;
                }
            } else {
                i7 = Utilities.i((this.f36518a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f43475y0 = i7;
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
            this.f43473x0 = i7;
            X0();
            if (m10 != null) {
                f10 = Math.max(0.0f, (m10.getHeight() / 2.0f) + org.telegram.messenger.g0.L(24.0f)) * this.f43473x0;
            } else {
                f10 = 0.0f;
            }
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.8f, this.f43473x0);
            this.f43448e.setPivotX(n5Var.getWidth() * 0.5f);
            this.f43448e.setPivotY(0.0f);
            this.f43448e.setScaleX(T1);
            this.f43448e.setScaleY(T1);
            this.f43448e.setAlpha(1.0f - Utilities.l(org.telegram.messenger.g0.z1(i7, 0.75f, 1.0f)));
            n5 n5Var3 = this.f43448e;
            if (!z9 && (m10 == null || i7 >= 1.0f || m10.getBottom() <= this.f36518a.getPaddingTop() || m10.getTop() >= this.f36518a.getHeight() - this.f36518a.getPaddingBottom())) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            n5Var3.setVisibility(i10);
            int[] iArr = this.Q;
            int[] iArr2 = this.P;
            if (m10 != null) {
                this.f36518a.getLocationInWindow(iArr2);
                this.f43458n.getLocationInWindow(iArr);
                r16 = 1;
                this.f43448e.setTranslationX(((this.f43450f.getWidth() - this.f43448e.getWidth()) / 2.0f) + this.f43450f.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.f43448e.setTranslationY(this.f43450f.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f10);
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
                this.f43458n.getLocationInWindow(iArr);
                float L = org.telegram.messenger.g0.L(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f14 = 1.0f - f12;
                if (z11) {
                    height = 0.0f;
                } else {
                    height = this.f43448e.getHeight() * 0.35f;
                }
                float f15 = L - (f14 * height);
                if (z11) {
                    f15 = a8.p0.f(0.9f - f13, this.f43448e.getHeight(), 2.0f, f15);
                }
                float width = (this.f43458n.getWidth() - this.f43448e.getWidth()) / 2.0f;
                if (!z11) {
                    f12 = Math.min(1.0f, f12 * 2.0f);
                }
                if (m10 != null) {
                    this.f36518a.getLocationInWindow(iArr2);
                    float width2 = ((this.f43450f.getWidth() - this.f43448e.getWidth()) / 2.0f) + this.f43450f.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y10 = this.f43450f.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float l10 = Utilities.l(1.0f - ((f15 - y10) / (this.f43448e.getHeight() * 0.5f)));
                    if (l10 >= 1.0f) {
                        org.telegram.messenger.g0.r(this.K0);
                        ValueAnimator valueAnimator = this.J0;
                        if (valueAnimator != null) {
                            this.J0 = null;
                            valueAnimator.cancel();
                        }
                        this.H0 = 0.0f;
                        this.I0 = 0.0f;
                        U0();
                        return;
                    }
                    width = org.telegram.messenger.g0.T1(width, width2, l10);
                    f15 = org.telegram.messenger.g0.T1(f15, y10, l10);
                    f13 = org.telegram.messenger.g0.T1(f13, 1.0f, l10);
                    f12 = org.telegram.messenger.g0.T1(f12, 1.0f, l10);
                }
                this.f43448e.setPivotX(n5Var2.getWidth() * 0.5f);
                this.f43448e.setPivotY(0.0f);
                this.f43448e.setScaleX(f13);
                this.f43448e.setScaleY(f13);
                this.f43448e.setTranslationX(width);
                this.f43448e.setTranslationY(f15);
                this.f43448e.setAlpha(f12);
            }
            if (i7 > 0.0f) {
                z10 = r16;
            } else {
                z10 = false;
            }
            if (this.F != z10 && (linearLayout = this.f43466s0) != null) {
                Rect rect = this.G;
                if (z10) {
                    if (linearLayout.getWidth() != 0 && this.f43466s0.getHeight() != 0) {
                        rect.set(this.f43466s0.getLeft(), this.f43466s0.getTop(), this.f43466s0.getRight(), this.f43466s0.getBottom());
                    }
                }
                this.f43448e.setOnFrontContentPresented(null);
                org.telegram.messenger.g0.E2(this.f43466s0);
                this.F = z10;
                if (z10) {
                    this.E.addView(this.f43466s0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f43466s0.layout(0, 0, rect.width(), rect.height());
                    T0();
                } else {
                    n5 n5Var4 = this.f43448e;
                    n5Var4.i(0.0f, 0.0f);
                    LinearLayout linearLayout2 = n5Var4.M;
                    org.telegram.messenger.g0.E2(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    g6 g6Var = n5Var4.O;
                    g6Var.setScaleX(1.0f);
                    g6Var.setScaleY(1.0f);
                    n5Var4.E.addView(linearLayout2, n5Var4.P);
                    this.f43466s0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.f43448e.getClass();
                    T0();
                }
                this.E.invalidate();
            }
            V0(i7);
            if (this.F) {
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G6);
        this.f43467t0.setTextColor(org.telegram.messenger.g0.d2(f10, -1, themedColor));
        org.telegram.ui.Components.i6 i6Var = this.f43468u0;
        float[] fArr = this.f43448e.f42621a0;
        int i7 = -7868417;
        if (fArr != null) {
            i7 = i0.a.f(fArr[8], r7.p(-7868417, 0, fArr), r7.p(-7868417, 3, fArr));
        }
        i6Var.setTextColor(org.telegram.messenger.g0.d2(f10, i7, i0.a.o(themedColor, Math.round(142.8f))));
        h6 h6Var = this.f43469v0;
        if (h6Var != null) {
            h6Var.f40042y = org.telegram.messenger.g0.d2(f10, -1, getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
        }
        q5 q5Var = this.f43471w0;
        if (q5Var != null) {
            float[] fArr2 = this.f43448e.f42621a0;
            int i10 = -9577217;
            if (fArr2 != null) {
                i10 = i0.a.f(fArr2[8], r7.p(-9577217, 0, fArr2), r7.p(-9577217, 3, fArr2));
            }
            q5Var.f43056a = i0.a.o(i10, Math.round((1.0f - f10) * 255.0f));
        }
        this.f43467t0.invalidate();
    }

    public final void W0(float[] fArr) {
        boolean z9;
        float f10;
        int n10;
        if (this.B0 != null && this.C0 != null) {
            float f11 = r7.j(getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7))[0];
            if (f11 < 0.6f) {
                z9 = true;
            } else {
                z9 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Ci);
            float f12 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = i7 * 4;
                    float f13 = fArr[i10 + 10];
                    if (f13 < 0.0f) {
                        n10 = themedColor;
                    } else {
                        n10 = r7.n(themedColor, (int) f13, (int) fArr[i10 + 11]);
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
            float[] j3 = r7.j(themedColor);
            float f14 = j3[0];
            int i11 = -16777216;
            if (f14 < f12 || f14 > f10) {
                themedColor = (themedColor & (-16777216)) | (r7.l(Math.max(f12, Math.min(f10, f14)), j3[1], j3[2]) & 16777215);
            }
            if (themedColor != this.N0) {
                this.N0 = themedColor;
                if (i0.a.h(themedColor) <= 0.550000011920929d) {
                    i11 = getThemedColor(org.telegram.ui.ActionBar.m6.Gi);
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

    public final void X0() {
        fi.w3 w3Var = this.f36518a;
        if (w3Var != null && this.f43448e != null) {
            float b10 = w3Var.D2.b(1);
            float min = Math.min(10.0f, this.f36518a.D2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.f43448e.setAdditionalTilt(Math.max(0.0f, (this.f43473x0 * 10.0f) + ((((float) Math.sqrt(Utilities.l(this.f43473x0))) * 90.0f) - 10.0f)) + min);
            this.f43448e.setUseGyroscope(1.0f - ((float) Math.pow(this.f43473x0, 0.33000001311302185d)));
        }
    }

    public final void Y0(boolean z9) {
        boolean O0 = O0();
        fi.w3 w3Var = this.f36518a;
        r41[] r41VarArr = this.f43464r0;
        if (w3Var != null && this.f43460o0 != O0) {
            this.f43460o0 = O0;
            w3Var.C0();
            for (r41 r41Var : r41VarArr) {
                if (r41Var != null) {
                    r41Var.C0();
                }
            }
            this.f36518a.f37496f3.O(false);
            this.f36518a.f37495e3.h1(0, 0);
            this.f36518a.post(new f4(this, 12));
        }
        if (!O0) {
            for (r41 r41Var2 : r41VarArr) {
                if (r41Var2 != null) {
                    Z0(r41Var2, z9);
                }
            }
            bi.t tVar = this.f43459n0;
            if (tVar != null) {
                tVar.post(new f4(this, 6));
                this.f43459n0.post(new f4(this, 7));
            }
        }
    }

    @Override
    public final void Z(ArrayList arrayList, m41 m41Var) {
        l0 x10 = l0.x(this.currentAccount);
        b1();
        arrayList.add(x31.m(this.R));
        this.h = arrayList.size();
        k5 k5Var = this.f43450f;
        x31 x31Var = new x31(-4);
        x31Var.f40149c = k5Var;
        x31Var.f40169z = -1;
        x31Var.f40150e = true;
        arrayList.add(x31Var);
        arrayList.add(x31.m(this.f43476z0));
        boolean O0 = O0();
        this.f43460o0 = O0;
        if (O0) {
            String M0 = id.M0(2131743019, null);
            String M02 = id.M0(2131743018, null);
            int i7 = r5.f43115b;
            x31 K = x31.K(r5.class);
            K.f40155k = 2131232829;
            K.f40156l = M0;
            K.f40157m = M02;
            arrayList.add(K);
            String M03 = id.M0(2131743068, null);
            String M04 = id.M0(2131743067, null);
            x31 K2 = x31.K(r5.class);
            K2.f40155k = 2131232827;
            K2.f40156l = M03;
            K2.f40157m = M04;
            arrayList.add(K2);
            String M05 = id.M0(2131743182, null);
            String M06 = id.M0(2131743181, null);
            x31 K3 = x31.K(r5.class);
            K3.f40155k = 2131232831;
            K3.f40156l = M05;
            K3.f40157m = M06;
            arrayList.add(K3);
            arrayList.add(x31.m(this.f43444a0));
        } else if (this.f43459n0 != null) {
            if (this.R0 && !this.S0 && x10.v() > 500000000) {
                arrayList.add(x31.k(this.f43446c0));
            }
            bi.t tVar = this.f43459n0;
            x31 x31Var2 = new x31(-3);
            x31Var2.f40149c = tVar;
            x31Var2.f40169z = 0;
            x31Var2.f40168y = 1;
            arrayList.add(x31Var2);
        }
        w70 w70Var = this.Z;
        if (w70Var != null) {
            this.f43445b0 = false;
            w70Var.animate().cancel();
            this.Z.setAlpha(0.0f);
            this.Z.setVisibility(4);
        }
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131743003, null);
    }

    public final void a1() {
        u8 u8Var = this.f43454i0;
        if (u8Var != null && this.f43461p0 != null && u8Var.f43242x != 0.0f) {
            u8Var.f43242x = 0.0f;
            u8Var.f43235c.setVisibility(8);
            u8Var.invalidate();
        }
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        d0 d0Var;
        Object obj = x31Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            H0((TL_wallet.nftItem) obj);
        } else if (x31Var.d == -10001 && (d0Var = this.E0) != null) {
            d0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            G0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) x31Var.G, null, null, null, null, getResourceProvider());
        }
    }

    public final void b1() {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.S == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        boolean z12 = false;
        if (this.S.isAttachedToWindow() && this.S.isLaidOut()) {
            z9 = true;
        } else {
            z9 = false;
        }
        j5 j5Var = this.S;
        FrameLayout frameLayout = this.T;
        Boolean bool = x10.f42755i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(x10.f42756j)) {
            z10 = true;
        } else {
            z10 = false;
        }
        j5Var.i(frameLayout, z10, z9);
        ArrayList arrayList = x10.G;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h0 h0Var = (h0) obj;
            if (!h0Var.f42565e) {
                long j10 = h0Var.f42564c;
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
            this.W.setText(x0(2131743062, j3));
        }
        this.S.i(this.V, z11, z9);
        long j11 = bi.ea.y(this.currentAccount, true).p().amount;
        if (j11 > 500000000) {
            z12 = true;
        }
        if (z12) {
            this.Y.setText(x0(2131743100, j11));
        }
        this.S.i(this.X, z12, z9);
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        d8 d8Var;
        if ((view instanceof q7) && (d8Var = this.f43455j0) != null) {
            d8Var.S((q7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        d8 d8Var = this.f43455j0;
        if ((d8Var == null || !d8Var.f42408p0) && super.canBeginSlide()) {
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
        Q0();
        v5 v5Var = this.f43462q0;
        if (v5Var != null) {
            v5Var.b(null);
        }
        this.f43450f = null;
        this.S = null;
        this.R = null;
        this.f43459n0 = null;
        this.f43461p0 = null;
        r41[] r41VarArr = this.f43464r0;
        r41VarArr[0] = null;
        r41VarArr[1] = null;
        d0 d0Var = this.E0;
        if (d0Var != null && !d0Var.f42269a.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f43451f0 = z9;
        if (!z9) {
            this.f43449e0 = 0;
        } else if (this.F0) {
            this.f43449e0 = 1;
        }
        d8 d8Var = this.f43455j0;
        if (d8Var != null) {
            d8Var.p();
        }
        this.f43455j0 = null;
        View createView = super.createView(context);
        ra0 ra0Var = new ra0(this, context);
        ra0Var.addView(createView, c8.ha.c(-1.0f, -1));
        this.fragmentView = ra0Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f27834a7;
        org.telegram.ui.ActionBar.t6.h(i7, lVar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        org.telegram.ui.ActionBar.r0 a10 = s5.a(2, 2131232678);
        this.L0 = a10;
        a10.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f42585b;

            {
                this.f42585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f42585b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        return;
                    case 1:
                        z5.f0(this.f42585b);
                        return;
                    case 2:
                        z5.i0(this.f42585b);
                        return;
                    case 3:
                        this.f42585b.L0();
                        return;
                    default:
                        z5.d0(this.f42585b);
                        return;
                }
            }
        });
        s5.a(1, 2131231244).setOnClickListener(new ik0(20, this, context));
        w41 w41Var = new w41(2, context, this);
        this.R = w41Var;
        w41Var.setClipToPadding(false);
        this.R.setClipChildren(false);
        this.R.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        j5 j5Var = new j5(this, context);
        this.S = j5Var;
        j5Var.setDefaultRadiusDp(22);
        this.S.setOnAnimatedHeightChangedListener(new f4(this, 0));
        TextView textView = new TextView(context);
        this.U = textView;
        textView.setText(id.M0(2131742962, null));
        this.T = u0(this.U, new f4(this, 1));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        this.V = u0(textView2, new f4(this, 2));
        TextView textView3 = new TextView(context);
        this.Y = textView3;
        this.X = u0(textView3, new f4(this, 3));
        this.R.addView(this.S, c8.ha.c(-2.0f, -1));
        w70 w70Var = new w70(context, null);
        this.Z = w70Var;
        this.f43445b0 = false;
        w70Var.setAlpha(0.0f);
        w70 w70Var2 = this.Z;
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        org.telegram.ui.ActionBar.t6.U(w70Var2, i10, this.resourceProvider);
        this.Z.setTextSize(1, 13.0f);
        this.Z.setGravity(17);
        this.Z.setText(R0(id.M0(2131743006, null), org.telegram.ui.ActionBar.m6.Uc, this.resourceProvider, new g4(context, 0)));
        this.Z.setVisibility(4);
        FrameLayout frameLayout = (FrameLayout) createView;
        if (frameLayout != null) {
            frameLayout.addView(this.Z, c8.ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 24.0f));
        }
        k5 k5Var = new k5(this, context, 0);
        this.f43444a0 = k5Var;
        k5Var.setImportantForAccessibility(2);
        this.f43446c0 = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43447d0 = frameLayout2;
        int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(themedColor, org.telegram.ui.ActionBar.m6.w(themedColor2, getThemedColor(i12)), 16, 16);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i11, i12);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(b02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, b02, M, p10, resourceProvider);
        this.f43446c0.addView(this.f43447d0, c8.ha.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 12.0f));
        ImageView imageView = new ImageView(context);
        float N = org.telegram.messenger.g0.N(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{N, N, N, N, N, N, N, N}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232836);
        this.f43447d0.addView(imageView, c8.ha.d(28, 28.0f, 19, 14.0f, 11.0f, 16.0f, 11.0f));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.f28131q7, this.resourceProvider);
        jg.g.v(textView4, 1, 16.0f, null, 2131743044);
        this.f43447d0.addView(textView4, c8.ha.d(-1, -2.0f, 19, 58.0f, 0.0f, 32.0f, 0.0f));
        this.f43447d0.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f42585b;

            {
                this.f42585b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f42585b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        return;
                    case 1:
                        z5.f0(this.f42585b);
                        return;
                    case 2:
                        z5.i0(this.f42585b);
                        return;
                    case 3:
                        this.f42585b.L0();
                        return;
                    default:
                        z5.d0(this.f42585b);
                        return;
                }
            }
        });
        c8.ka.b(this.f43447d0, 0.02f, 1.2f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f43474y = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f43474y.setClipToPadding(false);
        this.actionBar.addView(this.f43474y, c8.ha.d(-1, 56.0f, 87, 64.0f, 0.0f, 96.0f, 0.0f));
        View view = new View(context);
        this.D = view;
        this.f43474y.addView(view, c8.ha.e(1, 1, 19));
        this.F = false;
        this.G.setEmpty();
        this.I.reset();
        bi.x5 x5Var = new bi.x5(this, context);
        this.E = x5Var;
        x5Var.setClipChildren(false);
        this.E.setClipToPadding(false);
        n5 n5Var = new n5(this, context);
        this.f43448e = n5Var;
        n5Var.setDiamondOnCard(true);
        this.f43448e.setCardOnClickListener(new View.OnClickListener(this) {
            public final z5 f42585b;

            {
                this.f42585b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f42585b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        return;
                    case 1:
                        z5.f0(this.f42585b);
                        return;
                    case 2:
                        z5.i0(this.f42585b);
                        return;
                    case 3:
                        this.f42585b.L0();
                        return;
                    default:
                        z5.d0(this.f42585b);
                        return;
                }
            }
        });
        this.f36518a.D2.f36368b.add(this.f43472x);
        k5 k5Var2 = new k5(this, context, 1);
        this.f43450f = k5Var2;
        k5Var2.setImportantForAccessibility(2);
        o5 o5Var = new o5(this, context);
        this.f43458n = o5Var;
        o5Var.setClipChildren(false);
        this.f43458n.setClipToPadding(false);
        this.f43458n.addView(this.f43448e, c8.ha.c(-2.0f, -1));
        ra0Var.addView(this.f43458n, c8.ha.c(-1.0f, -1));
        this.f36518a.setClipChildren(false);
        this.f36518a.setClipToPadding(false);
        this.f43466s0 = this.f43448e.getBalanceLayout();
        this.f43467t0 = this.f43448e.getBalanceView();
        this.f43468u0 = this.f43448e.getUsdBalanceView();
        this.f43448e.setCardHolder(t10.p(getUserConfig().f()).toUpperCase());
        this.A0 = 0.0f;
        e61 e61Var = new e61(23, context, this);
        this.f43476z0 = e61Var;
        e61Var.setOrientation(0);
        this.f43476z0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.B0 = dVar;
        dVar.setText(id.M0(2131743204, null));
        this.f43476z0.addView(this.B0, c8.ha.m(1.0f, 0, 48, 0, 4, 0));
        this.B0.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f42585b;

            {
                this.f42585b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f42585b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        return;
                    case 1:
                        z5.f0(this.f42585b);
                        return;
                    case 2:
                        z5.i0(this.f42585b);
                        return;
                    case 3:
                        this.f42585b.L0();
                        return;
                    default:
                        z5.d0(this.f42585b);
                        return;
                }
            }
        });
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.C0 = dVar2;
        dVar2.setText(id.M0(2131743022, null));
        this.C0.setEnabled(l0.x(this.currentAccount).e());
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f42585b;

            {
                this.f42585b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f42585b;
                        z5Var.getClass();
                        z5Var.presentFragment(new cb1(6, null));
                        return;
                    case 1:
                        z5.f0(this.f42585b);
                        return;
                    case 2:
                        z5.i0(this.f42585b);
                        return;
                    case 3:
                        this.f42585b.L0();
                        return;
                    default:
                        z5.d0(this.f42585b);
                        return;
                }
            }
        });
        this.f43476z0.addView(this.C0, c8.ha.m(1.0f, 0, 48, 4, 0, 0));
        W0(this.f43448e.getStickerStyle());
        this.D0 = l0.x(this.currentAccount).B();
        this.f36518a.setDescendantFocusability(131072);
        d8 d8Var2 = new d8(this, this.f43448e, new m4.d0(this, ra0Var, false), null);
        this.f43455j0 = d8Var2;
        ra0Var.addView(d8Var2, c8.ha.c(-1.0f, -1));
        this.f43456k0 = "";
        bi.t tVar = new bi.t(context, 9);
        this.f43459n0 = tVar;
        tVar.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(i7, this.f43459n0, getResourceProvider());
        fi.g1 g1Var = new fi.g1(this, context, this.resourceProvider, 9);
        this.f43461p0 = g1Var;
        g1Var.setAllowDisallowInterceptTouch(false);
        this.f43461p0.setAdapter(new bi.g5(9, context, this));
        u61 n10 = this.f43461p0.n(-2, true);
        this.f43452g0 = n10;
        n10.g(i10, org.telegram.ui.ActionBar.m6.G6, i10, i12, i11);
        org.telegram.ui.ActionBar.t6.B(this.f43452g0, org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(20.0f), getThemedColor(i11)), org.telegram.ui.ActionBar.t6.M(i11), getResourceProvider());
        this.f43453h0 = new FrameLayout(context);
        u8 u8Var = new u8(context, this.f43452g0, this.resourceProvider, new m4(this, 0), new m4(this, 1), new m4(this, 2));
        this.f43454i0 = u8Var;
        this.f43453h0.addView(u8Var, c8.ha.d(-1, 40.0f, 48, 16.0f, 0.0f, 16.0f, 0.0f));
        this.f43461p0.setPosition(this.f43449e0);
        a1();
        this.f43459n0.addView(this.f43453h0, c8.ha.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f43459n0.addView(this.f43461p0, c8.ha.l(1.0f, -1, 0));
        M0(this.f43451f0);
        d0 d0Var2 = this.E0;
        if (d0Var2 != null) {
            this.f43455j0.Y(d0Var2);
        }
        this.f36518a.j(new ti(this, 21));
        m41 m41Var = this.f36518a.f37496f3;
        m41Var.f35845r = false;
        m41Var.O(false);
        v5 v5Var2 = new v5(this);
        this.f43462q0 = v5Var2;
        v5Var2.b(this.f36518a);
        S0();
        this.D0.h();
        this.actionBar.post(new f4(this, 10));
        this.f36518a.post(new f4(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        m41 m41Var;
        if (i10 == this.currentAccount) {
            if (i7 == qs.f24975a4 && this.f43467t0 != null) {
                S0();
                Iterator it = this.P0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i7 == qs.f25118y3) {
                b1();
            } else if (i7 == qs.f25061q0) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.R0 = true;
                        this.S0 = ((TL_account.Password) obj).has_password;
                        fi.w3 w3Var2 = this.f36518a;
                        if (w3Var2 != null && (m41Var = w3Var2.f37496f3) != null) {
                            m41Var.O(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new d3.b(1), new d(this, 7));
            } else if (i7 == qs.f24981b4 && objArr.length > 0) {
                Object obj2 = objArr[0];
                k0 k0Var = this.D0;
                if (obj2 == k0Var && (w3Var = this.f36518a) != null && w3Var.f37496f3 != null) {
                    if (k0Var.f42698b.isEmpty()) {
                        k0 k0Var2 = this.D0;
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
    public final boolean onBackPressed(boolean z9) {
        ai.i0 i0Var = this.M0;
        if (i0Var != null) {
            if (z9) {
                i0Var.e();
            }
            return false;
        }
        u8 u8Var = this.f43454i0;
        if (u8Var != null && u8Var.f43243y) {
            if (z9) {
                u8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onBeginSlide() {
        v5 v5Var = this.f43462q0;
        if (v5Var != null) {
            v5Var.c();
        }
        fi.w3 w3Var = this.f36518a;
        if (w3Var != null) {
            w3Var.C0();
        }
        r41 y02 = y0();
        if (y02 != null) {
            y02.C0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        Context context = org.telegram.messenger.t0.f25570b;
        if (a6.f42107k0.compareAndSet(false, true)) {
            a6.f42108l0.postRunnable(new g4(context, 2));
        }
        getNotificationCenter().c(this, qs.f24975a4);
        getNotificationCenter().c(this, qs.f25118y3);
        getNotificationCenter().c(this, qs.f24981b4);
        getNotificationCenter().c(this, qs.f25061q0);
        l0 x10 = l0.x(this.currentAccount);
        if (x10.f42761o == null) {
            x10.f42761o = new d0(x10);
        }
        d0 d0Var = x10.f42761o;
        this.E0 = d0Var;
        f4 f4Var = this.G0;
        ArrayList arrayList = d0Var.d;
        if (!arrayList.contains(f4Var)) {
            arrayList.add(f4Var);
        }
        org.telegram.ui.Components.q2 q2Var = this.T0;
        if (q2Var != null) {
            q2Var.run();
        }
        int i7 = x10.D;
        x10.D = i7 + 1;
        HashSet hashSet = x10.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i7));
        if (isEmpty) {
            x10.S();
        }
        this.T0 = new org.telegram.ui.Components.q2(x10, i7, 28);
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
        d8 d8Var = this.f43455j0;
        if (d8Var != null) {
            d8Var.p();
        }
        n5 n5Var = this.f43448e;
        if (n5Var != null) {
            n5Var.setOnFrontContentPresented(null);
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
        Q0();
        v5 v5Var = this.f43462q0;
        if (v5Var != null) {
            v5Var.b(null);
        }
        getNotificationCenter().n(this, qs.f24975a4);
        getNotificationCenter().n(this, qs.f25118y3);
        getNotificationCenter().n(this, qs.f24981b4);
        getNotificationCenter().n(this, qs.f25061q0);
        org.telegram.messenger.g0.E2(this.E);
        k0 k0Var = this.D0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        org.telegram.ui.Components.q2 q2Var = this.T0;
        if (q2Var != null) {
            q2Var.run();
            this.T0 = null;
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f36518a.setPadding(0, 0, 0, i12);
        this.f36518a.setClipToPadding(false);
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
                L0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f27300a.T = org.telegram.messenger.g0.X2(id.M0(2131746503, null));
            alertDialog$Builder.k(id.M0(2131747300, null), new i4(this));
            alertDialog$Builder.h(id.M0(2131751772, null), null);
            int i10 = org.telegram.ui.ActionBar.m6.L5;
            alertDialog$Builder.m(2131624116, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
            alertDialog$Builder.n(i10, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.post(new f4(this, 10));
        }
        l0.x(this.currentAccount).E();
        if (this.E0 != null && l0.x(this.currentAccount).G()) {
            d0 d0Var = this.E0;
            if (!d0Var.f42276j) {
                d0Var.b();
                d0Var.f(true);
            }
        }
        S0();
        if (this.f36518a != null) {
            Y0(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f43467t0 != null && this.f43468u0 != null && this.f43448e != null) {
                V0(this.f43473x0);
            }
            n5 n5Var = this.f43448e;
            if (n5Var != null && this.B0 != null && this.C0 != null) {
                W0(n5Var.getStickerStyle());
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
            j5 j5Var = this.S;
            if (j5Var != null) {
                j5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0(boolean z9) {
        float f10;
        long j3;
        wq wqVar;
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
        U0();
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
            wqVar = new wq(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            wqVar = new wq(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(wqVar);
        this.J0.addUpdateListener(new l4(this, 1));
        this.J0.addListener(new u81(this, 6));
        this.J0.start();
    }

    public final FrameLayout u0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f));
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(getThemedColor(i7), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, h02, null, M, resourceProvider);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 0.0f, 42.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131230875);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28300z6, getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, c8.ha.e(-2, -2, 21));
        frameLayout.setOnClickListener(new h3(runnable, 3));
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
        spannableStringBuilder.append((CharSequence) l0.o(j3, false));
        spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.m6.Ci, getResourceProvider()), length2, spannableStringBuilder.length(), 33);
        return id.V(null, null, i7, spannableStringBuilder);
    }

    public final r41 y0() {
        View currentView;
        if (z0()) {
            fi.g1 g1Var = this.f43461p0;
            if (g1Var == null) {
                currentView = null;
            } else {
                currentView = g1Var.getCurrentView();
            }
            if (currentView instanceof r41) {
                return (r41) currentView;
            }
        }
        return null;
    }

    public final boolean z0() {
        bi.t tVar;
        if (!this.f43460o0 && (tVar = this.f43459n0) != null && tVar.isAttachedToWindow()) {
            ViewParent parent = this.f43459n0.getParent();
            fi.w3 w3Var = this.f36518a;
            if (parent == w3Var.f37495e3.m(w3Var.f37496f3.D.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
