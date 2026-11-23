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
public final class eu extends org.telegram.ui.ActionBar.g2 {
    public static final org.telegram.ui.Components.dq0 f47383y = new org.telegram.ui.Components.dq0(2);
    public cx f47384a;
    public ContactsActivity f47385b;
    public org.telegram.ui.ActionBar.q0 f47386c;
    public Paint d;
    public ScrollSlidingTextTabStrip f47387e;
    public du[] f47388f;
    public AnimatorSet h;
    public boolean f47389n;
    public boolean f47390r;
    public boolean f47391s;
    public int f47392w;
    public boolean f47393x;

    public static void Z(eu euVar, TLRPC.User user) {
        if (org.telegram.messenger.np.L2(user)) {
            org.telegram.ui.Components.c5.t0(org.telegram.messenger.hd.N0(2131751093, null), euVar);
        } else {
            org.telegram.messenger.np.u1(euVar.currentAccount).w(user.f28583id);
            org.telegram.ui.Components.c5.t0(org.telegram.messenger.hd.N0(2131743516, null), euVar);
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
        du[] duVarArr = euVar.f47388f;
        euVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            int i10 = (int) f10;
            duVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.b1 b1Var = duVarArr[i7].f47043e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i10);
            }
        }
        euVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
        cx cxVar = this.f47384a;
        if (cxVar != null) {
            cxVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f47385b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.ek0 ek0Var;
        di.b1 b1Var;
        ContactsActivity contactsActivity = this.f47385b;
        cx cxVar = this.f47384a;
        du[] duVarArr = this.f47388f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131753684, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        boolean z10 = false;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 29));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232488);
        a10.O();
        a10.I = new bi.w1(this, 11);
        this.f47386c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f47387e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f47387e, c8.ma.e(-1, 44, 83));
        this.f47387e.setDelegate(new f(this, 13));
        this.f47392w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
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
                duVar2.f47040a = cxVar;
                f10 = f11;
                duVar2.d = cxVar.f46722f0[0].f46325a;
                cxVar.Y3();
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    b1Var = kwVar.f40500b0;
                } else {
                    b1Var = null;
                }
                duVar2.f47043e = b1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    du duVar3 = duVarArr[i7];
                    duVar3.f47040a = contactsActivity;
                    duVar3.d = contactsActivity.d;
                    duVar3.setVisibility(8);
                }
            }
            duVarArr[i7].d.setScrollingTouchSlop(1);
            du duVar4 = duVarArr[i7];
            duVar4.f47041b = (FrameLayout) duVar4.f47040a.getFragmentView();
            du duVar5 = duVarArr[i7];
            duVar5.f47042c = duVar5.f47040a.getActionBar();
            du duVar6 = duVarArr[i7];
            duVar6.addView(duVar6.f47041b, c8.ma.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(duVarArr[i7].f47042c);
            du duVar7 = duVarArr[i7];
            duVar7.addView(duVar7.f47042c, c8.ma.c(-2.0f, -1));
            duVarArr[i7].f47042c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    ek0Var = duVarArr[i7].d;
                } else {
                    ek0Var = duVarArr[i7].f47043e;
                }
                if (ek0Var != null) {
                    ek0Var.setClipToPadding(false);
                    ek0Var.setOnScrollListener(new bi.g6(7, this, ek0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        cuVar.addView(this.actionBar, c8.ma.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f47387e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.hd.N0(2131753687, null), null);
            this.f47387e.a(1, org.telegram.messenger.hd.N0(2131753686, null), null);
            this.f47387e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f47387e.getCurrentTabId();
            if (currentTabId >= 0) {
                duVarArr[0].f47044f = currentTabId;
            }
            this.f47387e.c();
        }
        r0(false);
        if (this.f47387e.getCurrentTabId() == this.f47387e.getFirstTabId()) {
            z10 = true;
        }
        this.f47393x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47387e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47387e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47387e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f47387e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L8));
        arrayList.addAll(this.f47384a.getThemeDescriptions());
        arrayList.addAll(this.f47385b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f47393x;
    }

    @Override
    public final void onFragmentDestroy() {
        cx cxVar = this.f47384a;
        if (cxVar != null) {
            cxVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f47385b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cx cxVar = this.f47384a;
        if (cxVar != null) {
            cxVar.onPause();
        }
        ContactsActivity contactsActivity = this.f47385b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cx cxVar = this.f47384a;
        if (cxVar != null) {
            cxVar.onResume();
        }
        ContactsActivity contactsActivity = this.f47385b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cx cxVar = this.f47384a;
            if (cxVar != null && cxVar.fragmentView != null) {
                cxVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f47385b;
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
            String N0 = org.telegram.messenger.hd.N0(2131753689, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754116, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131753690, null), new at(1, this, user));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
            }
        }
    }

    public final void r0(boolean z10) {
        org.telegram.ui.Components.ek0 ek0Var;
        du[] duVarArr = this.f47388f;
        for (int i7 = 0; i7 < duVarArr.length; i7++) {
            duVarArr[i7].d.C0();
            di.b1 b1Var = duVarArr[i7].f47043e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                ek0Var = duVarArr[z10 ? 1 : 0].d;
            } else {
                ek0Var = duVarArr[z10 ? 1 : 0].f47043e;
            }
            if (ek0Var != null) {
                ek0Var.getAdapter();
                ek0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.c0) ek0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
