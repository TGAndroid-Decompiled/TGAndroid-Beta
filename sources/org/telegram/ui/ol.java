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
public final class ol implements org.telegram.ui.Components.ji {
    public final zn f36836a;

    public ol(zn znVar) {
        this.f36836a = znVar;
    }

    @Override
    public final void C0(org.telegram.ui.Components.wg wgVar) {
        this.f36836a.h8(wgVar);
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        nh.t2 t2Var;
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
        zn znVar = this.f36836a;
        if (znVar.getParentActivity() != null && (t2Var = znVar.G1) != null) {
            boolean z18 = t2Var.D;
            MessageObject messageObject = t2Var.E1;
            znVar.f40666m5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z11;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || t2Var.f26698g0.getSelectedPhotos().isEmpty())) {
                nh.t2 t2Var2 = znVar.G1;
                if (t2Var2 != null) {
                    t2Var2.dismissWithButtonClick(i10);
                }
                znVar.Aa(i10);
                return;
            }
            nh.t2 t2Var3 = znVar.G1;
            if (t2Var3 != null && i10 != 8) {
                t2Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = znVar.G1.f26698g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = znVar.G1.f26698g0.getSelectedPhotosOrder();
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
                        znVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z13 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z13 = false;
                    }
                    MessageObject messageObject2 = znVar.f40666m5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = znVar.f40555d5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(znVar.f40666m5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = znVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = znVar.Q5;
                        MessageObject messageObject3 = znVar.f40666m5;
                        int i20 = i15;
                        MessageObject messageObject4 = znVar.U3;
                        pn pnVar = znVar.f40618i5;
                        if (i10 != 4 && !z12) {
                            arrayList = arrayList2;
                            z15 = false;
                        } else {
                            arrayList = arrayList2;
                            z15 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, pnVar, z15, z4, null, z10, i11, i12, znVar.O3, z13, null, znVar.C8(), j10, z11, j11, znVar.N8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = znVar.getAccountInstance();
                        long j13 = znVar.Q5;
                        MessageObject messageObject5 = znVar.f40642k5;
                        MessageObject messageObject6 = znVar.U3;
                        pn pnVar2 = znVar.f40618i5;
                        if (i10 != 4 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, pnVar2, z14, z4, znVar.f40666m5, z10, i11, i12, znVar.O3, z13, null, znVar.C8(), j10, z11, j11, znVar.N8(), znVar.f40555d5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z18 = z20;
                }
                hashMap = selectedPhotos;
                znVar.y6();
                znVar.V.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (znVar.P3 == -1) {
                    znVar.P3 = 0;
                }
                znVar.P3 += hashMap.size();
                znVar.Ec(true);
            }
        }
    }

    @Override
    public final void Q0() {
        this.f36836a.V.P();
    }

    @Override
    public final boolean X1() {
        return false;
    }

    @Override
    public final boolean h0() {
        return this.f36836a.P9();
    }

    @Override
    public final void o1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        zn znVar = this.f36836a;
        if (znVar.V != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            lk lkVar = znVar.V;
            lkVar.setFieldText("@" + publicUsername + " ");
            znVar.V.H0();
        }
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
