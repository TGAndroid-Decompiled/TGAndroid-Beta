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
public final class kk0 extends Dialog {
    public static final int O = 0;
    public ViewGroup D;
    public Drawable E;
    public fh.g F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f35360a;
    public final org.telegram.ui.ActionBar.g6 f35361b;
    public Bitmap f35362c;
    public BitmapShader d;
    public Paint f35363e;
    public Matrix f35364f;
    public final ri.b h;
    public final dh.c f35365n;
    public float f35366r;
    public final bi.e5 f35367s;
    public final tt0 f35368w;
    public l60 f35369x;
    public FrameLayout f35370y;

    public kk0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 2131755352);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f35360a = context;
        this.f35361b = g6Var;
        bi.e5 e5Var = new bi.e5(23, context, this);
        this.f35367s = e5Var;
        e5Var.setOnClickListener(new ma0(this, 6));
        tt0 tt0Var = new tt0(context, null);
        this.f35368w = tt0Var;
        tt0Var.setClipToPadding(false);
        e5Var.addView(tt0Var, c8.ha.e(-1, -1, 119));
        ri.b bVar = new ri.b();
        this.h = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.f35365n = cVar;
        cVar.h = new jh.k(e5Var);
        cVar.f8706i = e5Var;
        rt rtVar = new rt(this, 3);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(e5Var, rtVar);
    }

    public static void d(org.telegram.messenger.v10 v10Var) {
        org.telegram.messenger.g0.l2(new s2(v10Var, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f35366r;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new d60(this, 10));
        this.N.addListener(new ai.g0(this, z9, runnable, 8));
        this.N.setInterpolator(xq.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new ik0(this, 1), false);
        this.f35367s.invalidate();
    }

    public final void e(l60 l60Var) {
        int i7 = org.telegram.ui.ActionBar.l6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f35361b;
        l60Var.T(org.telegram.ui.ActionBar.l6.r1(0.06f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
        l60Var.Q(this.f35365n, c8.g0.k(g6Var), false);
        this.f35369x = l60Var;
        this.D = l60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f35360a);
        this.f35370y = frameLayout;
        frameLayout.addView(this.D, c8.ha.c(-2.0f, -2));
        this.f35368w.addView(this.f35370y, c8.ha.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.q1 r28, android.text.style.CharacterStyle r29, java.lang.CharSequence r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk0.f(org.telegram.ui.Cells.q1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bi.e5 e5Var = this.f35367s;
        setContentView(e5Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        e5Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(e5Var, !org.telegram.ui.ActionBar.l6.I.q());
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
