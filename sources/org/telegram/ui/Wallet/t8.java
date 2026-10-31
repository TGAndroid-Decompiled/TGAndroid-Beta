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
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r51;
import org.telegram.ui.ep0;
import org.telegram.ui.t11;
public final class t8 extends r51 implements us {
    public final ArrayList e = new ArrayList();
    public boolean f35251f;

    public static void c0(t8 t8Var, q20 q20Var, p0 p0Var, h0 h0Var) {
        if (h0Var == null) {
            q20Var.a("STORAGE_FAILED");
            return;
        }
        q20Var.a(null);
        ArrayList f7 = h0Var.f();
        Activity parentActivity = t8Var.getParentActivity();
        org.telegram.ui.ActionBar.p6 p6Var = t8Var.resourceProvider;
        boolean z10 = org.telegram.messenger.v2.f18448a;
        j0(parentActivity, f7, p6Var, new k3(14, t8Var, p0Var));
    }

    public static void d0(t8 t8Var, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        gf.e h = x1Var.h(i10, true, true);
        h.d();
        int i11 = t8Var.currentAccount;
        p8 p8Var = new p8(t8Var, h, 0);
        k0 x10 = k0.x(i11);
        x10.m0(new x0(i11, p8Var, x10));
    }

    public static void e0(t8 t8Var, Boolean bool) {
        k0 x10 = k0.x(t8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z10 = org.telegram.messenger.v2.f18448a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t8Var.getParentActivity(), t8Var.getResourceProvider());
        alertDialog$Builder.f20134a.R = cd.L0(2131743056, null);
        alertDialog$Builder.k(cd.L0(2131743177, null), new o8(t8Var, bool, x10, 0));
        alertDialog$Builder.h(cd.L0(2131743118, null), new ep0(24, t8Var, bool));
        alertDialog$Builder.p();
    }

    public static void f0(t8 t8Var, q20 q20Var, h0 h0Var, String str) {
        if (str != null) {
            q20Var.a(str);
        } else if (h0Var == null) {
            q20Var.a("WORDS_NULL");
        } else {
            q20Var.a(null);
            j0(t8Var.getParentActivity(), h0Var.f(), t8Var.resourceProvider, null);
        }
    }

