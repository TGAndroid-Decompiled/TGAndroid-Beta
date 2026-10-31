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
public final class dv extends org.telegram.ui.ActionBar.k2 {
    public static final org.telegram.ui.Components.qq0 f36837y = new org.telegram.ui.Components.qq0(2);
    public ay f36838a;
    public ContactsActivity f36839b;
    public org.telegram.ui.ActionBar.t0 f36840c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public cv[] f36841f;
    public AnimatorSet h;
    public boolean f36842n;
    public boolean f36843r;
    public boolean f36844s;
    public int f36845w;
    public boolean f36846x;

    public static void Y(dv dvVar, TLRPC.User user) {
        if (org.telegram.messenger.vp.E2(user)) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131751106, null), dvVar);
        } else {
            org.telegram.messenger.vp.r1(dvVar.currentAccount).w(user.f19942id);
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131743787, null), dvVar);
        }
        dvVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.l l0(dv dvVar) {
        return dvVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l m0(dv dvVar) {
        return dvVar.actionBar;
    }

    public static void n0(dv dvVar, float f7) {
        cv[] cvVarArr = dvVar.f36841f;
        dvVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < cvVarArr.length; i10++) {
            int i11 = (int) f7;
            cvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            ag.b1 b1Var = cvVarArr[i10].e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i11);
            }
        }
        dvVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
        ay ayVar = this.f36838a;
        if (ayVar != null) {
            ayVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f36839b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.tk0 tk0Var;
        ag.b1 b1Var;
        ContactsActivity contactsActivity = this.f36839b;
        ay ayVar = this.f36838a;
        cv[] cvVarArr = this.f36841f;
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131753687, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        boolean z10 = false;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 17));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 10);
        this.f36840c = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.b6.e(-1, 44, 83));
        this.e.setDelegate(new e(this, 13));
        this.f36845w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bv bvVar = new bv(this, context);
        this.fragmentView = bvVar;
        bvVar.setWillNotDraw(false);
        ayVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < cvVarArr.length) {
            cv cvVar = new cv(this, context);
            cvVarArr[i10] = cvVar;
            bvVar.addView(cvVar, w7.b6.c(-1.0f, -1));
            if (i10 == 0) {
                cv cvVar2 = cvVarArr[i10];
                cvVar2.f36553a = ayVar;
                f7 = f10;
                cvVar2.d = ayVar.f35794e0[0].f44239a;
                ayVar.X3();
                kx kxVar = ayVar.C0;
                if (kxVar != null) {
                    b1Var = kxVar.f26448a0;
                } else {
                    b1Var = null;
                }
                cvVar2.e = b1Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    cv cvVar3 = cvVarArr[i10];
                    cvVar3.f36553a = contactsActivity;
                    cvVar3.d = contactsActivity.d;
                    cvVar3.setVisibility(8);
                }
            }
            cvVarArr[i10].d.setScrollingTouchSlop(1);
            cv cvVar4 = cvVarArr[i10];
            cvVar4.f36554b = (FrameLayout) cvVar4.f36553a.getFragmentView();
            cv cvVar5 = cvVarArr[i10];
            cvVar5.f36555c = cvVar5.f36553a.getActionBar();
            cv cvVar6 = cvVarArr[i10];
            cvVar6.addView(cvVar6.f36554b, w7.b6.c(-1.0f, -1));
            org.telegram.messenger.i0.E2(cvVarArr[i10].f36555c);
            cv cvVar7 = cvVarArr[i10];
            cvVar7.addView(cvVar7.f36555c, w7.b6.c(-2.0f, -1));
            cvVarArr[i10].f36555c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    tk0Var = cvVarArr[i10].d;
                } else {
                    tk0Var = cvVarArr[i10].e;
                }
                if (tk0Var != null) {
                    tk0Var.setClipToPadding(false);
                    tk0Var.setOnScrollListener(new bi.t3(7, this, tk0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        bvVar.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.cd.L0(2131753690, null), null);
            this.e.a(1, org.telegram.messenger.cd.L0(2131753689, null), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                cvVarArr[0].f36556f = currentTabId;
            }
            this.e.c();
        }
        q0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f36846x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L8));
        arrayList.addAll(this.f36838a.getThemeDescriptions());
        arrayList.addAll(this.f36839b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36846x;
    }

    @Override
    public final void onFragmentDestroy() {
        ay ayVar = this.f36838a;
        if (ayVar != null) {
            ayVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f36839b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ay ayVar = this.f36838a;
        if (ayVar != null) {
            ayVar.onPause();
        }
        ContactsActivity contactsActivity = this.f36839b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ay ayVar = this.f36838a;
        if (ayVar != null) {
            ayVar.onResume();
        }
        ContactsActivity contactsActivity = this.f36839b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ay ayVar = this.f36838a;
            if (ayVar != null && ayVar.fragmentView != null) {
                ayVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            ContactsActivity contactsActivity = this.f36839b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void p0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131753692, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753693, null), new org.telegram.ui.Components.f2(29, this, user));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        }
    }

    public final void q0(boolean z10) {
        org.telegram.ui.Components.tk0 tk0Var;
        cv[] cvVarArr = this.f36841f;
        for (int i10 = 0; i10 < cvVarArr.length; i10++) {
            cvVarArr[i10].d.C0();
            ag.b1 b1Var = cvVarArr[i10].e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                tk0Var = cvVarArr[z10 ? 1 : 0].d;
            } else {
                tk0Var = cvVarArr[z10 ? 1 : 0].e;
            }
            if (tk0Var != null) {
                tk0Var.getAdapter();
                tk0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.a0) tk0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
