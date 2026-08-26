package org.telegram.ui.Components.FloatingDebug;

import android.app.Activity;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class FloatingDebugView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final FloatingDebugView f$0;

    public FloatingDebugView$$ExternalSyntheticLambda2(FloatingDebugView floatingDebugView, int i) {
        this.$r8$classId = i;
        this.f$0 = floatingDebugView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FloatingDebugView floatingDebugView = this.f$0;
                floatingDebugView.getClass();
                BlurSettingsBottomSheet.show(LaunchActivity.getLastFragment());
                floatingDebugView.showBigMenu(false);
                break;
            case 1:
                FloatingDebugView floatingDebugView2 = this.f$0;
                floatingDebugView2.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(floatingDebugView2.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.sendLogs((Activity) this.f$0.getContext(), false);
                break;
            default:
                FloatingDebugView floatingDebugView3 = this.f$0;
                floatingDebugView3.inLongPress = true;
                try {
                    floatingDebugView3.performHapticFeedback(0);
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
