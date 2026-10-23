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
public final class cn0 extends Dialog {
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
    public final Context f25383a;
    public final org.telegram.ui.ActionBar.g6 f25384b;
    public Bitmap f25385c;
    public BitmapShader d;
    public Paint e;
    public Matrix f25386f;
    public final gh.b h;
    public final bh.b f25387n;
    public float f25388r;
    public final ah.x f25389s;
    public final ow0 v;
    public j80 f25390w;
    public FrameLayout f25391x;
    public ViewGroup f25392y;

    public cn0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f25383a = context;
        this.f25384b = g6Var;
        ah.x xVar = new ah.x(this, context, 20);
        this.f25389s = xVar;
        xVar.setOnClickListener(new v80(this, 9));
        ow0 ow0Var = new ow0(context, null);
        this.v = ow0Var;
        ow0Var.setClipToPadding(false);
        xVar.addView(ow0Var, w7.z5.e(-1, -1, 119));
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f25387n = bVar2;
        bVar2.f4365f = new ih.k(xVar);
        bVar2.f4366g = xVar;
        le.b bVar3 = new le.b(this, 11);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(xVar, bVar3);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new y2(callback2, 11), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f25388r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new d80(this, 12));
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
        c(new an0(this, 1), false);
        this.f25389s.invalidate();
    }

    public final void e(j80 j80Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25384b;
        j80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        j80Var.Q(this.f25387n, fh.c.k(g6Var), false);
        this.f25390w = j80Var;
        this.f25392y = j80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f25383a);
        this.f25391x = frameLayout;
        frameLayout.addView(this.f25392y, w7.z5.c(-2.0f, -2));
        this.v.addView(this.f25391x, w7.z5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ah.x xVar = this.f25389s;
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
        AndroidUtilities.setLightNavigationBar(xVar, !org.telegram.ui.ActionBar.k6.I.q());
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
