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
public final class b40 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f24535a;
    public final String f24536b;
    public final String f24537c;
    public final bi.d8 d;
    public bi.g5 f24538e;
    public org.telegram.ui.ik f24539f;
    public FrameLayout h;
    public y30 f24540n;
    public hg.n1 f24541r;
    public FrameLayout f24542s;
    public TextView v;
    public float f24543w;
    public ValueAnimator f24544x;
    public boolean f24545y;

    public b40(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        setResourceProvider(f6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f24536b = trim.substring(0, indexOf);
            this.f24537c = trim.substring(indexOf + 1);
        } else {
            this.f24536b = trim;
            this.f24537c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24536b);
        if (!TextUtils.isEmpty(this.f24537c)) {
            str2 = "@" + this.f24537c;
        }
        sb2.append(str2);
        this.f24535a = sb2.toString();
        this.d = new bi.d8(this.currentAccount, this.f24537c, this.f24536b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.eo eoVar;
        bi.o0 o0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f24545y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            y30 y30Var = this.f24540n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            y30Var.setScaleX(f10);
            y30 y30Var2 = this.f24540n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            y30Var2.setScaleY(f11);
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
            org.telegram.ui.ik ikVar = this.f24539f;
            if (ikVar != null && (eoVar = ikVar.f36437a) != null && (o0Var = eoVar.L3) != null) {
                o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f24539f.f36437a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f24545y == z10) {
        } else {
            this.f24545y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new z30(this, 1));
            this.F.addListener(new a40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(pr.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f24541r.animate().cancel();
        ValueAnimator valueAnimator = this.f24544x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            hg.n1 n1Var = this.f24541r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n1Var.setVisibility(i10);
            hg.n1 n1Var2 = this.f24541r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            n1Var2.setTranslationY(f10);
            bi.g5 g5Var = this.f24538e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            g5Var.setTranslationY(f11);
            bi.g5 g5Var2 = this.f24538e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            g5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f24541r.setVisibility(0);
        ViewPropertyAnimator animate = this.f24541r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ah.u(25, this, z10)).setDuration(320L);
        pr prVar = pr.h;
        duration.setInterpolator(prVar).start();
        float f12 = this.f24543w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f24544x = ofFloat;
        ofFloat.addUpdateListener(new z30(this, 0));
        this.f24544x.addListener(new a40(this, z10, 0));
        this.f24544x.setDuration(320L);
        this.f24544x.setInterpolator(prVar);
        this.f24544x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f24535a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20974u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        bi.g5 g5Var = new bi.g5(context, 16);
        this.f24538e = g5Var;
        frameLayout.addView(g5Var, w7.x5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(context, getParentLayout(), bundle, 1);
        ikVar.h = false;
        this.f24539f = ikVar;
        this.f24538e.addView(ikVar, w7.x5.e(-1, -1, 119));
        y30 y30Var = new y30(this, context, new pu0(null), this, new Object(), this.resourceProvider);
        this.f24540n = y30Var;
        if (y30Var.getSearchOptionsItem() != null) {
            this.f24540n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f24540n.setPinnedToTop(true);
        this.f24540n.f32716r0.setTranslationY(0.0f);
        if (this.f24540n.getSearchOptionsItem() != null) {
            this.f24540n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f24540n.setBackgroundColor(getThemedColor(i10));
        y30 y30Var2 = this.f24540n;
        bi.d8 d8Var = this.d;
        y30Var2.T1 = d8Var;
        ft0 ft0Var = y30Var2.f32683c0;
        ft0Var.f30984s = d8Var;
        ft0Var.l();
        uu0 uu0Var = y30Var2.f32686d0;
        uu0Var.f30984s = d8Var;
        uu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f24540n, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24542s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f21050ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", d8Var.J, new Object[0]));
        this.f24542s.addView(this.v, w7.x5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, this.resourceProvider));
        this.f24542s.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f24542s, w7.x5.e(-1, 49, 87));
        this.f24538e.addView(this.h, w7.x5.e(-1, -1, 119));
        hg.n1 n1Var = new hg.n1(context, this.resourceProvider);
        this.f24541r = n1Var;
        n1Var.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6)));
        this.f24541r.setOnClickListener(new g0(this, 25));
        V(this.f24541r.a(d8Var), false);
        this.f24541r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f24536b, this.f24537c);
        frameLayout.addView(this.f24541r, w7.x5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ik ikVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            bi.d8 d8Var = this.d;
            if (obj == d8Var) {
                hg.n1 n1Var = this.f24541r;
                if (n1Var != null) {
                    V(n1Var.a(d8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", d8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (ikVar = this.f24539f) != null && ikVar.f36437a != null && ((Integer) objArr[0]).intValue() == this.f24539f.f36437a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            hg.n1 n1Var2 = this.f24541r;
            if (n1Var2 != null) {
                n1Var2.b(intValue, this.f24536b, this.f24537c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        bi.d8 d8Var = this.d;
        arrayList.add(d8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        d8Var.p(18, true);
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
