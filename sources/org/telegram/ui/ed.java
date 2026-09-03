package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f33782a;
    public final TLRPC.PhotoSize f33783b;
    public final TLRPC.InputFile f33784c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize e;
    public final TLRPC.PhotoSize f33785f;
    public final double h;
    public final String f33786n;
    public final org.telegram.ui.Components.w40 f33787r;

    public ed(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f33782a = i10;
        this.f33787r = (org.telegram.ui.Components.w40) p2Var;
        this.f33784c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f33786n = str;
        this.h = d;
        this.f33783b = photoSize;
        this.f33785f = photoSize2;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f33782a) {
            case 0:
                pd pdVar = (pd) this.f33787r;
                TLRPC.InputFile inputFile = this.f33784c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile == null && inputFile2 == null) {
                    TLRPC.FileLocation fileLocation = this.f33783b.location;
                    pdVar.f37102x = fileLocation;
                    pdVar.f37103y = this.f33785f.location;
                    pdVar.e.h(ImageLocation.getForLocal(fileLocation), "50_50", pdVar.f37098s, null);
                    pdVar.e0(true, false);
                    return;
                }
                pdVar.f37087i0 = inputFile;
                pdVar.f37088j0 = inputFile2;
                pdVar.f37089k0 = this.e;
                pdVar.f37090l0 = this.f33786n;
                pdVar.m0 = this.h;
                if (pdVar.f37092n0) {
                    org.telegram.ui.ActionBar.d2 d2Var = pdVar.f37097r0;
                    if (d2Var != null) {
                        try {
                            d2Var.dismiss();
                            pdVar.f37097r0 = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    pdVar.g0(false);
                    pdVar.f37093o0 = false;
                    pdVar.f37075a.performClick();
                }
                pdVar.e0(false, true);
                pdVar.h.setImageDrawable(null);
                return;
            case 1:
                ro roVar = (ro) this.f33787r;
                TLRPC.PhotoSize photoSize = this.f33783b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                roVar.f37924s0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f33784c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.e;
                if (inputFile3 == null && inputFile4 == null && videoSize == null) {
                    nh.y3 y3Var = roVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.z8 z8Var = roVar.f37921r;
                    Object obj = roVar.A0;
                    if (obj == null) {
                        obj = roVar.f37926u0;
                    }
                    y3Var.h(forLocal, "50_50", z8Var, obj);
                    roVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (roVar.O0 == null) {
                        roVar.O0 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    roVar.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    roVar.Y.e.setAnimation(roVar.O0);
                    roVar.n0(true, false);
                    return;
                }
                long j10 = roVar.f37934z0;
                TLRPC.PhotoSize photoSize2 = this.f33785f;
                double d = this.h;
                long j11 = 0;
                if (j10 != 0) {
                    TLRPC.User user = roVar.A0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = roVar.A0.photo;
                        if (inputFile3 != null) {
                            j11 = inputFile3.f19173id;
                        } else if (inputFile4 != null) {
                            j11 = inputFile4.f19173id;
                        }
                        userProfilePhoto.photo_id = j11;
                        userProfilePhoto.photo_big = photoSize2.location;
                        userProfilePhoto.photo_small = photoSize.location;
                        roVar.getMessagesController().putUser(roVar.A0, true);
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
                    tL_photos_uploadProfilePhoto.bot = roVar.getMessagesController().getInputUser(roVar.A0);
                    tL_photos_uploadProfilePhoto.flags |= 32;
                    roVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new jo(roVar, 1));
                    z4 = false;
                } else {
                    MessagesController messagesController = roVar.getMessagesController();
                    long j12 = roVar.f37925t0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    z4 = false;
                    messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.f33786n, fileLocation3, fileLocation4, null);
                }
                if (roVar.J0) {
                    try {
                        org.telegram.ui.ActionBar.d2 d2Var2 = roVar.f37902b;
                        if (d2Var2 != null && d2Var2.isShowing()) {
                            roVar.f37902b.dismiss();
                            roVar.f37902b = null;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    roVar.K0 = z4;
                    roVar.f37900a.performClick();
                }
                roVar.n0(z4, true);
                return;
            case 2:
                m50 m50Var = (m50) this.f33787r;
                long j13 = m50Var.e;
                e60 e60Var = m50Var.f35983f;
                AccountInstance accountInstance = e60Var.d;
                TLRPC.InputFile inputFile5 = this.f33784c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                TLRPC.PhotoSize photoSize3 = this.f33783b;
                TLRPC.PhotoSize photoSize4 = this.f33785f;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    m50Var.f35982c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    m50Var.f35981b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    m50Var.d = forLocal2;
                    e60Var.f33620b.A(forLocal2, ImageLocation.getForLocal(m50Var.f35982c));
                    AndroidUtilities.updateVisibleRows(e60Var.N);
                    return;
                }
                double d10 = this.h;
                String str = this.f33786n;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new no(23, m50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new d10(m50Var, 6));
                return;
            case 3:
                g70 g70Var = (g70) this.f33787r;
                TLRPC.InputFile inputFile7 = this.f33784c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    TLRPC.FileLocation fileLocation6 = this.f33783b.location;
                    g70Var.f34349y = fileLocation6;
                    g70Var.B = this.f33785f.location;
                    g70Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", g70Var.f34345r, null);
                    g70Var.Z(true, false);
                    return;
                }
                g70Var.C = inputFile7;
                g70Var.D = inputFile8;
                g70Var.E = videoSize3;
                g70Var.F = this.f33786n;
                g70Var.G = this.h;
                if (g70Var.I) {
                    g70Var.getMessagesController().createChat(g70Var.f34342c.getText().toString(), g70Var.H, null, g70Var.M, g70Var.P, g70Var.R, g70Var.Q, g70Var.T, g70Var);
                }
                g70Var.Z(false, true);
                g70Var.f34343f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.d0((ProfileActivity) this.f33787r, this.f33784c, this.d, this.e, this.h, this.f33786n, this.f33783b, this.f33785f);
                return;
            case 5:
                w81.d0((w81) this.f33787r, this.f33784c, this.d, this.e, this.h, this.f33786n, this.f33783b, this.f33785f);
                return;
            default:
                sh.n nVar = (sh.n) this.f33787r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.f33783b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.C = fileLocation7;
                TLRPC.InputFile inputFile9 = this.f33784c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.f44444y, nVar.E);
                    nVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.f44436b, null, inputFile9, inputFile10, videoSize4, this.h, this.f33786n, photoSize5.location, this.f33785f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.V2.N(z10);
                return;
        }
    }

    public ed(ro roVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f33782a = 1;
        this.f33787r = roVar;
        this.f33783b = photoSize;
        this.f33784c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f33785f = photoSize2;
        this.h = d;
        this.f33786n = str;
    }

    public ed(org.telegram.ui.Components.w40 w40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f33782a = i10;
        this.f33787r = w40Var;
        this.f33784c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f33786n = str;
        this.f33783b = photoSize;
        this.f33785f = photoSize2;
    }

    public ed(sh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f33782a = 6;
        this.f33787r = nVar;
        this.f33783b = photoSize;
        this.f33784c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.f33786n = str;
        this.f33785f = photoSize2;
    }
}
