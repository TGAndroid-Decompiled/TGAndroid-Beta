package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class ta extends Dialog {
    public final sa f39616a;
    public final WindowManager.LayoutParams f39617b;

    public ta(Context context, bi.t tVar) {
        super(context);
        org.telegram.messenger.g0.S(getWindow());
        sa saVar = new sa(this, context);
        this.f39616a = saVar;
        setContentView(saVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(saVar, sVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            saVar.setSystemUiVisibility(1792);
        } else {
            saVar.setSystemUiVisibility(1280);
        }
        saVar.setTag(2131296351, new bi.e1(tVar, 7));
        try {
            Window window = getWindow();
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f39617b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z10 = true;
            if (i7 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false)) <= 0.721f) {
                z10 = false;
            }
            org.telegram.messenger.g0.n3(this, z10);
        } catch (Exception unused) {
        }
    }

    public static sa a(Context context) {
        return new ta(context, null).f39616a;
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        super.show();
    }
}
