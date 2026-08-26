package org.telegram.ui.Stars;

public final class StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0 implements Runnable {
    public final long f$0;
    public final int f$1;
    public final int f$2;
    public final boolean f$3;

    public StarsIntroActivity$StarsTransactionsLayout$Page$$ExternalSyntheticLambda0(long j, int i, int i2, boolean z) {
        this.f$0 = j;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        long j = this.f$0;
        int i = this.f$1;
        int i2 = this.f$2;
        if (j != 0) {
            BotStarsController.getInstance(i).loadTransactions(i2, j);
        } else {
            StarsController.getInstance(i, this.f$3).loadTransactions(i2);
        }
    }
}
