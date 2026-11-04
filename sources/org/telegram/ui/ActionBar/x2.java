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
import b8.mf;
import org.telegram.messenger.a8;
import org.telegram.ui.LaunchActivity;
public final class x2 extends Dialog {
    public final g3 f28796a;
    public final w2 f28797b;
    public final v2 f28798c;
    public final Paint d;
    public boolean f28799e;

    public x2(g3 g3Var) {
        super(g3Var.mo25d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f28796a = g3Var;
        h3 mo25d = g3Var.mo25d();
        v2 v2Var = new v2(this, getContext());
        this.f28798c = v2Var;
        paint.setColor(k6.x0(null, k6.f27824a7, false));
        w2 w2Var = new w2(mo25d);
        this.f28797b = w2Var;
        setContentView(w2Var, new ViewGroup.LayoutParams(-1, -1));
        w2Var.addView(v2Var, mf.e(-1, -2, 80));
        w2Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(g3 g3Var) {
        d2 T = LaunchActivity.T();
        if (T != null) {
            if (org.telegram.messenger.g0.Q1() || g3Var.g() || org.telegram.messenger.g0.u1(T)) {
                x2 x2Var = new x2(g3Var);
                if (g3Var.i(x2Var)) {
                    w2 w2Var = x2Var.f28797b;
                    View view = (View) w2Var.f28774a;
                    org.telegram.messenger.g0.E2(view);
                    w2Var.addView(view, mf.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f28796a.i(null);
        if (!this.f28799e) {
            return;
        }
        this.f28799e = false;
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void dismiss() {
        this.f28796a.a(false);
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
        w2 w2Var = this.f28797b;
        w2Var.setFitsSystemWindows(true);
        w2Var.setSystemUiVisibility(1792);
        w2Var.setPadding(0, 0, 0, 0);
        w2Var.setOnApplyWindowInsetsListener(new u2(0));
    }
}
