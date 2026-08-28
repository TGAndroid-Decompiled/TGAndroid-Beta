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
public final class dl implements org.telegram.ui.Components.ii {
    public final qn f37558a;

    public dl(qn qnVar) {
        this.f37558a = qnVar;
    }

    @Override
    public final void E(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        qn qnVar = this.f37558a;
        if (qnVar.U != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            ak akVar = qnVar.U;
            akVar.setFieldText("@" + publicUsername + " ");
            qnVar.U.G0();
        }
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ih.u2 u2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        boolean z18;
        String str2;
        TLRPC.Message message;
        qn qnVar = this.f37558a;
        if (qnVar.getParentActivity() != null && (u2Var = qnVar.F1) != null) {
            boolean z19 = u2Var.C;
            MessageObject messageObject = u2Var.D1;
            qnVar.f41982l5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i9 != 8 && i9 != 7 && (i9 != 4 || u2Var.f30114f0.getSelectedPhotos().isEmpty())) {
                ih.u2 u2Var2 = qnVar.F1;
                if (u2Var2 != null) {
                    u2Var2.dismissWithButtonClick(i9);
                }
                qnVar.Aa(i9);
                return;
            }
            ih.u2 u2Var3 = qnVar.F1;
            if (u2Var3 != null && i9 != 8) {
                u2Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = qnVar.F1.f30114f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = qnVar.F1.f30114f0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i14 = 0;
                while (i14 < ceil) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < min) {
                        int i17 = i15 + i16;
                        if (i17 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            sendingMediaInfo.imagePath = photoEntry.imagePath;
                            boolean isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo.isLivePhoto = isLivePhoto;
                            boolean z20 = photoEntry.isVideo;
                            if (z19 && isLivePhoto) {
                                sendingMediaInfo.isLivePhoto = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                                if (!z19 && photoEntry.isHighQuality()) {
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
                            sendingMediaInfo.isVideo = z20;
                            sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
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
                            if (!z17 && photoEntry.isHighQuality()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            sendingMediaInfo.highQuality = z18;
                            arrayList2.add(sendingMediaInfo);
                            photoEntry.reset();
                        }
                        i16++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i14 == 0) {
                        qnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = qnVar.f41982l5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = qnVar.f41870c5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(qnVar.f41982l5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = qnVar.getAccountInstance();
                        int i18 = ceil;
                        long j12 = qnVar.P5;
                        MessageObject messageObject3 = qnVar.f41982l5;
                        int i19 = i14;
                        MessageObject messageObject4 = qnVar.T3;
                        gn gnVar = qnVar.f41934h5;
                        if (i9 != 4 && !z13) {
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i13 = i19;
                        i12 = i18;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, gnVar, z16, z10, null, z11, i10, i11, qnVar.N3, z14, null, qnVar.C8(), j10, z12, j11, qnVar.N8(), messageSuggestionParams2);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        AccountInstance accountInstance2 = qnVar.getAccountInstance();
                        long j13 = qnVar.P5;
                        MessageObject messageObject5 = qnVar.f41959j5;
                        MessageObject messageObject6 = qnVar.T3;
                        gn gnVar2 = qnVar.f41934h5;
                        if (i9 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, gnVar2, z15, z10, qnVar.f41982l5, z11, i10, i11, qnVar.N3, z14, null, qnVar.C8(), j10, z12, j11, qnVar.N8(), qnVar.f41870c5);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                qnVar.y6();
                qnVar.U.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (qnVar.O3 == -1) {
                    qnVar.O3 = 0;
                }
                qnVar.O3 += hashMap.size();
                qnVar.Ec(true);
            }
        }
    }

    @Override
    public final boolean j() {
        return this.f37558a.P9();
    }

    @Override
    public final void t(org.telegram.ui.Components.wg wgVar) {
        this.f37558a.h8(wgVar);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void u() {
        this.f37558a.U.O();
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
