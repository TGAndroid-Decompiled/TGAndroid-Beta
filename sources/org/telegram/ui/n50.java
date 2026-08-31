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
public final class n50 extends Dialog {
    public final oh.b3 f39295a;
    public final fg.h0 f39296b;
    public Bitmap f39297c;
    public Paint d;
    public BitmapShader f39298e;
    public final Matrix f39299f;
    public float h;
    public ValueAnimator f39300n;
    public boolean f39301r;

    public n50(Context context, fg.h0 h0Var) {
        super(context, R.style.TransparentDialog);
        this.f39299f = new Matrix();
        this.f39296b = h0Var;
        h0Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.xk(14, this, h0Var), 14.0f);
        oh.b3 b3Var = new oh.b3(this, context, h0Var);
        this.f39295a = b3Var;
        b3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f10, m50 m50Var) {
        ValueAnimator valueAnimator = this.f39300n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39300n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f39300n = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 16));
        this.f39300n.addListener(new mh.k5(this, f10, m50Var, 2));
        this.f39300n.setDuration(420L);
        this.f39300n.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f39300n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f39301r) {
            return;
        }
        this.f39301r = true;
        b(0.0f, new m50(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f39295a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new m50(this, 1), 16L);
    }
}
