package org.telegram.ui.iv;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLRPC;

public abstract class RichMediaClipboard {
    private static final HashMap photos = new HashMap();
    private static final HashMap documents = new HashMap();

    public static synchronized void set(List list, List list2) {
        try {
            photos.clear();
            documents.clear();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TLRPC.Photo photo = (TLRPC.Photo) it.next();
                    if (photo != null) {
                        photos.put(Long.valueOf(photo.id), photo);
                    }
                }
            }
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    TLRPC.Document document = (TLRPC.Document) it2.next();
                    if (document != null) {
                        documents.put(Long.valueOf(document.id), document);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized TLRPC.Photo photo(long j) {
        return j == 0 ? null : (TLRPC.Photo) photos.get(Long.valueOf(j));
    }

    public static synchronized TLRPC.Document document(long j) {
        return j == 0 ? null : (TLRPC.Document) documents.get(Long.valueOf(j));
    }
}
