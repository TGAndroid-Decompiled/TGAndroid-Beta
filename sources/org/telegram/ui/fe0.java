package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fe0 extends org.telegram.ui.ActionBar.h2 {
    public l4 f47645a;
    public org.telegram.ui.Components.ck0 f47646b;
    public int f47647c;
    public int d;
    public int f47648e;
    public int f47649f;
    public int h;
    public int f47650n;
    public int f47651r;
    public int f47652s;
    public int f47653w;

    public static void Z(org.telegram.ui.fe0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fe0.Z(org.telegram.ui.fe0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(fe0 fe0Var, int i7) {
        Integer num = null;
        if (i7 == fe0Var.f47647c) {
            int i10 = 0;
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
                fe0Var.presentFragment(new de0(num.intValue()));
            } else if (!org.telegram.messenger.j10.o()) {
                fe0Var.showDialog(new ug.l0(7, fe0Var.currentAccount, fe0Var.getParentActivity(), fe0Var, null));
            }
        } else if (i7 == fe0Var.d) {
            fe0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == fe0Var.f47648e) {
            fe0Var.presentFragment(new x6());
        } else if (i7 == fe0Var.f47649f) {
            fe0Var.presentFragment(new g(3));
        } else if (i7 == fe0Var.h) {
            fe0Var.showDialog(org.telegram.ui.Components.b5.R(fe0Var, null));
        } else if (i7 == fe0Var.f47651r && fe0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, fe0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = fe0Var.currentAccount;
            n60 n60Var = new n60(28, fe0Var, u1Var);
            org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i12).A7.f26161p0.f14001b).f24339c) {
                n60Var.run();
            } else {
                org.telegram.messenger.g0.g3(new jw0(i12, n60Var, 4));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29561m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29617p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748549, null));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 17));
        this.f47645a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f47646b = ck0Var;
        ck0Var.setVerticalScrollBarEnabled(false);
        this.f47646b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f47646b, c8.ma.e(-1, -1, 51));
        this.f47646b.setAdapter(this.f47645a);
        this.f47646b.setOnItemClickListener(new ee0(this));
        this.f47646b.r1();
        this.f47646b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f47646b;
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
        this.f47653w = 1;
        if (org.telegram.messenger.j10.c() < 4) {
            int i7 = this.f47653w;
            this.f47653w = i7 + 1;
            this.f47647c = i7;
        } else {
            this.f47647c = -1;
        }
        if (org.telegram.messenger.bz.f23197s.length() <= 0) {
            int i10 = this.f47653w;
            this.f47653w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f47653w;
        this.f47648e = i11;
        this.f47649f = i11 + 1;
        this.h = i11 + 2;
        this.f47650n = i11 + 3;
        this.f47651r = i11 + 4;
        this.f47653w = i11 + 6;
        this.f47652s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f47645a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
