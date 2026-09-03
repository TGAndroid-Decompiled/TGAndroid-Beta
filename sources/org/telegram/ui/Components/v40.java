package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class v40 extends org.telegram.ui.fu0 {
    public final ArrayList f31789a;
    public final y40 f31790b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.f31790b = y40Var;
        this.f31789a = arrayList;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        x40 x40Var = this.f31790b.f33310b;
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
        this.f31790b.t((MediaController.PhotoEntry) this.f31789a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
