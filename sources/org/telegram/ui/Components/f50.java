package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class f50 extends org.telegram.ui.av0 {
    public final ArrayList f24904a;
    public final i50 f24905b;

    public f50(i50 i50Var, ArrayList arrayList) {
        this.f24905b = i50Var;
        this.f24904a = arrayList;
    }

    @Override
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        h50 h50Var = this.f24905b.f25830b;
        if (h50Var == null) {
            return null;
        }
        return h50Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f24905b.s((MediaController.PhotoEntry) this.f24904a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
