package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.qj0 f45535a;
    public ay0 f45536b;
    public int f45537c;
    public int d;
    public int f45538e;
    public int f45539f;
    public ab.b0 h;
    public cy0 f45540n;

    public ey0() {
        super(null);
        this.d = -1;
    }

    public static void Z(ey0 ey0Var, View view) {
        int i7;
        int i10;
        Point point;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f30766n && !ey0Var.getUserConfig().q()) {
                ey0Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ey0Var, 4, true));
                return;
            }
            org.telegram.messenger.ui.b0(ey0Var.currentAccount).a2(xVar.f30765f.reaction);
            ey0Var.f45535a.getAdapter().k(0, ey0Var.f45535a.getAdapter().b());
        } else if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.f45540n == null) {
                j11[] j11VarArr = new j11[1];
                org.telegram.ui.Components.g5 g5Var = dy0Var.f45132a;
                if (g5Var != null) {
                    g5Var.f();
                    dy0Var.b();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(g5Var.getBounds());
                    i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    i7 = rect.centerX() - ((org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f)));
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                by0 by0Var = new by0(ey0Var, ey0Var, ey0Var.getParentActivity(), Integer.valueOf(i7), dy0Var, j11VarArr);
                String Q = ey0Var.getMediaDataController().Q();
                if (Q != null && Q.startsWith("animated_")) {
                    try {
                        by0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = ey0Var.getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? obj = new Object();
                    obj.f6354f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    arrayList2.add(obj);
                }
                by0Var.setRecentReactions(arrayList2);
                by0Var.setSaveState(3);
                by0Var.y(g5Var, dy0Var);
                cy0 cy0Var = new cy0(ey0Var, by0Var);
                ey0Var.f45540n = cy0Var;
                j11VarArr[0] = cy0Var;
                cy0Var.showAsDropDown(dy0Var, 0, i10, 53);
                j11VarArr[0].b();
            }
        }
    }

    public static int d0(ey0 ey0Var) {
        return ey0Var.currentAccount;
    }

    public static int e0(ey0 ey0Var) {
        return ey0Var.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f45535a = qj0Var;
        qj0Var.r1();
        this.f45535a.setSectionsDrawBackground(true);
        ((v4.k) this.f45535a.getItemAnimator()).f57083m = false;
        this.f45535a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.f45535a;
        ay0 ay0Var = new ay0(this, context);
        this.f45536b = ay0Var;
        qj0Var2.setAdapter(ay0Var);
        this.f45535a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.f45535a, c8.ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f45536b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.qs.V4) {
                this.f45536b.f();
            } else if (i7 == org.telegram.messenger.qs.f25001f5) {
                h0();
                this.f45536b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f45535a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(20, this), org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.G6, org.telegram.ui.ActionBar.l6.f28275z6, org.telegram.ui.ActionBar.l6.f27957i6, org.telegram.ui.ActionBar.l6.f27809a7, org.telegram.ui.ActionBar.l6.B6, org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.ui.ActionBar.l6.f27903f6, org.telegram.ui.ActionBar.l6.f27920g6, org.telegram.ui.ActionBar.l6.O6, org.telegram.ui.ActionBar.l6.P6, org.telegram.ui.ActionBar.l6.Q6, org.telegram.ui.ActionBar.l6.R6);
    }

    public final void h0() {
        this.f45539f = 2;
        this.f45537c = 1;
        if (org.telegram.messenger.p10.i(this.currentAccount).q()) {
            this.d = -1;
            int i7 = this.f45539f;
            this.f45539f = i7 + 1;
            this.f45538e = i7;
            return;
        }
        this.f45538e = -1;
        this.d = this.f45539f;
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
        b0Var2.c(org.telegram.messenger.qs.f25001f5);
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
