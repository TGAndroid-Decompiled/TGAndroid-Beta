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
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.d10;
import org.telegram.ui.lk0;
public final class o8 extends n41 implements ls {
    public final ArrayList f42929e = new ArrayList();
    public boolean f42930f;

    public static void d0(o8 o8Var, c20 c20Var, r0 r0Var, k0 k0Var) {
        if (k0Var == null) {
            c20Var.a("STORAGE_FAILED");
            return;
        }
        c20Var.a(null);
        ArrayList f10 = k0Var.f();
        Activity parentActivity = o8Var.getParentActivity();
        org.telegram.ui.ActionBar.f6 f6Var = o8Var.resourceProvider;
        boolean z9 = org.telegram.messenger.r2.f25199a;
        k0(parentActivity, f10, f6Var, new n(21, o8Var, r0Var));
    }

    public static void e0(o8 o8Var, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.b h = u1Var.h(i7, true, true);
        h.d();
        int i10 = o8Var.currentAccount;
        k8 k8Var = new k8(o8Var, h, 0);
        n0 x10 = n0.x(i10);
        x10.m0(new d10(i10, k8Var, x10));
    }

    public static void f0(o8 o8Var, Boolean bool) {
        n0 x10 = n0.x(o8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z9 = org.telegram.messenger.r2.f25199a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, o8Var.getParentActivity(), o8Var.getResourceProvider());
        alertDialog$Builder.f27293a.R = hd.M0(2131743031, null);
        alertDialog$Builder.k(hd.M0(2131743152, null), new j8(o8Var, bool, x10, 0));
        alertDialog$Builder.h(hd.M0(2131743093, null), new lk0(25, o8Var, bool));
        alertDialog$Builder.p();
    }

    public static void g0(o8 o8Var, c20 c20Var, k0 k0Var, String str) {
        if (str != null) {
            c20Var.a(str);
        } else if (k0Var == null) {
            c20Var.a("WORDS_NULL");
        } else {
            c20Var.a(null);
            k0(o8Var.getParentActivity(), k0Var.f(), o8Var.resourceProvider, null);
        }
    }

    public static void h0(o8 o8Var, c20 c20Var) {
        n0.x(o8Var.currentAccount).z(new v1(2, o8Var, c20Var), true, false);
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, String str) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        f10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        f10.addView(imageView, c8.ha.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setText(org.telegram.messenger.g0.X2(str));
        f10.addView(textView, c8.ha.p(-1, -2, 1.0f, 16));
        return f10;
    }

