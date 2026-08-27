package org.telegram.ui.Components;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class e40 implements ei {

    public final j40 f27945a;

    public e40(j40 j40Var) {
        this.f27945a = j40Var;
    }

    @Override
    public final void F() {
        AndroidUtilities.hideKeyboard(this.f27945a.f29569a.getFragmentView().findFocus());
    }

    @Override
    public final boolean N0() {
        return false;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) throws FileNotFoundException {
        gi giVar;
        j40 j40Var = this.f27945a;
        org.telegram.ui.ActionBar.n2 n2Var = j40Var.f29569a;
        if (n2Var == null || n2Var.getParentActivity() == null || (giVar = j40Var.f29571c) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            giVar.dismissWithButtonClick(i10);
            if (i10 == 0) {
                j40Var.m();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = giVar.f28650f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = j40Var.f29571c.f28650f0.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                sendingMediaInfo.discardLivePhoto = true;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
                TLRPC.VideoSize videoSize = photoEntry.emojiMarkup;
                sendingMediaInfo.emojiMarkup = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str2 = searchImage.imagePath;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                sendingMediaInfo.coverPath = searchImage.coverPath;
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                CharSequence charSequence2 = searchImage.caption;
                sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
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
        }
        j40.b(j40Var, z14, arrayList);
        if (i10 != 8) {
            j40Var.f29571c.dismiss(true);
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void w() {
        this.f27945a.r();
    }

    @Override
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
