package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;

public final class PaymentFormActivity$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final long f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda54(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PaymentFormActivity.lambda$sendData$61(this.f$0);
                break;
            case 1:
                PaymentFormActivity.lambda$sendData$56(this.f$0);
                break;
            default:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ChatActivity.of(this.f$0));
                }
                break;
        }
    }
}
