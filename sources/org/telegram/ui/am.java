package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends wu0 {
    public final MessageObject f35899a;
    public final MediaController.PhotoEntry f35900b;
    public final eo f35901c;

    public am(eo eoVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f35901c = eoVar;
        this.f35899a = messageObject;
        this.f35900b = photoEntry;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.E1(this.f35901c, this.f35899a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        eo eoVar = this.f35901c;
        if (eoVar.Y != null && eoVar.C9()) {
            eoVar.Y.Q();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f35901c.p5;
        MessageObject messageObject2 = this.f35899a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f35901c.Y.h1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        eo eoVar = this.f35901c;
        if (eoVar.p5 != this.f35899a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f35900b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            eoVar.Y.e0();
        } else {
            eoVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
