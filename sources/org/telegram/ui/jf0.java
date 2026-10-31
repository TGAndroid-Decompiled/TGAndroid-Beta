package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jf0 extends org.telegram.ui.ActionBar.k2 {
    public fg.j f38512a;
    public org.telegram.ui.Components.tk0 f38513b;
    public int f38514c;
    public int d;
    public int e;
    public int f38515f;
    public int h;
    public int f38516n;
    public int f38517r;
    public int f38518s;
    public int f38519w;

    public static void Y(org.telegram.ui.jf0 r9, org.telegram.ui.ActionBar.x1 r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.Y(org.telegram.ui.jf0, org.telegram.ui.ActionBar.x1):void");
    }

    public static void a0(jf0 jf0Var, int i10) {
        Integer num = null;
        if (i10 == jf0Var.f38514c) {
            int i11 = 0;
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!org.telegram.messenger.d20.i(i12).p()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!org.telegram.messenger.d20.o()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                jf0Var.presentFragment(new hf0(num.intValue()));
            } else if (!org.telegram.messenger.d20.o()) {
                jf0Var.showDialog(new kg.q0(7, jf0Var.currentAccount, jf0Var.getParentActivity(), jf0Var, null));
            }
        } else if (i10 == jf0Var.d) {
            jf0Var.presentFragment(PasscodeActivity.o0());
        } else if (i10 == jf0Var.e) {
            jf0Var.presentFragment(new y6());
        } else if (i10 == jf0Var.f38515f) {
            jf0Var.presentFragment(new f(3));
        } else if (i10 == jf0Var.h) {
            jf0Var.showDialog(org.telegram.ui.Components.s4.T(jf0Var, null));
        } else if (i10 == jf0Var.f38517r && jf0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, jf0Var.getParentActivity(), null);
            x1Var.r(500L);
            int i13 = jf0Var.currentAccount;
            f70 f70Var = new f70(29, jf0Var, x1Var);
            org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
            if (!((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i13).f18957y7.f17841j0.f11587b).f16204c) {
                f70Var.run();
            } else {
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.qq(i13, f70Var, 24));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748752, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 5));
        this.f38512a = new fg.j(11, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f38513b = tk0Var;
        tk0Var.setVerticalScrollBarEnabled(false);
        this.f38513b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f38513b, w7.b6.e(-1, -1, 51));
        this.f38513b.setAdapter(this.f38512a);
        this.f38513b.setOnItemClickListener(new if0(this));
        this.f38513b.r1();
        this.f38513b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38513b;
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
        this.f38519w = 1;
        if (org.telegram.messenger.d20.c() < 4) {
            int i10 = this.f38519w;
            this.f38519w = i10 + 1;
            this.f38514c = i10;
        } else {
            this.f38514c = -1;
        }
        if (org.telegram.messenger.tz.f18180s.length() <= 0) {
            int i11 = this.f38519w;
            this.f38519w = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.f38519w;
        this.e = i12;
        this.f38515f = i12 + 1;
        this.h = i12 + 2;
        this.f38516n = i12 + 3;
        this.f38517r = i12 + 4;
        this.f38519w = i12 + 6;
        this.f38518s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f38512a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
