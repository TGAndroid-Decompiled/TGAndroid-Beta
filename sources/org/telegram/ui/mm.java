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
public final class mm implements tt0 {
    public final TL_iv.RichMessage f40604a;
    public final ArrayList f40605b;
    public final MessageObject f40606c;

    public mm(TL_iv.RichMessage richMessage, ArrayList arrayList, MessageObject messageObject) {
        this.f40604a = richMessage;
        this.f40605b = arrayList;
        this.f40606c = messageObject;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f40605b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = j4.b(this.f40604a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b10 != null) {
                        return MessageObject.isVideoDocument(b10);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document b10;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 >= 0) {
            ArrayList arrayList = this.f40605b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f40604a;
                if (z10) {
                    TLRPC.Photo f9 = j4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f9 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(f9.sizes, AndroidUtilities.getPhotoSize())) != null) {
                        return j4.c(closestPhotoSizeWithSize);
                    }
                    return null;
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = j4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return j4.c(b10);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f40605b;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f40604a;
                if (z10) {
                    return j4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return j4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
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
            if (closestPhotoSizeWithSize != null) {
                int i10 = closestPhotoSizeWithSize.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize;
            }
            iArr[0] = -1;
            return null;
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
        MessageObject messageObject = this.f40606c;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f40604a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f40605b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f40605b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject = this.f40606c;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null) {
            richMessageLayout.setSlideshowPage(pageBlock);
        }
    }

    @Override
    public final CharSequence i(int i10) {
        return null;
    }

    @Override
    public final int j() {
        return this.f40605b.size();
    }
}
