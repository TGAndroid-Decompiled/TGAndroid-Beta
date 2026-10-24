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
public final class bn0 extends Dialog {
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
    public final Context f25053a;
    public final org.telegram.ui.ActionBar.g6 f25054b;
    public Bitmap f25055c;
    public BitmapShader d;
    public Paint e;
    public Matrix f25056f;
    public final gh.b h;
    public final bh.b f25057n;
    public float f25058r;
    public final ah.x f25059s;
    public final nw0 v;
    public h80 f25060w;
    public FrameLayout f25061x;
    public ViewGroup f25062y;

    public bn0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f25053a = context;
        this.f25054b = g6Var;
        ah.x xVar = new ah.x(this, context, 20);
        this.f25059s = xVar;
        xVar.setOnClickListener(new t80(this, 9));
        nw0 nw0Var = new nw0(context, null);
        this.v = nw0Var;
        nw0Var.setClipToPadding(false);
        xVar.addView(nw0Var, w7.z5.e(-1, -1, 119));
        gh.b bVar = new gh.b();
        this.h = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.f25057n = bVar2;
        bVar2.f4365f = new ih.k(xVar);
        bVar2.f4366g = xVar;
        le.b bVar3 = new le.b(this, 11);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(xVar, bVar3);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new x2(callback2, 11), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f25058r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new b80(this, 12));
        this.N.addListener(new ah.q0(this, z10, runnable, 6));
        this.N.setInterpolator(zr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new zm0(this, 1), false);
        this.f25059s.invalidate();
    }

    public final void e(h80 h80Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25054b;
        h80Var.T(org.telegram.ui.ActionBar.k6.o1(0.06f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
        h80Var.Q(this.f25057n, fh.c.k(g6Var), false);
        this.f25060w = h80Var;
        this.f25062y = h80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f25053a);
        this.f25061x = frameLayout;
        frameLayout.addView(this.f25062y, w7.z5.c(-2.0f, -2));
        this.v.addView(this.f25061x, w7.z5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ah.x xVar = this.f25059s;
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
