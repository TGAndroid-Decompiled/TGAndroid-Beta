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
public final class c30 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f33908a;
    public final String f33909b;
    public final String f33910c;
    public final fi.b6 d;
    public bi.v2 f33911e;
    public org.telegram.ui.nj f33912f;
    public FrameLayout h;
    public z20 f33913n;
    public jg.k1 f33914r;
    public FrameLayout f33915s;
    public TextView f33916w;
    public float f33917x;
    public ValueAnimator f33918y;

    public c30(String str, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        setResourceProvider(i6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f33909b = trim.substring(0, indexOf);
            this.f33910c = trim.substring(indexOf + 1);
        } else {
            this.f33909b = trim;
            this.f33910c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33909b);
        if (!TextUtils.isEmpty(this.f33910c)) {
            str2 = "@" + this.f33910c;
        }
        sb2.append(str2);
        this.f33908a = sb2.toString();
        this.d = new fi.b6(this.currentAccount, this.f33910c, this.f33909b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public final void a0(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = 0;
        float f13 = 0.0f;
        if (!z11) {
            this.E = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F = f10;
            z20 z20Var = this.f33913n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            z20Var.setScaleX(f11);
            z20 z20Var2 = this.f33913n;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            z20Var2.setScaleY(f12);
            FrameLayout frameLayout = this.h;
            if (z10) {
                f13 = 1.0f;
            }
            frameLayout.setAlpha(f13);
            FrameLayout frameLayout2 = this.h;
            if (!z10) {
                i7 = 8;
            }
            frameLayout2.setVisibility(i7);
            org.telegram.ui.nj njVar = this.f33912f;
            if (njVar != null && (cnVar = njVar.f47191a) != null && (b1Var = cnVar.f46122a4) != null) {
                b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f33912f.f47191a.f46122a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
            }
        } else if (this.E == z10) {
        } else {
            this.E = z10;
            this.h.setVisibility(0);
            float f14 = this.F;
            if (z10) {
                f13 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new a30(this, 1));
            this.G.addListener(new b30(this, z10, 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(kr.h);
            this.G.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f33914r.animate().cancel();
        ValueAnimator valueAnimator = this.f33918y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            jg.k1 k1Var = this.f33914r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k1Var.setVisibility(i7);
            jg.k1 k1Var2 = this.f33914r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            k1Var2.setTranslationY(f11);
            bi.v2 v2Var = this.f33911e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            v2Var.setTranslationY(f12);
            bi.v2 v2Var2 = this.f33911e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            v2Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f33914r.setVisibility(0);
        ViewPropertyAnimator animate = this.f33914r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ch.k(26, this, z10)).setDuration(320L);
        kr krVar = kr.h;
        duration.setInterpolator(krVar).start();
        float f13 = this.f33917x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f33918y = ofFloat;
        ofFloat.addUpdateListener(new a30(this, 0));
        this.f33918y.addListener(new b30(this, z10, 0));
        this.f33918y.setDuration(320L);
        this.f33918y.setInterpolator(krVar);
        this.f33918y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        String str = this.f33908a;
        z4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.v2 v2Var = new bi.v2(context, 17);
        this.f33911e = v2Var;
        v2Var.setClipChildren(false);
        frameLayout.addView(this.f33911e, c8.na.e(-1, -1, 119));
        org.telegram.messenger.g0.z3(this.f33911e, 0, Z(), 0, 0);
        org.telegram.messenger.ma.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nj njVar = new org.telegram.ui.nj(context, getParentLayout(), bundle, 1);
        njVar.h = false;
        this.f33912f = njVar;
        this.f33911e.addView(njVar, c8.na.e(-1, -1, 119));
        z20 z20Var = new z20(this, context, new at0(null), this, new Object(), this.resourceProvider);
        this.f33913n = z20Var;
        if (z20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.u6.s(this.f33913n.getSearchOptionsItem(), org.telegram.ui.ActionBar.n6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f33913n.setPinnedToTop(true);
        this.f33913n.f36154u0.setTranslationY(0.0f);
        if (this.f33913n.getSearchOptionsItem() != null) {
            this.f33913n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        z20 z20Var2 = this.f33913n;
        fi.b6 b6Var = this.d;
        z20Var2.X1 = b6Var;
        rr0 rr0Var = z20Var2.f36110f0;
        rr0Var.f35199s = b6Var;
        rr0Var.f();
        ft0 ft0Var = z20Var2.f36113g0;
        ft0Var.f35199s = b6Var;
        ft0Var.f();
        this.f33913n.n1(0, ri.a.c(org.telegram.messenger.g0.f24220m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f33913n, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33915s = frameLayout3;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f33916w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f33916w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(this.f33916w, org.telegram.ui.ActionBar.n6.qf, getResourceProvider());
        this.f33916w.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
        this.f33915s.addView(this.f33916w, c8.na.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, this.resourceProvider);
        this.f33915s.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24225p, 55));
        this.h.addView(this.f33915s, c8.na.e(-1, 49, 87));
        this.f33911e.addView(this.h, c8.na.e(-1, -1, 119));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.f33914r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.u6.j(k1Var, i02, M, M2, resourceProvider);
        this.f33914r.setOnClickListener(new n0(this, 26));
        b0(this.f33914r.a(b6Var), false);
        this.f33914r.b(org.telegram.messenger.ma.a(this.currentAccount).d.f25468m, this.f33909b, this.f33910c);
        frameLayout.addView(this.f33914r, c8.na.e(-1, 48, 55));
        org.telegram.messenger.g0.z3(this.f33914r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f56747m = frameLayout;
        baseSimpleGlass.f56748n = null;
        baseSimpleGlass.g(frameLayout, z4Var2, resourceProvider2);
        baseSimpleGlass.f56749o = new di.f(4, this, frameLayout);
        this.f33913n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.z4 z4Var3 = this.simpleActionBar;
        z4Var3.setBackground(baseSimpleGlass.a(z4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.nj njVar;
        if (i7 == org.telegram.messenger.ks.A5) {
            Object obj = objArr[0];
            fi.b6 b6Var = this.d;
            if (obj == b6Var) {
                jg.k1 k1Var = this.f33914r;
                if (k1Var != null) {
                    b0(k1Var.a(b6Var), true);
                }
                TextView textView = this.f33916w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.ks.I0 && (njVar = this.f33912f) != null && njVar.f47191a != null && ((Integer) objArr[0]).intValue() == this.f33912f.f47191a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var2 = this.f33914r;
            if (k1Var2 != null) {
                k1Var2.b(intValue, this.f33909b, this.f33910c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().R1().I;
        fi.b6 b6Var = this.d;
        arrayList.add(b6Var);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.A5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.I0);
        b6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().R1().I.remove(this.d);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.A5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
