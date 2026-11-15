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
public final class n30 extends Dialog {
    public final fi.w2 f49431a;
    public final rv f49432b;
    public Bitmap f49433c;
    public Paint d;
    public BitmapShader f49434e;
    public final Matrix f49435f;
    public float h;
    public ValueAnimator f49436n;
    public boolean f49437r;

    public n30(Context context, rv rvVar) {
        super(context, 2131755352);
        this.f49435f = new Matrix();
        this.f49432b = rvVar;
        rvVar.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.gh(17, this, rvVar), 14.0f);
        fi.w2 w2Var = new fi.w2(this, context, rvVar);
        this.f49431a = w2Var;
        w2Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, m30 m30Var) {
        ValueAnimator valueAnimator = this.f49436n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49436n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f49436n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.f49436n.addListener(new di.g6(this, f10, m30Var, 4));
        this.f49436n.setDuration(420L);
        this.f49436n.setInterpolator(org.telegram.ui.Components.er.h);
        this.f49436n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f49437r) {
            return;
        }
        this.f49437r = true;
        b(0.0f, new m30(this, 0));
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
        setContentView(this.f49431a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.r2.f26206a;
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
        org.telegram.messenger.g0.i3(new m30(this, 1), 16L);
    }
}
