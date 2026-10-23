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
public final class l3 extends Dialog {
    public final w3 f21603a;
    public final k3 f21604b;
    public final j3 f21605c;
    public final Paint d;
    public boolean e;

    public l3(w3 w3Var) {
        super(w3Var.mo36getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f21603a = w3Var;
        x3 mo36getWindowView = w3Var.mo36getWindowView();
        j3 j3Var = new j3(this, getContext());
        this.f21605c = j3Var;
        paint.setColor(k6.x0(null, k6.f21125a7, false));
        k3 k3Var = new k3(mo36getWindowView);
        this.f21604b = k3Var;
        setContentView(k3Var, new ViewGroup.LayoutParams(-1, -1));
        k3Var.addView(j3Var, w7.z5.e(-1, -2, 80));
        k3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(w3 w3Var) {
        o2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || w3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                l3 l3Var = new l3(w3Var);
                if (w3Var.c(l3Var)) {
                    k3 k3Var = l3Var.f21604b;
                    View view = (View) k3Var.f21096a;
                    AndroidUtilities.removeFromParent(view);
                    k3Var.addView(view, w7.z5.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f21603a.c(null);
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
        this.f21603a.dismiss(false);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
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
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        k3 k3Var = this.f21604b;
        k3Var.setFitsSystemWindows(true);
        k3Var.setSystemUiVisibility(1792);
        k3Var.setPadding(0, 0, 0, 0);
        k3Var.setOnApplyWindowInsetsListener(new i3(0));
    }
}
