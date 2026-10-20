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
public final class hl implements org.telegram.ui.Components.ri {
    public final qn f37682a;

    public hl(qn qnVar) {
        this.f37682a = qnVar;
    }

    @Override
    public final void J() {
        this.f37682a.Y.N();
    }

    @Override
    public final void X(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        qn qnVar = this.f37682a;
        if (qnVar.Y != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            fk fkVar = qnVar.Y;
            fkVar.setFieldText("@" + publicUsername + " ");
            qnVar.Y.F0();
        }
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ci.b3 b3Var;
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
        qn qnVar = this.f37682a;
        if (qnVar.getParentActivity() != null && (b3Var = qnVar.J1) != null) {
            boolean z20 = b3Var.G;
            MessageObject messageObject = b3Var.K1;
            qnVar.p5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || b3Var.f30557j0.getSelectedPhotos().isEmpty())) {
                ci.b3 b3Var2 = qnVar.J1;
                if (b3Var2 != null) {
                    b3Var2.dismissWithButtonClick(i10);
                }
                qnVar.Ea(i10);
                return;
            }
            ci.b3 b3Var3 = qnVar.J1;
            if (b3Var3 != null && i10 != 8) {
                b3Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = qnVar.J1.f30557j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = qnVar.J1.f30557j0.getSelectedPhotosOrder();
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
                        qnVar.o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = qnVar.p5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = qnVar.f40693g5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(qnVar.p5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = qnVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = qnVar.T5;
                        MessageObject messageObject3 = qnVar.p5;
                        int i20 = i15;
                        MessageObject messageObject4 = qnVar.X3;
                        gn gnVar = qnVar.f40753l5;
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
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, gnVar, z17, z10, null, z11, i11, i12, qnVar.R3, z14, null, qnVar.H8(), j10, z12, j11, qnVar.S8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = qnVar.getAccountInstance();
                        long j13 = qnVar.T5;
                        MessageObject messageObject5 = qnVar.f40779n5;
                        MessageObject messageObject6 = qnVar.X3;
                        gn gnVar2 = qnVar.f40753l5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, gnVar2, z15, z10, qnVar.p5, z11, i11, i12, qnVar.R3, z14, null, qnVar.H8(), j10, z12, j11, qnVar.S8(), qnVar.f40693g5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z20 = z22;
                }
                hashMap = selectedPhotos;
                qnVar.B6();
                qnVar.Y.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (qnVar.S3 == -1) {
                    qnVar.S3 = 0;
                }
                qnVar.S3 += hashMap.size();
                qnVar.Jc(true);
            }
        }
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final void u(org.telegram.ui.Components.gh ghVar) {
        this.f37682a.k8(ghVar);
    }

    @Override
    public final boolean v() {
        return this.f37682a.U9();
    }

    @Override
    public final void E() {
    }

    @Override
    public final void O(Object obj) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
