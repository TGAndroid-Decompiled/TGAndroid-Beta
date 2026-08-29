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
public final class z30 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public ValueAnimator B;
    public final String f35189a;
    public final String f35190b;
    public final String f35191c;
    public final lh.e6 d;
    public bh.d f35192e;
    public org.telegram.ui.zj f35193f;
    public FrameLayout h;
    public w30 f35194n;
    public rf.y0 f35195r;
    public FrameLayout f35196s;
    public TextView v;
    public float f35197w;
    public ValueAnimator f35198x;
    public boolean f35199y;

    public z30(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        setResourceProvider(c6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f35190b = trim.substring(0, indexOf);
            this.f35191c = trim.substring(indexOf + 1);
        } else {
            this.f35190b = trim;
            this.f35191c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35190b);
        if (!TextUtils.isEmpty(this.f35191c)) {
            str2 = "@" + this.f35191c;
        }
        sb2.append(str2);
        this.f35189a = sb2.toString();
        this.d = new lh.e6(this.currentAccount, this.f35191c, this.f35190b);
    }

    public final void U(boolean z10, boolean z11) {
        float f9;
        float f10;
        float f11;
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f35199y = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.A = f9;
            w30 w30Var = this.f35194n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            w30Var.setScaleX(f10);
            w30 w30Var2 = this.f35194n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            w30Var2.setScaleY(f11);
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
            org.telegram.ui.zj zjVar = this.f35193f;
            if (zjVar != null && (unVar = zjVar.f43683a) != null && (e1Var = unVar.H3) != null) {
                e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
                this.f35193f.f43683a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
            }
        } else if (this.f35199y == z10) {
        } else {
            this.f35199y = z10;
            this.h.setVisibility(0);
            float f13 = this.A;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new x30(this, 1));
            this.B.addListener(new y30(this, z10, 1));
            this.B.setDuration(320L);
            this.B.setInterpolator(jr.h);
            this.B.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f9;
        int i10;
        float f10;
        int i11;
        this.f35195r.animate().cancel();
        ValueAnimator valueAnimator = this.f35198x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            rf.y0 y0Var = this.f35195r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y0Var.setVisibility(i10);
            rf.y0 y0Var2 = this.f35195r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            y0Var2.setTranslationY(f10);
            bh.d dVar = this.f35192e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            dVar.setTranslationY(f11);
            bh.d dVar2 = this.f35192e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            dVar2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f35195r.setVisibility(0);
        ViewPropertyAnimator animate = this.f35195r.animate();
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f9).withEndAction(new hh.f(28, this, z10)).setDuration(320L);
        jr jrVar = jr.h;
        duration.setInterpolator(jrVar).start();
        float f12 = this.f35197w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f35198x = ofFloat;
        ofFloat.addUpdateListener(new x30(this, 0));
        this.f35198x.addListener(new y30(this, z10, 0));
        this.f35198x.setDuration(320L);
        this.f35198x.setInterpolator(jrVar);
        this.f35198x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        String str = this.f35189a;
        lVar.setTitle(str);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        lVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23367u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        bh.d dVar = new bh.d(context, 17);
        this.f35192e = dVar;
        frameLayout.addView(dVar, i7.f6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.zj zjVar = new org.telegram.ui.zj(context, getParentLayout(), bundle, 1);
        zjVar.h = false;
        this.f35193f = zjVar;
        this.f35192e.addView(zjVar, i7.f6.e(-1, -1, 119));
        w30 w30Var = new w30(this, context, new iu0(null), this, new Object(), this.resourceProvider);
        this.f35194n = w30Var;
        if (w30Var.getSearchOptionsItem() != null) {
            this.f35194n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f35194n.setPinnedToTop(true);
        this.f35194n.f32083n0.setTranslationY(0.0f);
        if (this.f35194n.getSearchOptionsItem() != null) {
            this.f35194n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f35194n.setBackgroundColor(getThemedColor(i10));
        w30 w30Var2 = this.f35194n;
        lh.e6 e6Var = this.d;
        w30Var2.P1 = e6Var;
        xs0 xs0Var = w30Var2.V;
        xs0Var.f31151s = e6Var;
        xs0Var.l();
        nu0 nu0Var = w30Var2.W;
        nu0Var.f31151s = e6Var;
        nu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f35194n, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f35196s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23440ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", e6Var.J, new Object[0]));
        this.f35196s.addView(this.v, i7.f6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.resourceProvider));
        this.f35196s.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f35196s, i7.f6.e(-1, 49, 87));
        this.f35192e.addView(this.h, i7.f6.e(-1, -1, 119));
        rf.y0 y0Var = new rf.y0(context, this.resourceProvider);
        this.f35195r = y0Var;
        y0Var.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6)));
        this.f35195r.setOnClickListener(new h0(this, 25));
        V(this.f35195r.a(e6Var), false);
        this.f35195r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f35190b, this.f35191c);
        frameLayout.addView(this.f35195r, i7.f6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.zj zjVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            lh.e6 e6Var = this.d;
            if (obj == e6Var) {
                rf.y0 y0Var = this.f35195r;
                if (y0Var != null) {
                    V(y0Var.a(e6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", e6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (zjVar = this.f35193f) != null && zjVar.f43683a != null && ((Integer) objArr[0]).intValue() == this.f35193f.f43683a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            rf.y0 y0Var2 = this.f35195r;
            if (y0Var2 != null) {
                y0Var2.b(intValue, this.f35190b, this.f35191c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        lh.e6 e6Var = this.d;
        arrayList.add(e6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        e6Var.p(18, true);
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
