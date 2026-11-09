package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class ic extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f46565a;
    public final f61 f46566b;
    public final v4.b0 f46567c;
    public final int d;
    public int f46568e;

    public ic(int i7, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.d = i7;
        this.f46565a = g6Var;
        f61 f61Var = new f61(3, activity, g6Var);
        this.f46566b = f61Var;
        f61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setAdapter(new gc(this, activity, g6Var, i7));
        v4.b0 b0Var = new v4.b0();
        this.f46567c = b0Var;
        b0Var.j1(0);
        f61Var.setLayoutManager(b0Var);
        addView(f61Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z9) {
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.d).f24874q4;
        int i10 = 0;
        if (gpVar != null) {
            ArrayList arrayList = gpVar.f22706c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.fp) arrayList.get(i11)).f22451c == i7) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f46568e) {
            this.f46568e = i10;
            if (!z9) {
                this.f46567c.h1(i10, (org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.f46566b, new bi.b9(4, this, z9));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            boolean z9 = true;
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                z9 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z9);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        org.telegram.messenger.g0.d0(this.f46566b, new org.telegram.messenger.voip.k(7, this, org.telegram.messenger.qp.s1(this.d).f24874q4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
