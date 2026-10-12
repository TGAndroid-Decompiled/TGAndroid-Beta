package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class d50 implements ti {
    public final i50 f24294a;

    public d50(i50 i50Var) {
        this.f24294a = i50Var;
    }

    @Override
    public final void H() {
        AndroidUtilities.hideKeyboard(this.f24294a.f25829a.getFragmentView().findFocus());
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar;
        i50 i50Var = this.f24294a;
        org.telegram.ui.ActionBar.m2 m2Var = i50Var.f25829a;
        if (m2Var != null && m2Var.getParentActivity() != null && (viVar = i50Var.f25831c) != null) {
            if (i10 != 8 && i10 != 7) {
                viVar.dismissWithButtonClick(i10);
                if (i10 == 0) {
                    i50Var.l();
                    return;
                }
                return;
            }
            HashMap<Object, Object> selectedPhotos = viVar.f30013j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = i50Var.f25831c.f30013j0.getSelectedPhotosOrder();
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
            i50.a(i50Var, z14, arrayList);
            if (i10 != 8) {
                i50Var.f25831c.dismiss(true);
            }
        }
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void z() {
        this.f24294a.q();
    }

    @Override
    public final void U(Object obj) {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
