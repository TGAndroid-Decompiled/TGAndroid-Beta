package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public org.telegram.ui.Components.ek0 f47374a;
    public ay0 f47375b;
    public int f47376c;
    public int d;
    public int f47377e;
    public int f47378f;
    public xi.e h;
    public cy0 f47379n;

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
            if (xVar.f32276n && !ey0Var.getUserConfig().q()) {
                ey0Var.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) ey0Var, 4, true));
                return;
            }
            org.telegram.messenger.si.d0(ey0Var.currentAccount).f2(xVar.f32275f.reaction);
            ey0Var.f47374a.getAdapter().k(0, ey0Var.f47374a.getAdapter().b());
        } else if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.f47379n == null) {
                i11[] i11VarArr = new i11[1];
                org.telegram.ui.Components.n5 n5Var = dy0Var.f47051a;
                if (n5Var != null) {
                    n5Var.f();
                    dy0Var.b();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(n5Var.getBounds());
                    i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    i7 = rect.centerX() - ((org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f)));
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
                    obj.f5470f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                    arrayList2.add(obj);
                }
                by0Var.setRecentReactions(arrayList2);
                by0Var.setSaveState(3);
                by0Var.y(n5Var, dy0Var);
                cy0 cy0Var = new cy0(ey0Var, by0Var);
                ey0Var.f47379n = cy0Var;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f47374a = ek0Var;
        ek0Var.r1();
        this.f47374a.setSectionsDrawBackground(true);
        ((v4.k) this.f47374a.getItemAnimator()).f59139m = false;
        this.f47374a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f47374a;
        ay0 ay0Var = new ay0(this, context);
        this.f47375b = ay0Var;
        ek0Var2.setAdapter(ay0Var);
        this.f47374a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.f47374a, c8.na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f47375b.f();
        h0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i7 == org.telegram.messenger.ls.Y4) {
                this.f47375b.f();
            } else if (i7 == org.telegram.messenger.ls.f25291i5) {
                h0();
                this.f47375b.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f47374a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new f6(20, this), org.telegram.ui.ActionBar.m6.f29347d6, org.telegram.ui.ActionBar.m6.G6, org.telegram.ui.ActionBar.m6.f29758z6, org.telegram.ui.ActionBar.m6.f29439i6, org.telegram.ui.ActionBar.m6.f29290a7, org.telegram.ui.ActionBar.m6.B6, org.telegram.ui.ActionBar.m6.f29568p7, org.telegram.ui.ActionBar.m6.f29385f6, org.telegram.ui.ActionBar.m6.f29402g6, org.telegram.ui.ActionBar.m6.O6, org.telegram.ui.ActionBar.m6.P6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
    }

    public final void h0() {
        this.f47378f = 2;
        this.f47376c = 1;
        if (org.telegram.messenger.k10.i(this.currentAccount).q()) {
            this.d = -1;
            int i7 = this.f47378f;
            this.f47378f = i7 + 1;
            this.f47377e = i7;
            return;
        }
        this.f47377e = -1;
        this.d = this.f47378f;
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
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ls.Y4);
        eVar2.c(org.telegram.messenger.ls.f25291i5);
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
