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
public final class cu extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.rp0 f44751y = new org.telegram.ui.Components.rp0(2);
    public yw f44752a;
    public ContactsActivity f44753b;
    public org.telegram.ui.ActionBar.r0 f44754c;
    public Paint d;
    public ScrollSlidingTextTabStrip f44755e;
    public bu[] f44756f;
    public AnimatorSet h;
    public boolean f44757n;
    public boolean f44758r;
    public boolean f44759s;
    public int f44760w;
    public boolean f44761x;

    public static void Z(cu cuVar, TLRPC.User user) {
        if (org.telegram.messenger.qp.F2(user)) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131751105, null), cuVar);
        } else {
            org.telegram.messenger.qp.s1(cuVar.currentAccount).w(user.f27105id);
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131743761, null), cuVar);
        }
        cuVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k m0(cu cuVar) {
        return cuVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k n0(cu cuVar) {
        return cuVar.actionBar;
    }

    public static void o0(cu cuVar, float f10) {
        bu[] buVarArr = cuVar.f44756f;
        cuVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            int i10 = (int) f10;
            buVarArr[i7].d.setPinnedSectionOffsetY(i10);
            bi.q1 q1Var = buVarArr[i7].f44138e;
            if (q1Var != null) {
                q1Var.setPinnedSectionOffsetY(i10);
            }
        }
        cuVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
        yw ywVar = this.f44752a;
        if (ywVar != null) {
            ywVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f44753b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.qj0 qj0Var;
        bi.q1 q1Var;
        ContactsActivity contactsActivity = this.f44753b;
        yw ywVar = this.f44752a;
        bu[] buVarArr = this.f44756f;
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
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 10);
        this.f44754c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f44755e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f44755e, c8.ha.e(-1, 44, 83));
        this.f44755e.setDelegate(new f(this, 13));
        this.f44760w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        au auVar = new au(this, context);
        this.fragmentView = auVar;
        auVar.setWillNotDraw(false);
        ywVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < buVarArr.length) {
            bu buVar = new bu(this, context);
            buVarArr[i7] = buVar;
            auVar.addView(buVar, c8.ha.c(-1.0f, -1));
            if (i7 == 0) {
                bu buVar2 = buVarArr[i7];
                buVar2.f44135a = ywVar;
                f10 = f11;
                buVar2.d = ywVar.f52231e0[0].f51772a;
                ywVar.Y3();
                hw hwVar = ywVar.C0;
                if (hwVar != null) {
                    q1Var = hwVar.f33992a0;
                } else {
                    q1Var = null;
                }
                buVar2.f44138e = q1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    bu buVar3 = buVarArr[i7];
                    buVar3.f44135a = contactsActivity;
                    buVar3.d = contactsActivity.d;
                    buVar3.setVisibility(8);
                }
            }
            buVarArr[i7].d.setScrollingTouchSlop(1);
            bu buVar4 = buVarArr[i7];
            buVar4.f44136b = (FrameLayout) buVar4.f44135a.getFragmentView();
            bu buVar5 = buVarArr[i7];
            buVar5.f44137c = buVar5.f44135a.getActionBar();
            bu buVar6 = buVarArr[i7];
            buVar6.addView(buVar6.f44136b, c8.ha.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(buVarArr[i7].f44137c);
            bu buVar7 = buVarArr[i7];
            buVar7.addView(buVar7.f44137c, c8.ha.c(-2.0f, -1));
            buVarArr[i7].f44137c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    qj0Var = buVarArr[i7].d;
                } else {
                    qj0Var = buVarArr[i7].f44138e;
                }
                if (qj0Var != null) {
                    qj0Var.setClipToPadding(false);
                    qj0Var.setOnScrollListener(new ai.o0(6, this, qj0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        auVar.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f44755e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.id.M0(2131753690, null), null);
            this.f44755e.a(1, org.telegram.messenger.id.M0(2131753689, null), null);
            this.f44755e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f44755e.getCurrentTabId();
            if (currentTabId >= 0) {
                buVarArr[0].f44139f = currentTabId;
            }
            this.f44755e.c();
        }
        r0(false);
        if (this.f44755e.getCurrentTabId() == this.f44755e.getFirstTabId()) {
            z9 = true;
        }
        this.f44761x = z9;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44755e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44755e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44755e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f44755e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.L8));
        arrayList.addAll(this.f44752a.getThemeDescriptions());
        arrayList.addAll(this.f44753b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f44761x;
    }

    @Override
    public final void onFragmentDestroy() {
        yw ywVar = this.f44752a;
        if (ywVar != null) {
            ywVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f44753b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        yw ywVar = this.f44752a;
        if (ywVar != null) {
            ywVar.onPause();
        }
        ContactsActivity contactsActivity = this.f44753b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yw ywVar = this.f44752a;
        if (ywVar != null) {
            ywVar.onResume();
        }
        ContactsActivity contactsActivity = this.f44753b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            yw ywVar = this.f44752a;
            if (ywVar != null && ywVar.fragmentView != null) {
                ywVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f44753b;
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
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        }
    }

    public final void r0(boolean z9) {
        org.telegram.ui.Components.qj0 qj0Var;
        bu[] buVarArr = this.f44756f;
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            buVarArr[i7].d.C0();
            bi.q1 q1Var = buVarArr[i7].f44138e;
            if (q1Var != null) {
                q1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                qj0Var = buVarArr[z9 ? 1 : 0].d;
            } else {
                qj0Var = buVarArr[z9 ? 1 : 0].f44138e;
            }
            if (qj0Var != null) {
                qj0Var.getAdapter();
                qj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.b0) qj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
