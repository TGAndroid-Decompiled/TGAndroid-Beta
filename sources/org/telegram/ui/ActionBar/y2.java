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
import c8.ja;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class y2 extends Dialog {
    public final g3 f29886a;
    public final x2 f29887b;
    public final w2 f29888c;
    public final Paint d;
    public boolean f29889e;

    public y2(g3 g3Var) {
        super(g3Var.mo25d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f29886a = g3Var;
        h3 mo25d = g3Var.mo25d();
        w2 w2Var = new w2(this, getContext());
        this.f29888c = w2Var;
        paint.setColor(j6.x0(null, j6.f28792a7, false));
        x2 x2Var = new x2(mo25d);
        this.f29887b = x2Var;
        setContentView(x2Var, new ViewGroup.LayoutParams(-1, -1));
        x2Var.addView(w2Var, ja.e(-1, -2, 80));
        x2Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(g3 g3Var) {
        e2 T = LaunchActivity.T();
        if (T != null) {
            if (org.telegram.messenger.g0.Q1() || g3Var.g() || org.telegram.messenger.g0.u1(T)) {
                y2 y2Var = new y2(g3Var);
                if (g3Var.i(y2Var)) {
                    x2 x2Var = y2Var.f29887b;
                    View view = (View) x2Var.f29866a;
                    org.telegram.messenger.g0.E2(view);
                    x2Var.addView(view, ja.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f29886a.i(null);
        if (!this.f29889e) {
            return;
        }
        this.f29889e = false;
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void dismiss() {
        this.f29886a.a(false);
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
        x2 x2Var = this.f29887b;
        x2Var.setFitsSystemWindows(true);
        x2Var.setSystemUiVisibility(1792);
        x2Var.setPadding(0, 0, 0, 0);
        x2Var.setOnApplyWindowInsetsListener(new v2(0));
    }
}
