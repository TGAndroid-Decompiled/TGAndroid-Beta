package org.telegram.ui.Components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public final class PasscodeViewDialog extends Dialog {
    public final AnonymousClass1 passcodeView;
    public final FrameLayout windowView;

    public PasscodeViewDialog(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.windowView = frameLayout;
        ShareAlert$$ExternalSyntheticLambda15 shareAlert$$ExternalSyntheticLambda15 = new ShareAlert$$ExternalSyntheticLambda15(14);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout, shareAlert$$ExternalSyntheticLambda15);
        ?? r1 = new PasscodeView(launchActivity) {
            @Override
            public final void onAnimationUpdate(float f) {
                LaunchActivity launchActivity2 = LaunchActivity.instance;
                if (launchActivity2 == null) {
                    return;
                }
                DrawerLayoutContainer drawerLayoutContainer = launchActivity2.drawerLayoutContainer;
                drawerLayoutContainer.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f));
                drawerLayoutContainer.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f));
            }

            @Override
            public final void onHidden() {
                PasscodeViewDialog.super.dismiss();
                LaunchActivity launchActivity2 = LaunchActivity.instance;
                if (launchActivity2 == null) {
                    return;
                }
                DrawerLayoutContainer drawerLayoutContainer = launchActivity2.drawerLayoutContainer;
                drawerLayoutContainer.setScaleX(1.0f);
                drawerLayoutContainer.setScaleY(1.0f);
            }
        };
        this.passcodeView = r1;
        frameLayout.addView((View) r1, LayoutHelper.createFrame(-1, -1, 119));
    }

    @Override
    public final void dismiss() {
        AnonymousClass1 anonymousClass1 = this.passcodeView;
        KeyboardNotifier keyboardNotifier = anonymousClass1.keyboardNotifier;
        if (keyboardNotifier != null && keyboardNotifier.keyboardVisible()) {
            AndroidUtilities.hideKeyboard(anonymousClass1.passwordEditText);
            return;
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        AnonymousClass1 anonymousClass1 = this.passcodeView;
        KeyboardNotifier keyboardNotifier = anonymousClass1.keyboardNotifier;
        if (keyboardNotifier == null || !keyboardNotifier.keyboardVisible()) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.moveTaskToBack(true);
            }
        } else {
            AndroidUtilities.hideKeyboard(anonymousClass1.passwordEditText);
        }
        return true;
    }

    @Override
    public final void onBackPressed() {
        AnonymousClass1 anonymousClass1 = this.passcodeView;
        KeyboardNotifier keyboardNotifier = anonymousClass1.keyboardNotifier;
        if (keyboardNotifier != null && keyboardNotifier.keyboardVisible()) {
            AndroidUtilities.hideKeyboard(anonymousClass1.passwordEditText);
            return;
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.moveTaskToBack(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        FrameLayout frameLayout = this.windowView;
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.flags = i;
        attributes.softInputMode = 16;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i | 8192;
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar((Dialog) this, false);
    }
}
