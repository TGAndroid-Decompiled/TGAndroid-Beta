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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

public final class h3 extends Dialog {

    public final s3 f23458a;

    public final g3 f23459b;

    public final ag.s0 f23460c;
    public final Paint d;

    public boolean f23461e;

    public h3(s3 s3Var) {
        super(s3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f23458a = s3Var;
        t3 t3VarMo37getWindowView = s3Var.mo37getWindowView();
        ag.s0 s0Var = new ag.s0(this, getContext(), 7);
        this.f23460c = s0Var;
        paint.setColor(g6.w0(null, g6.f22999a7, false));
        g3 g3Var = new g3(t3VarMo37getWindowView);
        this.f23459b = g3Var;
        setContentView(g3Var, new ViewGroup.LayoutParams(-1, -1));
        g3Var.addView(s0Var, h7.z5.e(-1, -2, 80));
        g3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(s3 s3Var) {
        n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || s3Var.b() || AndroidUtilities.hasDialogOnTop(n2VarU)) {
            h3 h3Var = new h3(s3Var);
            if (s3Var.c(h3Var)) {
                g3 g3Var = h3Var.f23459b;
                View view = (View) g3Var.f22975a;
                AndroidUtilities.removeFromParent(view);
                g3Var.addView(view, h7.z5.e(-1, -1, 119));
            }
        }
    }

    public final void c() {
        this.f23458a.c(null);
        if (this.f23461e) {
            this.f23461e = false;
            try {
                super.dismiss();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    @Override
    public final void dismiss() {
        this.f23458a.dismiss(false);
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
        g3 g3Var = this.f23459b;
        g3Var.setFitsSystemWindows(true);
        g3Var.setSystemUiVisibility(1792);
        g3Var.setPadding(0, 0, 0, 0);
        g3Var.setOnApplyWindowInsetsListener(new f3(0));
    }
}
