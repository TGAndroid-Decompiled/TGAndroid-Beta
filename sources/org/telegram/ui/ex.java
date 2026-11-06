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
public final class ex extends org.telegram.ui.ActionBar.f2 {
    public ax D;
    public bx f45422a;
    public org.telegram.ui.Components.pj0 f45423b;
    public v4.y f45424c;
    public ImageView d;
    public final ArrayList f45425e;
    public dx f45426f;
    public int h;
    public int f45427n;
    public int f45428r;
    public int f45429s;
    public int f45430w;
    public final int f45431x;
    public final int f45432y;

    public ex(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f45425e = arrayList;
        this.f45431x = i7;
        this.f45432y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().Y3(arrayList2, true);
        getMessagesController().S3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.ex r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ex.Z(org.telegram.ui.ex, android.content.Context, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f45431x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742878, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742869, null));
        }
        this.actionBar.q().e(1, org.telegram.messenger.hd.M0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 28));
        this.f45422a = new bx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27793a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45423b = pj0Var;
        pj0Var.setLayoutManager(new v4.b0(1, false));
        this.f45423b.setVerticalScrollBarEnabled(false);
        this.f45423b.setAdapter(this.f45422a);
        ((v4.k) this.f45423b.getItemAnimator()).C = false;
        frameLayout.addView(this.f45423b, c8.ha.c(-1.0f, -1));
        v4.y yVar = new v4.y(new cx(this));
        this.f45424c = yVar;
        yVar.h(this.f45423b);
        this.f45423b.setOnItemClickListener(new di.p4(17, this, context));
        this.f45423b.setOnItemLongClickListener(new j2.n(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new bh(this, 26), 1000L);
    }

    public final void e0() {
        this.f45430w = 2;
        this.h = 1;
        ArrayList arrayList = this.f45425e;
        if (arrayList.isEmpty()) {
            this.f45427n = -1;
            this.f45428r = -1;
        } else {
            int i7 = this.f45430w;
            this.f45427n = i7;
            int size = arrayList.size() + i7;
            this.f45430w = size;
            this.f45428r = size;
        }
        int i10 = this.f45430w;
        this.f45430w = i10 + 1;
        this.f45429s = i10;
        bx bxVar = this.f45422a;
        if (bxVar != null) {
            bxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        int i7 = org.telegram.ui.ActionBar.k6.f28089q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45423b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45423b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
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
        ww.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
