package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.d2 {
    public int f41915a;
    public int addExceptionRow;
    public long f41916b;
    public org.telegram.messenger.iv f41917c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f41918e;
    public int f41919f;
    public int h;
    public int maxVideoSizeRow;
    public py0 f41920n;
    public org.telegram.ui.Components.tj0 f41921r;
    public final ArrayList f41922s;
    public LongSparseArray f41923w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f41922s = new ArrayList();
        this.f41923w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.q8 q8Var, int i3) {
        for (int i10 = 0; i10 < q8Var.getChildCount(); i10++) {
            View childAt = q8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.fh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
                org.telegram.ui.ActionBar.e6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(childAt, background, N, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.jv c0() {
        org.telegram.messenger.iv ivVar = this.f41917c;
        if (ivVar != null) {
            return ivVar;
        }
        return org.telegram.messenger.b6.f(this.f41915a);
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 9));
        if (this.f41917c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747903, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745937, null));
            }
        } else {
            int i10 = this.f41915a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745929, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745936, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745938, null));
            }
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41921r = tj0Var;
        tj0Var.r1();
        this.f41921r.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f41921r.setItemAnimator(kVar);
        this.f41921r.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f41921r;
        py0 py0Var = new py0(this);
        this.f41920n = py0Var;
        tj0Var2.setAdapter(py0Var);
        this.f41921r.setOnItemClickListener(new oy0(this));
        this.f41921r.setOnItemLongClickListener(new oy0(this));
        frameLayout.addView(this.f41921r);
        if (this.f41917c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i3 = 2131754432;
            } else {
                i3 = 2131745953;
            }
            textView.setText(org.telegram.messenger.bd.M0(i3, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
            frameLayout2.addView(textView, b8.mf.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new cy0(this, 2));
            frameLayout.addView(frameLayout2, b8.mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f41917c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f41915a);
            org.telegram.messenger.iv ivVar = this.f41917c;
            m10.put(ivVar.d, ivVar);
            getUserConfig().A(this.f41915a, m10);
            return;
        }
        org.telegram.messenger.b6.m(this.f41915a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f41922s;
        if (!z10 && this.f41920n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f41917c != null) {
            arrayList2.add(new qy0(9));
            arrayList2.add(new qy0(3));
        }
        arrayList2.add(new qy0(5, org.telegram.messenger.bd.M0(2131745939, null)));
        this.f41918e = arrayList2.size();
        arrayList2.add(new qy0(6));
        this.f41919f = arrayList2.size();
        arrayList2.add(new qy0(6));
        if (this.f41917c != null) {
            str = org.telegram.messenger.bd.M0(2131745934, null);
        } else {
            int i3 = this.f41915a;
            if (i3 == 1) {
                str = org.telegram.messenger.bd.M0(2131745932, null);
            } else if (i3 == 4) {
                str = org.telegram.messenger.bd.M0(2131745935, null);
            } else if (i3 == 2) {
                str = org.telegram.messenger.bd.M0(2131745933, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new qy0(7, str));
        if (c0().f23728b) {
            arrayList2.add(new qy0(5, org.telegram.messenger.bd.M0(2131748676, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new qy0(8));
            this.h = arrayList2.size();
            arrayList2.add(new qy0(7));
        } else {
            this.h = -1;
        }
        if (this.f41917c == null) {
            this.f41923w = getUserConfig().m(this.f41915a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new qy0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.f41923w.size()) {
                arrayList2.add(new qy0((org.telegram.messenger.iv) this.f41923w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new qy0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new qy0(4));
            }
            arrayList2.add(new qy0(10));
        }
        py0 py0Var = this.f41920n;
        if (py0Var != null) {
            if (arrayList != null) {
                py0Var.E(arrayList, arrayList2);
            } else {
                py0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41921r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41915a = getArguments().getInt("type");
        this.f41923w = getUserConfig().m(this.f41915a);
        long j10 = getArguments().getLong("dialog_id");
        this.f41916b = j10;
        if (j10 != 0) {
            org.telegram.messenger.iv ivVar = (org.telegram.messenger.iv) org.telegram.messenger.h10.i(this.currentAccount).m(this.f41915a).get(this.f41916b);
            this.f41917c = ivVar;
            if (ivVar == null) {
                this.d = true;
                this.f41917c = new org.telegram.messenger.jv();
                org.telegram.messenger.kv f10 = org.telegram.messenger.b6.f(this.f41915a);
                org.telegram.messenger.iv ivVar2 = this.f41917c;
                ivVar2.f23727a = f10.f23727a;
                ivVar2.f23728b = f10.f23728b;
                ivVar2.f23729c = f10.f23729c;
                ivVar2.d = this.f41916b;
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
