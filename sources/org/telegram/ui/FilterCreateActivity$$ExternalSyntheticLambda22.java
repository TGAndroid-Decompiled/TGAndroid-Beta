package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$TL_exportedChatlistInvite;
public final class FilterCreateActivity$$ExternalSyntheticLambda22 implements Utilities.Callback {
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda22(FilterCreateActivity filterCreateActivity) {
        this.f$0 = filterCreateActivity;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.onDelete((TLRPC$TL_exportedChatlistInvite) obj);
    }
}
