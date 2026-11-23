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
public final class jx extends org.telegram.ui.ActionBar.g2 {
    public fx E;
    public gx f49219a;
    public org.telegram.ui.Components.ek0 f49220b;
    public v4.z f49221c;
    public ImageView d;
    public final ArrayList f49222e;
    public ix f49223f;
    public int h;
    public int f49224n;
    public int f49225r;
    public int f49226s;
    public int f49227w;
    public final int f49228x;
    public final int f49229y;

    public jx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f49222e = arrayList;
        this.f49228x = i7;
        this.f49229y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().f4(arrayList2, true);
        getMessagesController().Z3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.jx r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jx.Z(org.telegram.ui.jx, android.content.Context, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f49228x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131742606, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131742597, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.gd.N0(2131751342, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 1));
        this.f49219a = new gx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49220b = ek0Var;
        ek0Var.setLayoutManager(new v4.c0(1, false));
        this.f49220b.setVerticalScrollBarEnabled(false);
        this.f49220b.setAdapter(this.f49219a);
        ((v4.l) this.f49220b.getItemAnimator()).C = false;
        frameLayout.addView(this.f49220b, c8.na.c(-1.0f, -1));
        v4.z zVar = new v4.z(new hx(this));
        this.f49221c = zVar;
        zVar.h(this.f49220b);
        this.f49220b.setOnItemClickListener(new fi.g4(17, this, context));
        this.f49220b.setOnItemLongClickListener(new j6.k(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.h3(new ch(this, 26), 1000L);
    }

    public final void e0() {
        this.f49227w = 2;
        this.h = 1;
        ArrayList arrayList = this.f49222e;
        if (arrayList.isEmpty()) {
            this.f49224n = -1;
            this.f49225r = -1;
        } else {
            int i7 = this.f49227w;
            this.f49224n = i7;
            int size = arrayList.size() + i7;
            this.f49227w = size;
            this.f49225r = size;
        }
        int i10 = this.f49227w;
        this.f49227w = i10 + 1;
        this.f49226s = i10;
        gx gxVar = this.f49219a;
        if (gxVar != null) {
            gxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        int i7 = org.telegram.ui.ActionBar.n6.f29691q6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49220b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f49220b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
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
        bx.z4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().P0(true);
        return super.onFragmentCreate();
    }
}
