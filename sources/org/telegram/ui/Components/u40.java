package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class u40 extends org.telegram.ui.fu0 {
    public final ArrayList f29108a;
    public final x40 f29109b;

    public u40(x40 x40Var, ArrayList arrayList) {
        this.f29109b = x40Var;
        this.f29108a = arrayList;
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        w40 w40Var = this.f29109b.f30467b;
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
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f29109b.t((MediaController.PhotoEntry) this.f29108a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
