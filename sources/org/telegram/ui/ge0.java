package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ge0 extends org.telegram.ui.ActionBar.f2 {
    public l4 f45981a;
    public org.telegram.ui.Components.qj0 f45982b;
    public int f45983c;
    public int d;
    public int f45984e;
    public int f45985f;
    public int h;
    public int f45986n;
    public int f45987r;
    public int f45988s;
    public int f45989w;

    public static void Z(org.telegram.ui.ge0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge0.Z(org.telegram.ui.ge0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(ge0 ge0Var, int i7) {
        Integer num = null;
        if (i7 == ge0Var.f45983c) {
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
                ge0Var.presentFragment(new ee0(num.intValue()));
            } else if (!org.telegram.messenger.p10.o()) {
                ge0Var.showDialog(new ug.i0(7, ge0Var.currentAccount, ge0Var.getParentActivity(), ge0Var, null));
            }
        } else if (i7 == ge0Var.d) {
            ge0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == ge0Var.f45984e) {
            ge0Var.presentFragment(new y6());
        } else if (i7 == ge0Var.f45985f) {
            ge0Var.presentFragment(new g(3));
        } else if (i7 == ge0Var.h) {
            ge0Var.showDialog(org.telegram.ui.Components.v4.R(ge0Var, null));
        } else if (i7 == ge0Var.f45987r && ge0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ge0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = ge0Var.currentAccount;
            bd0 bd0Var = new bd0(7, ge0Var, u1Var);
            org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i12).f24942x7.f24446j0.f13889b).f22780c) {
                bd0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(i12, bd0Var, 29));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28086p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131748741, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 14));
        this.f45981a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f45982b = qj0Var;
        qj0Var.setVerticalScrollBarEnabled(false);
        this.f45982b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f45982b, c8.ha.e(-1, -1, 51));
        this.f45982b.setAdapter(this.f45981a);
        this.f45982b.setOnItemClickListener(new fe0(this));
        this.f45982b.r1();
        this.f45982b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f45982b;
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
        this.f45989w = 1;
        if (org.telegram.messenger.p10.c() < 4) {
            int i7 = this.f45989w;
            this.f45989w = i7 + 1;
            this.f45983c = i7;
        } else {
            this.f45983c = -1;
        }
        if (org.telegram.messenger.iz.f23434s.length() <= 0) {
            int i10 = this.f45989w;
            this.f45989w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f45989w;
        this.f45984e = i11;
        this.f45985f = i11 + 1;
        this.h = i11 + 2;
        this.f45986n = i11 + 3;
        this.f45987r = i11 + 4;
        this.f45989w = i11 + 6;
        this.f45988s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f45981a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
