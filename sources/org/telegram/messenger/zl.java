package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zl implements Runnable {
    public final int f19550a = 0;
    public final vp f19551b;
    public final TLObject f19552c;
    public final long d;

    public zl(vp vpVar, long j10, TLObject tLObject) {
        this.f19551b = vpVar;
        this.d = j10;
        this.f19552c = tLObject;
    }

    @Override
    public final void run() {
        int i10 = this.f19550a;
        long j10 = this.d;
        TLObject tLObject = this.f19552c;
        vp vpVar = this.f19551b;
        switch (i10) {
            case 0:
                vpVar.f18903t0.l(j10);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    vpVar.V3(tL_messages_peerSettings.users, false);
                    vpVar.P3(tL_messages_peerSettings.chats, false);
                    vpVar.r4(j10, peerSettings);
                    return;
                }
                return;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User Z1 = vpVar.Z1(Long.valueOf(vpVar.getUserConfig().e()));
                if (Z1 == null) {
                    Z1 = vpVar.getUserConfig().f();
                    vpVar.U3(Z1, false, false);
                } else {
                    vpVar.getUserConfig().w(Z1);
                }
                if (Z1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Z1);
                    vpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.f19817id;
                        userProfilePhoto.photo_small = b8.w(photo.sizes, 150, false, null, false).location;
                        Z1.photo.photo_big = b8.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        Z1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        Z1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull a2 = vpVar.a2(j10);
                    if (a2 != null) {
                        a2.profile_photo = tL_photos_photo.photo;
                        vpVar.getMessagesStorage().j2(a2, false);
                    }
                    vpVar.getUserConfig().f().photo = Z1.photo;
                    vpVar.U3(Z1, false, false);
                    vpVar.getNotificationCenter().k(46, new Object[0]);
                    vpVar.getNotificationCenter().k(2, Integer.valueOf(vp.D8));
                    vpVar.getNotificationCenter().k(2, 2);
                    vpVar.getUserConfig().v(true);
                    return;
                }
                return;
        }
    }

    public zl(vp vpVar, TLObject tLObject, long j10) {
        this.f19551b = vpVar;
        this.f19552c = tLObject;
        this.d = j10;
    }
}
