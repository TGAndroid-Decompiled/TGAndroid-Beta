package org.telegram.ui.iv;

import org.telegram.tgnet.TLRPC;

public final class MediaUploadState {
    public TLRPC.Document audioDisplayDocument;
    public TLRPC.Document document;
    public boolean hasSpoiler;
    public int height;
    public int invert;
    public boolean isAudio;
    public boolean isDocument;
    public boolean isVideo;
    public String localPath;
    public int orientation;
    public TLRPC.Photo photo;
    public float progress;
    public int state = 0;
    public int width;

    public final boolean isPending() {
        return this.state == 1;
    }

    public final boolean isReady() {
        if (this.state != 2) {
            return false;
        }
        if (this.isVideo || this.isAudio || this.isDocument) {
            return this.document != null;
        }
        return this.photo != null;
    }
}
