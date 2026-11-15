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
public final class tp extends org.telegram.ui.ActionBar.u2 {
    public final Drawable f39764m1;
    public final ArrayList n1;
    public final qp f39765o1;
    public final sp f39766p1;
    public final boolean f39767q1;
    public int f39768r1;
    public final int[] f39769s1;
    public final int f39770t1;
    public int f39771u1;
    public boolean f39772v1;
    public org.telegram.ui.va f39773w1;
    public int f39774x1;
    public int f39775y1;
    public int f39776z1;

    public tp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        int i7;
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.f39769s1 = new int[2];
        this.f39767q1 = true;
        this.f29720w0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.f29679a).N0(chat.f28051id);
        if (N0 != null) {
            i7 = N0.ttl_period;
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            this.f39770t1 = 0;
            this.f39771u1 = 0;
        } else if (i7 == 86400) {
            this.f39770t1 = 1;
            this.f39771u1 = 1;
        } else if (i7 == 604800) {
            this.f39770t1 = 2;
            this.f39771u1 = 2;
        } else {
            this.f39770t1 = 3;
            this.f39771u1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232729).mutate();
        this.f39764m1 = mutate;
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        pp ppVar = new pp(this, activity);
        ppVar.setFillViewport(true);
        ppVar.setWillNotDraw(false);
        ppVar.setClipToPadding(false);
        int i11 = this.f29717u0;
        ppVar.setPadding(i11, 0, i11, 0);
        this.f29682b = ppVar;
        qp qpVar = new qp(this, activity);
        this.f39765o1 = qpVar;
        qpVar.setOrientation(1);
        ppVar.addView(qpVar, c8.ja.x(-1, -2, 80));
        this.O = qpVar;
        org.telegram.messenger.m10.i(this.f29679a).e();
        org.telegram.messenger.np.s1(this.f29679a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624326, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        qpVar.addView((View) imageView, c8.ja.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.i20.o(textView, 1, 24.0f);
        org.telegram.messenger.i20.q(textView, org.telegram.ui.ActionBar.j6.f28957j5, null, null, 2131753869);
        qpVar.addView(textView, c8.ja.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29107r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.hd.M0(2131753871, null));
        } else {
            textView2.setText(org.telegram.messenger.hd.M0(2131753870, null));
        }
        qpVar.addView(textView2, c8.ja.t(-2, -2, 49, 30, 22, 30, 20));
        wt0 wt0Var = new wt0(activity, null);
        wt0Var.setCallback(new rp(this, ppVar));
        wt0Var.b(this.f39770t1, null, org.telegram.messenger.hd.M0(2131753849, null), org.telegram.messenger.hd.M0(2131753879, null), org.telegram.messenger.hd.M0(2131753878, null), org.telegram.messenger.hd.M0(2131753880, null));
        qpVar.addView(wt0Var, c8.ja.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        fq fqVar = new fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0)), org.telegram.ui.ActionBar.j6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.j6.f28813b7));
        fqVar.f34682x = true;
        frameLayout.setBackgroundDrawable(fqVar);
        arrayList.add(fqVar);
        qpVar.addView(frameLayout, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(org.telegram.messenger.hd.M0(2131753852, null));
        frameLayout.addView(y8Var);
        sp spVar = new sp(activity);
        this.f39766p1 = spVar;
        org.telegram.ui.ActionBar.q6.h(i10, spVar, null);
        spVar.setText(org.telegram.messenger.hd.M0(2131753845, null));
        spVar.f39385a.setOnClickListener(new e0(this, 9));
        frameLayout.addView(spVar);
        J0(false);
    }

    public static void I0(tp tpVar) {
        float f10;
        View childAt = tpVar.f39765o1.getChildAt(0);
        int[] iArr = tpVar.f39769s1;
        childAt.getLocationInWindow(iArr);
        int i7 = iArr[1];
        if (tpVar.f39767q1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i7 - org.telegram.messenger.g0.L(f10), 0);
        if (tpVar.f39768r1 != max) {
            tpVar.f39768r1 = max;
            tpVar.f29682b.invalidate();
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        int i7 = this.f39770t1;
        int i10 = this.f39771u1;
        sp spVar = this.f39766p1;
        if (i7 == i10 && !this.f39767q1) {
            if (z10) {
                spVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            spVar.setVisibility(4);
            spVar.setAlpha(0.0f);
            return;
        }
        spVar.setVisibility(0);
        if (z10) {
            spVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            spVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.n1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28813b7, this.J0);
            if (w02 == this.f39775y1) {
                if (w03 != this.f39776z1) {
                }
                int w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
                drawable = this.f39764m1;
                if (drawable == null && w04 != this.f39774x1) {
                    this.f39774x1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f39775y1 = w02;
            this.f39776z1 = w03;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                fq fqVar = (fq) arrayList.get(i7);
                org.telegram.ui.ActionBar.j6.B1(fqVar, w02, false);
                if (fqVar.f34674b != null) {
                    org.telegram.ui.ActionBar.j6.B1(fqVar, w03, true);
                }
                fqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
            drawable = this.f39764m1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
