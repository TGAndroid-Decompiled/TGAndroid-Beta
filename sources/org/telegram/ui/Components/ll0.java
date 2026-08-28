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
public final class ll0 extends Dialog {
    public static final int K = 0;
    public Drawable A;
    public kg.d B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;
    public final Context f30470a;
    public final org.telegram.ui.ActionBar.b6 f30471b;
    public Bitmap f30472c;
    public BitmapShader d;
    public Paint f30473e;
    public Matrix f30474f;
    public final ng.b h;
    public final ig.a f30475n;
    public float f30476r;
    public final fh.d2 f30477s;
    public final xu0 v;
    public x60 f30478w;
    public FrameLayout f30479x;
    public ViewGroup f30480y;

    public ll0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, R.style.TransparentDialog);
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = false;
        this.f30470a = context;
        this.f30471b = b6Var;
        fh.d2 d2Var = new fh.d2(this, context, 20);
        this.f30477s = d2Var;
        d2Var.setOnClickListener(new h70(this, 10));
        xu0 xu0Var = new xu0(context, null);
        this.v = xu0Var;
        xu0Var.setClipToPadding(false);
        d2Var.addView(xu0Var, g7.e6.e(-1, -1, 119));
        ng.b bVar = new ng.b();
        this.h = bVar;
        ig.a aVar = new ig.a(bVar);
        this.f30475n = aVar;
        aVar.d = new pg.i(d2Var);
        aVar.f11131e = d2Var;
        m5.c0 c0Var = new m5.c0(this, 16);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(d2Var, c0Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new v2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f30476r;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 11));
        this.J.addListener(new androidx.fragment.app.g(this, z10, runnable, 6));
        this.J.setInterpolator(gr.h);
        this.J.setDuration(350L);
        this.J.start();
    }

    @Override
    public final void dismiss() {
        if (this.I) {
            return;
        }
        this.I = true;
        c(new jl0(this, 1), false);
        this.f30477s.invalidate();
    }

    public final void e(x60 x60Var) {
        int i9 = org.telegram.ui.ActionBar.f6.E8;
        org.telegram.ui.ActionBar.b6 b6Var = this.f30471b;
        x60Var.T(org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        x60Var.Q(this.f30475n, mg.c.j(b6Var), false);
        this.f30478w = x60Var;
        this.f30480y = x60Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f30470a);
        this.f30479x = frameLayout;
        frameLayout.addView(this.f30480y, g7.e6.c(-2.0f, -2));
        this.v.addView(this.f30479x, g7.e6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ll0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.I;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        fh.d2 d2Var = this.f30477s;
        setContentView(d2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        d2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(d2Var, !org.telegram.ui.ActionBar.f6.I.q());
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
