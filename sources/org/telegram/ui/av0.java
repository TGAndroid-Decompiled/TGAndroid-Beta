package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class av0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final int D;
    public org.telegram.ui.Components.tk0 f35751a;
    public s4.a0 f35752b;
    public zu0 f35753c;
    public org.telegram.ui.Components.xy d;
    public int e;
    public int f35754f;
    public int h;
    public int f35755n;
    public int f35756r;
    public int f35757s;
    public int f35758w;
    public int f35759x;
    public final boolean f35760y;

    public av0() {
        super(null);
        this.D = 1;
        this.f35760y = true;
    }

    public final void Y(Long l4, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        int i10 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)));
        int i11 = this.D;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, org.telegram.messenger.cd.L0(2131743936, null), new et0(7, this, l4), z10);
        if (i11 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 0) {
            i10 = 2131232414;
        }
        H.m(i10, new yu0(this, l4), org.telegram.messenger.cd.L0(2131746336, null), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void Z() {
        this.e = 0;
        this.f35754f = -1;
        this.f35755n = -1;
        this.h = -1;
        this.f35759x = -1;
        if (!this.f35760y || getMessagesController().H0 >= 0) {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.f35754f = i10;
            int i12 = this.D;
            if (i12 == 1) {
                this.e = i10 + 2;
                this.h = i11;
            }
            if (i12 == 1) {
                int size = getMessagesController().G0.size();
                if (size != 0) {
                    if (i12 == 1) {
                        int i13 = this.e;
                        this.e = i13 + 1;
                        this.f35755n = i13;
                    }
                    int i14 = this.e;
                    this.f35756r = i14;
                    int i15 = i14 + size;
                    this.f35757s = i15;
                    int i16 = i15 + 1;
                    this.e = i16;
                    this.f35758w = i15;
                    if (i12 != 1) {
                        this.e = i15 + 2;
                        this.f35759x = i16;
                    }
                } else {
                    this.f35755n = -1;
                    this.f35756r = -1;
                    this.f35757s = -1;
                    this.f35758w = -1;
                    this.f35759x = -1;
                }
            } else {
                throw null;
            }
        }
        zu0 zu0Var = this.f35753c;
        if (zu0Var != null) {
            zu0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21259v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21242u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        int i10 = 2;
        int i11 = this.D;
        if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753681, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131748304, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        if (i11 == 1) {
            xyVar.setText(org.telegram.messenger.cd.L0(2131748256, null));
        } else {
            xyVar.setText(org.telegram.messenger.cd.L0(2131748240, null));
        }
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f35751a = tk0Var;
        tk0Var.r1();
        this.f35751a.setItemSelectorColorProvider(new xu0(this));
        this.f35751a.setSectionsDrawBackground(true);
        this.f35751a.setEmptyView(this.d);
        org.telegram.ui.Components.tk0 tk0Var2 = this.f35751a;
        s4.a0 a0Var = new s4.a0(1, false);
        this.f35752b = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        this.f35751a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tk0 tk0Var3 = this.f35751a;
        zu0 zu0Var = new zu0(this, context);
        this.f35753c = zu0Var;
        tk0Var3.setAdapter(zu0Var);
        org.telegram.ui.Components.tk0 tk0Var4 = this.f35751a;
        if (org.telegram.messenger.cd.X) {
            i10 = 1;
        }
        tk0Var4.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f35751a, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f35751a.setOnItemClickListener(new g(this, 27));
        this.f35751a.setOnItemLongClickListener(new xu0(this));
        if (i11 == 1) {
            this.f35751a.setOnScrollListener(new h3(this, 26));
            if (getMessagesController().H0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        Z();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.tk0 tk0Var;
        if (i10 == org.telegram.messenger.zs.f19676r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.vp.D8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (tk0Var = this.f35751a) != null) {
                int childCount = tk0Var.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = this.f35751a.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.e5) {
                        ((org.telegram.ui.Cells.e5) childAt).d(intValue);
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19614g0) {
            this.d.c();
            Z();
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f35751a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35751a, 16, new Class[]{org.telegram.ui.Cells.e5.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.p4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35751a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21311y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35751a, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19676r);
        if (this.D == 1) {
            org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19614g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19676r);
        if (this.D == 1) {
            org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19614g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        zu0 zu0Var = this.f35753c;
        if (zu0Var != null) {
            zu0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.xy xyVar = this.d;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
