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
public final class g50 extends Dialog {
    public final di.h3 f39507a;
    public final b20 f39508b;
    public Bitmap f39509c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f39510f;
    public float h;
    public ValueAnimator f39511n;
    public boolean f39512r;

    public g50(Context context, b20 b20Var) {
        super(context, R.style.TransparentDialog);
        this.f39510f = new Matrix();
        this.f39508b = b20Var;
        b20Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.oy(12, this, b20Var), 14.0f);
        di.h3 h3Var = new di.h3(this, context, b20Var);
        this.f39507a = h3Var;
        h3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, f50 f50Var) {
        ValueAnimator valueAnimator = this.f39511n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39511n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f39511n = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 14));
        this.f39511n.addListener(new bi.l7(this, f7, f50Var, 4));
        this.f39511n.setDuration(420L);
        this.f39511n.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f39511n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f39512r) {
            return;
        }
        this.f39512r = true;
        b(0.0f, new f50(this, 0));
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
        setContentView(this.f39507a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new f50(this, 1), 16L);
    }
}
