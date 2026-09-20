package org.telegram.ui.Components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class ce0 extends Dialog {
    public final FrameLayout f23272a;
    public final be0 f23273b;

    public ce0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f23272a = frameLayout;
        i2 i2Var = new i2(28);
        WeakHashMap weakHashMap = r0.i0.f42142a;
        r0.a0.j(frameLayout, i2Var);
        be0 be0Var = new be0(this, launchActivity);
        this.f23273b = be0Var;
        frameLayout.addView(be0Var, w7.y5.e(-1, -1, 119));
    }

    public static void a(ce0 ce0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f23273b.g() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f23273b.g() && (launchActivity = LaunchActivity.G1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f23273b.g() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f23272a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.softInputMode = 16;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | 8192;
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar((Dialog) this, false);
    }
}
