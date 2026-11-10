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
    public final String f37473a;
    public final String f37474b;
    public final String f37475c;
    public final di.l6 d;
    public di.b4 f37476e;
    public org.telegram.ui.oj f37477f;
    public FrameLayout h;
    public o20 f37478n;
    public jg.l1 f37479r;
    public FrameLayout f37480s;
    public TextView f37481w;
    public float f37482x;
    public ValueAnimator f37483y;

    public r20(String str, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        setResourceProvider(h6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f37474b = trim.substring(0, indexOf);
            this.f37475c = trim.substring(indexOf + 1);
        } else {
            this.f37474b = trim;
            this.f37475c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37474b);
        if (!TextUtils.isEmpty(this.f37475c)) {
            str2 = "@" + this.f37475c;
        }
        sb2.append(str2);
        this.f37473a = sb2.toString();
        this.d = new di.l6(this.currentAccount, this.f37475c, this.f37474b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7;
    }

    public final void a0(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.dn dnVar;
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
            o20 o20Var = this.f37478n;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            o20Var.setScaleX(f11);
            o20 o20Var2 = this.f37478n;
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
            org.telegram.ui.oj ojVar = this.f37477f;
            if (ojVar != null && (dnVar = ojVar.f45407a) != null && (q1Var = dnVar.Z3) != null) {
                q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
                this.f37477f.f45407a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
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
            this.F.setInterpolator(wq.h);
            this.F.start();
        }
    }

    public final void b0(boolean z9, boolean z10) {
        float f10;
        int i7;
        float f11;
        int i10;
        this.f37479r.animate().cancel();
        ValueAnimator valueAnimator = this.f37483y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z10) {
            jg.l1 l1Var = this.f37479r;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            l1Var.setVisibility(i7);
            jg.l1 l1Var2 = this.f37479r;
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            l1Var2.setTranslationY(f11);
            di.b4 b4Var = this.f37476e;
            if (z9) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            b4Var.setTranslationY(f12);
            di.b4 b4Var2 = this.f37476e;
            if (z9) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            b4Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f37479r.setVisibility(0);
        ViewPropertyAnimator animate = this.f37479r.animate();
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new bi.k1(25, this, z9)).setDuration(320L);
        wq wqVar = wq.h;
        duration.setInterpolator(wqVar).start();
        float f13 = this.f37482x;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f37483y = ofFloat;
        ofFloat.addUpdateListener(new p20(this, 0));
        this.f37483y.addListener(new q20(this, z9, 0));
        this.f37483y.setDuration(320L);
        this.f37483y.setInterpolator(wqVar);
        this.f37483y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        String str = this.f37473a;
        z4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.b4 b4Var = new di.b4(context, 15);
        this.f37476e = b4Var;
        b4Var.setClipChildren(false);
        frameLayout.addView(this.f37476e, c8.ha.e(-1, -1, 119));
        org.telegram.messenger.g0.B3(this.f37476e, 0, Z(), 0, 0);
        org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.oj ojVar = new org.telegram.ui.oj(context, getParentLayout(), bundle, 1);
        ojVar.h = false;
        this.f37477f = ojVar;
        this.f37476e.addView(ojVar, c8.ha.e(-1, -1, 119));
        o20 o20Var = new o20(this, context, new qs0(null), this, new Object(), this.resourceProvider);
        this.f37478n = o20Var;
        if (o20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.t6.s(this.f37478n.getSearchOptionsItem(), org.telegram.ui.ActionBar.m6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f37478n.setPinnedToTop(true);
        this.f37478n.f40708t0.setTranslationY(0.0f);
        if (this.f37478n.getSearchOptionsItem() != null) {
            this.f37478n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        o20 o20Var2 = this.f37478n;
        di.l6 l6Var = this.d;
        o20Var2.W1 = l6Var;
        hr0 hr0Var = o20Var2.f40663e0;
        hr0Var.f39730s = l6Var;
        hr0Var.f();
        vs0 vs0Var = o20Var2.f40667f0;
        vs0Var.f39730s = l6Var;
        vs0Var.f();
        this.f37478n.n1(0, oi.a.c(org.telegram.messenger.g0.f22561m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f37478n, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f37480s = frameLayout3;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f37481w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f37481w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(this.f37481w, org.telegram.ui.ActionBar.m6.f28080nf, getResourceProvider());
        this.f37481w.setText(org.telegram.messenger.id.G(l6Var.J, "FoundStories", new Object[0]));
        this.f37480s.addView(this.f37481w, c8.ha.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, this.resourceProvider);
        this.f37480s.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22566p, 55));
        this.h.addView(this.f37480s, c8.ha.e(-1, 49, 87));
        this.f37476e.addView(this.h, c8.ha.e(-1, -1, 119));
        jg.l1 l1Var = new jg.l1(context, this.resourceProvider);
        this.f37479r = l1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        l1Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(l1Var, i02, M, M2, resourceProvider);
        this.f37479r.setOnClickListener(new g0(this, 24));
        b0(this.f37479r.a(l6Var), false);
        this.f37479r.b(org.telegram.messenger.oa.a(this.currentAccount).d.f24173m, this.f37474b, this.f37475c);
        frameLayout.addView(this.f37479r, c8.ha.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.f37479r, 0, Z(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f21034m = frameLayout;
        baseSimpleGlass.f21035n = null;
        baseSimpleGlass.g(frameLayout, z4Var2, resourceProvider2);
        baseSimpleGlass.f21036o = new bi.g(6, this, frameLayout);
        this.f37478n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.z4 z4Var3 = this.simpleActionBar;
        z4Var3.setBackground(baseSimpleGlass.a(z4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.oj ojVar;
        if (i7 == org.telegram.messenger.qs.f25113x5) {
            Object obj = objArr[0];
            di.l6 l6Var = this.d;
            if (obj == l6Var) {
                jg.l1 l1Var = this.f37479r;
                if (l1Var != null) {
                    b0(l1Var.a(l6Var), true);
                }
                TextView textView = this.f37481w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.id.G(l6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.I0 && (ojVar = this.f37477f) != null && ojVar.f45407a != null && ((Integer) objArr[0]).intValue() == this.f37477f.f45407a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.l1 l1Var2 = this.f37479r;
            if (l1Var2 != null) {
                l1Var2.b(intValue, this.f37474b, this.f37475c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        di.l6 l6Var = this.d;
        arrayList.add(l6Var);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25113x5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.I0);
        l6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25113x5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
