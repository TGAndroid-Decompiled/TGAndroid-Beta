package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.f2 {
    public int f41859a;
    public int addExceptionRow;
    public long f41860b;
    public org.telegram.messenger.qv f41861c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f41862e;
    public int f41863f;
    public int h;
    public int maxVideoSizeRow;
    public zy0 f41864n;
    public org.telegram.ui.Components.pj0 f41865r;
    public final ArrayList f41866s;
    public LongSparseArray f41867w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f41866s = new ArrayList();
        this.f41867w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.r8 r8Var, int i7) {
        for (int i10 = 0; i10 < r8Var.getChildCount(); i10++) {
            View childAt = r8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.ch0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
                org.telegram.ui.ActionBar.f6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.rv c0() {
        org.telegram.messenger.qv qvVar = this.f41861c;
        if (qvVar != null) {
            return qvVar;
        }
        return org.telegram.messenger.b6.f(this.f41859a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mt0(this, 8));
        if (this.f41861c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747894, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745928, null));
            }
        } else {
            int i10 = this.f41859a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745920, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745927, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745929, null));
            }
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41865r = pj0Var;
        pj0Var.r1();
        this.f41865r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56954m = false;
        this.f41865r.setItemAnimator(kVar);
        this.f41865r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f41865r;
        zy0 zy0Var = new zy0(this);
        this.f41864n = zy0Var;
        pj0Var2.setAdapter(zy0Var);
        this.f41865r.setOnItemClickListener(new yy0(this));
        this.f41865r.setOnItemLongClickListener(new yy0(this));
        frameLayout.addView(this.f41865r);
        if (this.f41861c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754432;
            } else {
                i7 = 2131745944;
            }
            textView.setText(org.telegram.messenger.hd.M0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
            frameLayout2.addView(textView, c8.ha.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new my0(this, 2));
            frameLayout.addView(frameLayout2, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f41861c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f41859a);
            org.telegram.messenger.qv qvVar = this.f41861c;
            m10.put(qvVar.d, qvVar);
            getUserConfig().A(this.f41859a, m10);
            return;
        }
        org.telegram.messenger.b6.m(this.f41859a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z9 = this.isPaused;
        ArrayList arrayList2 = this.f41866s;
        if (!z9 && this.f41864n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f41861c != null) {
            arrayList2.add(new az0(9));
            arrayList2.add(new az0(3));
        }
        arrayList2.add(new az0(5, org.telegram.messenger.hd.M0(2131745930, null)));
        this.f41862e = arrayList2.size();
        arrayList2.add(new az0(6));
        this.f41863f = arrayList2.size();
        arrayList2.add(new az0(6));
        if (this.f41861c != null) {
            str = org.telegram.messenger.hd.M0(2131745925, null);
        } else {
            int i7 = this.f41859a;
            if (i7 == 1) {
                str = org.telegram.messenger.hd.M0(2131745923, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.hd.M0(2131745926, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.hd.M0(2131745924, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new az0(7, str));
        if (c0().f25343b) {
            arrayList2.add(new az0(5, org.telegram.messenger.hd.M0(2131748667, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new az0(8));
            this.h = arrayList2.size();
            arrayList2.add(new az0(7));
        } else {
            this.h = -1;
        }
        if (this.f41861c == null) {
            this.f41867w = getUserConfig().m(this.f41859a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new az0(1));
            int i10 = 0;
            boolean z10 = false;
            while (i10 < this.f41867w.size()) {
                arrayList2.add(new az0((org.telegram.messenger.qv) this.f41867w.valueAt(i10)));
                i10++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new az0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new az0(4));
            }
            arrayList2.add(new az0(10));
        }
        zy0 zy0Var = this.f41864n;
        if (zy0Var != null) {
            if (arrayList != null) {
                zy0Var.E(arrayList, arrayList2);
            } else {
                zy0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41865r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41859a = getArguments().getInt("type");
        this.f41867w = getUserConfig().m(this.f41859a);
        long j3 = getArguments().getLong("dialog_id");
        this.f41860b = j3;
        if (j3 != 0) {
            org.telegram.messenger.qv qvVar = (org.telegram.messenger.qv) org.telegram.messenger.p10.i(this.currentAccount).m(this.f41859a).get(this.f41860b);
            this.f41861c = qvVar;
            if (qvVar == null) {
                this.d = true;
                this.f41861c = new org.telegram.messenger.rv();
                org.telegram.messenger.sv f10 = org.telegram.messenger.b6.f(this.f41859a);
                org.telegram.messenger.qv qvVar2 = this.f41861c;
                qvVar2.f25342a = f10.f25342a;
                qvVar2.f25343b = f10.f25343b;
                qvVar2.f25344c = f10.f25344c;
                qvVar2.d = this.f41860b;
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
