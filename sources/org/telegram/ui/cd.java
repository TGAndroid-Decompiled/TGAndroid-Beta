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
    public final int f35773a;
    public final TLRPC.PhotoSize f35774b;
    public final TLRPC.InputFile f35775c;
    public final TLRPC.InputFile d;
    public final TLRPC.VideoSize f35776e;
    public final TLRPC.PhotoSize f35777f;
    public final double h;
    public final String f35778n;
    public final org.telegram.ui.Components.x40 f35779r;

    public cd(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f35773a = i10;
        this.f35779r = (org.telegram.ui.Components.x40) p2Var;
        this.f35775c = inputFile;
        this.d = inputFile2;
        this.f35776e = videoSize;
        this.f35778n = str;
        this.h = d;
        this.f35774b = photoSize;
        this.f35777f = photoSize2;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f35773a) {
            case 0:
                nd ndVar = (nd) this.f35779r;
                TLRPC.InputFile inputFile = this.f35775c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile == null && inputFile2 == null) {
                    TLRPC.FileLocation fileLocation = this.f35774b.location;
                    ndVar.f39411x = fileLocation;
                    ndVar.f39412y = this.f35777f.location;
                    ndVar.f39390e.h(ImageLocation.getForLocal(fileLocation), "50_50", ndVar.f39407s, null);
                    ndVar.e0(true, false);
                    return;
                }
                ndVar.f39396i0 = inputFile;
                ndVar.f39397j0 = inputFile2;
                ndVar.f39398k0 = this.f35776e;
                ndVar.f39399l0 = this.f35778n;
                ndVar.m0 = this.h;
                if (ndVar.f39401n0) {
                    org.telegram.ui.ActionBar.d2 d2Var = ndVar.f39406r0;
                    if (d2Var != null) {
                        try {
                            d2Var.dismiss();
                            ndVar.f39406r0 = null;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    ndVar.g0(false);
                    ndVar.f39402o0 = false;
                    ndVar.f39383a.performClick();
                }
                ndVar.e0(false, true);
                ndVar.h.setImageDrawable(null);
                return;
            case 1:
                po poVar = (po) this.f35779r;
                TLRPC.PhotoSize photoSize = this.f35774b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                poVar.f40119s0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.f35775c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.f35776e;
                if (inputFile3 == null && inputFile4 == null && videoSize == null) {
                    oh.a4 a4Var = poVar.f40101e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.z8 z8Var = poVar.f40116r;
                    Object obj = poVar.A0;
                    if (obj == null) {
                        obj = poVar.f40121u0;
                    }
                    a4Var.h(forLocal, "50_50", z8Var, obj);
                    poVar.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (poVar.O0 == null) {
                        poVar.O0 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    poVar.Y.f23313e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    poVar.Y.f23313e.setAnimation(poVar.O0);
                    poVar.n0(true, false);
                    return;
                }
                long j10 = poVar.f40129z0;
                TLRPC.PhotoSize photoSize2 = this.f35777f;
                double d = this.h;
                long j11 = 0;
                if (j10 != 0) {
                    TLRPC.User user = poVar.A0;
                    if (user != null) {
                        user.photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.UserProfilePhoto userProfilePhoto = poVar.A0.photo;
                        if (inputFile3 != null) {
                            j11 = inputFile3.f20857id;
                        } else if (inputFile4 != null) {
                            j11 = inputFile4.f20857id;
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
                    long j12 = poVar.f40120t0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    TLRPC.FileLocation fileLocation4 = photoSize2.location;
                    z4 = false;
                    messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.f35778n, fileLocation3, fileLocation4, null);
                }
                if (poVar.J0) {
                    try {
                        org.telegram.ui.ActionBar.d2 d2Var2 = poVar.f40096b;
                        if (d2Var2 != null && d2Var2.isShowing()) {
                            poVar.f40096b.dismiss();
                            poVar.f40096b = null;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    poVar.K0 = z4;
                    poVar.f40094a.performClick();
                }
                poVar.n0(z4, true);
                return;
            case 2:
                l50 l50Var = (l50) this.f35779r;
                long j13 = l50Var.f38643e;
                d60 d60Var = l50Var.f38644f;
                AccountInstance accountInstance = d60Var.d;
                TLRPC.InputFile inputFile5 = this.f35775c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.f35776e;
                TLRPC.PhotoSize photoSize3 = this.f35774b;
                TLRPC.PhotoSize photoSize4 = this.f35777f;
                if (inputFile5 == null && inputFile6 == null && videoSize2 == null) {
                    l50Var.f38642c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    l50Var.f38641b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    l50Var.d = forLocal2;
                    d60Var.f36014b.A(forLocal2, ImageLocation.getForLocal(l50Var.f38642c));
                    AndroidUtilities.updateVisibleRows(d60Var.N);
                    return;
                }
                double d10 = this.h;
                String str = this.f35778n;
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
                    accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new lo(23, l50Var, str));
                    return;
                }
                accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new c10(l50Var, 6));
                return;
            case 3:
                f70 f70Var = (f70) this.f35779r;
                TLRPC.InputFile inputFile7 = this.f35775c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.f35776e;
                if (inputFile7 == null && inputFile8 == null && videoSize3 == null) {
                    TLRPC.FileLocation fileLocation6 = this.f35774b.location;
                    f70Var.f36781y = fileLocation6;
                    f70Var.B = this.f35777f.location;
                    f70Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", f70Var.f36777r, null);
                    f70Var.Z(true, false);
                    return;
                }
                f70Var.C = inputFile7;
                f70Var.D = inputFile8;
                f70Var.E = videoSize3;
                f70Var.F = this.f35778n;
                f70Var.G = this.h;
                if (f70Var.I) {
                    f70Var.getMessagesController().createChat(f70Var.f36773c.getText().toString(), f70Var.H, null, f70Var.M, f70Var.P, f70Var.R, f70Var.Q, f70Var.T, f70Var);
                }
                f70Var.Z(false, true);
                f70Var.f36775f.setImageDrawable(null);
                return;
            case 4:
                ProfileActivity.d0((ProfileActivity) this.f35779r, this.f35775c, this.d, this.f35776e, this.h, this.f35778n, this.f35774b, this.f35777f);
                return;
            case 5:
                p81.d0((p81) this.f35779r, this.f35775c, this.d, this.f35776e, this.h, this.f35778n, this.f35774b, this.f35777f);
                return;
            default:
                th.n nVar = (th.n) this.f35779r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.f35774b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.C = fileLocation7;
                TLRPC.InputFile inputFile9 = this.f35775c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.f35776e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.f48162y, nVar.E);
                    nVar.a0(true, false);
                    z10 = true;
                } else {
                    z10 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.f48153b, null, inputFile9, inputFile10, videoSize4, this.h, this.f35778n, photoSize5.location, this.f35777f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.V2.N(z10);
                return;
        }
    }

    public cd(po poVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.f35773a = 1;
        this.f35779r = poVar;
        this.f35774b = photoSize;
        this.f35775c = inputFile;
        this.d = inputFile2;
        this.f35776e = videoSize;
        this.f35777f = photoSize2;
        this.h = d;
        this.f35778n = str;
    }

    public cd(org.telegram.ui.Components.x40 x40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.f35773a = i10;
        this.f35779r = x40Var;
        this.f35775c = inputFile;
        this.d = inputFile2;
        this.f35776e = videoSize;
        this.h = d;
        this.f35778n = str;
        this.f35774b = photoSize;
        this.f35777f = photoSize2;
    }

    public cd(th.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.f35773a = 6;
        this.f35779r = nVar;
        this.f35774b = photoSize;
        this.f35775c = inputFile;
        this.d = inputFile2;
        this.f35776e = videoSize;
        this.h = d;
        this.f35778n = str;
        this.f35777f = photoSize2;
    }
}
