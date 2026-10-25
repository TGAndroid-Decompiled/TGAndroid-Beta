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
public final class hn0 extends Dialog {
    public static final int O = 0;
    public Drawable E;
    public eh.d F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public ValueAnimator N;
    public final Context f29018a;
    public final org.telegram.ui.ActionBar.u6 f29019b;
    public Bitmap f29020c;
    public BitmapShader d;
    public Paint e;
    public Matrix f29021f;
    public final hh.b h;
    public final ch.b f29022n;
    public float f29023r;
    public final bh.r f29024s;
    public final vw0 v;
    public k80 f29025w;
    public FrameLayout f29026x;
    public ViewGroup f29027y;

    public hn0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, R.style.TransparentDialog);
        this.J = 1.0f;
        this.K = 1.0f;
        this.M = false;
        this.f29018a = context;
        this.f29019b = u6Var;
        bh.r rVar = new bh.r(this, context, 21);
        this.f29024s = rVar;
        rVar.setOnClickListener(new w80(this, 8));
        vw0 vw0Var = new vw0(context, null);
        this.v = vw0Var;
        vw0Var.setClipToPadding(false);
        rVar.addView(vw0Var, gb1.i(-1, -1, 119));
        hh.b bVar = new hh.b();
        this.h = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.f29022n = bVar2;
        bVar2.f6301f = new jh.k(rVar);
        bVar2.f6302g = rVar;
        jg.s0 s0Var = new jg.s0(this, 21);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(rVar, s0Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new b3(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f29023r;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new e80(this, 12));
        this.N.addListener(new ai.l0(this, z10, runnable, 8));
        this.N.setInterpolator(ds.h);
        this.N.setDuration(350L);
        this.N.start();
    }

    @Override
    public final void dismiss() {
        if (this.M) {
            return;
        }
        this.M = true;
        c(new fn0(this, 1), false);
        this.f29024s.invalidate();
    }

    public final void e(k80 k80Var) {
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f29019b;
        k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        k80Var.Q(this.f29022n, gh.c.k(u6Var), false);
        this.f29025w = k80Var;
        this.f29027y = k80Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f29018a);
        this.f29026x = frameLayout;
        frameLayout.addView(this.f29027y, gb1.g(-2.0f, -2));
        this.v.addView(this.f29026x, gb1.g(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.s1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hn0.f(org.telegram.ui.Cells.s1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        bh.r rVar = this.f29024s;
        setContentView(rVar, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        rVar.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(rVar, !org.telegram.ui.ActionBar.y6.I.q());
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
