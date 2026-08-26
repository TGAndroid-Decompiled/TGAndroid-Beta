package org.telegram.ui;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;

public final class ChatActivity$57$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnPreDrawListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$57$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.$r8$classId) {
            case 0:
                ((BaseFragment) ChatActivity.this).actionBar.invalidate();
                return true;
            case 1:
                return ((EditTextBoldCursor) this.f$0).lambda$startActionMode$2();
            default:
                ((ItemOptions.DimView) this.f$0).invalidate();
                return true;
        }
    }
}
