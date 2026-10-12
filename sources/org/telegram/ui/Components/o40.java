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
public final class o40 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f27829a;
    public final String f27830b;
    public final String f27831c;
    public final bi.g8 d;
    public bi.i5 e;
    public org.telegram.ui.nk f27832f;
    public FrameLayout h;
    public l40 f27833n;
    public hg.m1 f27834r;
    public FrameLayout f27835s;
    public TextView v;
    public float f27836w;
    public ValueAnimator f27837x;
    public boolean f27838y;

    public o40(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        setResourceProvider(c6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f27830b = trim.substring(0, indexOf);
            this.f27831c = trim.substring(indexOf + 1);
        } else {
            this.f27830b = trim;
            this.f27831c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27830b);
        if (!TextUtils.isEmpty(this.f27831c)) {
            str2 = "@" + this.f27831c;
        }
        sb2.append(str2);
        this.f27829a = sb2.toString();
        this.d = new bi.g8(this.currentAccount, this.f27831c, this.f27830b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.go goVar;
        bi.o0 o0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f27838y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            l40 l40Var = this.f27833n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            l40Var.setScaleX(f10);
            l40 l40Var2 = this.f27833n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            l40Var2.setScaleY(f11);
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
            org.telegram.ui.nk nkVar = this.f27832f;
            if (nkVar != null && (goVar = nkVar.f36887a) != null && (o0Var = goVar.L3) != null) {
                o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f27832f.f36887a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f27838y == z10) {
        } else {
            this.f27838y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new m40(this, 1));
            this.F.addListener(new n40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(es.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f27834r.animate().cancel();
        ValueAnimator valueAnimator = this.f27837x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            hg.m1 m1Var = this.f27834r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            hg.m1 m1Var2 = this.f27834r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            bi.i5 i5Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            i5Var.setTranslationY(f11);
            bi.i5 i5Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            i5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f27834r.setVisibility(0);
        ViewPropertyAnimator animate = this.f27834r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ah.t(27, this, z10)).setDuration(320L);
        es esVar = es.h;
        duration.setInterpolator(esVar).start();
        float f12 = this.f27836w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f27837x = ofFloat;
        ofFloat.addUpdateListener(new m40(this, 0));
        this.f27837x.addListener(new n40(this, z10, 0));
        this.f27837x.setDuration(320L);
        this.f27837x.setInterpolator(esVar);
        this.f27837x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f27829a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar3.D(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.f20218u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        bi.i5 i5Var = new bi.i5(context, 16);
        this.e = i5Var;
        frameLayout.addView(i5Var, w7.a6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nk nkVar = new org.telegram.ui.nk(context, getParentLayout(), bundle, 1);
        nkVar.h = false;
        this.f27832f = nkVar;
        this.e.addView(nkVar, w7.a6.e(-1, -1, 119));
        l40 l40Var = new l40(this, context, new pv0(null), this, new Object(), this.resourceProvider);
        this.f27833n = l40Var;
        if (l40Var.getSearchOptionsItem() != null) {
            this.f27833n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f27833n.setPinnedToTop(true);
        this.f27833n.f31378r0.setTranslationY(0.0f);
        if (this.f27833n.getSearchOptionsItem() != null) {
            this.f27833n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f27833n.setBackgroundColor(getThemedColor(i10));
        l40 l40Var2 = this.f27833n;
        bi.g8 g8Var = this.d;
        l40Var2.T1 = g8Var;
        fu0 fu0Var = l40Var2.f31346c0;
        fu0Var.f29784s = g8Var;
        fu0Var.l();
        uv0 uv0Var = l40Var2.f31349d0;
        uv0Var.f29784s = g8Var;
        uv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f27833n, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 49.0f, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27835s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20295ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", g8Var.J, new Object[0]));
        this.f27835s.addView(this.v, w7.a6.a(-2.0f, 18.0f, 0.0f, 18.0f, 0.0f, -1, 19));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, this.resourceProvider));
        this.f27835s.addView(view, w7.a6.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f27835s, w7.a6.e(-1, 49, 87));
        this.e.addView(this.h, w7.a6.e(-1, -1, 119));
        hg.m1 m1Var = new hg.m1(context, this.resourceProvider);
        this.f27834r = m1Var;
        m1Var.setBackground(org.telegram.ui.ActionBar.g6.h0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.f19990i6)));
        this.f27834r.setOnClickListener(new f0(this, 24));
        V(this.f27834r.a(g8Var), false);
        this.f27834r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f27830b, this.f27831c);
        frameLayout.addView(this.f27834r, w7.a6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.nk nkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            bi.g8 g8Var = this.d;
            if (obj == g8Var) {
                hg.m1 m1Var = this.f27834r;
                if (m1Var != null) {
                    V(m1Var.a(g8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", g8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (nkVar = this.f27832f) != null && nkVar.f36887a != null && ((Integer) objArr[0]).intValue() == this.f27832f.f36887a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            hg.m1 m1Var2 = this.f27834r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f27830b, this.f27831c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        bi.g8 g8Var = this.d;
        arrayList.add(g8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        g8Var.p(18, true);
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
