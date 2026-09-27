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
import ci.ab;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class j3 extends Dialog {
    public final u3 f19477a;
    public final i3 f19478b;
    public final ab f19479c;
    public final Paint d;
    public boolean e;

    public j3(u3 u3Var) {
        super(u3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f19477a = u3Var;
        v3 mo37getWindowView = u3Var.mo37getWindowView();
        ab abVar = new ab(this, getContext(), 8);
        this.f19479c = abVar;
        paint.setColor(i6.w0(null, i6.f19001a7, false));
        i3 i3Var = new i3(mo37getWindowView);
        this.f19478b = i3Var;
        setContentView(i3Var, new ViewGroup.LayoutParams(-1, -1));
        i3Var.addView(abVar, w7.y5.e(-1, -2, 80));
        i3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(u3 u3Var) {
        o2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || u3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                j3 j3Var = new j3(u3Var);
                if (u3Var.c(j3Var)) {
                    i3 i3Var = j3Var.f19478b;
                    View view = (View) i3Var.f18977a;
                    AndroidUtilities.removeFromParent(view);
                    i3Var.addView(view, w7.y5.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f19477a.c(null);
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
        this.f19477a.dismiss(false);
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
        i3 i3Var = this.f19478b;
        i3Var.setFitsSystemWindows(true);
        i3Var.setSystemUiVisibility(1792);
        i3Var.setPadding(0, 0, 0, 0);
        i3Var.setOnApplyWindowInsetsListener(new h3(0));
    }
}
