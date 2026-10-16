package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class rn implements ti {
    public final org.telegram.ui.ActionBar.m2 f28580a;
    public final Utilities.Callback f28581b;
    public final pn f28582c;

    public rn(Utilities.Callback callback, org.telegram.ui.ActionBar.m2 m2Var, pn pnVar) {
        this.f28580a = m2Var;
        this.f28581b = callback;
        this.f28582c = pnVar;
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        pn pnVar = this.f28582c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = pnVar.f29684j0;
        Utilities.Callback callback = this.f28581b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.m2 m2Var = this.f28580a;
            g5.f0(m2Var.getContext(), m2Var.getResourceProvider(), null, null, new qn(0, callback), null);
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
                callback.run(new sh.d(sendingMediaInfo));
            }
        }
        pnVar.dismiss(true);
    }

    @Override
    public final boolean r0() {
        return false;
    }

    @Override
    public final void v(hh hhVar) {
        NotificationCenter.getInstance(this.f28580a.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void J(Object obj) {
    }

    @Override
    public final void U(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
