package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class r40 implements ji {
    public final w40 f28384a;

    public r40(w40 w40Var) {
        this.f28384a = w40Var;
    }

    @Override
    public final void C() {
        AndroidUtilities.hideKeyboard(this.f28384a.f30190a.getFragmentView().findFocus());
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar;
        w40 w40Var = this.f28384a;
        org.telegram.ui.ActionBar.p2 p2Var = w40Var.f30190a;
        if (p2Var != null && p2Var.getParentActivity() != null && (liVar = w40Var.f30192c) != null) {
            if (i10 != 8 && i10 != 7) {
                liVar.dismissWithButtonClick(i10);
                if (i10 == 0) {
                    w40Var.m();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = liVar.f26702g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = w40Var.f30192c.f26702g0.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z13 = false;
            for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList.add(sendingMediaInfo);
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
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                    sendingMediaInfo.discardLivePhoto = true;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    TLRPC.VideoSize videoSize = photoEntry.emojiMarkup;
                    sendingMediaInfo.emojiMarkup = videoSize;
                    z13 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            }
            w40.b(w40Var, z13, arrayList);
            if (i10 != 8) {
                w40Var.f30192c.dismiss(true);
            }
        }
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void r() {
        this.f28384a.r();
    }

    @Override
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void D(Object obj) {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
