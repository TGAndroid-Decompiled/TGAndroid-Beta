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
public final class am0 extends Dialog {
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
    public final Context f22436a;
    public final org.telegram.ui.ActionBar.e6 f22437b;
    public Bitmap f22438c;
    public BitmapShader d;
    public Paint e;
    public Matrix f22439f;
    public final fh.b h;
    public final ah.c f22440n;
    public float f22441r;
    public final ai.f0 f22442s;
    public final pv0 v;
    public n70 f22443w;
    public FrameLayout f22444x;
    public ViewGroup f22445y;

    public am0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f22436a = context;
        this.f22437b = e6Var;
        ai.f0 f0Var = new ai.f0(this, context, 17);
        this.f22442s = f0Var;
        f0Var.setOnClickListener(new x70(this, 10));
        pv0 pv0Var = new pv0(context, null);
        this.v = pv0Var;
        pv0Var.setClipToPadding(false);
        f0Var.addView(pv0Var, w7.x5.e(-1, -1, 119));
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f22440n = cVar;
        cVar.f423f = new hh.k(f0Var);
        cVar.f424g = f0Var;
        k2.c0 c0Var = new k2.c0(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.a0.j(f0Var, c0Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new x2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f22441r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new h70(this, 11));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(qr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new yl0(this, 1), false);
        this.f22442s.invalidate();
    }

    public final void e(n70 n70Var) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f22437b;
        n70Var.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)));
        n70Var.Q(this.f22440n, eh.b.k(e6Var), false);
        this.f22443w = n70Var;
        this.f22445y = n70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f22436a);
        this.f22444x = frameLayout;
        frameLayout.addView(this.f22445y, w7.x5.c(-2.0f, -2));
        this.v.addView(this.f22444x, w7.x5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.f0 f0Var = this.f22442s;
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
        AndroidUtilities.setLightNavigationBar(f0Var, !org.telegram.ui.ActionBar.i6.I.q());
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
