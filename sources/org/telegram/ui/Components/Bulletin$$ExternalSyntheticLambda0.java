package org.telegram.ui.Components;

import android.widget.FrameLayout;

public final class Bulletin$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Bulletin f$0;

    public Bulletin$$ExternalSyntheticLambda0(Bulletin bulletin, int i) {
        this.$r8$classId = i;
        this.f$0 = bulletin;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.hide();
                break;
            case 1:
                Bulletin bulletin = this.f$0;
                Bulletin.Delegate delegate = bulletin.currentDelegate;
                Bulletin.Layout layout = bulletin.layout;
                if (delegate != null && !layout.top) {
                    delegate.onBottomOffsetChange(0.0f);
                    bulletin.currentDelegate.onHide(bulletin);
                }
                layout.transitionRunningExit = false;
                layout.onExitTransitionEnd();
                layout.onHide();
                Bulletin.AnonymousClass1 anonymousClass1 = bulletin.parentLayout;
                FrameLayout frameLayout = bulletin.containerLayout;
                frameLayout.removeView(anonymousClass1);
                frameLayout.removeOnLayoutChangeListener(bulletin.containerLayoutListener);
                layout.onDetach();
                Runnable runnable = bulletin.onHideListener;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Bulletin bulletin2 = this.f$0;
                Bulletin.AnonymousClass1 anonymousClass2 = bulletin2.parentLayout;
                FrameLayout frameLayout2 = bulletin2.containerLayout;
                frameLayout2.removeView(anonymousClass2);
                frameLayout2.removeOnLayoutChangeListener(bulletin2.containerLayoutListener);
                break;
        }
    }
}
