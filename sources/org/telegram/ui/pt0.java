package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class pt0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public final int E;
    public org.telegram.ui.Components.uj0 f50352a;
    public v4.b0 f50353b;
    public ot0 f50354c;
    public org.telegram.ui.Components.ny d;
    public int f50355e;
    public int f50356f;
    public int h;
    public int f50357n;
    public int f50358r;
    public int f50359s;
    public int f50360w;
    public int f50361x;
    public final boolean f50362y;

    public pt0() {
        super(null);
        this.E = 1;
        this.f50362y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
        int i7 = 0;
        H.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.l(0, org.telegram.messenger.hd.M0(2131743911, null), new mp0(10, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i7 = 2131232416;
        }
        H.m(i7, new nt0(this, l10), org.telegram.messenger.hd.M0(2131746321, null), z11, true);
        H.S = 190;
        H.Z();
    }

    public final void a0() {
        this.f50355e = 0;
        this.f50356f = -1;
        this.f50357n = -1;
        this.h = -1;
        this.f50361x = -1;
        if (!this.f50362y || getMessagesController().I0 >= 0) {
            int i7 = this.f50355e;
            int i10 = i7 + 1;
            this.f50355e = i10;
            this.f50356f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.f50355e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f50355e;
                        this.f50355e = i12 + 1;
                        this.f50357n = i12;
                    }
                    int i13 = this.f50355e;
                    this.f50358r = i13;
                    int i14 = i13 + size;
                    this.f50359s = i14;
                    int i15 = i14 + 1;
                    this.f50355e = i15;
                    this.f50360w = i14;
                    if (i11 != 1) {
                        this.f50355e = i14 + 2;
                        this.f50361x = i15;
                    }
                } else {
                    this.f50357n = -1;
                    this.f50358r = -1;
                    this.f50359s = -1;
                    this.f50360w = -1;
                    this.f50361x = -1;
                }
            } else {
                throw null;
            }
        }
        ot0 ot0Var = this.f50354c;
        if (ot0Var != null) {
            ot0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29184v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29165u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i7 = 2;
        int i10 = this.E;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753681, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750729, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131748290, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        if (i10 == 1) {
            nyVar.setText(org.telegram.messenger.hd.M0(2131748239, null));
        } else {
            nyVar.setText(org.telegram.messenger.hd.M0(2131748223, null));
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f50352a = uj0Var;
        uj0Var.r1();
        this.f50352a.setItemSelectorColorProvider(new mt0(this));
        this.f50352a.setSectionsDrawBackground(true);
        this.f50352a.setEmptyView(this.d);
        org.telegram.ui.Components.uj0 uj0Var2 = this.f50352a;
        v4.b0 b0Var = new v4.b0(1, false);
        this.f50353b = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        this.f50352a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f50352a;
        ot0 ot0Var = new ot0(this, context);
        this.f50354c = ot0Var;
        uj0Var3.setAdapter(ot0Var);
        org.telegram.ui.Components.uj0 uj0Var4 = this.f50352a;
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 1;
        }
        uj0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f50352a, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        this.f50352a.setOnItemClickListener(new h(this, 27));
        this.f50352a.setOnItemLongClickListener(new mt0(this));
        if (i10 == 1) {
            this.f50352a.setOnScrollListener(new g3(this, 27));
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
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.uj0 uj0Var;
        if (i7 == org.telegram.messenger.ns.f25560r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (uj0Var = this.f50352a) != null) {
                int childCount = uj0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f50352a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        ((org.telegram.ui.Cells.a5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25499g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f50352a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f50352a, 16, new Class[]{org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28923h6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f50352a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29241y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f50352a, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25560r);
        if (this.E == 1) {
            org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25499g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25560r);
        if (this.E == 1) {
            org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25499g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ot0 ot0Var = this.f50354c;
        if (ot0Var != null) {
            ot0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.ny nyVar = this.d;
            if (nyVar != null) {
                nyVar.setProgressBarColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28923h6, false));
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
