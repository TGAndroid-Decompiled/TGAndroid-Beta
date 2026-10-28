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
public final class ll implements org.telegram.ui.Components.ri {
    public final wn f41198a;

    public ll(wn wnVar) {
        this.f41198a = wnVar;
    }

    @Override
    public final void A(org.telegram.ui.Components.gh ghVar) {
        this.f41198a.q8(ghVar);
    }

    @Override
    public final boolean E() {
        return this.f41198a.ca();
    }

    @Override
    public final void R() {
        this.f41198a.Y.L();
    }

    @Override
    public final void Y(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        wn wnVar = this.f41198a;
        if (wnVar.Y != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            jk jkVar = wnVar.Y;
            jkVar.setFieldText("@" + publicUsername + " ");
            wnVar.Y.E0();
        }
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        di.a3 a3Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        boolean z16;
        ArrayList arrayList;
        boolean z17;
        HashMap<Object, Object> hashMap2;
        boolean z18;
        String str;
        boolean z19;
        String str2;
        TLRPC.Message message;
        wn wnVar = this.f41198a;
        if (wnVar.getParentActivity() != null && (a3Var = wnVar.V1) != null) {
            boolean z20 = a3Var.G;
            MessageObject messageObject = a3Var.K1;
            wnVar.F5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || a3Var.f33002j0.getSelectedPhotos().isEmpty())) {
                di.a3 a3Var2 = wnVar.V1;
                if (a3Var2 != null) {
                    a3Var2.dismissWithButtonClick(i10);
                }
                wnVar.Ma(i10);
                return;
            }
            di.a3 a3Var3 = wnVar.V1;
            if (a3Var3 != null && i10 != 8) {
                a3Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = wnVar.V1.f33002j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = wnVar.V1.f33002j0.getSelectedPhotosOrder();
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
                            z18 = z20;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            sendingMediaInfo.imagePath = photoEntry.imagePath;
                            boolean isLivePhoto = photoEntry.isLivePhoto();
                            sendingMediaInfo.isLivePhoto = isLivePhoto;
                            boolean z21 = photoEntry.isVideo;
                            if (z20 && isLivePhoto) {
                                sendingMediaInfo.isLivePhoto = false;
                                z21 = false;
                            }
                            if (!z21 && (str2 = photoEntry.imagePath) != null) {
                                sendingMediaInfo.path = str2;
                                if (!z20 && photoEntry.isHighQuality()) {
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
                            sendingMediaInfo.isVideo = z21;
                            sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                            hashMap2 = selectedPhotos;
                            z18 = z20;
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
                            if (!z18 && photoEntry.isHighQuality()) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            sendingMediaInfo.highQuality = z19;
                            arrayList2.add(sendingMediaInfo);
                            photoEntry.reset();
                        }
                        i17++;
                        z20 = z18;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z22 = z20;
                    if (i15 == 0) {
                        wnVar.u8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = wnVar.F5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = wnVar.f45330w5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(wnVar.F5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = wnVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = wnVar.f45168j6;
                        MessageObject messageObject3 = wnVar.F5;
                        int i20 = i15;
                        MessageObject messageObject4 = wnVar.f45166j4;
                        mn mnVar = wnVar.B5;
                        if (i10 != 4 && !z13) {
                            z16 = true;
                            arrayList = arrayList2;
                            z17 = false;
                        } else {
                            z16 = true;
                            arrayList = arrayList2;
                            z17 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, mnVar, z17, z10, null, z11, i11, i12, wnVar.f45091d4, z14, null, wnVar.O8(), j10, z12, j11, wnVar.a9(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = wnVar.getAccountInstance();
                        long j13 = wnVar.f45168j6;
                        MessageObject messageObject5 = wnVar.D5;
                        MessageObject messageObject6 = wnVar.f45166j4;
                        mn mnVar2 = wnVar.B5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, mnVar2, z15, z10, wnVar.F5, z11, i11, i12, wnVar.f45091d4, z14, null, wnVar.O8(), j10, z12, j11, wnVar.a9(), wnVar.f45330w5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z20 = z22;
                }
                hashMap = selectedPhotos;
                wnVar.E6();
                wnVar.Y.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (wnVar.f45105e4 == -1) {
                    wnVar.f45105e4 = 0;
                }
                wnVar.f45105e4 += hashMap.size();
                wnVar.Vc(true);
            }
        }
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
