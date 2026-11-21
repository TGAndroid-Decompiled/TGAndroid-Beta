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
public final class q30 extends Dialog {
    public final fi.u2 f51041a;
    public final uv f51042b;
    public Bitmap f51043c;
    public Paint d;
    public BitmapShader f51044e;
    public final Matrix f51045f;
    public float h;
    public ValueAnimator f51046n;
    public boolean f51047r;

    public q30(Context context, uv uvVar) {
        super(context, 2131755352);
        this.f51045f = new Matrix();
        this.f51042b = uvVar;
        uvVar.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.rh(16, this, uvVar), 14.0f);
        fi.u2 u2Var = new fi.u2(this, context, uvVar);
        this.f51041a = u2Var;
        u2Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, p30 p30Var) {
        ValueAnimator valueAnimator = this.f51046n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51046n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f51046n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.f51046n.addListener(new di.j6(this, f10, p30Var, 4));
        this.f51046n.setDuration(420L);
        this.f51046n.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f51046n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f51047r) {
            return;
        }
        this.f51047r = true;
        b(0.0f, new p30(this, 0));
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
        setContentView(this.f51041a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.f26749a;
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
        org.telegram.messenger.g0.h3(new p30(this, 1), 16L);
    }
}
