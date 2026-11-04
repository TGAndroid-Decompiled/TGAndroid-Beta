package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class it0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public final int E;
    public org.telegram.ui.Components.tj0 f46410a;
    public u4.b0 f46411b;
    public ht0 f46412c;
    public org.telegram.ui.Components.gy d;
    public int f46413e;
    public int f46414f;
    public int h;
    public int f46415n;
    public int f46416r;
    public int f46417s;
    public int f46418w;
    public int f46419x;
    public final boolean f46420y;

    public it0() {
        super(null);
        this.E = 1;
        this.f46420y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
        int i3 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, org.telegram.messenger.bd.M0(2131743921, null), new hk0(19, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i3 = 2131232415;
        }
        H.m(i3, new gt0(this, l10), org.telegram.messenger.bd.M0(2131746329, null), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f46413e = 0;
        this.f46414f = -1;
        this.f46415n = -1;
        this.h = -1;
        this.f46419x = -1;
        if (!this.f46420y || getMessagesController().I0 >= 0) {
            int i3 = this.f46413e;
            int i10 = i3 + 1;
            this.f46413e = i10;
            this.f46414f = i3;
            int i11 = this.E;
            if (i11 == 1) {
                this.f46413e = i3 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f46413e;
                        this.f46413e = i12 + 1;
                        this.f46415n = i12;
                    }
                    int i13 = this.f46413e;
                    this.f46416r = i13;
                    int i14 = i13 + size;
                    this.f46417s = i14;
                    int i15 = i14 + 1;
                    this.f46413e = i15;
                    this.f46418w = i14;
                    if (i11 != 1) {
                        this.f46413e = i14 + 2;
                        this.f46419x = i15;
                    }
                } else {
                    this.f46415n = -1;
                    this.f46416r = -1;
                    this.f46417s = -1;
                    this.f46418w = -1;
                    this.f46419x = -1;
                }
            } else {
                throw null;
            }
        }
        ht0 ht0Var = this.f46412c;
        if (ht0Var != null) {
            ht0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28214v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28196u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i3 = 2;
        int i10 = this.E;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131753681, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131750730, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131748298, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        if (i10 == 1) {
            gyVar.setText(org.telegram.messenger.bd.M0(2131748247, null));
        } else {
            gyVar.setText(org.telegram.messenger.bd.M0(2131748231, null));
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f46410a = tj0Var;
        tj0Var.r1();
        this.f46410a.setItemSelectorColorProvider(new ft0(this));
        this.f46410a.setSectionsDrawBackground(true);
        this.f46410a.setEmptyView(this.d);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f46410a;
        u4.b0 b0Var = new u4.b0(1, false);
        this.f46411b = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        this.f46410a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f46410a;
        ht0 ht0Var = new ht0(this, context);
        this.f46412c = ht0Var;
        tj0Var3.setAdapter(ht0Var);
        org.telegram.ui.Components.tj0 tj0Var4 = this.f46410a;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 1;
        }
        tj0Var4.setVerticalScrollbarPosition(i3);
        frameLayout.addView(this.f46410a, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.f46410a.setOnItemClickListener(new h(this, 27));
        this.f46410a.setOnItemLongClickListener(new ft0(this));
        if (i10 == 1) {
            this.f46410a.setOnScrollListener(new h3(this, 27));
            if (getMessagesController().I0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.tj0 tj0Var;
        if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (tj0Var = this.f46410a) != null) {
                int childCount = tj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f46410a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).d(intValue);
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23231g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f46410a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46410a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46410a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f46410a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23292r);
        if (this.E == 1) {
            org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23231g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23292r);
        if (this.E == 1) {
            org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23231g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ht0 ht0Var = this.f46412c;
        if (ht0Var != null) {
            ht0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.gy gyVar = this.d;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
