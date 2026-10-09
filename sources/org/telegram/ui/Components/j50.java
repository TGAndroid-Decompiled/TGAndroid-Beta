package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class j50 extends org.telegram.ui.uu0 {
    public final ArrayList f27606a;
    public final m50 f27607b;

    public j50(m50 m50Var, ArrayList arrayList) {
        this.f27607b = m50Var;
        this.f27606a = arrayList;
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        l50 l50Var = this.f27607b.f28683b;
        if (l50Var == null) {
            return null;
        }
        return l50Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f27607b.s((MediaController.PhotoEntry) this.f27606a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
