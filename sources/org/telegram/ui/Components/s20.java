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
public final class s20 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final String f37884a;
    public final String f37885b;
    public final String f37886c;
    public final di.l6 d;
    public di.b4 f37887e;
    public org.telegram.ui.oj f37888f;
    public FrameLayout h;
    public p20 f37889n;
    public jg.l1 f37890r;
    public FrameLayout f37891s;
    public TextView f37892w;
    public float f37893x;
    public ValueAnimator f37894y;

    public s20(String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        setResourceProvider(g6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f37885b = trim.substring(0, indexOf);
            this.f37886c = trim.substring(indexOf + 1);
        } else {
            this.f37885b = trim;
            this.f37886c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37885b);
        if (!TextUtils.isEmpty(this.f37886c)) {
            str2 = "@" + this.f37886c;
        }
        sb2.append(str2);
        this.f37884a = sb2.toString();
        this.d = new di.l6(this.currentAccount, this.f37886c, this.f37885b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
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
            p20 p20Var = this.f37889n;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            p20Var.setScaleX(f11);
            p20 p20Var2 = this.f37889n;
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            p20Var2.setScaleY(f12);
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
            org.telegram.ui.oj ojVar = this.f37888f;
            if (ojVar != null && (dnVar = ojVar.f45471a) != null && (q1Var = dnVar.Z3) != null) {
                q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
                this.f37888f.f45471a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
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
            ofFloat.addUpdateListener(new q20(this, 1));
            this.F.addListener(new r20(this, z9, 1));
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
        this.f37890r.animate().cancel();
        ValueAnimator valueAnimator = this.f37894y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z10) {
            jg.l1 l1Var = this.f37890r;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            l1Var.setVisibility(i7);
            jg.l1 l1Var2 = this.f37890r;
            if (z9) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            l1Var2.setTranslationY(f11);
            di.b4 b4Var = this.f37887e;
            if (z9) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            b4Var.setTranslationY(f12);
            di.b4 b4Var2 = this.f37887e;
            if (z9) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            b4Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f37890r.setVisibility(0);
        ViewPropertyAnimator animate = this.f37890r.animate();
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new bi.k1(25, this, z9)).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        float f13 = this.f37893x;
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f37894y = ofFloat;
        ofFloat.addUpdateListener(new q20(this, 0));
        this.f37894y.addListener(new r20(this, z9, 0));
        this.f37894y.setDuration(320L);
        this.f37894y.setInterpolator(xqVar);
        this.f37894y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        String str = this.f37884a;
        y4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.s6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.b4 b4Var = new di.b4(context, 15);
        this.f37887e = b4Var;
        b4Var.setClipChildren(false);
        frameLayout.addView(this.f37887e, c8.ha.e(-1, -1, 119));
        org.telegram.messenger.g0.B3(this.f37887e, 0, Z(), 0, 0);
        org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.oj ojVar = new org.telegram.ui.oj(context, getParentLayout(), bundle, 1);
        ojVar.h = false;
        this.f37888f = ojVar;
        this.f37887e.addView(ojVar, c8.ha.e(-1, -1, 119));
        p20 p20Var = new p20(this, context, new rs0(null), this, new Object(), this.resourceProvider);
        this.f37889n = p20Var;
        if (p20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.s6.s(this.f37889n.getSearchOptionsItem(), org.telegram.ui.ActionBar.l6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f37889n.setPinnedToTop(true);
        this.f37889n.f41116t0.setTranslationY(0.0f);
        if (this.f37889n.getSearchOptionsItem() != null) {
            this.f37889n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        p20 p20Var2 = this.f37889n;
        di.l6 l6Var = this.d;
        p20Var2.W1 = l6Var;
        ir0 ir0Var = p20Var2.f41071e0;
        ir0Var.f40145s = l6Var;
        ir0Var.f();
        ws0 ws0Var = p20Var2.f41075f0;
        ws0Var.f40145s = l6Var;
        ws0Var.f();
        this.f37889n.n1(0, oi.a.c(org.telegram.messenger.g0.f22557m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f37889n, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f37891s = frameLayout3;
        org.telegram.ui.ActionBar.s6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f37892w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f37892w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.s6.U(this.f37892w, org.telegram.ui.ActionBar.l6.f28055nf, getResourceProvider());
        this.f37892w.setText(org.telegram.messenger.id.G(l6Var.J, "FoundStories", new Object[0]));
        this.f37891s.addView(this.f37892w, c8.ha.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, this.resourceProvider);
        this.f37891s.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22562p, 55));
        this.h.addView(this.f37891s, c8.ha.e(-1, 49, 87));
        this.f37887e.addView(this.h, c8.ha.e(-1, -1, 119));
        jg.l1 l1Var = new jg.l1(context, this.resourceProvider);
        this.f37890r = l1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.l6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i10);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        l1Var.setBackground(i02);
        org.telegram.ui.ActionBar.s6.j(l1Var, i02, M, M2, resourceProvider);
        this.f37890r.setOnClickListener(new h0(this, 24));
        b0(this.f37890r.a(l6Var), false);
        this.f37890r.b(org.telegram.messenger.oa.a(this.currentAccount).d.f24169m, this.f37885b, this.f37886c);
        frameLayout.addView(this.f37890r, c8.ha.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.f37890r, 0, Z(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.g6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f21029m = frameLayout;
        baseSimpleGlass.f21030n = null;
        baseSimpleGlass.g(frameLayout, y4Var2, resourceProvider2);
        baseSimpleGlass.f21031o = new bi.g(6, this, frameLayout);
        this.f37889n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.y4 y4Var3 = this.simpleActionBar;
        y4Var3.setBackground(baseSimpleGlass.a(y4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.oj ojVar;
        if (i7 == org.telegram.messenger.qs.f25109x5) {
            Object obj = objArr[0];
            di.l6 l6Var = this.d;
            if (obj == l6Var) {
                jg.l1 l1Var = this.f37890r;
                if (l1Var != null) {
                    b0(l1Var.a(l6Var), true);
                }
                TextView textView = this.f37892w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.id.G(l6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.I0 && (ojVar = this.f37888f) != null && ojVar.f45471a != null && ((Integer) objArr[0]).intValue() == this.f37888f.f45471a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.l1 l1Var2 = this.f37890r;
            if (l1Var2 != null) {
                l1Var2.b(intValue, this.f37885b, this.f37886c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        di.l6 l6Var = this.d;
        arrayList.add(l6Var);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25109x5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.I0);
        l6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25109x5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
