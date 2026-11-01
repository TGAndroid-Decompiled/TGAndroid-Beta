package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.k2 {
    public int f33974a;
    public int addExceptionRow;
    public long f33975b;
    public org.telegram.messenger.cw f33976c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f33977f;
    public int h;
    public int maxVideoSizeRow;
    public n01 f33978n;
    public org.telegram.ui.Components.uk0 f33979r;
    public final ArrayList f33980s;
    public LongSparseArray f33981w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f33980s = new ArrayList();
        this.f33981w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.t8 t8Var, int i10) {
        for (int i11 = 0; i11 < t8Var.getChildCount(); i11++) {
            View childAt = t8Var.getChildAt(i11);
            if ((childAt instanceof org.telegram.ui.Components.fi0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
                org.telegram.ui.ActionBar.p6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.a7.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.dw c0() {
        org.telegram.messenger.cw cwVar = this.f33976c;
        if (cwVar != null) {
            return cwVar;
        }
        return org.telegram.messenger.ks.f(this.f33974a);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 29));
        if (this.f33976c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747911, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745944, null));
            }
        } else {
            int i11 = this.f33974a;
            if (i11 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745936, null));
            } else if (i11 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745943, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131745945, null));
            }
        }
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33979r = uk0Var;
        uk0Var.r1();
        this.f33979r.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.n(400L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.f33979r.setItemAnimator(jVar);
        this.f33979r.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f33979r;
        n01 n01Var = new n01(this);
        this.f33978n = n01Var;
        uk0Var2.setAdapter(n01Var);
        this.f33979r.setOnItemClickListener(new m01(this));
        this.f33979r.setOnItemLongClickListener(new m01(this));
        frameLayout.addView(this.f33979r);
        if (this.f33976c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i10 = 2131754432;
            } else {
                i10 = 2131745960;
            }
            textView.setText(org.telegram.messenger.dd.L0(i10, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
            frameLayout2.addView(textView, w7.b6.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new zz0(this, 2));
            frameLayout.addView(frameLayout2, w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f33976c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f33974a);
            org.telegram.messenger.cw cwVar = this.f33976c;
            m10.put(cwVar.d, cwVar);
            getUserConfig().A(this.f33974a, m10);
            return;
        }
        org.telegram.messenger.ks.n(this.f33974a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f33980s;
        if (!z10 && this.f33978n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f33976c != null) {
            arrayList2.add(new o01(9));
            arrayList2.add(new o01(3));
        }
        arrayList2.add(new o01(5, org.telegram.messenger.dd.L0(2131745946, null)));
        this.e = arrayList2.size();
        arrayList2.add(new o01(6));
        this.f33977f = arrayList2.size();
        arrayList2.add(new o01(6));
        if (this.f33976c != null) {
            str = org.telegram.messenger.dd.L0(2131745941, null);
        } else {
            int i10 = this.f33974a;
            if (i10 == 1) {
                str = org.telegram.messenger.dd.L0(2131745939, null);
            } else if (i10 == 4) {
                str = org.telegram.messenger.dd.L0(2131745942, null);
            } else if (i10 == 2) {
                str = org.telegram.messenger.dd.L0(2131745940, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new o01(7, str));
        if (c0().f15448b) {
            arrayList2.add(new o01(5, org.telegram.messenger.dd.L0(2131748683, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new o01(8));
            this.h = arrayList2.size();
            arrayList2.add(new o01(7));
        } else {
            this.h = -1;
        }
        if (this.f33976c == null) {
            this.f33981w = getUserConfig().m(this.f33974a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new o01(1));
            int i11 = 0;
            boolean z11 = false;
            while (i11 < this.f33981w.size()) {
                arrayList2.add(new o01((org.telegram.messenger.cw) this.f33981w.valueAt(i11)));
                i11++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new o01(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new o01(4));
            }
            arrayList2.add(new o01(10));
        }
        n01 n01Var = this.f33978n;
        if (n01Var != null) {
            if (arrayList != null) {
                n01Var.E(arrayList, arrayList2);
            } else {
                n01Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33979r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f33974a = getArguments().getInt("type");
        this.f33981w = getUserConfig().m(this.f33974a);
        long j10 = getArguments().getLong("dialog_id");
        this.f33975b = j10;
        if (j10 != 0) {
            org.telegram.messenger.cw cwVar = (org.telegram.messenger.cw) org.telegram.messenger.e20.i(this.currentAccount).m(this.f33974a).get(this.f33975b);
            this.f33976c = cwVar;
            if (cwVar == null) {
                this.d = true;
                this.f33976c = new org.telegram.messenger.dw();
                org.telegram.messenger.ew f7 = org.telegram.messenger.ks.f(this.f33974a);
                org.telegram.messenger.cw cwVar2 = this.f33976c;
                cwVar2.f15447a = f7.f15447a;
                cwVar2.f15448b = f7.f15448b;
                cwVar2.f15449c = f7.f15449c;
                cwVar2.d = this.f33975b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
