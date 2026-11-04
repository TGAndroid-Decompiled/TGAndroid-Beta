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
public final class cx extends org.telegram.ui.ActionBar.d2 {
    public yw E;
    public zw f44455a;
    public org.telegram.ui.Components.tj0 f44456b;
    public u4.y f44457c;
    public ImageView d;
    public final ArrayList f44458e;
    public bx f44459f;
    public int h;
    public int f44460n;
    public int f44461r;
    public int f44462s;
    public int f44463w;
    public final int f44464x;
    public final int f44465y;

    public cx(int i3, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f44458e = arrayList;
        this.f44464x = i3;
        this.f44465y = i10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        getMessagesStorage().q0(i10, i3, arrayList, arrayList2, arrayList3, true);
        getMessagesController().Y3(arrayList2, true);
        getMessagesController().S3(arrayList3, true);
        e0();
    }

    public static void Z(org.telegram.ui.cx r12, android.content.Context r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx.Z(org.telegram.ui.cx, android.content.Context, int):void");
    }

    public static int a0(cx cxVar) {
        return cxVar.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f44464x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131742887, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131742878, null));
        }
        this.actionBar.q().e(1, org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 29));
        this.f44455a = new zw(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f44456b = tj0Var;
        tj0Var.setLayoutManager(new u4.b0(1, false));
        this.f44456b.setVerticalScrollBarEnabled(false);
        this.f44456b.setAdapter(this.f44455a);
        ((u4.k) this.f44456b.getItemAnimator()).C = false;
        frameLayout.addView(this.f44456b, b8.mf.c(-1.0f, -1));
        u4.y yVar = new u4.y(new ax(this));
        this.f44457c = yVar;
        yVar.h(this.f44456b);
        this.f44456b.setOnItemClickListener(new ei.q4(17, this, context));
        this.f44456b.setOnItemLongClickListener(new mi.h0(this));
        return this.fragmentView;
    }

    public final void d0() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        org.telegram.messenger.g0.i3(new xg(this, 26), 1000L);
    }

    public final void e0() {
        this.f44463w = 2;
        this.h = 1;
        ArrayList arrayList = this.f44458e;
        if (arrayList.isEmpty()) {
            this.f44460n = -1;
            this.f44461r = -1;
        } else {
            int i3 = this.f44463w;
            this.f44460n = i3;
            int size = arrayList.size() + i3;
            this.f44463w = size;
            this.f44461r = size;
        }
        int i10 = this.f44463w;
        this.f44463w = i10 + 1;
        this.f44462s = i10;
        zw zwVar = this.f44455a;
        if (zwVar != null) {
            zwVar.f();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        int i3 = org.telegram.ui.ActionBar.k6.f28121q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44456b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44456b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
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
        uw.u4(org.telegram.messenger.c.a(this.currentAccount));
        getMediaDataController().M0(true);
        return super.onFragmentCreate();
    }
}
