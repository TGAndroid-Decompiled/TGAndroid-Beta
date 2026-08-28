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
public final class km implements vt0 {
    public final TL_iv.RichMessage f39870a;
    public final ArrayList f39871b;
    public final MessageObject f39872c;

    public km(TL_iv.RichMessage richMessage, ArrayList arrayList, MessageObject messageObject) {
        this.f39870a = richMessage;
        this.f39871b = arrayList;
        this.f39872c = messageObject;
    }

    @Override
    public final boolean a(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f39871b;
            if (i9 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i9);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = i4.b(this.f39870a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
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
    public final File b(int i9) {
        TLRPC.Document b10;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i9 >= 0) {
            ArrayList arrayList = this.f39871b;
            if (i9 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i9);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f39870a;
                if (z10) {
                    TLRPC.Photo f10 = i4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(f10.sizes, AndroidUtilities.getPhotoSize())) != null) {
                        return i4.c(closestPhotoSizeWithSize);
                    }
                    return null;
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = i4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return i4.c(b10);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final String c(int i9) {
        TLObject d = d(i9);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f39871b;
            if (i9 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i9);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f39870a;
                if (z10) {
                    return i4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return i4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e(int i9) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null) {
                int i9 = closestPhotoSizeWithSize.size;
                iArr[0] = i9;
                if (i9 == 0) {
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
                int i10 = closestPhotoSizeWithSize2.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
        }
        return null;
    }

    @Override
    public final Object g() {
        MessageObject messageObject = this.f39872c;
        if (messageObject != null) {
            return messageObject;
        }
        return this.f39870a;
    }

    @Override
    public final TL_iv.PageBlock get(int i9) {
        return (TL_iv.PageBlock) this.f39871b.get(i9);
    }

    @Override
    public final List getAll() {
        return this.f39871b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        RichMessageLayout richMessageLayout;
        MessageObject messageObject = this.f39872c;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null) {
            richMessageLayout.setSlideshowPage(pageBlock);
        }
    }

    @Override
    public final CharSequence i(int i9) {
        return null;
    }

    @Override
    public final int j() {
        return this.f39871b.size();
    }
}
