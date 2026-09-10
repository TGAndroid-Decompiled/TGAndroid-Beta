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
public final class l40 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f24864a;
    public final String f24865b;
    public final String f24866c;
    public final zh.u4 d;
    public bi.l4 e;
    public org.telegram.ui.kk f24867f;
    public FrameLayout h;
    public i40 f24868n;
    public fg.o1 f24869r;
    public FrameLayout f24870s;
    public TextView v;
    public float f24871w;
    public ValueAnimator f24872x;
    public boolean f24873y;

    public l40(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        setResourceProvider(f6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f24865b = trim.substring(0, indexOf);
            this.f24866c = trim.substring(indexOf + 1);
        } else {
            this.f24865b = trim;
            this.f24866c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24865b);
        if (!TextUtils.isEmpty(this.f24866c)) {
            str2 = "@" + this.f24866c;
        }
        sb2.append(str2);
        this.f24864a = sb2.toString();
        this.d = new zh.u4(this.currentAccount, this.f24866c, this.f24865b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.fo foVar;
        bi.y1 y1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f24873y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            i40 i40Var = this.f24868n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            i40Var.setScaleX(f10);
            i40 i40Var2 = this.f24868n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            i40Var2.setScaleY(f11);
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
            org.telegram.ui.kk kkVar = this.f24867f;
            if (kkVar != null && (foVar = kkVar.f33142a) != null && (y1Var = foVar.L3) != null) {
                y1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f24867f.f33142a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f24873y == z10) {
        } else {
            this.f24873y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new j40(this, 1));
            this.F.addListener(new k40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(wr.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f24869r.animate().cancel();
        ValueAnimator valueAnimator = this.f24872x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            fg.o1 o1Var = this.f24869r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o1Var.setVisibility(i10);
            fg.o1 o1Var2 = this.f24869r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            o1Var2.setTranslationY(f10);
            bi.l4 l4Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            l4Var.setTranslationY(f11);
            bi.l4 l4Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            l4Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f24869r.setVisibility(0);
        ViewPropertyAnimator animate = this.f24869r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ai.j(24, this, z10)).setDuration(320L);
        wr wrVar = wr.h;
        duration.setInterpolator(wrVar).start();
        float f12 = this.f24871w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f24872x = ofFloat;
        ofFloat.addUpdateListener(new j40(this, 0));
        this.f24872x.addListener(new k40(this, z10, 0));
        this.f24872x.setDuration(320L);
        this.f24872x.setInterpolator(wrVar);
        this.f24872x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        String str = this.f24864a;
        lVar.setTitle(str);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        lVar3.C(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.f18238u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        bi.l4 l4Var = new bi.l4(context, 15);
        this.e = l4Var;
        frameLayout.addView(l4Var, w7.a6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.kk kkVar = new org.telegram.ui.kk(context, getParentLayout(), bundle, 1);
        kkVar.h = false;
        this.f24867f = kkVar;
        this.e.addView(kkVar, w7.a6.e(-1, -1, 119));
        i40 i40Var = new i40(this, context, new av0(null), this, new Object(), this.resourceProvider);
        this.f24868n = i40Var;
        if (i40Var.getSearchOptionsItem() != null) {
            this.f24868n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f24868n.setPinnedToTop(true);
        this.f24868n.f24121r0.setTranslationY(0.0f);
        if (this.f24868n.getSearchOptionsItem() != null) {
            this.f24868n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f24868n.setBackgroundColor(getThemedColor(i10));
        i40 i40Var2 = this.f24868n;
        zh.u4 u4Var = this.d;
        i40Var2.T1 = u4Var;
        pt0 pt0Var = i40Var2.f24089c0;
        pt0Var.f23089s = u4Var;
        pt0Var.l();
        fv0 fv0Var = i40Var2.f24092d0;
        fv0Var.f23089s = u4Var;
        fv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f24868n, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24870s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18314ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", u4Var.J, new Object[0]));
        this.f24870s.addView(this.v, w7.a6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, this.resourceProvider));
        this.f24870s.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f24870s, w7.a6.e(-1, 49, 87));
        this.e.addView(this.h, w7.a6.e(-1, -1, 119));
        fg.o1 o1Var = new fg.o1(context, this.resourceProvider);
        this.f24869r = o1Var;
        o1Var.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6)));
        this.f24869r.setOnClickListener(new h0(this, 25));
        V(this.f24869r.a(u4Var), false);
        this.f24869r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f24865b, this.f24866c);
        frameLayout.addView(this.f24869r, w7.a6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.kk kkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            zh.u4 u4Var = this.d;
            if (obj == u4Var) {
                fg.o1 o1Var = this.f24869r;
                if (o1Var != null) {
                    V(o1Var.a(u4Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", u4Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (kkVar = this.f24867f) != null && kkVar.f33142a != null && ((Integer) objArr[0]).intValue() == this.f24867f.f33142a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            fg.o1 o1Var2 = this.f24869r;
            if (o1Var2 != null) {
                o1Var2.b(intValue, this.f24865b, this.f24866c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        zh.u4 u4Var = this.d;
        arrayList.add(u4Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        u4Var.p(18, true);
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
