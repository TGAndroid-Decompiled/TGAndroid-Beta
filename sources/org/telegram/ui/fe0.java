package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fe0 extends org.telegram.ui.ActionBar.g2 {
    public l4 f47637a;
    public org.telegram.ui.Components.ek0 f47638b;
    public int f47639c;
    public int d;
    public int f47640e;
    public int f47641f;
    public int h;
    public int f47642n;
    public int f47643r;
    public int f47644s;
    public int f47645w;

    public static void Z(org.telegram.ui.fe0 r9, org.telegram.ui.ActionBar.t1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fe0.Z(org.telegram.ui.fe0, org.telegram.ui.ActionBar.t1):void");
    }

    public static void b0(fe0 fe0Var, int i7) {
        Integer num = null;
        if (i7 == fe0Var.f47639c) {
            int i10 = 0;
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!org.telegram.messenger.k10.i(i11).p()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!org.telegram.messenger.k10.o()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                fe0Var.presentFragment(new de0(num.intValue()));
            } else if (!org.telegram.messenger.k10.o()) {
                fe0Var.showDialog(new ug.k0(7, fe0Var.currentAccount, fe0Var.getParentActivity(), fe0Var, null));
            }
        } else if (i7 == fe0Var.d) {
            fe0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == fe0Var.f47640e) {
            fe0Var.presentFragment(new x6());
        } else if (i7 == fe0Var.f47641f) {
            fe0Var.presentFragment(new g(3));
        } else if (i7 == fe0Var.h) {
            fe0Var.showDialog(org.telegram.ui.Components.c5.R(fe0Var, null));
        } else if (i7 == fe0Var.f47643r && fe0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, fe0Var.getParentActivity(), null);
            t1Var.r(500L);
            int i12 = fe0Var.currentAccount;
            o60 o60Var = new o60(28, fe0Var, t1Var);
            org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.np.u1(i12).A7.f26203p0.f13993b).f24305c) {
                o60Var.run();
            } else {
                org.telegram.messenger.g0.g3(new zn0(i12, o60Var, 6));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29512m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29758z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29568p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748548, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 17));
        this.f47637a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47638b = ek0Var;
        ek0Var.setVerticalScrollBarEnabled(false);
        this.f47638b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f47638b, c8.na.e(-1, -1, 51));
        this.f47638b.setAdapter(this.f47637a);
        this.f47638b.setOnItemClickListener(new ee0(this));
        this.f47638b.r1();
        this.f47638b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47638b;
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
        this.f47645w = 1;
        if (org.telegram.messenger.k10.c() < 4) {
            int i7 = this.f47645w;
            this.f47645w = i7 + 1;
            this.f47639c = i7;
        } else {
            this.f47639c = -1;
        }
        if (org.telegram.messenger.cz.f23403s.length() <= 0) {
            int i10 = this.f47645w;
            this.f47645w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f47645w;
        this.f47640e = i11;
        this.f47641f = i11 + 1;
        this.h = i11 + 2;
        this.f47642n = i11 + 3;
        this.f47643r = i11 + 4;
        this.f47645w = i11 + 6;
        this.f47644s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f47637a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
