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
public final class ll implements org.telegram.ui.Components.vi {
    public final yn f38290a;

    public ll(yn ynVar) {
        this.f38290a = ynVar;
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
        yn ynVar = this.f38290a;
        if (ynVar.getParentActivity() != null && (g4Var = ynVar.H1) != null) {
            boolean z19 = g4Var.G;
            MessageObject messageObject = g4Var.H1;
            ynVar.f43438n5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || g4Var.f32831j0.getSelectedPhotos().isEmpty())) {
                ai.g4 g4Var2 = ynVar.H1;
                if (g4Var2 != null) {
                    g4Var2.dismissWithButtonClick(i10);
                }
                ynVar.za(i10);
                return;
            }
            ai.g4 g4Var3 = ynVar.H1;
            if (g4Var3 != null && i10 != 8) {
                g4Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = ynVar.H1.f32831j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = ynVar.H1.f32831j0.getSelectedPhotosOrder();
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
                        ynVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = ynVar.f43438n5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = ynVar.f43328e5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(ynVar.f43438n5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = ynVar.getAccountInstance();
                        int i19 = ceil;
                        long j11 = ynVar.R5;
                        MessageObject messageObject3 = ynVar.f43438n5;
                        int i20 = i15;
                        MessageObject messageObject4 = ynVar.V3;
                        on onVar = ynVar.f43388j5;
                        if (i10 != 4 && !z13) {
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i14 = i20;
                        i13 = i19;
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, onVar, z16, z10, null, z11, i11, i12, ynVar.P3, z14, null, ynVar.D8(), j3, z12, j10, ynVar.O8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = ynVar.getAccountInstance();
                        long j12 = ynVar.R5;
                        MessageObject messageObject5 = ynVar.f43412l5;
                        MessageObject messageObject6 = ynVar.V3;
                        on onVar2 = ynVar.f43388j5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j12, messageObject5, messageObject6, null, onVar2, z15, z10, ynVar.f43438n5, z11, i11, i12, ynVar.P3, z14, null, ynVar.D8(), j3, z12, j10, ynVar.O8(), ynVar.f43328e5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                ynVar.y6();
                ynVar.W.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (ynVar.Q3 == -1) {
                    ynVar.Q3 = 0;
                }
                ynVar.Q3 += hashMap.size();
                ynVar.Dc(true);
            }
        }
    }

    @Override
    public final void K0() {
        this.f38290a.W.N();
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean a0() {
        return this.f38290a.O9();
    }

    @Override
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        yn ynVar = this.f38290a;
        if (ynVar.W != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            jk jkVar = ynVar.W;
            jkVar.setFieldText("@" + publicUsername + " ");
            ynVar.W.H0();
        }
    }

    @Override
    public final void x0(org.telegram.ui.Components.ih ihVar) {
        this.f38290a.h8(ihVar);
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
