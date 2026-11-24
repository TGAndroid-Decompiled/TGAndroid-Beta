package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public class SaveToGallerySettingsActivity extends org.telegram.ui.ActionBar.d {
    public int a;
    public int addExceptionRow;
    public long b;
    public rr9 c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public or9 n;
    public r59 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static int Z(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        return saveToGallerySettingsActivity.currentAccount;
    }

    public static int a0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        return saveToGallerySettingsActivity.currentAccount;
    }

    public final void b0(bjb bjbVar, int i) {
        for (int i2 = 0; i2 < bjbVar.getChildCount(); i2++) {
            View childAt = bjbVar.getChildAt(i2);
            if ((childAt instanceof s09) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                wmb M = anb.M(i);
                ylb resourceProvider = getResourceProvider();
                childAt.setBackground(background);
                anb.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final sr9 c0() {
        rr9 rr9Var = this.c;
        if (rr9Var != null) {
            return rr9Var;
        }
        return pve.a(this.a);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 11));
        if (this.c != null) {
            boolean z = this.d;
            rja rjaVar = this.simpleActionBar;
            if (z) {
                rjaVar.setTitle(jb6.M0(2131747628, null));
            } else {
                rjaVar.setTitle(jb6.M0(2131745661, null));
            }
        } else {
            int i2 = this.a;
            rja rjaVar2 = this.simpleActionBar;
            if (i2 == 1) {
                rjaVar2.setTitle(jb6.M0(2131745653, null));
            } else if (i2 == 2) {
                rjaVar2.setTitle(jb6.M0(2131745660, null));
            } else {
                rjaVar2.setTitle(jb6.M0(2131745662, null));
            }
        }
        r59 r59Var = new r59(context, null);
        this.r = r59Var;
        r59Var.r1();
        this.r.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.n(400L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.r.setItemAnimator(sc3Var);
        this.r.setLayoutManager(new u46());
        r59 r59Var2 = this.r;
        or9 or9Var = new or9(this);
        this.n = or9Var;
        r59Var2.setAdapter(or9Var);
        this.r.setOnItemClickListener(new nr9(this));
        this.r.setOnItemLongClickListener(new nr9(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(ulb.f(cmb.Ei, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i = 2131754429;
            } else {
                i = 2131745677;
            }
            textView.setText(jb6.M0(i, null));
            textView.setGravity(17);
            textView.setTypeface(gm.o());
            anb.X(textView, cmb.Ii, null);
            frameLayout2.addView(textView, qoe.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new wk8(this, (byte) 14));
            frameLayout.addView(frameLayout2, qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.d) {
            return;
        }
        if (this.c != null) {
            LongSparseArray l = getUserConfig().l(this.a);
            rr9 rr9Var = this.c;
            l.put(rr9Var.d, rr9Var);
            getUserConfig().z(this.a, l);
            return;
        }
        pve.f(this.a);
    }

    public final void e0() {
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
            arrayList2.add(new pr9(9));
            arrayList2.add(new pr9(3));
        }
        arrayList2.add(new pr9(5, jb6.M0(2131745663, null)));
        this.e = arrayList2.size();
        arrayList2.add(new pr9(6));
        this.f = arrayList2.size();
        arrayList2.add(new pr9(6));
        if (this.c != null) {
            str = jb6.M0(2131745658, null);
        } else {
            int i = this.a;
            if (i == 1) {
                str = jb6.M0(2131745656, null);
            } else if (i == 4) {
                str = jb6.M0(2131745659, null);
            } else if (i == 2) {
                str = jb6.M0(2131745657, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new pr9(7, str));
        if (c0().b) {
            arrayList2.add(new pr9(5, jb6.M0(2131748425, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new pr9(8));
            this.h = arrayList2.size();
            arrayList2.add(new pr9(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().l(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new pr9(1));
            int i2 = 0;
            boolean z2 = false;
            while (i2 < this.w.size()) {
                arrayList2.add(new pr9((rr9) this.w.valueAt(i2)));
                i2++;
                z2 = true;
            }
            if (z2) {
                arrayList2.add(new pr9(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new pr9(4));
            }
            arrayList2.add(new pr9(10));
        }
        or9 or9Var = this.n;
        if (or9Var != null) {
            if (arrayList != null) {
                or9Var.E(arrayList, arrayList2);
            } else {
                or9Var.f();
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
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
            rr9 rr9Var = (rr9) z8c.h(this.currentAccount).l(this.a).get(this.b);
            this.c = rr9Var;
            if (rr9Var == null) {
                this.d = true;
                this.c = new sr9();
                tr9 a = pve.a(this.a);
                rr9 rr9Var2 = this.c;
                rr9Var2.a = a.a;
                rr9Var2.b = a.b;
                rr9Var2.c = a.c;
                rr9Var2.d = this.b;
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
