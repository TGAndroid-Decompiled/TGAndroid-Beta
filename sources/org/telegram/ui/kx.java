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
public final class kx extends org.telegram.ui.ActionBar.g2 {
    public gx E;
    public hx f49397a;
    public org.telegram.ui.Components.ek0 f49398b;
    public v4.z f49399c;
    public ImageView d;
    public final ArrayList f49400e;
    public jx f49401f;
    public int h;
    public int f49402n;
    public int f49403r;
    public int f49404s;
    public int f49405w;
    public final int f49406x;
    public final int f49407y;

    public kx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f49400e = arrayList;
        this.f49406x = i7;
        this.f49407y = i10;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f49406x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131742611, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131742602, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.hd.N0(2131751342, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 1));
        this.f49397a = new hx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49398b = ek0Var;
        ek0Var.setLayoutManager(new v4.c0(1, false));
        this.f49398b.setVerticalScrollBarEnabled(false);
        this.f49398b.setAdapter(this.f49397a);
        ((v4.k) this.f49398b.getItemAnimator()).C = false;
        frameLayout.addView(this.f49398b, c8.ma.c(-1.0f, -1));
        v4.z zVar = new v4.z(new ix(this));
        this.f49399c = zVar;
        zVar.h(this.f49398b);
        this.f49398b.setOnItemClickListener(new fi.g4(17, this, context));
        this.f49398b.setOnItemLongClickListener(new ji.l(this));
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
        this.f49405w = 2;
        this.h = 1;
        ArrayList arrayList = this.f49400e;
        if (arrayList.isEmpty()) {
            this.f49402n = -1;
            this.f49403r = -1;
        } else {
            int i7 = this.f49405w;
            this.f49402n = i7;
            int size = arrayList.size() + i7;
            this.f49405w = size;
            this.f49403r = size;
        }
        int i10 = this.f49405w;
        this.f49405w = i10 + 1;
        this.f49404s = i10;
        hx hxVar = this.f49397a;
        if (hxVar != null) {
            hxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        int i7 = org.telegram.ui.ActionBar.m6.f29621q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49398b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49398b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
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
