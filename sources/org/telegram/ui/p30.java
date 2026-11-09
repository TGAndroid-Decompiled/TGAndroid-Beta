package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
public final class p30 extends Dialog {
    public final di.b3 f48602a;
    public final n00 f48603b;
    public Bitmap f48604c;
    public Paint d;
    public BitmapShader f48605e;
    public final Matrix f48606f;
    public float h;
    public ValueAnimator f48607n;
    public boolean f48608r;

    public p30(Context context, n00 n00Var) {
        super(context, 2131755352);
        this.f48606f = new Matrix();
        this.f48603b = n00Var;
        n00Var.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.fx(12, this, n00Var), 14.0f);
        di.b3 b3Var = new di.b3(this, context, n00Var);
        this.f48602a = b3Var;
        b3Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, o30 o30Var) {
        ValueAnimator valueAnimator = this.f48607n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48607n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f48607n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.f48607n.addListener(new bi.o7(this, f10, o30Var, 4));
        this.f48607n.setDuration(420L);
        this.f48607n.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f48607n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f48608r) {
            return;
        }
        this.f48608r = true;
        b(0.0f, new o30(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        setContentView(this.f48602a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z9 = org.telegram.messenger.r2.f25212a;
        attributes.flags = i7 | (-2013060864);
        org.telegram.messenger.g0.h2();
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        b(1.0f, null);
        org.telegram.messenger.g0.i3(new o30(this, 1), 16L);
    }
}
