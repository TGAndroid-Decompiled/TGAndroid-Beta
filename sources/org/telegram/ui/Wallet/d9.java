package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q01;
import org.telegram.ui.aj0;
import org.telegram.ui.mz0;
public final class d9 extends e51 implements fs {
    public final ArrayList f44091e = new ArrayList();
    public boolean f44092f;

    public static void d0(d9 d9Var, Boolean bool) {
        u0 D = u0.D(d9Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.s2.f26749a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d9Var.getParentActivity(), d9Var.getResourceProvider());
        alertDialog$Builder.f28774a.S = gd.N0(2131742766, null);
        alertDialog$Builder.k(gd.N0(2131742907, null), new x8(d9Var, bool, D, 0));
        alertDialog$Builder.h(gd.N0(2131742847, null), new aj0(27, d9Var, bool));
        alertDialog$Builder.p();
    }

    public static void e0(d9 d9Var) {
        n6.N0(d9Var.currentAccount, d9Var.getParentActivity(), d9Var.getResourceProvider());
    }

    public static void f0(d9 d9Var, x10 x10Var, z0 z0Var, r0 r0Var) {
        if (r0Var == null) {
            x10Var.a("STORAGE_FAILED");
            return;
        }
        x10Var.a(null);
        ArrayList f10 = r0Var.f();
        Activity parentActivity = d9Var.getParentActivity();
        org.telegram.ui.ActionBar.h6 h6Var = d9Var.resourceProvider;
        boolean z10 = org.telegram.messenger.s2.f26749a;
        k0(parentActivity, f10, h6Var, new u4(11, d9Var, z0Var));
    }

    public static void g0(d9 d9Var, x10 x10Var, r0 r0Var, String str) {
        if (str != null) {
            x10Var.a(str);
        } else if (r0Var == null) {
            x10Var.a("WORDS_NULL");
        } else {
            x10Var.a(null);
            k0(d9Var.getParentActivity(), r0Var.f(), d9Var.resourceProvider, null);
        }
    }

    public static void h0(d9 d9Var, x10 x10Var) {
        u0.D(d9Var.currentAccount).F(true, false, false, new e0(6, d9Var, x10Var));
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, String str) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        g10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        g10.addView(imageView, c8.ma.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setText(org.telegram.messenger.g0.W2(str));
        g10.addView(textView, c8.ma.p(-1, -2, 1.0f, 16));
        return g10;
    }

