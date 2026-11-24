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
    public qp9 c;
    public boolean d;
    public int deleteAllExceptionsRow;
    public int e;
    public int f;
    public int h;
    public int maxVideoSizeRow;
    public np9 n;
    public o39 r;
    public final ArrayList s;
    public LongSparseArray w;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.s = new ArrayList();
        this.w = new LongSparseArray();
    }

    public static int Y(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        return saveToGallerySettingsActivity.currentAccount;
    }

    public static int Z(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        return saveToGallerySettingsActivity.currentAccount;
    }

    public final void a0(ahb ahbVar, int i) {
        for (int i2 = 0; i2 < ahbVar.getChildCount(); i2++) {
            View childAt = ahbVar.getChildAt(i2);
            if ((childAt instanceof ry8) && childAt.getBackground() != null) {
                Drawable background = childAt.getBackground();
                vkb M = zkb.M(i);
                wjb resourceProvider = getResourceProvider();
                childAt.setBackground(background);
                zkb.j(childAt, background, M, null, resourceProvider);
                return;
            }
        }
    }

    public final rp9 b0() {
        qp9 qp9Var = this.c;
        if (qp9Var != null) {
            return qp9Var;
        }
        return mte.a(this.a);
    }

    public final void c0() {
        if (this.d) {
            return;
        }
        if (this.c != null) {
            LongSparseArray l = getUserConfig().l(this.a);
            qp9 qp9Var = this.c;
            l.put(qp9Var.d, qp9Var);
            getUserConfig().z(this.a, l);
            return;
        }
        mte.f(this.a);
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 10));
        if (this.c != null) {
            boolean z = this.d;
            pha phaVar = this.simpleActionBar;
            if (z) {
                phaVar.setTitle(k96.M0(2131747702, null));
            } else {
                phaVar.setTitle(k96.M0(2131745735, null));
            }
        } else {
            int i2 = this.a;
            pha phaVar2 = this.simpleActionBar;
            if (i2 == 1) {
                phaVar2.setTitle(k96.M0(2131745727, null));
            } else if (i2 == 2) {
                phaVar2.setTitle(k96.M0(2131745734, null));
            } else {
                phaVar2.setTitle(k96.M0(2131745736, null));
            }
        }
        o39 o39Var = new o39(context, null);
        this.r = o39Var;
        o39Var.r1();
        this.r.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.n(400L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.r.setItemAnimator(gb3Var);
        this.r.setLayoutManager(new t26());
        o39 o39Var2 = this.r;
        np9 np9Var = new np9(this);
        this.n = np9Var;
        o39Var2.setAdapter(np9Var);
        this.r.setOnItemClickListener(new mp9(this));
        this.r.setOnItemLongClickListener(new mp9(this));
        frameLayout.addView(this.r);
        if (this.c != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(sjb.f(bkb.Ei, 8.0f));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            if (this.d) {
                i = 2131754429;
            } else {
                i = 2131745751;
            }
            textView.setText(k96.M0(i, null));
            textView.setGravity(17);
            textView.setTypeface(gl.o());
            zkb.X(textView, bkb.Ii, null);
            frameLayout2.addView(textView, nme.e(-2, -2, 17));
            frameLayout2.setOnClickListener(new ik8(this, (byte) 11));
            frameLayout.addView(frameLayout2, nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
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
            arrayList2.add(new op9(9));
            arrayList2.add(new op9(3));
        }
        arrayList2.add(new op9(5, k96.M0(2131745737, null)));
        this.e = arrayList2.size();
        arrayList2.add(new op9(6));
        this.f = arrayList2.size();
        arrayList2.add(new op9(6));
        if (this.c != null) {
            str = k96.M0(2131745732, null);
        } else {
            int i = this.a;
            if (i == 1) {
                str = k96.M0(2131745730, null);
            } else if (i == 4) {
                str = k96.M0(2131745733, null);
            } else if (i == 2) {
                str = k96.M0(2131745731, null);
            } else {
                str = null;
            }
        }
        arrayList2.add(new op9(7, str));
        if (b0().b) {
            arrayList2.add(new op9(5, k96.M0(2131748476, null)));
            this.maxVideoSizeRow = arrayList2.size();
            arrayList2.add(new op9(8));
            this.h = arrayList2.size();
            arrayList2.add(new op9(7));
        } else {
            this.h = -1;
        }
        if (this.c == null) {
            this.w = getUserConfig().l(this.a);
            this.addExceptionRow = arrayList2.size();
            arrayList2.add(new op9(1));
            int i2 = 0;
            boolean z2 = false;
            while (i2 < this.w.size()) {
                arrayList2.add(new op9((qp9) this.w.valueAt(i2)));
                i2++;
                z2 = true;
            }
            if (z2) {
                arrayList2.add(new op9(3));
                this.deleteAllExceptionsRow = arrayList2.size();
                arrayList2.add(new op9(4));
            }
            arrayList2.add(new op9(10));
        }
        np9 np9Var = this.n;
        if (np9Var != null) {
            if (arrayList != null) {
                np9Var.E(arrayList, arrayList2);
            } else {
                np9Var.f();
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
            qp9 qp9Var = (qp9) y6c.h(this.currentAccount).l(this.a).get(this.b);
            this.c = qp9Var;
            if (qp9Var == null) {
                this.d = true;
                this.c = new rp9();
                sp9 a = mte.a(this.a);
                qp9 qp9Var2 = this.c;
                qp9Var2.a = a.a;
                qp9Var2.b = a.b;
                qp9Var2.c = a.c;
                qp9Var2.d = this.b;
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
