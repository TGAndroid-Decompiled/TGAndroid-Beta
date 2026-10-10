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
public final class t40 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f30973a;
    public final String f30974b;
    public final String f30975c;
    public final ai.w8 d;
    public ai.x5 f30976e;
    public org.telegram.ui.jk f30977f;
    public FrameLayout h;
    public q40 f30978n;
    public gg.m1 f30979r;
    public FrameLayout f30980s;
    public TextView v;
    public float f30981w;
    public ValueAnimator f30982x;
    public boolean f30983y;

    public t40(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f30974b = trim.substring(0, indexOf);
            this.f30975c = trim.substring(indexOf + 1);
        } else {
            this.f30974b = trim;
            this.f30975c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30974b);
        if (!TextUtils.isEmpty(this.f30975c)) {
            str2 = "@" + this.f30975c;
        }
        sb2.append(str2);
        this.f30973a = sb2.toString();
        this.d = new ai.w8(this.currentAccount, this.f30975c, this.f30974b);
    }

    public final void U(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        org.telegram.ui.ao aoVar;
        ai.w0 w0Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            this.f30983y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            q40 q40Var = this.f30978n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            q40Var.setScaleX(f10);
            q40 q40Var2 = this.f30978n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            q40Var2.setScaleY(f11);
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
            org.telegram.ui.jk jkVar = this.f30977f;
            if (jkVar != null && (aoVar = jkVar.f36403a) != null && (w0Var = aoVar.L3) != null) {
                w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f30977f.f36403a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f30983y == z10) {
        } else {
            this.f30983y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new r40(this, 1));
            this.F.addListener(new s40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(is.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f30979r.animate().cancel();
        ValueAnimator valueAnimator = this.f30982x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            gg.m1 m1Var = this.f30979r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            gg.m1 m1Var2 = this.f30979r;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            m1Var2.setTranslationY(f10);
            ai.x5 x5Var = this.f30976e;
            if (z10) {
                f11 = AndroidUtilities.dp(48.0f);
            }
            x5Var.setTranslationY(f11);
            ai.x5 x5Var2 = this.f30976e;
            if (z10) {
                i11 = AndroidUtilities.dp(48.0f);
            } else {
                i11 = 0;
            }
            x5Var2.setPadding(0, 0, 0, i11);
            return;
        }
        this.f30979r.setVisibility(0);
        ViewPropertyAnimator animate = this.f30979r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new bi.f(26, this, z10)).setDuration(320L);
        is isVar = is.h;
        duration.setInterpolator(isVar).start();
        float f12 = this.f30981w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f30982x = ofFloat;
        ofFloat.addUpdateListener(new r40(this, 0));
        this.f30982x.addListener(new s40(this, z10, 0));
        this.f30982x.setDuration(320L);
        this.f30982x.setInterpolator(isVar);
        this.f30982x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f30973a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20801d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        kVar3.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.i6.f21116u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.x5 x5Var = new ai.x5(context, 16);
        this.f30976e = x5Var;
        frameLayout.addView(x5Var, w7.x5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(context, getParentLayout(), bundle, 1);
        jkVar.h = false;
        this.f30977f = jkVar;
        this.f30976e.addView(jkVar, w7.x5.e(-1, -1, 119));
        q40 q40Var = new q40(this, context, new uv0(null), this, new Object(), this.resourceProvider);
        this.f30978n = q40Var;
        if (q40Var.getSearchOptionsItem() != null) {
            this.f30978n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f30978n.setPinnedToTop(true);
        this.f30978n.f25464r0.setTranslationY(0.0f);
        if (this.f30978n.getSearchOptionsItem() != null) {
            this.f30978n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f30978n.setBackgroundColor(getThemedColor(i10));
        q40 q40Var2 = this.f30978n;
        ai.w8 w8Var = this.d;
        q40Var2.T1 = w8Var;
        ku0 ku0Var = q40Var2.f25431c0;
        ku0Var.f33692s = w8Var;
        ku0Var.l();
        zv0 zv0Var = q40Var2.f25434d0;
        zv0Var.f33692s = w8Var;
        zv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f30978n, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 49.0f, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30980s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21192ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
        this.f30980s.addView(this.v, w7.x5.a(-2.0f, 18.0f, 0.0f, 18.0f, 0.0f, -1, 19));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, this.resourceProvider));
        this.f30980s.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f30980s, w7.x5.e(-1, 49, 87));
        this.f30976e.addView(this.h, w7.x5.e(-1, -1, 119));
        gg.m1 m1Var = new gg.m1(context, this.resourceProvider);
        this.f30979r = m1Var;
        m1Var.setBackground(org.telegram.ui.ActionBar.i6.h0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.f20892i6)));
        this.f30979r.setOnClickListener(new f0(this, 24));
        V(this.f30979r.a(w8Var), false);
        this.f30979r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f30974b, this.f30975c);
        frameLayout.addView(this.f30979r, w7.x5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.jk jkVar;
        if (i10 == NotificationCenter.storiesListUpdated) {
            Object obj = objArr[0];
            ai.w8 w8Var = this.d;
            if (obj == w8Var) {
                gg.m1 m1Var = this.f30979r;
                if (m1Var != null) {
                    V(m1Var.a(w8Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", w8Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (jkVar = this.f30977f) != null && jkVar.f36403a != null && ((Integer) objArr[0]).intValue() == this.f30977f.f36403a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            gg.m1 m1Var2 = this.f30979r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f30974b, this.f30975c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ai.w8 w8Var = this.d;
        arrayList.add(w8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        w8Var.p(18, true);
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