    public static LinearLayout j0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
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
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28259z6, f6Var);
            StringBuilder sb2 = new StringBuilder();
            int i13 = i11 + 1;
            sb2.append(i13);
            sb2.append(".");
            textView.setText(sb2.toString());
            TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(26, -2, 8388613, 0, 0, 6, 0), context);
            f11.setTextSize(1, 15.0f);
            f11.setTypeface(org.telegram.messenger.g0.o());
            f11.setIncludeFontPadding(false);
            f11.setLineSpacing(0.0f, 1.0f);
            org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.G6, f6Var);
            f11.setText((CharSequence) arrayList.get(i11));
            linearLayout.addView(f11, c8.ha.o(-2, -2));
            if (i11 != i7) {
                i12 = 10;
            }
            f10.addView(linearLayout, c8.ha.t(-2, -2, 8388611, 0, i12, 0, 0));
            i11 = i13;
        }
        return f10;
    }

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var, n nVar) {
        org.telegram.ui.ActionBar.v2 v2Var;
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, f6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 17.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, f6Var, null, 2131742956);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.k6.f28259z6, f6Var, null, 2131743038);
        textView2.setMaxWidth(org.telegram.messenger.g0.L(330.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), 0);
        textView2.setGravity(1);
        linearLayout.addView(textView2, c8.ha.r(-2, -2, 1));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(1);
        int size = (arrayList.size() + 1) / 2;
        LinearLayout j02 = j0(0, size, activity, arrayList, f6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, f6Var);
        linearLayout3.addView(j02, c8.ha.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), c8.ha.o(10, 0));
        linearLayout3.addView(j03, c8.ha.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, c8.ha.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, c8.ha.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e10.addView(linearLayout, c8.ha.o(-1, -2));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        e10.addView(dVar, c8.ha.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        h.N = e10;
        h.N();
        if (nVar != null) {
            int i7 = org.telegram.ui.ActionBar.k6.f28090q7;
            dVar.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(dVar, background, N, null, f6Var);
            }
            dVar.setText(hd.M0(2131743143, null));
            v2Var = h;
            dVar.setOnClickListener(new i8(activity, f6Var, nVar, h, 0));
        } else {
            v2Var = h;
            dVar.setText(hd.M0(2131743129, null));
            dVar.setOnClickListener(new e4(v2Var, 1));
        }
        v2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, c20 c20Var) {
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, f6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 1);
        e11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        e01 e01Var = new e01(activity, f6Var);
        e01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        e01Var.setEmojiSize(100);
        org.telegram.ui.Components.l9 l9Var = e01Var.f33115b;
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        e11.addView(e01Var, c8.ha.r(-1, -2, 7));
        String M0 = hd.M0(2131743035, null);
        w70 w70Var = e01Var.f33116c;
        CharSequence m10 = org.telegram.messenger.i6.m(M0, w70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = hd.M0(2131743036, null);
        w70 w70Var2 = e01Var.d;
        e01Var.a(m10, org.telegram.messenger.i6.m(M02, w70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.f28259z6, f6Var);
        qs.i(w70Var);
        qs.i(w70Var2);
        e11.addView(i0(activity, f6Var, 2131232828, hd.M0(2131743034, null)));
        e11.addView(i0(activity, f6Var, 2131232832, hd.M0(2131743039, null)));
        e11.addView(i0(activity, f6Var, 2131232830, hd.M0(2131743033, null)));
        e10.addView(e11, c8.ha.o(-1, -2));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(hd.M0(2131743037, null), false, true);
        e10.addView(dVar, c8.ha.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h.N = e10;
        h.N();
        dVar.setOnClickListener(new i8(dVar, c20Var, h, f6Var, 1));
        h.show();
    }

    @Override
    public final void Z(java.util.ArrayList r10, org.telegram.ui.Components.l41 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o8.Z(java.util.ArrayList, org.telegram.ui.Components.l41):void");
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743081, null);
    }

    @Override
    public final void b0(x31 x31Var, View view) {
        int i7 = x31Var.d;
        if (i7 == 1) {
            n0 x10 = n0.x(this.currentAccount);
            if (x10.f()) {
                f8 f8Var = new f8();
                f8Var.f42495s = x10.y();
                presentFragment(f8Var);
                return;
            }
            l0(getParentActivity(), getResourceProvider(), new g8(this, 0));
        } else if (i7 == 3) {
            n0 x11 = n0.x(this.currentAccount);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            u1Var.r(500L);
            j jVar = new j(this, u1Var, x11);
            n0.H("emulate disable backup: when ready");
            n nVar = new n(3, x11, jVar);
            if (x11.G() && x11.f42796f != null) {
                nVar.run();
            } else {
                x11.f42811w.add(new WeakReference(nVar));
            }
        } else if (i7 == 2) {
            n0 x12 = n0.x(this.currentAccount);
            g8 g8Var = new g8(this, 1);
            n0.H("enable backup: when ready...");
            x12.m0(new n(1, x12, g8Var));
        } else if (i7 == 4) {
            Activity parentActivity = getParentActivity();
            String M0 = hd.M0(2131743139, null);
            String M02 = hd.M0(2131743140, null);
            boolean z9 = org.telegram.messenger.r2.f25199a;
            org.telegram.ui.ActionBar.u1 f02 = org.telegram.ui.Components.v4.f0(parentActivity, M0, M02, null, hd.M0(2131743142, null), new g8(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) f02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, f02.f28570i1);
            }
        } else if (x31Var.H(m8.class)) {
            String charSequence = x31Var.f40159l.toString();
            l0(getParentActivity(), getResourceProvider(), new q(this, n0.x(this.currentAccount), charSequence, new r0(this.currentAccount, getParentActivity(), charSequence)));
        }
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f36227a);
        this.f36227a.r1();
        this.f36227a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        if (i7 == qs.f24962a4 && (w3Var = this.f36227a) != null) {
            w3Var.f37160f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.f24962a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f24962a4);
        this.f42930f = true;
        ArrayList arrayList = this.f42929e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((i0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f36227a.setPadding(0, 0, 0, i12);
        this.f36227a.setClipToPadding(false);
    }
}
