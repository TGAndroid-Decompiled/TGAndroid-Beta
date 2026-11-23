package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.g2 {
    public int f43830a;
    public int addExceptionRow;
    public long f43831b;
    public org.telegram.messenger.kv f43832c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f43833e;
    public int f43834f;
    public int h;
    public int maxVideoSizeRow;
    public az0 f43835n;
    public org.telegram.ui.Components.ek0 f43836r;
    public final ArrayList f43837s;
    public LongSparseArray f43838w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f43837s = new ArrayList();
        this.f43838w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.r8 r8Var, int i7) {
        for (int i10 = 0; i10 < r8Var.getChildCount(); i10++) {
            View childAt = r8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.qh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
                org.telegram.ui.ActionBar.i6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.u6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.lv c0() {
        org.telegram.messenger.kv kvVar = this.f43832c;
        if (kvVar != null) {
            return kvVar;
        }
        return org.telegram.messenger.c6.f(this.f43830a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 11));
        if (this.f43832c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747701, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745731, null));
            }
        } else {
            int i10 = this.f43830a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745723, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745730, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745732, null));
            }
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43836r = ek0Var;
        ek0Var.r1();
        this.f43836r.setSectionsDrawBackground(true);
        v4.l lVar = new v4.l();
        lVar.n(400L);
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f43836r.setItemAnimator(lVar);
        this.f43836r.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f43836r;
        az0 az0Var = new az0(this);
        this.f43835n = az0Var;
        ek0Var2.setAdapter(az0Var);
        this.f43836r.setOnItemClickListener(new zy0(this));
        this.f43836r.setOnItemLongClickListener(new zy0(this));
        frameLayout.addView(this.f43836r);
        if (this.f43832c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754429;
            } else {
                i7 = 2131745747;
            }
            textView.setText(org.telegram.messenger.gd.N0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
            frameLayout2.addView(textView, c8.na.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new ny0(this, 2));
            frameLayout.addView(frameLayout2, c8.na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f43832c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f43830a);
            org.telegram.messenger.kv kvVar = this.f43832c;
            m10.put(kvVar.d, kvVar);
            getUserConfig().A(this.f43830a, m10);
            return;
        }
        org.telegram.messenger.c6.o(this.f43830a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f43837s;
        if (!z10 && this.f43835n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f43832c != null) {
            arrayList2.add(new bz0(9));
            arrayList2.add(new bz0(3));
        }
        arrayList2.add(new bz0(5, org.telegram.messenger.gd.N0(2131745733, null)));
        this.f43833e = arrayList2.size();
        arrayList2.add(new bz0(6));
        this.f43834f = arrayList2.size();
        arrayList2.add(new bz0(6));
        if (this.f43832c != null) {
            str = org.telegram.messenger.gd.N0(2131745728, null);
        } else {
            int i7 = this.f43830a;
            if (i7 == 1) {
                str = org.telegram.messenger.gd.N0(2131745726, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.gd.N0(2131745729, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.gd.N0(2131745727, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new bz0(7, str));
        if (c0().f25560b) {
            arrayList2.add(new bz0(5, org.telegram.messenger.gd.N0(2131748475, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new bz0(8));
            this.h = arrayList2.size();
            arrayList2.add(new bz0(7));
        } else {
            this.h = -1;
        }
        if (this.f43832c == null) {
            this.f43838w = getUserConfig().m(this.f43830a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new bz0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.f43838w.size()) {
                arrayList2.add(new bz0((org.telegram.messenger.kv) this.f43838w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new bz0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new bz0(4));
            }
            arrayList2.add(new bz0(10));
        }
        az0 az0Var = this.f43835n;
        if (az0Var != null) {
            if (arrayList != null) {
                az0Var.E(arrayList, arrayList2);
            } else {
                az0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43836r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43830a = getArguments().getInt("type");
        this.f43838w = getUserConfig().m(this.f43830a);
        long j3 = getArguments().getLong("dialog_id");
        this.f43831b = j3;
        if (j3 != 0) {
            org.telegram.messenger.kv kvVar = (org.telegram.messenger.kv) org.telegram.messenger.i10.i(this.currentAccount).m(this.f43830a).get(this.f43831b);
            this.f43832c = kvVar;
            if (kvVar == null) {
                this.d = true;
                this.f43832c = new org.telegram.messenger.lv();
                org.telegram.messenger.mv f10 = org.telegram.messenger.c6.f(this.f43830a);
                org.telegram.messenger.kv kvVar2 = this.f43832c;
                kvVar2.f25559a = f10.f25559a;
                kvVar2.f25560b = f10.f25560b;
                kvVar2.f25561c = f10.f25561c;
                kvVar2.d = this.f43831b;
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
