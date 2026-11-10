package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class he0 extends org.telegram.ui.ActionBar.f2 {
    public l4 f46328a;
    public org.telegram.ui.Components.pj0 f46329b;
    public int f46330c;
    public int d;
    public int f46331e;
    public int f46332f;
    public int h;
    public int f46333n;
    public int f46334r;
    public int f46335s;
    public int f46336w;

    public static void Z(org.telegram.ui.he0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.he0.Z(org.telegram.ui.he0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(he0 he0Var, int i7) {
        Integer num = null;
        if (i7 == he0Var.f46330c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.p10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.p10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                he0Var.presentFragment(new fe0(num.intValue()));
            } else if (!org.telegram.messenger.p10.o()) {
                he0Var.showDialog(new ug.i0(7, he0Var.currentAccount, he0Var.getParentActivity(), he0Var, null));
            }
        } else if (i7 == he0Var.d) {
            he0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == he0Var.f46331e) {
            he0Var.presentFragment(new y6());
        } else if (i7 == he0Var.f46332f) {
            he0Var.presentFragment(new g(3));
        } else if (i7 == he0Var.h) {
            he0Var.showDialog(org.telegram.ui.Components.u4.R(he0Var, null));
        } else if (i7 == he0Var.f46334r && he0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, he0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = he0Var.currentAccount;
            tc0 tc0Var = new tc0(8, he0Var, u1Var);
            org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i12).f24946x7.f24450j0.f13891b).f22784c) {
                tc0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.q2(i12, tc0Var, 29));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748741, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 14));
        this.f46328a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f46329b = pj0Var;
        pj0Var.setVerticalScrollBarEnabled(false);
        this.f46329b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f46329b, c8.ha.e(-1, -1, 51));
        this.f46329b.setAdapter(this.f46328a);
        this.f46329b.setOnItemClickListener(new ge0(this));
        this.f46329b.r1();
        this.f46329b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f46329b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f46336w = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            int i7 = this.f46336w;
            this.f46336w = i7 + 1;
            this.f46330c = i7;
        } else {
            this.f46330c = -1;
        }
        if (org.telegram.messenger.iz.f23438s.length() <= 0) {
            int i10 = this.f46336w;
            this.f46336w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f46336w;
        this.f46331e = i11;
        this.f46332f = i11 + 1;
        this.h = i11 + 2;
        this.f46333n = i11 + 3;
        this.f46334r = i11 + 4;
        this.f46336w = i11 + 6;
        this.f46335s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f46328a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
