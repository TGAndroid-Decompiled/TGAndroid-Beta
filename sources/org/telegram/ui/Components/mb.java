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
public final class mb extends Dialog {
    public final lb f28571a;
    public final WindowManager.LayoutParams f28572b;

    public mb(Context context, ci.z8 z8Var) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        lb lbVar = new lb(this, context);
        this.f28571a = lbVar;
        setContentView(lbVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.f45603a;
        r0.a0.j(lbVar, sVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            lbVar.setSystemUiVisibility(1792);
        } else {
            lbVar.setSystemUiVisibility(1280);
        }
        rc.a(lbVar, new ai.w4(z8Var, 6));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f28572b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static lb a(Context context) {
        return new mb(context, null).f28571a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
