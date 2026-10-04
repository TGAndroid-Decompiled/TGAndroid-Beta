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
public final class f40 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f26265a;
    public final String f26266b;
    public final String f26267c;
    public final ai.v8 d;
    public ai.w5 f26268e;
    public org.telegram.ui.fk f26269f;
    public FrameLayout h;
    public c40 f26270n;
    public gg.n1 f26271r;
    public FrameLayout f26272s;
    public TextView v;
    public float f26273w;
    public ValueAnimator f26274x;
    public boolean f26275y;

    public f40(String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null);
        setResourceProvider(d6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f26266b = trim.substring(0, indexOf);
            this.f26267c = trim.substring(indexOf + 1);
        } else {
            this.f26266b = trim;
            this.f26267c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26266b);
        if (!TextUtils.isEmpty(this.f26267c)) {
            str2 = "@" + this.f26267c;
        }
        sb2.append(str2);
        this.f26265a = sb2.toString();
        this.d = new ai.v8(this.currentAccount, this.f26267c, this.f26266b);
    }

    public final void S(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.zn znVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f26275y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            c40 c40Var = this.f26270n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            c40Var.setScaleX(f10);
            c40 c40Var2 = this.f26270n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            c40Var2.setScaleY(f11);
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
            org.telegram.ui.fk fkVar = this.f26269f;
            if (fkVar != null && (znVar = fkVar.f34865a) != null && (w0Var = znVar.J3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f26269f.f34865a.J3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f26275y == z10) {
        } else {
            this.f26275y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new d40(this, 1));
            this.F.addListener(new e40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(tr.h);
            this.F.start();
        }
    }

    public final void T(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f26271r.animate().cancel();
        ValueAnimator valueAnimator = this.f26274x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.n1 n1Var = this.f26271r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n1Var.setVisibility(i10);
            gg.n1 n1Var2 = this.f26271r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            n1Var2.setTranslationY(f10);
            ai.w5 w5Var = this.f26268e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            w5Var.setTranslationY(f11);
            ai.w5 w5Var2 = this.f26268e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            w5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f26271r.setVisibility(0);
        ViewPropertyAnimator animate = this.f26271r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(25, this, z10)).setDuration(320L);
        tr trVar = tr.h;
        duration.setInterpolator(trVar).start();
        float f12 = this.f26273w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f26274x = ofFloat;
        ofFloat.addUpdateListener(new d40(this, 0));
        this.f26274x.addListener(new e40(this, z10, 0));
        this.f26274x.setDuration(320L);
        this.f26274x.setInterpolator(trVar);
        this.f26274x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f26265a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20817d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        kVar3.B(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f21136u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.w5 w5Var = new ai.w5(context, 16);
        this.f26268e = w5Var;
        frameLayout.addView(w5Var, w7.z5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f26269f = fkVar;
        this.f26268e.addView(fkVar, w7.z5.e(-1, -1, 119));
        c40 c40Var = new c40(this, context, new hv0(null), this, new Object(), this.resourceProvider);
        this.f26270n = c40Var;
        if (c40Var.getSearchOptionsItem() != null) {
            this.f26270n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f26270n.setPinnedToTop(true);
        this.f26270n.f29790r0.setTranslationY(0.0f);
        if (this.f26270n.getSearchOptionsItem() != null) {
            this.f26270n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f26270n.setBackgroundColor(getThemedColor(i10));
        c40 c40Var2 = this.f26270n;
        ai.v8 v8Var = this.d;
        c40Var2.T1 = v8Var;
        xt0 xt0Var = c40Var2.f29757c0;
        xt0Var.f28729s = v8Var;
        xt0Var.l();
        mv0 mv0Var = c40Var2.f29760d0;
        mv0Var.f28729s = v8Var;
        mv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f26270n, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26272s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21212ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
        this.f26272s.addView(this.v, w7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d7, this.resourceProvider));
        this.f26272s.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f26272s, w7.z5.e(-1, 49, 87));
        this.f26268e.addView(this.h, w7.z5.e(-1, -1, 119));
        gg.n1 n1Var = new gg.n1(context, this.resourceProvider);
        this.f26271r = n1Var;
        n1Var.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.f20908i6)));
        this.f26271r.setOnClickListener(new f0(this, 25));
        T(this.f26271r.a(v8Var), false);
        this.f26271r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f26266b, this.f26267c);
        frameLayout.addView(this.f26271r, w7.z5.e(-1, 48, 55));
        S(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.fk fkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.v8 v8Var = this.d;
            if (obj == v8Var) {
                gg.n1 n1Var = this.f26271r;
                if (n1Var != null) {
                    T(n1Var.a(v8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (fkVar = this.f26269f) != null && fkVar.f34865a != null && ((Integer) objArr[0]).intValue() == this.f26269f.f34865a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.n1 n1Var2 = this.f26271r;
            if (n1Var2 != null) {
                n1Var2.b(intValue, this.f26266b, this.f26267c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20817d6, true)) > 0.699999988079071d) {
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
