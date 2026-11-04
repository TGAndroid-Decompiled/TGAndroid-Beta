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
public final class bc0 extends Dialog {
    public final FrameLayout f32158a;
    public final ac0 f32159b;

    public bc0(LaunchActivity launchActivity) {
        super(launchActivity, 2131755352);
        org.telegram.messenger.g0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.f32158a = frameLayout;
        a3 a3Var = new a3(25);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(frameLayout, a3Var);
        ac0 ac0Var = new ac0(this, launchActivity);
        this.f32159b = ac0Var;
        frameLayout.addView(ac0Var, b8.mf.e(-1, -1, 119));
    }

    public static void a(bc0 bc0Var) {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (this.f32159b.i() && (launchActivity = LaunchActivity.K1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.f32159b.i() && (launchActivity = LaunchActivity.K1) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (this.f32159b.i() && (launchActivity = LaunchActivity.K1) != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f32158a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.flags = i3;
        attributes.softInputMode = 16;
        boolean z10 = org.telegram.messenger.r2.f25040a;
        attributes.flags = i3 | 8192;
        org.telegram.messenger.g0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(this, false);
    }
}
