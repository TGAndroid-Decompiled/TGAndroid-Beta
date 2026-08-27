package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public abstract class j4 {
    public static TLRPC.Document a(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f22386id == j10) {
                return document;
            }
            for (int i10 = 0; i10 < webPage.cached_page.documents.size(); i10++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i10);
                if (document2.f22386id == j10) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document b(TL_iv.RichMessage richMessage, long j10) {
        if (richMessage == null) {
            return null;
        }
        for (int i10 = 0; i10 < richMessage.documents.size(); i10++) {
            TLRPC.Document document = richMessage.documents.get(i10);
            if (document.f22386id == j10) {
                return document;
            }
        }
        return null;
    }

    public static File c(TLObject tLObject) {
        FileLoader fileLoader = FileLoader.getInstance(UserConfig.selectedAccount);
        File pathToAttach = fileLoader.getPathToAttach(tLObject, false);
        if (pathToAttach != null && pathToAttach.exists()) {
            return pathToAttach;
        }
        File pathToAttach2 = fileLoader.getPathToAttach(tLObject, true);
        return ((pathToAttach2 == null || !pathToAttach2.exists()) && pathToAttach != null) ? pathToAttach : pathToAttach2;
    }

    public static TLRPC.Photo d(long j10, TLObject tLObject) {
        if (tLObject instanceof TL_iv.RichMessage) {
            return f((TL_iv.RichMessage) tLObject, j10);
        }
        if (!(tLObject instanceof TL_iv.Page)) {
            if (tLObject instanceof TLRPC.WebPage) {
                return e((TLRPC.WebPage) tLObject, j10);
            }
            return null;
        }
        TL_iv.Page page = (TL_iv.Page) tLObject;
        for (int i10 = 0; i10 < page.photos.size(); i10++) {
            TLRPC.Photo photo = page.photos.get(i10);
            if (photo.f22404id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static TLRPC.Photo e(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.f22404id == j10) {
                return photo;
            }
            for (int i10 = 0; i10 < webPage.cached_page.photos.size(); i10++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i10);
                if (photo2.f22404id == j10) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo f(TL_iv.RichMessage richMessage, long j10) {
        if (richMessage == null) {
            return null;
        }
        for (int i10 = 0; i10 < richMessage.photos.size(); i10++) {
            TLRPC.Photo photo = richMessage.photos.get(i10);
            if (photo.f22404id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static boolean g(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.Document documentA;
        if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentA = a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
            return false;
        }
        return MessageObject.isVideoDocument(documentA);
    }
}
