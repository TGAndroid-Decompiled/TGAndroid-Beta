package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class wa extends Dialog {
    public final va f39976a;
    public final WindowManager.LayoutParams f39977b;

    public wa(Context context, ai.y yVar) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        va vaVar = new va(this, context);
        this.f39976a = vaVar;
        setContentView(vaVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(vaVar, tVar);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            vaVar.setSystemUiVisibility(1792);
        } else {
            vaVar.setSystemUiVisibility(1280);
        }
        vaVar.setTag(2131296351, new ai.h1(yVar, 7));
        try {
            Window window = getWindow();
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f39977b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z10 = true;
            if (i3 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false)) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        } catch (Exception unused) {
        }
    }

    public static va a(Context context) {
        return new wa(context, null).f39976a;
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
    }
}
