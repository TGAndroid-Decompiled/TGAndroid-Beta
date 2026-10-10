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
public final class ob extends Dialog {
    public final nb f29434a;
    public final WindowManager.LayoutParams f29435b;

    public ob(Context context, ci.a9 a9Var) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        nb nbVar = new nb(this, context);
        this.f29434a = nbVar;
        setContentView(nbVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(nbVar, sVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            nbVar.setSystemUiVisibility(1792);
        } else {
            nbVar.setSystemUiVisibility(1280);
        }
        tc.a(nbVar, new ai.x4(a9Var, 6));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f29435b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static nb a(Context context) {
        return new ob(context, null).f29434a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
