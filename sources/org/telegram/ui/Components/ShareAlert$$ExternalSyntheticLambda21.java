package org.telegram.ui.Components;

import android.view.View;

public final class ShareAlert$$ExternalSyntheticLambda21 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public ShareAlert$$ExternalSyntheticLambda21(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((ShareAlert) this.f$0).lambda$new$17(view);
            case 1:
                return ((FragmentContextView) this.f$0).lambda$createPlaybackSpeedButton$13(view);
            default:
                return ((PasscodeView) this.f$0).lambda$new$3(view);
        }
    }
}
