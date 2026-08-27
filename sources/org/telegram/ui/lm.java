package org.telegram.ui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class lm implements wt0 {

    public final TL_iv.RichMessage f40156a;

    public final ArrayList f40157b;

    public final MessageObject f40158c;

    public lm(TL_iv.RichMessage richMessage, ArrayList arrayList, MessageObject messageObject) {
        this.f40156a = richMessage;
        this.f40157b = arrayList;
        this.f40158c = messageObject;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 < 0) {
            return false;
        }
        ArrayList arrayList = this.f40157b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        if (!(pageBlock instanceof TL_iv.pageBlockVideo)) {
            return false;
        }
        TLRPC.Document documentB = j4.b(this.f40156a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        if (documentB != null) {
            return MessageObject.isVideoDocument(documentB);
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document documentB;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f40157b;
        if (i10 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.f40156a;
        if (!z10) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentB = j4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return j4.c(documentB);
        }
        TLRPC.Photo photoF = j4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        if (photoF == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoF.sizes, AndroidUtilities.getPhotoSize())) == null) {
            return null;
        }
        return j4.c(closestPhotoSizeWithSize);
    }

    @Override
    public final String c(int i10) {
        TLObject tLObjectD = d(i10);
        if (tLObjectD instanceof TLRPC.Photo) {
            tLObjectD = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObjectD).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(tLObjectD);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f40157b;
        if (i10 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.f40156a;
        if (z10) {
            return j4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return j4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize == null) {
                iArr[0] = -1;
                return null;
            }
            int i10 = closestPhotoSizeWithSize.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320, false, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            }
            if (closestPhotoSizeWithSize2 != null) {
                int i11 = closestPhotoSizeWithSize2.size;
                iArr[0] = i11;
                if (i11 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
        }
        return null;
    }

    @Override
    public final Object g() {
        MessageObject messageObject = this.f40158c;
        return messageObject != null ? messageObject : this.f40156a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f40157b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f40157b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject = this.f40158c;
        if (messageObject == null || (richMessageLayout = messageObject.richLayout) == null) {
            return;
        }
        richMessageLayout.setSlideshowPage(pageBlock);
    }

    @Override
    public final CharSequence i(int i10) {
        return null;
    }

    @Override
    public final int j() {
        return this.f40157b.size();
    }
}
