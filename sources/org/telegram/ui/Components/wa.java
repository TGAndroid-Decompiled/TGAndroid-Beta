package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class wa extends Dialog {
    public final va f39935a;
    public final WindowManager.LayoutParams f39936b;

    public wa(Context context, fi.r7 r7Var) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        va vaVar = new va(this, context);
        this.f39935a = vaVar;
        setContentView(vaVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(vaVar, tVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            vaVar.setSystemUiVisibility(1792);
        } else {
            vaVar.setSystemUiVisibility(1280);
        }
        vaVar.setTag(2131296351, new ch.v(r7Var, 6));
        try {
            Window window = getWindow();
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f39936b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z9 = true;
            if (i7 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false)) <= 0.721f) {
                z9 = false;
            }
            org.telegram.messenger.g0.n3(this, z9);
        } catch (Exception unused) {
        }
    }

    public static va a(Context context) {
        return new wa(context, null).f39935a;
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
    }
}
