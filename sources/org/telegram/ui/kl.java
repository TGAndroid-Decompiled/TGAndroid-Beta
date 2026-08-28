package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class kl extends rt0 {
    public final MessageObject f39865a;
    public final MediaController.PhotoEntry f39866b;
    public final qn f39867c;

    public kl(qn qnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39867c = qnVar;
        this.f39865a = messageObject;
        this.f39866b = photoEntry;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return qn.A1(this.f39867c, this.f39865a, null, i9, z10, true);
    }

    @Override
    public final boolean O() {
        qn qnVar = this.f39867c;
        if (qnVar.U != null && qnVar.x9()) {
            qnVar.U.O();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f39867c.f41982l5;
        MessageObject messageObject2 = this.f39865a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39867c.U.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        qn qnVar = this.f39867c;
        if (qnVar.f41982l5 != this.f39865a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39866b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            qnVar.U.c0();
        } else {
            qnVar.r(photoEntry, videoEditedInfo, z10, i10, 0, z11, 0L);
        }
    }
}
