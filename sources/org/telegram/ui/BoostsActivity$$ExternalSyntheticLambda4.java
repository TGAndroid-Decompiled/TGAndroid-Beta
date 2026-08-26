package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class BoostsActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final BoostsActivity f$0;

    public BoostsActivity$$ExternalSyntheticLambda4(BoostsActivity boostsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = boostsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BoostsActivity boostsActivity = this.f$0;
                boostsActivity.getClass();
                CountDownLatch countDownLatch = new CountDownLatch(2);
                boostsActivity.loadOnlyBoosts(countDownLatch, null);
                boostsActivity.loadOnlyGifts(countDownLatch, null);
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
                NotificationCenter.getInstance(boostsActivity.currentAccount).doOnIdle(new BoostsActivity$$ExternalSyntheticLambda4(boostsActivity, 4));
                break;
            case 1:
                BoostsActivity boostsActivity2 = this.f$0;
                boostsActivity2.usersLoading = false;
                boostsActivity2.updateRows(true);
                break;
            case 2:
                BoostsActivity boostsActivity3 = this.f$0;
                boostsActivity3.usersLoading = false;
                boostsActivity3.updateRows(true);
                break;
            case 3:
                BoostsActivity boostsActivity4 = this.f$0;
                boostsActivity4.usersLoading = false;
                boostsActivity4.updateRows(true);
                break;
            default:
                BoostsActivity boostsActivity5 = this.f$0;
                boostsActivity5.getClass();
                AndroidUtilities.runOnUIThread(new BoostsActivity$$ExternalSyntheticLambda4(boostsActivity5, 1));
                break;
        }
    }
}
