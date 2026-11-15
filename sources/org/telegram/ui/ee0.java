package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ee0 extends org.telegram.ui.ActionBar.e2 {
    public l4 f46766a;
    public org.telegram.ui.Components.uj0 f46767b;
    public int f46768c;
    public int d;
    public int f46769e;
    public int f46770f;
    public int h;
    public int f46771n;
    public int f46772r;
    public int f46773s;
    public int f46774w;

    public static void Z(org.telegram.ui.ee0 r9, org.telegram.ui.ActionBar.t1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee0.Z(org.telegram.ui.ee0, org.telegram.ui.ActionBar.t1):void");
    }

    public static void b0(ee0 ee0Var, int i7) {
        Integer num = null;
        if (i7 == ee0Var.f46768c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.m10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.m10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                ee0Var.presentFragment(new ce0(num.intValue()));
            } else if (!org.telegram.messenger.m10.o()) {
                ee0Var.showDialog(new ug.j0(7, ee0Var.currentAccount, ee0Var.getParentActivity(), ee0Var, null));
            }
        } else if (i7 == ee0Var.d) {
            ee0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == ee0Var.f46769e) {
            ee0Var.presentFragment(new y6());
        } else if (i7 == ee0Var.f46770f) {
            ee0Var.presentFragment(new g(3));
        } else if (i7 == ee0Var.h) {
            ee0Var.showDialog(org.telegram.ui.Components.t4.R(ee0Var, null));
        } else if (i7 == ee0Var.f46772r && ee0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ee0Var.getParentActivity(), null);
            t1Var.r(500L);
            int i12 = ee0Var.currentAccount;
            jd0 jd0Var = new jd0(3, ee0Var, t1Var);
            org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i12).f25448y7.f25852j0.f14544b).f24006c) {
                jd0Var.run();
            } else {
                org.telegram.messenger.g0.h3(new nb1(i12, jd0Var, 2));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748741, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 15));
        this.f46766a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f46767b = uj0Var;
        uj0Var.setVerticalScrollBarEnabled(false);
        this.f46767b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f46767b, c8.ja.e(-1, -1, 51));
        this.f46767b.setAdapter(this.f46766a);
        this.f46767b.setOnItemClickListener(new de0(this));
        this.f46767b.r1();
        this.f46767b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f46767b;
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
        this.f46774w = 1;
        if (org.telegram.messenger.m10.c() < 4) {
            int i7 = this.f46774w;
            this.f46774w = i7 + 1;
            this.f46768c = i7;
        } else {
            this.f46768c = -1;
        }
        if (org.telegram.messenger.gz.f23978s.length() <= 0) {
            int i10 = this.f46774w;
            this.f46774w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f46774w;
        this.f46769e = i11;
        this.f46770f = i11 + 1;
        this.h = i11 + 2;
        this.f46771n = i11 + 3;
        this.f46772r = i11 + 4;
        this.f46774w = i11 + 6;
        this.f46773s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f46766a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
