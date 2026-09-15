package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r40 extends org.telegram.ui.tu0 {
    public final ArrayList f27549a;
    public final u40 f27550b;

    public r40(u40 u40Var, ArrayList arrayList) {
        this.f27550b = u40Var;
        this.f27549a = arrayList;
    }

    @Override
    public final org.telegram.ui.dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        t40 t40Var = this.f27550b.f28284b;
        if (t40Var == null) {
            return null;
        }
        return t40Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f27550b.t((MediaController.PhotoEntry) this.f27549a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
