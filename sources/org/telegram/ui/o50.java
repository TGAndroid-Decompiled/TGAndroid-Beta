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
public final class o50 extends Dialog {
    public final nh.a3 f36650a;
    public final eg.h0 f36651b;
    public Bitmap f36652c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f36653f;
    public float h;
    public ValueAnimator f36654n;
    public boolean f36655r;

    public o50(Context context, eg.h0 h0Var) {
        super(context, R.style.TransparentDialog);
        this.f36653f = new Matrix();
        this.f36651b = h0Var;
        h0Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.vk(14, this, h0Var), 14.0f);
        nh.a3 a3Var = new nh.a3(this, context, h0Var);
        this.f36650a = a3Var;
        a3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f10, n50 n50Var) {
        ValueAnimator valueAnimator = this.f36654n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36654n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f36654n = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 16));
        this.f36654n.addListener(new lh.k5(this, f10, n50Var, 2));
        this.f36654n.setDuration(420L);
        this.f36654n.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f36654n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36655r) {
            return;
        }
        this.f36655r = true;
        b(0.0f, new n50(this, 0));
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
        setContentView(this.f36650a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new n50(this, 1), 16L);
    }
}
