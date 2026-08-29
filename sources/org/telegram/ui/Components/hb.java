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
public final class hb extends Dialog {
    public final gb f29158a;
    public final WindowManager.LayoutParams f29159b;

    public hb(Context context, eg.x xVar) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        gb gbVar = new gb(this, context);
        this.f29158a = gbVar;
        setContentView(gbVar, new ViewGroup.LayoutParams(-1, -1));
        u uVar = new u(this, 15);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(gbVar, uVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            gbVar.setSystemUiVisibility(1792);
        } else {
            gbVar.setSystemUiVisibility(1280);
        }
        mc.a(gbVar, new ih.u0(xVar, 8));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f29159b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static gb a(Context context) {
        return new hb(context, null).f29158a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
