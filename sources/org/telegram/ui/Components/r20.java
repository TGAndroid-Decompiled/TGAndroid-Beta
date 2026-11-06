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
public final class r20 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final String f37467a;
    public final String f37468b;
    public final String f37469c;
    public final di.k6 d;
    public di.a4 f37470e;
    public org.telegram.ui.mj f37471f;
    public FrameLayout h;
    public o20 f37472n;
    public jg.l1 f37473r;
    public FrameLayout f37474s;
    public TextView f37475w;
    public float f37476x;
    public ValueAnimator f37477y;

    public r20(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        setResourceProvider(f6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f37468b = trim.substring(0, indexOf);
            this.f37469c = trim.substring(indexOf + 1);
        } else {
            this.f37468b = trim;
            this.f37469c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37468b);
        if (!TextUtils.isEmpty(this.f37469c)) {
            str2 = "@" + this.f37469c;
        }
        sb2.append(str2);
        this.f37467a = sb2.toString();
        this.d = new di.k6(this.currentAccount, this.f37469c, this.f37468b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22538m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public final void a0(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = 0;
        float f13 = 0.0f;
        if (!z10) {
            this.D = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.E = f10;
            o20 o20Var = this.f37472n;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            o20Var.setScaleX(f11);
            o20 o20Var2 = this.f37472n;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            o20Var2.setScaleY(f12);
            FrameLayout frameLayout = this.h;
            if (z9) {
                f13 = 1.0f;
            }
            frameLayout.setAlpha(f13);
            FrameLayout frameLayout2 = this.h;
            if (!z9) {
                i7 = 8;
            }
            frameLayout2.setVisibility(i7);
            org.telegram.ui.mj mjVar = this.f37471f;
            if (mjVar != null && (bnVar = mjVar.f44857a) != null && (q1Var = bnVar.Z3) != null) {
                q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
                this.f37471f.f44857a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
            }
        } else if (this.D == z9) {
        } else {
            this.D = z9;
            this.h.setVisibility(0);
            float f14 = this.E;
            if (z9) {
                f13 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new p20(this, 1));
            this.F.addListener(new q20(this, z9, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(xq.h);
            this.F.start();
        }
    }

    public final void b0(boolean z9, boolean z10) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f37473r.animate().cancel();
        ValueAnimator valueAnimator = this.f37477y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z10) {
            jg.l1 l1Var = this.f37473r;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            l1Var.setVisibility(i7);
            jg.l1 l1Var2 = this.f37473r;
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            l1Var2.setTranslationY(f11);
            di.a4 a4Var = this.f37470e;
            if (z9) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            a4Var.setTranslationY(f12);
            di.a4 a4Var2 = this.f37470e;
            if (z9) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            a4Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f37473r.setVisibility(0);
        ViewPropertyAnimator animate = this.f37473r.animate();
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new bi.k1(25, this, z9)).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        float f13 = this.f37476x;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f37477y = ofFloat;
        ofFloat.addUpdateListener(new p20(this, 0));
        this.f37477y.addListener(new q20(this, z9, 0));
        this.f37477y.setDuration(320L);
        this.f37477y.setInterpolator(xqVar);
        this.f37477y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        String str = this.f37467a;
        y4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.k6.f27849d6;
        org.telegram.ui.ActionBar.r6.i(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.a4 a4Var = new di.a4(context, 15);
        this.f37470e = a4Var;
        a4Var.setClipChildren(false);
        frameLayout.addView(this.f37470e, c8.ha.e(-1, -1, 119));
        org.telegram.messenger.g0.B3(this.f37470e, 0, Z(), 0, 0);
        org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.mj mjVar = new org.telegram.ui.mj(context, getParentLayout(), bundle, 1);
        mjVar.h = false;
        this.f37471f = mjVar;
        this.f37470e.addView(mjVar, c8.ha.e(-1, -1, 119));
        o20 o20Var = new o20(this, context, new ps0(null), this, new Object(), this.resourceProvider);
        this.f37472n = o20Var;
        if (o20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.f37472n.getSearchOptionsItem(), org.telegram.ui.ActionBar.k6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f37472n.setPinnedToTop(true);
        this.f37472n.f40429t0.setTranslationY(0.0f);
        if (this.f37472n.getSearchOptionsItem() != null) {
            this.f37472n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        o20 o20Var2 = this.f37472n;
        di.k6 k6Var = this.d;
        o20Var2.W1 = k6Var;
        gr0 gr0Var = o20Var2.f40384e0;
        gr0Var.f38717s = k6Var;
        gr0Var.f();
        us0 us0Var = o20Var2.f40388f0;
        us0Var.f38717s = k6Var;
        us0Var.f();
        this.f37472n.l1(0, oi.a.c(org.telegram.messenger.g0.f22538m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f37472n, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f37474s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f37475w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f37475w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(this.f37475w, org.telegram.ui.ActionBar.k6.f28039nf, getResourceProvider());
        this.f37475w.setText(org.telegram.messenger.hd.G(k6Var.J, "FoundStories", new Object[0]));
        this.f37474s.addView(this.f37475w, c8.ha.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27850d7, view, this.resourceProvider);
        this.f37474s.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22543p, 55));
        this.h.addView(this.f37474s, c8.ha.e(-1, 49, 87));
        this.f37470e.addView(this.h, c8.ha.e(-1, -1, 119));
        jg.l1 l1Var = new jg.l1(context, this.resourceProvider);
        this.f37473r = l1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        l1Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(l1Var, i02, N, N2, resourceProvider);
        this.f37473r.setOnClickListener(new h0(this, 24));
        b0(this.f37473r.a(k6Var), false);
        this.f37473r.b(org.telegram.messenger.oa.a(this.currentAccount).d.f24163m, this.f37468b, this.f37469c);
        frameLayout.addView(this.f37473r, c8.ha.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.f37473r, 0, Z(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f21026m = frameLayout;
        baseSimpleGlass.f21027n = null;
        baseSimpleGlass.g(frameLayout, y4Var2, resourceProvider2);
        baseSimpleGlass.f21028o = new bi.g(6, this, frameLayout);
        this.f37472n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.y4 y4Var3 = this.simpleActionBar;
        y4Var3.setBackground(baseSimpleGlass.a(y4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.mj mjVar;
        if (i7 == org.telegram.messenger.qs.f25100x5) {
            Object obj = objArr[0];
            di.k6 k6Var = this.d;
            if (obj == k6Var) {
                jg.l1 l1Var = this.f37473r;
                if (l1Var != null) {
                    b0(l1Var.a(k6Var), true);
                }
                TextView textView = this.f37475w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.G(k6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.I0 && (mjVar = this.f37471f) != null && mjVar.f44857a != null && ((Integer) objArr[0]).intValue() == this.f37471f.f44857a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.l1 l1Var2 = this.f37473r;
            if (l1Var2 != null) {
                l1Var2.b(intValue, this.f37468b, this.f37469c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        di.k6 k6Var = this.d;
        arrayList.add(k6Var);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25100x5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.I0);
        k6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25100x5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
