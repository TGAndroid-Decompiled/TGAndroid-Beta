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
public final class du extends org.telegram.ui.ActionBar.g2 {
    public static final org.telegram.ui.Components.cq0 f47226y = new org.telegram.ui.Components.cq0(2);
    public bx f47227a;
    public ContactsActivity f47228b;
    public org.telegram.ui.ActionBar.q0 f47229c;
    public Paint d;
    public ScrollSlidingTextTabStrip f47230e;
    public cu[] f47231f;
    public AnimatorSet h;
    public boolean f47232n;
    public boolean f47233r;
    public boolean f47234s;
    public int f47235w;
    public boolean f47236x;

    public static void Z(du duVar, TLRPC.User user) {
        if (org.telegram.messenger.mp.L2(user)) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.N0(2131751093, null), duVar);
        } else {
            org.telegram.messenger.mp.u1(duVar.currentAccount).w(user.f28641id);
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.N0(2131743514, null), duVar);
        }
        duVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k m0(du duVar) {
        return duVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k n0(du duVar) {
        return duVar.actionBar;
    }

    public static void o0(du duVar, float f10) {
        cu[] cuVarArr = duVar.f47231f;
        duVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            int i10 = (int) f10;
            cuVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.b1 b1Var = cuVarArr[i7].f46876e;
            if (b1Var != null) {
                b1Var.setPinnedSectionOffsetY(i10);
            }
        }
        duVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
        bx bxVar = this.f47227a;
        if (bxVar != null) {
            bxVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f47228b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.ek0 ek0Var;
        di.b1 b1Var;
        ContactsActivity contactsActivity = this.f47228b;
        bx bxVar = this.f47227a;
        cu[] cuVarArr = this.f47231f;
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131753684, null));
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
        this.actionBar.setActionBarMenuOnItemClick(new y7(this, 29));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 11);
        this.f47229c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f47230e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f47230e, c8.na.e(-1, 44, 83));
        this.f47230e.setDelegate(new f(this, 13));
        this.f47235w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bu buVar = new bu(this, context);
        this.fragmentView = buVar;
        buVar.setWillNotDraw(false);
        bxVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < cuVarArr.length) {
            cu cuVar = new cu(this, context);
            cuVarArr[i7] = cuVar;
            buVar.addView(cuVar, c8.na.c(-1.0f, -1));
            if (i7 == 0) {
                cu cuVar2 = cuVarArr[i7];
                cuVar2.f46873a = bxVar;
                f10 = f11;
                cuVar2.d = bxVar.f46549f0[0].f45822a;
                bxVar.Y3();
                jw jwVar = bxVar.D0;
                if (jwVar != null) {
                    b1Var = jwVar.f40082b0;
                } else {
                    b1Var = null;
                }
                cuVar2.f46876e = b1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    cu cuVar3 = cuVarArr[i7];
                    cuVar3.f46873a = contactsActivity;
                    cuVar3.d = contactsActivity.d;
                    cuVar3.setVisibility(8);
                }
            }
            cuVarArr[i7].d.setScrollingTouchSlop(1);
            cu cuVar4 = cuVarArr[i7];
            cuVar4.f46874b = (FrameLayout) cuVar4.f46873a.getFragmentView();
            cu cuVar5 = cuVarArr[i7];
            cuVar5.f46875c = cuVar5.f46873a.getActionBar();
            cu cuVar6 = cuVarArr[i7];
            cuVar6.addView(cuVar6.f46874b, c8.na.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(cuVarArr[i7].f46875c);
            cu cuVar7 = cuVarArr[i7];
            cuVar7.addView(cuVar7.f46875c, c8.na.c(-2.0f, -1));
            cuVarArr[i7].f46875c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    ek0Var = cuVarArr[i7].d;
                } else {
                    ek0Var = cuVarArr[i7].f46876e;
                }
                if (ek0Var != null) {
                    ek0Var.setClipToPadding(false);
                    ek0Var.setOnScrollListener(new bi.j6(7, this, ek0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        buVar.addView(this.actionBar, c8.na.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f47230e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.gd.N0(2131753687, null), null);
            this.f47230e.a(1, org.telegram.messenger.gd.N0(2131753686, null), null);
            this.f47230e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f47230e.getCurrentTabId();
            if (currentTabId >= 0) {
                cuVarArr[0].f46877f = currentTabId;
            }
            this.f47230e.c();
        }
        r0(false);
        if (this.f47230e.getCurrentTabId() == this.f47230e.getFirstTabId()) {
            z10 = true;
        }
        this.f47236x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47230e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47230e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47230e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f47230e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L8));
        arrayList.addAll(this.f47227a.getThemeDescriptions());
        arrayList.addAll(this.f47228b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f47236x;
    }

    @Override
    public final void onFragmentDestroy() {
        bx bxVar = this.f47227a;
        if (bxVar != null) {
            bxVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f47228b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        bx bxVar = this.f47227a;
        if (bxVar != null) {
            bxVar.onPause();
        }
        ContactsActivity contactsActivity = this.f47228b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        bx bxVar = this.f47227a;
        if (bxVar != null) {
            bxVar.onResume();
        }
        ContactsActivity contactsActivity = this.f47228b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            bx bxVar = this.f47227a;
            if (bxVar != null && bxVar.fragmentView != null) {
                bxVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f47228b;
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
            String N0 = org.telegram.messenger.gd.N0(2131753689, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AreYouSureBlockContact2", null, 2131754116, org.telegram.messenger.i5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131753690, null), new zs(1, this, user));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
            }
        }
    }

    public final void r0(boolean z10) {
        org.telegram.ui.Components.ek0 ek0Var;
        cu[] cuVarArr = this.f47231f;
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            cuVarArr[i7].d.C0();
            di.b1 b1Var = cuVarArr[i7].f46876e;
            if (b1Var != null) {
                b1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                ek0Var = cuVarArr[z10 ? 1 : 0].d;
            } else {
                ek0Var = cuVarArr[z10 ? 1 : 0].f46876e;
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
