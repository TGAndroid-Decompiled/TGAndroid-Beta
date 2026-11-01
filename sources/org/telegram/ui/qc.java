package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class qc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f40742a;
    public final u71 f40743b;
    public final s4.a0 f40744c;
    public final int d;
    public int e;

    public qc(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.d = i10;
        this.f40742a = p6Var;
        u71 u71Var = new u71(1, activity, p6Var);
        this.f40743b = u71Var;
        u71Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(6.0f), 0);
        u71Var.setClipToPadding(false);
        u71Var.setAdapter(new oc(this, activity, p6Var, i10));
        s4.a0 a0Var = new s4.a0();
        this.f40744c = a0Var;
        a0Var.j1(0);
        u71Var.setLayoutManager(a0Var);
        addView(u71Var, w7.b6.c(-1.0f, -1));
    }

    public final void a(int i10, boolean z10) {
        org.telegram.messenger.mp mpVar = org.telegram.messenger.wp.r1(this.d).f19231r4;
        int i11 = 0;
        if (mpVar != null) {
            ArrayList arrayList = mpVar.f17166c;
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.lp) arrayList.get(i12)).f16986c == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 != this.e) {
            this.e = i11;
            if (!z10) {
                this.f40744c.h1(i11, (org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(56.0f)) / 2);
            }
            org.telegram.messenger.i0.d0(this.f40743b, new nc(0, this, z10));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z10 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z10 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.i0.d0(this.f40743b, new ag.e0(14, this, org.telegram.messenger.wp.r1(this.d).f19231r4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
