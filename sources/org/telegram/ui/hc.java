package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class hc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f48314a;
    public final f61 f48315b;
    public final v4.c0 f48316c;
    public final int d;
    public int f48317e;

    public hc(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.d = i7;
        this.f48314a = h6Var;
        f61 f61Var = new f61(3, activity, h6Var);
        this.f48315b = f61Var;
        f61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setAdapter(new fc(this, activity, h6Var, i7));
        v4.c0 c0Var = new v4.c0();
        this.f48316c = c0Var;
        c0Var.j1(0);
        f61Var.setLayoutManager(c0Var);
        addView(f61Var, c8.ma.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z10) {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.d).f25966t4;
        int i10 = 0;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.f23593c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.cp) arrayList.get(i11)).f23355c == i7) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f48317e) {
            this.f48317e = i10;
            if (!z10) {
                this.f48316c.h1(i10, (org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.f48315b, new ai.x2(5, this, z10));
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
        org.telegram.messenger.g0.d0(this.f48315b, new li.d(11, this, org.telegram.messenger.np.u1(this.d).f25966t4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
