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
public final class k40 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f27698a;
    public final String f27699b;
    public final String f27700c;
    public final ci.u6 d;
    public ci.i4 e;
    public org.telegram.ui.ak f27701f;
    public FrameLayout h;
    public h40 f27702n;
    public hg.m1 f27703r;
    public FrameLayout f27704s;
    public TextView v;
    public float f27705w;
    public ValueAnimator f27706x;
    public boolean f27707y;

    public k40(String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null);
        setResourceProvider(d6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f27699b = trim.substring(0, indexOf);
            this.f27700c = trim.substring(indexOf + 1);
        } else {
            this.f27699b = trim;
            this.f27700c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27699b);
        if (!TextUtils.isEmpty(this.f27700c)) {
            str2 = "@" + this.f27700c;
        }
        sb2.append(str2);
        this.f27698a = sb2.toString();
        this.d = new ci.u6(this.currentAccount, this.f27700c, this.f27699b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.rn rnVar;
        ai.u1 u1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f27707y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            h40 h40Var = this.f27702n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            h40Var.setScaleX(f10);
            h40 h40Var2 = this.f27702n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            h40Var2.setScaleY(f11);
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
            org.telegram.ui.ak akVar = this.f27701f;
            if (akVar != null && (rnVar = akVar.f41490a) != null && (u1Var = rnVar.L3) != null) {
                u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f27701f.f41490a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f27707y == z10) {
        } else {
            this.f27707y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new i40(this, 1));
            this.F.addListener(new j40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(bs.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f27703r.animate().cancel();
        ValueAnimator valueAnimator = this.f27706x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            hg.m1 m1Var = this.f27703r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            hg.m1 m1Var2 = this.f27703r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            ci.i4 i4Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            i4Var.setTranslationY(f11);
            ci.i4 i4Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            i4Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f27703r.setVisibility(0);
        ViewPropertyAnimator animate = this.f27703r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ah.t(29, this, z10)).setDuration(320L);
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        float f12 = this.f27705w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f27706x = ofFloat;
        ofFloat.addUpdateListener(new i40(this, 0));
        this.f27706x.addListener(new j40(this, z10, 0));
        this.f27706x.setDuration(320L);
        this.f27706x.setInterpolator(bsVar);
        this.f27706x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f27698a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20987d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.h6.f21305u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ci.i4 i4Var = new ci.i4(context, 16);
        this.e = i4Var;
        frameLayout.addView(i4Var, w7.z5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ak akVar = new org.telegram.ui.ak(context, getParentLayout(), bundle, 1);
        akVar.h = false;
        this.f27701f = akVar;
        this.e.addView(akVar, w7.z5.e(-1, -1, 119));
        h40 h40Var = new h40(this, context, new lv0(null), this, new Object(), this.resourceProvider);
        this.f27702n = h40Var;
        if (h40Var.getSearchOptionsItem() != null) {
            this.f27702n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f27702n.setPinnedToTop(true);
        this.f27702n.f30722r0.setTranslationY(0.0f);
        if (this.f27702n.getSearchOptionsItem() != null) {
            this.f27702n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f27702n.setBackgroundColor(getThemedColor(i10));
        h40 h40Var2 = this.f27702n;
        ci.u6 u6Var = this.d;
        h40Var2.T1 = u6Var;
        bu0 bu0Var = h40Var2.f30690c0;
        bu0Var.f29721s = u6Var;
        bu0Var.l();
        qv0 qv0Var = h40Var2.f30693d0;
        qv0Var.f29721s = u6Var;
        qv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f27702n, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27704s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21382ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", u6Var.J, new Object[0]));
        this.f27704s.addView(this.v, w7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20988d7, this.resourceProvider));
        this.f27704s.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f27704s, w7.z5.e(-1, 49, 87));
        this.e.addView(this.h, w7.z5.e(-1, -1, 119));
        hg.m1 m1Var = new hg.m1(context, this.resourceProvider);
        this.f27703r = m1Var;
        m1Var.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.h6.f21076i6)));
        this.f27703r.setOnClickListener(new f0(this, 24));
        V(this.f27703r.a(u6Var), false);
        this.f27703r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f27699b, this.f27700c);
        frameLayout.addView(this.f27703r, w7.z5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ak akVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ci.u6 u6Var = this.d;
            if (obj == u6Var) {
                hg.m1 m1Var = this.f27703r;
                if (m1Var != null) {
                    V(m1Var.a(u6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", u6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (akVar = this.f27701f) != null && akVar.f41490a != null && ((Integer) objArr[0]).intValue() == this.f27701f.f41490a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            hg.m1 m1Var2 = this.f27703r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f27699b, this.f27700c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ci.u6 u6Var = this.d;
        arrayList.add(u6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        u6Var.p(18, true);
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
