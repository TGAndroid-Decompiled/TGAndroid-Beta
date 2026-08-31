package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class v40 extends org.telegram.ui.au0 {
    public final ArrayList f31803a;
    public final y40 f31804b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.f31804b = y40Var;
        this.f31803a = arrayList;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        x40 x40Var = this.f31804b.f33295b;
        if (x40Var == null) {
            return null;
        }
        return x40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f31804b.t((MediaController.PhotoEntry) this.f31803a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
