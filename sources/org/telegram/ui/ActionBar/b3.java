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
public final class b3 extends Dialog {
    public final k3 f28801a;
    public final a3 f28802b;
    public final z2 f28803c;
    public final Paint d;
    public boolean f28804e;

    public b3(k3 k3Var) {
        super(k3Var.mo25d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f28801a = k3Var;
        l3 mo25d = k3Var.mo25d();
        z2 z2Var = new z2(this, getContext());
        this.f28803c = z2Var;
        paint.setColor(n6.x0(null, n6.f29337a7, false));
        a3 a3Var = new a3(mo25d);
        this.f28802b = a3Var;
        setContentView(a3Var, new ViewGroup.LayoutParams(-1, -1));
        a3Var.addView(z2Var, ma.e(-1, -2, 80));
        a3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(k3 k3Var) {
        h2 T = LaunchActivity.T();
        if (T != null) {
            if (org.telegram.messenger.g0.Q1() || k3Var.g() || org.telegram.messenger.g0.u1(T)) {
                b3 b3Var = new b3(k3Var);
                if (k3Var.i(b3Var)) {
                    a3 a3Var = b3Var.f28802b;
                    View view = (View) a3Var.f28754a;
                    org.telegram.messenger.g0.E2(view);
                    a3Var.addView(view, ma.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f28801a.i(null);
        if (!this.f28804e) {
            return;
        }
        this.f28804e = false;
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void dismiss() {
        this.f28801a.a(false);
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
        a3 a3Var = this.f28802b;
        a3Var.setFitsSystemWindows(true);
        a3Var.setSystemUiVisibility(1792);
        a3Var.setPadding(0, 0, 0, 0);
        a3Var.setOnApplyWindowInsetsListener(new y2(0));
    }
}
