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
public final class k40 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f27856a;
    public final String f27857b;
    public final String f27858c;
    public final ci.t6 d;
    public ci.h4 e;
    public org.telegram.ui.bk f27859f;
    public FrameLayout h;
    public h40 f27860n;
    public hg.m1 f27861r;
    public FrameLayout f27862s;
    public TextView v;
    public float f27863w;
    public ValueAnimator f27864x;
    public boolean f27865y;

    public k40(String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        setResourceProvider(g6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f27857b = trim.substring(0, indexOf);
            this.f27858c = trim.substring(indexOf + 1);
        } else {
            this.f27857b = trim;
            this.f27858c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27857b);
        if (!TextUtils.isEmpty(this.f27858c)) {
            str2 = "@" + this.f27858c;
        }
        sb2.append(str2);
        this.f27856a = sb2.toString();
        this.d = new ci.t6(this.currentAccount, this.f27858c, this.f27857b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f27865y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            h40 h40Var = this.f27860n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            h40Var.setScaleX(f10);
            h40 h40Var2 = this.f27860n;
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
            org.telegram.ui.bk bkVar = this.f27859f;
            if (bkVar != null && (tnVar = bkVar.f42477a) != null && (u1Var = tnVar.X3) != null) {
                u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f27859f.f42477a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f27865y == z10) {
        } else {
            this.f27865y = z10;
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
        this.f27861r.animate().cancel();
        ValueAnimator valueAnimator = this.f27864x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            hg.m1 m1Var = this.f27861r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            hg.m1 m1Var2 = this.f27861r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            ci.h4 h4Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            h4Var.setTranslationY(f11);
            ci.h4 h4Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            h4Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f27861r.setVisibility(0);
        ViewPropertyAnimator animate = this.f27861r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ah.t(29, this, z10)).setDuration(320L);
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        float f12 = this.f27863w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f27864x = ofFloat;
        ofFloat.addUpdateListener(new i40(this, 0));
        this.f27864x.addListener(new j40(this, z10, 0));
        this.f27864x.setDuration(320L);
        this.f27864x.setInterpolator(bsVar);
        this.f27864x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f27856a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.r6.i(i10, kVar2, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar3, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21501u8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, getResourceProvider());
        ci.h4 h4Var = new ci.h4(context, 16);
        this.e = h4Var;
        frameLayout.addView(h4Var, w7.z5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.bk bkVar = new org.telegram.ui.bk(context, getParentLayout(), bundle, 1);
        bkVar.h = false;
        this.f27859f = bkVar;
        this.e.addView(bkVar, w7.z5.e(-1, -1, 119));
        h40 h40Var = new h40(this, context, new pv0(null), this, new Object(), this.resourceProvider);
        this.f27860n = h40Var;
        if (h40Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.f27860n.getSearchOptionsItem(), i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f27860n.setPinnedToTop(true);
        this.f27860n.f32701r0.setTranslationY(0.0f);
        if (this.f27860n.getSearchOptionsItem() != null) {
            this.f27860n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.r6.i(i10, this.f27860n, getResourceProvider());
        h40 h40Var2 = this.f27860n;
        ci.t6 t6Var = this.d;
        h40Var2.U1 = t6Var;
        fu0 fu0Var = h40Var2.f32666c0;
        fu0Var.f31223s = t6Var;
        fu0Var.l();
        uv0 uv0Var = h40Var2.f32669d0;
        uv0Var.f31223s = t6Var;
        uv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, getResourceProvider());
        this.h.addView(this.f27860n, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27862s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(this.v, org.telegram.ui.ActionBar.k6.f21578ye, getResourceProvider());
        this.v.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
        this.f27862s.addView(this.v, w7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, this.resourceProvider);
        this.f27862s.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f27862s, w7.z5.e(-1, 49, 87));
        this.e.addView(this.h, w7.z5.e(-1, -1, 119));
        hg.m1 m1Var = new hg.m1(context, this.resourceProvider);
        this.f27861r = m1Var;
        int themedColor = getThemedColor(i10);
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(themedColor, getThemedColor(i12));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        m1Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(m1Var, h02, O, O2, resourceProvider);
        this.f27861r.setOnClickListener(new f0(this, 24));
        V(this.f27861r.a(t6Var), false);
        this.f27861r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f27857b, this.f27858c);
        frameLayout.addView(this.f27861r, w7.z5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.bk bkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ci.t6 t6Var = this.d;
            if (obj == t6Var) {
                hg.m1 m1Var = this.f27861r;
                if (m1Var != null) {
                    V(m1Var.a(t6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (bkVar = this.f27859f) != null && bkVar.f42477a != null && ((Integer) objArr[0]).intValue() == this.f27859f.f42477a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            hg.m1 m1Var2 = this.f27861r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f27857b, this.f27858c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ci.t6 t6Var = this.d;
        arrayList.add(t6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
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
}
