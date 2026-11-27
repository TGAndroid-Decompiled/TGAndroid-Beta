package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.e {
    public int a;
    public int addExceptionRow;
    public long b;
    public it9 c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public ft9 n;
    public d79 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public final void a0(wkb wkbVar, int i) {
        for (int i2 = 0; i2 < wkbVar.getChildCount(); i2++) {
            View childAt = wkbVar.getChildAt(i2);
            if ((childAt instanceof e29) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                uob M = yob.M(i);
                vnb resourceProvider = getResourceProvider();
                childAt.setBackground(background);
                yob.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final jt9 b0() {
        it9 it9Var = this.c;
        if (it9Var != null) {
            return it9Var;
        }
        return eye.a(this.a);
    }

    public final void c0() {
        if (this.d) {
            return;
        }
        if (this.c != null) {
            LongSparseArray l = getUserConfig().l(this.a);
            it9 it9Var = this.c;
            l.put(it9Var.d, it9Var);
            getUserConfig().z(this.a, l);
            return;
        }
        eye.f(this.a);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 12));
        if (this.c != null) {
            boolean z = this.d;
            jla jlaVar = this.simpleActionBar;
            if (z) {
                jlaVar.setTitle(ob6.M0(2131747622, null));
            } else {
                jlaVar.setTitle(ob6.M0(2131745655, null));
            }
        } else {
            int i2 = this.a;
            jla jlaVar2 = this.simpleActionBar;
            if (i2 == 1) {
                jlaVar2.setTitle(ob6.M0(2131745647, null));
            } else if (i2 == 2) {
                jlaVar2.setTitle(ob6.M0(2131745654, null));
            } else {
                jlaVar2.setTitle(ob6.M0(2131745656, null));
            }
        }
        d79 d79Var = new d79(context, null);
        this.r = d79Var;
        d79Var.s1();
        this.r.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.n(400L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.r.setItemAnimator(zb3Var);
        this.r.setLayoutManager(new x46());
        d79 d79Var2 = this.r;
        ft9 ft9Var = new ft9(this);
        this.n = ft9Var;
        d79Var2.setAdapter(ft9Var);
        this.r.setOnItemClickListener(new et9(this));
        this.r.setOnItemLongClickListener(new et9(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(rnb.f(aob.Fi, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i = 2131754425;
            } else {
                i = 2131745671;
            }
            textView.setText(ob6.M0(i, null));
            textView.setGravity(17);
            textView.setTypeface(hl.o());
            yob.X(textView, aob.Ji, null);
            frameLayout2.addView(textView, tre.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new jn8(this, (byte) 13));
            frameLayout.addView(frameLayout2, tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList;
        String str;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        boolean z = this.isPaused;
        ArrayList arrayList2 = this.s;
        if (!z && this.n != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.c != null) {
            arrayList2.add(new gt9(9));
            arrayList2.add(new gt9(3));
        }
        arrayList2.add(new gt9(5, ob6.M0(2131745657, null)));
        this.e = arrayList2.size();
        arrayList2.add(new gt9(6));
        this.f = arrayList2.size();
        arrayList2.add(new gt9(6));
        if (this.c != null) {
            str = ob6.M0(2131745652, null);
        } else {
            int i = this.a;
            if (i == 1) {
                str = ob6.M0(2131745650, null);
            } else if (i == 4) {
                str = ob6.M0(2131745653, null);
            } else if (i == 2) {
                str = ob6.M0(2131745651, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new gt9(7, str));
        if (b0().b) {
            arrayList2.add(new gt9(5, ob6.M0(2131748422, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new gt9(8));
            this.h = arrayList2.size();
            arrayList2.add(new gt9(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().l(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new gt9(1));
            int i2 = 0;
            boolean z2 = false;
            while (i2 < this.w.size()) {
                arrayList2.add(new gt9((it9) this.w.valueAt(i2)));
                i2++;
                z2 = true;
            }
            if (z2) {
                arrayList2.add(new gt9(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new gt9(4));
            }
            arrayList2.add(new gt9(10));
        }
        ft9 ft9Var = this.n;
        if (ft9Var != null) {
            if (arrayList != null) {
                ft9Var.E(arrayList, arrayList2);
            } else {
                ft9Var.f();
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt("type");
        this.w = getUserConfig().l(this.a);
        long j = getArguments().getLong("dialog_id");
        this.b = j;
        if (j != 0) {
            it9 it9Var = (it9) yac.h(this.currentAccount).l(this.a).get(this.b);
            this.c = it9Var;
            if (it9Var == null) {
                this.d = true;
                this.c = new jt9();
                kt9 a = eye.a(this.a);
                it9 it9Var2 = this.c;
                it9Var2.a = a.a;
                it9Var2.b = a.b;
                it9Var2.c = a.c;
                it9Var2.d = this.b;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        d0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
