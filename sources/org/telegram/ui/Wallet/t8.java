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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s51;
import org.telegram.ui.cp0;
import org.telegram.ui.y01;
public final class t8 extends s51 implements vs {
    public final ArrayList e = new ArrayList();
    public boolean f35253f;

    public static void d0(t8 t8Var, r20 r20Var, p0 p0Var, h0 h0Var) {
        if (h0Var == null) {
            r20Var.a("STORAGE_FAILED");
            return;
        }
        r20Var.a(null);
        ArrayList f7 = h0Var.f();
        Activity parentActivity = t8Var.getParentActivity();
        org.telegram.ui.ActionBar.p6 p6Var = t8Var.resourceProvider;
        boolean z10 = org.telegram.messenger.v2.f18578a;
        k0(parentActivity, f7, p6Var, new m2(15, t8Var, p0Var));
    }

    public static void e0(t8 t8Var, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        gf.e h = x1Var.h(i10, true, true);
        h.d();
        int i11 = t8Var.currentAccount;
        p8 p8Var = new p8(t8Var, h, 0);
        k0 x10 = k0.x(i11);
        x10.m0(new x0(i11, p8Var, x10));
    }

    public static void f0(t8 t8Var, Boolean bool) {
        k0 x10 = k0.x(t8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.v2.f18578a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
        alertDialog$Builder.f20135a.R = dd.L0(2131743056, null);
        alertDialog$Builder.k(dd.L0(2131743177, null), new o8(t8Var, bool, x10, 0));
        alertDialog$Builder.h(dd.L0(2131743118, null), new cp0(24, t8Var, bool));
        alertDialog$Builder.p();
    }

    public static void g0(t8 t8Var, r20 r20Var, h0 h0Var, String str) {
        if (str != null) {
            r20Var.a(str);
        } else if (h0Var == null) {
            r20Var.a("WORDS_NULL");
        } else {
            r20Var.a(null);
            k0(t8Var.getParentActivity(), h0Var.f(), t8Var.resourceProvider, null);
        }
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, String str) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        f7.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i10);
        f7.addView(imageView, w7.b6.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setText(org.telegram.messenger.i0.W2(str));
        f7.addView(textView, w7.b6.p(-1, -2, 1.0f, 16));
        return f7;
    }

