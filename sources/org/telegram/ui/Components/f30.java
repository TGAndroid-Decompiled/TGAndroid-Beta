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
public final class f30 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String f35045a;
    public final String f35046b;
    public final String f35047c;
    public final fi.b6 d;
    public bi.v2 f35048e;
    public org.telegram.ui.nj f35049f;
    public FrameLayout h;
    public c30 f35050n;
    public jg.k1 f35051r;
    public FrameLayout f35052s;
    public TextView f35053w;
    public float f35054x;
    public ValueAnimator f35055y;

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
            this.f35046b = trim.substring(0, indexOf);
            this.f35047c = trim.substring(indexOf + 1);
        } else {
            this.f35046b = trim;
            this.f35047c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35046b);
        if (!TextUtils.isEmpty(this.f35047c)) {
            str2 = "@" + this.f35047c;
        }
        sb2.append(str2);
        this.f35045a = sb2.toString();
        this.d = new fi.b6(this.currentAccount, this.f35047c, this.f35046b);
    }

    public final int Z() {
        int i7;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i7 = org.telegram.messenger.g0.f24004m;
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
            c30 c30Var = this.f35050n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            c30Var.setScaleX(f11);
            c30 c30Var2 = this.f35050n;
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
            org.telegram.ui.nj njVar = this.f35049f;
            if (njVar != null && (cnVar = njVar.f46973a) != null && (b1Var = cnVar.f45907a4) != null) {
                b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
                this.f35049f.f46973a.f45907a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
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
        this.f35051r.animate().cancel();
        ValueAnimator valueAnimator = this.f35055y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            jg.k1 k1Var = this.f35051r;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k1Var.setVisibility(i7);
            jg.k1 k1Var2 = this.f35051r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(48.0f);
            }
            k1Var2.setTranslationY(f11);
            bi.v2 v2Var = this.f35048e;
            if (z10) {
                f12 = org.telegram.messenger.g0.L(48.0f);
            }
            v2Var.setTranslationY(f12);
            bi.v2 v2Var2 = this.f35048e;
            if (z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            } else {
                i10 = 0;
            }
            v2Var2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f35051r.setVisibility(0);
        ViewPropertyAnimator animate = this.f35051r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -org.telegram.messenger.g0.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new ch.k(26, this, z10)).setDuration(320L);
        nr nrVar = nr.h;
        duration.setInterpolator(nrVar).start();
        float f13 = this.f35054x;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f35055y = ofFloat;
        ofFloat.addUpdateListener(new d30(this, 0));
        this.f35055y.addListener(new e30(this, z10, 0));
        this.f35055y.setDuration(320L);
        this.f35055y.setInterpolator(nrVar);
        this.f35055y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        String str = this.f35045a;
        z4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.v2 v2Var = new bi.v2(context, 17);
        this.f35048e = v2Var;
        v2Var.setClipChildren(false);
        frameLayout.addView(this.f35048e, c8.na.e(-1, -1, 119));
        org.telegram.messenger.g0.z3(this.f35048e, 0, Z(), 0, 0);
        org.telegram.messenger.na.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nj njVar = new org.telegram.ui.nj(context, getParentLayout(), bundle, 1);
        njVar.h = false;
        this.f35049f = njVar;
        this.f35048e.addView(njVar, c8.na.e(-1, -1, 119));
        c30 c30Var = new c30(this, context, new bt0(null), this, new Object(), this.resourceProvider);
        this.f35050n = c30Var;
        if (c30Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.t6.s(this.f35050n.getSearchOptionsItem(), org.telegram.ui.ActionBar.m6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f35050n.setPinnedToTop(true);
        this.f35050n.f36626u0.setTranslationY(0.0f);
        if (this.f35050n.getSearchOptionsItem() != null) {
            this.f35050n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        c30 c30Var2 = this.f35050n;
        fi.b6 b6Var = this.d;
        c30Var2.X1 = b6Var;
        sr0 sr0Var = c30Var2.f36582f0;
        sr0Var.f35630s = b6Var;
        sr0Var.f();
        gt0 gt0Var = c30Var2.f36585g0;
        gt0Var.f35630s = b6Var;
        gt0Var.f();
        this.f35050n.n1(0, ri.a.c(org.telegram.messenger.g0.f24004m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f35050n, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f35052s = frameLayout3;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.f35053w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f35053w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.t6.U(this.f35053w, org.telegram.ui.ActionBar.m6.qf, getResourceProvider());
        this.f35053w.setText(org.telegram.messenger.hd.G(b6Var.J, "FoundStories", new Object[0]));
        this.f35052s.addView(this.f35053w, c8.na.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29348d7, view, this.resourceProvider);
        this.f35052s.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24009p, 55));
        this.h.addView(this.f35052s, c8.na.e(-1, 49, 87));
        this.f35048e.addView(this.h, c8.na.e(-1, -1, 119));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.f35051r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(k1Var, i02, M, M2, resourceProvider);
        this.f35051r.setOnClickListener(new o0(this, 26));
        b0(this.f35051r.a(b6Var), false);
        this.f35051r.b(org.telegram.messenger.na.a(this.currentAccount).d.f25519m, this.f35046b, this.f35047c);
        frameLayout.addView(this.f35051r, c8.na.e(-1, 48, 55));
        org.telegram.messenger.g0.z3(this.f35051r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.h6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f56634m = frameLayout;
        baseSimpleGlass.f56635n = null;
        baseSimpleGlass.g(frameLayout, z4Var2, resourceProvider2);
        baseSimpleGlass.f56636o = new di.f(4, this, frameLayout);
        this.f35050n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.z4 z4Var3 = this.simpleActionBar;
        z4Var3.setBackground(baseSimpleGlass.a(z4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.nj njVar;
        if (i7 == org.telegram.messenger.ls.A5) {
            Object obj = objArr[0];
            fi.b6 b6Var = this.d;
            if (obj == b6Var) {
                jg.k1 k1Var = this.f35051r;
                if (k1Var != null) {
                    b0(k1Var.a(b6Var), true);
                }
                TextView textView = this.f35053w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.G(b6Var.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i7 == org.telegram.messenger.ls.I0 && (njVar = this.f35049f) != null && njVar.f46973a != null && ((Integer) objArr[0]).intValue() == this.f35049f.f46973a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var2 = this.f35051r;
            if (k1Var2 != null) {
                k1Var2.b(intValue, this.f35046b, this.f35047c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().R1().I;
        fi.b6 b6Var = this.d;
        arrayList.add(b6Var);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.A5);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.I0);
        b6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().R1().I.remove(this.d);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.A5);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
