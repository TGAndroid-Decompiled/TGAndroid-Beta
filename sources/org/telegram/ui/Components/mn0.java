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
public final class mn0 extends Dialog {
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
    public final Context f28594a;
    public final org.telegram.ui.ActionBar.c6 f28595b;
    public Bitmap f28596c;
    public BitmapShader d;
    public Paint f28597e;
    public Matrix f28598f;
    public final fh.b h;
    public final ah.c f28599n;
    public float f28600r;
    public final ai.f0 f28601s;
    public final yw0 v;
    public s80 f28602w;
    public FrameLayout f28603x;
    public ViewGroup f28604y;

    public mn0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f28594a = context;
        this.f28595b = c6Var;
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.f28601s = f0Var;
        f0Var.setOnClickListener(new f90(this, 10));
        yw0 yw0Var = new yw0(context, null);
        this.v = yw0Var;
        yw0Var.setClipToPadding(false);
        f0Var.addView(yw0Var, w7.w5.e(-1, -1, 119));
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f28599n = cVar;
        cVar.f547f = new hh.j(f0Var);
        cVar.f548g = f0Var;
        k2.g0 g0Var = new k2.g0(this, 14);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(f0Var, g0Var);
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
        float f10 = this.f28600r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new m80(this, 12));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(js.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new kn0(this, 1), false);
        this.f28601s.invalidate();
    }

    public final void e(s80 s80Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28595b;
        s80Var.T(org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)));
        s80Var.Q(this.f28599n, eh.b.k(c6Var), false);
        this.f28602w = s80Var;
        this.f28604y = s80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f28594a);
        this.f28603x = frameLayout;
        frameLayout.addView(this.f28604y, w7.w5.d(-2.0f, -2));
        this.v.addView(this.f28603x, w7.w5.d(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.u1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mn0.f(org.telegram.ui.Cells.u1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.f0 f0Var = this.f28601s;
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
