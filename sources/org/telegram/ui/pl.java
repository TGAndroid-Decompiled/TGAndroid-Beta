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
public final class pl implements org.telegram.ui.Components.ti {
    public final co f39536a;

    public pl(co coVar) {
        this.f39536a = coVar;
    }

    @Override
    public final void B(org.telegram.ui.Components.hh hhVar) {
        this.f39536a.h8(hhVar);
    }

    @Override
    public final boolean D0() {
        return false;
    }

    @Override
    public final void H() {
        this.f39536a.Y.P();
    }

    @Override
    public final void X(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        co coVar = this.f39536a;
        if (coVar.Y != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            mk mkVar = coVar.Y;
            mkVar.setFieldText("@" + publicUsername + " ");
            coVar.Y.H0();
        }
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        bi.t3 t3Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        boolean z18;
        String str2;
        TLRPC.Message message;
        co coVar = this.f39536a;
        if (coVar.getParentActivity() != null && (t3Var = coVar.J1) != null) {
            boolean z19 = t3Var.G;
            MessageObject messageObject = t3Var.H1;
            coVar.p5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || t3Var.f31291j0.getSelectedPhotos().isEmpty())) {
                bi.t3 t3Var2 = coVar.J1;
                if (t3Var2 != null) {
                    t3Var2.dismissWithButtonClick(i10);
                }
                coVar.Aa(i10);
                return;
            }
            bi.t3 t3Var3 = coVar.J1;
            if (t3Var3 != null && i10 != 8) {
                t3Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = coVar.J1.f31291j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = coVar.J1.f31291j0.getSelectedPhotosOrder();
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
                            z17 = z19;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
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
                        i17++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i15 == 0) {
                        coVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = coVar.p5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = coVar.f35267g5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(coVar.p5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = coVar.getAccountInstance();
                        int i19 = ceil;
                        long j11 = coVar.T5;
                        MessageObject messageObject3 = coVar.p5;
                        int i20 = i15;
                        MessageObject messageObject4 = coVar.X3;
                        sn snVar = coVar.f35326l5;
                        if (i10 != 4 && !z13) {
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, snVar, z16, z10, null, z11, i11, i12, coVar.R3, z14, null, coVar.C8(), j3, z12, j10, coVar.N8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = coVar.getAccountInstance();
                        long j12 = coVar.T5;
                        MessageObject messageObject5 = coVar.f35352n5;
                        MessageObject messageObject6 = coVar.X3;
                        sn snVar2 = coVar.f35326l5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j12, messageObject5, messageObject6, null, snVar2, z15, z10, coVar.p5, z11, i11, i12, coVar.R3, z14, null, coVar.C8(), j3, z12, j10, coVar.N8(), coVar.f35267g5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                coVar.y6();
                coVar.Y.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (coVar.S3 == -1) {
                    coVar.S3 = 0;
                }
                coVar.S3 += hashMap.size();
                coVar.Ec(true);
            }
        }
    }

    @Override
    public final boolean q() {
        return this.f39536a.P9();
    }

    @Override
    public final void K(Object obj) {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
