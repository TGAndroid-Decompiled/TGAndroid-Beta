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
public final class bd0 extends Dialog {
    public final FrameLayout f24610a;
    public final ad0 f24611b;

    public bd0(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        org.telegram.messenger.i0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f24610a = frameLayout;
        au auVar = new au(11);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(frameLayout, auVar);
        ad0 ad0Var = new ad0(this, launchActivity);
        this.f24611b = ad0Var;
        frameLayout.addView(ad0Var, w7.b6.e(-1, -1, 119));
    }

    public static void a(bd0 bd0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f24611b.i() && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f24611b.i() && (launchActivity = LaunchActivity.I1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f24611b.i() && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f24610a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.softInputMode = 16;
        boolean z10 = org.telegram.messenger.v2.f18448a;
        attributes.flags = i10 | 8192;
        org.telegram.messenger.i0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.i0.m3(this, false);
    }
}
