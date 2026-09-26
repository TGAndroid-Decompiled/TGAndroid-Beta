package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class t40 extends org.telegram.ui.lu0 {
    public final ArrayList f28454a;
    public final w40 f28455b;

    public t40(w40 w40Var, ArrayList arrayList) {
        this.f28455b = w40Var;
        this.f28454a = arrayList;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        v40 v40Var = this.f28455b.f29842b;
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
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f28455b.t((MediaController.PhotoEntry) this.f28454a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
