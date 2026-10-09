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
public final class ve0 extends Dialog {
    public final FrameLayout f31764a;
    public final ue0 f31765b;

    public ve0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f31764a = frameLayout;
        fe0 fe0Var = new fe0(1);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(frameLayout, fe0Var);
        ue0 ue0Var = new ue0(this, launchActivity);
        this.f31765b = ue0Var;
        frameLayout.addView(ue0Var, w7.x5.e(-1, -1, 119));
    }

    public static void a(ve0 ve0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f31765b.h() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f31765b.h() && (launchActivity = LaunchActivity.G1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f31765b.h() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f31764a;
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
