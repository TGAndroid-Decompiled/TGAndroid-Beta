package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;

public final class PhotoViewer$$ExternalSyntheticLambda57 implements ViewSwitcher.ViewFactory {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda57(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final View makeView() {
        switch (this.$r8$classId) {
            case 0:
                return ((PhotoViewer) this.f$0).lambda$setParentActivity$16();
            case 1:
                return LoginActivity.PhoneView.lambda$new$2((Context) this.f$0);
            default:
                return PasscodeActivity.lambda$createView$6((Context) this.f$0);
        }
    }
}
