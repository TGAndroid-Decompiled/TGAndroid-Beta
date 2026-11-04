package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class gc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f45628a;
    public final u51 f45629b;
    public final u4.b0 f45630c;
    public final int d;
    public int f45631e;

    public gc(int i3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.d = i3;
        this.f45628a = e6Var;
        u51 u51Var = new u51(3, activity, e6Var);
        this.f45629b = u51Var;
        u51Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(6.0f), 0);
        u51Var.setClipToPadding(false);
        u51Var.setAdapter(new ec(this, activity, e6Var, i3));
        u4.b0 b0Var = new u4.b0();
        this.f45630c = b0Var;
        b0Var.j1(0);
        u51Var.setLayoutManager(b0Var);
        addView(u51Var, b8.mf.c(-1.0f, -1));
    }

    public final void a(int i3, boolean z10) {
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.d).f23099q4;
        int i10 = 0;
        if (xoVar != null) {
            ArrayList arrayList = xoVar.f26419c;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (((org.telegram.messenger.wo) arrayList.get(i11)).f26239c == i3) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 != this.f45631e) {
            this.f45631e = i10;
            if (!z10) {
                this.f45630c.h1(i10, (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(56.0f)) / 2);
            }
            org.telegram.messenger.g0.d0(this.f45629b, new ci.b8(4, this, z10));
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
        org.telegram.messenger.g0.d0(this.f45629b, new mi.f(11, this, org.telegram.messenger.hp.s1(this.d).f23099q4));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
