package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fe0 extends org.telegram.ui.ActionBar.g2 {
    public l4 f47805a;
    public org.telegram.ui.Components.ek0 f47806b;
    public int f47807c;
    public int d;
    public int f47808e;
    public int f47809f;
    public int h;
    public int f47810n;
    public int f47811r;
    public int f47812s;
    public int f47813w;

    public static void Z(org.telegram.ui.fe0 r9, org.telegram.ui.ActionBar.t1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fe0.Z(org.telegram.ui.fe0, org.telegram.ui.ActionBar.t1):void");
    }

    public static void b0(fe0 fe0Var, int i7) {
        Integer num = null;
        if (i7 == fe0Var.f47807c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.i10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.i10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                fe0Var.presentFragment(new de0(num.intValue()));
            } else if (!org.telegram.messenger.i10.o()) {
                fe0Var.showDialog(new ug.k0(7, fe0Var.currentAccount, fe0Var.getParentActivity(), fe0Var, null));
            }
        } else if (i7 == fe0Var.d) {
            fe0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == fe0Var.f47808e) {
            fe0Var.presentFragment(new y6());
        } else if (i7 == fe0Var.f47809f) {
            fe0Var.presentFragment(new g(3));
        } else if (i7 == fe0Var.h) {
            fe0Var.showDialog(org.telegram.ui.Components.b5.R(fe0Var, null));
        } else if (i7 == fe0Var.f47811r && fe0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, fe0Var.getParentActivity(), null);
            t1Var.r(500L);
            int i12 = fe0Var.currentAccount;
            bd0 bd0Var = new bd0(4, fe0Var, t1Var);
            org.telegram.ui.Wallet.v0[] v0VarArr = org.telegram.ui.Wallet.v0.R;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i12).A7.f26254p0.f17372b).f24439c) {
                bd0Var.run();
            } else {
                org.telegram.messenger.g0.g3(new ao0(i12, bd0Var, 6));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748548, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 17));
        this.f47805a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47806b = ek0Var;
        ek0Var.setVerticalScrollBarEnabled(false);
        this.f47806b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f47806b, c8.na.e(-1, -1, 51));
        this.f47806b.setAdapter(this.f47805a);
        this.f47806b.setOnItemClickListener(new ee0(this));
        this.f47806b.r1();
        this.f47806b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47806b;
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
        org.telegram.messenger.a6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f47813w = 1;
        if (org.telegram.messenger.i10.c() < 4) {
            int i7 = this.f47813w;
            this.f47813w = i7 + 1;
            this.f47807c = i7;
        } else {
            this.f47807c = -1;
        }
        if (org.telegram.messenger.bz.f23319s.length() <= 0) {
            int i10 = this.f47813w;
            this.f47813w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f47813w;
        this.f47808e = i11;
        this.f47809f = i11 + 1;
        this.h = i11 + 2;
        this.f47810n = i11 + 3;
        this.f47811r = i11 + 4;
        this.f47813w = i11 + 6;
        this.f47812s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f47805a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
