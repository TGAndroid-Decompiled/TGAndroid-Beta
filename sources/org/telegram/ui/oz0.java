package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oz0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public org.telegram.ui.Components.uk0 f40307a;
    public kz0 f40308b;
    public int f40309c;
    public int d;
    public int e;
    public int f40310f;
    public xa.n h;
    public mz0 f40311n;

    public oz0() {
        super(null);
        this.d = -1;
    }

    public static void Z(oz0 oz0Var, View view) {
        int i10;
        int i11;
        Point point;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f23453n && !oz0Var.getUserConfig().q()) {
                oz0Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) oz0Var, 4, true));
                return;
            }
            org.telegram.messenger.vi.b0(oz0Var.currentAccount).a2(xVar.f23452f.reaction);
            oz0Var.f40307a.getAdapter().k(0, oz0Var.f40307a.getAdapter().b());
        } else if (view instanceof nz0) {
            nz0 nz0Var = (nz0) view;
            if (oz0Var.f40311n == null) {
                x21[] x21VarArr = new x21[1];
                org.telegram.ui.Components.d5 d5Var = nz0Var.f39993a;
                if (d5Var != null) {
                    d5Var.f();
                    nz0Var.b();
                    Rect rect = org.telegram.messenger.i0.Q;
                    rect.set(d5Var.getBounds());
                    i11 = (-(nz0Var.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                    i10 = rect.centerX() - ((org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                lz0 lz0Var = new lz0(oz0Var, oz0Var, oz0Var.getParentActivity(), Integer.valueOf(i10), nz0Var, x21VarArr);
                String Q = oz0Var.getMediaDataController().Q();
                if (Q != null && Q.startsWith("animated_")) {
                    try {
                        lz0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = oz0Var.getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f48445f = ((TLRPC.TL_availableReaction) arrayList.get(i12)).reaction;
                    arrayList2.add(obj);
                }
                lz0Var.setRecentReactions(arrayList2);
                lz0Var.setSaveState(3);
                lz0Var.y(d5Var, nz0Var);
                mz0 mz0Var = new mz0(oz0Var, lz0Var);
                oz0Var.f40311n = mz0Var;
                x21VarArr[0] = mz0Var;
                mz0Var.showAsDropDown(nz0Var, 0, i11, 53);
                x21VarArr[0].b();
            }
        }
    }

    public static int d0(oz0 oz0Var) {
        return oz0Var.currentAccount;
    }

    public static int e0(oz0 oz0Var) {
        return oz0Var.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131746402, null));
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f40307a = uk0Var;
        uk0Var.r1();
        this.f40307a.setSectionsDrawBackground(true);
        ((s4.j) this.f40307a.getItemAnimator()).f47938m = false;
        this.f40307a.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f40307a;
        kz0 kz0Var = new kz0(this, context);
        this.f40308b = kz0Var;
        uk0Var2.setAdapter(kz0Var);
        this.f40307a.setOnItemClickListener(new jz0(this, 0));
        frameLayout.addView(this.f40307a, w7.b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f40308b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == org.telegram.messenger.at.V4) {
                this.f40308b.f();
            } else if (i10 == org.telegram.messenger.at.f14709f5) {
                h0();
                this.f40308b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f40307a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(20, this), org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.f21331z6, org.telegram.ui.ActionBar.t6.f21021i6, org.telegram.ui.ActionBar.t6.f20873a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.ui.ActionBar.t6.f20967f6, org.telegram.ui.ActionBar.t6.f20986g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    public final void h0() {
        this.f40310f = 2;
        this.f40309c = 1;
        if (org.telegram.messenger.e20.i(this.currentAccount).q()) {
            this.d = -1;
            int i10 = this.f40310f;
            this.f40310f = i10 + 1;
            this.e = i10;
            return;
        }
        this.e = -1;
        this.d = this.f40310f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        xa.n nVar = this.h;
        if (nVar != null) {
            nVar.a();
            this.h = null;
        }
        org.telegram.messenger.at notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(org.telegram.messenger.at.V4);
        nVar2.e(org.telegram.messenger.at.f14709f5);
        this.h = nVar2;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.h;
        if (nVar != null) {
            nVar.a();
            this.h = null;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
