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
public final class f30 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f35068a;
    public final String f35069b;
    public final String f35070c;
    public final fi.b6 d;
    public bi.t2 f35071e;
    public org.telegram.ui.nj f35072f;
    public FrameLayout h;
    public c30 f35073n;
    public jg.k1 f35074r;
    public FrameLayout f35075s;
    public TextView f35076w;
    public float f35077x;
    public ValueAnimator f35078y;

    public f30(String str, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        setResourceProvider(h6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f35069b = trim.substring(0, indexOf);
            this.f35070c = trim.substring(indexOf + 1);
        } else {
            this.f35069b = trim;
            this.f35070c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35069b);
        if (!TextUtils.isEmpty(this.f35070c)) {
            str2 = "@" + this.f35070c;
        }
        sb2.append(str2);
        this.f35068a = sb2.toString();
        this.d = new fi.b6(this.currentAccount, this.f35070c, this.f35069b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24140m;
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
            c30 c30Var = this.f35073n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            c30Var.setScaleX(f11);
            c30 c30Var2 = this.f35073n;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            c30Var2.setScaleY(f12);
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
            org.telegram.ui.nj njVar = this.f35072f;
            if (njVar != null && (cnVar = njVar.f47010a) != null && (b1Var = cnVar.f45950a4) != null) {
                b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f35072f.f47010a.f45950a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
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
            ofFloat.addUpdateListener(new d30(this, 1));
            this.G.addListener(new e30(this, z10, 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(nr.h);
            this.G.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f35074r.animate().cancel();
        ValueAnimator valueAnimator = this.f35078y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            jg.k1 k1Var = this.f35074r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k1Var.setVisibility(i7);
            jg.k1 k1Var2 = this.f35074r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            k1Var2.setTranslationY(f11);
            bi.t2 t2Var = this.f35071e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            t2Var.setTranslationY(f12);
            bi.t2 t2Var2 = this.f35071e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            t2Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f35074r.setVisibility(0);
        ViewPropertyAnimator animate = this.f35074r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ch.k(26, this, z10)).setDuration(320L);
        nr nrVar = nr.h;
        duration.setInterpolator(nrVar).start();
        float f13 = this.f35077x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f35078y = ofFloat;
        ofFloat.addUpdateListener(new d30(this, 0));
        this.f35078y.addListener(new e30(this, z10, 0));
        this.f35078y.setDuration(320L);
        this.f35078y.setInterpolator(nrVar);
        this.f35078y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        String str = this.f35068a;
        z4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.m6.f29378d6;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.t2 t2Var = new bi.t2(context, 17);
        this.f35071e = t2Var;
        t2Var.setClipChildren(false);
        frameLayout.addView(this.f35071e, c8.ma.e(-1, -1, 119));
        org.telegram.messenger.g0.z3(this.f35071e, 0, Z(), 0, 0);
        org.telegram.messenger.ma.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nj njVar = new org.telegram.ui.nj(context, getParentLayout(), bundle, 1);
        njVar.h = false;
        this.f35072f = njVar;
        this.f35071e.addView(njVar, c8.ma.e(-1, -1, 119));
        c30 c30Var = new c30(this, context, new bt0(null), this, new Object(), this.resourceProvider);
        this.f35073n = c30Var;
        if (c30Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.t6.s(this.f35073n.getSearchOptionsItem(), org.telegram.ui.ActionBar.m6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f35073n.setPinnedToTop(true);
        this.f35073n.f36677u0.setTranslationY(0.0f);
        if (this.f35073n.getSearchOptionsItem() != null) {
            this.f35073n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        c30 c30Var2 = this.f35073n;
        fi.b6 b6Var = this.d;
        c30Var2.X1 = b6Var;
        sr0 sr0Var = c30Var2.f36633f0;
        sr0Var.f35651s = b6Var;
        sr0Var.f();
        gt0 gt0Var = c30Var2.f36636g0;
        gt0Var.f35651s = b6Var;
        gt0Var.f();
        this.f35073n.n1(0, ri.a.c(org.telegram.messenger.g0.f24140m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f35073n, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f35075s = frameLayout3;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f35076w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f35076w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(this.f35076w, org.telegram.ui.ActionBar.m6.qf, getResourceProvider());
        this.f35076w.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
        this.f35075s.addView(this.f35076w, c8.ma.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29379d7, view, this.resourceProvider);
        this.f35075s.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24145p, 55));
        this.h.addView(this.f35075s, c8.ma.e(-1, 49, 87));
        this.f35071e.addView(this.h, c8.ma.e(-1, -1, 119));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.f35074r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(k1Var, i02, M, M2, resourceProvider);
        this.f35074r.setOnClickListener(new o0(this, 26));
        b0(this.f35074r.a(b6Var), false);
        this.f35074r.b(org.telegram.messenger.ma.a(this.currentAccount).d.f25377m, this.f35069b, this.f35070c);
        frameLayout.addView(this.f35074r, c8.ma.e(-1, 48, 55));
        org.telegram.messenger.g0.z3(this.f35074r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f56665m = frameLayout;
        baseSimpleGlass.f56666n = null;
        baseSimpleGlass.g(frameLayout, z4Var2, resourceProvider2);
        baseSimpleGlass.f56667o = new di.f(4, this, frameLayout);
        this.f35073n.setPagesGlassEngine(this.glassEngine);
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
                jg.k1 k1Var = this.f35074r;
                if (k1Var != null) {
                    b0(k1Var.a(b6Var), true);
                }
                TextView textView = this.f35076w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.ks.I0 && (njVar = this.f35072f) != null && njVar.f47010a != null && ((Integer) objArr[0]).intValue() == this.f35072f.f47010a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var2 = this.f35074r;
            if (k1Var2 != null) {
                k1Var2.b(intValue, this.f35069b, this.f35070c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, true)) > 0.699999988079071d) {
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
