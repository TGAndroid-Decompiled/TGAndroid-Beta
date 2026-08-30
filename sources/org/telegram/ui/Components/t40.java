package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class t40 extends org.telegram.ui.yt0 {
    public final ArrayList f28897a;
    public final w40 f28898b;

    public t40(w40 w40Var, ArrayList arrayList) {
        this.f28898b = w40Var;
        this.f28897a = arrayList;
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        v40 v40Var = this.f28898b.f30191b;
        if (v40Var == null) {
            return null;
        }
        return v40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f28898b.t((MediaController.PhotoEntry) this.f28897a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
