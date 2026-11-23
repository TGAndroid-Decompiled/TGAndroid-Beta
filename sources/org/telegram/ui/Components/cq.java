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
public final class cq extends org.telegram.ui.ActionBar.w2 {
    public final Drawable f34270m1;
    public final ArrayList n1;
    public final zp f34271o1;
    public final bq f34272p1;
    public final boolean f34273q1;
    public int f34274r1;
    public final int[] f34275s1;
    public final int f34276t1;
    public int f34277u1;
    public boolean f34278v1;
    public org.telegram.ui.va f34279w1;
    public int f34280x1;
    public int f34281y1;
    public int f34282z1;

    public cq(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.h6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.f34275s1 = new int[2];
        this.f34273q1 = true;
        this.f30214w0 = false;
        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(this.f30173a).P0(chat.f28434id);
        if (P0 != null) {
            i7 = P0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f34276t1 = 0;
            this.f34277u1 = 0;
        } else if (i7 == 86400) {
            this.f34276t1 = 1;
            this.f34277u1 = 1;
        } else if (i7 == 604800) {
            this.f34276t1 = 2;
            this.f34277u1 = 2;
        } else {
            this.f34276t1 = 3;
            this.f34277u1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232730).mutate();
        this.f34270m1 = mutate;
        int i10 = org.telegram.ui.ActionBar.m6.f29454h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        yp ypVar = new yp(this, activity);
        ypVar.setFillViewport(true);
        ypVar.setWillNotDraw(false);
        ypVar.setClipToPadding(false);
        int i11 = this.f30211u0;
        ypVar.setPadding(i11, 0, i11, 0);
        this.f30176b = ypVar;
        zp zpVar = new zp(this, activity);
        this.f34271o1 = zpVar;
        zpVar.setOrientation(1);
        ypVar.addView(zpVar, c8.ma.x(-1, -2, 80));
        this.O = zpVar;
        org.telegram.messenger.k10.i(this.f30173a).e();
        org.telegram.messenger.np.u1(this.f30173a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624326, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        zpVar.addView((View) imageView, c8.ma.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.o10.p(textView, 1, 24.0f);
        org.telegram.messenger.o10.r(textView, org.telegram.ui.ActionBar.m6.f29489j5, null, null, 2131753866);
        zpVar.addView(textView, c8.ma.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29639r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.hd.N0(2131753868, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.N0(2131753867, null));
        }
        zpVar.addView(textView2, c8.ma.t(-2, -2, 49, 30, 22, 30, 20));
        hu0 hu0Var = new hu0(activity, null);
        hu0Var.setCallback(new aq(this, ypVar));
        hu0Var.b(this.f34276t1, null, org.telegram.messenger.hd.N0(2131753846, null), org.telegram.messenger.hd.N0(2131753876, null), org.telegram.messenger.hd.N0(2131753875, null), org.telegram.messenger.hd.N0(2131753877, null));
        zpVar.addView(hu0Var, c8.ma.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        oq oqVar = new oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0)), org.telegram.ui.ActionBar.m6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.m6.f29345b7));
        oqVar.f38338x = true;
        frameLayout.setBackgroundDrawable(oqVar);
        arrayList.add(oqVar);
        zpVar.addView(frameLayout, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(activity, null);
        a9Var.setText(org.telegram.messenger.hd.N0(2131753849, null));
        frameLayout.addView(a9Var);
        bq bqVar = new bq(activity);
        this.f34272p1 = bqVar;
        org.telegram.ui.ActionBar.t6.h(i10, bqVar, null);
        bqVar.setText(org.telegram.messenger.hd.N0(2131753842, null));
        bqVar.f33899a.setOnClickListener(new o0(this, 9));
        frameLayout.addView(bqVar);
        K0(false);
    }

    public static void J0(cq cqVar) {
        float f10;
        View childAt = cqVar.f34271o1.getChildAt(0);
        int[] iArr = cqVar.f34275s1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (cqVar.f34273q1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (cqVar.f34274r1 != max) {
            cqVar.f34274r1 = max;
            cqVar.f30176b.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        int i7 = this.f34276t1;
        int i10 = this.f34277u1;
        bq bqVar = this.f34272p1;
        if (i7 == i10 && !this.f34273q1) {
            if (z10) {
                bqVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            bqVar.setVisibility(4);
            bqVar.setAlpha(0.0f);
            return;
        }
        bqVar.setVisibility(0);
        if (z10) {
            bqVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            bqVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29324a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29345b7, this.J0);
            if (w02 == this.f34281y1) {
                if (w03 != this.f34282z1) {
                }
                int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
                drawable = this.f34270m1;
                if (drawable == null && w04 != this.f34280x1) {
                    this.f34280x1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f34281y1 = w02;
            this.f34282z1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                oq oqVar = (oq) arrayList.get(i7);
                org.telegram.ui.ActionBar.m6.B1(oqVar, w02, false);
                if (oqVar.f38330b != null) {
                    org.telegram.ui.ActionBar.m6.B1(oqVar, w03, true);
                }
                oqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
            drawable = this.f34270m1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
