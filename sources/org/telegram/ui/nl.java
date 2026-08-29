package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class nl extends pt0 {
    public final MessageObject f40838a;
    public final MediaController.PhotoEntry f40839b;
    public final tn f40840c;

    public nl(tn tnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40840c = tnVar;
        this.f40838a = messageObject;
        this.f40839b = photoEntry;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return tn.A1(this.f40840c, this.f40838a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        tn tnVar = this.f40840c;
        if (tnVar.U != null && tnVar.x9()) {
            tnVar.U.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f40840c.f42880l5;
        MessageObject messageObject2 = this.f40838a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40840c.U.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tn tnVar = this.f40840c;
        if (tnVar.f42880l5 != this.f40838a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40839b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            tnVar.U.d0();
        } else {
            tnVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
