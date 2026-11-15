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
public final class ok0 extends Dialog {
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
    public final Context f38007a;
    public final org.telegram.ui.ActionBar.e6 f38008b;
    public Bitmap f38009c;
    public BitmapShader d;
    public Paint f38010e;
    public Matrix f38011f;
    public final ui.b h;
    public final dh.c f38012n;
    public float f38013r;
    public final bi.g2 f38014s;
    public final st0 f38015w;
    public m60 f38016x;
    public FrameLayout f38017y;

    public ok0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 2131755352);
        this.K = 1.0f;
        this.L = 1.0f;
        this.N = false;
        this.f38007a = context;
        this.f38008b = e6Var;
        bi.g2 g2Var = new bi.g2(24, context, this);
        this.f38014s = g2Var;
        g2Var.setOnClickListener(new y60(this, 7));
        st0 st0Var = new st0(context, null);
        this.f38015w = st0Var;
        st0Var.setClipToPadding(false);
        g2Var.addView(st0Var, c8.ja.e(-1, -1, 119));
        ui.b bVar = new ui.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f38012n = cVar;
        cVar.h = new jh.k(g2Var);
        cVar.f8095i = g2Var;
        ff ffVar = new ff(this, 5);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(g2Var, ffVar);
    }

    public static void d(org.telegram.messenger.s10 s10Var) {
        org.telegram.messenger.g0.l2(new q2(s10Var, 12), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f38013r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new f60(this, 10));
        this.O.addListener(new androidx.fragment.app.g(this, z10, runnable, 8));
        this.O.setInterpolator(er.h);
        this.O.setDuration(350L);
        this.O.start();
    }

    @Override
    public final void dismiss() {
        if (this.N) {
            return;
        }
        this.N = true;
        c(new mk0(this, 1), false);
        this.f38014s.invalidate();
    }

    public final void e(m60 m60Var) {
        int i7 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38008b;
        m60Var.T(org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
        m60Var.Q(this.f38012n, c8.g0.k(e6Var), false);
        this.f38016x = m60Var;
        this.E = m60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f38007a);
        this.f38017y = frameLayout;
        frameLayout.addView(this.E, c8.ja.c(-2.0f, -2));
        this.f38015w.addView(this.f38017y, c8.ja.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.q1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok0.f(org.telegram.ui.Cells.q1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bi.g2 g2Var = this.f38014s;
        setContentView(g2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        g2Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(g2Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
        d(new d(this, 19));
        c(null, true);
    }
}
