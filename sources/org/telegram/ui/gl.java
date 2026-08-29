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
public final class gl implements org.telegram.ui.Components.li {
    public final tn f38617a;

    public gl(tn tnVar) {
        this.f38617a = tnVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        lh.s2 s2Var;
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
        tn tnVar = this.f38617a;
        if (tnVar.getParentActivity() != null && (s2Var = tnVar.F1) != null) {
            boolean z19 = s2Var.C;
            MessageObject messageObject = s2Var.D1;
            tnVar.f42880l5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || s2Var.f31005f0.getSelectedPhotos().isEmpty())) {
                lh.s2 s2Var2 = tnVar.F1;
                if (s2Var2 != null) {
                    s2Var2.dismissWithButtonClick(i10);
                }
                tnVar.Aa(i10);
                return;
            }
            lh.s2 s2Var3 = tnVar.F1;
            if (s2Var3 != null && i10 != 8) {
                s2Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = tnVar.F1.f31005f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = tnVar.F1.f31005f0.getSelectedPhotosOrder();
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
                        tnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = tnVar.f42880l5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = tnVar.f42768c5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(tnVar.f42880l5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = tnVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = tnVar.P5;
                        MessageObject messageObject3 = tnVar.f42880l5;
                        int i20 = i15;
                        MessageObject messageObject4 = tnVar.T3;
                        jn jnVar = tnVar.f42831h5;
                        if (i10 != 4 && !z13) {
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, jnVar, z16, z10, null, z11, i11, i12, tnVar.N3, z14, null, tnVar.C8(), j10, z12, j11, tnVar.N8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = tnVar.getAccountInstance();
                        long j13 = tnVar.P5;
                        MessageObject messageObject5 = tnVar.f42856j5;
                        MessageObject messageObject6 = tnVar.T3;
                        jn jnVar2 = tnVar.f42831h5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, jnVar2, z15, z10, tnVar.f42880l5, z11, i11, i12, tnVar.N3, z14, null, tnVar.C8(), j10, z12, j11, tnVar.N8(), tnVar.f42768c5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                tnVar.y6();
                tnVar.U.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (tnVar.O3 == -1) {
                    tnVar.O3 = 0;
                }
                tnVar.O3 += hashMap.size();
                tnVar.Ec(true);
            }
        }
    }

    @Override
    public final void L0() {
        this.f38617a.U.P();
    }

    @Override
    public final boolean T1() {
        return false;
    }

    @Override
    public final boolean a0() {
        return this.f38617a.P9();
    }

    @Override
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        tn tnVar = this.f38617a;
        if (tnVar.U != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            dk dkVar = tnVar.U;
            dkVar.setFieldText("@" + publicUsername + " ");
            tnVar.U.H0();
        }
    }

    @Override
    public final void x0(org.telegram.ui.Components.zg zgVar) {
        this.f38617a.h8(zgVar);
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
