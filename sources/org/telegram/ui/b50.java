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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public final class b50 extends Dialog {

    public final jh.a3 f36699a;

    public final ag.s0 f36700b;

    public Bitmap f36701c;
    public Paint d;

    public BitmapShader f36702e;

    public final Matrix f36703f;
    public float h;

    public ValueAnimator f36704n;

    public boolean f36705r;

    public b50(Context context, ag.s0 s0Var) {
        super(context, R.style.TransparentDialog);
        this.f36703f = new Matrix();
        this.f36700b = s0Var;
        s0Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new df(29, this, s0Var), 14.0f);
        jh.a3 a3Var = new jh.a3(this, context, s0Var);
        this.f36699a = a3Var;
        a3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f10, a50 a50Var) {
        ValueAnimator valueAnimator = this.f36704n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36704n = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f36704n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g3(this, 16));
        this.f36704n.addListener(new hh.n5(this, f10, a50Var, 4));
        this.f36704n.setDuration(420L);
        this.f36704n.setInterpolator(org.telegram.ui.Components.er.h);
        this.f36704n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36705r) {
            return;
        }
        this.f36705r = true;
        b(0.0f, new a50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f36699a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i10;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
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
        AndroidUtilities.runOnUIThread(new a50(this, 1), 16L);
    }
}
