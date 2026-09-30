package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class u40 extends org.telegram.ui.lu0 {
    public final ArrayList f28729a;
    public final x40 f28730b;

    public u40(x40 x40Var, ArrayList arrayList) {
        this.f28730b = x40Var;
        this.f28729a = arrayList;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w40 w40Var = this.f28730b.f30223b;
        if (w40Var == null) {
            return null;
        }
        return w40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f28730b.t((MediaController.PhotoEntry) this.f28729a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
