package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.ek0 f47409a;
    public ay0 f47410b;
    public int f47411c;
    public int d;
    public int f47412e;
    public int f47413f;
    public xi.e h;
    public cy0 f47414n;

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
            if (xVar.f32307n && !ey0Var.getUserConfig().q()) {
                ey0Var.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) ey0Var, 4, true));
                return;
            }
            org.telegram.messenger.ri.d0(ey0Var.currentAccount).f2(xVar.f32306f.reaction);
            ey0Var.f47409a.getAdapter().k(0, ey0Var.f47409a.getAdapter().b());
        } else if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.f47414n == null) {
                j11[] j11VarArr = new j11[1];
                org.telegram.ui.Components.n5 n5Var = dy0Var.f47076a;
                if (n5Var != null) {
                    n5Var.f();
                    dy0Var.b();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(n5Var.getBounds());
                    i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    i7 = rect.centerX() - ((org.telegram.messenger.g0.f24146q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f)));
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                by0 by0Var = new by0(ey0Var, ey0Var, ey0Var.getParentActivity(), Integer.valueOf(i7), dy0Var, j11VarArr);
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
                    obj.f5504f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    arrayList2.add(obj);
                }
                by0Var.setRecentReactions(arrayList2);
                by0Var.setSaveState(3);
                by0Var.y(n5Var, dy0Var);
                cy0 cy0Var = new cy0(ey0Var, by0Var);
                ey0Var.f47414n = cy0Var;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47409a = ek0Var;
        ek0Var.r1();
        this.f47409a.setSectionsDrawBackground(true);
        ((v4.k) this.f47409a.getItemAnimator()).f59190m = false;
        this.f47409a.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f47409a;
        ay0 ay0Var = new ay0(this, context);
        this.f47410b = ay0Var;
        ek0Var2.setAdapter(ay0Var);
        this.f47409a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.f47409a, c8.ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f47410b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ks.Y4) {
                this.f47410b.f();
            } else if (i7 == org.telegram.messenger.ks.f25161i5) {
                h0();
                this.f47410b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47409a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(20, this), org.telegram.ui.ActionBar.m6.f29378d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f29789z6, org.telegram.ui.ActionBar.m6.f29470i6, org.telegram.ui.ActionBar.m6.f29321a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f29599p7, org.telegram.ui.ActionBar.m6.f29416f6, org.telegram.ui.ActionBar.m6.f29433g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    public final void h0() {
        this.f47413f = 2;
        this.f47411c = 1;
        if (org.telegram.messenger.j10.i(this.currentAccount).q()) {
            this.d = -1;
            int i7 = this.f47413f;
            this.f47413f = i7 + 1;
            this.f47412e = i7;
            return;
        }
        this.f47412e = -1;
        this.d = this.f47413f;
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
        eVar2.c(org.telegram.messenger.ks.f25161i5);
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
