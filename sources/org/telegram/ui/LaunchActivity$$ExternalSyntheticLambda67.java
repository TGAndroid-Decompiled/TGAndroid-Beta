package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

public final class LaunchActivity$$ExternalSyntheticLambda67 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $r8$classId;
    public final Object f$0;

    public LaunchActivity$$ExternalSyntheticLambda67(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity.lambda$onCreate$2((View) this.f$0);
                break;
            default:
                ((ThemePreviewActivity) this.f$0).lambda$createView$16();
                break;
        }
    }
}
