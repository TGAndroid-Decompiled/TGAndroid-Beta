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
    public final Context f23827a;
    public final org.telegram.ui.ActionBar.c6 f23828b;
    public Bitmap f23829c;
    public BitmapShader d;
    public Paint e;
    public Matrix f23830f;
    public final gh.b h;
    public final bh.b f23831n;
    public float f23832r;
    public final ah.x f23833s;
    public final ow0 v;
    public l80 f23834w;
    public FrameLayout f23835x;
    public ViewGroup f23836y;

    public cn0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f23827a = context;
        this.f23828b = c6Var;
        ah.x xVar = new ah.x(this, context, 18);
        this.f23833s = xVar;
        xVar.setOnClickListener(new y80(this, 9));
        ow0 ow0Var = new ow0(context, null);
        this.v = ow0Var;
        ow0Var.setClipToPadding(false);
        xVar.addView(ow0Var, w7.z5.e(-1, -1, 119));
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f23831n = bVar2;
        bVar2.f2749f = new ih.j(xVar);
        bVar2.f2750g = xVar;
        ji.h5 h5Var = new ji.h5(this, 15);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(xVar, h5Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new a3(callback2, 11), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f23832r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new f80(this, 12));
        this.N.addListener(new ah.q0(this, z10, runnable, 6));
        this.N.setInterpolator(es.h);
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
        this.f23833s.invalidate();
    }

    public final void e(l80 l80Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23828b;
        l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
        l80Var.Q(this.f23831n, fh.b.k(c6Var), false);
        this.f23834w = l80Var;
        this.f23836y = l80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f23827a);
        this.f23835x = frameLayout;
        frameLayout.addView(this.f23836y, w7.z5.d(-2.0f, -2));
        this.v.addView(this.f23835x, w7.z5.d(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.u1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cn0.f(org.telegram.ui.Cells.u1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ah.x xVar = this.f23833s;
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
        AndroidUtilities.setLightNavigationBar(xVar, !org.telegram.ui.ActionBar.g6.I.q());
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
