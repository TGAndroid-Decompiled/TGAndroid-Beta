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
public final class i40 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String f27280a;
    public final String f27281b;
    public final String f27282c;
    public final ci.t6 d;
    public ci.h4 e;
    public org.telegram.ui.bk f27283f;
    public FrameLayout h;
    public f40 f27284n;
    public hg.m1 f27285r;
    public FrameLayout f27286s;
    public TextView v;
    public float f27287w;
    public ValueAnimator f27288x;
    public boolean f27289y;

    public i40(String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        setResourceProvider(g6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.f27281b = trim.substring(0, indexOf);
            this.f27282c = trim.substring(indexOf + 1);
        } else {
            this.f27281b = trim;
            this.f27282c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27281b);
        if (!TextUtils.isEmpty(this.f27282c)) {
            str2 = "@" + this.f27282c;
        }
        sb2.append(str2);
        this.f27280a = sb2.toString();
        this.d = new ci.t6(this.currentAccount, this.f27282c, this.f27281b);
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
            this.f27289y = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E = f7;
            f40 f40Var = this.f27284n;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.95f;
            }
            f40Var.setScaleX(f10);
            f40 f40Var2 = this.f27284n;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.95f;
            }
            f40Var2.setScaleY(f11);
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
            org.telegram.ui.bk bkVar = this.f27283f;
            if (bkVar != null && (tnVar = bkVar.f42454a) != null && (u1Var = tnVar.X3) != null) {
                u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
                this.f27283f.f42454a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
            }
        } else if (this.f27289y == z10) {
        } else {
            this.f27289y = z10;
            this.h.setVisibility(0);
            float f13 = this.E;
            if (z10) {
                f12 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f12);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new g40(this, 1));
            this.F.addListener(new h40(this, z10, 1));
            this.F.setDuration(320L);
            this.F.setInterpolator(zr.h);
            this.F.start();
        }
    }

    public final void V(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        int i11;
        this.f27285r.animate().cancel();
        ValueAnimator valueAnimator = this.f27288x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (!z11) {
            hg.m1 m1Var = this.f27285r;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m1Var.setVisibility(i10);
            hg.m1 m1Var2 = this.f27285r;
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
        this.f27285r.setVisibility(0);
        ViewPropertyAnimator animate = this.f27285r.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = -AndroidUtilities.dp(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f7).withEndAction(new ah.t(29, this, z10)).setDuration(320L);
        zr zrVar = zr.h;
        duration.setInterpolator(zrVar).start();
        float f12 = this.f27287w;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
        this.f27288x = ofFloat;
        ofFloat.addUpdateListener(new g40(this, 0));
        this.f27288x.addListener(new h40(this, z10, 0));
        this.f27288x.setDuration(320L);
        this.f27288x.setInterpolator(zrVar);
        this.f27288x.start();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.f27280a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i10, kVar2, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar3, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21502u8, getResourceProvider());
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
        this.f27283f = bkVar;
        this.e.addView(bkVar, w7.z5.e(-1, -1, 119));
        f40 f40Var = new f40(this, context, new ov0(null), this, new Object(), this.resourceProvider);
        this.f27284n = f40Var;
        if (f40Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.f27284n.getSearchOptionsItem(), i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.f27284n.setPinnedToTop(true);
        this.f27284n.f32400r0.setTranslationY(0.0f);
        if (this.f27284n.getSearchOptionsItem() != null) {
            this.f27284n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.r6.i(i10, this.f27284n, getResourceProvider());
        f40 f40Var2 = this.f27284n;
        ci.t6 t6Var = this.d;
        f40Var2.U1 = t6Var;
        eu0 eu0Var = f40Var2.f32365c0;
        eu0Var.f30902s = t6Var;
        eu0Var.l();
        tv0 tv0Var = f40Var2.f32368d0;
        tv0Var.f30902s = t6Var;
        tv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, getResourceProvider());
        this.h.addView(this.f27284n, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27286s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(this.v, org.telegram.ui.ActionBar.k6.f21579ye, getResourceProvider());
        this.v.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
        this.f27286s.addView(this.v, w7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, this.resourceProvider);
        this.f27286s.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.f27286s, w7.z5.e(-1, 49, 87));
        this.e.addView(this.h, w7.z5.e(-1, -1, 119));
        hg.m1 m1Var = new hg.m1(context, this.resourceProvider);
        this.f27285r = m1Var;
        int themedColor = getThemedColor(i10);
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(themedColor, getThemedColor(i12));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        m1Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(m1Var, h02, O, O2, resourceProvider);
        this.f27285r.setOnClickListener(new f0(this, 24));
        V(this.f27285r.a(t6Var), false);
        this.f27285r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.f27281b, this.f27282c);
        frameLayout.addView(this.f27285r, w7.z5.e(-1, 48, 55));
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
                hg.m1 m1Var = this.f27285r;
                if (m1Var != null) {
                    V(m1Var.a(t6Var), true);
                }
                TextView textView = this.v;
                if (textView != null) {
                    textView.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
                }
            }
        } else if (i10 == NotificationCenter.hashtagSearchUpdated && (bkVar = this.f27283f) != null && bkVar.f42454a != null && ((Integer) objArr[0]).intValue() == this.f27283f.f42454a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            hg.m1 m1Var2 = this.f27285r;
            if (m1Var2 != null) {
                m1Var2.b(intValue, this.f27281b, this.f27282c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, true)) > 0.699999988079071d) {
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
