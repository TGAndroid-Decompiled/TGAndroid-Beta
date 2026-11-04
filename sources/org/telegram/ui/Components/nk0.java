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
public final class nk0 extends Dialog {
    public static final int P = 0;
    public ViewGroup E;
    public Drawable F;
    public gh.g G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public ValueAnimator O;
    public final Context f36572a;
    public final org.telegram.ui.ActionBar.e6 f36573b;
    public Bitmap f36574c;
    public BitmapShader d;
    public Paint f36575e;
    public Matrix f36576f;
    public final si.b h;
    public final eh.c f36577n;
    public float f36578r;
    public final ai.o2 f36579s;
    public final qt0 f36580w;
    public f60 f36581x;
    public FrameLayout f36582y;

    public nk0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.f36572a = context;
        this.f36573b = e6Var;
        ai.o2 o2Var = new ai.o2(25, context, this);
        this.f36579s = o2Var;
        o2Var.setOnClickListener(new ga0(this, 7));
        qt0 qt0Var = new qt0(context, null);
        this.f36580w = qt0Var;
        qt0Var.setClipToPadding(false);
        o2Var.addView(qt0Var, b8.mf.e(-1, -1, 119));
        si.b bVar = new si.b();
        this.h = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.f36577n = cVar;
        cVar.h = new kh.k(o2Var);
        cVar.f9986i = o2Var;
        i9 i9Var = new i9(this, 6);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(o2Var, i9Var);
    }

    public static void d(org.telegram.messenger.n10 n10Var) {
        org.telegram.messenger.g0.l2(new p2(n10Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f36578r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 11));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(xq.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    @Override
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        c(new lk0(this, 1), false);
        this.f36579s.invalidate();
    }

    public final void e(f60 f60Var) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36573b;
        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        f60Var.Q(this.f36577n, b8.cd.k(e6Var), false);
        this.f36581x = f60Var;
        this.E = f60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f36572a);
        this.f36582y = frameLayout;
        frameLayout.addView(this.E, b8.mf.c(-2.0f, -2));
        this.f36580w.addView(this.f36582y, b8.mf.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.q1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nk0.f(org.telegram.ui.Cells.q1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.o2 o2Var = this.f36579s;
        setContentView(o2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        o2Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(o2Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        d(new e(this, 19));
        c(null, true);
    }
}
