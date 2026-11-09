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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.f10;
import org.telegram.ui.nk0;
import org.telegram.ui.wb1;
public final class m8 extends o41 implements ls {
    public final ArrayList f42817e = new ArrayList();
    public boolean f42818f;

    public static void d0(m8 m8Var, c20 c20Var, p0 p0Var, i0 i0Var) {
        if (i0Var == null) {
            c20Var.a("STORAGE_FAILED");
            return;
        }
        c20Var.a(null);
        ArrayList f10 = i0Var.f();
        Activity parentActivity = m8Var.getParentActivity();
        org.telegram.ui.ActionBar.g6 g6Var = m8Var.resourceProvider;
        boolean z9 = org.telegram.messenger.r2.f25212a;
        k0(parentActivity, f10, g6Var, new wb1(22, m8Var, p0Var));
    }

    public static void e0(m8 m8Var, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        vf.b h = u1Var.h(i7, true, true);
        h.d();
        int i10 = m8Var.currentAccount;
        i8 i8Var = new i8(m8Var, h, 0);
        l0 x10 = l0.x(i10);
        x10.m0(new f10(i10, i8Var, x10));
    }

    public static void f0(m8 m8Var, Boolean bool) {
        l0 x10 = l0.x(m8Var.currentAccount);
        if (bool.booleanValue()) {
            boolean z9 = org.telegram.messenger.r2.f25212a;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m8Var.getParentActivity(), m8Var.getResourceProvider());
        alertDialog$Builder.f27296a.R = id.M0(2131743030, null);
        alertDialog$Builder.k(id.M0(2131743151, null), new h8(m8Var, bool, x10, 0));
        alertDialog$Builder.h(id.M0(2131743092, null), new nk0(25, m8Var, bool));
        alertDialog$Builder.p();
    }

    public static void g0(m8 m8Var, c20 c20Var, i0 i0Var, String str) {
        if (str != null) {
            c20Var.a(str);
        } else if (i0Var == null) {
            c20Var.a("WORDS_NULL");
        } else {
            c20Var.a(null);
            k0(m8Var.getParentActivity(), i0Var.f(), m8Var.resourceProvider, null);
        }
    }

