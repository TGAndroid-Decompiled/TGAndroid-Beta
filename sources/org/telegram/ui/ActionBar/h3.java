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
    public final s3 f18944a;
    public final g3 f18945b;
    public final bb f18946c;
    public final Paint d;
    public boolean e;

    public h3(s3 s3Var) {
        super(s3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18944a = s3Var;
        t3 mo37getWindowView = s3Var.mo37getWindowView();
        bb bbVar = new bb(this, getContext(), 8);
        this.f18946c = bbVar;
        paint.setColor(h6.w0(null, h6.f18989a7, false));
        g3 g3Var = new g3(mo37getWindowView);
        this.f18945b = g3Var;
        setContentView(g3Var, new ViewGroup.LayoutParams(-1, -1));
        g3Var.addView(bbVar, w7.y5.e(-1, -2, 80));
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
                    g3 g3Var = h3Var.f18945b;
                    View view = (View) g3Var.f18901a;
                    AndroidUtilities.removeFromParent(view);
                    g3Var.addView(view, w7.y5.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f18944a.c(null);
        if (!this.e) {
            return;
        }
        this.e = false;
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void dismiss() {
        this.f18944a.dismiss(false);
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
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        g3 g3Var = this.f18945b;
        g3Var.setFitsSystemWindows(true);
        g3Var.setSystemUiVisibility(1792);
        g3Var.setPadding(0, 0, 0, 0);
        g3Var.setOnApplyWindowInsetsListener(new f3(0));
    }
}
