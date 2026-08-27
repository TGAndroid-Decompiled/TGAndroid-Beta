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

public final class q30 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public ValueAnimator B;

    public final String f31765a;

    public final String f31766b;

    public final String f31767c;
    public final jh.d6 d;

    public ag.d f31768e;

    public org.telegram.ui.yj f31769f;
    public FrameLayout h;

    public n30 f31770n;

    public pf.x0 f31771r;

    public FrameLayout f31772s;
    public TextView v;

    public float f31773w;

    public ValueAnimator f31774x;

    public boolean f31775y;

    public q30(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        setResourceProvider(c6Var);
        String str2 = "";
        String strTrim = (str == null ? "" : str).trim();
        if (!strTrim.startsWith("#") && !strTrim.startsWith("$")) {
            strTrim = "#".concat(strTrim);
        }
        int iIndexOf = strTrim.indexOf("@");
        if (iIndexOf > 0) {
            this.f31766b = strTrim.substring(0, iIndexOf);
            this.f31767c = strTrim.substring(iIndexOf + 1);
        } else {
            this.f31766b = strTrim;
            this.f31767c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31766b);
        if (!TextUtils.isEmpty(this.f31767c)) {
            str2 = "@" + this.f31767c;
        }
        sb2.append(str2);
        this.f31765a = sb2.toString();
        this.d = new jh.d6(this.currentAccount, this.f31767c, this.f31766b);
    }

    public final void U(boolean z10, boolean z11) {
        org.telegram.ui.sn snVar;
        hh.f1 f1Var;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            if (this.f31775y == z10) {
                return;
            }
            this.f31775y = z10;
            this.h.setVisibility(0);
            int i10 = 1;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
            this.B = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new o30(this, i10));
            this.B.addListener(new p30(this, z10, i10));
            this.B.setDuration(320L);
            this.B.setInterpolator(er.h);
            this.B.start();
            return;
        }
        this.f31775y = z10;
        this.A = z10 ? 1.0f : 0.0f;
        this.f31770n.setScaleX(z10 ? 1.0f : 0.95f);
        this.f31770n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.yj yjVar = this.f31769f;
        if (yjVar == null || (snVar = yjVar.f42977a) == null || (f1Var = snVar.H3) == null) {
            return;
        }
        f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
        this.f31769f.f42977a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
    }

    public final void V(boolean z10, boolean z11) {
        this.f31771r.animate().cancel();
        ValueAnimator valueAnimator = this.f31774x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (!z11) {
            this.f31771r.setVisibility(z10 ? 0 : 8);
            this.f31771r.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f));
            this.f31768e.setTranslationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.f31768e.setPadding(0, 0, 0, z10 ? AndroidUtilities.dp(48.0f) : 0);
            return;
        }
        this.f31771r.setVisibility(0);
        ViewPropertyAnimator duration = this.f31771r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new fh.f(29, this, z10)).setDuration(320L);
        er erVar = er.h;
        duration.setInterpolator(erVar).start();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31773w, z10 ? 1.0f : 0.0f);
        this.f31774x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new o30(this, i10));
        this.f31774x.addListener(new p30(this, z10, i10));
        this.f31774x.setDuration(320L);
        this.f31774x.setInterpolator(erVar);
        this.f31774x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f31765a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar3.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23359u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ag.d dVar = new ag.d(context, 15);
        this.f31768e = dVar;
        frameLayout.addView(dVar, h7.z5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.yj yjVar = new org.telegram.ui.yj(context, getParentLayout(), bundle, 1);
        yjVar.h = false;
        this.f31769f = yjVar;
        this.f31768e.addView(yjVar, h7.z5.e(-1, -1, 119));
        n30 n30Var = new n30(this, context, new zt0(null), this, new m30(), this.resourceProvider);
        this.f31770n = n30Var;
        if (n30Var.getSearchOptionsItem() != null) {
            this.f31770n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.f31770n.setPinnedToTop(true);
        this.f31770n.f29135n0.setTranslationY(0.0f);
        if (this.f31770n.getSearchOptionsItem() != null) {
            this.f31770n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.f31770n.setBackgroundColor(getThemedColor(i10));
        n30 n30Var2 = this.f31770n;
        jh.d6 d6Var = this.d;
        n30Var2.P1 = d6Var;
        os0 os0Var = n30Var2.V;
        os0Var.f28155s = d6Var;
        os0Var.l();
        eu0 eu0Var = n30Var2.W;
        eu0Var.f28155s = d6Var;
        eu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.f31770n, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31772s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23431ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", d6Var.J, new Object[0]));
        this.f31772s.addView(this.v, h7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourceProvider));
        this.f31772s.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f31772s, h7.z5.e(-1, 49, 87));
        this.f31768e.addView(this.h, h7.z5.e(-1, -1, 119));
        pf.x0 x0Var = new pf.x0(context, this.resourceProvider);
        this.f31771r = x0Var;
        x0Var.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6)));
        this.f31771r.setOnClickListener(new f0(this, 25));
        V(this.f31771r.a(d6Var), false);
        this.f31771r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f31766b, this.f31767c);
        frameLayout.addView(this.f31771r, h7.z5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.yj yjVar;
        if (i10 != NotificationCenter.storiesListUpdated) {
            if (i10 != NotificationCenter.hashtagSearchUpdated || (yjVar = this.f31769f) == null || yjVar.f42977a == null || ((Integer) objArr[0]).intValue() != this.f31769f.f42977a.getClassGuid()) {
                return;
            }
            int iIntValue = ((Integer) objArr[1]).intValue();
            pf.x0 x0Var = this.f31771r;
            if (x0Var != null) {
                x0Var.b(iIntValue, this.f31766b, this.f31767c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        jh.d6 d6Var = this.d;
        if (obj == d6Var) {
            pf.x0 x0Var2 = this.f31771r;
            if (x0Var2 != null) {
                V(x0Var2.a(d6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", d6Var.J, new Object[0]));
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        jh.d6 d6Var = this.d;
        arrayList.add(d6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        d6Var.p(18, true);
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
