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
    public hx f49393a;
    public org.telegram.ui.Components.ek0 f49394b;
    public v4.z f49395c;
    public ImageView d;
    public final ArrayList f49396e;
    public jx f49397f;
    public int h;
    public int f49398n;
    public int f49399r;
    public int f49400s;
    public int f49401w;
    public final int f49402x;
    public final int f49403y;

    public kx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f49396e = arrayList;
        this.f49402x = i7;
        this.f49403y = i10;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29342b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29715v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f49402x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131742613, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131742604, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.gd.N0(2131751342, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 1));
        this.f49393a = new hx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29321a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f49394b = ek0Var;
        ek0Var.setLayoutManager(new v4.c0(1, false));
        this.f49394b.setVerticalScrollBarEnabled(false);
        this.f49394b.setAdapter(this.f49393a);
        ((v4.k) this.f49394b.getItemAnimator()).C = false;
        frameLayout.addView(this.f49394b, c8.ma.c(-1.0f, -1));
        v4.z zVar = new v4.z(new ix(this));
        this.f49395c = zVar;
        zVar.h(this.f49394b);
        this.f49394b.setOnItemClickListener(new fi.g4(17, this, context));
        this.f49394b.setOnItemLongClickListener(new ji.l(this));
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
        this.f49401w = 2;
        this.h = 1;
        ArrayList arrayList = this.f49396e;
        if (arrayList.isEmpty()) {
            this.f49398n = -1;
            this.f49399r = -1;
        } else {
            int i7 = this.f49401w;
            this.f49398n = i7;
            int size = arrayList.size() + i7;
            this.f49401w = size;
            this.f49399r = size;
        }
        int i10 = this.f49401w;
        this.f49401w = i10 + 1;
        this.f49400s = i10;
        hx hxVar = this.f49393a;
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
        int i7 = org.telegram.ui.ActionBar.m6.f29618q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49394b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49394b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
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
