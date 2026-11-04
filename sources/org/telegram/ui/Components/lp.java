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
public final class lp extends org.telegram.ui.ActionBar.t2 {
    public final Drawable f35808j1;
    public final ArrayList k1;
    public final ip f35809l1;
    public final kp m1;
    public final boolean f35810n1;
    public int f35811o1;
    public final int[] f35812p1;
    public final int f35813q1;
    public int f35814r1;
    public boolean f35815s1;
    public org.telegram.ui.ua f35816t1;
    public int f35817u1;
    public int f35818v1;
    public int f35819w1;

    public lp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.e6) null, false);
        int i3;
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        this.f35812p1 = new int[2];
        this.f35810n1 = true;
        this.f28621w0 = false;
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.f28583a).N0(chat.f27001id);
        if (N0 != null) {
            i3 = N0.ttl_period;
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            this.f35813q1 = 0;
            this.f35814r1 = 0;
        } else if (i3 == 86400) {
            this.f35813q1 = 1;
            this.f35814r1 = 1;
        } else if (i3 == 604800) {
            this.f35813q1 = 2;
            this.f35814r1 = 2;
        } else {
            this.f35813q1 = 3;
            this.f35814r1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232726).mutate();
        this.f35808j1 = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, activity);
        hpVar.setFillViewport(true);
        hpVar.setWillNotDraw(false);
        hpVar.setClipToPadding(false);
        int i11 = this.f28618u0;
        hpVar.setPadding(i11, 0, i11, 0);
        this.f28586b = hpVar;
        ip ipVar = new ip(this, activity);
        this.f35809l1 = ipVar;
        ipVar.setOrientation(1);
        hpVar.addView(ipVar, b8.mf.x(-1, -2, 80));
        this.O = ipVar;
        org.telegram.messenger.h10.i(this.f28583a).e();
        org.telegram.messenger.hp.s1(this.f28583a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624325, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, 0);
        imageView.d();
        ipVar.addView((View) imageView, b8.mf.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.f27988j5, null, null, 2131753869);
        ipVar.addView(textView, b8.mf.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.bd.M0(2131753871, null));
        } else {
            textView2.setText(org.telegram.messenger.bd.M0(2131753870, null));
        }
        ipVar.addView(textView2, b8.mf.t(-2, -2, 49, 30, 22, 30, 20));
        ut0 ut0Var = new ut0(activity, null);
        ut0Var.setCallback(new jp(this, hpVar));
        ut0Var.b(this.f35813q1, null, org.telegram.messenger.bd.M0(2131753849, null), org.telegram.messenger.bd.M0(2131753879, null), org.telegram.messenger.bd.M0(2131753878, null), org.telegram.messenger.bd.M0(2131753880, null));
        ipVar.addView(ut0Var, b8.mf.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        xp xpVar = new xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0)), org.telegram.ui.ActionBar.k6.Y0(activity, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7));
        xpVar.f40447x = true;
        frameLayout.setBackgroundDrawable(xpVar);
        arrayList.add(xpVar);
        ipVar.addView(frameLayout, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(activity, null);
        y8Var.setText(org.telegram.messenger.bd.M0(2131753852, null));
        frameLayout.addView(y8Var);
        kp kpVar = new kp(activity);
        this.m1 = kpVar;
        org.telegram.ui.ActionBar.r6.i(i10, kpVar, null);
        kpVar.setText(org.telegram.messenger.bd.M0(2131753845, null));
        kpVar.f35458a.setOnClickListener(new f0(this, 8));
        frameLayout.addView(kpVar);
        J0(false);
    }

    public static void I0(lp lpVar) {
        float f10;
        View childAt = lpVar.f35809l1.getChildAt(0);
        int[] iArr = lpVar.f35812p1;
        childAt.getLocationInWindow(iArr);
        int i3 = iArr[1];
        if (lpVar.f35810n1) {
            f10 = 6.0f;
        } else {
            f10 = 19.0f;
        }
        int max = Math.max(i3 - org.telegram.messenger.g0.L(f10), 0);
        if (lpVar.f35811o1 != max) {
            lpVar.f35811o1 = max;
            lpVar.f28586b.invalidate();
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0(boolean z10) {
        int i3 = this.f35813q1;
        int i10 = this.f35814r1;
        kp kpVar = this.m1;
        if (i3 == i10 && !this.f35810n1) {
            if (z10) {
                kpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            kpVar.setVisibility(4);
            kpVar.setAlpha(0.0f);
            return;
        }
        kpVar.setVisibility(0);
        if (z10) {
            kpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            kpVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.k1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27843b7, this.J0);
            if (w02 == this.f35818v1) {
                if (w03 != this.f35819w1) {
                }
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
                drawable = this.f35808j1;
                if (drawable == null && w04 != this.f35817u1) {
                    this.f35817u1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f35818v1 = w02;
            this.f35819w1 = w03;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                xp xpVar = (xp) arrayList.get(i3);
                org.telegram.ui.ActionBar.k6.B1(xpVar, w02, false);
                if (xpVar.f40439b != null) {
                    org.telegram.ui.ActionBar.k6.B1(xpVar, w03, true);
                }
                xpVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
            drawable = this.f35808j1;
            if (drawable == null) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
