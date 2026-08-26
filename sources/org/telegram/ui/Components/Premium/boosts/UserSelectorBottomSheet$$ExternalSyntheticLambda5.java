package org.telegram.ui.Components.Premium.boosts;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.BubbleActivity;

public final class UserSelectorBottomSheet$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId;
    public final UserSelectorBottomSheet f$0;

    public UserSelectorBottomSheet$$ExternalSyntheticLambda5(UserSelectorBottomSheet userSelectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = userSelectorBottomSheet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                UserSelectorBottomSheet userSelectorBottomSheet = this.f$0;
                userSelectorBottomSheet.query = (String) obj;
                BubbleActivity.AnonymousClass1 anonymousClass1 = userSelectorBottomSheet.remoteSearchRunnable;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                AndroidUtilities.runOnUIThread(anonymousClass1, 350L);
                break;
            case 1:
                UserSelectorBottomSheet userSelectorBottomSheet2 = this.f$0;
                ArrayList arrayList = userSelectorBottomSheet2.paymentOptions;
                arrayList.clear();
                arrayList.addAll((List) obj);
                UserSelectorBottomSheet.AnonymousClass7 anonymousClass7 = userSelectorBottomSheet2.actionButton;
                if (anonymousClass7.loading) {
                    anonymousClass7.setLoading(false);
                    if (userSelectorBottomSheet2.recyclerListView.mIsAttached) {
                        userSelectorBottomSheet2.next();
                    }
                }
                break;
            case 2:
                this.f$0.dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                this.f$0.lambda$openBirthdaySetup$28((TL_account.TL_birthday) obj);
                break;
        }
    }
}
