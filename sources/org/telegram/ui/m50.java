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
public final class m50 extends Dialog {
    public final nh.a3 f36190a;
    public final eg.h0 f36191b;
    public Bitmap f36192c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f36193f;
    public float h;
    public ValueAnimator f36194n;
    public boolean f36195r;

    public m50(Context context, eg.h0 h0Var) {
        super(context, R.style.TransparentDialog);
        this.f36193f = new Matrix();
        this.f36191b = h0Var;
        h0Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.Components.vk(14, this, h0Var), 14.0f);
        nh.a3 a3Var = new nh.a3(this, context, h0Var);
        this.f36190a = a3Var;
        a3Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f10, l50 l50Var) {
        ValueAnimator valueAnimator = this.f36194n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36194n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f36194n = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 16));
        this.f36194n.addListener(new lh.k5(this, f10, l50Var, 2));
        this.f36194n.setDuration(420L);
        this.f36194n.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f36194n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f36195r) {
            return;
        }
        this.f36195r = true;
        b(0.0f, new l50(this, 0));
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
        setContentView(this.f36190a, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new l50(this, 1), 16L);
    }
}
