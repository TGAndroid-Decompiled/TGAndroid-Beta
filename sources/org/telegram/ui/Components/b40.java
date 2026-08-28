package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class b40 extends org.telegram.ui.rt0 {
    public final ArrayList f27032a;
    public final e40 f27033b;

    public b40(e40 e40Var, ArrayList arrayList) {
        this.f27033b = e40Var;
        this.f27032a = arrayList;
    }

    @Override
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        d40 d40Var = this.f27033b.f27910b;
        if (d40Var == null) {
            return null;
        }
        return d40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        this.f27033b.t((MediaController.PhotoEntry) this.f27032a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
