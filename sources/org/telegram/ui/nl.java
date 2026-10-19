package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class nl extends zt0 {
    public final MessageObject f39639a;
    public final MediaController.PhotoEntry f39640b;
    public final qn f39641c;

    public nl(qn qnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39641c = qnVar;
        this.f39639a = messageObject;
        this.f39640b = photoEntry;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.f39641c, this.f39639a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        qn qnVar = this.f39641c;
        if (qnVar.Y != null && qnVar.C9()) {
            qnVar.Y.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f39641c.p5;
        MessageObject messageObject2 = this.f39639a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39641c.Y.c1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        qn qnVar = this.f39641c;
        if (qnVar.p5 != this.f39639a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39640b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            qnVar.Y.b0();
        } else {
            qnVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
