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
public final class v40 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f31383a;
    public final String f31384b;
    public final String f31385c;
    public final ai.w8 d;
    public ai.x5 f31386e;
    public org.telegram.ui.nk f31387f;
    public FrameLayout h;
    public s40 f31388n;
    public gg.m1 f31389r;
    public FrameLayout f31390s;
    public TextView v;
    public float f31391w;
    public ValueAnimator f31392x;
    public boolean f31393y;

    public v40(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        setResourceProvider(c6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f31384b = trim.substring(0, indexOf);
            this.f31385c = trim.substring(indexOf + 1);
        } else {
            this.f31384b = trim;
            this.f31385c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31384b);
        if (!TextUtils.isEmpty(this.f31385c)) {
            str2 = "@" + this.f31385c;
        }
        sb2.append(str2);
        this.f31383a = sb2.toString();
        this.d = new ai.w8(this.currentAccount, this.f31385c, this.f31384b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.fo foVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f31393y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            s40 s40Var = this.f31388n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            s40Var.setScaleX(f10);
            s40 s40Var2 = this.f31388n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            s40Var2.setScaleY(f11);
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
            org.telegram.ui.nk nkVar = this.f31387f;
            if (nkVar != null && (foVar = nkVar.f38109a) != null && (w0Var = foVar.L3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f31387f.f38109a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f31393y == z10) {
        } else {
            this.f31393y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new t40(this, 1));
            this.F.addListener(new u40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(js.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f31389r.animate().cancel();
        ValueAnimator valueAnimator = this.f31392x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.m1 m1Var = this.f31389r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            gg.m1 m1Var2 = this.f31389r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            ai.x5 x5Var = this.f31386e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            x5Var.setTranslationY(f11);
            ai.x5 x5Var2 = this.f31386e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            x5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f31389r.setVisibility(0);
        ViewPropertyAnimator animate = this.f31389r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(26, this, z10)).setDuration(320L);
        js jsVar = js.h;
        duration.setInterpolator(jsVar).start();
        float f12 = this.f31391w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f31392x = ofFloat;
        ofFloat.addUpdateListener(new t40(this, 0));
        this.f31392x.addListener(new u40(this, z10, 0));
        this.f31392x.setDuration(320L);
        this.f31392x.setInterpolator(jsVar);
        this.f31392x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f31383a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar3.E(getThemedColor(i11), false);
        this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.h6.f20877u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.lc(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.x5 x5Var = new ai.x5(context, 16);
        this.f31386e = x5Var;
        frameLayout.addView(x5Var, w7.w5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nk nkVar = new org.telegram.ui.nk(context, getParentLayout(), bundle, 1);
        nkVar.h = false;
        this.f31387f = nkVar;
        this.f31386e.addView(nkVar, w7.w5.e(-1, -1, 119));
        s40 s40Var = new s40(this, context, new zv0(null), this, new Object(), this.resourceProvider);
        this.f31388n = s40Var;
        if (s40Var.getSearchOptionsItem() != null) {
            this.f31388n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f31388n.setPinnedToTop(true);
        this.f31388n.f26947r0.setTranslationY(0.0f);
        if (this.f31388n.getSearchOptionsItem() != null) {
            this.f31388n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f31388n.setBackgroundColor(getThemedColor(i10));
        s40 s40Var2 = this.f31388n;
        ai.w8 w8Var = this.d;
        s40Var2.T1 = w8Var;
        pu0 pu0Var = s40Var2.f26914c0;
        pu0Var.f25797s = w8Var;
        pu0Var.l();
        ew0 ew0Var = s40Var2.f26917d0;
        ew0Var.f25797s = w8Var;
        ew0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f31388n, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 49.0f, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31390s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20953ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
        this.f31390s.addView(this.v, w7.w5.a(-2.0f, 18.0f, 0.0f, 18.0f, 0.0f, -1, 19));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, this.resourceProvider));
        this.f31390s.addView(view, w7.w5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f31390s, w7.w5.e(-1, 49, 87));
        this.f31386e.addView(this.h, w7.w5.e(-1, -1, 119));
        gg.m1 m1Var = new gg.m1(context, this.resourceProvider);
        this.f31389r = m1Var;
        m1Var.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.h6.f20651i6)));
        this.f31389r.setOnClickListener(new f0(this, 24));
        V(this.f31389r.a(w8Var), false);
        this.f31389r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f31384b, this.f31385c);
        frameLayout.addView(this.f31389r, w7.w5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.nk nkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.w8 w8Var = this.d;
            if (obj == w8Var) {
                gg.m1 m1Var = this.f31389r;
                if (m1Var != null) {
                    V(m1Var.a(w8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (nkVar = this.f31387f) != null && nkVar.f38109a != null && ((Integer) objArr[0]).intValue() == this.f31387f.f38109a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.m1 m1Var2 = this.f31389r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f31384b, this.f31385c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, true)) > 0.699999988079071d) {
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
