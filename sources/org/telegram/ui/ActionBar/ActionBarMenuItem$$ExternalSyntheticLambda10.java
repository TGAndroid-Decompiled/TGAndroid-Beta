package org.telegram.ui.ActionBar;

public final class ActionBarMenuItem$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final ActionBarMenuItem f$0;
    public final int f$1;

    public ActionBarMenuItem$$ExternalSyntheticLambda10(ActionBarMenuItem actionBarMenuItem, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = actionBarMenuItem;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addSwipeBackItem$7(this.f$1);
                break;
            default:
                ActionBarMenuItem actionBarMenuItem = this.f$0;
                if (actionBarMenuItem.popupLayout.getSwipeBack() != null) {
                    actionBarMenuItem.popupLayout.getSwipeBack().openForeground(this.f$1);
                }
                break;
        }
    }
}
