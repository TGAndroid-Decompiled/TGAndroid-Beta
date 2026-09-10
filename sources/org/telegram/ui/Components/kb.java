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
    public final jb f24689a;
    public final WindowManager.LayoutParams f24690b;

    public kb(Context context, bi.fa faVar) {
        super(context);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        jb jbVar = new jb(this, context);
        this.f24689a = jbVar;
        setContentView(jbVar, new ViewGroup.LayoutParams(-1, -1));
        t tVar = new t(this, 15);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(jbVar, tVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            jbVar.setSystemUiVisibility(1792);
        } else {
            jbVar.setSystemUiVisibility(1280);
        }
        pc.a(jbVar, new bi.rd(faVar, 3));
        try {
            Window window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.f24690b = attributes;
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
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false)) <= 0.721f) {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } catch (Exception unused) {
        }
    }

    public static jb a(Context context) {
        return new kb(context, null).f24689a;
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
    }
}
