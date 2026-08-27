package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class fl implements org.telegram.ui.Components.ei {

    public final rn f38156a;

    public fl(rn rnVar) {
        this.f38156a = rnVar;
    }

    @Override
    public final void F() {
        this.f38156a.U.P();
    }

    @Override
    public final boolean N0() {
        return false;
    }

    @Override
    public final void g0(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        rn rnVar = this.f38156a;
        if (rnVar.U == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        rnVar.U.setFieldText("@" + publicUsername + " ");
        rnVar.U.H0();
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        jh.t2 t2Var;
        HashMap<Object, Object> map;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        String str;
        TLRPC.Message message;
        rn rnVar = this.f38156a;
        if (rnVar.getParentActivity() == null || (t2Var = rnVar.F1) == null) {
            return;
        }
        boolean z16 = t2Var.C;
        MessageObject messageObject = t2Var.D1;
        rnVar.f42119l5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || t2Var.f28650f0.getSelectedPhotos().isEmpty())) {
            jh.t2 t2Var2 = rnVar.F1;
            if (t2Var2 != null) {
                t2Var2.dismissWithButtonClick(i10);
            }
            rnVar.Aa(i10);
            return;
        }
        jh.t2 t2Var3 = rnVar.F1;
        if (t2Var3 != null && i10 != 8) {
            t2Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = rnVar.F1.f28650f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = rnVar.F1.f28650f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            map = selectedPhotos;
        } else {
            int iCeil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i15 = 0;
            while (i15 < iCeil) {
                int i16 = i15 * 10;
                int iMin = Math.min(10, selectedPhotos.size() - i16);
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                while (i17 < iMin) {
                    int i18 = i16 + i17;
                    if (i18 >= selectedPhotosOrder.size()) {
                        z15 = z16;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.imagePath = photoEntry.imagePath;
                        boolean zIsLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isLivePhoto = zIsLivePhoto;
                        boolean z17 = photoEntry.isVideo;
                        if (z16 && zIsLivePhoto) {
                            sendingMediaInfo.isLivePhoto = false;
                            z17 = false;
                        }
                        if (z17 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (!z16 && photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isVideo = z17;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        z15 = z16;
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                        sendingMediaInfo.stars = photoEntry.starsAmount;
                        sendingMediaInfo.highQuality = !z15 && photoEntry.isHighQuality();
                        arrayList.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    i17++;
                    z16 = z15;
                    selectedPhotos = selectedPhotos;
                }
                HashMap<Object, Object> map2 = selectedPhotos;
                boolean z18 = z16;
                if (i15 == 0) {
                    rnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = rnVar.f42119l5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = iCeil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(rnVar.getAccountInstance(), arrayList, rnVar.P5, rnVar.f42095j5, rnVar.T3, null, rnVar.f42069h5, i10 == 4 || z13, z10, rnVar.f42119l5, z11, i11, i12, rnVar.N3, z14, null, rnVar.C8(), j10, z12, j11, rnVar.N8(), rnVar.f42006c5);
                } else {
                    MessageSuggestionParams messageSuggestionParamsOf = rnVar.f42006c5;
                    if (messageSuggestionParamsOf == null) {
                        messageSuggestionParamsOf = MessageSuggestionParams.of(rnVar.f42119l5.messageOwner.suggested_post);
                    }
                    i14 = i15;
                    i13 = iCeil;
                    SendMessagesHelper.prepareSendingMedia(rnVar.getAccountInstance(), arrayList, rnVar.P5, rnVar.f42119l5, rnVar.T3, null, rnVar.f42069h5, i10 == 4 || z13, z10, null, z11, i11, i12, rnVar.N3, z14, null, rnVar.C8(), j10, z12, j11, rnVar.N8(), messageSuggestionParamsOf);
                }
                i15 = i14 + 1;
                iCeil = i13;
                selectedPhotos = map2;
                z16 = z18;
            }
            map = selectedPhotos;
            rnVar.y6();
            rnVar.U.setFieldText("");
        }
        if (i11 != 0) {
            if (rnVar.O3 == -1) {
                rnVar.O3 = 0;
            }
            rnVar.O3 += map.size();
            rnVar.Ec(true);
        }
    }

    @Override
    public final boolean s() {
        return this.f38156a.P9();
    }

    @Override
    public final void y(org.telegram.ui.Components.sg sgVar) {
        this.f38156a.h8(sgVar);
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
