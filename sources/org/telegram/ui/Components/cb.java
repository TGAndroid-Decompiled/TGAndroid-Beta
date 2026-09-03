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
public final class cb extends Dialog {
    public final bb f23915a;
    public final WindowManager.LayoutParams f23916b;

    public cb(Context context, gg.w wVar) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        bb bbVar = new bb(this, context);
        this.f23915a = bbVar;
        setContentView(bbVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(bbVar, tVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            bbVar.setSystemUiVisibility(1792);
        } else {
            bbVar.setSystemUiVisibility(1280);
        }
        ic.a(bbVar, new kh.t0(wVar, 7));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f23916b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = (((-3) & attributes.flags) | (-1946091240)) & (-1025);
            boolean z4 = true;
            if (i10 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false)) <= 0.721f) {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        } catch (Exception unused) {
        }
    }

    public static bb a(Context context) {
        return new cb(context, null).f23915a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
