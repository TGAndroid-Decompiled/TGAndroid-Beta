package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSpansContainer;

public final class GroupCreateActivity$$ExternalSyntheticLambda0 implements FragmentSpansContainer.Delegate, AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener {
    public final int $r8$classId;
    public final GroupCreateActivity f$0;

    public GroupCreateActivity$$ExternalSyntheticLambda0(GroupCreateActivity groupCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateActivity;
    }

    @Override
    public void onAfterMeasure(int i) {
        GroupCreateActivity groupCreateActivity = this.f$0;
        groupCreateActivity.animatorSelectorContainerHeight.animateTo(Math.min(i, groupCreateActivity.maxSize));
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        GroupCreateActivity groupCreateActivity = this.f$0;
        int i = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false).bottom;
        groupCreateActivity.navigationBarHeight = i;
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = groupCreateActivity.buttonsContainer;
        if (anonymousClass7 != null) {
            anonymousClass7.setPadding(0, 0, 0, i);
        }
        groupCreateActivity.checkUi_listViewPadding$3();
        FragmentFloatingButton fragmentFloatingButton = groupCreateActivity.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(-Math.max(groupCreateActivity.navigationBarHeight, groupCreateActivity.imeInsetAnimatedHeight));
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$checkDiscard$14(alertDialog, i);
                break;
            default:
                this.f$0.onDonePressed();
                break;
        }
    }
}
