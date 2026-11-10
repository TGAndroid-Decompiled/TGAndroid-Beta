package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fy0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.pj0 f45872a;
    public by0 f45873b;
    public int f45874c;
    public int d;
    public int f45875e;
    public int f45876f;
    public ab.b0 h;
    public dy0 f45877n;

    public fy0() {
        super(null);
        this.d = -1;
    }

    public static void Z(fy0 fy0Var, View view) {
        int i7;
        int i10;
        Point point;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f30777n && !fy0Var.getUserConfig().q()) {
                fy0Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) fy0Var, 4, true));
                return;
            }
            org.telegram.messenger.ui.b0(fy0Var.currentAccount).a2(xVar.f30776f.reaction);
            fy0Var.f45872a.getAdapter().k(0, fy0Var.f45872a.getAdapter().b());
        } else if (view instanceof ey0) {
            ey0 ey0Var = (ey0) view;
            if (fy0Var.f45877n == null) {
                k11[] k11VarArr = new k11[1];
                org.telegram.ui.Components.f5 f5Var = ey0Var.f45460a;
                if (f5Var != null) {
                    f5Var.f();
                    ey0Var.b();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(f5Var.getBounds());
                    i10 = (-(ey0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    i7 = rect.centerX() - ((org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f)));
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                cy0 cy0Var = new cy0(fy0Var, fy0Var, fy0Var.getParentActivity(), Integer.valueOf(i7), ey0Var, k11VarArr);
                String Q = fy0Var.getMediaDataController().Q();
                if (Q != null && Q.startsWith("animated_")) {
                    try {
                        cy0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = fy0Var.getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? obj = new Object();
                    obj.f6359f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    arrayList2.add(obj);
                }
                cy0Var.setRecentReactions(arrayList2);
                cy0Var.setSaveState(3);
                cy0Var.y(f5Var, ey0Var);
                dy0 dy0Var = new dy0(fy0Var, cy0Var);
                fy0Var.f45877n = dy0Var;
                k11VarArr[0] = dy0Var;
                dy0Var.showAsDropDown(ey0Var, 0, i10, 53);
                k11VarArr[0].b();
            }
        }
    }

    public static int d0(fy0 fy0Var) {
        return fy0Var.currentAccount;
    }

    public static int e0(fy0 fy0Var) {
        return fy0Var.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45872a = pj0Var;
        pj0Var.r1();
        this.f45872a.setSectionsDrawBackground(true);
        ((v4.k) this.f45872a.getItemAnimator()).f57079m = false;
        this.f45872a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f45872a;
        by0 by0Var = new by0(this, context);
        this.f45873b = by0Var;
        pj0Var2.setAdapter(by0Var);
        this.f45872a.setOnItemClickListener(new ay0(this, 0));
        frameLayout.addView(this.f45872a, c8.ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f45873b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.V4) {
                this.f45873b.f();
            } else if (i7 == org.telegram.messenger.qs.f25005f5) {
                h0();
                this.f45873b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f45872a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(20, this), org.telegram.ui.ActionBar.m6.f27890d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f28300z6, org.telegram.ui.ActionBar.m6.f27982i6, org.telegram.ui.ActionBar.m6.f27834a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f28111p7, org.telegram.ui.ActionBar.m6.f27928f6, org.telegram.ui.ActionBar.m6.f27945g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    public final void h0() {
        this.f45876f = 2;
        this.f45874c = 1;
        if (org.telegram.messenger.p10.i(this.currentAccount).q()) {
            this.d = -1;
            int i7 = this.f45876f;
            this.f45876f = i7 + 1;
            this.f45875e = i7;
            return;
        }
        this.f45875e = -1;
        this.d = this.f45876f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.h;
        if (b0Var != null) {
            b0Var.b();
            this.h = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(org.telegram.messenger.qs.V4);
        b0Var2.c(org.telegram.messenger.qs.f25005f5);
        this.h = b0Var2;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.h;
        if (b0Var != null) {
            b0Var.b();
            this.h = null;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
