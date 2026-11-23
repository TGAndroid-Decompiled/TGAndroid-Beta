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
public final class zp extends org.telegram.ui.ActionBar.w2 {
    public final Drawable f43008m1;
    public final ArrayList n1;
    public final wp f43009o1;
    public final yp f43010p1;
    public final boolean f43011q1;
    public int f43012r1;
    public final int[] f43013s1;
    public final int f43014t1;
    public int f43015u1;
    public boolean f43016v1;
    public org.telegram.ui.va f43017w1;
    public int f43018x1;
    public int f43019y1;
    public int f43020z1;

    public zp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.i6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.f43013s1 = new int[2];
        this.f43011q1 = true;
        this.f30264w0 = false;
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.f30223a).P0(chat.f28492id);
        if (P0 != null) {
            i7 = P0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f43014t1 = 0;
            this.f43015u1 = 0;
        } else if (i7 == 86400) {
            this.f43014t1 = 1;
            this.f43015u1 = 1;
        } else if (i7 == 604800) {
            this.f43014t1 = 2;
            this.f43015u1 = 2;
        } else {
            this.f43014t1 = 3;
            this.f43015u1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232733).mutate();
        this.f43008m1 = mutate;
        int i10 = org.telegram.ui.ActionBar.n6.f29524h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        vp vpVar = new vp(this, activity);
        vpVar.setFillViewport(true);
        vpVar.setWillNotDraw(false);
        vpVar.setClipToPadding(false);
        int i11 = this.f30261u0;
        vpVar.setPadding(i11, 0, i11, 0);
        this.f30226b = vpVar;
        wp wpVar = new wp(this, activity);
        this.f43009o1 = wpVar;
        wpVar.setOrientation(1);
        vpVar.addView(wpVar, c8.na.x(-1, -2, 80));
        this.O = wpVar;
        org.telegram.messenger.i10.i(this.f30223a).e();
        org.telegram.messenger.mp.u1(this.f30223a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624326, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        wpVar.addView((View) imageView, c8.na.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.m10.p(textView, 1, 24.0f);
        org.telegram.messenger.m10.r(textView, org.telegram.ui.ActionBar.n6.f29559j5, null, null, 2131753866);
        wpVar.addView(textView, c8.na.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29709r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.gd.N0(2131753868, null));
        } else {
            textView2.setText(org.telegram.messenger.gd.N0(2131753867, null));
        }
        wpVar.addView(textView2, c8.na.t(-2, -2, 49, 30, 22, 30, 20));
        gu0 gu0Var = new gu0(activity, null);
        gu0Var.setCallback(new xp(this, vpVar));
        gu0Var.b(this.f43014t1, null, org.telegram.messenger.gd.N0(2131753846, null), org.telegram.messenger.gd.N0(2131753876, null), org.telegram.messenger.gd.N0(2131753875, null), org.telegram.messenger.gd.N0(2131753877, null));
        wpVar.addView(gu0Var, c8.na.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        lq lqVar = new lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0)), org.telegram.ui.ActionBar.n6.Y0(activity, 2131231233, org.telegram.ui.ActionBar.n6.f29415b7));
        lqVar.f37204x = true;
        frameLayout.setBackgroundDrawable(lqVar);
        arrayList.add(lqVar);
        wpVar.addView(frameLayout, c8.na.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(activity, null);
        z8Var.setText(org.telegram.messenger.gd.N0(2131753849, null));
        frameLayout.addView(z8Var);
        yp ypVar = new yp(activity);
        this.f43010p1 = ypVar;
        org.telegram.ui.ActionBar.u6.h(i10, ypVar, null);
        ypVar.setText(org.telegram.messenger.gd.N0(2131753842, null));
        ypVar.f42533a.setOnClickListener(new n0(this, 9));
        frameLayout.addView(ypVar);
        K0(false);
    }

    public static void J0(zp zpVar) {
        float f10;
        View childAt = zpVar.f43009o1.getChildAt(0);
        int[] iArr = zpVar.f43013s1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (zpVar.f43011q1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (zpVar.f43012r1 != max) {
            zpVar.f43012r1 = max;
            zpVar.f30226b.invalidate();
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void K0(boolean z10) {
        int i7 = this.f43014t1;
        int i10 = this.f43015u1;
        yp ypVar = this.f43010p1;
        if (i7 == i10 && !this.f43011q1) {
            if (z10) {
                ypVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            ypVar.setVisibility(4);
            ypVar.setAlpha(0.0f);
            return;
        }
        ypVar.setVisibility(0);
        if (z10) {
            ypVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            ypVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29415b7, this.J0);
            if (w02 == this.f43019y1) {
                if (w03 != this.f43020z1) {
                }
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0);
                drawable = this.f43008m1;
                if (drawable == null && w04 != this.f43018x1) {
                    this.f43018x1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f43019y1 = w02;
            this.f43020z1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                lq lqVar = (lq) arrayList.get(i7);
                org.telegram.ui.ActionBar.n6.B1(lqVar, w02, false);
                if (lqVar.f37196b != null) {
                    org.telegram.ui.ActionBar.n6.B1(lqVar, w03, true);
                }
                lqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0);
            drawable = this.f43008m1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
