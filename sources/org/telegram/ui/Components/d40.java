package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class d40 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f23491a;
    public final String f23492b;
    public final String f23493c;
    public final ai.v8 d;
    public ai.w5 e;
    public org.telegram.ui.fk f23494f;
    public FrameLayout h;
    public a40 f23495n;
    public gg.n1 f23496r;
    public FrameLayout f23497s;
    public TextView v;
    public float f23498w;
    public ValueAnimator f23499x;
    public boolean f23500y;

    public d40(String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null);
        setResourceProvider(d6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f23492b = trim.substring(0, indexOf);
            this.f23493c = trim.substring(indexOf + 1);
        } else {
            this.f23492b = trim;
            this.f23493c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23492b);
        if (!TextUtils.isEmpty(this.f23493c)) {
            str2 = "@" + this.f23493c;
        }
        sb2.append(str2);
        this.f23491a = sb2.toString();
        this.d = new ai.v8(this.currentAccount, this.f23493c, this.f23492b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f23500y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            a40 a40Var = this.f23495n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            a40Var.setScaleX(f10);
            a40 a40Var2 = this.f23495n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            a40Var2.setScaleY(f11);
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
            org.telegram.ui.fk fkVar = this.f23494f;
            if (fkVar != null && (xnVar = fkVar.f40192a) != null && (w0Var = xnVar.L3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f23494f.f40192a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f23500y == z10) {
        } else {
            this.f23500y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new b40(this, 1));
            this.F.addListener(new c40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(sr.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f23496r.animate().cancel();
        ValueAnimator valueAnimator = this.f23499x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.n1 n1Var = this.f23496r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n1Var.setVisibility(i10);
            gg.n1 n1Var2 = this.f23496r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            n1Var2.setTranslationY(f10);
            ai.w5 w5Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            w5Var.setTranslationY(f11);
            ai.w5 w5Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            w5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f23496r.setVisibility(0);
        ViewPropertyAnimator animate = this.f23496r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(25, this, z10)).setDuration(320L);
        sr srVar = sr.h;
        duration.setInterpolator(srVar).start();
        float f12 = this.f23498w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f23499x = ofFloat;
        ofFloat.addUpdateListener(new b40(this, 0));
        this.f23499x.addListener(new c40(this, z10, 0));
        this.f23499x.setDuration(320L);
        this.f23499x.setInterpolator(srVar);
        this.f23499x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f23491a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19059d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar3.B(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.h6.f19374u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.w5 w5Var = new ai.w5(context, 16);
        this.e = w5Var;
        frameLayout.addView(w5Var, w7.y5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f23494f = fkVar;
        this.e.addView(fkVar, w7.y5.e(-1, -1, 119));
        a40 a40Var = new a40(this, context, new cv0(null), this, new Object(), this.resourceProvider);
        this.f23495n = a40Var;
        if (a40Var.getSearchOptionsItem() != null) {
            this.f23495n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f23495n.setPinnedToTop(true);
        this.f23495n.f25856r0.setTranslationY(0.0f);
        if (this.f23495n.getSearchOptionsItem() != null) {
            this.f23495n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f23495n.setBackgroundColor(getThemedColor(i10));
        a40 a40Var2 = this.f23495n;
        ai.v8 v8Var = this.d;
        a40Var2.T1 = v8Var;
        st0 st0Var = a40Var2.f25824c0;
        st0Var.f24874s = v8Var;
        st0Var.l();
        hv0 hv0Var = a40Var2.f25827d0;
        hv0Var.f24874s = v8Var;
        hv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f23495n, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f23497s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19450ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
        this.f23497s.addView(this.v, w7.y5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d7, this.resourceProvider));
        this.f23497s.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f23497s, w7.y5.e(-1, 49, 87));
        this.e.addView(this.h, w7.y5.e(-1, -1, 119));
        gg.n1 n1Var = new gg.n1(context, this.resourceProvider);
        this.f23496r = n1Var;
        n1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.h6.f19148i6)));
        this.f23496r.setOnClickListener(new f0(this, 25));
        V(this.f23496r.a(v8Var), false);
        this.f23496r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f23492b, this.f23493c);
        frameLayout.addView(this.f23496r, w7.y5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.fk fkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.v8 v8Var = this.d;
            if (obj == v8Var) {
                gg.n1 n1Var = this.f23496r;
                if (n1Var != null) {
                    V(n1Var.a(v8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (fkVar = this.f23494f) != null && fkVar.f40192a != null && ((Integer) objArr[0]).intValue() == this.f23494f.f40192a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.n1 n1Var2 = this.f23496r;
            if (n1Var2 != null) {
                n1Var2.b(intValue, this.f23492b, this.f23493c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ai.v8 v8Var = this.d;
        arrayList.add(v8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        v8Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }
}
