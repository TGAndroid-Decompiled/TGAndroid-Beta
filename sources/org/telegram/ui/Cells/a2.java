package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class a2 implements Runnable {

    public final boolean f24054a;

    public final d2 f24055b;

    public a2(d2 d2Var, boolean z10) {
        this.f24055b = d2Var;
        this.f24054a = z10;
    }

    @Override
    public final void run() {
        File file;
        File file2;
        String str;
        String attachFileName;
        File pathToAttach;
        d2 d2Var = this.f24055b;
        int i10 = d2Var.d;
        int i11 = d2Var.K;
        String string = null;
        if (i11 == 5 || i11 == 3) {
            TLRPC.Document document = d2Var.G;
            if (document != null) {
                string = FileLoader.getAttachFileName(document);
                file = FileLoader.getInstance(i10).getPathToAttach(d2Var.G);
            } else if (d2Var.E.content instanceof TLRPC.TL_webDocument) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(d2Var.E.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(d2Var.E.content.url, d2Var.K == 5 ? "mp3" : "ogg"));
                string = sb2.toString();
                file = new File(FileLoader.getDirectory(4), string);
            } else {
                str = null;
                file2 = null;
            }
            file2 = file;
            str = string;
        } else if (d2Var.L) {
            TLRPC.BotInlineResult botInlineResult = d2Var.E;
            if (botInlineResult != null) {
                TLRPC.Document document2 = botInlineResult.document;
                if (document2 instanceof TLRPC.TL_document) {
                    attachFileName = FileLoader.getAttachFileName(document2);
                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.E.document);
                } else {
                    TLRPC.Photo photo = botInlineResult.photo;
                    if (photo instanceof TLRPC.TL_photo) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true);
                        d2Var.J = closestPhotoSizeWithSize;
                        attachFileName = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.J);
                    } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(Utilities.MD5(d2Var.E.content.url));
                        sb3.append(".");
                        TLRPC.WebDocument webDocument = d2Var.E.content;
                        sb3.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                        attachFileName = sb3.toString();
                        pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                        if (d2Var.K == 2) {
                            TLRPC.WebDocument webDocument2 = d2Var.E.thumb;
                            if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                attachFileName = null;
                            }
                        }
                    } else if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(Utilities.MD5(d2Var.E.thumb.url));
                        sb4.append(".");
                        TLRPC.WebDocument webDocument3 = d2Var.E.thumb;
                        sb4.append(ImageLoader.getHttpUrlExtension(webDocument3.url, FileLoader.getMimeTypePart(webDocument3.mime_type)));
                        attachFileName = sb4.toString();
                        pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                    } else {
                        pathToAttach = null;
                        attachFileName = null;
                    }
                }
            } else {
                TLRPC.Document document3 = d2Var.G;
                if (document3 != null) {
                    attachFileName = FileLoader.getAttachFileName(document3);
                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.G);
                } else {
                    pathToAttach = null;
                    attachFileName = null;
                }
            }
            TLRPC.Document document4 = d2Var.G;
            if (document4 == null || d2Var.K != 2 || MessageObject.getDocumentVideoThumb(document4) == null) {
                file2 = pathToAttach;
                str = attachFileName;
            } else {
                file2 = pathToAttach;
                str = string;
            }
        } else {
            str = null;
            file2 = null;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.f24054a));
    }
}
