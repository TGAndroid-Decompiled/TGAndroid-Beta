package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ge0 extends org.telegram.ui.ActionBar.g2 {
    public l4 f48087a;
    public org.telegram.ui.Components.ek0 f48088b;
    public int f48089c;
    public int d;
    public int f48090e;
    public int f48091f;
    public int h;
    public int f48092n;
    public int f48093r;
    public int f48094s;
    public int f48095w;

    public static void Z(org.telegram.ui.ge0 r9, org.telegram.ui.ActionBar.t1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge0.Z(org.telegram.ui.ge0, org.telegram.ui.ActionBar.t1):void");
    }

    public static void b0(ge0 ge0Var, int i7) {
        int i10 = 0;
        Integer num = null;
        if (i7 == ge0Var.f48089c) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.j10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.j10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                ge0Var.presentFragment(new de0(num.intValue()));
            } else if (!org.telegram.messenger.j10.o()) {
                ge0Var.showDialog(new ug.k0(7, ge0Var.currentAccount, ge0Var.getParentActivity(), ge0Var, null));
            }
        } else if (i7 == ge0Var.d) {
            ge0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == ge0Var.f48090e) {
            ge0Var.presentFragment(new x6());
        } else if (i7 == ge0Var.f48091f) {
            ge0Var.presentFragment(new g(3));
        } else if (i7 == ge0Var.h) {
            ge0Var.showDialog(org.telegram.ui.Components.c5.R(ge0Var, null));
        } else if (i7 == ge0Var.f48093r && ge0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ge0Var.getParentActivity(), null);
            t1Var.r(500L);
            int i12 = ge0Var.currentAccount;
            fe0 fe0Var = new fe0(0, ge0Var, t1Var);
            org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i12).A7.f26187p0.f14027b).f24364c) {
                fe0Var.run();
            } else {
                org.telegram.messenger.g0.g3(new jw0(i12, fe0Var, 4));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29543m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29789z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29342b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29599p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748548, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 17));
        this.f48087a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f48088b = ek0Var;
        ek0Var.setVerticalScrollBarEnabled(false);
        this.f48088b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f48088b, c8.ma.e(-1, -1, 51));
        this.f48088b.setAdapter(this.f48087a);
        this.f48088b.setOnItemClickListener(new ee0(this));
        this.f48088b.r1();
        this.f48088b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f48088b;
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
        this.f48095w = 1;
        if (org.telegram.messenger.j10.c() < 4) {
            int i7 = this.f48095w;
            this.f48095w = i7 + 1;
            this.f48089c = i7;
        } else {
            this.f48089c = -1;
        }
        if (org.telegram.messenger.bz.f23222s.length() <= 0) {
            int i10 = this.f48095w;
            this.f48095w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f48095w;
        this.f48090e = i11;
        this.f48091f = i11 + 1;
        this.h = i11 + 2;
        this.f48092n = i11 + 3;
        this.f48093r = i11 + 4;
        this.f48095w = i11 + 6;
        this.f48094s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f48087a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
