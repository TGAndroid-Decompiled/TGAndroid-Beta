package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class b50 extends org.telegram.ui.tu0 {
    public final ArrayList f21726a;
    public final e50 f21727b;

    public b50(e50 e50Var, ArrayList arrayList) {
        this.f21727b = e50Var;
        this.f21726a = arrayList;
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        d50 d50Var = this.f21727b.f22553b;
        if (d50Var == null) {
            return null;
        }
        return d50Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f21727b.t((MediaController.PhotoEntry) this.f21726a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
