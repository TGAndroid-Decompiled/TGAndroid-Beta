package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class m40 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f30375a;
    public final String f30376b;
    public final String f30377c;
    public final di.t6 d;
    public di.i4 e;
    public org.telegram.ui.ek f30378f;
    public FrameLayout h;
    public j40 f30379n;
    public ig.m1 f30380r;
    public FrameLayout f30381s;
    public TextView v;
    public float f30382w;
    public ValueAnimator f30383x;
    public boolean f30384y;

    public m40(String str, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null);
        setResourceProvider(u6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f30376b = trim.substring(0, indexOf);
            this.f30377c = trim.substring(indexOf + 1);
        } else {
            this.f30376b = trim;
            this.f30377c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30376b);
        if (!TextUtils.isEmpty(this.f30377c)) {
            str2 = "@" + this.f30377c;
        }
        sb2.append(str2);
        this.f30375a = sb2.toString();
        this.d = new di.t6(this.currentAccount, this.f30377c, this.f30376b);
    }

    public final int V() {
        int i10;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
    }

    public final void W(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.xn xnVar;
        bi.r1 r1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f30384y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            j40 j40Var = this.f30379n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            j40Var.setScaleX(f10);
            j40 j40Var2 = this.f30379n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            j40Var2.setScaleY(f11);
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
            org.telegram.ui.ek ekVar = this.f30378f;
            if (ekVar != null && (xnVar = ekVar.f46049a) != null && (r1Var = xnVar.X3) != null) {
                r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f30378f.f46049a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f30384y == z10) {
        } else {
            this.f30384y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new k40(this, 1));
            this.F.addListener(new l40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(ds.h);
            this.F.start();
        }
    }

    public final void X(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f30380r.animate().cancel();
        ValueAnimator valueAnimator = this.f30383x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            ig.m1 m1Var = this.f30380r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            ig.m1 m1Var2 = this.f30380r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            di.i4 i4Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            i4Var.setTranslationY(f11);
            di.i4 i4Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            i4Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f30380r.setVisibility(0);
        ViewPropertyAnimator animate = this.f30380r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bh.n(29, this, z10)).setDuration(320L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        float f12 = this.f30382w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f30383x = ofFloat;
        ofFloat.addUpdateListener(new k40(this, 0));
        this.f30383x.addListener(new l40(this, z10, 0));
        this.f30383x.setDuration(320L);
        this.f30383x.setInterpolator(dsVar);
        this.f30383x.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        String str = this.f30375a;
        r5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.i4 i4Var = new di.i4(context, 15);
        this.e = i4Var;
        i4Var.setClipChildren(false);
        frameLayout.addView(this.e, kb1.i(-1, -1, 119));
        AndroidUtilities.setViewLayoutMargins(this.e, 0, V(), 0, 0);
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ek ekVar = new org.telegram.ui.ek(context, getParentLayout(), bundle, 1);
        ekVar.h = false;
        this.f30378f = ekVar;
        this.e.addView(ekVar, kb1.i(-1, -1, 119));
        j40 j40Var = new j40(this, context, new tv0(null), this, new Object(), this.resourceProvider);
        this.f30379n = j40Var;
        if (j40Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.f7.t(this.f30379n.getSearchOptionsItem(), org.telegram.ui.ActionBar.y6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f30379n.setPinnedToTop(true);
        this.f30379n.f26981t0.setTranslationY(0.0f);
        if (this.f30379n.getSearchOptionsItem() != null) {
            this.f30379n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        j40 j40Var2 = this.f30379n;
        di.t6 t6Var = this.d;
        j40Var2.W1 = t6Var;
        iu0 iu0Var = j40Var2.f26938e0;
        iu0Var.f35173s = t6Var;
        iu0Var.l();
        yv0 yv0Var = j40Var2.f26942f0;
        yv0Var.f35173s = t6Var;
        yv0Var.l();
        this.f30379n.h1(0, oi.a.c(AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(48.0f) + V(), AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.f30379n, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30381s = frameLayout3;
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(this.v, org.telegram.ui.ActionBar.y6.f23757ye, getResourceProvider());
        this.v.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
        this.f30381s.addView(this.v, kb1.h(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23358d7, view, this.resourceProvider);
        this.f30381s.addView(view, kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f30381s, kb1.i(-1, 49, 87));
        this.e.addView(this.h, kb1.i(-1, -1, 119));
        ig.m1 m1Var = new ig.m1(context, this.resourceProvider);
        this.f30380r = m1Var;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(themedColor, getThemedColor(i11));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        m1Var.setBackground(h02);
        org.telegram.ui.ActionBar.f7.k(m1Var, h02, N, N2, resourceProvider);
        this.f30380r.setOnClickListener(new f0(this, 24));
        X(this.f30380r.a(t6Var), false);
        this.f30380r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f30376b, this.f30377c);
        frameLayout.addView(this.f30380r, kb1.i(-1, 48, 55));
        AndroidUtilities.setViewLayoutMargins(this.f30380r, 0, V(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.f19422g = frameLayout;
        baseSimpleGlass.h = null;
        baseSimpleGlass.f(frameLayout, r5Var2, resourceProvider2);
        baseSimpleGlass.f19423i = new bi.g(6, this, frameLayout);
        this.f30379n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.r5 r5Var3 = this.simpleActionBar;
        r5Var3.setBackground(baseSimpleGlass.a(r5Var3));
        W(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ek ekVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            di.t6 t6Var = this.d;
            if (obj == t6Var) {
                ig.m1 m1Var = this.f30380r;
                if (m1Var != null) {
                    X(m1Var.a(t6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (ekVar = this.f30378f) != null && ekVar.f46049a != null && ((Integer) objArr[0]).intValue() == this.f30378f.f46049a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            ig.m1 m1Var2 = this.f30380r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f30376b, this.f30377c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        di.t6 t6Var = this.d;
        arrayList.add(t6Var);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.hashtagSearchUpdated);
        t6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
