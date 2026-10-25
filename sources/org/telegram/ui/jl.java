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
public final class jl implements org.telegram.ui.Components.ri {
    public final un f40680a;

    public jl(un unVar) {
        this.f40680a = unVar;
    }

    @Override
    public final void A(org.telegram.ui.Components.gh ghVar) {
        this.f40680a.o8(ghVar);
    }

    @Override
    public final boolean E() {
        return this.f40680a.Z9();
    }

    @Override
    public final void R() {
        this.f40680a.Y.M();
    }

    @Override
    public final void Y(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        un unVar = this.f40680a;
        if (unVar.Y != null && user != null && !TextUtils.isEmpty(publicUsername)) {
            hk hkVar = unVar.Y;
            hkVar.setFieldText("@" + publicUsername + " ");
            unVar.Y.F0();
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
        un unVar = this.f40680a;
        if (unVar.getParentActivity() != null && (a3Var = unVar.V1) != null) {
            boolean z20 = a3Var.G;
            MessageObject messageObject = a3Var.K1;
            unVar.B5 = messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                message.invert_media = z12;
            }
            if (i10 != 8 && i10 != 7 && (i10 != 4 || a3Var.f33030j0.getSelectedPhotos().isEmpty())) {
                di.a3 a3Var2 = unVar.V1;
                if (a3Var2 != null) {
                    a3Var2.dismissWithButtonClick(i10);
                }
                unVar.Ja(i10);
                return;
            }
            di.a3 a3Var3 = unVar.V1;
            if (a3Var3 != null && i10 != 8) {
                a3Var3.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = unVar.V1.f33030j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = unVar.V1.f33030j0.getSelectedPhotosOrder();
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
                        unVar.s8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                        z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                    } else {
                        z14 = false;
                    }
                    MessageObject messageObject2 = unVar.B5;
                    if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                        MessageSuggestionParams messageSuggestionParams = unVar.f44407s5;
                        if (messageSuggestionParams == null) {
                            messageSuggestionParams = MessageSuggestionParams.of(unVar.B5.messageOwner.suggested_post);
                        }
                        MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                        AccountInstance accountInstance = unVar.getAccountInstance();
                        int i19 = ceil;
                        long j12 = unVar.f44249f6;
                        MessageObject messageObject3 = unVar.B5;
                        int i20 = i15;
                        MessageObject messageObject4 = unVar.f44295j4;
                        kn knVar = unVar.f44473x5;
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
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, knVar, z17, z10, null, z11, i11, i12, unVar.f44221d4, z14, null, unVar.L8(), j10, z12, j11, unVar.X8(), messageSuggestionParams2);
                    } else {
                        i13 = ceil;
                        i14 = i15;
                        AccountInstance accountInstance2 = unVar.getAccountInstance();
                        long j13 = unVar.f44249f6;
                        MessageObject messageObject5 = unVar.f44498z5;
                        MessageObject messageObject6 = unVar.f44295j4;
                        kn knVar2 = unVar.f44473x5;
                        if (i10 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance2, arrayList2, j13, messageObject5, messageObject6, null, knVar2, z15, z10, unVar.B5, z11, i11, i12, unVar.f44221d4, z14, null, unVar.L8(), j10, z12, j11, unVar.X8(), unVar.f44407s5);
                    }
                    i15 = i14 + 1;
                    ceil = i13;
                    selectedPhotos = hashMap3;
                    z20 = z22;
                }
                hashMap = selectedPhotos;
                unVar.D6();
                unVar.Y.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i11 != 0) {
                if (unVar.f44234e4 == -1) {
                    unVar.f44234e4 = 0;
                }
                unVar.f44234e4 += hashMap.size();
                unVar.Rc(true);
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
