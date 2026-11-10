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
public final class hx extends org.telegram.ui.ActionBar.f2 {
    public dx D;
    public ex f46436a;
    public org.telegram.ui.Components.pj0 f46437b;
    public v4.y f46438c;
    public ImageView d;
    public final ArrayList f46439e;
    public gx f46440f;
    public int h;
    public int f46441n;
    public int f46442r;
    public int f46443s;
    public int f46444w;
    public final int f46445x;
    public final int f46446y;

    public hx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f46439e = arrayList;
        this.f46445x = i7;
        this.f46446y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().Y3(arrayList2, true);
        getMessagesController().S3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.hx r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.Z(org.telegram.ui.hx, android.content.Context, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f46445x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742877, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742868, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.id.M0(2131751354, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 28));
        this.f46436a = new ex(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f46437b = pj0Var;
        pj0Var.setLayoutManager(new v4.b0(1, false));
        this.f46437b.setVerticalScrollBarEnabled(false);
        this.f46437b.setAdapter(this.f46436a);
        ((v4.k) this.f46437b.getItemAnimator()).C = false;
        frameLayout.addView(this.f46437b, c8.ha.c(-1.0f, -1));
        v4.y yVar = new v4.y(new fx(this));
        this.f46438c = yVar;
        yVar.h(this.f46437b);
        this.f46437b.setOnItemClickListener(new di.q4(17, this, context));
        this.f46437b.setOnItemLongClickListener(new j2.n(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new dh(this, 26), 1000L);
    }

    public final void e0() {
        this.f46444w = 2;
        this.h = 1;
        ArrayList arrayList = this.f46439e;
        if (arrayList.isEmpty()) {
            this.f46441n = -1;
            this.f46442r = -1;
        } else {
            int i7 = this.f46444w;
            this.f46441n = i7;
            int size = arrayList.size() + i7;
            this.f46444w = size;
            this.f46442r = size;
        }
        int i10 = this.f46444w;
        this.f46444w = i10 + 1;
        this.f46443s = i10;
        ex exVar = this.f46436a;
        if (exVar != null) {
            exVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        int i7 = org.telegram.ui.ActionBar.m6.f28130q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f46437b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f46437b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.D == null) {
            if (z9) {
                d0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        zw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
