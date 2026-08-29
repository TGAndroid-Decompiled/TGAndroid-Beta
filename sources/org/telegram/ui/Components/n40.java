package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class n40 implements li {
    public final s40 f30842a;

    public n40(s40 s40Var) {
        this.f30842a = s40Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar;
        s40 s40Var = this.f30842a;
        org.telegram.ui.ActionBar.o2 o2Var = s40Var.f32469a;
        if (o2Var != null && o2Var.getParentActivity() != null && (niVar = s40Var.f32471c) != null) {
            if (i10 != 8 && i10 != 7) {
                niVar.dismissWithButtonClick(i10);
                if (i10 == 0) {
                    s40Var.m();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = niVar.f31005f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = s40Var.f32471c.f31005f0.getSelectedPhotosOrder();
            ArrayList arrayList = new ArrayList();
            boolean z14 = false;
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
                    z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
            s40.b(s40Var, z14, arrayList);
            if (i10 != 8) {
                s40Var.f32471c.dismiss(true);
            }
        }
    }

    @Override
    public final void L0() {
        AndroidUtilities.hideKeyboard(this.f30842a.f32469a.getFragmentView().findFocus());
    }

    @Override
    public final boolean T1() {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void u0() {
        this.f30842a.r();
    }

    @Override
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
