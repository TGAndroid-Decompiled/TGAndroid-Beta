package org.telegram.p009ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class FilterTabsView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final FilterTabsView$$ExternalSyntheticLambda0 INSTANCE = new FilterTabsView$$ExternalSyntheticLambda0();

    private FilterTabsView$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        FilterTabsView.lambda$setIsEditing$2(tLObject, tLRPC$TL_error);
    }
}
