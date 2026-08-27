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

public final class fd0 extends Dialog {

    public final FrameLayout f28377a;

    public final ed0 f28378b;

    public fd0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f28377a = frameLayout;
        pc0 pc0Var = new pc0(1);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(frameLayout, pc0Var);
        ed0 ed0Var = new ed0(this, launchActivity);
        this.f28378b = ed0Var;
        frameLayout.addView(ed0Var, h7.z5.e(-1, -1, 119));
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (!this.f28378b.g() || (launchActivity = LaunchActivity.C1) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f28378b.g() && (launchActivity = LaunchActivity.C1) != null) {
            launchActivity.moveTaskToBack(true);
        }
        return true;
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.f28378b.g() || (launchActivity = LaunchActivity.C1) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f28377a;
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
