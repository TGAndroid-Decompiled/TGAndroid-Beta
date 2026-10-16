package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class am extends zu0 {
    public final MessageObject f33987a;
    public final MediaController.PhotoEntry f33988b;
    public final fo f33989c;

    public am(fo foVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f33989c = foVar;
        this.f33987a = messageObject;
        this.f33988b = photoEntry;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.f33989c, this.f33987a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        fo foVar = this.f33989c;
        if (foVar.Y != null && foVar.C9()) {
            foVar.Y.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f33989c.p5;
        MessageObject messageObject2 = this.f33987a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f33989c.Y.c1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fo foVar = this.f33989c;
        if (foVar.p5 != this.f33987a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f33988b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            foVar.Y.b0();
        } else {
            foVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
