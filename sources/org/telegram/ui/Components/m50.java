package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m50 extends org.telegram.ui.wu0 {
    public final ArrayList f28400a;
    public final p50 f28401b;

    public m50(p50 p50Var, ArrayList arrayList) {
        this.f28401b = p50Var;
        this.f28400a = arrayList;
    }

    @Override
    public final org.telegram.ui.gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        o50 o50Var = this.f28401b.f29379b;
        if (o50Var == null) {
            return null;
        }
        return o50Var.getCloseIntoObject();
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f28401b.s((MediaController.PhotoEntry) this.f28400a.get(0));
    }

    @Override
    public final boolean z() {
        return false;
    }
}
