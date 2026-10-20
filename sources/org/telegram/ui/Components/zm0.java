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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class zm0 extends Dialog {
    public static final int O = 0;
    public Drawable E;
    public dh.d F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f32968a;
    public final org.telegram.ui.ActionBar.d6 f32969b;
    public Bitmap f32970c;
    public BitmapShader d;
    public Paint e;
    public Matrix f32971f;
    public final gh.b h;
    public final bh.b f32972n;
    public float f32973r;
    public final ah.x f32974s;
    public final lw0 v;
    public i80 f32975w;
    public FrameLayout f32976x;
    public ViewGroup f32977y;

    public zm0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f32968a = context;
        this.f32969b = d6Var;
        ah.x xVar = new ah.x(this, context, 20);
        this.f32974s = xVar;
        xVar.setOnClickListener(new u80(this, 9));
        lw0 lw0Var = new lw0(context, null);
        this.v = lw0Var;
        lw0Var.setClipToPadding(false);
        xVar.addView(lw0Var, w7.z5.e(-1, -1, 119));
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f32972n = bVar2;
        bVar2.f4358f = new ih.j(xVar);
        bVar2.f4359g = xVar;
        le.b bVar3 = new le.b(this, 11);
        WeakHashMap weakHashMap = r0.i0.f44826a;
        r0.a0.i(xVar, bVar3);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new z2(callback2, 11), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f32973r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new b80(this, 12));
        this.N.addListener(new ah.q0(this, z10, runnable, 6));
        this.N.setInterpolator(bs.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new xm0(this, 1), false);
        this.f32974s.invalidate();
    }

    public final void e(i80 i80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f32969b;
        i80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        i80Var.Q(this.f32972n, fh.c.k(d6Var), false);
        this.f32975w = i80Var;
        this.f32977y = i80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f32968a);
        this.f32976x = frameLayout;
        frameLayout.addView(this.f32977y, w7.z5.c(-2.0f, -2));
        this.v.addView(this.f32976x, w7.z5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.u1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm0.f(org.telegram.ui.Cells.u1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.M;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ah.x xVar = this.f32974s;
        setContentView(xVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        xVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(xVar, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        d(new d(this, 19));
        c(null, true);
    }
}
