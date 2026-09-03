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
public final class f40 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public ValueAnimator C;
    public final String f26760a;
    public final String f26761b;
    public final String f26762c;
    public final oh.f6 d;
    public eh.d f26763e;
    public org.telegram.ui.fk f26764f;
    public FrameLayout h;
    public c40 f26765n;
    public uf.x0 f26766r;
    public FrameLayout f26767s;
    public TextView v;
    public float f26768w;
    public ValueAnimator f26769x;
    public boolean f26770y;

    public f40(String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        setResourceProvider(g6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f26761b = trim.substring(0, indexOf);
            this.f26762c = trim.substring(indexOf + 1);
        } else {
            this.f26761b = trim;
            this.f26762c = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26761b);
        if (!TextUtils.isEmpty(this.f26762c)) {
            str2 = "@" + this.f26762c;
        }
        sb.append(str2);
        this.f26760a = sb.toString();
        this.d = new oh.f6(this.currentAccount, this.f26762c, this.f26761b);
    }

    public final void U(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        org.telegram.ui.yn ynVar;
        mh.d1 d1Var;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f13 = 0.0f;
        if (!z10) {
            this.f26770y = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.B = f10;
            c40 c40Var = this.f26765n;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            c40Var.setScaleX(f11);
            c40 c40Var2 = this.f26765n;
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.95f;
            }
            c40Var2.setScaleY(f12);
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
            org.telegram.ui.fk fkVar = this.f26764f;
            if (fkVar != null && (ynVar = fkVar.f43986a) != null && (d1Var = ynVar.I3) != null) {
                d1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
                this.f26764f.f43986a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
            }
        } else if (this.f26770y == z4) {
        } else {
            this.f26770y = z4;
            this.h.setVisibility(0);
            float f14 = this.B;
            if (z4) {
                f13 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new d40(this, 1));
            this.C.addListener(new e40(this, z4, 1));
            this.C.setDuration(320L);
            this.C.setInterpolator(pr.h);
            this.C.start();
        }
    }

    public final void V(boolean z4, boolean z10) {
        float f10;
        int i10;
        float f11;
        int i11;
        this.f26766r.animate().cancel();
        ValueAnimator valueAnimator = this.f26769x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f12 = 0.0f;
        if (!z10) {
            uf.x0 x0Var = this.f26766r;
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x0Var.setVisibility(i10);
            uf.x0 x0Var2 = this.f26766r;
            if (z4) {
                f11 = 0.0f;
            } else {
                f11 = -AndroidUtilities.dp(48.0f);
            }
            x0Var2.setTranslationY(f11);
            eh.d dVar = this.f26763e;
            if (z4) {
                f12 = AndroidUtilities.dp(48.0f);
            }
            dVar.setTranslationY(f12);
            eh.d dVar2 = this.f26763e;
            if (z4) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            dVar2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f26766r.setVisibility(0);
        ViewPropertyAnimator animate = this.f26766r.animate();
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f10).withEndAction(new kh.f(22, this, z4)).setDuration(320L);
        pr prVar = pr.h;
        duration.setInterpolator(prVar).start();
        float f13 = this.f26768w;
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
        this.f26769x = ofFloat;
        ofFloat.addUpdateListener(new d40(this, 0));
        this.f26769x.addListener(new e40(this, z4, 0));
        this.f26769x.setDuration(320L);
        this.f26769x.setInterpolator(prVar);
        this.f26769x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f26760a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        kVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f21965u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        eh.d dVar = new eh.d(context, 16);
        this.f26763e = dVar;
        frameLayout.addView(dVar, k7.c6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f26764f = fkVar;
        this.f26763e.addView(fkVar, k7.c6.e(-1, -1, 119));
        c40 c40Var = new c40(this, context, new qu0(null), this, new Object(), this.resourceProvider);
        this.f26765n = c40Var;
        if (c40Var.getSearchOptionsItem() != null) {
            this.f26765n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f26765n.setPinnedToTop(true);
        this.f26765n.f33638o0.setTranslationY(0.0f);
        if (this.f26765n.getSearchOptionsItem() != null) {
            this.f26765n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f26765n.setBackgroundColor(getThemedColor(i10));
        c40 c40Var2 = this.f26765n;
        oh.f6 f6Var = this.d;
        c40Var2.Q1 = f6Var;
        ft0 ft0Var = c40Var2.W;
        ft0Var.f32551s = f6Var;
        ft0Var.l();
        vu0 vu0Var = c40Var2.f33607a0;
        vu0Var.f32551s = f6Var;
        vu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f26765n, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26767s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22046ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
        this.f26767s.addView(this.v, k7.c6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, this.resourceProvider));
        this.f26767s.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f26767s, k7.c6.e(-1, 49, 87));
        this.f26763e.addView(this.h, k7.c6.e(-1, -1, 119));
        uf.x0 x0Var = new uf.x0(context, this.resourceProvider);
        this.f26766r = x0Var;
        x0Var.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6)));
        this.f26766r.setOnClickListener(new g0(this, 25));
        V(this.f26766r.a(f6Var), false);
        this.f26766r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f26761b, this.f26762c);
        frameLayout.addView(this.f26766r, k7.c6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.fk fkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            oh.f6 f6Var = this.d;
            if (obj == f6Var) {
                uf.x0 x0Var = this.f26766r;
                if (x0Var != null) {
                    V(x0Var.a(f6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (fkVar = this.f26764f) != null && fkVar.f43986a != null && ((Integer) objArr[0]).intValue() == this.f26764f.f43986a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            uf.x0 x0Var2 = this.f26766r;
            if (x0Var2 != null) {
                x0Var2.b(intValue, this.f26761b, this.f26762c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        oh.f6 f6Var = this.d;
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
