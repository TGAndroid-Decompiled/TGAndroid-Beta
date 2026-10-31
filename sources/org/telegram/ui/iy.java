package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class iy extends org.telegram.ui.ActionBar.k2 {
    public y0 D;
    public fy f38364a;
    public org.telegram.ui.Components.tk0 f38365b;
    public s4.x f38366c;
    public ImageView d;
    public final ArrayList e;
    public hy f38367f;
    public int h;
    public int f38368n;
    public int f38369r;
    public int f38370s;
    public int f38371w;
    public final int f38372x;
    public final int f38373y;

    public iy(int i10, int i11) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f38372x = i10;
        this.f38373y = i11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().V3(arrayList2, true);
        getMessagesController().P3(arrayList3, true);
        d0();
    }

    public static void Y(org.telegram.ui.iy r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iy.Y(org.telegram.ui.iy, android.content.Context, int):void");
    }

    public static int Z(iy iyVar) {
        return iyVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    public final void c0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.i0.h3(new rh(this, 27), 1000L);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f38372x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131742903, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131742893, null));
        }
        this.actionBar.p().e(1, org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 19));
        this.f38364a = new fy(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f38365b = tk0Var;
        tk0Var.setLayoutManager(new s4.a0(1, false));
        this.f38365b.setVerticalScrollBarEnabled(false);
        this.f38365b.setAdapter(this.f38364a);
        ((s4.j) this.f38365b.getItemAnimator()).C = false;
        frameLayout.addView(this.f38365b, w7.b6.c(-1.0f, -1));
        s4.x xVar = new s4.x(new gy(this));
        this.f38366c = xVar;
        xVar.h(this.f38365b);
        this.f38365b.setOnItemClickListener(new mg.q0(16, this, context));
        this.f38365b.setOnItemLongClickListener(new m5.e(this));
        return this.fragmentView;
    }

    public final void d0() {
        this.f38371w = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f38368n = -1;
            this.f38369r = -1;
        } else {
            int i10 = this.f38371w;
            this.f38368n = i10;
            int size = arrayList.size() + i10;
            this.f38371w = size;
            this.f38369r = size;
        }
        int i11 = this.f38371w;
        this.f38371w = i11 + 1;
        this.f38370s = i11;
        fy fyVar = this.f38364a;
        if (fyVar != null) {
            fyVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        int i10 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38365b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38365b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.D == null) {
            if (z10) {
                c0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        ay.t4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
