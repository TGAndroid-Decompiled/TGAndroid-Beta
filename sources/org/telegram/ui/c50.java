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
public final class c50 extends Dialog {
    public final ci.i3 f35834a;
    public final x10 f35835b;
    public Bitmap f35836c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f35837f;
    public float h;
    public ValueAnimator f35838n;
    public boolean f35839r;

    public c50(Context context, x10 x10Var) {
        super(context, R.style.TransparentDialog);
        this.f35837f = new Matrix();
        this.f35835b = x10Var;
        x10Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.qy(10, this, x10Var), 14.0f);
        ci.i3 i3Var = new ci.i3(this, context, x10Var);
        this.f35834a = i3Var;
        i3Var.setOnClickListener(new a(this, 28));
    }

    public final void b(float f7, b50 b50Var) {
        ValueAnimator valueAnimator = this.f35838n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35838n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f35838n = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 16));
        this.f35838n.addListener(new ai.o7(this, f7, b50Var, 4));
        this.f35838n.setDuration(420L);
        this.f35838n.setInterpolator(org.telegram.ui.Components.bs.h);
        this.f35838n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f35839r) {
            return;
        }
        this.f35839r = true;
        b(0.0f, new b50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f35834a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new b50(this, 1), 16L);
    }
}
