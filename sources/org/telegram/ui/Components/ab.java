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

public final class ab extends Dialog {

    public final za f26710a;

    public final WindowManager.LayoutParams f26711b;

    public ab(Context context, cg.w wVar) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        za zaVar = new za(this, context);
        this.f26710a = zaVar;
        setContentView(zaVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(zaVar, sVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            zaVar.setSystemUiVisibility(1792);
        } else {
            zaVar.setSystemUiVisibility(1280);
        }
        ec.a(zaVar, new gh.w0(wVar, 8));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f26711b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static za a(Context context) {
        return new ab(context, null).f26710a;
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
        }
    }
}
