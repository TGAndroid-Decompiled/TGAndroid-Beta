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
public final class kx extends org.telegram.ui.ActionBar.h2 {
    public gx E;
    public hx f49352a;
    public org.telegram.ui.Components.ck0 f49353b;
    public v4.z f49354c;
    public ImageView d;
    public final ArrayList f49355e;
    public jx f49356f;
    public int h;
    public int f49357n;
    public int f49358r;
    public int f49359s;
    public int f49360w;
    public final int f49361x;
    public final int f49362y;

    public kx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f49355e = arrayList;
        this.f49361x = i7;
        this.f49362y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().f4(arrayList2, true);
        getMessagesController().Z3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.kx r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kx.Z(org.telegram.ui.kx, android.content.Context, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f49361x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131742619, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131742610, null));
        }
        this.actionBar.t().e(1, org.telegram.messenger.gd.M0(2131751343, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 1));
        this.f49352a = new hx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f49353b = ck0Var;
        ck0Var.setLayoutManager(new v4.c0(1, false));
        this.f49353b.setVerticalScrollBarEnabled(false);
        this.f49353b.setAdapter(this.f49352a);
        ((v4.k) this.f49353b.getItemAnimator()).C = false;
        frameLayout.addView(this.f49353b, c8.ma.c(-1.0f, -1));
        v4.z zVar = new v4.z(new ix(this));
        this.f49354c = zVar;
        zVar.h(this.f49353b);
        this.f49353b.setOnItemClickListener(new fi.g4(17, this, context));
        this.f49353b.setOnItemLongClickListener(new ji.j(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.h3(new bh(this, 26), 1000L);
    }

    public final void e0() {
        this.f49360w = 2;
        this.h = 1;
        ArrayList arrayList = this.f49355e;
        if (arrayList.isEmpty()) {
            this.f49357n = -1;
            this.f49358r = -1;
        } else {
            int i7 = this.f49360w;
            this.f49357n = i7;
            int size = arrayList.size() + i7;
            this.f49360w = size;
            this.f49358r = size;
        }
        int i10 = this.f49360w;
        this.f49360w = i10 + 1;
        this.f49359s = i10;
        hx hxVar = this.f49352a;
        if (hxVar != null) {
            hxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        int i7 = org.telegram.ui.ActionBar.n6.f29634q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49353b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49353b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.E == null) {
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
        cx.z4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().P0(true);
        return super.onFragmentCreate();
    }
}
