package org.telegram.ui;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.pip.PipSource;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public final class LaunchActivity$$ExternalSyntheticLambda28 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $r8$classId;
    public final Object f$0;

    public LaunchActivity$$ExternalSyntheticLambda28(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$onCreate$2((View) this.f$0);
                break;
            case 1:
                PipSource pipSource = (PipSource) this.f$0;
                View view = pipSource.contentView;
                if (view != null) {
                    pipSource.updateContentPosition(view);
                }
                break;
            case 2:
                ((KeyboardNotifier) this.f$0).update();
                break;
            default:
                ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.f$0;
                themePreviewActivity.getClass();
                themePreviewActivity.watchForKeyboardEndTime = SystemClock.elapsedRealtime() + 1500;
                themePreviewActivity.frameLayout.invalidate();
                break;
        }
    }
}
