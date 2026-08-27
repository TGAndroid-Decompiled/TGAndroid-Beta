package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class ml extends st0 {

    public final MessageObject f40540a;

    public final MediaController.PhotoEntry f40541b;

    public final rn f40542c;

    public ml(rn rnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40542c = rnVar;
        this.f40540a = messageObject;
        this.f40541b = photoEntry;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return rn.A1(this.f40542c, this.f40540a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        rn rnVar = this.f40542c;
        if (rnVar.U == null || !rnVar.x9()) {
            return false;
        }
        rnVar.U.P();
        return true;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f40542c.f42119l5;
        MessageObject messageObject2 = this.f40540a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40542c.U.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rn rnVar = this.f40542c;
        if (rnVar.f42119l5 != this.f40540a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40541b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            rnVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            rnVar.U.d0();
        }
    }
}
