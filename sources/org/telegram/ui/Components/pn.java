package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pn implements ri {
    public final org.telegram.ui.ActionBar.r2 f31605a;
    public final Utilities.Callback f31606b;
    public final nn f31607c;

    public pn(Utilities.Callback callback, org.telegram.ui.ActionBar.r2 r2Var, nn nnVar) {
        this.f31605a = r2Var;
        this.f31606b = callback;
        this.f31607c = nnVar;
    }

    @Override
    public final void A(gh ghVar) {
        NotificationCenter.getInstance(this.f31605a.getCurrentAccount()).doOnIdle(ghVar);
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        nn nnVar = this.f31607c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nnVar.f33030j0;
        Utilities.Callback callback = this.f31606b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.r2 r2Var = this.f31605a;
            g5.f0(r2Var.getContext(), r2Var.getResourceProvider(), null, null, new on(0, callback), null);
        } else if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                    sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                    sendingMediaInfo.discardLivePhoto = true;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.emojiMarkup = photoEntry.emojiMarkup;
                    sendingMediaInfo.originalPhotoEntry = photoEntry;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
                callback.run(new th.d(sendingMediaInfo));
            }
        }
        nnVar.dismiss(true);
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