    public static LinearLayout h0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, String str) {
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

    public static LinearLayout i0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
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
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
            StringBuilder sb2 = new StringBuilder();
            int i14 = i12 + 1;
            sb2.append(i14);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f10 = z20.f(linearLayout, textView, w7.b6.t(26, -2, 8388613, 0, 0, 6, 0), context);
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

    public static void j0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var, k3 k3Var) {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.z2 h = z20.h(activity, false, 1, p6Var);
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, 0);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        ui.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        z20.p(textView, org.telegram.ui.ActionBar.t6.G6, p6Var, null, 2131742981);
        linearLayout.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        z20.p(textView2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var, null, 2131743063);
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
        LinearLayout i02 = i0(0, size, activity, arrayList, p6Var);
        LinearLayout i03 = i0(size, arrayList.size(), activity, arrayList, p6Var);
        linearLayout3.addView(i02, w7.b6.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), w7.b6.o(10, 0));
        linearLayout3.addView(i03, w7.b6.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, w7.b6.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, w7.b6.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e.addView(linearLayout, w7.b6.o(-1, -2));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        e.addView(dVar, w7.b6.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        h.N = e;
        h.O();
        if (k3Var != null) {
            int i10 = org.telegram.ui.ActionBar.t6.f21170q7;
            dVar.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(dVar, background, N, null, p6Var);
            }
            dVar.setText(cd.L0(2131743168, null));
            z2Var = h;
            dVar.setOnClickListener(new n8(activity, p6Var, k3Var, h, 0));
        } else {
            z2Var = h;
            dVar.setText(cd.L0(2131743154, null));
            dVar.setOnClickListener(new e4(z2Var, 1));
        }
        z2Var.show();
    }

    public static void k0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, q20 q20Var) {
        org.telegram.ui.ActionBar.z2 h = z20.h(activity, false, 1, p6Var);
        LinearLayout e = org.telegram.messenger.m5.e(activity, 1);
        e.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        LinearLayout e7 = org.telegram.messenger.m5.e(activity, 1);
        e7.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), 0);
        j11 j11Var = new j11(activity, p6Var);
        j11Var.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(4.0f));
        j11Var.setEmojiSize(100);
        org.telegram.ui.Components.g9 g9Var = j11Var.f27194b;
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        ui.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        e7.addView(j11Var, w7.b6.r(-1, -2, 7));
        String L0 = cd.L0(2131743060, null);
        p80 p80Var = j11Var.f27195c;
        CharSequence m10 = org.telegram.messenger.k6.m(L0, p80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String L02 = cd.L0(2131743061, null);
        p80 p80Var2 = j11Var.d;
        j11Var.a(m10, org.telegram.messenger.k6.m(L02, p80Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        zs.i(p80Var);
        zs.i(p80Var2);
        e7.addView(h0(activity, p6Var, 2131232826, cd.L0(2131743059, null)));
        e7.addView(h0(activity, p6Var, 2131232830, cd.L0(2131743064, null)));
        e7.addView(h0(activity, p6Var, 2131232828, cd.L0(2131743058, null)));
        e.addView(e7, w7.b6.o(-1, -2));
        vh.d dVar = new vh.d(activity, p6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(cd.L0(2131743062, null), false, true);
        e.addView(dVar, w7.b6.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h.N = e;
        h.O();
        dVar.setOnClickListener(new n8(dVar, q20Var, h, p6Var, 1));
        h.show();
    }

    @Override
    public final void Y(java.util.ArrayList r10, org.telegram.ui.Components.p51 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.t8.Y(java.util.ArrayList, org.telegram.ui.Components.p51):void");
    }

    @Override
    public final CharSequence Z() {
        return cd.L0(2131743106, null);
    }

    @Override
    public final void a0(a51 a51Var, View view) {
        int i10 = a51Var.d;
        if (i10 == 1) {
            k0 x10 = k0.x(this.currentAccount);
            if (x10.f()) {
                k8 k8Var = new k8();
                k8Var.f34822s = x10.y();
                presentFragment(k8Var);
                return;
            }
            k0(getParentActivity(), getResourceProvider(), new l8(this, 0));
        } else if (i10 == 3) {
            k0 x11 = k0.x(this.currentAccount);
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            x1Var.r(500L);
            j jVar = new j(this, x1Var, x11);
            k0.H("emulate disable backup: when ready");
            t11 t11Var = new t11(26, x11, jVar);
            if (x11.G() && x11.f34779f != null) {
                t11Var.run();
            } else {
                x11.f34794w.add(new WeakReference(t11Var));
            }
        } else if (i10 == 2) {
            k0 x12 = k0.x(this.currentAccount);
            l8 l8Var = new l8(this, 1);
            k0.H("enable backup: when ready...");
            x12.m0(new t11(24, x12, l8Var));
        } else if (i10 == 4) {
            Activity parentActivity = getParentActivity();
            String L0 = cd.L0(2131743164, null);
            String L02 = cd.L0(2131743165, null);
            boolean z10 = org.telegram.messenger.v2.f18448a;
            org.telegram.ui.ActionBar.x1 h02 = org.telegram.ui.Components.s4.h0(parentActivity, L0, L02, null, cd.L0(2131743167, null), new l8(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) h02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, h02.f21493k1);
            }
        } else if (a51Var.H(r8.class)) {
            String charSequence = a51Var.f24292l.toString();
            k0(getParentActivity(), getResourceProvider(), new p(this, k0.x(this.currentAccount), charSequence, new p0(this.currentAccount, getParentActivity(), charSequence)));
        }
    }

    @Override
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f29837a);
        this.f29837a.r1();
        this.f29837a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ii iiVar;
        if (i10 == zs.f19582a4 && (iiVar = this.f29837a) != null) {
            iiVar.f30819f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.f19582a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.f19582a4);
        this.f35251f = true;
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
        this.f29837a.setPadding(0, 0, 0, i13);
        this.f29837a.setClipToPadding(false);
    }
}
