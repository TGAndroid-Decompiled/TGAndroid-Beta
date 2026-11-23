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
    public final Context f42503a;
    public final org.telegram.ui.ActionBar.i6 f42504b;
    public Bitmap f42505c;
    public BitmapShader d;
    public Paint f42506e;
    public Matrix f42507f;
    public final ui.b h;
    public final dh.c f42508n;
    public float f42509r;
    public final bi.g3 f42510s;
    public final cu0 f42511w;
    public x60 f42512x;
    public FrameLayout f42513y;

    public yk0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.f42503a = context;
        this.f42504b = i6Var;
        bi.g3 g3Var = new bi.g3(24, context, this);
        this.f42510s = g3Var;
        g3Var.setOnClickListener(new g70(this, 9));
        cu0 cu0Var = new cu0(context, null);
        this.f42511w = cu0Var;
        cu0Var.setClipToPadding(false);
        g3Var.addView(cu0Var, c8.na.e(-1, -1, 119));
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f42508n = cVar;
        cVar.h = new jh.k(g3Var);
        cVar.f8371i = g3Var;
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(this, 7);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(g3Var, aaVar);
    }

    public static void d(org.telegram.messenger.p10 p10Var) {
        org.telegram.messenger.g0.l2(new y2(p10Var, 12), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f42509r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new e60(this, 12));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(kr.h);
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
        this.f42510s.invalidate();
    }

    public final void e(x60 x60Var) {
        int i7 = org.telegram.ui.ActionBar.n6.E8;
        org.telegram.ui.ActionBar.i6 i6Var = this.f42504b;
        x60Var.U(org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        x60Var.R(this.f42508n, c8.j0.l(i6Var), false);
        this.f42512x = x60Var;
        this.E = x60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f42503a);
        this.f42513y = frameLayout;
        frameLayout.addView(this.E, c8.na.c(-2.0f, -2));
        this.f42511w.addView(this.f42513y, c8.na.c(-2.0f, -2));
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
        bi.g3 g3Var = this.f42510s;
        setContentView(g3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        g3Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(g3Var, !org.telegram.ui.ActionBar.n6.I.q());
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
