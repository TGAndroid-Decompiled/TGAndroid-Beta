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
public final class k3 extends Dialog {
    public final u3 f21577a;
    public final j3 f21578b;
    public final fg.h0 f21579c;
    public final Paint d;
    public boolean f21580e;

    public k3(u3 u3Var) {
        super(u3Var.mo36getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f21577a = u3Var;
        v3 mo36getWindowView = u3Var.mo36getWindowView();
        fg.h0 h0Var = new fg.h0(this, getContext(), 3);
        this.f21579c = h0Var;
        paint.setColor(k6.w0(null, k6.f21605a7, false));
        j3 j3Var = new j3(mo36getWindowView);
        this.f21578b = j3Var;
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        j3Var.addView(h0Var, k7.c6.e(-1, -2, 80));
        j3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(u3 u3Var) {
        p2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || u3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                k3 k3Var = new k3(u3Var);
                if (u3Var.c(k3Var)) {
                    j3 j3Var = k3Var.f21578b;
                    View view = (View) j3Var.f21494a;
                    AndroidUtilities.removeFromParent(view);
                    j3Var.addView(view, k7.c6.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f21577a.c(null);
        if (!this.f21580e) {
            return;
        }
        this.f21580e = false;
        try {
            super.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void dismiss() {
        this.f21577a.dismiss(false);
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
        j3 j3Var = this.f21578b;
        j3Var.setFitsSystemWindows(true);
        j3Var.setSystemUiVisibility(1792);
        j3Var.setPadding(0, 0, 0, 0);
        j3Var.setOnApplyWindowInsetsListener(new i3(0));
    }
}