    public static LinearLayout i0(Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7, String str) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        f10.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(i7);
        f10.addView(imageView, c8.ha.t(28, 28, 16, 0, 0, 14, 0));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        textView.setText(org.telegram.messenger.g0.X2(str));
        f10.addView(textView, c8.ha.p(-1, -2, 1.0f, 16));
        return f10;
    }

    public static LinearLayout j0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
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
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
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
            org.telegram.ui.ActionBar.s6.U(f11, org.telegram.ui.ActionBar.l6.G6, g6Var);
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

    public static void k0(Activity activity, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var, wb1 wb1Var) {
        org.telegram.ui.ActionBar.v2 v2Var;
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, g6Var);
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
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.l6.G6, g6Var, null, 2131742955);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.l6.f28275z6, g6Var, null, 2131743037);
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
        LinearLayout j02 = j0(0, size, activity, arrayList, g6Var);
        LinearLayout j03 = j0(size, arrayList.size(), activity, arrayList, g6Var);
        linearLayout3.addView(j02, c8.ha.p(0, -2, 1.0f, 48));
        linearLayout3.addView(new View(activity), c8.ha.o(10, 0));
        linearLayout3.addView(j03, c8.ha.p(0, -2, 1.0f, 48));
        linearLayout2.addView(linearLayout3, c8.ha.r(-1, -2, 1));
        linearLayout.addView(linearLayout2, c8.ha.k(40.0f, 32.0f, 40.0f, 28.0f, -1, -2));
        e10.addView(linearLayout, c8.ha.o(-1, -2));
        fi.d dVar = new fi.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        e10.addView(dVar, c8.ha.d(-1, 48.0f, 1, 14.0f, 14.0f, 14.0f, 14.0f));
        h.N = e10;
        h.N();
        if (wb1Var != null) {
            int i7 = org.telegram.ui.ActionBar.l6.f28106q7;
            dVar.setColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
            if (dVar.getBackground() != null) {
                Drawable background = dVar.getBackground();
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
                dVar.setBackground(background);
                org.telegram.ui.ActionBar.s6.j(dVar, background, M, null, g6Var);
            }
            dVar.setText(id.M0(2131743142, null));
            v2Var = h;
            dVar.setOnClickListener(new g8(activity, g6Var, wb1Var, h, 0));
        } else {
            v2Var = h;
            dVar.setText(id.M0(2131743128, null));
            dVar.setOnClickListener(new c4(v2Var, 1));
        }
        v2Var.show();
    }

    public static void l0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, c20 c20Var) {
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(activity, false, 1, g6Var);
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        e10.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 1);
        e11.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), 0);
        f01 f01Var = new f01(activity, g6Var);
        f01Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(4.0f));
        f01Var.setEmojiSize(100);
        org.telegram.ui.Components.l9 l9Var = f01Var.f33541b;
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        e11.addView(f01Var, c8.ha.r(-1, -2, 7));
        String M0 = id.M0(2131743034, null);
        x70 x70Var = f01Var.f33542c;
        CharSequence m10 = org.telegram.messenger.i6.m(M0, x70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String M02 = id.M0(2131743035, null);
        x70 x70Var2 = f01Var.d;
        f01Var.a(m10, org.telegram.messenger.i6.m(M02, x70Var2.getPaint().getFontMetricsInt(), false, null, 0));
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
        qs.i(x70Var);
        qs.i(x70Var2);
        e11.addView(i0(activity, g6Var, 2131232828, id.M0(2131743033, null)));
        e11.addView(i0(activity, g6Var, 2131232832, id.M0(2131743038, null)));
        e11.addView(i0(activity, g6Var, 2131232830, id.M0(2131743032, null)));
        e10.addView(e11, c8.ha.o(-1, -2));
        fi.d dVar = new fi.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(id.M0(2131743036, null), false, true);
        e10.addView(dVar, c8.ha.d(-1, 48.0f, 7, 14.0f, 14.0f, 14.0f, 0.0f));
        h.N = e10;
        h.N();
        dVar.setOnClickListener(new g8(dVar, c20Var, h, g6Var, 1));
        h.show();
    }

    @Override
    public final void Z(java.util.ArrayList r10, org.telegram.ui.Components.m41 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m8.Z(java.util.ArrayList, org.telegram.ui.Components.m41):void");
    }

    @Override
    public final CharSequence a0() {
        return id.M0(2131743080, null);
    }

    @Override
    public final void b0(y31 y31Var, View view) {
        int i7 = y31Var.d;
        if (i7 == 1) {
            l0 x10 = l0.x(this.currentAccount);
            if (x10.f()) {
                d8 d8Var = new d8();
                d8Var.f42381s = x10.y();
                presentFragment(d8Var);
                return;
            }
            l0(getParentActivity(), getResourceProvider(), new e8(this, 0));
        } else if (i7 == 3) {
            l0 x11 = l0.x(this.currentAccount);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            u1Var.r(500L);
            j jVar = new j(this, u1Var, x11);
            l0.H("emulate disable backup: when ready");
            wb1 wb1Var = new wb1(4, x11, jVar);
            if (x11.G() && x11.f42684f != null) {
                wb1Var.run();
            } else {
                x11.f42699w.add(new WeakReference(wb1Var));
            }
        } else if (i7 == 2) {
            l0 x12 = l0.x(this.currentAccount);
            e8 e8Var = new e8(this, 1);
            l0.H("enable backup: when ready...");
            x12.m0(new wb1(2, x12, e8Var));
        } else if (i7 == 4) {
            Activity parentActivity = getParentActivity();
            String M0 = id.M0(2131743138, null);
            String M02 = id.M0(2131743139, null);
            boolean z9 = org.telegram.messenger.r2.f25212a;
            org.telegram.ui.ActionBar.u1 f02 = org.telegram.ui.Components.v4.f0(parentActivity, M0, M02, null, id.M0(2131743141, null), new e8(this, 2), getResourceProvider(), false);
            TextView textView = (TextView) f02.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, f02.f28564i1);
            }
        } else if (y31Var.H(k8.class)) {
            String charSequence = y31Var.f40568l.toString();
            l0(getParentActivity(), getResourceProvider(), new p(this, l0.x(this.currentAccount), charSequence, new p0(this.currentAccount, getParentActivity(), charSequence)));
        }
    }

    @Override
    public final boolean c0(y31 y31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.f36649a);
        this.f36649a.r1();
        this.f36649a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.w3 w3Var;
        if (i7 == qs.f24971a4 && (w3Var = this.f36649a) != null) {
            w3Var.f37556f3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.f24971a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.f24971a4);
        this.f42818f = true;
        ArrayList arrayList = this.f42817e;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((g0) obj).close();
        }
        arrayList.clear();
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f36649a.setPadding(0, 0, 0, i12);
        this.f36649a.setClipToPadding(false);
    }
}
