package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class d50 extends org.telegram.ui.gu0 {
    public final ArrayList f27398a;
    public final g50 f27399b;

    public d50(g50 g50Var, ArrayList arrayList) {
        this.f27399b = g50Var;
        this.f27398a = arrayList;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        f50 f50Var = this.f27399b.f28422b;
        if (f50Var == null) {
            return null;
        }
        return f50Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f27399b.s((MediaController.PhotoEntry) this.f27398a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
