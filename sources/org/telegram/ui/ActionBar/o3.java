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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
public final class o3 extends Dialog {
    public final y3 f22912a;
    public final n3 f22913b;
    public final m3 f22914c;
    public final Paint d;
    public boolean e;

    public o3(y3 y3Var) {
        super(y3Var.mo36getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f22912a = y3Var;
        z3 mo36getWindowView = y3Var.mo36getWindowView();
        m3 m3Var = new m3(this, getContext());
        this.f22914c = m3Var;
        paint.setColor(y6.x0(null, y6.f23297a7, false));
        n3 n3Var = new n3(mo36getWindowView);
        this.f22913b = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        n3Var.addView(m3Var, gb1.i(-1, -2, 80));
        n3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(y3 y3Var) {
        r2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || y3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                o3 o3Var = new o3(y3Var);
                if (y3Var.c(o3Var)) {
                    n3 n3Var = o3Var.f22913b;
                    View view = (View) n3Var.f22891a;
                    AndroidUtilities.removeFromParent(view);
                    n3Var.addView(view, gb1.i(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f22912a.c(null);
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
        this.f22912a.dismiss(false);
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
        n3 n3Var = this.f22913b;
        n3Var.setFitsSystemWindows(true);
        n3Var.setSystemUiVisibility(1792);
        n3Var.setPadding(0, 0, 0, 0);
        n3Var.setOnApplyWindowInsetsListener(new l3(0));
    }
}
