package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class hc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f47656a;
    public final b61 f47657b;
    public final v4.b0 f47658c;
    public final int d;
    public int f47659e;

    public hc(int i7, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = i7;
        this.f47656a = e6Var;
        b61 b61Var = new b61(3, activity, e6Var);
        this.f47657b = b61Var;
        b61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        b61Var.setClipToPadding(false);
        b61Var.setAdapter(new fc(this, activity, e6Var, i7));
        v4.b0 b0Var = new v4.b0();
        this.f47658c = b0Var;
        b0Var.j1(0);
        b61Var.setLayoutManager(b0Var);
        addView(b61Var, c8.ja.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z10) {
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.d).f25383r4;
        int i10 = 0;
        if (dpVar != null) {
            ArrayList arrayList = dpVar.f23126c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.cp) arrayList.get(i11)).f22919c == i7) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f47659e) {
            this.f47659e = i10;
            if (!z10) {
                this.f47658c.h1(i10, (org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.f47657b, new ai.u2(5, this, z10));
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
        org.telegram.messenger.g0.d0(this.f47657b, new li.v(12, this, org.telegram.messenger.np.s1(this.d).f25383r4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
