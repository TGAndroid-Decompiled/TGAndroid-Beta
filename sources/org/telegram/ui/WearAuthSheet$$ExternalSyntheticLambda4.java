package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class WearAuthSheet$$ExternalSyntheticLambda4 implements OnFailureListener {
    public final int $r8$classId;
    public final ButtonWithCounterView f$0;

    public WearAuthSheet$$ExternalSyntheticLambda4(ButtonWithCounterView buttonWithCounterView, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonWithCounterView;
    }

    @Override
    public final void onFailure(Exception exc) {
        switch (this.$r8$classId) {
            case 0:
                WearAuthSheet.lambda$showEmojis$7(this.f$0, exc);
                break;
            default:
                WearAuthSheet.lambda$show$4(this.f$0, exc);
                break;
        }
    }
}
