package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k50 extends org.telegram.ui.tu0 {
    public final ArrayList f27846a;
    public final n50 f27847b;

    public k50(n50 n50Var, ArrayList arrayList) {
        this.f27847b = n50Var;
        this.f27846a = arrayList;
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        m50 m50Var = this.f27847b.f28949b;
        if (m50Var == null) {
            return null;
        }
        return m50Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f27847b.s((MediaController.PhotoEntry) this.f27846a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
