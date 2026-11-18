package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.h2 {
    public int f43704a;
    public int addExceptionRow;
    public long f43705b;
    public org.telegram.messenger.kv f43706c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int f43707e;
    public int f43708f;
    public int h;
    public int maxVideoSizeRow;
    public bz0 f43709n;
    public org.telegram.ui.Components.ck0 f43710r;
    public final ArrayList f43711s;
    public LongSparseArray f43712w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.f43711s = new ArrayList();
        this.f43712w = new LongSparseArray();
    }

    public static void b0(SaveToGallerySettingsActivity saveToGallerySettingsActivity, org.telegram.ui.Cells.s8 s8Var, int i7) {
        for (int i10 = 0; i10 < s8Var.getChildCount(); i10++) {
            View childAt = s8Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Components.ph0) && childAt.getBackground() != null) {
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
        org.telegram.messenger.kv kvVar = this.f43706c;
        if (kvVar != null) {
            return kvVar;
        }
        return org.telegram.messenger.c6.f(this.f43704a);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 11));
        if (this.f43706c != null) {
            if (this.d) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747702, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745732, null));
            }
        } else {
            int i10 = this.f43704a;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745724, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745731, null));
            } else {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745733, null));
            }
        }
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43710r = ck0Var;
        ck0Var.r1();
        this.f43710r.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(400L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        this.f43710r.setItemAnimator(kVar);
        this.f43710r.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f43710r;
        bz0 bz0Var = new bz0(this);
        this.f43709n = bz0Var;
        ck0Var2.setAdapter(bz0Var);
        this.f43710r.setOnItemClickListener(new az0(this));
        this.f43710r.setOnItemLongClickListener(new az0(this));
        frameLayout.addView(this.f43710r);
        if (this.f43706c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i7 = 2131754430;
            } else {
                i7 = 2131745748;
            }
            textView.setText(org.telegram.messenger.gd.M0(i7, null));
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
            frameLayout2.addView(textView, c8.ma.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new oy0(this, 2));
            frameLayout.addView(frameLayout2, c8.ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.f43706c != null) {
            LongSparseArray m10 = getUserConfig().m(this.f43704a);
            org.telegram.messenger.kv kvVar = this.f43706c;
            m10.put(kvVar.d, kvVar);
            getUserConfig().A(this.f43704a, m10);
            return;
        }
        org.telegram.messenger.c6.o(this.f43704a);
    }

    public final void e0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f43711s;
        if (!z10 && this.f43709n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.f43706c != null) {
            arrayList2.add(new cz0(9));
            arrayList2.add(new cz0(3));
        }
        arrayList2.add(new cz0(5, org.telegram.messenger.gd.M0(2131745734, null)));
        this.f43707e = arrayList2.size();
        arrayList2.add(new cz0(6));
        this.f43708f = arrayList2.size();
        arrayList2.add(new cz0(6));
        if (this.f43706c != null) {
            str = org.telegram.messenger.gd.M0(2131745729, null);
        } else {
            int i7 = this.f43704a;
            if (i7 == 1) {
                str = org.telegram.messenger.gd.M0(2131745727, null);
            } else if (i7 == 4) {
                str = org.telegram.messenger.gd.M0(2131745730, null);
            } else if (i7 == 2) {
                str = org.telegram.messenger.gd.M0(2131745728, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new cz0(7, str));
        if (c0().f25441b) {
            arrayList2.add(new cz0(5, org.telegram.messenger.gd.M0(2131748476, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new cz0(8));
            this.h = arrayList2.size();
            arrayList2.add(new cz0(7));
        } else {
            this.h = -1;
        }
        if (this.f43706c == null) {
            this.f43712w = getUserConfig().m(this.f43704a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new cz0(1));
            int i10 = 0;
            boolean z11 = false;
            while (i10 < this.f43712w.size()) {
                arrayList2.add(new cz0((org.telegram.messenger.kv) this.f43712w.valueAt(i10)));
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
        bz0 bz0Var = this.f43709n;
        if (bz0Var != null) {
            if (arrayList != null) {
                bz0Var.E(arrayList, arrayList2);
            } else {
                bz0Var.f();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43710r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43704a = getArguments().getInt("type");
        this.f43712w = getUserConfig().m(this.f43704a);
        long j3 = getArguments().getLong("dialog_id");
        this.f43705b = j3;
        if (j3 != 0) {
            org.telegram.messenger.kv kvVar = (org.telegram.messenger.kv) org.telegram.messenger.j10.i(this.currentAccount).m(this.f43704a).get(this.f43705b);
            this.f43706c = kvVar;
            if (kvVar == null) {
                this.d = true;
                this.f43706c = new org.telegram.messenger.lv();
                org.telegram.messenger.mv f10 = org.telegram.messenger.c6.f(this.f43704a);
                org.telegram.messenger.kv kvVar2 = this.f43706c;
                kvVar2.f25440a = f10.f25440a;
                kvVar2.f25441b = f10.f25441b;
                kvVar2.f25442c = f10.f25442c;
                kvVar2.d = this.f43705b;
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
