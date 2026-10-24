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
public final class d50 extends Dialog {
    public final ci.h3 f36472a;
    public final e50 f36473b;
    public Bitmap f36474c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f36475f;
    public float h;
    public ValueAnimator f36476n;
    public boolean f36477r;

    public d50(Context context, e50 e50Var) {
        super(context, R.style.TransparentDialog);
        this.f36475f = new Matrix();
        this.f36473b = e50Var;
        e50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(10, this, e50Var), 14.0f);
        ci.h3 h3Var = new ci.h3(this, context, e50Var);
        this.f36472a = h3Var;
        h3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, c50 c50Var) {
        ValueAnimator valueAnimator = this.f36476n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36476n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f36476n = ofFloat;
        ofFloat.addUpdateListener(new d3(this, 16));
        this.f36476n.addListener(new ai.p7(this, f7, c50Var, 4));
        this.f36476n.setDuration(420L);
        this.f36476n.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f36476n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36477r) {
            return;
        }
        this.f36477r = true;
        b(0.0f, new c50(this, 0));
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
        setContentView(this.f36472a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new c50(this, 1), 16L);
    }
}
