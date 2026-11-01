package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jf0 extends org.telegram.ui.ActionBar.k2 {
    public fg.j f38380a;
    public org.telegram.ui.Components.uk0 f38381b;
    public int f38382c;
    public int d;
    public int e;
    public int f38383f;
    public int h;
    public int f38384n;
    public int f38385r;
    public int f38386s;
    public int f38387w;

    public static void Z(org.telegram.ui.jf0 r9, org.telegram.ui.ActionBar.x1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.Z(org.telegram.ui.jf0, org.telegram.ui.ActionBar.x1):void");
    }

    public static void b0(jf0 jf0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == jf0Var.f38382c) {
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!org.telegram.messenger.e20.i(i12).p()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!org.telegram.messenger.e20.o()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                jf0Var.presentFragment(new gf0(num.intValue()));
            } else if (!org.telegram.messenger.e20.o()) {
                jf0Var.showDialog(new kg.q0(7, jf0Var.currentAccount, jf0Var.getParentActivity(), jf0Var, null));
            }
        } else if (i10 == jf0Var.d) {
            jf0Var.presentFragment(PasscodeActivity.p0());
        } else if (i10 == jf0Var.e) {
            jf0Var.presentFragment(new y6());
        } else if (i10 == jf0Var.f38383f) {
            jf0Var.presentFragment(new f(3));
        } else if (i10 == jf0Var.h) {
            jf0Var.showDialog(org.telegram.ui.Components.s4.T(jf0Var, null));
        } else if (i10 == jf0Var.f38385r && jf0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, jf0Var.getParentActivity(), null);
            x1Var.r(500L);
            int i13 = jf0Var.currentAccount;
            if0 if0Var = new if0(0, jf0Var, x1Var);
            org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
            if (!((org.telegram.messenger.j0) org.telegram.messenger.wp.r1(i13).f19300y7.f18033j0.f11588b).f16393c) {
                if0Var.run();
            } else {
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.qq(i13, if0Var, 24));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21154p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131748752, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 5));
        this.f38380a = new fg.j(11, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f38381b = uk0Var;
        uk0Var.setVerticalScrollBarEnabled(false);
        this.f38381b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f38381b, w7.b6.e(-1, -1, 51));
        this.f38381b.setAdapter(this.f38380a);
        this.f38381b.setOnItemClickListener(new hf0(this));
        this.f38381b.r1();
        this.f38381b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f38381b;
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
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.f38387w = 1;
        if (org.telegram.messenger.e20.c() < 4) {
            int i10 = this.f38387w;
            this.f38387w = i10 + 1;
            this.f38382c = i10;
        } else {
            this.f38382c = -1;
        }
        if (org.telegram.messenger.uz.f18549s.length() <= 0) {
            int i11 = this.f38387w;
            this.f38387w = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.f38387w;
        this.e = i12;
        this.f38383f = i12 + 1;
        this.h = i12 + 2;
        this.f38384n = i12 + 3;
        this.f38385r = i12 + 4;
        this.f38387w = i12 + 6;
        this.f38386s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f38380a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
