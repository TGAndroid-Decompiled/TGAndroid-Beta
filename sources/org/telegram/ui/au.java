package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class au extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 f44094y = new org.telegram.ui.Components.qp0(2);
    public ww f44095a;
    public ContactsActivity f44096b;
    public org.telegram.ui.ActionBar.r0 f44097c;
    public Paint d;
    public ScrollSlidingTextTabStrip f44098e;
    public zt[] f44099f;
    public AnimatorSet h;
    public boolean f44100n;
    public boolean f44101r;
    public boolean f44102s;
    public int f44103w;
    public boolean f44104x;

    public static void Z(au auVar, TLRPC.User user) {
        if (org.telegram.messenger.qp.F2(user)) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131751106, null), auVar);
        } else {
            org.telegram.messenger.qp.s1(auVar.currentAccount).w(user.f27105id);
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131743764, null), auVar);
        }
        auVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k m0(au auVar) {
        return auVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k n0(au auVar) {
        return auVar.actionBar;
    }

    public static void o0(au auVar, float f10) {
        zt[] ztVarArr = auVar.f44099f;
        auVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < ztVarArr.length; i7++) {
            int i10 = (int) f10;
            ztVarArr[i7].d.setPinnedSectionOffsetY(i10);
            bi.q1 q1Var = ztVarArr[i7].f52679e;
            if (q1Var != null) {
                q1Var.setPinnedSectionOffsetY(i10);
            }
        }
        auVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
        ww wwVar = this.f44095a;
        if (wwVar != null) {
            wwVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f44096b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.pj0 pj0Var;
        bi.q1 q1Var;
        ContactsActivity contactsActivity = this.f44096b;
        ww wwVar = this.f44095a;
        zt[] ztVarArr = this.f44099f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131753687, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        boolean z9 = false;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 10);
        this.f44097c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f44098e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f44098e, c8.ha.e(-1, 44, 83));
        this.f44098e.setDelegate(new f(this, 13));
        this.f44103w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yt ytVar = new yt(this, context);
        this.fragmentView = ytVar;
        ytVar.setWillNotDraw(false);
        wwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < ztVarArr.length) {
            zt ztVar = new zt(this, context);
            ztVarArr[i7] = ztVar;
            ytVar.addView(ztVar, c8.ha.c(-1.0f, -1));
            if (i7 == 0) {
                zt ztVar2 = ztVarArr[i7];
                ztVar2.f52676a = wwVar;
                f10 = f11;
                ztVar2.d = wwVar.f51556e0[0].f50782a;
                wwVar.Y3();
                fw fwVar = wwVar.C0;
                if (fwVar != null) {
                    q1Var = fwVar.f33595a0;
                } else {
                    q1Var = null;
                }
                ztVar2.f52679e = q1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    zt ztVar3 = ztVarArr[i7];
                    ztVar3.f52676a = contactsActivity;
                    ztVar3.d = contactsActivity.d;
                    ztVar3.setVisibility(8);
                }
            }
            ztVarArr[i7].d.setScrollingTouchSlop(1);
            zt ztVar4 = ztVarArr[i7];
            ztVar4.f52677b = (FrameLayout) ztVar4.f52676a.getFragmentView();
            zt ztVar5 = ztVarArr[i7];
            ztVar5.f52678c = ztVar5.f52676a.getActionBar();
            zt ztVar6 = ztVarArr[i7];
            ztVar6.addView(ztVar6.f52677b, c8.ha.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(ztVarArr[i7].f52678c);
            zt ztVar7 = ztVarArr[i7];
            ztVar7.addView(ztVar7.f52678c, c8.ha.c(-2.0f, -1));
            ztVarArr[i7].f52678c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    pj0Var = ztVarArr[i7].d;
                } else {
                    pj0Var = ztVarArr[i7].f52679e;
                }
                if (pj0Var != null) {
                    pj0Var.setClipToPadding(false);
                    pj0Var.setOnScrollListener(new ai.o0(6, this, pj0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        ytVar.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f44098e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.id.M0(2131753690, null), null);
            this.f44098e.a(1, org.telegram.messenger.id.M0(2131753689, null), null);
            this.f44098e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f44098e.getCurrentTabId();
            if (currentTabId >= 0) {
                ztVarArr[0].f52680f = currentTabId;
            }
            this.f44098e.c();
        }
        r0(false);
        if (this.f44098e.getCurrentTabId() == this.f44098e.getFirstTabId()) {
            z9 = true;
        }
        this.f44104x = z9;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44098e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44098e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44098e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f44098e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.f44095a.getThemeDescriptions());
        arrayList.addAll(this.f44096b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f44104x;
    }

    @Override
    public final void onFragmentDestroy() {
        ww wwVar = this.f44095a;
        if (wwVar != null) {
            wwVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f44096b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ww wwVar = this.f44095a;
        if (wwVar != null) {
            wwVar.onPause();
        }
        ContactsActivity contactsActivity = this.f44096b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ww wwVar = this.f44095a;
        if (wwVar != null) {
            wwVar.onResume();
        }
        ContactsActivity contactsActivity = this.f44096b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ww wwVar = this.f44095a;
            if (wwVar != null && wwVar.fragmentView != null) {
                wwVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f44096b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void q0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131753692, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753693, null), new org.telegram.ui.Components.f2(28, this, user));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
            }
        }
    }

    public final void r0(boolean z9) {
        org.telegram.ui.Components.pj0 pj0Var;
        zt[] ztVarArr = this.f44099f;
        for (int i7 = 0; i7 < ztVarArr.length; i7++) {
            ztVarArr[i7].d.C0();
            bi.q1 q1Var = ztVarArr[i7].f52679e;
            if (q1Var != null) {
                q1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                pj0Var = ztVarArr[z9 ? 1 : 0].d;
            } else {
                pj0Var = ztVarArr[z9 ? 1 : 0].f52679e;
            }
            if (pj0Var != null) {
                pj0Var.getAdapter();
                pj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.b0) pj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
