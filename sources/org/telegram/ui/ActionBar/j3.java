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
public final class j3 extends Dialog {
    public final t3 f19826a;
    public final i3 f19827b;
    public final eg.h0 f19828c;
    public final Paint d;
    public boolean e;

    public j3(t3 t3Var) {
        super(t3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f19826a = t3Var;
        u3 mo37getWindowView = t3Var.mo37getWindowView();
        eg.h0 h0Var = new eg.h0(this, getContext(), 3);
        this.f19828c = h0Var;
        paint.setColor(j6.w0(null, j6.f19852a7, false));
        i3 i3Var = new i3(mo37getWindowView);
        this.f19827b = i3Var;
        setContentView(i3Var, new ViewGroup.LayoutParams(-1, -1));
        i3Var.addView(h0Var, k7.b6.e(-1, -2, 80));
        i3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(t3 t3Var) {
        p2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || t3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                j3 j3Var = new j3(t3Var);
                if (t3Var.c(j3Var)) {
                    i3 i3Var = j3Var.f19827b;
                    View view = (View) i3Var.f19797a;
                    AndroidUtilities.removeFromParent(view);
                    i3Var.addView(view, k7.b6.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f19826a.c(null);
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
        this.f19826a.dismiss(false);
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
        i3 i3Var = this.f19827b;
        i3Var.setFitsSystemWindows(true);
        i3Var.setSystemUiVisibility(1792);
        i3Var.setPadding(0, 0, 0, 0);
        i3Var.setOnApplyWindowInsetsListener(new h3(0));
    }
}
