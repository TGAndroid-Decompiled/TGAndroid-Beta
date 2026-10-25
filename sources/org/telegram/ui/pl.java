package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pl extends gu0 {
    public final MessageObject f42566a;
    public final MediaController.PhotoEntry f42567b;
    public final un f42568c;

    public pl(un unVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42568c = unVar;
        this.f42566a = messageObject;
        this.f42567b = photoEntry;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.G1(this.f42568c, this.f42566a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        un unVar = this.f42568c;
        if (unVar.Y != null && unVar.F9()) {
            unVar.Y.M();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f42568c.B5;
        MessageObject messageObject2 = this.f42566a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f42568c.Y.c1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.f42568c;
        if (unVar.B5 != this.f42566a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f42567b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            unVar.Y.a0();
        } else {
            unVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
