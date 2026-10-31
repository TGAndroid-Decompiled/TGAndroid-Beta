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
public final class nl0 extends Dialog {
    public static final int O = 0;
    public ViewGroup D;
    public Drawable E;
    public vg.f F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f28817a;
    public final org.telegram.ui.ActionBar.p6 f28818b;
    public Bitmap f28819c;
    public BitmapShader d;
    public Paint e;
    public Matrix f28820f;
    public final hi.b h;
    public final tg.b f28821n;
    public float f28822r;
    public final jg.l0 f28823s;
    public final uu0 f28824w;
    public z60 f28825x;
    public FrameLayout f28826y;

    public nl0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 2131755352);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f28817a = context;
        this.f28818b = p6Var;
        jg.l0 l0Var = new jg.l0(this, context, 22);
        this.f28823s = l0Var;
        l0Var.setOnClickListener(new db0(this, 7));
        uu0 uu0Var = new uu0(context, null);
        this.f28824w = uu0Var;
        uu0Var.setClipToPadding(false);
        l0Var.addView(uu0Var, w7.b6.e(-1, -1, 119));
        hi.b bVar = new hi.b();
        this.h = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.f28821n = bVar2;
        bVar2.f48700f = new zg.h(l0Var);
        bVar2.f48701g = l0Var;
        k2.m0 m0Var = new k2.m0(this);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(l0Var, m0Var);
    }

    public static void d(org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.i0.l2(new r2(j20Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f28822r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 11));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(gr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new ll0(this, 1), false);
        this.f28823s.invalidate();
    }

    public final void e(z60 z60Var) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        org.telegram.ui.ActionBar.p6 p6Var = this.f28818b;
        z60Var.T(org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        z60Var.R(this.f28821n, w7.b9.k(p6Var), false);
        this.f28825x = z60Var;
        this.D = z60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f28817a);
        this.f28826y = frameLayout;
        frameLayout.addView(this.D, w7.b6.c(-2.0f, -2));
        this.f28824w.addView(this.f28826y, w7.b6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.q1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nl0.f(org.telegram.ui.Cells.q1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.M;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jg.l0 l0Var = this.f28823s;
        setContentView(l0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        l0Var.setSystemUiVisibility(256);
        org.telegram.messenger.i0.n3(l0Var, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        super.show();
        d(new d(this, 19));
        c(null, true);
    }
}
