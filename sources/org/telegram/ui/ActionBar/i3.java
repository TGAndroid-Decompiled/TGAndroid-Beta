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
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class i3 extends Dialog {
    public final u3 f18922a;
    public final h3 f18923b;
    public final eb f18924c;
    public final Paint d;
    public boolean e;

    public i3(u3 u3Var) {
        super(u3Var.mo37getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.f18922a = u3Var;
        v3 mo37getWindowView = u3Var.mo37getWindowView();
        eb ebVar = new eb(this, getContext(), 8);
        this.f18924c = ebVar;
        paint.setColor(j6.w0(null, j6.f19006a7, false));
        h3 h3Var = new h3(mo37getWindowView);
        this.f18923b = h3Var;
        setContentView(h3Var, new ViewGroup.LayoutParams(-1, -1));
        h3Var.addView(ebVar, w7.y5.e(-1, -2, 80));
        h3Var.setClipToPadding(false);
    }

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void b(u3 u3Var) {
        n2 U = LaunchActivity.U();
        if (U != null) {
            if (AndroidUtilities.isTablet() || u3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
                i3 i3Var = new i3(u3Var);
                if (u3Var.c(i3Var)) {
                    h3 h3Var = i3Var.f18923b;
                    View view = (View) h3Var.f18906a;
                    AndroidUtilities.removeFromParent(view);
                    h3Var.addView(view, w7.y5.e(-1, -1, 119));
                }
            }
        }
    }

    public final void c() {
        this.f18922a.c(null);
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
        this.f18922a.dismiss(false);
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
        h3 h3Var = this.f18923b;
        h3Var.setFitsSystemWindows(true);
        h3Var.setSystemUiVisibility(1792);
        h3Var.setPadding(0, 0, 0, 0);
        h3Var.setOnApplyWindowInsetsListener(new g3(0));
    }
}
