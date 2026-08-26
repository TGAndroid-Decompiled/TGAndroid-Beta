package org.telegram.ui;

public final class GroupCreateActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final GroupCreateActivity f$0;

    public GroupCreateActivity$$ExternalSyntheticLambda7(GroupCreateActivity groupCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCreateActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GroupCreateActivity groupCreateActivity = this.f$0;
                groupCreateActivity.listView.postOnAnimation(new GroupCreateActivity$$ExternalSyntheticLambda7(groupCreateActivity, 2));
                break;
            case 1:
                this.f$0.finishFragment();
                break;
            case 2:
                GroupCreateActivity groupCreateActivity2 = this.f$0;
                groupCreateActivity2.checkUi_listClip$1();
                groupCreateActivity2.blur3_InvalidateBlur$5();
                break;
            default:
                GroupCreateActivity groupCreateActivity3 = this.f$0;
                groupCreateActivity3.getClass();
                groupCreateActivity3.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
        }
    }
}
