package org.telegram.ui.ActionBar;

import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class ActionBarLayout$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final ActionBarLayout f$0;

    public ActionBarLayout$$ExternalSyntheticLambda11(ActionBarLayout actionBarLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBarLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onAnimationEndCheck(false);
                break;
            case 1:
                ActionBarLayout actionBarLayout = this.f$0;
                if (actionBarLayout.attached && actionBarLayout.getLastFragment() != null && actionBarLayout.containerView.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.lastActions)));
                    }
                    actionBarLayout.rebuildAllFragmentViews(true, true);
                    break;
                }
                break;
            case 2:
                this.f$0.onAnimationEndCheck(false);
                break;
            case 3:
                this.f$0.backgroundView.setVisibility(8);
                break;
            case 4:
                this.f$0.invalidate();
                break;
            default:
                ActionBarLayout actionBarLayout2 = this.f$0;
                actionBarLayout2.requestLayout();
                actionBarLayout2.containerView.requestLayout();
                actionBarLayout2.containerViewBack.requestLayout();
                actionBarLayout2.sheetContainer.requestLayout();
                break;
        }
    }
}