    public static LinearLayout j0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        int i12 = i10;
        while (i12 < i11) {
            LinearLayout linearLayout = new LinearLayout(context);
            int i13 = 0;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            textView.setGravity(8388613);
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f10 = a30.f(linearLayout, textView, w7.b6.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f10.setTextSize(1, 15.0f);
            f10.setTypeface(org.telegram.messenger.i0.o());
            f10.setIncludeFontPadding(false);
            f10.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.G6, p6Var);
            f10.setText((CharSequence) arrayList.get(i12));
            linearLayout.addView(f10, w7.b6.o(-2, -2));
            if (i12 != i10) {
                i13 = 10;
            }
            f7.addView(linearLayout, w7.b6.t(-2, -2, 8388611, 0, i13, 0, 0));
            i12 = i14;
        }
        return f7;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var, m2 m2Var) {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.z2 h = a30.h(activity, false, 1, p6Var);
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, 0);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        vi.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        a30.p(textView, org.telegram.ui.ActionBar.t6.G6, p6Var, null, 2131742981);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        a30.p(textView2, org.telegram.ui.ActionBar.t6.f21331z6, p6Var, null, 2131743063);
        textView2.setMaxWidth(org.telegram.messenger.i0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, w7.b6.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, p6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, p6Var);
        linearLayout3.addView(j02, w7.b6.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.b6.o(10, 0));
        linearLayout3.addView(j03, w7.b6.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.b6.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.b6.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e.addView(linearLayout, w7.b6.o(-1, -2));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        e.addView(dVar, w7.b6.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        h.N = e;
        h.O();
        if (m2Var != null) {
            int i10 = org.telegram.ui.ActionBar.t6.f21171q7;
            dVar.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(dVar, background, N, null, p6Var);
            }
            dVar.setText(dd.L0(2131743168, null));
            z2Var = h;
            dVar.setOnClickListener(new n8(activity, p6Var, m2Var, h, 0));
        } else {
            z2Var = h;
            dVar.setText(dd.L0(2131743154, null));
            dVar.setOnClickListener(new e4(z2Var, 1));
        }
        z2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, r20 r20Var) {
        org.telegram.ui.ActionBar.z2 h = a30.h(activity, false, 1, p6Var);
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        e.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        LinearLayout e7 = org.telegram.messenger.m5.e(activity, 1);
        e7.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), 0);
        k11 k11Var = new k11(activity, p6Var);
        k11Var.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(4.0f));
        k11Var.setEmojiSize(100);
        org.telegram.ui.Components.g9 g9Var = k11Var.f27694b;
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        vi.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        e7.addView(k11Var, w7.b6.r(-1, -2, 7));
        String L0 = dd.L0(2131743060, null);
        p80 p80Var = k11Var.f27695c;
        CharSequence m10 = org.telegram.messenger.k6.m(L0, p80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String L02 = dd.L0(2131743061, null);
        p80 p80Var2 = k11Var.d;
        k11Var.a(m10, org.telegram.messenger.k6.m(L02, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        at.i(p80Var);
        at.i(p80Var2);
        e7.addView(i0(activity, p6Var, 2131232826, dd.L0(2131743059, null)));
        e7.addView(i0(activity, p6Var, 2131232830, dd.L0(2131743064, null)));
        e7.addView(i0(activity, p6Var, 2131232828, dd.L0(2131743058, null)));
        e.addView(e7, w7.b6.o(-1, -2));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(dd.L0(2131743062, null), false, true);
        e.addView(dVar, w7.b6.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h.N = e;
        h.O();
        dVar.setOnClickListener(new n8(dVar, r20Var, h, p6Var, 1));
        h.show();
    }

    @Override
    public final void Z(java.util.ArrayList r10, org.telegram.ui.Components.q51 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t8.Z(java.util.ArrayList, org.telegram.ui.Components.q51):void");
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131743106, null);
    }

    @Override
    public final void b0(b51 b51Var, View view) {
        int i10 = b51Var.d;
        if (i10 == 1) {
            k0 x10 = k0.x(this.currentAccount);
            if (x10.f()) {
                k8 k8Var = new k8();
                k8Var.f34826s = x10.y();
                presentFragment(k8Var);
                return;
            }
            l0(getParentActivity(), getResourceProvider(), new l8(this, 0));
        } else if (i10 == 3) {
            k0 x11 = k0.x(this.currentAccount);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            x1Var.r(500L);
            j jVar = new j(this, x1Var, x11);
            k0.H("emulate disable backup: when ready");
            y01 y01Var = new y01(27, x11, jVar);
            if (x11.G() && x11.f34784f != null) {
                y01Var.run();
            } else {
                x11.f34799w.add(new WeakReference(y01Var));
            }
        } else if (i10 == 2) {
            k0 x12 = k0.x(this.currentAccount);
            l8 l8Var = new l8(this, 1);
            k0.H("enable backup: when ready...");
            x12.m0(new y01(25, x12, l8Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String L0 = dd.L0(2131743164, null);
            String L02 = dd.L0(2131743165, null);
            boolean z10 = org.telegram.messenger.v2.f18578a;
            org.telegram.ui.ActionBar.x1 h02 = org.telegram.ui.Components.s4.h0(parentActivity, L0, L02, null, dd.L0(2131743167, null), new l8(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, h02.f21494k1);
            }
        } else if (b51Var.H(r8.class)) {
            String charSequence = b51Var.f24643l.toString();
            l0(getParentActivity(), getResourceProvider(), new p(this, k0.x(this.currentAccount), charSequence, new p0(this.currentAccount, getParentActivity(), charSequence)));
        }
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f30217a);
        this.f30217a.r1();
        this.f30217a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        if (i10 == at.f14678a4 && (iiVar = this.f30217a) != null) {
            iiVar.f31183f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.f14678a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.f14678a4);
        this.f35253f = true;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((f0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30217a.setPadding(0, 0, 0, i13);
        this.f30217a.setClipToPadding(false);
    }
}
