package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;

public final class TopicsFragment$$ExternalSyntheticLambda27 implements View.OnTouchListener {
    public final int $r8$classId;

    public TopicsFragment$$ExternalSyntheticLambda27(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return TopicsFragment.lambda$chekActionMode$23(view, motionEvent);
            case 1:
                return ThemeSetUrlActivity.lambda$createView$0(view, motionEvent);
            case 2:
                return ThemeSetUrlActivity.lambda$createView$4(view, motionEvent);
            case 3:
                return TwoStepVerificationSetupActivity.lambda$createView$10(view, motionEvent);
            default:
                return WallpapersListActivity.lambda$createView$0(view, motionEvent);
        }
    }
}
