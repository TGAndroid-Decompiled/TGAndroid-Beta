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
public final class ml implements org.telegram.ui.Components.ui {
    public final xn f35351a;

    public ml(xn xnVar) {
        this.f35351a = xnVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        ai.g4 g4Var;
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
        xn xnVar = this.f35351a;
        if (xnVar.getParentActivity() != null && (g4Var = xnVar.J1) != null) {
            boolean z19 = g4Var.G;
            MessageObject messageObject = g4Var.H1;
            xnVar.p5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || g4Var.f29677j0.getSelectedPhotos().isEmpty())) {
                ai.g4 g4Var2 = xnVar.J1;
                if (g4Var2 != null) {
                    g4Var2.dismissWithButtonClick(i10);
                }
                xnVar.Aa(i10);
                return;
            }
            ai.g4 g4Var3 = xnVar.J1;
            if (g4Var3 != null && i10 != 8) {
                g4Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = xnVar.J1.f29677j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = xnVar.J1.f29677j0.getSelectedPhotosOrder();
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
                        xnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = xnVar.p5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = xnVar.f39390g5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(xnVar.p5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = xnVar.getAccountInstance();
                        int i19 = ceil;
                        long j11 = xnVar.T5;
                        MessageObject messageObject3 = xnVar.p5;
                        int i20 = i15;
                        MessageObject messageObject4 = xnVar.X3;
                        nn nnVar = xnVar.f39449l5;
                        if (i10 != 4 && !z13) {
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, nnVar, z16, z10, null, z11, i11, i12, xnVar.R3, z14, null, xnVar.C8(), j3, z12, j10, xnVar.N8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = xnVar.getAccountInstance();
                        long j12 = xnVar.T5;
                        MessageObject messageObject5 = xnVar.f39475n5;
                        MessageObject messageObject6 = xnVar.X3;
                        nn nnVar2 = xnVar.f39449l5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j12, messageObject5, messageObject6, null, nnVar2, z15, z10, xnVar.p5, z11, i11, i12, xnVar.R3, z14, null, xnVar.C8(), j3, z12, j10, xnVar.N8(), xnVar.f39390g5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                xnVar.y6();
                xnVar.Y.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (xnVar.S3 == -1) {
                    xnVar.S3 = 0;
                }
                xnVar.S3 += hashMap.size();
                xnVar.Ec(true);
            }
        }
    }

    @Override
    public final void K0() {
        this.f35351a.Y.Q();
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean c0() {
        return this.f35351a.P9();
    }

    @Override
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        xn xnVar = this.f35351a;
        if (xnVar.Y != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            jk jkVar = xnVar.Y;
            jkVar.setFieldText("@" + publicUsername + " ");
            xnVar.Y.I0();
        }
    }

    @Override
    public final void x0(org.telegram.ui.Components.gh ghVar) {
        this.f35351a.h8(ghVar);
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
