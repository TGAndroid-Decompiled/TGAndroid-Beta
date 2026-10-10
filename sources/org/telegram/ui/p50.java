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
public final class p50 extends Dialog {
    public final ai.o4 f40713a;
    public final q50 f40714b;
    public Bitmap f40715c;
    public Paint d;
    public BitmapShader f40716e;
    public final Matrix f40717f;
    public float h;
    public ValueAnimator f40718n;
    public boolean f40719r;

    public p50(Context context, q50 q50Var) {
        super(context, R.style.TransparentDialog);
        this.f40717f = new Matrix();
        this.f40714b = q50Var;
        q50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new ft(4, this, q50Var), 14.0f);
        ai.o4 o4Var = new ai.o4(this, context, q50Var);
        this.f40713a = o4Var;
        o4Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f7, o50 o50Var) {
        ValueAnimator valueAnimator = this.f40718n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40718n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f40718n = ofFloat;
        ofFloat.addUpdateListener(new c3(this, 16));
        this.f40718n.addListener(new ai.u2(this, f7, o50Var, 3));
        this.f40718n.setDuration(420L);
        this.f40718n.setInterpolator(org.telegram.ui.Components.is.h);
        this.f40718n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f40719r) {
            return;
        }
        this.f40719r = true;
        b(0.0f, new o50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f40713a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new o50(this, 1), 16L);
    }
}
