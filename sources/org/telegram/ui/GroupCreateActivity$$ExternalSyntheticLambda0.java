package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AlertDialog;
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
        this.f$0.lambda$createView$0(i);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$checkDiscard$13(alertDialog, i);
                break;
            default:
                this.f$0.lambda$checkDiscard$14(alertDialog, i);
                break;
        }
    }
}
