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
public final class km0 extends Dialog {
    public static final int O = 0;
    public Drawable E;
    public bh.d F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f24751a;
    public final org.telegram.ui.ActionBar.f6 f24752b;
    public Bitmap f24753c;
    public BitmapShader d;
    public Paint e;
    public Matrix f24754f;
    public final eh.b h;
    public final zg.a f24755n;
    public float f24756r;
    public final bi.ld f24757s;
    public final aw0 v;
    public w70 f24758w;
    public FrameLayout f24759x;
    public ViewGroup f24760y;

    public km0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f24751a = context;
        this.f24752b = f6Var;
        bi.ld ldVar = new bi.ld(this, context, 15);
        this.f24757s = ldVar;
        ldVar.setOnClickListener(new g80(this, 10));
        aw0 aw0Var = new aw0(context, null);
        this.v = aw0Var;
        aw0Var.setClipToPadding(false);
        ldVar.addView(aw0Var, w7.a6.e(-1, -1, 119));
        eh.b bVar = new eh.b();
        this.h = bVar;
        zg.a aVar = new zg.a(bVar);
        this.f24755n = aVar;
        aVar.d = new gh.k(ldVar);
        aVar.e = ldVar;
        l2.g gVar = new l2.g(this, 10);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(ldVar, gVar);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new y2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f24756r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new q70(this, 11));
        this.N.addListener(new androidx.fragment.app.g(this, z10, runnable, 5));
        this.N.setInterpolator(wr.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new im0(this, 1), false);
        this.f24757s.invalidate();
    }

    public final void e(w70 w70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f24752b;
        w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        w70Var.R(this.f24755n, dh.c.k(f6Var), false);
        this.f24758w = w70Var;
        this.f24760y = w70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f24751a);
        this.f24759x = frameLayout;
        frameLayout.addView(this.f24760y, w7.a6.c(-2.0f, -2));
        this.v.addView(this.f24759x, w7.a6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bi.ld ldVar = this.f24757s;
        setContentView(ldVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        ldVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ldVar, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        d(new e(this, 19));
        c(null, true);
    }
}
