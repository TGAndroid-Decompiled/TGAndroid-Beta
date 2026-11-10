package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lp extends org.telegram.ui.ActionBar.w2 {
    public final Drawable l1;
    public final ArrayList f35710m1;
    public final ip n1;
    public final kp f35711o1;
    public final boolean f35712p1;
    public int f35713q1;
    public final int[] f35714r1;
    public final int f35715s1;
    public int f35716t1;
    public boolean f35717u1;
    public org.telegram.ui.wa f35718v1;
    public int f35719w1;
    public int f35720x1;
    public int f35721y1;

    public lp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.h6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.f35710m1 = arrayList;
        this.f35714r1 = new int[2];
        this.f35712p1 = true;
        this.f28707v0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.f28669a).N0(chat.f26960id);
        if (N0 != null) {
            i7 = N0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f35715s1 = 0;
            this.f35716t1 = 0;
        } else if (i7 == 86400) {
            this.f35715s1 = 1;
            this.f35716t1 = 1;
        } else if (i7 == 604800) {
            this.f35715s1 = 2;
            this.f35716t1 = 2;
        } else {
            this.f35715s1 = 3;
            this.f35716t1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232728).mutate();
        this.l1 = mutate;
        int i10 = org.telegram.ui.ActionBar.m6.f27963h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i10, this.I0), PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, activity);
        hpVar.setFillViewport(true);
        hpVar.setWillNotDraw(false);
        hpVar.setClipToPadding(false);
        int i11 = this.f28705t0;
        hpVar.setPadding(i11, 0, i11, 0);
        this.f28672b = hpVar;
        ip ipVar = new ip(this, activity);
        this.n1 = ipVar;
        ipVar.setOrientation(1);
        hpVar.addView(ipVar, c8.ha.x(-1, -2, 80));
        this.N = ipVar;
        org.telegram.messenger.p10.i(this.f28669a).e();
        org.telegram.messenger.qp.s1(this.f28669a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624325, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        ipVar.addView((View) imageView, c8.ha.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.m6.f27998j5, null, null, 2131753869);
        ipVar.addView(textView, c8.ha.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28148r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.id.M0(2131753871, null));
        } else {
            textView2.setText(org.telegram.messenger.id.M0(2131753870, null));
        }
        ipVar.addView(textView2, c8.ha.t(-2, -2, 49, 30, 22, 30, 20));
        wt0 wt0Var = new wt0(activity, null);
        wt0Var.setCallback(new jp(this, hpVar));
        wt0Var.b(this.f35715s1, null, org.telegram.messenger.id.M0(2131753849, null), org.telegram.messenger.id.M0(2131753879, null), org.telegram.messenger.id.M0(2131753878, null), org.telegram.messenger.id.M0(2131753880, null));
        ipVar.addView(wt0Var, c8.ha.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        xp xpVar = new xp(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0)), org.telegram.ui.ActionBar.m6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.m6.f27854b7));
        xpVar.f40383x = true;
        frameLayout.setBackgroundDrawable(xpVar);
        arrayList.add(xpVar);
        ipVar.addView(frameLayout, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.id.M0(2131753852, null));
        frameLayout.addView(z8Var);
        kp kpVar = new kp(activity);
        this.f35711o1 = kpVar;
        org.telegram.ui.ActionBar.t6.h(i10, kpVar, null);
        kpVar.setText(org.telegram.messenger.id.M0(2131753845, null));
        kpVar.f35383a.setOnClickListener(new g0(this, 8));
        frameLayout.addView(kpVar);
        J0(false);
    }

    public static void I0(lp lpVar) {
        float f10;
        View childAt = lpVar.n1.getChildAt(0);
        int[] iArr = lpVar.f35714r1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (lpVar.f35712p1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (lpVar.f35713q1 != max) {
            lpVar.f35713q1 = max;
            lpVar.f28672b.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        int i7 = this.f35715s1;
        int i10 = this.f35716t1;
        kp kpVar = this.f35711o1;
        if (i7 == i10 && !this.f35712p1) {
            if (z9) {
                kpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            kpVar.setVisibility(4);
            kpVar.setAlpha(0.0f);
            return;
        }
        kpVar.setVisibility(0);
        if (z9) {
            kpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            kpVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.f35710m1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27834a7, this.I0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27854b7, this.I0);
            if (w02 == this.f35720x1) {
                if (w03 != this.f35721y1) {
                }
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
                drawable = this.l1;
                if (drawable == null && w04 != this.f35719w1) {
                    this.f35719w1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f35720x1 = w02;
            this.f35721y1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                xp xpVar = (xp) arrayList.get(i7);
                org.telegram.ui.ActionBar.m6.B1(xpVar, w02, false);
                if (xpVar.f40375b != null) {
                    org.telegram.ui.ActionBar.m6.B1(xpVar, w03, true);
                }
                xpVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
            drawable = this.l1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
