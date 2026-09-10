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
import bi.nc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class k3 extends Dialog {
    public final w3 f18341a;
    public final j3 f18342b;
    public final nc f18343c;
    public final Paint d;
    public boolean e;

    public k3(w3 w3Var) {
        super(w3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18341a = w3Var;
        x3 mo37getWindowView = w3Var.mo37getWindowView();
        nc ncVar = new nc(this, getContext(), 8);
        this.f18343c = ncVar;
        paint.setColor(j6.w0(null, j6.f17872a7, false));
        j3 j3Var = new j3(mo37getWindowView);
        this.f18342b = j3Var;
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        j3Var.addView(ncVar, w7.a6.e(-1, -2, 80));
        j3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(w3 w3Var) {
        p2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || w3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                k3 k3Var = new k3(w3Var);
                if (w3Var.c(k3Var)) {
                    j3 j3Var = k3Var.f18342b;
                    View view = (View) j3Var.f17857a;
                    AndroidUtilities.removeFromParent(view);
                    j3Var.addView(view, w7.a6.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f18341a.c(null);
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
        this.f18341a.dismiss(false);
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
        j3 j3Var = this.f18342b;
        j3Var.setFitsSystemWindows(true);
        j3Var.setSystemUiVisibility(1792);
        j3Var.setPadding(0, 0, 0, 0);
        j3Var.setOnApplyWindowInsetsListener(new i3(0));
    }
}
