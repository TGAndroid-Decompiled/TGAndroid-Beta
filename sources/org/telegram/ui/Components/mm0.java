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
public final class mm0 extends Dialog {
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
    public final Context f26542a;
    public final org.telegram.ui.ActionBar.d6 f26543b;
    public Bitmap f26544c;
    public BitmapShader d;
    public Paint e;
    public Matrix f26545f;
    public final fh.b h;
    public final ah.c f26546n;
    public float f26547r;
    public final ai.f0 f26548s;
    public final aw0 v;
    public y70 f26549w;
    public FrameLayout f26550x;
    public ViewGroup f26551y;

    public mm0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f26542a = context;
        this.f26543b = d6Var;
        ai.f0 f0Var = new ai.f0(this, context, 17);
        this.f26548s = f0Var;
        f0Var.setOnClickListener(new i80(this, 10));
        aw0 aw0Var = new aw0(context, null);
        this.v = aw0Var;
        aw0Var.setClipToPadding(false);
        f0Var.addView(aw0Var, w7.y5.e(-1, -1, 119));
        fh.b bVar = new fh.b();
        this.h = bVar;
        ah.c cVar = new ah.c(bVar);
        this.f26546n = cVar;
        cVar.f425f = new hh.k(f0Var);
        cVar.f426g = f0Var;
        ka.c cVar2 = new ka.c(this, 12);
        WeakHashMap weakHashMap = r0.i0.f42129a;
        r0.a0.j(f0Var, cVar2);
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
        float f10 = this.f26547r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new s70(this, 11));
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
        c(new km0(this, 1), false);
        this.f26548s.invalidate();
    }

    public final void e(y70 y70Var) {
        int i10 = org.telegram.ui.ActionBar.h6.E8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26543b;
        y70Var.T(org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)));
        y70Var.Q(this.f26546n, eh.b.k(d6Var), false);
        this.f26549w = y70Var;
        this.f26551y = y70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f26542a);
        this.f26550x = frameLayout;
        frameLayout.addView(this.f26551y, w7.y5.c(-2.0f, -2));
        this.v.addView(this.f26550x, w7.y5.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.u1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm0.f(org.telegram.ui.Cells.u1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        ai.f0 f0Var = this.f26548s;
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
