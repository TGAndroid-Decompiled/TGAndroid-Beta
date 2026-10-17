package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class b50 extends org.telegram.ui.bu0 {
    public final ArrayList f24796a;
    public final e50 f24797b;

    public b50(e50 e50Var, ArrayList arrayList) {
        this.f24797b = e50Var;
        this.f24796a = arrayList;
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        d50 d50Var = this.f24797b.f25806b;
        if (d50Var == null) {
            return null;
        }
        return d50Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f24797b.s((MediaController.PhotoEntry) this.f24796a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
