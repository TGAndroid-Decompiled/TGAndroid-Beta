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
public final class e50 extends Dialog {
    public final di.h3 f38989a;
    public final z10 f38990b;
    public Bitmap f38991c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f38992f;
    public float h;
    public ValueAnimator f38993n;
    public boolean f38994r;

    public e50(Context context, z10 z10Var) {
        super(context, R.style.TransparentDialog);
        this.f38992f = new Matrix();
        this.f38990b = z10Var;
        z10Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(12, this, z10Var), 14.0f);
        di.h3 h3Var = new di.h3(this, context, z10Var);
        this.f38989a = h3Var;
        h3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, d50 d50Var) {
        ValueAnimator valueAnimator = this.f38993n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38993n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f38993n = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 14));
        this.f38993n.addListener(new bi.l7(this, f7, d50Var, 4));
        this.f38993n.setDuration(420L);
        this.f38993n.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f38993n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f38994r) {
            return;
        }
        this.f38994r = true;
        b(0.0f, new d50(this, 0));
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
        setContentView(this.f38989a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new d50(this, 1), 16L);
    }
}
