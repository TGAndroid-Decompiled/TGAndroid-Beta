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
public final class yk0 extends Dialog {
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
    public final Context f42442a;
    public final org.telegram.ui.ActionBar.h6 f42443b;
    public Bitmap f42444c;
    public BitmapShader d;
    public Paint f42445e;
    public Matrix f42446f;
    public final ui.b h;
    public final dh.c f42447n;
    public float f42448r;
    public final bi.e3 f42449s;
    public final du0 f42450w;
    public a70 f42451x;
    public FrameLayout f42452y;

    public yk0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.f42442a = context;
        this.f42443b = h6Var;
        bi.e3 e3Var = new bi.e3(24, context, this);
        this.f42449s = e3Var;
        e3Var.setOnClickListener(new j70(this, 9));
        du0 du0Var = new du0(context, null);
        this.f42450w = du0Var;
        du0Var.setClipToPadding(false);
        e3Var.addView(du0Var, c8.ma.e(-1, -1, 119));
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f42447n = cVar;
        cVar.h = new jh.k(e3Var);
        cVar.f8409i = e3Var;
        qf qfVar = new qf(this, 5);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(e3Var, qfVar);
    }

    public static void d(org.telegram.messenger.r10 r10Var) {
        org.telegram.messenger.g0.l2(new z2(r10Var, 12), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f42448r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new h60(this, 12));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(nr.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    @Override
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        c(new wk0(this, 1), false);
        this.f42449s.invalidate();
    }

    public final void e(a70 a70Var) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        org.telegram.ui.ActionBar.h6 h6Var = this.f42443b;
        a70Var.U(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        a70Var.R(this.f42447n, c8.i0.l(h6Var), false);
        this.f42451x = a70Var;
        this.E = a70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f42442a);
        this.f42452y = frameLayout;
        frameLayout.addView(this.E, c8.ma.c(-2.0f, -2));
        this.f42450w.addView(this.f42452y, c8.ma.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.r1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yk0.f(org.telegram.ui.Cells.r1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bi.e3 e3Var = this.f42449s;
        setContentView(e3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        e3Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(e3Var, !org.telegram.ui.ActionBar.m6.I.q());
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
