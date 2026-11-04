package org.telegram.ui;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class e4 {
    public static TLRPC.Document a(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f27007id == j10) {
                return document;
            }
            for (int i3 = 0; i3 < webPage.cached_page.documents.size(); i3++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i3);
                if (document2.f27007id == j10) {
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
        for (int i3 = 0; i3 < richMessage.documents.size(); i3++) {
            TLRPC.Document document = richMessage.documents.get(i3);
            if (document.f27007id == j10) {
                return document;
            }
        }
        return null;
    }

    public static File c(TLObject tLObject) {
        org.telegram.messenger.w7.G(org.telegram.messenger.h10.f22829t0);
        File K = org.telegram.messenger.w7.K(tLObject, null, false, true);
        if (K != null && K.exists()) {
            return K;
        }
        File K2 = org.telegram.messenger.w7.K(tLObject, null, true, true);
        if (K2 != null && K2.exists()) {
            return K2;
        }
        if (K != null) {
            return K;
        }
        return K2;
    }

    public static TLRPC.Photo d(long j10, TLObject tLObject) {
        if (tLObject instanceof TL_iv.RichMessage) {
            return f((TL_iv.RichMessage) tLObject, j10);
        }
        if (tLObject instanceof TL_iv.Page) {
            TL_iv.Page page = (TL_iv.Page) tLObject;
            for (int i3 = 0; i3 < page.photos.size(); i3++) {
                TLRPC.Photo photo = page.photos.get(i3);
                if (photo.f27025id == j10) {
                    return photo;
                }
            }
            return null;
        } else if (!(tLObject instanceof TLRPC.WebPage)) {
            return null;
        } else {
            return e((TLRPC.WebPage) tLObject, j10);
        }
    }

    public static TLRPC.Photo e(TLRPC.WebPage webPage, long j10) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.f27025id == j10) {
                return photo;
            }
            for (int i3 = 0; i3 < webPage.cached_page.photos.size(); i3++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i3);
                if (photo2.f27025id == j10) {
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
        for (int i3 = 0; i3 < richMessage.photos.size(); i3++) {
            TLRPC.Photo photo = richMessage.photos.get(i3);
            if (photo.f27025id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static boolean g(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.Document a10;
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
            return org.telegram.messenger.zi.L4(a10);
        }
        return false;
    }
}
