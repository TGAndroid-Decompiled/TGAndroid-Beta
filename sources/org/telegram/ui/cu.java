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
public final class cu extends org.telegram.ui.ActionBar.e2 {
    public static final org.telegram.ui.Components.tp0 f46244y = new org.telegram.ui.Components.tp0(2);
    public yw f46245a;
    public ContactsActivity f46246b;
    public org.telegram.ui.ActionBar.q0 f46247c;
    public Paint d;
    public ScrollSlidingTextTabStrip f46248e;
    public bu[] f46249f;
    public AnimatorSet h;
    public boolean f46250n;
    public boolean f46251r;
    public boolean f46252s;
    public int f46253w;
    public boolean f46254x;

    public static void Z(cu cuVar, TLRPC.User user) {
        if (org.telegram.messenger.np.F2(user)) {
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131751105, null), cuVar);
        } else {
            org.telegram.messenger.np.s1(cuVar.currentAccount).w(user.f28200id);
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131743761, null), cuVar);
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
        bu[] buVarArr = cuVar.f46249f;
        cuVar.actionBar.setTranslationY(f10);
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            int i10 = (int) f10;
            buVarArr[i7].d.setPinnedSectionOffsetY(i10);
            di.c1 c1Var = buVarArr[i7].f45836e;
            if (c1Var != null) {
                c1Var.setPinnedSectionOffsetY(i10);
            }
        }
        cuVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        yw ywVar = this.f46245a;
        if (ywVar != null) {
            ywVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f46246b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.uj0 uj0Var;
        di.c1 c1Var;
        ContactsActivity contactsActivity = this.f46246b;
        yw ywVar = this.f46245a;
        bu[] buVarArr = this.f46249f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131753687, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        boolean z10 = false;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 27));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 10);
        this.f46247c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f46248e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f46248e, c8.ja.e(-1, 44, 83));
        this.f46248e.setDelegate(new f(this, 13));
        this.f46253w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        au auVar = new au(this, context);
        this.fragmentView = auVar;
        auVar.setWillNotDraw(false);
        ywVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i7 = 0;
        while (i7 < buVarArr.length) {
            bu buVar = new bu(this, context);
            buVarArr[i7] = buVar;
            auVar.addView(buVar, c8.ja.c(-1.0f, -1));
            if (i7 == 0) {
                bu buVar2 = buVarArr[i7];
                buVar2.f45833a = ywVar;
                f10 = f11;
                buVar2.d = ywVar.f53673f0[0].f53331a;
                ywVar.Y3();
                hw hwVar = ywVar.D0;
                if (hwVar != null) {
                    c1Var = hwVar.f36047b0;
                } else {
                    c1Var = null;
                }
                buVar2.f45836e = c1Var;
            } else {
                f10 = f11;
                if (i7 == 1) {
                    bu buVar3 = buVarArr[i7];
                    buVar3.f45833a = contactsActivity;
                    buVar3.d = contactsActivity.d;
                    buVar3.setVisibility(8);
                }
            }
            buVarArr[i7].d.setScrollingTouchSlop(1);
            bu buVar4 = buVarArr[i7];
            buVar4.f45834b = (FrameLayout) buVar4.f45833a.getFragmentView();
            bu buVar5 = buVarArr[i7];
            buVar5.f45835c = buVar5.f45833a.getActionBar();
            bu buVar6 = buVarArr[i7];
            buVar6.addView(buVar6.f45834b, c8.ja.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(buVarArr[i7].f45835c);
            bu buVar7 = buVarArr[i7];
            buVar7.addView(buVar7.f45835c, c8.ja.c(-2.0f, -1));
            buVarArr[i7].f45835c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    uj0Var = buVarArr[i7].d;
                } else {
                    uj0Var = buVarArr[i7].f45836e;
                }
                if (uj0Var != null) {
                    uj0Var.setClipToPadding(false);
                    uj0Var.setOnScrollListener(new bi.w3(7, this, uj0Var.getOnScrollListener()));
                }
            }
            i7++;
            f11 = f10;
        }
        float f12 = f11;
        auVar.addView(this.actionBar, c8.ja.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f46248e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.hd.M0(2131753690, null), null);
            this.f46248e.a(1, org.telegram.messenger.hd.M0(2131753689, null), null);
            this.f46248e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f46248e.getCurrentTabId();
            if (currentTabId >= 0) {
                buVarArr[0].f45837f = currentTabId;
            }
            this.f46248e.c();
        }
        r0(false);
        if (this.f46248e.getCurrentTabId() == this.f46248e.getFirstTabId()) {
            z10 = true;
        }
        this.f46254x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46248e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46248e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46248e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f46248e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.L8));
        arrayList.addAll(this.f46245a.getThemeDescriptions());
        arrayList.addAll(this.f46246b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f46254x;
    }

    @Override
    public final void onFragmentDestroy() {
        yw ywVar = this.f46245a;
        if (ywVar != null) {
            ywVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f46246b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        yw ywVar = this.f46245a;
        if (ywVar != null) {
            ywVar.onPause();
        }
        ContactsActivity contactsActivity = this.f46246b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yw ywVar = this.f46245a;
        if (ywVar != null) {
            ywVar.onResume();
        }
        ContactsActivity contactsActivity = this.f46246b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            yw ywVar = this.f46245a;
            if (ywVar != null && ywVar.fragmentView != null) {
                ywVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f46246b;
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
            String M0 = org.telegram.messenger.hd.M0(2131753692, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131753693, null), new tr(2, this, user));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        }
    }

    public final void r0(boolean z10) {
        org.telegram.ui.Components.uj0 uj0Var;
        bu[] buVarArr = this.f46249f;
        for (int i7 = 0; i7 < buVarArr.length; i7++) {
            buVarArr[i7].d.C0();
            di.c1 c1Var = buVarArr[i7].f45836e;
            if (c1Var != null) {
                c1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uj0Var = buVarArr[z10 ? 1 : 0].d;
            } else {
                uj0Var = buVarArr[z10 ? 1 : 0].f45836e;
            }
            if (uj0Var != null) {
                uj0Var.getAdapter();
                uj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((v4.b0) uj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
