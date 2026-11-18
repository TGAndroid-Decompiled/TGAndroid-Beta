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
public final class eu extends org.telegram.ui.ActionBar.h2 {
    public static final org.telegram.ui.Components.bq0 f47354y = new org.telegram.ui.Components.bq0(2);
    public cx f47355a;
    public ContactsActivity f47356b;
    public org.telegram.ui.ActionBar.r0 f47357c;
    public Paint d;
    public ScrollSlidingTextTabStrip f47358e;
    public du[] f47359f;
    public AnimatorSet h;
    public boolean f47360n;
    public boolean f47361r;
    public boolean f47362s;
    public int f47363w;
    public boolean f47364x;

    public static void Z(eu euVar, TLRPC.User user) {
        if (org.telegram.messenger.mp.L2(user)) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131751094, null), euVar);
        } else {
            org.telegram.messenger.mp.u1(euVar.currentAccount).w(user.f28554id);
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131743524, null), euVar);
        }
        euVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k m0(eu euVar) {
        return euVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k n0(eu euVar) {
        return euVar.actionBar;
    }

    public static void o0(eu euVar, float f10) {
        du[] duVarArr = euVar.f47359f;
        euVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            int i10 = (int) f10;
            duVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.b1 b1Var = duVarArr[i7].f47051e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i10);
            }
        }
        euVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
        cx cxVar = this.f47355a;
        if (cxVar != null) {
            cxVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f47356b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.ck0 ck0Var;
        di.b1 b1Var;
        ContactsActivity contactsActivity = this.f47356b;
        cx cxVar = this.f47355a;
        du[] duVarArr = this.f47359f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131753685, null));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        boolean z10 = false;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 29));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131232488);
        a10.O();
        a10.I = new bi.s1(this, 11);
        this.f47357c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f47358e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f47358e, c8.ma.e(-1, 44, 83));
        this.f47358e.setDelegate(new f(this, 13));
        this.f47363w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cu cuVar = new cu(this, context);
        this.fragmentView = cuVar;
        cuVar.setWillNotDraw(false);
        cxVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < duVarArr.length) {
            du duVar = new du(this, context);
            duVarArr[i7] = duVar;
            cuVar.addView(duVar, c8.ma.c(-1.0f, -1));
            if (i7 == 0) {
                du duVar2 = duVarArr[i7];
                duVar2.f47048a = cxVar;
                f10 = f11;
                duVar2.d = cxVar.f46683f0[0].f46307a;
                cxVar.Y3();
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    b1Var = kwVar.f39182b0;
                } else {
                    b1Var = null;
                }
                duVar2.f47051e = b1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    du duVar3 = duVarArr[i7];
                    duVar3.f47048a = contactsActivity;
                    duVar3.d = contactsActivity.d;
                    duVar3.setVisibility(8);
                }
            }
            duVarArr[i7].d.setScrollingTouchSlop(1);
            du duVar4 = duVarArr[i7];
            duVar4.f47049b = (FrameLayout) duVar4.f47048a.getFragmentView();
            du duVar5 = duVarArr[i7];
            duVar5.f47050c = duVar5.f47048a.getActionBar();
            du duVar6 = duVarArr[i7];
            duVar6.addView(duVar6.f47049b, c8.ma.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(duVarArr[i7].f47050c);
            du duVar7 = duVarArr[i7];
            duVar7.addView(duVar7.f47050c, c8.ma.c(-2.0f, -1));
            duVarArr[i7].f47050c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    ck0Var = duVarArr[i7].d;
                } else {
                    ck0Var = duVarArr[i7].f47051e;
                }
                if (ck0Var != null) {
                    ck0Var.setClipToPadding(false);
                    ck0Var.setOnScrollListener(new bi.e6(7, this, ck0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        cuVar.addView(this.actionBar, c8.ma.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f47358e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.gd.M0(2131753688, null), null);
            this.f47358e.a(1, org.telegram.messenger.gd.M0(2131753687, null), null);
            this.f47358e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f47358e.getCurrentTabId();
            if (currentTabId >= 0) {
                duVarArr[0].f47052f = currentTabId;
            }
            this.f47358e.c();
        }
        r0(false);
        if (this.f47358e.getCurrentTabId() == this.f47358e.getFirstTabId()) {
            z10 = true;
        }
        this.f47364x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47358e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47358e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47358e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f47358e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L8));
        arrayList.addAll(this.f47355a.getThemeDescriptions());
        arrayList.addAll(this.f47356b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f47364x;
    }

    @Override
    public final void onFragmentDestroy() {
        cx cxVar = this.f47355a;
        if (cxVar != null) {
            cxVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f47356b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cx cxVar = this.f47355a;
        if (cxVar != null) {
            cxVar.onPause();
        }
        ContactsActivity contactsActivity = this.f47356b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cx cxVar = this.f47355a;
        if (cxVar != null) {
            cxVar.onResume();
        }
        ContactsActivity contactsActivity = this.f47356b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cx cxVar = this.f47355a;
            if (cxVar != null && cxVar.fragmentView != null) {
                cxVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f47356b;
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
            String M0 = org.telegram.messenger.gd.M0(2131753690, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureBlockContact2", null, 2131754117, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131753691, null), new at(1, this, user));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
            }
        }
    }

    public final void r0(boolean z10) {
        org.telegram.ui.Components.ck0 ck0Var;
        du[] duVarArr = this.f47359f;
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            duVarArr[i7].d.C0();
            di.b1 b1Var = duVarArr[i7].f47051e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                ck0Var = duVarArr[z10 ? 1 : 0].d;
            } else {
                ck0Var = duVarArr[z10 ? 1 : 0].f47051e;
            }
            if (ck0Var != null) {
                ck0Var.getAdapter();
                ck0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.c0) ck0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
