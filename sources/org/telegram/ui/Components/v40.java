package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class v40 extends org.telegram.ui.lu0 {
    public final ArrayList f29028a;
    public final y40 f29029b;

    public v40(y40 y40Var, ArrayList arrayList) {
        this.f29029b = y40Var;
        this.f29028a = arrayList;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x40 x40Var = this.f29029b.f30581b;
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
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f29029b.t((MediaController.PhotoEntry) this.f29028a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
