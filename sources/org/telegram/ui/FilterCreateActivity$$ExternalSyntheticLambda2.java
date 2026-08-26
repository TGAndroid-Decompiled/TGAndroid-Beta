package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

public final class FilterCreateActivity$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda2(FilterCreateActivity filterCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterCreateActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onEdit((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            case 1:
                this.f$0.onDelete((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.f$0.lambda$deleteFolder$14((Boolean) obj);
                break;
        }
    }
}
