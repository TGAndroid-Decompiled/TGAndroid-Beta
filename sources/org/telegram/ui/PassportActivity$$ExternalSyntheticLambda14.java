package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class PassportActivity$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda14(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.$r8$classId) {
            case 0:
                PassportActivity passportActivity = this.f$0;
                ViewGroup[] viewGroupArr = passportActivity.inputFieldContainers;
                if (viewGroupArr != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
                    passportActivity.inputFields[0].requestFocus();
                    AndroidUtilities.showKeyboard(passportActivity.inputFields[0]);
                    break;
                }
                break;
            case 1:
                PassportActivity passportActivity2 = this.f$0;
                passportActivity2.presentFragment(passportActivity2.presentAfterAnimation, true);
                passportActivity2.presentAfterAnimation = null;
                break;
            case 2:
                PassportActivity passportActivity3 = this.f$0;
                View[] viewArr = passportActivity3.inputExtraFields;
                if (viewArr != null) {
                    View view = viewArr[0];
                    while (view != null && passportActivity3.linearLayout2.indexOfChild(view) < 0) {
                        view = (View) view.getParent();
                    }
                    if (view != null) {
                        passportActivity3.scrollView.smoothScrollTo(0, view.getTop() - ((passportActivity3.scrollView.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
                    }
                }
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f$0.inputFields[2]);
                break;
            case 4:
                this.f$0.needHideProgress();
                break;
            case 5:
                int i = 0;
                while (true) {
                    PassportActivity passportActivity4 = this.f$0;
                    if (i >= passportActivity4.linearLayout2.getChildCount()) {
                        passportActivity4.needHideProgress();
                        passportActivity4.typesViews.clear();
                        passportActivity4.typesValues.clear();
                        passportActivity4.currentForm.values.clear();
                        passportActivity4.updateManageVisibility();
                    } else {
                        View childAt = passportActivity4.linearLayout2.getChildAt(i);
                        if (childAt instanceof PassportActivity.TextDetailSecureCell) {
                            passportActivity4.linearLayout2.removeView(childAt);
                            i--;
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                this.f$0.finishFragment();
                break;
        }
    }
}
