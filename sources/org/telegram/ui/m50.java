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
    public final ai.n4 f35468a;
    public final n50 f35469b;
    public Bitmap f35470c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f35471f;
    public float h;
    public ValueAnimator f35472n;
    public boolean f35473r;

    public m50(Context context, n50 n50Var) {
        super(context, R.style.TransparentDialog);
        this.f35471f = new Matrix();
        this.f35469b = n50Var;
        n50Var.setVisibility(4);
        AndroidUtilities.makeGlobalBlurBitmap(new bt(4, this, n50Var), 14.0f);
        ai.n4 n4Var = new ai.n4(this, context, n50Var);
        this.f35468a = n4Var;
        n4Var.setOnClickListener(new a(this, 29));
    }

    public final void b(float f7, l50 l50Var) {
        ValueAnimator valueAnimator = this.f35472n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35472n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f35472n = ofFloat;
        ofFloat.addUpdateListener(new c3(this, 16));
        this.f35472n.addListener(new ai.t2(this, f7, l50Var, 3));
        this.f35472n.setDuration(420L);
        this.f35472n.setInterpolator(org.telegram.ui.Components.rr.h);
        this.f35472n.start();
    }

    @Override
    public final void dismiss() {
        if (this.f35473r) {
            return;
        }
        this.f35473r = true;
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
        setContentView(this.f35468a, new ViewGroup.LayoutParams(-1, -1));
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
