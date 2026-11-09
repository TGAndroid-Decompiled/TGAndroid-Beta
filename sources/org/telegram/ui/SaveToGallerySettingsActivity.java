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
    public int f41894a;
    public int addExceptionRow;
    public long f41895b;
    public org.telegram.messenger.qv f41896c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f41897e;
    public int f41898f;
    public int h;
    public int maxVideoSizeRow;
    public cz0 f41899n;
    public org.telegram.ui.Components.qj0 f41900r;
    public final ArrayList f41901s;
    public LongSparseArray f41902w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f41901s = new ArrayList();
        this.f41902w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.r8 r8Var, int i7) {
        for (int i10 = 0; i10 < r8Var.getChildCount(); i10++) {
            View childAt = r8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.dh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
                org.telegram.ui.ActionBar.g6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.s6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.rv c0() {
        org.telegram.messenger.qv qvVar = this.f41896c;
        if (qvVar != null) {
            return qvVar;
        }
        return org.telegram.messenger.b6.f(this.f41894a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 8));
        if (this.f41896c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747895, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745927, null));
            }
        } else {
            int i10 = this.f41894a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745919, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745926, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745928, null));
            }
        }
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f41900r = qj0Var;
        qj0Var.r1();
        this.f41900r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57083m = false;
        this.f41900r.setItemAnimator(kVar);
        this.f41900r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.f41900r;
        cz0 cz0Var = new cz0(this);
        this.f41899n = cz0Var;
        qj0Var2.setAdapter(cz0Var);
        this.f41900r.setOnItemClickListener(new bz0(this));
        this.f41900r.setOnItemLongClickListener(new bz0(this));
        frameLayout.addView(this.f41900r);
        if (this.f41896c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
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
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
            frameLayout2.addView(textView, c8.ha.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new py0(this, 2));
            frameLayout.addView(frameLayout2, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f41896c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f41894a);
            org.telegram.messenger.qv qvVar = this.f41896c;
            m10.put(qvVar.d, qvVar);
            getUserConfig().A(this.f41894a, m10);
            return;
        }
        org.telegram.messenger.b6.m(this.f41894a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z9 = this.isPaused;
        ArrayList arrayList2 = this.f41901s;
        if (!z9 && this.f41899n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f41896c != null) {
            arrayList2.add(new dz0(9));
            arrayList2.add(new dz0(3));
        }
        arrayList2.add(new dz0(5, org.telegram.messenger.id.M0(2131745929, null)));
        this.f41897e = arrayList2.size();
        arrayList2.add(new dz0(6));
        this.f41898f = arrayList2.size();
        arrayList2.add(new dz0(6));
        if (this.f41896c != null) {
            str = org.telegram.messenger.id.M0(2131745924, null);
        } else {
            int i7 = this.f41894a;
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
        arrayList2.add(new dz0(7, str));
        if (c0().f25346b) {
            arrayList2.add(new dz0(5, org.telegram.messenger.id.M0(2131748668, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new dz0(8));
            this.h = arrayList2.size();
            arrayList2.add(new dz0(7));
        } else {
            this.h = -1;
        }
        if (this.f41896c == null) {
            this.f41902w = getUserConfig().m(this.f41894a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new dz0(1));
            int i10 = 0;
            boolean z10 = false;
            while (i10 < this.f41902w.size()) {
                arrayList2.add(new dz0((org.telegram.messenger.qv) this.f41902w.valueAt(i10)));
                i10++;
                z10 = true;
            }
            if (z10) {
                arrayList2.add(new dz0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new dz0(4));
            }
            arrayList2.add(new dz0(10));
        }
        cz0 cz0Var = this.f41899n;
        if (cz0Var != null) {
            if (arrayList != null) {
                cz0Var.E(arrayList, arrayList2);
            } else {
                cz0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41900r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41894a = getArguments().getInt("type");
        this.f41902w = getUserConfig().m(this.f41894a);
        long j3 = getArguments().getLong("dialog_id");
        this.f41895b = j3;
        if (j3 != 0) {
            org.telegram.messenger.qv qvVar = (org.telegram.messenger.qv) org.telegram.messenger.p10.i(this.currentAccount).m(this.f41894a).get(this.f41895b);
            this.f41896c = qvVar;
            if (qvVar == null) {
                this.d = true;
                this.f41896c = new org.telegram.messenger.rv();
                org.telegram.messenger.sv f10 = org.telegram.messenger.b6.f(this.f41894a);
                org.telegram.messenger.qv qvVar2 = this.f41896c;
                qvVar2.f25345a = f10.f25345a;
                qvVar2.f25346b = f10.f25346b;
                qvVar2.f25347c = f10.f25347c;
                qvVar2.d = this.f41895b;
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
