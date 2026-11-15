package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.e2 {
    public int f43258a;
    public int addExceptionRow;
    public long f43259b;
    public org.telegram.messenger.ov f43260c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f43261e;
    public int f43262f;
    public int h;
    public int maxVideoSizeRow;
    public xy0 f43263n;
    public org.telegram.ui.Components.uj0 f43264r;
    public final ArrayList f43265s;
    public LongSparseArray f43266w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f43265s = new ArrayList();
        this.f43266w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.q8 q8Var, int i7) {
        for (int i10 = 0; i10 < q8Var.getChildCount(); i10++) {
            View childAt = q8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.fh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
                org.telegram.ui.ActionBar.e6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.q6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.pv c0() {
        org.telegram.messenger.ov ovVar = this.f43260c;
        if (ovVar != null) {
            return ovVar;
        }
        return org.telegram.messenger.b6.f(this.f43258a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 9));
        if (this.f43260c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747895, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745927, null));
            }
        } else {
            int i10 = this.f43258a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745919, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745926, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745928, null));
            }
        }
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f43264r = uj0Var;
        uj0Var.r1();
        this.f43264r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f43264r.setItemAnimator(kVar);
        this.f43264r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f43264r;
        xy0 xy0Var = new xy0(this);
        this.f43263n = xy0Var;
        uj0Var2.setAdapter(xy0Var);
        this.f43264r.setOnItemClickListener(new wy0(this));
        this.f43264r.setOnItemLongClickListener(new wy0(this));
        frameLayout.addView(this.f43264r);
        if (this.f43260c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754432;
            } else {
                i7 = 2131745943;
            }
            textView.setText(org.telegram.messenger.hd.M0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
            frameLayout2.addView(textView, c8.ja.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new ky0(this, 2));
            frameLayout.addView(frameLayout2, c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f43260c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f43258a);
            org.telegram.messenger.ov ovVar = this.f43260c;
            m10.put(ovVar.d, ovVar);
            getUserConfig().A(this.f43258a, m10);
            return;
        }
        org.telegram.messenger.b6.o(this.f43258a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f43265s;
        if (!z10 && this.f43263n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f43260c != null) {
            arrayList2.add(new yy0(9));
            arrayList2.add(new yy0(3));
        }
        arrayList2.add(new yy0(5, org.telegram.messenger.hd.M0(2131745929, null)));
        this.f43261e = arrayList2.size();
        arrayList2.add(new yy0(6));
        this.f43262f = arrayList2.size();
        arrayList2.add(new yy0(6));
        if (this.f43260c != null) {
            str = org.telegram.messenger.hd.M0(2131745924, null);
        } else {
            int i7 = this.f43258a;
            if (i7 == 1) {
                str = org.telegram.messenger.hd.M0(2131745922, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.hd.M0(2131745925, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.hd.M0(2131745923, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new yy0(7, str));
        if (c0().f25993b) {
            arrayList2.add(new yy0(5, org.telegram.messenger.hd.M0(2131748668, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new yy0(8));
            this.h = arrayList2.size();
            arrayList2.add(new yy0(7));
        } else {
            this.h = -1;
        }
        if (this.f43260c == null) {
            this.f43266w = getUserConfig().m(this.f43258a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new yy0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.f43266w.size()) {
                arrayList2.add(new yy0((org.telegram.messenger.ov) this.f43266w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new yy0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new yy0(4));
            }
            arrayList2.add(new yy0(10));
        }
        xy0 xy0Var = this.f43263n;
        if (xy0Var != null) {
            if (arrayList != null) {
                xy0Var.E(arrayList, arrayList2);
            } else {
                xy0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43264r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43258a = getArguments().getInt("type");
        this.f43266w = getUserConfig().m(this.f43258a);
        long j3 = getArguments().getLong("dialog_id");
        this.f43259b = j3;
        if (j3 != 0) {
            org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) org.telegram.messenger.m10.i(this.currentAccount).m(this.f43258a).get(this.f43259b);
            this.f43260c = ovVar;
            if (ovVar == null) {
                this.d = true;
                this.f43260c = new org.telegram.messenger.pv();
                org.telegram.messenger.qv f10 = org.telegram.messenger.b6.f(this.f43258a);
                org.telegram.messenger.ov ovVar2 = this.f43260c;
                ovVar2.f25992a = f10.f25992a;
                ovVar2.f25993b = f10.f25993b;
                ovVar2.f25994c = f10.f25994c;
                ovVar2.d = this.f43259b;
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
