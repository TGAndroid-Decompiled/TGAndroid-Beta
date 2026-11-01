package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class ra extends Dialog {
    public final qa f29967a;
    public final WindowManager.LayoutParams f29968b;

    public ra(Context context, mg.u uVar) {
        super(context);
        org.telegram.messenger.i0.S(getWindow());
        qa qaVar = new qa(this, context);
        this.f29967a = qaVar;
        setContentView(qaVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(qaVar, tVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            qaVar.setSystemUiVisibility(1792);
        } else {
            qaVar.setSystemUiVisibility(1280);
        }
        boolean z10 = true;
        qaVar.setTag(2131296351, new k7(uVar, 1));
        try {
            Window window = getWindow();
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f29968b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            if (i10 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20873a7, false)) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.i0.m3(this, z10);
        } catch (Exception unused) {
        }
    }

    public static qa a(Context context) {
        return new ra(context, null).f29967a;
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        super.show();
    }
}
