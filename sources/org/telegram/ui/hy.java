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
public final class hy extends org.telegram.ui.ActionBar.k2 {
    public y0 D;
    public ey f37882a;
    public org.telegram.ui.Components.uk0 f37883b;
    public s4.x f37884c;
    public ImageView d;
    public final ArrayList e;
    public gy f37885f;
    public int h;
    public int f37886n;
    public int f37887r;
    public int f37888s;
    public int f37889w;
    public final int f37890x;
    public final int f37891y;

    public hy(int i10, int i11) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f37890x = i10;
        this.f37891y = i11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i11, i10, arrayList, arrayList2, arrayList3, true);
        getMessagesController().V3(arrayList2, true);
        getMessagesController().P3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.hy r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hy.Z(org.telegram.ui.hy, android.content.Context, int):void");
    }

    public static int a0(hy hyVar) {
        return hyVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f37890x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131742903, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131742893, null));
        }
        this.actionBar.p().e(1, org.telegram.messenger.dd.L0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ar(this, 19));
        this.f37882a = new ey(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f37883b = uk0Var;
        uk0Var.setLayoutManager(new s4.a0(1, false));
        this.f37883b.setVerticalScrollBarEnabled(false);
        this.f37883b.setAdapter(this.f37882a);
        ((s4.j) this.f37883b.getItemAnimator()).C = false;
        frameLayout.addView(this.f37883b, w7.b6.c(-1.0f, -1));
        s4.x xVar = new s4.x(new fy(this));
        this.f37884c = xVar;
        xVar.h(this.f37883b);
        this.f37883b.setOnItemClickListener(new mg.q0(16, this, context));
        this.f37883b.setOnItemLongClickListener(new m5.e(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.i0.h3(new rh(this, 27), 1000L);
    }

    public final void e0() {
        this.f37889w = 2;
        this.h = 1;
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            this.f37886n = -1;
            this.f37887r = -1;
        } else {
            int i10 = this.f37889w;
            this.f37886n = i10;
            int size = arrayList.size() + i10;
            this.f37889w = size;
            this.f37887r = size;
        }
        int i11 = this.f37889w;
        this.f37889w = i11 + 1;
        this.f37888s = i11;
        ey eyVar = this.f37882a;
        if (eyVar != null) {
            eyVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        int i10 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37883b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37883b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
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
                d0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        zx.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
