package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;

public final class TodoItemMenu$$ExternalSyntheticLambda4 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((TodoItemMenu) this.f$0).lambda$setupMessageOptions$12(view, motionEvent);
            case 1:
                return ((PhotoCropActivity.PhotoCropView) this.f$0).lambda$init$0(view, motionEvent);
            case 2:
                return ((ArticleViewer) this.f$0).lambda$showPopup$2(view, motionEvent);
            case 3:
                return ((ContentPreviewViewer) this.f$0).lambda$setParentActivity$12(view, motionEvent);
            case 4:
                return ((ExternalActionActivity) this.f$0).lambda$onCreate$0(view, motionEvent);
            case 5:
                return ((LaunchActivity) this.f$0).lambda$setupActionBarLayout$3(view, motionEvent);
            case 6:
                return ((PollItemMenu) this.f$0).lambda$setupMessageOptions$13(view, motionEvent);
            default:
                return ((SelectAnimatedEmojiDialog) this.f$0).lambda$new$0(view, motionEvent);
        }
    }
}
