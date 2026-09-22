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
    public final String f22599a;
    public final String f22600b;
    public final String f22601c;
    public final ai.v8 d;
    public ai.x5 e;
    public org.telegram.ui.ik f22602f;
    public FrameLayout h;
    public y30 f22603n;
    public gg.n1 f22604r;
    public FrameLayout f22605s;
    public TextView v;
    public float f22606w;
    public ValueAnimator f22607x;
    public boolean f22608y;

    public b40(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f22600b = trim.substring(0, indexOf);
            this.f22601c = trim.substring(indexOf + 1);
        } else {
            this.f22600b = trim;
            this.f22601c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22600b);
        if (!TextUtils.isEmpty(this.f22601c)) {
            str2 = "@" + this.f22601c;
        }
        sb2.append(str2);
        this.f22599a = sb2.toString();
        this.d = new ai.v8(this.currentAccount, this.f22601c, this.f22600b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.co coVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f22608y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            y30 y30Var = this.f22603n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            y30Var.setScaleX(f10);
            y30 y30Var2 = this.f22603n;
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
            org.telegram.ui.ik ikVar = this.f22602f;
            if (ikVar != null && (coVar = ikVar.f33379a) != null && (w0Var = coVar.L3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f22602f.f33379a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f22608y == z10) {
        } else {
            this.f22608y = z10;
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
            this.F.setInterpolator(qr.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f22604r.animate().cancel();
        ValueAnimator valueAnimator = this.f22607x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.n1 n1Var = this.f22604r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            n1Var.setVisibility(i10);
            gg.n1 n1Var2 = this.f22604r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            n1Var2.setTranslationY(f10);
            ai.x5 x5Var = this.e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            x5Var.setTranslationY(f11);
            ai.x5 x5Var2 = this.e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            x5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f22604r.setVisibility(0);
        ViewPropertyAnimator animate = this.f22604r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(24, this, z10)).setDuration(320L);
        qr qrVar = qr.h;
        duration.setInterpolator(qrVar).start();
        float f12 = this.f22606w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f22607x = ofFloat;
        ofFloat.addUpdateListener(new z30(this, 0));
        this.f22607x.addListener(new a40(this, z10, 0));
        this.f22607x.setDuration(320L);
        this.f22607x.setInterpolator(qrVar);
        this.f22607x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f22599a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f18834d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        kVar3.B(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f19147u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.x5 x5Var = new ai.x5(context, 16);
        this.e = x5Var;
        frameLayout.addView(x5Var, w7.x5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(context, getParentLayout(), bundle, 1);
        ikVar.h = false;
        this.f22602f = ikVar;
        this.e.addView(ikVar, w7.x5.e(-1, -1, 119));
        y30 y30Var = new y30(this, context, new qu0(null), this, new Object(), this.resourceProvider);
        this.f22603n = y30Var;
        if (y30Var.getSearchOptionsItem() != null) {
            this.f22603n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f22603n.setPinnedToTop(true);
        this.f22603n.f30379r0.setTranslationY(0.0f);
        if (this.f22603n.getSearchOptionsItem() != null) {
            this.f22603n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f22603n.setBackgroundColor(getThemedColor(i10));
        y30 y30Var2 = this.f22603n;
        ai.v8 v8Var = this.d;
        y30Var2.T1 = v8Var;
        gt0 gt0Var = y30Var2.f30347c0;
        gt0Var.f29438s = v8Var;
        gt0Var.l();
        vu0 vu0Var = y30Var2.f30350d0;
        vu0Var.f29438s = v8Var;
        vu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f22603n, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22605s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19223ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
        this.f22605s.addView(this.v, w7.x5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18835d7, this.resourceProvider));
        this.f22605s.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f22605s, w7.x5.e(-1, 49, 87));
        this.e.addView(this.h, w7.x5.e(-1, -1, 119));
        gg.n1 n1Var = new gg.n1(context, this.resourceProvider);
        this.f22604r = n1Var;
        n1Var.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.f18923i6)));
        this.f22604r.setOnClickListener(new f0(this, 25));
        V(this.f22604r.a(v8Var), false);
        this.f22604r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f22600b, this.f22601c);
        frameLayout.addView(this.f22604r, w7.x5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ik ikVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.v8 v8Var = this.d;
            if (obj == v8Var) {
                gg.n1 n1Var = this.f22604r;
                if (n1Var != null) {
                    V(n1Var.a(v8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (ikVar = this.f22602f) != null && ikVar.f33379a != null && ((Integer) objArr[0]).intValue() == this.f22602f.f33379a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.n1 n1Var2 = this.f22604r;
            if (n1Var2 != null) {
                n1Var2.b(intValue, this.f22600b, this.f22601c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, true)) > 0.699999988079071d) {
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
