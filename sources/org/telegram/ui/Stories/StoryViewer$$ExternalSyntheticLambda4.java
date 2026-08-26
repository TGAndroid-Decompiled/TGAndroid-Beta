package org.telegram.ui.Stories;

import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.ui.LaunchActivity;

public final class StoryViewer$$ExternalSyntheticLambda4 implements OnBackInvokedCallback {
    public final int $r8$classId;
    public final Object f$0;

    public StoryViewer$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onBackInvoked() {
        switch (this.$r8$classId) {
            case 0:
                StoryViewer storyViewer = (StoryViewer) this.f$0;
                storyViewer.getClass();
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null) {
                    storyViewer.onAttachedBackPressed();
                } else {
                    launchActivity.onBackPressed();
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
            default:
                ((Runnable) this.f$0).run();
                break;
        }
    }
}
