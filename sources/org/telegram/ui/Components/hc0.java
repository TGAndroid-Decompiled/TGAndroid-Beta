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
public final class hc0 extends Dialog {
    public final FrameLayout f34274a;
    public final gc0 f34275b;

    public hc0(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        org.telegram.messenger.g0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f34274a = frameLayout;
        k2 k2Var = new k2(28);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(frameLayout, k2Var);
        gc0 gc0Var = new gc0(this, launchActivity);
        this.f34275b = gc0Var;
        frameLayout.addView(gc0Var, c8.ha.e(-1, -1, 119));
    }

    public static void a(hc0 hc0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f34275b.i() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f34275b.i() && (launchActivity = LaunchActivity.G1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f34275b.i() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f34274a;
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
