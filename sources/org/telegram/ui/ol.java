package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ol extends bu0 {
    public final MessageObject f40211a;
    public final MediaController.PhotoEntry f40212b;
    public final sn f40213c;

    public ol(sn snVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40213c = snVar;
        this.f40211a = messageObject;
        this.f40212b = photoEntry;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.f40213c, this.f40211a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        sn snVar = this.f40213c;
        if (snVar.Y != null && snVar.C9()) {
            snVar.Y.M();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f40213c.B5;
        MessageObject messageObject2 = this.f40211a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40213c.Y.c1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        sn snVar = this.f40213c;
        if (snVar.B5 != this.f40211a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40212b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            snVar.Y.a0();
        } else {
            snVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
