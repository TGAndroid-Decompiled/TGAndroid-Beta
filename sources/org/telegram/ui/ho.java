package org.telegram.ui;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class ho extends st0 {

    public final jo f38874a;

    public ho(jo joVar) {
        this.f38874a = joVar;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        jo joVar = this.f38874a;
        long j10 = joVar.f39437y0;
        cu0 cu0Var = null;
        if (fileLocation != null) {
            if (joVar.f39438z0 != null) {
                TLRPC.User user = j10 == 0 ? null : joVar.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
            } else {
                TLRPC.Chat chat = joVar.getMessagesController().getChat(Long.valueOf(joVar.f39428s0));
                if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                joVar.f39410e.getLocationInWindow(iArr);
                cu0Var = new cu0();
                cu0Var.f37154b = iArr[0];
                cu0Var.f37155c = iArr[1];
                jh.z3 z3Var = joVar.f39410e;
                cu0Var.d = z3Var;
                ImageReceiver imageReceiver = z3Var.getImageReceiver();
                cu0Var.f37153a = imageReceiver;
                if (j10 == 0) {
                    j10 = -joVar.f39428s0;
                }
                cu0Var.f37157f = j10;
                cu0Var.f37156e = imageReceiver.getBitmapSafe();
                cu0Var.f37158g = -1L;
                cu0Var.h = joVar.f39410e.getImageReceiver().getRoundRadius(true);
                cu0Var.f37161k = joVar.d.getScaleX();
                cu0Var.f37166p = true;
            }
        }
        return cu0Var;
    }

    @Override
    public final void G() {
        this.f38874a.f39410e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        jo joVar = this.f38874a;
        long j10 = joVar.f39437y0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = joVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f22512id = new TLRPC.TL_inputPhotoEmpty();
        joVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new n(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f38874a.f39427s.q(str, str2, z10);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final int y() {
        return 1;
    }
}
