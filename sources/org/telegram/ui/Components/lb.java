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
public final class lb extends Dialog {
    public final kb f28128a;
    public final WindowManager.LayoutParams f28129b;

    public lb(Context context, di.c9 c9Var) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        kb kbVar = new kb(this, context);
        this.f28128a = kbVar;
        setContentView(kbVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(kbVar, tVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            kbVar.setSystemUiVisibility(1792);
        } else {
            kbVar.setSystemUiVisibility(1280);
        }
        qc.a(kbVar, new ah.n0(c9Var, 7));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f28129b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static kb a(Context context) {
        return new lb(context, null).f28128a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
