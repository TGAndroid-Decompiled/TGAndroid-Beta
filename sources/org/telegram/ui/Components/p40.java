package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class p40 extends org.telegram.ui.pt0 {
    public final ArrayList f31576a;
    public final s40 f31577b;

    public p40(s40 s40Var, ArrayList arrayList) {
        this.f31577b = s40Var;
        this.f31576a = arrayList;
    }

    @Override
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        r40 r40Var = this.f31577b.f32470b;
        if (r40Var == null) {
            return null;
        }
        return r40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f31577b.t((MediaController.PhotoEntry) this.f31576a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
