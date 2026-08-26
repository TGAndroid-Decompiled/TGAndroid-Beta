package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PhotoViewer$$ExternalSyntheticLambda69 implements OnBackInvokedCallback {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda69(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onBackInvoked() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                Activity activity = photoViewer.parentActivity;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).onBackPressed();
                } else if (photoViewer.isVisible()) {
                    photoViewer.closePhoto(true, false);
                }
                break;
            case 1:
                Function0 onBackInvoked = (Function0) this.f$0;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 2:
                ((AppCompatDelegateImpl) this.f$0).onBackPressed();
                break;
            case 3:
                ((Runnable) this.f$0).run();
                break;
            case 4:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                storyViewer.getClass();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null) {
                    storyViewer.onAttachedBackPressed();
                } else {
                    launchActivity.onBackPressed();
                }
                break;
            default:
                ((StoryRecorder) this.f$0).onBackPressed();
                break;
        }
    }
}
