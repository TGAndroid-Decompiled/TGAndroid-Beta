package org.telegram.ui.Stars;

import android.os.Bundle;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.StatisticActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda131 implements Runnable {
    public final int $r8$classId = 0;
    public final long f$0;
    public final BaseFragment f$1;

    public StarGiftSheet$$ExternalSyntheticLambda131(long j, BaseFragment baseFragment) {
        this.f$0 = j;
        this.f$1 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Bundle bundle = new Bundle();
                long j = this.f$0;
                if (j >= 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f$1.presentFragment(new ProfileActivity(bundle));
                break;
            default:
                BaseFragment baseFragment = this.f$1;
                baseFragment.presentFragment(StatisticActivity.create(baseFragment.getMessagesController().getChat(Long.valueOf(-this.f$0))));
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda131(BaseFragment baseFragment, long j) {
        this.f$1 = baseFragment;
        this.f$0 = j;
    }
}
