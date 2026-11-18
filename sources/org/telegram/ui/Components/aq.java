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
public final class aq extends org.telegram.ui.ActionBar.x2 {
    public final Drawable f33417m1;
    public final ArrayList n1;
    public final xp f33418o1;
    public final zp f33419p1;
    public final boolean f33420q1;
    public int f33421r1;
    public final int[] f33422s1;
    public final int f33423t1;
    public int f33424u1;
    public boolean f33425v1;
    public org.telegram.ui.va f33426w1;
    public int f33427x1;
    public int f33428y1;
    public int f33429z1;

    public aq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.i6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.f33422s1 = new int[2];
        this.f33420q1 = true;
        this.f30230w0 = false;
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.f30189a).P0(chat.f28405id);
        if (P0 != null) {
            i7 = P0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f33423t1 = 0;
            this.f33424u1 = 0;
        } else if (i7 == 86400) {
            this.f33423t1 = 1;
            this.f33424u1 = 1;
        } else if (i7 == 604800) {
            this.f33423t1 = 2;
            this.f33424u1 = 2;
        } else {
            this.f33423t1 = 3;
            this.f33424u1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232730).mutate();
        this.f33417m1 = mutate;
        int i10 = org.telegram.ui.ActionBar.n6.f29469h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        wp wpVar = new wp(this, activity);
        wpVar.setFillViewport(true);
        wpVar.setWillNotDraw(false);
        wpVar.setClipToPadding(false);
        int i11 = this.f30227u0;
        wpVar.setPadding(i11, 0, i11, 0);
        this.f30192b = wpVar;
        xp xpVar = new xp(this, activity);
        this.f33418o1 = xpVar;
        xpVar.setOrientation(1);
        wpVar.addView(xpVar, c8.ma.x(-1, -2, 80));
        this.O = xpVar;
        org.telegram.messenger.j10.i(this.f30189a).e();
        org.telegram.messenger.mp.u1(this.f30189a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624326, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        xpVar.addView((View) imageView, c8.ma.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.n10.p(textView, 1, 24.0f);
        org.telegram.messenger.n10.r(textView, org.telegram.ui.ActionBar.n6.f29504j5, null, null, 2131753867);
        xpVar.addView(textView, c8.ma.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29654r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.gd.M0(2131753869, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.M0(2131753868, null));
        }
        xpVar.addView(textView2, c8.ma.t(-2, -2, 49, 30, 22, 30, 20));
        eu0 eu0Var = new eu0(activity, null);
        eu0Var.setCallback(new yp(this, wpVar));
        eu0Var.b(this.f33423t1, null, org.telegram.messenger.gd.M0(2131753847, null), org.telegram.messenger.gd.M0(2131753877, null), org.telegram.messenger.gd.M0(2131753876, null), org.telegram.messenger.gd.M0(2131753878, null));
        xpVar.addView(eu0Var, c8.ma.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        mq mqVar = new mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, this.J0)), org.telegram.ui.ActionBar.n6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.n6.f29360b7));
        mqVar.f37616x = true;
        frameLayout.setBackgroundDrawable(mqVar);
        arrayList.add(mqVar);
        xpVar.addView(frameLayout, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.gd.M0(2131753850, null));
        frameLayout.addView(z8Var);
        zp zpVar = new zp(activity);
        this.f33419p1 = zpVar;
        org.telegram.ui.ActionBar.u6.h(i10, zpVar, null);
        zpVar.setText(org.telegram.messenger.gd.M0(2131753843, null));
        zpVar.f42926a.setOnClickListener(new n0(this, 9));
        frameLayout.addView(zpVar);
        K0(false);
    }

    public static void J0(aq aqVar) {
        float f10;
        View childAt = aqVar.f33418o1.getChildAt(0);
        int[] iArr = aqVar.f33422s1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (aqVar.f33420q1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (aqVar.f33421r1 != max) {
            aqVar.f33421r1 = max;
            aqVar.f30192b.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        int i7 = this.f33423t1;
        int i10 = this.f33424u1;
        zp zpVar = this.f33419p1;
        if (i7 == i10 && !this.f33420q1) {
            if (z10) {
                zpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            zpVar.setVisibility(4);
            zpVar.setAlpha(0.0f);
            return;
        }
        zpVar.setVisibility(0);
        if (z10) {
            zpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            zpVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29360b7, this.J0);
            if (w02 == this.f33428y1) {
                if (w03 != this.f33429z1) {
                }
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0);
                drawable = this.f33417m1;
                if (drawable == null && w04 != this.f33427x1) {
                    this.f33427x1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f33428y1 = w02;
            this.f33429z1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                mq mqVar = (mq) arrayList.get(i7);
                org.telegram.ui.ActionBar.n6.B1(mqVar, w02, false);
                if (mqVar.f37608b != null) {
                    org.telegram.ui.ActionBar.n6.B1(mqVar, w03, true);
                }
                mqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0);
            drawable = this.f33417m1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
