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
public final class jm0 extends Dialog {
    public static final int L = 0;
    public Drawable B;
    public qg.b C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final Context f28156a;
    public final org.telegram.ui.ActionBar.g6 f28157b;
    public Bitmap f28158c;
    public BitmapShader d;
    public Paint f28159e;
    public Matrix f28160f;
    public final tg.b h;
    public final og.a f28161n;
    public float f28162r;
    public final eg.s2 f28163s;
    public final qv0 v;
    public q70 f28164w;
    public FrameLayout f28165x;
    public ViewGroup f28166y;

    public jm0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, R.style.TransparentDialog);
        this.G = 1.0f;
        this.H = 1.0f;
        this.J = false;
        this.f28156a = context;
        this.f28157b = g6Var;
        eg.s2 s2Var = new eg.s2(this, context, 23);
        this.f28163s = s2Var;
        s2Var.setOnClickListener(new b80(this, 10));
        qv0 qv0Var = new qv0(context, null);
        this.v = qv0Var;
        qv0Var.setClipToPadding(false);
        s2Var.addView(qv0Var, k7.c6.e(-1, -1, 119));
        tg.b bVar = new tg.b();
        this.h = bVar;
        og.a aVar = new og.a(bVar);
        this.f28161n = aVar;
        aVar.d = new vg.i(s2Var);
        aVar.f16754e = s2Var;
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, 6);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(s2Var, f1Var);
    }

    public static void d(Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new v2(callback2, 10), 15.0f);
    }

    public final void c(Runnable runnable, boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f28162r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new k70(this, 11));
        this.K.addListener(new androidx.fragment.app.g(this, z4, runnable, 6));
        this.K.setInterpolator(pr.h);
        this.K.setDuration(350L);
        this.K.start();
    }

    @Override
    public final void dismiss() {
        if (this.J) {
            return;
        }
        this.J = true;
        c(new hm0(this, 1), false);
        this.f28163s.invalidate();
    }

    public final void e(q70 q70Var) {
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f28157b;
        q70Var.T(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
        q70Var.Q(this.f28161n, sg.b.j(g6Var), false);
        this.f28164w = q70Var;
        this.f28166y = q70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f28156a);
        this.f28165x = frameLayout;
        frameLayout.addView(this.f28166y, k7.c6.c(-2.0f, -2));
        this.v.addView(this.f28165x, k7.c6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
    }

    @Override
    public final boolean isShowing() {
        return !this.J;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        eg.s2 s2Var = this.f28163s;
        setContentView(s2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        s2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(s2Var, !org.telegram.ui.ActionBar.k6.I.q());
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
