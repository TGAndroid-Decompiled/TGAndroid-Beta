package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pl extends bu0 {
    public final MessageObject f40184a;
    public final MediaController.PhotoEntry f40185b;
    public final sn f40186c;

    public pl(sn snVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40186c = snVar;
        this.f40184a = messageObject;
        this.f40185b = photoEntry;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.f40186c, this.f40184a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        sn snVar = this.f40186c;
        if (snVar.Y != null && snVar.C9()) {
            snVar.Y.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f40186c.p5;
        MessageObject messageObject2 = this.f40184a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40186c.Y.c1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        sn snVar = this.f40186c;
        if (snVar.p5 != this.f40184a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40185b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            snVar.Y.b0();
        } else {
            snVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
