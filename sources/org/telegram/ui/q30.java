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
    public final fi.u2 f51074a;
    public final uv f51075b;
    public Bitmap f51076c;
    public Paint d;
    public BitmapShader f51077e;
    public final Matrix f51078f;
    public float h;
    public ValueAnimator f51079n;
    public boolean f51080r;

    public q30(Context context, uv uvVar) {
        super(context, 2131755352);
        this.f51078f = new Matrix();
        this.f51075b = uvVar;
        uvVar.setVisibility(4);
        org.telegram.messenger.g0.l2(new org.telegram.ui.Components.ph(16, this, uvVar), 14.0f);
        fi.u2 u2Var = new fi.u2(this, context, uvVar);
        this.f51074a = u2Var;
        u2Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f10, p30 p30Var) {
        ValueAnimator valueAnimator = this.f51079n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51079n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f51079n = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 13));
        this.f51079n.addListener(new di.j6(this, f10, p30Var, 4));
        this.f51079n.setDuration(420L);
        this.f51079n.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f51079n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f51080r) {
            return;
        }
        this.f51080r = true;
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
        setContentView(this.f51074a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i7;
        boolean z10 = org.telegram.messenger.s2.f26723a;
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
