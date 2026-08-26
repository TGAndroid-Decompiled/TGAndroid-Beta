package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;

public final class SecretMediaViewer$$ExternalSyntheticLambda0 implements View.OnApplyWindowInsetsListener {
    public final int $r8$classId;
    public final Object f$0;

    public SecretMediaViewer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.$r8$classId) {
            case 0:
                return ((SecretMediaViewer) this.f$0).lambda$setParentActivity$1(view, windowInsets);
            default:
                return ((SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.f$0).lambda$new$7(view, windowInsets);
        }
    }
}
