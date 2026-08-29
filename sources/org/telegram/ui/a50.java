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
public final class a50 extends Dialog {
    public final lh.z2 f36428a;
    public final cg.h0 f36429b;
    public Bitmap f36430c;
    public Paint d;
    public BitmapShader f36431e;
    public final Matrix f36432f;
    public float h;
    public ValueAnimator f36433n;
    public boolean f36434r;

    public a50(Context context, cg.h0 h0Var) {
        super(context, R.style.TransparentDialog);
        this.f36432f = new Matrix();
        this.f36429b = h0Var;
        h0Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new tm(22, this, h0Var), 14.0f);
        lh.z2 z2Var = new lh.z2(this, context, h0Var);
        this.f36428a = z2Var;
        z2Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f9, z40 z40Var) {
        ValueAnimator valueAnimator = this.f36433n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36433n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f9);
        this.f36433n = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 16));
        this.f36433n.addListener(new jh.l5(this, f9, z40Var, 4));
        this.f36433n.setDuration(420L);
        this.f36433n.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f36433n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36434r) {
            return;
        }
        this.f36434r = true;
        b(0.0f, new z40(this, 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f36428a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new z40(this, 1), 16L);
    }
}
