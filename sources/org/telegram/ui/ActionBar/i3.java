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
public final class i3 extends Dialog {
    public final s3 f23522a;
    public final h3 f23523b;
    public final cg.h0 f23524c;
    public final Paint d;
    public boolean f23525e;

    public i3(s3 s3Var) {
        super(s3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f23522a = s3Var;
        t3 mo37getWindowView = s3Var.mo37getWindowView();
        cg.h0 h0Var = new cg.h0(this, getContext(), 5);
        this.f23524c = h0Var;
        paint.setColor(g6.w0(null, g6.f23009a7, false));
        h3 h3Var = new h3(mo37getWindowView);
        this.f23523b = h3Var;
        setContentView(h3Var, new ViewGroup.LayoutParams(-1, -1));
        h3Var.addView(h0Var, i7.f6.e(-1, -2, 80));
        h3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(s3 s3Var) {
        o2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || s3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                i3 i3Var = new i3(s3Var);
                if (s3Var.c(i3Var)) {
                    h3 h3Var = i3Var.f23523b;
                    View view = (View) h3Var.f23478a;
                    AndroidUtilities.removeFromParent(view);
                    h3Var.addView(view, i7.f6.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f23522a.c(null);
        if (!this.f23525e) {
            return;
        }
        this.f23525e = false;
        try {
            super.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void dismiss() {
        this.f23522a.dismiss(false);
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
        h3 h3Var = this.f23523b;
        h3Var.setFitsSystemWindows(true);
        h3Var.setSystemUiVisibility(1792);
        h3Var.setPadding(0, 0, 0, 0);
        h3Var.setOnApplyWindowInsetsListener(new g3(0));
    }
}
