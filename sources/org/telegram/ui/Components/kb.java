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
public final class kb extends Dialog {
    public final jb f25661a;
    public final WindowManager.LayoutParams f25662b;

    public kb(Context context, ci.d9 d9Var) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        jb jbVar = new jb(this, context);
        this.f25661a = jbVar;
        setContentView(jbVar, new ViewGroup.LayoutParams(-1, -1));
        s sVar = new s(this, 15);
        WeakHashMap weakHashMap = r0.i0.f42163a;
        r0.a0.j(jbVar, sVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            jbVar.setSystemUiVisibility(1792);
        } else {
            jbVar.setSystemUiVisibility(1280);
        }
        pc.a(jbVar, new ai.w4(d9Var, 6));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f25662b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static jb a(Context context) {
        return new kb(context, null).f25661a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
