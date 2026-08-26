package org.telegram.ui.ActionBar;

public final class ActionBarMenuItem$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final ActionBarMenuItem f$0;
    public final int f$1;

    public ActionBarMenuItem$$ExternalSyntheticLambda4(ActionBarMenuItem actionBarMenuItem, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = actionBarMenuItem;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ActionBarMenuItem actionBarMenuItem = this.f$0;
                if (actionBarMenuItem.popupLayout.getSwipeBack() != null) {
                    actionBarMenuItem.popupLayout.getSwipeBack().openForeground(this.f$1);
                }
                break;
            default:
                ActionBarMenuItem actionBarMenuItem2 = this.f$0;
                if (actionBarMenuItem2.popupLayout.getSwipeBack() != null) {
                    actionBarMenuItem2.popupLayout.getSwipeBack().openForeground(this.f$1);
                }
                break;
        }
    }
}
