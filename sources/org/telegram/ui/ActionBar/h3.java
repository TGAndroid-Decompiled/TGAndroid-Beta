package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class h3 extends Dialog {
    public final s3 f20683a;
    public final g3 f20684b;
    public final bb f20685c;
    public final Paint d;
    public boolean f20686e;

    public h3(s3 s3Var) {
        super(s3Var.mo36getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f20683a = s3Var;
        t3 mo36getWindowView = s3Var.mo36getWindowView();
        bb bbVar = new bb(this, getContext(), 8);
        this.f20685c = bbVar;
        paint.setColor(h6.x0(null, h6.f20730a7, false));
        g3 g3Var = new g3(mo36getWindowView);
        this.f20684b = g3Var;
        setContentView(g3Var, new ViewGroup.LayoutParams(-1, -1));
        g3Var.addView(bbVar, w7.x5.e(-1, -2, 80));
        g3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(s3 s3Var) {
        m2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || s3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                h3 h3Var = new h3(s3Var);
                if (s3Var.c(h3Var)) {
                    g3 g3Var = h3Var.f20684b;
                    View view = (View) g3Var.f20637a;
                    AndroidUtilities.removeFromParent(view);
                    g3Var.addView(view, w7.x5.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f20683a.c(null);
        if (!this.f20686e) {
            return;
        }
        this.f20686e = false;
        try {
            super.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void dismiss() {
        this.f20683a.dismiss(false);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        g3 g3Var = this.f20684b;
        g3Var.setFitsSystemWindows(true);
        g3Var.setSystemUiVisibility(1792);
        g3Var.setPadding(0, 0, 0, 0);
        g3Var.setOnApplyWindowInsetsListener(new f3(0));
    }
}
