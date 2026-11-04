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
public final class n20 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f36337a;
    public final String f36338b;
    public final String f36339c;
    public final ei.l6 d;
    public ai.d2 f36340e;
    public org.telegram.ui.ij f36341f;
    public FrameLayout h;
    public k20 f36342n;
    public kg.h1 f36343r;
    public FrameLayout f36344s;
    public TextView f36345w;
    public float f36346x;
    public ValueAnimator f36347y;

    public n20(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f36338b = trim.substring(0, indexOf);
            this.f36339c = trim.substring(indexOf + 1);
        } else {
            this.f36338b = trim;
            this.f36339c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f36338b);
        if (!TextUtils.isEmpty(this.f36339c)) {
            str2 = "@" + this.f36339c;
        }
        sb2.append(str2);
        this.f36337a = sb2.toString();
        this.d = new ei.l6(this.currentAccount, this.f36339c, this.f36338b);
    }

    public final int Z() {
        int i3;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
    }

    public final void a0(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.xm xmVar;
        ci.j1 j1Var;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = 0;
        float f13 = 0.0f;
        if (!z11) {
            this.E = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F = f10;
            k20 k20Var = this.f36342n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            k20Var.setScaleX(f11);
            k20 k20Var2 = this.f36342n;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            k20Var2.setScaleY(f12);
            FrameLayout frameLayout = this.h;
            if (z10) {
                f13 = 1.0f;
            }
            frameLayout.setAlpha(f13);
            FrameLayout frameLayout2 = this.h;
            if (!z10) {
                i3 = 8;
            }
            frameLayout2.setVisibility(i3);
            org.telegram.ui.ij ijVar = this.f36341f;
            if (ijVar != null && (xmVar = ijVar.f52363a) != null && (j1Var = xmVar.f51241a4) != null) {
                j1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f36341f.f52363a.f51241a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
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
            ofFloat.addUpdateListener(new l20(this, 1));
            this.G.addListener(new m20(this, z10, 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(xq.h);
            this.G.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f10;
        int i3;
        float f11;
        int i10;
        this.f36343r.animate().cancel();
        ValueAnimator valueAnimator = this.f36347y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            kg.h1 h1Var = this.f36343r;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            h1Var.setVisibility(i3);
            kg.h1 h1Var2 = this.f36343r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            h1Var2.setTranslationY(f11);
            ai.d2 d2Var = this.f36340e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            d2Var.setTranslationY(f12);
            ai.d2 d2Var2 = this.f36340e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            d2Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f36343r.setVisibility(0);
        ViewPropertyAnimator animate = this.f36343r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ci.e1(25, this, z10)).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        float f13 = this.f36346x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f36347y = ofFloat;
        ofFloat.addUpdateListener(new l20(this, 0));
        this.f36347y.addListener(new m20(this, z10, 0));
        this.f36347y.setDuration(320L);
        this.f36347y.setInterpolator(xqVar);
        this.f36347y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        String str = this.f36337a;
        y4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        ai.d2 d2Var = new ai.d2(context, 17);
        this.f36340e = d2Var;
        d2Var.setClipChildren(false);
        frameLayout.addView(this.f36340e, b8.mf.e(-1, -1, 119));
        org.telegram.messenger.g0.B3(this.f36340e, 0, Z(), 0, 0);
        org.telegram.messenger.ha.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ij ijVar = new org.telegram.ui.ij(context, getParentLayout(), bundle, 1);
        ijVar.h = false;
        this.f36341f = ijVar;
        this.f36340e.addView(ijVar, b8.mf.e(-1, -1, 119));
        k20 k20Var = new k20(this, context, new os0(null), this, new Object(), this.resourceProvider);
        this.f36342n = k20Var;
        if (k20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.f36342n.getSearchOptionsItem(), org.telegram.ui.ActionBar.k6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f36342n.setPinnedToTop(true);
        this.f36342n.f40130u0.setTranslationY(0.0f);
        if (this.f36342n.getSearchOptionsItem() != null) {
            this.f36342n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        k20 k20Var2 = this.f36342n;
        ei.l6 l6Var = this.d;
        k20Var2.X1 = l6Var;
        gr0 gr0Var = k20Var2.f40086f0;
        gr0Var.f38550s = l6Var;
        gr0Var.f();
        ts0 ts0Var = k20Var2.f40089g0;
        ts0Var.f38550s = l6Var;
        ts0Var.f();
        this.f36342n.l1(0, pi.a.c(org.telegram.messenger.g0.f22602m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f36342n, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f36344s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f36345w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f36345w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(this.f36345w, org.telegram.ui.ActionBar.k6.nf, getResourceProvider());
        this.f36345w.setText(org.telegram.messenger.bd.G(l6Var.J, "FoundStories", new Object[0]));
        this.f36344s.addView(this.f36345w, b8.mf.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, this.resourceProvider);
        this.f36344s.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22607p, 55));
        this.h.addView(this.f36344s, b8.mf.e(-1, 49, 87));
        this.f36340e.addView(this.h, b8.mf.e(-1, -1, 119));
        kg.h1 h1Var = new kg.h1(context, this.resourceProvider);
        this.f36343r = h1Var;
        int themedColor = getThemedColor(i3);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        h1Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(h1Var, i02, N, N2, resourceProvider);
        this.f36343r.setOnClickListener(new f0(this, 24));
        b0(this.f36343r.a(l6Var), false);
        this.f36343r.b(org.telegram.messenger.ha.a(this.currentAccount).d.f22689m, this.f36338b, this.f36339c);
        frameLayout.addView(this.f36343r, b8.mf.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.f36343r, 0, Z(), 0, 0);
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f53532l = frameLayout;
        baseSimpleGlass.f53533m = null;
        baseSimpleGlass.g(frameLayout, y4Var2, resourceProvider2);
        baseSimpleGlass.f53534n = new ci.g(4, this, frameLayout);
        this.f36342n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.y4 y4Var3 = this.simpleActionBar;
        y4Var3.setBackground(baseSimpleGlass.a(y4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ij ijVar;
        if (i3 == org.telegram.messenger.hs.f23338x5) {
            Object obj = objArr[0];
            ei.l6 l6Var = this.d;
            if (obj == l6Var) {
                kg.h1 h1Var = this.f36343r;
                if (h1Var != null) {
                    b0(h1Var.a(l6Var), true);
                }
                TextView textView = this.f36345w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.bd.G(l6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i3 == org.telegram.messenger.hs.I0 && (ijVar = this.f36341f) != null && ijVar.f52363a != null && ((Integer) objArr[0]).intValue() == this.f36341f.f52363a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            kg.h1 h1Var2 = this.f36343r;
            if (h1Var2 != null) {
                h1Var2.b(intValue, this.f36338b, this.f36339c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        ei.l6 l6Var = this.d;
        arrayList.add(l6Var);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23338x5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.I0);
        l6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23338x5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
