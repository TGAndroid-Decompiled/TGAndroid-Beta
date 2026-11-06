package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ee0 extends org.telegram.ui.ActionBar.f2 {
    public l4 f45296a;
    public org.telegram.ui.Components.pj0 f45297b;
    public int f45298c;
    public int d;
    public int f45299e;
    public int f45300f;
    public int h;
    public int f45301n;
    public int f45302r;
    public int f45303s;
    public int f45304w;

    public static void Z(org.telegram.ui.ee0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee0.Z(org.telegram.ui.ee0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(ee0 ee0Var, int i7) {
        Integer num = null;
        if (i7 == ee0Var.f45298c) {
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
        } else if (i7 == ee0Var.f45299e) {
            ee0Var.presentFragment(new y6());
        } else if (i7 == ee0Var.f45300f) {
            ee0Var.presentFragment(new g(3));
        } else if (i7 == ee0Var.h) {
            ee0Var.showDialog(org.telegram.ui.Components.v4.R(ee0Var, null));
        } else if (i7 == ee0Var.f45302r && ee0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ee0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = ee0Var.currentAccount;
            zc0 zc0Var = new zc0(7, ee0Var, u1Var);
            org.telegram.ui.Wallet.n0[] n0VarArr = org.telegram.ui.Wallet.n0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i12).f24927x7.f24435j0.f13889b).f22767c) {
                zc0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(i12, zc0Var, 29));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28069p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748740, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 14));
        this.f45296a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45297b = pj0Var;
        pj0Var.setVerticalScrollBarEnabled(false);
        this.f45297b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f45297b, c8.ha.e(-1, -1, 51));
        this.f45297b.setAdapter(this.f45296a);
        this.f45297b.setOnItemClickListener(new de0(this));
        this.f45297b.r1();
        this.f45297b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f45297b;
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
        this.f45304w = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            int i7 = this.f45304w;
            this.f45304w = i7 + 1;
            this.f45298c = i7;
        } else {
            this.f45298c = -1;
        }
        if (org.telegram.messenger.iz.f23406s.length() <= 0) {
            int i10 = this.f45304w;
            this.f45304w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f45304w;
        this.f45299e = i11;
        this.f45300f = i11 + 1;
        this.h = i11 + 2;
        this.f45301n = i11 + 3;
        this.f45302r = i11 + 4;
        this.f45304w = i11 + 6;
        this.f45303s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f45296a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