    public static LinearLayout j0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int i11 = i7;
        while (i11 < i10) {
            LinearLayout linearLayout = new LinearLayout(context);
            int i12 = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29789z6, h6Var);
            StringBuilder sb2 = new StringBuilder();
            int i13 = i11 + 1;
            sb2.append(i13);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f10 = n10.f(linearLayout, textView, c8.ma.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f10.setTextSize(1, 15.0f);
            f10.setTypeface(org.telegram.messenger.g0.o());
            f10.setIncludeFontPadding(false);
            f10.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.G6, h6Var);
            f10.setText((CharSequence) arrayList.get(i11));
            linearLayout.addView(f10, c8.ma.o(-2, -2));
            if (i11 != i7) {
                i12 = 10;
            }
            g10.addView(linearLayout, c8.ma.t(-2, -2, 8388611, 0, i12, 0, 0));
            i11 = i13;
        }
        return g10;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var, u4 u4Var) {
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.w2 j3 = n10.j(activity, false, 1, h6Var);
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        n10.r(textView, org.telegram.ui.ActionBar.m6.G6, h6Var, null, 2131742691);
        linearLayout.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        n10.r(textView2, org.telegram.ui.ActionBar.m6.f29789z6, h6Var, null, 2131742773);
        textView2.setMaxWidth(org.telegram.messenger.g0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, c8.ma.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, h6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, h6Var);
        linearLayout3.addView(j02, c8.ma.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), c8.ma.o(10, 0));
        linearLayout3.addView(j03, c8.ma.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, c8.ma.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, c8.ma.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        f10.addView(linearLayout, c8.ma.o(-1, -2));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        f10.addView(eVar, c8.ma.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        j3.O = f10;
        j3.O();
        if (u4Var != null) {
            int i7 = org.telegram.ui.ActionBar.m6.f29619q7;
            eVar.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            if (eVar.getBackground() != null) {
                Drawable background = eVar.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                eVar.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(eVar, background, M, null, h6Var);
            }
            eVar.setText(gd.N0(2131742898, null));
            w2Var = j3;
            eVar.setOnClickListener(new w8(activity, h6Var, u4Var, j3, 0));
        } else {
            w2Var = j3;
            eVar.setText(gd.N0(2131742884, null));
            eVar.setOnClickListener(new r4(w2Var, 1));
        }
        w2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, x10 x10Var) {
        org.telegram.ui.ActionBar.w2 j3 = n10.j(activity, false, 1, h6Var);
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 1);
        f10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout f11 = org.telegram.messenger.f3.f(activity, 1);
        f11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        q01 q01Var = new q01(activity, h6Var);
        q01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        q01Var.setEmojiSize(100);
        org.telegram.ui.Components.q9 q9Var = q01Var.f38745b;
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "📝", "100_100");
        f11.addView(q01Var, c8.ma.r(-1, -2, 7));
        String N0 = gd.N0(2131742770, null);
        m80 m80Var = q01Var.f38746c;
        CharSequence m10 = org.telegram.messenger.j6.m(N0, m80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String N02 = gd.N0(2131742771, null);
        m80 m80Var2 = q01Var.d;
        q01Var.a(m10, org.telegram.messenger.j6.m(N02, m80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.f29789z6, h6Var);
        ks.i(m80Var);
        ks.i(m80Var2);
        f11.addView(i0(activity, h6Var, 2131232831, gd.N0(2131742769, null)));
        f11.addView(i0(activity, h6Var, 2131232835, gd.N0(2131742774, null)));
        f11.addView(i0(activity, h6Var, 2131232833, gd.N0(2131742768, null)));
        f10.addView(f11, c8.ma.o(-1, -2));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.setRoundRadius(24);
        eVar.i(gd.N0(2131742772, null), false, true);
        f10.addView(eVar, c8.ma.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        j3.O = f10;
        j3.O();
        eVar.setOnClickListener(new w8(eVar, x10Var, j3, h6Var, 1));
        j3.show();
    }

    @Override
    public final void Z(java.util.ArrayList r10, org.telegram.ui.Components.c51 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d9.Z(java.util.ArrayList, org.telegram.ui.Components.c51):void");
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131742835, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        int i7 = o41Var.d;
        if (i7 == 1) {
            u0 D = u0.D(this.currentAccount);
            if (D.g()) {
                u8 u8Var = new u8();
                u8Var.f45185s = D.E();
                presentFragment(u8Var);
                return;
            }
            l0(getParentActivity(), getResourceProvider(), new v8(this, 0));
        } else if (i7 == 3) {
            u0 D2 = u0.D(this.currentAccount);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            t1Var.r(500L);
            j jVar = new j(this, t1Var, D2);
            u0.P("emulate disable backup: when ready");
            mz0 mz0Var = new mz0(26, D2, jVar);
            if (D2.N() && D2.f45127f != null) {
                mz0Var.run();
            } else {
                D2.f45143x.add(new WeakReference(mz0Var));
            }
        } else if (i7 == 2) {
            u0 D3 = u0.D(this.currentAccount);
            v8 v8Var = new v8(this, 1);
            u0.P("enable backup: when ready...");
            D3.x0(new mz0(24, D3, v8Var));
        } else if (i7 == 4) {
            Activity parentActivity = getParentActivity();
            String N0 = gd.N0(2131742894, null);
            String N02 = gd.N0(2131742895, null);
            boolean z10 = org.telegram.messenger.s2.f26749a;
            org.telegram.ui.ActionBar.t1 f02 = org.telegram.ui.Components.c5.f0(parentActivity, N0, N02, null, gd.N0(2131742897, null), new v8(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) f02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29619q7, f02.f30031j1);
            }
        } else if (o41Var.H(b9.class)) {
            String charSequence = o41Var.f38098m.toString();
            l0(getParentActivity(), getResourceProvider(), new r(this, u0.D(this.currentAccount), charSequence, new z0(this.currentAccount, getParentActivity(), charSequence)));
        }
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f34683a);
        this.f34683a.r1();
        this.f34683a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        bi.g6 g6Var;
        if (i7 == ks.f25130d4 && (g6Var = this.f34683a) != null) {
            g6Var.f35796g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.f25130d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.f25130d4);
        this.f44092f = true;
        ArrayList arrayList = this.f44091e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((o0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f34683a.setPadding(0, 0, 0, i12);
        this.f34683a.setClipToPadding(false);
    }
}
