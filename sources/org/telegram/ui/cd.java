package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f33279a;
    public final TLRPC.PhotoSize f33280b;
    public final TLRPC.InputFile f33281c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f33282f;
    public final double h;
    public final String f33283n;
    public final org.telegram.ui.Components.v40 f33284r;

    public cd(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f33279a = i10;
        this.f33284r = (org.telegram.ui.Components.v40) p2Var;
        this.f33281c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f33283n = str;
        this.h = d;
        this.f33280b = photoSize;
        this.f33282f = photoSize2;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f33279a) {
            case 0:
                nd ndVar = (nd) this.f33284r;
                TLRPC.InputFile inputFile = this.f33281c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile == null && inputFile2 == null) {
                    TLRPC.FileLocation fileLocation = this.f33280b.location;
                    ndVar.f36603x = fileLocation;
                    ndVar.f36604y = this.f33282f.location;
                    ndVar.e.h(ImageLocation.getForLocal(fileLocation), "50_50", ndVar.f36599s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f36588i0 = inputFile;
                ndVar.f36589j0 = inputFile2;
                ndVar.f36590k0 = this.e;
                ndVar.f36591l0 = this.f33283n;
                ndVar.m0 = this.h;
                if (ndVar.f36593n0) {
                    org.telegram.ui.ActionBar.d2 d2Var = ndVar.f36598r0;
                    if (d2Var != null) {
                        try {
                            d2Var.dismiss();
                            ndVar.f36598r0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f36594o0 = false;
                    ndVar.f36576a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 1:
                po poVar = (po) this.f33284r;
                TLRPC.PhotoSize photoSize = this.f33280b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                poVar.f37404s0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f33281c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize == null) {
                    nh.y3 y3Var = poVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.z8 z8Var = poVar.f37401r;
                    Object obj = poVar.A0;
                    if (obj == null) {
                        obj = poVar.f37406u0;
                    }
                    y3Var.h(forLocal, "50_50", z8Var, obj);
                    poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (poVar.O0 == null) {
                        poVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    poVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    poVar.Y.e.setAnimation(poVar.O0);
                    poVar.n0(true, false);
                    return;
                }
                long j10 = poVar.f37414z0;
                TLRPC.PhotoSize photoSize2 = this.f33282f;
                double d = this.h;
                long j11 = 0;
                if (j10 != 0) {
                    TLRPC.User user = poVar.A0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = poVar.A0.photo;
                        if (inputFile3 != null) {
                            j11 = inputFile3.f19198id;
                        } else if (inputFile4 != null) {
                            j11 = inputFile4.f19198id;
                        }
                        userProfilePhoto.photo_id = j11;
                        userProfilePhoto.photo_big = photoSize2.location;
                        userProfilePhoto.photo_small = photoSize.location;
                        poVar.getMessagesController().putUser(poVar.A0, true);
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.bot = poVar.getMessagesController().getInputUser(poVar.A0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    poVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ho(poVar, 1));
                    z4 = false;
                } else {
                    MessagesController messagesController = poVar.getMessagesController();
                    long j12 = poVar.f37405t0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    z4 = false;
                    messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.f33283n, fileLocation3, fileLocation4, null);
                }
                if (poVar.J0) {
                    try {
                        org.telegram.ui.ActionBar.d2 d2Var2 = poVar.f37382b;
                        if (d2Var2 != null && d2Var2.isShowing()) {
                            poVar.f37382b.dismiss();
                            poVar.f37382b = null;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    poVar.K0 = z4;
                    poVar.f37380a.performClick();
                }
                poVar.n0(z4, true);
                return;
            case 2:
                k50 k50Var = (k50) this.f33284r;
                long j13 = k50Var.e;
                c60 c60Var = k50Var.f35575f;
                AccountInstance accountInstance = c60Var.d;
                TLRPC.InputFile inputFile5 = this.f33281c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                TLRPC.PhotoSize photoSize3 = this.f33280b;
                TLRPC.PhotoSize photoSize4 = this.f33282f;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    k50Var.f35574c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    k50Var.f35573b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    k50Var.d = forLocal2;
                    c60Var.f33101b.A(forLocal2, ImageLocation.getForLocal(k50Var.f35574c));
                    AndroidUtilities.updateVisibleRows(c60Var.N);
                    return;
                }
                double d10 = this.h;
                String str = this.f33283n;
                if (j13 > 0) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile5 != null) {
                        tL_photos_uploadProfilePhoto2.file = inputFile5;
                        tL_photos_uploadProfilePhoto2.flags |= 1;
                    }
                    if (inputFile6 != null) {
                        tL_photos_uploadProfilePhoto2.video = inputFile6;
                        int i11 = tL_photos_uploadProfilePhoto2.flags;
                        tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                        tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto2.flags |= 16;
                    }
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new lo(23, k50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new c10(k50Var, 6));
                return;
            case 3:
                e70 e70Var = (e70) this.f33284r;
                TLRPC.InputFile inputFile7 = this.f33281c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    TLRPC.FileLocation fileLocation6 = this.f33280b.location;
                    e70Var.f33924y = fileLocation6;
                    e70Var.B = this.f33282f.location;
                    e70Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", e70Var.f33920r, null);
                    e70Var.Z(true, false);
                    return;
                }
                e70Var.C = inputFile7;
                e70Var.D = inputFile8;
                e70Var.E = videoSize3;
                e70Var.F = this.f33283n;
                e70Var.G = this.h;
                if (e70Var.I) {
                    e70Var.getMessagesController().createChat(e70Var.f33917c.getText().toString(), e70Var.H, null, e70Var.M, e70Var.P, e70Var.R, e70Var.Q, e70Var.T, e70Var);
                }
                e70Var.Z(false, true);
                e70Var.f33918f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.d0((ProfileActivity) this.f33284r, this.f33281c, this.d, this.e, this.h, this.f33283n, this.f33280b, this.f33282f);
                return;
            case 5:
                o81.d0((o81) this.f33284r, this.f33281c, this.d, this.e, this.h, this.f33283n, this.f33280b, this.f33282f);
                return;
            default:
                sh.n nVar = (sh.n) this.f33284r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.f33280b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.C = fileLocation7;
                TLRPC.InputFile inputFile9 = this.f33281c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.f44382y, nVar.E);
                    nVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.f44374b, null, inputFile9, inputFile10, videoSize4, this.h, this.f33283n, photoSize5.location, this.f33282f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.V2.N(z10);
                return;
        }
    }

    public cd(po poVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f33279a = 1;
        this.f33284r = poVar;
        this.f33280b = photoSize;
        this.f33281c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f33282f = photoSize2;
        this.h = d;
        this.f33283n = str;
    }

    public cd(org.telegram.ui.Components.v40 v40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f33279a = i10;
        this.f33284r = v40Var;
        this.f33281c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f33283n = str;
        this.f33280b = photoSize;
        this.f33282f = photoSize2;
    }

    public cd(sh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f33279a = 6;
        this.f33284r = nVar;
        this.f33280b = photoSize;
        this.f33281c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f33283n = str;
        this.f33282f = photoSize2;
    }
}
