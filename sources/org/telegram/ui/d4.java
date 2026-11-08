package org.telegram.ui;

import java.io.File;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class d4 {
    public static TLRPC.Document a(TLRPC.WebPage webPage, long j3) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Document document = webPage.document;
            if (document != null && document.f26962id == j3) {
                return document;
            }
            for (int i7 = 0; i7 < webPage.cached_page.documents.size(); i7++) {
                TLRPC.Document document2 = webPage.cached_page.documents.get(i7);
                if (document2.f26962id == j3) {
                    return document2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document b(TL_iv.RichMessage richMessage, long j3) {
        if (richMessage == null) {
            return null;
        }
        for (int i7 = 0; i7 < richMessage.documents.size(); i7++) {
            TLRPC.Document document = richMessage.documents.get(i7);
            if (document.f26962id == j3) {
                return document;
            }
        }
        return null;
    }

    public static File c(TLObject tLObject) {
        org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24470s0);
        File J = org.telegram.messenger.w7.J(tLObject, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        File J2 = org.telegram.messenger.w7.J(tLObject, null, true, true);
        if (J2 != null && J2.exists()) {
            return J2;
        }
        if (J != null) {
            return J;
        }
        return J2;
    }

    public static TLRPC.Photo d(long j3, TLObject tLObject) {
        if (tLObject instanceof TL_iv.RichMessage) {
            return f((TL_iv.RichMessage) tLObject, j3);
        }
        if (tLObject instanceof TL_iv.Page) {
            TL_iv.Page page = (TL_iv.Page) tLObject;
            for (int i7 = 0; i7 < page.photos.size(); i7++) {
                TLRPC.Photo photo = page.photos.get(i7);
                if (photo.f26980id == j3) {
                    return photo;
                }
            }
            return null;
        } else if (!(tLObject instanceof TLRPC.WebPage)) {
            return null;
        } else {
            return e((TLRPC.WebPage) tLObject, j3);
        }
    }

    public static TLRPC.Photo e(TLRPC.WebPage webPage, long j3) {
        if (webPage != null && webPage.cached_page != null) {
            TLRPC.Photo photo = webPage.photo;
            if (photo != null && photo.f26980id == j3) {
                return photo;
            }
            for (int i7 = 0; i7 < webPage.cached_page.photos.size(); i7++) {
                TLRPC.Photo photo2 = webPage.cached_page.photos.get(i7);
                if (photo2.f26980id == j3) {
                    return photo2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Photo f(TL_iv.RichMessage richMessage, long j3) {
        if (richMessage == null) {
            return null;
        }
        for (int i7 = 0; i7 < richMessage.photos.size(); i7++) {
            TLRPC.Photo photo = richMessage.photos.get(i7);
            if (photo.f26980id == j3) {
                return photo;
            }
        }
        return null;
    }

    public static boolean g(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.Document a10;
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a10 = a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
            return org.telegram.messenger.ij.L4(a10);
        }
        return false;
    }
}
