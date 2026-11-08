package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ee0 extends org.telegram.ui.ActionBar.f2 {
    public l4 f45284a;
    public org.telegram.ui.Components.pj0 f45285b;
    public int f45286c;
    public int d;
    public int f45287e;
    public int f45288f;
    public int h;
    public int f45289n;
    public int f45290r;
    public int f45291s;
    public int f45292w;

    public static void Z(org.telegram.ui.ee0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee0.Z(org.telegram.ui.ee0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(ee0 ee0Var, int i7) {
        Integer num = null;
        if (i7 == ee0Var.f45286c) {
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
                ee0Var.presentFragment(new ce0(num.intValue()));
            } else if (!org.telegram.messenger.p10.o()) {
                ee0Var.showDialog(new ug.i0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
            }
        } else if (i7 == ee0Var.d) {
            ee0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == ee0Var.f45287e) {
            ee0Var.presentFragment(new y6());
        } else if (i7 == ee0Var.f45288f) {
            ee0Var.presentFragment(new g(3));
        } else if (i7 == ee0Var.h) {
            ee0Var.showDialog(org.telegram.ui.Components.v4.R(ee0Var, null));
        } else if (i7 == ee0Var.f45290r && ee0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ee0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = ee0Var.currentAccount;
            zc0 zc0Var = new zc0(7, ee0Var, u1Var);
            org.telegram.ui.Wallet.m0[] m0VarArr = org.telegram.ui.Wallet.m0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i12).f24942x7.f24446j0.f13889b).f22780c) {
                zc0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(i12, zc0Var, 29));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28017m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748742, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 14));
        this.f45284a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45285b = pj0Var;
        pj0Var.setVerticalScrollBarEnabled(false);
        this.f45285b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f45285b, c8.ha.e(-1, -1, 51));
        this.f45285b.setAdapter(this.f45284a);
        this.f45285b.setOnItemClickListener(new de0(this));
        this.f45285b.r1();
        this.f45285b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f45285b;
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
        this.f45292w = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            int i7 = this.f45292w;
            this.f45292w = i7 + 1;
            this.f45286c = i7;
        } else {
            this.f45286c = -1;
        }
        if (org.telegram.messenger.iz.f23434s.length() <= 0) {
            int i10 = this.f45292w;
            this.f45292w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f45292w;
        this.f45287e = i11;
        this.f45288f = i11 + 1;
        this.h = i11 + 2;
        this.f45289n = i11 + 3;
        this.f45290r = i11 + 4;
        this.f45292w = i11 + 6;
        this.f45291s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f45284a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
