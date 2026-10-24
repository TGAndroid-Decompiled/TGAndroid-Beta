package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class z40 extends org.telegram.ui.bu0 {
    public final ArrayList f33148a;
    public final c50 f33149b;

    public z40(c50 c50Var, ArrayList arrayList) {
        this.f33149b = c50Var;
        this.f33148a = arrayList;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        b50 b50Var = this.f33149b.f25186b;
        if (b50Var == null) {
            return null;
        }
        return b50Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f33149b.s((MediaController.PhotoEntry) this.f33148a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
