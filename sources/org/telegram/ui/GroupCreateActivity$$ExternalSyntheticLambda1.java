package org.telegram.ui;

import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

public final class GroupCreateActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final GroupCreateActivity f$0;

    public GroupCreateActivity$$ExternalSyntheticLambda1(GroupCreateActivity groupCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                GroupCreateActivity groupCreateActivity = this.f$0;
                groupCreateActivity.searchField.editText.clearFocus();
                groupCreateActivity.searchField.editText.requestFocus();
                AndroidUtilities.showKeyboard(groupCreateActivity.searchField.editText);
                break;
            case 1:
                GroupCreateActivity groupCreateActivity2 = this.f$0;
                groupCreateActivity2.selectedPremium = null;
                groupCreateActivity2.selectedContacts.clear();
                GroupCreateActivity.AnonymousClass3 anonymousClass3 = groupCreateActivity2.spansContainer;
                anonymousClass3.spansContainer.removeAllSpans();
                GroupCreateActivity groupCreateActivity3 = GroupCreateActivity.this;
                if (groupCreateActivity3.buttonsContainer != null) {
                    groupCreateActivity3.animatorCallButtonsVisible.setValue(!groupCreateActivity3.selectedContacts.isEmpty(), true);
                }
                groupCreateActivity2.checkVisibleRows();
                groupCreateActivity2.updateEditTextHint();
                groupCreateActivity2.updateHint();
                break;
            case 2:
                this.f$0.onDonePressed();
                break;
            case 3:
                GroupCreateActivity groupCreateActivity4 = this.f$0;
                groupCreateActivity4.getClass();
                HashSet hashSet = new HashSet();
                for (int i = 0; i < groupCreateActivity4.selectedContacts.size(); i++) {
                    hashSet.add(Long.valueOf(groupCreateActivity4.selectedContacts.keyAt(i)));
                }
                groupCreateActivity4.onCallUsersSelected(hashSet);
                break;
            default:
                GroupCreateActivity groupCreateActivity5 = this.f$0;
                groupCreateActivity5.getClass();
                HashSet hashSet2 = new HashSet();
                for (int i2 = 0; i2 < groupCreateActivity5.selectedContacts.size(); i2++) {
                    hashSet2.add(Long.valueOf(groupCreateActivity5.selectedContacts.keyAt(i2)));
                }
                groupCreateActivity5.onCallUsersSelected(hashSet2);
                break;
        }
    }
}
