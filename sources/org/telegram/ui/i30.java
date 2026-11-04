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
public final class i30 extends Dialog {
    public final ei.e3 f46044a;
    public final org.telegram.ui.Components.voip.r0 f46045b;
    public Bitmap f46046c;
    public Paint d;
    public BitmapShader f46047e;
    public final Matrix f46048f;
    public float h;
    public ValueAnimator f46049n;
    public boolean f46050r;

    public i30(Context context, org.telegram.ui.Components.voip.r0 r0Var) {
        super(context, 2131755352);
        this.f46048f = new Matrix();
        this.f46045b = r0Var;
        r0Var.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ei(15, this, r0Var), 14.0f);
        ei.e3 e3Var = new ei.e3(this, context, r0Var);
        this.f46044a = e3Var;
        e3Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, h30 h30Var) {
        ValueAnimator valueAnimator = this.f46049n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46049n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f46049n = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 13));
        this.f46049n.addListener(new ci.p6(this, f10, h30Var, 4));
        this.f46049n.setDuration(420L);
        this.f46049n.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f46049n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f46050r) {
            return;
        }
        this.f46050r = true;
        b(0.0f, new h30(this, 0));
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
        setContentView(this.f46044a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i3;
        boolean z10 = org.telegram.messenger.r2.f25040a;
        attributes.flags = i3 | (-2013060864);
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
        org.telegram.messenger.g0.i3(new h30(this, 1), 16L);
    }
}
