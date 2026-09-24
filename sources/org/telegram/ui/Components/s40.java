package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class s40 extends org.telegram.ui.lu0 {
    public final ArrayList f28134a;
    public final v40 f28135b;

    public s40(v40 v40Var, ArrayList arrayList) {
        this.f28135b = v40Var;
        this.f28134a = arrayList;
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u40 u40Var = this.f28135b.f28986b;
        if (u40Var == null) {
            return null;
        }
        return u40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f28135b.t((MediaController.PhotoEntry) this.f28134a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
