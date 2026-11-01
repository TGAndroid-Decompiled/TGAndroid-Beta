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
public final class sp extends org.telegram.ui.ActionBar.z2 {
    public final Drawable f30404i1;
    public final ArrayList f30405j1;
    public final pp f30406k1;
    public final rp l1;
    public final boolean f30407m1;
    public int f30408n1;
    public final int[] f30409o1;
    public final int f30410p1;
    public int f30411q1;
    public boolean f30412r1;
    public org.telegram.ui.bb f30413s1;
    public int f30414t1;
    public int f30415u1;
    public int f30416v1;

    public sp(Activity activity, TLRPC.Chat chat) {
        super(1, (Context) activity, (org.telegram.ui.ActionBar.p6) null, false);
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f30405j1 = arrayList;
        this.f30409o1 = new int[2];
        this.f30407m1 = true;
        this.f21618v0 = false;
        TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(this.f21584a).M0(chat.f19794id);
        if (M0 != null) {
            i10 = M0.ttl_period;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            this.f30410p1 = 0;
            this.f30411q1 = 0;
        } else if (i10 == 86400) {
            this.f30410p1 = 1;
            this.f30411q1 = 1;
        } else if (i10 == 604800) {
            this.f30410p1 = 2;
            this.f30411q1 = 2;
        } else {
            this.f30410p1 = 3;
            this.f30411q1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(2131232725).mutate();
        this.f30404i1 = mutate;
        int i11 = org.telegram.ui.ActionBar.t6.f21002h5;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), PorterDuff.Mode.MULTIPLY));
        op opVar = new op(this, activity);
        opVar.setFillViewport(true);
        opVar.setWillNotDraw(false);
        opVar.setClipToPadding(false);
        int i12 = this.f21616t0;
        opVar.setPadding(i12, 0, i12, 0);
        this.f21587b = opVar;
        pp ppVar = new pp(this, activity);
        this.f30406k1 = ppVar;
        ppVar.setOrientation(1);
        opVar.addView(ppVar, w7.b6.x(-1, -2, 80));
        this.N = ppVar;
        org.telegram.messenger.e20.i(this.f21584a).e();
        org.telegram.messenger.wp.r1(this.f21584a);
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(false);
        imageView.f(2131624323, 120, 120, null);
        imageView.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, 0);
        imageView.d();
        ppVar.addView((View) imageView, w7.b6.t(160, 160, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        org.telegram.messenger.a30.n(textView, 1, 24.0f);
        org.telegram.messenger.a30.p(textView, org.telegram.ui.ActionBar.t6.f21038j5, null, null, 2131753869);
        ppVar.addView(textView, w7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21186r5, null);
        textView2.setGravity(1);
        if (org.telegram.messenger.w3.T(chat) && !chat.megagroup) {
            textView2.setText(org.telegram.messenger.dd.L0(2131753871, null));
        } else {
            textView2.setText(org.telegram.messenger.dd.L0(2131753870, null));
        }
        ppVar.addView(textView2, w7.b6.t(-2, -2, 49, 30, 22, 30, 20));
        zu0 zu0Var = new zu0(activity, null);
        zu0Var.setCallback(new qp(this, opVar));
        zu0Var.b(this.f30410p1, null, org.telegram.messenger.dd.L0(2131753849, null), org.telegram.messenger.dd.L0(2131753879, null), org.telegram.messenger.dd.L0(2131753878, null), org.telegram.messenger.dd.L0(2131753880, null));
        ppVar.addView(zu0Var, w7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        eq eqVar = new eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0)), org.telegram.ui.ActionBar.t6.Y0(activity, 2131231231, org.telegram.ui.ActionBar.t6.f20893b7));
        eqVar.f25909x = true;
        frameLayout.setBackgroundDrawable(eqVar);
        arrayList.add(eqVar);
        ppVar.addView(frameLayout, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(activity, null);
        b9Var.setText(org.telegram.messenger.dd.L0(2131753852, null));
        frameLayout.addView(b9Var);
        rp rpVar = new rp(activity);
        this.l1 = rpVar;
        org.telegram.ui.ActionBar.a7.i(i11, rpVar, null);
        rpVar.setText(org.telegram.messenger.dd.L0(2131753845, null));
        rpVar.f30054a.setOnClickListener(new h0(this, 7));
        frameLayout.addView(rpVar);
        J0(false);
    }

    public static void I0(sp spVar) {
        float f7;
        View childAt = spVar.f30406k1.getChildAt(0);
        int[] iArr = spVar.f30409o1;
        childAt.getLocationInWindow(iArr);
        int i10 = iArr[1];
        if (spVar.f30407m1) {
            f7 = 6.0f;
        } else {
            f7 = 19.0f;
        }
        int max = Math.max(i10 - org.telegram.messenger.i0.L(f7), 0);
        if (spVar.f30408n1 != max) {
            spVar.f30408n1 = max;
            spVar.f21587b.invalidate();
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0(boolean z10) {
        int i10 = this.f30410p1;
        int i11 = this.f30411q1;
        rp rpVar = this.l1;
        if (i10 == i11 && !this.f30407m1) {
            if (z10) {
                rpVar.animate().alpha(0.0f).setDuration(180L).start();
                return;
            }
            rpVar.setVisibility(4);
            rpVar.setAlpha(0.0f);
            return;
        }
        rpVar.setVisibility(0);
        if (z10) {
            rpVar.animate().alpha(1.0f).setDuration(180L).start();
        } else {
            rpVar.setAlpha(1.0f);
        }
    }

    @Override
    public final void s0() {
        Drawable drawable;
        ArrayList arrayList = this.f30405j1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.I0);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20893b7, this.I0);
            if (w02 == this.f30415u1) {
                if (w03 != this.f30416v1) {
                }
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0);
                drawable = this.f30404i1;
                if (drawable == null && w04 != this.f30414t1) {
                    this.f30414t1 = w04;
                    drawable.setColorFilter(new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY));
                    return;
                }
            }
            this.f30415u1 = w02;
            this.f30416v1 = w03;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                eq eqVar = (eq) arrayList.get(i10);
                org.telegram.ui.ActionBar.t6.B1(eqVar, w02, false);
                if (eqVar.f25902b != null) {
                    org.telegram.ui.ActionBar.t6.B1(eqVar, w03, true);
                }
                eqVar.invalidateSelf();
            }
            int w042 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0);
            drawable = this.f30404i1;
            if (drawable == null) {
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
