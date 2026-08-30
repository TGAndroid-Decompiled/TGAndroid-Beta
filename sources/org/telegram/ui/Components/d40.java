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
public final class d40 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public ValueAnimator C;
    public final String f24146a;
    public final String f24147b;
    public final String f24148c;
    public final nh.f6 d;
    public dh.d e;
    public org.telegram.ui.fk f24149f;
    public FrameLayout h;
    public a40 f24150n;
    public tf.x0 f24151r;
    public FrameLayout f24152s;
    public TextView v;
    public float f24153w;
    public ValueAnimator f24154x;
    public boolean f24155y;

    public d40(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        setResourceProvider(f6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f24147b = trim.substring(0, indexOf);
            this.f24148c = trim.substring(indexOf + 1);
        } else {
            this.f24147b = trim;
            this.f24148c = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24147b);
        if (!TextUtils.isEmpty(this.f24148c)) {
            str2 = "@" + this.f24148c;
        }
        sb.append(str2);
        this.f24146a = sb.toString();
        this.d = new nh.f6(this.currentAccount, this.f24148c, this.f24147b);
    }

    public final void U(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f13 = 0.0f;
        if (!z10) {
            this.f24155y = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.B = f10;
            a40 a40Var = this.f24150n;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            a40Var.setScaleX(f11);
            a40 a40Var2 = this.f24150n;
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            a40Var2.setScaleY(f12);
            FrameLayout frameLayout = this.h;
            if (z4) {
                f13 = 1.0f;
            }
            frameLayout.setAlpha(f13);
            FrameLayout frameLayout2 = this.h;
            if (!z4) {
                i10 = 8;
            }
            frameLayout2.setVisibility(i10);
            org.telegram.ui.fk fkVar = this.f24149f;
            if (fkVar != null && (ynVar = fkVar.f40837a) != null && (e1Var = ynVar.I3) != null) {
                e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
                this.f24149f.f40837a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
            }
        } else if (this.f24155y == z4) {
        } else {
            this.f24155y = z4;
            this.h.setVisibility(0);
            float f14 = this.B;
            if (z4) {
                f13 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new b40(this, 1));
            this.C.addListener(new c40(this, z4, 1));
            this.C.setDuration(320L);
            this.C.setInterpolator(nr.h);
            this.C.start();
        }
    }

    public final void V(boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        int i11;
        this.f24151r.animate().cancel();
        ValueAnimator valueAnimator = this.f24154x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z10) {
            tf.x0 x0Var = this.f24151r;
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x0Var.setVisibility(i10);
            tf.x0 x0Var2 = this.f24151r;
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(48.0f);
            }
            x0Var2.setTranslationY(f11);
            dh.d dVar = this.e;
            if (z4) {
                f12 = AndroidUtilities.dp(48.0f);
            }
            dVar.setTranslationY(f12);
            dh.d dVar2 = this.e;
            if (z4) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            dVar2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f24151r.setVisibility(0);
        ViewPropertyAnimator animate = this.f24151r.animate();
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new jh.f(23, this, z4)).setDuration(320L);
        nr nrVar = nr.h;
        duration.setInterpolator(nrVar).start();
        float f13 = this.f24153w;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f24154x = ofFloat;
        ofFloat.addUpdateListener(new b40(this, 0));
        this.f24154x.addListener(new c40(this, z4, 0));
        this.f24154x.setDuration(320L);
        this.f24154x.setInterpolator(nrVar);
        this.f24154x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f24146a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.f20209u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        dh.d dVar = new dh.d(context, 16);
        this.e = dVar;
        frameLayout.addView(dVar, k7.b6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f24149f = fkVar;
        this.e.addView(fkVar, k7.b6.e(-1, -1, 119));
        a40 a40Var = new a40(this, context, new qu0(null), this, new Object(), this.resourceProvider);
        this.f24150n = a40Var;
        if (a40Var.getSearchOptionsItem() != null) {
            this.f24150n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f24150n.setPinnedToTop(true);
        this.f24150n.f31133o0.setTranslationY(0.0f);
        if (this.f24150n.getSearchOptionsItem() != null) {
            this.f24150n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f24150n.setBackgroundColor(getThemedColor(i10));
        a40 a40Var2 = this.f24150n;
        nh.f6 f6Var = this.d;
        a40Var2.Q1 = f6Var;
        ft0 ft0Var = a40Var2.W;
        ft0Var.f30091s = f6Var;
        ft0Var.l();
        vu0 vu0Var = a40Var2.f31103a0;
        vu0Var.f30091s = f6Var;
        vu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f24150n, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24152s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20289ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
        this.f24152s.addView(this.v, k7.b6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, this.resourceProvider));
        this.f24152s.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f24152s, k7.b6.e(-1, 49, 87));
        this.e.addView(this.h, k7.b6.e(-1, -1, 119));
        tf.x0 x0Var = new tf.x0(context, this.resourceProvider);
        this.f24151r = x0Var;
        x0Var.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6)));
        this.f24151r.setOnClickListener(new g0(this, 25));
        V(this.f24151r.a(f6Var), false);
        this.f24151r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f24147b, this.f24148c);
        frameLayout.addView(this.f24151r, k7.b6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.fk fkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            nh.f6 f6Var = this.d;
            if (obj == f6Var) {
                tf.x0 x0Var = this.f24151r;
                if (x0Var != null) {
                    V(x0Var.a(f6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (fkVar = this.f24149f) != null && fkVar.f40837a != null && ((Integer) objArr[0]).intValue() == this.f24149f.f40837a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            tf.x0 x0Var2 = this.f24151r;
            if (x0Var2 != null) {
                x0Var2.b(intValue, this.f24147b, this.f24148c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        nh.f6 f6Var = this.d;
        arrayList.add(f6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        f6Var.p(18, true);
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
