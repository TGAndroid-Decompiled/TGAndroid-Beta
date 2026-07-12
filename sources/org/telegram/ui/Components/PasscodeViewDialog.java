package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.LaunchActivity;

public class PasscodeViewDialog extends Dialog {
    public final Context context;
    public final PasscodeView passcodeView;
    private final FrameLayout windowView;

    public PasscodeViewDialog(Context context) {
        super(context, R.style.TransparentDialog);
        this.context = context;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(context);
        this.windowView = frameLayout;
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return PasscodeViewDialog.lambda$new$0(view, windowInsetsCompat);
            }
        });
        PasscodeView passcodeView = new PasscodeView(context) {
            @Override
            protected void onHidden() {
                PasscodeViewDialog.super.dismiss();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null) {
                    return;
                }
                DrawerLayoutContainer drawerLayoutContainer = launchActivity.drawerLayoutContainer;
                drawerLayoutContainer.setScaleX(1.0f);
                drawerLayoutContainer.setScaleY(1.0f);
            }

            @Override
            protected void onAnimationUpdate(float f) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null) {
                    return;
                }
                DrawerLayoutContainer drawerLayoutContainer = launchActivity.drawerLayoutContainer;
                drawerLayoutContainer.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f));
                drawerLayoutContainer.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f));
            }
        };
        this.passcodeView = passcodeView;
        frameLayout.addView(passcodeView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public static WindowInsetsCompat lambda$new$0(View view, WindowInsetsCompat windowInsetsCompat) {
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
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
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar((Dialog) this, false);
    }

    @Override
    public void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.passcodeView.onBackPressed() || (launchActivity = LaunchActivity.instance) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override
    public void dismiss() {
        LaunchActivity launchActivity;
        if (!this.passcodeView.onBackPressed() || (launchActivity = LaunchActivity.instance) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            if (this.passcodeView.onBackPressed() && (launchActivity = LaunchActivity.instance) != null) {
                launchActivity.moveTaskToBack(true);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
