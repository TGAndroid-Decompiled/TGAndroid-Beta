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
public final class yl0 extends Dialog {
    public static final int K = 0;
    public Drawable A;
    public ng.d B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;
    public final Context f35090a;
    public final org.telegram.ui.ActionBar.c6 f35091b;
    public Bitmap f35092c;
    public BitmapShader d;
    public Paint f35093e;
    public Matrix f35094f;
    public final qg.b h;
    public final lg.a f35095n;
    public float f35096r;
    public final bg.x2 f35097s;
    public final hv0 v;
    public j70 f35098w;
    public FrameLayout f35099x;
    public ViewGroup f35100y;

    public yl0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = false;
        this.f35090a = context;
        this.f35091b = c6Var;
        bg.x2 x2Var = new bg.x2(this, context, 25);
        this.f35097s = x2Var;
        x2Var.setOnClickListener(new u70(this, 10));
        hv0 hv0Var = new hv0(context, null);
        this.v = hv0Var;
        hv0Var.setClipToPadding(false);
        x2Var.addView(hv0Var, i7.f6.e(-1, -1, 119));
        qg.b bVar = new qg.b();
        this.h = bVar;
        lg.a aVar = new lg.a(bVar);
        this.f35095n = aVar;
        aVar.d = new sg.i(x2Var);
        aVar.f15224e = x2Var;
        o1.a aVar2 = new o1.a(this, 10);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(x2Var, aVar2);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new y2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f35096r;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new d70(this, 11));
        this.J.addListener(new androidx.fragment.app.g(this, z10, runnable, 7));
        this.J.setInterpolator(jr.h);
        this.J.setDuration(350L);
        this.J.start();
    }

    @Override
    public final void dismiss() {
        if (this.I) {
            return;
        }
        this.I = true;
        c(new wl0(this, 1), false);
        this.f35097s.invalidate();
    }

    public final void e(j70 j70Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35091b;
        j70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        j70Var.Q(this.f35095n, pg.a.j(c6Var), false);
        this.f35098w = j70Var;
        this.f35100y = j70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f35090a);
        this.f35099x = frameLayout;
        frameLayout.addView(this.f35100y, i7.f6.c(-2.0f, -2));
        this.v.addView(this.f35099x, i7.f6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.s1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yl0.f(org.telegram.ui.Cells.s1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bg.x2 x2Var = this.f35097s;
        setContentView(x2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        x2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(x2Var, !org.telegram.ui.ActionBar.g6.I.q());
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
