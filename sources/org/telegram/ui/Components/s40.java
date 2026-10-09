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
public final class s40 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f30627a;
    public final String f30628b;
    public final String f30629c;
    public final ai.w8 d;
    public ai.x5 f30630e;
    public org.telegram.ui.jk f30631f;
    public FrameLayout h;
    public p40 f30632n;
    public gg.m1 f30633r;
    public FrameLayout f30634s;
    public TextView v;
    public float f30635w;
    public ValueAnimator f30636x;
    public boolean f30637y;

    public s40(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f30628b = trim.substring(0, indexOf);
            this.f30629c = trim.substring(indexOf + 1);
        } else {
            this.f30628b = trim;
            this.f30629c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30628b);
        if (!TextUtils.isEmpty(this.f30629c)) {
            str2 = "@" + this.f30629c;
        }
        sb2.append(str2);
        this.f30627a = sb2.toString();
        this.d = new ai.w8(this.currentAccount, this.f30629c, this.f30628b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f30637y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            p40 p40Var = this.f30632n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            p40Var.setScaleX(f10);
            p40 p40Var2 = this.f30632n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            p40Var2.setScaleY(f11);
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
            org.telegram.ui.jk jkVar = this.f30631f;
            if (jkVar != null && (aoVar = jkVar.f36359a) != null && (w0Var = aoVar.L3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f30631f.f36359a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f30637y == z10) {
        } else {
            this.f30637y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new q40(this, 1));
            this.F.addListener(new r40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(hs.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f30633r.animate().cancel();
        ValueAnimator valueAnimator = this.f30636x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.m1 m1Var = this.f30633r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            gg.m1 m1Var2 = this.f30633r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            ai.x5 x5Var = this.f30630e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            x5Var.setTranslationY(f11);
            ai.x5 x5Var2 = this.f30630e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            x5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f30633r.setVisibility(0);
        ViewPropertyAnimator animate = this.f30633r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(26, this, z10)).setDuration(320L);
        hs hsVar = hs.h;
        duration.setInterpolator(hsVar).start();
        float f12 = this.f30635w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f30636x = ofFloat;
        ofFloat.addUpdateListener(new q40(this, 0));
        this.f30636x.addListener(new r40(this, z10, 0));
        this.f30636x.setDuration(320L);
        this.f30636x.setInterpolator(hsVar);
        this.f30636x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f30627a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        kVar3.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.i6.f21112u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.x5 x5Var = new ai.x5(context, 16);
        this.f30630e = x5Var;
        frameLayout.addView(x5Var, w7.x5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(context, getParentLayout(), bundle, 1);
        jkVar.h = false;
        this.f30631f = jkVar;
        this.f30630e.addView(jkVar, w7.x5.e(-1, -1, 119));
        p40 p40Var = new p40(this, context, new tv0(null), this, new Object(), this.resourceProvider);
        this.f30632n = p40Var;
        if (p40Var.getSearchOptionsItem() != null) {
            this.f30632n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f30632n.setPinnedToTop(true);
        this.f30632n.f25156r0.setTranslationY(0.0f);
        if (this.f30632n.getSearchOptionsItem() != null) {
            this.f30632n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f30632n.setBackgroundColor(getThemedColor(i10));
        p40 p40Var2 = this.f30632n;
        ai.w8 w8Var = this.d;
        p40Var2.T1 = w8Var;
        ju0 ju0Var = p40Var2.f25123c0;
        ju0Var.f33369s = w8Var;
        ju0Var.l();
        yv0 yv0Var = p40Var2.f25126d0;
        yv0Var.f33369s = w8Var;
        yv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f30632n, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 49.0f, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30634s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21188ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
        this.f30634s.addView(this.v, w7.x5.a(-2.0f, 18.0f, 0.0f, 18.0f, 0.0f, -1, 19));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, this.resourceProvider));
        this.f30634s.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f30634s, w7.x5.e(-1, 49, 87));
        this.f30630e.addView(this.h, w7.x5.e(-1, -1, 119));
        gg.m1 m1Var = new gg.m1(context, this.resourceProvider);
        this.f30633r = m1Var;
        m1Var.setBackground(org.telegram.ui.ActionBar.i6.h0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.f20888i6)));
        this.f30633r.setOnClickListener(new f0(this, 24));
        V(this.f30633r.a(w8Var), false);
        this.f30633r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f30628b, this.f30629c);
        frameLayout.addView(this.f30633r, w7.x5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.jk jkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.w8 w8Var = this.d;
            if (obj == w8Var) {
                gg.m1 m1Var = this.f30633r;
                if (m1Var != null) {
                    V(m1Var.a(w8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (jkVar = this.f30631f) != null && jkVar.f36359a != null && ((Integer) objArr[0]).intValue() == this.f30631f.f36359a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.m1 m1Var2 = this.f30633r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f30628b, this.f30629c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ai.w8 w8Var = this.d;
        arrayList.add(w8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        w8Var.p(18, true);
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
