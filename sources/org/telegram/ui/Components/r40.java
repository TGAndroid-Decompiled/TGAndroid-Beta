package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class r40 extends org.telegram.ui.su0 {
    public final ArrayList f29955a;
    public final u40 f29956b;

    public r40(u40 u40Var, ArrayList arrayList) {
        this.f29956b = u40Var;
        this.f29955a = arrayList;
    }

    @Override
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        t40 t40Var = this.f29956b.f30827b;
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
        this.f29956b.t((MediaController.PhotoEntry) this.f29955a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
