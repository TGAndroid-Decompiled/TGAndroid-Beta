package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zy {
    public String f26946a;
    public String f26947b;
    public boolean f26948c;
    public String d;
    public boolean f26949e;
    public TLRPC.TL_inputStickerSetItem f26950f;
    public j20 f26951g;

    public final void a(int i7, TLRPC.InputFile inputFile, Runnable runnable) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = this.d;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_uploadMedia, new yy(this, runnable), 2);
    }
}
