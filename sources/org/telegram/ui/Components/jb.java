package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class jb extends Dialog {
    public final ib f25276a;
    public final WindowManager.LayoutParams f25277b;

    public jb(Context context, ci.d9 d9Var) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        ib ibVar = new ib(this, context);
        this.f25276a = ibVar;
        setContentView(ibVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.a0.j(ibVar, sVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            ibVar.setSystemUiVisibility(1792);
        } else {
            ibVar.setSystemUiVisibility(1280);
        }
        oc.a(ibVar, new ai.w4(d9Var, 6));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f25277b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z10 = true;
            if (i10 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static ib a(Context context) {
        return new jb(context, null).f25276a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
