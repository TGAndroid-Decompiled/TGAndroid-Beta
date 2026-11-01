package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class j30 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final String f27255a;
    public final String f27256b;
    public final String f27257c;
    public final th.r4 d;
    public org.telegram.ui.Cells.a5 e;
    public org.telegram.ui.ik f27258f;
    public FrameLayout h;
    public g30 f27259n;
    public zf.a1 f27260r;
    public FrameLayout f27261s;
    public TextView f27262w;
    public float f27263x;
    public ValueAnimator f27264y;

    public j30(String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null);
        setResourceProvider(p6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f27256b = trim.substring(0, indexOf);
            this.f27257c = trim.substring(indexOf + 1);
        } else {
            this.f27256b = trim;
            this.f27257c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27256b);
        if (!TextUtils.isEmpty(this.f27257c)) {
            str2 = "@" + this.f27257c;
        }
        sb2.append(str2);
        this.f27255a = sb2.toString();
        this.d = new th.r4(this.currentAccount, this.f27257c, this.f27256b);
    }

    public final int Z() {
        int i10;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
    }

    public final void a0(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.D = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            g30 g30Var = this.f27259n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            g30Var.setScaleX(f10);
            g30 g30Var2 = this.f27259n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            g30Var2.setScaleY(f11);
            FrameLayout frameLayout = this.h;
            if (z10) {
                f12 = 1.0f;
            }
            frameLayout.setAlpha(f12);
            FrameLayout frameLayout2 = this.h;
            if (!z10) {
                i10 = 8;
            }
            frameLayout2.setVisibility(i10);
            org.telegram.ui.ik ikVar = this.f27258f;
            if (ikVar != null && (vnVar = ikVar.f43128a) != null && (b1Var = vnVar.Z3) != null) {
                b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, this.E));
                this.f27258f.f43128a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, this.E));
            }
        } else if (this.D == z10) {
        } else {
            this.D = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new h30(this, 1));
            this.F.addListener(new i30(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(gr.h);
            this.F.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f27260r.animate().cancel();
        ValueAnimator valueAnimator = this.f27264y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            zf.a1 a1Var = this.f27260r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a1Var.setVisibility(i10);
            zf.a1 a1Var2 = this.f27260r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -org.telegram.messenger.i0.L(48.0f);
            }
            a1Var2.setTranslationY(f10);
            org.telegram.ui.Cells.a5 a5Var = this.e;
            if (z10) {
                f11 = org.telegram.messenger.i0.L(48.0f);
            }
            a5Var.setTranslationY(f11);
            org.telegram.ui.Cells.a5 a5Var2 = this.e;
            if (z10) {
                i11 = org.telegram.messenger.i0.L(48.0f);
            } else {
                i11 = 0;
            }
            a5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f27260r.setVisibility(0);
        ViewPropertyAnimator animate = this.f27260r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -org.telegram.messenger.i0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new k2.v(15, this, z10)).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        float f12 = this.f27263x;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f27264y = ofFloat;
        ofFloat.addUpdateListener(new h30(this, 0));
        this.f27264y.addListener(new i30(this, z10, 0));
        this.f27264y.setDuration(320L);
        this.f27264y.setInterpolator(grVar);
        this.f27264y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        String str = this.f27255a;
        i5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 19);
        this.e = a5Var;
        a5Var.setClipChildren(false);
        frameLayout.addView(this.e, w7.b6.e(-1, -1, 119));
        org.telegram.messenger.i0.A3(this.e, 0, Z(), 0, 0);
        org.telegram.messenger.pa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(context, getParentLayout(), bundle, 1);
        ikVar.h = false;
        this.f27258f = ikVar;
        this.e.addView(ikVar, w7.b6.e(-1, -1, 119));
        g30 g30Var = new g30(this, context, new st0(null), this, new Object(), this.resourceProvider);
        this.f27259n = g30Var;
        if (g30Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.a7.t(this.f27259n.getSearchOptionsItem(), org.telegram.ui.ActionBar.t6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f27259n.setPinnedToTop(true);
        this.f27259n.f24557t0.setTranslationY(0.0f);
        if (this.f27259n.getSearchOptionsItem() != null) {
            this.f27259n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        g30 g30Var2 = this.f27259n;
        th.r4 r4Var = this.d;
        g30Var2.W1 = r4Var;
        is0 is0Var = g30Var2.f24511e0;
        is0Var.f32635s = r4Var;
        is0Var.f();
        xt0 xt0Var = g30Var2.f24515f0;
        xt0Var.f32635s = r4Var;
        xt0Var.f();
        this.f27259n.j1(0, ei.b.c(org.telegram.messenger.i0.f16166m) + org.telegram.messenger.i0.L(48.0f) + Z(), org.telegram.messenger.i0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f27259n, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27261s = frameLayout3;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f27262w = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        this.f27262w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(this.f27262w, org.telegram.ui.ActionBar.t6.f21125nf, getResourceProvider());
        this.f27262w.setText(org.telegram.messenger.dd.G(r4Var.J, "FoundStories", new Object[0]));
        this.f27261s.addView(this.f27262w, w7.b6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, this.resourceProvider);
        this.f27261s.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.f16171p, 55));
        this.h.addView(this.f27261s, w7.b6.e(-1, 49, 87));
        this.e.addView(this.h, w7.b6.e(-1, -1, 119));
        zf.a1 a1Var = new zf.a1(context, this.resourceProvider);
        this.f27260r = a1Var;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(themedColor, getThemedColor(i11));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        a1Var.setBackground(i02);
        org.telegram.ui.ActionBar.a7.k(a1Var, i02, N, N2, resourceProvider);
        this.f27260r.setOnClickListener(new h0(this, 23));
        b0(this.f27260r.a(r4Var), false);
        this.f27260r.b(org.telegram.messenger.pa.a(this.currentAccount).d.f17414m, this.f27256b, this.f27257c);
        frameLayout.addView(this.f27260r, w7.b6.e(-1, 48, 55));
        org.telegram.messenger.i0.A3(this.f27260r, 0, Z(), 0, 0);
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f6605l = frameLayout;
        baseSimpleGlass.f6606m = null;
        baseSimpleGlass.g(frameLayout, i5Var2, resourceProvider2);
        baseSimpleGlass.f6607n = new ei.a(3, this, frameLayout);
        this.f27259n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.i5 i5Var3 = this.simpleActionBar;
        i5Var3.setBackground(baseSimpleGlass.a(i5Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ik ikVar;
        if (i10 == org.telegram.messenger.at.f14819x5) {
            Object obj = objArr[0];
            th.r4 r4Var = this.d;
            if (obj == r4Var) {
                zf.a1 a1Var = this.f27260r;
                if (a1Var != null) {
                    b0(a1Var.a(r4Var), true);
                }
                TextView textView = this.f27262w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.dd.G(r4Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i10 == org.telegram.messenger.at.I0 && (ikVar = this.f27258f) != null && ikVar.f43128a != null && ((Integer) objArr[0]).intValue() == this.f27258f.f43128a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            zf.a1 a1Var2 = this.f27260r;
            if (a1Var2 != null) {
                a1Var2.b(intValue, this.f27256b, this.f27257c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().O1().I;
        th.r4 r4Var = this.d;
        arrayList.add(r4Var);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14819x5);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.I0);
        r4Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().O1().I.remove(this.d);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14819x5);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
