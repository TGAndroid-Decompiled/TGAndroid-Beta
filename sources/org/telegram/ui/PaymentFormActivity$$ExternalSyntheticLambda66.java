package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;

public final class PaymentFormActivity$$ExternalSyntheticLambda66 implements Runnable {
    public final int $r8$classId;
    public final long f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda66(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ChatActivity.of(this.f$0));
                }
                break;
            case 1:
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    safeLastFragment2.presentFragment(ChatActivity.of(this.f$0));
                }
                break;
            default:
                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment3 != null) {
                    safeLastFragment3.presentFragment(ChatActivity.of(this.f$0));
                }
                break;
        }
    }
}
