package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ee0 extends org.telegram.ui.ActionBar.e2 {
    public l4 f46756a;
    public org.telegram.ui.Components.uj0 f46757b;
    public int f46758c;
    public int d;
    public int f46759e;
    public int f46760f;
    public int h;
    public int f46761n;
    public int f46762r;
    public int f46763s;
    public int f46764w;

    public static void Z(org.telegram.ui.ee0 r9, org.telegram.ui.ActionBar.t1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ee0.Z(org.telegram.ui.ee0, org.telegram.ui.ActionBar.t1):void");
    }

    public static void b0(ee0 ee0Var, int i7) {
        Integer num = null;
        if (i7 == ee0Var.f46758c) {
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
        } else if (i7 == ee0Var.f46759e) {
            ee0Var.presentFragment(new y6());
        } else if (i7 == ee0Var.f46760f) {
            ee0Var.presentFragment(new g(3));
        } else if (i7 == ee0Var.h) {
            ee0Var.showDialog(org.telegram.ui.Components.t4.R(ee0Var, null));
        } else if (i7 == ee0Var.f46762r && ee0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ee0Var.getParentActivity(), null);
            t1Var.r(500L);
            int i12 = ee0Var.currentAccount;
            jd0 jd0Var = new jd0(3, ee0Var, t1Var);
            org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i12).f25451y7.f25854j0.f14544b).f24009c) {
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
        this.f46756a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f46757b = uj0Var;
        uj0Var.setVerticalScrollBarEnabled(false);
        this.f46757b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f46757b, c8.ja.e(-1, -1, 51));
        this.f46757b.setAdapter(this.f46756a);
        this.f46757b.setOnItemClickListener(new de0(this));
        this.f46757b.r1();
        this.f46757b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f46757b;
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
        this.f46764w = 1;
        if (org.telegram.messenger.m10.c() < 4) {
            int i7 = this.f46764w;
            this.f46764w = i7 + 1;
            this.f46758c = i7;
        } else {
            this.f46758c = -1;
        }
        if (org.telegram.messenger.gz.f23981s.length() <= 0) {
            int i10 = this.f46764w;
            this.f46764w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f46764w;
        this.f46759e = i11;
        this.f46760f = i11 + 1;
        this.h = i11 + 2;
        this.f46761n = i11 + 3;
        this.f46762r = i11 + 4;
        this.f46764w = i11 + 6;
        this.f46763s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f46756a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
