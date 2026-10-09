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
public final class gn0 extends Dialog {
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
    public final Context f26815a;
    public final org.telegram.ui.ActionBar.e6 f26816b;
    public Bitmap f26817c;
    public BitmapShader d;
    public Paint f26818e;
    public Matrix f26819f;
    public final fh.b h;
    public final ah.c f26820n;
    public float f26821r;
    public final ai.f0 f26822s;
    public final sw0 v;
    public p80 f26823w;
    public FrameLayout f26824x;
    public ViewGroup f26825y;

    public gn0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f26815a = context;
        this.f26816b = e6Var;
        ai.f0 f0Var = new ai.f0(this, context, 17);
        this.f26822s = f0Var;
        f0Var.setOnClickListener(new b90(this, 9));
        sw0 sw0Var = new sw0(context, null);
        this.v = sw0Var;
        sw0Var.setClipToPadding(false);
        f0Var.addView(sw0Var, w7.x5.e(-1, -1, 119));
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f26820n = cVar;
        cVar.f545f = new hh.j(f0Var);
        cVar.f546g = f0Var;
        m.f3 f3Var = new m.f3(this, 9);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(f0Var, f3Var);
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
        float f10 = this.f26821r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new j80(this, 12));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(hs.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new en0(this, 1), false);
        this.f26822s.invalidate();
    }

    public final void e(p80 p80Var) {
        int i10 = org.telegram.ui.ActionBar.i6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.f26816b;
        p80Var.T(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        p80Var.Q(this.f26820n, eh.b.k(e6Var), false);
        this.f26823w = p80Var;
        this.f26825y = p80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f26815a);
        this.f26824x = frameLayout;
        frameLayout.addView(this.f26825y, w7.x5.d(-2.0f, -2));
        this.v.addView(this.f26824x, w7.x5.d(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.u1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gn0.f(org.telegram.ui.Cells.u1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.f0 f0Var = this.f26822s;
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
