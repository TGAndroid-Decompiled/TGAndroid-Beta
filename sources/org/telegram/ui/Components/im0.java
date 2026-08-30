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
public final class im0 extends Dialog {
    public static final int L = 0;
    public Drawable B;
    public pg.b C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final Context f25746a;
    public final org.telegram.ui.ActionBar.f6 f25747b;
    public Bitmap f25748c;
    public BitmapShader d;
    public Paint e;
    public Matrix f25749f;
    public final sg.b h;
    public final ng.a f25750n;
    public float f25751r;
    public final dg.u2 f25752s;
    public final qv0 v;
    public o70 f25753w;
    public FrameLayout f25754x;
    public ViewGroup f25755y;

    public im0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, R.style.TransparentDialog);
        this.G = 1.0f;
        this.H = 1.0f;
        this.J = false;
        this.f25746a = context;
        this.f25747b = f6Var;
        dg.u2 u2Var = new dg.u2(this, context, 23);
        this.f25752s = u2Var;
        u2Var.setOnClickListener(new z70(this, 10));
        qv0 qv0Var = new qv0(context, null);
        this.v = qv0Var;
        qv0Var.setClipToPadding(false);
        u2Var.addView(qv0Var, k7.b6.e(-1, -1, 119));
        sg.b bVar = new sg.b();
        this.h = bVar;
        ng.a aVar = new ng.a(bVar);
        this.f25750n = aVar;
        aVar.d = new ug.i(u2Var);
        aVar.e = u2Var;
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, 6);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(u2Var, f1Var);
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
        float f11 = this.f25751r;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new i70(this, 11));
        this.K.addListener(new androidx.fragment.app.g(this, z4, runnable, 6));
        this.K.setInterpolator(nr.h);
        this.K.setDuration(350L);
        this.K.start();
    }

    @Override
    public final void dismiss() {
        if (this.J) {
            return;
        }
        this.J = true;
        c(new gm0(this, 1), false);
        this.f25752s.invalidate();
    }

    public final void e(o70 o70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25747b;
        o70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        o70Var.Q(this.f25750n, rg.b.j(f6Var), false);
        this.f25753w = o70Var;
        this.f25755y = o70Var.A;
        FrameLayout frameLayout = new FrameLayout(this.f25746a);
        this.f25754x = frameLayout;
        frameLayout.addView(this.f25755y, k7.b6.c(-2.0f, -2));
        this.v.addView(this.f25754x, k7.b6.c(-2.0f, -2));
    }

    public final void f(org.telegram.ui.Cells.t1 r30, android.text.style.CharacterStyle r31, java.lang.CharSequence r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im0.f(org.telegram.ui.Cells.t1, android.text.style.CharacterStyle, java.lang.CharSequence, boolean):void");
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
        dg.u2 u2Var = this.f25752s;
        setContentView(u2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        u2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(u2Var, !org.telegram.ui.ActionBar.j6.I.q());
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
