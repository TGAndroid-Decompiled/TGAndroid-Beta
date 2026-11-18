package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ge0 extends org.telegram.ui.ActionBar.h2 {
    public l4 f47983a;
    public org.telegram.ui.Components.ck0 f47984b;
    public int f47985c;
    public int d;
    public int f47986e;
    public int f47987f;
    public int h;
    public int f47988n;
    public int f47989r;
    public int f47990s;
    public int f47991w;

    public static void Z(org.telegram.ui.ge0 r9, org.telegram.ui.ActionBar.u1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge0.Z(org.telegram.ui.ge0, org.telegram.ui.ActionBar.u1):void");
    }

    public static void b0(ge0 ge0Var, int i7) {
        Integer num = null;
        if (i7 == ge0Var.f47985c) {
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
                ge0Var.presentFragment(new ee0(num.intValue()));
            } else if (!org.telegram.messenger.j10.o()) {
                ge0Var.showDialog(new ug.l0(7, ge0Var.currentAccount, ge0Var.getParentActivity(), ge0Var, null));
            }
        } else if (i7 == ge0Var.d) {
            ge0Var.presentFragment(PasscodeActivity.p0());
        } else if (i7 == ge0Var.f47986e) {
            ge0Var.presentFragment(new x6());
        } else if (i7 == ge0Var.f47987f) {
            ge0Var.presentFragment(new g(3));
        } else if (i7 == ge0Var.h) {
            ge0Var.showDialog(org.telegram.ui.Components.b5.R(ge0Var, null));
        } else if (i7 == ge0Var.f47989r && ge0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ge0Var.getParentActivity(), null);
            u1Var.r(500L);
            int i12 = ge0Var.currentAccount;
            o60 o60Var = new o60(28, ge0Var, u1Var);
            org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
            if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i12).A7.f26159p0.f13998b).f24336c) {
                o60Var.run();
            } else {
                org.telegram.messenger.g0.g3(new jw0(i12, o60Var, 4));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29615p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
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
        this.f47983a = new l4(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f47984b = ck0Var;
        ck0Var.setVerticalScrollBarEnabled(false);
        this.f47984b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f47984b, c8.ma.e(-1, -1, 51));
        this.f47984b.setAdapter(this.f47983a);
        this.f47984b.setOnItemClickListener(new fe0(this));
        this.f47984b.r1();
        this.f47984b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f47984b;
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
        this.f47991w = 1;
        if (org.telegram.messenger.j10.c() < 4) {
            int i7 = this.f47991w;
            this.f47991w = i7 + 1;
            this.f47985c = i7;
        } else {
            this.f47985c = -1;
        }
        if (org.telegram.messenger.bz.f23194s.length() <= 0) {
            int i10 = this.f47991w;
            this.f47991w = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.f47991w;
        this.f47986e = i11;
        this.f47987f = i11 + 1;
        this.h = i11 + 2;
        this.f47988n = i11 + 3;
        this.f47989r = i11 + 4;
        this.f47991w = i11 + 6;
        this.f47990s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f47983a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
