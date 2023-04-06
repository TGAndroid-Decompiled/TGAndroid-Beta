package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.Components.ViewPagerFixed;
public final class ViewPagerFixed$TabsView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final ViewPagerFixed$TabsView$$ExternalSyntheticLambda0 INSTANCE = new ViewPagerFixed$TabsView$$ExternalSyntheticLambda0();

    private ViewPagerFixed$TabsView$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ViewPagerFixed.TabsView.lambda$setIsEditing$1(tLObject, tLRPC$TL_error);
    }
}
