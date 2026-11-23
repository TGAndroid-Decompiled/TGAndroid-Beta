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
    public int f43714a;
    public int addExceptionRow;
    public long f43715b;
    public org.telegram.messenger.lv f43716c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f43717e;
    public int f43718f;
    public int h;
    public int maxVideoSizeRow;
    public bz0 f43719n;
    public org.telegram.ui.Components.ek0 f43720r;
    public final ArrayList f43721s;
    public LongSparseArray f43722w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f43721s = new ArrayList();
        this.f43722w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.s8 s8Var, int i7) {
        for (int i10 = 0; i10 < s8Var.getChildCount(); i10++) {
            View childAt = s8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.rh0) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
                org.telegram.ui.ActionBar.h6 resourceProvider = saveToGallerySettingsActivity.getResourceProvider();
                childAt.setBackground(background);
                org.telegram.ui.ActionBar.t6.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final org.telegram.messenger.mv c0() {
        org.telegram.messenger.lv lvVar = this.f43716c;
        if (lvVar != null) {
            return lvVar;
        }
        return org.telegram.messenger.c6.f(this.f43714a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 11));
        if (this.f43716c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131747701, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745731, null));
            }
        } else {
            int i10 = this.f43714a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745723, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745730, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131745732, null));
            }
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43720r = ek0Var;
        ek0Var.r1();
        this.f43720r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.nr.h);
        kVar.C = false;
        kVar.f59139m = false;
        this.f43720r.setItemAnimator(kVar);
        this.f43720r.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f43720r;
        bz0 bz0Var = new bz0(this);
        this.f43719n = bz0Var;
        ek0Var2.setAdapter(bz0Var);
        this.f43720r.setOnItemClickListener(new az0(this));
        this.f43720r.setOnItemLongClickListener(new az0(this));
        frameLayout.addView(this.f43720r);
        if (this.f43716c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754429;
            } else {
                i7 = 2131745747;
            }
            textView.setText(org.telegram.messenger.hd.N0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
            frameLayout2.addView(textView, c8.na.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new oy0(this, 2));
            frameLayout.addView(frameLayout2, c8.na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f43716c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f43714a);
            org.telegram.messenger.lv lvVar = this.f43716c;
            m10.put(lvVar.d, lvVar);
            getUserConfig().A(this.f43714a, m10);
            return;
        }
        org.telegram.messenger.c6.o(this.f43714a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f43721s;
        if (!z10 && this.f43719n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f43716c != null) {
            arrayList2.add(new cz0(9));
            arrayList2.add(new cz0(3));
        }
        arrayList2.add(new cz0(5, org.telegram.messenger.hd.N0(2131745733, null)));
        this.f43717e = arrayList2.size();
        arrayList2.add(new cz0(6));
        this.f43718f = arrayList2.size();
        arrayList2.add(new cz0(6));
        if (this.f43716c != null) {
            str = org.telegram.messenger.hd.N0(2131745728, null);
        } else {
            int i7 = this.f43714a;
            if (i7 == 1) {
                str = org.telegram.messenger.hd.N0(2131745726, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.hd.N0(2131745729, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.hd.N0(2131745727, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new cz0(7, str));
        if (c0().f25611b) {
            arrayList2.add(new cz0(5, org.telegram.messenger.hd.N0(2131748475, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new cz0(8));
            this.h = arrayList2.size();
            arrayList2.add(new cz0(7));
        } else {
            this.h = -1;
        }
        if (this.f43716c == null) {
            this.f43722w = getUserConfig().m(this.f43714a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new cz0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.f43722w.size()) {
                arrayList2.add(new cz0((org.telegram.messenger.lv) this.f43722w.valueAt(i10)));
                i10++;
                z11 = true;
            }
            if (z11) {
                arrayList2.add(new cz0(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new cz0(4));
            }
            arrayList2.add(new cz0(10));
        }
        bz0 bz0Var = this.f43719n;
        if (bz0Var != null) {
            if (arrayList != null) {
                bz0Var.E(arrayList, arrayList2);
            } else {
                bz0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43720r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43714a = getArguments().getInt("type");
        this.f43722w = getUserConfig().m(this.f43714a);
        long j3 = getArguments().getLong("dialog_id");
        this.f43715b = j3;
        if (j3 != 0) {
            org.telegram.messenger.lv lvVar = (org.telegram.messenger.lv) org.telegram.messenger.k10.i(this.currentAccount).m(this.f43714a).get(this.f43715b);
            this.f43716c = lvVar;
            if (lvVar == null) {
                this.d = true;
                this.f43716c = new org.telegram.messenger.mv();
                org.telegram.messenger.nv f10 = org.telegram.messenger.c6.f(this.f43714a);
                org.telegram.messenger.lv lvVar2 = this.f43716c;
                lvVar2.f25610a = f10.f25610a;
                lvVar2.f25611b = f10.f25611b;
                lvVar2.f25612c = f10.f25612c;
                lvVar2.d = this.f43715b;
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
