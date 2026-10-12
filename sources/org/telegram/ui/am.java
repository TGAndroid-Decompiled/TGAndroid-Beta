package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends av0 {
    public final MessageObject f34277a;
    public final MediaController.PhotoEntry f34278b;
    public final fo f34279c;

    public am(fo foVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f34279c = foVar;
        this.f34277a = messageObject;
        this.f34278b = photoEntry;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f34279c, this.f34277a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        fo foVar = this.f34279c;
        if (foVar.Y != null && foVar.C9()) {
            foVar.Y.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f34279c.p5;
        MessageObject messageObject2 = this.f34277a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f34279c.Y.d1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fo foVar = this.f34279c;
        if (foVar.p5 != this.f34277a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f34278b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            foVar.Y.b0();
        } else {
            foVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
