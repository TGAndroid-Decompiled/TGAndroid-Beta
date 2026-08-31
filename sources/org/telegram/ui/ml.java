package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements org.telegram.ui.Components.ki {
    public final xn f39171a;

    public ml(xn xnVar) {
        this.f39171a = xnVar;
    }

    @Override
    public final void B0(org.telegram.ui.Components.wg wgVar) {
        this.f39171a.h8(wgVar);
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        oh.u2 u2Var;
        HashMap<Object, Object> hashMap;
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        boolean z17;
        String str2;
        TLRPC.Message message;
        xn xnVar = this.f39171a;
        if (xnVar.getParentActivity() != null && (u2Var = xnVar.G1) != null) {
            boolean z18 = u2Var.D;
            MessageObject messageObject = u2Var.E1;
            xnVar.f43269m5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z11;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || u2Var.f29054g0.getSelectedPhotos().isEmpty())) {
                oh.u2 u2Var2 = xnVar.G1;
                if (u2Var2 != null) {
                    u2Var2.dismissWithButtonClick(i10);
                }
                xnVar.Aa(i10);
                return;
            }
            oh.u2 u2Var3 = xnVar.G1;
            if (u2Var3 != null && i10 != 8) {
                u2Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = xnVar.G1.f29054g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = xnVar.G1.f29054g0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i15 = 0;
                while (i15 < ceil) {
                    int i16 = i15 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i16);
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (i17 < min) {
                        int i18 = i16 + i17;
                        if (i18 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z16 = z18;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            sendingMediaInfo.imagePath = photoEntry.imagePath;
                            boolean isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo.isLivePhoto = isLivePhoto;
                            boolean z19 = photoEntry.isVideo;
                            if (z18 && isLivePhoto) {
                                sendingMediaInfo.isLivePhoto = false;
                                z19 = false;
                            }
                            if (!z19 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                                if (!z18 && photoEntry.isHighQuality()) {
                                    sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                                }
                            } else {
                                String str3 = photoEntry.path;
                                if (str3 != null) {
                                    sendingMediaInfo.path = str3;
                                }
                            }
                            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                            sendingMediaInfo.coverPath = photoEntry.coverPath;
                            sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                            sendingMediaInfo.isVideo = z19;
                            sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                            hashMap2 = selectedPhotos;
                            z16 = z18;
                            sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                            sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                            CharSequence charSequence = photoEntry.caption;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            sendingMediaInfo.caption = str;
                            sendingMediaInfo.entities = photoEntry.entities;
                            sendingMediaInfo.masks = photoEntry.stickers;
                            sendingMediaInfo.ttl = photoEntry.ttl;
                            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                            sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                            sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                            sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                            sendingMediaInfo.stars = photoEntry.starsAmount;
                            if (!z16 && photoEntry.isHighQuality()) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            sendingMediaInfo.highQuality = z17;
                            arrayList2.add(sendingMediaInfo);
                            photoEntry.reset();
                        }
                        i17++;
                        z18 = z16;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z20 = z18;
                    if (i15 == 0) {
                        xnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z13 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z13 = false;
                    }
                    MessageObject messageObject2 = xnVar.f43269m5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = xnVar.f43157d5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(xnVar.f43269m5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = xnVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = xnVar.Q5;
                        MessageObject messageObject3 = xnVar.f43269m5;
                        int i20 = i15;
                        MessageObject messageObject4 = xnVar.U3;
                        nn nnVar = xnVar.f43221i5;
                        if (i10 != 4 && !z12) {
                            arrayList = arrayList2;
                            z15 = false;
                        } else {
                            arrayList = arrayList2;
                            z15 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, nnVar, z15, z4, null, z10, i11, i12, xnVar.O3, z13, null, xnVar.C8(), j10, z11, j11, xnVar.N8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = xnVar.getAccountInstance();
                        long j13 = xnVar.Q5;
                        MessageObject messageObject5 = xnVar.f43245k5;
                        MessageObject messageObject6 = xnVar.U3;
                        nn nnVar2 = xnVar.f43221i5;
                        if (i10 != 4 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, nnVar2, z14, z4, xnVar.f43269m5, z10, i11, i12, xnVar.O3, z13, null, xnVar.C8(), j10, z11, j11, xnVar.N8(), xnVar.f43157d5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z18 = z20;
                }
                hashMap = selectedPhotos;
                xnVar.y6();
                xnVar.V.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (xnVar.P3 == -1) {
                    xnVar.P3 = 0;
                }
                xnVar.P3 += hashMap.size();
                xnVar.Ec(true);
            }
        }
    }

    @Override
    public final void Q0() {
        this.f39171a.V.P();
    }

    @Override
    public final boolean b2() {
        return false;
    }

    @Override
    public final boolean h0() {
        return this.f39171a.P9();
    }

    @Override
    public final void o1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        xn xnVar = this.f39171a;
        if (xnVar.V != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            jk jkVar = xnVar.V;
            jkVar.setFieldText("@" + publicUsername + " ");
            xnVar.V.H0();
        }
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
