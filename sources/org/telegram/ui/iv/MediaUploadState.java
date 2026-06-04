package org.telegram.ui.iv;

import android.graphics.Bitmap;
import org.telegram.tgnet.TLRPC;

public class MediaUploadState {
    public TLRPC.Document document;
    public int duration;
    public int height;
    public int imageId;
    public boolean isVideo;
    public String localPath;
    public Bitmap localThumbBitmap;
    public TLRPC.Photo photo;
    public float progress;
    public int state = 0;
    public String thumbPath;
    public int width;

    public boolean isReady() {
        if (this.state != 2) {
            return false;
        }
        if (this.isVideo) {
            if (this.document == null) {
                return false;
            }
        } else if (this.photo == null) {
            return false;
        }
        return true;
    }

    public boolean isPending() {
        return this.state == 1;
    }
}
