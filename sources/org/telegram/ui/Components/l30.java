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
public final class l30 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public ValueAnimator B;
    public final String f30308a;
    public final String f30309b;
    public final String f30310c;
    public final ih.h6 d;
    public dh.g f30311e;
    public org.telegram.ui.wj f30312f;
    public FrameLayout h;
    public i30 f30313n;
    public of.i1 f30314r;
    public FrameLayout f30315s;
    public TextView v;
    public float f30316w;
    public ValueAnimator f30317x;
    public boolean f30318y;

    public l30(String str, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null);
        setResourceProvider(b6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f30309b = trim.substring(0, indexOf);
            this.f30310c = trim.substring(indexOf + 1);
        } else {
            this.f30309b = trim;
            this.f30310c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30309b);
        if (!TextUtils.isEmpty(this.f30310c)) {
            str2 = "@" + this.f30310c;
        }
        sb2.append(str2);
        this.f30308a = sb2.toString();
        this.d = new ih.h6(this.currentAccount, this.f30310c, this.f30309b);
    }

    public final void T(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i9 = 0;
        float f13 = 0.0f;
        if (!z11) {
            this.f30318y = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.A = f10;
            i30 i30Var = this.f30313n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            i30Var.setScaleX(f11);
            i30 i30Var2 = this.f30313n;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            i30Var2.setScaleY(f12);
            FrameLayout frameLayout = this.h;
            if (z10) {
                f13 = 1.0f;
            }
            frameLayout.setAlpha(f13);
            FrameLayout frameLayout2 = this.h;
            if (!z10) {
                i9 = 8;
            }
            frameLayout2.setVisibility(i9);
            org.telegram.ui.wj wjVar = this.f30312f;
            if (wjVar != null && (rnVar = wjVar.f42731a) != null && (f1Var = rnVar.H3) != null) {
                f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
                this.f30312f.f42731a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
            }
        } else if (this.f30318y == z10) {
        } else {
            this.f30318y = z10;
            this.h.setVisibility(0);
            float f14 = this.A;
            if (z10) {
                f13 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new j30(this, 1));
            this.B.addListener(new k30(this, z10, 1));
            this.B.setDuration(320L);
            this.B.setInterpolator(gr.h);
            this.B.start();
        }
    }

    public final void U(boolean z10, boolean z11) {
        float f10;
        int i9;
        float f11;
        int i10;
        this.f30314r.animate().cancel();
        ValueAnimator valueAnimator = this.f30317x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z11) {
            of.i1 i1Var = this.f30314r;
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            i1Var.setVisibility(i9);
            of.i1 i1Var2 = this.f30314r;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(48.0f);
            }
            i1Var2.setTranslationY(f11);
            dh.g gVar = this.f30311e;
            if (z10) {
                f12 = AndroidUtilities.dp(48.0f);
            }
            gVar.setTranslationY(f12);
            dh.g gVar2 = this.f30311e;
            if (z10) {
                i10 = AndroidUtilities.dp(48.0f);
            } else {
                i10 = 0;
            }
            gVar2.setPadding(0, 0, 0, i10);
            return;
        }
        this.f30314r.setVisibility(0);
        ViewPropertyAnimator animate = this.f30314r.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new eh.f(29, this, z10)).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        float f13 = this.f30316w;
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f30317x = ofFloat;
        ofFloat.addUpdateListener(new j30(this, 0));
        this.f30317x.addListener(new k30(this, z10, 0));
        this.f30317x.setDuration(320L);
        this.f30317x.setInterpolator(grVar);
        this.f30317x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f30308a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        kVar2.setBackgroundColor(getThemedColor(i9));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        kVar3.C(getThemedColor(i10), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23305u8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i9));
        dh.g gVar = new dh.g(context, 15);
        this.f30311e = gVar;
        frameLayout.addView(gVar, g7.e6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.wj wjVar = new org.telegram.ui.wj(context, getParentLayout(), bundle, 1);
        wjVar.h = false;
        this.f30312f = wjVar;
        this.f30311e.addView(wjVar, g7.e6.e(-1, -1, 119));
        i30 i30Var = new i30(this, context, new wt0(null), this, new Object(), this.resourceProvider);
        this.f30313n = i30Var;
        if (i30Var.getSearchOptionsItem() != null) {
            this.f30313n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f30313n.setPinnedToTop(true);
        this.f30313n.f28150n0.setTranslationY(0.0f);
        if (this.f30313n.getSearchOptionsItem() != null) {
            this.f30313n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f30313n.setBackgroundColor(getThemedColor(i9));
        i30 i30Var2 = this.f30313n;
        ih.h6 h6Var = this.d;
        i30Var2.P1 = h6Var;
        ms0 ms0Var = i30Var2.V;
        ms0Var.f27281s = h6Var;
        ms0Var.l();
        bu0 bu0Var = i30Var2.W;
        bu0Var.f27281s = h6Var;
        bu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i9));
        this.h.addView(this.f30313n, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30315s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i9));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23376ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", h6Var.J, new Object[0]));
        this.f30315s.addView(this.v, g7.e6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.resourceProvider));
        this.f30315s.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f30315s, g7.e6.e(-1, 49, 87));
        this.f30311e.addView(this.h, g7.e6.e(-1, -1, 119));
        of.i1 i1Var = new of.i1(context, this.resourceProvider);
        this.f30314r = i1Var;
        i1Var.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(i9), getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6)));
        this.f30314r.setOnClickListener(new f0(this, 25));
        U(this.f30314r.a(h6Var), false);
        this.f30314r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f30309b, this.f30310c);
        frameLayout.addView(this.f30314r, g7.e6.e(-1, 48, 55));
        T(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.wj wjVar;
        if (i9 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ih.h6 h6Var = this.d;
            if (obj == h6Var) {
                of.i1 i1Var = this.f30314r;
                if (i1Var != null) {
                    U(i1Var.a(h6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", h6Var.J, new Object[0]));
                }
            }
        } else if (i9 == NotificationCenter.hashtagSearchUpdated && (wjVar = this.f30312f) != null && wjVar.f42731a != null && ((Integer) objArr[0]).intValue() == this.f30312f.f42731a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            of.i1 i1Var2 = this.f30314r;
            if (i1Var2 != null) {
                i1Var2.b(intValue, this.f30309b, this.f30310c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ih.h6 h6Var = this.d;
        arrayList.add(h6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        h6Var.p(18, true);
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
