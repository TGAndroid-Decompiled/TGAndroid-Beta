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
import c8.ma;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class a3 extends Dialog {
    public final j3 f28787a;
    public final z2 f28788b;
    public final y2 f28789c;
    public final Paint d;
    public boolean f28790e;

    public a3(j3 j3Var) {
        super(j3Var.mo25d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f28787a = j3Var;
        k3 mo25d = j3Var.mo25d();
        y2 y2Var = new y2(this, getContext());
        this.f28789c = y2Var;
        paint.setColor(m6.x0(null, m6.f29324a7, false));
        z2 z2Var = new z2(mo25d);
        this.f28788b = z2Var;
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        z2Var.addView(y2Var, ma.e(-1, -2, 80));
        z2Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(j3 j3Var) {
        g2 T = LaunchActivity.T();
        if (T != null) {
            if (org.telegram.messenger.g0.Q1() || j3Var.g() || org.telegram.messenger.g0.u1(T)) {
                a3 a3Var = new a3(j3Var);
                if (j3Var.i(a3Var)) {
                    z2 z2Var = a3Var.f28788b;
                    View view = (View) z2Var.f30318a;
                    org.telegram.messenger.g0.E2(view);
                    z2Var.addView(view, ma.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f28787a.i(null);
        if (!this.f28790e) {
            return;
        }
        this.f28790e = false;
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void dismiss() {
        this.f28787a.a(false);
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
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        z2 z2Var = this.f28788b;
        z2Var.setFitsSystemWindows(true);
        z2Var.setSystemUiVisibility(1792);
        z2Var.setPadding(0, 0, 0, 0);
        z2Var.setOnApplyWindowInsetsListener(new x2(0));
    }
}
