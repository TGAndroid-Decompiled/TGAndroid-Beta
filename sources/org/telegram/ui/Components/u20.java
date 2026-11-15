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
public final class u20 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f39873a;
    public final String f39874b;
    public final String f39875c;
    public final fi.d6 d;
    public bi.v1 f39876e;
    public org.telegram.ui.mj f39877f;
    public FrameLayout h;
    public r20 f39878n;
    public jg.k1 f39879r;
    public FrameLayout f39880s;
    public TextView f39881w;
    public float f39882x;
    public ValueAnimator f39883y;

    public u20(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f39874b = trim.substring(0, indexOf);
            this.f39875c = trim.substring(indexOf + 1);
        } else {
            this.f39874b = trim;
            this.f39875c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f39874b);
        if (!TextUtils.isEmpty(this.f39875c)) {
            str2 = "@" + this.f39875c;
        }
        sb2.append(str2);
        this.f39873a = sb2.toString();
        this.d = new fi.d6(this.currentAccount, this.f39875c, this.f39874b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f23605m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
    }

    public final void a0(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
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
            r20 r20Var = this.f39878n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            r20Var.setScaleX(f11);
            r20 r20Var2 = this.f39878n;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            r20Var2.setScaleY(f12);
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
            org.telegram.ui.mj mjVar = this.f39877f;
            if (mjVar != null && (bnVar = mjVar.f46179a) != null && (c1Var = bnVar.f45121a4) != null) {
                c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f39877f.f46179a.f45121a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
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
            ofFloat.addUpdateListener(new s20(this, 1));
            this.G.addListener(new t20(this, z10, 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(er.h);
            this.G.start();
        }
    }

    public final void b0(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f39879r.animate().cancel();
        ValueAnimator valueAnimator = this.f39883y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            jg.k1 k1Var = this.f39879r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k1Var.setVisibility(i7);
            jg.k1 k1Var2 = this.f39879r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            k1Var2.setTranslationY(f11);
            bi.v1 v1Var = this.f39876e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            v1Var.setTranslationY(f12);
            bi.v1 v1Var2 = this.f39876e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            v1Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f39879r.setVisibility(0);
        ViewPropertyAnimator animate = this.f39879r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ai.q(26, this, z10)).setDuration(320L);
        er erVar = er.h;
        duration.setInterpolator(erVar).start();
        float f13 = this.f39882x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f39883y = ofFloat;
        ofFloat.addUpdateListener(new s20(this, 0));
        this.f39883y.addListener(new t20(this, z10, 0));
        this.f39883y.setDuration(320L);
        this.f39883y.setInterpolator(erVar);
        this.f39883y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        String str = this.f39873a;
        w4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.v1 v1Var = new bi.v1(context, 17);
        this.f39876e = v1Var;
        v1Var.setClipChildren(false);
        frameLayout.addView(this.f39876e, c8.ja.e(-1, -1, 119));
        org.telegram.messenger.g0.A3(this.f39876e, 0, Z(), 0, 0);
        org.telegram.messenger.na.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.mj mjVar = new org.telegram.ui.mj(context, getParentLayout(), bundle, 1);
        mjVar.h = false;
        this.f39877f = mjVar;
        this.f39876e.addView(mjVar, c8.ja.e(-1, -1, 119));
        r20 r20Var = new r20(this, context, new qs0(null), this, new Object(), this.resourceProvider);
        this.f39878n = r20Var;
        if (r20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.q6.s(this.f39878n.getSearchOptionsItem(), org.telegram.ui.ActionBar.j6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f39878n.setPinnedToTop(true);
        this.f39878n.f42140u0.setTranslationY(0.0f);
        if (this.f39878n.getSearchOptionsItem() != null) {
            this.f39878n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        r20 r20Var2 = this.f39878n;
        fi.d6 d6Var = this.d;
        r20Var2.X1 = d6Var;
        ir0 ir0Var = r20Var2.f42096f0;
        ir0Var.f41149s = d6Var;
        ir0Var.f();
        vs0 vs0Var = r20Var2.f42099g0;
        vs0Var.f41149s = d6Var;
        vs0Var.f();
        this.f39878n.n1(0, ri.a.c(org.telegram.messenger.g0.f23605m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f39878n, c8.ja.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f39880s = frameLayout3;
        org.telegram.ui.ActionBar.q6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f39881w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f39881w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.q6.U(this.f39881w, org.telegram.ui.ActionBar.j6.qf, getResourceProvider());
        this.f39881w.setText(org.telegram.messenger.hd.G(d6Var.J, "FoundStories", new Object[0]));
        this.f39880s.addView(this.f39881w, c8.ja.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, this.resourceProvider);
        this.f39880s.addView(view, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.f23610p, 55));
        this.h.addView(this.f39880s, c8.ja.e(-1, 49, 87));
        this.f39876e.addView(this.h, c8.ja.e(-1, -1, 119));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.f39879r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.j6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.q6.j(k1Var, i02, M, M2, resourceProvider);
        this.f39879r.setOnClickListener(new e0(this, 25));
        b0(this.f39879r.a(d6Var), false);
        this.f39879r.b(org.telegram.messenger.na.a(this.currentAccount).d.f25013m, this.f39874b, this.f39875c);
        frameLayout.addView(this.f39879r, c8.ja.e(-1, 48, 55));
        org.telegram.messenger.g0.A3(this.f39879r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f56050m = frameLayout;
        baseSimpleGlass.f56051n = null;
        baseSimpleGlass.g(frameLayout, w4Var2, resourceProvider2);
        baseSimpleGlass.f56052o = new di.f(4, this, frameLayout);
        this.f39878n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.w4 w4Var3 = this.simpleActionBar;
        w4Var3.setBackground(baseSimpleGlass.a(w4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.mj mjVar;
        if (i7 == org.telegram.messenger.ns.f25606x5) {
            Object obj = objArr[0];
            fi.d6 d6Var = this.d;
            if (obj == d6Var) {
                jg.k1 k1Var = this.f39879r;
                if (k1Var != null) {
                    b0(k1Var.a(d6Var), true);
                }
                TextView textView = this.f39881w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.G(d6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.ns.I0 && (mjVar = this.f39877f) != null && mjVar.f46179a != null && ((Integer) objArr[0]).intValue() == this.f39877f.f46179a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var2 = this.f39879r;
            if (k1Var2 != null) {
                k1Var2.b(intValue, this.f39874b, this.f39875c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        fi.d6 d6Var = this.d;
        arrayList.add(d6Var);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25606x5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.I0);
        d6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25606x5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
