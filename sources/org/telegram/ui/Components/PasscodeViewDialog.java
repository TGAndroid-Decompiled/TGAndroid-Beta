package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.LaunchActivity;
public class PasscodeViewDialog extends Dialog {
    public final PasscodeView passcodeView;
    private final FrameLayout windowView;

    public PasscodeViewDialog(Context context) {
        super(context, R.style.TransparentDialog);
        FrameLayout frameLayout = new FrameLayout(context);
        this.windowView = frameLayout;
        if (Build.VERSION.SDK_INT >= 21) {
            frameLayout.setFitsSystemWindows(true);
            frameLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) {
                @Override
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        return WindowInsets.CONSUMED;
                    }
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
        }
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
        attributes.softInputMode = 48;
        int i2 = i | 131072;
        attributes.flags = i2;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i2 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            attributes.flags |= -2013200128;
        }
        int i4 = attributes.flags | 1024;
        attributes.flags = i4;
        attributes.flags = i4 | 128;
        if (i3 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(LiteMode.FLAG_CHAT_BLUR);
        AndroidUtilities.setLightNavigationBar(window, false);
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
