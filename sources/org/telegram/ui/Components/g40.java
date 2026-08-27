package org.telegram.ui.Components;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class g40 extends org.telegram.ui.st0 {

    public final ArrayList f28528a;

    public final j40 f28529b;

    public g40(j40 j40Var, ArrayList arrayList) {
        this.f28529b = j40Var;
        this.f28528a = arrayList;
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        i40 i40Var = this.f28529b.f29570b;
        if (i40Var == null) {
            return null;
        }
        return i40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) throws FileNotFoundException {
        this.f28529b.t((MediaController.PhotoEntry) this.f28528a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
