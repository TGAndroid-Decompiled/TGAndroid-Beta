package org.telegram.ui.Components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.ui.LaunchActivity;
public final class gc0 extends Dialog {
    public final FrameLayout f33927a;
    public final fc0 f33928b;

    public gc0(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        org.telegram.messenger.g0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f33927a = frameLayout;
        k2 k2Var = new k2(28);
        WeakHashMap weakHashMap = r0.i0.f54190a;
        r0.a0.i(frameLayout, k2Var);
        fc0 fc0Var = new fc0(this, launchActivity);
        this.f33928b = fc0Var;
        frameLayout.addView(fc0Var, c8.ha.e(-1, -1, 119));
    }

    public static void a(gc0 gc0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f33928b.i() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f33928b.i() && (launchActivity = LaunchActivity.G1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f33928b.i() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f33927a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.flags = i7;
        attributes.softInputMode = 16;
        boolean z9 = org.telegram.messenger.r2.f25212a;
        attributes.flags = i7 | 8192;
        org.telegram.messenger.g0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(this, false);
    }
}
