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
public final class gx extends org.telegram.ui.ActionBar.f2 {
    public cx D;
    public dx f46081a;
    public org.telegram.ui.Components.qj0 f46082b;
    public v4.y f46083c;
    public ImageView d;
    public final ArrayList f46084e;
    public fx f46085f;
    public int h;
    public int f46086n;
    public int f46087r;
    public int f46088s;
    public int f46089w;
    public final int f46090x;
    public final int f46091y;

    public gx(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f46084e = arrayList;
        this.f46090x = i7;
        this.f46091y = i10;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f46090x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742877, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742868, null));
        }
        this.actionBar.r().e(1, org.telegram.messenger.id.M0(2131751354, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 28));
        this.f46081a = new dx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f46082b = qj0Var;
        qj0Var.setLayoutManager(new v4.b0(1, false));
        this.f46082b.setVerticalScrollBarEnabled(false);
        this.f46082b.setAdapter(this.f46081a);
        ((v4.k) this.f46082b.getItemAnimator()).C = false;
        frameLayout.addView(this.f46082b, c8.ha.c(-1.0f, -1));
        v4.y yVar = new v4.y(new ex(this));
        this.f46083c = yVar;
        yVar.h(this.f46082b);
        this.f46082b.setOnItemClickListener(new di.q4(17, this, context));
        this.f46082b.setOnItemLongClickListener(new j2.n(this));
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
        this.f46089w = 2;
        this.h = 1;
        ArrayList arrayList = this.f46084e;
        if (arrayList.isEmpty()) {
            this.f46086n = -1;
            this.f46087r = -1;
        } else {
            int i7 = this.f46089w;
            this.f46086n = i7;
            int size = arrayList.size() + i7;
            this.f46089w = size;
            this.f46087r = size;
        }
        int i10 = this.f46089w;
        this.f46089w = i10 + 1;
        this.f46088s = i10;
        dx dxVar = this.f46081a;
        if (dxVar != null) {
            dxVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.F8));
        int i7 = org.telegram.ui.ActionBar.l6.f28105q6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46082b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46082b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
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
        yw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
