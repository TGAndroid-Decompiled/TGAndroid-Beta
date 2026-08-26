package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final PrivacyControlActivity.ListAdapter f$0;

    public PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda1(PrivacyControlActivity.ListAdapter listAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = listAdapter;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBindViewHolder$4((TL_account.TL_birthday) obj);
                break;
            default:
                this.f$0.lambda$onBindViewHolder$7((Integer) obj);
                break;
        }
    }
}
