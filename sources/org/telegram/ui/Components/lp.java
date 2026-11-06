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
public final class lp extends org.telegram.ui.ActionBar.v2 {
    public final Drawable f35686i1;
    public final ArrayList f35687j1;
    public final ip f35688k1;
    public final kp l1;
    public final boolean f35689m1;
    public int n1;
    public final int[] f35690o1;
    public final int f35691p1;
    public int f35692q1;
    public boolean f35693r1;
    public org.telegram.ui.wa f35694s1;
    public int f35695t1;
    public int f35696u1;
    public int f35697v1;

    public lp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.f6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.f35687j1 = arrayList;
        this.f35690o1 = new int[2];
        this.f35689m1 = true;
        this.f28647v0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(this.f28612a).N0(chat.f26952id);
        if (N0 != null) {
            i7 = N0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f35691p1 = 0;
            this.f35692q1 = 0;
        } else if (i7 == 86400) {
            this.f35691p1 = 1;
            this.f35692q1 = 1;
        } else if (i7 == 604800) {
            this.f35691p1 = 2;
            this.f35692q1 = 2;
        } else {
            this.f35691p1 = 3;
            this.f35692q1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232728).mutate();
        this.f35686i1 = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.f27921h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.I0), PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, activity);
        hpVar.setFillViewport(true);
        hpVar.setWillNotDraw(false);
        hpVar.setClipToPadding(false);
        int i11 = this.f28645t0;
        hpVar.setPadding(i11, 0, i11, 0);
        this.f28615b = hpVar;
        ip ipVar = new ip(this, activity);
        this.f35688k1 = ipVar;
        ipVar.setOrientation(1);
        hpVar.addView(ipVar, c8.ha.x(-1, -2, 80));
        this.N = ipVar;
        org.telegram.messenger.p10.i(this.f28612a).e();
        org.telegram.messenger.qp.s1(this.f28612a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624325, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        ipVar.addView((View) imageView, c8.ha.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.f27956j5, null, null, 2131753869);
        ipVar.addView(textView, c8.ha.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28106r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.hd.M0(2131753871, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131753870, null));
        }
        ipVar.addView(textView2, c8.ha.t(-2, -2, 49, 30, 22, 30, 20));
        vt0 vt0Var = new vt0(activity, null);
        vt0Var.setCallback(new jp(this, hpVar));
        vt0Var.b(this.f35691p1, null, org.telegram.messenger.hd.M0(2131753849, null), org.telegram.messenger.hd.M0(2131753879, null), org.telegram.messenger.hd.M0(2131753878, null), org.telegram.messenger.hd.M0(2131753880, null));
        ipVar.addView(vt0Var, c8.ha.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        xp xpVar = new xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0)), org.telegram.ui.ActionBar.k6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7));
        xpVar.f40305x = true;
        frameLayout.setBackgroundDrawable(xpVar);
        arrayList.add(xpVar);
        ipVar.addView(frameLayout, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.hd.M0(2131753852, null));
        frameLayout.addView(z8Var);
        kp kpVar = new kp(activity);
        this.l1 = kpVar;
        org.telegram.ui.ActionBar.r6.i(i10, kpVar, null);
        kpVar.setText(org.telegram.messenger.hd.M0(2131753845, null));
        kpVar.f35386a.setOnClickListener(new h0(this, 8));
        frameLayout.addView(kpVar);
        J0(false);
    }

    public static void I0(lp lpVar) {
        float f10;
        View childAt = lpVar.f35688k1.getChildAt(0);
        int[] iArr = lpVar.f35690o1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (lpVar.f35689m1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (lpVar.n1 != max) {
            lpVar.n1 = max;
            lpVar.f28615b.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z9) {
        int i7 = this.f35691p1;
        int i10 = this.f35692q1;
        kp kpVar = this.l1;
        if (i7 == i10 && !this.f35689m1) {
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
        ArrayList arrayList = this.f35687j1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, this.I0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27812b7, this.I0);
            if (w02 == this.f35696u1) {
                if (w03 != this.f35697v1) {
                }
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
                drawable = this.f35686i1;
                if (drawable == null && w04 != this.f35695t1) {
                    this.f35695t1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f35696u1 = w02;
            this.f35697v1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                xp xpVar = (xp) arrayList.get(i7);
                org.telegram.ui.ActionBar.k6.B1(xpVar, w02, false);
                if (xpVar.f40297b != null) {
                    org.telegram.ui.ActionBar.k6.B1(xpVar, w03, true);
                }
                xpVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
            drawable = this.f35686i1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
