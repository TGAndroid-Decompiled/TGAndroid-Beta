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
    public bx f45381a;
    public org.telegram.ui.Components.pj0 f45382b;
    public v4.y f45383c;
    public ImageView d;
    public final ArrayList f45384e;
    public dx f45385f;
    public int h;
    public int f45386n;
    public int f45387r;
    public int f45388s;
    public int f45389w;
    public final int f45390x;
    public final int f45391y;

    public ex(int i7, int i10) {
        super(null);
        ArrayList arrayList = new ArrayList();
        this.f45384e = arrayList;
        this.f45390x = i7;
        this.f45391y = i10;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.f45390x == 0) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742880, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131742871, null));
        }
        this.actionBar.q().e(1, org.telegram.messenger.id.M0(2131751355, null).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new w9(this, 28));
        this.f45381a = new bx(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45382b = pj0Var;
        pj0Var.setLayoutManager(new v4.b0(1, false));
        this.f45382b.setVerticalScrollBarEnabled(false);
        this.f45382b.setAdapter(this.f45381a);
        ((v4.k) this.f45382b.getItemAnimator()).C = false;
        frameLayout.addView(this.f45382b, c8.ha.c(-1.0f, -1));
        v4.y yVar = new v4.y(new cx(this));
        this.f45383c = yVar;
        yVar.h(this.f45382b);
        this.f45382b.setOnItemClickListener(new di.p4(17, this, context));
        this.f45382b.setOnItemLongClickListener(new j2.n(this));
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
        this.f45389w = 2;
        this.h = 1;
        ArrayList arrayList = this.f45384e;
        if (arrayList.isEmpty()) {
            this.f45386n = -1;
            this.f45387r = -1;
        } else {
            int i7 = this.f45389w;
            this.f45386n = i7;
            int size = arrayList.size() + i7;
            this.f45389w = size;
            this.f45387r = size;
        }
        int i10 = this.f45389w;
        this.f45389w = i10 + 1;
        this.f45388s = i10;
        bx bxVar = this.f45381a;
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
        int i7 = org.telegram.ui.ActionBar.k6.f28092q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45382b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45382b, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
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
