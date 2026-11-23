package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class hc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f48528a;
    public final d61 f48529b;
    public final v4.c0 f48530c;
    public final int d;
    public int f48531e;

    public hc(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.d = i7;
        this.f48528a = i6Var;
        d61 d61Var = new d61(3, activity, i6Var);
        this.f48529b = d61Var;
        d61Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        d61Var.setClipToPadding(false);
        d61Var.setAdapter(new fc(this, activity, i6Var, i7));
        v4.c0 c0Var = new v4.c0();
        this.f48530c = c0Var;
        c0Var.j1(0);
        d61Var.setLayoutManager(c0Var);
        addView(d61Var, c8.na.c(-1.0f, -1));
    }

    public final void a(int i7, boolean z10) {
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.d).f25862t4;
        int i10 = 0;
        if (cpVar != null) {
            ArrayList arrayList = cpVar.f23513c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.bp) arrayList.get(i11)).f23238c == i7) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f48531e) {
            this.f48531e = i10;
            if (!z10) {
                this.f48530c.h1(i10, (org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.f48529b, new ai.o2(5, this, z10));
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
        org.telegram.messenger.g0.d0(this.f48529b, new ki.n2(12, this, org.telegram.messenger.mp.u1(this.d).f25862t4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
