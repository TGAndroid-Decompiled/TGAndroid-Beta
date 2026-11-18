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
public final class c30 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f33868a;
    public final String f33869b;
    public final String f33870c;
    public final fi.b6 d;
    public bi.p2 f33871e;
    public org.telegram.ui.nj f33872f;
    public FrameLayout h;
    public z20 f33873n;
    public jg.k1 f33874r;
    public FrameLayout f33875s;
    public TextView f33876w;
    public float f33877x;
    public ValueAnimator f33878y;

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
            this.f33869b = trim.substring(0, indexOf);
            this.f33870c = trim.substring(indexOf + 1);
        } else {
            this.f33869b = trim;
            this.f33870c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33869b);
        if (!TextUtils.isEmpty(this.f33870c)) {
            str2 = "@" + this.f33870c;
        }
        sb2.append(str2);
        this.f33868a = sb2.toString();
        this.d = new fi.b6(this.currentAccount, this.f33870c, this.f33869b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24115m;
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
            z20 z20Var = this.f33873n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            z20Var.setScaleX(f11);
            z20 z20Var2 = this.f33873n;
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
            org.telegram.ui.nj njVar = this.f33872f;
            if (njVar != null && (cnVar = njVar.f47021a) != null && (b1Var = cnVar.f45936a4) != null) {
                b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f33872f.f47021a.f45936a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
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
            this.G.setInterpolator(lr.h);
            this.G.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f33874r.animate().cancel();
        ValueAnimator valueAnimator = this.f33878y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            jg.k1 k1Var = this.f33874r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k1Var.setVisibility(i7);
            jg.k1 k1Var2 = this.f33874r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            k1Var2.setTranslationY(f11);
            bi.p2 p2Var = this.f33871e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            p2Var.setTranslationY(f12);
            bi.p2 p2Var2 = this.f33871e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            p2Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f33874r.setVisibility(0);
        ViewPropertyAnimator animate = this.f33874r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ch.k(26, this, z10)).setDuration(320L);
        lr lrVar = lr.h;
        duration.setInterpolator(lrVar).start();
        float f13 = this.f33877x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f33878y = ofFloat;
        ofFloat.addUpdateListener(new a30(this, 0));
        this.f33878y.addListener(new b30(this, z10, 0));
        this.f33878y.setDuration(320L);
        this.f33878y.setInterpolator(lrVar);
        this.f33878y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        String str = this.f33868a;
        a5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.p2 p2Var = new bi.p2(context, 17);
        this.f33871e = p2Var;
        p2Var.setClipChildren(false);
        frameLayout.addView(this.f33871e, c8.ma.e(-1, -1, 119));
        org.telegram.messenger.g0.z3(this.f33871e, 0, Z(), 0, 0);
        org.telegram.messenger.ma.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nj njVar = new org.telegram.ui.nj(context, getParentLayout(), bundle, 1);
        njVar.h = false;
        this.f33872f = njVar;
        this.f33871e.addView(njVar, c8.ma.e(-1, -1, 119));
        z20 z20Var = new z20(this, context, new ys0(null), this, new Object(), this.resourceProvider);
        this.f33873n = z20Var;
        if (z20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.u6.s(this.f33873n.getSearchOptionsItem(), org.telegram.ui.ActionBar.n6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f33873n.setPinnedToTop(true);
        this.f33873n.f35630u0.setTranslationY(0.0f);
        if (this.f33873n.getSearchOptionsItem() != null) {
            this.f33873n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        z20 z20Var2 = this.f33873n;
        fi.b6 b6Var = this.d;
        z20Var2.X1 = b6Var;
        qr0 qr0Var = z20Var2.f35586f0;
        qr0Var.f34504s = b6Var;
        qr0Var.f();
        dt0 dt0Var = z20Var2.f35589g0;
        dt0Var.f34504s = b6Var;
        dt0Var.f();
        this.f33873n.n1(0, ri.a.c(org.telegram.messenger.g0.f24115m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f33873n, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33875s = frameLayout3;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f33876w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f33876w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(this.f33876w, org.telegram.ui.ActionBar.n6.qf, getResourceProvider());
        this.f33876w.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
        this.f33875s.addView(this.f33876w, c8.ma.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29397d7, view, this.resourceProvider);
        this.f33875s.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24120p, 55));
        this.h.addView(this.f33875s, c8.ma.e(-1, 49, 87));
        this.f33871e.addView(this.h, c8.ma.e(-1, -1, 119));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.f33874r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.u6.j(k1Var, i02, M, M2, resourceProvider);
        this.f33874r.setOnClickListener(new n0(this, 26));
        b0(this.f33874r.a(b6Var), false);
        this.f33874r.b(org.telegram.messenger.ma.a(this.currentAccount).d.f25351m, this.f33869b, this.f33870c);
        frameLayout.addView(this.f33874r, c8.ma.e(-1, 48, 55));
        org.telegram.messenger.g0.z3(this.f33874r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.a5 a5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f56624m = frameLayout;
        baseSimpleGlass.f56625n = null;
        baseSimpleGlass.g(frameLayout, a5Var2, resourceProvider2);
        baseSimpleGlass.f56626o = new di.f(4, this, frameLayout);
        this.f33873n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.a5 a5Var3 = this.simpleActionBar;
        a5Var3.setBackground(baseSimpleGlass.a(a5Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.nj njVar;
        if (i7 == org.telegram.messenger.ks.f25239z5) {
            Object obj = objArr[0];
            fi.b6 b6Var = this.d;
            if (obj == b6Var) {
                jg.k1 k1Var = this.f33874r;
                if (k1Var != null) {
                    b0(k1Var.a(b6Var), true);
                }
                TextView textView = this.f33876w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.ks.I0 && (njVar = this.f33872f) != null && njVar.f47021a != null && ((Integer) objArr[0]).intValue() == this.f33872f.f47021a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var2 = this.f33874r;
            if (k1Var2 != null) {
                k1Var2.b(intValue, this.f33869b, this.f33870c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().R1().I;
        fi.b6 b6Var = this.d;
        arrayList.add(b6Var);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25239z5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.I0);
        b6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().R1().I.remove(this.d);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25239z5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
