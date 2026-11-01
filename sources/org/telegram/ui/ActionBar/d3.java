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
import org.telegram.messenger.f8;
import org.telegram.ui.LaunchActivity;
public final class d3 extends Dialog {
    public final n3 f20250a;
    public final c3 f20251b;
    public final b3 f20252c;
    public final Paint d;
    public boolean e;

    public d3(n3 n3Var) {
        super(n3Var.mo30d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f20250a = n3Var;
        o3 mo30d = n3Var.mo30d();
        b3 b3Var = new b3(this, getContext());
        this.f20252c = b3Var;
        paint.setColor(t6.x0(null, t6.f20873a7, false));
        c3 c3Var = new c3(mo30d);
        this.f20251b = c3Var;
        setContentView(c3Var, new ViewGroup.LayoutParams(-1, -1));
        c3Var.addView(b3Var, w7.b6.e(-1, -2, 80));
        c3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(n3 n3Var) {
        k2 T = LaunchActivity.T();
        if (T != null) {
            if (org.telegram.messenger.i0.Q1() || n3Var.g() || org.telegram.messenger.i0.u1(T)) {
                d3 d3Var = new d3(n3Var);
                if (n3Var.i(d3Var)) {
                    c3 c3Var = d3Var.f20251b;
                    View view = (View) c3Var.f20205a;
                    org.telegram.messenger.i0.E2(view);
                    c3Var.addView(view, w7.b6.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f20250a.i(null);
        if (!this.e) {
            return;
        }
        this.e = false;
        try {
            super.dismiss();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void dismiss() {
        this.f20250a.a(false);
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
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        c3 c3Var = this.f20251b;
        c3Var.setFitsSystemWindows(true);
        c3Var.setSystemUiVisibility(1792);
        c3Var.setPadding(0, 0, 0, 0);
        c3Var.setOnApplyWindowInsetsListener(new a3(0));
    }
}
