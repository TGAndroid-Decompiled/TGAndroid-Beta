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
public final class du extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 f45049y = new org.telegram.ui.Components.qp0(2);
    public zw f45050a;
    public ContactsActivity f45051b;
    public org.telegram.ui.ActionBar.r0 f45052c;
    public Paint d;
    public ScrollSlidingTextTabStrip f45053e;
    public cu[] f45054f;
    public AnimatorSet h;
    public boolean f45055n;
    public boolean f45056r;
    public boolean f45057s;
    public int f45058w;
    public boolean f45059x;

    public static void Z(du duVar, TLRPC.User user) {
        if (org.telegram.messenger.qp.F2(user)) {
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131751105, null), duVar);
        } else {
            org.telegram.messenger.qp.s1(duVar.currentAccount).w(user.f27109id);
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131743761, null), duVar);
        }
        duVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.l m0(du duVar) {
        return duVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.l n0(du duVar) {
        return duVar.actionBar;
    }

    public static void o0(du duVar, float f10) {
        cu[] cuVarArr = duVar.f45054f;
        duVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            int i10 = (int) f10;
            cuVarArr[i7].d.setPinnedSectionOffsetY(i10);
            bi.q1 q1Var = cuVarArr[i7].f44810e;
            if (q1Var != null) {
                q1Var.setPinnedSectionOffsetY(i10);
            }
        }
        duVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
        zw zwVar = this.f45050a;
        if (zwVar != null) {
            zwVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f45051b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.pj0 pj0Var;
        bi.q1 q1Var;
        ContactsActivity contactsActivity = this.f45051b;
        zw zwVar = this.f45050a;
        cu[] cuVarArr = this.f45054f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131753687, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        boolean z9 = false;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 10);
        this.f45052c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f45053e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f45053e, c8.ha.e(-1, 44, 83));
        this.f45053e.setDelegate(new f(this, 13));
        this.f45058w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bu buVar = new bu(this, context);
        this.fragmentView = buVar;
        buVar.setWillNotDraw(false);
        zwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < cuVarArr.length) {
            cu cuVar = new cu(this, context);
            cuVarArr[i7] = cuVar;
            buVar.addView(cuVar, c8.ha.c(-1.0f, -1));
            if (i7 == 0) {
                cu cuVar2 = cuVarArr[i7];
                cuVar2.f44807a = zwVar;
                f10 = f11;
                cuVar2.d = zwVar.f52577e0[0].f52125a;
                zwVar.Y3();
                iw iwVar = zwVar.C0;
                if (iwVar != null) {
                    q1Var = iwVar.f33587a0;
                } else {
                    q1Var = null;
                }
                cuVar2.f44810e = q1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    cu cuVar3 = cuVarArr[i7];
                    cuVar3.f44807a = contactsActivity;
                    cuVar3.d = contactsActivity.d;
                    cuVar3.setVisibility(8);
                }
            }
            cuVarArr[i7].d.setScrollingTouchSlop(1);
            cu cuVar4 = cuVarArr[i7];
            cuVar4.f44808b = (FrameLayout) cuVar4.f44807a.getFragmentView();
            cu cuVar5 = cuVarArr[i7];
            cuVar5.f44809c = cuVar5.f44807a.getActionBar();
            cu cuVar6 = cuVarArr[i7];
            cuVar6.addView(cuVar6.f44808b, c8.ha.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(cuVarArr[i7].f44809c);
            cu cuVar7 = cuVarArr[i7];
            cuVar7.addView(cuVar7.f44809c, c8.ha.c(-2.0f, -1));
            cuVarArr[i7].f44809c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    pj0Var = cuVarArr[i7].d;
                } else {
                    pj0Var = cuVarArr[i7].f44810e;
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
        buVar.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f45053e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.id.M0(2131753690, null), null);
            this.f45053e.a(1, org.telegram.messenger.id.M0(2131753689, null), null);
            this.f45053e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f45053e.getCurrentTabId();
            if (currentTabId >= 0) {
                cuVarArr[0].f44811f = currentTabId;
            }
            this.f45053e.c();
        }
        r0(false);
        if (this.f45053e.getCurrentTabId() == this.f45053e.getFirstTabId()) {
            z9 = true;
        }
        this.f45059x = z9;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45053e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45053e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45053e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f45053e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L8));
        arrayList.addAll(this.f45050a.getThemeDescriptions());
        arrayList.addAll(this.f45051b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f45059x;
    }

    @Override
    public final void onFragmentDestroy() {
        zw zwVar = this.f45050a;
        if (zwVar != null) {
            zwVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f45051b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        zw zwVar = this.f45050a;
        if (zwVar != null) {
            zwVar.onPause();
        }
        ContactsActivity contactsActivity = this.f45051b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        zw zwVar = this.f45050a;
        if (zwVar != null) {
            zwVar.onResume();
        }
        ContactsActivity contactsActivity = this.f45051b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            zw zwVar = this.f45050a;
            if (zwVar != null && zwVar.fragmentView != null) {
                zwVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f45051b;
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
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131753693, null), new org.telegram.ui.Components.e2(28, this, user));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
            }
        }
    }

    public final void r0(boolean z9) {
        org.telegram.ui.Components.pj0 pj0Var;
        cu[] cuVarArr = this.f45054f;
        for (int i7 = 0; i7 < cuVarArr.length; i7++) {
            cuVarArr[i7].d.C0();
            bi.q1 q1Var = cuVarArr[i7].f44810e;
            if (q1Var != null) {
                q1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                pj0Var = cuVarArr[z9 ? 1 : 0].d;
            } else {
                pj0Var = cuVarArr[z9 ? 1 : 0].f44810e;
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
