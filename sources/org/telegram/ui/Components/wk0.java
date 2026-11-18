package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class wk0 extends Dialog {
    public static final int P = 0;
    public ViewGroup E;
    public Drawable F;
    public fh.g G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context f41724a;
    public final org.telegram.ui.ActionBar.i6 f41725b;
    public Bitmap f41726c;
    public BitmapShader d;
    public Paint f41727e;
    public Matrix f41728f;
    public final ui.b h;
    public final dh.c f41729n;
    public float f41730r;
    public final bi.a3 f41731s;
    public final au0 f41732w;
    public y60 f41733x;
    public FrameLayout f41734y;

    public wk0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.f41724a = context;
        this.f41725b = i6Var;
        bi.a3 a3Var = new bi.a3(24, context, this);
        this.f41731s = a3Var;
        a3Var.setOnClickListener(new h70(this, 8));
        au0 au0Var = new au0(context, null);
        this.f41732w = au0Var;
        au0Var.setClipToPadding(false);
        a3Var.addView(au0Var, c8.ma.e(-1, -1, 119));
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f41729n = cVar;
        cVar.h = new jh.k(a3Var);
        cVar.f8377i = a3Var;
        of ofVar = new of(this, 5);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(a3Var, ofVar);
    }

    public static void d(org.telegram.messenger.q10 q10Var) {
        org.telegram.messenger.g0.l2(new y2(q10Var, 12), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f41730r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new e60(this, 12));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(lr.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    @Override
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        c(new uk0(this, 1), false);
        this.f41731s.invalidate();
    }

    public final void e(y60 y60Var) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f41725b;
        y60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        y60Var.R(this.f41729n, c8.i0.l(i6Var), false);
        this.f41733x = y60Var;
        this.E = y60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f41724a);
        this.f41734y = frameLayout;
        frameLayout.addView(this.E, c8.ma.c(-2.0f, -2));
        this.f41732w.addView(this.f41734y, c8.ma.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.r1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk0.f(org.telegram.ui.Cells.r1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.N;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bi.a3 a3Var = this.f41731s;
        setContentView(a3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        a3Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(a3Var, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        d(new d(this, 20));
        c(null, true);
    }
}
