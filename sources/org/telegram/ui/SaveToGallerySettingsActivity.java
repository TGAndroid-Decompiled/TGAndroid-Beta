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
    public int f41885a;
    public int addExceptionRow;
    public long f41886b;
    public org.telegram.messenger.qv f41887c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f41888e;
    public int f41889f;
    public int h;
    public int maxVideoSizeRow;
    public dz0 f41890n;
    public org.telegram.ui.Components.pj0 f41891r;
    public final ArrayList f41892s;
    public LongSparseArray f41893w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f41892s = new ArrayList();
        this.f41893w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.r8 r8Var, int i7) {
        for (int i10 = 0; i10 < r8Var.getChildCount(); i10++) {
            View childAt = r8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.ch0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                org.telegram.ui.ActionBar.h6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.rv c0() {
        org.telegram.messenger.qv qvVar = this.f41887c;
        if (qvVar != null) {
            return qvVar;
        }
        return org.telegram.messenger.b6.f(this.f41885a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 8));
        if (this.f41887c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747895, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745927, null));
            }
        } else {
            int i10 = this.f41885a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745919, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745926, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745928, null));
            }
        }
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41891r = pj0Var;
        pj0Var.r1();
        this.f41891r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.f41891r.setItemAnimator(kVar);
        this.f41891r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f41891r;
        dz0 dz0Var = new dz0(this);
        this.f41890n = dz0Var;
        pj0Var2.setAdapter(dz0Var);
        this.f41891r.setOnItemClickListener(new cz0(this));
        this.f41891r.setOnItemLongClickListener(new cz0(this));
        frameLayout.addView(this.f41891r);
        if (this.f41887c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754432;
            } else {
                i7 = 2131745943;
            }
            textView.setText(org.telegram.messenger.id.M0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
            frameLayout2.addView(textView, c8.ha.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new qy0(this, 2));
            frameLayout.addView(frameLayout2, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f41887c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f41885a);
            org.telegram.messenger.qv qvVar = this.f41887c;
            m10.put(qvVar.d, qvVar);
            getUserConfig().A(this.f41885a, m10);
            return;
        }
        org.telegram.messenger.b6.m(this.f41885a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z9 = this.isPaused;
        ArrayList arrayList2 = this.f41892s;
        if (!z9 && this.f41890n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f41887c != null) {
            arrayList2.add(new ez0(9));
            arrayList2.add(new ez0(3));
        }
        arrayList2.add(new ez0(5, org.telegram.messenger.id.M0(2131745929, null)));
        this.f41888e = arrayList2.size();
        arrayList2.add(new ez0(6));
        this.f41889f = arrayList2.size();
        arrayList2.add(new ez0(6));
        if (this.f41887c != null) {
            str = org.telegram.messenger.id.M0(2131745924, null);
        } else {
            int i7 = this.f41885a;
            if (i7 == 1) {
                str = org.telegram.messenger.id.M0(2131745922, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.id.M0(2131745925, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.id.M0(2131745923, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new ez0(7, str));
        if (c0().f25350b) {
            arrayList2.add(new ez0(5, org.telegram.messenger.id.M0(2131748668, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new ez0(8));
            this.h = arrayList2.size();
            arrayList2.add(new ez0(7));
        } else {
            this.h = -1;
        }
        if (this.f41887c == null) {
            this.f41893w = getUserConfig().m(this.f41885a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new ez0(1));
            int i10 = 0;
            boolean z10 = false;
            while (i10 < this.f41893w.size()) {
                arrayList2.add(new ez0((org.telegram.messenger.qv) this.f41893w.valueAt(i10)));
                i10++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new ez0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new ez0(4));
            }
            arrayList2.add(new ez0(10));
        }
        dz0 dz0Var = this.f41890n;
        if (dz0Var != null) {
            if (arrayList != null) {
                dz0Var.E(arrayList, arrayList2);
            } else {
                dz0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41891r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41885a = getArguments().getInt("type");
        this.f41893w = getUserConfig().m(this.f41885a);
        long j3 = getArguments().getLong("dialog_id");
        this.f41886b = j3;
        if (j3 != 0) {
            org.telegram.messenger.qv qvVar = (org.telegram.messenger.qv) org.telegram.messenger.p10.i(this.currentAccount).m(this.f41885a).get(this.f41886b);
            this.f41887c = qvVar;
            if (qvVar == null) {
                this.d = true;
                this.f41887c = new org.telegram.messenger.rv();
                org.telegram.messenger.sv f10 = org.telegram.messenger.b6.f(this.f41885a);
                org.telegram.messenger.qv qvVar2 = this.f41887c;
                qvVar2.f25349a = f10.f25349a;
                qvVar2.f25350b = f10.f25350b;
                qvVar2.f25351c = f10.f25351c;
                qvVar2.d = this.f41886b;
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
