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
public final class bm0 extends Dialog {
    public static final int O = 0;
    public Drawable E;
    public ch.d F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f22780a;
    public final org.telegram.ui.ActionBar.d6 f22781b;
    public Bitmap f22782c;
    public BitmapShader d;
    public Paint e;
    public Matrix f22783f;
    public final fh.b h;
    public final ah.c f22784n;
    public float f22785r;
    public final ai.f0 f22786s;
    public final pv0 v;
    public o70 f22787w;
    public FrameLayout f22788x;
    public ViewGroup f22789y;

    public bm0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f22780a = context;
        this.f22781b = d6Var;
        ai.f0 f0Var = new ai.f0(this, context, 17);
        this.f22786s = f0Var;
        f0Var.setOnClickListener(new y70(this, 10));
        pv0 pv0Var = new pv0(context, null);
        this.v = pv0Var;
        pv0Var.setClipToPadding(false);
        f0Var.addView(pv0Var, w7.x5.e(-1, -1, 119));
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f22784n = cVar;
        cVar.f425f = new hh.k(f0Var);
        cVar.f426g = f0Var;
        k2.b0 b0Var = new k2.b0(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(f0Var, b0Var);
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
        float f10 = this.f22785r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new i70(this, 11));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(rr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new zl0(this, 1), false);
        this.f22786s.invalidate();
    }

    public final void e(o70 o70Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22781b;
        o70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        o70Var.Q(this.f22784n, eh.b.k(d6Var), false);
        this.f22787w = o70Var;
        this.f22789y = o70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f22780a);
        this.f22788x = frameLayout;
        frameLayout.addView(this.f22789y, w7.x5.c(-2.0f, -2));
        this.v.addView(this.f22788x, w7.x5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bm0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.f0 f0Var = this.f22786s;
        setContentView(f0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        f0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(f0Var, !org.telegram.ui.ActionBar.h6.I.q());
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
