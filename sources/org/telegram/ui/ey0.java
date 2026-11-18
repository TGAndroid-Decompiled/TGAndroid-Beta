package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.ck0 f47340a;
    public ay0 f47341b;
    public int f47342c;
    public int d;
    public int f47343e;
    public int f47344f;
    public xi.e h;
    public cy0 f47345n;

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
            if (xVar.f32279n && !ey0Var.getUserConfig().q()) {
                ey0Var.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) ey0Var, 4, true));
                return;
            }
            org.telegram.messenger.ri.d0(ey0Var.currentAccount).f2(xVar.f32278f.reaction);
            ey0Var.f47340a.getAdapter().k(0, ey0Var.f47340a.getAdapter().b());
        } else if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.f47345n == null) {
                i11[] i11VarArr = new i11[1];
                org.telegram.ui.Components.m5 m5Var = dy0Var.f47010a;
                if (m5Var != null) {
                    m5Var.f();
                    dy0Var.b();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(m5Var.getBounds());
                    i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    i7 = rect.centerX() - ((org.telegram.messenger.g0.f24118q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f)));
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                by0 by0Var = new by0(ey0Var, ey0Var, ey0Var.getParentActivity(), Integer.valueOf(i7), dy0Var, i11VarArr);
                String S = ey0Var.getMediaDataController().S();
                if (S != null && S.startsWith("animated_")) {
                    try {
                        by0Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                ArrayList arrayList = ey0Var.getMediaDataController().h;
                ArrayList arrayList2 = new ArrayList(20);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? obj = new Object();
                    obj.f5475f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    arrayList2.add(obj);
                }
                by0Var.setRecentReactions(arrayList2);
                by0Var.setSaveState(3);
                by0Var.y(m5Var, dy0Var);
                cy0 cy0Var = new cy0(ey0Var, by0Var);
                ey0Var.f47345n = cy0Var;
                i11VarArr[0] = cy0Var;
                cy0Var.showAsDropDown(dy0Var, 0, i10, 53);
                i11VarArr[0].b();
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
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746192, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f47340a = ck0Var;
        ck0Var.r1();
        this.f47340a.setSectionsDrawBackground(true);
        ((v4.k) this.f47340a.getItemAnimator()).f59152m = false;
        this.f47340a.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f47340a;
        ay0 ay0Var = new ay0(this, context);
        this.f47341b = ay0Var;
        ck0Var2.setAdapter(ay0Var);
        this.f47340a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.f47340a, c8.ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f47341b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.Y4) {
                this.f47341b.f();
            } else if (i7 == org.telegram.messenger.ks.f25133i5) {
                h0();
                this.f47341b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f47340a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(20, this), org.telegram.ui.ActionBar.n6.f29394d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.f29805z6, org.telegram.ui.ActionBar.n6.f29486i6, org.telegram.ui.ActionBar.n6.f29337a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.f29615p7, org.telegram.ui.ActionBar.n6.f29432f6, org.telegram.ui.ActionBar.n6.f29449g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    public final void h0() {
        this.f47344f = 2;
        this.f47342c = 1;
        if (org.telegram.messenger.j10.i(this.currentAccount).q()) {
            this.d = -1;
            int i7 = this.f47344f;
            this.f47344f = i7 + 1;
            this.f47343e = i7;
            return;
        }
        this.f47343e = -1;
        this.d = this.f47344f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ks.Y4);
        eVar2.c(org.telegram.messenger.ks.f25133i5);
        this.h = eVar2;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
