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
public final class gx extends org.telegram.ui.ActionBar.e2 {
    public cx E;
    public dx f47526a;
    public org.telegram.ui.Components.uj0 f47527b;
    public v4.y f47528c;
    public ImageView d;
    public final ArrayList f47529e;
    public fx f47530f;
    public int h;
    public int f47531n;
    public int f47532r;
    public int f47533s;
    public int f47534w;
    public final int f47535x;
    public final int f47536y;

    public gx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f47529e = arrayList;
        this.f47535x = i7;
        this.f47536y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i7, arrayList, arrayList2, arrayList3, true);
        getMessagesController().Y3(arrayList2, true);
        getMessagesController().S3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.gx r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx.Z(org.telegram.ui.gx, android.content.Context, int):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f47535x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742877, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131742868, null));
        }
        this.actionBar.s().e(1, org.telegram.messenger.hd.M0(2131751354, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 29));
        this.f47526a = new dx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f47527b = uj0Var;
        uj0Var.setLayoutManager(new v4.b0(1, false));
        this.f47527b.setVerticalScrollBarEnabled(false);
        this.f47527b.setAdapter(this.f47526a);
        ((v4.k) this.f47527b.getItemAnimator()).C = false;
        frameLayout.addView(this.f47527b, c8.ja.c(-1.0f, -1));
        v4.y yVar = new v4.y(new ex(this));
        this.f47528c = yVar;
        yVar.h(this.f47527b);
        this.f47527b.setOnItemClickListener(new fi.i4(17, this, context));
        this.f47527b.setOnItemLongClickListener(new ji.j(this));
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
        this.f47534w = 2;
        this.h = 1;
        ArrayList arrayList = this.f47529e;
        if (arrayList.isEmpty()) {
            this.f47531n = -1;
            this.f47532r = -1;
        } else {
            int i7 = this.f47534w;
            this.f47531n = i7;
            int size = arrayList.size() + i7;
            this.f47534w = size;
            this.f47532r = size;
        }
        int i10 = this.f47534w;
        this.f47534w = i10 + 1;
        this.f47533s = i10;
        dx dxVar = this.f47526a;
        if (dxVar != null) {
            dxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        int i7 = org.telegram.ui.ActionBar.j6.f29089q6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47527b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47527b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
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
        yw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
