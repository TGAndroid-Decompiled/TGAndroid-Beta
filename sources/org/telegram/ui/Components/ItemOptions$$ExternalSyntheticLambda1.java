package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ItemOptions$$ExternalSyntheticLambda1 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;

    public ItemOptions$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ItemOptions.lambda$installHoverReleaseListener$19((WeakReference) this.f$0, view, motionEvent);
            case 1:
                return ((MessagePreviewView.Page) this.f$0).lambda$new$0(view, motionEvent);
            case 2:
                return ((CustomPopupMenu) this.f$0).lambda$new$0(view, motionEvent);
            case 3:
                return ((MentionsContainerView) this.f$0).lambda$withDelegate$5(view, motionEvent);
            default:
                return ((StickersAlert) this.f$0).lambda$init$9(view, motionEvent);
        }
    }
}
